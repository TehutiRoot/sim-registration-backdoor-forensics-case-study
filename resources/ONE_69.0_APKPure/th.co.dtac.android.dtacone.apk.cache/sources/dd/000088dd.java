package com.github.barteksc.pdfviewer.link;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import com.github.barteksc.pdfviewer.PDFView;
import com.github.barteksc.pdfviewer.model.LinkTapEvent;

/* loaded from: classes3.dex */
public class DefaultLinkHandler implements LinkHandler {

    /* renamed from: b */
    public static final String f43662b = "DefaultLinkHandler";

    /* renamed from: a */
    public PDFView f43663a;

    public DefaultLinkHandler(PDFView pDFView) {
        this.f43663a = pDFView;
    }

    /* renamed from: a */
    public final void m49304a(int i) {
        this.f43663a.jumpTo(i);
    }

    /* renamed from: b */
    public final void m49303b(String str) {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
        Context context = this.f43663a.getContext();
        if (intent.resolveActivity(context.getPackageManager()) != null) {
            context.startActivity(intent);
            return;
        }
        String str2 = f43662b;
        Log.w(str2, "No activity found for URI: " + str);
    }

    @Override // com.github.barteksc.pdfviewer.link.LinkHandler
    public void handleLinkEvent(LinkTapEvent linkTapEvent) {
        String uri = linkTapEvent.getLink().getUri();
        Integer destPageIdx = linkTapEvent.getLink().getDestPageIdx();
        if (uri != null && !uri.isEmpty()) {
            m49303b(uri);
        } else if (destPageIdx != null) {
            m49304a(destPageIdx.intValue());
        }
    }
}