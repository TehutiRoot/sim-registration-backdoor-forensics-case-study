package com.tom_roush.pdfbox.pdmodel;

import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.pdmodel.common.COSObjectable;

/* loaded from: classes5.dex */
public class PDDocumentNameDictionary implements COSObjectable {

    /* renamed from: a */
    public final COSDictionary f60116a;

    /* renamed from: b */
    public final PDDocumentCatalog f60117b;

    public PDDocumentNameDictionary(PDDocumentCatalog pDDocumentCatalog) {
        COSDictionary cOSObject = pDDocumentCatalog.getCOSObject();
        COSName cOSName = COSName.NAMES;
        COSBase dictionaryObject = cOSObject.getDictionaryObject(cOSName);
        if (dictionaryObject != null) {
            this.f60116a = (COSDictionary) dictionaryObject;
        } else {
            COSDictionary cOSDictionary = new COSDictionary();
            this.f60116a = cOSDictionary;
            pDDocumentCatalog.getCOSObject().setItem(cOSName, (COSBase) cOSDictionary);
        }
        this.f60117b = pDDocumentCatalog;
    }

    public PDDestinationNameTreeNode getDests() {
        COSDictionary cOSDictionary = this.f60116a;
        COSName cOSName = COSName.DESTS;
        COSDictionary cOSDictionary2 = (COSDictionary) cOSDictionary.getDictionaryObject(cOSName);
        if (cOSDictionary2 == null) {
            cOSDictionary2 = (COSDictionary) this.f60117b.getCOSObject().getDictionaryObject(cOSName);
        }
        if (cOSDictionary2 != null) {
            return new PDDestinationNameTreeNode(cOSDictionary2);
        }
        return null;
    }

    public PDEmbeddedFilesNameTreeNode getEmbeddedFiles() {
        COSDictionary cOSDictionary = (COSDictionary) this.f60116a.getDictionaryObject(COSName.EMBEDDED_FILES);
        if (cOSDictionary != null) {
            return new PDEmbeddedFilesNameTreeNode(cOSDictionary);
        }
        return null;
    }

    public PDJavascriptNameTreeNode getJavaScript() {
        COSDictionary cOSDictionary = (COSDictionary) this.f60116a.getDictionaryObject(COSName.JAVA_SCRIPT);
        if (cOSDictionary != null) {
            return new PDJavascriptNameTreeNode(cOSDictionary);
        }
        return null;
    }

    public void setDests(PDDestinationNameTreeNode pDDestinationNameTreeNode) {
        COSDictionary cOSDictionary = this.f60116a;
        COSName cOSName = COSName.DESTS;
        cOSDictionary.setItem(cOSName, pDDestinationNameTreeNode);
        this.f60117b.getCOSObject().setItem(cOSName, (COSObjectable) null);
    }

    public void setEmbeddedFiles(PDEmbeddedFilesNameTreeNode pDEmbeddedFilesNameTreeNode) {
        this.f60116a.setItem(COSName.EMBEDDED_FILES, pDEmbeddedFilesNameTreeNode);
    }

    public void setJavascript(PDJavascriptNameTreeNode pDJavascriptNameTreeNode) {
        this.f60116a.setItem(COSName.JAVA_SCRIPT, pDJavascriptNameTreeNode);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.common.COSObjectable
    public COSDictionary getCOSObject() {
        return this.f60116a;
    }

    public PDDocumentNameDictionary(PDDocumentCatalog pDDocumentCatalog, COSDictionary cOSDictionary) {
        this.f60117b = pDDocumentCatalog;
        this.f60116a = cOSDictionary;
    }
}
