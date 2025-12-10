package com.google.api.client.util;

/* loaded from: classes4.dex */
public final class Joiner {

    /* renamed from: a */
    public final com.google.common.base.Joiner f52329a;

    public Joiner(com.google.common.base.Joiner joiner) {
        this.f52329a = joiner;
    }

    /* renamed from: on */
    public static Joiner m41698on(char c) {
        return new Joiner(com.google.common.base.Joiner.m41323on(c));
    }

    public final String join(Iterable<?> iterable) {
        return this.f52329a.join((Iterable<? extends Object>) iterable);
    }
}
