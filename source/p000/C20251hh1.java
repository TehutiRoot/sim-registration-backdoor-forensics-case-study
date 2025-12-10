package p000;

import com.tom_roush.pdfbox.contentstream.operator.Operator;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.cos.COSArray;
import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.cos.COSNumber;
import com.tom_roush.pdfbox.cos.COSString;
import com.tom_roush.pdfbox.pdfparser.PDFStreamParser;
import com.tom_roush.pdfbox.pdmodel.PDPageContentStream;
import com.tom_roush.pdfbox.pdmodel.PDResources;
import com.tom_roush.pdfbox.pdmodel.font.PDFont;
import com.tom_roush.pdfbox.pdmodel.graphics.color.PDColor;
import com.tom_roush.pdfbox.pdmodel.graphics.color.PDColorSpace;
import com.tom_roush.pdfbox.pdmodel.graphics.color.PDDeviceGray;
import com.tom_roush.pdfbox.pdmodel.graphics.color.PDDeviceRGB;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDAppearanceStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: hh1  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C20251hh1 {

    /* renamed from: a */
    public final PDResources f62556a;

    /* renamed from: b */
    public COSName f62557b;

    /* renamed from: c */
    public PDFont f62558c;

    /* renamed from: d */
    public float f62559d = 12.0f;

    /* renamed from: e */
    public PDColor f62560e;

    public C20251hh1(COSString cOSString, PDResources pDResources) {
        if (cOSString != null) {
            if (pDResources != null) {
                this.f62556a = pDResources;
                m30781f(cOSString.getBytes());
                return;
            }
            throw new IllegalArgumentException("/DR is a required entry");
        }
        throw new IllegalArgumentException("/DA is a required entry. Please set a default appearance first.");
    }

    /* renamed from: a */
    public void m30786a(PDAppearanceStream pDAppearanceStream) {
        PDResources resources = pDAppearanceStream.getResources();
        if (resources == null) {
            resources = new PDResources();
            pDAppearanceStream.setResources(resources);
        }
        if (resources.getFont(this.f62557b) == null) {
            resources.put(this.f62557b, m30785b());
        }
    }

    /* renamed from: b */
    public PDFont m30785b() {
        return this.f62558c;
    }

    /* renamed from: c */
    public PDColor m30784c() {
        return this.f62560e;
    }

    /* renamed from: d */
    public COSName m30783d() {
        return this.f62557b;
    }

    /* renamed from: e */
    public float m30782e() {
        return this.f62559d;
    }

    /* renamed from: f */
    public final void m30781f(byte[] bArr) {
        ArrayList arrayList = new ArrayList();
        PDFStreamParser pDFStreamParser = new PDFStreamParser(bArr);
        for (Object parseNextToken = pDFStreamParser.parseNextToken(); parseNextToken != null; parseNextToken = pDFStreamParser.parseNextToken()) {
            if (parseNextToken instanceof Operator) {
                m30780g((Operator) parseNextToken, arrayList);
                arrayList = new ArrayList();
            } else {
                arrayList.add((COSBase) parseNextToken);
            }
        }
    }

    /* renamed from: g */
    public final void m30780g(Operator operator, List list) {
        String name = operator.getName();
        if (OperatorName.SET_FONT_AND_SIZE.equals(name)) {
            m30779h(list);
        } else if (OperatorName.NON_STROKING_GRAY.equals(name)) {
            m30778i(list);
        } else if (OperatorName.NON_STROKING_RGB.equals(name)) {
            m30778i(list);
        } else if (OperatorName.NON_STROKING_CMYK.equals(name)) {
            m30778i(list);
        }
    }

    /* renamed from: h */
    public final void m30779h(List list) {
        if (list.size() >= 2) {
            COSBase cOSBase = (COSBase) list.get(0);
            COSBase cOSBase2 = (COSBase) list.get(1);
            if (!(cOSBase instanceof COSName) || !(cOSBase2 instanceof COSNumber)) {
                return;
            }
            COSName cOSName = (COSName) cOSBase;
            PDFont font = this.f62556a.getFont(cOSName);
            float floatValue = ((COSNumber) cOSBase2).floatValue();
            if (font != null) {
                m30775l(cOSName);
                m30777j(font);
                m30774m(floatValue);
                return;
            }
            throw new IOException("Could not find font: /" + cOSName.getName());
        }
        throw new IOException("Missing operands for set font operator " + Arrays.toString(list.toArray()));
    }

    /* renamed from: i */
    public final void m30778i(List list) {
        PDColorSpace pDColorSpace;
        int size = list.size();
        if (size != 1) {
            if (size != 3) {
                if (size == 4) {
                    pDColorSpace = PDDeviceRGB.INSTANCE;
                } else {
                    throw new IOException("Missing operands for set non stroking color operator " + Arrays.toString(list.toArray()));
                }
            } else {
                pDColorSpace = PDDeviceRGB.INSTANCE;
            }
        } else {
            pDColorSpace = PDDeviceGray.INSTANCE;
        }
        COSArray cOSArray = new COSArray();
        cOSArray.addAll(list);
        m30776k(new PDColor(cOSArray, pDColorSpace));
    }

    /* renamed from: j */
    public void m30777j(PDFont pDFont) {
        this.f62558c = pDFont;
    }

    /* renamed from: k */
    public void m30776k(PDColor pDColor) {
        this.f62560e = pDColor;
    }

    /* renamed from: l */
    public void m30775l(COSName cOSName) {
        this.f62557b = cOSName;
    }

    /* renamed from: m */
    public void m30774m(float f) {
        this.f62559d = f;
    }

    /* renamed from: n */
    public void m30773n(PDPageContentStream pDPageContentStream, float f) {
        float m30782e = m30782e();
        if (m30782e != 0.0f) {
            f = m30782e;
        }
        pDPageContentStream.setFont(m30785b(), f);
        if (m30784c() != null) {
            pDPageContentStream.setNonStrokingColor(m30784c());
        }
    }
}
