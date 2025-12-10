package com.tom_roush.pdfbox.text;

import com.tom_roush.pdfbox.pdmodel.PDDocument;
import com.tom_roush.pdfbox.pdmodel.PDPage;
import com.tom_roush.pdfbox.pdmodel.PDPageTree;
import com.tom_roush.pdfbox.pdmodel.common.PDRectangle;
import com.tom_roush.pdfbox.pdmodel.interactive.documentnavigation.outline.PDOutlineItem;
import com.tom_roush.pdfbox.pdmodel.interactive.pagenavigation.PDThreadBead;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.io.StringWriter;
import java.io.Writer;
import java.text.Bidi;
import java.text.Normalizer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.regex.Pattern;
import org.apache.commons.cli.HelpFormatter;

/* loaded from: classes5.dex */
public class PDFTextStripper extends AbstractC9968a {

    /* renamed from: P */
    public static float f60795P = 2.0f;

    /* renamed from: Q */
    public static float f60796Q = 2.5f;

    /* renamed from: R */
    public static final String[] f60797R;

    /* renamed from: S */
    public static Map f60798S;

    /* renamed from: A */
    public int f60799A;

    /* renamed from: B */
    public int f60800B;

    /* renamed from: C */
    public PDOutlineItem f60801C;

    /* renamed from: D */
    public boolean f60802D;

    /* renamed from: E */
    public boolean f60803E;

    /* renamed from: F */
    public boolean f60804F;

    /* renamed from: G */
    public boolean f60805G;

    /* renamed from: H */
    public float f60806H;

    /* renamed from: I */
    public float f60807I;

    /* renamed from: J */
    public float f60808J;

    /* renamed from: K */
    public float f60809K;

    /* renamed from: L */
    public List f60810L;
    protected final String LINE_SEPARATOR;

    /* renamed from: M */
    public Map f60811M;

    /* renamed from: N */
    public boolean f60812N;

    /* renamed from: O */
    public List f60813O;
    protected ArrayList<List<TextPosition>> charactersByArticle;
    protected PDDocument document;

    /* renamed from: o */
    public String f60814o;
    protected Writer output;

    /* renamed from: p */
    public String f60815p;

    /* renamed from: q */
    public String f60816q;

    /* renamed from: r */
    public String f60817r;

    /* renamed from: s */
    public String f60818s;

    /* renamed from: t */
    public String f60819t;

    /* renamed from: u */
    public String f60820u;

    /* renamed from: v */
    public String f60821v;

    /* renamed from: w */
    public int f60822w;

    /* renamed from: x */
    public int f60823x;

    /* renamed from: y */
    public int f60824y;

    /* renamed from: z */
    public PDOutlineItem f60825z;

    /* renamed from: com.tom_roush.pdfbox.text.PDFTextStripper$b */
    /* loaded from: classes5.dex */
    public static final class C9966b {

        /* renamed from: a */
        public boolean f60828a = false;

        /* renamed from: b */
        public boolean f60829b = false;

        /* renamed from: c */
        public boolean f60830c = false;

        /* renamed from: d */
        public boolean f60831d = false;

        /* renamed from: e */
        public boolean f60832e = false;

        /* renamed from: f */
        public TextPosition f60833f;

        public C9966b(TextPosition textPosition) {
            this.f60833f = textPosition;
        }

        /* renamed from: a */
        public TextPosition m32105a() {
            return this.f60833f;
        }

        /* renamed from: b */
        public boolean m32104b() {
            return this.f60832e;
        }

        /* renamed from: c */
        public boolean m32103c() {
            return this.f60831d;
        }

        /* renamed from: d */
        public boolean m32102d() {
            return this.f60828a;
        }

        /* renamed from: e */
        public boolean m32101e() {
            return this.f60829b;
        }

        /* renamed from: f */
        public void m32100f() {
            this.f60832e = true;
        }

        /* renamed from: g */
        public void m32099g() {
            this.f60831d = true;
        }

        /* renamed from: h */
        public void m32098h() {
            this.f60828a = true;
        }

        /* renamed from: i */
        public void m32097i() {
            this.f60829b = true;
        }
    }

    /* renamed from: com.tom_roush.pdfbox.text.PDFTextStripper$c */
    /* loaded from: classes5.dex */
    public static final class C9967c {

        /* renamed from: a */
        public String f60834a;

        /* renamed from: b */
        public List f60835b;

        public C9967c(String str, List list) {
            this.f60834a = str;
            this.f60835b = list;
        }

        /* renamed from: a */
        public String m32096a() {
            return this.f60834a;
        }

        /* renamed from: b */
        public List m32095b() {
            return this.f60835b;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:1|(2:2|3)|(2:4|5)|(2:9|10)|(2:16|17)|20|21|22|23|(1:25)(1:33)|26|28|29|(3:(1:30)|(1:37)|(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x008f, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b3, code lost:
        android.util.Log.w("PdfBox-Android", "Could not parse BidiMirroring.txt, mirroring char map will be empty: " + r0.getMessage());
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0082 A[Catch: all -> 0x008d, IOException -> 0x008f, TRY_ENTER, TryCatch #3 {IOException -> 0x008f, blocks: (B:20:0x007a, B:23:0x0082, B:29:0x00ac, B:28:0x0091), top: B:45:0x007a, outer: #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0091 A[Catch: all -> 0x008d, IOException -> 0x008f, TryCatch #3 {IOException -> 0x008f, blocks: (B:20:0x007a, B:23:0x0082, B:29:0x00ac, B:28:0x0091), top: B:45:0x007a, outer: #6 }] */
    static {
        /*
            java.lang.Class<com.tom_roush.pdfbox.text.PDFTextStripper> r0 = com.tom_roush.pdfbox.text.PDFTextStripper.class
            r1 = 0
            java.lang.String r2 = r0.getSimpleName()     // Catch: java.lang.SecurityException -> L38
            java.lang.String r2 = r2.toLowerCase()     // Catch: java.lang.SecurityException -> L38
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.SecurityException -> L38
            r3.<init>()     // Catch: java.lang.SecurityException -> L38
            r3.append(r2)     // Catch: java.lang.SecurityException -> L38
            java.lang.String r4 = ".indent"
            r3.append(r4)     // Catch: java.lang.SecurityException -> L38
            java.lang.String r3 = r3.toString()     // Catch: java.lang.SecurityException -> L38
            java.lang.String r3 = java.lang.System.getProperty(r3)     // Catch: java.lang.SecurityException -> L38
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.SecurityException -> L36
            r4.<init>()     // Catch: java.lang.SecurityException -> L36
            r4.append(r2)     // Catch: java.lang.SecurityException -> L36
            java.lang.String r2 = ".drop"
            r4.append(r2)     // Catch: java.lang.SecurityException -> L36
            java.lang.String r2 = r4.toString()     // Catch: java.lang.SecurityException -> L36
            java.lang.String r2 = java.lang.System.getProperty(r2)     // Catch: java.lang.SecurityException -> L36
            goto L3b
        L36:
            goto L3a
        L38:
            r3 = r1
        L3a:
            r2 = r1
        L3b:
            if (r3 == 0) goto L4b
            int r4 = r3.length()
            if (r4 <= 0) goto L4b
            float r3 = java.lang.Float.parseFloat(r3)     // Catch: java.lang.NumberFormatException -> L4a
            com.tom_roush.pdfbox.text.PDFTextStripper.f60795P = r3     // Catch: java.lang.NumberFormatException -> L4a
            goto L4b
        L4a:
        L4b:
            if (r2 == 0) goto L59
            int r3 = r2.length()
            if (r3 <= 0) goto L59
            float r2 = java.lang.Float.parseFloat(r2)     // Catch: java.lang.NumberFormatException -> L59
            com.tom_roush.pdfbox.text.PDFTextStripper.f60796Q = r2     // Catch: java.lang.NumberFormatException -> L59
        L59:
            java.lang.String r11 = "[IVXL]+\\."
            java.lang.String r12 = "[ivxl]+\\."
            java.lang.String r3 = "\\."
            java.lang.String r4 = "\\d+\\."
            java.lang.String r5 = "\\[\\d+\\]"
            java.lang.String r6 = "\\d+\\)"
            java.lang.String r7 = "[A-Z]\\."
            java.lang.String r8 = "[a-z]\\."
            java.lang.String r9 = "[A-Z]\\)"
            java.lang.String r10 = "[a-z]\\)"
            java.lang.String[] r2 = new java.lang.String[]{r3, r4, r5, r6, r7, r8, r9, r10, r11, r12}
            com.tom_roush.pdfbox.text.PDFTextStripper.f60797R = r2
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            com.tom_roush.pdfbox.text.PDFTextStripper.f60798S = r2
            boolean r2 = com.tom_roush.pdfbox.android.PDFBoxResourceLoader.isReady()     // Catch: java.lang.Throwable -> L8d java.io.IOException -> L8f
            java.lang.String r3 = "com/tom_roush/pdfbox/resources/text/BidiMirroring.txt"
            if (r2 == 0) goto L91
            java.io.BufferedInputStream r0 = new java.io.BufferedInputStream     // Catch: java.lang.Throwable -> L8d java.io.IOException -> L8f
            java.io.InputStream r2 = com.tom_roush.pdfbox.android.PDFBoxResourceLoader.getStream(r3)     // Catch: java.lang.Throwable -> L8d java.io.IOException -> L8f
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L8d java.io.IOException -> L8f
            r1 = r0
            goto Lac
        L8d:
            r0 = move-exception
            goto Lcf
        L8f:
            r0 = move-exception
            goto Lb3
        L91:
            java.io.BufferedInputStream r2 = new java.io.BufferedInputStream     // Catch: java.lang.Throwable -> L8d java.io.IOException -> L8f
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L8d java.io.IOException -> L8f
            r4.<init>()     // Catch: java.lang.Throwable -> L8d java.io.IOException -> L8f
            java.lang.String r5 = "/"
            r4.append(r5)     // Catch: java.lang.Throwable -> L8d java.io.IOException -> L8f
            r4.append(r3)     // Catch: java.lang.Throwable -> L8d java.io.IOException -> L8f
            java.lang.String r3 = r4.toString()     // Catch: java.lang.Throwable -> L8d java.io.IOException -> L8f
            java.io.InputStream r0 = r0.getResourceAsStream(r3)     // Catch: java.lang.Throwable -> L8d java.io.IOException -> L8f
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L8d java.io.IOException -> L8f
            r1 = r2
        Lac:
            m32112r(r1)     // Catch: java.lang.Throwable -> L8d java.io.IOException -> L8f
        Laf:
            r1.close()     // Catch: java.io.IOException -> Lce
            goto Lce
        Lb3:
            java.lang.String r2 = "PdfBox-Android"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L8d
            r3.<init>()     // Catch: java.lang.Throwable -> L8d
            java.lang.String r4 = "Could not parse BidiMirroring.txt, mirroring char map will be empty: "
            r3.append(r4)     // Catch: java.lang.Throwable -> L8d
            java.lang.String r0 = r0.getMessage()     // Catch: java.lang.Throwable -> L8d
            r3.append(r0)     // Catch: java.lang.Throwable -> L8d
            java.lang.String r0 = r3.toString()     // Catch: java.lang.Throwable -> L8d
            android.util.Log.w(r2, r0)     // Catch: java.lang.Throwable -> L8d
            goto Laf
        Lce:
            return
        Lcf:
            r1.close()     // Catch: java.io.IOException -> Ld2
        Ld2:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tom_roush.pdfbox.text.PDFTextStripper.<clinit>():void");
    }

    public PDFTextStripper() throws IOException {
        String property = System.getProperty("line.separator");
        this.LINE_SEPARATOR = property;
        this.f60814o = property;
        this.f60815p = HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR;
        this.f60816q = "";
        this.f60817r = "";
        this.f60818s = "";
        this.f60819t = property;
        this.f60820u = "";
        this.f60821v = "";
        this.f60822w = 0;
        this.f60823x = 1;
        this.f60824y = Integer.MAX_VALUE;
        this.f60825z = null;
        this.f60799A = -1;
        this.f60800B = -1;
        this.f60801C = null;
        this.f60802D = true;
        this.f60803E = true;
        this.f60804F = false;
        this.f60805G = false;
        this.f60806H = f60795P;
        this.f60807I = f60796Q;
        this.f60808J = 0.5f;
        this.f60809K = 0.3f;
        this.f60810L = null;
        this.charactersByArticle = new ArrayList<>();
        this.f60811M = new HashMap();
        this.f60813O = null;
    }

    public static Pattern matchPattern(String str, List<Pattern> list) {
        for (Pattern pattern : list) {
            if (pattern.matcher(str).matches()) {
                return pattern;
            }
        }
        return null;
    }

    /* renamed from: r */
    public static void m32112r(InputStream inputStream) {
        LineNumberReader lineNumberReader = new LineNumberReader(new InputStreamReader(inputStream));
        while (true) {
            String readLine = lineNumberReader.readLine();
            if (readLine == null) {
                return;
            }
            int indexOf = readLine.indexOf(35);
            if (indexOf != -1) {
                readLine = readLine.substring(0, indexOf);
            }
            if (readLine.length() >= 2) {
                StringTokenizer stringTokenizer = new StringTokenizer(readLine, ";");
                int countTokens = stringTokenizer.countTokens();
                Character[] chArr = new Character[countTokens];
                for (int i = 0; i < countTokens; i++) {
                    chArr[i] = Character.valueOf((char) Integer.parseInt(stringTokenizer.nextToken().trim(), 16));
                }
                if (countTokens == 2) {
                    f60798S.put(chArr[0], chArr[1]);
                }
            }
        }
    }

    /* renamed from: t */
    private boolean m32110t(float f, float f2, float f3) {
        return f2 < f + f3 && f2 > f - f3;
    }

    public void endArticle() throws IOException {
        this.output.write(getArticleEnd());
    }

    public void endDocument(PDDocument pDDocument) throws IOException {
    }

    public void endPage(PDPage pDPage) throws IOException {
    }

    /* renamed from: g */
    public final C9967c m32123g(String str, List list) {
        return new C9967c(m32114p(str), list);
    }

    public boolean getAddMoreFormatting() {
        return this.f60805G;
    }

    public String getArticleEnd() {
        return this.f60821v;
    }

    public String getArticleStart() {
        return this.f60820u;
    }

    public float getAverageCharTolerance() {
        return this.f60809K;
    }

    public List<List<TextPosition>> getCharactersByArticle() {
        return this.charactersByArticle;
    }

    public int getCurrentPageNo() {
        return this.f60822w;
    }

    public float getDropThreshold() {
        return this.f60807I;
    }

    public PDOutlineItem getEndBookmark() {
        return this.f60801C;
    }

    public int getEndPage() {
        return this.f60824y;
    }

    public float getIndentThreshold() {
        return this.f60806H;
    }

    public String getLineSeparator() {
        return this.f60814o;
    }

    public List<Pattern> getListItemPatterns() {
        if (this.f60813O == null) {
            this.f60813O = new ArrayList();
            for (String str : f60797R) {
                this.f60813O.add(Pattern.compile(str));
            }
        }
        return this.f60813O;
    }

    public Writer getOutput() {
        return this.output;
    }

    public String getPageEnd() {
        return this.f60819t;
    }

    public String getPageStart() {
        return this.f60818s;
    }

    public String getParagraphEnd() {
        return this.f60817r;
    }

    public String getParagraphStart() {
        return this.f60816q;
    }

    public boolean getSeparateByBeads() {
        return this.f60803E;
    }

    public boolean getSortByPosition() {
        return this.f60804F;
    }

    public float getSpacingTolerance() {
        return this.f60808J;
    }

    public PDOutlineItem getStartBookmark() {
        return this.f60825z;
    }

    public int getStartPage() {
        return this.f60823x;
    }

    public boolean getSuppressDuplicateOverlappingText() {
        return this.f60802D;
    }

    public String getText(PDDocument pDDocument) throws IOException {
        StringWriter stringWriter = new StringWriter();
        writeText(pDDocument, stringWriter);
        return stringWriter.toString();
    }

    public String getWordSeparator() {
        return this.f60815p;
    }

    /* renamed from: h */
    public final void m32122h(PDPage pDPage) {
        this.f60810L = new ArrayList();
        for (PDThreadBead pDThreadBead : pDPage.getThreadBeads()) {
            if (pDThreadBead != null && pDThreadBead.getRectangle() != null) {
                PDRectangle rectangle = pDThreadBead.getRectangle();
                PDRectangle mediaBox = pDPage.getMediaBox();
                float upperRightY = mediaBox.getUpperRightY() - rectangle.getLowerLeftY();
                rectangle.setLowerLeftY(mediaBox.getUpperRightY() - rectangle.getUpperRightY());
                rectangle.setUpperRightY(upperRightY);
                PDRectangle cropBox = pDPage.getCropBox();
                if (cropBox.getLowerLeftX() != 0.0f || cropBox.getLowerLeftY() != 0.0f) {
                    rectangle.setLowerLeftX(rectangle.getLowerLeftX() - cropBox.getLowerLeftX());
                    rectangle.setLowerLeftY(rectangle.getLowerLeftY() - cropBox.getLowerLeftY());
                    rectangle.setUpperRightX(rectangle.getUpperRightX() - cropBox.getLowerLeftX());
                    rectangle.setUpperRightY(rectangle.getUpperRightY() - cropBox.getLowerLeftY());
                }
                this.f60810L.add(rectangle);
            } else {
                this.f60810L.add(null);
            }
        }
    }

    /* renamed from: i */
    public final String m32121i(String str) {
        Bidi bidi = new Bidi(str, -2);
        if (!bidi.isMixed() && bidi.getBaseLevel() == 0) {
            return str;
        }
        int runCount = bidi.getRunCount();
        byte[] bArr = new byte[runCount];
        Integer[] numArr = new Integer[runCount];
        for (int i = 0; i < runCount; i++) {
            bArr[i] = (byte) bidi.getRunLevel(i);
            numArr[i] = Integer.valueOf(i);
        }
        Bidi.reorderVisually(bArr, 0, numArr, 0, runCount);
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < runCount; i2++) {
            int intValue = numArr[i2].intValue();
            int runStart = bidi.getRunStart(intValue);
            int runLimit = bidi.getRunLimit(intValue);
            if ((bArr[intValue] & 1) != 0) {
                while (true) {
                    runLimit--;
                    if (runLimit >= runStart) {
                        char charAt = str.charAt(runLimit);
                        if (Character.isMirrored(str.codePointAt(runLimit))) {
                            if (f60798S.containsKey(Character.valueOf(charAt))) {
                                sb.append(f60798S.get(Character.valueOf(charAt)));
                            } else {
                                sb.append(charAt);
                            }
                        } else {
                            sb.append(charAt);
                        }
                    }
                }
            } else {
                sb.append((CharSequence) str, runStart, runLimit);
            }
        }
        return sb.toString();
    }

    /* renamed from: j */
    public final C9966b m32120j(C9966b c9966b, C9966b c9966b2, C9966b c9966b3, float f) {
        c9966b.m32098h();
        m32119k(c9966b, c9966b2, c9966b3, f);
        if (c9966b.m32101e()) {
            if (c9966b2.m32104b()) {
                if (c9966b2.m32102d()) {
                    writeLineSeparator();
                }
                writeParagraphStart();
            } else {
                writeLineSeparator();
                writeParagraphSeparator();
            }
        } else {
            writeLineSeparator();
        }
        return c9966b;
    }

    /* renamed from: k */
    public final void m32119k(C9966b c9966b, C9966b c9966b2, C9966b c9966b3, float f) {
        Pattern m32118l;
        if (c9966b3 != null) {
            float abs = Math.abs(c9966b.m32105a().getYDirAdj() - c9966b2.m32105a().getYDirAdj());
            float m32117m = m32117m(getDropThreshold(), f);
            float xDirAdj = c9966b.m32105a().getXDirAdj() - c9966b3.m32105a().getXDirAdj();
            float m32117m2 = m32117m(getIndentThreshold(), c9966b.m32105a().getWidthOfSpace());
            float m32117m3 = m32117m(0.25f, c9966b.m32105a().getWidth());
            if (abs <= m32117m) {
                if (xDirAdj > m32117m2) {
                    if (c9966b3.m32101e()) {
                        c9966b.m32099g();
                        return;
                    }
                } else if (xDirAdj < (-c9966b.m32105a().getWidthOfSpace())) {
                    if (c9966b3.m32101e()) {
                        return;
                    }
                } else if (Math.abs(xDirAdj) < m32117m3) {
                    if (c9966b3.m32103c()) {
                        c9966b.m32099g();
                        return;
                    } else if (!c9966b3.m32101e() || (m32118l = m32118l(c9966b3)) == null || m32118l != m32118l(c9966b)) {
                        return;
                    }
                } else {
                    return;
                }
            }
        }
        c9966b.m32097i();
    }

    /* renamed from: l */
    public final Pattern m32118l(C9966b c9966b) {
        return matchPattern(c9966b.m32105a().getUnicode(), getListItemPatterns());
    }

    /* renamed from: m */
    public final float m32117m(float f, float f2) {
        return Math.round((f * f2) * 1000.0f) / 1000.0f;
    }

    /* renamed from: n */
    public final List m32116n(List list) {
        LinkedList linkedList = new LinkedList();
        StringBuilder sb = new StringBuilder();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            sb = m32115o(linkedList, sb, arrayList, (C9965a) it.next());
        }
        if (sb.length() > 0) {
            linkedList.add(m32123g(sb.toString(), arrayList));
        }
        return linkedList;
    }

    /* renamed from: o */
    public final StringBuilder m32115o(List list, StringBuilder sb, List list2, C9965a c9965a) {
        if (c9965a.m32106c()) {
            list.add(m32123g(sb.toString(), new ArrayList(list2)));
            StringBuilder sb2 = new StringBuilder();
            list2.clear();
            return sb2;
        }
        TextPosition m32108a = c9965a.m32108a();
        sb.append(m32108a.getUnicode());
        list2.add(m32108a);
        return sb;
    }

    /* renamed from: p */
    public final String m32114p(String str) {
        int length = str.length();
        StringBuilder sb = null;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            char charAt = str.charAt(i);
            if ((64256 <= charAt && charAt <= 65023) || (65136 <= charAt && charAt <= 65279)) {
                if (sb == null) {
                    sb = new StringBuilder(length * 2);
                }
                sb.append((CharSequence) str, i2, i);
                if (charAt == 65010 && i > 0) {
                    int i3 = i - 1;
                    if (str.charAt(i3) == 1575 || str.charAt(i3) == 65165) {
                        sb.append("لله");
                        i2 = i + 1;
                    }
                }
                sb.append(Normalizer.normalize(str.substring(i, i + 1), Normalizer.Form.NFKC).trim());
                i2 = i + 1;
            }
            i++;
        }
        if (sb == null) {
            return m32121i(str);
        }
        sb.append((CharSequence) str, i2, i);
        return m32121i(sb.toString());
    }

    @Override // com.tom_roush.pdfbox.text.AbstractC9968a, com.tom_roush.pdfbox.contentstream.PDFStreamEngine
    public void processPage(PDPage pDPage) throws IOException {
        int i = this.f60822w;
        if (i >= this.f60823x && i <= this.f60824y) {
            int i2 = this.f60799A;
            if (i2 == -1 || i >= i2) {
                int i3 = this.f60800B;
                if (i3 == -1 || i <= i3) {
                    startPage(pDPage);
                    int i4 = 1;
                    if (this.f60803E) {
                        m32122h(pDPage);
                        i4 = 1 + (this.f60810L.size() * 2);
                    }
                    int size = this.charactersByArticle.size();
                    this.charactersByArticle.ensureCapacity(i4);
                    int max = Math.max(i4, size);
                    for (int i5 = 0; i5 < max; i5++) {
                        if (i5 < size) {
                            this.charactersByArticle.get(i5).clear();
                        } else if (i4 < size) {
                            this.charactersByArticle.remove(i5);
                        } else {
                            this.charactersByArticle.add(new ArrayList());
                        }
                    }
                    this.f60811M.clear();
                    super.processPage(pDPage);
                    writePage();
                    endPage(pDPage);
                }
            }
        }
    }

    public void processPages(PDPageTree pDPageTree) throws IOException {
        PDPage findDestinationPage;
        PDOutlineItem pDOutlineItem;
        PDOutlineItem pDOutlineItem2 = this.f60825z;
        PDPage pDPage = null;
        if (pDOutlineItem2 == null) {
            findDestinationPage = null;
        } else {
            findDestinationPage = pDOutlineItem2.findDestinationPage(this.document);
        }
        if (findDestinationPage != null) {
            this.f60799A = pDPageTree.indexOf(findDestinationPage) + 1;
        } else {
            this.f60799A = -1;
        }
        PDOutlineItem pDOutlineItem3 = this.f60801C;
        if (pDOutlineItem3 != null) {
            pDPage = pDOutlineItem3.findDestinationPage(this.document);
        }
        if (pDPage != null) {
            this.f60800B = pDPageTree.indexOf(pDPage) + 1;
        } else {
            this.f60800B = -1;
        }
        if (this.f60799A == -1 && (pDOutlineItem = this.f60825z) != null && this.f60800B == -1 && this.f60801C != null && pDOutlineItem.getCOSObject() == this.f60801C.getCOSObject()) {
            this.f60799A = 0;
            this.f60800B = 0;
        }
        Iterator<PDPage> it = pDPageTree.iterator();
        while (it.hasNext()) {
            PDPage next = it.next();
            this.f60822w++;
            if (next.hasContents()) {
                processPage(next);
            }
        }
    }

    @Override // com.tom_roush.pdfbox.text.AbstractC9968a
    public void processTextPosition(TextPosition textPosition) {
        int i;
        int i2;
        int i3;
        if (this.f60802D) {
            String unicode = textPosition.getUnicode();
            float x = textPosition.getX();
            float y = textPosition.getY();
            TreeMap treeMap = (TreeMap) this.f60811M.get(unicode);
            if (treeMap == null) {
                treeMap = new TreeMap();
                this.f60811M.put(unicode, treeMap);
            }
            float width = (textPosition.getWidth() / unicode.length()) / 3.0f;
            for (TreeSet treeSet : treeMap.subMap(Float.valueOf(x - width), Float.valueOf(x + width)).values()) {
                if (!treeSet.subSet(Float.valueOf(y - width), Float.valueOf(y + width)).isEmpty()) {
                    return;
                }
            }
            TreeSet treeSet2 = (TreeSet) treeMap.get(Float.valueOf(x));
            if (treeSet2 == null) {
                treeSet2 = new TreeSet();
                treeMap.put(Float.valueOf(x), treeSet2);
            }
            treeSet2.add(Float.valueOf(y));
        }
        float x2 = textPosition.getX();
        float y2 = textPosition.getY();
        int i4 = 0;
        if (this.f60803E) {
            int i5 = -1;
            i = -1;
            i2 = -1;
            i3 = -1;
            for (int i6 = 0; i6 < this.f60810L.size() && i5 == -1; i6++) {
                PDRectangle pDRectangle = (PDRectangle) this.f60810L.get(i6);
                if (pDRectangle != null) {
                    if (pDRectangle.contains(x2, y2)) {
                        i5 = (i6 * 2) + 1;
                    } else if ((x2 < pDRectangle.getLowerLeftX() || y2 < pDRectangle.getUpperRightY()) && i == -1) {
                        i = i6 * 2;
                    } else if (x2 < pDRectangle.getLowerLeftX() && i2 == -1) {
                        i2 = i6 * 2;
                    } else if (y2 < pDRectangle.getUpperRightY() && i3 == -1) {
                        i3 = i6 * 2;
                    }
                } else {
                    i5 = 0;
                }
            }
            i4 = i5;
        } else {
            i = -1;
            i2 = -1;
            i3 = -1;
        }
        if (i4 == -1) {
            if (i != -1) {
                i4 = i;
            } else if (i2 != -1) {
                i4 = i2;
            } else if (i3 != -1) {
                i4 = i3;
            } else {
                i4 = this.charactersByArticle.size() - 1;
            }
        }
        List<TextPosition> list = this.charactersByArticle.get(i4);
        if (list.isEmpty()) {
            list.add(textPosition);
            return;
        }
        TextPosition textPosition2 = list.get(list.size() - 1);
        if (textPosition.isDiacritic() && textPosition2.contains(textPosition)) {
            textPosition2.mergeDiacritic(textPosition);
        } else if (textPosition2.isDiacritic() && textPosition.contains(textPosition2)) {
            textPosition.mergeDiacritic(textPosition2);
            list.remove(list.size() - 1);
            list.add(textPosition);
        } else {
            list.add(textPosition);
        }
    }

    /* renamed from: q */
    public final boolean m32113q(float f, float f2, float f3, float f4) {
        if (!m32110t(f, f3, 0.1f) && ((f3 > f || f3 < f - f2) && (f > f3 || f < f3 - f4))) {
            return false;
        }
        return true;
    }

    /* renamed from: s */
    public final void m32111s() {
        this.f60822w = 0;
        this.document = null;
        ArrayList<List<TextPosition>> arrayList = this.charactersByArticle;
        if (arrayList != null) {
            arrayList.clear();
        }
        this.f60811M.clear();
    }

    public void setAddMoreFormatting(boolean z) {
        this.f60805G = z;
    }

    public void setArticleEnd(String str) {
        this.f60821v = str;
    }

    public void setArticleStart(String str) {
        this.f60820u = str;
    }

    public void setAverageCharTolerance(float f) {
        this.f60809K = f;
    }

    public void setDropThreshold(float f) {
        this.f60807I = f;
    }

    public void setEndBookmark(PDOutlineItem pDOutlineItem) {
        this.f60801C = pDOutlineItem;
    }

    public void setEndPage(int i) {
        this.f60824y = i;
    }

    public void setIndentThreshold(float f) {
        this.f60806H = f;
    }

    public void setLineSeparator(String str) {
        this.f60814o = str;
    }

    public void setListItemPatterns(List<Pattern> list) {
        this.f60813O = list;
    }

    public void setPageEnd(String str) {
        this.f60819t = str;
    }

    public void setPageStart(String str) {
        this.f60818s = str;
    }

    public void setParagraphEnd(String str) {
        this.f60817r = str;
    }

    public void setParagraphStart(String str) {
        this.f60816q = str;
    }

    public void setShouldSeparateByBeads(boolean z) {
        this.f60803E = z;
    }

    public void setSortByPosition(boolean z) {
        this.f60804F = z;
    }

    public void setSpacingTolerance(float f) {
        this.f60808J = f;
    }

    public void setStartBookmark(PDOutlineItem pDOutlineItem) {
        this.f60825z = pDOutlineItem;
    }

    public void setStartPage(int i) {
        this.f60823x = i;
    }

    public void setSuppressDuplicateOverlappingText(boolean z) {
        this.f60802D = z;
    }

    public void setWordSeparator(String str) {
        this.f60815p = str;
    }

    public void startArticle() throws IOException {
        startArticle(true);
    }

    public void startDocument(PDDocument pDDocument) throws IOException {
    }

    public void startPage(PDPage pDPage) throws IOException {
    }

    /* renamed from: u */
    public final void m32109u(List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C9967c c9967c = (C9967c) list.get(i);
            writeString(c9967c.m32096a(), c9967c.m32095b());
            if (i < size - 1) {
                writeWordSeparator();
            }
        }
    }

    public void writeCharacters(TextPosition textPosition) throws IOException {
        this.output.write(textPosition.getUnicode());
    }

    public void writeLineSeparator() throws IOException {
        this.output.write(getLineSeparator());
    }

    /* JADX WARN: Removed duplicated region for block: B:72:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01c2 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void writePage() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 495
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tom_roush.pdfbox.text.PDFTextStripper.writePage():void");
    }

    public void writePageEnd() throws IOException {
        this.output.write(getPageEnd());
    }

    public void writePageStart() throws IOException {
        this.output.write(getPageStart());
    }

    public void writeParagraphEnd() throws IOException {
        if (!this.f60812N) {
            writeParagraphStart();
        }
        this.output.write(getParagraphEnd());
        this.f60812N = false;
    }

    public void writeParagraphSeparator() throws IOException {
        writeParagraphEnd();
        writeParagraphStart();
    }

    public void writeParagraphStart() throws IOException {
        if (this.f60812N) {
            writeParagraphEnd();
            this.f60812N = false;
        }
        this.output.write(getParagraphStart());
        this.f60812N = true;
    }

    public void writeString(String str, List<TextPosition> list) throws IOException {
        writeString(str);
    }

    public void writeText(PDDocument pDDocument, Writer writer) throws IOException {
        m32111s();
        this.document = pDDocument;
        this.output = writer;
        if (getAddMoreFormatting()) {
            String str = this.f60814o;
            this.f60817r = str;
            this.f60818s = str;
            this.f60820u = str;
            this.f60821v = str;
        }
        startDocument(this.document);
        processPages(this.document.getPages());
        endDocument(this.document);
    }

    public void writeWordSeparator() throws IOException {
        this.output.write(getWordSeparator());
    }

    /* renamed from: com.tom_roush.pdfbox.text.PDFTextStripper$a */
    /* loaded from: classes5.dex */
    public static final class C9965a {

        /* renamed from: b */
        public static C9965a f60826b = new C9965a();

        /* renamed from: a */
        public final TextPosition f60827a;

        public C9965a() {
            this.f60827a = null;
        }

        /* renamed from: b */
        public static C9965a m32107b() {
            return f60826b;
        }

        /* renamed from: a */
        public TextPosition m32108a() {
            return this.f60827a;
        }

        /* renamed from: c */
        public boolean m32106c() {
            if (this.f60827a == null) {
                return true;
            }
            return false;
        }

        public C9965a(TextPosition textPosition) {
            this.f60827a = textPosition;
        }
    }

    public void startArticle(boolean z) throws IOException {
        this.output.write(getArticleStart());
    }

    public void writeString(String str) throws IOException {
        this.output.write(str);
    }
}