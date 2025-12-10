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

/* renamed from: xQ1  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C22962xQ1 implements InterfaceC22045s60 {

    /* renamed from: a */
    public final PDFont f108362a;

    /* renamed from: b */
    public final TrueTypeFont f108363b;

    /* renamed from: c */
    public PDVectorFont f108364c;

    /* renamed from: d */
    public float f108365d;

    /* renamed from: e */
    public boolean f108366e;

    /* renamed from: f */
    public final Map f108367f;

    /* renamed from: g */
    public final boolean f108368g;

    public C22962xQ1(PDTrueTypeFont pDTrueTypeFont) {
        this(pDTrueTypeFont.getTrueTypeFont(), pDTrueTypeFont, false);
        this.f108364c = pDTrueTypeFont;
    }

    @Override // p000.InterfaceC22045s60
    /* renamed from: a */
    public Path mo512a(int i) {
        return m510c(m511b(i), i);
    }

    /* renamed from: b */
    public final int m511b(int i) {
        if (this.f108368g) {
            return ((PDType0Font) this.f108362a).codeToGID(i);
        }
        return ((PDTrueTypeFont) this.f108362a).codeToGID(i);
    }

    /* renamed from: c */
    public Path m510c(int i, int i2) {
        if (i == 0 && !this.f108368g && i2 == 10 && this.f108362a.isStandard14()) {
            Log.w("PdfBox-Android", "No glyph for code " + i2 + " in font " + this.f108362a.getName());
            return new Path();
        }
        Path path = (Path) this.f108367f.get(Integer.valueOf(i));
        if (path == null) {
            if (i == 0 || i >= this.f108363b.getMaximumProfile().getNumGlyphs()) {
                if (this.f108368g) {
                    Log.w("PdfBox-Android", "No glyph for code " + i2 + " (CID " + String.format("%04x", Integer.valueOf(((PDType0Font) this.f108362a).codeToCID(i2))) + ") in font " + this.f108362a.getName());
                } else {
                    Log.w("PdfBox-Android", "No glyph for " + i2 + " in font " + this.f108362a.getName());
                }
            }
            Path path2 = this.f108364c.getPath(i2);
            if (i == 0 && !this.f108362a.isEmbedded() && !this.f108362a.isStandard14()) {
                path = null;
            } else {
                path = path2;
            }
            if (path == null) {
                path = new Path();
            } else if (this.f108366e) {
                float f = this.f108365d;
                path.transform(AffineTransform.getScaleInstance(f, f).toMatrix());
            }
        }
        return new Path(path);
    }

    public C22962xQ1(PDType0Font pDType0Font) {
        this(((PDCIDFontType2) pDType0Font.getDescendantFont()).getTrueTypeFont(), pDType0Font, true);
        this.f108364c = pDType0Font;
    }

    public C22962xQ1(TrueTypeFont trueTypeFont, PDFont pDFont, boolean z) {
        this.f108365d = 1.0f;
        this.f108367f = new HashMap();
        this.f108362a = pDFont;
        this.f108363b = trueTypeFont;
        this.f108368g = z;
        HeaderTable header = trueTypeFont.getHeader();
        if (header == null || header.getUnitsPerEm() == 1000) {
            return;
        }
        this.f108365d = 1000.0f / header.getUnitsPerEm();
        this.f108366e = true;
    }
}
