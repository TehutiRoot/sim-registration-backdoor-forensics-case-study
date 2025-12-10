package com.github.barteksc.pdfviewer.source;

import android.content.Context;
import android.net.Uri;
import com.shockwave.pdfium.PdfDocument;
import com.shockwave.pdfium.PdfiumCore;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.io.IOException;

/* loaded from: classes3.dex */
public class UriSource implements DocumentSource {

    /* renamed from: a */
    public Uri f43685a;

    public UriSource(Uri uri) {
        this.f43685a = uri;
    }

    @Override // com.github.barteksc.pdfviewer.source.DocumentSource
    public PdfDocument createDocument(Context context, PdfiumCore pdfiumCore, String str) throws IOException {
        return pdfiumCore.newDocument(context.getContentResolver().openFileDescriptor(this.f43685a, PDPageLabelRange.STYLE_ROMAN_LOWER), str);
    }
}
