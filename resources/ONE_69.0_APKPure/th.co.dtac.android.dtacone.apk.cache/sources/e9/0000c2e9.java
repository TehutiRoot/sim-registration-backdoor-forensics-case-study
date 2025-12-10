package com.tom_roush.pdfbox.pdmodel.interactive.form;

import com.tom_roush.pdfbox.cos.COSArray;
import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSName;

/* loaded from: classes5.dex */
public final class PDFieldFactory {
    /* renamed from: a */
    public static PDField m32229a(PDAcroForm pDAcroForm, COSDictionary cOSDictionary, PDNonTerminalField pDNonTerminalField) {
        int i = cOSDictionary.getInt(COSName.f59796FF, 0);
        if ((32768 & i) != 0) {
            return new PDRadioButton(pDAcroForm, cOSDictionary, pDNonTerminalField);
        }
        if ((i & 65536) != 0) {
            return new PDPushButton(pDAcroForm, cOSDictionary, pDNonTerminalField);
        }
        return new PDCheckBox(pDAcroForm, cOSDictionary, pDNonTerminalField);
    }

    /* renamed from: b */
    public static PDField m32228b(PDAcroForm pDAcroForm, COSDictionary cOSDictionary, PDNonTerminalField pDNonTerminalField) {
        if ((cOSDictionary.getInt(COSName.f59796FF, 0) & 131072) != 0) {
            return new PDComboBox(pDAcroForm, cOSDictionary, pDNonTerminalField);
        }
        return new PDListBox(pDAcroForm, cOSDictionary, pDNonTerminalField);
    }

    /* renamed from: c */
    public static String m32227c(COSDictionary cOSDictionary) {
        String nameAsString = cOSDictionary.getNameAsString(COSName.f59798FT);
        if (nameAsString == null) {
            COSBase dictionaryObject = cOSDictionary.getDictionaryObject(COSName.PARENT, COSName.f59827P);
            if (dictionaryObject instanceof COSDictionary) {
                return m32227c((COSDictionary) dictionaryObject);
            }
            return nameAsString;
        }
        return nameAsString;
    }

    public static PDField createField(PDAcroForm pDAcroForm, COSDictionary cOSDictionary, PDNonTerminalField pDNonTerminalField) {
        COSArray cOSArray;
        String m32227c = m32227c(cOSDictionary);
        COSName cOSName = COSName.KIDS;
        if (cOSDictionary.containsKey(cOSName) && (cOSArray = (COSArray) cOSDictionary.getDictionaryObject(cOSName)) != null && cOSArray.size() > 0) {
            for (int i = 0; i < cOSArray.size(); i++) {
                COSBase object = cOSArray.getObject(i);
                if ((object instanceof COSDictionary) && ((COSDictionary) object).getString(COSName.f59845T) != null) {
                    return new PDNonTerminalField(pDAcroForm, cOSDictionary, pDNonTerminalField);
                }
            }
        }
        if ("Ch".equals(m32227c)) {
            return m32228b(pDAcroForm, cOSDictionary, pDNonTerminalField);
        }
        if ("Tx".equals(m32227c)) {
            return new PDTextField(pDAcroForm, cOSDictionary, pDNonTerminalField);
        }
        if ("Sig".equals(m32227c)) {
            return new PDSignatureField(pDAcroForm, cOSDictionary, pDNonTerminalField);
        }
        if ("Btn".equals(m32227c)) {
            return m32229a(pDAcroForm, cOSDictionary, pDNonTerminalField);
        }
        return null;
    }
}