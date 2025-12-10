package com.google.android.gms.common.internal;

import android.net.Uri;

/* loaded from: classes3.dex */
public final class zzu {

    /* renamed from: a */
    public static final Uri f45195a;

    /* renamed from: b */
    public static final Uri f45196b;

    static {
        Uri parse = Uri.parse("https://plus.google.com/");
        f45195a = parse;
        f45196b = parse.buildUpon().appendPath("circles").appendPath("find").build();
    }
}
