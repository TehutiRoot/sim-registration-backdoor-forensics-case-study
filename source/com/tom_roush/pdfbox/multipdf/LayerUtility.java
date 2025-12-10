package com.tom_roush.pdfbox.multipdf;

import android.util.Log;
import com.tom_roush.fontbox.util.BoundingBox;
import com.tom_roush.harmony.awt.geom.AffineTransform;
import com.tom_roush.pdfbox.cos.COSArray;
import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.cos.COSStream;
import com.tom_roush.pdfbox.pdmodel.PDDocument;
import com.tom_roush.pdfbox.pdmodel.PDDocumentCatalog;
import com.tom_roush.pdfbox.pdmodel.PDPage;
import com.tom_roush.pdfbox.pdmodel.PDPageContentStream;
import com.tom_roush.pdfbox.pdmodel.PDResources;
import com.tom_roush.pdfbox.pdmodel.common.PDRectangle;
import com.tom_roush.pdfbox.pdmodel.common.PDStream;
import com.tom_roush.pdfbox.pdmodel.graphics.form.PDFormXObject;
import com.tom_roush.pdfbox.pdmodel.graphics.optionalcontent.PDOptionalContentGroup;
import com.tom_roush.pdfbox.pdmodel.graphics.optionalcontent.PDOptionalContentProperties;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDAnnotationMarkup;
import com.tom_roush.pdfbox.util.Matrix;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes5.dex */
public class LayerUtility {

    /* renamed from: c */
    public static final Set f59932c = new HashSet(Arrays.asList(PDAnnotationMarkup.RT_GROUP, "LastModified", "Metadata"));

    /* renamed from: a */
    public final PDDocument f59933a;

    /* renamed from: b */
    public final PDFCloneUtility f59934b;

    public LayerUtility(PDDocument pDDocument) {
        this.f59933a = pDDocument;
        this.f59934b = new PDFCloneUtility(pDDocument);
    }

    /* renamed from: a */
    public final void m32748a(PDDocument pDDocument) {
        PDOptionalContentProperties oCProperties = pDDocument.getDocumentCatalog().getOCProperties();
        if (oCProperties == null) {
            return;
        }
        PDDocumentCatalog documentCatalog = this.f59933a.getDocumentCatalog();
        PDOptionalContentProperties oCProperties2 = documentCatalog.getOCProperties();
        if (oCProperties2 == null) {
            documentCatalog.setOCProperties(new PDOptionalContentProperties((COSDictionary) this.f59934b.cloneForNewDocument(oCProperties)));
        } else {
            this.f59934b.cloneMerge(oCProperties, oCProperties2);
        }
    }

    public PDOptionalContentGroup appendFormAsLayer(PDPage pDPage, PDFormXObject pDFormXObject, AffineTransform affineTransform, String str) throws IOException {
        PDDocumentCatalog documentCatalog = this.f59933a.getDocumentCatalog();
        PDOptionalContentProperties oCProperties = documentCatalog.getOCProperties();
        if (oCProperties == null) {
            oCProperties = new PDOptionalContentProperties();
            documentCatalog.setOCProperties(oCProperties);
        }
        if (!oCProperties.hasGroup(str)) {
            PDRectangle cropBox = pDPage.getCropBox();
            if ((cropBox.getLowerLeftX() < 0.0f || cropBox.getLowerLeftY() < 0.0f) && affineTransform.isIdentity()) {
                Log.w("PdfBox-Android", "Negative cropBox " + cropBox + " and identity transform may make your form invisible");
            }
            PDOptionalContentGroup pDOptionalContentGroup = new PDOptionalContentGroup(str);
            oCProperties.addGroup(pDOptionalContentGroup);
            PDPageContentStream pDPageContentStream = new PDPageContentStream(this.f59933a, pDPage, PDPageContentStream.AppendMode.APPEND, false);
            pDPageContentStream.beginMarkedContent(COSName.f59810OC, pDOptionalContentGroup);
            pDPageContentStream.saveGraphicsState();
            pDPageContentStream.transform(new Matrix(affineTransform));
            pDPageContentStream.drawForm(pDFormXObject);
            pDPageContentStream.restoreGraphicsState();
            pDPageContentStream.endMarkedContent();
            pDPageContentStream.close();
            return pDOptionalContentGroup;
        }
        throw new IllegalArgumentException("Optional group (layer) already exists: " + str);
    }

    /* renamed from: b */
    public final void m32747b(COSDictionary cOSDictionary, COSDictionary cOSDictionary2, Set set) {
        for (Map.Entry<COSName, COSBase> entry : cOSDictionary.entrySet()) {
            COSName key = entry.getKey();
            if (set.contains(key.getName())) {
                cOSDictionary2.setItem(key, this.f59934b.cloneForNewDocument(entry.getValue()));
            }
        }
    }

    public PDDocument getDocument() {
        return this.f59933a;
    }

    public PDFormXObject importPageAsForm(PDDocument pDDocument, int i) throws IOException {
        return importPageAsForm(pDDocument, pDDocument.getPage(i));
    }

    public void wrapInSaveRestore(PDPage pDPage) throws IOException {
        COSStream createCOSStream = getDocument().getDocument().createCOSStream();
        OutputStream createOutputStream = createCOSStream.createOutputStream();
        createOutputStream.write("q\n".getBytes("ISO-8859-1"));
        createOutputStream.close();
        COSStream createCOSStream2 = getDocument().getDocument().createCOSStream();
        OutputStream createOutputStream2 = createCOSStream2.createOutputStream();
        createOutputStream2.write("Q\n".getBytes("ISO-8859-1"));
        createOutputStream2.close();
        COSDictionary cOSObject = pDPage.getCOSObject();
        COSName cOSName = COSName.CONTENTS;
        COSBase dictionaryObject = cOSObject.getDictionaryObject(cOSName);
        if (dictionaryObject instanceof COSStream) {
            COSArray cOSArray = new COSArray();
            cOSArray.add((COSBase) createCOSStream);
            cOSArray.add((COSBase) ((COSStream) dictionaryObject));
            cOSArray.add((COSBase) createCOSStream2);
            cOSObject.setItem(cOSName, (COSBase) cOSArray);
        } else if (dictionaryObject instanceof COSArray) {
            COSArray cOSArray2 = (COSArray) dictionaryObject;
            cOSArray2.add(0, createCOSStream);
            cOSArray2.add((COSBase) createCOSStream2);
        } else {
            throw new IOException("Contents are unknown type: " + dictionaryObject.getClass().getName());
        }
    }

    public PDFormXObject importPageAsForm(PDDocument pDDocument, PDPage pDPage) throws IOException {
        m32748a(pDDocument);
        PDFormXObject pDFormXObject = new PDFormXObject(new PDStream(this.f59933a, pDPage.getContents(), COSName.FLATE_DECODE));
        PDResources resources = pDPage.getResources();
        PDResources pDResources = new PDResources();
        this.f59934b.cloneMerge(resources, pDResources);
        pDFormXObject.setResources(pDResources);
        m32747b(pDPage.getCOSObject(), pDFormXObject.getCOSObject(), f59932c);
        AffineTransform createAffineTransform = pDFormXObject.getMatrix().createAffineTransform();
        PDRectangle mediaBox = pDPage.getMediaBox();
        PDRectangle cropBox = pDPage.getCropBox();
        if (cropBox == null) {
            cropBox = mediaBox;
        }
        int rotation = pDPage.getRotation();
        createAffineTransform.translate(mediaBox.getLowerLeftX() - cropBox.getLowerLeftX(), mediaBox.getLowerLeftY() - cropBox.getLowerLeftY());
        if (rotation == 90) {
            createAffineTransform.scale(cropBox.getWidth() / cropBox.getHeight(), cropBox.getHeight() / cropBox.getWidth());
            createAffineTransform.translate(0.0d, cropBox.getWidth());
            createAffineTransform.rotate(-1.5707963267948966d);
        } else if (rotation == 180) {
            createAffineTransform.translate(cropBox.getWidth(), cropBox.getHeight());
            createAffineTransform.rotate(-3.141592653589793d);
        } else if (rotation == 270) {
            createAffineTransform.scale(cropBox.getWidth() / cropBox.getHeight(), cropBox.getHeight() / cropBox.getWidth());
            createAffineTransform.translate(cropBox.getHeight(), 0.0d);
            createAffineTransform.rotate(-4.71238898038469d);
        }
        createAffineTransform.translate(-cropBox.getLowerLeftX(), -cropBox.getLowerLeftY());
        if (!createAffineTransform.isIdentity()) {
            pDFormXObject.setMatrix(createAffineTransform);
        }
        BoundingBox boundingBox = new BoundingBox();
        boundingBox.setLowerLeftX(cropBox.getLowerLeftX());
        boundingBox.setLowerLeftY(cropBox.getLowerLeftY());
        boundingBox.setUpperRightX(cropBox.getUpperRightX());
        boundingBox.setUpperRightY(cropBox.getUpperRightY());
        pDFormXObject.setBBox(new PDRectangle(boundingBox));
        return pDFormXObject;
    }
}
