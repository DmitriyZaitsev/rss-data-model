package com.dzaitsev.rssmodel.rss;

import com.dzaitsev.rssmodel.annotations.Optional;
import com.dzaitsev.rssmodel.annotations.Required;
import lombok.Data;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

/**
 * ~ ~ ~ ~ Description ~ ~ ~ ~
 *
 * @author Dmitriy Zaitsev (dzaitsev@lohika.com)
 * @since 2015-Oct-11, 21:30
 */
@Data
@Root(strict = false, name = Rss.CHANNEL)
public final class Channel {
    /**
     * The name of the channel. It's how people refer to your service. If you have an HTML website that contains the
     * same information as your RSS file, the title of your channel should be the same as the title of your website.
     */
    @Required
    @Element(name = Rss.TITLE)
    private String title;

    /**
     * The URL to the HTML website corresponding to the channel.
     */
    @Required
    @Element(name = Rss.LINK)
    private String link;

    /**
     * Phrase or sentence describing the channel.
     */
    @Required
    @Element(name = Rss.DESCRIPTION)
    private String description;

    /**
     * The language the channel is written in. This allows aggregators to group all Italian language sites, for example,
     * on a single page. You may also use values defined by the W3C.
     */
    @Optional
    @Element(required = false, name = Rss.LANGUAGE)
    private String language;

    /**
     * Copyright notice for content in the channel.
     */
    @Optional
    @Element(required = false, name = Rss.COPYRIGHT)
    private String copyright;

    /**
     * Email address for person responsible for editorial content.
     */
    @Optional
    @Element(required = false, name = Rss.MANAGING_EDITOR)
    private String managingEditor;

    /**
     * Email address for person responsible for technical issues relating to channel.
     */
    @Optional
    @Element(required = false, name = Rss.WEB_MASTER)
    private String webMaster;

    /**
     * The publication date for the content in the channel. For example, the New York Times publishes on a daily basis,
     * the publication date flips once every 24 hours. That's when the pubDate of the channel changes. All date-times in
     * RSS conform to the Date and Time Specification of RFC 822, with the exception that the year may be expressed with
     * two characters or four characters (four preferred).
     */
    @Optional
    @Element(required = false, name = Rss.PUB_DATE)
    private String pubDate;

    /**
     * The last time the content of the channel changed.
     */
    @Optional
    @Element(required = false, name = Rss.LAST_BUILD_DATE)
    private String lastBuildDate;

    /**
     * Specify one or more categories that the channel belongs to. Follows the same rules as the &lt;item&gt;-level
     * category element.
     */
    @Optional
    @ElementList(required = false, name = Rss.CATEGORY)
    private String[] category;

    /**
     * A string indicating the program used to generate the channel.
     */
    @Optional
    @Element(required = false, name = Rss.GENERATOR)
    private String generator;

    /**
     * A URL that points to the documentation for the format used in the RSS file. It's probably a pointer to this page.
     * It's for people who might stumble across an RSS file on a Web server 25 years from now and wonder what it is.
     */
    @Optional
    @Element(required = false, name = Rss.DOCS)
    private String docs;

    /**
     * Allows processes to register with a cloud to be notified of updates to the channel, implementing a lightweight
     * publish-subscribe protocol for RSS feeds.
     */
    @Optional
    @Element(required = false, name = Rss.CLOUD)
    private Cloud cloud;

    /**
     * ttl stands for time to live. It's a number of minutes that indicates how long a channel can be cached before
     * refreshing from the source.
     */
    @Optional
    @Element(required = false, name = Rss.TTL)
    private String ttl;

    /**
     * Specifies a GIF, JPEG or PNG image that can be displayed with the channel.
     */
    @Optional
    @Element(required = false, name = Rss.IMAGE)
    private Image image;

    /**
     * Specifies a text input box that can be displayed with the channel.
     */
    @Optional
    @Element(required = false, name = Rss.TEXT_INPUT)
    private TextInput textInput;

    /**
     * A hint for aggregators telling them which hours they can skip.
     */
    @Optional
    @ElementList(required = false, entry = Rss.SKIP_HOURS)
    private String[] skipHours;

    /**
     * A hint for aggregators telling them which days they can skip.
     */
    @Optional
    @ElementList(required = false, name = Rss.SKIP_DAYS)
    private String[] skipDays;

    @Optional
    @ElementList(required = false, entry = Rss.ITEM)
    private Item[] item;
}
