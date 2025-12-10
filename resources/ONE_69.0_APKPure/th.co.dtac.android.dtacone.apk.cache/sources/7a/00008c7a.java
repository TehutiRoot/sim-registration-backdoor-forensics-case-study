package com.google.android.gms.common.internal;

import android.net.Uri;

/* loaded from: classes3.dex */
public final class zzu {

    /* renamed from: a */
    public static final Uri f45207a;

    /* renamed from: b */
    public static final Uri f45208b;

    static {
        Uri parse = Uri.parse("https://plus.google.com/");
        f45207a = parse;
        f45208b = parse.buildUpon().appendPath("circles").appendPath("find").build();
    }
}