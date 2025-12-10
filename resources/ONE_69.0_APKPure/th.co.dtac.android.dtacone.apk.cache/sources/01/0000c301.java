package com.tom_roush.pdfbox.pdmodel.interactive.measurement;

import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.pdmodel.common.COSObjectable;

/* loaded from: classes5.dex */
public class PDMeasureDictionary implements COSObjectable {
    public static final String TYPE = "Measure";

    /* renamed from: a */
    public final COSDictionary f60744a;

    public PDMeasureDictionary() {
        this.f60744a = new COSDictionary();
        getCOSObject().setName(COSName.TYPE, TYPE);
    }

    public String getSubtype() {
        return getCOSObject().getNameAsString(COSName.SUBTYPE, PDRectlinearMeasureDictionary.SUBTYPE);
    }

    public String getType() {
        return TYPE;
    }

    public void setSubtype(String str) {
        getCOSObject().setName(COSName.SUBTYPE, str);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.common.COSObjectable
    public COSDictionary getCOSObject() {
        return this.f60744a;
    }

    public PDMeasureDictionary(COSDictionary cOSDictionary) {
        this.f60744a = cOSDictionary;
    }
}