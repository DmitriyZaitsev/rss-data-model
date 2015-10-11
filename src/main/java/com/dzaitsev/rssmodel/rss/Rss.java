package com.dzaitsev.rssmodel.rss;

import com.dzaitsev.rssmodel.annotations.Required;
import lombok.Data;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/**
 * ~ ~ ~ ~ Description ~ ~ ~ ~
 *
 * @author Dmitriy Zaitsev (dzaitsev@lohika.com)
 * @since 2015-Oct-11, 21:47
 */
@Data
@Root(strict = false, name = Rss.RSS)
public final class Rss {
    public static final String LANGUAGE = "language";
    public static final String COPYRIGHT = "copyright";
    public static final String MANAGING_EDITOR = "managingEditor";
    public static final String WEB_MASTER = "webMaster";
    public static final String PUB_DATE = "pubDate";
    public static final String LAST_BUILD_DATE = "lastBuildDate";
    public static final String CATEGORY = "category";
    public static final String GENERATOR = "generator";
    public static final String DOCS = "docs";
    public static final String CLOUD = "cloud";
    public static final String TTL = "ttl";
    public static final String IMAGE = "image";
    public static final String TEXT_INPUT = "textInput";
    public static final String SKIP_HOURS = "skipHours";
    public static final String SKIP_DAYS = "skipDays";
    public static final String TITLE = "title";
    public static final String LINK = "link";
    public static final String DESCRIPTION = "description";
    public static final String ITEM = "item";
    public static final String CHANNEL = "channel";
    public static final String DOMAIN = "domain";
    public static final String PORT = "port";
    public static final String PATH = "path";
    public static final String REGISTER_PROCEDURE = "registerProcedure";
    public static final String PROTOCOL = "protocol";
    public static final String ENCLOSURE = "enclosure";
    public static final String URL = "url";
    public static final String LENGTH = "length";
    public static final String TYPE = "type";
    public static final String GUID = "guid";
    public static final String IS_PERMALINK = "isPermalink";
    public static final String WIDTH = "width";
    public static final String HEIGHT = "height";
    public static final String AUTHOR = "author";
    public static final String COMMENTS = "comments";
    public static final String SOURCE = "source";
    public static final String NAME = "name";
    public static final String RSS = "rss";

    @Required
    @Element(name = Rss.CHANNEL)
    private Channel channel;
}
