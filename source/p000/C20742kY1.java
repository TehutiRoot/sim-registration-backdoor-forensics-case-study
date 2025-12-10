package p000;

import com.google.common.base.Preconditions;
import com.google.common.collect.HashMultiset;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Multiset;
import java.lang.ref.Reference;
import java.lang.ref.SoftReference;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: kY1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C20742kY1 extends AbstractC16938w0 {

    /* renamed from: b */
    public transient Reference f67936b;

    /* renamed from: kY1$a */
    /* loaded from: classes4.dex */
    public class C11662a extends AbstractC19839fG0 {

        /* renamed from: c */
        public final /* synthetic */ Object f67937c;

        /* renamed from: d */
        public final /* synthetic */ C20742kY1 f67938d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11662a(C20742kY1 c20742kY1, Map map, Object obj, Object obj2) {
            super(map, obj);
            this.f67937c = obj2;
            this.f67938d = c20742kY1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.f67938d.m28920n().count(this.f67937c);
        }
    }

    public C20742kY1(Map map) {
        super(map);
    }

    /* renamed from: o */
    private static Object m28919o(Reference reference) {
        if (reference == null) {
            return null;
        }
        return reference.get();
    }

    /* renamed from: p */
    public static C20742kY1 m28918p() {
        return new C20742kY1(new HashMap(2, 1.0f));
    }

    /* renamed from: q */
    public static C20742kY1 m28917q(Map map) {
        return new C20742kY1(ImmutableMap.copyOf(map));
    }

    @Override // p000.InterfaceC19154bH0
    /* renamed from: a */
    public Set mo26460a() {
        return Collections.unmodifiableSet(m28920n().elementSet());
    }

    @Override // p000.AbstractC16938w0, p000.InterfaceC19154bH0
    /* renamed from: f */
    public Object mo949f(Object obj) {
        Object mo949f = super.mo949f(obj);
        Multiset multiset = (Multiset) m28919o(this.f67936b);
        if (multiset != null) {
            Preconditions.checkState(multiset.remove(mo949f));
        }
        return mo949f;
    }

    @Override // p000.AbstractC16938w0, p000.InterfaceC19154bH0
    /* renamed from: h */
    public Object mo947h(Object obj, boolean z) {
        if (!z) {
            return mo949f(obj);
        }
        return null;
    }

    @Override // p000.AbstractC16938w0, p000.InterfaceC19154bH0
    /* renamed from: i */
    public void mo946i(Object obj, Object obj2) {
        super.mo946i(obj, obj2);
        Multiset multiset = (Multiset) m28919o(this.f67936b);
        if (multiset != null) {
            Preconditions.checkState(multiset.add(obj2));
        }
    }

    @Override // p000.AbstractC16938w0, p000.InterfaceC19154bH0
    /* renamed from: j */
    public void mo945j(Object obj, Object obj2, boolean z) {
        if (!z) {
            mo946i(obj, obj2);
        }
    }

    @Override // p000.InterfaceC19154bH0
    /* renamed from: l */
    public Set mo26459l(Object obj) {
        return new C11662a(this, this.f107874a, obj, obj);
    }

    /* renamed from: n */
    public final Multiset m28920n() {
        Multiset multiset = (Multiset) m28919o(this.f67936b);
        if (multiset == null) {
            HashMultiset create = HashMultiset.create(this.f107874a.values());
            this.f67936b = new SoftReference(create);
            return create;
        }
        return multiset;
    }
}
