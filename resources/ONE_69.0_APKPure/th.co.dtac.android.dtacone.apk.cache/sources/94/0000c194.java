package com.tom_roush.pdfbox.pdmodel.common;

import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSName;

/* loaded from: classes5.dex */
public class PDPageLabelRange implements COSObjectable {
    public static final String STYLE_DECIMAL = "D";
    public static final String STYLE_LETTERS_LOWER = "a";
    public static final String STYLE_LETTERS_UPPER = "A";
    public static final String STYLE_ROMAN_LOWER = "r";
    public static final String STYLE_ROMAN_UPPER = "R";

    /* renamed from: b */
    public static final COSName f60168b = COSName.f59841ST;

    /* renamed from: c */
    public static final COSName f60169c = COSName.f59827P;

    /* renamed from: d */
    public static final COSName f60170d = COSName.f59836S;

    /* renamed from: a */
    public COSDictionary f60171a;

    public PDPageLabelRange() {
        this(new COSDictionary());
    }

    public String getPrefix() {
        return this.f60171a.getString(f60169c);
    }

    public int getStart() {
        return this.f60171a.getInt(f60168b, 1);
    }

    public String getStyle() {
        return this.f60171a.getNameAsString(f60170d);
    }

    public void setPrefix(String str) {
        if (str != null) {
            this.f60171a.setString(f60169c, str);
        } else {
            this.f60171a.removeItem(f60169c);
        }
    }

    public void setStart(int i) {
        if (i > 0) {
            this.f60171a.setInt(f60168b, i);
            return;
        }
        throw new IllegalArgumentException("The page numbering start value must be a positive integer");
    }

    public void setStyle(String str) {
        if (str != null) {
            this.f60171a.setName(f60170d, str);
        } else {
            this.f60171a.removeItem(f60170d);
        }
    }

    public PDPageLabelRange(COSDictionary cOSDictionary) {
        this.f60171a = cOSDictionary;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.common.COSObjectable
    public COSDictionary getCOSObject() {
        return this.f60171a;
    }
}