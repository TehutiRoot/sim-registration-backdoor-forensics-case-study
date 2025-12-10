package com.github.barteksc.pdfviewer.source;

import android.content.Context;
import com.github.barteksc.pdfviewer.util.Util;
import com.shockwave.pdfium.PdfDocument;
import com.shockwave.pdfium.PdfiumCore;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes3.dex */
public class InputStreamSource implements DocumentSource {

    /* renamed from: a */
    public InputStream f43696a;

    public InputStreamSource(InputStream inputStream) {
        this.f43696a = inputStream;
    }

    @Override // com.github.barteksc.pdfviewer.source.DocumentSource
    public PdfDocument createDocument(Context context, PdfiumCore pdfiumCore, String str) throws IOException {
        return pdfiumCore.newDocument(Util.toByteArray(this.f43696a), str);
    }
}