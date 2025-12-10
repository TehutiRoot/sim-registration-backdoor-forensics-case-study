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
    public final COSDictionary f60585a;

    public PDAppearanceCharacteristicsDictionary(COSDictionary cOSDictionary) {
        this.f60585a = cOSDictionary;
    }

    /* renamed from: a */
    private PDColor m32360a(COSName cOSName) {
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
        return getCOSObject().getString(COSName.f59750AC);
    }

    public PDFormXObject getAlternateIcon() {
        COSBase dictionaryObject = getCOSObject().getDictionaryObject(COSName.f59795IX);
        if (dictionaryObject instanceof COSStream) {
            return new PDFormXObject((COSStream) dictionaryObject);
        }
        return null;
    }

    public PDColor getBackground() {
        return m32360a(COSName.f59756BG);
    }

    public PDColor getBorderColour() {
        return m32360a(COSName.f59754BC);
    }

    public String getNormalCaption() {
        return getCOSObject().getString(COSName.f59762CA);
    }

    public PDFormXObject getNormalIcon() {
        COSBase dictionaryObject = getCOSObject().getDictionaryObject(COSName.f59789I);
        if (dictionaryObject instanceof COSStream) {
            return new PDFormXObject((COSStream) dictionaryObject);
        }
        return null;
    }

    public String getRolloverCaption() {
        return getCOSObject().getString(COSName.f59820RC);
    }

    public PDFormXObject getRolloverIcon() {
        COSBase dictionaryObject = getCOSObject().getDictionaryObject(COSName.f59822RI);
        if (dictionaryObject instanceof COSStream) {
            return new PDFormXObject((COSStream) dictionaryObject);
        }
        return null;
    }

    public int getRotation() {
        return getCOSObject().getInt(COSName.f59819R, 0);
    }

    public void setAlternateCaption(String str) {
        getCOSObject().setString(COSName.f59750AC, str);
    }

    public void setBackground(PDColor pDColor) {
        getCOSObject().setItem(COSName.f59756BG, (COSBase) pDColor.toCOSArray());
    }

    public void setBorderColour(PDColor pDColor) {
        getCOSObject().setItem(COSName.f59754BC, (COSBase) pDColor.toCOSArray());
    }

    public void setNormalCaption(String str) {
        getCOSObject().setString(COSName.f59762CA, str);
    }

    public void setRolloverCaption(String str) {
        getCOSObject().setString(COSName.f59820RC, str);
    }

    public void setRotation(int i) {
        getCOSObject().setInt(COSName.f59819R, i);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.common.COSObjectable
    public COSDictionary getCOSObject() {
        return this.f60585a;
    }
}
