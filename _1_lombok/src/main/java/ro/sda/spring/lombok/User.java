package ro.sda.spring.lombok;

import lombok.*;

//Data is a shortcut for @ToString, @EqualsAndHashCode, @Getter and @Setter
@EqualsAndHashCode
@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private String firstName;
    private String lastName;
    private int age;



}
