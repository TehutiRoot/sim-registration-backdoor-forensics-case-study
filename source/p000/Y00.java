package p000;

import com.google.common.base.Predicate;
import com.google.common.collect.SetMultimap;
import com.google.common.collect.Sets;
import java.util.Set;
import p000.X00;

/* renamed from: Y00 */
/* loaded from: classes4.dex */
public final class Y00 extends X00 implements InterfaceC19106b10 {

    /* renamed from: Y00$a */
    /* loaded from: classes4.dex */
    public class C1718a extends X00.C1650c implements Set {
        public C1718a() {
            super();
        }

        @Override // java.util.Collection, java.util.Set
        public boolean equals(Object obj) {
            return Sets.m40548a(this, obj);
        }

        @Override // java.util.Collection, java.util.Set
        public int hashCode() {
            return Sets.m40547b(this);
        }
    }

    public Y00(SetMultimap setMultimap, Predicate predicate) {
        super(setMultimap, predicate);
    }

    @Override // p000.X00, com.google.common.collect.AbstractC7947a
    /* renamed from: d */
    public Set createEntries() {
        return new C1718a();
    }

    @Override // p000.X00, p000.Z00, p000.InterfaceC19106b10
    /* renamed from: a */
    public SetMultimap mo40280a() {
        return (SetMultimap) this.f7362a;
    }

    @Override // com.google.common.collect.AbstractC7947a, com.google.common.collect.Multimap, com.google.common.collect.SetMultimap
    public Set entries() {
        return (Set) super.entries();
    }

    @Override // p000.X00, com.google.common.collect.Multimap, com.google.common.collect.SetMultimap
    public Set get(Object obj) {
        return (Set) super.get(obj);
    }

    @Override // p000.X00, com.google.common.collect.Multimap, com.google.common.collect.SetMultimap
    public Set removeAll(Object obj) {
        return (Set) super.removeAll(obj);
    }

    @Override // com.google.common.collect.AbstractC7947a, com.google.common.collect.Multimap, com.google.common.collect.SetMultimap
    public Set replaceValues(Object obj, Iterable iterable) {
        return (Set) super.replaceValues(obj, iterable);
    }
}
