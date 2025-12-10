package com.tom_roush.pdfbox.pdmodel.interactive.pagenavigation;

import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.pdmodel.PDDocumentInformation;
import com.tom_roush.pdfbox.pdmodel.common.COSObjectable;
import com.tom_roush.pdfbox.pdmodel.interactive.action.PDActionThread;

/* loaded from: classes5.dex */
public class PDThread implements COSObjectable {

    /* renamed from: a */
    public COSDictionary f60735a;

    public PDThread(COSDictionary cOSDictionary) {
        this.f60735a = cOSDictionary;
    }

    public PDThreadBead getFirstBead() {
        COSDictionary cOSDictionary = (COSDictionary) this.f60735a.getDictionaryObject("F");
        if (cOSDictionary != null) {
            return new PDThreadBead(cOSDictionary);
        }
        return null;
    }

    public PDDocumentInformation getThreadInfo() {
        COSDictionary cOSDictionary = (COSDictionary) this.f60735a.getDictionaryObject("I");
        if (cOSDictionary != null) {
            return new PDDocumentInformation(cOSDictionary);
        }
        return null;
    }

    public void setFirstBead(PDThreadBead pDThreadBead) {
        if (pDThreadBead != null) {
            pDThreadBead.setThread(this);
        }
        this.f60735a.setItem("F", pDThreadBead);
    }

    public void setThreadInfo(PDDocumentInformation pDDocumentInformation) {
        this.f60735a.setItem("I", pDDocumentInformation);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.common.COSObjectable
    public COSDictionary getCOSObject() {
        return this.f60735a;
    }

    public PDThread() {
        COSDictionary cOSDictionary = new COSDictionary();
        this.f60735a = cOSDictionary;
        cOSDictionary.setName("Type", PDActionThread.SUB_TYPE);
    }
}
