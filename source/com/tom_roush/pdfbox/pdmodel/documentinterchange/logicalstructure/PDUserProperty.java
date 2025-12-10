package com.tom_roush.pdfbox.pdmodel.documentinterchange.logicalstructure;

import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.pdmodel.common.PDDictionaryWrapper;

/* loaded from: classes5.dex */
public class PDUserProperty extends PDDictionaryWrapper {

    /* renamed from: b */
    public final PDUserAttributeObject f60273b;

    public PDUserProperty(PDUserAttributeObject pDUserAttributeObject) {
        this.f60273b = pDUserAttributeObject;
    }

    /* renamed from: a */
    public final boolean m32526a(Object obj, Object obj2) {
        if (obj == null) {
            if (obj2 != null) {
                return true;
            }
            return false;
        }
        return !obj.equals(obj2);
    }

    /* renamed from: b */
    public final void m32525b(Object obj, Object obj2) {
        if (m32526a(obj, obj2)) {
            this.f60273b.userPropertyChanged(this);
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
        PDUserAttributeObject pDUserAttributeObject = this.f60273b;
        if (pDUserAttributeObject == null) {
            if (pDUserProperty.f60273b != null) {
                return false;
            }
        } else if (!pDUserAttributeObject.equals(pDUserProperty.f60273b)) {
            return false;
        }
        return true;
    }

    public String getFormattedValue() {
        return getCOSObject().getString(COSName.f59782F);
    }

    public String getName() {
        return getCOSObject().getNameAsString(COSName.f59807N);
    }

    public COSBase getValue() {
        return getCOSObject().getDictionaryObject(COSName.f59843V);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.common.PDDictionaryWrapper
    public int hashCode() {
        int hashCode;
        int hashCode2 = super.hashCode() * 31;
        PDUserAttributeObject pDUserAttributeObject = this.f60273b;
        if (pDUserAttributeObject == null) {
            hashCode = 0;
        } else {
            hashCode = pDUserAttributeObject.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public boolean isHidden() {
        return getCOSObject().getBoolean(COSName.f59788H, false);
    }

    public void setFormattedValue(String str) {
        m32525b(getFormattedValue(), str);
        getCOSObject().setString(COSName.f59782F, str);
    }

    public void setHidden(boolean z) {
        m32525b(Boolean.valueOf(isHidden()), Boolean.valueOf(z));
        getCOSObject().setBoolean(COSName.f59788H, z);
    }

    public void setName(String str) {
        m32525b(getName(), str);
        getCOSObject().setName(COSName.f59807N, str);
    }

    public void setValue(COSBase cOSBase) {
        m32525b(getValue(), cOSBase);
        getCOSObject().setItem(COSName.f59843V, cOSBase);
    }

    public String toString() {
        return "Name=" + getName() + ", Value=" + getValue() + ", FormattedValue=" + getFormattedValue() + ", Hidden=" + isHidden();
    }

    public PDUserProperty(COSDictionary cOSDictionary, PDUserAttributeObject pDUserAttributeObject) {
        super(cOSDictionary);
        this.f60273b = pDUserAttributeObject;
    }
}
