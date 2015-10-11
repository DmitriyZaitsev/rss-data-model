package com.dzaitsev.rssmodel.atom;

import com.dzaitsev.rssmodel.annotations.Required;
import lombok.Data;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/**
 * ~ ~ ~ ~ Description ~ ~ ~ ~
 *
 * @author Dmitriy Zaitsev
 * @since 2015-Oct-11, 14:10.</p>
 */
@Data
@Root(name = Atom.SOURCE)
public final class Source {
    @Required
    @Element(name = Atom.ID)
    private String id;

    @Required
    @Element(name = Atom.TITLE)
    private Text title;

    @Required
    @Element(name = Atom.UPDATED)
    private String updated;

    @Required
    @Element(name = Atom.RIGHTS)
    private Text rights;
}
