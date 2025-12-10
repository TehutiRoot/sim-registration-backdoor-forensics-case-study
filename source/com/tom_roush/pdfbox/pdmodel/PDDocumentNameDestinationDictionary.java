package com.tom_roush.pdfbox.pdmodel;

import com.tom_roush.pdfbox.cos.COSArray;
import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.pdmodel.common.COSObjectable;
import com.tom_roush.pdfbox.pdmodel.interactive.documentnavigation.destination.PDDestination;
import java.io.IOException;

/* loaded from: classes5.dex */
public class PDDocumentNameDestinationDictionary implements COSObjectable {

    /* renamed from: a */
    public final COSDictionary f60115a;

    public PDDocumentNameDestinationDictionary(COSDictionary cOSDictionary) {
        this.f60115a = cOSDictionary;
    }

    public PDDestination getDestination(String str) throws IOException {
        COSBase dictionaryObject = this.f60115a.getDictionaryObject(str);
        if (dictionaryObject instanceof COSArray) {
            return PDDestination.create(dictionaryObject);
        }
        if (dictionaryObject instanceof COSDictionary) {
            COSDictionary cOSDictionary = (COSDictionary) dictionaryObject;
            COSName cOSName = COSName.f59770D;
            if (cOSDictionary.containsKey(cOSName)) {
                return PDDestination.create(cOSDictionary.getDictionaryObject(cOSName));
            }
            return null;
        }
        return null;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.common.COSObjectable
    public COSDictionary getCOSObject() {
        return this.f60115a;
    }
}
