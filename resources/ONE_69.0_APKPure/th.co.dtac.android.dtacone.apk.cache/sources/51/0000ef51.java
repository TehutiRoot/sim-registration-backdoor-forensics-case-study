package org.apache.commons.p028io.charset;

import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;

/* renamed from: org.apache.commons.io.charset.CharsetDecoders */
/* loaded from: classes6.dex */
public final class CharsetDecoders {
    public static CharsetDecoder toCharsetDecoder(CharsetDecoder charsetDecoder) {
        if (charsetDecoder == null) {
            return Charset.defaultCharset().newDecoder();
        }
        return charsetDecoder;
    }
}