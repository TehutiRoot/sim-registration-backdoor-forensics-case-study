package com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf;

import com.tom_roush.pdfbox.cos.COSDictionary;

/* loaded from: classes5.dex */
public class PDPrintFieldAttributeObject extends PDStandardAttributeObject {
    public static final String CHECKED_STATE_NEUTRAL = "neutral";
    public static final String CHECKED_STATE_OFF = "off";
    public static final String CHECKED_STATE_ON = "on";
    public static final String OWNER_PRINT_FIELD = "PrintField";
    public static final String ROLE_CB = "cb";
    public static final String ROLE_PB = "pb";
    public static final String ROLE_RB = "rb";
    public static final String ROLE_TV = "tv";

    public PDPrintFieldAttributeObject() {
        setOwner(OWNER_PRINT_FIELD);
    }

    public String getAlternateName() {
        return getString("Desc");
    }

    public String getCheckedState() {
        return getName("checked", "off");
    }

    public String getRole() {
        return getName("Role");
    }

    public void setAlternateName(String str) {
        setString("Desc", str);
    }

    public void setCheckedState(String str) {
        setName("checked", str);
    }

    public void setRole(String str) {
        setName("Role", str);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.documentinterchange.logicalstructure.PDAttributeObject
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        if (isSpecified("Role")) {
            sb.append(", Role=");
            sb.append(getRole());
        }
        if (isSpecified("checked")) {
            sb.append(", Checked=");
            sb.append(getCheckedState());
        }
        if (isSpecified("Desc")) {
            sb.append(", Desc=");
            sb.append(getAlternateName());
        }
        return sb.toString();
    }

    public PDPrintFieldAttributeObject(COSDictionary cOSDictionary) {
        super(cOSDictionary);
    }
}
