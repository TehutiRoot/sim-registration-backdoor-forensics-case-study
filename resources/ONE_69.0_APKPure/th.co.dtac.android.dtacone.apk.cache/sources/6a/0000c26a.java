package com.tom_roush.pdfbox.pdmodel.graphics.shading;

import com.tom_roush.pdfbox.cos.COSArray;
import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSName;

/* loaded from: classes5.dex */
public class PDShadingType2 extends PDShading {

    /* renamed from: g */
    public COSArray f60534g;

    /* renamed from: h */
    public COSArray f60535h;

    /* renamed from: i */
    public COSArray f60536i;

    public PDShadingType2(COSDictionary cOSDictionary) {
        super(cOSDictionary);
        this.f60534g = null;
        this.f60535h = null;
        this.f60536i = null;
    }

    public COSArray getCoords() {
        if (this.f60534g == null) {
            this.f60534g = (COSArray) getCOSObject().getDictionaryObject(COSName.COORDS);
        }
        return this.f60534g;
    }

    public COSArray getDomain() {
        if (this.f60535h == null) {
            this.f60535h = (COSArray) getCOSObject().getDictionaryObject(COSName.DOMAIN);
        }
        return this.f60535h;
    }

    public COSArray getExtend() {
        if (this.f60536i == null) {
            this.f60536i = (COSArray) getCOSObject().getDictionaryObject(COSName.EXTEND);
        }
        return this.f60536i;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.graphics.shading.PDShading
    public int getShadingType() {
        return 2;
    }

    public void setCoords(COSArray cOSArray) {
        this.f60534g = cOSArray;
        getCOSObject().setItem(COSName.COORDS, (COSBase) cOSArray);
    }

    public void setDomain(COSArray cOSArray) {
        this.f60535h = cOSArray;
        getCOSObject().setItem(COSName.DOMAIN, (COSBase) cOSArray);
    }

    public void setExtend(COSArray cOSArray) {
        this.f60536i = cOSArray;
        getCOSObject().setItem(COSName.EXTEND, (COSBase) cOSArray);
    }
}