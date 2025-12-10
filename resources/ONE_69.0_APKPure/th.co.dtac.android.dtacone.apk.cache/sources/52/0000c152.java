package com.tom_roush.pdfbox.multipdf;

import com.tom_roush.harmony.awt.geom.AffineTransform;
import com.tom_roush.pdfbox.cos.COSArray;
import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSInputStream;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.cos.COSObject;
import com.tom_roush.pdfbox.cos.COSStream;
import com.tom_roush.pdfbox.p019io.IOUtils;
import com.tom_roush.pdfbox.pdmodel.PDDocument;
import com.tom_roush.pdfbox.pdmodel.PDPage;
import com.tom_roush.pdfbox.pdmodel.PDPageTree;
import com.tom_roush.pdfbox.pdmodel.PDResources;
import com.tom_roush.pdfbox.pdmodel.common.PDRectangle;
import com.tom_roush.pdfbox.pdmodel.graphics.form.PDFormXObject;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.apache.commons.cli.HelpFormatter;

/* loaded from: classes5.dex */
public class Overlay implements Closeable {

    /* renamed from: a */
    public C9895b f59947a;

    /* renamed from: b */
    public C9895b f59948b;

    /* renamed from: c */
    public C9895b f59949c;

    /* renamed from: d */
    public C9895b f59950d;

    /* renamed from: e */
    public C9895b f59951e;

    /* renamed from: f */
    public final Set f59952f = new HashSet();

    /* renamed from: g */
    public Map f59953g = new HashMap();

    /* renamed from: h */
    public Position f59954h = Position.BACKGROUND;

    /* renamed from: i */
    public String f59955i = null;

    /* renamed from: j */
    public PDDocument f59956j = null;

    /* renamed from: k */
    public String f59957k = null;

    /* renamed from: l */
    public PDDocument f59958l = null;

    /* renamed from: m */
    public String f59959m = null;

    /* renamed from: n */
    public PDDocument f59960n = null;

    /* renamed from: o */
    public String f59961o = null;

    /* renamed from: p */
    public PDDocument f59962p = null;

    /* renamed from: q */
    public String f59963q = null;

    /* renamed from: r */
    public PDDocument f59964r = null;

    /* renamed from: s */
    public String f59965s = null;

    /* renamed from: t */
    public PDDocument f59966t = null;

    /* renamed from: u */
    public String f59967u = null;

    /* renamed from: v */
    public PDDocument f59968v = null;

    /* renamed from: w */
    public int f59969w = 0;

    /* renamed from: x */
    public boolean f59970x = false;

    /* loaded from: classes5.dex */
    public enum Position {
        FOREGROUND,
        BACKGROUND
    }

    /* renamed from: com.tom_roush.pdfbox.multipdf.Overlay$a */
    /* loaded from: classes5.dex */
    public static /* synthetic */ class C9894a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f59971a;

        static {
            int[] iArr = new int[Position.values().length];
            f59971a = iArr;
            try {
                iArr[Position.FOREGROUND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f59971a[Position.BACKGROUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* renamed from: com.tom_roush.pdfbox.multipdf.Overlay$b */
    /* loaded from: classes5.dex */
    public static final class C9895b {

        /* renamed from: a */
        public final PDRectangle f59972a;

        /* renamed from: b */
        public final COSStream f59973b;

        /* renamed from: c */
        public final COSDictionary f59974c;

        /* renamed from: d */
        public final short f59975d;

        public /* synthetic */ C9895b(PDRectangle pDRectangle, COSStream cOSStream, COSDictionary cOSDictionary, short s, C9894a c9894a) {
            this(pDRectangle, cOSStream, cOSDictionary, s);
        }

        public C9895b(PDRectangle pDRectangle, COSStream cOSStream, COSDictionary cOSDictionary, short s) {
            this.f59972a = pDRectangle;
            this.f59973b = cOSStream;
            this.f59974c = cOSDictionary;
            this.f59975d = s;
        }
    }

    /* renamed from: b */
    public final void m32738b(COSBase cOSBase, COSArray cOSArray) {
        if (cOSBase == null) {
            return;
        }
        if (cOSBase instanceof COSStream) {
            cOSArray.add(cOSBase);
        } else if (cOSBase instanceof COSArray) {
            cOSArray.addAll((COSArray) cOSBase);
        } else {
            throw new IOException("Unknown content type: " + cOSBase.getClass().getName());
        }
    }

    public AffineTransform calculateAffineTransform(PDPage pDPage, PDRectangle pDRectangle) {
        AffineTransform affineTransform = new AffineTransform();
        PDRectangle mediaBox = pDPage.getMediaBox();
        affineTransform.translate((mediaBox.getWidth() - pDRectangle.getWidth()) / 2.0f, (mediaBox.getHeight() - pDRectangle.getHeight()) / 2.0f);
        return affineTransform;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        PDDocument pDDocument = this.f59958l;
        if (pDDocument != null) {
            pDDocument.close();
        }
        PDDocument pDDocument2 = this.f59960n;
        if (pDDocument2 != null) {
            pDDocument2.close();
        }
        PDDocument pDDocument3 = this.f59962p;
        if (pDDocument3 != null) {
            pDDocument3.close();
        }
        PDDocument pDDocument4 = this.f59964r;
        if (pDDocument4 != null) {
            pDDocument4.close();
        }
        PDDocument pDDocument5 = this.f59966t;
        if (pDDocument5 != null) {
            pDDocument5.close();
        }
        PDDocument pDDocument6 = this.f59968v;
        if (pDDocument6 != null) {
            pDDocument6.close();
        }
        for (PDDocument pDDocument7 : this.f59952f) {
            pDDocument7.close();
        }
        this.f59952f.clear();
        this.f59953g.clear();
    }

    /* renamed from: d */
    public final COSStream m32737d(COSBase cOSBase) {
        List<COSStream> m32736g = m32736g(cOSBase);
        COSStream createCOSStream = this.f59956j.getDocument().createCOSStream();
        OutputStream createOutputStream = createCOSStream.createOutputStream(COSName.FLATE_DECODE);
        for (COSStream cOSStream : m32736g) {
            COSInputStream createInputStream = cOSStream.createInputStream();
            IOUtils.copy(createInputStream, createOutputStream);
            createOutputStream.flush();
            createInputStream.close();
        }
        createOutputStream.close();
        return createCOSStream;
    }

    /* renamed from: g */
    public final List m32736g(COSBase cOSBase) {
        ArrayList arrayList = new ArrayList();
        if (cOSBase == null) {
            return arrayList;
        }
        if (cOSBase instanceof COSStream) {
            arrayList.add((COSStream) cOSBase);
        } else if (cOSBase instanceof COSArray) {
            Iterator<COSBase> it = ((COSArray) cOSBase).iterator();
            while (it.hasNext()) {
                arrayList.addAll(m32736g(it.next()));
            }
        } else if (cOSBase instanceof COSObject) {
            arrayList.addAll(m32736g(((COSObject) cOSBase).getObject()));
        } else {
            throw new IOException("Unknown content type: " + cOSBase.getClass().getName());
        }
        return arrayList;
    }

    public String getDefaultOverlayFile() {
        return this.f59957k;
    }

    public String getInputFile() {
        return this.f59955i;
    }

    /* renamed from: i */
    public final C9895b m32735i(PDPage pDPage) {
        COSBase dictionaryObject = pDPage.getCOSObject().getDictionaryObject(COSName.CONTENTS);
        PDResources resources = pDPage.getResources();
        if (resources == null) {
            resources = new PDResources();
        }
        return new C9895b(pDPage.getMediaBox(), m32737d(dictionaryObject), resources.getCOSObject(), (short) pDPage.getRotation(), null);
    }

    /* renamed from: j */
    public final COSStream m32734j(PDPage pDPage, C9895b c9895b, COSName cOSName) {
        StringBuilder sb = new StringBuilder();
        sb.append("q\nq\n");
        PDRectangle pDRectangle = new PDRectangle(c9895b.f59972a.getCOSArray());
        if (c9895b.f59975d == 90 || c9895b.f59975d == 270) {
            pDRectangle.setLowerLeftX(c9895b.f59972a.getLowerLeftY());
            pDRectangle.setLowerLeftY(c9895b.f59972a.getLowerLeftX());
            pDRectangle.setUpperRightX(c9895b.f59972a.getUpperRightY());
            pDRectangle.setUpperRightY(c9895b.f59972a.getUpperRightX());
        }
        AffineTransform calculateAffineTransform = calculateAffineTransform(pDPage, pDRectangle);
        double[] dArr = new double[6];
        calculateAffineTransform.getMatrix(dArr);
        for (int i = 0; i < 6; i++) {
            sb.append(m32731m((float) dArr[i]));
            sb.append(HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR);
        }
        sb.append(" cm\n");
        sb.append(" /");
        sb.append(cOSName.getName());
        sb.append(" Do Q\nQ\n");
        return m32732l(sb.toString());
    }

    /* renamed from: k */
    public final COSName m32733k(PDPage pDPage, C9895b c9895b) {
        PDFormXObject pDFormXObject = new PDFormXObject(c9895b.f59973b);
        pDFormXObject.setResources(new PDResources(c9895b.f59974c));
        pDFormXObject.setFormType(1);
        pDFormXObject.setBBox(c9895b.f59972a.createRetranslatedRectangle());
        AffineTransform affineTransform = new AffineTransform();
        short s = c9895b.f59975d;
        if (s != 90) {
            if (s != 180) {
                if (s == 270) {
                    affineTransform.translate(c9895b.f59972a.getHeight(), 0.0d);
                    affineTransform.rotate(Math.toRadians(-270.0d));
                }
            } else {
                affineTransform.translate(c9895b.f59972a.getWidth(), c9895b.f59972a.getHeight());
                affineTransform.rotate(Math.toRadians(-180.0d));
            }
        } else {
            affineTransform.translate(0.0d, c9895b.f59972a.getWidth());
            affineTransform.rotate(Math.toRadians(-90.0d));
        }
        pDFormXObject.setMatrix(affineTransform);
        return pDPage.getResources().add(pDFormXObject, "OL");
    }

    /* renamed from: l */
    public final COSStream m32732l(String str) {
        COSName cOSName;
        COSStream createCOSStream = this.f59956j.getDocument().createCOSStream();
        if (str.length() > 20) {
            cOSName = COSName.FLATE_DECODE;
        } else {
            cOSName = null;
        }
        OutputStream createOutputStream = createCOSStream.createOutputStream(cOSName);
        createOutputStream.write(str.getBytes("ISO-8859-1"));
        createOutputStream.close();
        return createCOSStream;
    }

    /* renamed from: m */
    public final String m32731m(float f) {
        String plainString = new BigDecimal(String.valueOf(f)).toPlainString();
        if (plainString.indexOf(46) > -1 && !plainString.endsWith(".0")) {
            while (plainString.endsWith("0") && !plainString.endsWith(".0")) {
                plainString = plainString.substring(0, plainString.length() - 1);
            }
        }
        return plainString;
    }

    /* renamed from: n */
    public final C9895b m32730n(int i, int i2) {
        C9895b c9895b;
        C9895b c9895b2;
        if (!this.f59970x && this.f59953g.containsKey(Integer.valueOf(i))) {
            return (C9895b) this.f59953g.get(Integer.valueOf(i));
        }
        if (i != 1 || (c9895b2 = this.f59948b) == null) {
            if (i != i2 || (c9895b = this.f59949c) == null) {
                int i3 = i % 2;
                if (i3 != 1 || (c9895b2 = this.f59950d) == null) {
                    if ((i3 != 0 || (c9895b = this.f59951e) == null) && (c9895b = this.f59947a) == null) {
                        if (this.f59970x) {
                            return (C9895b) this.f59953g.get(Integer.valueOf((i - 1) % this.f59969w));
                        }
                        return null;
                    }
                }
            }
            return c9895b;
        }
        return c9895b2;
    }

    /* renamed from: o */
    public final C9895b m32729o(PDDocument pDDocument) {
        return m32735i(pDDocument.getPage(0));
    }

    public PDDocument overlay(Map<Integer, String> map) throws IOException {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        m32726r();
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            PDDocument pDDocument = (PDDocument) hashMap.get(entry.getValue());
            if (pDDocument == null) {
                pDDocument = m32727q(entry.getValue());
                hashMap.put(entry.getValue(), pDDocument);
                hashMap2.put(pDDocument, m32729o(pDDocument));
                this.f59952f.add(pDDocument);
            }
            this.f59953g.put(entry.getKey(), hashMap2.get(pDDocument));
        }
        m32724t(this.f59956j);
        return this.f59956j;
    }

    public PDDocument overlayDocuments(Map<Integer, PDDocument> map) throws IOException {
        m32726r();
        for (Map.Entry<Integer, PDDocument> entry : map.entrySet()) {
            PDDocument value = entry.getValue();
            if (value != null) {
                this.f59953g.put(entry.getKey(), m32729o(value));
            }
        }
        m32724t(this.f59956j);
        return this.f59956j;
    }

    /* renamed from: p */
    public final Map m32728p(PDDocument pDDocument) {
        HashMap hashMap = new HashMap();
        Iterator<PDPage> it = pDDocument.getPages().iterator();
        int i = 0;
        while (it.hasNext()) {
            hashMap.put(Integer.valueOf(i), m32735i(it.next()));
            i++;
        }
        return hashMap;
    }

    /* renamed from: q */
    public final PDDocument m32727q(String str) {
        return PDDocument.load(new File(str));
    }

    /* renamed from: r */
    public final void m32726r() {
        String str = this.f59955i;
        if (str != null) {
            this.f59956j = m32727q(str);
        }
        String str2 = this.f59957k;
        if (str2 != null) {
            this.f59958l = m32727q(str2);
        }
        PDDocument pDDocument = this.f59958l;
        if (pDDocument != null) {
            this.f59947a = m32729o(pDDocument);
        }
        String str3 = this.f59959m;
        if (str3 != null) {
            this.f59960n = m32727q(str3);
        }
        PDDocument pDDocument2 = this.f59960n;
        if (pDDocument2 != null) {
            this.f59948b = m32729o(pDDocument2);
        }
        String str4 = this.f59961o;
        if (str4 != null) {
            this.f59962p = m32727q(str4);
        }
        PDDocument pDDocument3 = this.f59962p;
        if (pDDocument3 != null) {
            this.f59949c = m32729o(pDDocument3);
        }
        String str5 = this.f59965s;
        if (str5 != null) {
            this.f59966t = m32727q(str5);
        }
        PDDocument pDDocument4 = this.f59966t;
        if (pDDocument4 != null) {
            this.f59950d = m32729o(pDDocument4);
        }
        String str6 = this.f59967u;
        if (str6 != null) {
            this.f59968v = m32727q(str6);
        }
        PDDocument pDDocument5 = this.f59968v;
        if (pDDocument5 != null) {
            this.f59951e = m32729o(pDDocument5);
        }
        String str7 = this.f59963q;
        if (str7 != null) {
            this.f59964r = m32727q(str7);
        }
        PDDocument pDDocument6 = this.f59964r;
        if (pDDocument6 != null) {
            Map m32728p = m32728p(pDDocument6);
            this.f59953g = m32728p;
            this.f59970x = true;
            this.f59969w = m32728p.size();
        }
    }

    /* renamed from: s */
    public final void m32725s(PDPage pDPage, C9895b c9895b, COSArray cOSArray) {
        if (pDPage.getResources() == null) {
            pDPage.setResources(new PDResources());
        }
        cOSArray.add((COSBase) m32734j(pDPage, c9895b, m32733k(pDPage, c9895b)));
    }

    public void setAllPagesOverlayFile(String str) {
        this.f59963q = str;
    }

    public void setAllPagesOverlayPDF(PDDocument pDDocument) {
        this.f59964r = pDDocument;
    }

    public void setDefaultOverlayFile(String str) {
        this.f59957k = str;
    }

    public void setDefaultOverlayPDF(PDDocument pDDocument) {
        this.f59958l = pDDocument;
    }

    public void setEvenPageOverlayFile(String str) {
        this.f59967u = str;
    }

    public void setEvenPageOverlayPDF(PDDocument pDDocument) {
        this.f59968v = pDDocument;
    }

    public void setFirstPageOverlayFile(String str) {
        this.f59959m = str;
    }

    public void setFirstPageOverlayPDF(PDDocument pDDocument) {
        this.f59960n = pDDocument;
    }

    public void setInputFile(String str) {
        this.f59955i = str;
    }

    public void setInputPDF(PDDocument pDDocument) {
        this.f59956j = pDDocument;
    }

    public void setLastPageOverlayFile(String str) {
        this.f59961o = str;
    }

    public void setLastPageOverlayPDF(PDDocument pDDocument) {
        this.f59962p = pDDocument;
    }

    public void setOddPageOverlayFile(String str) {
        this.f59965s = str;
    }

    public void setOddPageOverlayPDF(PDDocument pDDocument) {
        this.f59966t = pDDocument;
    }

    public void setOverlayPosition(Position position) {
        this.f59954h = position;
    }

    /* renamed from: t */
    public final void m32724t(PDDocument pDDocument) {
        PDPageTree pages = pDDocument.getPages();
        int count = pages.getCount();
        Iterator<PDPage> it = pages.iterator();
        int i = 0;
        while (it.hasNext()) {
            PDPage next = it.next();
            i++;
            C9895b m32730n = m32730n(i, count);
            if (m32730n != null) {
                COSDictionary cOSObject = next.getCOSObject();
                COSName cOSName = COSName.CONTENTS;
                COSBase dictionaryObject = cOSObject.getDictionaryObject(cOSName);
                COSArray cOSArray = new COSArray();
                int i2 = C9894a.f59971a[this.f59954h.ordinal()];
                if (i2 != 1) {
                    if (i2 == 2) {
                        m32725s(next, m32730n, cOSArray);
                        m32738b(dictionaryObject, cOSArray);
                    } else {
                        throw new IOException("Unknown type of position:" + this.f59954h);
                    }
                } else {
                    cOSArray.add((COSBase) m32732l("q\n"));
                    m32738b(dictionaryObject, cOSArray);
                    cOSArray.add((COSBase) m32732l("Q\n"));
                    m32725s(next, m32730n, cOSArray);
                }
                cOSObject.setItem(cOSName, (COSBase) cOSArray);
            }
        }
    }
}