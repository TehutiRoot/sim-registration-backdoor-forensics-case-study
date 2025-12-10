package com.tom_roush.pdfbox.pdmodel.interactive.action;

import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.pdmodel.common.COSObjectable;

/* loaded from: classes5.dex */
public class PDURIDictionary implements COSObjectable {

    /* renamed from: a */
    public final COSDictionary f60589a;

    public PDURIDictionary() {
        this.f60589a = new COSDictionary();
    }

    public String getBase() {
        return getCOSObject().getString("Base");
    }

    public void setBase(String str) {
        getCOSObject().setString("Base", str);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.common.COSObjectable
    public COSDictionary getCOSObject() {
        return this.f60589a;
    }

    public PDURIDictionary(COSDictionary cOSDictionary) {
        this.f60589a = cOSDictionary;
    }
}