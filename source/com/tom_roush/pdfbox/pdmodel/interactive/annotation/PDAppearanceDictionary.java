package com.tom_roush.pdfbox.pdmodel.interactive.annotation;

import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.pdmodel.common.COSObjectable;

/* loaded from: classes5.dex */
public class PDAppearanceDictionary implements COSObjectable {

    /* renamed from: a */
    public final COSDictionary f60586a;

    public PDAppearanceDictionary() {
        COSDictionary cOSDictionary = new COSDictionary();
        this.f60586a = cOSDictionary;
        cOSDictionary.setItem(COSName.f59807N, (COSBase) new COSDictionary());
    }

    public PDAppearanceEntry getDownAppearance() {
        COSBase dictionaryObject = this.f60586a.getDictionaryObject(COSName.f59770D);
        if (dictionaryObject instanceof COSDictionary) {
            return new PDAppearanceEntry(dictionaryObject);
        }
        return getNormalAppearance();
    }

    public PDAppearanceEntry getNormalAppearance() {
        COSBase dictionaryObject = this.f60586a.getDictionaryObject(COSName.f59807N);
        if (dictionaryObject instanceof COSDictionary) {
            return new PDAppearanceEntry(dictionaryObject);
        }
        return null;
    }

    public PDAppearanceEntry getRolloverAppearance() {
        COSBase dictionaryObject = this.f60586a.getDictionaryObject(COSName.f59819R);
        if (dictionaryObject instanceof COSDictionary) {
            return new PDAppearanceEntry(dictionaryObject);
        }
        return getNormalAppearance();
    }

    public void setDownAppearance(PDAppearanceEntry pDAppearanceEntry) {
        this.f60586a.setItem(COSName.f59770D, pDAppearanceEntry);
    }

    public void setNormalAppearance(PDAppearanceEntry pDAppearanceEntry) {
        this.f60586a.setItem(COSName.f59807N, pDAppearanceEntry);
    }

    public void setRolloverAppearance(PDAppearanceEntry pDAppearanceEntry) {
        this.f60586a.setItem(COSName.f59819R, pDAppearanceEntry);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.common.COSObjectable
    public COSDictionary getCOSObject() {
        return this.f60586a;
    }

    public void setDownAppearance(PDAppearanceStream pDAppearanceStream) {
        this.f60586a.setItem(COSName.f59770D, pDAppearanceStream);
    }

    public void setNormalAppearance(PDAppearanceStream pDAppearanceStream) {
        this.f60586a.setItem(COSName.f59807N, pDAppearanceStream);
    }

    public void setRolloverAppearance(PDAppearanceStream pDAppearanceStream) {
        this.f60586a.setItem(COSName.f59819R, pDAppearanceStream);
    }

    public PDAppearanceDictionary(COSDictionary cOSDictionary) {
        this.f60586a = cOSDictionary;
    }
}
