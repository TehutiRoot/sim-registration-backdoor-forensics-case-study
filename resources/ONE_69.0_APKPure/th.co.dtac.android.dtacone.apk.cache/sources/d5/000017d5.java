package p000;

import com.google.common.base.Predicate;
import com.google.common.collect.C7958h;
import com.google.common.collect.SetMultimap;
import com.google.common.collect.Sets;
import java.util.Set;

/* renamed from: Z00 */
/* loaded from: classes4.dex */
public final class Z00 extends C7958h implements InterfaceC19845f10 {
    public Z00(SetMultimap setMultimap, Predicate predicate) {
        super(setMultimap, predicate);
    }

    @Override // com.google.common.collect.C7958h, com.google.common.collect.AbstractC7936a
    /* renamed from: h */
    public Set createEntries() {
        return Sets.filter(mo31559a().entries(), mo31943c());
    }

    @Override // com.google.common.collect.C7958h, p000.InterfaceC19499d10, p000.InterfaceC19845f10
    /* renamed from: a */
    public SetMultimap mo31559a() {
        return (SetMultimap) this.f53708a;
    }

    @Override // com.google.common.collect.AbstractC7936a, com.google.common.collect.Multimap, com.google.common.collect.SetMultimap
    public Set entries() {
        return (Set) super.entries();
    }

    @Override // com.google.common.collect.C7958h, com.google.common.collect.Multimap, com.google.common.collect.SetMultimap
    public Set get(Object obj) {
        return (Set) super.get(obj);
    }

    @Override // com.google.common.collect.C7958h, com.google.common.collect.Multimap, com.google.common.collect.SetMultimap
    public Set removeAll(Object obj) {
        return (Set) super.removeAll(obj);
    }

    @Override // com.google.common.collect.AbstractC7936a, com.google.common.collect.Multimap, com.google.common.collect.SetMultimap
    public Set replaceValues(Object obj, Iterable iterable) {
        return (Set) super.replaceValues(obj, iterable);
    }
}