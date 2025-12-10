package p000;

import com.google.common.base.Predicate;
import com.google.common.collect.ListMultimap;
import java.util.List;

/* renamed from: a10  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C18975a10 extends C19153b10 implements ListMultimap {
    public C18975a10(ListMultimap listMultimap, Predicate predicate) {
        super(listMultimap, predicate);
    }

    @Override // p000.C19153b10, p000.InterfaceC19499d10, p000.InterfaceC19845f10
    /* renamed from: d */
    public ListMultimap mo31559a() {
        return (ListMultimap) super.mo31559a();
    }

    @Override // p000.C19153b10, com.google.common.collect.Multimap, com.google.common.collect.SetMultimap
    public List get(Object obj) {
        return (List) super.get(obj);
    }

    @Override // p000.C19153b10, com.google.common.collect.Multimap, com.google.common.collect.SetMultimap
    public List removeAll(Object obj) {
        return (List) super.removeAll(obj);
    }

    @Override // com.google.common.collect.AbstractC7936a, com.google.common.collect.Multimap, com.google.common.collect.SetMultimap
    public List replaceValues(Object obj, Iterable iterable) {
        return (List) super.replaceValues(obj, iterable);
    }
}