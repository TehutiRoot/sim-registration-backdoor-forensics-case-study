package com.tom_roush.pdfbox.pdmodel.fdf;

import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.pdmodel.common.COSObjectable;
import com.tom_roush.pdfbox.pdmodel.common.filespecification.PDFileSpecification;
import java.io.IOException;

/* loaded from: classes5.dex */
public class FDFNamedPageReference implements COSObjectable {

    /* renamed from: a */
    public final COSDictionary f60337a;

    public FDFNamedPageReference() {
        this.f60337a = new COSDictionary();
    }

    public PDFileSpecification getFileSpecification() throws IOException {
        return PDFileSpecification.createFS(this.f60337a.getDictionaryObject(COSName.f59782F));
    }

    public String getName() {
        return this.f60337a.getString(COSName.NAME);
    }

    public void setFileSpecification(PDFileSpecification pDFileSpecification) {
        this.f60337a.setItem(COSName.f59782F, pDFileSpecification);
    }

    public void setName(String str) {
        this.f60337a.setString(COSName.NAME, str);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.common.COSObjectable
    public COSDictionary getCOSObject() {
        return this.f60337a;
    }

    public FDFNamedPageReference(COSDictionary cOSDictionary) {
        this.f60337a = cOSDictionary;
    }
}
