package org.mynah.blackfuse.util;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

public class StringUtil {

    private StringUtil() {
    }

    public static String transcode(String string, String fromCharset, Charset toCharset) throws UnsupportedEncodingException {
        return new String(string.getBytes(fromCharset), toCharset);
    }
}
