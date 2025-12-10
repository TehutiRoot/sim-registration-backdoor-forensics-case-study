package p000;

import android.util.Log;
import com.tom_roush.fontbox.FontBoxFont;
import com.tom_roush.fontbox.cff.CFFCIDFont;
import com.tom_roush.fontbox.cff.CFFFont;
import com.tom_roush.fontbox.ttf.NamingTable;
import com.tom_roush.fontbox.ttf.OS2WindowsMetricsTable;
import com.tom_roush.fontbox.ttf.OTFParser;
import com.tom_roush.fontbox.ttf.OpenTypeFont;
import com.tom_roush.fontbox.ttf.TTFParser;
import com.tom_roush.fontbox.ttf.TrueTypeCollection;
import com.tom_roush.fontbox.ttf.TrueTypeFont;
import com.tom_roush.fontbox.type1.Type1Font;
import com.tom_roush.fontbox.util.autodetect.FontFileFinder;
import com.tom_roush.pdfbox.android.PDFBoxConfig;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.p019io.IOUtils;
import com.tom_roush.pdfbox.pdmodel.font.CIDSystemInfo;
import com.tom_roush.pdfbox.pdmodel.font.FontCache;
import com.tom_roush.pdfbox.pdmodel.font.FontFormat;
import com.tom_roush.pdfbox.pdmodel.font.FontInfo;
import com.tom_roush.pdfbox.pdmodel.font.FontProvider;
import com.tom_roush.pdfbox.pdmodel.font.PDPanoseClassification;
import com.tom_roush.pdfbox.util.Charsets;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.nio.charset.Charset;
import java.security.AccessControlException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.commons.cli.HelpFormatter;

/* renamed from: sX */
/* loaded from: classes5.dex */
public final class C13930sX extends FontProvider {

    /* renamed from: a */
    public final List f79806a = new ArrayList();

    /* renamed from: b */
    public final FontCache f79807b;

    /* renamed from: sX$a */
    /* loaded from: classes5.dex */
    public class C13931a implements TrueTypeCollection.TrueTypeFontProcessor {

        /* renamed from: a */
        public final /* synthetic */ File f79808a;

        public C13931a(File file) {
            this.f79808a = file;
        }

        @Override // com.tom_roush.fontbox.ttf.TrueTypeCollection.TrueTypeFontProcessor
        public void process(TrueTypeFont trueTypeFont) {
            C13930sX.this.m22593e(trueTypeFont, this.f79808a);
        }
    }

    /* renamed from: sX$b */
    /* loaded from: classes5.dex */
    public static /* synthetic */ class C13932b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f79810a;

        static {
            int[] iArr = new int[FontFormat.values().length];
            f79810a = iArr;
            try {
                iArr[FontFormat.PFB.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f79810a[FontFormat.TTF.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f79810a[FontFormat.OTF.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* renamed from: sX$c */
    /* loaded from: classes5.dex */
    public static class C13933c extends FontInfo {

        /* renamed from: a */
        public final String f79811a;

        /* renamed from: b */
        public final FontFormat f79812b;

        /* renamed from: c */
        public final CIDSystemInfo f79813c;

        /* renamed from: d */
        public final int f79814d;

        /* renamed from: e */
        public final int f79815e;

        /* renamed from: f */
        public final int f79816f;

        /* renamed from: g */
        public final int f79817g;

        /* renamed from: h */
        public final int f79818h;

        /* renamed from: i */
        public final PDPanoseClassification f79819i;

        /* renamed from: j */
        public final File f79820j;

        /* renamed from: k */
        public final C13930sX f79821k;

        public /* synthetic */ C13933c(File file, FontFormat fontFormat, String str, CIDSystemInfo cIDSystemInfo, int i, int i2, int i3, int i4, int i5, byte[] bArr, C13930sX c13930sX, C13931a c13931a) {
            this(file, fontFormat, str, cIDSystemInfo, i, i2, i3, i4, i5, bArr, c13930sX);
        }

        @Override // com.tom_roush.pdfbox.pdmodel.font.FontInfo
        public CIDSystemInfo getCIDSystemInfo() {
            return this.f79813c;
        }

        @Override // com.tom_roush.pdfbox.pdmodel.font.FontInfo
        public int getCodePageRange1() {
            return this.f79816f;
        }

        @Override // com.tom_roush.pdfbox.pdmodel.font.FontInfo
        public int getCodePageRange2() {
            return this.f79817g;
        }

        @Override // com.tom_roush.pdfbox.pdmodel.font.FontInfo
        public int getFamilyClass() {
            return this.f79815e;
        }

        @Override // com.tom_roush.pdfbox.pdmodel.font.FontInfo
        public synchronized FontBoxFont getFont() {
            FontBoxFont m22575o;
            try {
                FontBoxFont font = this.f79821k.f79807b.getFont(this);
                if (font != null) {
                    return font;
                }
                int i = C13932b.f79810a[this.f79812b.ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        if (i == 3) {
                            m22575o = m22577m(this.f79811a, this.f79820j);
                        } else {
                            throw new RuntimeException("can't happen");
                        }
                    } else {
                        m22575o = m22576n(this.f79811a, this.f79820j);
                    }
                } else {
                    m22575o = m22575o(this.f79811a, this.f79820j);
                }
                if (m22575o != null) {
                    this.f79821k.f79807b.addFont(this, m22575o);
                }
                return m22575o;
            } catch (Throwable th2) {
                throw th2;
            }
        }

        @Override // com.tom_roush.pdfbox.pdmodel.font.FontInfo
        public FontFormat getFormat() {
            return this.f79812b;
        }

        @Override // com.tom_roush.pdfbox.pdmodel.font.FontInfo
        public int getMacStyle() {
            return this.f79818h;
        }

        @Override // com.tom_roush.pdfbox.pdmodel.font.FontInfo
        public PDPanoseClassification getPanose() {
            return this.f79819i;
        }

        @Override // com.tom_roush.pdfbox.pdmodel.font.FontInfo
        public String getPostScriptName() {
            return this.f79811a;
        }

        @Override // com.tom_roush.pdfbox.pdmodel.font.FontInfo
        public int getWeightClass() {
            return this.f79814d;
        }

        /* renamed from: m */
        public final OpenTypeFont m22577m(String str, File file) {
            try {
                if (file.getName().toLowerCase().endsWith(".ttc")) {
                    TrueTypeCollection trueTypeCollection = new TrueTypeCollection(file);
                    try {
                        TrueTypeFont fontByName = trueTypeCollection.getFontByName(str);
                        if (fontByName != null) {
                            return (OpenTypeFont) fontByName;
                        }
                        trueTypeCollection.close();
                        throw new IOException("Font " + str + " not found in " + file);
                    } catch (IOException e) {
                        e.getMessage();
                        trueTypeCollection.close();
                        return null;
                    }
                }
                OpenTypeFont parse = new OTFParser(false, true).parse(file);
                if (PDFBoxConfig.isDebugEnabled()) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Loaded ");
                    sb.append(str);
                    sb.append(" from ");
                    sb.append(file);
                }
                return parse;
            } catch (IOException e2) {
                Log.w("PdfBox-Android", "Could not load font file: " + file, e2);
                return null;
            }
        }

        /* renamed from: n */
        public final TrueTypeFont m22576n(String str, File file) {
            try {
                TrueTypeFont m22574p = m22574p(str, file);
                if (PDFBoxConfig.isDebugEnabled()) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Loaded ");
                    sb.append(str);
                    sb.append(" from ");
                    sb.append(file);
                }
                return m22574p;
            } catch (IOException e) {
                Log.w("PdfBox-Android", "Could not load font file: " + file, e);
                return null;
            }
        }

        /* renamed from: o */
        public final Type1Font m22575o(String str, File file) {
            FileInputStream fileInputStream;
            FileInputStream fileInputStream2 = null;
            try {
                fileInputStream = new FileInputStream(file);
            } catch (IOException e) {
                e = e;
                fileInputStream = null;
            } catch (Throwable th2) {
                th = th2;
                IOUtils.closeQuietly(fileInputStream2);
                throw th;
            }
            try {
                try {
                    Type1Font createWithPFB = Type1Font.createWithPFB(fileInputStream);
                    if (PDFBoxConfig.isDebugEnabled()) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Loaded ");
                        sb.append(str);
                        sb.append(" from ");
                        sb.append(file);
                    }
                    IOUtils.closeQuietly(fileInputStream);
                    return createWithPFB;
                } catch (Throwable th3) {
                    th = th3;
                    fileInputStream2 = fileInputStream;
                    IOUtils.closeQuietly(fileInputStream2);
                    throw th;
                }
            } catch (IOException e2) {
                e = e2;
                Log.w("PdfBox-Android", "Could not load font file: " + file, e);
                IOUtils.closeQuietly(fileInputStream);
                return null;
            }
        }

        /* renamed from: p */
        public final TrueTypeFont m22574p(String str, File file) {
            if (file.getName().toLowerCase().endsWith(".ttc")) {
                TrueTypeCollection trueTypeCollection = new TrueTypeCollection(file);
                try {
                    TrueTypeFont fontByName = trueTypeCollection.getFontByName(str);
                    if (fontByName != null) {
                        return fontByName;
                    }
                    trueTypeCollection.close();
                    throw new IOException("Font " + str + " not found in " + file);
                } catch (IOException e) {
                    trueTypeCollection.close();
                    throw e;
                }
            }
            return new TTFParser(false, true).parse(file);
        }

        @Override // com.tom_roush.pdfbox.pdmodel.font.FontInfo
        public String toString() {
            return super.toString() + HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR + this.f79820j;
        }

        public C13933c(File file, FontFormat fontFormat, String str, CIDSystemInfo cIDSystemInfo, int i, int i2, int i3, int i4, int i5, byte[] bArr, C13930sX c13930sX) {
            this.f79820j = file;
            this.f79812b = fontFormat;
            this.f79811a = str;
            this.f79813c = cIDSystemInfo;
            this.f79814d = i;
            this.f79815e = i2;
            this.f79816f = i3;
            this.f79817g = i4;
            this.f79818h = i5;
            this.f79819i = (bArr == null || bArr.length < 10) ? null : new PDPanoseClassification(bArr);
            this.f79821k = c13930sX;
        }
    }

    /* renamed from: sX$d */
    /* loaded from: classes5.dex */
    public static final class C13934d extends C13933c {
        public /* synthetic */ C13934d(File file, FontFormat fontFormat, String str, C13931a c13931a) {
            this(file, fontFormat, str);
        }

        public C13934d(File file, FontFormat fontFormat, String str) {
            super(file, fontFormat, str, null, 0, 0, 0, 0, 0, null, null, null);
        }
    }

    public C13930sX(FontCache fontCache) {
        this.f79807b = fontCache;
        if (PDFBoxConfig.getFontLoadLevel() == PDFBoxConfig.FontLoadLevel.NONE) {
            return;
        }
        if (PDFBoxConfig.getFontLoadLevel() == PDFBoxConfig.FontLoadLevel.MINIMUM) {
            try {
                m22594d(new File("/system/fonts/DroidSans.ttf"));
                m22594d(new File("/system/fonts/DroidSans-Bold.ttf"));
                m22594d(new File("/system/fonts/DroidSansMono.ttf"));
                return;
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try {
            PDFBoxConfig.isDebugEnabled();
            List<URI> find = new FontFileFinder().find();
            ArrayList arrayList = new ArrayList(find.size());
            for (URI uri : find) {
                arrayList.add(new File(uri));
            }
            if (PDFBoxConfig.isDebugEnabled()) {
                StringBuilder sb = new StringBuilder();
                sb.append("Found ");
                sb.append(arrayList.size());
                sb.append(" fonts on the local system");
            }
            List m22590h = m22590h(arrayList);
            if (m22590h != null && !m22590h.isEmpty()) {
                this.f79806a.addAll(m22590h);
                return;
            }
            Log.w("PdfBox-Android", "Building on-disk font cache, this may take a while");
            m22588j(arrayList);
            m22589i();
            Log.w("PdfBox-Android", "Finished building on-disk font cache, found " + this.f79806a.size() + " fonts");
        } catch (AccessControlException unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0039  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m22595c(java.io.File r7) {
        /*
            r6 = this;
            r0 = 0
            com.tom_roush.fontbox.ttf.TrueTypeCollection r1 = new com.tom_roush.fontbox.ttf.TrueTypeCollection     // Catch: java.lang.Throwable -> L17 java.io.IOException -> L19
            r1.<init>(r7)     // Catch: java.lang.Throwable -> L17 java.io.IOException -> L19
            sX$a r0 = new sX$a     // Catch: java.lang.Throwable -> L12 java.io.IOException -> L15
            r0.<init>(r7)     // Catch: java.lang.Throwable -> L12 java.io.IOException -> L15
            r1.processAllFonts(r0)     // Catch: java.lang.Throwable -> L12 java.io.IOException -> L15
        Le:
            r1.close()
            goto L36
        L12:
            r7 = move-exception
            r0 = r1
            goto L37
        L15:
            r0 = move-exception
            goto L1d
        L17:
            r7 = move-exception
            goto L37
        L19:
            r1 = move-exception
            r5 = r1
            r1 = r0
            r0 = r5
        L1d:
            java.lang.String r2 = "PdfBox-Android"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L12
            r3.<init>()     // Catch: java.lang.Throwable -> L12
            java.lang.String r4 = "Could not load font file: "
            r3.append(r4)     // Catch: java.lang.Throwable -> L12
            r3.append(r7)     // Catch: java.lang.Throwable -> L12
            java.lang.String r7 = r3.toString()     // Catch: java.lang.Throwable -> L12
            android.util.Log.w(r2, r7, r0)     // Catch: java.lang.Throwable -> L12
            if (r1 == 0) goto L36
            goto Le
        L36:
            return
        L37:
            if (r0 == 0) goto L3c
            r0.close()
        L3c:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C13930sX.m22595c(java.io.File):void");
    }

    /* renamed from: d */
    public final void m22594d(File file) {
        try {
            if (file.getPath().toLowerCase().endsWith(".otf")) {
                m22593e(new OTFParser(false, true).parse(file), file);
            } else {
                m22593e(new TTFParser(false, true).parse(file), file);
            }
        } catch (IOException e) {
            Log.w("PdfBox-Android", "Could not load font file: " + file, e);
        }
    }

    /* renamed from: e */
    public final void m22593e(TrueTypeFont trueTypeFont, File file) {
        C13931a c13931a;
        String str;
        File file2;
        C13930sX c13930sX;
        String str2;
        byte[] bArr;
        int i;
        int i2;
        int i3;
        int i4;
        String str3;
        CIDSystemInfo cIDSystemInfo;
        String str4;
        NamingTable naming;
        CIDSystemInfo cIDSystemInfo2;
        try {
            try {
            } catch (IOException e) {
                e = e;
                c13931a = null;
                str = "PdfBox-Android";
                file2 = file;
                c13930sX = this;
            }
            if (trueTypeFont.getName() != null && trueTypeFont.getName().contains("|")) {
                this.f79806a.add(new C13934d(file, FontFormat.TTF, "*skippipeinname*", null));
                Log.w("PdfBox-Android", "Skipping font with '|' in name " + trueTypeFont.getName() + " in file " + file);
            } else {
                if (trueTypeFont.getName() == null) {
                    str2 = "PdfBox-Android";
                    c13930sX = this;
                    try {
                        try {
                            file2 = file;
                            c13931a = null;
                            try {
                                c13930sX.f79806a.add(new C13934d(file2, FontFormat.TTF, "*skipnoname*", null));
                                str = str2;
                                try {
                                    Log.w(str, "Missing 'name' entry for PostScript name in font " + file2);
                                } catch (IOException e2) {
                                    e = e2;
                                }
                            } catch (IOException e3) {
                                e = e3;
                                str = str2;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            trueTypeFont.close();
                            throw th;
                        }
                    } catch (IOException e4) {
                        e = e4;
                    }
                } else {
                    try {
                        try {
                            if (trueTypeFont.getHeader() == null) {
                                this.f79806a.add(new C13934d(file, FontFormat.TTF, trueTypeFont.getName(), null));
                                trueTypeFont.close();
                                return;
                            }
                            int macStyle = trueTypeFont.getHeader().getMacStyle();
                            OS2WindowsMetricsTable oS2Windows = trueTypeFont.getOS2Windows();
                            if (oS2Windows != null) {
                                int familyClass = oS2Windows.getFamilyClass();
                                int weightClass = oS2Windows.getWeightClass();
                                int codePageRange1 = (int) oS2Windows.getCodePageRange1();
                                int codePageRange2 = (int) oS2Windows.getCodePageRange2();
                                bArr = oS2Windows.getPanose();
                                i4 = codePageRange2;
                                i3 = codePageRange1;
                                i2 = familyClass;
                                i = weightClass;
                            } else {
                                bArr = null;
                                i = -1;
                                i2 = -1;
                                i3 = 0;
                                i4 = 0;
                            }
                            try {
                                try {
                                    if (trueTypeFont instanceof OpenTypeFont) {
                                        try {
                                            if (((OpenTypeFont) trueTypeFont).isPostScript()) {
                                                str3 = "OTF";
                                                CFFFont font = ((OpenTypeFont) trueTypeFont).getCFF().getFont();
                                                if (font instanceof CFFCIDFont) {
                                                    CFFCIDFont cFFCIDFont = (CFFCIDFont) font;
                                                    cIDSystemInfo = new CIDSystemInfo(cFFCIDFont.getRegistry(), cFFCIDFont.getOrdering(), cFFCIDFont.getSupplement());
                                                } else {
                                                    cIDSystemInfo = null;
                                                }
                                                str2 = "PdfBox-Android";
                                                this.f79806a.add(new C13933c(file, FontFormat.OTF, trueTypeFont.getName(), cIDSystemInfo, i, i2, i3, i4, macStyle, bArr, this, null));
                                                str4 = str3;
                                                if (PDFBoxConfig.isDebugEnabled() && (naming = trueTypeFont.getNaming()) != null) {
                                                    StringBuilder sb = new StringBuilder();
                                                    sb.append(str4);
                                                    sb.append(": '");
                                                    sb.append(naming.getPostScriptName());
                                                    sb.append("' / '");
                                                    sb.append(naming.getFontFamily());
                                                    sb.append("' / '");
                                                    sb.append(naming.getFontSubFamily());
                                                    sb.append(OperatorName.SHOW_TEXT_LINE);
                                                }
                                            }
                                        } catch (IOException e5) {
                                            e = e5;
                                            str2 = "PdfBox-Android";
                                            file2 = file;
                                            c13930sX = this;
                                            str = str2;
                                            c13931a = null;
                                            c13930sX.f79806a.add(new C13934d(file2, FontFormat.TTF, "*skipexception*", c13931a));
                                            Log.w(str, "Could not load font file: " + file2, e);
                                            trueTypeFont.close();
                                        }
                                    }
                                    if (trueTypeFont.getTableMap().containsKey("gcid")) {
                                        byte[] tableBytes = trueTypeFont.getTableBytes(trueTypeFont.getTableMap().get("gcid"));
                                        Charset charset = Charsets.US_ASCII;
                                        String str5 = new String(tableBytes, 10, 64, charset);
                                        String substring = str5.substring(0, str5.indexOf(0));
                                        String str6 = new String(tableBytes, 76, 64, charset);
                                        cIDSystemInfo2 = new CIDSystemInfo(substring, str6.substring(0, str6.indexOf(0)), tableBytes[141] & 255 & (tableBytes[140] << 8));
                                    } else {
                                        cIDSystemInfo2 = null;
                                    }
                                    str3 = "TTF";
                                    this.f79806a.add(new C13933c(file, FontFormat.TTF, trueTypeFont.getName(), cIDSystemInfo2, i, i2, i3, i4, macStyle, bArr, this, null));
                                    str4 = str3;
                                    if (PDFBoxConfig.isDebugEnabled()) {
                                        StringBuilder sb2 = new StringBuilder();
                                        sb2.append(str4);
                                        sb2.append(": '");
                                        sb2.append(naming.getPostScriptName());
                                        sb2.append("' / '");
                                        sb2.append(naming.getFontFamily());
                                        sb2.append("' / '");
                                        sb2.append(naming.getFontSubFamily());
                                        sb2.append(OperatorName.SHOW_TEXT_LINE);
                                    }
                                } catch (IOException e6) {
                                    e = e6;
                                    c13930sX = this;
                                    file2 = file;
                                    str = str2;
                                    c13931a = null;
                                    c13930sX.f79806a.add(new C13934d(file2, FontFormat.TTF, "*skipexception*", c13931a));
                                    Log.w(str, "Could not load font file: " + file2, e);
                                    trueTypeFont.close();
                                }
                                str2 = "PdfBox-Android";
                            } catch (IOException e7) {
                                e = e7;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            trueTypeFont.close();
                            throw th;
                        }
                    } catch (IOException e8) {
                        e = e8;
                        str2 = "PdfBox-Android";
                    }
                }
                file2 = file;
                str = str2;
                c13931a = null;
                c13930sX.f79806a.add(new C13934d(file2, FontFormat.TTF, "*skipexception*", c13931a));
                Log.w(str, "Could not load font file: " + file2, e);
            }
            trueTypeFont.close();
        } catch (Throwable th4) {
            th = th4;
        }
    }

    /* renamed from: f */
    public final void m22592f(File file) {
        FileInputStream fileInputStream;
        String str;
        Type1Font createWithPFB;
        FileInputStream fileInputStream2 = new FileInputStream(file);
        try {
            try {
                createWithPFB = Type1Font.createWithPFB(fileInputStream2);
            } catch (IOException e) {
                e = e;
                fileInputStream = fileInputStream2;
                str = "PdfBox-Android";
            } catch (Throwable th2) {
                th = th2;
                fileInputStream = fileInputStream2;
                fileInputStream.close();
                throw th;
            }
            if (createWithPFB.getName() == null) {
                this.f79806a.add(new C13934d(file, FontFormat.PFB, "*skipnoname*", null));
                Log.w("PdfBox-Android", "Missing 'name' entry for PostScript name in font " + file);
                fileInputStream2.close();
            } else if (createWithPFB.getName().contains("|")) {
                this.f79806a.add(new C13934d(file, FontFormat.PFB, "*skippipeinname*", null));
                Log.w("PdfBox-Android", "Skipping font with '|' in name " + createWithPFB.getName() + " in file " + file);
                fileInputStream2.close();
            } else {
                fileInputStream = fileInputStream2;
                str = "PdfBox-Android";
                try {
                    this.f79806a.add(new C13933c(file, FontFormat.PFB, createWithPFB.getName(), null, -1, -1, 0, 0, -1, null, this, null));
                    if (PDFBoxConfig.isDebugEnabled()) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("PFB: '");
                        sb.append(createWithPFB.getName());
                        sb.append("' / '");
                        sb.append(createWithPFB.getFamilyName());
                        sb.append("' / '");
                        sb.append(createWithPFB.getWeight());
                        sb.append(OperatorName.SHOW_TEXT_LINE);
                    }
                } catch (IOException e2) {
                    e = e2;
                    Log.w(str, "Could not load font file: " + file, e);
                    fileInputStream.close();
                }
                fileInputStream.close();
            }
        } catch (Throwable th3) {
            th = th3;
            fileInputStream.close();
            throw th;
        }
    }

    /* renamed from: g */
    public final File m22591g() {
        String property = System.getProperty("pdfbox.fontcache");
        if ((property == null || !new File(property).isDirectory() || !new File(property).canWrite()) && ((property = System.getProperty("user.home")) == null || !new File(property).isDirectory() || !new File(property).canWrite())) {
            property = System.getProperty("java.io.tmpdir");
        }
        return new File(property, ".pdfbox.cache");
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.FontProvider
    public List getFontInfo() {
        return this.f79806a;
    }

    /* JADX WARN: Removed duplicated region for block: B:85:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01ae A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0039 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List m22590h(java.util.List r23) {
        /*
            Method dump skipped, instructions count: 431
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C13930sX.m22590h(java.util.List):java.util.List");
    }

    /* renamed from: i */
    public final void m22589i() {
        BufferedWriter bufferedWriter = null;
        try {
            try {
                BufferedWriter bufferedWriter2 = new BufferedWriter(new FileWriter(m22591g()));
                try {
                    for (C13933c c13933c : this.f79806a) {
                        bufferedWriter2.write(c13933c.f79811a.trim());
                        bufferedWriter2.write("|");
                        bufferedWriter2.write(c13933c.f79812b.toString());
                        bufferedWriter2.write("|");
                        if (c13933c.f79813c != null) {
                            bufferedWriter2.write(c13933c.f79813c.getRegistry() + '-' + c13933c.f79813c.getOrdering() + '-' + c13933c.f79813c.getSupplement());
                        }
                        bufferedWriter2.write("|");
                        if (c13933c.f79814d > -1) {
                            bufferedWriter2.write(Integer.toHexString(c13933c.f79814d));
                        }
                        bufferedWriter2.write("|");
                        if (c13933c.f79815e > -1) {
                            bufferedWriter2.write(Integer.toHexString(c13933c.f79815e));
                        }
                        bufferedWriter2.write("|");
                        bufferedWriter2.write(Integer.toHexString(c13933c.f79816f));
                        bufferedWriter2.write("|");
                        bufferedWriter2.write(Integer.toHexString(c13933c.f79817g));
                        bufferedWriter2.write("|");
                        if (c13933c.f79818h > -1) {
                            bufferedWriter2.write(Integer.toHexString(c13933c.f79818h));
                        }
                        bufferedWriter2.write("|");
                        if (c13933c.f79819i != null) {
                            byte[] bytes = c13933c.f79819i.getBytes();
                            for (int i = 0; i < 10; i++) {
                                String hexString = Integer.toHexString(bytes[i]);
                                if (hexString.length() == 1) {
                                    bufferedWriter2.write(48);
                                }
                                bufferedWriter2.write(hexString);
                            }
                        }
                        bufferedWriter2.write("|");
                        bufferedWriter2.write(c13933c.f79820j.getAbsolutePath());
                        bufferedWriter2.newLine();
                    }
                    IOUtils.closeQuietly(bufferedWriter2);
                } catch (IOException e) {
                    e = e;
                    bufferedWriter = bufferedWriter2;
                    Log.w("PdfBox-Android", "Could not write to font cache", e);
                    Log.w("PdfBox-Android", "Installed fonts information will have to be reloaded for each start");
                    Log.w("PdfBox-Android", "You can assign a directory to the 'pdfbox.fontcache' property");
                    IOUtils.closeQuietly(bufferedWriter);
                } catch (Throwable th2) {
                    th = th2;
                    bufferedWriter = bufferedWriter2;
                    IOUtils.closeQuietly(bufferedWriter);
                    throw th;
                }
            } catch (IOException e2) {
                e = e2;
            } catch (SecurityException unused) {
                IOUtils.closeQuietly(null);
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* renamed from: j */
    public final void m22588j(List list) {
        String lowerCase;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            File file = (File) it.next();
            try {
                lowerCase = file.getPath().toLowerCase();
            } catch (IOException e) {
                Log.w("PdfBox-Android", "Error parsing font " + file.getPath(), e);
            }
            if (!lowerCase.endsWith(".ttf") && !lowerCase.endsWith(".otf")) {
                if (!lowerCase.endsWith(".ttc") && !lowerCase.endsWith(".otc")) {
                    if (lowerCase.endsWith(".pfb")) {
                        m22592f(file);
                    }
                }
                m22595c(file);
            }
            m22594d(file);
        }
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.FontProvider
    public String toDebugString() {
        StringBuilder sb = new StringBuilder();
        for (C13933c c13933c : this.f79806a) {
            sb.append(c13933c.getFormat());
            sb.append(": ");
            sb.append(c13933c.getPostScriptName());
            sb.append(": ");
            sb.append(c13933c.f79820j.getPath());
            sb.append('\n');
        }
        return sb.toString();
    }
}
