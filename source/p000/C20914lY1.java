package p000;

import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import com.google.common.collect.ImmutableBiMap;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

/* renamed from: lY1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C20914lY1 extends AbstractC16938w0 {
    public C20914lY1(Map map) {
        super(map);
    }

    /* renamed from: m */
    public static C20914lY1 m26458m() {
        return new C20914lY1(HashBiMap.create(2));
    }

    /* renamed from: n */
    public static C20914lY1 m26457n(Map map) {
        return new C20914lY1(ImmutableBiMap.copyOf(map));
    }

    @Override // p000.InterfaceC19154bH0
    /* renamed from: a */
    public Set mo26460a() {
        return Collections.unmodifiableSet(((BiMap) this.f107874a).values());
    }

    @Override // p000.InterfaceC19154bH0
    /* renamed from: l */
    public Set mo26459l(Object obj) {
        return new C1312SQ(((BiMap) this.f107874a).inverse(), obj);
    }
}
