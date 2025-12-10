package com.tom_roush.pdfbox.pdmodel.interactive.pagenavigation;

import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSBoolean;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSFloat;
import com.tom_roush.pdfbox.cos.COSInteger;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.pdmodel.common.PDDictionaryWrapper;

/* loaded from: classes5.dex */
public final class PDTransition extends PDDictionaryWrapper {
    public PDTransition() {
        this(PDTransitionStyle.R);
    }

    public String getDimension() {
        return getCOSObject().getNameAsString(COSName.f59774DM, PDTransitionDimension.H.name());
    }

    public COSBase getDirection() {
        COSBase item = getCOSObject().getItem(COSName.f59772DI);
        if (item == null) {
            return COSInteger.ZERO;
        }
        return item;
    }

    public float getDuration() {
        return getCOSObject().getFloat(COSName.f59770D, 1.0f);
    }

    public float getFlyScale() {
        return getCOSObject().getFloat(COSName.f59828SS, 1.0f);
    }

    public String getMotion() {
        return getCOSObject().getNameAsString(COSName.f59804M, PDTransitionMotion.I.name());
    }

    public String getStyle() {
        return getCOSObject().getNameAsString(COSName.f59824S, PDTransitionStyle.R.name());
    }

    public boolean isFlyAreaOpaque() {
        return getCOSObject().getBoolean(COSName.f59753B, false);
    }

    public void setDimension(PDTransitionDimension pDTransitionDimension) {
        getCOSObject().setName(COSName.f59774DM, pDTransitionDimension.name());
    }

    public void setDirection(PDTransitionDirection pDTransitionDirection) {
        getCOSObject().setItem(COSName.f59772DI, pDTransitionDirection.getCOSBase());
    }

    public void setDuration(float f) {
        getCOSObject().setItem(COSName.f59770D, (COSBase) new COSFloat(f));
    }

    public void setFlyAreaOpaque(boolean z) {
        getCOSObject().setItem(COSName.f59753B, (COSBase) COSBoolean.getBoolean(z));
    }

    public void setFlyScale(float f) {
        getCOSObject().setItem(COSName.f59828SS, (COSBase) new COSFloat(f));
    }

    public void setMotion(PDTransitionMotion pDTransitionMotion) {
        getCOSObject().setName(COSName.f59804M, pDTransitionMotion.name());
    }

    public PDTransition(PDTransitionStyle pDTransitionStyle) {
        getCOSObject().setName(COSName.TYPE, COSName.TRANS.getName());
        getCOSObject().setName(COSName.f59824S, pDTransitionStyle.name());
    }

    public PDTransition(COSDictionary cOSDictionary) {
        super(cOSDictionary);
    }
}
