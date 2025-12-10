package com.tom_roush.pdfbox.pdmodel.font;

import com.tom_roush.pdfbox.cos.COSArray;
import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.cos.COSStream;
import com.tom_roush.pdfbox.cos.COSString;
import com.tom_roush.pdfbox.pdmodel.common.COSObjectable;
import com.tom_roush.pdfbox.pdmodel.common.PDRectangle;
import com.tom_roush.pdfbox.pdmodel.common.PDStream;

/* loaded from: classes5.dex */
public final class PDFontDescriptor implements COSObjectable {

    /* renamed from: a */
    public final COSDictionary f60391a;

    /* renamed from: b */
    public float f60392b = Float.NEGATIVE_INFINITY;

    /* renamed from: c */
    public float f60393c = Float.NEGATIVE_INFINITY;

    /* renamed from: d */
    public int f60394d = -1;

    public PDFontDescriptor() {
        COSDictionary cOSDictionary = new COSDictionary();
        this.f60391a = cOSDictionary;
        cOSDictionary.setItem(COSName.TYPE, (COSBase) COSName.FONT_DESC);
    }

    /* renamed from: a */
    public final boolean m32432a(int i) {
        if ((i & getFlags()) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final void m32431b(int i, boolean z) {
        int i2;
        int flags = getFlags();
        if (z) {
            i2 = i | flags;
        } else {
            i2 = (~i) & flags;
        }
        setFlags(i2);
    }

    public float getAscent() {
        return this.f60391a.getFloat(COSName.ASCENT, 0.0f);
    }

    public float getAverageWidth() {
        return this.f60391a.getFloat(COSName.AVG_WIDTH, 0.0f);
    }

    public PDStream getCIDSet() {
        COSBase dictionaryObject = this.f60391a.getDictionaryObject(COSName.CID_SET);
        if (dictionaryObject instanceof COSStream) {
            return new PDStream((COSStream) dictionaryObject);
        }
        return null;
    }

    public float getCapHeight() {
        if (this.f60393c == Float.NEGATIVE_INFINITY) {
            this.f60393c = Math.abs(this.f60391a.getFloat(COSName.CAP_HEIGHT, 0.0f));
        }
        return this.f60393c;
    }

    public String getCharSet() {
        COSString cOSString = (COSString) this.f60391a.getDictionaryObject(COSName.CHAR_SET);
        if (cOSString != null) {
            return cOSString.getString();
        }
        return null;
    }

    public float getDescent() {
        return this.f60391a.getFloat(COSName.DESCENT, 0.0f);
    }

    public int getFlags() {
        if (this.f60394d == -1) {
            this.f60394d = this.f60391a.getInt(COSName.FLAGS, 0);
        }
        return this.f60394d;
    }

    public PDRectangle getFontBoundingBox() {
        COSArray cOSArray = this.f60391a.getCOSArray(COSName.FONT_BBOX);
        if (cOSArray != null) {
            return new PDRectangle(cOSArray);
        }
        return null;
    }

    public String getFontFamily() {
        COSString cOSString = (COSString) this.f60391a.getDictionaryObject(COSName.FONT_FAMILY);
        if (cOSString != null) {
            return cOSString.getString();
        }
        return null;
    }

    public PDStream getFontFile() {
        COSBase dictionaryObject = this.f60391a.getDictionaryObject(COSName.FONT_FILE);
        if (dictionaryObject instanceof COSStream) {
            return new PDStream((COSStream) dictionaryObject);
        }
        return null;
    }

    public PDStream getFontFile2() {
        COSBase dictionaryObject = this.f60391a.getDictionaryObject(COSName.FONT_FILE2);
        if (dictionaryObject instanceof COSStream) {
            return new PDStream((COSStream) dictionaryObject);
        }
        return null;
    }

    public PDStream getFontFile3() {
        COSBase dictionaryObject = this.f60391a.getDictionaryObject(COSName.FONT_FILE3);
        if (dictionaryObject instanceof COSStream) {
            return new PDStream((COSStream) dictionaryObject);
        }
        return null;
    }

    public String getFontName() {
        COSBase dictionaryObject = this.f60391a.getDictionaryObject(COSName.FONT_NAME);
        if (dictionaryObject instanceof COSName) {
            return ((COSName) dictionaryObject).getName();
        }
        return null;
    }

    public String getFontStretch() {
        COSName cOSName = (COSName) this.f60391a.getDictionaryObject(COSName.FONT_STRETCH);
        if (cOSName != null) {
            return cOSName.getName();
        }
        return null;
    }

    public float getFontWeight() {
        return this.f60391a.getFloat(COSName.FONT_WEIGHT, 0.0f);
    }

    public float getItalicAngle() {
        return this.f60391a.getFloat(COSName.ITALIC_ANGLE, 0.0f);
    }

    public float getLeading() {
        return this.f60391a.getFloat(COSName.LEADING, 0.0f);
    }

    public float getMaxWidth() {
        return this.f60391a.getFloat(COSName.MAX_WIDTH, 0.0f);
    }

    public float getMissingWidth() {
        return this.f60391a.getFloat(COSName.MISSING_WIDTH, 0.0f);
    }

    public PDPanose getPanose() {
        COSDictionary cOSDictionary = (COSDictionary) this.f60391a.getDictionaryObject(COSName.STYLE);
        if (cOSDictionary != null) {
            byte[] bytes = ((COSString) cOSDictionary.getDictionaryObject(COSName.PANOSE)).getBytes();
            if (bytes.length >= 12) {
                return new PDPanose(bytes);
            }
            return null;
        }
        return null;
    }

    public float getStemH() {
        return this.f60391a.getFloat(COSName.STEM_H, 0.0f);
    }

    public float getStemV() {
        return this.f60391a.getFloat(COSName.STEM_V, 0.0f);
    }

    public float getXHeight() {
        if (this.f60392b == Float.NEGATIVE_INFINITY) {
            this.f60392b = Math.abs(this.f60391a.getFloat(COSName.XHEIGHT, 0.0f));
        }
        return this.f60392b;
    }

    public boolean hasMissingWidth() {
        return this.f60391a.containsKey(COSName.MISSING_WIDTH);
    }

    public boolean hasWidths() {
        if (!this.f60391a.containsKey(COSName.WIDTHS) && !this.f60391a.containsKey(COSName.MISSING_WIDTH)) {
            return false;
        }
        return true;
    }

    public boolean isAllCap() {
        return m32432a(65536);
    }

    public boolean isFixedPitch() {
        return m32432a(1);
    }

    public boolean isForceBold() {
        return m32432a(262144);
    }

    public boolean isItalic() {
        return m32432a(64);
    }

    public boolean isNonSymbolic() {
        return m32432a(32);
    }

    public boolean isScript() {
        return m32432a(8);
    }

    public boolean isSerif() {
        return m32432a(2);
    }

    public boolean isSmallCap() {
        return m32432a(131072);
    }

    public boolean isSymbolic() {
        return m32432a(4);
    }

    public void setAllCap(boolean z) {
        m32431b(65536, z);
    }

    public void setAscent(float f) {
        this.f60391a.setFloat(COSName.ASCENT, f);
    }

    public void setAverageWidth(float f) {
        this.f60391a.setFloat(COSName.AVG_WIDTH, f);
    }

    public void setCIDSet(PDStream pDStream) {
        this.f60391a.setItem(COSName.CID_SET, pDStream);
    }

    public void setCapHeight(float f) {
        this.f60391a.setFloat(COSName.CAP_HEIGHT, f);
        this.f60393c = f;
    }

    public void setCharacterSet(String str) {
        COSString cOSString;
        if (str != null) {
            cOSString = new COSString(str);
        } else {
            cOSString = null;
        }
        this.f60391a.setItem(COSName.CHAR_SET, (COSBase) cOSString);
    }

    public void setDescent(float f) {
        this.f60391a.setFloat(COSName.DESCENT, f);
    }

    public void setFixedPitch(boolean z) {
        m32431b(1, z);
    }

    public void setFlags(int i) {
        this.f60391a.setInt(COSName.FLAGS, i);
        this.f60394d = i;
    }

    public void setFontBoundingBox(PDRectangle pDRectangle) {
        COSArray cOSArray;
        if (pDRectangle != null) {
            cOSArray = pDRectangle.getCOSArray();
        } else {
            cOSArray = null;
        }
        this.f60391a.setItem(COSName.FONT_BBOX, (COSBase) cOSArray);
    }

    public void setFontFamily(String str) {
        COSString cOSString;
        if (str != null) {
            cOSString = new COSString(str);
        } else {
            cOSString = null;
        }
        this.f60391a.setItem(COSName.FONT_FAMILY, (COSBase) cOSString);
    }

    public void setFontFile(PDStream pDStream) {
        this.f60391a.setItem(COSName.FONT_FILE, pDStream);
    }

    public void setFontFile2(PDStream pDStream) {
        this.f60391a.setItem(COSName.FONT_FILE2, pDStream);
    }

    public void setFontFile3(PDStream pDStream) {
        this.f60391a.setItem(COSName.FONT_FILE3, pDStream);
    }

    public void setFontName(String str) {
        COSName cOSName;
        if (str != null) {
            cOSName = COSName.getPDFName(str);
        } else {
            cOSName = null;
        }
        this.f60391a.setItem(COSName.FONT_NAME, (COSBase) cOSName);
    }

    public void setFontStretch(String str) {
        COSName cOSName;
        if (str != null) {
            cOSName = COSName.getPDFName(str);
        } else {
            cOSName = null;
        }
        this.f60391a.setItem(COSName.FONT_STRETCH, (COSBase) cOSName);
    }

    public void setFontWeight(float f) {
        this.f60391a.setFloat(COSName.FONT_WEIGHT, f);
    }

    public void setForceBold(boolean z) {
        m32431b(262144, z);
    }

    public void setItalic(boolean z) {
        m32431b(64, z);
    }

    public void setItalicAngle(float f) {
        this.f60391a.setFloat(COSName.ITALIC_ANGLE, f);
    }

    public void setLeading(float f) {
        this.f60391a.setFloat(COSName.LEADING, f);
    }

    public void setMaxWidth(float f) {
        this.f60391a.setFloat(COSName.MAX_WIDTH, f);
    }

    public void setMissingWidth(float f) {
        this.f60391a.setFloat(COSName.MISSING_WIDTH, f);
    }

    public void setNonSymbolic(boolean z) {
        m32431b(32, z);
    }

    public void setScript(boolean z) {
        m32431b(8, z);
    }

    public void setSerif(boolean z) {
        m32431b(2, z);
    }

    public void setSmallCap(boolean z) {
        m32431b(131072, z);
    }

    public void setStemH(float f) {
        this.f60391a.setFloat(COSName.STEM_H, f);
    }

    public void setStemV(float f) {
        this.f60391a.setFloat(COSName.STEM_V, f);
    }

    public void setSymbolic(boolean z) {
        m32431b(4, z);
    }

    public void setXHeight(float f) {
        this.f60391a.setFloat(COSName.XHEIGHT, f);
        this.f60392b = f;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.common.COSObjectable
    public COSDictionary getCOSObject() {
        return this.f60391a;
    }

    public PDFontDescriptor(COSDictionary cOSDictionary) {
        this.f60391a = cOSDictionary;
    }
}
