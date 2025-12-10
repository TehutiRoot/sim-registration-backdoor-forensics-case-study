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

/* renamed from: ei1  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C19789ei1 {

    /* renamed from: a */
    public final PDResources f61632a;

    /* renamed from: b */
    public COSName f61633b;

    /* renamed from: c */
    public PDFont f61634c;

    /* renamed from: d */
    public float f61635d = 12.0f;

    /* renamed from: e */
    public PDColor f61636e;

    public C19789ei1(COSString cOSString, PDResources pDResources) {
        if (cOSString != null) {
            if (pDResources != null) {
                this.f61632a = pDResources;
                m31646f(cOSString.getBytes());
                return;
            }
            throw new IllegalArgumentException("/DR is a required entry");
        }
        throw new IllegalArgumentException("/DA is a required entry. Please set a default appearance first.");
    }

    /* renamed from: a */
    public void m31651a(PDAppearanceStream pDAppearanceStream) {
        PDResources resources = pDAppearanceStream.getResources();
        if (resources == null) {
            resources = new PDResources();
            pDAppearanceStream.setResources(resources);
        }
        if (resources.getFont(this.f61633b) == null) {
            resources.put(this.f61633b, m31650b());
        }
    }

    /* renamed from: b */
    public PDFont m31650b() {
        return this.f61634c;
    }

    /* renamed from: c */
    public PDColor m31649c() {
        return this.f61636e;
    }

    /* renamed from: d */
    public COSName m31648d() {
        return this.f61633b;
    }

    /* renamed from: e */
    public float m31647e() {
        return this.f61635d;
    }

    /* renamed from: f */
    public final void m31646f(byte[] bArr) {
        ArrayList arrayList = new ArrayList();
        PDFStreamParser pDFStreamParser = new PDFStreamParser(bArr);
        for (Object parseNextToken = pDFStreamParser.parseNextToken(); parseNextToken != null; parseNextToken = pDFStreamParser.parseNextToken()) {
            if (parseNextToken instanceof Operator) {
                m31645g((Operator) parseNextToken, arrayList);
                arrayList = new ArrayList();
            } else {
                arrayList.add((COSBase) parseNextToken);
            }
        }
    }

    /* renamed from: g */
    public final void m31645g(Operator operator, List list) {
        String name = operator.getName();
        if (OperatorName.SET_FONT_AND_SIZE.equals(name)) {
            m31644h(list);
        } else if (OperatorName.NON_STROKING_GRAY.equals(name)) {
            m31643i(list);
        } else if (OperatorName.NON_STROKING_RGB.equals(name)) {
            m31643i(list);
        } else if (OperatorName.NON_STROKING_CMYK.equals(name)) {
            m31643i(list);
        }
    }

    /* renamed from: h */
    public final void m31644h(List list) {
        if (list.size() >= 2) {
            COSBase cOSBase = (COSBase) list.get(0);
            COSBase cOSBase2 = (COSBase) list.get(1);
            if (!(cOSBase instanceof COSName) || !(cOSBase2 instanceof COSNumber)) {
                return;
            }
            COSName cOSName = (COSName) cOSBase;
            PDFont font = this.f61632a.getFont(cOSName);
            float floatValue = ((COSNumber) cOSBase2).floatValue();
            if (font != null) {
                m31640l(cOSName);
                m31642j(font);
                m31639m(floatValue);
                return;
            }
            throw new IOException("Could not find font: /" + cOSName.getName());
        }
        throw new IOException("Missing operands for set font operator " + Arrays.toString(list.toArray()));
    }

    /* renamed from: i */
    public final void m31643i(List list) {
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
        m31641k(new PDColor(cOSArray, pDColorSpace));
    }

    /* renamed from: j */
    public void m31642j(PDFont pDFont) {
        this.f61634c = pDFont;
    }

    /* renamed from: k */
    public void m31641k(PDColor pDColor) {
        this.f61636e = pDColor;
    }

    /* renamed from: l */
    public void m31640l(COSName cOSName) {
        this.f61633b = cOSName;
    }

    /* renamed from: m */
    public void m31639m(float f) {
        this.f61635d = f;
    }

    /* renamed from: n */
    public void m31638n(PDPageContentStream pDPageContentStream, float f) {
        float m31647e = m31647e();
        if (m31647e != 0.0f) {
            f = m31647e;
        }
        pDPageContentStream.setFont(m31650b(), f);
        if (m31649c() != null) {
            pDPageContentStream.setNonStrokingColor(m31649c());
        }
    }
}