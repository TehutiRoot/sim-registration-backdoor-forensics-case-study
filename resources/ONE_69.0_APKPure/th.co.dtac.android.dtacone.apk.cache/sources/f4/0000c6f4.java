package p000;

import android.graphics.Path;
import android.util.Log;
import com.tom_roush.pdfbox.pdmodel.font.PDCIDFontType0;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* renamed from: fg */
/* loaded from: classes5.dex */
public final class C10239fg implements InterfaceC23147y60 {

    /* renamed from: a */
    public final Map f61923a = new HashMap();

    /* renamed from: b */
    public final PDCIDFontType0 f61924b;

    /* renamed from: c */
    public final String f61925c;

    public C10239fg(PDCIDFontType0 pDCIDFontType0) {
        this.f61924b = pDCIDFontType0;
        this.f61925c = pDCIDFontType0.getBaseFont();
    }

    @Override // p000.InterfaceC23147y60
    /* renamed from: a */
    public Path mo426a(int i) {
        Path path = (Path) this.f61923a.get(Integer.valueOf(i));
        if (path == null) {
            try {
                if (!this.f61924b.hasGlyph(i)) {
                    String format = String.format("%04x", Integer.valueOf(this.f61924b.getParent().codeToCID(i)));
                    Log.w("PdfBox-Android", "No glyph for " + i + " (CID " + format + ") in font " + this.f61925c);
                }
                Path path2 = this.f61924b.getPath(i);
                this.f61923a.put(Integer.valueOf(i), path2);
                return path2;
            } catch (IOException unused) {
                return new Path();
            }
        }
        return path;
    }
}