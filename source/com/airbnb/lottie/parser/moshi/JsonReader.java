package com.airbnb.lottie.parser.moshi;

import java.io.Closeable;
import java.io.IOException;
import java.util.Arrays;
import okio.Buffer;
import okio.BufferedSource;
import okio.ByteString;

/* loaded from: classes3.dex */
public abstract class JsonReader implements Closeable {

    /* renamed from: g */
    public static final String[] f41553g = new String[128];

    /* renamed from: a */
    public int f41554a;

    /* renamed from: b */
    public int[] f41555b = new int[32];

    /* renamed from: c */
    public String[] f41556c = new String[32];

    /* renamed from: d */
    public int[] f41557d = new int[32];

    /* renamed from: e */
    public boolean f41558e;

    /* renamed from: f */
    public boolean f41559f;

    /* loaded from: classes3.dex */
    public static final class Options {

        /* renamed from: a */
        public final String[] f41560a;

        /* renamed from: b */
        public final okio.Options f41561b;

        public Options(String[] strArr, okio.Options options) {
            this.f41560a = strArr;
            this.f41561b = options;
        }

        /* renamed from: of */
        public static Options m50685of(String... strArr) {
            try {
                ByteString[] byteStringArr = new ByteString[strArr.length];
                Buffer buffer = new Buffer();
                for (int i = 0; i < strArr.length; i++) {
                    JsonReader.m50688g(buffer, strArr[i]);
                    buffer.readByte();
                    byteStringArr[i] = buffer.readByteString();
                }
                return new Options((String[]) strArr.clone(), okio.Options.m25832of(byteStringArr));
            } catch (IOException e) {
                throw new AssertionError(e);
            }
        }
    }

    /* loaded from: classes3.dex */
    public enum Token {
        BEGIN_ARRAY,
        END_ARRAY,
        BEGIN_OBJECT,
        END_OBJECT,
        NAME,
        STRING,
        NUMBER,
        BOOLEAN,
        NULL,
        END_DOCUMENT
    }

    static {
        for (int i = 0; i <= 31; i++) {
            f41553g[i] = String.format("\\u%04x", Integer.valueOf(i));
        }
        String[] strArr = f41553g;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002b  */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void m50688g(okio.BufferedSink r7, java.lang.String r8) {
        /*
            java.lang.String[] r0 = com.airbnb.lottie.parser.moshi.JsonReader.f41553g
            r1 = 34
            r7.writeByte(r1)
            int r2 = r8.length()
            r3 = 0
            r4 = 0
        Ld:
            if (r3 >= r2) goto L36
            char r5 = r8.charAt(r3)
            r6 = 128(0x80, float:1.794E-43)
            if (r5 >= r6) goto L1c
            r5 = r0[r5]
            if (r5 != 0) goto L29
            goto L33
        L1c:
            r6 = 8232(0x2028, float:1.1535E-41)
            if (r5 != r6) goto L23
            java.lang.String r5 = "\\u2028"
            goto L29
        L23:
            r6 = 8233(0x2029, float:1.1537E-41)
            if (r5 != r6) goto L33
            java.lang.String r5 = "\\u2029"
        L29:
            if (r4 >= r3) goto L2e
            r7.writeUtf8(r8, r4, r3)
        L2e:
            r7.writeUtf8(r5)
            int r4 = r3 + 1
        L33:
            int r3 = r3 + 1
            goto Ld
        L36:
            if (r4 >= r2) goto L3b
            r7.writeUtf8(r8, r4, r2)
        L3b:
            r7.writeByte(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.parser.moshi.JsonReader.m50688g(okio.BufferedSink, java.lang.String):void");
    }

    /* renamed from: of */
    public static JsonReader m50686of(BufferedSource bufferedSource) {
        return new C5721a(bufferedSource);
    }

    public abstract void beginArray() throws IOException;

    public abstract void beginObject() throws IOException;

    /* renamed from: d */
    public final void m50689d(int i) {
        int i2 = this.f41554a;
        int[] iArr = this.f41555b;
        if (i2 == iArr.length) {
            if (i2 != 256) {
                this.f41555b = Arrays.copyOf(iArr, iArr.length * 2);
                String[] strArr = this.f41556c;
                this.f41556c = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
                int[] iArr2 = this.f41557d;
                this.f41557d = Arrays.copyOf(iArr2, iArr2.length * 2);
            } else {
                throw new JsonDataException("Nesting too deep at " + getPath());
            }
        }
        int[] iArr3 = this.f41555b;
        int i3 = this.f41554a;
        this.f41554a = i3 + 1;
        iArr3[i3] = i;
    }

    public abstract void endArray() throws IOException;

    public abstract void endObject() throws IOException;

    public final String getPath() {
        return AbstractC21282nh0.m26058a(this.f41554a, this.f41555b, this.f41556c, this.f41557d);
    }

    public abstract boolean hasNext() throws IOException;

    /* renamed from: i */
    public final JsonEncodingException m50687i(String str) {
        throw new JsonEncodingException(str + " at path " + getPath());
    }

    public abstract boolean nextBoolean() throws IOException;

    public abstract double nextDouble() throws IOException;

    public abstract int nextInt() throws IOException;

    public abstract String nextName() throws IOException;

    public abstract String nextString() throws IOException;

    public abstract Token peek() throws IOException;

    public abstract int selectName(Options options) throws IOException;

    public abstract void skipName() throws IOException;

    public abstract void skipValue() throws IOException;
}
