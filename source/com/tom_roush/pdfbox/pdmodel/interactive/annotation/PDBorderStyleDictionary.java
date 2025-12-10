package com.tom_roush.pdfbox.pdmodel.interactive.annotation;

import com.tom_roush.pdfbox.cos.COSArray;
import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSInteger;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.pdmodel.common.COSObjectable;
import com.tom_roush.pdfbox.pdmodel.graphics.PDLineDashPattern;

/* loaded from: classes5.dex */
public class PDBorderStyleDictionary implements COSObjectable {
    public static final String STYLE_BEVELED = "B";
    public static final String STYLE_DASHED = "D";
    public static final String STYLE_INSET = "I";
    public static final String STYLE_SOLID = "S";
    public static final String STYLE_UNDERLINE = "U";

    /* renamed from: a */
    public final COSDictionary f60589a;

    public PDBorderStyleDictionary() {
        this.f60589a = new COSDictionary();
    }

    public PDLineDashPattern getDashStyle() {
        COSDictionary cOSObject = getCOSObject();
        COSName cOSName = COSName.f59770D;
        COSArray cOSArray = (COSArray) cOSObject.getDictionaryObject(cOSName);
        if (cOSArray == null) {
            cOSArray = new COSArray();
            cOSArray.add((COSBase) COSInteger.THREE);
            getCOSObject().setItem(cOSName, (COSBase) cOSArray);
        }
        return new PDLineDashPattern(cOSArray, 0);
    }

    public String getStyle() {
        return getCOSObject().getNameAsString(COSName.f59824S, "S");
    }

    public float getWidth() {
        COSDictionary cOSObject = getCOSObject();
        COSName cOSName = COSName.f59846W;
        if (cOSObject.getDictionaryObject(cOSName) instanceof COSName) {
            return 0.0f;
        }
        return getCOSObject().getFloat(cOSName, 1.0f);
    }

    public void setDashStyle(COSArray cOSArray) {
        getCOSObject().setItem(COSName.f59770D, (COSBase) cOSArray);
    }

    public void setStyle(String str) {
        getCOSObject().setName(COSName.f59824S, str);
    }

    public void setWidth(float f) {
        int i = (int) f;
        if (f == i) {
            getCOSObject().setInt(COSName.f59846W, i);
        } else {
            getCOSObject().setFloat(COSName.f59846W, f);
        }
    }

    @Override // com.tom_roush.pdfbox.pdmodel.common.COSObjectable
    public COSDictionary getCOSObject() {
        return this.f60589a;
    }

    public PDBorderStyleDictionary(COSDictionary cOSDictionary) {
        this.f60589a = cOSDictionary;
    }
}
