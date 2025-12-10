package androidx.emoji2.text.flatbuffer;

import com.google.common.base.Ascii;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public abstract class Utf8 {

    /* renamed from: a */
    public static Utf8 f35271a;

    /* loaded from: classes2.dex */
    public static class UnpairedSurrogateException extends IllegalArgumentException {
        public UnpairedSurrogateException(int i, int i2) {
            super("Unpaired surrogate at index " + i + " of " + i2);
        }
    }

    /* renamed from: androidx.emoji2.text.flatbuffer.Utf8$a */
    /* loaded from: classes2.dex */
    public static class C4543a {
        /* renamed from: a */
        public static void m54642a(byte b, byte b2, byte b3, byte b4, char[] cArr, int i) {
            if (!m54637f(b2) && (((b << Ascii.f52686FS) + (b2 + 112)) >> 30) == 0 && !m54637f(b3) && !m54637f(b4)) {
                int m54632k = ((b & 7) << 18) | (m54632k(b2) << 12) | (m54632k(b3) << 6) | m54632k(b4);
                cArr[i] = m54638e(m54632k);
                cArr[i + 1] = m54633j(m54632k);
                return;
            }
            throw new IllegalArgumentException("Invalid UTF-8");
        }

        /* renamed from: b */
        public static void m54641b(byte b, char[] cArr, int i) {
            cArr[i] = (char) b;
        }

        /* renamed from: c */
        public static void m54640c(byte b, byte b2, byte b3, char[] cArr, int i) {
            if (!m54637f(b2) && ((b != -32 || b2 >= -96) && ((b != -19 || b2 < -96) && !m54637f(b3)))) {
                cArr[i] = (char) (((b & 15) << 12) | (m54632k(b2) << 6) | m54632k(b3));
                return;
            }
            throw new IllegalArgumentException("Invalid UTF-8");
        }

        /* renamed from: d */
        public static void m54639d(byte b, byte b2, char[] cArr, int i) {
            if (b >= -62) {
                if (!m54637f(b2)) {
                    cArr[i] = (char) (((b & Ascii.f52695US) << 6) | m54632k(b2));
                    return;
                }
                throw new IllegalArgumentException("Invalid UTF-8: Illegal trailing byte in 2 bytes utf");
            }
            throw new IllegalArgumentException("Invalid UTF-8: Illegal leading byte in 2 bytes utf");
        }

        /* renamed from: e */
        public static char m54638e(int i) {
            return (char) ((i >>> 10) + okio.Utf8.HIGH_SURROGATE_HEADER);
        }

        /* renamed from: f */
        public static boolean m54637f(byte b) {
            return b > -65;
        }

        /* renamed from: g */
        public static boolean m54636g(byte b) {
            return b >= 0;
        }

        /* renamed from: h */
        public static boolean m54635h(byte b) {
            return b < -16;
        }

        /* renamed from: i */
        public static boolean m54634i(byte b) {
            return b < -32;
        }

        /* renamed from: j */
        public static char m54633j(int i) {
            return (char) ((i & 1023) + 56320);
        }

        /* renamed from: k */
        public static int m54632k(byte b) {
            return b & okio.Utf8.REPLACEMENT_BYTE;
        }
    }

    public static Utf8 getDefault() {
        if (f35271a == null) {
            f35271a = new Utf8Safe();
        }
        return f35271a;
    }

    public static void setDefault(Utf8 utf8) {
        f35271a = utf8;
    }

    public abstract String decodeUtf8(ByteBuffer byteBuffer, int i, int i2);

    public abstract void encodeUtf8(CharSequence charSequence, ByteBuffer byteBuffer);

    public abstract int encodedLength(CharSequence charSequence);
}
