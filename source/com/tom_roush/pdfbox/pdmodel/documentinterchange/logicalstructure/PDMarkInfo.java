package com.tom_roush.pdfbox.pdmodel.documentinterchange.logicalstructure;

import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.pdmodel.common.COSObjectable;

/* loaded from: classes5.dex */
public class PDMarkInfo implements COSObjectable {

    /* renamed from: a */
    public final COSDictionary f60268a;

    public PDMarkInfo() {
        this.f60268a = new COSDictionary();
    }

    public boolean isMarked() {
        return this.f60268a.getBoolean("Marked", false);
    }

    public boolean isSuspect() {
        return this.f60268a.getBoolean("Suspects", false);
    }

    public void setMarked(boolean z) {
        this.f60268a.setBoolean("Marked", z);
    }

    public void setSuspect(boolean z) {
        this.f60268a.setBoolean("Suspects", false);
    }

    public void setUserProperties(boolean z) {
        this.f60268a.setBoolean(PDUserAttributeObject.OWNER_USER_PROPERTIES, z);
    }

    public boolean usesUserProperties() {
        return this.f60268a.getBoolean(PDUserAttributeObject.OWNER_USER_PROPERTIES, false);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.common.COSObjectable
    public COSDictionary getCOSObject() {
        return this.f60268a;
    }

    public PDMarkInfo(COSDictionary cOSDictionary) {
        this.f60268a = cOSDictionary;
    }
}
