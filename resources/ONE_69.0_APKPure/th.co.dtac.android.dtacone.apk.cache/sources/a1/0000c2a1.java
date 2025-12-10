package com.tom_roush.pdfbox.pdmodel.interactive.annotation;

import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.cos.COSStream;
import com.tom_roush.pdfbox.pdmodel.common.COSDictionaryMap;
import com.tom_roush.pdfbox.pdmodel.common.COSObjectable;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public class PDAppearanceEntry implements COSObjectable {

    /* renamed from: a */
    public COSBase f60599a;

    public PDAppearanceEntry(COSBase cOSBase) {
        this.f60599a = cOSBase;
    }

    public PDAppearanceStream getAppearanceStream() {
        if (isStream()) {
            return new PDAppearanceStream((COSStream) this.f60599a);
        }
        throw new IllegalStateException("This entry is not an appearance stream");
    }

    @Override // com.tom_roush.pdfbox.pdmodel.common.COSObjectable
    public COSBase getCOSObject() {
        return this.f60599a;
    }

    public Map<COSName, PDAppearanceStream> getSubDictionary() {
        if (isSubDictionary()) {
            COSDictionary cOSDictionary = (COSDictionary) this.f60599a;
            HashMap hashMap = new HashMap();
            for (COSName cOSName : cOSDictionary.keySet()) {
                COSBase dictionaryObject = cOSDictionary.getDictionaryObject(cOSName);
                if (dictionaryObject instanceof COSStream) {
                    hashMap.put(cOSName, new PDAppearanceStream((COSStream) dictionaryObject));
                }
            }
            return new COSDictionaryMap(hashMap, cOSDictionary);
        }
        throw new IllegalStateException("This entry is not an appearance subdictionary");
    }

    public boolean isStream() {
        return this.f60599a instanceof COSStream;
    }

    public boolean isSubDictionary() {
        return !(this.f60599a instanceof COSStream);
    }
}