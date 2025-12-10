package com.tom_roush.pdfbox.pdmodel.interactive.pagenavigation;

import androidx.exifinterface.media.ExifInterface;
import com.tom_roush.pdfbox.cos.COSArray;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.pdmodel.PDPage;
import com.tom_roush.pdfbox.pdmodel.common.COSObjectable;
import com.tom_roush.pdfbox.pdmodel.common.PDRectangle;

/* loaded from: classes5.dex */
public class PDThreadBead implements COSObjectable {

    /* renamed from: a */
    public final COSDictionary f60736a;

    public PDThreadBead(COSDictionary cOSDictionary) {
        this.f60736a = cOSDictionary;
    }

    public void appendBead(PDThreadBead pDThreadBead) {
        PDThreadBead nextBead = getNextBead();
        nextBead.setPreviousBead(pDThreadBead);
        pDThreadBead.setNextBead(nextBead);
        setNextBead(pDThreadBead);
        pDThreadBead.setPreviousBead(this);
    }

    public PDThreadBead getNextBead() {
        return new PDThreadBead((COSDictionary) this.f60736a.getDictionaryObject("N"));
    }

    public PDPage getPage() {
        COSDictionary cOSDictionary = (COSDictionary) this.f60736a.getDictionaryObject("P");
        if (cOSDictionary != null) {
            return new PDPage(cOSDictionary);
        }
        return null;
    }

    public PDThreadBead getPreviousBead() {
        return new PDThreadBead((COSDictionary) this.f60736a.getDictionaryObject(ExifInterface.GPS_MEASUREMENT_INTERRUPTED));
    }

    public PDRectangle getRectangle() {
        COSArray cOSArray = (COSArray) this.f60736a.getDictionaryObject(COSName.f59819R);
        if (cOSArray != null) {
            return new PDRectangle(cOSArray);
        }
        return null;
    }

    public PDThread getThread() {
        COSDictionary cOSDictionary = (COSDictionary) this.f60736a.getDictionaryObject("T");
        if (cOSDictionary != null) {
            return new PDThread(cOSDictionary);
        }
        return null;
    }

    public final void setNextBead(PDThreadBead pDThreadBead) {
        this.f60736a.setItem("N", pDThreadBead);
    }

    public void setPage(PDPage pDPage) {
        this.f60736a.setItem("P", pDPage);
    }

    public final void setPreviousBead(PDThreadBead pDThreadBead) {
        this.f60736a.setItem(ExifInterface.GPS_MEASUREMENT_INTERRUPTED, pDThreadBead);
    }

    public void setRectangle(PDRectangle pDRectangle) {
        this.f60736a.setItem(COSName.f59819R, pDRectangle);
    }

    public void setThread(PDThread pDThread) {
        this.f60736a.setItem("T", pDThread);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.common.COSObjectable
    public COSDictionary getCOSObject() {
        return this.f60736a;
    }

    public PDThreadBead() {
        COSDictionary cOSDictionary = new COSDictionary();
        this.f60736a = cOSDictionary;
        cOSDictionary.setName("Type", "Bead");
        setNextBead(this);
        setPreviousBead(this);
    }
}
