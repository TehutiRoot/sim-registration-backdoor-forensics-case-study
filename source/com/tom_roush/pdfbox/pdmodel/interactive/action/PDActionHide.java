package com.tom_roush.pdfbox.pdmodel.interactive.action;

import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSBoolean;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSName;

/* loaded from: classes5.dex */
public class PDActionHide extends PDAction {
    public static final String SUB_TYPE = "Hide";

    public PDActionHide() {
        setSubType(SUB_TYPE);
    }

    public boolean getH() {
        return this.action.getBoolean(COSName.f59788H, true);
    }

    public COSBase getT() {
        return this.action.getDictionaryObject(COSName.f59833T);
    }

    public void setH(boolean z) {
        this.action.setItem(COSName.f59788H, (COSBase) COSBoolean.getBoolean(z));
    }

    public void setT(COSBase cOSBase) {
        this.action.setItem(COSName.f59833T, cOSBase);
    }

    public PDActionHide(COSDictionary cOSDictionary) {
        super(cOSDictionary);
    }
}
