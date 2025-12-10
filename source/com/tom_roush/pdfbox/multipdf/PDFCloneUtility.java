package com.tom_roush.pdfbox.multipdf;

import com.tom_roush.pdfbox.cos.COSArray;
import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.cos.COSObject;
import com.tom_roush.pdfbox.cos.COSStream;
import com.tom_roush.pdfbox.p019io.IOUtils;
import com.tom_roush.pdfbox.pdmodel.PDDocument;
import com.tom_roush.pdfbox.pdmodel.common.COSObjectable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes5.dex */
public class PDFCloneUtility {

    /* renamed from: a */
    public final PDDocument f59964a;

    /* renamed from: b */
    public final Map f59965b = new HashMap();

    /* renamed from: c */
    public final Set f59966c = new HashSet();

    public PDFCloneUtility(PDDocument pDDocument) {
        this.f59964a = pDDocument;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v19, types: [com.tom_roush.pdfbox.cos.COSArray] */
    /* JADX WARN: Type inference failed for: r0v23, types: [com.tom_roush.pdfbox.cos.COSBase] */
    /* JADX WARN: Type inference failed for: r0v27, types: [com.tom_roush.pdfbox.cos.COSBase] */
    /* JADX WARN: Type inference failed for: r0v28, types: [java.lang.Object, com.tom_roush.pdfbox.cos.COSBase] */
    /* JADX WARN: Type inference failed for: r0v29, types: [com.tom_roush.pdfbox.cos.COSArray] */
    /* JADX WARN: Type inference failed for: r0v9, types: [com.tom_roush.pdfbox.cos.COSBase] */
    /* JADX WARN: Type inference failed for: r1v2, types: [com.tom_roush.pdfbox.cos.COSDictionary, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v6, types: [com.tom_roush.pdfbox.cos.COSDictionary, com.tom_roush.pdfbox.cos.COSStream, java.lang.Object] */
    public COSBase cloneForNewDocument(Object obj) throws IOException {
        ?? r0;
        ?? cOSDictionary;
        if (obj == null) {
            return null;
        }
        COSBase cOSBase = (COSBase) this.f59965b.get(obj);
        if (cOSBase != null) {
            return cOSBase;
        }
        boolean z = obj instanceof COSBase;
        if (z && this.f59966c.contains(obj)) {
            return (COSBase) obj;
        }
        if (obj instanceof List) {
            r0 = new COSArray();
            for (Object obj2 : (List) obj) {
                r0.add(cloneForNewDocument(obj2));
            }
        } else if ((obj instanceof COSObjectable) && !z) {
            r0 = cloneForNewDocument(((COSObjectable) obj).getCOSObject());
        } else if (obj instanceof COSObject) {
            r0 = cloneForNewDocument(((COSObject) obj).getObject());
        } else if (obj instanceof COSArray) {
            r0 = new COSArray();
            COSArray cOSArray = (COSArray) obj;
            for (int i = 0; i < cOSArray.size(); i++) {
                r0.add(cloneForNewDocument(cOSArray.get(i)));
            }
        } else {
            if (obj instanceof COSStream) {
                COSStream cOSStream = (COSStream) obj;
                cOSDictionary = this.f59964a.getDocument().createCOSStream();
                OutputStream createRawOutputStream = cOSDictionary.createRawOutputStream();
                InputStream createRawInputStream = cOSStream.createRawInputStream();
                IOUtils.copy(createRawInputStream, createRawOutputStream);
                createRawInputStream.close();
                createRawOutputStream.close();
                this.f59965b.put(obj, cOSDictionary);
                for (Map.Entry<COSName, COSBase> entry : cOSStream.entrySet()) {
                    cOSDictionary.setItem(entry.getKey(), cloneForNewDocument(entry.getValue()));
                }
            } else if (obj instanceof COSDictionary) {
                cOSDictionary = new COSDictionary();
                this.f59965b.put(obj, cOSDictionary);
                for (Map.Entry<COSName, COSBase> entry2 : ((COSDictionary) obj).entrySet()) {
                    cOSDictionary.setItem(entry2.getKey(), cloneForNewDocument(entry2.getValue()));
                }
            } else {
                r0 = (COSBase) obj;
            }
            r0 = cOSDictionary;
        }
        this.f59965b.put(obj, r0);
        this.f59966c.add(r0);
        return r0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, com.tom_roush.pdfbox.cos.COSBase] */
    /* JADX WARN: Type inference failed for: r0v4, types: [com.tom_roush.pdfbox.cos.COSBase] */
    /* JADX WARN: Type inference failed for: r0v7, types: [com.tom_roush.pdfbox.cos.COSDictionary, com.tom_roush.pdfbox.cos.COSStream, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0, types: [com.tom_roush.pdfbox.multipdf.PDFCloneUtility] */
    public void cloneMerge(COSObjectable cOSObjectable, COSObjectable cOSObjectable2) throws IOException {
        ?? r0;
        if (cOSObjectable == null || cOSObjectable == cOSObjectable2 || (r0 = (COSBase) this.f59965b.get(cOSObjectable)) != 0) {
            return;
        }
        if (!(cOSObjectable instanceof COSBase)) {
            cloneMerge(cOSObjectable.getCOSObject(), cOSObjectable2.getCOSObject());
        } else if (cOSObjectable instanceof COSObject) {
            if (cOSObjectable2 instanceof COSObject) {
                cloneMerge(((COSObject) cOSObjectable).getObject(), ((COSObject) cOSObjectable2).getObject());
            } else if ((cOSObjectable2 instanceof COSDictionary) || (cOSObjectable2 instanceof COSArray)) {
                cloneMerge(((COSObject) cOSObjectable).getObject(), cOSObjectable2);
            }
        } else if (cOSObjectable instanceof COSArray) {
            if (cOSObjectable2 instanceof COSObject) {
                cloneMerge(cOSObjectable, ((COSObject) cOSObjectable2).getObject());
            } else {
                COSArray cOSArray = (COSArray) cOSObjectable;
                for (int i = 0; i < cOSArray.size(); i++) {
                    ((COSArray) cOSObjectable2).add(cloneForNewDocument(cOSArray.get(i)));
                }
            }
        } else if (cOSObjectable instanceof COSStream) {
            COSStream cOSStream = (COSStream) cOSObjectable;
            r0 = this.f59964a.getDocument().createCOSStream();
            OutputStream createOutputStream = r0.createOutputStream(cOSStream.getFilters());
            IOUtils.copy(cOSStream.createInputStream(), createOutputStream);
            createOutputStream.close();
            this.f59965b.put(cOSObjectable, r0);
            for (Map.Entry<COSName, COSBase> entry : cOSStream.entrySet()) {
                r0.setItem(entry.getKey(), cloneForNewDocument(entry.getValue()));
            }
        } else if (cOSObjectable instanceof COSDictionary) {
            if (cOSObjectable2 instanceof COSObject) {
                cloneMerge(cOSObjectable, ((COSObject) cOSObjectable2).getObject());
            } else {
                this.f59965b.put(cOSObjectable, r0);
                for (Map.Entry<COSName, COSBase> entry2 : ((COSDictionary) cOSObjectable).entrySet()) {
                    COSName key = entry2.getKey();
                    COSBase value = entry2.getValue();
                    COSDictionary cOSDictionary = (COSDictionary) cOSObjectable2;
                    if (cOSDictionary.getItem(key) != null) {
                        cloneMerge(value, cOSDictionary.getItem(key));
                    } else {
                        cOSDictionary.setItem(key, cloneForNewDocument(value));
                    }
                }
            }
        } else {
            r0 = (COSBase) cOSObjectable;
        }
        this.f59965b.put(cOSObjectable, r0);
        this.f59966c.add(r0);
    }

    public PDDocument getDestination() {
        return this.f59964a;
    }
}
