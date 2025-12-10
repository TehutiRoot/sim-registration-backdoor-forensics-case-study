package p000;

import com.google.common.base.Predicate;
import com.google.common.collect.ListMultimap;
import java.util.List;

/* renamed from: W00 */
/* loaded from: classes4.dex */
public final class W00 extends X00 implements ListMultimap {
    public W00(ListMultimap listMultimap, Predicate predicate) {
        super(listMultimap, predicate);
    }

    @Override // p000.X00, p000.Z00, p000.InterfaceC19106b10
    /* renamed from: d */
    public ListMultimap mo40280a() {
        return (ListMultimap) super.mo40280a();
    }

    @Override // p000.X00, com.google.common.collect.Multimap, com.google.common.collect.SetMultimap
    public List get(Object obj) {
        return (List) super.get(obj);
    }

    @Override // p000.X00, com.google.common.collect.Multimap, com.google.common.collect.SetMultimap
    public List removeAll(Object obj) {
        return (List) super.removeAll(obj);
    }

    @Override // com.google.common.collect.AbstractC7947a, com.google.common.collect.Multimap, com.google.common.collect.SetMultimap
    public List replaceValues(Object obj, Iterable iterable) {
        return (List) super.replaceValues(obj, iterable);
    }
}
