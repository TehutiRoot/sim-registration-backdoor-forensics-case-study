package com.tom_roush.pdfbox.pdmodel.font;

import android.graphics.Path;
import android.util.Log;
import com.tom_roush.fontbox.FontBoxFont;
import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.pdmodel.font.encoding.DictionaryEncoding;
import com.tom_roush.pdfbox.pdmodel.font.encoding.Encoding;
import com.tom_roush.pdfbox.pdmodel.font.encoding.GlyphList;
import com.tom_roush.pdfbox.pdmodel.font.encoding.MacRomanEncoding;
import com.tom_roush.pdfbox.pdmodel.font.encoding.StandardEncoding;
import com.tom_roush.pdfbox.pdmodel.font.encoding.WinAnsiEncoding;
import java.io.IOException;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes5.dex */
public abstract class PDSimpleFont extends PDFont {
    protected Encoding encoding;
    protected GlyphList glyphList;

    /* renamed from: h */
    public Boolean f60397h;

    /* renamed from: i */
    public final Set f60398i;

    public PDSimpleFont() {
        this.f60398i = new HashSet();
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDFont
    public void addToSubset(int i) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: c */
    public final void m32429c(String str) {
        if ("ZapfDingbats".equals(str)) {
            this.glyphList = GlyphList.getZapfDingbats();
        } else {
            this.glyphList = GlyphList.getAdobeGlyphList();
        }
    }

    public Encoding getEncoding() {
        return this.encoding;
    }

    public abstract FontBoxFont getFontBoxFont();

    public GlyphList getGlyphList() {
        return this.glyphList;
    }

    public abstract Path getPath(String str) throws IOException;

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDFont
    public final float getStandard14Width(int i) {
        if (getStandard14AFM() != null) {
            String name = getEncoding().getName(i);
            if (".notdef".equals(name)) {
                return 250.0f;
            }
            if ("nbspace".equals(name)) {
                name = "space";
            } else if ("sfthyphen".equals(name)) {
                name = "hyphen";
            }
            return getStandard14AFM().getCharacterWidth(name);
        }
        throw new IllegalStateException("No AFM");
    }

    public final Boolean getSymbolicFlag() {
        if (getFontDescriptor() != null) {
            return Boolean.valueOf(getFontDescriptor().isSymbolic());
        }
        return null;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDFontLike
    public boolean hasExplicitWidth(int i) throws IOException {
        int i2;
        if (this.dict.containsKey(COSName.WIDTHS) && i >= (i2 = this.dict.getInt(COSName.FIRST_CHAR, -1)) && i - i2 < getWidths().size()) {
            return true;
        }
        return false;
    }

    public abstract boolean hasGlyph(String str) throws IOException;

    public Boolean isFontSymbolic() {
        boolean z;
        Boolean symbolicFlag = getSymbolicFlag();
        if (symbolicFlag != null) {
            return symbolicFlag;
        }
        if (isStandard14()) {
            String m68245c = GL1.m68245c(getName());
            if (!m68245c.equals("Symbol") && !m68245c.equals("ZapfDingbats")) {
                z = false;
            } else {
                z = true;
            }
            return Boolean.valueOf(z);
        }
        Encoding encoding = this.encoding;
        if (encoding == null) {
            if (this instanceof PDTrueTypeFont) {
                return Boolean.TRUE;
            }
            throw new IllegalStateException("PDFBox bug: encoding should not be null!");
        } else if (!(encoding instanceof WinAnsiEncoding) && !(encoding instanceof MacRomanEncoding) && !(encoding instanceof StandardEncoding)) {
            if (encoding instanceof DictionaryEncoding) {
                for (String str : ((DictionaryEncoding) encoding).getDifferences().values()) {
                    if (!".notdef".equals(str) && (!WinAnsiEncoding.INSTANCE.contains(str) || !MacRomanEncoding.INSTANCE.contains(str) || !StandardEncoding.INSTANCE.contains(str))) {
                        return Boolean.TRUE;
                    }
                }
                return Boolean.FALSE;
            }
            return null;
        } else {
            return Boolean.FALSE;
        }
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDFont
    public boolean isStandard14() {
        if (getEncoding() instanceof DictionaryEncoding) {
            DictionaryEncoding dictionaryEncoding = (DictionaryEncoding) getEncoding();
            if (dictionaryEncoding.getDifferences().size() > 0) {
                Encoding baseEncoding = dictionaryEncoding.getBaseEncoding();
                for (Map.Entry<Integer, String> entry : dictionaryEncoding.getDifferences().entrySet()) {
                    if (!entry.getValue().equals(baseEncoding.getName(entry.getKey().intValue()))) {
                        return false;
                    }
                }
            }
        }
        return super.isStandard14();
    }

    public final boolean isSymbolic() {
        if (this.f60397h == null) {
            Boolean isFontSymbolic = isFontSymbolic();
            if (isFontSymbolic != null) {
                this.f60397h = isFontSymbolic;
            } else {
                this.f60397h = Boolean.TRUE;
            }
        }
        return this.f60397h.booleanValue();
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDFont
    public boolean isVertical() {
        return false;
    }

    public void readEncoding() throws IOException {
        Encoding readEncodingFromFont;
        COSBase dictionaryObject = this.dict.getDictionaryObject(COSName.ENCODING);
        if (dictionaryObject instanceof COSName) {
            COSName cOSName = (COSName) dictionaryObject;
            Encoding encoding = Encoding.getInstance(cOSName);
            this.encoding = encoding;
            if (encoding == null) {
                Log.w("PdfBox-Android", "Unknown encoding: " + cOSName.getName());
                this.encoding = readEncodingFromFont();
            }
        } else if (dictionaryObject instanceof COSDictionary) {
            COSDictionary cOSDictionary = (COSDictionary) dictionaryObject;
            Boolean symbolicFlag = getSymbolicFlag();
            COSName cOSName2 = cOSDictionary.getCOSName(COSName.BASE_ENCODING);
            if ((cOSName2 == null || Encoding.getInstance(cOSName2) == null) && Boolean.TRUE.equals(symbolicFlag)) {
                readEncodingFromFont = readEncodingFromFont();
            } else {
                readEncodingFromFont = null;
            }
            if (symbolicFlag == null) {
                symbolicFlag = Boolean.FALSE;
            }
            this.encoding = new DictionaryEncoding(cOSDictionary, !symbolicFlag.booleanValue(), readEncodingFromFont);
        } else if (dictionaryObject == null) {
            this.encoding = readEncodingFromFont();
        }
        m32429c(GL1.m68245c(getName()));
    }

    public abstract Encoding readEncodingFromFont() throws IOException;

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDFont
    public void subset() throws IOException {
        throw new UnsupportedOperationException();
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDFont
    public String toUnicode(int i) throws IOException {
        return toUnicode(i, GlyphList.getAdobeGlyphList());
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDFont
    public boolean willBeSubset() {
        return false;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDFont
    public String toUnicode(int i, GlyphList glyphList) throws IOException {
        String str;
        if (this.glyphList != GlyphList.getAdobeGlyphList()) {
            glyphList = this.glyphList;
        }
        String unicode = super.toUnicode(i);
        if (unicode != null) {
            return unicode;
        }
        Encoding encoding = this.encoding;
        if (encoding != null) {
            str = encoding.getName(i);
            String unicode2 = glyphList.toUnicode(str);
            if (unicode2 != null) {
                return unicode2;
            }
        } else {
            str = null;
        }
        if (!this.f60398i.contains(Integer.valueOf(i))) {
            this.f60398i.add(Integer.valueOf(i));
            if (str != null) {
                Log.w("PdfBox-Android", "No Unicode mapping for " + str + " (" + i + ") in font " + getName());
            } else {
                Log.w("PdfBox-Android", "No Unicode mapping for character code " + i + " in font " + getName());
            }
        }
        return null;
    }

    public PDSimpleFont(String str) {
        super(str);
        this.f60398i = new HashSet();
        m32429c(str);
    }

    public PDSimpleFont(COSDictionary cOSDictionary) {
        super(cOSDictionary);
        this.f60398i = new HashSet();
    }
}
