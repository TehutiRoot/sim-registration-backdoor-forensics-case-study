package com.tom_roush.pdfbox.pdmodel.interactive.digitalsignature;

import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSName;

/* loaded from: classes5.dex */
public class PDSeedValueTimeStamp {

    /* renamed from: a */
    public final COSDictionary f60631a;

    public PDSeedValueTimeStamp() {
        COSDictionary cOSDictionary = new COSDictionary();
        this.f60631a = cOSDictionary;
        cOSDictionary.setDirect(true);
    }

    public COSDictionary getCOSObject() {
        return this.f60631a;
    }

    public String getURL() {
        return this.f60631a.getString(COSName.URL);
    }

    public boolean isTimestampRequired() {
        if (this.f60631a.getInt(COSName.f59786FT, 0) == 0) {
            return false;
        }
        return true;
    }

    public void setTimestampRequired(boolean z) {
        this.f60631a.setInt(COSName.f59786FT, z ? 1 : 0);
    }

    public void setURL(String str) {
        this.f60631a.setString(COSName.URL, str);
    }

    public PDSeedValueTimeStamp(COSDictionary cOSDictionary) {
        this.f60631a = cOSDictionary;
        cOSDictionary.setDirect(true);
    }
}
