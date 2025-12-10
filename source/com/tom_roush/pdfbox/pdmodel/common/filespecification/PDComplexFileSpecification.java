package com.tom_roush.pdfbox.pdmodel.common.filespecification;

import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.cos.COSStream;

/* loaded from: classes5.dex */
public class PDComplexFileSpecification extends PDFileSpecification {

    /* renamed from: a */
    public final COSDictionary f60182a;

    /* renamed from: b */
    public COSDictionary f60183b;

    public PDComplexFileSpecification() {
        COSDictionary cOSDictionary = new COSDictionary();
        this.f60182a = cOSDictionary;
        cOSDictionary.setItem(COSName.TYPE, (COSBase) COSName.FILESPEC);
    }

    /* renamed from: a */
    public final COSDictionary m32553a() {
        COSDictionary cOSDictionary;
        if (this.f60183b == null && (cOSDictionary = this.f60182a) != null) {
            this.f60183b = cOSDictionary.getCOSDictionary(COSName.f59781EF);
        }
        return this.f60183b;
    }

    /* renamed from: b */
    public final COSBase m32552b(COSName cOSName) {
        COSDictionary m32553a = m32553a();
        if (m32553a != null) {
            return m32553a.getDictionaryObject(cOSName);
        }
        return null;
    }

    public PDEmbeddedFile getEmbeddedFile() {
        COSBase m32552b = m32552b(COSName.f59782F);
        if (m32552b instanceof COSStream) {
            return new PDEmbeddedFile((COSStream) m32552b);
        }
        return null;
    }

    public PDEmbeddedFile getEmbeddedFileDos() {
        COSBase m32552b = m32552b(COSName.DOS);
        if (m32552b instanceof COSStream) {
            return new PDEmbeddedFile((COSStream) m32552b);
        }
        return null;
    }

    public PDEmbeddedFile getEmbeddedFileMac() {
        COSBase m32552b = m32552b(COSName.MAC);
        if (m32552b instanceof COSStream) {
            return new PDEmbeddedFile((COSStream) m32552b);
        }
        return null;
    }

    public PDEmbeddedFile getEmbeddedFileUnicode() {
        COSBase m32552b = m32552b(COSName.f59842UF);
        if (m32552b instanceof COSStream) {
            return new PDEmbeddedFile((COSStream) m32552b);
        }
        return null;
    }

    public PDEmbeddedFile getEmbeddedFileUnix() {
        COSBase m32552b = m32552b(COSName.UNIX);
        if (m32552b instanceof COSStream) {
            return new PDEmbeddedFile((COSStream) m32552b);
        }
        return null;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.common.filespecification.PDFileSpecification
    public String getFile() {
        return this.f60182a.getString(COSName.f59782F);
    }

    public String getFileDescription() {
        return this.f60182a.getString(COSName.DESC);
    }

    public String getFileDos() {
        return this.f60182a.getString(COSName.DOS);
    }

    public String getFileMac() {
        return this.f60182a.getString(COSName.MAC);
    }

    public String getFileUnicode() {
        return this.f60182a.getString(COSName.f59842UF);
    }

    public String getFileUnix() {
        return this.f60182a.getString(COSName.UNIX);
    }

    public String getFilename() {
        String fileUnicode = getFileUnicode();
        if (fileUnicode == null) {
            fileUnicode = getFileDos();
        }
        if (fileUnicode == null) {
            fileUnicode = getFileMac();
        }
        if (fileUnicode == null) {
            fileUnicode = getFileUnix();
        }
        if (fileUnicode == null) {
            return getFile();
        }
        return fileUnicode;
    }

    public boolean isVolatile() {
        return this.f60182a.getBoolean(COSName.f59843V, false);
    }

    public void setEmbeddedFile(PDEmbeddedFile pDEmbeddedFile) {
        COSDictionary m32553a = m32553a();
        if (m32553a == null && pDEmbeddedFile != null) {
            m32553a = new COSDictionary();
            this.f60182a.setItem(COSName.f59781EF, (COSBase) m32553a);
        }
        if (m32553a != null) {
            m32553a.setItem(COSName.f59782F, pDEmbeddedFile);
        }
    }

    @Deprecated
    public void setEmbeddedFileDos(PDEmbeddedFile pDEmbeddedFile) {
        COSDictionary m32553a = m32553a();
        if (m32553a == null && pDEmbeddedFile != null) {
            m32553a = new COSDictionary();
            this.f60182a.setItem(COSName.f59781EF, (COSBase) m32553a);
        }
        if (m32553a != null) {
            m32553a.setItem(COSName.DOS, pDEmbeddedFile);
        }
    }

    @Deprecated
    public void setEmbeddedFileMac(PDEmbeddedFile pDEmbeddedFile) {
        COSDictionary m32553a = m32553a();
        if (m32553a == null && pDEmbeddedFile != null) {
            m32553a = new COSDictionary();
            this.f60182a.setItem(COSName.f59781EF, (COSBase) m32553a);
        }
        if (m32553a != null) {
            m32553a.setItem(COSName.MAC, pDEmbeddedFile);
        }
    }

    public void setEmbeddedFileUnicode(PDEmbeddedFile pDEmbeddedFile) {
        COSDictionary m32553a = m32553a();
        if (m32553a == null && pDEmbeddedFile != null) {
            m32553a = new COSDictionary();
            this.f60182a.setItem(COSName.f59781EF, (COSBase) m32553a);
        }
        if (m32553a != null) {
            m32553a.setItem(COSName.f59842UF, pDEmbeddedFile);
        }
    }

    @Deprecated
    public void setEmbeddedFileUnix(PDEmbeddedFile pDEmbeddedFile) {
        COSDictionary m32553a = m32553a();
        if (m32553a == null && pDEmbeddedFile != null) {
            m32553a = new COSDictionary();
            this.f60182a.setItem(COSName.f59781EF, (COSBase) m32553a);
        }
        if (m32553a != null) {
            m32553a.setItem(COSName.UNIX, pDEmbeddedFile);
        }
    }

    @Override // com.tom_roush.pdfbox.pdmodel.common.filespecification.PDFileSpecification
    public void setFile(String str) {
        this.f60182a.setString(COSName.f59782F, str);
    }

    public void setFileDescription(String str) {
        this.f60182a.setString(COSName.DESC, str);
    }

    @Deprecated
    public void setFileDos(String str) {
        this.f60182a.setString(COSName.DOS, str);
    }

    @Deprecated
    public void setFileMac(String str) {
        this.f60182a.setString(COSName.MAC, str);
    }

    public void setFileUnicode(String str) {
        this.f60182a.setString(COSName.f59842UF, str);
    }

    @Deprecated
    public void setFileUnix(String str) {
        this.f60182a.setString(COSName.UNIX, str);
    }

    public void setVolatile(boolean z) {
        this.f60182a.setBoolean(COSName.f59843V, z);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.common.COSObjectable
    public COSDictionary getCOSObject() {
        return this.f60182a;
    }

    public PDComplexFileSpecification(COSDictionary cOSDictionary) {
        if (cOSDictionary == null) {
            COSDictionary cOSDictionary2 = new COSDictionary();
            this.f60182a = cOSDictionary2;
            cOSDictionary2.setItem(COSName.TYPE, (COSBase) COSName.FILESPEC);
            return;
        }
        this.f60182a = cOSDictionary;
    }
}
