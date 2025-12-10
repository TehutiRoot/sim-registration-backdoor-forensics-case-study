package com.tom_roush.pdfbox.pdmodel.graphics.shading;

import com.tom_roush.pdfbox.cos.COSArray;
import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSName;

/* loaded from: classes5.dex */
public class PDShadingType2 extends PDShading {

    /* renamed from: g */
    public COSArray f60522g;

    /* renamed from: h */
    public COSArray f60523h;

    /* renamed from: i */
    public COSArray f60524i;

    public PDShadingType2(COSDictionary cOSDictionary) {
        super(cOSDictionary);
        this.f60522g = null;
        this.f60523h = null;
        this.f60524i = null;
    }

    public COSArray getCoords() {
        if (this.f60522g == null) {
            this.f60522g = (COSArray) getCOSObject().getDictionaryObject(COSName.COORDS);
        }
        return this.f60522g;
    }

    public COSArray getDomain() {
        if (this.f60523h == null) {
            this.f60523h = (COSArray) getCOSObject().getDictionaryObject(COSName.DOMAIN);
        }
        return this.f60523h;
    }

    public COSArray getExtend() {
        if (this.f60524i == null) {
            this.f60524i = (COSArray) getCOSObject().getDictionaryObject(COSName.EXTEND);
        }
        return this.f60524i;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.graphics.shading.PDShading
    public int getShadingType() {
        return 2;
    }

    public void setCoords(COSArray cOSArray) {
        this.f60522g = cOSArray;
        getCOSObject().setItem(COSName.COORDS, (COSBase) cOSArray);
    }

    public void setDomain(COSArray cOSArray) {
        this.f60523h = cOSArray;
        getCOSObject().setItem(COSName.DOMAIN, (COSBase) cOSArray);
    }

    public void setExtend(COSArray cOSArray) {
        this.f60524i = cOSArray;
        getCOSObject().setItem(COSName.EXTEND, (COSBase) cOSArray);
    }
}
