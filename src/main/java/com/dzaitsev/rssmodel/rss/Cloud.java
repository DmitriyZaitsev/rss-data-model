package com.dzaitsev.rssmodel.rss;

import com.dzaitsev.rssmodel.annotations.Required;
import lombok.Data;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Root;

/**
 * It specifies a web service that supports the rssCloud interface which can be implemented in HTTP-POST, XML-RPC or
 * SOAP 1.1.
 * <p/>
 * Its purpose is to allow processes to register with a cloud to be notified of updates to the channel, implementing a
 * lightweight publish-subscribe protocol for RSS feeds.
 *
 * @author Dmitriy Zaitsev (dzaitsev@lohika.com)
 * @since 2015-Oct-11, 21:56
 */
@Data
@Root(strict = false, name = Rss.CLOUD)
public final class Cloud {

    @Required
    @Attribute(name = Rss.DOMAIN)
    private String domain;

    @Required
    @Attribute(name = Rss.PORT)
    private int port;

    @Required
    @Attribute(name = Rss.PATH)
    private String path;

    @Required
    @Attribute(name = Rss.REGISTER_PROCEDURE)
    private String registerProcedure;

    @Required
    @Attribute(name = Rss.PROTOCOL)
    private String protocol;
}
