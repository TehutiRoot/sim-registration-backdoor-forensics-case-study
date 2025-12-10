package com.tom_roush.pdfbox.pdmodel.documentinterchange.logicalstructure;

import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.pdmodel.common.PDDictionaryWrapper;

/* loaded from: classes5.dex */
public class PDUserProperty extends PDDictionaryWrapper {

    /* renamed from: b */
    public final PDUserAttributeObject f60285b;

    public PDUserProperty(PDUserAttributeObject pDUserAttributeObject) {
        this.f60285b = pDUserAttributeObject;
    }

    /* renamed from: a */
    public final boolean m32518a(Object obj, Object obj2) {
        if (obj == null) {
            if (obj2 != null) {
                return true;
            }
            return false;
        }
        return !obj.equals(obj2);
    }

    /* renamed from: b */
    public final void m32517b(Object obj, Object obj2) {
        if (m32518a(obj, obj2)) {
            this.f60285b.userPropertyChanged(this);
        }
    }

    @Override // com.tom_roush.pdfbox.pdmodel.common.PDDictionaryWrapper
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj) || getClass() != obj.getClass()) {
            return false;
        }
        PDUserProperty pDUserProperty = (PDUserProperty) obj;
        PDUserAttributeObject pDUserAttributeObject = this.f60285b;
        if (pDUserAttributeObject == null) {
            if (pDUserProperty.f60285b != null) {
                return false;
            }
        } else if (!pDUserAttributeObject.equals(pDUserProperty.f60285b)) {
            return false;
        }
        return true;
    }

    public String getFormattedValue() {
        return getCOSObject().getString(COSName.f59794F);
    }

    public String getName() {
        return getCOSObject().getNameAsString(COSName.f59819N);
    }

    public COSBase getValue() {
        return getCOSObject().getDictionaryObject(COSName.f59855V);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.common.PDDictionaryWrapper
    public int hashCode() {
        int hashCode;
        int hashCode2 = super.hashCode() * 31;
        PDUserAttributeObject pDUserAttributeObject = this.f60285b;
        if (pDUserAttributeObject == null) {
            hashCode = 0;
        } else {
            hashCode = pDUserAttributeObject.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public boolean isHidden() {
        return getCOSObject().getBoolean(COSName.f59800H, false);
    }

    public void setFormattedValue(String str) {
        m32517b(getFormattedValue(), str);
        getCOSObject().setString(COSName.f59794F, str);
    }

    public void setHidden(boolean z) {
        m32517b(Boolean.valueOf(isHidden()), Boolean.valueOf(z));
        getCOSObject().setBoolean(COSName.f59800H, z);
    }

    public void setName(String str) {
        m32517b(getName(), str);
        getCOSObject().setName(COSName.f59819N, str);
    }

    public void setValue(COSBase cOSBase) {
        m32517b(getValue(), cOSBase);
        getCOSObject().setItem(COSName.f59855V, cOSBase);
    }

    public String toString() {
        return "Name=" + getName() + ", Value=" + getValue() + ", FormattedValue=" + getFormattedValue() + ", Hidden=" + isHidden();
    }

    public PDUserProperty(COSDictionary cOSDictionary, PDUserAttributeObject pDUserAttributeObject) {
        super(cOSDictionary);
        this.f60285b = pDUserAttributeObject;
    }
}