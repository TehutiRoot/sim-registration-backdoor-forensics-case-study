package com.tom_roush.pdfbox.pdmodel.font;

import org.apache.commons.cli.HelpFormatter;

/* loaded from: classes5.dex */
public final class CIDSystemInfo {

    /* renamed from: a */
    public final String f60343a;

    /* renamed from: b */
    public final String f60344b;

    /* renamed from: c */
    public final int f60345c;

    public CIDSystemInfo(String str, String str2, int i) {
        this.f60343a = str;
        this.f60344b = str2;
        this.f60345c = i;
    }

    public String getOrdering() {
        return this.f60344b;
    }

    public String getRegistry() {
        return this.f60343a;
    }

    public int getSupplement() {
        return this.f60345c;
    }

    public String toString() {
        return getRegistry() + HelpFormatter.DEFAULT_OPT_PREFIX + getOrdering() + HelpFormatter.DEFAULT_OPT_PREFIX + getSupplement();
    }
}
