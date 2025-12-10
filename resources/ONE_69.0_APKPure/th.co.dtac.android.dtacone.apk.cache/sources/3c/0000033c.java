package p000;

import com.google.firebase.sessions.settings.RemoteSettings;
import com.tom_roush.fontbox.afm.AFMParser;
import com.tom_roush.fontbox.afm.FontMetrics;
import com.tom_roush.pdfbox.android.PDFBoxResourceLoader;
import com.tom_roush.pdfbox.pdmodel.font.PDType1Font;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: DM1 */
/* loaded from: classes5.dex */
public abstract class DM1 {

    /* renamed from: a */
    public static final Map f1000a = new HashMap(38);

    /* renamed from: b */
    public static final Map f1001b = new HashMap(14);

    static {
        m68828f("Courier-Bold");
        m68828f("Courier-BoldOblique");
        m68828f("Courier");
        m68828f("Courier-Oblique");
        m68828f("Helvetica");
        m68828f("Helvetica-Bold");
        m68828f("Helvetica-BoldOblique");
        m68828f("Helvetica-Oblique");
        m68828f("Symbol");
        m68828f("Times-Bold");
        m68828f("Times-BoldItalic");
        m68828f("Times-Italic");
        m68828f("Times-Roman");
        m68828f("ZapfDingbats");
        m68827g("CourierCourierNew", "Courier");
        m68827g("CourierNew", "Courier");
        m68827g("CourierNew,Italic", "Courier-Oblique");
        m68827g("CourierNew,Bold", "Courier-Bold");
        m68827g("CourierNew,BoldItalic", "Courier-BoldOblique");
        m68827g("Arial", "Helvetica");
        m68827g("Arial,Italic", "Helvetica-Oblique");
        m68827g("Arial,Bold", "Helvetica-Bold");
        m68827g("Arial,BoldItalic", "Helvetica-BoldOblique");
        m68827g("TimesNewRoman", "Times-Roman");
        m68827g("TimesNewRoman,Italic", "Times-Italic");
        m68827g("TimesNewRoman,Bold", "Times-Bold");
        m68827g("TimesNewRoman,BoldItalic", "Times-BoldItalic");
        m68827g("Symbol,Italic", "Symbol");
        m68827g("Symbol,Bold", "Symbol");
        m68827g("Symbol,BoldItalic", "Symbol");
        m68827g("Times", "Times-Roman");
        m68827g("Times,Italic", "Times-Italic");
        m68827g("Times,Bold", "Times-Bold");
        m68827g("Times,BoldItalic", "Times-BoldItalic");
        m68827g("ArialMT", "Helvetica");
        m68827g("Arial-ItalicMT", "Helvetica-Oblique");
        m68827g("Arial-BoldMT", "Helvetica-Bold");
        m68827g("Arial-BoldItalicMT", "Helvetica-BoldOblique");
    }

    /* renamed from: a */
    public static boolean m68833a(String str) {
        return f1000a.containsKey(str);
    }

    /* renamed from: b */
    public static FontMetrics m68832b(String str) {
        String str2 = (String) f1000a.get(str);
        if (str2 == null) {
            return null;
        }
        Map map = f1001b;
        if (map.get(str2) == null) {
            synchronized (map) {
                if (map.get(str2) == null) {
                    try {
                        m68829e(str2);
                    } catch (IOException e) {
                        throw new IllegalArgumentException(e);
                    }
                }
            }
        }
        return (FontMetrics) map.get(str2);
    }

    /* renamed from: c */
    public static String m68831c(String str) {
        return (String) f1000a.get(str);
    }

    /* renamed from: d */
    public static Set m68830d() {
        return Collections.unmodifiableSet(f1000a.keySet());
    }

    /* renamed from: e */
    public static void m68829e(String str) {
        InputStream resourceAsStream;
        String str2 = "com/tom_roush/pdfbox/resources/afm/" + str + ".afm";
        if (PDFBoxResourceLoader.isReady()) {
            resourceAsStream = PDFBoxResourceLoader.getStream(str2);
        } else {
            resourceAsStream = PDType1Font.class.getResourceAsStream(RemoteSettings.FORWARD_SLASH_STRING + str2);
        }
        if (resourceAsStream != null) {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(resourceAsStream);
            try {
                f1001b.put(str, new AFMParser(bufferedInputStream).parse(true));
                return;
            } finally {
                bufferedInputStream.close();
            }
        }
        throw new IOException("resource '" + str2 + "' not found");
    }

    /* renamed from: f */
    public static void m68828f(String str) {
        f1000a.put(str, str);
    }

    /* renamed from: g */
    public static void m68827g(String str, String str2) {
        f1000a.put(str, str2);
    }
}