package com.tom_roush.fontbox.ttf;

import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes5.dex */
public class TrueTypeCollection implements Closeable {

    /* renamed from: a */
    public final AbstractC22790wQ1 f59597a;

    /* renamed from: b */
    public final int f59598b;

    /* renamed from: c */
    public final long[] f59599c;

    /* loaded from: classes5.dex */
    public interface TrueTypeFontProcessor {
        void process(TrueTypeFont trueTypeFont) throws IOException;
    }

    public TrueTypeCollection(File file) throws IOException {
        this(new C21829qr1(file, PDPageLabelRange.STYLE_ROMAN_LOWER));
    }

    /* renamed from: b */
    public final TrueTypeFont m32855b(int i) {
        TTFParser tTFParser;
        this.f59597a.seek(this.f59599c[i]);
        if (this.f59597a.m848p().equals("OTTO")) {
            tTFParser = new OTFParser(false, true);
        } else {
            tTFParser = new TTFParser(false, true);
        }
        this.f59597a.seek(this.f59599c[i]);
        return tTFParser.mo32888b(new C22618vQ1(this.f59597a));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f59597a.close();
    }

    public TrueTypeFont getFontByName(String str) throws IOException {
        for (int i = 0; i < this.f59598b; i++) {
            TrueTypeFont m32855b = m32855b(i);
            if (m32855b.getName().equals(str)) {
                return m32855b;
            }
        }
        return null;
    }

    public void processAllFonts(TrueTypeFontProcessor trueTypeFontProcessor) throws IOException {
        for (int i = 0; i < this.f59598b; i++) {
            trueTypeFontProcessor.process(m32855b(i));
        }
    }

    public TrueTypeCollection(InputStream inputStream) throws IOException {
        this(new C18907Zr0(inputStream));
    }

    public TrueTypeCollection(AbstractC22790wQ1 abstractC22790wQ1) {
        this.f59597a = abstractC22790wQ1;
        if (abstractC22790wQ1.m848p().equals("ttcf")) {
            float m854j = abstractC22790wQ1.m854j();
            int m845s = (int) abstractC22790wQ1.m845s();
            this.f59598b = m845s;
            if (m845s > 0 && m845s <= 1024) {
                this.f59599c = new long[m845s];
                for (int i = 0; i < this.f59598b; i++) {
                    this.f59599c[i] = abstractC22790wQ1.m845s();
                }
                if (m854j >= 2.0f) {
                    abstractC22790wQ1.mo844t();
                    abstractC22790wQ1.mo844t();
                    abstractC22790wQ1.mo844t();
                    return;
                }
                return;
            }
            throw new IOException("Invalid number of fonts " + m845s);
        }
        throw new IOException("Missing TTC header");
    }
}
