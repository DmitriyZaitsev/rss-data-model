package com.dzaitsev.rssmodel.rss;

import com.dzaitsev.rssmodel.Value;
import com.dzaitsev.rssmodel.annotations.Optional;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Root;

/**
 * guid stands for globally unique identifier. It's a string that uniquely identifies the item. When present, an
 * aggregator may choose to use this string to determine if an item is new.
 *
 * @author Dmitriy Zaitsev (dzaitsev@lohika.com)
 * @since 2015-Oct-11, 22:37
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Root(strict = false, name = Rss.GUID)
public final class Guid extends Value {

    /**
     * If the guid element has an attribute named "isPermaLink" with a value of true, the reader may assume that it is a
     * permalink to the item, that is, a url that can be opened in a Web browser, that points to the full item described
     * by the &lt;item&gt; element.
     */
    @Optional
    @Attribute(required = false, name = Rss.IS_PERMALINK)
    private boolean isPermalink = true;
}
