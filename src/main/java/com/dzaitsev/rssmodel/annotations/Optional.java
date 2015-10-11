package com.dzaitsev.rssmodel.annotations;

import java.lang.annotation.*;

/**
 * ~ ~ ~ ~ Description ~ ~ ~ ~
 *
 * @author Dmitriy Zaitsev
 * @since 2015-Oct-11, 13:47
 */
@Documented
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.CLASS)
public @interface Optional {
    boolean recommended() default false;
}
