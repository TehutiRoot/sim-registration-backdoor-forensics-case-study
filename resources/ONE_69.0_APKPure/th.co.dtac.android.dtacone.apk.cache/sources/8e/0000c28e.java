package com.tom_roush.pdfbox.pdmodel.interactive.action;

import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.pdmodel.common.COSObjectable;

/* loaded from: classes5.dex */
public class PDPageAdditionalActions implements COSObjectable {

    /* renamed from: a */
    public final COSDictionary f60587a;

    public PDPageAdditionalActions() {
        this.f60587a = new COSDictionary();
    }

    public PDAction getC() {
        COSDictionary cOSDictionary = (COSDictionary) this.f60587a.getDictionaryObject("C");
        if (cOSDictionary != null) {
            return PDActionFactory.createAction(cOSDictionary);
        }
        return null;
    }

    public PDAction getO() {
        COSDictionary cOSDictionary = (COSDictionary) this.f60587a.getDictionaryObject(COSName.f59821O);
        if (cOSDictionary != null) {
            return PDActionFactory.createAction(cOSDictionary);
        }
        return null;
    }

    public void setC(PDAction pDAction) {
        this.f60587a.setItem("C", pDAction);
    }

    public void setO(PDAction pDAction) {
        this.f60587a.setItem(COSName.f59821O, pDAction);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.common.COSObjectable
    public COSDictionary getCOSObject() {
        return this.f60587a;
    }

    public PDPageAdditionalActions(COSDictionary cOSDictionary) {
        this.f60587a = cOSDictionary;
    }
}