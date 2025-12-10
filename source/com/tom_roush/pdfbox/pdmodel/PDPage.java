package com.tom_roush.pdfbox.pdmodel;

import android.util.Log;
import com.tom_roush.pdfbox.contentstream.PDContentStream;
import com.tom_roush.pdfbox.cos.COSArray;
import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSFloat;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.cos.COSNumber;
import com.tom_roush.pdfbox.cos.COSStream;
import com.tom_roush.pdfbox.pdmodel.common.COSArrayList;
import com.tom_roush.pdfbox.pdmodel.common.COSObjectable;
import com.tom_roush.pdfbox.pdmodel.common.PDMetadata;
import com.tom_roush.pdfbox.pdmodel.common.PDRectangle;
import com.tom_roush.pdfbox.pdmodel.common.PDStream;
import com.tom_roush.pdfbox.pdmodel.interactive.action.PDPageAdditionalActions;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.AnnotationFilter;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDAnnotation;
import com.tom_roush.pdfbox.pdmodel.interactive.measurement.PDViewportDictionary;
import com.tom_roush.pdfbox.pdmodel.interactive.pagenavigation.PDThreadBead;
import com.tom_roush.pdfbox.pdmodel.interactive.pagenavigation.PDTransition;
import com.tom_roush.pdfbox.util.Matrix;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes5.dex */
public class PDPage implements COSObjectable, PDContentStream {

    /* renamed from: a */
    public final COSDictionary f60118a;

    /* renamed from: b */
    public PDResources f60119b;

    /* renamed from: c */
    public ResourceCache f60120c;

    /* renamed from: d */
    public PDRectangle f60121d;

    /* renamed from: com.tom_roush.pdfbox.pdmodel.PDPage$a */
    /* loaded from: classes5.dex */
    public class C9913a implements AnnotationFilter {
        public C9913a() {
        }

        @Override // com.tom_roush.pdfbox.pdmodel.interactive.annotation.AnnotationFilter
        public boolean accept(PDAnnotation pDAnnotation) {
            return true;
        }
    }

    public PDPage() {
        this(PDRectangle.LETTER);
    }

    /* renamed from: a */
    public final PDRectangle m32603a(PDRectangle pDRectangle) {
        PDRectangle mediaBox = getMediaBox();
        PDRectangle pDRectangle2 = new PDRectangle();
        pDRectangle2.setLowerLeftX(Math.max(mediaBox.getLowerLeftX(), pDRectangle.getLowerLeftX()));
        pDRectangle2.setLowerLeftY(Math.max(mediaBox.getLowerLeftY(), pDRectangle.getLowerLeftY()));
        pDRectangle2.setUpperRightX(Math.min(mediaBox.getUpperRightX(), pDRectangle.getUpperRightX()));
        pDRectangle2.setUpperRightY(Math.min(mediaBox.getUpperRightY(), pDRectangle.getUpperRightY()));
        return pDRectangle2;
    }

    public boolean equals(Object obj) {
        if ((obj instanceof PDPage) && ((PDPage) obj).getCOSObject() == getCOSObject()) {
            return true;
        }
        return false;
    }

    public PDPageAdditionalActions getActions() {
        COSDictionary cOSDictionary;
        COSDictionary cOSDictionary2 = this.f60118a;
        COSName cOSName = COSName.f59749AA;
        COSBase dictionaryObject = cOSDictionary2.getDictionaryObject(cOSName);
        if (dictionaryObject instanceof COSDictionary) {
            cOSDictionary = (COSDictionary) dictionaryObject;
        } else {
            cOSDictionary = new COSDictionary();
            this.f60118a.setItem(cOSName, (COSBase) cOSDictionary);
        }
        return new PDPageAdditionalActions(cOSDictionary);
    }

    public List<PDAnnotation> getAnnotations() throws IOException {
        return getAnnotations(new C9913a());
    }

    public PDRectangle getArtBox() {
        COSBase dictionaryObject = this.f60118a.getDictionaryObject(COSName.ART_BOX);
        if (dictionaryObject instanceof COSArray) {
            return m32603a(new PDRectangle((COSArray) dictionaryObject));
        }
        return getCropBox();
    }

    @Override // com.tom_roush.pdfbox.contentstream.PDContentStream
    public PDRectangle getBBox() {
        return getCropBox();
    }

    public PDRectangle getBleedBox() {
        COSBase dictionaryObject = this.f60118a.getDictionaryObject(COSName.BLEED_BOX);
        if (dictionaryObject instanceof COSArray) {
            return m32603a(new PDRectangle((COSArray) dictionaryObject));
        }
        return getCropBox();
    }

    public Iterator<PDStream> getContentStreams() {
        ArrayList arrayList = new ArrayList();
        COSBase dictionaryObject = this.f60118a.getDictionaryObject(COSName.CONTENTS);
        if (dictionaryObject instanceof COSStream) {
            arrayList.add(new PDStream((COSStream) dictionaryObject));
        } else if (dictionaryObject instanceof COSArray) {
            COSArray cOSArray = (COSArray) dictionaryObject;
            if (cOSArray.size() > 0) {
                for (int i = 0; i < cOSArray.size(); i++) {
                    arrayList.add(new PDStream((COSStream) cOSArray.getObject(i)));
                }
            }
        }
        return arrayList.iterator();
    }

    @Override // com.tom_roush.pdfbox.contentstream.PDContentStream
    public InputStream getContents() throws IOException {
        COSBase dictionaryObject = this.f60118a.getDictionaryObject(COSName.CONTENTS);
        if (dictionaryObject instanceof COSStream) {
            return ((COSStream) dictionaryObject).createInputStream();
        }
        if (dictionaryObject instanceof COSArray) {
            COSArray cOSArray = (COSArray) dictionaryObject;
            if (cOSArray.size() > 0) {
                byte[] bArr = {10};
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < cOSArray.size(); i++) {
                    COSBase object = cOSArray.getObject(i);
                    if (object instanceof COSStream) {
                        arrayList.add(((COSStream) object).createInputStream());
                        arrayList.add(new ByteArrayInputStream(bArr));
                    }
                }
                return new SequenceInputStream(Collections.enumeration(arrayList));
            }
        }
        return new ByteArrayInputStream(new byte[0]);
    }

    public PDRectangle getCropBox() {
        COSBase inheritableAttribute = PDPageTree.getInheritableAttribute(this.f60118a, COSName.CROP_BOX);
        if (inheritableAttribute instanceof COSArray) {
            return m32603a(new PDRectangle((COSArray) inheritableAttribute));
        }
        return getMediaBox();
    }

    @Override // com.tom_roush.pdfbox.contentstream.PDContentStream
    public Matrix getMatrix() {
        return new Matrix();
    }

    public PDRectangle getMediaBox() {
        if (this.f60121d == null) {
            COSBase inheritableAttribute = PDPageTree.getInheritableAttribute(this.f60118a, COSName.MEDIA_BOX);
            if (inheritableAttribute instanceof COSArray) {
                this.f60121d = new PDRectangle((COSArray) inheritableAttribute);
            }
        }
        if (this.f60121d == null) {
            this.f60121d = PDRectangle.LETTER;
        }
        return this.f60121d;
    }

    public PDMetadata getMetadata() {
        COSBase dictionaryObject = this.f60118a.getDictionaryObject(COSName.METADATA);
        if (dictionaryObject instanceof COSStream) {
            return new PDMetadata((COSStream) dictionaryObject);
        }
        return null;
    }

    public ResourceCache getResourceCache() {
        return this.f60120c;
    }

    @Override // com.tom_roush.pdfbox.contentstream.PDContentStream
    public PDResources getResources() {
        if (this.f60119b == null) {
            COSBase inheritableAttribute = PDPageTree.getInheritableAttribute(this.f60118a, COSName.RESOURCES);
            if (inheritableAttribute instanceof COSDictionary) {
                this.f60119b = new PDResources((COSDictionary) inheritableAttribute, this.f60120c);
            }
        }
        return this.f60119b;
    }

    public int getRotation() {
        COSBase inheritableAttribute = PDPageTree.getInheritableAttribute(this.f60118a, COSName.ROTATE);
        if (inheritableAttribute instanceof COSNumber) {
            int intValue = ((COSNumber) inheritableAttribute).intValue();
            if (intValue % 90 == 0) {
                return ((intValue % 360) + 360) % 360;
            }
            return 0;
        }
        return 0;
    }

    public int getStructParents() {
        return this.f60118a.getInt(COSName.STRUCT_PARENTS);
    }

    public List<PDThreadBead> getThreadBeads() {
        PDThreadBead pDThreadBead;
        COSArray cOSArray = (COSArray) this.f60118a.getDictionaryObject(COSName.f59753B);
        if (cOSArray == null) {
            cOSArray = new COSArray();
        }
        ArrayList arrayList = new ArrayList(cOSArray.size());
        for (int i = 0; i < cOSArray.size(); i++) {
            COSBase object = cOSArray.getObject(i);
            if (object instanceof COSDictionary) {
                pDThreadBead = new PDThreadBead((COSDictionary) object);
            } else {
                pDThreadBead = null;
            }
            arrayList.add(pDThreadBead);
        }
        return new COSArrayList(arrayList, cOSArray);
    }

    public PDTransition getTransition() {
        COSBase dictionaryObject = this.f60118a.getDictionaryObject(COSName.TRANS);
        if (dictionaryObject instanceof COSDictionary) {
            return new PDTransition((COSDictionary) dictionaryObject);
        }
        return null;
    }

    public PDRectangle getTrimBox() {
        COSBase dictionaryObject = this.f60118a.getDictionaryObject(COSName.TRIM_BOX);
        if (dictionaryObject instanceof COSArray) {
            return m32603a(new PDRectangle((COSArray) dictionaryObject));
        }
        return getCropBox();
    }

    public float getUserUnit() {
        float f = this.f60118a.getFloat(COSName.USER_UNIT, 1.0f);
        if (f <= 0.0f) {
            return 1.0f;
        }
        return f;
    }

    public List<PDViewportDictionary> getViewports() {
        COSBase dictionaryObject = this.f60118a.getDictionaryObject(COSName.f59845VP);
        if (!(dictionaryObject instanceof COSArray)) {
            return null;
        }
        COSArray cOSArray = (COSArray) dictionaryObject;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < cOSArray.size(); i++) {
            COSBase object = cOSArray.getObject(i);
            if (object instanceof COSDictionary) {
                arrayList.add(new PDViewportDictionary((COSDictionary) object));
            } else {
                Log.w("PdfBox-Android", "Array element " + object + " is skipped, must be a (viewport) dictionary");
            }
        }
        return arrayList;
    }

    public boolean hasContents() {
        COSBase dictionaryObject = this.f60118a.getDictionaryObject(COSName.CONTENTS);
        if (dictionaryObject instanceof COSStream) {
            if (((COSStream) dictionaryObject).size() > 0) {
                return true;
            }
            return false;
        } else if ((dictionaryObject instanceof COSArray) && ((COSArray) dictionaryObject).size() > 0) {
            return true;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.f60118a.hashCode();
    }

    public void setActions(PDPageAdditionalActions pDPageAdditionalActions) {
        this.f60118a.setItem(COSName.f59749AA, pDPageAdditionalActions);
    }

    public void setAnnotations(List<PDAnnotation> list) {
        this.f60118a.setItem(COSName.ANNOTS, (COSBase) COSArrayList.converterToCOSArray(list));
    }

    public void setArtBox(PDRectangle pDRectangle) {
        if (pDRectangle == null) {
            this.f60118a.removeItem(COSName.ART_BOX);
        } else {
            this.f60118a.setItem(COSName.ART_BOX, pDRectangle);
        }
    }

    public void setBleedBox(PDRectangle pDRectangle) {
        if (pDRectangle == null) {
            this.f60118a.removeItem(COSName.BLEED_BOX);
        } else {
            this.f60118a.setItem(COSName.BLEED_BOX, pDRectangle);
        }
    }

    public void setContents(PDStream pDStream) {
        this.f60118a.setItem(COSName.CONTENTS, pDStream);
    }

    public void setCropBox(PDRectangle pDRectangle) {
        if (pDRectangle == null) {
            this.f60118a.removeItem(COSName.CROP_BOX);
        } else {
            this.f60118a.setItem(COSName.CROP_BOX, (COSBase) pDRectangle.getCOSArray());
        }
    }

    public void setMediaBox(PDRectangle pDRectangle) {
        this.f60121d = pDRectangle;
        if (pDRectangle == null) {
            this.f60118a.removeItem(COSName.MEDIA_BOX);
        } else {
            this.f60118a.setItem(COSName.MEDIA_BOX, pDRectangle);
        }
    }

    public void setMetadata(PDMetadata pDMetadata) {
        this.f60118a.setItem(COSName.METADATA, pDMetadata);
    }

    public void setResources(PDResources pDResources) {
        this.f60119b = pDResources;
        if (pDResources != null) {
            this.f60118a.setItem(COSName.RESOURCES, pDResources);
        } else {
            this.f60118a.removeItem(COSName.RESOURCES);
        }
    }

    public void setRotation(int i) {
        this.f60118a.setInt(COSName.ROTATE, i);
    }

    public void setStructParents(int i) {
        this.f60118a.setInt(COSName.STRUCT_PARENTS, i);
    }

    public void setThreadBeads(List<PDThreadBead> list) {
        this.f60118a.setItem(COSName.f59753B, (COSBase) COSArrayList.converterToCOSArray(list));
    }

    public void setTransition(PDTransition pDTransition) {
        this.f60118a.setItem(COSName.TRANS, pDTransition);
    }

    public void setTrimBox(PDRectangle pDRectangle) {
        if (pDRectangle == null) {
            this.f60118a.removeItem(COSName.TRIM_BOX);
        } else {
            this.f60118a.setItem(COSName.TRIM_BOX, pDRectangle);
        }
    }

    public void setUserUnit(float f) {
        if (f > 0.0f) {
            this.f60118a.setFloat(COSName.USER_UNIT, f);
            return;
        }
        throw new IllegalArgumentException("User unit must be positive");
    }

    public void setViewports(List<PDViewportDictionary> list) {
        if (list == null) {
            this.f60118a.removeItem(COSName.f59845VP);
            return;
        }
        COSArray cOSArray = new COSArray();
        for (PDViewportDictionary pDViewportDictionary : list) {
            cOSArray.add(pDViewportDictionary);
        }
        this.f60118a.setItem(COSName.f59845VP, (COSBase) cOSArray);
    }

    public PDPage(PDRectangle pDRectangle) {
        COSDictionary cOSDictionary = new COSDictionary();
        this.f60118a = cOSDictionary;
        cOSDictionary.setItem(COSName.TYPE, (COSBase) COSName.PAGE);
        cOSDictionary.setItem(COSName.MEDIA_BOX, pDRectangle);
    }

    public List<PDAnnotation> getAnnotations(AnnotationFilter annotationFilter) throws IOException {
        COSDictionary cOSDictionary = this.f60118a;
        COSName cOSName = COSName.ANNOTS;
        COSBase dictionaryObject = cOSDictionary.getDictionaryObject(cOSName);
        if (dictionaryObject instanceof COSArray) {
            COSArray cOSArray = (COSArray) dictionaryObject;
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < cOSArray.size(); i++) {
                COSBase object = cOSArray.getObject(i);
                if (object != null) {
                    PDAnnotation createAnnotation = PDAnnotation.createAnnotation(object);
                    if (annotationFilter.accept(createAnnotation)) {
                        arrayList.add(createAnnotation);
                    }
                }
            }
            return new COSArrayList(arrayList, cOSArray);
        }
        return new COSArrayList(this.f60118a, cOSName);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.common.COSObjectable
    public COSDictionary getCOSObject() {
        return this.f60118a;
    }

    public void setContents(List<PDStream> list) {
        COSArray cOSArray = new COSArray();
        for (PDStream pDStream : list) {
            cOSArray.add(pDStream);
        }
        this.f60118a.setItem(COSName.CONTENTS, (COSBase) cOSArray);
    }

    public void setTransition(PDTransition pDTransition, float f) {
        this.f60118a.setItem(COSName.TRANS, pDTransition);
        this.f60118a.setItem(COSName.DUR, (COSBase) new COSFloat(f));
    }

    public PDPage(COSDictionary cOSDictionary) {
        this.f60118a = cOSDictionary;
    }

    public PDPage(COSDictionary cOSDictionary, ResourceCache resourceCache) {
        this.f60118a = cOSDictionary;
        this.f60120c = resourceCache;
    }
}
