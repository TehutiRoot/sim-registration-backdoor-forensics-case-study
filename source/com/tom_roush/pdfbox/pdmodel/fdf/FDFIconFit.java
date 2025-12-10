package com.tom_roush.pdfbox.pdmodel.fdf;

import com.tom_roush.pdfbox.cos.COSArray;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.pdmodel.common.COSObjectable;
import com.tom_roush.pdfbox.pdmodel.common.PDRange;

/* loaded from: classes5.dex */
public class FDFIconFit implements COSObjectable {
    public static final String SCALE_OPTION_ALWAYS = "A";
    public static final String SCALE_OPTION_NEVER = "N";
    public static final String SCALE_OPTION_ONLY_WHEN_ICON_IS_BIGGER = "B";
    public static final String SCALE_OPTION_ONLY_WHEN_ICON_IS_SMALLER = "S";
    public static final String SCALE_TYPE_ANAMORPHIC = "A";
    public static final String SCALE_TYPE_PROPORTIONAL = "P";

    /* renamed from: a */
    public COSDictionary f60335a;

    public FDFIconFit() {
        this.f60335a = new COSDictionary();
    }

    public PDRange getFractionalSpaceToAllocate() {
        COSArray cOSArray = (COSArray) this.f60335a.getDictionaryObject(COSName.f59748A);
        if (cOSArray == null) {
            PDRange pDRange = new PDRange();
            pDRange.setMin(0.5f);
            pDRange.setMax(0.5f);
            setFractionalSpaceToAllocate(pDRange);
            return pDRange;
        }
        return new PDRange(cOSArray);
    }

    public String getScaleOption() {
        String nameAsString = this.f60335a.getNameAsString(COSName.f59831SW);
        if (nameAsString == null) {
            return "A";
        }
        return nameAsString;
    }

    public String getScaleType() {
        String nameAsString = this.f60335a.getNameAsString(COSName.f59824S);
        if (nameAsString == null) {
            return "P";
        }
        return nameAsString;
    }

    public void setFractionalSpaceToAllocate(PDRange pDRange) {
        this.f60335a.setItem(COSName.f59748A, pDRange);
    }

    public void setScaleOption(String str) {
        this.f60335a.setName(COSName.f59831SW, str);
    }

    public void setScaleToFitAnnotation(boolean z) {
        this.f60335a.setBoolean(COSName.f59783FB, z);
    }

    public void setScaleType(String str) {
        this.f60335a.setName(COSName.f59824S, str);
    }

    public boolean shouldScaleToFitAnnotation() {
        return this.f60335a.getBoolean(COSName.f59783FB, false);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.common.COSObjectable
    public COSDictionary getCOSObject() {
        return this.f60335a;
    }

    public FDFIconFit(COSDictionary cOSDictionary) {
        this.f60335a = cOSDictionary;
    }
}
