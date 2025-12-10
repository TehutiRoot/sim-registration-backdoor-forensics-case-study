package com.tom_roush.pdfbox.pdmodel.interactive.digitalsignature;

import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.pdmodel.common.COSObjectable;

/* loaded from: classes5.dex */
public class PDPropBuild implements COSObjectable {

    /* renamed from: a */
    public COSDictionary f60626a;

    public PDPropBuild() {
        COSDictionary cOSDictionary = new COSDictionary();
        this.f60626a = cOSDictionary;
        cOSDictionary.setDirect(true);
    }

    public PDPropBuildDataDict getApp() {
        COSDictionary cOSDictionary = this.f60626a.getCOSDictionary(COSName.APP);
        if (cOSDictionary != null) {
            return new PDPropBuildDataDict(cOSDictionary);
        }
        return null;
    }

    public PDPropBuildDataDict getFilter() {
        COSDictionary cOSDictionary = this.f60626a.getCOSDictionary(COSName.FILTER);
        if (cOSDictionary != null) {
            return new PDPropBuildDataDict(cOSDictionary);
        }
        return null;
    }

    public PDPropBuildDataDict getPubSec() {
        COSDictionary cOSDictionary = this.f60626a.getCOSDictionary(COSName.PUB_SEC);
        if (cOSDictionary != null) {
            return new PDPropBuildDataDict(cOSDictionary);
        }
        return null;
    }

    public void setPDPropBuildApp(PDPropBuildDataDict pDPropBuildDataDict) {
        this.f60626a.setItem(COSName.APP, pDPropBuildDataDict);
    }

    public void setPDPropBuildFilter(PDPropBuildDataDict pDPropBuildDataDict) {
        this.f60626a.setItem(COSName.FILTER, pDPropBuildDataDict);
    }

    public void setPDPropBuildPubSec(PDPropBuildDataDict pDPropBuildDataDict) {
        this.f60626a.setItem(COSName.PUB_SEC, pDPropBuildDataDict);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.common.COSObjectable
    public COSDictionary getCOSObject() {
        return this.f60626a;
    }

    public PDPropBuild(COSDictionary cOSDictionary) {
        this.f60626a = cOSDictionary;
        cOSDictionary.setDirect(true);
    }
}
