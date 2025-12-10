package com.tom_roush.pdfbox.pdmodel.common;

import com.tom_roush.pdfbox.cos.COSDictionary;

/* loaded from: classes5.dex */
public class PDDictionaryWrapper implements COSObjectable {

    /* renamed from: a */
    public final COSDictionary f60151a;

    public PDDictionaryWrapper() {
        this.f60151a = new COSDictionary();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PDDictionaryWrapper) {
            return this.f60151a.equals(((PDDictionaryWrapper) obj).f60151a);
        }
        return false;
    }

    public int hashCode() {
        return this.f60151a.hashCode();
    }

    @Override // com.tom_roush.pdfbox.pdmodel.common.COSObjectable
    public COSDictionary getCOSObject() {
        return this.f60151a;
    }

    public PDDictionaryWrapper(COSDictionary cOSDictionary) {
        this.f60151a = cOSDictionary;
    }
}
