package com.tom_roush.pdfbox.pdmodel.common;

import com.tom_roush.pdfbox.cos.COSArray;
import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSFloat;
import com.tom_roush.pdfbox.cos.COSNumber;

/* loaded from: classes5.dex */
public class PDRange implements COSObjectable {

    /* renamed from: a */
    public COSArray f60183a;

    /* renamed from: b */
    public int f60184b;

    public PDRange() {
        COSArray cOSArray = new COSArray();
        this.f60183a = cOSArray;
        cOSArray.add((COSBase) new COSFloat(0.0f));
        this.f60183a.add((COSBase) new COSFloat(1.0f));
        this.f60184b = 0;
    }

    public COSArray getCOSArray() {
        return this.f60183a;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.common.COSObjectable
    public COSBase getCOSObject() {
        return this.f60183a;
    }

    public float getMax() {
        return ((COSNumber) this.f60183a.getObject((this.f60184b * 2) + 1)).floatValue();
    }

    public float getMin() {
        return ((COSNumber) this.f60183a.getObject(this.f60184b * 2)).floatValue();
    }

    public void setMax(float f) {
        this.f60183a.set((this.f60184b * 2) + 1, (COSBase) new COSFloat(f));
    }

    public void setMin(float f) {
        this.f60183a.set(this.f60184b * 2, (COSBase) new COSFloat(f));
    }

    public String toString() {
        return "PDRange{" + getMin() + ", " + getMax() + '}';
    }

    public PDRange(COSArray cOSArray) {
        this.f60183a = cOSArray;
    }

    public PDRange(COSArray cOSArray, int i) {
        this.f60183a = cOSArray;
        this.f60184b = i;
    }
}