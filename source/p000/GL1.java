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

/* renamed from: GL1 */
/* loaded from: classes5.dex */
public abstract class GL1 {

    /* renamed from: a */
    public static final Map f1909a = new HashMap(38);

    /* renamed from: b */
    public static final Map f1910b = new HashMap(14);

    static {
        m68242f("Courier-Bold");
        m68242f("Courier-BoldOblique");
        m68242f("Courier");
        m68242f("Courier-Oblique");
        m68242f("Helvetica");
        m68242f("Helvetica-Bold");
        m68242f("Helvetica-BoldOblique");
        m68242f("Helvetica-Oblique");
        m68242f("Symbol");
        m68242f("Times-Bold");
        m68242f("Times-BoldItalic");
        m68242f("Times-Italic");
        m68242f("Times-Roman");
        m68242f("ZapfDingbats");
        m68241g("CourierCourierNew", "Courier");
        m68241g("CourierNew", "Courier");
        m68241g("CourierNew,Italic", "Courier-Oblique");
        m68241g("CourierNew,Bold", "Courier-Bold");
        m68241g("CourierNew,BoldItalic", "Courier-BoldOblique");
        m68241g("Arial", "Helvetica");
        m68241g("Arial,Italic", "Helvetica-Oblique");
        m68241g("Arial,Bold", "Helvetica-Bold");
        m68241g("Arial,BoldItalic", "Helvetica-BoldOblique");
        m68241g("TimesNewRoman", "Times-Roman");
        m68241g("TimesNewRoman,Italic", "Times-Italic");
        m68241g("TimesNewRoman,Bold", "Times-Bold");
        m68241g("TimesNewRoman,BoldItalic", "Times-BoldItalic");
        m68241g("Symbol,Italic", "Symbol");
        m68241g("Symbol,Bold", "Symbol");
        m68241g("Symbol,BoldItalic", "Symbol");
        m68241g("Times", "Times-Roman");
        m68241g("Times,Italic", "Times-Italic");
        m68241g("Times,Bold", "Times-Bold");
        m68241g("Times,BoldItalic", "Times-BoldItalic");
        m68241g("ArialMT", "Helvetica");
        m68241g("Arial-ItalicMT", "Helvetica-Oblique");
        m68241g("Arial-BoldMT", "Helvetica-Bold");
        m68241g("Arial-BoldItalicMT", "Helvetica-BoldOblique");
    }

    /* renamed from: a */
    public static boolean m68247a(String str) {
        return f1909a.containsKey(str);
    }

    /* renamed from: b */
    public static FontMetrics m68246b(String str) {
        String str2 = (String) f1909a.get(str);
        if (str2 == null) {
            return null;
        }
        Map map = f1910b;
        if (map.get(str2) == null) {
            synchronized (map) {
                if (map.get(str2) == null) {
                    try {
                        m68243e(str2);
                    } catch (IOException e) {
                        throw new IllegalArgumentException(e);
                    }
                }
            }
        }
        return (FontMetrics) map.get(str2);
    }

    /* renamed from: c */
    public static String m68245c(String str) {
        return (String) f1909a.get(str);
    }

    /* renamed from: d */
    public static Set m68244d() {
        return Collections.unmodifiableSet(f1909a.keySet());
    }

    /* renamed from: e */
    public static void m68243e(String str) {
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
                f1910b.put(str, new AFMParser(bufferedInputStream).parse(true));
                return;
            } finally {
                bufferedInputStream.close();
            }
        }
        throw new IOException("resource '" + str2 + "' not found");
    }

    /* renamed from: f */
    public static void m68242f(String str) {
        f1909a.put(str, str);
    }

    /* renamed from: g */
    public static void m68241g(String str, String str2) {
        f1909a.put(str, str2);
    }
}
