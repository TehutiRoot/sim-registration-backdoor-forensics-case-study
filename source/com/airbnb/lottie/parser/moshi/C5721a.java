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
public final class C5721a extends JsonReader {

    /* renamed from: n */
    public static final ByteString f41584n = ByteString.encodeUtf8("'\\");

    /* renamed from: o */
    public static final ByteString f41585o = ByteString.encodeUtf8(BasicHeaderValueFormatter.UNSAFE_CHARS);

    /* renamed from: p */
    public static final ByteString f41586p = ByteString.encodeUtf8("{}[]:, \n\t\r\f/\\;#=");

    /* renamed from: q */
    public static final ByteString f41587q = ByteString.encodeUtf8("\n\r");

    /* renamed from: r */
    public static final ByteString f41588r = ByteString.encodeUtf8("*/");

    /* renamed from: h */
    public final BufferedSource f41589h;

    /* renamed from: i */
    public final Buffer f41590i;

    /* renamed from: j */
    public int f41591j = 0;

    /* renamed from: k */
    public long f41592k;

    /* renamed from: l */
    public int f41593l;

    /* renamed from: m */
    public String f41594m;

    public C5721a(BufferedSource bufferedSource) {
        if (bufferedSource != null) {
            this.f41589h = bufferedSource;
            this.f41590i = bufferedSource.buffer();
            m50689d(6);
            return;
        }
        throw new NullPointerException("source == null");
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public void beginArray() {
        int i = this.f41591j;
        if (i == 0) {
            i = m50673k();
        }
        if (i == 3) {
            m50689d(1);
            this.f41557d[this.f41554a - 1] = 0;
            this.f41591j = 0;
            return;
        }
        throw new JsonDataException("Expected BEGIN_ARRAY but was " + peek() + " at path " + getPath());
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public void beginObject() {
        int i = this.f41591j;
        if (i == 0) {
            i = m50673k();
        }
        if (i == 1) {
            m50689d(3);
            this.f41591j = 0;
            return;
        }
        throw new JsonDataException("Expected BEGIN_OBJECT but was " + peek() + " at path " + getPath());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f41591j = 0;
        this.f41555b[0] = 8;
        this.f41554a = 1;
        this.f41590i.clear();
        this.f41589h.close();
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public void endArray() {
        int i = this.f41591j;
        if (i == 0) {
            i = m50673k();
        }
        if (i == 4) {
            int i2 = this.f41554a;
            this.f41554a = i2 - 1;
            int[] iArr = this.f41557d;
            int i3 = i2 - 2;
            iArr[i3] = iArr[i3] + 1;
            this.f41591j = 0;
            return;
        }
        throw new JsonDataException("Expected END_ARRAY but was " + peek() + " at path " + getPath());
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public void endObject() {
        int i = this.f41591j;
        if (i == 0) {
            i = m50673k();
        }
        if (i == 2) {
            int i2 = this.f41554a;
            int i3 = i2 - 1;
            this.f41554a = i3;
            this.f41556c[i3] = null;
            int[] iArr = this.f41557d;
            int i4 = i2 - 2;
            iArr[i4] = iArr[i4] + 1;
            this.f41591j = 0;
            return;
        }
        throw new JsonDataException("Expected END_OBJECT but was " + peek() + " at path " + getPath());
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public boolean hasNext() {
        int i = this.f41591j;
        if (i == 0) {
            i = m50673k();
        }
        if (i != 2 && i != 4 && i != 18) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public final void m50674j() {
        if (this.f41558e) {
            return;
        }
        throw m50687i("Use JsonReader.setLenient(true) to accept malformed JSON");
    }

    /* renamed from: k */
    public final int m50673k() {
        int[] iArr = this.f41555b;
        int i = this.f41554a;
        int i2 = iArr[i - 1];
        if (i2 == 1) {
            iArr[i - 1] = 2;
        } else if (i2 == 2) {
            int m50670n = m50670n(true);
            this.f41590i.readByte();
            if (m50670n != 44) {
                if (m50670n != 59) {
                    if (m50670n == 93) {
                        this.f41591j = 4;
                        return 4;
                    }
                    throw m50687i("Unterminated array");
                }
                m50674j();
            }
        } else if (i2 != 3 && i2 != 5) {
            if (i2 == 4) {
                iArr[i - 1] = 5;
                int m50670n2 = m50670n(true);
                this.f41590i.readByte();
                if (m50670n2 != 58) {
                    if (m50670n2 == 61) {
                        m50674j();
                        if (this.f41589h.request(1L) && this.f41590i.getByte(0L) == 62) {
                            this.f41590i.readByte();
                        }
                    } else {
                        throw m50687i("Expected ':'");
                    }
                }
            } else if (i2 == 6) {
                iArr[i - 1] = 7;
            } else if (i2 == 7) {
                if (m50670n(false) == -1) {
                    this.f41591j = 18;
                    return 18;
                }
                m50674j();
            } else if (i2 == 8) {
                throw new IllegalStateException("JsonReader is closed");
            }
        } else {
            iArr[i - 1] = 4;
            if (i2 == 5) {
                int m50670n3 = m50670n(true);
                this.f41590i.readByte();
                if (m50670n3 != 44) {
                    if (m50670n3 != 59) {
                        if (m50670n3 == 125) {
                            this.f41591j = 2;
                            return 2;
                        }
                        throw m50687i("Unterminated object");
                    }
                    m50674j();
                }
            }
            int m50670n4 = m50670n(true);
            if (m50670n4 != 34) {
                if (m50670n4 != 39) {
                    if (m50670n4 != 125) {
                        m50674j();
                        if (m50671m((char) m50670n4)) {
                            this.f41591j = 14;
                            return 14;
                        }
                        throw m50687i("Expected name");
                    } else if (i2 != 5) {
                        this.f41590i.readByte();
                        this.f41591j = 2;
                        return 2;
                    } else {
                        throw m50687i("Expected name");
                    }
                }
                this.f41590i.readByte();
                m50674j();
                this.f41591j = 12;
                return 12;
            }
            this.f41590i.readByte();
            this.f41591j = 13;
            return 13;
        }
        int m50670n5 = m50670n(true);
        if (m50670n5 != 34) {
            if (m50670n5 != 39) {
                if (m50670n5 != 44 && m50670n5 != 59) {
                    if (m50670n5 != 91) {
                        if (m50670n5 != 93) {
                            if (m50670n5 != 123) {
                                int m50667q = m50667q();
                                if (m50667q != 0) {
                                    return m50667q;
                                }
                                int m50666r = m50666r();
                                if (m50666r != 0) {
                                    return m50666r;
                                }
                                if (m50671m(this.f41590i.getByte(0L))) {
                                    m50674j();
                                    this.f41591j = 10;
                                    return 10;
                                }
                                throw m50687i("Expected value");
                            }
                            this.f41590i.readByte();
                            this.f41591j = 1;
                            return 1;
                        } else if (i2 == 1) {
                            this.f41590i.readByte();
                            this.f41591j = 4;
                            return 4;
                        }
                    } else {
                        this.f41590i.readByte();
                        this.f41591j = 3;
                        return 3;
                    }
                }
                if (i2 != 1 && i2 != 2) {
                    throw m50687i("Unexpected value");
                }
                m50674j();
                this.f41591j = 7;
                return 7;
            }
            m50674j();
            this.f41590i.readByte();
            this.f41591j = 8;
            return 8;
        }
        this.f41590i.readByte();
        this.f41591j = 9;
        return 9;
    }

    /* renamed from: l */
    public final int m50672l(String str, JsonReader.Options options) {
        int length = options.f41560a.length;
        for (int i = 0; i < length; i++) {
            if (str.equals(options.f41560a[i])) {
                this.f41591j = 0;
                this.f41556c[this.f41554a - 1] = str;
                return i;
            }
        }
        return -1;
    }

    /* renamed from: m */
    public final boolean m50671m(int i) {
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
            m50674j();
            return false;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0025, code lost:
        r6.f41590i.skip(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002d, code lost:
        if (r2 != 47) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0037, code lost:
        if (r6.f41589h.request(2) != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0039, code lost:
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003a, code lost:
        m50674j();
        r3 = r6.f41590i.getByte(1);
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
        r6.f41590i.readByte();
        r6.f41590i.readByte();
        m50662v();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005a, code lost:
        r6.f41590i.readByte();
        r6.f41590i.readByte();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0068, code lost:
        if (m50663u() == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0071, code lost:
        throw m50687i("Unterminated comment");
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0074, code lost:
        if (r2 != 35) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0076, code lost:
        m50674j();
        m50662v();
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x007d, code lost:
        return r2;
     */
    /* renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int m50670n(boolean r7) {
        /*
            r6 = this;
            r0 = 0
        L1:
            r1 = 0
        L2:
            okio.BufferedSource r2 = r6.f41589h
            int r3 = r1 + 1
            long r4 = (long) r3
            boolean r2 = r2.request(r4)
            if (r2 == 0) goto L80
            okio.Buffer r2 = r6.f41590i
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
            okio.Buffer r3 = r6.f41590i
            long r4 = (long) r1
            r3.skip(r4)
            r1 = 47
            if (r2 != r1) goto L72
            okio.BufferedSource r3 = r6.f41589h
            r4 = 2
            boolean r3 = r3.request(r4)
            if (r3 != 0) goto L3a
            return r2
        L3a:
            r6.m50674j()
            okio.Buffer r3 = r6.f41590i
            r4 = 1
            byte r3 = r3.getByte(r4)
            r4 = 42
            if (r3 == r4) goto L5a
            if (r3 == r1) goto L4c
            return r2
        L4c:
            okio.Buffer r1 = r6.f41590i
            r1.readByte()
            okio.Buffer r1 = r6.f41590i
            r1.readByte()
            r6.m50662v()
            goto L1
        L5a:
            okio.Buffer r1 = r6.f41590i
            r1.readByte()
            okio.Buffer r1 = r6.f41590i
            r1.readByte()
            boolean r1 = r6.m50663u()
            if (r1 == 0) goto L6b
            goto L1
        L6b:
            java.lang.String r7 = "Unterminated comment"
            com.airbnb.lottie.parser.moshi.JsonEncodingException r7 = r6.m50687i(r7)
            throw r7
        L72:
            r1 = 35
            if (r2 != r1) goto L7d
            r6.m50674j()
            r6.m50662v()
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
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.parser.moshi.C5721a.m50670n(boolean):int");
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public boolean nextBoolean() {
        int i = this.f41591j;
        if (i == 0) {
            i = m50673k();
        }
        if (i == 5) {
            this.f41591j = 0;
            int[] iArr = this.f41557d;
            int i2 = this.f41554a - 1;
            iArr[i2] = iArr[i2] + 1;
            return true;
        } else if (i == 6) {
            this.f41591j = 0;
            int[] iArr2 = this.f41557d;
            int i3 = this.f41554a - 1;
            iArr2[i3] = iArr2[i3] + 1;
            return false;
        } else {
            throw new JsonDataException("Expected a boolean but was " + peek() + " at path " + getPath());
        }
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public double nextDouble() {
        int i = this.f41591j;
        if (i == 0) {
            i = m50673k();
        }
        if (i == 16) {
            this.f41591j = 0;
            int[] iArr = this.f41557d;
            int i2 = this.f41554a - 1;
            iArr[i2] = iArr[i2] + 1;
            return this.f41592k;
        }
        if (i == 17) {
            this.f41594m = this.f41590i.readUtf8(this.f41593l);
        } else if (i == 9) {
            this.f41594m = m50669o(f41585o);
        } else if (i == 8) {
            this.f41594m = m50669o(f41584n);
        } else if (i == 10) {
            this.f41594m = m50668p();
        } else if (i != 11) {
            throw new JsonDataException("Expected a double but was " + peek() + " at path " + getPath());
        }
        this.f41591j = 11;
        try {
            double parseDouble = Double.parseDouble(this.f41594m);
            if (!this.f41558e && (Double.isNaN(parseDouble) || Double.isInfinite(parseDouble))) {
                throw new JsonEncodingException("JSON forbids NaN and infinities: " + parseDouble + " at path " + getPath());
            }
            this.f41594m = null;
            this.f41591j = 0;
            int[] iArr2 = this.f41557d;
            int i3 = this.f41554a - 1;
            iArr2[i3] = iArr2[i3] + 1;
            return parseDouble;
        } catch (NumberFormatException unused) {
            throw new JsonDataException("Expected a double but was " + this.f41594m + " at path " + getPath());
        }
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public int nextInt() {
        String m50669o;
        int i = this.f41591j;
        if (i == 0) {
            i = m50673k();
        }
        if (i == 16) {
            long j = this.f41592k;
            int i2 = (int) j;
            if (j == i2) {
                this.f41591j = 0;
                int[] iArr = this.f41557d;
                int i3 = this.f41554a - 1;
                iArr[i3] = iArr[i3] + 1;
                return i2;
            }
            throw new JsonDataException("Expected an int but was " + this.f41592k + " at path " + getPath());
        }
        if (i == 17) {
            this.f41594m = this.f41590i.readUtf8(this.f41593l);
        } else if (i != 9 && i != 8) {
            if (i != 11) {
                throw new JsonDataException("Expected an int but was " + peek() + " at path " + getPath());
            }
        } else {
            if (i == 9) {
                m50669o = m50669o(f41585o);
            } else {
                m50669o = m50669o(f41584n);
            }
            this.f41594m = m50669o;
            try {
                int parseInt = Integer.parseInt(m50669o);
                this.f41591j = 0;
                int[] iArr2 = this.f41557d;
                int i4 = this.f41554a - 1;
                iArr2[i4] = iArr2[i4] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        }
        this.f41591j = 11;
        try {
            double parseDouble = Double.parseDouble(this.f41594m);
            int i5 = (int) parseDouble;
            if (i5 == parseDouble) {
                this.f41594m = null;
                this.f41591j = 0;
                int[] iArr3 = this.f41557d;
                int i6 = this.f41554a - 1;
                iArr3[i6] = iArr3[i6] + 1;
                return i5;
            }
            throw new JsonDataException("Expected an int but was " + this.f41594m + " at path " + getPath());
        } catch (NumberFormatException unused2) {
            throw new JsonDataException("Expected an int but was " + this.f41594m + " at path " + getPath());
        }
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public String nextName() {
        String str;
        int i = this.f41591j;
        if (i == 0) {
            i = m50673k();
        }
        if (i == 14) {
            str = m50668p();
        } else if (i == 13) {
            str = m50669o(f41585o);
        } else if (i == 12) {
            str = m50669o(f41584n);
        } else if (i == 15) {
            str = this.f41594m;
        } else {
            throw new JsonDataException("Expected a name but was " + peek() + " at path " + getPath());
        }
        this.f41591j = 0;
        this.f41556c[this.f41554a - 1] = str;
        return str;
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public String nextString() {
        String readUtf8;
        int i = this.f41591j;
        if (i == 0) {
            i = m50673k();
        }
        if (i == 10) {
            readUtf8 = m50668p();
        } else if (i == 9) {
            readUtf8 = m50669o(f41585o);
        } else if (i == 8) {
            readUtf8 = m50669o(f41584n);
        } else if (i == 11) {
            readUtf8 = this.f41594m;
            this.f41594m = null;
        } else if (i == 16) {
            readUtf8 = Long.toString(this.f41592k);
        } else if (i == 17) {
            readUtf8 = this.f41590i.readUtf8(this.f41593l);
        } else {
            throw new JsonDataException("Expected a string but was " + peek() + " at path " + getPath());
        }
        this.f41591j = 0;
        int[] iArr = this.f41557d;
        int i2 = this.f41554a - 1;
        iArr[i2] = iArr[i2] + 1;
        return readUtf8;
    }

    /* renamed from: o */
    public final String m50669o(ByteString byteString) {
        StringBuilder sb = null;
        while (true) {
            long indexOfElement = this.f41589h.indexOfElement(byteString);
            if (indexOfElement != -1) {
                if (this.f41590i.getByte(indexOfElement) == 92) {
                    if (sb == null) {
                        sb = new StringBuilder();
                    }
                    sb.append(this.f41590i.readUtf8(indexOfElement));
                    this.f41590i.readByte();
                    sb.append(m50665s());
                } else if (sb == null) {
                    String readUtf8 = this.f41590i.readUtf8(indexOfElement);
                    this.f41590i.readByte();
                    return readUtf8;
                } else {
                    sb.append(this.f41590i.readUtf8(indexOfElement));
                    this.f41590i.readByte();
                    return sb.toString();
                }
            } else {
                throw m50687i("Unterminated string");
            }
        }
    }

    /* renamed from: p */
    public final String m50668p() {
        long indexOfElement = this.f41589h.indexOfElement(f41586p);
        if (indexOfElement != -1) {
            return this.f41590i.readUtf8(indexOfElement);
        }
        return this.f41590i.readUtf8();
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public JsonReader.Token peek() {
        int i = this.f41591j;
        if (i == 0) {
            i = m50673k();
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
    public final int m50667q() {
        String str;
        String str2;
        int i;
        byte b = this.f41590i.getByte(0L);
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
            if (!this.f41589h.request(i3)) {
                return 0;
            }
            byte b2 = this.f41590i.getByte(i2);
            if (b2 != str.charAt(i2) && b2 != str2.charAt(i2)) {
                return 0;
            }
            i2 = i3;
        }
        if (this.f41589h.request(length + 1) && m50671m(this.f41590i.getByte(length))) {
            return 0;
        }
        this.f41590i.skip(length);
        this.f41591j = i;
        return i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x0081, code lost:
        if (m50671m(r11) != false) goto L71;
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
        r16.f41592k = r8;
        r16.f41590i.skip(r5);
        r16.f41591j = 16;
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
        r16.f41593l = r5;
        r16.f41591j = 17;
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
    public final int m50666r() {
        /*
            Method dump skipped, instructions count: 221
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.parser.moshi.C5721a.m50666r():int");
    }

    /* renamed from: s */
    public final char m50665s() {
        int i;
        if (this.f41589h.request(1L)) {
            byte readByte = this.f41590i.readByte();
            if (readByte != 10 && readByte != 34 && readByte != 39 && readByte != 47 && readByte != 92) {
                if (readByte != 98) {
                    if (readByte != 102) {
                        if (readByte == 110) {
                            return '\n';
                        }
                        if (readByte != 114) {
                            if (readByte != 116) {
                                if (readByte != 117) {
                                    if (this.f41558e) {
                                        return (char) readByte;
                                    }
                                    throw m50687i("Invalid escape sequence: \\" + ((char) readByte));
                                } else if (this.f41589h.request(4L)) {
                                    char c = 0;
                                    for (int i2 = 0; i2 < 4; i2++) {
                                        byte b = this.f41590i.getByte(i2);
                                        char c2 = (char) (c << 4);
                                        if (b >= 48 && b <= 57) {
                                            i = b - 48;
                                        } else if (b >= 97 && b <= 102) {
                                            i = b - 87;
                                        } else if (b < 65 || b > 70) {
                                            throw m50687i("\\u" + this.f41590i.readUtf8(4L));
                                        } else {
                                            i = b - 55;
                                        }
                                        c = (char) (c2 + i);
                                    }
                                    this.f41590i.skip(4L);
                                    return c;
                                } else {
                                    throw new EOFException("Unterminated escape sequence at path " + getPath());
                                }
                            }
                            return '\t';
                        }
                        return TokenParser.f74557CR;
                    }
                    return '\f';
                }
                return '\b';
            }
            return (char) readByte;
        }
        throw m50687i("Unterminated escape sequence");
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public int selectName(JsonReader.Options options) {
        int i = this.f41591j;
        if (i == 0) {
            i = m50673k();
        }
        if (i < 12 || i > 15) {
            return -1;
        }
        if (i == 15) {
            return m50672l(this.f41594m, options);
        }
        int select = this.f41589h.select(options.f41561b);
        if (select != -1) {
            this.f41591j = 0;
            this.f41556c[this.f41554a - 1] = options.f41560a[select];
            return select;
        }
        String str = this.f41556c[this.f41554a - 1];
        String nextName = nextName();
        int m50672l = m50672l(nextName, options);
        if (m50672l == -1) {
            this.f41591j = 15;
            this.f41594m = nextName;
            this.f41556c[this.f41554a - 1] = str;
        }
        return m50672l;
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public void skipName() {
        if (!this.f41559f) {
            int i = this.f41591j;
            if (i == 0) {
                i = m50673k();
            }
            if (i == 14) {
                m50661w();
            } else if (i == 13) {
                m50664t(f41585o);
            } else if (i == 12) {
                m50664t(f41584n);
            } else if (i != 15) {
                throw new JsonDataException("Expected a name but was " + peek() + " at path " + getPath());
            }
            this.f41591j = 0;
            this.f41556c[this.f41554a - 1] = AbstractJsonLexerKt.NULL;
            return;
        }
        throw new JsonDataException("Cannot skip unexpected " + peek() + " at " + getPath());
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public void skipValue() {
        if (!this.f41559f) {
            int i = 0;
            do {
                int i2 = this.f41591j;
                if (i2 == 0) {
                    i2 = m50673k();
                }
                if (i2 == 3) {
                    m50689d(1);
                } else if (i2 == 1) {
                    m50689d(3);
                } else {
                    if (i2 == 4) {
                        i--;
                        if (i >= 0) {
                            this.f41554a--;
                        } else {
                            throw new JsonDataException("Expected a value but was " + peek() + " at path " + getPath());
                        }
                    } else if (i2 == 2) {
                        i--;
                        if (i >= 0) {
                            this.f41554a--;
                        } else {
                            throw new JsonDataException("Expected a value but was " + peek() + " at path " + getPath());
                        }
                    } else if (i2 != 14 && i2 != 10) {
                        if (i2 != 9 && i2 != 13) {
                            if (i2 != 8 && i2 != 12) {
                                if (i2 == 17) {
                                    this.f41590i.skip(this.f41593l);
                                } else if (i2 == 18) {
                                    throw new JsonDataException("Expected a value but was " + peek() + " at path " + getPath());
                                }
                            } else {
                                m50664t(f41584n);
                            }
                        } else {
                            m50664t(f41585o);
                        }
                    } else {
                        m50661w();
                    }
                    this.f41591j = 0;
                }
                i++;
                this.f41591j = 0;
            } while (i != 0);
            int[] iArr = this.f41557d;
            int i3 = this.f41554a;
            int i4 = i3 - 1;
            iArr[i4] = iArr[i4] + 1;
            this.f41556c[i3 - 1] = AbstractJsonLexerKt.NULL;
            return;
        }
        throw new JsonDataException("Cannot skip unexpected " + peek() + " at " + getPath());
    }

    /* renamed from: t */
    public final void m50664t(ByteString byteString) {
        while (true) {
            long indexOfElement = this.f41589h.indexOfElement(byteString);
            if (indexOfElement != -1) {
                if (this.f41590i.getByte(indexOfElement) == 92) {
                    this.f41590i.skip(indexOfElement + 1);
                    m50665s();
                } else {
                    this.f41590i.skip(indexOfElement + 1);
                    return;
                }
            } else {
                throw m50687i("Unterminated string");
            }
        }
    }

    public String toString() {
        return "JsonReader(" + this.f41589h + ")";
    }

    /* renamed from: u */
    public final boolean m50663u() {
        boolean z;
        long size;
        BufferedSource bufferedSource = this.f41589h;
        ByteString byteString = f41588r;
        long indexOf = bufferedSource.indexOf(byteString);
        if (indexOf != -1) {
            z = true;
        } else {
            z = false;
        }
        Buffer buffer = this.f41590i;
        if (z) {
            size = indexOf + byteString.size();
        } else {
            size = buffer.size();
        }
        buffer.skip(size);
        return z;
    }

    /* renamed from: v */
    public final void m50662v() {
        long size;
        long indexOfElement = this.f41589h.indexOfElement(f41587q);
        Buffer buffer = this.f41590i;
        if (indexOfElement != -1) {
            size = indexOfElement + 1;
        } else {
            size = buffer.size();
        }
        buffer.skip(size);
    }

    /* renamed from: w */
    public final void m50661w() {
        long indexOfElement = this.f41589h.indexOfElement(f41586p);
        Buffer buffer = this.f41590i;
        if (indexOfElement == -1) {
            indexOfElement = buffer.size();
        }
        buffer.skip(indexOfElement);
    }
}
