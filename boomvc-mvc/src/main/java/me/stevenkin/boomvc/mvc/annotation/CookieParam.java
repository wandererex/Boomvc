package me.stevenkin.boomvc.mvc.annotation;

import java.lang.annotation.*;

@Target(ElementType.PARAMETER)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface CookieParam {

    String value() default "";

    String defaultValue() default "";

}