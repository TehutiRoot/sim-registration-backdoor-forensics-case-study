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
    public final CFFCIDFont f60370h;

    /* renamed from: i */
    public final FontBoxFont f60371i;

    /* renamed from: j */
    public final Map f60372j;

    /* renamed from: k */
    public final boolean f60373k;

    /* renamed from: l */
    public final boolean f60374l;

    /* renamed from: m */
    public Float f60375m;

    /* renamed from: n */
    public Matrix f60376n;

    /* renamed from: o */
    public final AffineTransform f60377o;

    /* renamed from: p */
    public BoundingBox f60378p;

    /* renamed from: q */
    public int[] f60379q;

    /* renamed from: com.tom_roush.pdfbox.pdmodel.font.PDCIDFontType0$b */
    /* loaded from: classes5.dex */
    public class C9915b implements CFFParser.ByteSource {
        public C9915b() {
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
        CFFCIDFont cFFCIDFont = this.f60370h;
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
    public final BoundingBox m32445g() {
        if (getFontDescriptor() != null) {
            PDRectangle fontBoundingBox = getFontDescriptor().getFontBoundingBox();
            if (fontBoundingBox.getLowerLeftX() != 0.0f || fontBoundingBox.getLowerLeftY() != 0.0f || fontBoundingBox.getUpperRightX() != 0.0f || fontBoundingBox.getUpperRightY() != 0.0f) {
                return new BoundingBox(fontBoundingBox.getLowerLeftX(), fontBoundingBox.getLowerLeftY(), fontBoundingBox.getUpperRightX(), fontBoundingBox.getUpperRightY());
            }
        }
        CFFCIDFont cFFCIDFont = this.f60370h;
        if (cFFCIDFont != null) {
            return cFFCIDFont.getFontBBox();
        }
        try {
            return this.f60371i.getFontBBox();
        } catch (IOException unused) {
            return new BoundingBox();
        }
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDCIDFont, com.tom_roush.pdfbox.pdmodel.font.PDFontLike
    public float getAverageFontWidth() {
        if (this.f60375m == null) {
            this.f60375m = Float.valueOf(m32444h());
        }
        return this.f60375m.floatValue();
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDFontLike
    public BoundingBox getBoundingBox() {
        if (this.f60378p == null) {
            this.f60378p = m32445g();
        }
        return this.f60378p;
    }

    public CFFFont getCFFFont() {
        CFFCIDFont cFFCIDFont = this.f60370h;
        if (cFFCIDFont != null) {
            return cFFCIDFont;
        }
        FontBoxFont fontBoxFont = this.f60371i;
        if (fontBoxFont instanceof CFFType1Font) {
            return (CFFType1Font) fontBoxFont;
        }
        return null;
    }

    public FontBoxFont getFontBoxFont() {
        CFFCIDFont cFFCIDFont = this.f60370h;
        if (cFFCIDFont != null) {
            return cFFCIDFont;
        }
        return this.f60371i;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDFontLike
    public final Matrix getFontMatrix() {
        List<Number> fontMatrix;
        if (this.f60376n == null) {
            CFFCIDFont cFFCIDFont = this.f60370h;
            if (cFFCIDFont != null) {
                fontMatrix = cFFCIDFont.getFontMatrix();
            } else {
                try {
                    fontMatrix = this.f60371i.getFontMatrix();
                } catch (IOException unused) {
                    return new Matrix(0.001f, 0.0f, 0.0f, 0.001f, 0.0f, 0.0f);
                }
            }
            if (fontMatrix != null && fontMatrix.size() == 6) {
                this.f60376n = new Matrix(fontMatrix.get(0).floatValue(), fontMatrix.get(1).floatValue(), fontMatrix.get(2).floatValue(), fontMatrix.get(3).floatValue(), fontMatrix.get(4).floatValue(), fontMatrix.get(5).floatValue());
            } else {
                this.f60376n = new Matrix(0.001f, 0.0f, 0.0f, 0.001f, 0.0f, 0.0f);
            }
        }
        return this.f60376n;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDFontLike
    public float getHeight(int i) throws IOException {
        int codeToCID = codeToCID(i);
        if (!this.f60372j.containsKey(Integer.valueOf(codeToCID))) {
            float height = getType2CharString(codeToCID).getBounds().height();
            this.f60372j.put(Integer.valueOf(codeToCID), Float.valueOf(height));
            return height;
        }
        return ((Float) this.f60372j.get(Integer.valueOf(codeToCID))).floatValue();
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDVectorFont
    public Path getPath(int i) throws IOException {
        int codeToCID = codeToCID(i);
        int[] iArr = this.f60379q;
        if (iArr != null && this.f60373k) {
            codeToCID = iArr[codeToCID];
        }
        Type2CharString type2CharString = getType2CharString(codeToCID);
        if (type2CharString != null) {
            return type2CharString.getPath();
        }
        if (this.f60373k) {
            FontBoxFont fontBoxFont = this.f60371i;
            if (fontBoxFont instanceof CFFType1Font) {
                return ((CFFType1Font) fontBoxFont).getType2CharString(codeToCID).getPath();
            }
        }
        return this.f60371i.getPath(m32443i(i));
    }

    public Type2CharString getType2CharString(int i) throws IOException {
        CFFCIDFont cFFCIDFont = this.f60370h;
        if (cFFCIDFont != null) {
            return cFFCIDFont.getType2CharString(i);
        }
        FontBoxFont fontBoxFont = this.f60371i;
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
        if (this.f60370h != null) {
            width2 = getType2CharString(codeToCID).getWidth();
        } else {
            if (this.f60373k) {
                FontBoxFont fontBoxFont = this.f60371i;
                if (fontBoxFont instanceof CFFType1Font) {
                    width2 = ((CFFType1Font) fontBoxFont).getType2CharString(codeToCID).getWidth();
                }
            }
            width = this.f60371i.getWidth(m32443i(i));
            PointF pointF = new PointF(width, 0.0f);
            this.f60377o.transform(pointF, pointF);
            return pointF.x;
        }
        width = width2;
        PointF pointF2 = new PointF(width, 0.0f);
        this.f60377o.transform(pointF2, pointF2);
        return pointF2.x;
    }

    /* renamed from: h */
    public final float m32444h() {
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
        if (this.f60373k) {
            FontBoxFont fontBoxFont = this.f60371i;
            if (fontBoxFont instanceof CFFType1Font) {
                if (((CFFType1Font) fontBoxFont).getType2CharString(codeToCID).getGID() == 0) {
                    return false;
                }
                return true;
            }
        }
        return this.f60371i.hasGlyph(m32443i(i));
    }

    /* renamed from: i */
    public final String m32443i(int i) {
        String unicode = this.parent.toUnicode(i);
        if (unicode == null) {
            return ".notdef";
        }
        return AbstractC20801kZ1.m29188a(unicode.codePointAt(0));
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDFontLike
    public boolean isDamaged() {
        return this.f60374l;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDFontLike
    public boolean isEmbedded() {
        return this.f60373k;
    }
}