package org.apache.commons.p028io.charset;

import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.util.function.Supplier;
import org.apache.commons.p028io.charset.CharsetEncoders;

/* renamed from: org.apache.commons.io.charset.CharsetEncoders */
/* loaded from: classes6.dex */
public final class CharsetEncoders {
    /* renamed from: a */
    public static /* synthetic */ CharsetEncoder m25303a() {
        return m25302b();
    }

    /* renamed from: b */
    public static /* synthetic */ CharsetEncoder m25302b() {
        return Charset.defaultCharset().newEncoder();
    }

    public static CharsetEncoder toCharsetEncoder(CharsetEncoder charsetEncoder) {
        return toCharsetEncoder(charsetEncoder, new Supplier() { // from class: cp
            @Override // java.util.function.Supplier
            public final Object get() {
                return CharsetEncoders.m25303a();
            }
        });
    }

    public static CharsetEncoder toCharsetEncoder(CharsetEncoder charsetEncoder, Supplier<CharsetEncoder> supplier) {
        Object obj;
        if (charsetEncoder != null) {
            return charsetEncoder;
        }
        obj = supplier.get();
        return (CharsetEncoder) obj;
    }
}
