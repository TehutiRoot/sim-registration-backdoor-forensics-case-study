package com.tom_roush.pdfbox.pdmodel.font;

import android.graphics.Path;
import android.util.Log;
import com.tom_roush.fontbox.EncodedFont;
import com.tom_roush.fontbox.FontBoxFont;
import com.tom_roush.fontbox.cff.CFFParser;
import com.tom_roush.fontbox.cff.CFFType1Font;
import com.tom_roush.fontbox.util.BoundingBox;
import com.tom_roush.harmony.awt.geom.AffineTransform;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.pdmodel.common.PDRectangle;
import com.tom_roush.pdfbox.pdmodel.font.encoding.Encoding;
import com.tom_roush.pdfbox.pdmodel.font.encoding.StandardEncoding;
import com.tom_roush.pdfbox.pdmodel.font.encoding.Type1Encoding;
import com.tom_roush.pdfbox.util.Matrix;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public class PDType1CFont extends PDSimpleFont {

    /* renamed from: j */
    public final Map f60417j;

    /* renamed from: k */
    public Float f60418k;

    /* renamed from: l */
    public Matrix f60419l;

    /* renamed from: m */
    public final AffineTransform f60420m;

    /* renamed from: n */
    public final CFFType1Font f60421n;

    /* renamed from: o */
    public final FontBoxFont f60422o;

    /* renamed from: p */
    public final boolean f60423p;

    /* renamed from: q */
    public final boolean f60424q;

    /* renamed from: r */
    public BoundingBox f60425r;

    /* renamed from: com.tom_roush.pdfbox.pdmodel.font.PDType1CFont$b */
    /* loaded from: classes5.dex */
    public class C9929b implements CFFParser.ByteSource {
        public C9929b() {
        }

        @Override // com.tom_roush.fontbox.cff.CFFParser.ByteSource
        public byte[] getBytes() {
            return PDType1CFont.this.getFontDescriptor().getFontFile3().toByteArray();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0036 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public PDType1CFont(com.tom_roush.pdfbox.cos.COSDictionary r7) throws java.io.IOException {
        /*
            r6 = this;
            r6.<init>(r7)
            java.util.HashMap r7 = new java.util.HashMap
            r7.<init>()
            r6.f60417j = r7
            r7 = 0
            r6.f60418k = r7
            com.tom_roush.pdfbox.pdmodel.font.PDFontDescriptor r0 = r6.getFontDescriptor()
            if (r0 == 0) goto L31
            com.tom_roush.pdfbox.pdmodel.common.PDStream r1 = r0.getFontFile3()
            if (r1 == 0) goto L31
            byte[] r1 = r1.toByteArray()
            int r2 = r1.length
            if (r2 != 0) goto L32
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Invalid data for embedded Type1C font "
            r1.append(r2)
            java.lang.String r2 = r6.getName()
            r1.append(r2)
        L31:
            r1 = r7
        L32:
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L5f
            com.tom_roush.fontbox.cff.CFFParser r4 = new com.tom_roush.fontbox.cff.CFFParser     // Catch: java.io.IOException -> L4c
            r4.<init>()     // Catch: java.io.IOException -> L4c
            com.tom_roush.pdfbox.pdmodel.font.PDType1CFont$b r5 = new com.tom_roush.pdfbox.pdmodel.font.PDType1CFont$b     // Catch: java.io.IOException -> L4c
            r5.<init>()     // Catch: java.io.IOException -> L4c
            java.util.List r1 = r4.parse(r1, r5)     // Catch: java.io.IOException -> L4c
            java.lang.Object r1 = r1.get(r3)     // Catch: java.io.IOException -> L4c
            com.tom_roush.fontbox.cff.CFFType1Font r1 = (com.tom_roush.fontbox.cff.CFFType1Font) r1     // Catch: java.io.IOException -> L4c
            r7 = r1
            goto L5f
        L4c:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r4 = "Can't read the embedded Type1C font "
            r1.append(r4)
            java.lang.String r4 = r6.getName()
            r1.append(r4)
            r1 = 1
            goto L60
        L5f:
            r1 = 0
        L60:
            r6.f60424q = r1
            r6.f60421n = r7
            if (r7 == 0) goto L6b
            r6.f60422o = r7
            r6.f60423p = r2
            goto Lab
        L6b:
            com.tom_roush.pdfbox.pdmodel.font.FontMapper r7 = com.tom_roush.pdfbox.pdmodel.font.FontMappers.instance()
            java.lang.String r1 = r6.getBaseFont()
            com.tom_roush.pdfbox.pdmodel.font.FontMapping r7 = r7.getFontBoxFont(r1, r0)
            com.tom_roush.fontbox.FontBoxFont r0 = r7.getFont()
            r6.f60422o = r0
            boolean r7 = r7.isFallback()
            if (r7 == 0) goto La9
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r1 = "Using fallback font "
            r7.append(r1)
            java.lang.String r0 = r0.getName()
            r7.append(r0)
            java.lang.String r0 = " for "
            r7.append(r0)
            java.lang.String r0 = r6.getBaseFont()
            r7.append(r0)
            java.lang.String r7 = r7.toString()
            java.lang.String r0 = "PdfBox-Android"
            android.util.Log.w(r0, r7)
        La9:
            r6.f60423p = r3
        Lab:
            r6.readEncoding()
            com.tom_roush.pdfbox.util.Matrix r7 = r6.getFontMatrix()
            com.tom_roush.harmony.awt.geom.AffineTransform r7 = r7.createAffineTransform()
            r6.f60420m = r7
            r0 = 4652007308841189376(0x408f400000000000, double:1000.0)
            r7.scale(r0, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tom_roush.pdfbox.pdmodel.font.PDType1CFont.<init>(com.tom_roush.pdfbox.cos.COSDictionary):void");
    }

    /* renamed from: d */
    private BoundingBox m32425d() {
        PDRectangle fontBoundingBox;
        if (getFontDescriptor() != null && (fontBoundingBox = getFontDescriptor().getFontBoundingBox()) != null && (fontBoundingBox.getLowerLeftX() != 0.0f || fontBoundingBox.getLowerLeftY() != 0.0f || fontBoundingBox.getUpperRightX() != 0.0f || fontBoundingBox.getUpperRightY() != 0.0f)) {
            return new BoundingBox(fontBoundingBox.getLowerLeftX(), fontBoundingBox.getLowerLeftY(), fontBoundingBox.getUpperRightX(), fontBoundingBox.getUpperRightY());
        }
        return this.f60422o.getFontBBox();
    }

    /* renamed from: e */
    private float m32424e() {
        return 500.0f;
    }

    public String codeToName(int i) {
        return getEncoding().getName(i);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDFont
    public byte[] encode(int i) throws IOException {
        String codePointToName = getGlyphList().codePointToName(i);
        if (this.encoding.contains(codePointToName)) {
            String m32423f = m32423f(codePointToName);
            Map<String, Integer> nameToCodeMap = this.encoding.getNameToCodeMap();
            if (m32423f.equals(".notdef") || !this.f60422o.hasGlyph(m32423f)) {
                throw new IllegalArgumentException(String.format("No glyph for U+%04X in font %s", Integer.valueOf(i), getName()));
            }
            return new byte[]{(byte) nameToCodeMap.get(codePointToName).intValue()};
        }
        throw new IllegalArgumentException(String.format("U+%04X ('%s') is not available in this font's encoding: %s", Integer.valueOf(i), codePointToName, this.encoding.getEncodingName()));
    }

    /* renamed from: f */
    public final String m32423f(String str) {
        if (!isEmbedded() && !this.f60422o.hasGlyph(str)) {
            String unicode = getGlyphList().toUnicode(str);
            if (unicode != null && unicode.length() == 1) {
                String m26122a = AbstractC21258nY1.m26122a(unicode.codePointAt(0));
                if (this.f60422o.hasGlyph(m26122a)) {
                    return m26122a;
                }
            }
            return ".notdef";
        }
        return str;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDFont, com.tom_roush.pdfbox.pdmodel.font.PDFontLike
    public float getAverageFontWidth() {
        if (this.f60418k == null) {
            this.f60418k = Float.valueOf(m32424e());
        }
        return this.f60418k.floatValue();
    }

    public final String getBaseFont() {
        return this.dict.getNameAsString(COSName.BASE_FONT);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDFontLike
    public BoundingBox getBoundingBox() throws IOException {
        if (this.f60425r == null) {
            this.f60425r = m32425d();
        }
        return this.f60425r;
    }

    public CFFType1Font getCFFType1Font() {
        return this.f60421n;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDSimpleFont
    public FontBoxFont getFontBoxFont() {
        return this.f60422o;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDFont, com.tom_roush.pdfbox.pdmodel.font.PDFontLike
    public final Matrix getFontMatrix() {
        List<Number> list;
        if (this.f60419l == null) {
            try {
                list = this.f60422o.getFontMatrix();
            } catch (IOException unused) {
                this.f60419l = PDFont.DEFAULT_FONT_MATRIX;
                list = null;
            }
            if (list != null && list.size() == 6) {
                this.f60419l = new Matrix(list.get(0).floatValue(), list.get(1).floatValue(), list.get(2).floatValue(), list.get(3).floatValue(), list.get(4).floatValue(), list.get(5).floatValue());
            } else {
                return super.getFontMatrix();
            }
        }
        return this.f60419l;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDFontLike
    public float getHeight(int i) throws IOException {
        String codeToName = codeToName(i);
        if (!this.f60417j.containsKey(codeToName)) {
            CFFType1Font cFFType1Font = this.f60421n;
            if (cFFType1Font == null) {
                Log.w("PdfBox-Android", "No embedded CFF font, returning 0");
                return 0.0f;
            }
            float height = cFFType1Font.getType1CharString(codeToName).getBounds().height();
            this.f60417j.put(codeToName, Float.valueOf(height));
            return height;
        }
        return ((Float) this.f60417j.get(codeToName)).floatValue();
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDFontLike
    public final String getName() {
        return getBaseFont();
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDSimpleFont
    public Path getPath(String str) throws IOException {
        if (str.equals(".notdef") && !isEmbedded() && !isStandard14()) {
            return new Path();
        }
        if ("sfthyphen".equals(str)) {
            return this.f60422o.getPath("hyphen");
        }
        if ("nbspace".equals(str)) {
            if (!hasGlyph("space")) {
                return new Path();
            }
            return this.f60422o.getPath("space");
        }
        return this.f60422o.getPath(str);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDFont
    public float getStringWidth(String str) throws IOException {
        float f = 0.0f;
        if (this.f60421n == null) {
            Log.w("PdfBox-Android", "No embedded CFF font, returning 0");
            return 0.0f;
        }
        for (int i = 0; i < str.length(); i++) {
            f += this.f60421n.getType1CharString(getGlyphList().codePointToName(str.codePointAt(i))).getWidth();
        }
        return f;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDFontLike
    public float getWidthFromFont(int i) throws IOException {
        float[] fArr = {this.f60422o.getWidth(m32423f(codeToName(i))), 0.0f};
        this.f60420m.transform(fArr, 0, fArr, 0, 1);
        return fArr[0];
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDSimpleFont
    public boolean hasGlyph(String str) throws IOException {
        return this.f60422o.hasGlyph(str);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDFontLike
    public boolean isDamaged() {
        return this.f60424q;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDFontLike
    public boolean isEmbedded() {
        return this.f60423p;
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
        FontBoxFont fontBoxFont = this.f60422o;
        if (fontBoxFont instanceof EncodedFont) {
            return Type1Encoding.fromFontBox(((EncodedFont) fontBoxFont).getEncoding());
        }
        return StandardEncoding.INSTANCE;
    }
}
