package com.google.common.util.concurrent;

import com.google.common.collect.ImmutableCollection;
import com.google.common.collect.Lists;
import com.google.common.util.concurrent.AggregateFuture;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.common.util.concurrent.d */
/* loaded from: classes4.dex */
public abstract class AbstractC8305d extends AggregateFuture {

    /* renamed from: p */
    public List f54466p;

    /* renamed from: com.google.common.util.concurrent.d$a */
    /* loaded from: classes4.dex */
    public static final class C8306a extends AbstractC8305d {
        public C8306a(ImmutableCollection immutableCollection, boolean z) {
            super(immutableCollection, z);
            m39607O();
        }

        @Override // com.google.common.util.concurrent.AbstractC8305d
        /* renamed from: W */
        public List mo39360V(List list) {
            Object obj;
            ArrayList newArrayListWithCapacity = Lists.newArrayListWithCapacity(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C8307b c8307b = (C8307b) it.next();
                if (c8307b != null) {
                    obj = c8307b.f54467a;
                } else {
                    obj = null;
                }
                newArrayListWithCapacity.add(obj);
            }
            return Collections.unmodifiableList(newArrayListWithCapacity);
        }
    }

    /* renamed from: com.google.common.util.concurrent.d$b */
    /* loaded from: classes4.dex */
    public static final class C8307b {

        /* renamed from: a */
        public final Object f54467a;

        public C8307b(Object obj) {
            this.f54467a = obj;
        }
    }

    public AbstractC8305d(ImmutableCollection immutableCollection, boolean z) {
        super(immutableCollection, z, true);
        List newArrayListWithCapacity;
        if (immutableCollection.isEmpty()) {
            newArrayListWithCapacity = Collections.emptyList();
        } else {
            newArrayListWithCapacity = Lists.newArrayListWithCapacity(immutableCollection.size());
        }
        for (int i = 0; i < immutableCollection.size(); i++) {
            newArrayListWithCapacity.add(null);
        }
        this.f54466p = newArrayListWithCapacity;
    }

    @Override // com.google.common.util.concurrent.AggregateFuture
    /* renamed from: J */
    public final void mo39363J(int i, Object obj) {
        List list = this.f54466p;
        if (list != null) {
            list.set(i, new C8307b(obj));
        }
    }

    @Override // com.google.common.util.concurrent.AggregateFuture
    /* renamed from: M */
    public final void mo39362M() {
        List list = this.f54466p;
        if (list != null) {
            set(mo39360V(list));
        }
    }

    @Override // com.google.common.util.concurrent.AggregateFuture
    /* renamed from: U */
    public void mo39361U(AggregateFuture.ReleaseResourcesReason releaseResourcesReason) {
        super.mo39361U(releaseResourcesReason);
        this.f54466p = null;
    }

    /* renamed from: V */
    public abstract Object mo39360V(List list);
}
