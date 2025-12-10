package p000;

import android.graphics.Path;
import android.util.Log;
import com.tom_roush.pdfbox.pdmodel.font.PDCIDFontType0;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* renamed from: fg */
/* loaded from: classes5.dex */
public final class C10242fg implements InterfaceC22045s60 {

    /* renamed from: a */
    public final Map f61881a = new HashMap();

    /* renamed from: b */
    public final PDCIDFontType0 f61882b;

    /* renamed from: c */
    public final String f61883c;

    public C10242fg(PDCIDFontType0 pDCIDFontType0) {
        this.f61882b = pDCIDFontType0;
        this.f61883c = pDCIDFontType0.getBaseFont();
    }

    @Override // p000.InterfaceC22045s60
    /* renamed from: a */
    public Path mo512a(int i) {
        Path path = (Path) this.f61881a.get(Integer.valueOf(i));
        if (path == null) {
            try {
                if (!this.f61882b.hasGlyph(i)) {
                    String format = String.format("%04x", Integer.valueOf(this.f61882b.getParent().codeToCID(i)));
                    Log.w("PdfBox-Android", "No glyph for " + i + " (CID " + format + ") in font " + this.f61883c);
                }
                Path path2 = this.f61882b.getPath(i);
                this.f61881a.put(Integer.valueOf(i), path2);
                return path2;
            } catch (IOException unused) {
                return new Path();
            }
        }
        return path;
    }
}
