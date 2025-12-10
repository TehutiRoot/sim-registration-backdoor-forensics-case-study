package p000;

import com.tom_roush.fontbox.ttf.CmapLookup;
import com.tom_roush.fontbox.ttf.CmapSubtable;
import com.tom_roush.fontbox.ttf.GlyphTable;
import com.tom_roush.fontbox.ttf.HeaderTable;
import com.tom_roush.fontbox.ttf.HorizontalHeaderTable;
import com.tom_roush.fontbox.ttf.HorizontalMetricsTable;
import com.tom_roush.fontbox.ttf.IndexToLocationTable;
import com.tom_roush.fontbox.ttf.MaximumProfileTable;
import com.tom_roush.fontbox.ttf.OS2WindowsMetricsTable;
import com.tom_roush.fontbox.ttf.TTFParser;
import com.tom_roush.fontbox.ttf.TTFSubsetter;
import com.tom_roush.fontbox.ttf.TrueTypeFont;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSInputStream;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.p019io.IOUtils;
import com.tom_roush.pdfbox.pdmodel.PDDocument;
import com.tom_roush.pdfbox.pdmodel.common.PDStream;
import com.tom_roush.pdfbox.pdmodel.font.PDFontDescriptor;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: IV1 */
/* loaded from: classes5.dex */
public abstract class IV1 {

    /* renamed from: a */
    public final PDDocument f2525a;

    /* renamed from: b */
    public TrueTypeFont f2526b;

    /* renamed from: c */
    public PDFontDescriptor f2527c;

    /* renamed from: d */
    public final CmapSubtable f2528d;

    /* renamed from: e */
    public final CmapLookup f2529e;

    /* renamed from: f */
    public final Set f2530f = new HashSet();

    /* renamed from: g */
    public final boolean f2531g;

    public IV1(PDDocument pDDocument, COSDictionary cOSDictionary, TrueTypeFont trueTypeFont, boolean z) {
        this.f2525a = pDDocument;
        this.f2531g = z;
        this.f2526b = trueTypeFont;
        this.f2527c = m67903d(trueTypeFont);
        if (m67900g(trueTypeFont)) {
            if (!z) {
                InputStream originalData = trueTypeFont.getOriginalData();
                byte[] bArr = new byte[4];
                originalData.mark(4);
                if (originalData.read(bArr) == 4 && new String(bArr).equals("ttcf")) {
                    originalData.close();
                    throw new IOException("Full embedding of TrueType font collections not supported");
                }
                if (originalData.markSupported()) {
                    originalData.reset();
                } else {
                    originalData.close();
                    originalData = trueTypeFont.getOriginalData();
                }
                PDStream pDStream = new PDStream(pDDocument, originalData, COSName.FLATE_DECODE);
                pDStream.getCOSObject().setLong(COSName.LENGTH1, trueTypeFont.getOriginalDataSize());
                this.f2527c.setFontFile2(pDStream);
            }
            cOSDictionary.setName(COSName.BASE_FONT, trueTypeFont.getName());
            this.f2528d = trueTypeFont.getUnicodeCmap();
            this.f2529e = trueTypeFont.getUnicodeCmapLookup();
            return;
        }
        throw new IOException("This font does not permit embedding");
    }

    /* renamed from: a */
    public void m67905a(int i) {
        this.f2530f.add(Integer.valueOf(i));
    }

    /* renamed from: b */
    public void m67904b(InputStream inputStream) {
        COSInputStream cOSInputStream;
        PDStream pDStream = new PDStream(this.f2525a, inputStream, COSName.FLATE_DECODE);
        try {
            cOSInputStream = pDStream.createInputStream();
        } catch (Throwable th2) {
            th = th2;
            cOSInputStream = null;
        }
        try {
            TrueTypeFont parseEmbedded = new TTFParser().parseEmbedded(cOSInputStream);
            this.f2526b = parseEmbedded;
            if (m67900g(parseEmbedded)) {
                if (this.f2527c == null) {
                    this.f2527c = m67903d(this.f2526b);
                }
                IOUtils.closeQuietly(cOSInputStream);
                pDStream.getCOSObject().setLong(COSName.LENGTH1, this.f2526b.getOriginalDataSize());
                this.f2527c.setFontFile2(pDStream);
                return;
            }
            throw new IOException("This font does not permit embedding");
        } catch (Throwable th3) {
            th = th3;
            IOUtils.closeQuietly(cOSInputStream);
            throw th;
        }
    }

    /* renamed from: c */
    public abstract void mo23441c(InputStream inputStream, String str, Map map);

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0057, code lost:
        if (r3 != 5) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ed  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.tom_roush.pdfbox.pdmodel.font.PDFontDescriptor m67903d(com.tom_roush.fontbox.ttf.TrueTypeFont r11) {
        /*
            Method dump skipped, instructions count: 394
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.IV1.m67903d(com.tom_roush.fontbox.ttf.TrueTypeFont):com.tom_roush.pdfbox.pdmodel.font.PDFontDescriptor");
    }

    /* renamed from: e */
    public PDFontDescriptor m67902e() {
        return this.f2527c;
    }

    /* renamed from: f */
    public String m67901f(Map map) {
        long hashCode = map.hashCode();
        StringBuilder sb = new StringBuilder();
        while (true) {
            long j = hashCode / 25;
            sb.append("BCDEFGHIJKLMNOPQRSTUVWXYZ".charAt((int) (hashCode % 25)));
            if (j == 0 || sb.length() >= 6) {
                break;
            }
            hashCode = j;
        }
        while (sb.length() < 6) {
            sb.insert(0, 'A');
        }
        sb.append('+');
        return sb.toString();
    }

    /* renamed from: g */
    public boolean m67900g(TrueTypeFont trueTypeFont) {
        if (trueTypeFont.getOS2Windows() != null) {
            short fsType = trueTypeFont.getOS2Windows().getFsType();
            if ((fsType & 15) == 2 || (fsType & OS2WindowsMetricsTable.FSTYPE_BITMAP_ONLY) == 512) {
                return false;
            }
            return true;
        }
        return true;
    }

    /* renamed from: h */
    public final boolean m67899h(TrueTypeFont trueTypeFont) {
        if (trueTypeFont.getOS2Windows() != null && (trueTypeFont.getOS2Windows().getFsType() & OS2WindowsMetricsTable.FSTYPE_NO_SUBSETTING) == 256) {
            return false;
        }
        return true;
    }

    /* renamed from: i */
    public boolean m67898i() {
        return this.f2531g;
    }

    /* renamed from: j */
    public void m67897j() {
        if (m67899h(this.f2526b)) {
            if (this.f2531g) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(HeaderTable.TAG);
                arrayList.add(HorizontalHeaderTable.TAG);
                arrayList.add(IndexToLocationTable.TAG);
                arrayList.add(MaximumProfileTable.TAG);
                arrayList.add("cvt ");
                arrayList.add("prep");
                arrayList.add(GlyphTable.TAG);
                arrayList.add(HorizontalMetricsTable.TAG);
                arrayList.add("fpgm");
                arrayList.add("gasp");
                TTFSubsetter tTFSubsetter = new TTFSubsetter(this.f2526b, arrayList);
                tTFSubsetter.addAll(this.f2530f);
                Map<Integer, Integer> gIDMap = tTFSubsetter.getGIDMap();
                String m67901f = m67901f(gIDMap);
                tTFSubsetter.setPrefix(m67901f);
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                tTFSubsetter.writeToStream(byteArrayOutputStream);
                mo23441c(new ByteArrayInputStream(byteArrayOutputStream.toByteArray()), m67901f, gIDMap);
                this.f2526b.close();
                return;
            }
            throw new IllegalStateException("Subsetting is disabled");
        }
        throw new IOException("This font does not permit subsetting");
    }
}
