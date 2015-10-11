package com.dzaitsev.rssmodel.rss;

import com.dzaitsev.rssmodel.annotations.Required;
import lombok.Data;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/**
 * ~ ~ ~ ~ Description ~ ~ ~ ~
 *
 * @author Dmitriy Zaitsev (dzaitsev@lohika.com)
 * @since 2015-Oct-11, 21:57
 */
@Data
@Root(strict = false, name = Rss.TEXT_INPUT)
public final class TextInput {

    /**
     * The label of the Submit button in the text input area.
     */
    @Required
    @Element(name = Rss.TITLE)
    private String title;

    /**
     * Explains the text input area.
     */
    @Required
    @Element(name = Rss.DESCRIPTION)
    private String description;

    /**
     * The name of the text object in the text input area.
     */
    @Required
    @Element(name = Rss.NAME)
    private String name;

    /**
     * The URL of the CGI script that processes text input requests.
     */
    @Required
    @Element(name = Rss.LINK)
    private String link;
}
