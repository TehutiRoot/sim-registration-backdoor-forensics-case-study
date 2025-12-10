package com.airbnb.lottie.parser.moshi;

import ch.qos.logback.core.joran.action.ActionConst;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.EOFException;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import okio.Buffer;
import okio.BufferedSource;
import okio.ByteString;
import org.apache.http.message.BasicHeaderValueFormatter;
import org.apache.http.message.TokenParser;

/* renamed from: com.airbnb.lottie.parser.moshi.a */
/* loaded from: classes3.dex */
public final class C5710a extends JsonReader {

    /* renamed from: n */
    public static final ByteString f41596n = ByteString.encodeUtf8("'\\");

    /* renamed from: o */
    public static final ByteString f41597o = ByteString.encodeUtf8(BasicHeaderValueFormatter.UNSAFE_CHARS);

    /* renamed from: p */
    public static final ByteString f41598p = ByteString.encodeUtf8("{}[]:, \n\t\r\f/\\;#=");

    /* renamed from: q */
    public static final ByteString f41599q = ByteString.encodeUtf8("\n\r");

    /* renamed from: r */
    public static final ByteString f41600r = ByteString.encodeUtf8("*/");

    /* renamed from: h */
    public final BufferedSource f41601h;

    /* renamed from: i */
    public final Buffer f41602i;

    /* renamed from: j */
    public int f41603j = 0;

    /* renamed from: k */
    public long f41604k;

    /* renamed from: l */
    public int f41605l;

    /* renamed from: m */
    public String f41606m;

    public C5710a(BufferedSource bufferedSource) {
        if (bufferedSource != null) {
            this.f41601h = bufferedSource;
            this.f41602i = bufferedSource.buffer();
            m50686d(6);
            return;
        }
        throw new NullPointerException("source == null");
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public void beginArray() {
        int i = this.f41603j;
        if (i == 0) {
            i = m50670k();
        }
        if (i == 3) {
            m50686d(1);
            this.f41569d[this.f41566a - 1] = 0;
            this.f41603j = 0;
            return;
        }
        throw new JsonDataException("Expected BEGIN_ARRAY but was " + peek() + " at path " + getPath());
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public void beginObject() {
        int i = this.f41603j;
        if (i == 0) {
            i = m50670k();
        }
        if (i == 1) {
            m50686d(3);
            this.f41603j = 0;
            return;
        }
        throw new JsonDataException("Expected BEGIN_OBJECT but was " + peek() + " at path " + getPath());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f41603j = 0;
        this.f41567b[0] = 8;
        this.f41566a = 1;
        this.f41602i.clear();
        this.f41601h.close();
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public void endArray() {
        int i = this.f41603j;
        if (i == 0) {
            i = m50670k();
        }
        if (i == 4) {
            int i2 = this.f41566a;
            this.f41566a = i2 - 1;
            int[] iArr = this.f41569d;
            int i3 = i2 - 2;
            iArr[i3] = iArr[i3] + 1;
            this.f41603j = 0;
            return;
        }
        throw new JsonDataException("Expected END_ARRAY but was " + peek() + " at path " + getPath());
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public void endObject() {
        int i = this.f41603j;
        if (i == 0) {
            i = m50670k();
        }
        if (i == 2) {
            int i2 = this.f41566a;
            int i3 = i2 - 1;
            this.f41566a = i3;
            this.f41568c[i3] = null;
            int[] iArr = this.f41569d;
            int i4 = i2 - 2;
            iArr[i4] = iArr[i4] + 1;
            this.f41603j = 0;
            return;
        }
        throw new JsonDataException("Expected END_OBJECT but was " + peek() + " at path " + getPath());
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public boolean hasNext() {
        int i = this.f41603j;
        if (i == 0) {
            i = m50670k();
        }
        if (i != 2 && i != 4 && i != 18) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public final void m50671j() {
        if (this.f41570e) {
            return;
        }
        throw m50684i("Use JsonReader.setLenient(true) to accept malformed JSON");
    }

    /* renamed from: k */
    public final int m50670k() {
        int[] iArr = this.f41567b;
        int i = this.f41566a;
        int i2 = iArr[i - 1];
        if (i2 == 1) {
            iArr[i - 1] = 2;
        } else if (i2 == 2) {
            int m50667n = m50667n(true);
            this.f41602i.readByte();
            if (m50667n != 44) {
                if (m50667n != 59) {
                    if (m50667n == 93) {
                        this.f41603j = 4;
                        return 4;
                    }
                    throw m50684i("Unterminated array");
                }
                m50671j();
            }
        } else if (i2 != 3 && i2 != 5) {
            if (i2 == 4) {
                iArr[i - 1] = 5;
                int m50667n2 = m50667n(true);
                this.f41602i.readByte();
                if (m50667n2 != 58) {
                    if (m50667n2 == 61) {
                        m50671j();
                        if (this.f41601h.request(1L) && this.f41602i.getByte(0L) == 62) {
                            this.f41602i.readByte();
                        }
                    } else {
                        throw m50684i("Expected ':'");
                    }
                }
            } else if (i2 == 6) {
                iArr[i - 1] = 7;
            } else if (i2 == 7) {
                if (m50667n(false) == -1) {
                    this.f41603j = 18;
                    return 18;
                }
                m50671j();
            } else if (i2 == 8) {
                throw new IllegalStateException("JsonReader is closed");
            }
        } else {
            iArr[i - 1] = 4;
            if (i2 == 5) {
                int m50667n3 = m50667n(true);
                this.f41602i.readByte();
                if (m50667n3 != 44) {
                    if (m50667n3 != 59) {
                        if (m50667n3 == 125) {
                            this.f41603j = 2;
                            return 2;
                        }
                        throw m50684i("Unterminated object");
                    }
                    m50671j();
                }
            }
            int m50667n4 = m50667n(true);
            if (m50667n4 != 34) {
                if (m50667n4 != 39) {
                    if (m50667n4 != 125) {
                        m50671j();
                        if (m50668m((char) m50667n4)) {
                            this.f41603j = 14;
                            return 14;
                        }
                        throw m50684i("Expected name");
                    } else if (i2 != 5) {
                        this.f41602i.readByte();
                        this.f41603j = 2;
                        return 2;
                    } else {
                        throw m50684i("Expected name");
                    }
                }
                this.f41602i.readByte();
                m50671j();
                this.f41603j = 12;
                return 12;
            }
            this.f41602i.readByte();
            this.f41603j = 13;
            return 13;
        }
        int m50667n5 = m50667n(true);
        if (m50667n5 != 34) {
            if (m50667n5 != 39) {
                if (m50667n5 != 44 && m50667n5 != 59) {
                    if (m50667n5 != 91) {
                        if (m50667n5 != 93) {
                            if (m50667n5 != 123) {
                                int m50664q = m50664q();
                                if (m50664q != 0) {
                                    return m50664q;
                                }
                                int m50663r = m50663r();
                                if (m50663r != 0) {
                                    return m50663r;
                                }
                                if (m50668m(this.f41602i.getByte(0L))) {
                                    m50671j();
                                    this.f41603j = 10;
                                    return 10;
                                }
                                throw m50684i("Expected value");
                            }
                            this.f41602i.readByte();
                            this.f41603j = 1;
                            return 1;
                        } else if (i2 == 1) {
                            this.f41602i.readByte();
                            this.f41603j = 4;
                            return 4;
                        }
                    } else {
                        this.f41602i.readByte();
                        this.f41603j = 3;
                        return 3;
                    }
                }
                if (i2 != 1 && i2 != 2) {
                    throw m50684i("Unexpected value");
                }
                m50671j();
                this.f41603j = 7;
                return 7;
            }
            m50671j();
            this.f41602i.readByte();
            this.f41603j = 8;
            return 8;
        }
        this.f41602i.readByte();
        this.f41603j = 9;
        return 9;
    }

    /* renamed from: l */
    public final int m50669l(String str, JsonReader.Options options) {
        int length = options.f41572a.length;
        for (int i = 0; i < length; i++) {
            if (str.equals(options.f41572a[i])) {
                this.f41603j = 0;
                this.f41568c[this.f41566a - 1] = str;
                return i;
            }
        }
        return -1;
    }

    /* renamed from: m */
    public final boolean m50668m(int i) {
        if (i != 9 && i != 10 && i != 12 && i != 13 && i != 32) {
            if (i != 35) {
                if (i != 44) {
                    if (i != 47 && i != 61) {
                        if (i != 123 && i != 125 && i != 58) {
                            if (i != 59) {
                                switch (i) {
                                    case 91:
                                    case 93:
                                        return false;
                                    case 92:
                                        break;
                                    default:
                                        return true;
                                }
                            }
                        } else {
                            return false;
                        }
                    }
                } else {
                    return false;
                }
            }
            m50671j();
            return false;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0025, code lost:
        r6.f41602i.skip(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002d, code lost:
        if (r2 != 47) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0037, code lost:
        if (r6.f41601h.request(2) != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0039, code lost:
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003a, code lost:
        m50671j();
        r3 = r6.f41602i.getByte(1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0047, code lost:
        if (r3 == 42) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0049, code lost:
        if (r3 == 47) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004b, code lost:
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004c, code lost:
        r6.f41602i.readByte();
        r6.f41602i.readByte();
        m50659v();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005a, code lost:
        r6.f41602i.readByte();
        r6.f41602i.readByte();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0068, code lost:
        if (m50660u() == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0071, code lost:
        throw m50684i("Unterminated comment");
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0074, code lost:
        if (r2 != 35) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0076, code lost:
        m50671j();
        m50659v();
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x007d, code lost:
        return r2;
     */
    /* renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int m50667n(boolean r7) {
        /*
            r6 = this;
            r0 = 0
        L1:
            r1 = 0
        L2:
            okio.BufferedSource r2 = r6.f41601h
            int r3 = r1 + 1
            long r4 = (long) r3
            boolean r2 = r2.request(r4)
            if (r2 == 0) goto L80
            okio.Buffer r2 = r6.f41602i
            long r4 = (long) r1
            byte r2 = r2.getByte(r4)
            r4 = 10
            if (r2 == r4) goto L7e
            r4 = 32
            if (r2 == r4) goto L7e
            r4 = 13
            if (r2 == r4) goto L7e
            r4 = 9
            if (r2 != r4) goto L25
            goto L7e
        L25:
            okio.Buffer r3 = r6.f41602i
            long r4 = (long) r1
            r3.skip(r4)
            r1 = 47
            if (r2 != r1) goto L72
            okio.BufferedSource r3 = r6.f41601h
            r4 = 2
            boolean r3 = r3.request(r4)
            if (r3 != 0) goto L3a
            return r2
        L3a:
            r6.m50671j()
            okio.Buffer r3 = r6.f41602i
            r4 = 1
            byte r3 = r3.getByte(r4)
            r4 = 42
            if (r3 == r4) goto L5a
            if (r3 == r1) goto L4c
            return r2
        L4c:
            okio.Buffer r1 = r6.f41602i
            r1.readByte()
            okio.Buffer r1 = r6.f41602i
            r1.readByte()
            r6.m50659v()
            goto L1
        L5a:
            okio.Buffer r1 = r6.f41602i
            r1.readByte()
            okio.Buffer r1 = r6.f41602i
            r1.readByte()
            boolean r1 = r6.m50660u()
            if (r1 == 0) goto L6b
            goto L1
        L6b:
            java.lang.String r7 = "Unterminated comment"
            com.airbnb.lottie.parser.moshi.JsonEncodingException r7 = r6.m50684i(r7)
            throw r7
        L72:
            r1 = 35
            if (r2 != r1) goto L7d
            r6.m50671j()
            r6.m50659v()
            goto L1
        L7d:
            return r2
        L7e:
            r1 = r3
            goto L2
        L80:
            if (r7 != 0) goto L84
            r7 = -1
            return r7
        L84:
            java.io.EOFException r7 = new java.io.EOFException
            java.lang.String r0 = "End of input"
            r7.<init>(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.parser.moshi.C5710a.m50667n(boolean):int");
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public boolean nextBoolean() {
        int i = this.f41603j;
        if (i == 0) {
            i = m50670k();
        }
        if (i == 5) {
            this.f41603j = 0;
            int[] iArr = this.f41569d;
            int i2 = this.f41566a - 1;
            iArr[i2] = iArr[i2] + 1;
            return true;
        } else if (i == 6) {
            this.f41603j = 0;
            int[] iArr2 = this.f41569d;
            int i3 = this.f41566a - 1;
            iArr2[i3] = iArr2[i3] + 1;
            return false;
        } else {
            throw new JsonDataException("Expected a boolean but was " + peek() + " at path " + getPath());
        }
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public double nextDouble() {
        int i = this.f41603j;
        if (i == 0) {
            i = m50670k();
        }
        if (i == 16) {
            this.f41603j = 0;
            int[] iArr = this.f41569d;
            int i2 = this.f41566a - 1;
            iArr[i2] = iArr[i2] + 1;
            return this.f41604k;
        }
        if (i == 17) {
            this.f41606m = this.f41602i.readUtf8(this.f41605l);
        } else if (i == 9) {
            this.f41606m = m50666o(f41597o);
        } else if (i == 8) {
            this.f41606m = m50666o(f41596n);
        } else if (i == 10) {
            this.f41606m = m50665p();
        } else if (i != 11) {
            throw new JsonDataException("Expected a double but was " + peek() + " at path " + getPath());
        }
        this.f41603j = 11;
        try {
            double parseDouble = Double.parseDouble(this.f41606m);
            if (!this.f41570e && (Double.isNaN(parseDouble) || Double.isInfinite(parseDouble))) {
                throw new JsonEncodingException("JSON forbids NaN and infinities: " + parseDouble + " at path " + getPath());
            }
            this.f41606m = null;
            this.f41603j = 0;
            int[] iArr2 = this.f41569d;
            int i3 = this.f41566a - 1;
            iArr2[i3] = iArr2[i3] + 1;
            return parseDouble;
        } catch (NumberFormatException unused) {
            throw new JsonDataException("Expected a double but was " + this.f41606m + " at path " + getPath());
        }
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public int nextInt() {
        String m50666o;
        int i = this.f41603j;
        if (i == 0) {
            i = m50670k();
        }
        if (i == 16) {
            long j = this.f41604k;
            int i2 = (int) j;
            if (j == i2) {
                this.f41603j = 0;
                int[] iArr = this.f41569d;
                int i3 = this.f41566a - 1;
                iArr[i3] = iArr[i3] + 1;
                return i2;
            }
            throw new JsonDataException("Expected an int but was " + this.f41604k + " at path " + getPath());
        }
        if (i == 17) {
            this.f41606m = this.f41602i.readUtf8(this.f41605l);
        } else if (i != 9 && i != 8) {
            if (i != 11) {
                throw new JsonDataException("Expected an int but was " + peek() + " at path " + getPath());
            }
        } else {
            if (i == 9) {
                m50666o = m50666o(f41597o);
            } else {
                m50666o = m50666o(f41596n);
            }
            this.f41606m = m50666o;
            try {
                int parseInt = Integer.parseInt(m50666o);
                this.f41603j = 0;
                int[] iArr2 = this.f41569d;
                int i4 = this.f41566a - 1;
                iArr2[i4] = iArr2[i4] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        }
        this.f41603j = 11;
        try {
            double parseDouble = Double.parseDouble(this.f41606m);
            int i5 = (int) parseDouble;
            if (i5 == parseDouble) {
                this.f41606m = null;
                this.f41603j = 0;
                int[] iArr3 = this.f41569d;
                int i6 = this.f41566a - 1;
                iArr3[i6] = iArr3[i6] + 1;
                return i5;
            }
            throw new JsonDataException("Expected an int but was " + this.f41606m + " at path " + getPath());
        } catch (NumberFormatException unused2) {
            throw new JsonDataException("Expected an int but was " + this.f41606m + " at path " + getPath());
        }
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public String nextName() {
        String str;
        int i = this.f41603j;
        if (i == 0) {
            i = m50670k();
        }
        if (i == 14) {
            str = m50665p();
        } else if (i == 13) {
            str = m50666o(f41597o);
        } else if (i == 12) {
            str = m50666o(f41596n);
        } else if (i == 15) {
            str = this.f41606m;
        } else {
            throw new JsonDataException("Expected a name but was " + peek() + " at path " + getPath());
        }
        this.f41603j = 0;
        this.f41568c[this.f41566a - 1] = str;
        return str;
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public String nextString() {
        String readUtf8;
        int i = this.f41603j;
        if (i == 0) {
            i = m50670k();
        }
        if (i == 10) {
            readUtf8 = m50665p();
        } else if (i == 9) {
            readUtf8 = m50666o(f41597o);
        } else if (i == 8) {
            readUtf8 = m50666o(f41596n);
        } else if (i == 11) {
            readUtf8 = this.f41606m;
            this.f41606m = null;
        } else if (i == 16) {
            readUtf8 = Long.toString(this.f41604k);
        } else if (i == 17) {
            readUtf8 = this.f41602i.readUtf8(this.f41605l);
        } else {
            throw new JsonDataException("Expected a string but was " + peek() + " at path " + getPath());
        }
        this.f41603j = 0;
        int[] iArr = this.f41569d;
        int i2 = this.f41566a - 1;
        iArr[i2] = iArr[i2] + 1;
        return readUtf8;
    }

    /* renamed from: o */
    public final String m50666o(ByteString byteString) {
        StringBuilder sb = null;
        while (true) {
            long indexOfElement = this.f41601h.indexOfElement(byteString);
            if (indexOfElement != -1) {
                if (this.f41602i.getByte(indexOfElement) == 92) {
                    if (sb == null) {
                        sb = new StringBuilder();
                    }
                    sb.append(this.f41602i.readUtf8(indexOfElement));
                    this.f41602i.readByte();
                    sb.append(m50662s());
                } else if (sb == null) {
                    String readUtf8 = this.f41602i.readUtf8(indexOfElement);
                    this.f41602i.readByte();
                    return readUtf8;
                } else {
                    sb.append(this.f41602i.readUtf8(indexOfElement));
                    this.f41602i.readByte();
                    return sb.toString();
                }
            } else {
                throw m50684i("Unterminated string");
            }
        }
    }

    /* renamed from: p */
    public final String m50665p() {
        long indexOfElement = this.f41601h.indexOfElement(f41598p);
        if (indexOfElement != -1) {
            return this.f41602i.readUtf8(indexOfElement);
        }
        return this.f41602i.readUtf8();
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public JsonReader.Token peek() {
        int i = this.f41603j;
        if (i == 0) {
            i = m50670k();
        }
        switch (i) {
            case 1:
                return JsonReader.Token.BEGIN_OBJECT;
            case 2:
                return JsonReader.Token.END_OBJECT;
            case 3:
                return JsonReader.Token.BEGIN_ARRAY;
            case 4:
                return JsonReader.Token.END_ARRAY;
            case 5:
            case 6:
                return JsonReader.Token.BOOLEAN;
            case 7:
                return JsonReader.Token.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return JsonReader.Token.STRING;
            case 12:
            case 13:
            case 14:
            case 15:
                return JsonReader.Token.NAME;
            case 16:
            case 17:
                return JsonReader.Token.NUMBER;
            case 18:
                return JsonReader.Token.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    /* renamed from: q */
    public final int m50664q() {
        String str;
        String str2;
        int i;
        byte b = this.f41602i.getByte(0L);
        if (b != 116 && b != 84) {
            if (b != 102 && b != 70) {
                if (b != 110 && b != 78) {
                    return 0;
                }
                str = AbstractJsonLexerKt.NULL;
                str2 = ActionConst.NULL;
                i = 7;
            } else {
                str = "false";
                str2 = "FALSE";
                i = 6;
            }
        } else {
            str = "true";
            str2 = "TRUE";
            i = 5;
        }
        int length = str.length();
        int i2 = 1;
        while (i2 < length) {
            int i3 = i2 + 1;
            if (!this.f41601h.request(i3)) {
                return 0;
            }
            byte b2 = this.f41602i.getByte(i2);
            if (b2 != str.charAt(i2) && b2 != str2.charAt(i2)) {
                return 0;
            }
            i2 = i3;
        }
        if (this.f41601h.request(length + 1) && m50668m(this.f41602i.getByte(length))) {
            return 0;
        }
        this.f41602i.skip(length);
        this.f41603j = i;
        return i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x0081, code lost:
        if (m50668m(r11) != false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0083, code lost:
        if (r6 != 2) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0085, code lost:
        if (r7 == false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x008b, code lost:
        if (r8 != Long.MIN_VALUE) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x008d, code lost:
        if (r10 == false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0091, code lost:
        if (r8 != 0) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0093, code lost:
        if (r10 != false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0095, code lost:
        if (r10 == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0098, code lost:
        r8 = -r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0099, code lost:
        r16.f41604k = r8;
        r16.f41602i.skip(r5);
        r16.f41603j = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00a5, code lost:
        return 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00a6, code lost:
        if (r6 == 2) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00a9, code lost:
        if (r6 == 4) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00ac, code lost:
        if (r6 != 7) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00af, code lost:
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00b0, code lost:
        r16.f41605l = r5;
        r16.f41603j = 17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00b6, code lost:
        return 17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00b7, code lost:
        return 0;
     */
    /* renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int m50663r() {
        /*
            Method dump skipped, instructions count: 221
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.parser.moshi.C5710a.m50663r():int");
    }

    /* renamed from: s */
    public final char m50662s() {
        int i;
        if (this.f41601h.request(1L)) {
            byte readByte = this.f41602i.readByte();
            if (readByte != 10 && readByte != 34 && readByte != 39 && readByte != 47 && readByte != 92) {
                if (readByte != 98) {
                    if (readByte != 102) {
                        if (readByte == 110) {
                            return '\n';
                        }
                        if (readByte != 114) {
                            if (readByte != 116) {
                                if (readByte != 117) {
                                    if (this.f41570e) {
                                        return (char) readByte;
                                    }
                                    throw m50684i("Invalid escape sequence: \\" + ((char) readByte));
                                } else if (this.f41601h.request(4L)) {
                                    char c = 0;
                                    for (int i2 = 0; i2 < 4; i2++) {
                                        byte b = this.f41602i.getByte(i2);
                                        char c2 = (char) (c << 4);
                                        if (b >= 48 && b <= 57) {
                                            i = b - 48;
                                        } else if (b >= 97 && b <= 102) {
                                            i = b - 87;
                                        } else if (b < 65 || b > 70) {
                                            throw m50684i("\\u" + this.f41602i.readUtf8(4L));
                                        } else {
                                            i = b - 55;
                                        }
                                        c = (char) (c2 + i);
                                    }
                                    this.f41602i.skip(4L);
                                    return c;
                                } else {
                                    throw new EOFException("Unterminated escape sequence at path " + getPath());
                                }
                            }
                            return '\t';
                        }
                        return TokenParser.f74641CR;
                    }
                    return '\f';
                }
                return '\b';
            }
            return (char) readByte;
        }
        throw m50684i("Unterminated escape sequence");
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public int selectName(JsonReader.Options options) {
        int i = this.f41603j;
        if (i == 0) {
            i = m50670k();
        }
        if (i < 12 || i > 15) {
            return -1;
        }
        if (i == 15) {
            return m50669l(this.f41606m, options);
        }
        int select = this.f41601h.select(options.f41573b);
        if (select != -1) {
            this.f41603j = 0;
            this.f41568c[this.f41566a - 1] = options.f41572a[select];
            return select;
        }
        String str = this.f41568c[this.f41566a - 1];
        String nextName = nextName();
        int m50669l = m50669l(nextName, options);
        if (m50669l == -1) {
            this.f41603j = 15;
            this.f41606m = nextName;
            this.f41568c[this.f41566a - 1] = str;
        }
        return m50669l;
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public void skipName() {
        if (!this.f41571f) {
            int i = this.f41603j;
            if (i == 0) {
                i = m50670k();
            }
            if (i == 14) {
                m50658w();
            } else if (i == 13) {
                m50661t(f41597o);
            } else if (i == 12) {
                m50661t(f41596n);
            } else if (i != 15) {
                throw new JsonDataException("Expected a name but was " + peek() + " at path " + getPath());
            }
            this.f41603j = 0;
            this.f41568c[this.f41566a - 1] = AbstractJsonLexerKt.NULL;
            return;
        }
        throw new JsonDataException("Cannot skip unexpected " + peek() + " at " + getPath());
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public void skipValue() {
        if (!this.f41571f) {
            int i = 0;
            do {
                int i2 = this.f41603j;
                if (i2 == 0) {
                    i2 = m50670k();
                }
                if (i2 == 3) {
                    m50686d(1);
                } else if (i2 == 1) {
                    m50686d(3);
                } else {
                    if (i2 == 4) {
                        i--;
                        if (i >= 0) {
                            this.f41566a--;
                        } else {
                            throw new JsonDataException("Expected a value but was " + peek() + " at path " + getPath());
                        }
                    } else if (i2 == 2) {
                        i--;
                        if (i >= 0) {
                            this.f41566a--;
                        } else {
                            throw new JsonDataException("Expected a value but was " + peek() + " at path " + getPath());
                        }
                    } else if (i2 != 14 && i2 != 10) {
                        if (i2 != 9 && i2 != 13) {
                            if (i2 != 8 && i2 != 12) {
                                if (i2 == 17) {
                                    this.f41602i.skip(this.f41605l);
                                } else if (i2 == 18) {
                                    throw new JsonDataException("Expected a value but was " + peek() + " at path " + getPath());
                                }
                            } else {
                                m50661t(f41596n);
                            }
                        } else {
                            m50661t(f41597o);
                        }
                    } else {
                        m50658w();
                    }
                    this.f41603j = 0;
                }
                i++;
                this.f41603j = 0;
            } while (i != 0);
            int[] iArr = this.f41569d;
            int i3 = this.f41566a;
            int i4 = i3 - 1;
            iArr[i4] = iArr[i4] + 1;
            this.f41568c[i3 - 1] = AbstractJsonLexerKt.NULL;
            return;
        }
        throw new JsonDataException("Cannot skip unexpected " + peek() + " at " + getPath());
    }

    /* renamed from: t */
    public final void m50661t(ByteString byteString) {
        while (true) {
            long indexOfElement = this.f41601h.indexOfElement(byteString);
            if (indexOfElement != -1) {
                if (this.f41602i.getByte(indexOfElement) == 92) {
                    this.f41602i.skip(indexOfElement + 1);
                    m50662s();
                } else {
                    this.f41602i.skip(indexOfElement + 1);
                    return;
                }
            } else {
                throw m50684i("Unterminated string");
            }
        }
    }

    public String toString() {
        return "JsonReader(" + this.f41601h + ")";
    }

    /* renamed from: u */
    public final boolean m50660u() {
        boolean z;
        long size;
        BufferedSource bufferedSource = this.f41601h;
        ByteString byteString = f41600r;
        long indexOf = bufferedSource.indexOf(byteString);
        if (indexOf != -1) {
            z = true;
        } else {
            z = false;
        }
        Buffer buffer = this.f41602i;
        if (z) {
            size = indexOf + byteString.size();
        } else {
            size = buffer.size();
        }
        buffer.skip(size);
        return z;
    }

    /* renamed from: v */
    public final void m50659v() {
        long size;
        long indexOfElement = this.f41601h.indexOfElement(f41599q);
        Buffer buffer = this.f41602i;
        if (indexOfElement != -1) {
            size = indexOfElement + 1;
        } else {
            size = buffer.size();
        }
        buffer.skip(size);
    }

    /* renamed from: w */
    public final void m50658w() {
        long indexOfElement = this.f41601h.indexOfElement(f41598p);
        Buffer buffer = this.f41602i;
        if (indexOfElement == -1) {
            indexOfElement = buffer.size();
        }
        buffer.skip(indexOfElement);
    }
}