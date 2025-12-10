package com.tom_roush.pdfbox.pdmodel.documentinterchange.logicalstructure;

import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.pdmodel.PDPage;
import com.tom_roush.pdfbox.pdmodel.common.COSObjectable;

/* loaded from: classes5.dex */
public class PDMarkedContentReference implements COSObjectable {
    public static final String TYPE = "MCR";

    /* renamed from: a */
    public final COSDictionary f60269a;

    public PDMarkedContentReference() {
        COSDictionary cOSDictionary = new COSDictionary();
        this.f60269a = cOSDictionary;
        cOSDictionary.setName(COSName.TYPE, TYPE);
    }

    public int getMCID() {
        return getCOSObject().getInt(COSName.MCID);
    }

    public PDPage getPage() {
        COSDictionary cOSDictionary = (COSDictionary) getCOSObject().getDictionaryObject(COSName.f59816PG);
        if (cOSDictionary != null) {
            return new PDPage(cOSDictionary);
        }
        return null;
    }

    public void setMCID(int i) {
        getCOSObject().setInt(COSName.MCID, i);
    }

    public void setPage(PDPage pDPage) {
        getCOSObject().setItem(COSName.f59816PG, pDPage);
    }

    public String toString() {
        return "mcid=" + getMCID();
    }

    @Override // com.tom_roush.pdfbox.pdmodel.common.COSObjectable
    public COSDictionary getCOSObject() {
        return this.f60269a;
    }

    public PDMarkedContentReference(COSDictionary cOSDictionary) {
        this.f60269a = cOSDictionary;
    }
}
