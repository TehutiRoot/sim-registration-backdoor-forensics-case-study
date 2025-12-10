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
public class PDFTextStripper extends AbstractC9979a {

    /* renamed from: P */
    public static float f60783P = 2.0f;

    /* renamed from: Q */
    public static float f60784Q = 2.5f;

    /* renamed from: R */
    public static final String[] f60785R;

    /* renamed from: S */
    public static Map f60786S;

    /* renamed from: A */
    public int f60787A;

    /* renamed from: B */
    public int f60788B;

    /* renamed from: C */
    public PDOutlineItem f60789C;

    /* renamed from: D */
    public boolean f60790D;

    /* renamed from: E */
    public boolean f60791E;

    /* renamed from: F */
    public boolean f60792F;

    /* renamed from: G */
    public boolean f60793G;

    /* renamed from: H */
    public float f60794H;

    /* renamed from: I */
    public float f60795I;

    /* renamed from: J */
    public float f60796J;

    /* renamed from: K */
    public float f60797K;

    /* renamed from: L */
    public List f60798L;
    protected final String LINE_SEPARATOR;

    /* renamed from: M */
    public Map f60799M;

    /* renamed from: N */
    public boolean f60800N;

    /* renamed from: O */
    public List f60801O;
    protected ArrayList<List<TextPosition>> charactersByArticle;
    protected PDDocument document;

    /* renamed from: o */
    public String f60802o;
    protected Writer output;

    /* renamed from: p */
    public String f60803p;

    /* renamed from: q */
    public String f60804q;

    /* renamed from: r */
    public String f60805r;

    /* renamed from: s */
    public String f60806s;

    /* renamed from: t */
    public String f60807t;

    /* renamed from: u */
    public String f60808u;

    /* renamed from: v */
    public String f60809v;

    /* renamed from: w */
    public int f60810w;

    /* renamed from: x */
    public int f60811x;

    /* renamed from: y */
    public int f60812y;

    /* renamed from: z */
    public PDOutlineItem f60813z;

    /* renamed from: com.tom_roush.pdfbox.text.PDFTextStripper$b */
    /* loaded from: classes5.dex */
    public static final class C9977b {

        /* renamed from: a */
        public boolean f60816a = false;

        /* renamed from: b */
        public boolean f60817b = false;

        /* renamed from: c */
        public boolean f60818c = false;

        /* renamed from: d */
        public boolean f60819d = false;

        /* renamed from: e */
        public boolean f60820e = false;

        /* renamed from: f */
        public TextPosition f60821f;

        public C9977b(TextPosition textPosition) {
            this.f60821f = textPosition;
        }

        /* renamed from: a */
        public TextPosition m32113a() {
            return this.f60821f;
        }

        /* renamed from: b */
        public boolean m32112b() {
            return this.f60820e;
        }

        /* renamed from: c */
        public boolean m32111c() {
            return this.f60819d;
        }

        /* renamed from: d */
        public boolean m32110d() {
            return this.f60816a;
        }

        /* renamed from: e */
        public boolean m32109e() {
            return this.f60817b;
        }

        /* renamed from: f */
        public void m32108f() {
            this.f60820e = true;
        }

        /* renamed from: g */
        public void m32107g() {
            this.f60819d = true;
        }

        /* renamed from: h */
        public void m32106h() {
            this.f60816a = true;
        }

        /* renamed from: i */
        public void m32105i() {
            this.f60817b = true;
        }
    }

    /* renamed from: com.tom_roush.pdfbox.text.PDFTextStripper$c */
    /* loaded from: classes5.dex */
    public static final class C9978c {

        /* renamed from: a */
        public String f60822a;

        /* renamed from: b */
        public List f60823b;

        public C9978c(String str, List list) {
            this.f60822a = str;
            this.f60823b = list;
        }

        /* renamed from: a */
        public String m32104a() {
            return this.f60822a;
        }

        /* renamed from: b */
        public List m32103b() {
            return this.f60823b;
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
            com.tom_roush.pdfbox.text.PDFTextStripper.f60783P = r3     // Catch: java.lang.NumberFormatException -> L4a
            goto L4b
        L4a:
        L4b:
            if (r2 == 0) goto L59
            int r3 = r2.length()
            if (r3 <= 0) goto L59
            float r2 = java.lang.Float.parseFloat(r2)     // Catch: java.lang.NumberFormatException -> L59
            com.tom_roush.pdfbox.text.PDFTextStripper.f60784Q = r2     // Catch: java.lang.NumberFormatException -> L59
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
            com.tom_roush.pdfbox.text.PDFTextStripper.f60785R = r2
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            com.tom_roush.pdfbox.text.PDFTextStripper.f60786S = r2
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
            m32120r(r1)     // Catch: java.lang.Throwable -> L8d java.io.IOException -> L8f
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
        this.f60802o = property;
        this.f60803p = HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR;
        this.f60804q = "";
        this.f60805r = "";
        this.f60806s = "";
        this.f60807t = property;
        this.f60808u = "";
        this.f60809v = "";
        this.f60810w = 0;
        this.f60811x = 1;
        this.f60812y = Integer.MAX_VALUE;
        this.f60813z = null;
        this.f60787A = -1;
        this.f60788B = -1;
        this.f60789C = null;
        this.f60790D = true;
        this.f60791E = true;
        this.f60792F = false;
        this.f60793G = false;
        this.f60794H = f60783P;
        this.f60795I = f60784Q;
        this.f60796J = 0.5f;
        this.f60797K = 0.3f;
        this.f60798L = null;
        this.charactersByArticle = new ArrayList<>();
        this.f60799M = new HashMap();
        this.f60801O = null;
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
    public static void m32120r(InputStream inputStream) {
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
                    f60786S.put(chArr[0], chArr[1]);
                }
            }
        }
    }

    /* renamed from: t */
    private boolean m32118t(float f, float f2, float f3) {
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
    public final C9978c m32131g(String str, List list) {
        return new C9978c(m32122p(str), list);
    }

    public boolean getAddMoreFormatting() {
        return this.f60793G;
    }

    public String getArticleEnd() {
        return this.f60809v;
    }

    public String getArticleStart() {
        return this.f60808u;
    }

    public float getAverageCharTolerance() {
        return this.f60797K;
    }

    public List<List<TextPosition>> getCharactersByArticle() {
        return this.charactersByArticle;
    }

    public int getCurrentPageNo() {
        return this.f60810w;
    }

    public float getDropThreshold() {
        return this.f60795I;
    }

    public PDOutlineItem getEndBookmark() {
        return this.f60789C;
    }

    public int getEndPage() {
        return this.f60812y;
    }

    public float getIndentThreshold() {
        return this.f60794H;
    }

    public String getLineSeparator() {
        return this.f60802o;
    }

    public List<Pattern> getListItemPatterns() {
        if (this.f60801O == null) {
            this.f60801O = new ArrayList();
            for (String str : f60785R) {
                this.f60801O.add(Pattern.compile(str));
            }
        }
        return this.f60801O;
    }

    public Writer getOutput() {
        return this.output;
    }

    public String getPageEnd() {
        return this.f60807t;
    }

    public String getPageStart() {
        return this.f60806s;
    }

    public String getParagraphEnd() {
        return this.f60805r;
    }

    public String getParagraphStart() {
        return this.f60804q;
    }

    public boolean getSeparateByBeads() {
        return this.f60791E;
    }

    public boolean getSortByPosition() {
        return this.f60792F;
    }

    public float getSpacingTolerance() {
        return this.f60796J;
    }

    public PDOutlineItem getStartBookmark() {
        return this.f60813z;
    }

    public int getStartPage() {
        return this.f60811x;
    }

    public boolean getSuppressDuplicateOverlappingText() {
        return this.f60790D;
    }

    public String getText(PDDocument pDDocument) throws IOException {
        StringWriter stringWriter = new StringWriter();
        writeText(pDDocument, stringWriter);
        return stringWriter.toString();
    }

    public String getWordSeparator() {
        return this.f60803p;
    }

    /* renamed from: h */
    public final void m32130h(PDPage pDPage) {
        this.f60798L = new ArrayList();
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
                this.f60798L.add(rectangle);
            } else {
                this.f60798L.add(null);
            }
        }
    }

    /* renamed from: i */
    public final String m32129i(String str) {
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
                            if (f60786S.containsKey(Character.valueOf(charAt))) {
                                sb.append(f60786S.get(Character.valueOf(charAt)));
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
    public final C9977b m32128j(C9977b c9977b, C9977b c9977b2, C9977b c9977b3, float f) {
        c9977b.m32106h();
        m32127k(c9977b, c9977b2, c9977b3, f);
        if (c9977b.m32109e()) {
            if (c9977b2.m32112b()) {
                if (c9977b2.m32110d()) {
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
        return c9977b;
    }

    /* renamed from: k */
    public final void m32127k(C9977b c9977b, C9977b c9977b2, C9977b c9977b3, float f) {
        Pattern m32126l;
        if (c9977b3 != null) {
            float abs = Math.abs(c9977b.m32113a().getYDirAdj() - c9977b2.m32113a().getYDirAdj());
            float m32125m = m32125m(getDropThreshold(), f);
            float xDirAdj = c9977b.m32113a().getXDirAdj() - c9977b3.m32113a().getXDirAdj();
            float m32125m2 = m32125m(getIndentThreshold(), c9977b.m32113a().getWidthOfSpace());
            float m32125m3 = m32125m(0.25f, c9977b.m32113a().getWidth());
            if (abs <= m32125m) {
                if (xDirAdj > m32125m2) {
                    if (c9977b3.m32109e()) {
                        c9977b.m32107g();
                        return;
                    }
                } else if (xDirAdj < (-c9977b.m32113a().getWidthOfSpace())) {
                    if (c9977b3.m32109e()) {
                        return;
                    }
                } else if (Math.abs(xDirAdj) < m32125m3) {
                    if (c9977b3.m32111c()) {
                        c9977b.m32107g();
                        return;
                    } else if (!c9977b3.m32109e() || (m32126l = m32126l(c9977b3)) == null || m32126l != m32126l(c9977b)) {
                        return;
                    }
                } else {
                    return;
                }
            }
        }
        c9977b.m32105i();
    }

    /* renamed from: l */
    public final Pattern m32126l(C9977b c9977b) {
        return matchPattern(c9977b.m32113a().getUnicode(), getListItemPatterns());
    }

    /* renamed from: m */
    public final float m32125m(float f, float f2) {
        return Math.round((f * f2) * 1000.0f) / 1000.0f;
    }

    /* renamed from: n */
    public final List m32124n(List list) {
        LinkedList linkedList = new LinkedList();
        StringBuilder sb = new StringBuilder();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            sb = m32123o(linkedList, sb, arrayList, (C9976a) it.next());
        }
        if (sb.length() > 0) {
            linkedList.add(m32131g(sb.toString(), arrayList));
        }
        return linkedList;
    }

    /* renamed from: o */
    public final StringBuilder m32123o(List list, StringBuilder sb, List list2, C9976a c9976a) {
        if (c9976a.m32114c()) {
            list.add(m32131g(sb.toString(), new ArrayList(list2)));
            StringBuilder sb2 = new StringBuilder();
            list2.clear();
            return sb2;
        }
        TextPosition m32116a = c9976a.m32116a();
        sb.append(m32116a.getUnicode());
        list2.add(m32116a);
        return sb;
    }

    /* renamed from: p */
    public final String m32122p(String str) {
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
            return m32129i(str);
        }
        sb.append((CharSequence) str, i2, i);
        return m32129i(sb.toString());
    }

    @Override // com.tom_roush.pdfbox.text.AbstractC9979a, com.tom_roush.pdfbox.contentstream.PDFStreamEngine
    public void processPage(PDPage pDPage) throws IOException {
        int i = this.f60810w;
        if (i >= this.f60811x && i <= this.f60812y) {
            int i2 = this.f60787A;
            if (i2 == -1 || i >= i2) {
                int i3 = this.f60788B;
                if (i3 == -1 || i <= i3) {
                    startPage(pDPage);
                    int i4 = 1;
                    if (this.f60791E) {
                        m32130h(pDPage);
                        i4 = 1 + (this.f60798L.size() * 2);
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
                    this.f60799M.clear();
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
        PDOutlineItem pDOutlineItem2 = this.f60813z;
        PDPage pDPage = null;
        if (pDOutlineItem2 == null) {
            findDestinationPage = null;
        } else {
            findDestinationPage = pDOutlineItem2.findDestinationPage(this.document);
        }
        if (findDestinationPage != null) {
            this.f60787A = pDPageTree.indexOf(findDestinationPage) + 1;
        } else {
            this.f60787A = -1;
        }
        PDOutlineItem pDOutlineItem3 = this.f60789C;
        if (pDOutlineItem3 != null) {
            pDPage = pDOutlineItem3.findDestinationPage(this.document);
        }
        if (pDPage != null) {
            this.f60788B = pDPageTree.indexOf(pDPage) + 1;
        } else {
            this.f60788B = -1;
        }
        if (this.f60787A == -1 && (pDOutlineItem = this.f60813z) != null && this.f60788B == -1 && this.f60789C != null && pDOutlineItem.getCOSObject() == this.f60789C.getCOSObject()) {
            this.f60787A = 0;
            this.f60788B = 0;
        }
        Iterator<PDPage> it = pDPageTree.iterator();
        while (it.hasNext()) {
            PDPage next = it.next();
            this.f60810w++;
            if (next.hasContents()) {
                processPage(next);
            }
        }
    }

    @Override // com.tom_roush.pdfbox.text.AbstractC9979a
    public void processTextPosition(TextPosition textPosition) {
        int i;
        int i2;
        int i3;
        if (this.f60790D) {
            String unicode = textPosition.getUnicode();
            float x = textPosition.getX();
            float y = textPosition.getY();
            TreeMap treeMap = (TreeMap) this.f60799M.get(unicode);
            if (treeMap == null) {
                treeMap = new TreeMap();
                this.f60799M.put(unicode, treeMap);
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
        if (this.f60791E) {
            int i5 = -1;
            i = -1;
            i2 = -1;
            i3 = -1;
            for (int i6 = 0; i6 < this.f60798L.size() && i5 == -1; i6++) {
                PDRectangle pDRectangle = (PDRectangle) this.f60798L.get(i6);
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
    public final boolean m32121q(float f, float f2, float f3, float f4) {
        if (!m32118t(f, f3, 0.1f) && ((f3 > f || f3 < f - f2) && (f > f3 || f < f3 - f4))) {
            return false;
        }
        return true;
    }

    /* renamed from: s */
    public final void m32119s() {
        this.f60810w = 0;
        this.document = null;
        ArrayList<List<TextPosition>> arrayList = this.charactersByArticle;
        if (arrayList != null) {
            arrayList.clear();
        }
        this.f60799M.clear();
    }

    public void setAddMoreFormatting(boolean z) {
        this.f60793G = z;
    }

    public void setArticleEnd(String str) {
        this.f60809v = str;
    }

    public void setArticleStart(String str) {
        this.f60808u = str;
    }

    public void setAverageCharTolerance(float f) {
        this.f60797K = f;
    }

    public void setDropThreshold(float f) {
        this.f60795I = f;
    }

    public void setEndBookmark(PDOutlineItem pDOutlineItem) {
        this.f60789C = pDOutlineItem;
    }

    public void setEndPage(int i) {
        this.f60812y = i;
    }

    public void setIndentThreshold(float f) {
        this.f60794H = f;
    }

    public void setLineSeparator(String str) {
        this.f60802o = str;
    }

    public void setListItemPatterns(List<Pattern> list) {
        this.f60801O = list;
    }

    public void setPageEnd(String str) {
        this.f60807t = str;
    }

    public void setPageStart(String str) {
        this.f60806s = str;
    }

    public void setParagraphEnd(String str) {
        this.f60805r = str;
    }

    public void setParagraphStart(String str) {
        this.f60804q = str;
    }

    public void setShouldSeparateByBeads(boolean z) {
        this.f60791E = z;
    }

    public void setSortByPosition(boolean z) {
        this.f60792F = z;
    }

    public void setSpacingTolerance(float f) {
        this.f60796J = f;
    }

    public void setStartBookmark(PDOutlineItem pDOutlineItem) {
        this.f60813z = pDOutlineItem;
    }

    public void setStartPage(int i) {
        this.f60811x = i;
    }

    public void setSuppressDuplicateOverlappingText(boolean z) {
        this.f60790D = z;
    }

    public void setWordSeparator(String str) {
        this.f60803p = str;
    }

    public void startArticle() throws IOException {
        startArticle(true);
    }

    public void startDocument(PDDocument pDDocument) throws IOException {
    }

    public void startPage(PDPage pDPage) throws IOException {
    }

    /* renamed from: u */
    public final void m32117u(List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C9978c c9978c = (C9978c) list.get(i);
            writeString(c9978c.m32104a(), c9978c.m32103b());
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
        if (!this.f60800N) {
            writeParagraphStart();
        }
        this.output.write(getParagraphEnd());
        this.f60800N = false;
    }

    public void writeParagraphSeparator() throws IOException {
        writeParagraphEnd();
        writeParagraphStart();
    }

    public void writeParagraphStart() throws IOException {
        if (this.f60800N) {
            writeParagraphEnd();
            this.f60800N = false;
        }
        this.output.write(getParagraphStart());
        this.f60800N = true;
    }

    public void writeString(String str, List<TextPosition> list) throws IOException {
        writeString(str);
    }

    public void writeText(PDDocument pDDocument, Writer writer) throws IOException {
        m32119s();
        this.document = pDDocument;
        this.output = writer;
        if (getAddMoreFormatting()) {
            String str = this.f60802o;
            this.f60805r = str;
            this.f60806s = str;
            this.f60808u = str;
            this.f60809v = str;
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
    public static final class C9976a {

        /* renamed from: b */
        public static C9976a f60814b = new C9976a();

        /* renamed from: a */
        public final TextPosition f60815a;

        public C9976a() {
            this.f60815a = null;
        }

        /* renamed from: b */
        public static C9976a m32115b() {
            return f60814b;
        }

        /* renamed from: a */
        public TextPosition m32116a() {
            return this.f60815a;
        }

        /* renamed from: c */
        public boolean m32114c() {
            if (this.f60815a == null) {
                return true;
            }
            return false;
        }

        public C9976a(TextPosition textPosition) {
            this.f60815a = textPosition;
        }
    }

    public void startArticle(boolean z) throws IOException {
        this.output.write(getArticleStart());
    }

    public void writeString(String str) throws IOException {
        this.output.write(str);
    }
}
