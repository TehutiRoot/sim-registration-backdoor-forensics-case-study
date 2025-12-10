package com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf;

import com.tom_roush.pdfbox.cos.COSArray;
import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSNull;
import com.tom_roush.pdfbox.pdmodel.common.COSObjectable;
import com.tom_roush.pdfbox.pdmodel.graphics.color.PDGamma;

/* loaded from: classes5.dex */
public class PDFourColours implements COSObjectable {

    /* renamed from: a */
    public final COSArray f60292a;

    public PDFourColours() {
        COSArray cOSArray = new COSArray();
        this.f60292a = cOSArray;
        COSNull cOSNull = COSNull.NULL;
        cOSArray.add((COSBase) cOSNull);
        cOSArray.add((COSBase) cOSNull);
        cOSArray.add((COSBase) cOSNull);
        cOSArray.add((COSBase) cOSNull);
    }

    /* renamed from: a */
    public final PDGamma m32513a(int i) {
        COSBase object = this.f60292a.getObject(i);
        if (object instanceof COSArray) {
            return new PDGamma((COSArray) object);
        }
        return null;
    }

    /* renamed from: b */
    public final void m32512b(int i, PDGamma pDGamma) {
        COSBase cOSArray;
        if (pDGamma == null) {
            cOSArray = COSNull.NULL;
        } else {
            cOSArray = pDGamma.getCOSArray();
        }
        this.f60292a.set(i, cOSArray);
    }

    public PDGamma getAfterColour() {
        return m32513a(1);
    }

    public PDGamma getBeforeColour() {
        return m32513a(0);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.common.COSObjectable
    public COSBase getCOSObject() {
        return this.f60292a;
    }

    public PDGamma getEndColour() {
        return m32513a(3);
    }

    public PDGamma getStartColour() {
        return m32513a(2);
    }

    public void setAfterColour(PDGamma pDGamma) {
        m32512b(1, pDGamma);
    }

    public void setBeforeColour(PDGamma pDGamma) {
        m32512b(0, pDGamma);
    }

    public void setEndColour(PDGamma pDGamma) {
        m32512b(3, pDGamma);
    }

    public void setStartColour(PDGamma pDGamma) {
        m32512b(2, pDGamma);
    }

    public PDFourColours(COSArray cOSArray) {
        this.f60292a = cOSArray;
        if (cOSArray.size() < 4) {
            for (int size = cOSArray.size() - 1; size < 4; size++) {
                this.f60292a.add((COSBase) COSNull.NULL);
            }
        }
    }
}