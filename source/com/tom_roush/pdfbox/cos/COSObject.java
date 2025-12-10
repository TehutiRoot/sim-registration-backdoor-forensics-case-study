package com.tom_roush.pdfbox.cos;

import java.io.IOException;

/* loaded from: classes5.dex */
public class COSObject extends COSBase implements COSUpdateInfo {

    /* renamed from: b */
    public COSBase f59852b;

    /* renamed from: c */
    public long f59853c;

    /* renamed from: d */
    public int f59854d;

    /* renamed from: e */
    public boolean f59855e;

    public COSObject(COSBase cOSBase) throws IOException {
        setObject(cOSBase);
    }

    @Override // com.tom_roush.pdfbox.cos.COSBase
    public Object accept(ICOSVisitor iCOSVisitor) throws IOException {
        COSBase object = getObject();
        if (object != null) {
            return object.accept(iCOSVisitor);
        }
        return COSNull.NULL.accept(iCOSVisitor);
    }

    public COSBase getDictionaryObject(COSName cOSName) {
        COSBase cOSBase = this.f59852b;
        if (cOSBase instanceof COSDictionary) {
            return ((COSDictionary) cOSBase).getDictionaryObject(cOSName);
        }
        return null;
    }

    public int getGenerationNumber() {
        return this.f59854d;
    }

    public COSBase getItem(COSName cOSName) {
        COSBase cOSBase = this.f59852b;
        if (cOSBase instanceof COSDictionary) {
            return ((COSDictionary) cOSBase).getItem(cOSName);
        }
        return null;
    }

    public COSBase getObject() {
        return this.f59852b;
    }

    public long getObjectNumber() {
        return this.f59853c;
    }

    @Override // com.tom_roush.pdfbox.cos.COSUpdateInfo
    public boolean isNeedToBeUpdated() {
        return this.f59855e;
    }

    public void setGenerationNumber(int i) {
        this.f59854d = i;
    }

    @Override // com.tom_roush.pdfbox.cos.COSUpdateInfo
    public void setNeedToBeUpdated(boolean z) {
        this.f59855e = z;
    }

    public final void setObject(COSBase cOSBase) throws IOException {
        this.f59852b = cOSBase;
    }

    public void setObjectNumber(long j) {
        this.f59853c = j;
    }

    public String toString() {
        return "COSObject{" + this.f59853c + ", " + this.f59854d + "}";
    }
}
