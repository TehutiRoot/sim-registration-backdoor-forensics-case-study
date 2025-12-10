package com.tom_roush.pdfbox.pdmodel.common;

import com.tom_roush.pdfbox.cos.COSDictionary;

/* loaded from: classes5.dex */
public class PDDictionaryWrapper implements COSObjectable {

    /* renamed from: a */
    public final COSDictionary f60163a;

    public PDDictionaryWrapper() {
        this.f60163a = new COSDictionary();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PDDictionaryWrapper) {
            return this.f60163a.equals(((PDDictionaryWrapper) obj).f60163a);
        }
        return false;
    }

    public int hashCode() {
        return this.f60163a.hashCode();
    }

    @Override // com.tom_roush.pdfbox.pdmodel.common.COSObjectable
    public COSDictionary getCOSObject() {
        return this.f60163a;
    }

    public PDDictionaryWrapper(COSDictionary cOSDictionary) {
        this.f60163a = cOSDictionary;
    }
}