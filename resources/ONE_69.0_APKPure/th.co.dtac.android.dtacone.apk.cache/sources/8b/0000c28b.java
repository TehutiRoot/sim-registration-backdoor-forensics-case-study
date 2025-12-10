package com.tom_roush.pdfbox.pdmodel.interactive.action;

import androidx.exifinterface.media.ExifInterface;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.pdmodel.common.COSObjectable;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDBorderStyleDictionary;

/* loaded from: classes5.dex */
public class PDAnnotationAdditionalActions implements COSObjectable {

    /* renamed from: a */
    public final COSDictionary f60584a;

    public PDAnnotationAdditionalActions() {
        this.f60584a = new COSDictionary();
    }

    public PDAction getBl() {
        COSDictionary cOSDictionary = (COSDictionary) this.f60584a.getDictionaryObject("Bl");
        if (cOSDictionary != null) {
            return PDActionFactory.createAction(cOSDictionary);
        }
        return null;
    }

    public PDAction getD() {
        COSDictionary cOSDictionary = (COSDictionary) this.f60584a.getDictionaryObject(COSName.f59782D);
        if (cOSDictionary != null) {
            return PDActionFactory.createAction(cOSDictionary);
        }
        return null;
    }

    public PDAction getE() {
        COSDictionary cOSDictionary = (COSDictionary) this.f60584a.getDictionaryObject(ExifInterface.LONGITUDE_EAST);
        if (cOSDictionary != null) {
            return PDActionFactory.createAction(cOSDictionary);
        }
        return null;
    }

    public PDAction getFo() {
        COSDictionary cOSDictionary = (COSDictionary) this.f60584a.getDictionaryObject("Fo");
        if (cOSDictionary != null) {
            return PDActionFactory.createAction(cOSDictionary);
        }
        return null;
    }

    public PDAction getPC() {
        COSDictionary cOSDictionary = (COSDictionary) this.f60584a.getDictionaryObject("PC");
        if (cOSDictionary != null) {
            return PDActionFactory.createAction(cOSDictionary);
        }
        return null;
    }

    public PDAction getPI() {
        COSDictionary cOSDictionary = (COSDictionary) this.f60584a.getDictionaryObject("PI");
        if (cOSDictionary != null) {
            return PDActionFactory.createAction(cOSDictionary);
        }
        return null;
    }

    public PDAction getPO() {
        COSDictionary cOSDictionary = (COSDictionary) this.f60584a.getDictionaryObject("PO");
        if (cOSDictionary != null) {
            return PDActionFactory.createAction(cOSDictionary);
        }
        return null;
    }

    public PDAction getPV() {
        COSDictionary cOSDictionary = (COSDictionary) this.f60584a.getDictionaryObject("PV");
        if (cOSDictionary != null) {
            return PDActionFactory.createAction(cOSDictionary);
        }
        return null;
    }

    public PDAction getU() {
        COSDictionary cOSDictionary = (COSDictionary) this.f60584a.getDictionaryObject(PDBorderStyleDictionary.STYLE_UNDERLINE);
        if (cOSDictionary != null) {
            return PDActionFactory.createAction(cOSDictionary);
        }
        return null;
    }

    public PDAction getX() {
        COSDictionary cOSDictionary = (COSDictionary) this.f60584a.getDictionaryObject("X");
        if (cOSDictionary != null) {
            return PDActionFactory.createAction(cOSDictionary);
        }
        return null;
    }

    public void setBl(PDAction pDAction) {
        this.f60584a.setItem("Bl", pDAction);
    }

    public void setD(PDAction pDAction) {
        this.f60584a.setItem(COSName.f59782D, pDAction);
    }

    public void setE(PDAction pDAction) {
        this.f60584a.setItem(ExifInterface.LONGITUDE_EAST, pDAction);
    }

    public void setFo(PDAction pDAction) {
        this.f60584a.setItem("Fo", pDAction);
    }

    public void setPC(PDAction pDAction) {
        this.f60584a.setItem("PC", pDAction);
    }

    public void setPI(PDAction pDAction) {
        this.f60584a.setItem("PI", pDAction);
    }

    public void setPO(PDAction pDAction) {
        this.f60584a.setItem("PO", pDAction);
    }

    public void setPV(PDAction pDAction) {
        this.f60584a.setItem("PV", pDAction);
    }

    public void setU(PDAction pDAction) {
        this.f60584a.setItem(PDBorderStyleDictionary.STYLE_UNDERLINE, pDAction);
    }

    public void setX(PDAction pDAction) {
        this.f60584a.setItem("X", pDAction);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.common.COSObjectable
    public COSDictionary getCOSObject() {
        return this.f60584a;
    }

    public PDAnnotationAdditionalActions(COSDictionary cOSDictionary) {
        this.f60584a = cOSDictionary;
    }
}