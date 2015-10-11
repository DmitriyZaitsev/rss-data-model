package com.dzaitsev.rssmodel;

import lombok.Data;
import org.simpleframework.xml.Root;
import org.simpleframework.xml.Text;

/**
 * ~ ~ ~ ~ Description ~ ~ ~ ~
 *
 * @author Dmitriy Zaitsev (dzaitsev@lohika.com)
 * @since 2015-Oct-12, 00:10
 */
@Data
@Root
public class Value {
    @Text
    private String value;
}
