package p000;

import android.graphics.Path;
import android.util.Log;
import com.tom_roush.pdfbox.pdmodel.font.PDSimpleFont;
import java.io.IOException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* renamed from: MW1 */
/* loaded from: classes5.dex */
public final class MW1 implements InterfaceC23147y60 {

    /* renamed from: a */
    public final Map f3908a = new HashMap();

    /* renamed from: b */
    public final PDSimpleFont f3909b;

    public MW1(PDSimpleFont pDSimpleFont) {
        this.f3909b = pDSimpleFont;
    }

    /* renamed from: b */
    public static String m67364b(int i) {
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

    @Override // p000.InterfaceC23147y60
    /* renamed from: a */
    public Path mo426a(int i) {
        Path path = (Path) this.f3908a.get(Integer.valueOf(i));
        if (path == null) {
            try {
                String name = this.f3909b.getEncoding().getName(i);
                if (!this.f3909b.hasGlyph(name)) {
                    Log.w("PdfBox-Android", "No glyph for code " + i + " (" + name + ") in font " + this.f3909b.getName());
                    if (i == 10 && this.f3909b.isStandard14()) {
                        Path path2 = new Path();
                        this.f3908a.put(Integer.valueOf(i), path2);
                        return path2;
                    }
                    String unicode = this.f3909b.getGlyphList().toUnicode(name);
                    if (unicode != null && unicode.length() == 1) {
                        String m67364b = m67364b(unicode.codePointAt(0));
                        if (this.f3909b.hasGlyph(m67364b)) {
                            name = m67364b;
                        }
                    }
                }
                Path path3 = this.f3909b.getPath(name);
                if (path3 == null) {
                    return this.f3909b.getPath(".notdef");
                }
                return path3;
            } catch (IOException unused) {
                return new Path();
            }
        }
        return path;
    }
}