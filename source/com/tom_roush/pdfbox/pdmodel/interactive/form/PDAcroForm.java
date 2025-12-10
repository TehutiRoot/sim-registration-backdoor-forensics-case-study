package com.tom_roush.pdfbox.pdmodel.interactive.form;

import android.graphics.Path;
import android.graphics.RectF;
import android.util.Log;
import com.tom_roush.pdfbox.cos.COSArray;
import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.cos.COSNumber;
import com.tom_roush.pdfbox.pdmodel.PDDocument;
import com.tom_roush.pdfbox.pdmodel.PDPage;
import com.tom_roush.pdfbox.pdmodel.PDPageContentStream;
import com.tom_roush.pdfbox.pdmodel.PDResources;
import com.tom_roush.pdfbox.pdmodel.common.COSArrayList;
import com.tom_roush.pdfbox.pdmodel.common.COSObjectable;
import com.tom_roush.pdfbox.pdmodel.common.PDRectangle;
import com.tom_roush.pdfbox.pdmodel.fdf.FDFCatalog;
import com.tom_roush.pdfbox.pdmodel.fdf.FDFDictionary;
import com.tom_roush.pdfbox.pdmodel.fdf.FDFDocument;
import com.tom_roush.pdfbox.pdmodel.fdf.FDFField;
import com.tom_roush.pdfbox.pdmodel.graphics.form.PDFormXObject;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDAnnotation;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDAnnotationWidget;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDAppearanceStream;
import com.tom_roush.pdfbox.util.Matrix;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes5.dex */
public final class PDAcroForm implements COSObjectable {

    /* renamed from: a */
    public final PDDocument f60692a;

    /* renamed from: b */
    public final COSDictionary f60693b;

    /* renamed from: c */
    public Map f60694c;

    /* renamed from: d */
    public ScriptingHandler f60695d;

    public PDAcroForm(PDDocument pDDocument) {
        this.f60692a = pDDocument;
        COSDictionary cOSDictionary = new COSDictionary();
        this.f60693b = cOSDictionary;
        cOSDictionary.setItem(COSName.FIELDS, (COSBase) new COSArray());
    }

    /* renamed from: a */
    public final Map m32252a(List list) {
        HashMap hashMap = new HashMap();
        Iterator it = list.iterator();
        boolean z = false;
        while (it.hasNext()) {
            for (PDAnnotationWidget pDAnnotationWidget : ((PDField) it.next()).getWidgets()) {
                PDPage page = pDAnnotationWidget.getPage();
                if (page != null) {
                    m32251b(hashMap, page, pDAnnotationWidget);
                } else {
                    z = true;
                }
            }
        }
        if (!z) {
            return hashMap;
        }
        Log.w("PdfBox-Android", "There has been a widget with a missing page reference, will check all page annotations");
        Iterator<PDPage> it2 = this.f60692a.getPages().iterator();
        while (it2.hasNext()) {
            PDPage next = it2.next();
            for (PDAnnotation pDAnnotation : next.getAnnotations()) {
                if (pDAnnotation instanceof PDAnnotationWidget) {
                    m32251b(hashMap, next, (PDAnnotationWidget) pDAnnotation);
                }
            }
        }
        return hashMap;
    }

    /* renamed from: b */
    public final void m32251b(Map map, PDPage pDPage, PDAnnotationWidget pDAnnotationWidget) {
        if (map.get(pDPage.getCOSObject()) == null) {
            HashSet hashSet = new HashSet();
            hashSet.add(pDAnnotationWidget.getCOSObject());
            map.put(pDPage.getCOSObject(), hashSet);
            return;
        }
        ((Set) map.get(pDPage.getCOSObject())).add(pDAnnotationWidget.getCOSObject());
    }

    /* renamed from: c */
    public PDDocument m32250c() {
        return this.f60692a;
    }

    /* renamed from: d */
    public final RectF m32249d(PDAppearanceStream pDAppearanceStream) {
        Path transform = pDAppearanceStream.getBBox().transform(pDAppearanceStream.getMatrix());
        RectF rectF = new RectF();
        transform.computeBounds(rectF, true);
        return rectF;
    }

    /* renamed from: e */
    public final boolean m32248e(PDAnnotation pDAnnotation) {
        PDAppearanceStream normalAppearanceStream;
        PDRectangle bBox;
        if (pDAnnotation.isInvisible() || pDAnnotation.isHidden() || (normalAppearanceStream = pDAnnotation.getNormalAppearanceStream()) == null || (bBox = normalAppearanceStream.getBBox()) == null || bBox.getWidth() <= 0.0f || bBox.getHeight() <= 0.0f) {
            return false;
        }
        return true;
    }

    public FDFDocument exportFDF() throws IOException {
        FDFDocument fDFDocument = new FDFDocument();
        FDFCatalog catalog = fDFDocument.getCatalog();
        FDFDictionary fDFDictionary = new FDFDictionary();
        catalog.setFDF(fDFDictionary);
        ArrayList arrayList = new ArrayList();
        for (PDField pDField : getFields()) {
            arrayList.add(pDField.mo32231a());
        }
        fDFDictionary.setID(this.f60692a.getDocument().getDocumentID());
        if (!arrayList.isEmpty()) {
            fDFDictionary.setFields(arrayList);
        }
        return fDFDocument;
    }

    /* renamed from: f */
    public final void m32247f(List list) {
        COSBase dictionaryObject;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            PDField pDField = (PDField) it.next();
            if (pDField.getParent() == null) {
                dictionaryObject = this.f60693b.getDictionaryObject(COSName.FIELDS);
            } else {
                dictionaryObject = pDField.getParent().getCOSObject().getDictionaryObject(COSName.KIDS);
            }
            ((COSArray) dictionaryObject).removeObject(pDField.getCOSObject());
        }
    }

    public void flatten() throws IOException {
        if (xfaIsDynamic()) {
            Log.w("PdfBox-Android", "Flatten for a dynamix XFA form is not supported");
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<PDField> it = getFieldTree().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        flatten(arrayList, false);
    }

    /* renamed from: g */
    public final Matrix m32246g(PDAnnotation pDAnnotation, PDAppearanceStream pDAppearanceStream) {
        RectF m32249d = m32249d(pDAppearanceStream);
        PDRectangle rectangle = pDAnnotation.getRectangle();
        Matrix matrix = new Matrix();
        matrix.translate(rectangle.getLowerLeftX() - m32249d.left, rectangle.getLowerLeftY() - m32249d.top);
        matrix.scale(rectangle.getWidth() / m32249d.width(), rectangle.getHeight() / m32249d.height());
        return matrix;
    }

    public String getDefaultAppearance() {
        return this.f60693b.getString(COSName.f59771DA, "");
    }

    public PDResources getDefaultResources() {
        COSBase dictionaryObject = this.f60693b.getDictionaryObject(COSName.f59776DR);
        if (dictionaryObject instanceof COSDictionary) {
            return new PDResources((COSDictionary) dictionaryObject, this.f60692a.getResourceCache());
        }
        return null;
    }

    public PDField getField(String str) {
        Map map = this.f60694c;
        if (map != null) {
            return (PDField) map.get(str);
        }
        Iterator<PDField> it = getFieldTree().iterator();
        while (it.hasNext()) {
            PDField next = it.next();
            if (next.getFullyQualifiedName().equals(str)) {
                return next;
            }
        }
        return null;
    }

    public Iterator<PDField> getFieldIterator() {
        return new PDFieldTree(this).iterator();
    }

    public PDFieldTree getFieldTree() {
        return new PDFieldTree(this);
    }

    public List<PDField> getFields() {
        PDField m32238b;
        COSArray cOSArray = this.f60693b.getCOSArray(COSName.FIELDS);
        if (cOSArray == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < cOSArray.size(); i++) {
            COSDictionary cOSDictionary = (COSDictionary) cOSArray.getObject(i);
            if (cOSDictionary != null && (m32238b = PDField.m32238b(this, cOSDictionary, null)) != null) {
                arrayList.add(m32238b);
            }
        }
        return new COSArrayList(arrayList, cOSArray);
    }

    public boolean getNeedAppearances() {
        return this.f60693b.getBoolean(COSName.NEED_APPEARANCES, false);
    }

    public int getQ() {
        COSNumber cOSNumber = (COSNumber) this.f60693b.getDictionaryObject(COSName.f59818Q);
        if (cOSNumber != null) {
            return cOSNumber.intValue();
        }
        return 0;
    }

    public ScriptingHandler getScriptingHandler() {
        return this.f60695d;
    }

    public PDXFAResource getXFA() {
        COSBase dictionaryObject = this.f60693b.getDictionaryObject(COSName.XFA);
        if (dictionaryObject != null) {
            return new PDXFAResource(dictionaryObject);
        }
        return null;
    }

    public boolean hasXFA() {
        return this.f60693b.containsKey(COSName.XFA);
    }

    public void importFDF(FDFDocument fDFDocument) throws IOException {
        List<FDFField> fields = fDFDocument.getCatalog().getFDF().getFields();
        if (fields != null) {
            for (FDFField fDFField : fields) {
                PDField field = getField(fDFField.getPartialFieldName());
                if (field != null) {
                    field.importFDF(fDFField);
                }
            }
        }
    }

    public boolean isAppendOnly() {
        return this.f60693b.getFlag(COSName.SIG_FLAGS, 2);
    }

    public boolean isCachingFields() {
        if (this.f60694c != null) {
            return true;
        }
        return false;
    }

    public boolean isSignaturesExist() {
        return this.f60693b.getFlag(COSName.SIG_FLAGS, 1);
    }

    public void refreshAppearances() throws IOException {
        Iterator<PDField> it = getFieldTree().iterator();
        while (it.hasNext()) {
            PDField next = it.next();
            if (next instanceof PDTerminalField) {
                ((PDTerminalField) next).mo32230c();
            }
        }
    }

    public void setAppendOnly(boolean z) {
        this.f60693b.setFlag(COSName.SIG_FLAGS, 2, z);
    }

    public void setCacheFields(boolean z) {
        if (z) {
            this.f60694c = new HashMap();
            Iterator<PDField> it = getFieldTree().iterator();
            while (it.hasNext()) {
                PDField next = it.next();
                this.f60694c.put(next.getFullyQualifiedName(), next);
            }
            return;
        }
        this.f60694c = null;
    }

    public void setDefaultAppearance(String str) {
        this.f60693b.setString(COSName.f59771DA, str);
    }

    public void setDefaultResources(PDResources pDResources) {
        this.f60693b.setItem(COSName.f59776DR, pDResources);
    }

    public void setFields(List<PDField> list) {
        this.f60693b.setItem(COSName.FIELDS, (COSBase) COSArrayList.converterToCOSArray(list));
    }

    public void setNeedAppearances(Boolean bool) {
        this.f60693b.setBoolean(COSName.NEED_APPEARANCES, bool.booleanValue());
    }

    public void setQ(int i) {
        this.f60693b.setInt(COSName.f59818Q, i);
    }

    public void setScriptingHandler(ScriptingHandler scriptingHandler) {
        this.f60695d = scriptingHandler;
    }

    public void setSignaturesExist(boolean z) {
        this.f60693b.setFlag(COSName.SIG_FLAGS, 1, z);
    }

    public void setXFA(PDXFAResource pDXFAResource) {
        this.f60693b.setItem(COSName.XFA, pDXFAResource);
    }

    public boolean xfaIsDynamic() {
        if (hasXFA() && getFields().isEmpty()) {
            return true;
        }
        return false;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.common.COSObjectable
    public COSDictionary getCOSObject() {
        return this.f60693b;
    }

    public void refreshAppearances(List<PDField> list) throws IOException {
        for (PDField pDField : list) {
            if (pDField instanceof PDTerminalField) {
                ((PDTerminalField) pDField).mo32230c();
            }
        }
    }

    public PDAcroForm(PDDocument pDDocument, COSDictionary cOSDictionary) {
        this.f60692a = pDDocument;
        this.f60693b = cOSDictionary;
    }

    public void flatten(List<PDField> list, boolean z) throws IOException {
        if (list.isEmpty()) {
            return;
        }
        if (!z && getNeedAppearances()) {
            Log.w("PdfBox-Android", "acroForm.getNeedAppearances() returns true, visual field appearances may not have been set");
            Log.w("PdfBox-Android", "call acroForm.refreshAppearances() or use the flatten() method with refreshAppearances parameter");
        }
        if (xfaIsDynamic()) {
            Log.w("PdfBox-Android", "Flatten for a dynamix XFA form is not supported");
            return;
        }
        if (z) {
            refreshAppearances(list);
        }
        Map m32252a = m32252a(list);
        Iterator<PDPage> it = this.f60692a.getPages().iterator();
        while (it.hasNext()) {
            PDPage next = it.next();
            Set set = (Set) m32252a.get(next.getCOSObject());
            ArrayList arrayList = new ArrayList();
            boolean z2 = false;
            for (PDAnnotation pDAnnotation : next.getAnnotations()) {
                if (set != null && set.contains(pDAnnotation.getCOSObject())) {
                    if (m32248e(pDAnnotation)) {
                        PDPageContentStream pDPageContentStream = new PDPageContentStream(this.f60692a, next, PDPageContentStream.AppendMode.APPEND, true, !z2);
                        try {
                            PDAppearanceStream normalAppearanceStream = pDAnnotation.getNormalAppearanceStream();
                            PDFormXObject pDFormXObject = new PDFormXObject(normalAppearanceStream.getCOSObject());
                            pDPageContentStream.saveGraphicsState();
                            pDPageContentStream.transform(m32246g(pDAnnotation, normalAppearanceStream));
                            pDPageContentStream.drawForm(pDFormXObject);
                            pDPageContentStream.restoreGraphicsState();
                            pDPageContentStream.close();
                            z2 = true;
                        } catch (Throwable th2) {
                            pDPageContentStream.close();
                            throw th2;
                        }
                    } else {
                        continue;
                    }
                } else {
                    arrayList.add(pDAnnotation);
                }
            }
            next.setAnnotations(arrayList);
        }
        m32247f(list);
        this.f60693b.removeItem(COSName.XFA);
    }
}
