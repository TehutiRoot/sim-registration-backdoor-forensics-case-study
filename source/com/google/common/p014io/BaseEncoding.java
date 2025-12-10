package com.google.common.p014io;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.Ascii;
import com.google.common.base.Preconditions;
import com.google.common.math.IntMath;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Objects;

@GwtCompatible(emulated = true)
/* renamed from: com.google.common.io.BaseEncoding */
/* loaded from: classes4.dex */
public abstract class BaseEncoding {

    /* renamed from: a */
    public static final BaseEncoding f53878a = new C8078h("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", '=');

    /* renamed from: b */
    public static final BaseEncoding f53879b = new C8078h("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_", '=');

    /* renamed from: c */
    public static final BaseEncoding f53880c = new C8080j("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567", '=');

    /* renamed from: d */
    public static final BaseEncoding f53881d = new C8080j("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV", '=');

    /* renamed from: e */
    public static final BaseEncoding f53882e = new C8077g("base16()", "0123456789ABCDEF");

    /* renamed from: com.google.common.io.BaseEncoding$DecodingException */
    /* loaded from: classes4.dex */
    public static final class DecodingException extends IOException {
        public DecodingException(String str) {
            super(str);
        }
    }

    /* renamed from: com.google.common.io.BaseEncoding$a */
    /* loaded from: classes4.dex */
    public class C8071a extends ByteSink {

        /* renamed from: a */
        public final /* synthetic */ CharSink f53883a;

        /* renamed from: b */
        public final /* synthetic */ BaseEncoding f53884b;

        public C8071a(BaseEncoding baseEncoding, CharSink charSink) {
            this.f53883a = charSink;
            this.f53884b = baseEncoding;
        }

        @Override // com.google.common.p014io.ByteSink
        public OutputStream openStream() {
            return this.f53884b.encodingStream(this.f53883a.openStream());
        }
    }

    /* renamed from: com.google.common.io.BaseEncoding$b */
    /* loaded from: classes4.dex */
    public class C8072b extends ByteSource {

        /* renamed from: a */
        public final /* synthetic */ CharSource f53885a;

        /* renamed from: b */
        public final /* synthetic */ BaseEncoding f53886b;

        public C8072b(BaseEncoding baseEncoding, CharSource charSource) {
            this.f53885a = charSource;
            this.f53886b = baseEncoding;
        }

        @Override // com.google.common.p014io.ByteSource
        public InputStream openStream() {
            return this.f53886b.decodingStream(this.f53885a.openStream());
        }
    }

    /* renamed from: com.google.common.io.BaseEncoding$e */
    /* loaded from: classes4.dex */
    public class C8075e extends Writer {

        /* renamed from: a */
        public final /* synthetic */ Appendable f53893a;

        /* renamed from: b */
        public final /* synthetic */ Writer f53894b;

        public C8075e(Appendable appendable, Writer writer) {
            this.f53893a = appendable;
            this.f53894b = writer;
        }

        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f53894b.close();
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() {
            this.f53894b.flush();
        }

        @Override // java.io.Writer
        public void write(int i) {
            this.f53893a.append((char) i);
        }

        @Override // java.io.Writer
        public void write(char[] cArr, int i, int i2) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: com.google.common.io.BaseEncoding$f */
    /* loaded from: classes4.dex */
    public static final class C8076f {

        /* renamed from: a */
        public final String f53895a;

        /* renamed from: b */
        public final char[] f53896b;

        /* renamed from: c */
        public final int f53897c;

        /* renamed from: d */
        public final int f53898d;

        /* renamed from: e */
        public final int f53899e;

        /* renamed from: f */
        public final int f53900f;

        /* renamed from: g */
        public final byte[] f53901g;

        /* renamed from: h */
        public final boolean[] f53902h;

        /* renamed from: i */
        public final boolean f53903i;

        public C8076f(String str, char[] cArr) {
            this(str, cArr, m40024c(cArr), false);
        }

        /* renamed from: c */
        public static byte[] m40024c(char[] cArr) {
            boolean z;
            byte[] bArr = new byte[128];
            Arrays.fill(bArr, (byte) -1);
            for (int i = 0; i < cArr.length; i++) {
                char c = cArr[i];
                boolean z2 = true;
                if (c < 128) {
                    z = true;
                } else {
                    z = false;
                }
                Preconditions.checkArgument(z, "Non-ASCII character: %s", c);
                if (bArr[c] != -1) {
                    z2 = false;
                }
                Preconditions.checkArgument(z2, "Duplicate character: %s", c);
                bArr[c] = (byte) i;
            }
            return bArr;
        }

        /* renamed from: b */
        public boolean m40025b(char c) {
            if (c <= 127 && this.f53901g[c] != -1) {
                return true;
            }
            return false;
        }

        /* renamed from: d */
        public int m40023d(char c) {
            if (c <= 127) {
                byte b = this.f53901g[c];
                if (b == -1) {
                    if (c > ' ' && c != 127) {
                        throw new DecodingException("Unrecognized character: " + c);
                    }
                    throw new DecodingException("Unrecognized character: 0x" + Integer.toHexString(c));
                }
                return b;
            }
            throw new DecodingException("Unrecognized character: 0x" + Integer.toHexString(c));
        }

        /* renamed from: e */
        public char m40022e(int i) {
            return this.f53896b[i];
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C8076f)) {
                return false;
            }
            C8076f c8076f = (C8076f) obj;
            if (this.f53903i != c8076f.f53903i || !Arrays.equals(this.f53896b, c8076f.f53896b)) {
                return false;
            }
            return true;
        }

        /* renamed from: f */
        public final boolean m40021f() {
            for (char c : this.f53896b) {
                if (Ascii.isLowerCase(c)) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: g */
        public final boolean m40020g() {
            for (char c : this.f53896b) {
                if (Ascii.isUpperCase(c)) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: h */
        public C8076f m40019h() {
            if (this.f53903i) {
                return this;
            }
            byte[] bArr = this.f53901g;
            byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
            int i = 65;
            while (true) {
                boolean z = true;
                if (i <= 90) {
                    int i2 = i | 32;
                    byte[] bArr2 = this.f53901g;
                    byte b = bArr2[i];
                    byte b2 = bArr2[i2];
                    if (b == -1) {
                        copyOf[i] = b2;
                    } else {
                        if (b2 != -1) {
                            z = false;
                        }
                        Preconditions.checkState(z, "Can't ignoreCase() since '%s' and '%s' encode different values", (char) i, (char) i2);
                        copyOf[i2] = b;
                    }
                    i++;
                } else {
                    return new C8076f(this.f53895a + ".ignoreCase()", this.f53896b, copyOf, true);
                }
            }
        }

        public int hashCode() {
            int i;
            int hashCode = Arrays.hashCode(this.f53896b);
            if (this.f53903i) {
                i = 1231;
            } else {
                i = 1237;
            }
            return hashCode + i;
        }

        /* renamed from: i */
        public boolean m40018i(int i) {
            return this.f53902h[i % this.f53899e];
        }

        /* renamed from: j */
        public C8076f m40017j() {
            if (!m40020g()) {
                return this;
            }
            Preconditions.checkState(!m40021f(), "Cannot call lowerCase() on a mixed-case alphabet");
            char[] cArr = new char[this.f53896b.length];
            int i = 0;
            while (true) {
                char[] cArr2 = this.f53896b;
                if (i >= cArr2.length) {
                    break;
                }
                cArr[i] = Ascii.toLowerCase(cArr2[i]);
                i++;
            }
            C8076f c8076f = new C8076f(this.f53895a + ".lowerCase()", cArr);
            if (this.f53903i) {
                return c8076f.m40019h();
            }
            return c8076f;
        }

        /* renamed from: k */
        public boolean m40016k(char c) {
            byte[] bArr = this.f53901g;
            if (c < bArr.length && bArr[c] != -1) {
                return true;
            }
            return false;
        }

        /* renamed from: l */
        public C8076f m40015l() {
            if (!m40021f()) {
                return this;
            }
            Preconditions.checkState(!m40020g(), "Cannot call upperCase() on a mixed-case alphabet");
            char[] cArr = new char[this.f53896b.length];
            int i = 0;
            while (true) {
                char[] cArr2 = this.f53896b;
                if (i >= cArr2.length) {
                    break;
                }
                cArr[i] = Ascii.toUpperCase(cArr2[i]);
                i++;
            }
            C8076f c8076f = new C8076f(this.f53895a + ".upperCase()", cArr);
            if (this.f53903i) {
                return c8076f.m40019h();
            }
            return c8076f;
        }

        public String toString() {
            return this.f53895a;
        }

        public C8076f(String str, char[] cArr, byte[] bArr, boolean z) {
            this.f53895a = (String) Preconditions.checkNotNull(str);
            this.f53896b = (char[]) Preconditions.checkNotNull(cArr);
            try {
                int log2 = IntMath.log2(cArr.length, RoundingMode.UNNECESSARY);
                this.f53898d = log2;
                int numberOfTrailingZeros = Integer.numberOfTrailingZeros(log2);
                int i = 1 << (3 - numberOfTrailingZeros);
                this.f53899e = i;
                this.f53900f = log2 >> numberOfTrailingZeros;
                this.f53897c = cArr.length - 1;
                this.f53901g = bArr;
                boolean[] zArr = new boolean[i];
                for (int i2 = 0; i2 < this.f53900f; i2++) {
                    zArr[IntMath.divide(i2 * 8, this.f53898d, RoundingMode.CEILING)] = true;
                }
                this.f53902h = zArr;
                this.f53903i = z;
            } catch (ArithmeticException e) {
                throw new IllegalArgumentException("Illegal alphabet length " + cArr.length, e);
            }
        }
    }

    /* renamed from: com.google.common.io.BaseEncoding$g */
    /* loaded from: classes4.dex */
    public static final class C8077g extends C8080j {

        /* renamed from: k */
        public final char[] f53904k;

        public C8077g(String str, String str2) {
            this(new C8076f(str, str2.toCharArray()));
        }

        @Override // com.google.common.p014io.BaseEncoding.C8080j, com.google.common.p014io.BaseEncoding
        /* renamed from: b */
        public int mo40014b(byte[] bArr, CharSequence charSequence) {
            Preconditions.checkNotNull(bArr);
            if (charSequence.length() % 2 != 1) {
                int i = 0;
                int i2 = 0;
                while (i < charSequence.length()) {
                    bArr[i2] = (byte) ((this.f53908f.m40023d(charSequence.charAt(i)) << 4) | this.f53908f.m40023d(charSequence.charAt(i + 1)));
                    i += 2;
                    i2++;
                }
                return i2;
            }
            throw new DecodingException("Invalid input length " + charSequence.length());
        }

        @Override // com.google.common.p014io.BaseEncoding.C8080j, com.google.common.p014io.BaseEncoding
        /* renamed from: c */
        public void mo40013c(Appendable appendable, byte[] bArr, int i, int i2) {
            Preconditions.checkNotNull(appendable);
            Preconditions.checkPositionIndexes(i, i + i2, bArr.length);
            for (int i3 = 0; i3 < i2; i3++) {
                int i4 = bArr[i + i3] & 255;
                appendable.append(this.f53904k[i4]);
                appendable.append(this.f53904k[i4 | 256]);
            }
        }

        @Override // com.google.common.p014io.BaseEncoding.C8080j
        /* renamed from: l */
        public BaseEncoding mo40008l(C8076f c8076f, Character ch2) {
            return new C8077g(c8076f);
        }

        public C8077g(C8076f c8076f) {
            super(c8076f, null);
            this.f53904k = new char[512];
            Preconditions.checkArgument(c8076f.f53896b.length == 16);
            for (int i = 0; i < 256; i++) {
                this.f53904k[i] = c8076f.m40022e(i >>> 4);
                this.f53904k[i | 256] = c8076f.m40022e(i & 15);
            }
        }
    }

    /* renamed from: com.google.common.io.BaseEncoding$h */
    /* loaded from: classes4.dex */
    public static final class C8078h extends C8080j {
        public C8078h(String str, String str2, Character ch2) {
            this(new C8076f(str, str2.toCharArray()), ch2);
        }

        @Override // com.google.common.p014io.BaseEncoding.C8080j, com.google.common.p014io.BaseEncoding
        /* renamed from: b */
        public int mo40014b(byte[] bArr, CharSequence charSequence) {
            Preconditions.checkNotNull(bArr);
            CharSequence mo40010j = mo40010j(charSequence);
            if (this.f53908f.m40018i(mo40010j.length())) {
                int i = 0;
                int i2 = 0;
                while (i < mo40010j.length()) {
                    int i3 = i + 2;
                    int m40023d = (this.f53908f.m40023d(mo40010j.charAt(i)) << 18) | (this.f53908f.m40023d(mo40010j.charAt(i + 1)) << 12);
                    int i4 = i2 + 1;
                    bArr[i2] = (byte) (m40023d >>> 16);
                    if (i3 < mo40010j.length()) {
                        int i5 = i + 3;
                        int m40023d2 = m40023d | (this.f53908f.m40023d(mo40010j.charAt(i3)) << 6);
                        int i6 = i2 + 2;
                        bArr[i4] = (byte) ((m40023d2 >>> 8) & 255);
                        if (i5 < mo40010j.length()) {
                            i += 4;
                            i2 += 3;
                            bArr[i6] = (byte) ((m40023d2 | this.f53908f.m40023d(mo40010j.charAt(i5))) & 255);
                        } else {
                            i2 = i6;
                            i = i5;
                        }
                    } else {
                        i2 = i4;
                        i = i3;
                    }
                }
                return i2;
            }
            throw new DecodingException("Invalid input length " + mo40010j.length());
        }

        @Override // com.google.common.p014io.BaseEncoding.C8080j, com.google.common.p014io.BaseEncoding
        /* renamed from: c */
        public void mo40013c(Appendable appendable, byte[] bArr, int i, int i2) {
            Preconditions.checkNotNull(appendable);
            int i3 = i + i2;
            Preconditions.checkPositionIndexes(i, i3, bArr.length);
            while (i2 >= 3) {
                int i4 = i + 2;
                int i5 = (bArr[i + 1] & 255) << 8;
                i += 3;
                int i6 = i5 | ((bArr[i] & 255) << 16) | (bArr[i4] & 255);
                appendable.append(this.f53908f.m40022e(i6 >>> 18));
                appendable.append(this.f53908f.m40022e((i6 >>> 12) & 63));
                appendable.append(this.f53908f.m40022e((i6 >>> 6) & 63));
                appendable.append(this.f53908f.m40022e(i6 & 63));
                i2 -= 3;
            }
            if (i < i3) {
                m40009k(appendable, bArr, i, i3 - i);
            }
        }

        @Override // com.google.common.p014io.BaseEncoding.C8080j
        /* renamed from: l */
        public BaseEncoding mo40008l(C8076f c8076f, Character ch2) {
            return new C8078h(c8076f, ch2);
        }

        public C8078h(C8076f c8076f, Character ch2) {
            super(c8076f, ch2);
            Preconditions.checkArgument(c8076f.f53896b.length == 64);
        }
    }

    /* renamed from: com.google.common.io.BaseEncoding$i */
    /* loaded from: classes4.dex */
    public static final class C8079i extends BaseEncoding {

        /* renamed from: f */
        public final BaseEncoding f53905f;

        /* renamed from: g */
        public final String f53906g;

        /* renamed from: h */
        public final int f53907h;

        public C8079i(BaseEncoding baseEncoding, String str, int i) {
            boolean z;
            this.f53905f = (BaseEncoding) Preconditions.checkNotNull(baseEncoding);
            this.f53906g = (String) Preconditions.checkNotNull(str);
            this.f53907h = i;
            if (i > 0) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkArgument(z, "Cannot add a separator after every %s chars", i);
        }

        @Override // com.google.common.p014io.BaseEncoding
        /* renamed from: b */
        public int mo40014b(byte[] bArr, CharSequence charSequence) {
            StringBuilder sb = new StringBuilder(charSequence.length());
            for (int i = 0; i < charSequence.length(); i++) {
                char charAt = charSequence.charAt(i);
                if (this.f53906g.indexOf(charAt) < 0) {
                    sb.append(charAt);
                }
            }
            return this.f53905f.mo40014b(bArr, sb);
        }

        @Override // com.google.common.p014io.BaseEncoding
        /* renamed from: c */
        public void mo40013c(Appendable appendable, byte[] bArr, int i, int i2) {
            this.f53905f.mo40013c(BaseEncoding.m40028h(appendable, this.f53906g, this.f53907h), bArr, i, i2);
        }

        @Override // com.google.common.p014io.BaseEncoding
        public boolean canDecode(CharSequence charSequence) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < charSequence.length(); i++) {
                char charAt = charSequence.charAt(i);
                if (this.f53906g.indexOf(charAt) < 0) {
                    sb.append(charAt);
                }
            }
            return this.f53905f.canDecode(sb);
        }

        @Override // com.google.common.p014io.BaseEncoding
        public InputStream decodingStream(Reader reader) {
            return this.f53905f.decodingStream(BaseEncoding.m40029e(reader, this.f53906g));
        }

        @Override // com.google.common.p014io.BaseEncoding
        public OutputStream encodingStream(Writer writer) {
            return this.f53905f.encodingStream(BaseEncoding.m40027i(writer, this.f53906g, this.f53907h));
        }

        @Override // com.google.common.p014io.BaseEncoding
        /* renamed from: f */
        public int mo40012f(int i) {
            return this.f53905f.mo40012f(i);
        }

        @Override // com.google.common.p014io.BaseEncoding
        /* renamed from: g */
        public int mo40011g(int i) {
            int mo40011g = this.f53905f.mo40011g(i);
            return mo40011g + (this.f53906g.length() * IntMath.divide(Math.max(0, mo40011g - 1), this.f53907h, RoundingMode.FLOOR));
        }

        @Override // com.google.common.p014io.BaseEncoding
        public BaseEncoding ignoreCase() {
            return this.f53905f.ignoreCase().withSeparator(this.f53906g, this.f53907h);
        }

        @Override // com.google.common.p014io.BaseEncoding
        /* renamed from: j */
        public CharSequence mo40010j(CharSequence charSequence) {
            return this.f53905f.mo40010j(charSequence);
        }

        @Override // com.google.common.p014io.BaseEncoding
        public BaseEncoding lowerCase() {
            return this.f53905f.lowerCase().withSeparator(this.f53906g, this.f53907h);
        }

        @Override // com.google.common.p014io.BaseEncoding
        public BaseEncoding omitPadding() {
            return this.f53905f.omitPadding().withSeparator(this.f53906g, this.f53907h);
        }

        public String toString() {
            return this.f53905f + ".withSeparator(\"" + this.f53906g + "\", " + this.f53907h + ")";
        }

        @Override // com.google.common.p014io.BaseEncoding
        public BaseEncoding upperCase() {
            return this.f53905f.upperCase().withSeparator(this.f53906g, this.f53907h);
        }

        @Override // com.google.common.p014io.BaseEncoding
        public BaseEncoding withPadChar(char c) {
            return this.f53905f.withPadChar(c).withSeparator(this.f53906g, this.f53907h);
        }

        @Override // com.google.common.p014io.BaseEncoding
        public BaseEncoding withSeparator(String str, int i) {
            throw new UnsupportedOperationException("Already have a separator");
        }
    }

    /* renamed from: com.google.common.io.BaseEncoding$j */
    /* loaded from: classes4.dex */
    public static class C8080j extends BaseEncoding {

        /* renamed from: f */
        public final C8076f f53908f;

        /* renamed from: g */
        public final Character f53909g;

        /* renamed from: h */
        public volatile BaseEncoding f53910h;

        /* renamed from: i */
        public volatile BaseEncoding f53911i;

        /* renamed from: j */
        public volatile BaseEncoding f53912j;

        /* renamed from: com.google.common.io.BaseEncoding$j$a */
        /* loaded from: classes4.dex */
        public class C8081a extends OutputStream {

            /* renamed from: a */
            public int f53913a = 0;

            /* renamed from: b */
            public int f53914b = 0;

            /* renamed from: c */
            public int f53915c = 0;

            /* renamed from: d */
            public final /* synthetic */ Writer f53916d;

            /* renamed from: e */
            public final /* synthetic */ C8080j f53917e;

            public C8081a(C8080j c8080j, Writer writer) {
                this.f53916d = writer;
                this.f53917e = c8080j;
            }

            @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                int i = this.f53914b;
                if (i > 0) {
                    int i2 = this.f53913a;
                    C8076f c8076f = this.f53917e.f53908f;
                    this.f53916d.write(c8076f.m40022e((i2 << (c8076f.f53898d - i)) & c8076f.f53897c));
                    this.f53915c++;
                    if (this.f53917e.f53909g != null) {
                        while (true) {
                            int i3 = this.f53915c;
                            C8080j c8080j = this.f53917e;
                            if (i3 % c8080j.f53908f.f53899e == 0) {
                                break;
                            }
                            this.f53916d.write(c8080j.f53909g.charValue());
                            this.f53915c++;
                        }
                    }
                }
                this.f53916d.close();
            }

            @Override // java.io.OutputStream, java.io.Flushable
            public void flush() {
                this.f53916d.flush();
            }

            @Override // java.io.OutputStream
            public void write(int i) {
                this.f53913a = (i & 255) | (this.f53913a << 8);
                this.f53914b += 8;
                while (true) {
                    int i2 = this.f53914b;
                    C8076f c8076f = this.f53917e.f53908f;
                    int i3 = c8076f.f53898d;
                    if (i2 >= i3) {
                        this.f53916d.write(c8076f.m40022e((this.f53913a >> (i2 - i3)) & c8076f.f53897c));
                        this.f53915c++;
                        this.f53914b -= this.f53917e.f53908f.f53898d;
                    } else {
                        return;
                    }
                }
            }
        }

        public C8080j(String str, String str2, Character ch2) {
            this(new C8076f(str, str2.toCharArray()), ch2);
        }

        @Override // com.google.common.p014io.BaseEncoding
        /* renamed from: b */
        public int mo40014b(byte[] bArr, CharSequence charSequence) {
            C8076f c8076f;
            Preconditions.checkNotNull(bArr);
            CharSequence mo40010j = mo40010j(charSequence);
            if (this.f53908f.m40018i(mo40010j.length())) {
                int i = 0;
                int i2 = 0;
                while (i < mo40010j.length()) {
                    long j = 0;
                    int i3 = 0;
                    int i4 = 0;
                    while (true) {
                        c8076f = this.f53908f;
                        if (i3 >= c8076f.f53899e) {
                            break;
                        }
                        j <<= c8076f.f53898d;
                        if (i + i3 < mo40010j.length()) {
                            j |= this.f53908f.m40023d(mo40010j.charAt(i4 + i));
                            i4++;
                        }
                        i3++;
                    }
                    int i5 = c8076f.f53900f;
                    int i6 = (i5 * 8) - (i4 * c8076f.f53898d);
                    int i7 = (i5 - 1) * 8;
                    while (i7 >= i6) {
                        bArr[i2] = (byte) ((j >>> i7) & 255);
                        i7 -= 8;
                        i2++;
                    }
                    i += this.f53908f.f53899e;
                }
                return i2;
            }
            throw new DecodingException("Invalid input length " + mo40010j.length());
        }

        @Override // com.google.common.p014io.BaseEncoding
        /* renamed from: c */
        public void mo40013c(Appendable appendable, byte[] bArr, int i, int i2) {
            Preconditions.checkNotNull(appendable);
            Preconditions.checkPositionIndexes(i, i + i2, bArr.length);
            int i3 = 0;
            while (i3 < i2) {
                m40009k(appendable, bArr, i + i3, Math.min(this.f53908f.f53900f, i2 - i3));
                i3 += this.f53908f.f53900f;
            }
        }

        @Override // com.google.common.p014io.BaseEncoding
        public boolean canDecode(CharSequence charSequence) {
            Preconditions.checkNotNull(charSequence);
            CharSequence mo40010j = mo40010j(charSequence);
            if (!this.f53908f.m40018i(mo40010j.length())) {
                return false;
            }
            for (int i = 0; i < mo40010j.length(); i++) {
                if (!this.f53908f.m40025b(mo40010j.charAt(i))) {
                    return false;
                }
            }
            return true;
        }

        @Override // com.google.common.p014io.BaseEncoding
        public InputStream decodingStream(Reader reader) {
            Preconditions.checkNotNull(reader);
            return new C8082b(this, reader);
        }

        @Override // com.google.common.p014io.BaseEncoding
        public OutputStream encodingStream(Writer writer) {
            Preconditions.checkNotNull(writer);
            return new C8081a(this, writer);
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C8080j)) {
                return false;
            }
            C8080j c8080j = (C8080j) obj;
            if (!this.f53908f.equals(c8080j.f53908f) || !Objects.equals(this.f53909g, c8080j.f53909g)) {
                return false;
            }
            return true;
        }

        @Override // com.google.common.p014io.BaseEncoding
        /* renamed from: f */
        public int mo40012f(int i) {
            return (int) (((this.f53908f.f53898d * i) + 7) / 8);
        }

        @Override // com.google.common.p014io.BaseEncoding
        /* renamed from: g */
        public int mo40011g(int i) {
            C8076f c8076f = this.f53908f;
            return c8076f.f53899e * IntMath.divide(i, c8076f.f53900f, RoundingMode.CEILING);
        }

        public int hashCode() {
            return this.f53908f.hashCode() ^ Objects.hashCode(this.f53909g);
        }

        @Override // com.google.common.p014io.BaseEncoding
        public BaseEncoding ignoreCase() {
            BaseEncoding baseEncoding = this.f53912j;
            if (baseEncoding == null) {
                C8076f m40019h = this.f53908f.m40019h();
                if (m40019h == this.f53908f) {
                    baseEncoding = this;
                } else {
                    baseEncoding = mo40008l(m40019h, this.f53909g);
                }
                this.f53912j = baseEncoding;
            }
            return baseEncoding;
        }

        @Override // com.google.common.p014io.BaseEncoding
        /* renamed from: j */
        public CharSequence mo40010j(CharSequence charSequence) {
            Preconditions.checkNotNull(charSequence);
            Character ch2 = this.f53909g;
            if (ch2 == null) {
                return charSequence;
            }
            char charValue = ch2.charValue();
            int length = charSequence.length() - 1;
            while (length >= 0 && charSequence.charAt(length) == charValue) {
                length--;
            }
            return charSequence.subSequence(0, length + 1);
        }

        /* renamed from: k */
        public void m40009k(Appendable appendable, byte[] bArr, int i, int i2) {
            boolean z;
            Preconditions.checkNotNull(appendable);
            Preconditions.checkPositionIndexes(i, i + i2, bArr.length);
            int i3 = 0;
            if (i2 <= this.f53908f.f53900f) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkArgument(z);
            long j = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                j = (j | (bArr[i + i4] & 255)) << 8;
            }
            int i5 = ((i2 + 1) * 8) - this.f53908f.f53898d;
            while (i3 < i2 * 8) {
                C8076f c8076f = this.f53908f;
                appendable.append(c8076f.m40022e(((int) (j >>> (i5 - i3))) & c8076f.f53897c));
                i3 += this.f53908f.f53898d;
            }
            if (this.f53909g != null) {
                while (i3 < this.f53908f.f53900f * 8) {
                    appendable.append(this.f53909g.charValue());
                    i3 += this.f53908f.f53898d;
                }
            }
        }

        /* renamed from: l */
        public BaseEncoding mo40008l(C8076f c8076f, Character ch2) {
            return new C8080j(c8076f, ch2);
        }

        @Override // com.google.common.p014io.BaseEncoding
        public BaseEncoding lowerCase() {
            BaseEncoding baseEncoding = this.f53911i;
            if (baseEncoding == null) {
                C8076f m40017j = this.f53908f.m40017j();
                if (m40017j == this.f53908f) {
                    baseEncoding = this;
                } else {
                    baseEncoding = mo40008l(m40017j, this.f53909g);
                }
                this.f53911i = baseEncoding;
            }
            return baseEncoding;
        }

        @Override // com.google.common.p014io.BaseEncoding
        public BaseEncoding omitPadding() {
            if (this.f53909g == null) {
                return this;
            }
            return mo40008l(this.f53908f, null);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("BaseEncoding.");
            sb.append(this.f53908f);
            if (8 % this.f53908f.f53898d != 0) {
                if (this.f53909g == null) {
                    sb.append(".omitPadding()");
                } else {
                    sb.append(".withPadChar('");
                    sb.append(this.f53909g);
                    sb.append("')");
                }
            }
            return sb.toString();
        }

        @Override // com.google.common.p014io.BaseEncoding
        public BaseEncoding upperCase() {
            BaseEncoding baseEncoding = this.f53910h;
            if (baseEncoding == null) {
                C8076f m40015l = this.f53908f.m40015l();
                if (m40015l == this.f53908f) {
                    baseEncoding = this;
                } else {
                    baseEncoding = mo40008l(m40015l, this.f53909g);
                }
                this.f53910h = baseEncoding;
            }
            return baseEncoding;
        }

        @Override // com.google.common.p014io.BaseEncoding
        public BaseEncoding withPadChar(char c) {
            Character ch2;
            if (8 % this.f53908f.f53898d != 0 && ((ch2 = this.f53909g) == null || ch2.charValue() != c)) {
                return mo40008l(this.f53908f, Character.valueOf(c));
            }
            return this;
        }

        @Override // com.google.common.p014io.BaseEncoding
        public BaseEncoding withSeparator(String str, int i) {
            boolean z = false;
            for (int i2 = 0; i2 < str.length(); i2++) {
                Preconditions.checkArgument(!this.f53908f.m40016k(str.charAt(i2)), "Separator (%s) cannot contain alphabet characters", str);
            }
            Character ch2 = this.f53909g;
            if (ch2 != null) {
                if (str.indexOf(ch2.charValue()) < 0) {
                    z = true;
                }
                Preconditions.checkArgument(z, "Separator (%s) cannot contain padding character", str);
            }
            return new C8079i(this, str, i);
        }

        public C8080j(C8076f c8076f, Character ch2) {
            this.f53908f = (C8076f) Preconditions.checkNotNull(c8076f);
            Preconditions.checkArgument(ch2 == null || !c8076f.m40016k(ch2.charValue()), "Padding character %s was already in alphabet", ch2);
            this.f53909g = ch2;
        }

        /* renamed from: com.google.common.io.BaseEncoding$j$b */
        /* loaded from: classes4.dex */
        public class C8082b extends InputStream {

            /* renamed from: a */
            public int f53918a = 0;

            /* renamed from: b */
            public int f53919b = 0;

            /* renamed from: c */
            public int f53920c = 0;

            /* renamed from: d */
            public boolean f53921d = false;

            /* renamed from: e */
            public final /* synthetic */ Reader f53922e;

            /* renamed from: f */
            public final /* synthetic */ C8080j f53923f;

            public C8082b(C8080j c8080j, Reader reader) {
                this.f53922e = reader;
                this.f53923f = c8080j;
            }

            @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                this.f53922e.close();
            }

            /* JADX WARN: Code restructure failed: missing block: B:69:0x0074, code lost:
                throw new com.google.common.p014io.BaseEncoding.DecodingException("Padding cannot start at index " + r4.f53920c);
             */
            @Override // java.io.InputStream
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public int read() {
                /*
                    r4 = this;
                L0:
                    java.io.Reader r0 = r4.f53922e
                    int r0 = r0.read()
                    r1 = -1
                    if (r0 != r1) goto L34
                    boolean r0 = r4.f53921d
                    if (r0 != 0) goto L33
                    com.google.common.io.BaseEncoding$j r0 = r4.f53923f
                    com.google.common.io.BaseEncoding$f r0 = r0.f53908f
                    int r2 = r4.f53920c
                    boolean r0 = r0.m40018i(r2)
                    if (r0 == 0) goto L1a
                    goto L33
                L1a:
                    com.google.common.io.BaseEncoding$DecodingException r0 = new com.google.common.io.BaseEncoding$DecodingException
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    r1.<init>()
                    java.lang.String r2 = "Invalid input length "
                    r1.append(r2)
                    int r2 = r4.f53920c
                    r1.append(r2)
                    java.lang.String r1 = r1.toString()
                    r0.<init>(r1)
                    throw r0
                L33:
                    return r1
                L34:
                    int r1 = r4.f53920c
                    r2 = 1
                    int r1 = r1 + r2
                    r4.f53920c = r1
                    char r0 = (char) r0
                    com.google.common.io.BaseEncoding$j r1 = r4.f53923f
                    java.lang.Character r1 = r1.f53909g
                    if (r1 == 0) goto L78
                    char r1 = r1.charValue()
                    if (r1 != r0) goto L78
                    boolean r0 = r4.f53921d
                    if (r0 != 0) goto L75
                    int r0 = r4.f53920c
                    if (r0 == r2) goto L5c
                    com.google.common.io.BaseEncoding$j r1 = r4.f53923f
                    com.google.common.io.BaseEncoding$f r1 = r1.f53908f
                    int r0 = r0 + (-1)
                    boolean r0 = r1.m40018i(r0)
                    if (r0 == 0) goto L5c
                    goto L75
                L5c:
                    com.google.common.io.BaseEncoding$DecodingException r0 = new com.google.common.io.BaseEncoding$DecodingException
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    r1.<init>()
                    java.lang.String r2 = "Padding cannot start at index "
                    r1.append(r2)
                    int r2 = r4.f53920c
                    r1.append(r2)
                    java.lang.String r1 = r1.toString()
                    r0.<init>(r1)
                    throw r0
                L75:
                    r4.f53921d = r2
                    goto L0
                L78:
                    boolean r1 = r4.f53921d
                    if (r1 != 0) goto La4
                    int r1 = r4.f53918a
                    com.google.common.io.BaseEncoding$j r2 = r4.f53923f
                    com.google.common.io.BaseEncoding$f r2 = r2.f53908f
                    int r3 = r2.f53898d
                    int r1 = r1 << r3
                    r4.f53918a = r1
                    int r0 = r2.m40023d(r0)
                    r0 = r0 | r1
                    r4.f53918a = r0
                    int r1 = r4.f53919b
                    com.google.common.io.BaseEncoding$j r2 = r4.f53923f
                    com.google.common.io.BaseEncoding$f r2 = r2.f53908f
                    int r2 = r2.f53898d
                    int r1 = r1 + r2
                    r4.f53919b = r1
                    r2 = 8
                    if (r1 < r2) goto L0
                    int r1 = r1 - r2
                    r4.f53919b = r1
                    int r0 = r0 >> r1
                    r0 = r0 & 255(0xff, float:3.57E-43)
                    return r0
                La4:
                    com.google.common.io.BaseEncoding$DecodingException r1 = new com.google.common.io.BaseEncoding$DecodingException
                    java.lang.StringBuilder r2 = new java.lang.StringBuilder
                    r2.<init>()
                    java.lang.String r3 = "Expected padding character but found '"
                    r2.append(r3)
                    r2.append(r0)
                    java.lang.String r0 = "' at index "
                    r2.append(r0)
                    int r0 = r4.f53920c
                    r2.append(r0)
                    java.lang.String r0 = r2.toString()
                    r1.<init>(r0)
                    throw r1
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.common.p014io.BaseEncoding.C8080j.C8082b.read():int");
            }

            @Override // java.io.InputStream
            public int read(byte[] bArr, int i, int i2) {
                int i3 = i2 + i;
                Preconditions.checkPositionIndexes(i, i3, bArr.length);
                int i4 = i;
                while (i4 < i3) {
                    int read = read();
                    if (read == -1) {
                        int i5 = i4 - i;
                        if (i5 == 0) {
                            return -1;
                        }
                        return i5;
                    }
                    bArr[i4] = (byte) read;
                    i4++;
                }
                return i4 - i;
            }
        }
    }

    public static BaseEncoding base16() {
        return f53882e;
    }

    public static BaseEncoding base32() {
        return f53880c;
    }

    public static BaseEncoding base32Hex() {
        return f53881d;
    }

    public static BaseEncoding base64() {
        return f53878a;
    }

    public static BaseEncoding base64Url() {
        return f53879b;
    }

    /* renamed from: d */
    public static byte[] m40030d(byte[] bArr, int i) {
        if (i == bArr.length) {
            return bArr;
        }
        byte[] bArr2 = new byte[i];
        System.arraycopy(bArr, 0, bArr2, 0, i);
        return bArr2;
    }

    /* renamed from: e */
    public static Reader m40029e(Reader reader, String str) {
        Preconditions.checkNotNull(reader);
        Preconditions.checkNotNull(str);
        return new C8073c(reader, str);
    }

    /* renamed from: h */
    public static Appendable m40028h(Appendable appendable, String str, int i) {
        boolean z;
        Preconditions.checkNotNull(appendable);
        Preconditions.checkNotNull(str);
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z);
        return new C8074d(i, appendable, str);
    }

    /* renamed from: i */
    public static Writer m40027i(Writer writer, String str, int i) {
        return new C8075e(m40028h(writer, str, i), writer);
    }

    /* renamed from: a */
    public final byte[] m40031a(CharSequence charSequence) {
        CharSequence mo40010j = mo40010j(charSequence);
        byte[] bArr = new byte[mo40012f(mo40010j.length())];
        return m40030d(bArr, mo40014b(bArr, mo40010j));
    }

    /* renamed from: b */
    public abstract int mo40014b(byte[] bArr, CharSequence charSequence);

    /* renamed from: c */
    public abstract void mo40013c(Appendable appendable, byte[] bArr, int i, int i2);

    public abstract boolean canDecode(CharSequence charSequence);

    public final byte[] decode(CharSequence charSequence) {
        try {
            return m40031a(charSequence);
        } catch (DecodingException e) {
            throw new IllegalArgumentException(e);
        }
    }

    @J2ktIncompatible
    @GwtIncompatible
    public final ByteSource decodingSource(CharSource charSource) {
        Preconditions.checkNotNull(charSource);
        return new C8072b(this, charSource);
    }

    @J2ktIncompatible
    @GwtIncompatible
    public abstract InputStream decodingStream(Reader reader);

    public String encode(byte[] bArr) {
        return encode(bArr, 0, bArr.length);
    }

    @J2ktIncompatible
    @GwtIncompatible
    public final ByteSink encodingSink(CharSink charSink) {
        Preconditions.checkNotNull(charSink);
        return new C8071a(this, charSink);
    }

    @J2ktIncompatible
    @GwtIncompatible
    public abstract OutputStream encodingStream(Writer writer);

    /* renamed from: f */
    public abstract int mo40012f(int i);

    /* renamed from: g */
    public abstract int mo40011g(int i);

    public abstract BaseEncoding ignoreCase();

    /* renamed from: j */
    public CharSequence mo40010j(CharSequence charSequence) {
        return (CharSequence) Preconditions.checkNotNull(charSequence);
    }

    public abstract BaseEncoding lowerCase();

    public abstract BaseEncoding omitPadding();

    public abstract BaseEncoding upperCase();

    public abstract BaseEncoding withPadChar(char c);

    public abstract BaseEncoding withSeparator(String str, int i);

    /* renamed from: com.google.common.io.BaseEncoding$c */
    /* loaded from: classes4.dex */
    public class C8073c extends Reader {

        /* renamed from: a */
        public final /* synthetic */ Reader f53887a;

        /* renamed from: b */
        public final /* synthetic */ String f53888b;

        public C8073c(Reader reader, String str) {
            this.f53887a = reader;
            this.f53888b = str;
        }

        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f53887a.close();
        }

        @Override // java.io.Reader
        public int read() {
            int read;
            do {
                read = this.f53887a.read();
                if (read == -1) {
                    break;
                }
            } while (this.f53888b.indexOf((char) read) >= 0);
            return read;
        }

        @Override // java.io.Reader
        public int read(char[] cArr, int i, int i2) {
            throw new UnsupportedOperationException();
        }
    }

    public final String encode(byte[] bArr, int i, int i2) {
        Preconditions.checkPositionIndexes(i, i + i2, bArr.length);
        StringBuilder sb = new StringBuilder(mo40011g(i2));
        try {
            mo40013c(sb, bArr, i, i2);
            return sb.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: com.google.common.io.BaseEncoding$d */
    /* loaded from: classes4.dex */
    public class C8074d implements Appendable {

        /* renamed from: a */
        public int f53889a;

        /* renamed from: b */
        public final /* synthetic */ int f53890b;

        /* renamed from: c */
        public final /* synthetic */ Appendable f53891c;

        /* renamed from: d */
        public final /* synthetic */ String f53892d;

        public C8074d(int i, Appendable appendable, String str) {
            this.f53890b = i;
            this.f53891c = appendable;
            this.f53892d = str;
            this.f53889a = i;
        }

        @Override // java.lang.Appendable
        public Appendable append(char c) {
            if (this.f53889a == 0) {
                this.f53891c.append(this.f53892d);
                this.f53889a = this.f53890b;
            }
            this.f53891c.append(c);
            this.f53889a--;
            return this;
        }

        @Override // java.lang.Appendable
        public Appendable append(CharSequence charSequence, int i, int i2) {
            throw new UnsupportedOperationException();
        }

        @Override // java.lang.Appendable
        public Appendable append(CharSequence charSequence) {
            throw new UnsupportedOperationException();
        }
    }
}
