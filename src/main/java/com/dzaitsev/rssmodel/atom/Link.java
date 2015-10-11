package com.dzaitsev.rssmodel.atom;

import com.dzaitsev.rssmodel.annotations.Optional;
import com.dzaitsev.rssmodel.annotations.Required;
import lombok.Data;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Root;

/**
 * <code>&lt;link&gt;</code> is patterned after html&#8217;s <a href="http://www.w3
 * .org/TR/1999/REC-html401-19991224/struct/links.html#h-12.3">link</a> element. It has one required attribute,
 * <code>href</code>, and five optional attributes: <code>rel</code>, <code>type</code>, <code>hreflang</code>,
 * <code>title</code>, and <code>length</code>.</p>
 *
 * @author Dmitriy Zaitsev
 * @since 2015-Oct-11, 13:37.</p>
 */
@Data
@Root(name = Atom.LINK)
public final class Link {
    /**
     * URI of the referenced resource (typically a Web page)
     */
    @Required
    @Attribute(name = Atom.HREF)
    private String href;

    /**
     * contains a single link relationship type.<br> It can be a full URI (see <a href="http://atomenabled
     * .org/developers/syndication/#extensibility">extensibility</a>), or one of the following predefined values
     * (default=alternate)
     */
    @Optional
    @Attribute(required = false, name = Atom.REL)
    private String rel;

    /**
     * indicates the media type of the resource
     */
    @Optional
    @Attribute(required = false, name = Atom.TYPE)
    private String type;
    /**
     * indicates the language of the referenced resource
     */
    @Optional
    @Attribute(required = false, name = Atom.HREFLANG)
    private String hreflang;

    /**
     * human readable information about the link, typically for display purposes
     */
    @Optional
    @Attribute(required = false, name = Atom.TITLE)
    private String title;

    /**
     * the length of the resource, in bytes
     */
    @Optional
    @Attribute(required = false, name = Atom.LENGTH)
    private String length;
}
