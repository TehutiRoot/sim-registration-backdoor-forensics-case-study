package com.tom_roush.pdfbox.pdmodel.interactive.measurement;

import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.pdmodel.common.COSObjectable;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.StandardStructureTypes;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDAnnotationLink;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDBorderStyleDictionary;
import org.apache.commons.cli.HelpFormatter;

/* loaded from: classes5.dex */
public class PDNumberFormatDictionary implements COSObjectable {
    public static final String FRACTIONAL_DISPLAY_DECIMAL = "D";
    public static final String FRACTIONAL_DISPLAY_FRACTION = "F";
    public static final String FRACTIONAL_DISPLAY_ROUND = "R";
    public static final String FRACTIONAL_DISPLAY_TRUNCATE = "T";
    public static final String LABEL_PREFIX_TO_VALUE = "P";
    public static final String LABEL_SUFFIX_TO_VALUE = "S";
    public static final String TYPE = "NumberFormat";

    /* renamed from: a */
    public COSDictionary f60745a;

    public PDNumberFormatDictionary() {
        COSDictionary cOSDictionary = new COSDictionary();
        this.f60745a = cOSDictionary;
        cOSDictionary.setName(COSName.TYPE, TYPE);
    }

    public float getConversionFactor() {
        return getCOSObject().getFloat("C");
    }

    public String getDecimalSeparator() {
        return getCOSObject().getString("RD", ".");
    }

    public int getDenominator() {
        return getCOSObject().getInt("D");
    }

    public String getFractionalDisplay() {
        return getCOSObject().getString("F", "D");
    }

    public String getLabelPositionToValue() {
        return getCOSObject().getString(PDAnnotationLink.HIGHLIGHT_MODE_OUTLINE, "S");
    }

    public String getLabelPrefixString() {
        return getCOSObject().getString("PS", HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR);
    }

    public String getLabelSuffixString() {
        return getCOSObject().getString("SS", HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR);
    }

    public String getThousandsSeparator() {
        return getCOSObject().getString(StandardStructureTypes.f60305RT, ",");
    }

    public String getType() {
        return TYPE;
    }

    public String getUnits() {
        return getCOSObject().getString(PDBorderStyleDictionary.STYLE_UNDERLINE);
    }

    public boolean isFD() {
        return getCOSObject().getBoolean("FD", false);
    }

    public void setConversionFactor(float f) {
        getCOSObject().setFloat("C", f);
    }

    public void setDecimalSeparator(String str) {
        getCOSObject().setString("RD", str);
    }

    public void setDenominator(int i) {
        getCOSObject().setInt("D", i);
    }

    public void setFD(boolean z) {
        getCOSObject().setBoolean("FD", z);
    }

    public void setFractionalDisplay(String str) {
        if (str != null && !"D".equals(str) && !"F".equals(str) && !"R".equals(str) && !"T".equals(str)) {
            throw new IllegalArgumentException("Value must be \"D\", \"F\", \"R\", or \"T\", (or null).");
        }
        getCOSObject().setString("F", str);
    }

    public void setLabelPositionToValue(String str) {
        if (str != null && !"P".equals(str) && !"S".equals(str)) {
            throw new IllegalArgumentException("Value must be \"S\", or \"P\" (or null).");
        }
        getCOSObject().setString(PDAnnotationLink.HIGHLIGHT_MODE_OUTLINE, str);
    }

    public void setLabelPrefixString(String str) {
        getCOSObject().setString("PS", str);
    }

    public void setLabelSuffixString(String str) {
        getCOSObject().setString("SS", str);
    }

    public void setThousandsSeparator(String str) {
        getCOSObject().setString(StandardStructureTypes.f60305RT, str);
    }

    public void setUnits(String str) {
        getCOSObject().setString(PDBorderStyleDictionary.STYLE_UNDERLINE, str);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.common.COSObjectable
    public COSDictionary getCOSObject() {
        return this.f60745a;
    }

    public PDNumberFormatDictionary(COSDictionary cOSDictionary) {
        this.f60745a = cOSDictionary;
    }
}