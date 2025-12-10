package com.tom_roush.pdfbox.pdmodel.font;

import android.graphics.Path;
import android.graphics.RectF;
import android.util.Log;
import ch.qos.logback.classic.spi.CallerData;
import com.tom_roush.fontbox.EncodedFont;
import com.tom_roush.fontbox.FontBoxFont;
import com.tom_roush.fontbox.type1.Type1Font;
import com.tom_roush.fontbox.util.BoundingBox;
import com.tom_roush.harmony.awt.geom.AffineTransform;
import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.pdmodel.PDDocument;
import com.tom_roush.pdfbox.pdmodel.common.PDRectangle;
import com.tom_roush.pdfbox.pdmodel.font.encoding.Encoding;
import com.tom_roush.pdfbox.pdmodel.font.encoding.StandardEncoding;
import com.tom_roush.pdfbox.pdmodel.font.encoding.SymbolEncoding;
import com.tom_roush.pdfbox.pdmodel.font.encoding.Type1Encoding;
import com.tom_roush.pdfbox.pdmodel.font.encoding.WinAnsiEncoding;
import com.tom_roush.pdfbox.pdmodel.font.encoding.ZapfDingbatsEncoding;
import com.tom_roush.pdfbox.util.Matrix;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes5.dex */
public class PDType1Font extends PDSimpleFont {
    public static final PDType1Font COURIER;
    public static final PDType1Font COURIER_BOLD;
    public static final PDType1Font COURIER_BOLD_OBLIQUE;
    public static final PDType1Font COURIER_OBLIQUE;
    public static final PDType1Font HELVETICA;
    public static final PDType1Font HELVETICA_BOLD;
    public static final PDType1Font HELVETICA_BOLD_OBLIQUE;
    public static final PDType1Font HELVETICA_OBLIQUE;
    public static final PDType1Font SYMBOL;
    public static final PDType1Font TIMES_BOLD;
    public static final PDType1Font TIMES_BOLD_ITALIC;
    public static final PDType1Font TIMES_ITALIC;
    public static final PDType1Font TIMES_ROMAN;
    public static final PDType1Font ZAPF_DINGBATS;

    /* renamed from: r */
    public static final Map f60427r;

    /* renamed from: j */
    public final Type1Font f60428j;

    /* renamed from: k */
    public final FontBoxFont f60429k;

    /* renamed from: l */
    public final boolean f60430l;

    /* renamed from: m */
    public final boolean f60431m;

    /* renamed from: n */
    public Matrix f60432n;

    /* renamed from: o */
    public final AffineTransform f60433o;

    /* renamed from: p */
    public BoundingBox f60434p;

    /* renamed from: q */
    public final Map f60435q;

    static {
        HashMap hashMap = new HashMap();
        f60427r = hashMap;
        hashMap.put("ff", "f_f");
        hashMap.put("ffi", "f_f_i");
        hashMap.put("ffl", "f_f_l");
        hashMap.put("fi", "f_i");
        hashMap.put("fl", "f_l");
        hashMap.put("st", "s_t");
        hashMap.put("IJ", "I_J");
        hashMap.put("ij", "i_j");
        hashMap.put("ellipsis", "elipsis");
        TIMES_ROMAN = new PDType1Font("Times-Roman");
        TIMES_BOLD = new PDType1Font("Times-Bold");
        TIMES_ITALIC = new PDType1Font("Times-Italic");
        TIMES_BOLD_ITALIC = new PDType1Font("Times-BoldItalic");
        HELVETICA = new PDType1Font("Helvetica");
        HELVETICA_BOLD = new PDType1Font("Helvetica-Bold");
        HELVETICA_OBLIQUE = new PDType1Font("Helvetica-Oblique");
        HELVETICA_BOLD_OBLIQUE = new PDType1Font("Helvetica-BoldOblique");
        COURIER = new PDType1Font("Courier");
        COURIER_BOLD = new PDType1Font("Courier-Bold");
        COURIER_OBLIQUE = new PDType1Font("Courier-Oblique");
        COURIER_BOLD_OBLIQUE = new PDType1Font("Courier-BoldOblique");
        SYMBOL = new PDType1Font("Symbol");
        ZAPF_DINGBATS = new PDType1Font("ZapfDingbats");
    }

    public PDType1Font(String str) {
        super(str);
        String str2;
        this.dict.setItem(COSName.SUBTYPE, (COSBase) COSName.TYPE1);
        this.dict.setName(COSName.BASE_FONT, str);
        if ("ZapfDingbats".equals(str)) {
            this.encoding = ZapfDingbatsEncoding.INSTANCE;
        } else if ("Symbol".equals(str)) {
            this.encoding = SymbolEncoding.INSTANCE;
        } else {
            this.encoding = WinAnsiEncoding.INSTANCE;
            this.dict.setItem(COSName.ENCODING, (COSBase) COSName.WIN_ANSI_ENCODING);
        }
        this.f60435q = new ConcurrentHashMap();
        this.f60428j = null;
        FontMapping<FontBoxFont> fontBoxFont = FontMappers.instance().getFontBoxFont(getBaseFont(), getFontDescriptor());
        FontBoxFont font = fontBoxFont.getFont();
        this.f60429k = font;
        if (fontBoxFont.isFallback()) {
            try {
                str2 = font.getName();
            } catch (IOException unused) {
                str2 = CallerData.f39639NA;
            }
            Log.w("PdfBox-Android", "Using fallback font " + str2 + " for base font " + getBaseFont());
        }
        this.f60430l = false;
        this.f60431m = false;
        this.f60433o = new AffineTransform();
    }

    /* renamed from: d */
    public static int m32422d(byte[] bArr, int i) {
        byte b;
        while (true) {
            if (i <= 0) {
                break;
            } else if (bArr[i] == 101 && bArr[i + 1] == 120 && bArr[i + 2] == 101 && bArr[i + 3] == 99) {
                i += 4;
                while (i < bArr.length && ((b = bArr[i]) == 13 || b == 10 || b == 32 || b == 9)) {
                    i++;
                }
            } else {
                i--;
            }
        }
        return i;
    }

    /* renamed from: e */
    private BoundingBox m32421e() {
        PDRectangle fontBoundingBox;
        if (getFontDescriptor() != null && (fontBoundingBox = getFontDescriptor().getFontBoundingBox()) != null && (fontBoundingBox.getLowerLeftX() != 0.0f || fontBoundingBox.getLowerLeftY() != 0.0f || fontBoundingBox.getUpperRightX() != 0.0f || fontBoundingBox.getUpperRightY() != 0.0f)) {
            return new BoundingBox(fontBoundingBox.getLowerLeftX(), fontBoundingBox.getLowerLeftY(), fontBoundingBox.getUpperRightX(), fontBoundingBox.getUpperRightY());
        }
        return this.f60429k.getFontBBox();
    }

    /* renamed from: f */
    private String m32420f(String str) {
        Integer num;
        if (!isEmbedded() && !this.f60429k.hasGlyph(str)) {
            String str2 = (String) f60427r.get(str);
            if (str2 != null && !str.equals(".notdef") && this.f60429k.hasGlyph(str2)) {
                return str2;
            }
            String unicode = getGlyphList().toUnicode(str);
            if (unicode != null && unicode.length() == 1) {
                String m26122a = AbstractC21258nY1.m26122a(unicode.codePointAt(0));
                if (this.f60429k.hasGlyph(m26122a)) {
                    return m26122a;
                }
                if ("SymbolMT".equals(this.f60429k.getName()) && (num = SymbolEncoding.INSTANCE.getNameToCodeMap().get(str)) != null) {
                    String m26122a2 = AbstractC21258nY1.m26122a(num.intValue() + 61440);
                    if (this.f60429k.hasGlyph(m26122a2)) {
                        return m26122a2;
                    }
                }
            }
            return ".notdef";
        }
        return str;
    }

    public String codeToName(int i) throws IOException {
        return m32420f(getEncoding().getName(i));
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDFont
    public byte[] encode(int i) throws IOException {
        byte[] bArr = (byte[]) this.f60435q.get(Integer.valueOf(i));
        if (bArr != null) {
            return bArr;
        }
        String codePointToName = getGlyphList().codePointToName(i);
        if (isStandard14()) {
            if (this.encoding.contains(codePointToName)) {
                if (".notdef".equals(codePointToName)) {
                    throw new IllegalArgumentException(String.format("No glyph for U+%04X in the font %s", Integer.valueOf(i), getName()));
                }
            } else {
                throw new IllegalArgumentException(String.format("U+%04X ('%s') is not available in the font %s, encoding: %s", Integer.valueOf(i), codePointToName, getName(), this.encoding.getEncodingName()));
            }
        } else if (this.encoding.contains(codePointToName)) {
            String m32420f = m32420f(codePointToName);
            if (m32420f.equals(".notdef") || !this.f60429k.hasGlyph(m32420f)) {
                throw new IllegalArgumentException(String.format("No glyph for U+%04X in the font %s (generic: %s)", Integer.valueOf(i), getName(), this.f60429k.getName()));
            }
        } else {
            throw new IllegalArgumentException(String.format("U+%04X ('%s') is not available in the font %s (generic: %s), encoding: %s", Integer.valueOf(i), codePointToName, getName(), this.f60429k.getName(), this.encoding.getEncodingName()));
        }
        int intValue = this.encoding.getNameToCodeMap().get(codePointToName).intValue();
        if (intValue >= 0) {
            byte[] bArr2 = {(byte) intValue};
            this.f60435q.put(Integer.valueOf(i), bArr2);
            return bArr2;
        }
        throw new IllegalArgumentException(String.format("U+%04X ('%s') is not available in the font %s (generic: %s), encoding: %s", Integer.valueOf(i), codePointToName, getName(), this.f60429k.getName(), this.encoding.getEncodingName()));
    }

    /* renamed from: g */
    public final int m32419g(byte[] bArr, int i) {
        int max = Math.max(0, i - 4);
        if (max <= 0 || max > bArr.length - 4) {
            max = bArr.length - 4;
        }
        int m32422d = m32422d(bArr, max);
        if (m32422d == 0 && i > 0) {
            m32422d = m32422d(bArr, bArr.length - 4);
        }
        if (i - m32422d != 0 && m32422d > 0) {
            Log.w("PdfBox-Android", "Ignored invalid Length1 " + i + " for Type 1 font " + getName());
            return m32422d;
        }
        return i;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDFont, com.tom_roush.pdfbox.pdmodel.font.PDFontLike
    public float getAverageFontWidth() {
        if (getStandard14AFM() != null) {
            return getStandard14AFM().getAverageCharacterWidth();
        }
        return super.getAverageFontWidth();
    }

    public final String getBaseFont() {
        return this.dict.getNameAsString(COSName.BASE_FONT);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDFontLike
    public BoundingBox getBoundingBox() throws IOException {
        if (this.f60434p == null) {
            this.f60434p = m32421e();
        }
        return this.f60434p;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDSimpleFont
    public FontBoxFont getFontBoxFont() {
        return this.f60429k;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDFont, com.tom_roush.pdfbox.pdmodel.font.PDFontLike
    public final Matrix getFontMatrix() {
        List<Number> list;
        if (this.f60432n == null) {
            try {
                list = this.f60429k.getFontMatrix();
            } catch (IOException unused) {
                this.f60432n = PDFont.DEFAULT_FONT_MATRIX;
                list = null;
            }
            if (list != null && list.size() == 6) {
                this.f60432n = new Matrix(list.get(0).floatValue(), list.get(1).floatValue(), list.get(2).floatValue(), list.get(3).floatValue(), list.get(4).floatValue(), list.get(5).floatValue());
            } else {
                return super.getFontMatrix();
            }
        }
        return this.f60432n;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDFontLike
    public float getHeight(int i) throws IOException {
        if (getStandard14AFM() != null) {
            return getStandard14AFM().getCharacterHeight(getEncoding().getName(i));
        }
        String codeToName = codeToName(i);
        RectF rectF = new RectF();
        this.f60429k.getPath(codeToName).computeBounds(rectF, true);
        return rectF.height();
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDFontLike
    public String getName() {
        return getBaseFont();
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDSimpleFont
    public Path getPath(String str) throws IOException {
        if (str.equals(".notdef") && !this.f60430l) {
            return new Path();
        }
        return this.f60429k.getPath(m32420f(str));
    }

    public Type1Font getType1Font() {
        return this.f60428j;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDFontLike
    public float getWidthFromFont(int i) throws IOException {
        String codeToName = codeToName(i);
        if (!this.f60430l && ".notdef".equals(codeToName)) {
            return 250.0f;
        }
        float[] fArr = {this.f60429k.getWidth(codeToName), 0.0f};
        this.f60433o.transform(fArr, 0, fArr, 0, 1);
        return fArr[0];
    }

    /* renamed from: h */
    public final int m32418h(byte[] bArr, int i, int i2) {
        if (i2 >= 0 && i2 <= bArr.length - i) {
            return i2;
        }
        Log.w("PdfBox-Android", "Ignored invalid Length2 " + i2 + " for Type 1 font " + getName());
        return bArr.length - i;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDSimpleFont
    public boolean hasGlyph(String str) throws IOException {
        return this.f60429k.hasGlyph(m32420f(str));
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDFontLike
    public boolean isDamaged() {
        return this.f60431m;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDFontLike
    public boolean isEmbedded() {
        return this.f60430l;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDFont
    public int readCode(InputStream inputStream) throws IOException {
        return inputStream.read();
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDSimpleFont
    public Encoding readEncodingFromFont() throws IOException {
        if (!isEmbedded() && getStandard14AFM() != null) {
            return new Type1Encoding(getStandard14AFM());
        }
        FontBoxFont fontBoxFont = this.f60429k;
        if (fontBoxFont instanceof EncodedFont) {
            return Type1Encoding.fromFontBox(((EncodedFont) fontBoxFont).getEncoding());
        }
        return StandardEncoding.INSTANCE;
    }

    public PDType1Font(PDDocument pDDocument, InputStream inputStream) throws IOException {
        this(pDDocument, inputStream, null);
    }

    public PDType1Font(PDDocument pDDocument, InputStream inputStream, Encoding encoding) throws IOException {
        C21971rh1 c21971rh1 = new C21971rh1(pDDocument, this.dict, inputStream, encoding);
        this.encoding = encoding == null ? c21971rh1.m23284c() : encoding;
        this.glyphList = c21971rh1.m23283d();
        this.f60428j = c21971rh1.m23282e();
        this.f60429k = c21971rh1.m23282e();
        this.f60430l = true;
        this.f60431m = false;
        this.f60433o = new AffineTransform();
        this.f60435q = new HashMap();
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public PDType1Font(com.tom_roush.pdfbox.cos.COSDictionary r11) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 298
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tom_roush.pdfbox.pdmodel.font.PDType1Font.<init>(com.tom_roush.pdfbox.cos.COSDictionary):void");
    }
}
