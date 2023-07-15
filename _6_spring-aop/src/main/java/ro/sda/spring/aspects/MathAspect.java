package ro.sda.spring.aspects;


import org.aspectj.lang.annotation.*;


/*
  When you go to a restaurant, you look at the menu and see several options to choose from. (all the methods)
  You acn order one or more of the items of the menu. But until you actually order them, they are just
  "opportunities to dine" (join-points). Once you place the order and the waiter brings it to
  you table, it's a meal. (point-cut)

 */

// aspect is the class that contains cross-cutting concerns logic
@Aspect
public class MathAspect {


    // a join-point is an opportunity within the code to apply an aspect (just an opportunity)
    // one you selected one or more join-points and applied the aspect on them, there you have a point-cut

    // advice is one single action that could happen in certain situations
    @AfterThrowing(pointcut = "execution(* ro.sda.spring.services.MathService.*(..))")
    public void afterThrowing() {
        System.out.println("An exception occurred!");
    }

    @After("execution(* ro.sda.spring.services.MathService.*(..))")
    public void after() {
        System.out.println("After advice!");
    }

    @AfterReturning("execution(* ro.sda.spring.services.MathService.*(..))")
    public void afterReturning() {
        System.out.println("After returning advice!");
    }

    @Before("execution(* ro.sda.spring.services.MathService.*(..))")
    public void before() {
        System.out.println("Before advice!");
    }



}
