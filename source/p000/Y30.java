package p000;

import android.support.p001v4.media.session.PlaybackStateCompat;
import com.google.firebase.sessions.settings.RemoteSettings;
import com.google.mlkit.common.sdkinternal.OptionalModuleUtils;
import com.tom_roush.fontbox.FontBoxFont;
import com.tom_roush.fontbox.ttf.OpenTypeFont;
import com.tom_roush.fontbox.ttf.TTFParser;
import com.tom_roush.fontbox.ttf.TrueTypeFont;
import com.tom_roush.fontbox.type1.Type1Font;
import com.tom_roush.pdfbox.android.PDFBoxConfig;
import com.tom_roush.pdfbox.android.PDFBoxResourceLoader;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.StandardStructureTypes;
import com.tom_roush.pdfbox.pdmodel.font.CIDFontMapping;
import com.tom_roush.pdfbox.pdmodel.font.FontCache;
import com.tom_roush.pdfbox.pdmodel.font.FontFormat;
import com.tom_roush.pdfbox.pdmodel.font.FontInfo;
import com.tom_roush.pdfbox.pdmodel.font.FontMapper;
import com.tom_roush.pdfbox.pdmodel.font.FontMapping;
import com.tom_roush.pdfbox.pdmodel.font.FontProvider;
import com.tom_roush.pdfbox.pdmodel.font.PDCIDSystemInfo;
import com.tom_roush.pdfbox.pdmodel.font.PDFontDescriptor;
import com.tom_roush.pdfbox.pdmodel.font.PDPanoseClassification;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;
import org.apache.commons.cli.HelpFormatter;
import org.slf4j.Marker;

/* renamed from: Y30 */
/* loaded from: classes5.dex */
public final class Y30 implements FontMapper {

    /* renamed from: e */
    public static final FontCache f7641e = new FontCache();

    /* renamed from: a */
    public FontProvider f7642a;

    /* renamed from: b */
    public Map f7643b;

    /* renamed from: c */
    public final TrueTypeFont f7644c;

    /* renamed from: d */
    public final Map f7645d;

    /* renamed from: Y30$a */
    /* loaded from: classes5.dex */
    public static class C1722a {

        /* renamed from: a */
        public static final FontProvider f7646a = new C13930sX(Y30.f7641e);
    }

    /* renamed from: Y30$b */
    /* loaded from: classes5.dex */
    public static class C1723b implements Comparable {

        /* renamed from: a */
        public double f7647a;

        /* renamed from: b */
        public final FontInfo f7648b;

        public C1723b(FontInfo fontInfo) {
            this.f7648b = fontInfo;
        }

        @Override // java.lang.Comparable
        /* renamed from: a */
        public int compareTo(C1723b c1723b) {
            return Double.compare(c1723b.f7647a, this.f7647a);
        }
    }

    public Y30() {
        InputStream resourceAsStream;
        HashMap hashMap = new HashMap();
        this.f7645d = hashMap;
        hashMap.put("Courier", new ArrayList(Arrays.asList("CourierNew", "CourierNewPSMT", "LiberationMono", "NimbusMonL-Regu", "DroidSansMono")));
        hashMap.put("Courier-Bold", new ArrayList(Arrays.asList("CourierNewPS-BoldMT", "CourierNew-Bold", "LiberationMono-Bold", "NimbusMonL-Bold", "DroidSansMono")));
        hashMap.put("Courier-Oblique", new ArrayList(Arrays.asList("CourierNewPS-ItalicMT", "CourierNew-Italic", "LiberationMono-Italic", "NimbusMonL-ReguObli", "DroidSansMono")));
        hashMap.put("Courier-BoldOblique", new ArrayList(Arrays.asList("CourierNewPS-BoldItalicMT", "CourierNew-BoldItalic", "LiberationMono-BoldItalic", "NimbusMonL-BoldObli", "DroidSansMono")));
        hashMap.put("Helvetica", new ArrayList(Arrays.asList("ArialMT", "Arial", "LiberationSans", "NimbusSanL-Regu", "Roboto-Regular")));
        hashMap.put("Helvetica-Bold", new ArrayList(Arrays.asList("Arial-BoldMT", "Arial-Bold", "LiberationSans-Bold", "NimbusSanL-Bold", "Roboto-Bold")));
        hashMap.put("Helvetica-Oblique", new ArrayList(Arrays.asList("Arial-ItalicMT", "Arial-Italic", "Helvetica-Italic", "LiberationSans-Italic", "NimbusSanL-ReguItal", "Roboto-Italic")));
        hashMap.put("Helvetica-BoldOblique", new ArrayList(Arrays.asList("Arial-BoldItalicMT", "Helvetica-BoldItalic", "LiberationSans-BoldItalic", "NimbusSanL-BoldItal", "Roboto-BoldItalic")));
        hashMap.put("Times-Roman", new ArrayList(Arrays.asList("TimesNewRomanPSMT", "TimesNewRoman", "TimesNewRomanPS", "LiberationSerif", "NimbusRomNo9L-Regu", "Roboto-Regular")));
        hashMap.put("Times-Bold", new ArrayList(Arrays.asList("TimesNewRomanPS-BoldMT", "TimesNewRomanPS-Bold", "TimesNewRoman-Bold", "LiberationSerif-Bold", "NimbusRomNo9L-Medi", "DroidSerif-Bold", "Roboto-Bold")));
        hashMap.put("Times-Italic", new ArrayList(Arrays.asList("TimesNewRomanPS-ItalicMT", "TimesNewRomanPS-Italic", "TimesNewRoman-Italic", "LiberationSerif-Italic", "NimbusRomNo9L-ReguItal", "DroidSerif-Italic", "Roboto-Italic")));
        hashMap.put("Times-BoldItalic", new ArrayList(Arrays.asList("TimesNewRomanPS-BoldItalicMT", "TimesNewRomanPS-BoldItalic", "TimesNewRoman-BoldItalic", "LiberationSerif-BoldItalic", "NimbusRomNo9L-MediItal", "DroidSerif-BoldItalic", "Roboto-BoldItalic")));
        hashMap.put("Symbol", new ArrayList(Arrays.asList("Symbol", "SymbolMT", "StandardSymL")));
        hashMap.put("ZapfDingbats", new ArrayList(Arrays.asList("ZapfDingbatsITCbyBT-Regular", "ZapfDingbatsITC", "Dingbats", "MS-Gothic")));
        for (String str : GL1.m68244d()) {
            if (!this.f7645d.containsKey(str)) {
                this.f7645d.put(str, m65414b(GL1.m68245c(str)));
            }
        }
        try {
            if (PDFBoxResourceLoader.isReady()) {
                resourceAsStream = PDFBoxResourceLoader.getStream("com/tom_roush/pdfbox/resources/ttf/LiberationSans-Regular.ttf");
            } else {
                resourceAsStream = FontMapper.class.getResourceAsStream(RemoteSettings.FORWARD_SLASH_STRING + "com/tom_roush/pdfbox/resources/ttf/LiberationSans-Regular.ttf");
            }
            if (resourceAsStream != null) {
                this.f7644c = new TTFParser().parse(new BufferedInputStream(resourceAsStream));
                return;
            }
            throw new IOException("resource 'com/tom_roush/pdfbox/resources/ttf/LiberationSans-Regular.ttf' not found");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: b */
    public final List m65414b(String str) {
        return new ArrayList((Collection) this.f7645d.get(str));
    }

    /* renamed from: c */
    public final Map m65413c(List list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            FontInfo fontInfo = (FontInfo) it.next();
            for (String str : m65407i(fontInfo.getPostScriptName())) {
                linkedHashMap.put(str, fontInfo);
            }
        }
        return linkedHashMap;
    }

    /* renamed from: d */
    public final FontBoxFont m65412d(FontFormat fontFormat, String str) {
        if (str == null) {
            return null;
        }
        if (this.f7642a == null) {
            m65406j();
        }
        FontInfo m65409g = m65409g(fontFormat, str);
        if (m65409g != null) {
            return m65409g.getFont();
        }
        FontInfo m65409g2 = m65409g(fontFormat, str.replace(HelpFormatter.DEFAULT_OPT_PREFIX, ""));
        if (m65409g2 != null) {
            return m65409g2.getFont();
        }
        for (String str2 : m65405k(str)) {
            FontInfo m65409g3 = m65409g(fontFormat, str2);
            if (m65409g3 != null) {
                return m65409g3.getFont();
            }
        }
        FontInfo m65409g4 = m65409g(fontFormat, str.replace(",", HelpFormatter.DEFAULT_OPT_PREFIX));
        if (m65409g4 != null) {
            return m65409g4.getFont();
        }
        FontInfo m65409g5 = m65409g(fontFormat, str + "-Regular");
        if (m65409g5 == null) {
            return null;
        }
        return m65409g5.getFont();
    }

    /* renamed from: e */
    public final FontBoxFont m65411e(String str) {
        Type1Font type1Font = (Type1Font) m65412d(FontFormat.PFB, str);
        if (type1Font != null) {
            return type1Font;
        }
        TrueTypeFont trueTypeFont = (TrueTypeFont) m65412d(FontFormat.TTF, str);
        if (trueTypeFont != null) {
            return trueTypeFont;
        }
        OpenTypeFont openTypeFont = (OpenTypeFont) m65412d(FontFormat.OTF, str);
        if (openTypeFont != null) {
            return openTypeFont;
        }
        return null;
    }

    /* renamed from: f */
    public final String m65410f(PDFontDescriptor pDFontDescriptor) {
        if (pDFontDescriptor != null) {
            boolean z = false;
            if (pDFontDescriptor.getFontName() != null) {
                String lowerCase = pDFontDescriptor.getFontName().toLowerCase();
                if (lowerCase.contains("bold") || lowerCase.contains("black") || lowerCase.contains("heavy")) {
                    z = true;
                }
            }
            if (pDFontDescriptor.isFixedPitch()) {
                if (z && pDFontDescriptor.isItalic()) {
                    return "Courier-BoldOblique";
                } else if (z) {
                    return "Courier-Bold";
                } else if (!pDFontDescriptor.isItalic()) {
                    return "Courier";
                } else {
                    return "Courier-Oblique";
                }
            } else if (pDFontDescriptor.isSerif()) {
                if (z && pDFontDescriptor.isItalic()) {
                    return "Times-BoldItalic";
                } else if (z) {
                    return "Times-Bold";
                } else if (pDFontDescriptor.isItalic()) {
                    return "Times-Italic";
                } else {
                    return "Times-Roman";
                }
            } else if (z && pDFontDescriptor.isItalic()) {
                return "Helvetica-BoldOblique";
            } else if (z) {
                return "Helvetica-Bold";
            } else if (!pDFontDescriptor.isItalic()) {
                return "Helvetica";
            } else {
                return "Helvetica-Oblique";
            }
        }
        return "Times-Roman";
    }

    /* renamed from: g */
    public final FontInfo m65409g(FontFormat fontFormat, String str) {
        if (str.contains(Marker.ANY_NON_NULL_MARKER)) {
            str = str.substring(str.indexOf(43) + 1);
        }
        FontInfo fontInfo = (FontInfo) this.f7643b.get(str);
        if (fontInfo != null && fontInfo.getFormat() == fontFormat) {
            if (PDFBoxConfig.isDebugEnabled()) {
                String.format("getFont('%s','%s') returns %s", fontFormat, str, fontInfo);
            }
            return fontInfo;
        }
        return null;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.FontMapper
    public CIDFontMapping getCIDFont(String str, PDFontDescriptor pDFontDescriptor, PDCIDSystemInfo pDCIDSystemInfo) {
        C1723b c1723b;
        OpenTypeFont openTypeFont = (OpenTypeFont) m65412d(FontFormat.OTF, str);
        if (openTypeFont != null) {
            return new CIDFontMapping(openTypeFont, null, false);
        }
        TrueTypeFont trueTypeFont = (TrueTypeFont) m65412d(FontFormat.TTF, str);
        if (trueTypeFont != null) {
            return new CIDFontMapping(null, trueTypeFont, false);
        }
        if (pDCIDSystemInfo != null) {
            String str2 = pDCIDSystemInfo.getRegistry() + HelpFormatter.DEFAULT_OPT_PREFIX + pDCIDSystemInfo.getOrdering();
            if ((str2.equals("Adobe-GB1") || str2.equals("Adobe-CNS1") || str2.equals("Adobe-Japan1") || str2.equals("Adobe-Korea1")) && (c1723b = (C1723b) m65408h(pDFontDescriptor, pDCIDSystemInfo).poll()) != null) {
                if (PDFBoxConfig.isDebugEnabled()) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Best match for '");
                    sb.append(str);
                    sb.append("': ");
                    sb.append(c1723b.f7648b);
                }
                FontBoxFont font = c1723b.f7648b.getFont();
                if (font instanceof OpenTypeFont) {
                    return new CIDFontMapping((OpenTypeFont) font, null, true);
                }
                if (font != null) {
                    return new CIDFontMapping(null, font, true);
                }
            }
        }
        return new CIDFontMapping(null, this.f7644c, true);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.FontMapper
    public FontMapping getFontBoxFont(String str, PDFontDescriptor pDFontDescriptor) {
        FontBoxFont m65411e = m65411e(str);
        if (m65411e != null) {
            return new FontMapping(m65411e, false);
        }
        FontBoxFont m65411e2 = m65411e(m65410f(pDFontDescriptor));
        if (m65411e2 == null) {
            m65411e2 = this.f7644c;
        }
        return new FontMapping(m65411e2, true);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.FontMapper
    public FontMapping getTrueTypeFont(String str, PDFontDescriptor pDFontDescriptor) {
        FontFormat fontFormat = FontFormat.TTF;
        TrueTypeFont trueTypeFont = (TrueTypeFont) m65412d(fontFormat, str);
        if (trueTypeFont != null) {
            return new FontMapping(trueTypeFont, false);
        }
        TrueTypeFont trueTypeFont2 = (TrueTypeFont) m65412d(fontFormat, m65410f(pDFontDescriptor));
        if (trueTypeFont2 == null) {
            trueTypeFont2 = this.f7644c;
        }
        return new FontMapping(trueTypeFont2, true);
    }

    /* renamed from: h */
    public final PriorityQueue m65408h(PDFontDescriptor pDFontDescriptor, PDCIDSystemInfo pDCIDSystemInfo) {
        PriorityQueue priorityQueue = new PriorityQueue(20);
        for (FontInfo fontInfo : this.f7643b.values()) {
            if (pDCIDSystemInfo == null || m65404l(pDCIDSystemInfo, fontInfo)) {
                C1723b c1723b = new C1723b(fontInfo);
                if (pDFontDescriptor.getPanose() != null && fontInfo.getPanose() != null) {
                    PDPanoseClassification panose = pDFontDescriptor.getPanose().getPanose();
                    if (panose.getFamilyKind() == fontInfo.getPanose().getFamilyKind()) {
                        if (panose.getFamilyKind() != 0 || ((!fontInfo.getPostScriptName().toLowerCase().contains(OptionalModuleUtils.BARCODE) && !fontInfo.getPostScriptName().startsWith(StandardStructureTypes.CODE)) || m65403m(pDFontDescriptor))) {
                            if (panose.getSerifStyle() == fontInfo.getPanose().getSerifStyle()) {
                                c1723b.f7647a += 2.0d;
                            } else if (panose.getSerifStyle() >= 2 && panose.getSerifStyle() <= 5 && fontInfo.getPanose().getSerifStyle() >= 2 && fontInfo.getPanose().getSerifStyle() <= 5) {
                                c1723b.f7647a += 1.0d;
                            } else if (panose.getSerifStyle() >= 11 && panose.getSerifStyle() <= 13 && fontInfo.getPanose().getSerifStyle() >= 11 && fontInfo.getPanose().getSerifStyle() <= 13) {
                                c1723b.f7647a += 1.0d;
                            } else if (panose.getSerifStyle() != 0 && fontInfo.getPanose().getSerifStyle() != 0) {
                                c1723b.f7647a -= 1.0d;
                            }
                            int weight = fontInfo.getPanose().getWeight();
                            int m32461b = fontInfo.m32461b();
                            if (Math.abs(weight - m32461b) > 2) {
                                weight = m32461b;
                            }
                            if (panose.getWeight() == weight) {
                                c1723b.f7647a += 2.0d;
                            } else if (panose.getWeight() > 1 && weight > 1) {
                                c1723b.f7647a += 1.0d - (Math.abs(panose.getWeight() - weight) * 0.5d);
                            }
                        }
                    }
                } else if (pDFontDescriptor.getFontWeight() > 0.0f && fontInfo.getWeightClass() > 0) {
                    c1723b.f7647a += 1.0d - ((Math.abs(pDFontDescriptor.getFontWeight() - fontInfo.getWeightClass()) / 100.0f) * 0.5d);
                }
                priorityQueue.add(c1723b);
            }
        }
        return priorityQueue;
    }

    /* renamed from: i */
    public final Set m65407i(String str) {
        HashSet hashSet = new HashSet(2);
        hashSet.add(str);
        hashSet.add(str.replace(HelpFormatter.DEFAULT_OPT_PREFIX, ""));
        return hashSet;
    }

    /* renamed from: j */
    public synchronized FontProvider m65406j() {
        try {
            if (this.f7642a == null) {
                m65402n(C1722a.f7646a);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f7642a;
    }

    /* renamed from: k */
    public final List m65405k(String str) {
        List list = (List) this.f7645d.get(str.replace(HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR, ""));
        if (list != null) {
            return list;
        }
        return Collections.emptyList();
    }

    /* renamed from: l */
    public final boolean m65404l(PDCIDSystemInfo pDCIDSystemInfo, FontInfo fontInfo) {
        if (fontInfo.getCIDSystemInfo() != null) {
            if (!fontInfo.getCIDSystemInfo().getRegistry().equals(pDCIDSystemInfo.getRegistry()) || !fontInfo.getCIDSystemInfo().getOrdering().equals(pDCIDSystemInfo.getOrdering())) {
                return false;
            }
            return true;
        }
        long m32462a = fontInfo.m32462a();
        if ("MalgunGothic-Semilight".equals(fontInfo.getPostScriptName())) {
            m32462a &= -1441793;
        }
        if (pDCIDSystemInfo.getOrdering().equals("GB1") && (m32462a & PlaybackStateCompat.ACTION_SET_REPEAT_MODE) == PlaybackStateCompat.ACTION_SET_REPEAT_MODE) {
            return true;
        }
        if (pDCIDSystemInfo.getOrdering().equals("CNS1") && (m32462a & 1048576) == 1048576) {
            return true;
        }
        if (pDCIDSystemInfo.getOrdering().equals("Japan1") && (m32462a & PlaybackStateCompat.ACTION_PREPARE_FROM_URI) == PlaybackStateCompat.ACTION_PREPARE_FROM_URI) {
            return true;
        }
        if (!pDCIDSystemInfo.getOrdering().equals("Korea1")) {
            return false;
        }
        if ((m32462a & PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE_ENABLED) != PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE_ENABLED && (m32462a & PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE) != PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE) {
            return false;
        }
        return true;
    }

    /* renamed from: m */
    public final boolean m65403m(PDFontDescriptor pDFontDescriptor) {
        String fontFamily = pDFontDescriptor.getFontFamily();
        String str = "";
        if (fontFamily == null) {
            fontFamily = "";
        }
        String fontName = pDFontDescriptor.getFontName();
        if (fontName != null) {
            str = fontName;
        }
        if (!fontFamily.startsWith(StandardStructureTypes.CODE) && !fontFamily.toLowerCase().contains(OptionalModuleUtils.BARCODE) && !str.startsWith(StandardStructureTypes.CODE) && !str.toLowerCase().contains(OptionalModuleUtils.BARCODE)) {
            return false;
        }
        return true;
    }

    /* renamed from: n */
    public synchronized void m65402n(FontProvider fontProvider) {
        this.f7643b = m65413c(fontProvider.getFontInfo());
        this.f7642a = fontProvider;
    }
}
