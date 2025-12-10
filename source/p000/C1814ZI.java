package p000;

import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import com.google.common.collect.ImmutableBiMap;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

/* renamed from: ZI */
/* loaded from: classes4.dex */
public final class C1814ZI extends AbstractC0148C {
    public C1814ZI(Map map, Map map2, int i) {
        super(map, map2, i);
    }

    /* renamed from: n */
    public static C1814ZI m65249n() {
        return new C1814ZI(HashBiMap.create(2), HashBiMap.create(2), 0);
    }

    /* renamed from: o */
    public static C1814ZI m65248o(Map map, Map map2, int i) {
        return new C1814ZI(ImmutableBiMap.copyOf(map), ImmutableBiMap.copyOf(map2), i);
    }

    @Override // p000.InterfaceC19154bH0
    /* renamed from: b */
    public Set mo953b() {
        return Collections.unmodifiableSet(((BiMap) this.f586b).values());
    }

    @Override // p000.InterfaceC19154bH0
    /* renamed from: c */
    public Set mo952c() {
        return Collections.unmodifiableSet(((BiMap) this.f585a).values());
    }

    @Override // p000.InterfaceC19154bH0
    /* renamed from: l */
    public Set mo26459l(Object obj) {
        return new C1312SQ(((BiMap) this.f586b).inverse(), obj);
    }
}
