package com.tom_roush.pdfbox.pdmodel.interactive.action;

import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.pdmodel.common.filespecification.PDFileSpecification;
import java.io.IOException;

/* loaded from: classes5.dex */
public class PDActionThread extends PDAction {
    public static final String SUB_TYPE = "Thread";

    public PDActionThread() {
        setSubType(SUB_TYPE);
    }

    public COSBase getB() {
        return this.action.getDictionaryObject(COSName.f59765B);
    }

    public COSBase getD() {
        return this.action.getDictionaryObject(COSName.f59782D);
    }

    public PDFileSpecification getFile() throws IOException {
        return PDFileSpecification.createFS(this.action.getDictionaryObject(COSName.f59794F));
    }

    public void setB(COSBase cOSBase) {
        this.action.setItem(COSName.f59765B, cOSBase);
    }

    public void setD(COSBase cOSBase) {
        this.action.setItem(COSName.f59782D, cOSBase);
    }

    public void setFile(PDFileSpecification pDFileSpecification) {
        this.action.setItem(COSName.f59794F, pDFileSpecification);
    }

    public PDActionThread(COSDictionary cOSDictionary) {
        super(cOSDictionary);
    }
}