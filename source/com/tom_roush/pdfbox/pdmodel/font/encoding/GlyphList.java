package com.tom_roush.pdfbox.pdmodel.font.encoding;

import android.util.Log;
import com.google.firebase.sessions.settings.RemoteSettings;
import com.tom_roush.pdfbox.android.PDFBoxResourceLoader;
import com.tom_roush.pdfbox.p019io.IOUtils;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.apache.commons.cli.HelpFormatter;

/* loaded from: classes5.dex */
public final class GlyphList {

    /* renamed from: d */
    public static final GlyphList f60446d = m32414a("glyphlist.txt", 4281);

    /* renamed from: e */
    public static final GlyphList f60447e = m32414a("zapfdingbats.txt", 201);

    /* renamed from: a */
    public final Map f60448a;

    /* renamed from: b */
    public final Map f60449b;

    /* renamed from: c */
    public final Map f60450c = new ConcurrentHashMap();

    static {
        try {
            if (System.getProperty("glyphlist_ext") != null) {
                throw new UnsupportedOperationException("glyphlist_ext is no longer supported, use GlyphList.DEFAULT.addGlyphs(Properties) instead");
            }
        } catch (SecurityException unused) {
        }
    }

    public GlyphList(InputStream inputStream, int i) throws IOException {
        this.f60448a = new HashMap(i);
        this.f60449b = new HashMap(i);
        m32413b(inputStream);
    }

    /* renamed from: a */
    public static GlyphList m32414a(String str, int i) {
        InputStream resourceAsStream;
        String str2 = "com/tom_roush/pdfbox/resources/glyphlist/" + str;
        try {
            try {
                if (PDFBoxResourceLoader.isReady()) {
                    resourceAsStream = PDFBoxResourceLoader.getStream(str2);
                } else {
                    resourceAsStream = GlyphList.class.getResourceAsStream(RemoteSettings.FORWARD_SLASH_STRING + str2);
                }
                if (resourceAsStream != null) {
                    GlyphList glyphList = new GlyphList(resourceAsStream, i);
                    IOUtils.closeQuietly(resourceAsStream);
                    return glyphList;
                }
                throw new IOException("GlyphList '" + str2 + "' not found");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } catch (Throwable th2) {
            IOUtils.closeQuietly(null);
            throw th2;
        }
    }

    public static GlyphList getAdobeGlyphList() {
        return f60446d;
    }

    public static GlyphList getZapfDingbats() {
        return f60447e;
    }

    /* renamed from: b */
    public final void m32413b(InputStream inputStream) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "ISO-8859-1"));
        while (bufferedReader.ready()) {
            try {
                String readLine = bufferedReader.readLine();
                if (readLine != null && !readLine.startsWith("#")) {
                    String[] split = readLine.split(";");
                    if (split.length >= 2) {
                        boolean z = false;
                        String str = split[0];
                        String[] split2 = split[1].split(HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR);
                        if (this.f60448a.containsKey(str)) {
                            Log.w("PdfBox-Android", "duplicate value for " + str + " -> " + split[1] + HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR + ((String) this.f60448a.get(str)));
                        }
                        int length = split2.length;
                        int[] iArr = new int[length];
                        int length2 = split2.length;
                        int i = 0;
                        int i2 = 0;
                        while (i < length2) {
                            iArr[i2] = Integer.parseInt(split2[i], 16);
                            i++;
                            i2++;
                        }
                        String str2 = new String(iArr, 0, length);
                        this.f60448a.put(str, str2);
                        z = (WinAnsiEncoding.INSTANCE.contains(str) || MacRomanEncoding.INSTANCE.contains(str) || MacExpertEncoding.INSTANCE.contains(str) || SymbolEncoding.INSTANCE.contains(str) || ZapfDingbatsEncoding.INSTANCE.contains(str)) ? true : true;
                        if (!this.f60449b.containsKey(str2) || z) {
                            this.f60449b.put(str2, str);
                        }
                    } else {
                        throw new IOException("Invalid glyph list entry: " + readLine);
                    }
                }
            } catch (Throwable th2) {
                bufferedReader.close();
                throw th2;
            }
        }
        bufferedReader.close();
    }

    public String codePointToName(int i) {
        String str = (String) this.f60449b.get(new String(new int[]{i}, 0, 1));
        if (str == null) {
            return ".notdef";
        }
        return str;
    }

    public String sequenceToName(String str) {
        String str2 = (String) this.f60449b.get(str);
        if (str2 == null) {
            return ".notdef";
        }
        return str2;
    }

    public String toUnicode(String str) {
        if (str == null) {
            return null;
        }
        String str2 = (String) this.f60448a.get(str);
        if (str2 != null) {
            return str2;
        }
        String str3 = (String) this.f60450c.get(str);
        if (str3 == null) {
            if (str.indexOf(46) > 0) {
                str3 = toUnicode(str.substring(0, str.indexOf(46)));
            } else if (str.startsWith("uni") && str.length() == 7) {
                int length = str.length();
                StringBuilder sb = new StringBuilder();
                int i = 3;
                while (true) {
                    int i2 = i + 4;
                    if (i2 > length) {
                        break;
                    }
                    try {
                        int parseInt = Integer.parseInt(str.substring(i, i2), 16);
                        if (parseInt > 55295 && parseInt < 57344) {
                            Log.w("PdfBox-Android", "Unicode character name with disallowed code area: " + str);
                        } else {
                            sb.append((char) parseInt);
                        }
                        i = i2;
                    } catch (NumberFormatException unused) {
                        Log.w("PdfBox-Android", "Not a number in Unicode character name: " + str);
                    }
                    Log.w("PdfBox-Android", "Not a number in Unicode character name: " + str);
                }
                str3 = sb.toString();
            } else if (str.startsWith("u") && str.length() == 5) {
                try {
                    int parseInt2 = Integer.parseInt(str.substring(1), 16);
                    if (parseInt2 > 55295 && parseInt2 < 57344) {
                        Log.w("PdfBox-Android", "Unicode character name with disallowed code area: " + str);
                    } else {
                        str3 = String.valueOf((char) parseInt2);
                    }
                } catch (NumberFormatException unused2) {
                    Log.w("PdfBox-Android", "Not a number in Unicode character name: " + str);
                }
            }
            if (str3 != null) {
                this.f60450c.put(str, str3);
            }
        }
        return str3;
    }

    public GlyphList(GlyphList glyphList, InputStream inputStream) throws IOException {
        this.f60448a = new HashMap(glyphList.f60448a);
        this.f60449b = new HashMap(glyphList.f60449b);
        m32413b(inputStream);
    }
}
