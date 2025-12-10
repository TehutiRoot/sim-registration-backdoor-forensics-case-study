package com.google.api.client.util.escape;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import org.slf4j.Marker;

/* loaded from: classes4.dex */
public final class CharEscapers {

    /* renamed from: a */
    public static final Escaper f52370a = new PercentEscaper(PercentEscaper.SAFECHARS_URLENCODER, true);

    /* renamed from: b */
    public static final Escaper f52371b = new PercentEscaper(PercentEscaper.SAFECHARS_URLENCODER, false);

    /* renamed from: c */
    public static final Escaper f52372c = new PercentEscaper(PercentEscaper.SAFEPATHCHARS_URLENCODER);

    /* renamed from: d */
    public static final Escaper f52373d = new PercentEscaper(PercentEscaper.SAFE_PLUS_RESERVED_CHARS_URLENCODER);

    /* renamed from: e */
    public static final Escaper f52374e = new PercentEscaper(PercentEscaper.SAFEUSERINFOCHARS_URLENCODER);

    /* renamed from: f */
    public static final Escaper f52375f = new PercentEscaper(PercentEscaper.SAFEQUERYSTRINGCHARS_URLENCODER);

    public static String decodeUri(String str) {
        try {
            return URLDecoder.decode(str, StandardCharsets.UTF_8.name());
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }

    public static String decodeUriPath(String str) {
        if (str == null) {
            return null;
        }
        try {
            return URLDecoder.decode(str.replace(Marker.ANY_NON_NULL_MARKER, "%2B"), StandardCharsets.UTF_8.name());
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }

    @Deprecated
    public static String escapeUri(String str) {
        return f52370a.escape(str);
    }

    public static String escapeUriConformant(String str) {
        return f52371b.escape(str);
    }

    public static String escapeUriPath(String str) {
        return f52372c.escape(str);
    }

    public static String escapeUriPathWithoutReserved(String str) {
        return f52373d.escape(str);
    }

    public static String escapeUriQuery(String str) {
        return f52375f.escape(str);
    }

    public static String escapeUriUserInfo(String str) {
        return f52374e.escape(str);
    }
}
