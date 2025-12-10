package com.tom_roush.pdfbox.pdmodel.common.function;

import com.tom_roush.pdfbox.cos.COSArray;
import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSFloat;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.cos.COSNumber;
import java.io.IOException;

/* loaded from: classes5.dex */
public class PDFunctionType2 extends PDFunction {

    /* renamed from: g */
    public final COSArray f60201g;

    /* renamed from: h */
    public final COSArray f60202h;

    /* renamed from: i */
    public final float f60203i;

    public PDFunctionType2(COSBase cOSBase) {
        super(cOSBase);
        COSArray cOSArray = getCOSObject().getCOSArray(COSName.f59760C0);
        if (cOSArray != null) {
            this.f60201g = cOSArray;
        } else {
            this.f60201g = new COSArray();
        }
        if (this.f60201g.size() == 0) {
            this.f60201g.add((COSBase) new COSFloat(0.0f));
        }
        COSArray cOSArray2 = getCOSObject().getCOSArray(COSName.f59761C1);
        if (cOSArray2 != null) {
            this.f60202h = cOSArray2;
        } else {
            this.f60202h = new COSArray();
        }
        if (this.f60202h.size() == 0) {
            this.f60202h.add((COSBase) new COSFloat(1.0f));
        }
        this.f60203i = getCOSObject().getFloat(COSName.f59807N);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.common.function.PDFunction
    public float[] eval(float[] fArr) throws IOException {
        float pow = (float) Math.pow(fArr[0], this.f60203i);
        int min = Math.min(this.f60201g.size(), this.f60202h.size());
        float[] fArr2 = new float[min];
        for (int i = 0; i < min; i++) {
            float floatValue = ((COSNumber) this.f60201g.get(i)).floatValue();
            fArr2[i] = floatValue + ((((COSNumber) this.f60202h.get(i)).floatValue() - floatValue) * pow);
        }
        return clipToRange(fArr2);
    }

    public COSArray getC0() {
        return this.f60201g;
    }

    public COSArray getC1() {
        return this.f60202h;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.common.function.PDFunction
    public int getFunctionType() {
        return 2;
    }

    public float getN() {
        return this.f60203i;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.common.function.PDFunction
    public String toString() {
        return "FunctionType2{C0: " + getC0() + " C1: " + getC1() + " N: " + getN() + "}";
    }
}
