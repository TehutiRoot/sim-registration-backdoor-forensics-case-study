package com.tom_roush.pdfbox.pdmodel.fdf;

import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.pdmodel.common.COSObjectable;

/* loaded from: classes5.dex */
public class FDFPageInfo implements COSObjectable {

    /* renamed from: a */
    public final COSDictionary f60340a;

    public FDFPageInfo() {
        this.f60340a = new COSDictionary();
    }

    @Override // com.tom_roush.pdfbox.pdmodel.common.COSObjectable
    public COSDictionary getCOSObject() {
        return this.f60340a;
    }

    public FDFPageInfo(COSDictionary cOSDictionary) {
        this.f60340a = cOSDictionary;
    }
}
