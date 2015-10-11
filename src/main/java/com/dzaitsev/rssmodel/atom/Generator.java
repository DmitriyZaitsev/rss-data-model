package com.dzaitsev.rssmodel.atom;

import com.dzaitsev.rssmodel.annotations.Optional;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Root;

/**
 * Identifies the software used to generate the feed, for debugging and other purposes.
 *
 * @author Dmitriy Zaitsev
 * @since 2015-Oct-11, 13:36.</p>
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Root(name = Atom.GENERATOR)
public final class Generator extends Text {
    @Optional
    @Attribute(name = Atom.URI)
    private String uri;

    @Optional
    @Attribute(name = Atom.VERSION)
    private String version;
}
