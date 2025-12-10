package com.tom_roush.pdfbox.pdmodel.interactive.form;

import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSName;

/* loaded from: classes5.dex */
public final class PDListBox extends PDChoice {
    public PDListBox(PDAcroForm pDAcroForm) {
        super(pDAcroForm);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.interactive.form.PDTerminalField
    /* renamed from: c */
    public void mo32230c() {
        new C9966a(this).m32179u("");
    }

    public int getTopIndex() {
        return getCOSObject().getInt(COSName.f59834TI, 0);
    }

    public void setTopIndex(Integer num) {
        if (num != null) {
            getCOSObject().setInt(COSName.f59834TI, num.intValue());
        } else {
            getCOSObject().removeItem(COSName.f59834TI);
        }
    }

    public PDListBox(PDAcroForm pDAcroForm, COSDictionary cOSDictionary, PDNonTerminalField pDNonTerminalField) {
        super(pDAcroForm, cOSDictionary, pDNonTerminalField);
    }
}
