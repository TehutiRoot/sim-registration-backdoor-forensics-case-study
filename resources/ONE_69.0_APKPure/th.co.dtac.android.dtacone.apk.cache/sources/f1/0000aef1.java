package com.google.firebase.components;

import com.google.firebase.inject.Provider;

/* loaded from: classes4.dex */
public class Lazy<T> implements Provider<T> {

    /* renamed from: c */
    public static final Object f54734c = new Object();

    /* renamed from: a */
    public volatile Object f54735a = f54734c;

    /* renamed from: b */
    public volatile Provider f54736b;

    public Lazy(Provider<T> provider) {
        this.f54736b = provider;
    }

    @Override // com.google.firebase.inject.Provider
    public T get() {
        T t = (T) this.f54735a;
        Object obj = f54734c;
        if (t == obj) {
            synchronized (this) {
                try {
                    t = this.f54735a;
                    if (t == obj) {
                        t = (T) this.f54736b.get();
                        this.f54735a = t;
                        this.f54736b = null;
                    }
                } finally {
                }
            }
        }
        return t;
    }
}