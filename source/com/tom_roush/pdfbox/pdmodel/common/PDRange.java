package com.tom_roush.pdfbox.pdmodel.common;

import com.tom_roush.pdfbox.cos.COSArray;
import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSFloat;
import com.tom_roush.pdfbox.cos.COSNumber;

/* loaded from: classes5.dex */
public class PDRange implements COSObjectable {

    /* renamed from: a */
    public COSArray f60171a;

    /* renamed from: b */
    public int f60172b;

    public PDRange() {
        COSArray cOSArray = new COSArray();
        this.f60171a = cOSArray;
        cOSArray.add((COSBase) new COSFloat(0.0f));
        this.f60171a.add((COSBase) new COSFloat(1.0f));
        this.f60172b = 0;
    }

    public COSArray getCOSArray() {
        return this.f60171a;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.common.COSObjectable
    public COSBase getCOSObject() {
        return this.f60171a;
    }

    public float getMax() {
        return ((COSNumber) this.f60171a.getObject((this.f60172b * 2) + 1)).floatValue();
    }

    public float getMin() {
        return ((COSNumber) this.f60171a.getObject(this.f60172b * 2)).floatValue();
    }

    public void setMax(float f) {
        this.f60171a.set((this.f60172b * 2) + 1, (COSBase) new COSFloat(f));
    }

    public void setMin(float f) {
        this.f60171a.set(this.f60172b * 2, (COSBase) new COSFloat(f));
    }

    public String toString() {
        return "PDRange{" + getMin() + ", " + getMax() + '}';
    }

    public PDRange(COSArray cOSArray) {
        this.f60171a = cOSArray;
    }

    public PDRange(COSArray cOSArray, int i) {
        this.f60171a = cOSArray;
        this.f60172b = i;
    }
}
