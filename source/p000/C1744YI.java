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

/* renamed from: YI */
/* loaded from: classes4.dex */
public final class C1744YI extends AbstractC0148C {

    /* renamed from: d */
    public transient Reference f7734d;

    /* renamed from: e */
    public transient Reference f7735e;

    /* renamed from: YI$a */
    /* loaded from: classes4.dex */
    public class C1745a extends AbstractC19839fG0 {

        /* renamed from: c */
        public final /* synthetic */ Object f7736c;

        /* renamed from: d */
        public final /* synthetic */ C1744YI f7737d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1745a(C1744YI c1744yi, Map map, Object obj, Object obj2) {
            super(map, obj);
            this.f7736c = obj2;
            this.f7737d = c1744yi;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.f7737d.m65370s().count(this.f7736c);
        }
    }

    public C1744YI(Map map, Map map2, int i) {
        super(map, map2, i);
    }

    /* renamed from: o */
    public static Object m65374o(Reference reference) {
        if (reference == null) {
            return null;
        }
        return reference.get();
    }

    /* renamed from: p */
    public static C1744YI m65373p() {
        return new C1744YI(new HashMap(2, 1.0f), new HashMap(2, 1.0f), 0);
    }

    /* renamed from: q */
    public static C1744YI m65372q(Map map, Map map2, int i) {
        return new C1744YI(ImmutableMap.copyOf(map), ImmutableMap.copyOf(map2), i);
    }

    @Override // p000.InterfaceC19154bH0
    /* renamed from: b */
    public Set mo953b() {
        return Collections.unmodifiableSet(m65370s().elementSet());
    }

    @Override // p000.InterfaceC19154bH0
    /* renamed from: c */
    public Set mo952c() {
        return Collections.unmodifiableSet(m65371r().elementSet());
    }

    @Override // p000.AbstractC0148C, p000.InterfaceC19154bH0
    /* renamed from: f */
    public Object mo949f(Object obj) {
        Object mo949f = super.mo949f(obj);
        Multiset multiset = (Multiset) m65374o(this.f7735e);
        if (multiset != null) {
            Preconditions.checkState(multiset.remove(mo949f));
        }
        return mo949f;
    }

    @Override // p000.AbstractC0148C, p000.InterfaceC19154bH0
    /* renamed from: h */
    public Object mo947h(Object obj, boolean z) {
        Object mo947h = super.mo947h(obj, z);
        Multiset multiset = (Multiset) m65374o(this.f7734d);
        if (multiset != null) {
            Preconditions.checkState(multiset.remove(mo947h));
        }
        return mo947h;
    }

    @Override // p000.AbstractC0148C, p000.InterfaceC19154bH0
    /* renamed from: i */
    public void mo946i(Object obj, Object obj2) {
        super.mo946i(obj, obj2);
        Multiset multiset = (Multiset) m65374o(this.f7735e);
        if (multiset != null) {
            Preconditions.checkState(multiset.add(obj2));
        }
    }

    @Override // p000.AbstractC0148C, p000.InterfaceC19154bH0
    /* renamed from: j */
    public void mo945j(Object obj, Object obj2, boolean z) {
        super.mo945j(obj, obj2, z);
        Multiset multiset = (Multiset) m65374o(this.f7734d);
        if (multiset != null) {
            Preconditions.checkState(multiset.add(obj2));
        }
    }

    @Override // p000.InterfaceC19154bH0
    /* renamed from: l */
    public Set mo26459l(Object obj) {
        return new C1745a(this, this.f586b, obj, obj);
    }

    /* renamed from: r */
    public final Multiset m65371r() {
        Multiset multiset = (Multiset) m65374o(this.f7734d);
        if (multiset == null) {
            HashMultiset create = HashMultiset.create(this.f585a.values());
            this.f7734d = new SoftReference(create);
            return create;
        }
        return multiset;
    }

    /* renamed from: s */
    public final Multiset m65370s() {
        Multiset multiset = (Multiset) m65374o(this.f7735e);
        if (multiset == null) {
            HashMultiset create = HashMultiset.create(this.f586b.values());
            this.f7735e = new SoftReference(create);
            return create;
        }
        return multiset;
    }
}
