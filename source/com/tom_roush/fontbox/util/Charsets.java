package com.tom_roush.fontbox.util;

import java.nio.charset.Charset;
import org.apache.http.protocol.HTTP;

/* loaded from: classes5.dex */
public final class Charsets {
    public static final Charset ISO_8859_1 = Charset.forName("ISO-8859-1");
    public static final Charset UTF_16 = Charset.forName(HTTP.UTF_16);
    public static final Charset UTF_16BE = Charset.forName("UTF-16BE");
    public static final Charset US_ASCII = Charset.forName("US-ASCII");
    public static final Charset ISO_10646 = Charset.forName("ISO-10646-UCS-2");
}
