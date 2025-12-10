package com.tom_roush.pdfbox.pdmodel.interactive.form;

import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSName;
import java.io.IOException;

/* loaded from: classes5.dex */
public final class PDTextField extends PDVariableText {
    public PDTextField(PDAcroForm pDAcroForm) {
        super(pDAcroForm);
        getCOSObject().setItem(COSName.f59786FT, (COSBase) COSName.f59839TX);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.interactive.form.PDTerminalField
    /* renamed from: c */
    public void mo32230c() {
        new C9966a(this).m32179u(getValue());
    }

    public boolean doNotScroll() {
        return getCOSObject().getFlag(COSName.f59784FF, 8388608);
    }

    public boolean doNotSpellCheck() {
        return getCOSObject().getFlag(COSName.f59784FF, 4194304);
    }

    public String getDefaultValue() {
        return getStringOrStream(getInheritableAttribute(COSName.f59778DV));
    }

    public int getMaxLen() {
        return getCOSObject().getInt(COSName.MAX_LEN);
    }

    public String getValue() {
        return getStringOrStream(getInheritableAttribute(COSName.f59843V));
    }

    @Override // com.tom_roush.pdfbox.pdmodel.interactive.form.PDField
    public String getValueAsString() {
        return getValue();
    }

    public boolean isComb() {
        return getCOSObject().getFlag(COSName.f59784FF, 16777216);
    }

    public boolean isFileSelect() {
        return getCOSObject().getFlag(COSName.f59784FF, 1048576);
    }

    public boolean isMultiline() {
        return getCOSObject().getFlag(COSName.f59784FF, 4096);
    }

    public boolean isPassword() {
        return getCOSObject().getFlag(COSName.f59784FF, 8192);
    }

    public boolean isRichText() {
        return getCOSObject().getFlag(COSName.f59784FF, MediaHttpDownloader.MAXIMUM_CHUNK_SIZE);
    }

    public void setComb(boolean z) {
        getCOSObject().setFlag(COSName.f59784FF, 16777216, z);
    }

    public void setDefaultValue(String str) throws IOException {
        getCOSObject().setString(COSName.f59778DV, str);
    }

    public void setDoNotScroll(boolean z) {
        getCOSObject().setFlag(COSName.f59784FF, 8388608, z);
    }

    public void setDoNotSpellCheck(boolean z) {
        getCOSObject().setFlag(COSName.f59784FF, 4194304, z);
    }

    public void setFileSelect(boolean z) {
        getCOSObject().setFlag(COSName.f59784FF, 1048576, z);
    }

    public void setMaxLen(int i) {
        getCOSObject().setInt(COSName.MAX_LEN, i);
    }

    public void setMultiline(boolean z) {
        getCOSObject().setFlag(COSName.f59784FF, 4096, z);
    }

    public void setPassword(boolean z) {
        getCOSObject().setFlag(COSName.f59784FF, 8192, z);
    }

    public void setRichText(boolean z) {
        getCOSObject().setFlag(COSName.f59784FF, MediaHttpDownloader.MAXIMUM_CHUNK_SIZE, z);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.interactive.form.PDField
    public void setValue(String str) throws IOException {
        getCOSObject().setString(COSName.f59843V, str);
        applyChange();
    }

    public PDTextField(PDAcroForm pDAcroForm, COSDictionary cOSDictionary, PDNonTerminalField pDNonTerminalField) {
        super(pDAcroForm, cOSDictionary, pDNonTerminalField);
    }
}
