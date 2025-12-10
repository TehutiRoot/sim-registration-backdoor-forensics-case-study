package com.tom_roush.pdfbox.pdmodel.font;

import android.graphics.Path;
import android.graphics.PointF;
import com.tom_roush.fontbox.FontBoxFont;
import com.tom_roush.fontbox.cff.CFFCIDFont;
import com.tom_roush.fontbox.cff.CFFFont;
import com.tom_roush.fontbox.cff.CFFParser;
import com.tom_roush.fontbox.cff.CFFType1Font;
import com.tom_roush.fontbox.cff.Type2CharString;
import com.tom_roush.fontbox.util.BoundingBox;
import com.tom_roush.harmony.awt.geom.AffineTransform;
import com.tom_roush.pdfbox.pdmodel.common.PDRectangle;
import com.tom_roush.pdfbox.util.Matrix;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public class PDCIDFontType0 extends PDCIDFont {

    /* renamed from: h */
    public final CFFCIDFont f60358h;

    /* renamed from: i */
    public final FontBoxFont f60359i;

    /* renamed from: j */
    public final Map f60360j;

    /* renamed from: k */
    public final boolean f60361k;

    /* renamed from: l */
    public final boolean f60362l;

    /* renamed from: m */
    public Float f60363m;

    /* renamed from: n */
    public Matrix f60364n;

    /* renamed from: o */
    public final AffineTransform f60365o;

    /* renamed from: p */
    public BoundingBox f60366p;

    /* renamed from: q */
    public int[] f60367q;

    /* renamed from: com.tom_roush.pdfbox.pdmodel.font.PDCIDFontType0$b */
    /* loaded from: classes5.dex */
    public class C9926b implements CFFParser.ByteSource {
        public C9926b() {
        }

        @Override // com.tom_roush.fontbox.cff.CFFParser.ByteSource
        public byte[] getBytes() {
            return PDCIDFontType0.this.getFontDescriptor().getFontFile3().toByteArray();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0095  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public PDCIDFontType0(com.tom_roush.pdfbox.cos.COSDictionary r7, com.tom_roush.pdfbox.pdmodel.font.PDType0Font r8) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 280
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tom_roush.pdfbox.pdmodel.font.PDCIDFontType0.<init>(com.tom_roush.pdfbox.cos.COSDictionary, com.tom_roush.pdfbox.pdmodel.font.PDType0Font):void");
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDCIDFont
    public int codeToCID(int i) {
        return this.parent.getCMap().toCID(i);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDCIDFont
    public int codeToGID(int i) {
        int codeToCID = codeToCID(i);
        CFFCIDFont cFFCIDFont = this.f60358h;
        if (cFFCIDFont != null) {
            return cFFCIDFont.getCharset().getGIDForCID(codeToCID);
        }
        return codeToCID;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDCIDFont
    public byte[] encode(int i) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: g */
    public final BoundingBox m32453g() {
        if (getFontDescriptor() != null) {
            PDRectangle fontBoundingBox = getFontDescriptor().getFontBoundingBox();
            if (fontBoundingBox.getLowerLeftX() != 0.0f || fontBoundingBox.getLowerLeftY() != 0.0f || fontBoundingBox.getUpperRightX() != 0.0f || fontBoundingBox.getUpperRightY() != 0.0f) {
                return new BoundingBox(fontBoundingBox.getLowerLeftX(), fontBoundingBox.getLowerLeftY(), fontBoundingBox.getUpperRightX(), fontBoundingBox.getUpperRightY());
            }
        }
        CFFCIDFont cFFCIDFont = this.f60358h;
        if (cFFCIDFont != null) {
            return cFFCIDFont.getFontBBox();
        }
        try {
            return this.f60359i.getFontBBox();
        } catch (IOException unused) {
            return new BoundingBox();
        }
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDCIDFont, com.tom_roush.pdfbox.pdmodel.font.PDFontLike
    public float getAverageFontWidth() {
        if (this.f60363m == null) {
            this.f60363m = Float.valueOf(m32452h());
        }
        return this.f60363m.floatValue();
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDFontLike
    public BoundingBox getBoundingBox() {
        if (this.f60366p == null) {
            this.f60366p = m32453g();
        }
        return this.f60366p;
    }

    public CFFFont getCFFFont() {
        CFFCIDFont cFFCIDFont = this.f60358h;
        if (cFFCIDFont != null) {
            return cFFCIDFont;
        }
        FontBoxFont fontBoxFont = this.f60359i;
        if (fontBoxFont instanceof CFFType1Font) {
            return (CFFType1Font) fontBoxFont;
        }
        return null;
    }

    public FontBoxFont getFontBoxFont() {
        CFFCIDFont cFFCIDFont = this.f60358h;
        if (cFFCIDFont != null) {
            return cFFCIDFont;
        }
        return this.f60359i;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDFontLike
    public final Matrix getFontMatrix() {
        List<Number> fontMatrix;
        if (this.f60364n == null) {
            CFFCIDFont cFFCIDFont = this.f60358h;
            if (cFFCIDFont != null) {
                fontMatrix = cFFCIDFont.getFontMatrix();
            } else {
                try {
                    fontMatrix = this.f60359i.getFontMatrix();
                } catch (IOException unused) {
                    return new Matrix(0.001f, 0.0f, 0.0f, 0.001f, 0.0f, 0.0f);
                }
            }
            if (fontMatrix != null && fontMatrix.size() == 6) {
                this.f60364n = new Matrix(fontMatrix.get(0).floatValue(), fontMatrix.get(1).floatValue(), fontMatrix.get(2).floatValue(), fontMatrix.get(3).floatValue(), fontMatrix.get(4).floatValue(), fontMatrix.get(5).floatValue());
            } else {
                this.f60364n = new Matrix(0.001f, 0.0f, 0.0f, 0.001f, 0.0f, 0.0f);
            }
        }
        return this.f60364n;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDFontLike
    public float getHeight(int i) throws IOException {
        int codeToCID = codeToCID(i);
        if (!this.f60360j.containsKey(Integer.valueOf(codeToCID))) {
            float height = getType2CharString(codeToCID).getBounds().height();
            this.f60360j.put(Integer.valueOf(codeToCID), Float.valueOf(height));
            return height;
        }
        return ((Float) this.f60360j.get(Integer.valueOf(codeToCID))).floatValue();
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDVectorFont
    public Path getPath(int i) throws IOException {
        int codeToCID = codeToCID(i);
        int[] iArr = this.f60367q;
        if (iArr != null && this.f60361k) {
            codeToCID = iArr[codeToCID];
        }
        Type2CharString type2CharString = getType2CharString(codeToCID);
        if (type2CharString != null) {
            return type2CharString.getPath();
        }
        if (this.f60361k) {
            FontBoxFont fontBoxFont = this.f60359i;
            if (fontBoxFont instanceof CFFType1Font) {
                return ((CFFType1Font) fontBoxFont).getType2CharString(codeToCID).getPath();
            }
        }
        return this.f60359i.getPath(m32451i(i));
    }

    public Type2CharString getType2CharString(int i) throws IOException {
        CFFCIDFont cFFCIDFont = this.f60358h;
        if (cFFCIDFont != null) {
            return cFFCIDFont.getType2CharString(i);
        }
        FontBoxFont fontBoxFont = this.f60359i;
        if (fontBoxFont instanceof CFFType1Font) {
            return ((CFFType1Font) fontBoxFont).getType2CharString(i);
        }
        return null;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDFontLike
    public float getWidthFromFont(int i) throws IOException {
        float width;
        int width2;
        int codeToCID = codeToCID(i);
        if (this.f60358h != null) {
            width2 = getType2CharString(codeToCID).getWidth();
        } else {
            if (this.f60361k) {
                FontBoxFont fontBoxFont = this.f60359i;
                if (fontBoxFont instanceof CFFType1Font) {
                    width2 = ((CFFType1Font) fontBoxFont).getType2CharString(codeToCID).getWidth();
                }
            }
            width = this.f60359i.getWidth(m32451i(i));
            PointF pointF = new PointF(width, 0.0f);
            this.f60365o.transform(pointF, pointF);
            return pointF.x;
        }
        width = width2;
        PointF pointF2 = new PointF(width, 0.0f);
        this.f60365o.transform(pointF2, pointF2);
        return pointF2.x;
    }

    /* renamed from: h */
    public final float m32452h() {
        return 500.0f;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDVectorFont
    public boolean hasGlyph(int i) throws IOException {
        int codeToCID = codeToCID(i);
        Type2CharString type2CharString = getType2CharString(codeToCID);
        if (type2CharString != null) {
            if (type2CharString.getGID() == 0) {
                return false;
            }
            return true;
        }
        if (this.f60361k) {
            FontBoxFont fontBoxFont = this.f60359i;
            if (fontBoxFont instanceof CFFType1Font) {
                if (((CFFType1Font) fontBoxFont).getType2CharString(codeToCID).getGID() == 0) {
                    return false;
                }
                return true;
            }
        }
        return this.f60359i.hasGlyph(m32451i(i));
    }

    /* renamed from: i */
    public final String m32451i(int i) {
        String unicode = this.parent.toUnicode(i);
        if (unicode == null) {
            return ".notdef";
        }
        return AbstractC21258nY1.m26122a(unicode.codePointAt(0));
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDFontLike
    public boolean isDamaged() {
        return this.f60362l;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDFontLike
    public boolean isEmbedded() {
        return this.f60361k;
    }
}
