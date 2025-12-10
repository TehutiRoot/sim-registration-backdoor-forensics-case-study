package com.tom_roush.pdfbox.pdmodel.documentinterchange.logicalstructure;

import com.tom_roush.pdfbox.cos.COSArray;
import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.pdmodel.common.COSObjectable;

/* loaded from: classes5.dex */
public class PDParentTreeValue implements COSObjectable {

    /* renamed from: a */
    public COSObjectable f60271a;

    public PDParentTreeValue(COSArray cOSArray) {
        this.f60271a = cOSArray;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.common.COSObjectable
    public COSBase getCOSObject() {
        return this.f60271a.getCOSObject();
    }

    public String toString() {
        return this.f60271a.toString();
    }

    public PDParentTreeValue(COSDictionary cOSDictionary) {
        this.f60271a = cOSDictionary;
    }
}
