package com.tom_roush.pdfbox.pdmodel.interactive.form;

import android.util.Log;
import com.tom_roush.pdfbox.cos.COSArray;
import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSInteger;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.pdmodel.common.COSArrayList;
import com.tom_roush.pdfbox.pdmodel.fdf.FDFField;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDAnnotationWidget;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes5.dex */
public class PDNonTerminalField extends PDField {
    public PDNonTerminalField(PDAcroForm pDAcroForm) {
        super(pDAcroForm);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.interactive.form.PDField
    /* renamed from: a */
    public FDFField mo32231a() {
        FDFField fDFField = new FDFField();
        fDFField.setPartialFieldName(getPartialName());
        fDFField.setValue(getValue());
        List<PDField> children = getChildren();
        ArrayList arrayList = new ArrayList(children.size());
        for (PDField pDField : children) {
            arrayList.add(pDField.mo32231a());
        }
        fDFField.setKids(arrayList);
        return fDFField;
    }

    public List<PDField> getChildren() {
        ArrayList arrayList = new ArrayList();
        COSArray cOSArray = getCOSObject().getCOSArray(COSName.KIDS);
        if (cOSArray == null) {
            return arrayList;
        }
        for (int i = 0; i < cOSArray.size(); i++) {
            COSBase object = cOSArray.getObject(i);
            if (object instanceof COSDictionary) {
                if (object.getCOSObject() == getCOSObject()) {
                    Log.w("PdfBox-Android", "Child field is same object as parent");
                } else {
                    PDField m32238b = PDField.m32238b(getAcroForm(), (COSDictionary) object, this);
                    if (m32238b != null) {
                        arrayList.add(m32238b);
                    }
                }
            }
        }
        return arrayList;
    }

    public COSBase getDefaultValue() {
        return getCOSObject().getDictionaryObject(COSName.f59778DV);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.interactive.form.PDField
    public int getFieldFlags() {
        COSInteger cOSInteger = (COSInteger) getCOSObject().getDictionaryObject(COSName.f59784FF);
        if (cOSInteger != null) {
            return cOSInteger.intValue();
        }
        return 0;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.interactive.form.PDField
    public String getFieldType() {
        return getCOSObject().getNameAsString(COSName.f59786FT);
    }

    public COSBase getValue() {
        return getCOSObject().getDictionaryObject(COSName.f59843V);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.interactive.form.PDField
    public String getValueAsString() {
        COSBase dictionaryObject = getCOSObject().getDictionaryObject(COSName.f59843V);
        if (dictionaryObject != null) {
            return dictionaryObject.toString();
        }
        return "";
    }

    @Override // com.tom_roush.pdfbox.pdmodel.interactive.form.PDField
    public List<PDAnnotationWidget> getWidgets() {
        return Collections.emptyList();
    }

    @Override // com.tom_roush.pdfbox.pdmodel.interactive.form.PDField
    public void importFDF(FDFField fDFField) {
        super.importFDF(fDFField);
        List<FDFField> kids = fDFField.getKids();
        List<PDField> children = getChildren();
        if (kids == null) {
            return;
        }
        for (int i = 0; i < kids.size(); i++) {
            for (PDField pDField : children) {
                FDFField fDFField2 = kids.get(i);
                String partialFieldName = fDFField2.getPartialFieldName();
                if (partialFieldName != null && partialFieldName.equals(pDField.getPartialName())) {
                    pDField.importFDF(fDFField2);
                }
            }
        }
    }

    public void setChildren(List<PDField> list) {
        getCOSObject().setItem(COSName.KIDS, (COSBase) COSArrayList.converterToCOSArray(list));
    }

    public void setDefaultValue(COSBase cOSBase) {
        getCOSObject().setItem(COSName.f59843V, cOSBase);
    }

    public void setValue(COSBase cOSBase) throws IOException {
        getCOSObject().setItem(COSName.f59843V, cOSBase);
    }

    public PDNonTerminalField(PDAcroForm pDAcroForm, COSDictionary cOSDictionary, PDNonTerminalField pDNonTerminalField) {
        super(pDAcroForm, cOSDictionary, pDNonTerminalField);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.interactive.form.PDField
    public void setValue(String str) throws IOException {
        getCOSObject().setString(COSName.f59843V, str);
    }
}
