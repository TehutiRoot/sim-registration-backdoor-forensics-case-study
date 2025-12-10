package com.tom_roush.pdfbox.pdmodel.fdf;

import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.pdmodel.common.COSObjectable;
import com.tom_roush.pdfbox.pdmodel.interactive.digitalsignature.PDSignature;
import java.io.IOException;
import java.io.Writer;
import org.w3c.dom.Element;

/* loaded from: classes5.dex */
public class FDFCatalog implements COSObjectable {

    /* renamed from: a */
    public COSDictionary f60331a;

    public FDFCatalog() {
        this.f60331a = new COSDictionary();
    }

    public FDFDictionary getFDF() {
        COSDictionary cOSDictionary = (COSDictionary) this.f60331a.getDictionaryObject(COSName.FDF);
        if (cOSDictionary != null) {
            return new FDFDictionary(cOSDictionary);
        }
        FDFDictionary fDFDictionary = new FDFDictionary();
        setFDF(fDFDictionary);
        return fDFDictionary;
    }

    public PDSignature getSignature() {
        COSDictionary cOSDictionary = (COSDictionary) this.f60331a.getDictionaryObject(COSName.SIG);
        if (cOSDictionary != null) {
            return new PDSignature(cOSDictionary);
        }
        return null;
    }

    public String getVersion() {
        return this.f60331a.getNameAsString(COSName.VERSION);
    }

    public void setFDF(FDFDictionary fDFDictionary) {
        this.f60331a.setItem(COSName.FDF, fDFDictionary);
    }

    public void setSignature(PDSignature pDSignature) {
        this.f60331a.setItem(COSName.SIG, pDSignature);
    }

    public void setVersion(String str) {
        this.f60331a.setName(COSName.VERSION, str);
    }

    public void writeXML(Writer writer) throws IOException {
        getFDF().writeXML(writer);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.common.COSObjectable
    public COSDictionary getCOSObject() {
        return this.f60331a;
    }

    public FDFCatalog(COSDictionary cOSDictionary) {
        this.f60331a = cOSDictionary;
    }

    public FDFCatalog(Element element) {
        this();
        setFDF(new FDFDictionary(element));
    }
}
