package p000;

import android.graphics.Path;
import android.util.Log;
import com.tom_roush.pdfbox.pdmodel.font.PDSimpleFont;
import java.io.IOException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* renamed from: PV1 */
/* loaded from: classes5.dex */
public final class PV1 implements InterfaceC22045s60 {

    /* renamed from: a */
    public final Map f4757a = new HashMap();

    /* renamed from: b */
    public final PDSimpleFont f4758b;

    public PV1(PDSimpleFont pDSimpleFont) {
        this.f4758b = pDSimpleFont;
    }

    /* renamed from: b */
    public static String m66794b(int i) {
        String upperCase = Integer.toString(i, 16).toUpperCase(Locale.US);
        int length = upperCase.length();
        if (length != 1) {
            if (length != 2) {
                if (length != 3) {
                    return "uni" + upperCase;
                }
                return "uni0" + upperCase;
            }
            return "uni00" + upperCase;
        }
        return "uni000" + upperCase;
    }

    @Override // p000.InterfaceC22045s60
    /* renamed from: a */
    public Path mo512a(int i) {
        Path path = (Path) this.f4757a.get(Integer.valueOf(i));
        if (path == null) {
            try {
                String name = this.f4758b.getEncoding().getName(i);
                if (!this.f4758b.hasGlyph(name)) {
                    Log.w("PdfBox-Android", "No glyph for code " + i + " (" + name + ") in font " + this.f4758b.getName());
                    if (i == 10 && this.f4758b.isStandard14()) {
                        Path path2 = new Path();
                        this.f4757a.put(Integer.valueOf(i), path2);
                        return path2;
                    }
                    String unicode = this.f4758b.getGlyphList().toUnicode(name);
                    if (unicode != null && unicode.length() == 1) {
                        String m66794b = m66794b(unicode.codePointAt(0));
                        if (this.f4758b.hasGlyph(m66794b)) {
                            name = m66794b;
                        }
                    }
                }
                Path path3 = this.f4758b.getPath(name);
                if (path3 == null) {
                    return this.f4758b.getPath(".notdef");
                }
                return path3;
            } catch (IOException unused) {
                return new Path();
            }
        }
        return path;
    }
}
