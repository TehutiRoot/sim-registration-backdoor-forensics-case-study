package com.tom_roush.pdfbox.pdmodel.graphics.color;

import com.tom_roush.pdfbox.cos.COSArray;
import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSFloat;
import com.tom_roush.pdfbox.cos.COSNumber;
import com.tom_roush.pdfbox.pdmodel.common.COSObjectable;

/* loaded from: classes5.dex */
public final class PDGamma implements COSObjectable {

    /* renamed from: a */
    public final COSArray f60469a;

    public PDGamma() {
        COSArray cOSArray = new COSArray();
        this.f60469a = cOSArray;
        cOSArray.add((COSBase) new COSFloat(0.0f));
        cOSArray.add((COSBase) new COSFloat(0.0f));
        cOSArray.add((COSBase) new COSFloat(0.0f));
    }

    public float getB() {
        return ((COSNumber) this.f60469a.get(2)).floatValue();
    }

    public COSArray getCOSArray() {
        return this.f60469a;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.common.COSObjectable
    public COSBase getCOSObject() {
        return this.f60469a;
    }

    public float getG() {
        return ((COSNumber) this.f60469a.get(1)).floatValue();
    }

    public float getR() {
        return ((COSNumber) this.f60469a.get(0)).floatValue();
    }

    public void setB(float f) {
        this.f60469a.set(2, (COSBase) new COSFloat(f));
    }

    public void setG(float f) {
        this.f60469a.set(1, (COSBase) new COSFloat(f));
    }

    public void setR(float f) {
        this.f60469a.set(0, (COSBase) new COSFloat(f));
    }

    public PDGamma(COSArray cOSArray) {
        this.f60469a = cOSArray;
    }
}
