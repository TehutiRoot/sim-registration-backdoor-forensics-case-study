package com.tom_roush.fontbox.ttf;

import android.util.Log;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes5.dex */
public class TTFParser {

    /* renamed from: a */
    public boolean f59583a;

    /* renamed from: b */
    public boolean f59584b;

    public TTFParser() {
        this(false);
    }

    /* renamed from: a */
    public TrueTypeFont mo32889a(AbstractC22790wQ1 abstractC22790wQ1) {
        return new TrueTypeFont(abstractC22790wQ1);
    }

    public boolean allowCFF() {
        return false;
    }

    /* renamed from: b */
    public TrueTypeFont mo32888b(AbstractC22790wQ1 abstractC22790wQ1) {
        TrueTypeFont mo32889a = mo32889a(abstractC22790wQ1);
        mo32889a.mo32849k(abstractC22790wQ1.m854j());
        int mo844t = abstractC22790wQ1.mo844t();
        abstractC22790wQ1.mo844t();
        abstractC22790wQ1.mo844t();
        abstractC22790wQ1.mo844t();
        for (int i = 0; i < mo844t; i++) {
            TTFTable m32886d = m32886d(mo32889a, abstractC22790wQ1);
            if (m32886d != null) {
                if (m32886d.getOffset() + m32886d.getLength() > mo32889a.getOriginalDataSize()) {
                    Log.w("PdfBox-Android", "Skip table '" + m32886d.getTag() + "' which goes past the file size; offset: " + m32886d.getOffset() + ", size: " + m32886d.getLength() + ", font size: " + mo32889a.getOriginalDataSize());
                } else {
                    mo32889a.m32854b(m32886d);
                }
            }
        }
        if (!this.f59584b) {
            m32887c(mo32889a);
        }
        return mo32889a;
    }

    /* renamed from: c */
    public final void m32887c(TrueTypeFont trueTypeFont) {
        boolean z;
        for (TTFTable tTFTable : trueTypeFont.getTables()) {
            if (!tTFTable.getInitialized()) {
                trueTypeFont.m32850j(tTFTable);
            }
        }
        if (allowCFF() && trueTypeFont.tables.containsKey(CFFTable.TAG)) {
            z = true;
        } else {
            z = false;
        }
        if (trueTypeFont.getHeader() != null) {
            if (trueTypeFont.getHorizontalHeader() != null) {
                if (trueTypeFont.getMaximumProfile() != null) {
                    if (trueTypeFont.getPostScript() == null && !this.f59583a) {
                        throw new IOException("post is mandatory");
                    }
                    if (!z) {
                        if (trueTypeFont.getIndexToLocation() != null) {
                            if (trueTypeFont.getGlyph() == null) {
                                throw new IOException("glyf is mandatory");
                            }
                        } else {
                            throw new IOException("loca is mandatory");
                        }
                    }
                    if (trueTypeFont.getNaming() == null && !this.f59583a) {
                        throw new IOException("name is mandatory");
                    }
                    if (trueTypeFont.getHorizontalMetrics() != null) {
                        if (!this.f59583a && trueTypeFont.getCmap() == null) {
                            throw new IOException("cmap is mandatory");
                        }
                        return;
                    }
                    throw new IOException("hmtx is mandatory");
                }
                throw new IOException("maxp is mandatory");
            }
            throw new IOException("hhead is mandatory");
        }
        throw new IOException("head is mandatory");
    }

    /* renamed from: d */
    public final TTFTable m32886d(TrueTypeFont trueTypeFont, AbstractC22790wQ1 abstractC22790wQ1) {
        TTFTable readTable;
        String m850n = abstractC22790wQ1.m850n(4);
        if (m850n.equals(CmapTable.TAG)) {
            readTable = new CmapTable(trueTypeFont);
        } else if (m850n.equals(GlyphTable.TAG)) {
            readTable = new GlyphTable(trueTypeFont);
        } else if (m850n.equals(HeaderTable.TAG)) {
            readTable = new HeaderTable(trueTypeFont);
        } else if (m850n.equals(HorizontalHeaderTable.TAG)) {
            readTable = new HorizontalHeaderTable(trueTypeFont);
        } else if (m850n.equals(HorizontalMetricsTable.TAG)) {
            readTable = new HorizontalMetricsTable(trueTypeFont);
        } else if (m850n.equals(IndexToLocationTable.TAG)) {
            readTable = new IndexToLocationTable(trueTypeFont);
        } else if (m850n.equals(MaximumProfileTable.TAG)) {
            readTable = new MaximumProfileTable(trueTypeFont);
        } else if (m850n.equals("name")) {
            readTable = new NamingTable(trueTypeFont);
        } else if (m850n.equals(OS2WindowsMetricsTable.TAG)) {
            readTable = new OS2WindowsMetricsTable(trueTypeFont);
        } else if (m850n.equals(PostScriptTable.TAG)) {
            readTable = new PostScriptTable(trueTypeFont);
        } else if (m850n.equals(DigitalSignatureTable.TAG)) {
            readTable = new DigitalSignatureTable(trueTypeFont);
        } else if (m850n.equals(KerningTable.TAG)) {
            readTable = new KerningTable(trueTypeFont);
        } else if (m850n.equals(VerticalHeaderTable.TAG)) {
            readTable = new VerticalHeaderTable(trueTypeFont);
        } else if (m850n.equals(VerticalMetricsTable.TAG)) {
            readTable = new VerticalMetricsTable(trueTypeFont);
        } else if (m850n.equals(VerticalOriginTable.TAG)) {
            readTable = new VerticalOriginTable(trueTypeFont);
        } else if (m850n.equals(GlyphSubstitutionTable.TAG)) {
            readTable = new GlyphSubstitutionTable(trueTypeFont);
        } else {
            readTable = readTable(trueTypeFont, m850n);
        }
        readTable.m32856e(m850n);
        readTable.m32859b(abstractC22790wQ1.m845s());
        readTable.m32857d(abstractC22790wQ1.m845s());
        readTable.m32858c(abstractC22790wQ1.m845s());
        if (readTable.getLength() == 0 && !m850n.equals(GlyphTable.TAG)) {
            return null;
        }
        return readTable;
    }

    public TrueTypeFont parse(String str) throws IOException {
        return parse(new File(str));
    }

    public TrueTypeFont parseEmbedded(InputStream inputStream) throws IOException {
        this.f59583a = true;
        return mo32888b(new C18907Zr0(inputStream));
    }

    public TTFTable readTable(TrueTypeFont trueTypeFont, String str) {
        return new TTFTable(trueTypeFont);
    }

    public TTFParser(boolean z) {
        this(z, false);
    }

    public TrueTypeFont parse(File file) throws IOException {
        C21829qr1 c21829qr1 = new C21829qr1(file, PDPageLabelRange.STYLE_ROMAN_LOWER);
        try {
            return mo32888b(c21829qr1);
        } catch (IOException e) {
            c21829qr1.close();
            throw e;
        }
    }

    public TTFParser(boolean z, boolean z2) {
        this.f59583a = z;
        this.f59584b = z2;
    }

    public TrueTypeFont parse(InputStream inputStream) throws IOException {
        return mo32888b(new C18907Zr0(inputStream));
    }
}
