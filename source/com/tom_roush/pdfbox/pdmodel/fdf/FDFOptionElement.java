package com.tom_roush.pdfbox.pdmodel.fdf;

import com.tom_roush.pdfbox.cos.COSArray;
import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSString;
import com.tom_roush.pdfbox.pdmodel.common.COSObjectable;

/* loaded from: classes5.dex */
public class FDFOptionElement implements COSObjectable {

    /* renamed from: a */
    public final COSArray f60338a;

    public FDFOptionElement() {
        COSArray cOSArray = new COSArray();
        this.f60338a = cOSArray;
        cOSArray.add((COSBase) new COSString(""));
        cOSArray.add((COSBase) new COSString(""));
    }

    public COSArray getCOSArray() {
        return this.f60338a;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.common.COSObjectable
    public COSBase getCOSObject() {
        return this.f60338a;
    }

    public String getDefaultAppearanceString() {
        return ((COSString) this.f60338a.getObject(1)).getString();
    }

    public String getOption() {
        return ((COSString) this.f60338a.getObject(0)).getString();
    }

    public void setDefaultAppearanceString(String str) {
        this.f60338a.set(1, (COSBase) new COSString(str));
    }

    public void setOption(String str) {
        this.f60338a.set(0, (COSBase) new COSString(str));
    }

    public FDFOptionElement(COSArray cOSArray) {
        this.f60338a = cOSArray;
    }
}
