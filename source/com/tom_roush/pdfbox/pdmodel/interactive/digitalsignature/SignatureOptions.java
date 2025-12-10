package com.tom_roush.pdfbox.pdmodel.interactive.digitalsignature;

import com.tom_roush.pdfbox.cos.COSDocument;
import com.tom_roush.pdfbox.p019io.RandomAccessBuffer;
import com.tom_roush.pdfbox.p019io.RandomAccessBufferedFileInputStream;
import com.tom_roush.pdfbox.p019io.RandomAccessRead;
import com.tom_roush.pdfbox.pdfparser.PDFParser;
import com.tom_roush.pdfbox.pdmodel.interactive.digitalsignature.visible.PDVisibleSigProperties;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes5.dex */
public class SignatureOptions implements Closeable {
    public static final int DEFAULT_SIGNATURE_SIZE = 9472;

    /* renamed from: a */
    public COSDocument f60633a;

    /* renamed from: b */
    public int f60634b;

    /* renamed from: d */
    public RandomAccessRead f60636d = null;

    /* renamed from: c */
    public int f60635c = 0;

    /* renamed from: b */
    public final void m32282b(RandomAccessRead randomAccessRead) {
        this.f60636d = randomAccessRead;
        PDFParser pDFParser = new PDFParser(this.f60636d);
        pDFParser.parse();
        this.f60633a = pDFParser.getDocument();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        try {
            COSDocument cOSDocument = this.f60633a;
            if (cOSDocument != null) {
                cOSDocument.close();
            }
        } finally {
            RandomAccessRead randomAccessRead = this.f60636d;
            if (randomAccessRead != null) {
                randomAccessRead.close();
            }
        }
    }

    public int getPage() {
        return this.f60635c;
    }

    public int getPreferredSignatureSize() {
        return this.f60634b;
    }

    public COSDocument getVisualSignature() {
        return this.f60633a;
    }

    public void setPage(int i) {
        this.f60635c = i;
    }

    public void setPreferredSignatureSize(int i) {
        if (i > 0) {
            this.f60634b = i;
        }
    }

    public void setVisualSignature(File file) throws IOException {
        m32282b(new RandomAccessBufferedFileInputStream(file));
    }

    public void setVisualSignature(InputStream inputStream) throws IOException {
        m32282b(new RandomAccessBuffer(inputStream));
    }

    public void setVisualSignature(PDVisibleSigProperties pDVisibleSigProperties) throws IOException {
        setVisualSignature(pDVisibleSigProperties.getVisibleSignature());
    }
}
