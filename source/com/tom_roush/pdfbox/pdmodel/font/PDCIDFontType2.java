package com.tom_roush.pdfbox.pdmodel.font;

import android.graphics.Path;
import android.util.Log;
import com.tom_roush.fontbox.cmap.CMap;
import com.tom_roush.fontbox.ttf.CmapLookup;
import com.tom_roush.fontbox.ttf.GlyphData;
import com.tom_roush.fontbox.ttf.OpenTypeFont;
import com.tom_roush.fontbox.ttf.TrueTypeFont;
import com.tom_roush.fontbox.util.BoundingBox;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.pdmodel.common.PDRectangle;
import com.tom_roush.pdfbox.util.Matrix;
import java.io.IOException;
import java.util.Set;

/* loaded from: classes5.dex */
public class PDCIDFontType2 extends PDCIDFont {

    /* renamed from: h */
    public final TrueTypeFont f60369h;

    /* renamed from: i */
    public final int[] f60370i;

    /* renamed from: j */
    public final boolean f60371j;

    /* renamed from: k */
    public final boolean f60372k;

    /* renamed from: l */
    public final CmapLookup f60373l;

    /* renamed from: m */
    public Matrix f60374m;

    /* renamed from: n */
    public BoundingBox f60375n;

    /* renamed from: o */
    public final Set f60376o;

    public PDCIDFontType2(COSDictionary cOSDictionary, PDType0Font pDType0Font) throws IOException {
        this(cOSDictionary, pDType0Font, null);
    }

    /* renamed from: h */
    private BoundingBox m32449h() {
        PDRectangle fontBoundingBox;
        if (getFontDescriptor() != null && (fontBoundingBox = getFontDescriptor().getFontBoundingBox()) != null && (Float.compare(fontBoundingBox.getLowerLeftX(), 0.0f) != 0 || Float.compare(fontBoundingBox.getLowerLeftY(), 0.0f) != 0 || Float.compare(fontBoundingBox.getUpperRightX(), 0.0f) != 0 || Float.compare(fontBoundingBox.getUpperRightY(), 0.0f) != 0)) {
            return new BoundingBox(fontBoundingBox.getLowerLeftX(), fontBoundingBox.getLowerLeftY(), fontBoundingBox.getUpperRightX(), fontBoundingBox.getUpperRightY());
        }
        return this.f60369h.getFontBBox();
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDCIDFont
    public int codeToCID(int i) {
        String unicode;
        CMap cMap = this.parent.getCMap();
        if (!cMap.hasCIDMappings() && cMap.hasUnicodeMappings() && (unicode = cMap.toUnicode(i)) != null) {
            return unicode.codePointAt(0);
        }
        return cMap.toCID(i);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDCIDFont
    public int codeToGID(int i) throws IOException {
        if (!this.f60371j) {
            if (this.f60370i != null && !this.f60372k) {
                Log.w("PdfBox-Android", "Using non-embedded GIDs in font " + getName());
                int codeToCID = codeToCID(i);
                int[] iArr = this.f60370i;
                if (codeToCID >= iArr.length) {
                    return 0;
                }
                return iArr[codeToCID];
            }
            String unicode = this.parent.toUnicode(i);
            if (unicode == null) {
                if (!this.f60376o.contains(Integer.valueOf(i))) {
                    this.f60376o.add(Integer.valueOf(i));
                    Log.w("PdfBox-Android", "Failed to find a character mapping for " + i + " in " + getName());
                }
                return codeToCID(i);
            }
            if (unicode.length() > 1) {
                Log.w("PdfBox-Android", "Trying to map multi-byte character using 'cmap', result will be poor");
            }
            return this.f60373l.getGlyphId(unicode.codePointAt(0));
        }
        int codeToCID2 = codeToCID(i);
        int[] iArr2 = this.f60370i;
        if (iArr2 != null) {
            if (codeToCID2 >= iArr2.length) {
                return 0;
            }
            return iArr2[codeToCID2];
        } else if (codeToCID2 >= this.f60369h.getNumberOfGlyphs()) {
            return 0;
        } else {
            return codeToCID2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
    @Override // com.tom_roush.pdfbox.pdmodel.font.PDCIDFont
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public byte[] encode(int r8) {
        /*
            r7 = this;
            r0 = 1
            r1 = 2
            r2 = 0
            boolean r3 = r7.f60371j
            if (r3 == 0) goto L4d
            com.tom_roush.pdfbox.pdmodel.font.PDType0Font r3 = r7.parent
            com.tom_roush.fontbox.cmap.CMap r3 = r3.getCMap()
            java.lang.String r3 = r3.getName()
            java.lang.String r4 = "Identity-"
            boolean r3 = r3.startsWith(r4)
            r4 = -1
            if (r3 == 0) goto L23
            com.tom_roush.fontbox.ttf.CmapLookup r3 = r7.f60373l
            if (r3 == 0) goto L36
            int r3 = r3.getGlyphId(r8)
            goto L37
        L23:
            com.tom_roush.pdfbox.pdmodel.font.PDType0Font r3 = r7.parent
            com.tom_roush.fontbox.cmap.CMap r3 = r3.getCMapUCS2()
            if (r3 == 0) goto L36
            com.tom_roush.pdfbox.pdmodel.font.PDType0Font r3 = r7.parent
            com.tom_roush.fontbox.cmap.CMap r3 = r3.getCMapUCS2()
            int r3 = r3.toCID(r8)
            goto L37
        L36:
            r3 = -1
        L37:
            if (r3 != r4) goto L53
            com.tom_roush.pdfbox.pdmodel.font.PDType0Font r3 = r7.parent
            com.tom_roush.fontbox.cmap.CMap r3 = r3.getToUnicodeCMap()
            char r4 = (char) r8
            java.lang.String r4 = java.lang.Character.toString(r4)
            byte[] r3 = r3.getCodesFromUnicode(r4)
            if (r3 == 0) goto L4b
            return r3
        L4b:
            r3 = 0
            goto L53
        L4d:
            com.tom_roush.fontbox.ttf.CmapLookup r3 = r7.f60373l
            int r3 = r3.getGlyphId(r8)
        L53:
            if (r3 == 0) goto L64
            int r8 = r3 >> 8
            r8 = r8 & 255(0xff, float:3.57E-43)
            byte r8 = (byte) r8
            r3 = r3 & 255(0xff, float:3.57E-43)
            byte r3 = (byte) r3
            byte[] r1 = new byte[r1]
            r1[r2] = r8
            r1[r0] = r3
            return r1
        L64:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.Integer r4 = java.lang.Integer.valueOf(r8)
            char r8 = (char) r8
            java.lang.Character r8 = java.lang.Character.valueOf(r8)
            java.lang.String r5 = r7.getName()
            r6 = 3
            java.lang.Object[] r6 = new java.lang.Object[r6]
            r6[r2] = r4
            r6[r0] = r8
            r6[r1] = r5
            java.lang.String r8 = "No glyph for U+%04X (%c) in font %s"
            java.lang.String r8 = java.lang.String.format(r8, r6)
            r3.<init>(r8)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tom_roush.pdfbox.pdmodel.font.PDCIDFontType2.encode(int):byte[]");
    }

    /* renamed from: g */
    public final TrueTypeFont m32450g() {
        OpenTypeFont openTypeFont;
        CIDFontMapping cIDFont = FontMappers.instance().getCIDFont(getBaseFont(), getFontDescriptor(), getCIDSystemInfo());
        if (cIDFont.isCIDFont()) {
            openTypeFont = cIDFont.getFont();
        } else {
            openTypeFont = (TrueTypeFont) cIDFont.getTrueTypeFont();
        }
        if (cIDFont.isFallback()) {
            Log.w("PdfBox-Android", "Using fallback font " + openTypeFont.getName() + " for CID-keyed TrueType font " + getBaseFont());
        }
        return openTypeFont;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDFontLike
    public BoundingBox getBoundingBox() throws IOException {
        if (this.f60375n == null) {
            this.f60375n = m32449h();
        }
        return this.f60375n;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDFontLike
    public Matrix getFontMatrix() {
        if (this.f60374m == null) {
            this.f60374m = new Matrix(0.001f, 0.0f, 0.0f, 0.001f, 0.0f, 0.0f);
        }
        return this.f60374m;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDFontLike
    public float getHeight(int i) throws IOException {
        return (this.f60369h.getHorizontalHeader().getAscender() + (-this.f60369h.getHorizontalHeader().getDescender())) / this.f60369h.getUnitsPerEm();
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDVectorFont
    public Path getPath(int i) throws IOException {
        TrueTypeFont trueTypeFont = this.f60369h;
        if ((trueTypeFont instanceof OpenTypeFont) && ((OpenTypeFont) trueTypeFont).isPostScript()) {
            return ((OpenTypeFont) this.f60369h).getCFF().getFont().getType2CharString(codeToGID(i)).getPath();
        }
        GlyphData glyph = this.f60369h.getGlyph().getGlyph(codeToGID(i));
        if (glyph != null) {
            return glyph.getPath();
        }
        return new Path();
    }

    public TrueTypeFont getTrueTypeFont() {
        return this.f60369h;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDFontLike
    public float getWidthFromFont(int i) throws IOException {
        int advanceWidth = this.f60369h.getAdvanceWidth(codeToGID(i));
        int unitsPerEm = this.f60369h.getUnitsPerEm();
        if (unitsPerEm != 1000) {
            advanceWidth = (int) (advanceWidth * (1000.0f / unitsPerEm));
        }
        return advanceWidth;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDVectorFont
    public boolean hasGlyph(int i) throws IOException {
        if (codeToGID(i) != 0) {
            return true;
        }
        return false;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDFontLike
    public boolean isDamaged() {
        return this.f60372k;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDFontLike
    public boolean isEmbedded() {
        return this.f60371j;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public PDCIDFontType2(com.tom_roush.pdfbox.cos.COSDictionary r5, com.tom_roush.pdfbox.pdmodel.font.PDType0Font r6, com.tom_roush.fontbox.ttf.TrueTypeFont r7) throws java.io.IOException {
        /*
            r4 = this;
            java.lang.String r0 = "PdfBox-Android"
            r4.<init>(r5, r6)
            java.util.HashSet r5 = new java.util.HashSet
            r5.<init>()
            r4.f60376o = r5
            com.tom_roush.pdfbox.pdmodel.font.PDFontDescriptor r5 = r4.getFontDescriptor()
            r6 = 0
            r1 = 1
            if (r7 == 0) goto L1c
            r4.f60369h = r7
            r4.f60371j = r1
            r4.f60372k = r6
            goto L8b
        L1c:
            r7 = 0
            if (r5 == 0) goto L30
            com.tom_roush.pdfbox.pdmodel.common.PDStream r2 = r5.getFontFile2()
            if (r2 != 0) goto L29
            com.tom_roush.pdfbox.pdmodel.common.PDStream r2 = r5.getFontFile3()
        L29:
            if (r2 != 0) goto L31
            com.tom_roush.pdfbox.pdmodel.common.PDStream r2 = r5.getFontFile()
            goto L31
        L30:
            r2 = r7
        L31:
            if (r2 == 0) goto L7a
            com.tom_roush.fontbox.ttf.OTFParser r3 = new com.tom_roush.fontbox.ttf.OTFParser     // Catch: java.io.IOException -> L5f
            r3.<init>(r1)     // Catch: java.io.IOException -> L5f
            com.tom_roush.pdfbox.cos.COSInputStream r2 = r2.createInputStream()     // Catch: java.io.IOException -> L5f
            com.tom_roush.fontbox.ttf.OpenTypeFont r7 = r3.parse(r2)     // Catch: java.io.IOException -> L5f
            boolean r2 = r7.isPostScript()     // Catch: java.io.IOException -> L5f
            if (r2 == 0) goto L7a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L5f
            r2.<init>()     // Catch: java.io.IOException -> L5f
            java.lang.String r3 = "Found CFF/OTF but expected embedded TTF font "
            r2.append(r3)     // Catch: java.io.IOException -> L5f
            java.lang.String r5 = r5.getFontName()     // Catch: java.io.IOException -> L5f
            r2.append(r5)     // Catch: java.io.IOException -> L5f
            java.lang.String r5 = r2.toString()     // Catch: java.io.IOException -> L5f
            android.util.Log.w(r0, r5)     // Catch: java.io.IOException -> L5f
            goto L78
        L5f:
            r5 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Could not read embedded OTF for font "
            r2.append(r3)
            java.lang.String r3 = r4.getBaseFont()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            android.util.Log.w(r0, r2, r5)
        L78:
            r5 = 1
            goto L7b
        L7a:
            r5 = 0
        L7b:
            if (r7 == 0) goto L7e
            goto L7f
        L7e:
            r1 = 0
        L7f:
            r4.f60371j = r1
            r4.f60372k = r5
            if (r7 != 0) goto L89
            com.tom_roush.fontbox.ttf.TrueTypeFont r7 = r4.m32450g()
        L89:
            r4.f60369h = r7
        L8b:
            com.tom_roush.fontbox.ttf.TrueTypeFont r5 = r4.f60369h
            com.tom_roush.fontbox.ttf.CmapLookup r5 = r5.getUnicodeCmapLookup(r6)
            r4.f60373l = r5
            int[] r5 = r4.m32456d()
            r4.f60370i = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tom_roush.pdfbox.pdmodel.font.PDCIDFontType2.<init>(com.tom_roush.pdfbox.cos.COSDictionary, com.tom_roush.pdfbox.pdmodel.font.PDType0Font, com.tom_roush.fontbox.ttf.TrueTypeFont):void");
    }
}
