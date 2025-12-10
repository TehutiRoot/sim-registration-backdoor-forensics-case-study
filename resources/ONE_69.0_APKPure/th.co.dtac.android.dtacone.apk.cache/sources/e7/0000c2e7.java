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
    public void mo32222c() {
        C9955a c9955a = new C9955a(this);
        List<String> value = getValue();
        if (!value.isEmpty()) {
            c9955a.m32171u(value.get(0));
        } else {
            c9955a.m32171u("");
        }
    }

    public boolean isEdit() {
        return getCOSObject().getFlag(COSName.f59796FF, 262144);
    }

    public void setEdit(boolean z) {
        getCOSObject().setFlag(COSName.f59796FF, 262144, z);
    }

    public PDComboBox(PDAcroForm pDAcroForm, COSDictionary cOSDictionary, PDNonTerminalField pDNonTerminalField) {
        super(pDAcroForm, cOSDictionary, pDNonTerminalField);
    }
}