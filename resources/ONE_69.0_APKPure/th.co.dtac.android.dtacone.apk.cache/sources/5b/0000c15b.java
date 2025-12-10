package com.tom_roush.pdfbox.multipdf;

import android.util.Log;
import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.p019io.MemoryUsageSetting;
import com.tom_roush.pdfbox.pdmodel.PDDocument;
import com.tom_roush.pdfbox.pdmodel.PDDocumentInformation;
import com.tom_roush.pdfbox.pdmodel.PDPage;
import com.tom_roush.pdfbox.pdmodel.interactive.action.PDAction;
import com.tom_roush.pdfbox.pdmodel.interactive.action.PDActionGoTo;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDAnnotation;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDAnnotationLink;
import com.tom_roush.pdfbox.pdmodel.interactive.documentnavigation.destination.PDDestination;
import com.tom_roush.pdfbox.pdmodel.interactive.documentnavigation.destination.PDPageDestination;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes5.dex */
public class Splitter {

    /* renamed from: a */
    public PDDocument f59991a;

    /* renamed from: b */
    public PDDocument f59992b;

    /* renamed from: f */
    public List f59996f;

    /* renamed from: g */
    public int f59997g;

    /* renamed from: c */
    public int f59993c = 1;

    /* renamed from: d */
    public int f59994d = Integer.MIN_VALUE;

    /* renamed from: e */
    public int f59995e = Integer.MAX_VALUE;

    /* renamed from: h */
    public MemoryUsageSetting f59998h = null;

    /* renamed from: a */
    public final void m32694a() {
        if (splitAtPage(this.f59997g) || this.f59992b == null) {
            PDDocument createNewDocument = createNewDocument();
            this.f59992b = createNewDocument;
            this.f59996f.add(createNewDocument);
        }
    }

    /* renamed from: b */
    public final void m32693b(PDPage pDPage) {
        for (PDAnnotation pDAnnotation : pDPage.getAnnotations()) {
            if (pDAnnotation instanceof PDAnnotationLink) {
                PDAnnotationLink pDAnnotationLink = (PDAnnotationLink) pDAnnotation;
                PDDestination destination = pDAnnotationLink.getDestination();
                PDAction action = pDAnnotationLink.getAction();
                if (destination == null && (action instanceof PDActionGoTo)) {
                    destination = ((PDActionGoTo) action).getDestination();
                }
                if (destination instanceof PDPageDestination) {
                    ((PDPageDestination) destination).setPage(null);
                }
            }
            pDAnnotation.setPage(null);
        }
    }

    /* renamed from: c */
    public final void m32692c() {
        Iterator<PDPage> it = this.f59991a.getPages().iterator();
        while (it.hasNext()) {
            PDPage next = it.next();
            int i = this.f59997g;
            if (i + 1 >= this.f59994d && i + 1 <= this.f59995e) {
                processPage(next);
                this.f59997g++;
            } else if (i <= this.f59995e) {
                this.f59997g = i + 1;
            } else {
                return;
            }
        }
    }

    public PDDocument createNewDocument() throws IOException {
        PDDocument pDDocument;
        if (this.f59998h == null) {
            pDDocument = new PDDocument();
        } else {
            pDDocument = new PDDocument(this.f59998h);
        }
        pDDocument.getDocument().setVersion(getSourceDocument().getVersion());
        PDDocumentInformation documentInformation = getSourceDocument().getDocumentInformation();
        if (documentInformation != null) {
            COSDictionary cOSObject = documentInformation.getCOSObject();
            COSDictionary cOSDictionary = new COSDictionary();
            for (COSName cOSName : cOSObject.keySet()) {
                COSBase dictionaryObject = cOSObject.getDictionaryObject(cOSName);
                if (dictionaryObject instanceof COSDictionary) {
                    Log.w("PdfBox-Android", "Nested entry for key '" + cOSName.getName() + "' skipped in document information dictionary");
                    if (this.f59991a.getDocumentCatalog().getCOSObject() == this.f59991a.getDocumentInformation().getCOSObject()) {
                        Log.w("PdfBox-Android", "/Root and /Info share the same dictionary");
                    }
                } else if (!COSName.TYPE.equals(cOSName)) {
                    cOSDictionary.setItem(cOSName, dictionaryObject);
                }
            }
            pDDocument.setDocumentInformation(new PDDocumentInformation(cOSDictionary));
        }
        pDDocument.getDocumentCatalog().setViewerPreferences(getSourceDocument().getDocumentCatalog().getViewerPreferences());
        return pDDocument;
    }

    public final PDDocument getDestinationDocument() {
        return this.f59992b;
    }

    public MemoryUsageSetting getMemoryUsageSetting() {
        return this.f59998h;
    }

    public final PDDocument getSourceDocument() {
        return this.f59991a;
    }

    public void processPage(PDPage pDPage) throws IOException {
        m32694a();
        PDPage importPage = getDestinationDocument().importPage(pDPage);
        if (pDPage.getResources() != null && !pDPage.getCOSObject().containsKey(COSName.RESOURCES)) {
            importPage.setResources(pDPage.getResources());
        }
        m32693b(importPage);
    }

    public void setEndPage(int i) {
        if (i > 0) {
            this.f59995e = i;
            return;
        }
        throw new IllegalArgumentException("End page is smaller than one");
    }

    public void setMemoryUsageSetting(MemoryUsageSetting memoryUsageSetting) {
        this.f59998h = memoryUsageSetting;
    }

    public void setSplitAtPage(int i) {
        if (i > 0) {
            this.f59993c = i;
            return;
        }
        throw new IllegalArgumentException("Number of pages is smaller than one");
    }

    public void setStartPage(int i) {
        if (i > 0) {
            this.f59994d = i;
            return;
        }
        throw new IllegalArgumentException("Start page is smaller than one");
    }

    public List<PDDocument> split(PDDocument pDDocument) throws IOException {
        this.f59997g = 0;
        this.f59996f = new ArrayList();
        this.f59991a = pDDocument;
        m32692c();
        return this.f59996f;
    }

    public boolean splitAtPage(int i) {
        if (((i + 1) - Math.max(1, this.f59994d)) % this.f59993c == 0) {
            return true;
        }
        return false;
    }
}