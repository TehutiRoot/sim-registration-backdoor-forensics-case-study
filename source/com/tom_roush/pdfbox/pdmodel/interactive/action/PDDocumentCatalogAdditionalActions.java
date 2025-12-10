package com.tom_roush.pdfbox.pdmodel.interactive.action;

import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.pdmodel.common.COSObjectable;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.StandardStructureTypes;

/* loaded from: classes5.dex */
public class PDDocumentCatalogAdditionalActions implements COSObjectable {

    /* renamed from: a */
    public final COSDictionary f60573a;

    public PDDocumentCatalogAdditionalActions() {
        this.f60573a = new COSDictionary();
    }

    public PDAction getDP() {
        COSDictionary cOSDictionary = (COSDictionary) this.f60573a.getDictionaryObject(OperatorName.MARKED_CONTENT_POINT_WITH_PROPS);
        if (cOSDictionary != null) {
            return PDActionFactory.createAction(cOSDictionary);
        }
        return null;
    }

    public PDAction getDS() {
        COSDictionary cOSDictionary = (COSDictionary) this.f60573a.getDictionaryObject("DS");
        if (cOSDictionary != null) {
            return PDActionFactory.createAction(cOSDictionary);
        }
        return null;
    }

    public PDAction getWC() {
        COSDictionary cOSDictionary = (COSDictionary) this.f60573a.getDictionaryObject("WC");
        if (cOSDictionary != null) {
            return PDActionFactory.createAction(cOSDictionary);
        }
        return null;
    }

    public PDAction getWP() {
        COSDictionary cOSDictionary = (COSDictionary) this.f60573a.getDictionaryObject(StandardStructureTypes.f60297WP);
        if (cOSDictionary != null) {
            return PDActionFactory.createAction(cOSDictionary);
        }
        return null;
    }

    public PDAction getWS() {
        COSDictionary cOSDictionary = (COSDictionary) this.f60573a.getDictionaryObject("WS");
        if (cOSDictionary != null) {
            return PDActionFactory.createAction(cOSDictionary);
        }
        return null;
    }

    public void setDP(PDAction pDAction) {
        this.f60573a.setItem(OperatorName.MARKED_CONTENT_POINT_WITH_PROPS, pDAction);
    }

    public void setDS(PDAction pDAction) {
        this.f60573a.setItem("DS", pDAction);
    }

    public void setWC(PDAction pDAction) {
        this.f60573a.setItem("WC", pDAction);
    }

    public void setWP(PDAction pDAction) {
        this.f60573a.setItem(StandardStructureTypes.f60297WP, pDAction);
    }

    public void setWS(PDAction pDAction) {
        this.f60573a.setItem("WS", pDAction);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.common.COSObjectable
    public COSDictionary getCOSObject() {
        return this.f60573a;
    }

    public PDDocumentCatalogAdditionalActions(COSDictionary cOSDictionary) {
        this.f60573a = cOSDictionary;
    }
}
