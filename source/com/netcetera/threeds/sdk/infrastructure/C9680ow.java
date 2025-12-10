package com.netcetera.threeds.sdk.infrastructure;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Collection;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import okhttp3.HttpUrl;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.ow */
/* loaded from: classes5.dex */
public class C9680ow extends ArrayList implements InterfaceC9678ou, InterfaceC9679ov {
    public static void get(Collection collection, Writer writer) throws IOException {
        if (collection == null) {
            writer.write(AbstractJsonLexerKt.NULL);
            return;
        }
        writer.write(91);
        boolean z = true;
        for (Object obj : collection) {
            if (z) {
                z = false;
            } else {
                writer.write(44);
            }
            if (obj == null) {
                writer.write(AbstractJsonLexerKt.NULL);
            } else {
                C9681ox.values(obj, writer);
            }
        }
        writer.write(93);
    }

    public static void valueOf(double[] dArr, Writer writer) throws IOException {
        if (dArr == null) {
            writer.write(AbstractJsonLexerKt.NULL);
        } else if (dArr.length == 0) {
            writer.write(HttpUrl.PATH_SEGMENT_ENCODE_SET_URI);
        } else {
            writer.write("[");
            writer.write(String.valueOf(dArr[0]));
            for (int i = 1; i < dArr.length; i++) {
                writer.write(",");
                writer.write(String.valueOf(dArr[i]));
            }
            writer.write("]");
        }
    }

    public static void values(byte[] bArr, Writer writer) throws IOException {
        if (bArr == null) {
            writer.write(AbstractJsonLexerKt.NULL);
        } else if (bArr.length == 0) {
            writer.write(HttpUrl.PATH_SEGMENT_ENCODE_SET_URI);
        } else {
            writer.write("[");
            writer.write(String.valueOf((int) bArr[0]));
            for (int i = 1; i < bArr.length; i++) {
                writer.write(",");
                writer.write(String.valueOf((int) bArr[i]));
            }
            writer.write("]");
        }
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9679ov
    public void ThreeDS2Service(Writer writer) throws IOException {
        get(this, writer);
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        return valueOf();
    }

    public static String ThreeDS2Service(Collection collection) {
        StringWriter stringWriter = new StringWriter();
        try {
            get(collection, stringWriter);
            return stringWriter.toString();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void ThreeDS2Service(float[] fArr, Writer writer) throws IOException {
        if (fArr == null) {
            writer.write(AbstractJsonLexerKt.NULL);
        } else if (fArr.length == 0) {
            writer.write(HttpUrl.PATH_SEGMENT_ENCODE_SET_URI);
        } else {
            writer.write("[");
            writer.write(String.valueOf(fArr[0]));
            for (int i = 1; i < fArr.length; i++) {
                writer.write(",");
                writer.write(String.valueOf(fArr[i]));
            }
            writer.write("]");
        }
    }

    public static void values(short[] sArr, Writer writer) throws IOException {
        if (sArr == null) {
            writer.write(AbstractJsonLexerKt.NULL);
        } else if (sArr.length == 0) {
            writer.write(HttpUrl.PATH_SEGMENT_ENCODE_SET_URI);
        } else {
            writer.write("[");
            writer.write(String.valueOf((int) sArr[0]));
            for (int i = 1; i < sArr.length; i++) {
                writer.write(",");
                writer.write(String.valueOf((int) sArr[i]));
            }
            writer.write("]");
        }
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9678ou
    public String valueOf() {
        return ThreeDS2Service(this);
    }

    public static void ThreeDS2Service(boolean[] zArr, Writer writer) throws IOException {
        if (zArr == null) {
            writer.write(AbstractJsonLexerKt.NULL);
        } else if (zArr.length == 0) {
            writer.write(HttpUrl.PATH_SEGMENT_ENCODE_SET_URI);
        } else {
            writer.write("[");
            writer.write(String.valueOf(zArr[0]));
            for (int i = 1; i < zArr.length; i++) {
                writer.write(",");
                writer.write(String.valueOf(zArr[i]));
            }
            writer.write("]");
        }
    }

    public static void values(int[] iArr, Writer writer) throws IOException {
        if (iArr == null) {
            writer.write(AbstractJsonLexerKt.NULL);
        } else if (iArr.length == 0) {
            writer.write(HttpUrl.PATH_SEGMENT_ENCODE_SET_URI);
        } else {
            writer.write("[");
            writer.write(String.valueOf(iArr[0]));
            for (int i = 1; i < iArr.length; i++) {
                writer.write(",");
                writer.write(String.valueOf(iArr[i]));
            }
            writer.write("]");
        }
    }

    public static void ThreeDS2Service(Object[] objArr, Writer writer) throws IOException {
        if (objArr == null) {
            writer.write(AbstractJsonLexerKt.NULL);
        } else if (objArr.length == 0) {
            writer.write(HttpUrl.PATH_SEGMENT_ENCODE_SET_URI);
        } else {
            writer.write("[");
            C9681ox.values(objArr[0], writer);
            for (int i = 1; i < objArr.length; i++) {
                writer.write(",");
                C9681ox.values(objArr[i], writer);
            }
            writer.write("]");
        }
    }

    public static void values(long[] jArr, Writer writer) throws IOException {
        if (jArr == null) {
            writer.write(AbstractJsonLexerKt.NULL);
        } else if (jArr.length == 0) {
            writer.write(HttpUrl.PATH_SEGMENT_ENCODE_SET_URI);
        } else {
            writer.write("[");
            writer.write(String.valueOf(jArr[0]));
            for (int i = 1; i < jArr.length; i++) {
                writer.write(",");
                writer.write(String.valueOf(jArr[i]));
            }
            writer.write("]");
        }
    }

    public static void values(char[] cArr, Writer writer) throws IOException {
        if (cArr == null) {
            writer.write(AbstractJsonLexerKt.NULL);
        } else if (cArr.length == 0) {
            writer.write(HttpUrl.PATH_SEGMENT_ENCODE_SET_URI);
        } else {
            writer.write("[\"");
            writer.write(C9681ox.get(String.valueOf(cArr[0])));
            for (int i = 1; i < cArr.length; i++) {
                writer.write("\",\"");
                writer.write(C9681ox.get(String.valueOf(cArr[i])));
            }
            writer.write("\"]");
        }
    }
}
