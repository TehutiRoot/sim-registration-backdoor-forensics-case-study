package com.tom_roush.pdfbox.pdmodel.interactive.annotation;

import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.pdmodel.common.COSObjectable;

/* loaded from: classes5.dex */
public class PDBorderEffectDictionary implements COSObjectable {
    public static final String STYLE_CLOUDY = "C";
    public static final String STYLE_SOLID = "S";

    /* renamed from: a */
    public final COSDictionary f60588a;

    public PDBorderEffectDictionary() {
        this.f60588a = new COSDictionary();
    }

    public float getIntensity() {
        return getCOSObject().getFloat("I", 0.0f);
    }

    public String getStyle() {
        return getCOSObject().getNameAsString("S", "S");
    }

    public void setIntensity(float f) {
        getCOSObject().setFloat("I", f);
    }

    public void setStyle(String str) {
        getCOSObject().setName("S", str);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.common.COSObjectable
    public COSDictionary getCOSObject() {
        return this.f60588a;
    }

    public PDBorderEffectDictionary(COSDictionary cOSDictionary) {
        this.f60588a = cOSDictionary;
    }
}
