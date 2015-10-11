package com.dzaitsev.rssmodel.rss;

import com.dzaitsev.rssmodel.annotations.Optional;
import com.dzaitsev.rssmodel.annotations.Required;
import lombok.Data;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/**
 * ~ ~ ~ ~ Description ~ ~ ~ ~
 *
 * @author Dmitriy Zaitsev (dzaitsev@lohika.com)
 * @since 2015-Oct-11, 21:52
 */
@Data
@Root(strict = false, name = Rss.IMAGE)
public final class Image {

    /**
     * describes the image, it's used in the ALT attribute of the HTML &lt;img&gt; tag when the channel is rendered in
     * HTML.
     */
    @Required
    @Element(name = Rss.TITLE)
    private String title;

    /**
     * the URL of a GIF, JPEG or PNG image that represents the channel.
     */
    @Required
    @Element(name = Rss.URL)
    private String url;

    /**
     * the URL of the site, when the channel is rendered, the image is a link to the site. (Note, in practice the image
     * &lt;title&gt; and &lt;link&gt; should have the same value as the channel's &lt;title&gt; and &lt;link&gt;.
     */
    @Required
    @Element(name = Rss.LINK)
    private String link;

    /**
     * number, indicating the width of the image in pixels.
     */
    @Optional
    @Element(required = false, name = Rss.WIDTH)
    private int width = 88;

    /**
     * number, indicating the height of the image in pixels.
     */
    @Optional
    @Element(required = false, name = Rss.HEIGHT)
    private int height = 31;

    /**
     * contains text that is included in the TITLE attribute of the link formed around the image in the HTML rendering.
     */
    @Optional
    @Element(required = false, name = Rss.DESCRIPTION)
    private String description;
}
