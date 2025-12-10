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
public abstract class AbstractC8294d extends AggregateFuture {

    /* renamed from: p */
    public List f54478p;

    /* renamed from: com.google.common.util.concurrent.d$a */
    /* loaded from: classes4.dex */
    public static final class C8295a extends AbstractC8294d {
        public C8295a(ImmutableCollection immutableCollection, boolean z) {
            super(immutableCollection, z);
            m39599O();
        }

        @Override // com.google.common.util.concurrent.AbstractC8294d
        /* renamed from: W */
        public List mo39352V(List list) {
            Object obj;
            ArrayList newArrayListWithCapacity = Lists.newArrayListWithCapacity(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C8296b c8296b = (C8296b) it.next();
                if (c8296b != null) {
                    obj = c8296b.f54479a;
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
    public static final class C8296b {

        /* renamed from: a */
        public final Object f54479a;

        public C8296b(Object obj) {
            this.f54479a = obj;
        }
    }

    public AbstractC8294d(ImmutableCollection immutableCollection, boolean z) {
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
        this.f54478p = newArrayListWithCapacity;
    }

    @Override // com.google.common.util.concurrent.AggregateFuture
    /* renamed from: J */
    public final void mo39355J(int i, Object obj) {
        List list = this.f54478p;
        if (list != null) {
            list.set(i, new C8296b(obj));
        }
    }

    @Override // com.google.common.util.concurrent.AggregateFuture
    /* renamed from: M */
    public final void mo39354M() {
        List list = this.f54478p;
        if (list != null) {
            set(mo39352V(list));
        }
    }

    @Override // com.google.common.util.concurrent.AggregateFuture
    /* renamed from: U */
    public void mo39353U(AggregateFuture.ReleaseResourcesReason releaseResourcesReason) {
        super.mo39353U(releaseResourcesReason);
        this.f54478p = null;
    }

    /* renamed from: V */
    public abstract Object mo39352V(List list);
}