package com.dzaitsev.rssmodel.atom;

import com.dzaitsev.rssmodel.annotations.Optional;
import com.dzaitsev.rssmodel.annotations.Required;
import lombok.Data;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

/**
 * An example of an entry would be a single post on a weblog.
 *
 * @author Dmitriy Zaitsev
 * @since 2015-Oct-11, 13:36.</p>
 */
@Data
@Root(name = Atom.ENTRY)
public final class Entry {
    /**
     * Identifies the entry using a universally unique and permanent URI. Two entries in a feed can have the same value
     * for id if they represent the same entry at different points in time.
     */
    @Required
    @Element(name = Atom.ID)
    private String id;

    /**
     * Contains a human readable title for the entry. This value should not be blank.
     */
    @Required
    @Element(name = Atom.TITLE)
    private Text title;

    /**
     * Indicates the last time the entry was modified in a significant way. This value need not change after a typo is
     * fixed, only after a substantial modification. Generally, different entries in a feed will have different updated
     * timestamps.
     */
    @Required
    @Element(name = Atom.UPDATED)
    private String updated;

    /**
     * Names one author of the entry. An entry may have multiple authors. An entry must contain at least one author
     * element unless there is an author element in the enclosing feed, or there is an author element in the enclosed
     * source element.
     */
    @Optional(recommended = true)
    @Element(required = false, name = Atom.AUTHOR)
    private Person author;

    /**
     * Contains or links to the complete content of the entry. Content must be provided if there is no alternate link,
     * and should be provided if there is no summary.
     */
    @Optional(recommended = true)
    @Element(required = false, name = Atom.CONTENT)
    private Text content;

    /**
     * Identifies a related Web page. The type of relation is defined by the rel attribute. An entry is limited to one
     * alternate per type and hreflang. An entry must contain an alternate link if there is no content element.
     */
    @Optional(recommended = true)
    @ElementList(required = false, inline = true, entry = Atom.LINK)
    private Link[] link;

    /**
     * Conveys a short summary, abstract, or excerpt of the entry. Summary should be provided if there either is no
     * content provided for the entry, or that content is not inline (i.e., contains a src attribute), or if the content
     * is encoded in base64.
     */
    @Optional(recommended = true)
    @Element(required = false, name = Atom.SUMMARY)
    private Text summary;

    /**
     * Specifies a category that the entry belongs to. A entry may have multiple category elements.
     */
    @Optional
    @ElementList(required = false, inline = true, entry = Atom.CATEGORY)
    private Category[] category;

    /**
     * Names one contributor to the entry. An entry may have multiple contributor elements.
     */
    @Optional
    @ElementList(required = false, inline = true, entry = Atom.CONTRIBUTOR)
    private Person[] contributor;

    /**
     * Contains the time of the initial creation or first availability of the entry.
     */
    @Optional
    @Element(required = false, name = Atom.PUBLISHED)
    private String published;

    /**
     * If an entry is copied from one feed into another feed, then the source feed‘s metadata (all child elements of
     * feed other than the entry elements) should be preserved if the source feed contains any of the child elements
     * author, contributor, rights, or category and those child elements are not present in the source entry.
     */
    @Optional
    @Element(required = false, name = Atom.SOURCE)
    private Source source;

    /**
     * Conveys information about rights, e.g. copyrights, held in and over the entry.
     */
    @Optional
    @Element(required = false, name = Atom.RIGHTS)
    private Text rights;
}
