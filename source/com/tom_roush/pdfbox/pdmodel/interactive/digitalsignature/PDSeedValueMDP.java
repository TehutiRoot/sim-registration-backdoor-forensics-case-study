package com.tom_roush.pdfbox.pdmodel.interactive.digitalsignature;

import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSName;

/* loaded from: classes5.dex */
public class PDSeedValueMDP {

    /* renamed from: a */
    public final COSDictionary f60630a;

    public PDSeedValueMDP() {
        COSDictionary cOSDictionary = new COSDictionary();
        this.f60630a = cOSDictionary;
        cOSDictionary.setDirect(true);
    }

    public COSDictionary getCOSObject() {
        return this.f60630a;
    }

    public int getP() {
        return this.f60630a.getInt(COSName.f59815P);
    }

    public void setP(int i) {
        if (i >= 0 && i <= 3) {
            this.f60630a.setInt(COSName.f59815P, i);
            return;
        }
        throw new IllegalArgumentException("Only values between 0 and 3 nare allowed.");
    }

    public PDSeedValueMDP(COSDictionary cOSDictionary) {
        this.f60630a = cOSDictionary;
        cOSDictionary.setDirect(true);
    }
}
