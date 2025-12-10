package org.apache.http.impl.conn.tsccm;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.util.Args;

@Deprecated
/* loaded from: classes6.dex */
public class BasicPoolEntryRef extends WeakReference<BasicPoolEntry> {

    /* renamed from: a */
    public final HttpRoute f74313a;

    public BasicPoolEntryRef(BasicPoolEntry basicPoolEntry, ReferenceQueue<Object> referenceQueue) {
        super(basicPoolEntry, referenceQueue);
        Args.notNull(basicPoolEntry, "Pool entry");
        this.f74313a = basicPoolEntry.getPlannedRoute();
    }

    public final HttpRoute getRoute() {
        return this.f74313a;
    }
}
