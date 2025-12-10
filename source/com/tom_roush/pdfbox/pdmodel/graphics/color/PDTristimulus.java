package com.tom_roush.pdfbox.pdmodel.graphics.color;

import com.tom_roush.pdfbox.cos.COSArray;
import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSFloat;
import com.tom_roush.pdfbox.cos.COSNumber;
import com.tom_roush.pdfbox.pdmodel.common.COSObjectable;

/* loaded from: classes5.dex */
public final class PDTristimulus implements COSObjectable {

    /* renamed from: a */
    public final COSArray f60472a;

    public PDTristimulus() {
        COSArray cOSArray = new COSArray();
        this.f60472a = cOSArray;
        cOSArray.add((COSBase) new COSFloat(0.0f));
        cOSArray.add((COSBase) new COSFloat(0.0f));
        cOSArray.add((COSBase) new COSFloat(0.0f));
    }

    @Override // com.tom_roush.pdfbox.pdmodel.common.COSObjectable
    public COSBase getCOSObject() {
        return this.f60472a;
    }

    public float getX() {
        return ((COSNumber) this.f60472a.get(0)).floatValue();
    }

    public float getY() {
        return ((COSNumber) this.f60472a.get(1)).floatValue();
    }

    public float getZ() {
        return ((COSNumber) this.f60472a.get(2)).floatValue();
    }

    public void setX(float f) {
        this.f60472a.set(0, (COSBase) new COSFloat(f));
    }

    public void setY(float f) {
        this.f60472a.set(1, (COSBase) new COSFloat(f));
    }

    public void setZ(float f) {
        this.f60472a.set(2, (COSBase) new COSFloat(f));
    }

    public PDTristimulus(COSArray cOSArray) {
        this.f60472a = cOSArray;
    }

    public PDTristimulus(float[] fArr) {
        this.f60472a = new COSArray();
        for (int i = 0; i < fArr.length && i < 3; i++) {
            this.f60472a.add((COSBase) new COSFloat(fArr[i]));
        }
    }
}
