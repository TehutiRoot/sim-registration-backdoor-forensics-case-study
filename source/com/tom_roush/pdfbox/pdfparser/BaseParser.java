package com.tom_roush.pdfbox.pdfparser;

import android.util.Log;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSBoolean;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSDocument;
import com.tom_roush.pdfbox.cos.COSInteger;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.cos.COSNull;
import com.tom_roush.pdfbox.cos.COSNumber;
import com.tom_roush.pdfbox.cos.COSObject;
import com.tom_roush.pdfbox.cos.COSObjectKey;
import com.tom_roush.pdfbox.util.Charsets;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import kotlin.text.Typography;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import okhttp3.internal.connection.RealConnection;
import okhttp3.internal.p026ws.WebSocketProtocol;
import org.bouncycastle.pqc.math.linearalgebra.Matrix;

/* loaded from: classes5.dex */
public abstract class BaseParser {

    /* renamed from: A */
    protected static final int f59987A = 97;
    protected static final byte ASCII_CR = 13;
    protected static final byte ASCII_LF = 10;

    /* renamed from: B */
    protected static final int f59988B = 98;

    /* renamed from: D */
    protected static final int f59989D = 100;
    public static final String DEF = "def";

    /* renamed from: E */
    protected static final int f59990E = 101;
    protected static final String ENDOBJ_STRING = "endobj";
    protected static final String ENDSTREAM_STRING = "endstream";

    /* renamed from: J */
    protected static final int f59991J = 106;

    /* renamed from: M */
    protected static final int f59992M = 109;

    /* renamed from: N */
    protected static final int f59993N = 110;

    /* renamed from: O */
    protected static final int f59994O = 111;

    /* renamed from: R */
    protected static final int f59995R = 114;

    /* renamed from: S */
    protected static final int f59996S = 115;
    protected static final String STREAM_STRING = "stream";

    /* renamed from: T */
    protected static final int f59997T = 116;

    /* renamed from: c */
    public static final int f59998c = Long.toString(Long.MAX_VALUE).length();

    /* renamed from: a */
    public final CharsetDecoder f59999a = Charsets.UTF_8.newDecoder();

    /* renamed from: b */
    public final KF1 f60000b;
    protected COSDocument document;

    public BaseParser(KF1 kf1) {
        this.f60000b = kf1;
    }

    /* renamed from: d */
    public static boolean m32696d(char c) {
        if (!isDigit(c) && ((c < f59987A || c > 'f') && (c < 'A' || c > 'F'))) {
            return false;
        }
        return true;
    }

    public static boolean isDigit(int i) {
        return i >= 48 && i <= 57;
    }

    /* renamed from: a */
    public final int m32699a(int i) {
        byte b;
        byte[] bArr = new byte[3];
        int read = this.f60000b.read(bArr);
        if (read == 3 && bArr[0] == 13 && (((b = bArr[1]) == 10 && bArr[2] == 47) || bArr[2] == 62 || b == 47 || b == 62)) {
            i = 0;
        }
        if (read > 0) {
            this.f60000b.mo66314f(bArr, 0, read);
        }
        return i;
    }

    /* renamed from: b */
    public final COSBase m32698b(COSObjectKey cOSObjectKey) {
        COSDocument cOSDocument = this.document;
        if (cOSDocument != null) {
            return cOSDocument.getObjectFromPool(cOSObjectKey);
        }
        throw new IOException("object reference " + cOSObjectKey + " at offset " + this.f60000b.getPosition() + " in content stream");
    }

    /* renamed from: c */
    public final boolean m32697c(int i) {
        return 13 == i;
    }

    /* renamed from: e */
    public final boolean m32695e(int i) {
        return 10 == i;
    }

    /* renamed from: f */
    public final boolean m32694f(byte[] bArr) {
        try {
            this.f59999a.decode(ByteBuffer.wrap(bArr));
            return true;
        } catch (CharacterCodingException unused) {
            return false;
        }
    }

    /* renamed from: g */
    public final boolean m32693g(COSDictionary cOSDictionary) {
        COSName parseCOSName = parseCOSName();
        COSBase m32692h = m32692h();
        skipSpaces();
        if (m32692h == null) {
            Log.w("PdfBox-Android", "Bad dictionary declaration at offset " + this.f60000b.getPosition());
            return false;
        }
        if ((m32692h instanceof COSInteger) && !((COSInteger) m32692h).isValid()) {
            Log.w("PdfBox-Android", "Skipped out of range number value at offset " + this.f60000b.getPosition());
        } else {
            m32692h.setDirect(true);
            cOSDictionary.setItem(parseCOSName, m32692h);
        }
        return true;
    }

    /* renamed from: h */
    public final COSBase m32692h() {
        long position = this.f60000b.getPosition();
        COSBase parseDirObject = parseDirObject();
        skipSpaces();
        if ((parseDirObject instanceof COSNumber) && isDigit()) {
            long position2 = this.f60000b.getPosition();
            COSBase parseDirObject2 = parseDirObject();
            skipSpaces();
            readExpectedChar(Matrix.MATRIX_TYPE_RANDOM_REGULAR);
            if (!(parseDirObject instanceof COSInteger)) {
                StringBuilder sb = new StringBuilder();
                sb.append("expected number, actual=");
                sb.append(parseDirObject);
                sb.append(" at offset ");
                sb.append(position);
                return COSNull.NULL;
            } else if (!(parseDirObject2 instanceof COSInteger)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("expected number, actual=");
                sb2.append(parseDirObject);
                sb2.append(" at offset ");
                sb2.append(position2);
                return COSNull.NULL;
            } else {
                return m32698b(new COSObjectKey(((COSInteger) parseDirObject).longValue(), ((COSInteger) parseDirObject2).intValue()));
            }
        }
        return parseDirObject;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x005d, code lost:
        return com.tom_roush.pdfbox.cos.COSString.parseHex(r0.toString());
     */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.tom_roush.pdfbox.cos.COSString m32691i() {
        /*
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
        L5:
            KF1 r1 = r5.f60000b
            int r1 = r1.read()
            char r2 = (char) r1
            boolean r3 = m32696d(r2)
            if (r3 == 0) goto L16
            r0.append(r2)
            goto L5
        L16:
            r2 = 62
            if (r1 != r2) goto L1b
            goto L55
        L1b:
            java.lang.String r3 = "Missing closing bracket for hex string. Reached EOS."
            if (r1 < 0) goto L64
            r4 = 32
            if (r1 == r4) goto L5
            r4 = 10
            if (r1 == r4) goto L5
            r4 = 9
            if (r1 == r4) goto L5
            r4 = 13
            if (r1 == r4) goto L5
            r4 = 8
            if (r1 == r4) goto L5
            r4 = 12
            if (r1 != r4) goto L38
            goto L5
        L38:
            int r1 = r0.length()
            int r1 = r1 % 2
            if (r1 == 0) goto L49
            int r1 = r0.length()
            int r1 = r1 + (-1)
            r0.deleteCharAt(r1)
        L49:
            KF1 r1 = r5.f60000b
            int r1 = r1.read()
            if (r1 == r2) goto L53
            if (r1 >= 0) goto L49
        L53:
            if (r1 < 0) goto L5e
        L55:
            java.lang.String r0 = r0.toString()
            com.tom_roush.pdfbox.cos.COSString r0 = com.tom_roush.pdfbox.cos.COSString.parseHex(r0)
            return r0
        L5e:
            java.io.IOException r0 = new java.io.IOException
            r0.<init>(r3)
            throw r0
        L64:
            java.io.IOException r0 = new java.io.IOException
            r0.<init>(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tom_roush.pdfbox.pdfparser.BaseParser.m32691i():com.tom_roush.pdfbox.cos.COSString");
    }

    public boolean isClosing(int i) {
        return i == 93;
    }

    public boolean isEOL() throws IOException {
        return isEOL(this.f60000b.peek());
    }

    public boolean isEndOfName(int i) {
        return i == 32 || i == 13 || i == 10 || i == 9 || i == 62 || i == 60 || i == 91 || i == 47 || i == 93 || i == 41 || i == 40 || i == 0 || i == 12 || i == 37;
    }

    public boolean isSpace(int i) {
        return 32 == i;
    }

    public boolean isWhitespace(int i) {
        return i == 0 || i == 9 || i == 12 || i == 10 || i == 13 || i == 32;
    }

    /* renamed from: j */
    public final COSNumber m32690j() {
        StringBuilder sb = new StringBuilder();
        int read = this.f60000b.read();
        while (true) {
            char c = (char) read;
            if (!Character.isDigit(c) && c != '-' && c != '+' && c != '.' && c != 'E' && c != 'e') {
                break;
            }
            sb.append(c);
            read = this.f60000b.read();
        }
        if (read != -1) {
            this.f60000b.mo66316a(read);
        }
        return COSNumber.get(sb.toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0087, code lost:
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0092, code lost:
        return true;
     */
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m32689k() {
        /*
            r6 = this;
            KF1 r0 = r6.f60000b
            int r0 = r0.read()
        L6:
            r1 = -1
            r2 = 0
            r3 = 1
            if (r0 == r1) goto L90
            r4 = 47
            if (r0 == r4) goto L90
            r4 = 62
            if (r0 == r4) goto L90
            r1 = 101(0x65, float:1.42E-43)
            if (r0 != r1) goto L88
            KF1 r0 = r6.f60000b
            int r0 = r0.read()
            r4 = 110(0x6e, float:1.54E-43)
            if (r0 != r4) goto L88
            KF1 r0 = r6.f60000b
            int r0 = r0.read()
            r4 = 100
            if (r0 != r4) goto L88
            KF1 r0 = r6.f60000b
            int r0 = r0.read()
            r4 = 115(0x73, float:1.61E-43)
            if (r0 != r4) goto L67
            KF1 r4 = r6.f60000b
            int r4 = r4.read()
            r5 = 116(0x74, float:1.63E-43)
            if (r4 != r5) goto L67
            KF1 r4 = r6.f60000b
            int r4 = r4.read()
            r5 = 114(0x72, float:1.6E-43)
            if (r4 != r5) goto L67
            KF1 r4 = r6.f60000b
            int r4 = r4.read()
            if (r4 != r1) goto L67
            KF1 r1 = r6.f60000b
            int r1 = r1.read()
            r4 = 97
            if (r1 != r4) goto L67
            KF1 r1 = r6.f60000b
            int r1 = r1.read()
            r4 = 109(0x6d, float:1.53E-43)
            if (r1 != r4) goto L67
            r1 = 1
            goto L68
        L67:
            r1 = 0
        L68:
            if (r1 != 0) goto L83
            r4 = 111(0x6f, float:1.56E-43)
            if (r0 != r4) goto L83
            KF1 r0 = r6.f60000b
            int r0 = r0.read()
            r4 = 98
            if (r0 != r4) goto L83
            KF1 r0 = r6.f60000b
            int r0 = r0.read()
            r4 = 106(0x6a, float:1.49E-43)
            if (r0 != r4) goto L83
            r2 = 1
        L83:
            if (r1 != 0) goto L87
            if (r2 == 0) goto L88
        L87:
            return r3
        L88:
            KF1 r0 = r6.f60000b
            int r0 = r0.read()
            goto L6
        L90:
            if (r0 != r1) goto L93
            return r3
        L93:
            KF1 r1 = r6.f60000b
            r1.mo66316a(r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tom_roush.pdfbox.pdfparser.BaseParser.m32689k():boolean");
    }

    public COSBoolean parseBoolean() throws IOException {
        char peek = (char) this.f60000b.peek();
        if (peek == f59997T) {
            String str = new String(this.f60000b.readFully(4), Charsets.ISO_8859_1);
            if (str.equals("true")) {
                return COSBoolean.TRUE;
            }
            throw new IOException("Error parsing boolean: expected='true' actual='" + str + "' at offset " + this.f60000b.getPosition());
        } else if (peek == 'f') {
            String str2 = new String(this.f60000b.readFully(5), Charsets.ISO_8859_1);
            if (str2.equals("false")) {
                return COSBoolean.FALSE;
            }
            throw new IOException("Error parsing boolean: expected='true' actual='" + str2 + "' at offset " + this.f60000b.getPosition());
        } else {
            throw new IOException("Error parsing boolean expected='t or f' actual='" + peek + "' at offset " + this.f60000b.getPosition());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00da, code lost:
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00db, code lost:
        r9.f60000b.read();
        skipSpaces();
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00e3, code lost:
        return r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.tom_roush.pdfbox.cos.COSArray parseCOSArray() throws java.io.IOException {
        /*
            r9 = this;
            KF1 r0 = r9.f60000b
            long r0 = r0.getPosition()
            r2 = 91
            r9.readExpectedChar(r2)
            com.tom_roush.pdfbox.cos.COSArray r3 = new com.tom_roush.pdfbox.cos.COSArray
            r3.<init>()
            r9.skipSpaces()
        L13:
            KF1 r4 = r9.f60000b
            int r4 = r4.peek()
            if (r4 <= 0) goto Ldb
            char r4 = (char) r4
            r5 = 93
            if (r4 == r5) goto Ldb
            com.tom_roush.pdfbox.cos.COSBase r4 = r9.parseDirObject()
            boolean r5 = r4 instanceof com.tom_roush.pdfbox.cos.COSObject
            if (r5 == 0) goto L7c
            int r4 = r3.size()
            r5 = 0
            if (r4 <= 0) goto L7b
            int r4 = r3.size()
            int r4 = r4 + (-1)
            com.tom_roush.pdfbox.cos.COSBase r4 = r3.get(r4)
            boolean r4 = r4 instanceof com.tom_roush.pdfbox.cos.COSInteger
            if (r4 == 0) goto L7b
            int r4 = r3.size()
            int r4 = r4 + (-1)
            com.tom_roush.pdfbox.cos.COSBase r4 = r3.remove(r4)
            com.tom_roush.pdfbox.cos.COSInteger r4 = (com.tom_roush.pdfbox.cos.COSInteger) r4
            int r6 = r3.size()
            if (r6 <= 0) goto L7b
            int r6 = r3.size()
            int r6 = r6 + (-1)
            com.tom_roush.pdfbox.cos.COSBase r6 = r3.get(r6)
            boolean r6 = r6 instanceof com.tom_roush.pdfbox.cos.COSInteger
            if (r6 == 0) goto L7b
            int r5 = r3.size()
            int r5 = r5 + (-1)
            com.tom_roush.pdfbox.cos.COSBase r5 = r3.remove(r5)
            com.tom_roush.pdfbox.cos.COSInteger r5 = (com.tom_roush.pdfbox.cos.COSInteger) r5
            com.tom_roush.pdfbox.cos.COSObjectKey r6 = new com.tom_roush.pdfbox.cos.COSObjectKey
            long r7 = r5.longValue()
            int r4 = r4.intValue()
            r6.<init>(r7, r4)
            com.tom_roush.pdfbox.cos.COSBase r4 = r9.m32698b(r6)
            goto L7c
        L7b:
            r4 = r5
        L7c:
            if (r4 == 0) goto L82
            r3.add(r4)
            goto Ld5
        L82:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Corrupt array element at offset "
            r4.append(r5)
            KF1 r5 = r9.f60000b
            long r5 = r5.getPosition()
            r4.append(r5)
            java.lang.String r5 = ", start offset: "
            r4.append(r5)
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            java.lang.String r5 = "PdfBox-Android"
            android.util.Log.w(r5, r4)
            java.lang.String r4 = r9.readString()
            boolean r5 = r4.isEmpty()
            if (r5 == 0) goto Lb9
            KF1 r5 = r9.f60000b
            int r5 = r5.peek()
            if (r5 != r2) goto Lb9
            return r3
        Lb9:
            KF1 r5 = r9.f60000b
            java.nio.charset.Charset r6 = com.tom_roush.pdfbox.util.Charsets.ISO_8859_1
            byte[] r6 = r4.getBytes(r6)
            r5.mo66315c(r6)
            java.lang.String r5 = "endobj"
            boolean r5 = r5.equals(r4)
            if (r5 != 0) goto Lda
            java.lang.String r5 = "endstream"
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto Ld5
            goto Lda
        Ld5:
            r9.skipSpaces()
            goto L13
        Lda:
            return r3
        Ldb:
            KF1 r0 = r9.f60000b
            r0.read()
            r9.skipSpaces()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tom_roush.pdfbox.pdfparser.BaseParser.parseCOSArray():com.tom_roush.pdfbox.cos.COSArray");
    }

    public COSDictionary parseCOSDictionary() throws IOException {
        readExpectedChar(Typography.less);
        readExpectedChar(Typography.less);
        skipSpaces();
        COSDictionary cOSDictionary = new COSDictionary();
        boolean z = false;
        while (!z) {
            skipSpaces();
            char peek = (char) this.f60000b.peek();
            if (peek == '>') {
                z = true;
            } else if (peek == '/') {
                if (!m32693g(cOSDictionary)) {
                    return cOSDictionary;
                }
            } else {
                Log.w("PdfBox-Android", "Invalid dictionary, found: '" + peek + "' but expected: '/' at offset " + this.f60000b.getPosition());
                if (m32689k()) {
                    return cOSDictionary;
                }
            }
        }
        readExpectedChar(Typography.greater);
        readExpectedChar(Typography.greater);
        return cOSDictionary;
    }

    public COSName parseCOSName() throws IOException {
        String str;
        char c;
        readExpectedChar('/');
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int read = this.f60000b.read();
        while (read != -1) {
            if (read == 35) {
                int read2 = this.f60000b.read();
                int read3 = this.f60000b.read();
                if (m32696d((char) read2)) {
                    char c2 = (char) read3;
                    if (m32696d(c2)) {
                        String str2 = Character.toString(c) + c2;
                        try {
                            byteArrayOutputStream.write(Integer.parseInt(str2, 16));
                            read2 = this.f60000b.read();
                            read = read2;
                        } catch (NumberFormatException e) {
                            throw new IOException("Error: expected hex digit, actual='" + str2 + OperatorName.SHOW_TEXT_LINE, e);
                        }
                    }
                }
                if (read3 != -1 && read2 != -1) {
                    this.f60000b.mo66316a(read3);
                    byteArrayOutputStream.write(read);
                    read = read2;
                } else {
                    read = -1;
                    break;
                }
            } else if (isEndOfName(read)) {
                break;
            } else {
                byteArrayOutputStream.write(read);
                read = this.f60000b.read();
            }
        }
        if (read != -1) {
            this.f60000b.mo66316a(read);
        }
        if (m32694f(byteArrayOutputStream.toByteArray())) {
            str = new String(byteArrayOutputStream.toByteArray(), Charsets.UTF_8);
        } else {
            str = new String(byteArrayOutputStream.toByteArray(), Charsets.WINDOWS_1252);
        }
        return COSName.getPDFName(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:81:0x0119 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0020 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.tom_roush.pdfbox.cos.COSString parseCOSString() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 364
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tom_roush.pdfbox.pdfparser.BaseParser.parseCOSString():com.tom_roush.pdfbox.cos.COSString");
    }

    public COSBase parseDirObject() throws IOException {
        skipSpaces();
        char peek = (char) this.f60000b.peek();
        if (peek != '(') {
            if (peek != '/') {
                if (peek != '<') {
                    if (peek != 'R') {
                        if (peek != '[') {
                            if (peek != 'f') {
                                if (peek != 'n') {
                                    if (peek != f59997T) {
                                        if (peek == 65535) {
                                            return null;
                                        }
                                        if (!Character.isDigit(peek) && peek != '-' && peek != '+' && peek != '.') {
                                            long position = this.f60000b.getPosition();
                                            String readString = readString();
                                            if (!readString.isEmpty()) {
                                                if (!ENDOBJ_STRING.equals(readString) && !ENDSTREAM_STRING.equals(readString)) {
                                                    Log.w("PdfBox-Android", "Skipped unexpected dir object = '" + readString + "' at offset " + this.f60000b.getPosition() + " (start offset: " + position + ")");
                                                } else {
                                                    this.f60000b.mo66315c(readString.getBytes(Charsets.ISO_8859_1));
                                                }
                                                return null;
                                            }
                                            int peek2 = this.f60000b.peek();
                                            throw new IOException("Unknown dir object c='" + peek + "' cInt=" + ((int) peek) + " peek='" + ((char) peek2) + "' peekInt=" + peek2 + " at offset " + this.f60000b.getPosition() + " (start offset: " + position + ")");
                                        }
                                        return m32690j();
                                    }
                                    String str = new String(this.f60000b.readFully(4), Charsets.ISO_8859_1);
                                    if (str.equals("true")) {
                                        return COSBoolean.TRUE;
                                    }
                                    throw new IOException("expected true actual='" + str + "' " + this.f60000b + "' at offset " + this.f60000b.getPosition());
                                }
                                readExpectedString(AbstractJsonLexerKt.NULL);
                                return COSNull.NULL;
                            }
                            String str2 = new String(this.f60000b.readFully(5), Charsets.ISO_8859_1);
                            if (str2.equals("false")) {
                                return COSBoolean.FALSE;
                            }
                            throw new IOException("expected false actual='" + str2 + "' " + this.f60000b + "' at offset " + this.f60000b.getPosition());
                        }
                        return parseCOSArray();
                    }
                    this.f60000b.read();
                    return new COSObject(null);
                }
                int read = this.f60000b.read();
                char peek3 = (char) this.f60000b.peek();
                this.f60000b.mo66316a(read);
                if (peek3 == '<') {
                    return parseCOSDictionary();
                }
                return parseCOSString();
            }
            return parseCOSName();
        }
        return parseCOSString();
    }

    public void readExpectedChar(char c) throws IOException {
        char read = (char) this.f60000b.read();
        if (read == c) {
            return;
        }
        throw new IOException("expected='" + c + "' actual='" + read + "' at offset " + this.f60000b.getPosition());
    }

    public void readExpectedString(String str) throws IOException {
        readExpectedString(str.toCharArray(), false);
    }

    public int readGenerationNumber() throws IOException {
        int readInt = readInt();
        if (readInt >= 0 && readInt <= WebSocketProtocol.PAYLOAD_SHORT_MAX) {
            return readInt;
        }
        throw new IOException("Generation Number '" + readInt + "' has more than 5 digits");
    }

    public int readInt() throws IOException {
        skipSpaces();
        StringBuilder readStringNumber = readStringNumber();
        try {
            return Integer.parseInt(readStringNumber.toString());
        } catch (NumberFormatException e) {
            this.f60000b.mo66315c(readStringNumber.toString().getBytes(Charsets.ISO_8859_1));
            throw new IOException("Error: Expected an integer type at offset " + this.f60000b.getPosition() + ", instead got '" + ((Object) readStringNumber) + OperatorName.SHOW_TEXT_LINE, e);
        }
    }

    public String readLine() throws IOException {
        int read;
        if (!this.f60000b.isEOF()) {
            StringBuilder sb = new StringBuilder(11);
            while (true) {
                read = this.f60000b.read();
                if (read == -1 || isEOL(read)) {
                    break;
                }
                sb.append((char) read);
            }
            if (m32697c(read) && m32695e(this.f60000b.peek())) {
                this.f60000b.read();
            }
            return sb.toString();
        }
        throw new IOException("Error: End-of-File, expected line");
    }

    public long readLong() throws IOException {
        skipSpaces();
        StringBuilder readStringNumber = readStringNumber();
        try {
            return Long.parseLong(readStringNumber.toString());
        } catch (NumberFormatException e) {
            this.f60000b.mo66315c(readStringNumber.toString().getBytes(Charsets.ISO_8859_1));
            throw new IOException("Error: Expected a long type at offset " + this.f60000b.getPosition() + ", instead got '" + ((Object) readStringNumber) + OperatorName.SHOW_TEXT_LINE, e);
        }
    }

    public long readObjectNumber() throws IOException {
        long readLong = readLong();
        if (readLong >= 0 && readLong < RealConnection.IDLE_CONNECTION_HEALTHY_NS) {
            return readLong;
        }
        throw new IOException("Object Number '" + readLong + "' has more than 10 digits or is negative");
    }

    public String readString() throws IOException {
        skipSpaces();
        StringBuilder sb = new StringBuilder();
        int read = this.f60000b.read();
        while (true) {
            char c = (char) read;
            if (isEndOfName(c) || read == -1) {
                break;
            }
            sb.append(c);
            read = this.f60000b.read();
        }
        if (read != -1) {
            this.f60000b.mo66316a(read);
        }
        return sb.toString();
    }

    public final StringBuilder readStringNumber() throws IOException {
        StringBuilder sb = new StringBuilder();
        do {
            int read = this.f60000b.read();
            if (read >= 48 && read <= 57) {
                sb.append((char) read);
            } else {
                if (read != -1) {
                    this.f60000b.mo66316a(read);
                }
                return sb;
            }
        } while (sb.length() <= f59998c);
        throw new IOException("Number '" + ((Object) sb) + "' is getting too long, stop reading at offset " + this.f60000b.getPosition());
    }

    public void skipSpaces() throws IOException {
        int read = this.f60000b.read();
        while (true) {
            if (!isWhitespace(read) && read != 37) {
                break;
            } else if (read == 37) {
                read = this.f60000b.read();
                while (!isEOL(read) && read != -1) {
                    read = this.f60000b.read();
                }
            } else {
                read = this.f60000b.read();
            }
        }
        if (read != -1) {
            this.f60000b.mo66316a(read);
        }
    }

    public void skipWhiteSpaces() throws IOException {
        int read = this.f60000b.read();
        while (32 == read) {
            read = this.f60000b.read();
        }
        if (13 == read) {
            int read2 = this.f60000b.read();
            if (10 != read2) {
                this.f60000b.mo66316a(read2);
            }
        } else if (10 != read) {
            this.f60000b.mo66316a(read);
        }
    }

    public boolean isClosing() throws IOException {
        return isClosing(this.f60000b.peek());
    }

    public boolean isDigit() throws IOException {
        return isDigit(this.f60000b.peek());
    }

    public boolean isEOL(int i) {
        return m32695e(i) || m32697c(i);
    }

    public boolean isSpace() throws IOException {
        return isSpace(this.f60000b.peek());
    }

    public boolean isWhitespace() throws IOException {
        return isWhitespace(this.f60000b.peek());
    }

    public final void readExpectedString(char[] cArr, boolean z) throws IOException {
        skipSpaces();
        for (char c : cArr) {
            if (this.f60000b.read() != c) {
                throw new IOException("Expected string '" + new String(cArr) + "' but missed at character '" + c + "' at offset " + this.f60000b.getPosition());
            }
        }
        skipSpaces();
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0040, code lost:
        r4.f60000b.mo66316a(r0);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String readString(int r5) throws java.io.IOException {
        /*
            r4 = this;
            r4.skipSpaces()
            KF1 r0 = r4.f60000b
            int r0 = r0.read()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r5)
        Le:
            boolean r2 = r4.isWhitespace(r0)
            r3 = -1
            if (r2 != 0) goto L3e
            boolean r2 = r4.isClosing(r0)
            if (r2 != 0) goto L3e
            if (r0 == r3) goto L3e
            int r2 = r1.length()
            if (r2 >= r5) goto L3e
            r2 = 91
            if (r0 == r2) goto L3e
            r2 = 60
            if (r0 == r2) goto L3e
            r2 = 40
            if (r0 == r2) goto L3e
            r2 = 47
            if (r0 == r2) goto L3e
            char r0 = (char) r0
            r1.append(r0)
            KF1 r0 = r4.f60000b
            int r0 = r0.read()
            goto Le
        L3e:
            if (r0 == r3) goto L45
            KF1 r5 = r4.f60000b
            r5.mo66316a(r0)
        L45:
            java.lang.String r5 = r1.toString()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tom_roush.pdfbox.pdfparser.BaseParser.readString(int):java.lang.String");
    }
}
