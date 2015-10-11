package com.dzaitsev.rssmodel.rss;

import com.dzaitsev.rssmodel.annotations.Optional;
import lombok.Data;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

/**
 * A channel may contain any number of &lt;item&gt;s. An item may represent a "story" -- much like a story in a
 * newspaper or magazine; if so its description is a synopsis of the story, and the link points to the full story. An
 * item may also be complete in itself, if so, the description contains the text (entity-encoded HTML is allowed), and
 * the link and title may be omitted. All elements of an item are optional, however at least one of title or description
 * must be present.
 *
 * @author Dmitriy Zaitsev (dzaitsev@lohika.com)
 * @since 2015-Oct-11, 22:10
 */
@Data
@Root(strict = false, name = Rss.ITEM)
public final class Item {

    /**
     * The title of the item.
     */
    @Optional
    @Element(required = false, name = Rss.TITLE)
    private String title;

    /**
     * The URL of the item.
     */
    @Optional
    @Element(required = false, name = Rss.LINK)
    private String link;

    /**
     * The item synopsis.
     */
    @Optional
    @Element(required = false, name = Rss.DESCRIPTION)
    private String description;

    /**
     * Email address of the author of the item.
     */
    @Optional
    @Element(required = false, name = Rss.AUTHOR)
    private String author;

    /**
     * Includes the item in one or more categories.
     */
    @Optional
    @ElementList(required = false, entry = Rss.CATEGORY)
    private Category[] category;

    /**
     * URL of a page for comments relating to the item.
     */
    @Optional
    @Element(required = false, name = Rss.COMMENTS)
    private String comments;

    /**
     * Describes a media object that is attached to the item.
     */
    @Optional
    @ElementList(required = false, entry = Rss.ENCLOSURE)
    private Enclosure[] enclosure;

    /**
     * A string that uniquely identifies the item.
     */
    @Optional
    @Element(required = false, name = Rss.GUID)
    private Guid guid;

    /**
     * Indicates when the item was published.
     */
    @Optional
    @Element(required = false, name = Rss.PUB_DATE)
    private String pubDate;

    /**
     * The RSS channel that the item came from.
     */
    @Optional
    @Element(required = false, name = Rss.SOURCE)
    private Source source;
}
