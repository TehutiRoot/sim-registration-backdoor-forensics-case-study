package org.apache.commons.p028io.input;

import com.google.android.gms.common.internal.ImagesContract;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.text.MessageFormat;
import java.util.Locale;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.commons.p028io.ByteOrderMark;
import org.apache.commons.p028io.Charsets;
import org.apache.commons.p028io.build.AbstractStreamBuilder;
import org.apache.commons.p028io.input.BOMInputStream;
import org.apache.http.message.TokenParser;

/* renamed from: org.apache.commons.io.input.XmlStreamReader */
/* loaded from: classes6.dex */
public class XmlStreamReader extends Reader {
    public static final Pattern ENCODING_PATTERN;

    /* renamed from: d */
    public static final String f73509d;

    /* renamed from: e */
    public static final String f73510e;

    /* renamed from: f */
    public static final String f73511f;

    /* renamed from: g */
    public static final String f73512g;

    /* renamed from: h */
    public static final String f73513h;

    /* renamed from: i */
    public static final ByteOrderMark[] f73514i;

    /* renamed from: j */
    public static final ByteOrderMark[] f73515j;

    /* renamed from: k */
    public static final Pattern f73516k;

    /* renamed from: a */
    public final Reader f73517a;

    /* renamed from: b */
    public final String f73518b;

    /* renamed from: c */
    public final String f73519c;

    /* renamed from: org.apache.commons.io.input.XmlStreamReader$Builder */
    /* loaded from: classes6.dex */
    public static class Builder extends AbstractStreamBuilder<XmlStreamReader, Builder> {

        /* renamed from: k */
        public boolean f73520k = true;

        /* renamed from: l */
        public boolean f73521l = true;

        /* renamed from: m */
        public String f73522m;

        public Builder setHttpContentType(String str) {
            this.f73522m = str;
            return this;
        }

        public Builder setLenient(boolean z) {
            this.f73521l = z;
            return this;
        }

        @Override // org.apache.commons.p028io.function.IOSupplier
        public XmlStreamReader get() throws IOException {
            String name = this.f73520k ? null : getCharset().name();
            if (this.f73522m == null) {
                return new XmlStreamReader(getInputStream(), this.f73521l, name);
            }
            return new XmlStreamReader(getInputStream(), this.f73522m, this.f73521l, name);
        }

        @Override // org.apache.commons.p028io.build.AbstractStreamBuilder
        public Builder setCharset(Charset charset) {
            this.f73520k = charset == null;
            return (Builder) super.setCharset(charset);
        }

        @Override // org.apache.commons.p028io.build.AbstractStreamBuilder
        public Builder setCharset(String str) {
            this.f73520k = str == null;
            return (Builder) super.setCharset(Charsets.toCharset(str, getCharsetDefault()));
        }
    }

    static {
        String name = StandardCharsets.UTF_8.name();
        f73509d = name;
        f73510e = StandardCharsets.US_ASCII.name();
        String name2 = StandardCharsets.UTF_16BE.name();
        f73511f = name2;
        String name3 = StandardCharsets.UTF_16LE.name();
        f73512g = name3;
        f73513h = StandardCharsets.UTF_16.name();
        f73514i = new ByteOrderMark[]{ByteOrderMark.UTF_8, ByteOrderMark.UTF_16BE, ByteOrderMark.UTF_16LE, ByteOrderMark.UTF_32BE, ByteOrderMark.UTF_32LE};
        f73515j = new ByteOrderMark[]{new ByteOrderMark(name, 60, 63, 120, 109), new ByteOrderMark(name2, 0, 60, 0, 63), new ByteOrderMark(name3, 60, 0, 63, 0), new ByteOrderMark("UTF-32BE", 0, 0, 0, 60, 0, 0, 0, 63, 0, 0, 0, 120, 0, 0, 0, 109), new ByteOrderMark("UTF-32LE", 60, 0, 0, 0, 63, 0, 0, 0, 120, 0, 0, 0, 109, 0, 0, 0), new ByteOrderMark("CP1047", 76, 111, 167, 148)};
        f73516k = Pattern.compile("charset=[\"']?([.[^; \"']]*)[\"']?");
        ENCODING_PATTERN = Pattern.compile("^<\\?xml\\s+(?:version\\s*=\\s*(?:(?:\"1\\.[0-9]+\")|(?:'1.[0-9]+'))\\s+)??encoding\\s*=\\s*((?:\"[A-Za-z0-9][A-Za-z0-9._+:-]*\")|(?:'[A-Za-z0-9][A-Za-z0-9._+:-]*'))", 8);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @java.lang.Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public XmlStreamReader(java.io.File r2) throws java.io.IOException {
        /*
            r1 = this;
            java.lang.String r0 = "file"
            java.util.Objects.requireNonNull(r2, r0)
            java.nio.file.Path r2 = p000.AbstractC19496dG1.m31913a(r2)
            r1.<init>(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.p028io.input.XmlStreamReader.<init>(java.io.File):void");
    }

    /* renamed from: b */
    public static /* synthetic */ void m24978b(StringBuilder sb, String str) {
        m24969o(sb, str);
    }

    public static Builder builder() {
        return new Builder();
    }

    /* renamed from: j */
    public static String m24974j(String str) {
        int indexOf;
        String str2;
        if (str == null || (indexOf = str.indexOf(";")) <= -1) {
            return null;
        }
        Matcher matcher = f73516k.matcher(str.substring(indexOf + 1));
        if (matcher.find()) {
            str2 = matcher.group(1);
        } else {
            str2 = null;
        }
        if (str2 == null) {
            return null;
        }
        return str2.toUpperCase(Locale.ROOT);
    }

    /* renamed from: k */
    public static String m24973k(String str) {
        if (str != null) {
            int indexOf = str.indexOf(";");
            if (indexOf >= 0) {
                str = str.substring(0, indexOf);
            }
            return str.trim();
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0031, code lost:
        if (r3 != (-1)) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x003a, code lost:
        throw new java.io.IOException("Unexpected end of XML stream");
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0056, code lost:
        throw new java.io.IOException("XML prolog or ROOT element not found on first " + r7 + " bytes");
     */
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String m24972l(java.io.InputStream r9, java.lang.String r10) {
        /*
            if (r10 == 0) goto L9d
            byte[] r0 = org.apache.commons.p028io.IOUtils.byteArray()
            r1 = 8192(0x2000, float:1.14794E-41)
            r9.mark(r1)
            r2 = 0
            int r3 = r9.read(r0, r2, r1)
            r4 = -1
            java.lang.String r5 = ""
            r6 = -1
            r7 = 0
            r8 = 8192(0x2000, float:1.14794E-41)
        L17:
            if (r3 == r4) goto L2f
            if (r6 != r4) goto L2f
            if (r7 >= r1) goto L2f
            int r7 = r7 + r3
            int r8 = r8 - r3
            int r3 = r9.read(r0, r7, r8)
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2, r7, r10)
            r6 = 62
            int r6 = r5.indexOf(r6)
            goto L17
        L2f:
            if (r6 != r4) goto L57
            if (r3 != r4) goto L3b
            java.io.IOException r9 = new java.io.IOException
            java.lang.String r10 = "Unexpected end of XML stream"
            r9.<init>(r10)
            throw r9
        L3b:
            java.io.IOException r9 = new java.io.IOException
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r0 = "XML prolog or ROOT element not found on first "
            r10.append(r0)
            r10.append(r7)
            java.lang.String r0 = " bytes"
            r10.append(r0)
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        L57:
            if (r7 <= 0) goto L9d
            r9.reset()
            java.io.BufferedReader r9 = new java.io.BufferedReader
            java.io.StringReader r10 = new java.io.StringReader
            r0 = 1
            int r6 = r6 + r0
            java.lang.String r1 = r5.substring(r2, r6)
            r10.<init>(r1)
            r9.<init>(r10)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.util.stream.Stream r9 = p000.AbstractC18288Qb0.m66552a(r9)
            H62 r1 = new H62
            r1.<init>()
            p000.Q90.m66646i(r9, r1)
            java.util.regex.Pattern r9 = org.apache.commons.p028io.input.XmlStreamReader.ENCODING_PATTERN
            java.util.regex.Matcher r9 = r9.matcher(r10)
            boolean r10 = r9.find()
            if (r10 == 0) goto L9d
            java.lang.String r9 = r9.group(r0)
            java.util.Locale r10 = java.util.Locale.ROOT
            java.lang.String r9 = r9.toUpperCase(r10)
            int r10 = r9.length()
            int r10 = r10 - r0
            java.lang.String r9 = r9.substring(r0, r10)
            goto L9e
        L9d:
            r9 = 0
        L9e:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.p028io.input.XmlStreamReader.m24972l(java.io.InputStream, java.lang.String):java.lang.String");
    }

    /* renamed from: m */
    public static boolean m24971m(String str) {
        if (str != null && (str.equals("application/xml") || str.equals("application/xml-dtd") || str.equals("application/xml-external-parsed-entity") || (str.startsWith("application/") && str.endsWith("+xml")))) {
            return true;
        }
        return false;
    }

    /* renamed from: n */
    public static boolean m24970n(String str) {
        if (str != null && (str.equals("text/xml") || str.equals("text/xml-external-parsed-entity") || (str.startsWith("text/") && str.endsWith("+xml")))) {
            return true;
        }
        return false;
    }

    /* renamed from: o */
    public static /* synthetic */ void m24969o(StringBuilder sb, String str) {
        sb.append(str);
        sb.append(TokenParser.f74560SP);
    }

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f73517a.close();
    }

    /* renamed from: d */
    public String m24977d(String str, String str2, String str3, boolean z, String str4) {
        if (z && str3 != null) {
            return str3;
        }
        String m24973k = m24973k(str4);
        String m24974j = m24974j(str4);
        boolean m24971m = m24971m(m24973k);
        boolean m24970n = m24970n(m24973k);
        if (!m24971m && !m24970n) {
            throw new XmlStreamReaderException(MessageFormat.format("Illegal encoding, CT-MIME [{0}] CT-Enc [{1}] BOM [{2}] XML guess [{3}] XML prolog [{4}], Illegal MIME", m24973k, m24974j, str, str2, str3), m24973k, m24974j, str, str2, str3);
        }
        if (m24974j == null) {
            if (m24971m) {
                return m24976g(str, str2, str3);
            }
            String str5 = this.f73519c;
            if (str5 == null) {
                return f73510e;
            }
            return str5;
        } else if (!m24974j.equals(f73511f) && !m24974j.equals(f73512g)) {
            String str6 = f73513h;
            if (m24974j.equals(str6)) {
                if (str != null && str.startsWith(str6)) {
                    return str;
                }
                throw new XmlStreamReaderException(MessageFormat.format("Illegal encoding, CT-MIME [{0}] CT-Enc [{1}] BOM [{2}] XML guess [{3}] XML prolog [{4}], encoding mismatch", m24973k, m24974j, str, str2, str3), m24973k, m24974j, str, str2, str3);
            } else if (!m24974j.equals("UTF-32BE") && !m24974j.equals("UTF-32LE")) {
                if (m24974j.equals("UTF-32")) {
                    if (str != null && str.startsWith("UTF-32")) {
                        return str;
                    }
                    throw new XmlStreamReaderException(MessageFormat.format("Illegal encoding, CT-MIME [{0}] CT-Enc [{1}] BOM [{2}] XML guess [{3}] XML prolog [{4}], encoding mismatch", m24973k, m24974j, str, str2, str3), m24973k, m24974j, str, str2, str3);
                }
                return m24974j;
            } else if (str == null) {
                return m24974j;
            } else {
                throw new XmlStreamReaderException(MessageFormat.format("Illegal encoding, CT-MIME [{0}] CT-Enc [{1}] BOM [{2}] XML guess [{3}] XML prolog [{4}], BOM must be null", m24973k, m24974j, str, str2, str3), m24973k, m24974j, str, str2, str3);
            }
        } else if (str == null) {
            return m24974j;
        } else {
            throw new XmlStreamReaderException(MessageFormat.format("Illegal encoding, CT-MIME [{0}] CT-Enc [{1}] BOM [{2}] XML guess [{3}] XML prolog [{4}], BOM must be null", m24973k, m24974j, str, str2, str3), m24973k, m24974j, str, str2, str3);
        }
    }

    /* renamed from: g */
    public String m24976g(String str, String str2, String str3) {
        if (str == null) {
            if (str2 != null && str3 != null) {
                if (str3.equals(f73513h) && (str2.equals(f73511f) || str2.equals(f73512g))) {
                    return str2;
                }
                return str3;
            }
            String str4 = this.f73519c;
            if (str4 == null) {
                return f73509d;
            }
            return str4;
        }
        String str5 = f73509d;
        if (str.equals(str5)) {
            if (str2 != null && !str2.equals(str5)) {
                throw new XmlStreamReaderException(MessageFormat.format("Illegal encoding, BOM [{0}] XML guess [{1}] XML prolog [{2}] encoding mismatch", str, str2, str3), str, str2, str3);
            }
            if (str3 != null && !str3.equals(str5)) {
                throw new XmlStreamReaderException(MessageFormat.format("Illegal encoding, BOM [{0}] XML guess [{1}] XML prolog [{2}] encoding mismatch", str, str2, str3), str, str2, str3);
            }
            return str;
        } else if (!str.equals(f73511f) && !str.equals(f73512g)) {
            if (!str.equals("UTF-32BE") && !str.equals("UTF-32LE")) {
                throw new XmlStreamReaderException(MessageFormat.format("Illegal encoding, BOM [{0}] XML guess [{1}] XML prolog [{2}] unknown BOM", str, str2, str3), str, str2, str3);
            }
            if (str2 != null && !str2.equals(str)) {
                throw new XmlStreamReaderException(MessageFormat.format("Illegal encoding, BOM [{0}] XML guess [{1}] XML prolog [{2}] encoding mismatch", str, str2, str3), str, str2, str3);
            }
            if (str3 != null && !str3.equals("UTF-32") && !str3.equals(str)) {
                throw new XmlStreamReaderException(MessageFormat.format("Illegal encoding, BOM [{0}] XML guess [{1}] XML prolog [{2}] encoding mismatch", str, str2, str3), str, str2, str3);
            }
            return str;
        } else if (str2 != null && !str2.equals(str)) {
            throw new XmlStreamReaderException(MessageFormat.format("Illegal encoding, BOM [{0}] XML guess [{1}] XML prolog [{2}] encoding mismatch", str, str2, str3), str, str2, str3);
        } else {
            if (str3 != null && !str3.equals(f73513h) && !str3.equals(str)) {
                throw new XmlStreamReaderException(MessageFormat.format("Illegal encoding, BOM [{0}] XML guess [{1}] XML prolog [{2}] encoding mismatch", str, str2, str3), str, str2, str3);
            }
            return str;
        }
    }

    public String getDefaultEncoding() {
        return this.f73519c;
    }

    public String getEncoding() {
        return this.f73518b;
    }

    /* renamed from: i */
    public final String m24975i(String str, XmlStreamReaderException xmlStreamReaderException) {
        if (str != null && str.startsWith("text/html")) {
            String substring = str.substring(9);
            try {
                return m24977d(xmlStreamReaderException.getBomEncoding(), xmlStreamReaderException.getXmlGuessEncoding(), xmlStreamReaderException.getXmlEncoding(), true, "text/xml" + substring);
            } catch (XmlStreamReaderException e) {
                xmlStreamReaderException = e;
            }
        }
        String xmlEncoding = xmlStreamReaderException.getXmlEncoding();
        if (xmlEncoding == null) {
            xmlEncoding = xmlStreamReaderException.getContentTypeEncoding();
        }
        if (xmlEncoding == null) {
            String str2 = this.f73519c;
            if (str2 == null) {
                return f73509d;
            }
            return str2;
        }
        return xmlEncoding;
    }

    /* renamed from: p */
    public final String m24968p(BOMInputStream bOMInputStream, BOMInputStream bOMInputStream2, boolean z) {
        String bOMCharsetName = bOMInputStream.getBOMCharsetName();
        String bOMCharsetName2 = bOMInputStream2.getBOMCharsetName();
        try {
            return m24976g(bOMCharsetName, bOMCharsetName2, m24972l(bOMInputStream2, bOMCharsetName2));
        } catch (XmlStreamReaderException e) {
            if (z) {
                return m24975i(null, e);
            }
            throw e;
        }
    }

    /* renamed from: q */
    public final String m24967q(BOMInputStream bOMInputStream, BOMInputStream bOMInputStream2, boolean z, String str) {
        String bOMCharsetName = bOMInputStream.getBOMCharsetName();
        String bOMCharsetName2 = bOMInputStream2.getBOMCharsetName();
        try {
            return m24977d(bOMCharsetName, bOMCharsetName2, m24972l(bOMInputStream2, bOMCharsetName2), z, str);
        } catch (XmlStreamReaderException e) {
            if (z) {
                return m24975i(str, e);
            }
            throw e;
        }
    }

    @Override // java.io.Reader
    public int read(char[] cArr, int i, int i2) throws IOException {
        return this.f73517a.read(cArr, i, i2);
    }

    @Deprecated
    public XmlStreamReader(InputStream inputStream) throws IOException {
        this(inputStream, true);
    }

    @Deprecated
    public XmlStreamReader(InputStream inputStream, boolean z) throws IOException {
        this(inputStream, z, (String) null);
    }

    @Deprecated
    public XmlStreamReader(InputStream inputStream, boolean z, String str) throws IOException {
        this.f73519c = str;
        Objects.requireNonNull(inputStream, "inputStream");
        BOMInputStream bOMInputStream = new BOMInputStream(new BufferedInputStream(inputStream, 8192), false, f73514i);
        BOMInputStream bOMInputStream2 = new BOMInputStream(bOMInputStream, true, f73515j);
        String m24968p = m24968p(bOMInputStream, bOMInputStream2, z);
        this.f73518b = m24968p;
        this.f73517a = new InputStreamReader(bOMInputStream2, m24968p);
    }

    @Deprecated
    public XmlStreamReader(InputStream inputStream, String str) throws IOException {
        this(inputStream, str, true);
    }

    @Deprecated
    public XmlStreamReader(InputStream inputStream, String str, boolean z) throws IOException {
        this(inputStream, str, z, null);
    }

    @Deprecated
    public XmlStreamReader(InputStream inputStream, String str, boolean z, String str2) throws IOException {
        this.f73519c = str2;
        Objects.requireNonNull(inputStream, "inputStream");
        BOMInputStream bOMInputStream = new BOMInputStream(new BufferedInputStream(inputStream, 8192), false, f73514i);
        BOMInputStream bOMInputStream2 = new BOMInputStream(bOMInputStream, true, f73515j);
        String m24967q = m24967q(bOMInputStream, bOMInputStream2, z, str);
        this.f73518b = m24967q;
        this.f73517a = new InputStreamReader(bOMInputStream2, m24967q);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @java.lang.Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public XmlStreamReader(java.nio.file.Path r2) throws java.io.IOException {
        /*
            r1 = this;
            java.lang.String r0 = "file"
            java.util.Objects.requireNonNull(r2, r0)
            java.nio.file.Path r2 = p000.AbstractC21393oI0.m25938a(r2)
            r0 = 0
            java.nio.file.OpenOption[] r0 = new java.nio.file.OpenOption[r0]
            java.io.InputStream r2 = p000.AbstractC0300E7.m68544a(r2, r0)
            r1.<init>(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.p028io.input.XmlStreamReader.<init>(java.nio.file.Path):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public XmlStreamReader(URL url) throws IOException {
        this(url.openConnection(), (String) null);
        Objects.requireNonNull(url, ImagesContract.URL);
    }

    public XmlStreamReader(URLConnection uRLConnection, String str) throws IOException {
        Objects.requireNonNull(uRLConnection, "urlConnection");
        this.f73519c = str;
        String contentType = uRLConnection.getContentType();
        BOMInputStream bOMInputStream = ((BOMInputStream.Builder) BOMInputStream.builder().setInputStream(new BufferedInputStream(uRLConnection.getInputStream(), 8192))).setInclude(false).setByteOrderMarks(f73514i).get();
        BOMInputStream bOMInputStream2 = ((BOMInputStream.Builder) BOMInputStream.builder().setInputStream(new BufferedInputStream(bOMInputStream, 8192))).setInclude(true).setByteOrderMarks(f73515j).get();
        if (!(uRLConnection instanceof HttpURLConnection) && contentType == null) {
            this.f73518b = m24968p(bOMInputStream, bOMInputStream2, true);
        } else {
            this.f73518b = m24967q(bOMInputStream, bOMInputStream2, true, contentType);
        }
        this.f73517a = new InputStreamReader(bOMInputStream2, this.f73518b);
    }
}
