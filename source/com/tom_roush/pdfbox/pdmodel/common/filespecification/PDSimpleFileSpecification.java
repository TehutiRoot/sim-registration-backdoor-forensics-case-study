package com.tom_roush.pdfbox.pdmodel.common.filespecification;

import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSString;

/* loaded from: classes5.dex */
public class PDSimpleFileSpecification extends PDFileSpecification {

    /* renamed from: a */
    public COSString f60184a;

    public PDSimpleFileSpecification() {
        this.f60184a = new COSString("");
    }

    @Override // com.tom_roush.pdfbox.pdmodel.common.COSObjectable
    public COSBase getCOSObject() {
        return this.f60184a;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.common.filespecification.PDFileSpecification
    public String getFile() {
        return this.f60184a.getString();
    }

    @Override // com.tom_roush.pdfbox.pdmodel.common.filespecification.PDFileSpecification
    public void setFile(String str) {
        this.f60184a = new COSString(str);
    }

    public PDSimpleFileSpecification(COSString cOSString) {
        this.f60184a = cOSString;
    }
}
