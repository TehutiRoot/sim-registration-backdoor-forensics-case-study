package com.tom_roush.pdfbox.pdmodel.graphics.optionalcontent;

import com.tom_roush.pdfbox.cos.COSArray;
import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.cos.COSObject;
import com.tom_roush.pdfbox.pdmodel.common.COSObjectable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes5.dex */
public class PDOptionalContentProperties implements COSObjectable {

    /* renamed from: a */
    public final COSDictionary f60509a;

    /* loaded from: classes5.dex */
    public enum BaseState {
        ON(COSName.f59812ON),
        OFF(COSName.OFF),
        UNCHANGED(COSName.UNCHANGED);
        
        private final COSName name;

        BaseState(COSName cOSName) {
            this.name = cOSName;
        }

        public COSName getName() {
            return this.name;
        }

        public static BaseState valueOf(COSName cOSName) {
            if (cOSName == null) {
                return ON;
            }
            return valueOf(cOSName.getName().toUpperCase());
        }
    }

    public PDOptionalContentProperties() {
        COSDictionary cOSDictionary = new COSDictionary();
        this.f60509a = cOSDictionary;
        cOSDictionary.setItem(COSName.OCGS, (COSBase) new COSArray());
        COSDictionary cOSDictionary2 = new COSDictionary();
        cOSDictionary2.setString(COSName.NAME, "Top");
        cOSDictionary.setItem(COSName.f59770D, (COSBase) cOSDictionary2);
    }

    /* renamed from: a */
    public final COSDictionary m32369a() {
        COSDictionary cOSDictionary = this.f60509a;
        COSName cOSName = COSName.f59770D;
        COSBase dictionaryObject = cOSDictionary.getDictionaryObject(cOSName);
        if (dictionaryObject instanceof COSDictionary) {
            return (COSDictionary) dictionaryObject;
        }
        COSDictionary cOSDictionary2 = new COSDictionary();
        cOSDictionary2.setString(COSName.NAME, "Top");
        this.f60509a.setItem(cOSName, (COSBase) cOSDictionary2);
        return cOSDictionary2;
    }

    public void addGroup(PDOptionalContentGroup pDOptionalContentGroup) {
        m32368b().add((COSBase) pDOptionalContentGroup.getCOSObject());
        COSDictionary m32369a = m32369a();
        COSName cOSName = COSName.ORDER;
        COSArray cOSArray = (COSArray) m32369a.getDictionaryObject(cOSName);
        if (cOSArray == null) {
            cOSArray = new COSArray();
            m32369a().setItem(cOSName, (COSBase) cOSArray);
        }
        cOSArray.add(pDOptionalContentGroup);
    }

    /* renamed from: b */
    public final COSArray m32368b() {
        COSDictionary cOSDictionary = this.f60509a;
        COSName cOSName = COSName.OCGS;
        COSArray cOSArray = cOSDictionary.getCOSArray(cOSName);
        if (cOSArray == null) {
            COSArray cOSArray2 = new COSArray();
            this.f60509a.setItem(cOSName, (COSBase) cOSArray2);
            return cOSArray2;
        }
        return cOSArray;
    }

    /* renamed from: c */
    public final COSDictionary m32367c(COSBase cOSBase) {
        if (cOSBase instanceof COSObject) {
            return (COSDictionary) ((COSObject) cOSBase).getObject();
        }
        return (COSDictionary) cOSBase;
    }

    public BaseState getBaseState() {
        return BaseState.valueOf((COSName) m32369a().getItem(COSName.BASE_STATE));
    }

    public PDOptionalContentGroup getGroup(String str) {
        Iterator<COSBase> it = m32368b().iterator();
        while (it.hasNext()) {
            COSDictionary m32367c = m32367c(it.next());
            if (m32367c.getString(COSName.NAME).equals(str)) {
                return new PDOptionalContentGroup(m32367c);
            }
        }
        return null;
    }

    public String[] getGroupNames() {
        COSArray cOSArray = this.f60509a.getCOSArray(COSName.OCGS);
        if (cOSArray == null) {
            return new String[0];
        }
        int size = cOSArray.size();
        String[] strArr = new String[size];
        for (int i = 0; i < size; i++) {
            strArr[i] = m32367c(cOSArray.get(i)).getString(COSName.NAME);
        }
        return strArr;
    }

    public Collection<PDOptionalContentGroup> getOptionalContentGroups() {
        ArrayList arrayList = new ArrayList();
        Iterator<COSBase> it = m32368b().iterator();
        while (it.hasNext()) {
            arrayList.add(new PDOptionalContentGroup(m32367c(it.next())));
        }
        return arrayList;
    }

    public boolean hasGroup(String str) {
        for (String str2 : getGroupNames()) {
            if (str2.equals(str)) {
                return true;
            }
        }
        return false;
    }

    public boolean isGroupEnabled(String str) {
        Iterator<COSBase> it = m32368b().iterator();
        boolean z = false;
        while (it.hasNext()) {
            COSDictionary m32367c = m32367c(it.next());
            if (str.equals(m32367c.getString(COSName.NAME)) && isGroupEnabled(new PDOptionalContentGroup(m32367c))) {
                z = true;
            }
        }
        return z;
    }

    public void setBaseState(BaseState baseState) {
        m32369a().setItem(COSName.BASE_STATE, (COSBase) baseState.getName());
    }

    public boolean setGroupEnabled(String str, boolean z) {
        Iterator<COSBase> it = m32368b().iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            COSDictionary m32367c = m32367c(it.next());
            if (str.equals(m32367c.getString(COSName.NAME)) && setGroupEnabled(new PDOptionalContentGroup(m32367c), z)) {
                z2 = true;
            }
        }
        return z2;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.common.COSObjectable
    public COSDictionary getCOSObject() {
        return this.f60509a;
    }

    public boolean isGroupEnabled(PDOptionalContentGroup pDOptionalContentGroup) {
        boolean z = !getBaseState().equals(BaseState.OFF);
        if (pDOptionalContentGroup == null) {
            return z;
        }
        COSDictionary m32369a = m32369a();
        COSBase dictionaryObject = m32369a.getDictionaryObject(COSName.f59812ON);
        if (dictionaryObject instanceof COSArray) {
            Iterator<COSBase> it = ((COSArray) dictionaryObject).iterator();
            while (it.hasNext()) {
                if (m32367c(it.next()) == pDOptionalContentGroup.getCOSObject()) {
                    return true;
                }
            }
        }
        COSBase dictionaryObject2 = m32369a.getDictionaryObject(COSName.OFF);
        if (dictionaryObject2 instanceof COSArray) {
            Iterator<COSBase> it2 = ((COSArray) dictionaryObject2).iterator();
            while (it2.hasNext()) {
                if (m32367c(it2.next()) == pDOptionalContentGroup.getCOSObject()) {
                    return false;
                }
            }
        }
        return z;
    }

    public boolean setGroupEnabled(PDOptionalContentGroup pDOptionalContentGroup, boolean z) {
        COSArray cOSArray;
        COSArray cOSArray2;
        COSDictionary m32369a = m32369a();
        COSName cOSName = COSName.f59812ON;
        COSBase dictionaryObject = m32369a.getDictionaryObject(cOSName);
        if (!(dictionaryObject instanceof COSArray)) {
            cOSArray = new COSArray();
            m32369a.setItem(cOSName, (COSBase) cOSArray);
        } else {
            cOSArray = (COSArray) dictionaryObject;
        }
        COSName cOSName2 = COSName.OFF;
        COSBase dictionaryObject2 = m32369a.getDictionaryObject(cOSName2);
        if (!(dictionaryObject2 instanceof COSArray)) {
            cOSArray2 = new COSArray();
            m32369a.setItem(cOSName2, (COSBase) cOSArray2);
        } else {
            cOSArray2 = (COSArray) dictionaryObject2;
        }
        boolean z2 = true;
        if (z) {
            Iterator<COSBase> it = cOSArray2.iterator();
            while (it.hasNext()) {
                COSBase next = it.next();
                if (m32367c(next) == pDOptionalContentGroup.getCOSObject()) {
                    cOSArray2.remove(next);
                    cOSArray.add(next);
                    break;
                }
            }
            z2 = false;
        } else {
            Iterator<COSBase> it2 = cOSArray.iterator();
            while (it2.hasNext()) {
                COSBase next2 = it2.next();
                if (m32367c(next2) == pDOptionalContentGroup.getCOSObject()) {
                    cOSArray.remove(next2);
                    cOSArray2.add(next2);
                    break;
                }
            }
            z2 = false;
        }
        if (!z2) {
            if (z) {
                cOSArray.add((COSBase) pDOptionalContentGroup.getCOSObject());
            } else {
                cOSArray2.add((COSBase) pDOptionalContentGroup.getCOSObject());
            }
        }
        return z2;
    }

    public PDOptionalContentProperties(COSDictionary cOSDictionary) {
        this.f60509a = cOSDictionary;
    }
}
