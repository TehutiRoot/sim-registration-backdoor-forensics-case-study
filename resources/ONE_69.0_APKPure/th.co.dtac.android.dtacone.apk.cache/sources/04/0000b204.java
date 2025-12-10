package com.google.firebase.perf.util;

import java.util.NoSuchElementException;

/* loaded from: classes4.dex */
public final class Optional<T> {

    /* renamed from: a */
    public final Object f56286a;

    public Optional() {
        this.f56286a = null;
    }

    public static <T> Optional<T> absent() {
        return new Optional<>();
    }

    public static <T> Optional<T> fromNullable(T t) {
        if (t == null) {
            return absent();
        }
        return m38148of(t);
    }

    /* renamed from: of */
    public static <T> Optional<T> m38148of(T t) {
        return new Optional<>(t);
    }

    public T get() {
        T t = (T) this.f56286a;
        if (t != null) {
            return t;
        }
        throw new NoSuchElementException("No value present");
    }

    public boolean isAvailable() {
        if (this.f56286a != null) {
            return true;
        }
        return false;
    }

    public Optional(Object obj) {
        if (obj != null) {
            this.f56286a = obj;
            return;
        }
        throw new NullPointerException("value for optional is empty.");
    }
}