package com.tom_roush.fontbox.cmap;

import com.mobsandgeeks.saripaar.Registry;
import com.tom_roush.fontbox.util.Charsets;
import com.tom_roush.pdfbox.android.PDFBoxResourceLoader;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PushbackInputStream;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes5.dex */
public class CMapParser {

    /* renamed from: a */
    public final byte[] f59352a;

    /* renamed from: b */
    public boolean f59353b;

    /* renamed from: com.tom_roush.fontbox.cmap.CMapParser$b */
    /* loaded from: classes5.dex */
    public static final class C9870b {

        /* renamed from: a */
        public String f59354a;

        public C9870b(String str) {
            this.f59354a = str;
        }
    }

    /* renamed from: com.tom_roush.fontbox.cmap.CMapParser$c */
    /* loaded from: classes5.dex */
    public static final class C9871c {

        /* renamed from: a */
        public String f59355a;

        public C9871c(String str) {
            this.f59355a = str;
        }
    }

    public CMapParser() {
        this.f59352a = new byte[512];
        this.f59353b = false;
    }

    /* renamed from: a */
    public final void m32981a(CMap cMap, byte[] bArr, int i, byte[] bArr2) {
        for (int i2 = 0; i2 < i; i2++) {
            cMap.m32986c(bArr, m32977e(bArr2));
            if (m32976f(bArr2, bArr2.length - 1, this.f59353b)) {
                m32976f(bArr, bArr.length - 1, false);
            } else {
                return;
            }
        }
    }

    /* renamed from: b */
    public final void m32980b(CMap cMap, byte[] bArr, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            cMap.m32986c(bArr, m32977e((byte[]) it.next()));
            m32976f(bArr, bArr.length - 1, false);
        }
    }

    /* renamed from: c */
    public final void m32979c(C9871c c9871c, String str, String str2) {
        if (c9871c.f59355a.equals(str)) {
            return;
        }
        throw new IOException("Error : ~" + str2 + " contains an unexpected operator : " + c9871c.f59355a);
    }

    /* renamed from: d */
    public final int m32978d(byte[] bArr) {
        int i = bArr[0] & 255;
        if (bArr.length == 2) {
            return (i << 8) + (bArr[1] & 255);
        }
        return i;
    }

    /* renamed from: e */
    public final String m32977e(byte[] bArr) {
        Charset charset;
        if (bArr.length == 1) {
            charset = Charsets.ISO_8859_1;
        } else {
            charset = Charsets.UTF_16BE;
        }
        return new String(bArr, charset);
    }

    /* renamed from: f */
    public final boolean m32976f(byte[] bArr, int i, boolean z) {
        if (i > 0 && (bArr[i] & 255) == 255) {
            if (z) {
                return false;
            }
            bArr[i] = 0;
            m32976f(bArr, i - 1, z);
        } else {
            bArr[i] = (byte) (bArr[i] + 1);
        }
        return true;
    }

    /* renamed from: g */
    public final boolean m32975g(int i) {
        return i == 37 || i == 47 || i == 60 || i == 62 || i == 91 || i == 93 || i == 123 || i == 125 || i == 40 || i == 41;
    }

    public InputStream getExternalCMap(String str) throws IOException {
        if (PDFBoxResourceLoader.isReady()) {
            return new BufferedInputStream(PDFBoxResourceLoader.getStream("com/tom_roush/fontbox/resources/cmap/" + str));
        }
        Class<?> cls = getClass();
        InputStream resourceAsStream = cls.getResourceAsStream("/com/tom_roush/fontbox/resources/cmap/" + str);
        if (resourceAsStream != null) {
            return new BufferedInputStream(resourceAsStream);
        }
        throw new IOException("Error: Could not find referenced cmap stream " + str);
    }

    /* renamed from: h */
    public final boolean m32974h(int i) {
        return i == -1 || i == 32 || i == 13 || i == 10;
    }

    /* renamed from: i */
    public final void m32973i(Number number, PushbackInputStream pushbackInputStream, CMap cMap) {
        for (int i = 0; i < number.intValue(); i++) {
            Object m32967o = m32967o(pushbackInputStream);
            if (m32967o instanceof C9871c) {
                m32979c((C9871c) m32967o, "endbfchar", "bfchar");
                return;
            }
            byte[] bArr = (byte[]) m32967o;
            Object m32967o2 = m32967o(pushbackInputStream);
            if (m32967o2 instanceof byte[]) {
                cMap.m32986c(bArr, m32977e((byte[]) m32967o2));
            } else if (m32967o2 instanceof C9870b) {
                cMap.m32986c(bArr, ((C9870b) m32967o2).f59354a);
            } else {
                throw new IOException("Error parsing CMap beginbfchar, expected{COSString or COSName} and not " + m32967o2);
            }
        }
    }

    /* renamed from: j */
    public final void m32972j(Number number, PushbackInputStream pushbackInputStream, CMap cMap) {
        for (int i = 0; i < number.intValue(); i++) {
            Object m32967o = m32967o(pushbackInputStream);
            if (m32967o instanceof C9871c) {
                m32979c((C9871c) m32967o, "endbfrange", "bfrange");
                return;
            }
            byte[] bArr = (byte[]) m32967o;
            byte[] bArr2 = (byte[]) m32967o(pushbackInputStream);
            int m32983f = CMap.m32983f(bArr, bArr.length);
            int m32983f2 = CMap.m32983f(bArr2, bArr2.length);
            if (m32983f2 >= m32983f) {
                Object m32967o2 = m32967o(pushbackInputStream);
                if (m32967o2 instanceof List) {
                    List list = (List) m32967o2;
                    if (!list.isEmpty() && list.size() >= m32983f2 - m32983f) {
                        m32980b(cMap, bArr, list);
                    }
                } else if (m32967o2 instanceof byte[]) {
                    byte[] bArr3 = (byte[]) m32967o2;
                    if (bArr3.length > 0) {
                        if (bArr3.length == 2 && m32983f == 0 && m32983f2 == 65535 && bArr3[0] == 0 && bArr3[1] == 0) {
                            for (int i2 = 0; i2 < 256; i2++) {
                                byte b = (byte) i2;
                                bArr[0] = b;
                                bArr[1] = 0;
                                bArr3[0] = b;
                                bArr3[1] = 0;
                                m32981a(cMap, bArr, 256, bArr3);
                            }
                        } else {
                            m32981a(cMap, bArr, (m32983f2 - m32983f) + 1, bArr3);
                        }
                    }
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: k */
    public final void m32971k(Number number, PushbackInputStream pushbackInputStream, CMap cMap) {
        for (int i = 0; i < number.intValue(); i++) {
            Object m32967o = m32967o(pushbackInputStream);
            if (m32967o instanceof C9871c) {
                m32979c((C9871c) m32967o, "endcidchar", "cidchar");
                return;
            }
            cMap.m32988a(((Integer) m32967o(pushbackInputStream)).intValue(), m32978d((byte[]) m32967o));
        }
    }

    /* renamed from: l */
    public final void m32970l(int i, PushbackInputStream pushbackInputStream, CMap cMap) {
        for (int i2 = 0; i2 < i; i2++) {
            Object m32967o = m32967o(pushbackInputStream);
            if (m32967o instanceof C9871c) {
                m32979c((C9871c) m32967o, "endcidrange", "cidrange");
                return;
            }
            byte[] bArr = (byte[]) m32967o;
            int m32978d = m32978d(bArr);
            byte[] bArr2 = (byte[]) m32967o(pushbackInputStream);
            int m32978d2 = m32978d(bArr2);
            int intValue = ((Integer) m32967o(pushbackInputStream)).intValue();
            if (bArr.length <= 2 && bArr2.length <= 2) {
                if (m32978d2 == m32978d) {
                    cMap.m32988a(intValue, m32978d);
                } else {
                    cMap.m32987b((char) m32978d, (char) m32978d2, intValue);
                }
            } else {
                int i3 = (m32978d2 + intValue) - m32978d;
                while (intValue <= i3) {
                    cMap.m32988a(intValue, m32978d(bArr));
                    m32976f(bArr, bArr.length - 1, false);
                    intValue++;
                }
            }
        }
    }

    /* renamed from: m */
    public final void m32969m(Number number, PushbackInputStream pushbackInputStream, CMap cMap) {
        for (int i = 0; i < number.intValue(); i++) {
            Object m32967o = m32967o(pushbackInputStream);
            if (m32967o instanceof C9871c) {
                m32979c((C9871c) m32967o, "endcodespacerange", "codespacerange");
                return;
            }
            try {
                cMap.m32985d(new CodespaceRange((byte[]) m32967o, (byte[]) m32967o(pushbackInputStream)));
            } catch (IllegalArgumentException e) {
                throw new IOException(e);
            }
        }
    }

    /* renamed from: n */
    public final void m32968n(C9870b c9870b, PushbackInputStream pushbackInputStream, CMap cMap) {
        if ("WMode".equals(c9870b.f59354a)) {
            Object m32967o = m32967o(pushbackInputStream);
            if (m32967o instanceof Integer) {
                cMap.setWMode(((Integer) m32967o).intValue());
            }
        } else if ("CMapName".equals(c9870b.f59354a)) {
            Object m32967o2 = m32967o(pushbackInputStream);
            if (m32967o2 instanceof C9870b) {
                cMap.setName(((C9870b) m32967o2).f59354a);
            }
        } else if ("CMapVersion".equals(c9870b.f59354a)) {
            Object m32967o3 = m32967o(pushbackInputStream);
            if (m32967o3 instanceof Number) {
                cMap.setVersion(m32967o3.toString());
            } else if (m32967o3 instanceof String) {
                cMap.setVersion((String) m32967o3);
            }
        } else if ("CMapType".equals(c9870b.f59354a)) {
            Object m32967o4 = m32967o(pushbackInputStream);
            if (m32967o4 instanceof Integer) {
                cMap.setType(((Integer) m32967o4).intValue());
            }
        } else if (Registry.TAG.equals(c9870b.f59354a)) {
            Object m32967o5 = m32967o(pushbackInputStream);
            if (m32967o5 instanceof String) {
                cMap.setRegistry((String) m32967o5);
            }
        } else if ("Ordering".equals(c9870b.f59354a)) {
            Object m32967o6 = m32967o(pushbackInputStream);
            if (m32967o6 instanceof String) {
                cMap.setOrdering((String) m32967o6);
            }
        } else if ("Supplement".equals(c9870b.f59354a)) {
            Object m32967o7 = m32967o(pushbackInputStream);
            if (m32967o7 instanceof Integer) {
                cMap.setSupplement(((Integer) m32967o7).intValue());
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b5  */
    /* renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m32967o(java.io.PushbackInputStream r10) {
        /*
            Method dump skipped, instructions count: 554
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tom_roush.fontbox.cmap.CMapParser.m32967o(java.io.PushbackInputStream):java.lang.Object");
    }

    /* renamed from: p */
    public final void m32966p(C9870b c9870b, CMap cMap) {
        cMap.m32982g(parse(getExternalCMap(c9870b.f59354a)));
    }

    public CMap parse(File file) throws IOException {
        FileInputStream fileInputStream = null;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(file);
            try {
                CMap parse = parse(fileInputStream2);
                fileInputStream2.close();
                return parse;
            } catch (Throwable th2) {
                th = th2;
                fileInputStream = fileInputStream2;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public CMap parsePredefined(String str) throws IOException {
        InputStream inputStream;
        try {
            inputStream = getExternalCMap(str);
        } catch (Throwable th2) {
            th = th2;
            inputStream = null;
        }
        try {
            this.f59353b = false;
            CMap parse = parse(inputStream);
            if (inputStream != null) {
                inputStream.close();
            }
            return parse;
        } catch (Throwable th3) {
            th = th3;
            if (inputStream != null) {
                inputStream.close();
            }
            throw th;
        }
    }

    /* renamed from: q */
    public final void m32965q(InputStream inputStream, StringBuilder sb) {
        int read = inputStream.read();
        while (read != -1 && read != 13 && read != 10) {
            sb.append((char) read);
            read = inputStream.read();
        }
    }

    public CMapParser(boolean z) {
        this.f59352a = new byte[512];
        this.f59353b = z;
    }

    public CMap parse(InputStream inputStream) throws IOException {
        PushbackInputStream pushbackInputStream = new PushbackInputStream(inputStream);
        CMap cMap = new CMap();
        Integer num = null;
        while (true) {
            Object m32967o = m32967o(pushbackInputStream);
            if (m32967o == null) {
                break;
            }
            if (m32967o instanceof C9871c) {
                C9871c c9871c = (C9871c) m32967o;
                if (c9871c.f59355a.equals("endcmap")) {
                    break;
                } else if (num != null) {
                    if (c9871c.f59355a.equals("usecmap") && (num instanceof C9870b)) {
                        m32966p((C9870b) num, cMap);
                    } else if (num instanceof Number) {
                        if (!c9871c.f59355a.equals("begincodespacerange")) {
                            if (!c9871c.f59355a.equals("beginbfchar")) {
                                if (!c9871c.f59355a.equals("beginbfrange")) {
                                    if (!c9871c.f59355a.equals("begincidchar")) {
                                        if (c9871c.f59355a.equals("begincidrange") && (num instanceof Integer)) {
                                            m32970l(num.intValue(), pushbackInputStream, cMap);
                                        }
                                    } else {
                                        m32971k(num, pushbackInputStream, cMap);
                                    }
                                } else {
                                    m32972j(num, pushbackInputStream, cMap);
                                }
                            } else {
                                m32973i(num, pushbackInputStream, cMap);
                            }
                        } else {
                            m32969m(num, pushbackInputStream, cMap);
                        }
                    }
                }
            } else if (m32967o instanceof C9870b) {
                m32968n((C9870b) m32967o, pushbackInputStream, cMap);
            }
            num = m32967o;
        }
        return cMap;
    }
}
