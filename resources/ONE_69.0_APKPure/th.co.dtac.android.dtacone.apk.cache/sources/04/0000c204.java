package com.tom_roush.pdfbox.pdmodel.font;

import org.apache.commons.cli.HelpFormatter;

/* loaded from: classes5.dex */
public final class CIDSystemInfo {

    /* renamed from: a */
    public final String f60355a;

    /* renamed from: b */
    public final String f60356b;

    /* renamed from: c */
    public final int f60357c;

    public CIDSystemInfo(String str, String str2, int i) {
        this.f60355a = str;
        this.f60356b = str2;
        this.f60357c = i;
    }

    public String getOrdering() {
        return this.f60356b;
    }

    public String getRegistry() {
        return this.f60355a;
    }

    public int getSupplement() {
        return this.f60357c;
    }

    public String toString() {
        return getRegistry() + HelpFormatter.DEFAULT_OPT_PREFIX + getOrdering() + HelpFormatter.DEFAULT_OPT_PREFIX + getSupplement();
    }
}