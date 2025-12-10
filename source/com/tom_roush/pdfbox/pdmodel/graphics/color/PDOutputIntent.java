package com.tom_roush.pdfbox.pdmodel.graphics.color;

import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.cos.COSStream;
import com.tom_roush.pdfbox.pdmodel.PDDocument;
import com.tom_roush.pdfbox.pdmodel.common.COSObjectable;
import com.tom_roush.pdfbox.pdmodel.common.PDStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes5.dex */
public final class PDOutputIntent implements COSObjectable {

    /* renamed from: a */
    public final COSDictionary f60471a;

    public PDOutputIntent(PDDocument pDDocument, InputStream inputStream) throws IOException {
        COSDictionary cOSDictionary = new COSDictionary();
        this.f60471a = cOSDictionary;
        cOSDictionary.setItem(COSName.TYPE, (COSBase) COSName.OUTPUT_INTENT);
        cOSDictionary.setItem(COSName.f59824S, (COSBase) COSName.GTS_PDFA1);
        cOSDictionary.setItem(COSName.DEST_OUTPUT_PROFILE, m32404a(pDDocument, inputStream));
    }

    /* renamed from: a */
    public final PDStream m32404a(PDDocument pDDocument, InputStream inputStream) {
        PDStream pDStream = new PDStream(pDDocument, inputStream, COSName.FLATE_DECODE);
        pDStream.getStream().setInt(COSName.f59807N, 3);
        return pDStream;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.common.COSObjectable
    public COSBase getCOSObject() {
        return this.f60471a;
    }

    public COSStream getDestOutputIntent() {
        return (COSStream) this.f60471a.getDictionaryObject(COSName.DEST_OUTPUT_PROFILE);
    }

    public String getInfo() {
        return this.f60471a.getString(COSName.INFO);
    }

    public String getOutputCondition() {
        return this.f60471a.getString(COSName.OUTPUT_CONDITION);
    }

    public String getOutputConditionIdentifier() {
        return this.f60471a.getString(COSName.OUTPUT_CONDITION_IDENTIFIER);
    }

    public String getRegistryName() {
        return this.f60471a.getString(COSName.REGISTRY_NAME);
    }

    public void setInfo(String str) {
        this.f60471a.setString(COSName.INFO, str);
    }

    public void setOutputCondition(String str) {
        this.f60471a.setString(COSName.OUTPUT_CONDITION, str);
    }

    public void setOutputConditionIdentifier(String str) {
        this.f60471a.setString(COSName.OUTPUT_CONDITION_IDENTIFIER, str);
    }

    public void setRegistryName(String str) {
        this.f60471a.setString(COSName.REGISTRY_NAME, str);
    }

    public PDOutputIntent(COSDictionary cOSDictionary) {
        this.f60471a = cOSDictionary;
    }
}
