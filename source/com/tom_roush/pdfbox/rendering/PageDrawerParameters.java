package com.tom_roush.pdfbox.rendering;

import com.tom_roush.pdfbox.pdmodel.PDPage;

/* loaded from: classes5.dex */
public final class PageDrawerParameters {

    /* renamed from: a */
    public final PDFRenderer f60774a;

    /* renamed from: b */
    public final PDPage f60775b;

    /* renamed from: c */
    public final boolean f60776c;

    /* renamed from: d */
    public final RenderDestination f60777d;

    /* renamed from: e */
    public final float f60778e;

    public PageDrawerParameters(PDFRenderer pDFRenderer, PDPage pDPage, boolean z, RenderDestination renderDestination, float f) {
        this.f60774a = pDFRenderer;
        this.f60775b = pDPage;
        this.f60776c = z;
        this.f60777d = renderDestination;
        this.f60778e = f;
    }

    /* renamed from: a */
    public PDFRenderer m32133a() {
        return this.f60774a;
    }

    public RenderDestination getDestination() {
        return this.f60777d;
    }

    public float getImageDownscalingOptimizationThreshold() {
        return this.f60778e;
    }

    public PDPage getPage() {
        return this.f60775b;
    }

    public boolean isSubsamplingAllowed() {
        return this.f60776c;
    }
}
