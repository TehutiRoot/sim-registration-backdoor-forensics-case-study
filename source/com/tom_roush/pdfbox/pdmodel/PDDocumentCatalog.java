package com.tom_roush.pdfbox.pdmodel;

import com.tom_roush.pdfbox.cos.COSArray;
import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.cos.COSObject;
import com.tom_roush.pdfbox.cos.COSStream;
import com.tom_roush.pdfbox.pdmodel.common.COSArrayList;
import com.tom_roush.pdfbox.pdmodel.common.COSObjectable;
import com.tom_roush.pdfbox.pdmodel.common.PDDestinationOrAction;
import com.tom_roush.pdfbox.pdmodel.common.PDMetadata;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabels;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.logicalstructure.PDMarkInfo;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.logicalstructure.PDStructureTreeRoot;
import com.tom_roush.pdfbox.pdmodel.fixup.AcroFormDefaultFixup;
import com.tom_roush.pdfbox.pdmodel.fixup.PDDocumentFixup;
import com.tom_roush.pdfbox.pdmodel.graphics.color.PDOutputIntent;
import com.tom_roush.pdfbox.pdmodel.graphics.optionalcontent.PDOptionalContentProperties;
import com.tom_roush.pdfbox.pdmodel.interactive.action.PDActionFactory;
import com.tom_roush.pdfbox.pdmodel.interactive.action.PDDocumentCatalogAdditionalActions;
import com.tom_roush.pdfbox.pdmodel.interactive.action.PDURIDictionary;
import com.tom_roush.pdfbox.pdmodel.interactive.documentnavigation.destination.PDDestination;
import com.tom_roush.pdfbox.pdmodel.interactive.documentnavigation.destination.PDNamedDestination;
import com.tom_roush.pdfbox.pdmodel.interactive.documentnavigation.destination.PDPageDestination;
import com.tom_roush.pdfbox.pdmodel.interactive.documentnavigation.outline.PDDocumentOutline;
import com.tom_roush.pdfbox.pdmodel.interactive.form.PDAcroForm;
import com.tom_roush.pdfbox.pdmodel.interactive.pagenavigation.PDThread;
import com.tom_roush.pdfbox.pdmodel.interactive.viewerpreferences.PDViewerPreferences;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes5.dex */
public class PDDocumentCatalog implements COSObjectable {

    /* renamed from: a */
    public final COSDictionary f60110a;

    /* renamed from: b */
    public final PDDocument f60111b;

    /* renamed from: c */
    public PDDocumentFixup f60112c;

    /* renamed from: d */
    public PDAcroForm f60113d;

    public PDDocumentCatalog(PDDocument pDDocument) {
        this.f60111b = pDDocument;
        COSDictionary cOSDictionary = new COSDictionary();
        this.f60110a = cOSDictionary;
        cOSDictionary.setItem(COSName.TYPE, (COSBase) COSName.CATALOG);
        pDDocument.getDocument().getTrailer().setItem(COSName.ROOT, (COSBase) cOSDictionary);
    }

    public void addOutputIntent(PDOutputIntent pDOutputIntent) {
        COSDictionary cOSDictionary = this.f60110a;
        COSName cOSName = COSName.OUTPUT_INTENTS;
        COSArray cOSArray = (COSArray) cOSDictionary.getDictionaryObject(cOSName);
        if (cOSArray == null) {
            cOSArray = new COSArray();
            this.f60110a.setItem(cOSName, (COSBase) cOSArray);
        }
        cOSArray.add(pDOutputIntent.getCOSObject());
    }

    public PDPageDestination findNamedDestinationPage(PDNamedDestination pDNamedDestination) throws IOException {
        PDPageDestination pDPageDestination;
        PDDocumentNameDestinationDictionary dests;
        PDDestinationNameTreeNode dests2;
        PDDocumentNameDictionary names = getNames();
        if (names != null && (dests2 = names.getDests()) != null) {
            pDPageDestination = dests2.getValue(pDNamedDestination.getNamedDestination());
        } else {
            pDPageDestination = null;
        }
        if (pDPageDestination == null && (dests = getDests()) != null) {
            return (PDPageDestination) dests.getDestination(pDNamedDestination.getNamedDestination());
        }
        return pDPageDestination;
    }

    public PDAcroForm getAcroForm() {
        return getAcroForm(new AcroFormDefaultFixup(this.f60111b));
    }

    public PDDocumentCatalogAdditionalActions getActions() {
        COSDictionary cOSDictionary = this.f60110a;
        COSName cOSName = COSName.f59749AA;
        COSDictionary cOSDictionary2 = (COSDictionary) cOSDictionary.getDictionaryObject(cOSName);
        if (cOSDictionary2 == null) {
            cOSDictionary2 = new COSDictionary();
            this.f60110a.setItem(cOSName, (COSBase) cOSDictionary2);
        }
        return new PDDocumentCatalogAdditionalActions(cOSDictionary2);
    }

    public PDDocumentNameDestinationDictionary getDests() {
        COSDictionary cOSDictionary = (COSDictionary) this.f60110a.getDictionaryObject(COSName.DESTS);
        if (cOSDictionary != null) {
            return new PDDocumentNameDestinationDictionary(cOSDictionary);
        }
        return null;
    }

    public PDDocumentOutline getDocumentOutline() {
        COSBase dictionaryObject = this.f60110a.getDictionaryObject(COSName.OUTLINES);
        if (dictionaryObject instanceof COSDictionary) {
            return new PDDocumentOutline((COSDictionary) dictionaryObject);
        }
        return null;
    }

    public String getLanguage() {
        return this.f60110a.getString(COSName.LANG);
    }

    public PDMarkInfo getMarkInfo() {
        COSDictionary cOSDictionary = (COSDictionary) this.f60110a.getDictionaryObject(COSName.MARK_INFO);
        if (cOSDictionary == null) {
            return null;
        }
        return new PDMarkInfo(cOSDictionary);
    }

    public PDMetadata getMetadata() {
        COSBase dictionaryObject = this.f60110a.getDictionaryObject(COSName.METADATA);
        if (dictionaryObject instanceof COSStream) {
            return new PDMetadata((COSStream) dictionaryObject);
        }
        return null;
    }

    public PDDocumentNameDictionary getNames() {
        COSDictionary cOSDictionary = (COSDictionary) this.f60110a.getDictionaryObject(COSName.NAMES);
        if (cOSDictionary == null) {
            return null;
        }
        return new PDDocumentNameDictionary(this, cOSDictionary);
    }

    public PDOptionalContentProperties getOCProperties() {
        COSDictionary cOSDictionary = (COSDictionary) this.f60110a.getDictionaryObject(COSName.OCPROPERTIES);
        if (cOSDictionary == null) {
            return null;
        }
        return new PDOptionalContentProperties(cOSDictionary);
    }

    public PDDestinationOrAction getOpenAction() throws IOException {
        COSBase dictionaryObject = this.f60110a.getDictionaryObject(COSName.OPEN_ACTION);
        if (dictionaryObject instanceof COSDictionary) {
            return PDActionFactory.createAction((COSDictionary) dictionaryObject);
        }
        if (dictionaryObject instanceof COSArray) {
            return PDDestination.create(dictionaryObject);
        }
        return null;
    }

    public List<PDOutputIntent> getOutputIntents() {
        ArrayList arrayList = new ArrayList();
        COSArray cOSArray = (COSArray) this.f60110a.getDictionaryObject(COSName.OUTPUT_INTENTS);
        if (cOSArray != null) {
            Iterator<COSBase> it = cOSArray.iterator();
            while (it.hasNext()) {
                COSBase next = it.next();
                if (next instanceof COSObject) {
                    next = ((COSObject) next).getObject();
                }
                arrayList.add(new PDOutputIntent((COSDictionary) next));
            }
        }
        return arrayList;
    }

    public PDPageLabels getPageLabels() throws IOException {
        COSDictionary cOSDictionary = (COSDictionary) this.f60110a.getDictionaryObject(COSName.PAGE_LABELS);
        if (cOSDictionary == null) {
            return null;
        }
        return new PDPageLabels(this.f60111b, cOSDictionary);
    }

    public PageLayout getPageLayout() {
        String nameAsString = this.f60110a.getNameAsString(COSName.PAGE_LAYOUT);
        if (nameAsString != null) {
            return PageLayout.fromString(nameAsString);
        }
        return PageLayout.SINGLE_PAGE;
    }

    public PageMode getPageMode() {
        String nameAsString = this.f60110a.getNameAsString(COSName.PAGE_MODE);
        if (nameAsString != null) {
            try {
                return PageMode.fromString(nameAsString);
            } catch (IllegalArgumentException unused) {
                return PageMode.USE_NONE;
            }
        }
        return PageMode.USE_NONE;
    }

    public PDPageTree getPages() {
        return new PDPageTree((COSDictionary) this.f60110a.getDictionaryObject(COSName.PAGES), this.f60111b);
    }

    public PDStructureTreeRoot getStructureTreeRoot() {
        COSDictionary cOSDictionary = this.f60110a.getCOSDictionary(COSName.STRUCT_TREE_ROOT);
        if (cOSDictionary == null) {
            return null;
        }
        return new PDStructureTreeRoot(cOSDictionary);
    }

    public List<PDThread> getThreads() {
        COSDictionary cOSDictionary = this.f60110a;
        COSName cOSName = COSName.THREADS;
        COSArray cOSArray = (COSArray) cOSDictionary.getDictionaryObject(cOSName);
        if (cOSArray == null) {
            cOSArray = new COSArray();
            this.f60110a.setItem(cOSName, (COSBase) cOSArray);
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < cOSArray.size(); i++) {
            arrayList.add(new PDThread((COSDictionary) cOSArray.getObject(i)));
        }
        return new COSArrayList(arrayList, cOSArray);
    }

    public PDURIDictionary getURI() {
        COSDictionary cOSDictionary = (COSDictionary) this.f60110a.getDictionaryObject(COSName.URI);
        if (cOSDictionary == null) {
            return null;
        }
        return new PDURIDictionary(cOSDictionary);
    }

    public String getVersion() {
        return this.f60110a.getNameAsString(COSName.VERSION);
    }

    public PDViewerPreferences getViewerPreferences() {
        COSBase dictionaryObject = this.f60110a.getDictionaryObject(COSName.VIEWER_PREFERENCES);
        if (dictionaryObject instanceof COSDictionary) {
            return new PDViewerPreferences((COSDictionary) dictionaryObject);
        }
        return null;
    }

    public void setAcroForm(PDAcroForm pDAcroForm) {
        this.f60110a.setItem(COSName.ACRO_FORM, pDAcroForm);
        this.f60113d = null;
    }

    public void setActions(PDDocumentCatalogAdditionalActions pDDocumentCatalogAdditionalActions) {
        this.f60110a.setItem(COSName.f59749AA, pDDocumentCatalogAdditionalActions);
    }

    public void setDocumentOutline(PDDocumentOutline pDDocumentOutline) {
        this.f60110a.setItem(COSName.OUTLINES, pDDocumentOutline);
    }

    public void setLanguage(String str) {
        this.f60110a.setString(COSName.LANG, str);
    }

    public void setMarkInfo(PDMarkInfo pDMarkInfo) {
        this.f60110a.setItem(COSName.MARK_INFO, pDMarkInfo);
    }

    public void setMetadata(PDMetadata pDMetadata) {
        this.f60110a.setItem(COSName.METADATA, pDMetadata);
    }

    public void setNames(PDDocumentNameDictionary pDDocumentNameDictionary) {
        this.f60110a.setItem(COSName.NAMES, pDDocumentNameDictionary);
    }

    public void setOCProperties(PDOptionalContentProperties pDOptionalContentProperties) {
        this.f60110a.setItem(COSName.OCPROPERTIES, pDOptionalContentProperties);
        if (pDOptionalContentProperties != null && this.f60111b.getVersion() < 1.5d) {
            this.f60111b.setVersion(1.5f);
        }
    }

    public void setOpenAction(PDDestinationOrAction pDDestinationOrAction) {
        this.f60110a.setItem(COSName.OPEN_ACTION, pDDestinationOrAction);
    }

    public void setOutputIntents(List<PDOutputIntent> list) {
        COSArray cOSArray = new COSArray();
        for (PDOutputIntent pDOutputIntent : list) {
            cOSArray.add(pDOutputIntent.getCOSObject());
        }
        this.f60110a.setItem(COSName.OUTPUT_INTENTS, (COSBase) cOSArray);
    }

    public void setPageLabels(PDPageLabels pDPageLabels) {
        this.f60110a.setItem(COSName.PAGE_LABELS, pDPageLabels);
    }

    public void setPageLayout(PageLayout pageLayout) {
        this.f60110a.setName(COSName.PAGE_LAYOUT, pageLayout.stringValue());
    }

    public void setPageMode(PageMode pageMode) {
        this.f60110a.setName(COSName.PAGE_MODE, pageMode.stringValue());
    }

    public void setStructureTreeRoot(PDStructureTreeRoot pDStructureTreeRoot) {
        this.f60110a.setItem(COSName.STRUCT_TREE_ROOT, pDStructureTreeRoot);
    }

    public void setThreads(List<PDThread> list) {
        this.f60110a.setItem(COSName.THREADS, (COSBase) COSArrayList.converterToCOSArray(list));
    }

    public void setURI(PDURIDictionary pDURIDictionary) {
        this.f60110a.setItem(COSName.URI, pDURIDictionary);
    }

    public void setVersion(String str) {
        this.f60110a.setName(COSName.VERSION, str);
    }

    public void setViewerPreferences(PDViewerPreferences pDViewerPreferences) {
        this.f60110a.setItem(COSName.VIEWER_PREFERENCES, pDViewerPreferences);
    }

    public PDAcroForm getAcroForm(PDDocumentFixup pDDocumentFixup) {
        if (pDDocumentFixup != null && pDDocumentFixup != this.f60112c) {
            pDDocumentFixup.apply();
            this.f60113d = null;
            this.f60112c = pDDocumentFixup;
        }
        if (this.f60113d == null) {
            COSDictionary cOSDictionary = (COSDictionary) this.f60110a.getDictionaryObject(COSName.ACRO_FORM);
            this.f60113d = cOSDictionary != null ? new PDAcroForm(this.f60111b, cOSDictionary) : null;
        }
        return this.f60113d;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.common.COSObjectable
    public COSDictionary getCOSObject() {
        return this.f60110a;
    }

    public PDDocumentCatalog(PDDocument pDDocument, COSDictionary cOSDictionary) {
        this.f60111b = pDDocument;
        this.f60110a = cOSDictionary;
    }
}
