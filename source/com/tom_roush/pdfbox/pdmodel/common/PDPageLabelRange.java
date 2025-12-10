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
    public static final COSName f60156b = COSName.f59829ST;

    /* renamed from: c */
    public static final COSName f60157c = COSName.f59815P;

    /* renamed from: d */
    public static final COSName f60158d = COSName.f59824S;

    /* renamed from: a */
    public COSDictionary f60159a;

    public PDPageLabelRange() {
        this(new COSDictionary());
    }

    public String getPrefix() {
        return this.f60159a.getString(f60157c);
    }

    public int getStart() {
        return this.f60159a.getInt(f60156b, 1);
    }

    public String getStyle() {
        return this.f60159a.getNameAsString(f60158d);
    }

    public void setPrefix(String str) {
        if (str != null) {
            this.f60159a.setString(f60157c, str);
        } else {
            this.f60159a.removeItem(f60157c);
        }
    }

    public void setStart(int i) {
        if (i > 0) {
            this.f60159a.setInt(f60156b, i);
            return;
        }
        throw new IllegalArgumentException("The page numbering start value must be a positive integer");
    }

    public void setStyle(String str) {
        if (str != null) {
            this.f60159a.setName(f60158d, str);
        } else {
            this.f60159a.removeItem(f60158d);
        }
    }

    public PDPageLabelRange(COSDictionary cOSDictionary) {
        this.f60159a = cOSDictionary;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.common.COSObjectable
    public COSDictionary getCOSObject() {
        return this.f60159a;
    }
}
