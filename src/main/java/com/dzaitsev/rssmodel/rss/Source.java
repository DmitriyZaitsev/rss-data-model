package com.dzaitsev.rssmodel.rss;

import com.dzaitsev.rssmodel.Value;
import com.dzaitsev.rssmodel.annotations.Required;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Root;

/**
 * The purpose of this element is to propogate credit for links, to publicize the sources of news items. It's used in
 * the post command in the Radio UserLand aggregator. It should be generated automatically when forwarding an item from
 * an aggregator to a weblog authoring tool.
 *
 * @author Dmitriy Zaitsev (dzaitsev@lohika.com)
 * @since 2015-Oct-11, 22:23
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Root(strict = false, name = Rss.SOURCE)
public final class Source extends Value {

    /**
     * links to the XMLization of the source.
     */
    @Required
    @Attribute(name = Rss.URL)
    private String url;
}
