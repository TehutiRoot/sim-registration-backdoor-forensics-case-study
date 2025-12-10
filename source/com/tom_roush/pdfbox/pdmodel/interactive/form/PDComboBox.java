package com.tom_roush.pdfbox.pdmodel.interactive.form;

import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSName;
import java.util.List;

/* loaded from: classes5.dex */
public final class PDComboBox extends PDChoice {
    public PDComboBox(PDAcroForm pDAcroForm) {
        super(pDAcroForm);
        setCombo(true);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.interactive.form.PDTerminalField
    /* renamed from: c */
    public void mo32230c() {
        C9966a c9966a = new C9966a(this);
        List<String> value = getValue();
        if (!value.isEmpty()) {
            c9966a.m32179u(value.get(0));
        } else {
            c9966a.m32179u("");
        }
    }

    public boolean isEdit() {
        return getCOSObject().getFlag(COSName.f59784FF, 262144);
    }

    public void setEdit(boolean z) {
        getCOSObject().setFlag(COSName.f59784FF, 262144, z);
    }

    public PDComboBox(PDAcroForm pDAcroForm, COSDictionary cOSDictionary, PDNonTerminalField pDNonTerminalField) {
        super(pDAcroForm, cOSDictionary, pDNonTerminalField);
    }
}
