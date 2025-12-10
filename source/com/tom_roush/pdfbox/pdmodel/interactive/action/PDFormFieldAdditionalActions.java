package com.tom_roush.pdfbox.pdmodel.interactive.action;

import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.pdmodel.common.COSObjectable;

/* loaded from: classes5.dex */
public class PDFormFieldAdditionalActions implements COSObjectable {

    /* renamed from: a */
    public final COSDictionary f60574a;

    public PDFormFieldAdditionalActions() {
        this.f60574a = new COSDictionary();
    }

    public PDAction getC() {
        COSDictionary cOSDictionary = (COSDictionary) this.f60574a.getDictionaryObject(COSName.f59759C);
        if (cOSDictionary != null) {
            return PDActionFactory.createAction(cOSDictionary);
        }
        return null;
    }

    public PDAction getF() {
        COSDictionary cOSDictionary = (COSDictionary) this.f60574a.getDictionaryObject(COSName.f59782F);
        if (cOSDictionary != null) {
            return PDActionFactory.createAction(cOSDictionary);
        }
        return null;
    }

    public PDAction getK() {
        COSDictionary cOSDictionary = (COSDictionary) this.f60574a.getDictionaryObject(COSName.f59797K);
        if (cOSDictionary != null) {
            return PDActionFactory.createAction(cOSDictionary);
        }
        return null;
    }

    public PDAction getV() {
        COSDictionary cOSDictionary = (COSDictionary) this.f60574a.getDictionaryObject(COSName.f59843V);
        if (cOSDictionary != null) {
            return PDActionFactory.createAction(cOSDictionary);
        }
        return null;
    }

    public void setC(PDAction pDAction) {
        this.f60574a.setItem(COSName.f59759C, pDAction);
    }

    public void setF(PDAction pDAction) {
        this.f60574a.setItem(COSName.f59782F, pDAction);
    }

    public void setK(PDAction pDAction) {
        this.f60574a.setItem(COSName.f59797K, pDAction);
    }

    public void setV(PDAction pDAction) {
        this.f60574a.setItem(COSName.f59843V, pDAction);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.common.COSObjectable
    public COSDictionary getCOSObject() {
        return this.f60574a;
    }

    public PDFormFieldAdditionalActions(COSDictionary cOSDictionary) {
        this.f60574a = cOSDictionary;
    }
}
