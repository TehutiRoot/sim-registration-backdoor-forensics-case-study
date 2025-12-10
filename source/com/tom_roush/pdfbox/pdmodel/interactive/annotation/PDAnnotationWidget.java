package com.tom_roush.pdfbox.pdmodel.interactive.annotation;

import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.pdmodel.interactive.action.PDAction;
import com.tom_roush.pdfbox.pdmodel.interactive.action.PDActionFactory;
import com.tom_roush.pdfbox.pdmodel.interactive.action.PDAnnotationAdditionalActions;
import com.tom_roush.pdfbox.pdmodel.interactive.form.PDTerminalField;

/* loaded from: classes5.dex */
public class PDAnnotationWidget extends PDAnnotation {
    public static final String SUB_TYPE = "Widget";

    public PDAnnotationWidget() {
        getCOSObject().setName(COSName.SUBTYPE, SUB_TYPE);
    }

    public PDAction getAction() {
        COSBase dictionaryObject = getCOSObject().getDictionaryObject(COSName.f59748A);
        if (dictionaryObject instanceof COSDictionary) {
            return PDActionFactory.createAction((COSDictionary) dictionaryObject);
        }
        return null;
    }

    public PDAnnotationAdditionalActions getActions() {
        COSBase dictionaryObject = getCOSObject().getDictionaryObject(COSName.f59749AA);
        if (dictionaryObject instanceof COSDictionary) {
            return new PDAnnotationAdditionalActions((COSDictionary) dictionaryObject);
        }
        return null;
    }

    public PDAppearanceCharacteristicsDictionary getAppearanceCharacteristics() {
        COSBase dictionaryObject = getCOSObject().getDictionaryObject(COSName.f59805MK);
        if (dictionaryObject instanceof COSDictionary) {
            return new PDAppearanceCharacteristicsDictionary((COSDictionary) dictionaryObject);
        }
        return null;
    }

    public PDBorderStyleDictionary getBorderStyle() {
        COSBase dictionaryObject = getCOSObject().getDictionaryObject(COSName.f59758BS);
        if (dictionaryObject instanceof COSDictionary) {
            return new PDBorderStyleDictionary((COSDictionary) dictionaryObject);
        }
        return null;
    }

    public String getHighlightingMode() {
        return getCOSObject().getNameAsString(COSName.f59788H, "I");
    }

    public void setAction(PDAction pDAction) {
        getCOSObject().setItem(COSName.f59748A, pDAction);
    }

    public void setActions(PDAnnotationAdditionalActions pDAnnotationAdditionalActions) {
        getCOSObject().setItem(COSName.f59749AA, pDAnnotationAdditionalActions);
    }

    public void setAppearanceCharacteristics(PDAppearanceCharacteristicsDictionary pDAppearanceCharacteristicsDictionary) {
        getCOSObject().setItem(COSName.f59805MK, pDAppearanceCharacteristicsDictionary);
    }

    public void setBorderStyle(PDBorderStyleDictionary pDBorderStyleDictionary) {
        getCOSObject().setItem(COSName.f59758BS, pDBorderStyleDictionary);
    }

    public void setHighlightingMode(String str) {
        if (str != null && !"N".equals(str) && !"I".equals(str) && !PDAnnotationLink.HIGHLIGHT_MODE_OUTLINE.equals(str) && !"P".equals(str) && !"T".equals(str)) {
            throw new IllegalArgumentException("Valid values for highlighting mode are 'N', 'N', 'O', 'P' or 'T'");
        }
        getCOSObject().setName(COSName.f59788H, str);
    }

    public void setParent(PDTerminalField pDTerminalField) {
        if (!getCOSObject().equals(pDTerminalField.getCOSObject())) {
            getCOSObject().setItem(COSName.PARENT, pDTerminalField);
            return;
        }
        throw new IllegalArgumentException("setParent() is not to be called for a field that shares a dictionary with its only widget");
    }

    public PDAnnotationWidget(COSDictionary cOSDictionary) {
        super(cOSDictionary);
        getCOSObject().setName(COSName.SUBTYPE, SUB_TYPE);
    }
}
