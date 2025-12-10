package com.tom_roush.pdfbox.pdmodel.fdf;

import androidx.constraintlayout.motion.widget.Key;
import com.tom_roush.fontbox.ttf.HeaderTable;
import com.tom_roush.pdfbox.cos.COSArray;
import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.pdmodel.common.PDRectangle;
import java.io.IOException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
import org.w3c.dom.Element;

/* loaded from: classes5.dex */
public class FDFAnnotationFreeText extends FDFAnnotation {
    public static final String SUBTYPE = "FreeText";

    public FDFAnnotationFreeText() {
        this.annot.setName(COSName.SUBTYPE, "FreeText");
    }

    /* renamed from: c */
    private void m32478c(Element element) {
        String attribute = element.getAttribute("fringe");
        if (attribute != null && !attribute.isEmpty()) {
            String[] split = attribute.split(",");
            if (split.length == 4) {
                PDRectangle pDRectangle = new PDRectangle();
                pDRectangle.setLowerLeftX(Float.parseFloat(split[0]));
                pDRectangle.setLowerLeftY(Float.parseFloat(split[1]));
                pDRectangle.setUpperRightX(Float.parseFloat(split[2]));
                pDRectangle.setUpperRightY(Float.parseFloat(split[3]));
                setFringe(pDRectangle);
                return;
            }
            throw new IOException("Error: wrong amount of numbers in attribute 'fringe'");
        }
    }

    /* renamed from: b */
    public final void m32479b(Element element) {
        String attribute = element.getAttribute("callout");
        if (attribute != null && !attribute.isEmpty()) {
            String[] split = attribute.split(",");
            float[] fArr = new float[split.length];
            for (int i = 0; i < split.length; i++) {
                fArr[i] = Float.parseFloat(split[i]);
            }
            setCallout(fArr);
        }
    }

    public float[] getCallout() {
        COSArray cOSArray = (COSArray) this.annot.getDictionaryObject(COSName.f59766CL);
        if (cOSArray != null) {
            return cOSArray.toFloatArray();
        }
        return null;
    }

    public String getDefaultAppearance() {
        return this.annot.getString(COSName.f59771DA);
    }

    public String getDefaultStyle() {
        return this.annot.getString(COSName.f59777DS);
    }

    public PDRectangle getFringe() {
        COSArray cOSArray = (COSArray) this.annot.getDictionaryObject(COSName.f59821RD);
        if (cOSArray != null) {
            return new PDRectangle(cOSArray);
        }
        return null;
    }

    public String getJustification() {
        return "" + this.annot.getInt(COSName.f59818Q, 0);
    }

    public String getLineEndingStyle() {
        return this.annot.getNameAsString(COSName.f59800LE);
    }

    public String getRotation() {
        return this.annot.getString(COSName.ROTATE);
    }

    public void setCallout(float[] fArr) {
        COSArray cOSArray = new COSArray();
        cOSArray.setFloatArray(fArr);
        this.annot.setItem(COSName.f59766CL, (COSBase) cOSArray);
    }

    public final void setDefaultAppearance(String str) {
        this.annot.setString(COSName.f59771DA, str);
    }

    public final void setDefaultStyle(String str) {
        this.annot.setString(COSName.f59777DS, str);
    }

    public final void setFringe(PDRectangle pDRectangle) {
        this.annot.setItem(COSName.f59821RD, pDRectangle);
    }

    public final void setJustification(String str) {
        int i;
        if ("centered".equals(str)) {
            i = 1;
        } else if ("right".equals(str)) {
            i = 2;
        } else {
            i = 0;
        }
        this.annot.setInt(COSName.f59818Q, i);
    }

    public final void setLineEndingStyle(String str) {
        this.annot.setName(COSName.f59800LE, str);
    }

    public final void setRotation(int i) {
        this.annot.setInt(COSName.ROTATE, i);
    }

    public FDFAnnotationFreeText(COSDictionary cOSDictionary) {
        super(cOSDictionary);
    }

    public FDFAnnotationFreeText(Element element) throws IOException {
        super(element);
        this.annot.setName(COSName.SUBTYPE, "FreeText");
        setJustification(element.getAttribute("justification"));
        XPath newXPath = XPathFactory.newInstance().newXPath();
        try {
            setDefaultAppearance(newXPath.evaluate("defaultappearance", element));
            setDefaultStyle(newXPath.evaluate("defaultstyle", element));
        } catch (XPathExpressionException unused) {
        }
        m32479b(element);
        String attribute = element.getAttribute(Key.ROTATION);
        if (attribute != null && !attribute.isEmpty()) {
            setRotation(Integer.parseInt(attribute));
        }
        m32478c(element);
        String attribute2 = element.getAttribute(HeaderTable.TAG);
        if (attribute2 == null || attribute2.isEmpty()) {
            return;
        }
        setLineEndingStyle(attribute2);
    }
}
