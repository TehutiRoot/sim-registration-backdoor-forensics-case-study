package p000;

import com.google.common.base.Predicate;
import com.google.common.collect.C7969h;
import com.google.common.collect.SetMultimap;
import com.google.common.collect.Sets;
import java.util.Set;

/* renamed from: V00 */
/* loaded from: classes4.dex */
public final class V00 extends C7969h implements InterfaceC19106b10 {
    public V00(SetMultimap setMultimap, Predicate predicate) {
        super(setMultimap, predicate);
    }

    @Override // com.google.common.collect.C7969h, com.google.common.collect.AbstractC7947a
    /* renamed from: h */
    public Set createEntries() {
        return Sets.filter(mo40280a().entries(), mo40278c());
    }

    @Override // com.google.common.collect.C7969h, p000.Z00, p000.InterfaceC19106b10
    /* renamed from: a */
    public SetMultimap mo40280a() {
        return (SetMultimap) this.f53696a;
    }

    @Override // com.google.common.collect.AbstractC7947a, com.google.common.collect.Multimap, com.google.common.collect.SetMultimap
    public Set entries() {
        return (Set) super.entries();
    }

    @Override // com.google.common.collect.C7969h, com.google.common.collect.Multimap, com.google.common.collect.SetMultimap
    public Set get(Object obj) {
        return (Set) super.get(obj);
    }

    @Override // com.google.common.collect.C7969h, com.google.common.collect.Multimap, com.google.common.collect.SetMultimap
    public Set removeAll(Object obj) {
        return (Set) super.removeAll(obj);
    }

    @Override // com.google.common.collect.AbstractC7947a, com.google.common.collect.Multimap, com.google.common.collect.SetMultimap
    public Set replaceValues(Object obj, Iterable iterable) {
        return (Set) super.replaceValues(obj, iterable);
    }
}
