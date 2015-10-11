package com.dzaitsev.rssmodel.atom;

import com.dzaitsev.rssmodel.annotations.Optional;
import com.dzaitsev.rssmodel.annotations.Required;
import lombok.Data;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

/**
 * A Feed consists of some metadata, followed by any number of entries
 *
 * @author Dmitriy Zaitsev
 * @since 2015-Oct-11, 13:31.</p>
 */
@Data
@Root(name = Atom.FEED)
@Namespace(reference = Atom.NAMESPACE)
public final class Feed {
    /**
     * Identifies the feed using a universally unique and permanent URI. If you have a long-term, renewable lease on
     * your Internet domain name, then you can feel free to use your website’s address.
     */
    @Required
    @Element(name = Atom.ID)
    private String id;

    /**
     * Contains a human readable title for the feed. Often the same as the title of the associated website. This value
     * should not be blank.
     */
    @Required
    @Element(name = Atom.TITLE)
    private Text title;

    /**
     * Indicates the last time the feed was modified in a significant way.
     */
    @Required
    @Element(name = Atom.UPDATED)
    private String updated;

    /**
     * Names one author of the feed. A feed may have multiple author elements. A feed must contain at least one author
     * element unless <b>all</b> of the entry elements contain at least one author element.
     */
    @Optional(recommended = true)
    @Element(required = false, name = Atom.AUTHOR)
    private Person author;

    /**
     * Identifies a related Web page. The type of relation is defined by the rel attribute. A feed is limited to one
     * alternate per type and hreflang. A feed should contain a link back to the feed itself.
     */
    @Optional(recommended = true)
    @ElementList(required = false, inline = true, entry = Atom.LINK)
    private Link[] link;

    /**
     * Specifies a category that the feed belongs to. A feed may have multiple category elements.
     */
    @Optional
    @ElementList(required = false, inline = true, entry = Atom.CATEGORY)
    private Category[] category;

    /**
     * Names one contributor to the feed. An feed may have multiple contributor elements.
     */
    @Optional
    @Element(required = false, name = Atom.CONTRIBUTOR)
    private Person contributor;

    /**
     * Identifies the software used to generate the feed, for debugging and other purposes.
     */
    @Optional
    @Element(required = false, name = Atom.GENERATOR)
    private Generator generator;

    /**
     * Identifies a small image which provides iconic visual identification for the feed. Icons should be square.
     */
    @Optional
    @Element(required = false, name = Atom.ICON)
    private String icon;

    /**
     * Identifies a larger image which provides visual identification for the feed. Images should be twice as wide as
     * they are tall.
     */
    @Optional
    @Element(required = false, name = Atom.LOGO)
    private String logo;

    /**
     * Conveys information about rights, e.g. copyrights, held in and over the feed.
     */
    @Optional
    @Element(required = false, name = Atom.RIGHTS)
    private Text rights;

    /**
     * Contains a human-readable description or subtitle for the feed.
     */
    @Optional
    @Element(required = false, name = Atom.SUBTITLE)
    private Text subtitle;

    @Optional
    @ElementList(required = false, inline = true, entry = Atom.ENTRY)
    private Entry[] entry;
}

