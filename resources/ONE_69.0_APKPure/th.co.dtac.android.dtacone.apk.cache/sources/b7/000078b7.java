package p000;

import com.google.common.base.Predicate;
import com.google.common.collect.SetMultimap;
import com.google.common.collect.Sets;
import java.util.Set;
import p000.C19153b10;

/* renamed from: c10  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C19326c10 extends C19153b10 implements InterfaceC19845f10 {

    /* renamed from: c10$a */
    /* loaded from: classes4.dex */
    public class C5393a extends C19153b10.C5324c implements Set {
        public C5393a() {
            super();
        }

        @Override // java.util.Collection, java.util.Set
        public boolean equals(Object obj) {
            return Sets.m40537a(this, obj);
        }

        @Override // java.util.Collection, java.util.Set
        public int hashCode() {
            return Sets.m40536b(this);
        }
    }

    public C19326c10(SetMultimap setMultimap, Predicate predicate) {
        super(setMultimap, predicate);
    }

    @Override // p000.C19153b10, com.google.common.collect.AbstractC7936a
    /* renamed from: d */
    public Set createEntries() {
        return new C5393a();
    }

    @Override // p000.C19153b10, p000.InterfaceC19499d10, p000.InterfaceC19845f10
    /* renamed from: a */
    public SetMultimap mo31559a() {
        return (SetMultimap) this.f38971a;
    }

    @Override // com.google.common.collect.AbstractC7936a, com.google.common.collect.Multimap, com.google.common.collect.SetMultimap
    public Set entries() {
        return (Set) super.entries();
    }

    @Override // p000.C19153b10, com.google.common.collect.Multimap, com.google.common.collect.SetMultimap
    public Set get(Object obj) {
        return (Set) super.get(obj);
    }

    @Override // p000.C19153b10, com.google.common.collect.Multimap, com.google.common.collect.SetMultimap
    public Set removeAll(Object obj) {
        return (Set) super.removeAll(obj);
    }

    @Override // com.google.common.collect.AbstractC7936a, com.google.common.collect.Multimap, com.google.common.collect.SetMultimap
    public Set replaceValues(Object obj, Iterable iterable) {
        return (Set) super.replaceValues(obj, iterable);
    }
}