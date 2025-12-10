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
    public C9906b f59935a;

    /* renamed from: b */
    public C9906b f59936b;

    /* renamed from: c */
    public C9906b f59937c;

    /* renamed from: d */
    public C9906b f59938d;

    /* renamed from: e */
    public C9906b f59939e;

    /* renamed from: f */
    public final Set f59940f = new HashSet();

    /* renamed from: g */
    public Map f59941g = new HashMap();

    /* renamed from: h */
    public Position f59942h = Position.BACKGROUND;

    /* renamed from: i */
    public String f59943i = null;

    /* renamed from: j */
    public PDDocument f59944j = null;

    /* renamed from: k */
    public String f59945k = null;

    /* renamed from: l */
    public PDDocument f59946l = null;

    /* renamed from: m */
    public String f59947m = null;

    /* renamed from: n */
    public PDDocument f59948n = null;

    /* renamed from: o */
    public String f59949o = null;

    /* renamed from: p */
    public PDDocument f59950p = null;

    /* renamed from: q */
    public String f59951q = null;

    /* renamed from: r */
    public PDDocument f59952r = null;

    /* renamed from: s */
    public String f59953s = null;

    /* renamed from: t */
    public PDDocument f59954t = null;

    /* renamed from: u */
    public String f59955u = null;

    /* renamed from: v */
    public PDDocument f59956v = null;

    /* renamed from: w */
    public int f59957w = 0;

    /* renamed from: x */
    public boolean f59958x = false;

    /* loaded from: classes5.dex */
    public enum Position {
        FOREGROUND,
        BACKGROUND
    }

    /* renamed from: com.tom_roush.pdfbox.multipdf.Overlay$a */
    /* loaded from: classes5.dex */
    public static /* synthetic */ class C9905a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f59959a;

        static {
            int[] iArr = new int[Position.values().length];
            f59959a = iArr;
            try {
                iArr[Position.FOREGROUND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f59959a[Position.BACKGROUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* renamed from: com.tom_roush.pdfbox.multipdf.Overlay$b */
    /* loaded from: classes5.dex */
    public static final class C9906b {

        /* renamed from: a */
        public final PDRectangle f59960a;

        /* renamed from: b */
        public final COSStream f59961b;

        /* renamed from: c */
        public final COSDictionary f59962c;

        /* renamed from: d */
        public final short f59963d;

        public /* synthetic */ C9906b(PDRectangle pDRectangle, COSStream cOSStream, COSDictionary cOSDictionary, short s, C9905a c9905a) {
            this(pDRectangle, cOSStream, cOSDictionary, s);
        }

        public C9906b(PDRectangle pDRectangle, COSStream cOSStream, COSDictionary cOSDictionary, short s) {
            this.f59960a = pDRectangle;
            this.f59961b = cOSStream;
            this.f59962c = cOSDictionary;
            this.f59963d = s;
        }
    }

    /* renamed from: b */
    public final void m32746b(COSBase cOSBase, COSArray cOSArray) {
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
        PDDocument pDDocument = this.f59946l;
        if (pDDocument != null) {
            pDDocument.close();
        }
        PDDocument pDDocument2 = this.f59948n;
        if (pDDocument2 != null) {
            pDDocument2.close();
        }
        PDDocument pDDocument3 = this.f59950p;
        if (pDDocument3 != null) {
            pDDocument3.close();
        }
        PDDocument pDDocument4 = this.f59952r;
        if (pDDocument4 != null) {
            pDDocument4.close();
        }
        PDDocument pDDocument5 = this.f59954t;
        if (pDDocument5 != null) {
            pDDocument5.close();
        }
        PDDocument pDDocument6 = this.f59956v;
        if (pDDocument6 != null) {
            pDDocument6.close();
        }
        for (PDDocument pDDocument7 : this.f59940f) {
            pDDocument7.close();
        }
        this.f59940f.clear();
        this.f59941g.clear();
    }

    /* renamed from: d */
    public final COSStream m32745d(COSBase cOSBase) {
        List<COSStream> m32744g = m32744g(cOSBase);
        COSStream createCOSStream = this.f59944j.getDocument().createCOSStream();
        OutputStream createOutputStream = createCOSStream.createOutputStream(COSName.FLATE_DECODE);
        for (COSStream cOSStream : m32744g) {
            COSInputStream createInputStream = cOSStream.createInputStream();
            IOUtils.copy(createInputStream, createOutputStream);
            createOutputStream.flush();
            createInputStream.close();
        }
        createOutputStream.close();
        return createCOSStream;
    }

    /* renamed from: g */
    public final List m32744g(COSBase cOSBase) {
        ArrayList arrayList = new ArrayList();
        if (cOSBase == null) {
            return arrayList;
        }
        if (cOSBase instanceof COSStream) {
            arrayList.add((COSStream) cOSBase);
        } else if (cOSBase instanceof COSArray) {
            Iterator<COSBase> it = ((COSArray) cOSBase).iterator();
            while (it.hasNext()) {
                arrayList.addAll(m32744g(it.next()));
            }
        } else if (cOSBase instanceof COSObject) {
            arrayList.addAll(m32744g(((COSObject) cOSBase).getObject()));
        } else {
            throw new IOException("Unknown content type: " + cOSBase.getClass().getName());
        }
        return arrayList;
    }

    public String getDefaultOverlayFile() {
        return this.f59945k;
    }

    public String getInputFile() {
        return this.f59943i;
    }

    /* renamed from: i */
    public final C9906b m32743i(PDPage pDPage) {
        COSBase dictionaryObject = pDPage.getCOSObject().getDictionaryObject(COSName.CONTENTS);
        PDResources resources = pDPage.getResources();
        if (resources == null) {
            resources = new PDResources();
        }
        return new C9906b(pDPage.getMediaBox(), m32745d(dictionaryObject), resources.getCOSObject(), (short) pDPage.getRotation(), null);
    }

    /* renamed from: j */
    public final COSStream m32742j(PDPage pDPage, C9906b c9906b, COSName cOSName) {
        StringBuilder sb = new StringBuilder();
        sb.append("q\nq\n");
        PDRectangle pDRectangle = new PDRectangle(c9906b.f59960a.getCOSArray());
        if (c9906b.f59963d == 90 || c9906b.f59963d == 270) {
            pDRectangle.setLowerLeftX(c9906b.f59960a.getLowerLeftY());
            pDRectangle.setLowerLeftY(c9906b.f59960a.getLowerLeftX());
            pDRectangle.setUpperRightX(c9906b.f59960a.getUpperRightY());
            pDRectangle.setUpperRightY(c9906b.f59960a.getUpperRightX());
        }
        AffineTransform calculateAffineTransform = calculateAffineTransform(pDPage, pDRectangle);
        double[] dArr = new double[6];
        calculateAffineTransform.getMatrix(dArr);
        for (int i = 0; i < 6; i++) {
            sb.append(m32739m((float) dArr[i]));
            sb.append(HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR);
        }
        sb.append(" cm\n");
        sb.append(" /");
        sb.append(cOSName.getName());
        sb.append(" Do Q\nQ\n");
        return m32740l(sb.toString());
    }

    /* renamed from: k */
    public final COSName m32741k(PDPage pDPage, C9906b c9906b) {
        PDFormXObject pDFormXObject = new PDFormXObject(c9906b.f59961b);
        pDFormXObject.setResources(new PDResources(c9906b.f59962c));
        pDFormXObject.setFormType(1);
        pDFormXObject.setBBox(c9906b.f59960a.createRetranslatedRectangle());
        AffineTransform affineTransform = new AffineTransform();
        short s = c9906b.f59963d;
        if (s != 90) {
            if (s != 180) {
                if (s == 270) {
                    affineTransform.translate(c9906b.f59960a.getHeight(), 0.0d);
                    affineTransform.rotate(Math.toRadians(-270.0d));
                }
            } else {
                affineTransform.translate(c9906b.f59960a.getWidth(), c9906b.f59960a.getHeight());
                affineTransform.rotate(Math.toRadians(-180.0d));
            }
        } else {
            affineTransform.translate(0.0d, c9906b.f59960a.getWidth());
            affineTransform.rotate(Math.toRadians(-90.0d));
        }
        pDFormXObject.setMatrix(affineTransform);
        return pDPage.getResources().add(pDFormXObject, "OL");
    }

    /* renamed from: l */
    public final COSStream m32740l(String str) {
        COSName cOSName;
        COSStream createCOSStream = this.f59944j.getDocument().createCOSStream();
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
    public final String m32739m(float f) {
        String plainString = new BigDecimal(String.valueOf(f)).toPlainString();
        if (plainString.indexOf(46) > -1 && !plainString.endsWith(".0")) {
            while (plainString.endsWith("0") && !plainString.endsWith(".0")) {
                plainString = plainString.substring(0, plainString.length() - 1);
            }
        }
        return plainString;
    }

    /* renamed from: n */
    public final C9906b m32738n(int i, int i2) {
        C9906b c9906b;
        C9906b c9906b2;
        if (!this.f59958x && this.f59941g.containsKey(Integer.valueOf(i))) {
            return (C9906b) this.f59941g.get(Integer.valueOf(i));
        }
        if (i != 1 || (c9906b2 = this.f59936b) == null) {
            if (i != i2 || (c9906b = this.f59937c) == null) {
                int i3 = i % 2;
                if (i3 != 1 || (c9906b2 = this.f59938d) == null) {
                    if ((i3 != 0 || (c9906b = this.f59939e) == null) && (c9906b = this.f59935a) == null) {
                        if (this.f59958x) {
                            return (C9906b) this.f59941g.get(Integer.valueOf((i - 1) % this.f59957w));
                        }
                        return null;
                    }
                }
            }
            return c9906b;
        }
        return c9906b2;
    }

    /* renamed from: o */
    public final C9906b m32737o(PDDocument pDDocument) {
        return m32743i(pDDocument.getPage(0));
    }

    public PDDocument overlay(Map<Integer, String> map) throws IOException {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        m32734r();
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            PDDocument pDDocument = (PDDocument) hashMap.get(entry.getValue());
            if (pDDocument == null) {
                pDDocument = m32735q(entry.getValue());
                hashMap.put(entry.getValue(), pDDocument);
                hashMap2.put(pDDocument, m32737o(pDDocument));
                this.f59940f.add(pDDocument);
            }
            this.f59941g.put(entry.getKey(), hashMap2.get(pDDocument));
        }
        m32732t(this.f59944j);
        return this.f59944j;
    }

    public PDDocument overlayDocuments(Map<Integer, PDDocument> map) throws IOException {
        m32734r();
        for (Map.Entry<Integer, PDDocument> entry : map.entrySet()) {
            PDDocument value = entry.getValue();
            if (value != null) {
                this.f59941g.put(entry.getKey(), m32737o(value));
            }
        }
        m32732t(this.f59944j);
        return this.f59944j;
    }

    /* renamed from: p */
    public final Map m32736p(PDDocument pDDocument) {
        HashMap hashMap = new HashMap();
        Iterator<PDPage> it = pDDocument.getPages().iterator();
        int i = 0;
        while (it.hasNext()) {
            hashMap.put(Integer.valueOf(i), m32743i(it.next()));
            i++;
        }
        return hashMap;
    }

    /* renamed from: q */
    public final PDDocument m32735q(String str) {
        return PDDocument.load(new File(str));
    }

    /* renamed from: r */
    public final void m32734r() {
        String str = this.f59943i;
        if (str != null) {
            this.f59944j = m32735q(str);
        }
        String str2 = this.f59945k;
        if (str2 != null) {
            this.f59946l = m32735q(str2);
        }
        PDDocument pDDocument = this.f59946l;
        if (pDDocument != null) {
            this.f59935a = m32737o(pDDocument);
        }
        String str3 = this.f59947m;
        if (str3 != null) {
            this.f59948n = m32735q(str3);
        }
        PDDocument pDDocument2 = this.f59948n;
        if (pDDocument2 != null) {
            this.f59936b = m32737o(pDDocument2);
        }
        String str4 = this.f59949o;
        if (str4 != null) {
            this.f59950p = m32735q(str4);
        }
        PDDocument pDDocument3 = this.f59950p;
        if (pDDocument3 != null) {
            this.f59937c = m32737o(pDDocument3);
        }
        String str5 = this.f59953s;
        if (str5 != null) {
            this.f59954t = m32735q(str5);
        }
        PDDocument pDDocument4 = this.f59954t;
        if (pDDocument4 != null) {
            this.f59938d = m32737o(pDDocument4);
        }
        String str6 = this.f59955u;
        if (str6 != null) {
            this.f59956v = m32735q(str6);
        }
        PDDocument pDDocument5 = this.f59956v;
        if (pDDocument5 != null) {
            this.f59939e = m32737o(pDDocument5);
        }
        String str7 = this.f59951q;
        if (str7 != null) {
            this.f59952r = m32735q(str7);
        }
        PDDocument pDDocument6 = this.f59952r;
        if (pDDocument6 != null) {
            Map m32736p = m32736p(pDDocument6);
            this.f59941g = m32736p;
            this.f59958x = true;
            this.f59957w = m32736p.size();
        }
    }

    /* renamed from: s */
    public final void m32733s(PDPage pDPage, C9906b c9906b, COSArray cOSArray) {
        if (pDPage.getResources() == null) {
            pDPage.setResources(new PDResources());
        }
        cOSArray.add((COSBase) m32742j(pDPage, c9906b, m32741k(pDPage, c9906b)));
    }

    public void setAllPagesOverlayFile(String str) {
        this.f59951q = str;
    }

    public void setAllPagesOverlayPDF(PDDocument pDDocument) {
        this.f59952r = pDDocument;
    }

    public void setDefaultOverlayFile(String str) {
        this.f59945k = str;
    }

    public void setDefaultOverlayPDF(PDDocument pDDocument) {
        this.f59946l = pDDocument;
    }

    public void setEvenPageOverlayFile(String str) {
        this.f59955u = str;
    }

    public void setEvenPageOverlayPDF(PDDocument pDDocument) {
        this.f59956v = pDDocument;
    }

    public void setFirstPageOverlayFile(String str) {
        this.f59947m = str;
    }

    public void setFirstPageOverlayPDF(PDDocument pDDocument) {
        this.f59948n = pDDocument;
    }

    public void setInputFile(String str) {
        this.f59943i = str;
    }

    public void setInputPDF(PDDocument pDDocument) {
        this.f59944j = pDDocument;
    }

    public void setLastPageOverlayFile(String str) {
        this.f59949o = str;
    }

    public void setLastPageOverlayPDF(PDDocument pDDocument) {
        this.f59950p = pDDocument;
    }

    public void setOddPageOverlayFile(String str) {
        this.f59953s = str;
    }

    public void setOddPageOverlayPDF(PDDocument pDDocument) {
        this.f59954t = pDDocument;
    }

    public void setOverlayPosition(Position position) {
        this.f59942h = position;
    }

    /* renamed from: t */
    public final void m32732t(PDDocument pDDocument) {
        PDPageTree pages = pDDocument.getPages();
        int count = pages.getCount();
        Iterator<PDPage> it = pages.iterator();
        int i = 0;
        while (it.hasNext()) {
            PDPage next = it.next();
            i++;
            C9906b m32738n = m32738n(i, count);
            if (m32738n != null) {
                COSDictionary cOSObject = next.getCOSObject();
                COSName cOSName = COSName.CONTENTS;
                COSBase dictionaryObject = cOSObject.getDictionaryObject(cOSName);
                COSArray cOSArray = new COSArray();
                int i2 = C9905a.f59959a[this.f59942h.ordinal()];
                if (i2 != 1) {
                    if (i2 == 2) {
                        m32733s(next, m32738n, cOSArray);
                        m32746b(dictionaryObject, cOSArray);
                    } else {
                        throw new IOException("Unknown type of position:" + this.f59942h);
                    }
                } else {
                    cOSArray.add((COSBase) m32740l("q\n"));
                    m32746b(dictionaryObject, cOSArray);
                    cOSArray.add((COSBase) m32740l("Q\n"));
                    m32733s(next, m32738n, cOSArray);
                }
                cOSObject.setItem(cOSName, (COSBase) cOSArray);
            }
        }
    }
}
