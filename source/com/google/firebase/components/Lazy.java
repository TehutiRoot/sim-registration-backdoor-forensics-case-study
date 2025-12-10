package com.google.firebase.components;

import com.google.firebase.inject.Provider;

/* loaded from: classes4.dex */
public class Lazy<T> implements Provider<T> {

    /* renamed from: c */
    public static final Object f54722c = new Object();

    /* renamed from: a */
    public volatile Object f54723a = f54722c;

    /* renamed from: b */
    public volatile Provider f54724b;

    public Lazy(Provider<T> provider) {
        this.f54724b = provider;
    }

    @Override // com.google.firebase.inject.Provider
    public T get() {
        T t = (T) this.f54723a;
        Object obj = f54722c;
        if (t == obj) {
            synchronized (this) {
                try {
                    t = this.f54723a;
                    if (t == obj) {
                        t = (T) this.f54724b.get();
                        this.f54723a = t;
                        this.f54724b = null;
                    }
                } finally {
                }
            }
        }
        return t;
    }
}
