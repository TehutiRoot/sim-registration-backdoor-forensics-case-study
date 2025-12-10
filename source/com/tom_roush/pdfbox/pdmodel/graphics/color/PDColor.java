package com.tom_roush.pdfbox.pdmodel.graphics.color;

import com.tom_roush.pdfbox.cos.COSArray;
import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.cos.COSNumber;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes5.dex */
public final class PDColor {

    /* renamed from: a */
    public final float[] f60464a;

    /* renamed from: b */
    public final COSName f60465b;

    /* renamed from: c */
    public final PDColorSpace f60466c;

    public PDColor(COSArray cOSArray, PDColorSpace pDColorSpace) {
        int i = 0;
        if (cOSArray.size() > 0 && (cOSArray.get(cOSArray.size() - 1) instanceof COSName)) {
            this.f60464a = new float[cOSArray.size() - 1];
            while (true) {
                float[] fArr = this.f60464a;
                if (i >= fArr.length) {
                    break;
                }
                fArr[i] = ((COSNumber) cOSArray.get(i)).floatValue();
                i++;
            }
            this.f60465b = (COSName) cOSArray.get(cOSArray.size() - 1);
        } else {
            this.f60464a = new float[cOSArray.size()];
            while (i < cOSArray.size()) {
                this.f60464a[i] = ((COSNumber) cOSArray.get(i)).floatValue();
                i++;
            }
            this.f60465b = null;
        }
        this.f60466c = pDColorSpace;
    }

    public PDColorSpace getColorSpace() {
        return this.f60466c;
    }

    public float[] getComponents() {
        PDColorSpace pDColorSpace = this.f60466c;
        if (pDColorSpace == null) {
            return (float[]) this.f60464a.clone();
        }
        return Arrays.copyOf(this.f60464a, pDColorSpace.getNumberOfComponents());
    }

    public COSName getPatternName() {
        return this.f60465b;
    }

    public boolean isPattern() {
        if (this.f60465b != null) {
            return true;
        }
        return false;
    }

    public COSArray toCOSArray() {
        COSArray cOSArray = new COSArray();
        cOSArray.setFloatArray(this.f60464a);
        COSName cOSName = this.f60465b;
        if (cOSName != null) {
            cOSArray.add((COSBase) cOSName);
        }
        return cOSArray;
    }

    public int toRGB() throws IOException {
        float[] rgb = this.f60466c.toRGB(this.f60464a);
        int round = Math.round(rgb[0] * 255.0f);
        return (((round << 8) + Math.round(rgb[1] * 255.0f)) << 8) + Math.round(rgb[2] * 255.0f);
    }

    public String toString() {
        return "PDColor{components=" + Arrays.toString(this.f60464a) + ", patternName=" + this.f60465b + "}";
    }

    public PDColor(float[] fArr, PDColorSpace pDColorSpace) {
        this.f60464a = (float[]) fArr.clone();
        this.f60465b = null;
        this.f60466c = pDColorSpace;
    }

    public PDColor(COSName cOSName, PDColorSpace pDColorSpace) {
        this.f60464a = new float[0];
        this.f60465b = cOSName;
        this.f60466c = pDColorSpace;
    }

    public PDColor(float[] fArr, COSName cOSName, PDColorSpace pDColorSpace) {
        this.f60464a = (float[]) fArr.clone();
        this.f60465b = cOSName;
        this.f60466c = pDColorSpace;
    }
}
