package com.tom_roush.pdfbox.multipdf;

import android.util.Log;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.tom_roush.pdfbox.cos.COSArray;
import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.cos.COSObject;
import com.tom_roush.pdfbox.p019io.IOUtils;
import com.tom_roush.pdfbox.p019io.MemoryUsageSetting;
import com.tom_roush.pdfbox.pdmodel.PDDocument;
import com.tom_roush.pdfbox.pdmodel.PDDocumentCatalog;
import com.tom_roush.pdfbox.pdmodel.PDDocumentInformation;
import com.tom_roush.pdfbox.pdmodel.PDPage;
import com.tom_roush.pdfbox.pdmodel.PDResources;
import com.tom_roush.pdfbox.pdmodel.PDStructureElementNameTreeNode;
import com.tom_roush.pdfbox.pdmodel.common.COSObjectable;
import com.tom_roush.pdfbox.pdmodel.common.PDMetadata;
import com.tom_roush.pdfbox.pdmodel.common.PDNameTreeNode;
import com.tom_roush.pdfbox.pdmodel.common.PDNumberTreeNode;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.logicalstructure.PDMarkInfo;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.logicalstructure.PDParentTreeValue;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.logicalstructure.PDStructureElement;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.logicalstructure.PDStructureTreeRoot;
import com.tom_roush.pdfbox.pdmodel.graphics.color.PDOutputIntent;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDAnnotation;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDAnnotationWidget;
import com.tom_roush.pdfbox.pdmodel.interactive.form.PDAcroForm;
import com.tom_roush.pdfbox.pdmodel.interactive.form.PDField;
import com.tom_roush.pdfbox.pdmodel.interactive.form.PDNonTerminalField;
import com.tom_roush.pdfbox.pdmodel.interactive.viewerpreferences.PDViewerPreferences;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes5.dex */
public class PDFMergerUtility {

    /* renamed from: b */
    public String f59980b;

    /* renamed from: c */
    public OutputStream f59981c;

    /* renamed from: d */
    public boolean f59982d = false;

    /* renamed from: e */
    public PDDocumentInformation f59983e = null;

    /* renamed from: f */
    public PDMetadata f59984f = null;

    /* renamed from: g */
    public DocumentMergeMode f59985g = DocumentMergeMode.PDFBOX_LEGACY_MODE;

    /* renamed from: h */
    public AcroFormMergeMode f59986h = AcroFormMergeMode.PDFBOX_LEGACY_MODE;

    /* renamed from: i */
    public int f59987i = 1;

    /* renamed from: a */
    public final List f59979a = new ArrayList();

    /* loaded from: classes5.dex */
    public enum AcroFormMergeMode {
        JOIN_FORM_FIELDS_MODE,
        PDFBOX_LEGACY_MODE
    }

    /* loaded from: classes5.dex */
    public enum DocumentMergeMode {
        OPTIMIZE_RESOURCES_MODE,
        PDFBOX_LEGACY_MODE
    }

    /* renamed from: e */
    public static Map m32715e(PDNameTreeNode pDNameTreeNode) {
        LinkedHashMap linkedHashMap;
        Map names = pDNameTreeNode.getNames();
        if (names == null) {
            linkedHashMap = new LinkedHashMap();
        } else {
            linkedHashMap = new LinkedHashMap(names);
        }
        List<PDNameTreeNode> kids = pDNameTreeNode.getKids();
        if (kids != null) {
            for (PDNameTreeNode pDNameTreeNode2 : kids) {
                linkedHashMap.putAll(m32715e(pDNameTreeNode2));
            }
        }
        return linkedHashMap;
    }

    /* renamed from: f */
    public static Map m32714f(PDNumberTreeNode pDNumberTreeNode) {
        LinkedHashMap linkedHashMap;
        Map<Integer, COSObjectable> numbers = pDNumberTreeNode.getNumbers();
        if (numbers == null) {
            linkedHashMap = new LinkedHashMap();
        } else {
            linkedHashMap = new LinkedHashMap(numbers);
        }
        List<PDNumberTreeNode> kids = pDNumberTreeNode.getKids();
        if (kids != null) {
            for (PDNumberTreeNode pDNumberTreeNode2 : kids) {
                linkedHashMap.putAll(m32714f(pDNumberTreeNode2));
            }
        }
        return linkedHashMap;
    }

    /* renamed from: a */
    public final void m32719a(PDFCloneUtility pDFCloneUtility, PDAcroForm pDAcroForm, PDAcroForm pDAcroForm2) {
        COSArray cOSArray;
        List<PDField> fields = pDAcroForm2.getFields();
        if (fields != null && !fields.isEmpty()) {
            COSBase item = pDAcroForm.getCOSObject().getItem(COSName.FIELDS);
            if (item instanceof COSArray) {
                cOSArray = (COSArray) item;
            } else {
                cOSArray = new COSArray();
            }
            Iterator<PDField> it = pDAcroForm2.getFieldTree().iterator();
            while (it.hasNext()) {
                PDField next = it.next();
                PDField field = pDAcroForm.getField(next.getFullyQualifiedName());
                if (field == null) {
                    cOSArray.add((COSBase) ((COSDictionary) pDFCloneUtility.cloneForNewDocument(next.getCOSObject())));
                } else {
                    m32709k(pDFCloneUtility, field, next);
                }
            }
            pDAcroForm.getCOSObject().setItem(COSName.FIELDS, (COSBase) cOSArray);
        }
    }

    public void addSource(String str) throws FileNotFoundException {
        addSource(new File(str));
    }

    public void addSources(List<InputStream> list) {
        this.f59979a.addAll(list);
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x027b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x028b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x029f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x043e  */
    /* JADX WARN: Removed duplicated region for block: B:204:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void appendDocument(com.tom_roush.pdfbox.pdmodel.PDDocument r25, com.tom_roush.pdfbox.pdmodel.PDDocument r26) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1207
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tom_roush.pdfbox.multipdf.PDFMergerUtility.appendDocument(com.tom_roush.pdfbox.pdmodel.PDDocument, com.tom_roush.pdfbox.pdmodel.PDDocument):void");
    }

    /* renamed from: b */
    public final void m32718b(PDFCloneUtility pDFCloneUtility, PDAcroForm pDAcroForm, PDAcroForm pDAcroForm2) {
        COSArray cOSArray;
        List<PDField> fields = pDAcroForm2.getFields();
        if (fields != null && !fields.isEmpty()) {
            Iterator<PDField> it = pDAcroForm.getFieldTree().iterator();
            while (it.hasNext()) {
                String partialName = it.next().getPartialName();
                if (partialName.startsWith("dummyFieldName")) {
                    String substring = partialName.substring(14);
                    if (substring.matches("\\d+")) {
                        this.f59987i = Math.max(this.f59987i, Integer.parseInt(substring) + 1);
                    }
                }
            }
            COSBase item = pDAcroForm.getCOSObject().getItem(COSName.FIELDS);
            if (item instanceof COSArray) {
                cOSArray = (COSArray) item;
            } else {
                cOSArray = new COSArray();
            }
            for (PDField pDField : pDAcroForm2.getFields()) {
                COSDictionary cOSDictionary = (COSDictionary) pDFCloneUtility.cloneForNewDocument(pDField.getCOSObject());
                if (pDAcroForm.getField(pDField.getFullyQualifiedName()) != null) {
                    COSName cOSName = COSName.f59845T;
                    StringBuilder sb = new StringBuilder();
                    sb.append("dummyFieldName");
                    int i = this.f59987i;
                    this.f59987i = i + 1;
                    sb.append(i);
                    cOSDictionary.setString(cOSName, sb.toString());
                }
                cOSArray.add((COSBase) cOSDictionary);
            }
            pDAcroForm.getCOSObject().setItem(COSName.FIELDS, (COSBase) cOSArray);
        }
    }

    /* renamed from: c */
    public final void m32717c(COSDictionary cOSDictionary) {
        cOSDictionary.removeItem(COSName.f59794F);
        cOSDictionary.removeItem(COSName.f59817MK);
        cOSDictionary.removeItem(COSName.f59827P);
        cOSDictionary.removeItem(COSName.RECT);
        cOSDictionary.removeItem(COSName.SUBTYPE);
        cOSDictionary.removeItem(COSName.TYPE);
    }

    /* renamed from: d */
    public final void m32716d(COSDictionary cOSDictionary, boolean z) {
        if (z) {
            cOSDictionary.removeItem(COSName.f59783DA);
        }
        cOSDictionary.removeItem(COSName.f59798FT);
        cOSDictionary.removeItem(COSName.f59845T);
        cOSDictionary.removeItem(COSName.f59855V);
    }

    /* renamed from: g */
    public final boolean m32713g(COSArray cOSArray) {
        for (int i = 0; i < cOSArray.size(); i++) {
            COSBase object = cOSArray.getObject(i);
            if (!(object instanceof COSDictionary)) {
                return false;
            }
            COSName cOSName = ((COSDictionary) object).getCOSName(COSName.f59836S);
            if (!COSName.DOCUMENT.equals(cOSName) && !COSName.PART.equals(cOSName)) {
                return false;
            }
        }
        return true;
    }

    public AcroFormMergeMode getAcroFormMergeMode() {
        return this.f59986h;
    }

    public PDDocumentInformation getDestinationDocumentInformation() {
        return this.f59983e;
    }

    public String getDestinationFileName() {
        return this.f59980b;
    }

    public PDMetadata getDestinationMetadata() {
        return this.f59984f;
    }

    public OutputStream getDestinationStream() {
        return this.f59981c;
    }

    public DocumentMergeMode getDocumentMergeMode() {
        return this.f59985g;
    }

    /* renamed from: h */
    public final boolean m32712h(PDAcroForm pDAcroForm) {
        if (pDAcroForm != null && pDAcroForm.xfaIsDynamic()) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public final void m32711i(MemoryUsageSetting memoryUsageSetting) {
        PDDocument pDDocument;
        MemoryUsageSetting memoryUsageSetting2;
        PDDocument load;
        if (this.f59979a.size() > 0) {
            ArrayList<PDDocument> arrayList = new ArrayList(this.f59979a.size());
            try {
                if (memoryUsageSetting != null) {
                    memoryUsageSetting2 = memoryUsageSetting.getPartitionedCopy(this.f59979a.size() + 1);
                } else {
                    memoryUsageSetting2 = MemoryUsageSetting.setupMainMemoryOnly();
                }
                pDDocument = new PDDocument(memoryUsageSetting2);
                try {
                    for (Object obj : this.f59979a) {
                        if (obj instanceof File) {
                            load = PDDocument.load((File) obj, memoryUsageSetting2);
                        } else {
                            load = PDDocument.load((InputStream) obj, memoryUsageSetting2);
                        }
                        arrayList.add(load);
                        appendDocument(pDDocument, load);
                    }
                    PDDocumentInformation pDDocumentInformation = this.f59983e;
                    if (pDDocumentInformation != null) {
                        pDDocument.setDocumentInformation(pDDocumentInformation);
                    }
                    if (this.f59984f != null) {
                        pDDocument.getDocumentCatalog().setMetadata(this.f59984f);
                    }
                    OutputStream outputStream = this.f59981c;
                    if (outputStream == null) {
                        pDDocument.save(this.f59980b);
                    } else {
                        pDDocument.save(outputStream);
                    }
                    IOUtils.closeAndLogException(pDDocument, "PDDocument", null);
                    for (PDDocument pDDocument2 : arrayList) {
                        IOUtils.closeAndLogException(pDDocument2, "PDDocument", null);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (pDDocument != null) {
                        IOUtils.closeAndLogException(pDDocument, "PDDocument", null);
                    }
                    for (PDDocument pDDocument3 : arrayList) {
                        IOUtils.closeAndLogException(pDDocument3, "PDDocument", null);
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                pDDocument = null;
            }
        }
    }

    public boolean isIgnoreAcroFormErrors() {
        return this.f59982d;
    }

    /* renamed from: j */
    public final void m32710j(PDFCloneUtility pDFCloneUtility, PDDocumentCatalog pDDocumentCatalog, PDDocumentCatalog pDDocumentCatalog2) {
        try {
            PDAcroForm acroForm = pDDocumentCatalog.getAcroForm();
            PDAcroForm acroForm2 = pDDocumentCatalog2.getAcroForm();
            if (acroForm == null && acroForm2 != null) {
                pDDocumentCatalog.getCOSObject().setItem(COSName.ACRO_FORM, pDFCloneUtility.cloneForNewDocument(acroForm2.getCOSObject()));
            } else if (acroForm2 != null) {
                AcroFormMergeMode acroFormMergeMode = this.f59986h;
                if (acroFormMergeMode == AcroFormMergeMode.PDFBOX_LEGACY_MODE) {
                    m32718b(pDFCloneUtility, acroForm, acroForm2);
                } else if (acroFormMergeMode == AcroFormMergeMode.JOIN_FORM_FIELDS_MODE) {
                    m32719a(pDFCloneUtility, acroForm, acroForm2);
                }
            }
        } catch (IOException e) {
            if (this.f59982d) {
                return;
            }
            throw new IOException(e);
        }
    }

    /* renamed from: k */
    public final void m32709k(PDFCloneUtility pDFCloneUtility, PDField pDField, PDField pDField2) {
        if ((pDField instanceof PDNonTerminalField) && (pDField2 instanceof PDNonTerminalField)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Skipping non terminal field ");
            sb.append(pDField2.getFullyQualifiedName());
        } else if (pDField.getFieldType() == "Tx" && pDField.getFieldType() == "Tx") {
            COSDictionary cOSObject = pDField.getCOSObject();
            COSName cOSName = COSName.KIDS;
            if (cOSObject.containsKey(cOSName)) {
                COSArray cOSArray = pDField.getCOSObject().getCOSArray(cOSName);
                for (PDAnnotationWidget pDAnnotationWidget : pDField2.getWidgets()) {
                    try {
                        cOSArray.add(pDFCloneUtility.cloneForNewDocument(pDAnnotationWidget.getCOSObject()));
                    } catch (IOException unused) {
                        Log.w("PdfBox-Android", "Unable to clone widget for source field " + pDField2.getFullyQualifiedName());
                    }
                }
                return;
            }
            COSArray cOSArray2 = new COSArray();
            try {
                COSDictionary cOSDictionary = (COSDictionary) pDFCloneUtility.cloneForNewDocument(pDField.getWidgets().get(0));
                m32716d(cOSDictionary, true);
                cOSDictionary.setItem(COSName.PARENT, pDField);
                cOSArray2.add((COSBase) cOSDictionary);
                for (PDAnnotationWidget pDAnnotationWidget2 : pDField2.getWidgets()) {
                    try {
                        COSDictionary cOSDictionary2 = (COSDictionary) pDFCloneUtility.cloneForNewDocument(pDAnnotationWidget2.getCOSObject());
                        m32716d(cOSDictionary2, false);
                        cOSDictionary2.setItem(COSName.PARENT, pDField);
                        cOSArray2.add((COSBase) cOSDictionary2);
                    } catch (IOException unused2) {
                        Log.w("PdfBox-Android", "Unable to clone widget for source field " + pDField2.getFullyQualifiedName());
                    }
                }
                pDField.getCOSObject().setItem(COSName.KIDS, (COSBase) cOSArray2);
                m32717c(pDField.getCOSObject());
            } catch (IOException unused3) {
                Log.w("PdfBox-Android", "Unable to clone widget for destination field " + pDField.getFullyQualifiedName());
            }
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Skipping merging of ");
            sb2.append(pDField2.getFullyQualifiedName());
            sb2.append(" into ");
            sb2.append(pDField.getFullyQualifiedName());
        }
    }

    /* renamed from: l */
    public final void m32708l(PDFCloneUtility pDFCloneUtility, PDStructureTreeRoot pDStructureTreeRoot, PDStructureTreeRoot pDStructureTreeRoot2) {
        PDNameTreeNode<PDStructureElement> iDTree = pDStructureTreeRoot.getIDTree();
        if (iDTree == null) {
            return;
        }
        PDNameTreeNode<PDStructureElement> iDTree2 = pDStructureTreeRoot2.getIDTree();
        if (iDTree2 == null) {
            iDTree2 = new PDStructureElementNameTreeNode();
        }
        Map m32715e = m32715e(iDTree);
        Map<String, PDStructureElement> m32715e2 = m32715e(iDTree2);
        for (Map.Entry entry : m32715e.entrySet()) {
            if (m32715e2.containsKey(entry.getKey())) {
                Log.w("PdfBox-Android", "key " + ((String) entry.getKey()) + " already exists in destination IDTree");
            } else {
                m32715e2.put(entry.getKey(), new PDStructureElement((COSDictionary) pDFCloneUtility.cloneForNewDocument(((PDStructureElement) entry.getValue()).getCOSObject())));
            }
        }
        PDNameTreeNode<PDStructureElement> pDStructureElementNameTreeNode = new PDStructureElementNameTreeNode();
        pDStructureElementNameTreeNode.setNames(m32715e2);
        pDStructureTreeRoot2.setIDTree(pDStructureElementNameTreeNode);
    }

    /* renamed from: m */
    public final void m32707m(COSDictionary cOSDictionary, COSDictionary cOSDictionary2, Set set) {
        for (Map.Entry<COSName, COSBase> entry : cOSDictionary.entrySet()) {
            if (!set.contains(entry.getKey()) && !cOSDictionary2.containsKey(entry.getKey())) {
                cOSDictionary2.setItem(entry.getKey(), entry.getValue());
            }
        }
    }

    @Deprecated
    public void mergeDocuments() throws IOException {
        mergeDocuments(MemoryUsageSetting.setupMainMemoryOnly());
    }

    /* renamed from: n */
    public final void m32706n(PDFCloneUtility pDFCloneUtility, PDStructureTreeRoot pDStructureTreeRoot, PDStructureTreeRoot pDStructureTreeRoot2) {
        COSArray cOSArray;
        COSBase k = pDStructureTreeRoot.getK();
        COSArray cOSArray2 = new COSArray();
        COSBase cloneForNewDocument = pDFCloneUtility.cloneForNewDocument(k);
        if (cloneForNewDocument instanceof COSArray) {
            cOSArray2.addAll((COSArray) cloneForNewDocument);
        } else if (cloneForNewDocument instanceof COSDictionary) {
            cOSArray2.add(cloneForNewDocument);
        }
        if (cOSArray2.size() == 0) {
            return;
        }
        COSArray cOSArray3 = new COSArray();
        COSBase k2 = pDStructureTreeRoot2.getK();
        if (k2 instanceof COSArray) {
            cOSArray3.addAll((COSArray) k2);
        } else if (k2 instanceof COSDictionary) {
            cOSArray3.add(k2);
        }
        if (cOSArray3.size() == 1 && (cOSArray3.getObject(0) instanceof COSDictionary)) {
            COSDictionary cOSDictionary = (COSDictionary) cOSArray3.getObject(0);
            if (COSName.DOCUMENT.equals(cOSDictionary.getCOSName(COSName.f59836S)) && (cOSArray = cOSDictionary.getCOSArray(COSName.f59809K)) != null && m32713g(cOSArray)) {
                cOSArray.addAll(cOSArray2);
                m32696x(cOSArray, cOSDictionary, COSName.PART);
                return;
            }
        }
        COSName cOSName = null;
        if (cOSArray3.size() == 0) {
            m32696x(cOSArray2, pDStructureTreeRoot2.getCOSObject(), null);
            pDStructureTreeRoot2.setK(cOSArray2);
            return;
        }
        cOSArray3.addAll(cOSArray2);
        COSDictionary cOSDictionary2 = new COSDictionary();
        if (m32713g(cOSArray3)) {
            cOSName = COSName.PART;
        }
        m32696x(cOSArray3, cOSDictionary2, cOSName);
        cOSDictionary2.setItem(COSName.f59809K, (COSBase) cOSArray3);
        cOSDictionary2.setItem(COSName.f59827P, pDStructureTreeRoot2);
        cOSDictionary2.setItem(COSName.f59836S, COSName.DOCUMENT);
        pDStructureTreeRoot2.setK(cOSDictionary2);
    }

    /* renamed from: o */
    public final void m32705o(PDDocumentCatalog pDDocumentCatalog, PDDocumentCatalog pDDocumentCatalog2) {
        String language;
        if (pDDocumentCatalog.getLanguage() == null && (language = pDDocumentCatalog2.getLanguage()) != null) {
            pDDocumentCatalog.setLanguage(language);
        }
    }

    /* renamed from: p */
    public final void m32704p(PDDocumentCatalog pDDocumentCatalog, PDDocumentCatalog pDDocumentCatalog2) {
        boolean z;
        PDMarkInfo markInfo = pDDocumentCatalog.getMarkInfo();
        PDMarkInfo markInfo2 = pDDocumentCatalog2.getMarkInfo();
        if (markInfo == null) {
            markInfo = new PDMarkInfo();
        }
        if (markInfo2 == null) {
            markInfo2 = new PDMarkInfo();
        }
        boolean z2 = true;
        markInfo.setMarked(true);
        if (!markInfo2.isSuspect() && !markInfo.isSuspect()) {
            z = false;
        } else {
            z = true;
        }
        markInfo.setSuspect(z);
        if (!markInfo2.usesUserProperties() && !markInfo.usesUserProperties()) {
            z2 = false;
        }
        markInfo.setSuspect(z2);
        pDDocumentCatalog.setMarkInfo(markInfo);
    }

    /* renamed from: q */
    public final void m32703q(PDFCloneUtility pDFCloneUtility, PDDocumentCatalog pDDocumentCatalog, PDDocumentCatalog pDDocumentCatalog2) {
        List<PDOutputIntent> outputIntents = pDDocumentCatalog.getOutputIntents();
        List<PDOutputIntent> outputIntents2 = pDDocumentCatalog2.getOutputIntents();
        for (PDOutputIntent pDOutputIntent : outputIntents) {
            String outputConditionIdentifier = pDOutputIntent.getOutputConditionIdentifier();
            if (outputConditionIdentifier != null && !TypedValues.Custom.NAME.equals(outputConditionIdentifier)) {
                for (PDOutputIntent pDOutputIntent2 : outputIntents2) {
                    if (pDOutputIntent2.getOutputConditionIdentifier().equals(outputConditionIdentifier)) {
                        break;
                    }
                }
            }
            pDDocumentCatalog2.addOutputIntent(new PDOutputIntent((COSDictionary) pDFCloneUtility.cloneForNewDocument(pDOutputIntent)));
            outputIntents2.add(pDOutputIntent);
        }
    }

    /* renamed from: r */
    public final void m32702r(PDStructureTreeRoot pDStructureTreeRoot, PDStructureTreeRoot pDStructureTreeRoot2) {
        COSDictionary cOSObject = pDStructureTreeRoot.getCOSObject();
        COSName cOSName = COSName.ROLE_MAP;
        COSDictionary cOSDictionary = cOSObject.getCOSDictionary(cOSName);
        COSDictionary cOSDictionary2 = pDStructureTreeRoot2.getCOSObject().getCOSDictionary(cOSName);
        if (cOSDictionary == null) {
            return;
        }
        if (cOSDictionary2 == null) {
            pDStructureTreeRoot2.getCOSObject().setItem(cOSName, (COSBase) cOSDictionary);
            return;
        }
        for (Map.Entry<COSName, COSBase> entry : cOSDictionary.entrySet()) {
            COSBase dictionaryObject = cOSDictionary2.getDictionaryObject(entry.getKey());
            if (dictionaryObject == null || !dictionaryObject.equals(entry.getValue())) {
                if (cOSDictionary2.containsKey(entry.getKey())) {
                    Log.w("PdfBox-Android", "key " + entry.getKey() + " already exists in destination RoleMap");
                } else {
                    cOSDictionary2.setItem(entry.getKey(), entry.getValue());
                }
            }
        }
    }

    /* renamed from: s */
    public final void m32701s(PDDocumentCatalog pDDocumentCatalog, PDDocumentCatalog pDDocumentCatalog2) {
        PDViewerPreferences viewerPreferences = pDDocumentCatalog2.getViewerPreferences();
        if (viewerPreferences == null) {
            return;
        }
        PDViewerPreferences viewerPreferences2 = pDDocumentCatalog.getViewerPreferences();
        if (viewerPreferences2 == null) {
            viewerPreferences2 = new PDViewerPreferences(new COSDictionary());
            pDDocumentCatalog.setViewerPreferences(viewerPreferences2);
        }
        m32707m(viewerPreferences.getCOSObject(), viewerPreferences2.getCOSObject(), Collections.emptySet());
        if (viewerPreferences.hideToolbar() || viewerPreferences2.hideToolbar()) {
            viewerPreferences2.setHideToolbar(true);
        }
        if (viewerPreferences.hideMenubar() || viewerPreferences2.hideMenubar()) {
            viewerPreferences2.setHideMenubar(true);
        }
        if (viewerPreferences.hideWindowUI() || viewerPreferences2.hideWindowUI()) {
            viewerPreferences2.setHideWindowUI(true);
        }
        if (viewerPreferences.fitWindow() || viewerPreferences2.fitWindow()) {
            viewerPreferences2.setFitWindow(true);
        }
        if (viewerPreferences.centerWindow() || viewerPreferences2.centerWindow()) {
            viewerPreferences2.setCenterWindow(true);
        }
        if (viewerPreferences.displayDocTitle() || viewerPreferences2.displayDocTitle()) {
            viewerPreferences2.setDisplayDocTitle(true);
        }
    }

    public void setAcroFormMergeMode(AcroFormMergeMode acroFormMergeMode) {
        this.f59986h = acroFormMergeMode;
    }

    public void setDestinationDocumentInformation(PDDocumentInformation pDDocumentInformation) {
        this.f59983e = pDDocumentInformation;
    }

    public void setDestinationFileName(String str) {
        this.f59980b = str;
    }

    public void setDestinationMetadata(PDMetadata pDMetadata) {
        this.f59984f = pDMetadata;
    }

    public void setDestinationStream(OutputStream outputStream) {
        this.f59981c = outputStream;
    }

    public void setDocumentMergeMode(DocumentMergeMode documentMergeMode) {
        this.f59985g = documentMergeMode;
    }

    public void setIgnoreAcroFormErrors(boolean z) {
        this.f59982d = z;
    }

    /* renamed from: t */
    public final void m32700t(MemoryUsageSetting memoryUsageSetting) {
        PDDocument load;
        PDDocument pDDocument = null;
        try {
            PDDocument pDDocument2 = new PDDocument(memoryUsageSetting);
            try {
                PDFCloneUtility pDFCloneUtility = new PDFCloneUtility(pDDocument2);
                for (Object obj : this.f59979a) {
                    try {
                        if (obj instanceof File) {
                            load = PDDocument.load((File) obj, memoryUsageSetting);
                        } else {
                            load = PDDocument.load((InputStream) obj, memoryUsageSetting);
                        }
                        try {
                            Iterator<PDPage> it = load.getPages().iterator();
                            while (it.hasNext()) {
                                PDPage next = it.next();
                                PDPage pDPage = new PDPage((COSDictionary) pDFCloneUtility.cloneForNewDocument(next.getCOSObject()));
                                pDPage.setCropBox(next.getCropBox());
                                pDPage.setMediaBox(next.getMediaBox());
                                pDPage.setRotation(next.getRotation());
                                PDResources resources = next.getResources();
                                if (resources != null) {
                                    pDPage.setResources(new PDResources((COSDictionary) pDFCloneUtility.cloneForNewDocument(resources)));
                                } else {
                                    pDPage.setResources(new PDResources());
                                }
                                pDDocument2.addPage(pDPage);
                            }
                            IOUtils.closeQuietly(load);
                        } catch (Throwable th2) {
                            th = th2;
                            pDDocument = load;
                            IOUtils.closeQuietly(pDDocument);
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                    }
                }
                OutputStream outputStream = this.f59981c;
                if (outputStream == null) {
                    pDDocument2.save(this.f59980b);
                } else {
                    pDDocument2.save(outputStream);
                }
                IOUtils.closeQuietly(pDDocument2);
            } catch (Throwable th4) {
                th = th4;
                pDDocument = pDDocument2;
                IOUtils.closeQuietly(pDDocument);
                throw th;
            }
        } catch (Throwable th5) {
            th = th5;
        }
    }

    /* renamed from: u */
    public final void m32699u(PDFCloneUtility pDFCloneUtility, COSArray cOSArray, Map map) {
        for (int i = 0; i < cOSArray.size(); i++) {
            COSBase object = cOSArray.getObject(i);
            if (object instanceof COSArray) {
                m32699u(pDFCloneUtility, (COSArray) object, map);
            } else if (object instanceof COSDictionary) {
                m32698v(pDFCloneUtility, (COSDictionary) object, map);
            }
        }
    }

    /* renamed from: v */
    public final void m32698v(PDFCloneUtility pDFCloneUtility, COSDictionary cOSDictionary, Map map) {
        COSName cOSName = COSName.f59828PG;
        Object cOSDictionary2 = cOSDictionary.getCOSDictionary(cOSName);
        if (map.containsKey(cOSDictionary2)) {
            cOSDictionary.setItem(cOSName, (COSBase) map.get(cOSDictionary2));
        }
        COSName cOSName2 = COSName.OBJ;
        COSBase dictionaryObject = cOSDictionary.getDictionaryObject(cOSName2);
        if (dictionaryObject instanceof COSDictionary) {
            COSDictionary cOSDictionary3 = (COSDictionary) dictionaryObject;
            if (map.containsKey(cOSDictionary3)) {
                cOSDictionary.setItem(cOSName2, (COSBase) map.get(cOSDictionary3));
            } else {
                COSBase item = cOSDictionary.getItem(cOSName2);
                if (item instanceof COSObject) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("clone potential orphan object in structure tree: ");
                    sb.append(item);
                    sb.append(", Type: ");
                    sb.append(cOSDictionary3.getNameAsString(COSName.TYPE));
                    sb.append(", Subtype: ");
                    sb.append(cOSDictionary3.getNameAsString(COSName.SUBTYPE));
                    sb.append(", T: ");
                    sb.append(cOSDictionary3.getNameAsString(COSName.f59845T));
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("clone potential orphan object in structure tree, Type: ");
                    sb2.append(cOSDictionary3.getNameAsString(COSName.TYPE));
                    sb2.append(", Subtype: ");
                    sb2.append(cOSDictionary3.getNameAsString(COSName.SUBTYPE));
                    sb2.append(", T: ");
                    sb2.append(cOSDictionary3.getNameAsString(COSName.f59845T));
                }
                cOSDictionary.setItem(cOSName2, pDFCloneUtility.cloneForNewDocument(dictionaryObject));
            }
        }
        COSBase dictionaryObject2 = cOSDictionary.getDictionaryObject(COSName.f59809K);
        if (dictionaryObject2 instanceof COSArray) {
            m32699u(pDFCloneUtility, (COSArray) dictionaryObject2, map);
        } else if (dictionaryObject2 instanceof COSDictionary) {
            m32698v(pDFCloneUtility, (COSDictionary) dictionaryObject2, map);
        }
    }

    /* renamed from: w */
    public final void m32697w(PDFCloneUtility pDFCloneUtility, Map map, Map map2) {
        for (COSObjectable cOSObjectable : map.values()) {
            if (cOSObjectable != null) {
                COSBase cOSObject = ((PDParentTreeValue) cOSObjectable).getCOSObject();
                if (cOSObject instanceof COSArray) {
                    m32699u(pDFCloneUtility, (COSArray) cOSObject, map2);
                } else {
                    m32698v(pDFCloneUtility, (COSDictionary) cOSObject, map2);
                }
            }
        }
    }

    /* renamed from: x */
    public final void m32696x(COSArray cOSArray, COSDictionary cOSDictionary, COSName cOSName) {
        for (int i = 0; i < cOSArray.size(); i++) {
            COSBase object = cOSArray.getObject(i);
            if (object instanceof COSDictionary) {
                COSDictionary cOSDictionary2 = (COSDictionary) object;
                cOSDictionary2.setItem(COSName.f59827P, (COSBase) cOSDictionary);
                if (cOSName != null) {
                    cOSDictionary2.setItem(COSName.f59836S, (COSBase) cOSName);
                }
            }
        }
    }

    /* renamed from: y */
    public final void m32695y(PDPage pDPage, int i) {
        int structParents = pDPage.getStructParents();
        if (structParents >= 0) {
            pDPage.setStructParents(structParents + i);
        }
        List<PDAnnotation> annotations = pDPage.getAnnotations();
        ArrayList arrayList = new ArrayList(annotations.size());
        for (PDAnnotation pDAnnotation : annotations) {
            int structParent = pDAnnotation.getStructParent();
            if (structParent >= 0) {
                pDAnnotation.setStructParent(structParent + i);
            }
            arrayList.add(pDAnnotation);
        }
        pDPage.setAnnotations(arrayList);
    }

    public void addSource(File file) throws FileNotFoundException {
        this.f59979a.add(file);
    }

    public void mergeDocuments(MemoryUsageSetting memoryUsageSetting) throws IOException {
        DocumentMergeMode documentMergeMode = this.f59985g;
        if (documentMergeMode == DocumentMergeMode.PDFBOX_LEGACY_MODE) {
            m32711i(memoryUsageSetting);
        } else if (documentMergeMode == DocumentMergeMode.OPTIMIZE_RESOURCES_MODE) {
            m32700t(memoryUsageSetting);
        }
    }

    public void addSource(InputStream inputStream) {
        this.f59979a.add(inputStream);
    }
}