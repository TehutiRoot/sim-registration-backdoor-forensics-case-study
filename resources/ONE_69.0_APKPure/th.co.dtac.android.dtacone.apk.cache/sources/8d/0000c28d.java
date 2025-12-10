package com.tom_roush.pdfbox.pdmodel.interactive.action;

import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.pdmodel.common.COSObjectable;

/* loaded from: classes5.dex */
public class PDFormFieldAdditionalActions implements COSObjectable {

    /* renamed from: a */
    public final COSDictionary f60586a;

    public PDFormFieldAdditionalActions() {
        this.f60586a = new COSDictionary();
    }

    public PDAction getC() {
        COSDictionary cOSDictionary = (COSDictionary) this.f60586a.getDictionaryObject(COSName.f59771C);
        if (cOSDictionary != null) {
            return PDActionFactory.createAction(cOSDictionary);
        }
        return null;
    }

    public PDAction getF() {
        COSDictionary cOSDictionary = (COSDictionary) this.f60586a.getDictionaryObject(COSName.f59794F);
        if (cOSDictionary != null) {
            return PDActionFactory.createAction(cOSDictionary);
        }
        return null;
    }

    public PDAction getK() {
        COSDictionary cOSDictionary = (COSDictionary) this.f60586a.getDictionaryObject(COSName.f59809K);
        if (cOSDictionary != null) {
            return PDActionFactory.createAction(cOSDictionary);
        }
        return null;
    }

    public PDAction getV() {
        COSDictionary cOSDictionary = (COSDictionary) this.f60586a.getDictionaryObject(COSName.f59855V);
        if (cOSDictionary != null) {
            return PDActionFactory.createAction(cOSDictionary);
        }
        return null;
    }

    public void setC(PDAction pDAction) {
        this.f60586a.setItem(COSName.f59771C, pDAction);
    }

    public void setF(PDAction pDAction) {
        this.f60586a.setItem(COSName.f59794F, pDAction);
    }

    public void setK(PDAction pDAction) {
        this.f60586a.setItem(COSName.f59809K, pDAction);
    }

    public void setV(PDAction pDAction) {
        this.f60586a.setItem(COSName.f59855V, pDAction);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.common.COSObjectable
    public COSDictionary getCOSObject() {
        return this.f60586a;
    }

    public PDFormFieldAdditionalActions(COSDictionary cOSDictionary) {
        this.f60586a = cOSDictionary;
    }
}