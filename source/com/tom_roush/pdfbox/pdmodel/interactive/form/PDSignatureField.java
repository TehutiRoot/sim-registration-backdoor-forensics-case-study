package com.tom_roush.pdfbox.pdmodel.interactive.form;

import android.util.Log;
import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDAnnotationWidget;
import com.tom_roush.pdfbox.pdmodel.interactive.digitalsignature.PDSeedValue;
import com.tom_roush.pdfbox.pdmodel.interactive.digitalsignature.PDSignature;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes5.dex */
public class PDSignatureField extends PDTerminalField {
    public PDSignatureField(PDAcroForm pDAcroForm) throws IOException {
        super(pDAcroForm);
        getCOSObject().setItem(COSName.f59786FT, (COSBase) COSName.SIG);
        getWidgets().get(0).setLocked(true);
        getWidgets().get(0).setPrinted(true);
        setPartialName(m32232d());
    }

    @Override // com.tom_roush.pdfbox.pdmodel.interactive.form.PDTerminalField
    /* renamed from: c */
    public void mo32230c() {
        PDAnnotationWidget pDAnnotationWidget = getWidgets().get(0);
        if (pDAnnotationWidget != null && pDAnnotationWidget.getRectangle() != null) {
            if ((pDAnnotationWidget.getRectangle().getHeight() != 0.0f || pDAnnotationWidget.getRectangle().getWidth() != 0.0f) && !pDAnnotationWidget.isNoView() && !pDAnnotationWidget.isHidden()) {
                Log.w("PdfBox-Android", "Appearance generation for signature fields not implemented here. You need to generate/update that manually, see the CreateVisibleSignature*.java files in the examples subproject of the source code download");
            }
        }
    }

    /* renamed from: d */
    public final String m32232d() {
        HashSet hashSet = new HashSet();
        Iterator<PDField> it = getAcroForm().getFieldTree().iterator();
        while (it.hasNext()) {
            hashSet.add(it.next().getPartialName());
        }
        int i = 1;
        while (true) {
            if (hashSet.contains("Signature" + i)) {
                i++;
            } else {
                return "Signature" + i;
            }
        }
    }

    public PDSignature getDefaultValue() {
        COSBase dictionaryObject = getCOSObject().getDictionaryObject(COSName.f59778DV);
        if (dictionaryObject == null) {
            return null;
        }
        return new PDSignature((COSDictionary) dictionaryObject);
    }

    public PDSeedValue getSeedValue() {
        COSDictionary cOSDictionary = (COSDictionary) getCOSObject().getDictionaryObject(COSName.f59830SV);
        if (cOSDictionary != null) {
            return new PDSeedValue(cOSDictionary);
        }
        return null;
    }

    public PDSignature getSignature() {
        return getValue();
    }

    public PDSignature getValue() {
        COSBase dictionaryObject = getCOSObject().getDictionaryObject(COSName.f59843V);
        if (dictionaryObject instanceof COSDictionary) {
            return new PDSignature((COSDictionary) dictionaryObject);
        }
        return null;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.interactive.form.PDField
    public String getValueAsString() {
        PDSignature value = getValue();
        if (value != null) {
            return value.toString();
        }
        return "";
    }

    public void setDefaultValue(PDSignature pDSignature) throws IOException {
        getCOSObject().setItem(COSName.f59778DV, pDSignature);
    }

    public void setSeedValue(PDSeedValue pDSeedValue) {
        if (pDSeedValue != null) {
            getCOSObject().setItem(COSName.f59830SV, pDSeedValue);
        }
    }

    @Deprecated
    public void setSignature(PDSignature pDSignature) throws IOException {
        setValue(pDSignature);
    }

    public void setValue(PDSignature pDSignature) throws IOException {
        getCOSObject().setItem(COSName.f59843V, pDSignature);
        applyChange();
    }

    @Override // com.tom_roush.pdfbox.pdmodel.interactive.form.PDField
    public void setValue(String str) {
        throw new UnsupportedOperationException("Signature fields don't support setting the value as String - use setValue(PDSignature value) instead");
    }

    public PDSignatureField(PDAcroForm pDAcroForm, COSDictionary cOSDictionary, PDNonTerminalField pDNonTerminalField) {
        super(pDAcroForm, cOSDictionary, pDNonTerminalField);
    }
}
