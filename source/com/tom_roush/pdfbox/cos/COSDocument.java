package com.tom_roush.pdfbox.cos;

import android.util.Log;
import com.tom_roush.pdfbox.p019io.IOUtils;
import com.tom_roush.pdfbox.p019io.ScratchFile;
import com.tom_roush.pdfbox.pdfparser.PDFObjectStreamParser;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public class COSDocument extends COSBase implements Closeable {

    /* renamed from: b */
    public float f59729b;

    /* renamed from: c */
    public final Map f59730c;

    /* renamed from: d */
    public final Map f59731d;

    /* renamed from: e */
    public final List f59732e;

    /* renamed from: f */
    public COSDictionary f59733f;

    /* renamed from: g */
    public boolean f59734g;

    /* renamed from: h */
    public boolean f59735h;

    /* renamed from: i */
    public long f59736i;

    /* renamed from: j */
    public boolean f59737j;

    /* renamed from: k */
    public boolean f59738k;

    /* renamed from: l */
    public ScratchFile f59739l;

    /* renamed from: m */
    public long f59740m;

    public COSDocument() {
        this(ScratchFile.getMainMemoryOnlyInstance());
    }

    @Override // com.tom_roush.pdfbox.cos.COSBase
    public Object accept(ICOSVisitor iCOSVisitor) throws IOException {
        return iCOSVisitor.visitFromDocument(this);
    }

    public void addXRefTable(Map<COSObjectKey, Long> map) {
        this.f59731d.putAll(map);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f59737j) {
            return;
        }
        IOException iOException = null;
        for (COSObject cOSObject : getObjects()) {
            COSBase object = cOSObject.getObject();
            if (object instanceof COSStream) {
                iOException = IOUtils.closeAndLogException((COSStream) object, "COSStream", iOException);
            }
        }
        for (COSStream cOSStream : this.f59732e) {
            iOException = IOUtils.closeAndLogException(cOSStream, "COSStream", iOException);
        }
        ScratchFile scratchFile = this.f59739l;
        if (scratchFile != null) {
            iOException = IOUtils.closeAndLogException(scratchFile, "ScratchFile", iOException);
        }
        this.f59737j = true;
        if (iOException == null) {
            return;
        }
        throw iOException;
    }

    public COSStream createCOSStream() {
        COSStream cOSStream = new COSStream(this.f59739l);
        this.f59732e.add(cOSStream);
        return cOSStream;
    }

    public void dereferenceObjectStreams() throws IOException {
        for (COSObject cOSObject : getObjectsByType(COSName.OBJ_STM)) {
            PDFObjectStreamParser pDFObjectStreamParser = new PDFObjectStreamParser((COSStream) cOSObject.getObject(), this);
            pDFObjectStreamParser.parse();
            for (COSObject cOSObject2 : pDFObjectStreamParser.getObjects()) {
                COSObjectKey cOSObjectKey = new COSObjectKey(cOSObject2);
                if (this.f59730c.get(cOSObjectKey) == null || ((COSObject) this.f59730c.get(cOSObjectKey)).getObject() == null || (this.f59731d.containsKey(cOSObjectKey) && ((Long) this.f59731d.get(cOSObjectKey)).longValue() == (-cOSObject.getObjectNumber()))) {
                    getObjectFromPool(cOSObjectKey).setObject(cOSObject2.getObject());
                }
            }
        }
    }

    public void finalize() throws IOException {
        if (!this.f59737j) {
            if (this.f59734g) {
                Log.w("PdfBox-Android", "Warning: You did not close a PDF Document");
            }
            close();
        }
    }

    public COSObject getCatalog() throws IOException {
        COSObject objectByType = getObjectByType(COSName.CATALOG);
        if (objectByType != null) {
            return objectByType;
        }
        throw new IOException("Catalog cannot be found");
    }

    public COSArray getDocumentID() {
        return getTrailer().getCOSArray(COSName.f59791ID);
    }

    public COSDictionary getEncryptionDictionary() {
        return this.f59733f.getCOSDictionary(COSName.ENCRYPT);
    }

    public long getHighestXRefObjectNumber() {
        return this.f59740m;
    }

    public COSObjectKey getKey(COSBase cOSBase) {
        for (Map.Entry entry : this.f59730c.entrySet()) {
            if (((COSObject) entry.getValue()).getObject() == cOSBase) {
                return (COSObjectKey) entry.getKey();
            }
        }
        return null;
    }

    public COSObject getObjectByType(COSName cOSName) throws IOException {
        for (COSObject cOSObject : this.f59730c.values()) {
            COSBase object = cOSObject.getObject();
            if (object instanceof COSDictionary) {
                try {
                    COSBase item = ((COSDictionary) object).getItem(COSName.TYPE);
                    if (item instanceof COSName) {
                        if (((COSName) item).equals(cOSName)) {
                            return cOSObject;
                        }
                    } else if (item != null) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Expected a /Name object after /Type, got '");
                        sb.append(item);
                        sb.append("' instead");
                    }
                } catch (ClassCastException e) {
                    Log.w("PdfBox-Android", e.getMessage(), e);
                }
            }
        }
        return null;
    }

    public COSObject getObjectFromPool(COSObjectKey cOSObjectKey) throws IOException {
        COSObject cOSObject;
        if (cOSObjectKey != null) {
            cOSObject = (COSObject) this.f59730c.get(cOSObjectKey);
        } else {
            cOSObject = null;
        }
        if (cOSObject == null) {
            cOSObject = new COSObject(null);
            if (cOSObjectKey != null) {
                cOSObject.setObjectNumber(cOSObjectKey.getNumber());
                cOSObject.setGenerationNumber(cOSObjectKey.getGeneration());
                this.f59730c.put(cOSObjectKey, cOSObject);
            }
        }
        return cOSObject;
    }

    public List<COSObject> getObjects() {
        return new ArrayList(this.f59730c.values());
    }

    public List<COSObject> getObjectsByType(String str) throws IOException {
        return getObjectsByType(COSName.getPDFName(str));
    }

    public long getStartXref() {
        return this.f59736i;
    }

    public COSDictionary getTrailer() {
        return this.f59733f;
    }

    public float getVersion() {
        return this.f59729b;
    }

    public Map<COSObjectKey, Long> getXrefTable() {
        return this.f59731d;
    }

    public boolean isClosed() {
        return this.f59737j;
    }

    public boolean isDecrypted() {
        return this.f59735h;
    }

    public boolean isEncrypted() {
        COSDictionary cOSDictionary = this.f59733f;
        if (cOSDictionary != null) {
            return cOSDictionary.getDictionaryObject(COSName.ENCRYPT) instanceof COSDictionary;
        }
        return false;
    }

    public boolean isXRefStream() {
        return this.f59738k;
    }

    public void print() {
        for (COSObject cOSObject : this.f59730c.values()) {
            System.out.println(cOSObject);
        }
    }

    public COSObject removeObject(COSObjectKey cOSObjectKey) {
        return (COSObject) this.f59730c.remove(cOSObjectKey);
    }

    public void setDecrypted() {
        this.f59735h = true;
    }

    public void setDocumentID(COSArray cOSArray) {
        getTrailer().setItem(COSName.f59791ID, (COSBase) cOSArray);
    }

    public void setEncryptionDictionary(COSDictionary cOSDictionary) {
        this.f59733f.setItem(COSName.ENCRYPT, (COSBase) cOSDictionary);
    }

    public void setHighestXRefObjectNumber(long j) {
        this.f59740m = j;
    }

    public void setIsXRefStream(boolean z) {
        this.f59738k = z;
    }

    public void setStartXref(long j) {
        this.f59736i = j;
    }

    public void setTrailer(COSDictionary cOSDictionary) {
        this.f59733f = cOSDictionary;
    }

    public void setVersion(float f) {
        this.f59729b = f;
    }

    public void setWarnMissingClose(boolean z) {
        this.f59734g = z;
    }

    public COSDocument(ScratchFile scratchFile) {
        this.f59729b = 1.4f;
        this.f59730c = new HashMap();
        this.f59731d = new HashMap();
        this.f59732e = new ArrayList();
        this.f59734g = true;
        this.f59735h = false;
        this.f59737j = false;
        this.f59739l = scratchFile;
    }

    public List<COSObject> getObjectsByType(COSName cOSName) throws IOException {
        ArrayList arrayList = new ArrayList();
        for (COSObject cOSObject : this.f59730c.values()) {
            COSBase object = cOSObject.getObject();
            if (object instanceof COSDictionary) {
                try {
                    COSBase item = ((COSDictionary) object).getItem(COSName.TYPE);
                    if (item instanceof COSName) {
                        if (((COSName) item).equals(cOSName)) {
                            arrayList.add(cOSObject);
                        }
                    } else if (item != null) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Expected a /Name object after /Type, got '");
                        sb.append(item);
                        sb.append("' instead");
                    }
                } catch (ClassCastException e) {
                    Log.w("PdfBox-Android", e.getMessage(), e);
                }
            }
        }
        return arrayList;
    }

    public COSStream createCOSStream(COSDictionary cOSDictionary) {
        COSStream cOSStream = new COSStream(this.f59739l);
        for (Map.Entry<COSName, COSBase> entry : cOSDictionary.entrySet()) {
            cOSStream.setItem(entry.getKey(), entry.getValue());
        }
        return cOSStream;
    }
}
