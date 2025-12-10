package com.tom_roush.pdfbox.pdmodel.font;

import android.graphics.Path;
import android.util.Log;
import com.tom_roush.fontbox.FontBoxFont;
import com.tom_roush.fontbox.util.BoundingBox;
import com.tom_roush.pdfbox.cos.COSArray;
import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.cos.COSStream;
import com.tom_roush.pdfbox.pdmodel.PDResources;
import com.tom_roush.pdfbox.pdmodel.ResourceCache;
import com.tom_roush.pdfbox.pdmodel.common.PDRectangle;
import com.tom_roush.pdfbox.pdmodel.font.encoding.DictionaryEncoding;
import com.tom_roush.pdfbox.pdmodel.font.encoding.Encoding;
import com.tom_roush.pdfbox.pdmodel.font.encoding.GlyphList;
import com.tom_roush.pdfbox.util.Matrix;
import com.tom_roush.pdfbox.util.Vector;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/* loaded from: classes5.dex */
public class PDType3Font extends PDSimpleFont {

    /* renamed from: j */
    public PDResources f60438j;

    /* renamed from: k */
    public COSDictionary f60439k;

    /* renamed from: l */
    public Matrix f60440l;

    /* renamed from: m */
    public BoundingBox f60441m;

    /* renamed from: n */
    public final ResourceCache f60442n;

    public PDType3Font(COSDictionary cOSDictionary) throws IOException {
        this(cOSDictionary, null);
    }

    /* renamed from: d */
    private BoundingBox m32416d() {
        PDRectangle fontBBox = getFontBBox();
        if (fontBBox.getLowerLeftX() == 0.0f && fontBBox.getLowerLeftY() == 0.0f && fontBBox.getUpperRightX() == 0.0f && fontBBox.getUpperRightY() == 0.0f) {
            COSDictionary charProcs = getCharProcs();
            for (COSName cOSName : charProcs.keySet()) {
                COSBase dictionaryObject = charProcs.getDictionaryObject(cOSName);
                if (dictionaryObject instanceof COSStream) {
                    try {
                        PDRectangle glyphBBox = new PDType3CharProc(this, (COSStream) dictionaryObject).getGlyphBBox();
                        if (glyphBBox != null) {
                            fontBBox.setLowerLeftX(Math.min(fontBBox.getLowerLeftX(), glyphBBox.getLowerLeftX()));
                            fontBBox.setLowerLeftY(Math.min(fontBBox.getLowerLeftY(), glyphBBox.getLowerLeftY()));
                            fontBBox.setUpperRightX(Math.max(fontBBox.getUpperRightX(), glyphBBox.getUpperRightX()));
                            fontBBox.setUpperRightY(Math.max(fontBBox.getUpperRightY(), glyphBBox.getUpperRightY()));
                        }
                    } catch (IOException unused) {
                    }
                }
            }
        }
        return new BoundingBox(fontBBox.getLowerLeftX(), fontBBox.getLowerLeftY(), fontBBox.getUpperRightX(), fontBBox.getUpperRightY());
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDFont
    public byte[] encode(int i) throws IOException {
        throw new UnsupportedOperationException("Not implemented: Type3");
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDFontLike
    public BoundingBox getBoundingBox() {
        if (this.f60441m == null) {
            this.f60441m = m32416d();
        }
        return this.f60441m;
    }

    public PDType3CharProc getCharProc(int i) {
        COSStream cOSStream;
        String name = getEncoding().getName(i);
        if (getCharProcs() == null || (cOSStream = getCharProcs().getCOSStream(COSName.getPDFName(name))) == null) {
            return null;
        }
        return new PDType3CharProc(this, cOSStream);
    }

    public COSDictionary getCharProcs() {
        if (this.f60439k == null) {
            this.f60439k = this.dict.getCOSDictionary(COSName.CHAR_PROCS);
        }
        return this.f60439k;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDFont
    public Vector getDisplacement(int i) throws IOException {
        return getFontMatrix().transform(new Vector(getWidth(i), 0.0f));
    }

    public PDRectangle getFontBBox() {
        COSBase dictionaryObject = this.dict.getDictionaryObject(COSName.FONT_BBOX);
        if (dictionaryObject instanceof COSArray) {
            return new PDRectangle((COSArray) dictionaryObject);
        }
        return null;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDSimpleFont
    public FontBoxFont getFontBoxFont() {
        throw new UnsupportedOperationException("not supported for Type 3 fonts");
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDFont, com.tom_roush.pdfbox.pdmodel.font.PDFontLike
    public Matrix getFontMatrix() {
        if (this.f60440l == null) {
            COSBase dictionaryObject = this.dict.getDictionaryObject(COSName.FONT_MATRIX);
            if (dictionaryObject instanceof COSArray) {
                this.f60440l = new Matrix((COSArray) dictionaryObject);
            } else {
                return super.getFontMatrix();
            }
        }
        return this.f60440l;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDFontLike
    public float getHeight(int i) throws IOException {
        float f;
        PDFontDescriptor fontDescriptor = getFontDescriptor();
        if (fontDescriptor == null) {
            return 0.0f;
        }
        PDRectangle fontBoundingBox = fontDescriptor.getFontBoundingBox();
        if (fontBoundingBox != null) {
            f = fontBoundingBox.getHeight() / 2.0f;
        } else {
            f = 0.0f;
        }
        if (f == 0.0f) {
            f = fontDescriptor.getCapHeight();
        }
        if (f == 0.0f) {
            f = fontDescriptor.getAscent();
        }
        if (f == 0.0f) {
            float xHeight = fontDescriptor.getXHeight();
            if (xHeight > 0.0f) {
                return xHeight - fontDescriptor.getDescent();
            }
            return xHeight;
        }
        return f;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDFontLike
    public String getName() {
        return this.dict.getNameAsString(COSName.NAME);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDSimpleFont
    public Path getPath(String str) throws IOException {
        throw new UnsupportedOperationException("not supported for Type 3 fonts");
    }

    public PDResources getResources() {
        if (this.f60438j == null) {
            COSBase dictionaryObject = this.dict.getDictionaryObject(COSName.RESOURCES);
            if (dictionaryObject instanceof COSDictionary) {
                this.f60438j = new PDResources((COSDictionary) dictionaryObject, this.f60442n);
            }
        }
        return this.f60438j;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDFont, com.tom_roush.pdfbox.pdmodel.font.PDFontLike
    public float getWidth(int i) throws IOException {
        Float f;
        int i2 = this.dict.getInt(COSName.FIRST_CHAR, -1);
        int i3 = this.dict.getInt(COSName.LAST_CHAR, -1);
        List<Float> widths = getWidths();
        if (!widths.isEmpty() && i >= i2 && i <= i3) {
            int i4 = i - i2;
            if (i4 >= widths.size() || (f = widths.get(i4)) == null) {
                return 0.0f;
            }
            return f.floatValue();
        }
        PDFontDescriptor fontDescriptor = getFontDescriptor();
        if (fontDescriptor != null) {
            return fontDescriptor.getMissingWidth();
        }
        return getWidthFromFont(i);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDFontLike
    public float getWidthFromFont(int i) throws IOException {
        PDType3CharProc charProc = getCharProc(i);
        if (charProc != null && charProc.getContentStream().getLength() != 0) {
            return charProc.getWidth();
        }
        return 0.0f;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDSimpleFont
    public boolean hasGlyph(String str) throws IOException {
        return getCharProcs().getDictionaryObject(COSName.getPDFName(str)) instanceof COSStream;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDFontLike
    public boolean isDamaged() {
        return false;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDFontLike
    public boolean isEmbedded() {
        return true;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDSimpleFont
    public Boolean isFontSymbolic() {
        return Boolean.FALSE;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDSimpleFont, com.tom_roush.pdfbox.pdmodel.font.PDFont
    public boolean isStandard14() {
        return false;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDFont
    public int readCode(InputStream inputStream) throws IOException {
        return inputStream.read();
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDSimpleFont
    public final void readEncoding() throws IOException {
        COSBase dictionaryObject = this.dict.getDictionaryObject(COSName.ENCODING);
        if (dictionaryObject instanceof COSName) {
            COSName cOSName = (COSName) dictionaryObject;
            Encoding encoding = Encoding.getInstance(cOSName);
            this.encoding = encoding;
            if (encoding == null) {
                Log.w("PdfBox-Android", "Unknown encoding: " + cOSName.getName());
            }
        } else if (dictionaryObject instanceof COSDictionary) {
            this.encoding = new DictionaryEncoding((COSDictionary) dictionaryObject);
        }
        this.glyphList = GlyphList.getAdobeGlyphList();
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDSimpleFont
    public Encoding readEncodingFromFont() throws IOException {
        throw new UnsupportedOperationException("not supported for Type 3 fonts");
    }

    public PDType3Font(COSDictionary cOSDictionary, ResourceCache resourceCache) throws IOException {
        super(cOSDictionary);
        this.f60442n = resourceCache;
        readEncoding();
    }
}
