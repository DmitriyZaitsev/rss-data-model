package com.dzaitsev.rssmodel.atom;

import com.dzaitsev.rssmodel.annotations.Optional;
import com.dzaitsev.rssmodel.annotations.Required;
import lombok.Data;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/**
 * describe a person, corporation, or similar entity
 *
 * @author Dmitriy Zaitsev
 * @since 2015-Oct-11, 13:37.
 */
@Data
@Root
public final class Person {
    /**
     * conveys a human-readable name for the person
     */
    @Required
    @Element(name = Atom.NAME)
    private String name;

    /**
     * contains an email address for the person
     */
    @Optional
    @Element(required = false, name = Atom.EMAIL)
    private String email;

    /**
     * contains a home page for the person
     */
    @Optional
    @Element(required = false, name = Atom.URI)
    private String uri;
}
