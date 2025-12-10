package com.github.barteksc.pdfviewer.source;

import android.content.Context;
import com.shockwave.pdfium.PdfDocument;
import com.shockwave.pdfium.PdfiumCore;
import java.io.IOException;

/* loaded from: classes3.dex */
public class ByteArraySource implements DocumentSource {

    /* renamed from: a */
    public byte[] f43682a;

    public ByteArraySource(byte[] bArr) {
        this.f43682a = bArr;
    }

    @Override // com.github.barteksc.pdfviewer.source.DocumentSource
    public PdfDocument createDocument(Context context, PdfiumCore pdfiumCore, String str) throws IOException {
        return pdfiumCore.newDocument(this.f43682a, str);
    }
}
