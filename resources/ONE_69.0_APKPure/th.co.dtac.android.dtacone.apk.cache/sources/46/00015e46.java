package p000;

import android.graphics.Path;
import android.util.Log;
import com.tom_roush.fontbox.ttf.HeaderTable;
import com.tom_roush.fontbox.ttf.TrueTypeFont;
import com.tom_roush.harmony.awt.geom.AffineTransform;
import com.tom_roush.pdfbox.pdmodel.font.PDCIDFontType2;
import com.tom_roush.pdfbox.pdmodel.font.PDFont;
import com.tom_roush.pdfbox.pdmodel.font.PDTrueTypeFont;
import com.tom_roush.pdfbox.pdmodel.font.PDType0Font;
import com.tom_roush.pdfbox.pdmodel.font.PDVectorFont;
import java.util.HashMap;
import java.util.Map;

/* renamed from: uR1  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C22515uR1 implements InterfaceC23147y60 {

    /* renamed from: a */
    public final PDFont f107747a;

    /* renamed from: b */
    public final TrueTypeFont f107748b;

    /* renamed from: c */
    public PDVectorFont f107749c;

    /* renamed from: d */
    public float f107750d;

    /* renamed from: e */
    public boolean f107751e;

    /* renamed from: f */
    public final Map f107752f;

    /* renamed from: g */
    public final boolean f107753g;

    public C22515uR1(PDTrueTypeFont pDTrueTypeFont) {
        this(pDTrueTypeFont.getTrueTypeFont(), pDTrueTypeFont, false);
        this.f107749c = pDTrueTypeFont;
    }

    @Override // p000.InterfaceC23147y60
    /* renamed from: a */
    public Path mo426a(int i) {
        return m1172c(m1173b(i), i);
    }

    /* renamed from: b */
    public final int m1173b(int i) {
        if (this.f107753g) {
            return ((PDType0Font) this.f107747a).codeToGID(i);
        }
        return ((PDTrueTypeFont) this.f107747a).codeToGID(i);
    }

    /* renamed from: c */
    public Path m1172c(int i, int i2) {
        if (i == 0 && !this.f107753g && i2 == 10 && this.f107747a.isStandard14()) {
            Log.w("PdfBox-Android", "No glyph for code " + i2 + " in font " + this.f107747a.getName());
            return new Path();
        }
        Path path = (Path) this.f107752f.get(Integer.valueOf(i));
        if (path == null) {
            if (i == 0 || i >= this.f107748b.getMaximumProfile().getNumGlyphs()) {
                if (this.f107753g) {
                    Log.w("PdfBox-Android", "No glyph for code " + i2 + " (CID " + String.format("%04x", Integer.valueOf(((PDType0Font) this.f107747a).codeToCID(i2))) + ") in font " + this.f107747a.getName());
                } else {
                    Log.w("PdfBox-Android", "No glyph for " + i2 + " in font " + this.f107747a.getName());
                }
            }
            Path path2 = this.f107749c.getPath(i2);
            if (i == 0 && !this.f107747a.isEmbedded() && !this.f107747a.isStandard14()) {
                path = null;
            } else {
                path = path2;
            }
            if (path == null) {
                path = new Path();
            } else if (this.f107751e) {
                float f = this.f107750d;
                path.transform(AffineTransform.getScaleInstance(f, f).toMatrix());
            }
        }
        return new Path(path);
    }

    public C22515uR1(PDType0Font pDType0Font) {
        this(((PDCIDFontType2) pDType0Font.getDescendantFont()).getTrueTypeFont(), pDType0Font, true);
        this.f107749c = pDType0Font;
    }

    public C22515uR1(TrueTypeFont trueTypeFont, PDFont pDFont, boolean z) {
        this.f107750d = 1.0f;
        this.f107752f = new HashMap();
        this.f107747a = pDFont;
        this.f107748b = trueTypeFont;
        this.f107753g = z;
        HeaderTable header = trueTypeFont.getHeader();
        if (header == null || header.getUnitsPerEm() == 1000) {
            return;
        }
        this.f107750d = 1000.0f / header.getUnitsPerEm();
        this.f107751e = true;
    }
}