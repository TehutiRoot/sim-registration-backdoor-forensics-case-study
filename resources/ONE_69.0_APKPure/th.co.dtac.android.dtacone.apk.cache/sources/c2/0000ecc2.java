package p000;

import com.google.common.base.Preconditions;
import com.google.common.base.Supplier;
import com.google.common.collect.ForwardingSet;
import java.util.Set;

/* renamed from: og0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C21512og0 extends ForwardingSet {

    /* renamed from: a */
    public final Supplier f72844a;

    /* renamed from: b */
    public final Set f72845b;

    /* renamed from: c */
    public final Supplier f72846c;

    public C21512og0(Set set, Supplier supplier, Supplier supplier2) {
        this.f72845b = set;
        this.f72844a = supplier;
        this.f72846c = supplier2;
    }

    /* renamed from: e */
    public static final C21512og0 m26089e(Set set, Supplier supplier, Supplier supplier2) {
        return new C21512og0((Set) Preconditions.checkNotNull(set), (Supplier) Preconditions.checkNotNull(supplier), (Supplier) Preconditions.checkNotNull(supplier2));
    }

    /* renamed from: f */
    public final void m26088f() {
        if (((Boolean) this.f72844a.get()).booleanValue()) {
            return;
        }
        throw new IllegalStateException((String) this.f72846c.get());
    }

    @Override // com.google.common.collect.ForwardingSet, java.util.Collection, java.util.Set
    public int hashCode() {
        return this.f72845b.hashCode();
    }

    @Override // com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
    public Set delegate() {
        m26088f();
        return this.f72845b;
    }
}