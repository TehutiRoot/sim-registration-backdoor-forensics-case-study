package com.tom_roush.fontbox.ttf;

import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes5.dex */
public class TrueTypeCollection implements Closeable {

    /* renamed from: a */
    public final AbstractC22342tR1 f59609a;

    /* renamed from: b */
    public final int f59610b;

    /* renamed from: c */
    public final long[] f59611c;

    /* loaded from: classes5.dex */
    public interface TrueTypeFontProcessor {
        void process(TrueTypeFont trueTypeFont) throws IOException;
    }

    public TrueTypeCollection(File file) throws IOException {
        this(new C21376ns1(file, PDPageLabelRange.STYLE_ROMAN_LOWER));
    }

    /* renamed from: b */
    public final TrueTypeFont m32847b(int i) {
        TTFParser tTFParser;
        this.f59609a.seek(this.f59611c[i]);
        if (this.f59609a.m22683p().equals("OTTO")) {
            tTFParser = new OTFParser(false, true);
        } else {
            tTFParser = new TTFParser(false, true);
        }
        this.f59609a.seek(this.f59611c[i]);
        return tTFParser.mo32880b(new C22169sR1(this.f59609a));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f59609a.close();
    }

    public TrueTypeFont getFontByName(String str) throws IOException {
        for (int i = 0; i < this.f59610b; i++) {
            TrueTypeFont m32847b = m32847b(i);
            if (m32847b.getName().equals(str)) {
                return m32847b;
            }
        }
        return null;
    }

    public void processAllFonts(TrueTypeFontProcessor trueTypeFontProcessor) throws IOException {
        for (int i = 0; i < this.f59610b; i++) {
            trueTypeFontProcessor.process(m32847b(i));
        }
    }

    public TrueTypeCollection(InputStream inputStream) throws IOException {
        this(new C19991fs0(inputStream));
    }

    public TrueTypeCollection(AbstractC22342tR1 abstractC22342tR1) {
        this.f59609a = abstractC22342tR1;
        if (abstractC22342tR1.m22683p().equals("ttcf")) {
            float m22689j = abstractC22342tR1.m22689j();
            int m22680s = (int) abstractC22342tR1.m22680s();
            this.f59610b = m22680s;
            if (m22680s > 0 && m22680s <= 1024) {
                this.f59611c = new long[m22680s];
                for (int i = 0; i < this.f59610b; i++) {
                    this.f59611c[i] = abstractC22342tR1.m22680s();
                }
                if (m22689j >= 2.0f) {
                    abstractC22342tR1.mo22679t();
                    abstractC22342tR1.mo22679t();
                    abstractC22342tR1.mo22679t();
                    return;
                }
                return;
            }
            throw new IOException("Invalid number of fonts " + m22680s);
        }
        throw new IOException("Missing TTC header");
    }
}