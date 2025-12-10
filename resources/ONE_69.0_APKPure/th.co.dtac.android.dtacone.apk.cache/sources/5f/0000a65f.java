package com.google.api.client.util;

/* loaded from: classes4.dex */
public final class Joiner {

    /* renamed from: a */
    public final com.google.common.base.Joiner f52341a;

    public Joiner(com.google.common.base.Joiner joiner) {
        this.f52341a = joiner;
    }

    /* renamed from: on */
    public static Joiner m41685on(char c) {
        return new Joiner(com.google.common.base.Joiner.m41310on(c));
    }

    public final String join(Iterable<?> iterable) {
        return this.f52341a.join((Iterable<? extends Object>) iterable);
    }
}