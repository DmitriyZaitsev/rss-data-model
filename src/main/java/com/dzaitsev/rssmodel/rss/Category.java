package com.dzaitsev.rssmodel.rss;

import com.dzaitsev.rssmodel.Value;
import com.dzaitsev.rssmodel.annotations.Optional;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Root;

/**
 * ~ ~ ~ ~ Description ~ ~ ~ ~
 *
 * @author Dmitriy Zaitsev (dzaitsev@lohika.com)
 * @since 2015-Oct-11, 22:29
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Root(strict = false, name = Rss.CATEGORY)
public final class Category extends Value {

    /**
     * a string that identifies a categorization taxonomy.
     */
    @Optional
    @Attribute(required = false, name = Rss.DOMAIN)
    private String domain;
}
