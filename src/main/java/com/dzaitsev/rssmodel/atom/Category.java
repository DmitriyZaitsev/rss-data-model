package com.dzaitsev.rssmodel.atom;

import com.dzaitsev.rssmodel.annotations.Optional;
import com.dzaitsev.rssmodel.annotations.Required;
import lombok.Data;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Root;

/**
 * Category
 *
 * @author Dmitriy Zaitsev
 * @since 2015-Oct-11, 13:55.</p>
 */
@Data
@Root(name = Atom.CATEGORY)
public final class Category {

    /**
     * identifies the category
     */
    @Required
    @Attribute(name = Atom.TERM)
    private String term;

    /**
     * identifies the categorization scheme via a URI.
     */
    @Optional
    @Attribute(required = false, name = Atom.SCHEME)
    private String scheme;

    /**
     * provides a human-readable label for display
     */
    @Optional
    @Attribute(required = false, name = Atom.LABEL)
    private String label;
}
