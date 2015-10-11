package com.dzaitsev.rssmodel.rss;

import com.dzaitsev.rssmodel.annotations.Required;
import lombok.Data;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Root;

/**
 * ~ ~ ~ ~ Description ~ ~ ~ ~
 *
 * @author Dmitriy Zaitsev (dzaitsev@lohika.com)
 * @since 2015-Oct-11, 22:24
 */
@Data
@Root(strict = false, name = Rss.ENCLOSURE)
public final class Enclosure {

    /**
     * says where the enclosure is located
     */
    @Required
    @Attribute(name = Rss.URL)
    private String url;

    /**
     * says how big it is in bytes
     */
    @Required
    @Attribute(name = Rss.LENGTH)
    private long length;

    /**
     * says what its type is, a standard MIME type
     */
    @Required
    @Attribute(name = Rss.TYPE)
    private String type;
}
