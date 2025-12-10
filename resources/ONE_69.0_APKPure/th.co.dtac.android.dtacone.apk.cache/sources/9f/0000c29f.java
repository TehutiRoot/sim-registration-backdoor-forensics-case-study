package com.tom_roush.pdfbox.pdmodel.interactive.annotation;

import com.tom_roush.pdfbox.cos.COSArray;
import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.cos.COSStream;
import com.tom_roush.pdfbox.pdmodel.common.COSObjectable;
import com.tom_roush.pdfbox.pdmodel.graphics.color.PDColor;
import com.tom_roush.pdfbox.pdmodel.graphics.color.PDColorSpace;
import com.tom_roush.pdfbox.pdmodel.graphics.color.PDDeviceGray;
import com.tom_roush.pdfbox.pdmodel.graphics.color.PDDeviceRGB;
import com.tom_roush.pdfbox.pdmodel.graphics.form.PDFormXObject;

/* loaded from: classes5.dex */
public class PDAppearanceCharacteristicsDictionary implements COSObjectable {

    /* renamed from: a */
    public final COSDictionary f60597a;

    public PDAppearanceCharacteristicsDictionary(COSDictionary cOSDictionary) {
        this.f60597a = cOSDictionary;
    }

    /* renamed from: a */
    private PDColor m32352a(COSName cOSName) {
        PDColorSpace pDColorSpace;
        COSBase item = getCOSObject().getItem(cOSName);
        if (!(item instanceof COSArray)) {
            return null;
        }
        COSArray cOSArray = (COSArray) item;
        int size = cOSArray.size();
        if (size != 1) {
            if (size != 3) {
                return null;
            }
            pDColorSpace = PDDeviceRGB.INSTANCE;
        } else {
            pDColorSpace = PDDeviceGray.INSTANCE;
        }
        return new PDColor(cOSArray, pDColorSpace);
    }

    public String getAlternateCaption() {
        return getCOSObject().getString(COSName.f59762AC);
    }

    public PDFormXObject getAlternateIcon() {
        COSBase dictionaryObject = getCOSObject().getDictionaryObject(COSName.f59807IX);
        if (dictionaryObject instanceof COSStream) {
            return new PDFormXObject((COSStream) dictionaryObject);
        }
        return null;
    }

    public PDColor getBackground() {
        return m32352a(COSName.f59768BG);
    }

    public PDColor getBorderColour() {
        return m32352a(COSName.f59766BC);
    }

    public String getNormalCaption() {
        return getCOSObject().getString(COSName.f59774CA);
    }

    public PDFormXObject getNormalIcon() {
        COSBase dictionaryObject = getCOSObject().getDictionaryObject(COSName.f59801I);
        if (dictionaryObject instanceof COSStream) {
            return new PDFormXObject((COSStream) dictionaryObject);
        }
        return null;
    }

    public String getRolloverCaption() {
        return getCOSObject().getString(COSName.f59832RC);
    }

    public PDFormXObject getRolloverIcon() {
        COSBase dictionaryObject = getCOSObject().getDictionaryObject(COSName.f59834RI);
        if (dictionaryObject instanceof COSStream) {
            return new PDFormXObject((COSStream) dictionaryObject);
        }
        return null;
    }

    public int getRotation() {
        return getCOSObject().getInt(COSName.f59831R, 0);
    }

    public void setAlternateCaption(String str) {
        getCOSObject().setString(COSName.f59762AC, str);
    }

    public void setBackground(PDColor pDColor) {
        getCOSObject().setItem(COSName.f59768BG, (COSBase) pDColor.toCOSArray());
    }

    public void setBorderColour(PDColor pDColor) {
        getCOSObject().setItem(COSName.f59766BC, (COSBase) pDColor.toCOSArray());
    }

    public void setNormalCaption(String str) {
        getCOSObject().setString(COSName.f59774CA, str);
    }

    public void setRolloverCaption(String str) {
        getCOSObject().setString(COSName.f59832RC, str);
    }

    public void setRotation(int i) {
        getCOSObject().setInt(COSName.f59831R, i);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.common.COSObjectable
    public COSDictionary getCOSObject() {
        return this.f60597a;
    }
}