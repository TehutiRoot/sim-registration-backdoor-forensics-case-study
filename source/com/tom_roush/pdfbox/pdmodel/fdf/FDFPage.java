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
public class FDFPage implements COSObjectable {

    /* renamed from: a */
    public final COSDictionary f60339a;

    public FDFPage() {
        this.f60339a = new COSDictionary();
    }

    public FDFPageInfo getPageInfo() {
        COSDictionary cOSDictionary = this.f60339a.getCOSDictionary(COSName.INFO);
        if (cOSDictionary != null) {
            return new FDFPageInfo(cOSDictionary);
        }
        return null;
    }

    public List<FDFTemplate> getTemplates() {
        COSArray cOSArray = (COSArray) this.f60339a.getDictionaryObject(COSName.TEMPLATES);
        if (cOSArray != null) {
            ArrayList arrayList = new ArrayList(cOSArray.size());
            for (int i = 0; i < cOSArray.size(); i++) {
                arrayList.add(new FDFTemplate((COSDictionary) cOSArray.getObject(i)));
            }
            return new COSArrayList(arrayList, cOSArray);
        }
        return null;
    }

    public void setPageInfo(FDFPageInfo fDFPageInfo) {
        this.f60339a.setItem(COSName.INFO, fDFPageInfo);
    }

    public void setTemplates(List<FDFTemplate> list) {
        this.f60339a.setItem(COSName.TEMPLATES, (COSBase) COSArrayList.converterToCOSArray(list));
    }

    @Override // com.tom_roush.pdfbox.pdmodel.common.COSObjectable
    public COSDictionary getCOSObject() {
        return this.f60339a;
    }

    public FDFPage(COSDictionary cOSDictionary) {
        this.f60339a = cOSDictionary;
    }
}
