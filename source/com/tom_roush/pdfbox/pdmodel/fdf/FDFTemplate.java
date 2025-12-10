package com.tom_roush.pdfbox.pdmodel.fdf;

import com.tom_roush.pdfbox.cos.COSArray;
import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.pdmodel.common.COSArrayList;
import com.tom_roush.pdfbox.pdmodel.common.COSObjectable;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes5.dex */
public class FDFTemplate implements COSObjectable {

    /* renamed from: a */
    public final COSDictionary f60341a;

    public FDFTemplate() {
        this.f60341a = new COSDictionary();
    }

    public List<FDFField> getFields() {
        COSArray cOSArray = (COSArray) this.f60341a.getDictionaryObject(COSName.FIELDS);
        if (cOSArray != null) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < cOSArray.size(); i++) {
                arrayList.add(new FDFField((COSDictionary) cOSArray.getObject(i)));
            }
            return new COSArrayList(arrayList, cOSArray);
        }
        return null;
    }

    public FDFNamedPageReference getTemplateReference() {
        COSDictionary cOSDictionary = (COSDictionary) this.f60341a.getDictionaryObject(COSName.TREF);
        if (cOSDictionary != null) {
            return new FDFNamedPageReference(cOSDictionary);
        }
        return null;
    }

    public void setFields(List<FDFField> list) {
        this.f60341a.setItem(COSName.FIELDS, (COSBase) COSArrayList.converterToCOSArray(list));
    }

    public void setRename(boolean z) {
        this.f60341a.setBoolean(COSName.RENAME, z);
    }

    public void setTemplateReference(FDFNamedPageReference fDFNamedPageReference) {
        this.f60341a.setItem(COSName.TREF, fDFNamedPageReference);
    }

    public boolean shouldRename() {
        return this.f60341a.getBoolean(COSName.RENAME, false);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.common.COSObjectable
    public COSDictionary getCOSObject() {
        return this.f60341a;
    }

    public FDFTemplate(COSDictionary cOSDictionary) {
        this.f60341a = cOSDictionary;
    }
}
