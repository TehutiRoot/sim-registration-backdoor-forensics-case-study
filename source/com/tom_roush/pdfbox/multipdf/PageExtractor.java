package com.tom_roush.pdfbox.multipdf;

import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.pdmodel.PDDocument;
import com.tom_roush.pdfbox.pdmodel.PDPage;
import java.io.IOException;

/* loaded from: classes5.dex */
public class PageExtractor {

    /* renamed from: a */
    public final PDDocument f59976a;

    /* renamed from: b */
    public int f59977b;

    /* renamed from: c */
    public int f59978c;

    public PageExtractor(PDDocument pDDocument) {
        this.f59977b = 1;
        this.f59976a = pDDocument;
        this.f59978c = pDDocument.getNumberOfPages();
    }

    public PDDocument extract() throws IOException {
        PDDocument pDDocument = new PDDocument();
        pDDocument.setDocumentInformation(this.f59976a.getDocumentInformation());
        pDDocument.getDocumentCatalog().setViewerPreferences(this.f59976a.getDocumentCatalog().getViewerPreferences());
        for (int i = this.f59977b; i <= this.f59978c; i++) {
            PDPage page = this.f59976a.getPage(i - 1);
            PDPage importPage = pDDocument.importPage(page);
            if (page.getResources() != null && !page.getCOSObject().containsKey(COSName.RESOURCES)) {
                importPage.setResources(page.getResources());
            }
        }
        return pDDocument;
    }

    public int getEndPage() {
        return this.f59978c;
    }

    public int getStartPage() {
        return this.f59977b;
    }

    public void setEndPage(int i) {
        this.f59978c = i;
    }

    public void setStartPage(int i) {
        this.f59977b = i;
    }

    public PageExtractor(PDDocument pDDocument, int i, int i2) {
        this.f59976a = pDDocument;
        this.f59977b = i;
        this.f59978c = i2;
    }
}
