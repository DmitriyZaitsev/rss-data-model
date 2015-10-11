package com.dzaitsev.rssmodel.atom;

import com.dzaitsev.rssmodel.Value;
import com.dzaitsev.rssmodel.annotations.Optional;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Root;

/**
 * ~ ~ ~ ~ Description ~ ~ ~ ~
 *
 * @author Dmitriy Zaitsev
 * @since 2015-Oct-11, 15:19
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Root
public class Text extends Value {

    @Optional
    @Attribute(name = Atom.TYPE)
    private String type;
}
