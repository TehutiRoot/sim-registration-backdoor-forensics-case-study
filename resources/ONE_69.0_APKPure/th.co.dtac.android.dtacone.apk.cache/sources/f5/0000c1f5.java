package com.tom_roush.pdfbox.pdmodel.fdf;

import com.tom_roush.pdfbox.cos.COSArray;
import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.cos.COSStream;
import com.tom_roush.pdfbox.cos.COSString;
import com.tom_roush.pdfbox.pdmodel.common.COSObjectable;
import com.tom_roush.pdfbox.pdmodel.interactive.action.PDAction;
import com.tom_roush.pdfbox.pdmodel.interactive.action.PDActionFactory;
import com.tom_roush.pdfbox.pdmodel.interactive.action.PDActionJavaScript;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public class FDFJavaScript implements COSObjectable {

    /* renamed from: a */
    public final COSDictionary f60348a;

    public FDFJavaScript() {
        this.f60348a = new COSDictionary();
    }

    public String getAfter() {
        COSBase dictionaryObject = this.f60348a.getDictionaryObject(COSName.AFTER);
        if (dictionaryObject instanceof COSString) {
            return ((COSString) dictionaryObject).getString();
        }
        if (dictionaryObject instanceof COSStream) {
            return ((COSStream) dictionaryObject).toTextString();
        }
        return null;
    }

    public String getBefore() {
        COSBase dictionaryObject = this.f60348a.getDictionaryObject(COSName.BEFORE);
        if (dictionaryObject instanceof COSString) {
            return ((COSString) dictionaryObject).getString();
        }
        if (dictionaryObject instanceof COSStream) {
            return ((COSStream) dictionaryObject).toTextString();
        }
        return null;
    }

    public Map<String, PDActionJavaScript> getDoc() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        COSArray cOSArray = this.f60348a.getCOSArray(COSName.DOC);
        if (cOSArray == null) {
            return null;
        }
        int i = 0;
        while (true) {
            int i2 = i + 1;
            if (i2 < cOSArray.size()) {
                String name = cOSArray.getName(i);
                if (name != null) {
                    COSBase object = cOSArray.getObject(i2);
                    if (object instanceof COSDictionary) {
                        PDAction createAction = PDActionFactory.createAction((COSDictionary) object);
                        if (createAction instanceof PDActionJavaScript) {
                            linkedHashMap.put(name, (PDActionJavaScript) createAction);
                        }
                    }
                }
                i += 2;
            } else {
                return linkedHashMap;
            }
        }
    }

    public void setAfter(String str) {
        this.f60348a.setItem(COSName.AFTER, (COSBase) new COSString(str));
    }

    public void setBefore(String str) {
        this.f60348a.setItem(COSName.BEFORE, (COSBase) new COSString(str));
    }

    public void setDoc(Map<String, PDActionJavaScript> map) {
        COSArray cOSArray = new COSArray();
        for (Map.Entry<String, PDActionJavaScript> entry : map.entrySet()) {
            cOSArray.add((COSBase) new COSString(entry.getKey()));
            cOSArray.add(entry.getValue());
        }
        this.f60348a.setItem(COSName.DOC, (COSBase) cOSArray);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.common.COSObjectable
    public COSDictionary getCOSObject() {
        return this.f60348a;
    }

    public FDFJavaScript(COSDictionary cOSDictionary) {
        this.f60348a = cOSDictionary;
    }
}