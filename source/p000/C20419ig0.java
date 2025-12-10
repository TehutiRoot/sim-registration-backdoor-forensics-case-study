package p000;

import com.google.common.base.Preconditions;
import com.google.common.base.Supplier;
import com.google.common.collect.ForwardingSet;
import java.util.Set;

/* renamed from: ig0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C20419ig0 extends ForwardingSet {

    /* renamed from: a */
    public final Supplier f62863a;

    /* renamed from: b */
    public final Set f62864b;

    /* renamed from: c */
    public final Supplier f62865c;

    public C20419ig0(Set set, Supplier supplier, Supplier supplier2) {
        this.f62864b = set;
        this.f62863a = supplier;
        this.f62865c = supplier2;
    }

    /* renamed from: e */
    public static final C20419ig0 m30613e(Set set, Supplier supplier, Supplier supplier2) {
        return new C20419ig0((Set) Preconditions.checkNotNull(set), (Supplier) Preconditions.checkNotNull(supplier), (Supplier) Preconditions.checkNotNull(supplier2));
    }

    /* renamed from: f */
    public final void m30612f() {
        if (((Boolean) this.f62863a.get()).booleanValue()) {
            return;
        }
        throw new IllegalStateException((String) this.f62865c.get());
    }

    @Override // com.google.common.collect.ForwardingSet, java.util.Collection, java.util.Set
    public int hashCode() {
        return this.f62864b.hashCode();
    }

    @Override // com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
    public Set delegate() {
        m30612f();
        return this.f62864b;
    }
}
