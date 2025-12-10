package com.tom_roush.pdfbox.pdmodel.graphics;

import com.tom_roush.pdfbox.cos.COSArray;
import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSFloat;
import com.tom_roush.pdfbox.cos.COSNumber;
import com.tom_roush.pdfbox.pdmodel.common.COSObjectable;
import com.tom_roush.pdfbox.pdmodel.font.PDFont;
import com.tom_roush.pdfbox.pdmodel.font.PDFontFactory;
import java.io.IOException;

/* loaded from: classes5.dex */
public class PDFontSetting implements COSObjectable {

    /* renamed from: a */
    public COSArray f60458a;

    public PDFontSetting() {
        this.f60458a = null;
        COSArray cOSArray = new COSArray();
        this.f60458a = cOSArray;
        cOSArray.add((COSBase) null);
        this.f60458a.add((COSBase) new COSFloat(1.0f));
    }

    @Override // com.tom_roush.pdfbox.pdmodel.common.COSObjectable
    public COSBase getCOSObject() {
        return this.f60458a;
    }

    public PDFont getFont() throws IOException {
        COSBase object = this.f60458a.getObject(0);
        if (object instanceof COSDictionary) {
            return PDFontFactory.createFont((COSDictionary) object);
        }
        return null;
    }

    public float getFontSize() {
        return ((COSNumber) this.f60458a.get(1)).floatValue();
    }

    public void setFont(PDFont pDFont) {
        this.f60458a.set(0, pDFont);
    }

    public void setFontSize(float f) {
        this.f60458a.set(1, (COSBase) new COSFloat(f));
    }

    public PDFontSetting(COSArray cOSArray) {
        this.f60458a = cOSArray;
    }
}
