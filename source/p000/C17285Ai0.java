package p000;

import com.google.firebase.inject.Provider;
import java.util.Collection;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: Ai0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C17285Ai0 implements Provider {

    /* renamed from: b */
    public volatile Set f174b = null;

    /* renamed from: a */
    public volatile Set f173a = Collections.newSetFromMap(new ConcurrentHashMap());

    public C17285Ai0(Collection collection) {
        this.f173a.addAll(collection);
    }

    /* renamed from: b */
    public static C17285Ai0 m69058b(Collection collection) {
        return new C17285Ai0((Set) collection);
    }

    /* renamed from: a */
    public synchronized void m69059a(Provider provider) {
        try {
            if (this.f174b == null) {
                this.f173a.add(provider);
            } else {
                this.f174b.add(provider.get());
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.google.firebase.inject.Provider
    /* renamed from: c */
    public Set get() {
        if (this.f174b == null) {
            synchronized (this) {
                try {
                    if (this.f174b == null) {
                        this.f174b = Collections.newSetFromMap(new ConcurrentHashMap());
                        m69056d();
                    }
                } finally {
                }
            }
        }
        return Collections.unmodifiableSet(this.f174b);
    }

    /* renamed from: d */
    public final synchronized void m69056d() {
        try {
            for (Provider provider : this.f173a) {
                this.f174b.add(provider.get());
            }
            this.f173a = null;
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
