package ro.sda.spring.repository;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ro.sda.spring.model.Product;

import javax.annotation.PostConstruct;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class ProductRepository {

//    @Autowired
    private JdbcTemplate jdbcTemplate;

    public ProductRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
        System.out.println("ProductRepository was initialized");
    }

    @PostConstruct
    void init(){
        String sql = "CREATE TABLE IF NOT EXISTS product(id bigint auto_increment, " +
                "name varchar(255), description varchar(255))";
        jdbcTemplate.update(sql);
        System.out.println("Table was created.");
    }

    public void addProduct(Product p){
        String sql = "INSERT INTO product(name, description) VALUES(?,?)";
        int numberOfRows = jdbcTemplate.update(sql, p.getName(), p.getDescription());
        System.out.println("Rows created: " + numberOfRows);
    }

    public List<Product> getAllProducts(){
        String sql = "SELECT * FROM product";
        return jdbcTemplate.query(sql, new ProductRowMapper());
    }

    public void addProductWithoutTX(Product p1, Product p2){
        addProduct(p1);
        if(p2.getName().equals("wrong")){
            throw new RuntimeException("something went wrong!");
        }
        addProduct(p2);
    }

    // database.setAutoCommit(false)
    @Transactional
    public void addProductsWithTransaction(Product p1, Product p2){
        addProduct(p1);
        if(p2.getName().equals("wrong")){
            throw new RuntimeException("something went wrong!");
        }
        addProduct(p2);
    }
    // catch (Exception) --> database.rollback()
    // everything fine --> database.commit()

    static class ProductRowMapper implements RowMapper<Product>{
        @Override
        public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
            Product p = new Product();
            p.setId(rs.getInt("id"));
            p.setName(rs.getString("name"));
            p.setDescription(rs.getString("description"));
            return p;
        }
    }

}
