package p000;

import com.google.firebase.inject.Provider;
import java.util.Collection;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: Gi0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C17698Gi0 implements Provider {

    /* renamed from: b */
    public volatile Set f2059b = null;

    /* renamed from: a */
    public volatile Set f2058a = Collections.newSetFromMap(new ConcurrentHashMap());

    public C17698Gi0(Collection collection) {
        this.f2058a.addAll(collection);
    }

    /* renamed from: b */
    public static C17698Gi0 m68251b(Collection collection) {
        return new C17698Gi0((Set) collection);
    }

    /* renamed from: a */
    public synchronized void m68252a(Provider provider) {
        try {
            if (this.f2059b == null) {
                this.f2058a.add(provider);
            } else {
                this.f2059b.add(provider.get());
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.google.firebase.inject.Provider
    /* renamed from: c */
    public Set get() {
        if (this.f2059b == null) {
            synchronized (this) {
                try {
                    if (this.f2059b == null) {
                        this.f2059b = Collections.newSetFromMap(new ConcurrentHashMap());
                        m68249d();
                    }
                } finally {
                }
            }
        }
        return Collections.unmodifiableSet(this.f2059b);
    }

    /* renamed from: d */
    public final synchronized void m68249d() {
        try {
            for (Provider provider : this.f2058a) {
                this.f2059b.add(provider.get());
            }
            this.f2058a = null;
        } catch (Throwable th2) {
            throw th2;
        }
    }
}