package com.google.android.gms.internal.clearcut;

import java.util.Collections;
import java.util.Map;

/* loaded from: classes3.dex */
public final class zzbt {

    /* renamed from: b */
    public static final Class f45554b = m48169a();

    /* renamed from: c */
    public static final zzbt f45555c = new zzbt(true);

    /* renamed from: a */
    public final Map f45556a = Collections.emptyMap();

    public zzbt(boolean z) {
    }

    /* renamed from: a */
    public static Class m48169a() {
        try {
            return Class.forName("com.google.protobuf.Extension");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public static zzbt zzan() {
        return AbstractC17787Ie2.m67885b();
    }
}
