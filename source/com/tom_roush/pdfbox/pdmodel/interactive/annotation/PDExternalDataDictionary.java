package com.tom_roush.pdfbox.pdmodel.interactive.annotation;

import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.pdmodel.common.COSObjectable;

/* loaded from: classes5.dex */
public class PDExternalDataDictionary implements COSObjectable {

    /* renamed from: a */
    public final COSDictionary f60590a;

    public PDExternalDataDictionary() {
        COSDictionary cOSDictionary = new COSDictionary();
        this.f60590a = cOSDictionary;
        cOSDictionary.setName(COSName.TYPE, "ExData");
    }

    public String getSubtype() {
        return getCOSObject().getNameAsString(COSName.SUBTYPE);
    }

    public String getType() {
        return getCOSObject().getNameAsString(COSName.TYPE, "ExData");
    }

    public void setSubtype(String str) {
        getCOSObject().setName(COSName.SUBTYPE, str);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.common.COSObjectable
    public COSDictionary getCOSObject() {
        return this.f60590a;
    }

    public PDExternalDataDictionary(COSDictionary cOSDictionary) {
        this.f60590a = cOSDictionary;
    }
}
