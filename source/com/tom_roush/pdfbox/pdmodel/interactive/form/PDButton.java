package com.tom_roush.pdfbox.pdmodel.interactive.form;

import com.tom_roush.pdfbox.cos.COSArray;
import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.cos.COSString;
import com.tom_roush.pdfbox.pdmodel.common.COSArrayList;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDAnnotationWidget;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDAppearanceDictionary;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDAppearanceEntry;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes5.dex */
public abstract class PDButton extends PDTerminalField {
    public PDButton(PDAcroForm pDAcroForm) {
        super(pDAcroForm);
        getCOSObject().setItem(COSName.f59786FT, (COSBase) COSName.BTN);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.interactive.form.PDTerminalField
    /* renamed from: c */
    public void mo32230c() {
        List<String> exportValues = getExportValues();
        if (exportValues.size() > 0) {
            try {
                int parseInt = Integer.parseInt(getValue());
                if (parseInt < exportValues.size()) {
                    m32242g(exportValues.get(parseInt));
                    return;
                }
                return;
            } catch (NumberFormatException unused) {
                return;
            }
        }
        m32241h(getValue());
    }

    /* renamed from: d */
    public void m32245d(String str) {
        Set<String> onValues = getOnValues();
        COSName cOSName = COSName.Off;
        if (cOSName.getName().compareTo(str) != 0 && !onValues.contains(str)) {
            throw new IllegalArgumentException("value '" + str + "' is not a valid option for the field " + getFullyQualifiedName() + ", valid values are: " + onValues + " and " + cOSName.getName());
        }
    }

    /* renamed from: e */
    public final String m32244e(int i) {
        List<PDAnnotationWidget> widgets = getWidgets();
        if (i < widgets.size()) {
            return m32243f(widgets.get(i));
        }
        return "";
    }

    /* renamed from: f */
    public final String m32243f(PDAnnotationWidget pDAnnotationWidget) {
        PDAppearanceEntry normalAppearance;
        PDAppearanceDictionary appearance = pDAnnotationWidget.getAppearance();
        if (appearance != null && (normalAppearance = appearance.getNormalAppearance()) != null) {
            for (COSName cOSName : normalAppearance.getSubDictionary().keySet()) {
                if (COSName.Off.compareTo(cOSName) != 0) {
                    return cOSName.getName();
                }
            }
            return "";
        }
        return "";
    }

    /* renamed from: g */
    public final void m32242g(String str) {
        List<PDAnnotationWidget> widgets = getWidgets();
        List<String> exportValues = getExportValues();
        if (widgets.size() == exportValues.size()) {
            if (str.equals(COSName.Off.getName())) {
                m32241h(str);
                return;
            }
            int indexOf = exportValues.indexOf(str);
            if (indexOf != -1) {
                m32241h(m32244e(indexOf));
                return;
            }
            return;
        }
        throw new IllegalArgumentException("The number of options doesn't match the number of widgets");
    }

    public String getDefaultValue() {
        COSBase inheritableAttribute = getInheritableAttribute(COSName.f59778DV);
        if (inheritableAttribute instanceof COSName) {
            return ((COSName) inheritableAttribute).getName();
        }
        return "";
    }

    public List<String> getExportValues() {
        COSBase inheritableAttribute = getInheritableAttribute(COSName.OPT);
        if (inheritableAttribute instanceof COSString) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(((COSString) inheritableAttribute).getString());
            return arrayList;
        } else if (inheritableAttribute instanceof COSArray) {
            return COSArrayList.convertCOSStringCOSArrayToList((COSArray) inheritableAttribute);
        } else {
            return Collections.emptyList();
        }
    }

    public Set<String> getOnValues() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (getExportValues().size() > 0) {
            linkedHashSet.addAll(getExportValues());
            return linkedHashSet;
        }
        for (PDAnnotationWidget pDAnnotationWidget : getWidgets()) {
            linkedHashSet.add(m32243f(pDAnnotationWidget));
        }
        return linkedHashSet;
    }

    public String getValue() {
        COSBase inheritableAttribute = getInheritableAttribute(COSName.f59843V);
        if (inheritableAttribute instanceof COSName) {
            String name = ((COSName) inheritableAttribute).getName();
            List<String> exportValues = getExportValues();
            if (!exportValues.isEmpty()) {
                try {
                    int parseInt = Integer.parseInt(name, 10);
                    if (parseInt >= 0 && parseInt < exportValues.size()) {
                        return exportValues.get(parseInt);
                    }
                } catch (NumberFormatException unused) {
                }
            }
            return name;
        }
        return "Off";
    }

    @Override // com.tom_roush.pdfbox.pdmodel.interactive.form.PDField
    public String getValueAsString() {
        return getValue();
    }

    /* renamed from: h */
    public final void m32241h(String str) {
        getCOSObject().setName(COSName.f59843V, str);
        for (PDAnnotationWidget pDAnnotationWidget : getWidgets()) {
            if (pDAnnotationWidget.getAppearance() != null) {
                if (((COSDictionary) pDAnnotationWidget.getAppearance().getNormalAppearance().getCOSObject()).containsKey(str)) {
                    pDAnnotationWidget.setAppearanceState(str);
                } else {
                    pDAnnotationWidget.setAppearanceState(COSName.Off.getName());
                }
            }
        }
    }

    public boolean isPushButton() {
        return getCOSObject().getFlag(COSName.f59784FF, 65536);
    }

    public boolean isRadioButton() {
        return getCOSObject().getFlag(COSName.f59784FF, 32768);
    }

    public void setDefaultValue(String str) {
        m32245d(str);
        getCOSObject().setName(COSName.f59778DV, str);
    }

    public void setExportValues(List<String> list) {
        if (list != null && !list.isEmpty()) {
            getCOSObject().setItem(COSName.OPT, (COSBase) COSArrayList.convertStringListToCOSStringCOSArray(list));
            return;
        }
        getCOSObject().removeItem(COSName.OPT);
    }

    @Deprecated
    public void setPushButton(boolean z) {
        getCOSObject().setFlag(COSName.f59784FF, 65536, z);
        if (z) {
            setRadioButton(false);
        }
    }

    @Deprecated
    public void setRadioButton(boolean z) {
        getCOSObject().setFlag(COSName.f59784FF, 32768, z);
        if (z) {
            setPushButton(false);
        }
    }

    @Override // com.tom_roush.pdfbox.pdmodel.interactive.form.PDField
    public void setValue(String str) throws IOException {
        m32245d(str);
        if (getExportValues().size() > 0) {
            m32242g(str);
        } else {
            m32241h(str);
        }
        applyChange();
    }

    public PDButton(PDAcroForm pDAcroForm, COSDictionary cOSDictionary, PDNonTerminalField pDNonTerminalField) {
        super(pDAcroForm, cOSDictionary, pDNonTerminalField);
    }

    public void setValue(int i) throws IOException {
        if (!getExportValues().isEmpty() && i >= 0 && i < getExportValues().size()) {
            m32241h(String.valueOf(i));
            applyChange();
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("index '");
        sb.append(i);
        sb.append("' is not a valid index for the field ");
        sb.append(getFullyQualifiedName());
        sb.append(", valid indices are from 0 to ");
        sb.append(getExportValues().size() - 1);
        throw new IllegalArgumentException(sb.toString());
    }
}
