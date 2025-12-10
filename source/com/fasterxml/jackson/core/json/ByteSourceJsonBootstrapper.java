package com.fasterxml.jackson.core.json;

import com.fasterxml.jackson.core.JsonEncoding;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.format.InputAccessor;
import com.fasterxml.jackson.core.format.MatchStrength;
import com.fasterxml.jackson.core.p011io.IOContext;
import com.fasterxml.jackson.core.p011io.MergedStream;
import com.fasterxml.jackson.core.p011io.UTF32Reader;
import com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer;
import com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer;
import java.io.ByteArrayInputStream;
import java.io.CharConversionException;
import java.io.DataInput;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/* loaded from: classes3.dex */
public final class ByteSourceJsonBootstrapper {
    public static final byte UTF8_BOM_1 = -17;
    public static final byte UTF8_BOM_2 = -69;
    public static final byte UTF8_BOM_3 = -65;

    /* renamed from: a */
    public final IOContext f43141a;

    /* renamed from: b */
    public final InputStream f43142b;

    /* renamed from: c */
    public final byte[] f43143c;

    /* renamed from: d */
    public int f43144d;

    /* renamed from: e */
    public int f43145e;

    /* renamed from: f */
    public final boolean f43146f;

    /* renamed from: g */
    public boolean f43147g;

    /* renamed from: h */
    public int f43148h;

    public ByteSourceJsonBootstrapper(IOContext iOContext, InputStream inputStream) {
        this.f43147g = true;
        this.f43141a = iOContext;
        this.f43142b = inputStream;
        this.f43143c = iOContext.allocReadIOBuffer();
        this.f43144d = 0;
        this.f43145e = 0;
        this.f43146f = true;
    }

    /* renamed from: e */
    public static int m49738e(InputAccessor inputAccessor) {
        if (!inputAccessor.hasMoreBytes()) {
            return -1;
        }
        return m49737f(inputAccessor, inputAccessor.nextByte());
    }

    /* renamed from: f */
    public static int m49737f(InputAccessor inputAccessor, byte b) {
        while (true) {
            int i = b & 255;
            if (i != 32 && i != 13 && i != 10 && i != 9) {
                return i;
            }
            if (!inputAccessor.hasMoreBytes()) {
                return -1;
            }
            b = inputAccessor.nextByte();
        }
    }

    /* renamed from: g */
    public static MatchStrength m49736g(InputAccessor inputAccessor, String str, MatchStrength matchStrength) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (!inputAccessor.hasMoreBytes()) {
                return MatchStrength.INCONCLUSIVE;
            }
            if (inputAccessor.nextByte() != str.charAt(i)) {
                return MatchStrength.NO_MATCH;
            }
        }
        return matchStrength;
    }

    public static MatchStrength hasJSONFormat(InputAccessor inputAccessor) throws IOException {
        if (!inputAccessor.hasMoreBytes()) {
            return MatchStrength.INCONCLUSIVE;
        }
        byte nextByte = inputAccessor.nextByte();
        if (nextByte == -17) {
            if (!inputAccessor.hasMoreBytes()) {
                return MatchStrength.INCONCLUSIVE;
            }
            if (inputAccessor.nextByte() != -69) {
                return MatchStrength.NO_MATCH;
            }
            if (!inputAccessor.hasMoreBytes()) {
                return MatchStrength.INCONCLUSIVE;
            }
            if (inputAccessor.nextByte() != -65) {
                return MatchStrength.NO_MATCH;
            }
            if (!inputAccessor.hasMoreBytes()) {
                return MatchStrength.INCONCLUSIVE;
            }
            nextByte = inputAccessor.nextByte();
        }
        int m49737f = m49737f(inputAccessor, nextByte);
        if (m49737f < 0) {
            return MatchStrength.INCONCLUSIVE;
        }
        if (m49737f == 123) {
            int m49738e = m49738e(inputAccessor);
            if (m49738e < 0) {
                return MatchStrength.INCONCLUSIVE;
            }
            if (m49738e != 34 && m49738e != 125) {
                return MatchStrength.NO_MATCH;
            }
            return MatchStrength.SOLID_MATCH;
        } else if (m49737f == 91) {
            int m49738e2 = m49738e(inputAccessor);
            if (m49738e2 < 0) {
                return MatchStrength.INCONCLUSIVE;
            }
            if (m49738e2 != 93 && m49738e2 != 91) {
                return MatchStrength.SOLID_MATCH;
            }
            return MatchStrength.SOLID_MATCH;
        } else {
            MatchStrength matchStrength = MatchStrength.WEAK_MATCH;
            if (m49737f == 34) {
                return matchStrength;
            }
            if (m49737f <= 57 && m49737f >= 48) {
                return matchStrength;
            }
            if (m49737f == 45) {
                int m49738e3 = m49738e(inputAccessor);
                if (m49738e3 < 0) {
                    return MatchStrength.INCONCLUSIVE;
                }
                if (m49738e3 > 57 || m49738e3 < 48) {
                    return MatchStrength.NO_MATCH;
                }
                return matchStrength;
            } else if (m49737f == 110) {
                return m49736g(inputAccessor, "ull", matchStrength);
            } else {
                if (m49737f == 116) {
                    return m49736g(inputAccessor, "rue", matchStrength);
                }
                if (m49737f == 102) {
                    return m49736g(inputAccessor, "alse", matchStrength);
                }
                return MatchStrength.NO_MATCH;
            }
        }
    }

    public static int skipUTF8BOM(DataInput dataInput) throws IOException {
        int readUnsignedByte = dataInput.readUnsignedByte();
        if (readUnsignedByte != 239) {
            return readUnsignedByte;
        }
        int readUnsignedByte2 = dataInput.readUnsignedByte();
        if (readUnsignedByte2 == 187) {
            int readUnsignedByte3 = dataInput.readUnsignedByte();
            if (readUnsignedByte3 == 191) {
                return dataInput.readUnsignedByte();
            }
            throw new IOException("Unexpected byte 0x" + Integer.toHexString(readUnsignedByte3) + " following 0xEF 0xBB; should get 0xBF as part of UTF-8 BOM");
        }
        throw new IOException("Unexpected byte 0x" + Integer.toHexString(readUnsignedByte2) + " following 0xEF; should get 0xBB as part of UTF-8 BOM");
    }

    /* renamed from: a */
    public final boolean m49742a(int i) {
        if ((65280 & i) == 0) {
            this.f43147g = true;
        } else if ((i & 255) != 0) {
            return false;
        } else {
            this.f43147g = false;
        }
        this.f43148h = 2;
        return true;
    }

    /* renamed from: b */
    public final boolean m49741b(int i) {
        if ((i >> 8) == 0) {
            this.f43147g = true;
        } else if ((16777215 & i) == 0) {
            this.f43147g = false;
        } else if (((-16711681) & i) == 0) {
            m49739d("3412");
        } else if ((i & (-65281)) != 0) {
            return false;
        } else {
            m49739d("2143");
        }
        this.f43148h = 4;
        return true;
    }

    /* renamed from: c */
    public final boolean m49740c(int i) {
        if (i != -16842752) {
            if (i != -131072) {
                if (i != 65279) {
                    if (i == 65534) {
                        m49739d("2143");
                    }
                } else {
                    this.f43147g = true;
                    this.f43144d += 4;
                    this.f43148h = 4;
                    return true;
                }
            } else {
                this.f43144d += 4;
                this.f43148h = 4;
                this.f43147g = false;
                return true;
            }
        } else {
            m49739d("3412");
        }
        int i2 = i >>> 16;
        if (i2 == 65279) {
            this.f43144d += 2;
            this.f43148h = 2;
            this.f43147g = true;
            return true;
        } else if (i2 == 65534) {
            this.f43144d += 2;
            this.f43148h = 2;
            this.f43147g = false;
            return true;
        } else if ((i >>> 8) != 15711167) {
            return false;
        } else {
            this.f43144d += 3;
            this.f43148h = 1;
            this.f43147g = true;
            return true;
        }
    }

    public JsonParser constructParser(int i, ObjectCodec objectCodec, ByteQuadsCanonicalizer byteQuadsCanonicalizer, CharsToNameCanonicalizer charsToNameCanonicalizer, int i2) throws IOException {
        int i3 = this.f43144d;
        JsonEncoding detectEncoding = detectEncoding();
        int i4 = this.f43144d - i3;
        if (detectEncoding == JsonEncoding.UTF8 && JsonFactory.Feature.CANONICALIZE_FIELD_NAMES.enabledIn(i2)) {
            return new UTF8StreamJsonParser(this.f43141a, i, this.f43142b, objectCodec, byteQuadsCanonicalizer.makeChild(i2), this.f43143c, this.f43144d, this.f43145e, i4, this.f43146f);
        }
        return new ReaderBasedJsonParser(this.f43141a, i, constructReader(), objectCodec, charsToNameCanonicalizer.makeChild(i2));
    }

    public Reader constructReader() throws IOException {
        JsonEncoding encoding = this.f43141a.getEncoding();
        int bits = encoding.bits();
        if (bits != 8 && bits != 16) {
            if (bits == 32) {
                IOContext iOContext = this.f43141a;
                return new UTF32Reader(iOContext, this.f43142b, this.f43143c, this.f43144d, this.f43145e, iOContext.getEncoding().isBigEndian());
            }
            throw new RuntimeException("Internal error");
        }
        InputStream inputStream = this.f43142b;
        if (inputStream == null) {
            inputStream = new ByteArrayInputStream(this.f43143c, this.f43144d, this.f43145e);
        } else if (this.f43144d < this.f43145e) {
            inputStream = new MergedStream(this.f43141a, inputStream, this.f43143c, this.f43144d, this.f43145e);
        }
        return new InputStreamReader(inputStream, encoding.getJavaName());
    }

    /* renamed from: d */
    public final void m49739d(String str) {
        throw new CharConversionException("Unsupported UCS-4 endianness (" + str + ") detected");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x003e, code lost:
        if (m49742a(r1 >>> 16) != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x005b, code lost:
        if (m49742a((r1[r4 + 1] & 255) | ((r1[r4] & 255) << 8)) != false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.fasterxml.jackson.core.JsonEncoding detectEncoding() throws java.io.IOException {
        /*
            r7 = this;
            r0 = 4
            boolean r1 = r7.ensureLoaded(r0)
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L41
            byte[] r1 = r7.f43143c
            int r4 = r7.f43144d
            r5 = r1[r4]
            int r5 = r5 << 24
            int r6 = r4 + 1
            r6 = r1[r6]
            r6 = r6 & 255(0xff, float:3.57E-43)
            int r6 = r6 << 16
            r5 = r5 | r6
            int r6 = r4 + 2
            r6 = r1[r6]
            r6 = r6 & 255(0xff, float:3.57E-43)
            int r6 = r6 << 8
            r5 = r5 | r6
            int r4 = r4 + 3
            r1 = r1[r4]
            r1 = r1 & 255(0xff, float:3.57E-43)
            r1 = r1 | r5
            boolean r4 = r7.m49740c(r1)
            if (r4 == 0) goto L31
            goto L5d
        L31:
            boolean r4 = r7.m49741b(r1)
            if (r4 == 0) goto L38
            goto L5d
        L38:
            int r1 = r1 >>> 16
            boolean r1 = r7.m49742a(r1)
            if (r1 == 0) goto L84
            goto L5d
        L41:
            boolean r1 = r7.ensureLoaded(r2)
            if (r1 == 0) goto L84
            byte[] r1 = r7.f43143c
            int r4 = r7.f43144d
            r5 = r1[r4]
            r5 = r5 & 255(0xff, float:3.57E-43)
            int r5 = r5 << 8
            int r4 = r4 + r3
            r1 = r1[r4]
            r1 = r1 & 255(0xff, float:3.57E-43)
            r1 = r1 | r5
            boolean r1 = r7.m49742a(r1)
            if (r1 == 0) goto L84
        L5d:
            int r1 = r7.f43148h
            if (r1 == r3) goto L81
            if (r1 == r2) goto L77
            if (r1 != r0) goto L6f
            boolean r0 = r7.f43147g
            if (r0 == 0) goto L6c
            com.fasterxml.jackson.core.JsonEncoding r0 = com.fasterxml.jackson.core.JsonEncoding.UTF32_BE
            goto L86
        L6c:
            com.fasterxml.jackson.core.JsonEncoding r0 = com.fasterxml.jackson.core.JsonEncoding.UTF32_LE
            goto L86
        L6f:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "Internal error"
            r0.<init>(r1)
            throw r0
        L77:
            boolean r0 = r7.f43147g
            if (r0 == 0) goto L7e
            com.fasterxml.jackson.core.JsonEncoding r0 = com.fasterxml.jackson.core.JsonEncoding.UTF16_BE
            goto L86
        L7e:
            com.fasterxml.jackson.core.JsonEncoding r0 = com.fasterxml.jackson.core.JsonEncoding.UTF16_LE
            goto L86
        L81:
            com.fasterxml.jackson.core.JsonEncoding r0 = com.fasterxml.jackson.core.JsonEncoding.UTF8
            goto L86
        L84:
            com.fasterxml.jackson.core.JsonEncoding r0 = com.fasterxml.jackson.core.JsonEncoding.UTF8
        L86:
            com.fasterxml.jackson.core.io.IOContext r1 = r7.f43141a
            r1.setEncoding(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper.detectEncoding():com.fasterxml.jackson.core.JsonEncoding");
    }

    public boolean ensureLoaded(int i) throws IOException {
        int read;
        int i2 = this.f43145e - this.f43144d;
        while (i2 < i) {
            InputStream inputStream = this.f43142b;
            if (inputStream == null) {
                read = -1;
            } else {
                byte[] bArr = this.f43143c;
                int i3 = this.f43145e;
                read = inputStream.read(bArr, i3, bArr.length - i3);
            }
            if (read < 1) {
                return false;
            }
            this.f43145e += read;
            i2 += read;
        }
        return true;
    }

    public ByteSourceJsonBootstrapper(IOContext iOContext, byte[] bArr, int i, int i2) {
        this.f43147g = true;
        this.f43141a = iOContext;
        this.f43142b = null;
        this.f43143c = bArr;
        this.f43144d = i;
        this.f43145e = i + i2;
        this.f43146f = false;
    }
}
