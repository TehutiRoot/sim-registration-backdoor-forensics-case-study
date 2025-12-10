package com.google.common.graph;

import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Iterators;
import com.google.common.graph.C8037c;
import com.google.common.graph.ElementOrder;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.common.graph.c */
/* loaded from: classes4.dex */
public final class C8037c implements U60 {

    /* renamed from: a */
    public final Map f53831a;

    /* renamed from: com.google.common.graph.c$a */
    /* loaded from: classes4.dex */
    public static /* synthetic */ class C8038a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f53832a;

        static {
            int[] iArr = new int[ElementOrder.Type.values().length];
            f53832a = iArr;
            try {
                iArr[ElementOrder.Type.UNORDERED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f53832a[ElementOrder.Type.STABLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public C8037c(Map map) {
        this.f53831a = (Map) Preconditions.checkNotNull(map);
    }

    /* renamed from: j */
    public static /* synthetic */ EndpointPair m40066j(Object obj, Object obj2) {
        return EndpointPair.unordered(obj, obj2);
    }

    /* renamed from: l */
    public static C8037c m40064l(ElementOrder elementOrder) {
        int i = C8038a.f53832a[elementOrder.type().ordinal()];
        if (i != 1) {
            if (i == 2) {
                return new C8037c(new LinkedHashMap(2, 1.0f));
            }
            throw new AssertionError(elementOrder.type());
        }
        return new C8037c(new HashMap(2, 1.0f));
    }

    /* renamed from: m */
    public static C8037c m40063m(Map map) {
        return new C8037c(ImmutableMap.copyOf(map));
    }

    @Override // p000.U60
    /* renamed from: a */
    public Set mo40075a() {
        return Collections.unmodifiableSet(this.f53831a.keySet());
    }

    @Override // p000.U60
    /* renamed from: b */
    public Set mo40074b() {
        return mo40075a();
    }

    @Override // p000.U60
    /* renamed from: c */
    public Set mo40073c() {
        return mo40075a();
    }

    @Override // p000.U60
    /* renamed from: d */
    public void mo40072d(Object obj, Object obj2) {
        mo40067i(obj, obj2);
    }

    @Override // p000.U60
    /* renamed from: e */
    public Object mo40071e(Object obj) {
        return this.f53831a.get(obj);
    }

    @Override // p000.U60
    /* renamed from: f */
    public Object mo40070f(Object obj) {
        return this.f53831a.remove(obj);
    }

    @Override // p000.U60
    /* renamed from: g */
    public void mo40069g(Object obj) {
        mo40070f(obj);
    }

    @Override // p000.U60
    /* renamed from: h */
    public Iterator mo40068h(final Object obj) {
        return Iterators.transform(this.f53831a.keySet().iterator(), new Function() { // from class: jY1
            @Override // com.google.common.base.Function
            public final Object apply(Object obj2) {
                return C8037c.m40066j(obj, obj2);
            }
        });
    }

    @Override // p000.U60
    /* renamed from: i */
    public Object mo40067i(Object obj, Object obj2) {
        return this.f53831a.put(obj, obj2);
    }
}
