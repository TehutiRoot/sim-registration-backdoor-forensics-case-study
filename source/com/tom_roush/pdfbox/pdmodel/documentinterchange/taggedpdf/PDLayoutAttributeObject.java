package com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf;

import com.google.common.net.HttpHeaders;
import com.tom_roush.pdfbox.cos.COSArray;
import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.pdmodel.common.PDRectangle;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.logicalstructure.PDAttributeObject;
import com.tom_roush.pdfbox.pdmodel.graphics.color.PDGamma;

/* loaded from: classes5.dex */
public class PDLayoutAttributeObject extends PDStandardAttributeObject {
    public static final String BLOCK_ALIGN_AFTER = "After";
    public static final String BLOCK_ALIGN_BEFORE = "Before";
    public static final String BLOCK_ALIGN_JUSTIFY = "Justify";
    public static final String BLOCK_ALIGN_MIDDLE = "Middle";
    public static final String BORDER_STYLE_DASHED = "Dashed";
    public static final String BORDER_STYLE_DOTTED = "Dotted";
    public static final String BORDER_STYLE_DOUBLE = "Double";
    public static final String BORDER_STYLE_GROOVE = "Groove";
    public static final String BORDER_STYLE_HIDDEN = "Hidden";
    public static final String BORDER_STYLE_INSET = "Inset";
    public static final String BORDER_STYLE_NONE = "None";
    public static final String BORDER_STYLE_OUTSET = "Outset";
    public static final String BORDER_STYLE_RIDGE = "Ridge";
    public static final String BORDER_STYLE_SOLID = "Solid";
    public static final String GLYPH_ORIENTATION_VERTICAL_180_DEGREES = "180";
    public static final String GLYPH_ORIENTATION_VERTICAL_270_DEGREES = "270";
    public static final String GLYPH_ORIENTATION_VERTICAL_360_DEGREES = "360";
    public static final String GLYPH_ORIENTATION_VERTICAL_90_DEGREES = "90";
    public static final String GLYPH_ORIENTATION_VERTICAL_AUTO = "Auto";
    public static final String GLYPH_ORIENTATION_VERTICAL_MINUS_180_DEGREES = "-180";
    public static final String GLYPH_ORIENTATION_VERTICAL_MINUS_90_DEGREES = "-90";
    public static final String GLYPH_ORIENTATION_VERTICAL_ZERO_DEGREES = "0";
    public static final String HEIGHT_AUTO = "Auto";
    public static final String INLINE_ALIGN_CENTER = "Center";
    public static final String INLINE_ALIGN_END = "End";
    public static final String INLINE_ALIGN_START = "Start";
    public static final String LINE_HEIGHT_AUTO = "Auto";
    public static final String LINE_HEIGHT_NORMAL = "Normal";
    public static final String OWNER_LAYOUT = "Layout";
    public static final String PLACEMENT_BEFORE = "Before";
    public static final String PLACEMENT_BLOCK = "Block";
    public static final String PLACEMENT_END = "End";
    public static final String PLACEMENT_INLINE = "Inline";
    public static final String PLACEMENT_START = "Start";
    public static final String RUBY_ALIGN_CENTER = "Center";
    public static final String RUBY_ALIGN_DISTRIBUTE = "Distribute";
    public static final String RUBY_ALIGN_END = "End";
    public static final String RUBY_ALIGN_JUSTIFY = "Justify";
    public static final String RUBY_ALIGN_START = "Start";
    public static final String RUBY_POSITION_AFTER = "After";
    public static final String RUBY_POSITION_BEFORE = "Before";
    public static final String RUBY_POSITION_INLINE = "Inline";
    public static final String RUBY_POSITION_WARICHU = "Warichu";
    public static final String TEXT_ALIGN_CENTER = "Center";
    public static final String TEXT_ALIGN_END = "End";
    public static final String TEXT_ALIGN_JUSTIFY = "Justify";
    public static final String TEXT_ALIGN_START = "Start";
    public static final String TEXT_DECORATION_TYPE_LINE_THROUGH = "LineThrough";
    public static final String TEXT_DECORATION_TYPE_NONE = "None";
    public static final String TEXT_DECORATION_TYPE_OVERLINE = "Overline";
    public static final String TEXT_DECORATION_TYPE_UNDERLINE = "Underline";
    public static final String WIDTH_AUTO = "Auto";
    public static final String WRITING_MODE_LRTB = "LrTb";
    public static final String WRITING_MODE_RLTB = "RlTb";
    public static final String WRITING_MODE_TBRL = "TbRl";

    public PDLayoutAttributeObject() {
        setOwner(OWNER_LAYOUT);
    }

    public PDRectangle getBBox() {
        COSArray cOSArray = (COSArray) getCOSObject().getDictionaryObject("BBox");
        if (cOSArray != null) {
            return new PDRectangle(cOSArray);
        }
        return null;
    }

    public PDGamma getBackgroundColor() {
        return getColor("BackgroundColor");
    }

    public float getBaselineShift() {
        return getNumber("BaselineShift", 0.0f);
    }

    public String getBlockAlign() {
        return getName("BlockAlign", "Before");
    }

    public Object getBorderColors() {
        return getColorOrFourColors("BorderColor");
    }

    public Object getBorderStyle() {
        return getNameOrArrayOfName("BorderStyle", "None");
    }

    public Object getBorderThickness() {
        return getNumberOrArrayOfNumber("BorderThickness", -1.0f);
    }

    public PDGamma getColor() {
        return getColor("Color");
    }

    public int getColumnCount() {
        return getInteger("ColumnCount", 1);
    }

    public Object getColumnGap() {
        return getNumberOrArrayOfNumber("ColumnGap", -1.0f);
    }

    public Object getColumnWidths() {
        return getNumberOrArrayOfNumber("ColumnWidths", -1.0f);
    }

    public float getEndIndent() {
        return getNumber("EndIndent", 0.0f);
    }

    public String getGlyphOrientationVertical() {
        return getName("GlyphOrientationVertical", "Auto");
    }

    public Object getHeight() {
        return getNumberOrName("Height", "Auto");
    }

    public String getInlineAlign() {
        return getName("InlineAlign", "Start");
    }

    public Object getLineHeight() {
        return getNumberOrName("LineHeight", LINE_HEIGHT_NORMAL);
    }

    public Object getPadding() {
        return getNumberOrArrayOfNumber("Padding", 0.0f);
    }

    public String getPlacement() {
        return getName("Placement", "Inline");
    }

    public String getRubyAlign() {
        return getName("RubyAlign", RUBY_ALIGN_DISTRIBUTE);
    }

    public String getRubyPosition() {
        return getName("RubyPosition", "Before");
    }

    public float getSpaceAfter() {
        return getNumber("SpaceAfter", 0.0f);
    }

    public float getSpaceBefore() {
        return getNumber("SpaceBefore", 0.0f);
    }

    public float getStartIndent() {
        return getNumber("StartIndent", 0.0f);
    }

    public Object getTBorderStyle() {
        return getNameOrArrayOfName("TBorderStyle", "None");
    }

    public Object getTPadding() {
        return getNumberOrArrayOfNumber("TPadding", 0.0f);
    }

    public String getTextAlign() {
        return getName("TextAlign", "Start");
    }

    public PDGamma getTextDecorationColor() {
        return getColor("TextDecorationColor");
    }

    public float getTextDecorationThickness() {
        return getNumber("TextDecorationThickness");
    }

    public String getTextDecorationType() {
        return getName("TextDecorationType", "None");
    }

    public float getTextIndent() {
        return getNumber("TextIndent", 0.0f);
    }

    public Object getWidth() {
        return getNumberOrName(HttpHeaders.WIDTH, "Auto");
    }

    public String getWritingMode() {
        return getName("WritingMode", WRITING_MODE_LRTB);
    }

    public void setAllBorderColors(PDGamma pDGamma) {
        setColor("BorderColor", pDGamma);
    }

    public void setAllBorderStyles(String str) {
        setName("BorderStyle", str);
    }

    public void setAllBorderThicknesses(float f) {
        setNumber("BorderThickness", f);
    }

    public void setAllColumnWidths(float f) {
        setNumber("ColumnWidths", f);
    }

    public void setAllPaddings(float f) {
        setNumber("Padding", f);
    }

    public void setAllTBorderStyles(String str) {
        setName("TBorderStyle", str);
    }

    public void setAllTPaddings(float f) {
        setNumber("TPadding", f);
    }

    public void setBBox(PDRectangle pDRectangle) {
        COSBase cOSObject;
        COSBase dictionaryObject = getCOSObject().getDictionaryObject("BBox");
        getCOSObject().setItem("BBox", pDRectangle);
        if (pDRectangle == null) {
            cOSObject = null;
        } else {
            cOSObject = pDRectangle.getCOSObject();
        }
        potentiallyNotifyChanged(dictionaryObject, cOSObject);
    }

    public void setBackgroundColor(PDGamma pDGamma) {
        setColor("BackgroundColor", pDGamma);
    }

    public void setBaselineShift(float f) {
        setNumber("BaselineShift", f);
    }

    public void setBlockAlign(String str) {
        setName("BlockAlign", str);
    }

    public void setBorderColors(PDFourColours pDFourColours) {
        setFourColors("BorderColor", pDFourColours);
    }

    public void setBorderStyles(String[] strArr) {
        setArrayOfName("BorderStyle", strArr);
    }

    public void setBorderThicknesses(float[] fArr) {
        setArrayOfNumber("BorderThickness", fArr);
    }

    public void setColor(PDGamma pDGamma) {
        setColor("Color", pDGamma);
    }

    public void setColumnCount(int i) {
        setInteger("ColumnCount", i);
    }

    public void setColumnGap(float f) {
        setNumber("ColumnGap", f);
    }

    public void setColumnGaps(float[] fArr) {
        setArrayOfNumber("ColumnGap", fArr);
    }

    public void setColumnWidths(float[] fArr) {
        setArrayOfNumber("ColumnWidths", fArr);
    }

    public void setEndIndent(float f) {
        setNumber("EndIndent", f);
    }

    public void setGlyphOrientationVertical(String str) {
        setName("GlyphOrientationVertical", str);
    }

    public void setHeight(float f) {
        setNumber("Height", f);
    }

    public void setHeightAuto() {
        setName("Height", "Auto");
    }

    public void setInlineAlign(String str) {
        setName("InlineAlign", str);
    }

    public void setLineHeight(float f) {
        setNumber("LineHeight", f);
    }

    public void setLineHeightAuto() {
        setName("LineHeight", "Auto");
    }

    public void setLineHeightNormal() {
        setName("LineHeight", LINE_HEIGHT_NORMAL);
    }

    public void setPaddings(float[] fArr) {
        setArrayOfNumber("Padding", fArr);
    }

    public void setPlacement(String str) {
        setName("Placement", str);
    }

    public void setRubyAlign(String str) {
        setName("RubyAlign", str);
    }

    public void setRubyPosition(String str) {
        setName("RubyPosition", str);
    }

    public void setSpaceAfter(float f) {
        setNumber("SpaceAfter", f);
    }

    public void setSpaceBefore(float f) {
        setNumber("SpaceBefore", f);
    }

    public void setStartIndent(float f) {
        setNumber("StartIndent", f);
    }

    public void setTBorderStyles(String[] strArr) {
        setArrayOfName("TBorderStyle", strArr);
    }

    public void setTPaddings(float[] fArr) {
        setArrayOfNumber("TPadding", fArr);
    }

    public void setTextAlign(String str) {
        setName("TextAlign", str);
    }

    public void setTextDecorationColor(PDGamma pDGamma) {
        setColor("TextDecorationColor", pDGamma);
    }

    public void setTextDecorationThickness(float f) {
        setNumber("TextDecorationThickness", f);
    }

    public void setTextDecorationType(String str) {
        setName("TextDecorationType", str);
    }

    public void setTextIndent(float f) {
        setNumber("TextIndent", f);
    }

    public void setWidth(float f) {
        setNumber(HttpHeaders.WIDTH, f);
    }

    public void setWidthAuto() {
        setName(HttpHeaders.WIDTH, "Auto");
    }

    public void setWritingMode(String str) {
        setName("WritingMode", str);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.documentinterchange.logicalstructure.PDAttributeObject
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        if (isSpecified("Placement")) {
            sb.append(", Placement=");
            sb.append(getPlacement());
        }
        if (isSpecified("WritingMode")) {
            sb.append(", WritingMode=");
            sb.append(getWritingMode());
        }
        if (isSpecified("BackgroundColor")) {
            sb.append(", BackgroundColor=");
            sb.append(getBackgroundColor());
        }
        if (isSpecified("BorderColor")) {
            sb.append(", BorderColor=");
            sb.append(getBorderColors());
        }
        if (isSpecified("BorderStyle")) {
            Object borderStyle = getBorderStyle();
            sb.append(", BorderStyle=");
            if (borderStyle instanceof String[]) {
                sb.append(PDAttributeObject.arrayToString((String[]) borderStyle));
            } else {
                sb.append(borderStyle);
            }
        }
        if (isSpecified("BorderThickness")) {
            Object borderThickness = getBorderThickness();
            sb.append(", BorderThickness=");
            if (borderThickness instanceof float[]) {
                sb.append(PDAttributeObject.arrayToString((float[]) borderThickness));
            } else {
                sb.append(borderThickness);
            }
        }
        if (isSpecified("Padding")) {
            Object padding = getPadding();
            sb.append(", Padding=");
            if (padding instanceof float[]) {
                sb.append(PDAttributeObject.arrayToString((float[]) padding));
            } else {
                sb.append(padding);
            }
        }
        if (isSpecified("Color")) {
            sb.append(", Color=");
            sb.append(getColor());
        }
        if (isSpecified("SpaceBefore")) {
            sb.append(", SpaceBefore=");
            sb.append(getSpaceBefore());
        }
        if (isSpecified("SpaceAfter")) {
            sb.append(", SpaceAfter=");
            sb.append(getSpaceAfter());
        }
        if (isSpecified("StartIndent")) {
            sb.append(", StartIndent=");
            sb.append(getStartIndent());
        }
        if (isSpecified("EndIndent")) {
            sb.append(", EndIndent=");
            sb.append(getEndIndent());
        }
        if (isSpecified("TextIndent")) {
            sb.append(", TextIndent=");
            sb.append(getTextIndent());
        }
        if (isSpecified("TextAlign")) {
            sb.append(", TextAlign=");
            sb.append(getTextAlign());
        }
        if (isSpecified("BBox")) {
            sb.append(", BBox=");
            sb.append(getBBox());
        }
        if (isSpecified(HttpHeaders.WIDTH)) {
            sb.append(", Width=");
            sb.append(getWidth());
        }
        if (isSpecified("Height")) {
            sb.append(", Height=");
            sb.append(getHeight());
        }
        if (isSpecified("BlockAlign")) {
            sb.append(", BlockAlign=");
            sb.append(getBlockAlign());
        }
        if (isSpecified("InlineAlign")) {
            sb.append(", InlineAlign=");
            sb.append(getInlineAlign());
        }
        if (isSpecified("TBorderStyle")) {
            Object tBorderStyle = getTBorderStyle();
            sb.append(", TBorderStyle=");
            if (tBorderStyle instanceof String[]) {
                sb.append(PDAttributeObject.arrayToString((String[]) tBorderStyle));
            } else {
                sb.append(tBorderStyle);
            }
        }
        if (isSpecified("TPadding")) {
            Object tPadding = getTPadding();
            sb.append(", TPadding=");
            if (tPadding instanceof float[]) {
                sb.append(PDAttributeObject.arrayToString((float[]) tPadding));
            } else {
                sb.append(tPadding);
            }
        }
        if (isSpecified("BaselineShift")) {
            sb.append(", BaselineShift=");
            sb.append(getBaselineShift());
        }
        if (isSpecified("LineHeight")) {
            sb.append(", LineHeight=");
            sb.append(getLineHeight());
        }
        if (isSpecified("TextDecorationColor")) {
            sb.append(", TextDecorationColor=");
            sb.append(getTextDecorationColor());
        }
        if (isSpecified("TextDecorationThickness")) {
            sb.append(", TextDecorationThickness=");
            sb.append(getTextDecorationThickness());
        }
        if (isSpecified("TextDecorationType")) {
            sb.append(", TextDecorationType=");
            sb.append(getTextDecorationType());
        }
        if (isSpecified("RubyAlign")) {
            sb.append(", RubyAlign=");
            sb.append(getRubyAlign());
        }
        if (isSpecified("RubyPosition")) {
            sb.append(", RubyPosition=");
            sb.append(getRubyPosition());
        }
        if (isSpecified("GlyphOrientationVertical")) {
            sb.append(", GlyphOrientationVertical=");
            sb.append(getGlyphOrientationVertical());
        }
        if (isSpecified("ColumnCount")) {
            sb.append(", ColumnCount=");
            sb.append(getColumnCount());
        }
        if (isSpecified("ColumnGap")) {
            Object columnGap = getColumnGap();
            sb.append(", ColumnGap=");
            if (columnGap instanceof float[]) {
                sb.append(PDAttributeObject.arrayToString((float[]) columnGap));
            } else {
                sb.append(columnGap);
            }
        }
        if (isSpecified("ColumnWidths")) {
            Object columnWidths = getColumnWidths();
            sb.append(", ColumnWidths=");
            if (columnWidths instanceof float[]) {
                sb.append(PDAttributeObject.arrayToString((float[]) columnWidths));
            } else {
                sb.append(columnWidths);
            }
        }
        return sb.toString();
    }

    public void setAllBorderThicknesses(int i) {
        setNumber("BorderThickness", i);
    }

    public void setAllColumnWidths(int i) {
        setNumber("ColumnWidths", i);
    }

    public void setAllPaddings(int i) {
        setNumber("Padding", i);
    }

    public void setAllTPaddings(int i) {
        setNumber("TPadding", i);
    }

    public void setBaselineShift(int i) {
        setNumber("BaselineShift", i);
    }

    public void setColumnGap(int i) {
        setNumber("ColumnGap", i);
    }

    public void setEndIndent(int i) {
        setNumber("EndIndent", i);
    }

    public void setHeight(int i) {
        setNumber("Height", i);
    }

    public void setLineHeight(int i) {
        setNumber("LineHeight", i);
    }

    public void setSpaceAfter(int i) {
        setNumber("SpaceAfter", i);
    }

    public void setSpaceBefore(int i) {
        setNumber("SpaceBefore", i);
    }

    public void setStartIndent(int i) {
        setNumber("StartIndent", i);
    }

    public void setTextDecorationThickness(int i) {
        setNumber("TextDecorationThickness", i);
    }

    public void setTextIndent(int i) {
        setNumber("TextIndent", i);
    }

    public void setWidth(int i) {
        setNumber(HttpHeaders.WIDTH, i);
    }

    public PDLayoutAttributeObject(COSDictionary cOSDictionary) {
        super(cOSDictionary);
    }
}
