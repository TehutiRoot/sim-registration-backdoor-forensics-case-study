package com.tom_roush.pdfbox.pdmodel.interactive.form;

import com.tom_roush.pdfbox.cos.COSArray;
import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.cos.COSString;
import com.tom_roush.pdfbox.pdmodel.common.COSArrayList;
import com.tom_roush.pdfbox.pdmodel.interactive.form.FieldUtils;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes5.dex */
public abstract class PDChoice extends PDVariableText {
    public PDChoice(PDAcroForm pDAcroForm) {
        super(pDAcroForm);
        getCOSObject().setItem(COSName.f59798FT, (COSBase) COSName.f59776CH);
    }

    /* renamed from: e */
    public final List m32232e(COSName cOSName) {
        COSBase dictionaryObject = getCOSObject().getDictionaryObject(cOSName);
        if (dictionaryObject instanceof COSString) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(((COSString) dictionaryObject).getString());
            return arrayList;
        } else if (dictionaryObject instanceof COSArray) {
            return COSArrayList.convertCOSStringCOSArrayToList((COSArray) dictionaryObject);
        } else {
            return Collections.emptyList();
        }
    }

    /* renamed from: f */
    public final void m32231f(List list) {
        List<String> options = getOptions();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(options.indexOf((String) it.next())));
        }
        Collections.sort(arrayList);
        setSelectedOptionsIndex(arrayList);
    }

    public List<String> getDefaultValue() {
        return m32232e(COSName.f59790DV);
    }

    public List<String> getOptions() {
        return FieldUtils.m32251a(getCOSObject().getDictionaryObject(COSName.OPT), 0);
    }

    public List<String> getOptionsDisplayValues() {
        return FieldUtils.m32251a(getCOSObject().getDictionaryObject(COSName.OPT), 1);
    }

    public List<String> getOptionsExportValues() {
        return getOptions();
    }

    public List<Integer> getSelectedOptionsIndex() {
        COSBase dictionaryObject = getCOSObject().getDictionaryObject(COSName.f59801I);
        if (dictionaryObject != null) {
            return COSArrayList.convertIntegerCOSArrayToList((COSArray) dictionaryObject);
        }
        return Collections.emptyList();
    }

    public List<String> getValue() {
        return m32232e(COSName.f59855V);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.interactive.form.PDField
    public String getValueAsString() {
        return Arrays.toString(getValue().toArray());
    }

    public boolean isCombo() {
        return getCOSObject().getFlag(COSName.f59796FF, 131072);
    }

    public boolean isCommitOnSelChange() {
        return getCOSObject().getFlag(COSName.f59796FF, 67108864);
    }

    public boolean isDoNotSpellCheck() {
        return getCOSObject().getFlag(COSName.f59796FF, 4194304);
    }

    public boolean isMultiSelect() {
        return getCOSObject().getFlag(COSName.f59796FF, 2097152);
    }

    public boolean isSort() {
        return getCOSObject().getFlag(COSName.f59796FF, 524288);
    }

    public void setCombo(boolean z) {
        getCOSObject().setFlag(COSName.f59796FF, 131072, z);
    }

    public void setCommitOnSelChange(boolean z) {
        getCOSObject().setFlag(COSName.f59796FF, 67108864, z);
    }

    public void setDefaultValue(String str) throws IOException {
        getCOSObject().setString(COSName.f59790DV, str);
    }

    public void setDoNotSpellCheck(boolean z) {
        getCOSObject().setFlag(COSName.f59796FF, 4194304, z);
    }

    public void setMultiSelect(boolean z) {
        getCOSObject().setFlag(COSName.f59796FF, 2097152, z);
    }

    public void setOptions(List<String> list) {
        if (list != null && !list.isEmpty()) {
            if (isSort()) {
                Collections.sort(list);
            }
            getCOSObject().setItem(COSName.OPT, (COSBase) COSArrayList.convertStringListToCOSStringCOSArray(list));
            return;
        }
        getCOSObject().removeItem(COSName.OPT);
    }

    public void setSelectedOptionsIndex(List<Integer> list) {
        if (list != null && !list.isEmpty()) {
            if (isMultiSelect()) {
                getCOSObject().setItem(COSName.f59801I, (COSBase) COSArrayList.converterToCOSArray(list));
                return;
            }
            throw new IllegalArgumentException("Setting the indices is not allowed for choice fields not allowing multiple selections.");
        }
        getCOSObject().removeItem(COSName.f59801I);
    }

    public void setSort(boolean z) {
        getCOSObject().setFlag(COSName.f59796FF, 524288, z);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.interactive.form.PDField
    public void setValue(String str) throws IOException {
        getCOSObject().setString(COSName.f59855V, str);
        setSelectedOptionsIndex(null);
        applyChange();
    }

    public PDChoice(PDAcroForm pDAcroForm, COSDictionary cOSDictionary, PDNonTerminalField pDNonTerminalField) {
        super(pDAcroForm, cOSDictionary, pDNonTerminalField);
    }

    public void setValue(List<String> list) throws IOException {
        if (list != null && !list.isEmpty()) {
            if (isMultiSelect()) {
                if (getOptions().containsAll(list)) {
                    getCOSObject().setItem(COSName.f59855V, (COSBase) COSArrayList.convertStringListToCOSStringCOSArray(list));
                    m32231f(list);
                } else {
                    throw new IllegalArgumentException("The values are not contained in the selectable options.");
                }
            } else {
                throw new IllegalArgumentException("The list box does not allow multiple selections.");
            }
        } else {
            getCOSObject().removeItem(COSName.f59855V);
            getCOSObject().removeItem(COSName.f59801I);
        }
        applyChange();
    }

    public void setOptions(List<String> list, List<String> list2) {
        if (list != null && list2 != null && !list.isEmpty() && !list2.isEmpty()) {
            if (list.size() == list2.size()) {
                List m32249c = FieldUtils.m32249c(list, list2);
                if (isSort()) {
                    FieldUtils.m32250b(m32249c);
                }
                COSArray cOSArray = new COSArray();
                for (int i = 0; i < list.size(); i++) {
                    COSArray cOSArray2 = new COSArray();
                    cOSArray2.add((COSBase) new COSString(((FieldUtils.C9947a) m32249c.get(i)).m32246c()));
                    cOSArray2.add((COSBase) new COSString(((FieldUtils.C9947a) m32249c.get(i)).m32245d()));
                    cOSArray.add((COSBase) cOSArray2);
                }
                getCOSObject().setItem(COSName.OPT, (COSBase) cOSArray);
                return;
            }
            throw new IllegalArgumentException("The number of entries for exportValue and displayValue shall be the same.");
        }
        getCOSObject().removeItem(COSName.OPT);
    }
}