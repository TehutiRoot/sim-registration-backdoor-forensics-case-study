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
    public final byte[] f59364a;

    /* renamed from: b */
    public boolean f59365b;

    /* renamed from: com.tom_roush.fontbox.cmap.CMapParser$b */
    /* loaded from: classes5.dex */
    public static final class C9859b {

        /* renamed from: a */
        public String f59366a;

        public C9859b(String str) {
            this.f59366a = str;
        }
    }

    /* renamed from: com.tom_roush.fontbox.cmap.CMapParser$c */
    /* loaded from: classes5.dex */
    public static final class C9860c {

        /* renamed from: a */
        public String f59367a;

        public C9860c(String str) {
            this.f59367a = str;
        }
    }

    public CMapParser() {
        this.f59364a = new byte[512];
        this.f59365b = false;
    }

    /* renamed from: a */
    public final void m32973a(CMap cMap, byte[] bArr, int i, byte[] bArr2) {
        for (int i2 = 0; i2 < i; i2++) {
            cMap.m32978c(bArr, m32969e(bArr2));
            if (m32968f(bArr2, bArr2.length - 1, this.f59365b)) {
                m32968f(bArr, bArr.length - 1, false);
            } else {
                return;
            }
        }
    }

    /* renamed from: b */
    public final void m32972b(CMap cMap, byte[] bArr, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            cMap.m32978c(bArr, m32969e((byte[]) it.next()));
            m32968f(bArr, bArr.length - 1, false);
        }
    }

    /* renamed from: c */
    public final void m32971c(C9860c c9860c, String str, String str2) {
        if (c9860c.f59367a.equals(str)) {
            return;
        }
        throw new IOException("Error : ~" + str2 + " contains an unexpected operator : " + c9860c.f59367a);
    }

    /* renamed from: d */
    public final int m32970d(byte[] bArr) {
        int i = bArr[0] & 255;
        if (bArr.length == 2) {
            return (i << 8) + (bArr[1] & 255);
        }
        return i;
    }

    /* renamed from: e */
    public final String m32969e(byte[] bArr) {
        Charset charset;
        if (bArr.length == 1) {
            charset = Charsets.ISO_8859_1;
        } else {
            charset = Charsets.UTF_16BE;
        }
        return new String(bArr, charset);
    }

    /* renamed from: f */
    public final boolean m32968f(byte[] bArr, int i, boolean z) {
        if (i > 0 && (bArr[i] & 255) == 255) {
            if (z) {
                return false;
            }
            bArr[i] = 0;
            m32968f(bArr, i - 1, z);
        } else {
            bArr[i] = (byte) (bArr[i] + 1);
        }
        return true;
    }

    /* renamed from: g */
    public final boolean m32967g(int i) {
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
    public final boolean m32966h(int i) {
        return i == -1 || i == 32 || i == 13 || i == 10;
    }

    /* renamed from: i */
    public final void m32965i(Number number, PushbackInputStream pushbackInputStream, CMap cMap) {
        for (int i = 0; i < number.intValue(); i++) {
            Object m32959o = m32959o(pushbackInputStream);
            if (m32959o instanceof C9860c) {
                m32971c((C9860c) m32959o, "endbfchar", "bfchar");
                return;
            }
            byte[] bArr = (byte[]) m32959o;
            Object m32959o2 = m32959o(pushbackInputStream);
            if (m32959o2 instanceof byte[]) {
                cMap.m32978c(bArr, m32969e((byte[]) m32959o2));
            } else if (m32959o2 instanceof C9859b) {
                cMap.m32978c(bArr, ((C9859b) m32959o2).f59366a);
            } else {
                throw new IOException("Error parsing CMap beginbfchar, expected{COSString or COSName} and not " + m32959o2);
            }
        }
    }

    /* renamed from: j */
    public final void m32964j(Number number, PushbackInputStream pushbackInputStream, CMap cMap) {
        for (int i = 0; i < number.intValue(); i++) {
            Object m32959o = m32959o(pushbackInputStream);
            if (m32959o instanceof C9860c) {
                m32971c((C9860c) m32959o, "endbfrange", "bfrange");
                return;
            }
            byte[] bArr = (byte[]) m32959o;
            byte[] bArr2 = (byte[]) m32959o(pushbackInputStream);
            int m32975f = CMap.m32975f(bArr, bArr.length);
            int m32975f2 = CMap.m32975f(bArr2, bArr2.length);
            if (m32975f2 >= m32975f) {
                Object m32959o2 = m32959o(pushbackInputStream);
                if (m32959o2 instanceof List) {
                    List list = (List) m32959o2;
                    if (!list.isEmpty() && list.size() >= m32975f2 - m32975f) {
                        m32972b(cMap, bArr, list);
                    }
                } else if (m32959o2 instanceof byte[]) {
                    byte[] bArr3 = (byte[]) m32959o2;
                    if (bArr3.length > 0) {
                        if (bArr3.length == 2 && m32975f == 0 && m32975f2 == 65535 && bArr3[0] == 0 && bArr3[1] == 0) {
                            for (int i2 = 0; i2 < 256; i2++) {
                                byte b = (byte) i2;
                                bArr[0] = b;
                                bArr[1] = 0;
                                bArr3[0] = b;
                                bArr3[1] = 0;
                                m32973a(cMap, bArr, 256, bArr3);
                            }
                        } else {
                            m32973a(cMap, bArr, (m32975f2 - m32975f) + 1, bArr3);
                        }
                    }
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: k */
    public final void m32963k(Number number, PushbackInputStream pushbackInputStream, CMap cMap) {
        for (int i = 0; i < number.intValue(); i++) {
            Object m32959o = m32959o(pushbackInputStream);
            if (m32959o instanceof C9860c) {
                m32971c((C9860c) m32959o, "endcidchar", "cidchar");
                return;
            }
            cMap.m32980a(((Integer) m32959o(pushbackInputStream)).intValue(), m32970d((byte[]) m32959o));
        }
    }

    /* renamed from: l */
    public final void m32962l(int i, PushbackInputStream pushbackInputStream, CMap cMap) {
        for (int i2 = 0; i2 < i; i2++) {
            Object m32959o = m32959o(pushbackInputStream);
            if (m32959o instanceof C9860c) {
                m32971c((C9860c) m32959o, "endcidrange", "cidrange");
                return;
            }
            byte[] bArr = (byte[]) m32959o;
            int m32970d = m32970d(bArr);
            byte[] bArr2 = (byte[]) m32959o(pushbackInputStream);
            int m32970d2 = m32970d(bArr2);
            int intValue = ((Integer) m32959o(pushbackInputStream)).intValue();
            if (bArr.length <= 2 && bArr2.length <= 2) {
                if (m32970d2 == m32970d) {
                    cMap.m32980a(intValue, m32970d);
                } else {
                    cMap.m32979b((char) m32970d, (char) m32970d2, intValue);
                }
            } else {
                int i3 = (m32970d2 + intValue) - m32970d;
                while (intValue <= i3) {
                    cMap.m32980a(intValue, m32970d(bArr));
                    m32968f(bArr, bArr.length - 1, false);
                    intValue++;
                }
            }
        }
    }

    /* renamed from: m */
    public final void m32961m(Number number, PushbackInputStream pushbackInputStream, CMap cMap) {
        for (int i = 0; i < number.intValue(); i++) {
            Object m32959o = m32959o(pushbackInputStream);
            if (m32959o instanceof C9860c) {
                m32971c((C9860c) m32959o, "endcodespacerange", "codespacerange");
                return;
            }
            try {
                cMap.m32977d(new CodespaceRange((byte[]) m32959o, (byte[]) m32959o(pushbackInputStream)));
            } catch (IllegalArgumentException e) {
                throw new IOException(e);
            }
        }
    }

    /* renamed from: n */
    public final void m32960n(C9859b c9859b, PushbackInputStream pushbackInputStream, CMap cMap) {
        if ("WMode".equals(c9859b.f59366a)) {
            Object m32959o = m32959o(pushbackInputStream);
            if (m32959o instanceof Integer) {
                cMap.setWMode(((Integer) m32959o).intValue());
            }
        } else if ("CMapName".equals(c9859b.f59366a)) {
            Object m32959o2 = m32959o(pushbackInputStream);
            if (m32959o2 instanceof C9859b) {
                cMap.setName(((C9859b) m32959o2).f59366a);
            }
        } else if ("CMapVersion".equals(c9859b.f59366a)) {
            Object m32959o3 = m32959o(pushbackInputStream);
            if (m32959o3 instanceof Number) {
                cMap.setVersion(m32959o3.toString());
            } else if (m32959o3 instanceof String) {
                cMap.setVersion((String) m32959o3);
            }
        } else if ("CMapType".equals(c9859b.f59366a)) {
            Object m32959o4 = m32959o(pushbackInputStream);
            if (m32959o4 instanceof Integer) {
                cMap.setType(((Integer) m32959o4).intValue());
            }
        } else if (Registry.TAG.equals(c9859b.f59366a)) {
            Object m32959o5 = m32959o(pushbackInputStream);
            if (m32959o5 instanceof String) {
                cMap.setRegistry((String) m32959o5);
            }
        } else if ("Ordering".equals(c9859b.f59366a)) {
            Object m32959o6 = m32959o(pushbackInputStream);
            if (m32959o6 instanceof String) {
                cMap.setOrdering((String) m32959o6);
            }
        } else if ("Supplement".equals(c9859b.f59366a)) {
            Object m32959o7 = m32959o(pushbackInputStream);
            if (m32959o7 instanceof Integer) {
                cMap.setSupplement(((Integer) m32959o7).intValue());
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
    public final java.lang.Object m32959o(java.io.PushbackInputStream r10) {
        /*
            Method dump skipped, instructions count: 554
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tom_roush.fontbox.cmap.CMapParser.m32959o(java.io.PushbackInputStream):java.lang.Object");
    }

    /* renamed from: p */
    public final void m32958p(C9859b c9859b, CMap cMap) {
        cMap.m32974g(parse(getExternalCMap(c9859b.f59366a)));
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
            this.f59365b = false;
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
    public final void m32957q(InputStream inputStream, StringBuilder sb) {
        int read = inputStream.read();
        while (read != -1 && read != 13 && read != 10) {
            sb.append((char) read);
            read = inputStream.read();
        }
    }

    public CMapParser(boolean z) {
        this.f59364a = new byte[512];
        this.f59365b = z;
    }

    public CMap parse(InputStream inputStream) throws IOException {
        PushbackInputStream pushbackInputStream = new PushbackInputStream(inputStream);
        CMap cMap = new CMap();
        Integer num = null;
        while (true) {
            Object m32959o = m32959o(pushbackInputStream);
            if (m32959o == null) {
                break;
            }
            if (m32959o instanceof C9860c) {
                C9860c c9860c = (C9860c) m32959o;
                if (c9860c.f59367a.equals("endcmap")) {
                    break;
                } else if (num != null) {
                    if (c9860c.f59367a.equals("usecmap") && (num instanceof C9859b)) {
                        m32958p((C9859b) num, cMap);
                    } else if (num instanceof Number) {
                        if (!c9860c.f59367a.equals("begincodespacerange")) {
                            if (!c9860c.f59367a.equals("beginbfchar")) {
                                if (!c9860c.f59367a.equals("beginbfrange")) {
                                    if (!c9860c.f59367a.equals("begincidchar")) {
                                        if (c9860c.f59367a.equals("begincidrange") && (num instanceof Integer)) {
                                            m32962l(num.intValue(), pushbackInputStream, cMap);
                                        }
                                    } else {
                                        m32963k(num, pushbackInputStream, cMap);
                                    }
                                } else {
                                    m32964j(num, pushbackInputStream, cMap);
                                }
                            } else {
                                m32965i(num, pushbackInputStream, cMap);
                            }
                        } else {
                            m32961m(num, pushbackInputStream, cMap);
                        }
                    }
                }
            } else if (m32959o instanceof C9859b) {
                m32960n((C9859b) m32959o, pushbackInputStream, cMap);
            }
            num = m32959o;
        }
        return cMap;
    }
}