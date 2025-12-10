package com.tom_roush.pdfbox.pdmodel.graphics;

import com.tom_roush.pdfbox.cos.COSArray;
import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSInteger;
import com.tom_roush.pdfbox.pdmodel.common.COSObjectable;
import java.util.Arrays;

/* loaded from: classes5.dex */
public final class PDLineDashPattern implements COSObjectable {

    /* renamed from: a */
    public final int f60459a;

    /* renamed from: b */
    public final float[] f60460b;

    public PDLineDashPattern() {
        this.f60460b = new float[0];
        this.f60459a = 0;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.common.COSObjectable
    public COSBase getCOSObject() {
        COSArray cOSArray = new COSArray();
        COSArray cOSArray2 = new COSArray();
        cOSArray2.setFloatArray(this.f60460b);
        cOSArray.add((COSBase) cOSArray2);
        cOSArray.add((COSBase) COSInteger.get(this.f60459a));
        return cOSArray;
    }

    public float[] getDashArray() {
        return (float[]) this.f60460b.clone();
    }

    public int getPhase() {
        return this.f60459a;
    }

    public String toString() {
        return "PDLineDashPattern{array=" + Arrays.toString(this.f60460b) + ", phase=" + this.f60459a + "}";
    }

    public PDLineDashPattern(COSArray cOSArray, int i) {
        this.f60460b = cOSArray.toFloatArray();
        this.f60459a = i;
    }
}
