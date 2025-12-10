package com.tom_roush.pdfbox.pdmodel.interactive.form;

import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDAnnotationWidget;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* loaded from: classes5.dex */
public final class PDRadioButton extends PDButton {
    public PDRadioButton(PDAcroForm pDAcroForm) {
        super(pDAcroForm);
        getCOSObject().setFlag(COSName.f59784FF, 32768, true);
    }

    public List<String> getSelectedExportValues() throws IOException {
        Set<String> onValues = getOnValues();
        List<String> exportValues = getExportValues();
        ArrayList arrayList = new ArrayList();
        if (exportValues.isEmpty()) {
            arrayList.add(getValue());
            return arrayList;
        }
        String value = getValue();
        int i = 0;
        for (String str : onValues) {
            if (str.compareTo(value) == 0) {
                arrayList.add(exportValues.get(i));
            }
            i++;
        }
        return arrayList;
    }

    public int getSelectedIndex() {
        int i = 0;
        for (PDAnnotationWidget pDAnnotationWidget : getWidgets()) {
            if (!COSName.Off.equals(pDAnnotationWidget.getAppearanceState())) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public boolean isRadiosInUnison() {
        return getCOSObject().getFlag(COSName.f59784FF, MediaHttpDownloader.MAXIMUM_CHUNK_SIZE);
    }

    public void setRadiosInUnison(boolean z) {
        getCOSObject().setFlag(COSName.f59784FF, MediaHttpDownloader.MAXIMUM_CHUNK_SIZE, z);
    }

    public PDRadioButton(PDAcroForm pDAcroForm, COSDictionary cOSDictionary, PDNonTerminalField pDNonTerminalField) {
        super(pDAcroForm, cOSDictionary, pDNonTerminalField);
    }
}
