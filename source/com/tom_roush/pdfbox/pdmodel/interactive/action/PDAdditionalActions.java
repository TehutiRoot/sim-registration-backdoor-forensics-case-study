package com.tom_roush.pdfbox.pdmodel.interactive.action;

import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.pdmodel.common.COSObjectable;

/* loaded from: classes5.dex */
public class PDAdditionalActions implements COSObjectable {

    /* renamed from: a */
    public final COSDictionary f60571a;

    public PDAdditionalActions() {
        this.f60571a = new COSDictionary();
    }

    public PDAction getF() {
        return PDActionFactory.createAction((COSDictionary) this.f60571a.getDictionaryObject(COSName.f59782F));
    }

    public void setF(PDAction pDAction) {
        this.f60571a.setItem(COSName.f59782F, pDAction);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.common.COSObjectable
    public COSDictionary getCOSObject() {
        return this.f60571a;
    }

    public PDAdditionalActions(COSDictionary cOSDictionary) {
        this.f60571a = cOSDictionary;
    }
}
