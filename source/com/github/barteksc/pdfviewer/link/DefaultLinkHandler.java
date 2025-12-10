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
    public static final String f43650b = "DefaultLinkHandler";

    /* renamed from: a */
    public PDFView f43651a;

    public DefaultLinkHandler(PDFView pDFView) {
        this.f43651a = pDFView;
    }

    /* renamed from: a */
    public final void m49307a(int i) {
        this.f43651a.jumpTo(i);
    }

    /* renamed from: b */
    public final void m49306b(String str) {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
        Context context = this.f43651a.getContext();
        if (intent.resolveActivity(context.getPackageManager()) != null) {
            context.startActivity(intent);
            return;
        }
        String str2 = f43650b;
        Log.w(str2, "No activity found for URI: " + str);
    }

    @Override // com.github.barteksc.pdfviewer.link.LinkHandler
    public void handleLinkEvent(LinkTapEvent linkTapEvent) {
        String uri = linkTapEvent.getLink().getUri();
        Integer destPageIdx = linkTapEvent.getLink().getDestPageIdx();
        if (uri != null && !uri.isEmpty()) {
            m49306b(uri);
        } else if (destPageIdx != null) {
            m49307a(destPageIdx.intValue());
        }
    }
}
