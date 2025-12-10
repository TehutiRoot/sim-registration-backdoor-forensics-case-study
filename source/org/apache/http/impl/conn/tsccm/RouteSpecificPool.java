package org.apache.http.impl.conn.tsccm;

import java.util.LinkedList;
import java.util.Queue;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.conn.params.ConnPerRoute;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.util.Args;
import org.apache.http.util.Asserts;

@Deprecated
/* loaded from: classes6.dex */
public class RouteSpecificPool {

    /* renamed from: a */
    public final Log f74322a;
    protected final ConnPerRoute connPerRoute;
    protected final LinkedList<BasicPoolEntry> freeEntries;
    protected final int maxEntries;
    protected int numEntries;
    protected final HttpRoute route;
    protected final Queue<WaitingThread> waitingThreads;

    /* renamed from: org.apache.http.impl.conn.tsccm.RouteSpecificPool$a */
    /* loaded from: classes6.dex */
    public class C12601a implements ConnPerRoute {
        public C12601a() {
            RouteSpecificPool.this = r1;
        }

        @Override // org.apache.http.conn.params.ConnPerRoute
        public int getMaxForRoute(HttpRoute httpRoute) {
            return RouteSpecificPool.this.maxEntries;
        }
    }

    @Deprecated
    public RouteSpecificPool(HttpRoute httpRoute, int i) {
        this.f74322a = LogFactory.getLog(getClass());
        this.route = httpRoute;
        this.maxEntries = i;
        this.connPerRoute = new C12601a();
        this.freeEntries = new LinkedList<>();
        this.waitingThreads = new LinkedList();
        this.numEntries = 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public org.apache.http.impl.conn.tsccm.BasicPoolEntry allocEntry(java.lang.Object r4) {
        /*
            r3 = this;
            java.util.LinkedList<org.apache.http.impl.conn.tsccm.BasicPoolEntry> r0 = r3.freeEntries
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L32
            java.util.LinkedList<org.apache.http.impl.conn.tsccm.BasicPoolEntry> r0 = r3.freeEntries
            int r1 = r0.size()
            java.util.ListIterator r0 = r0.listIterator(r1)
        L12:
            boolean r1 = r0.hasPrevious()
            if (r1 == 0) goto L32
            java.lang.Object r1 = r0.previous()
            org.apache.http.impl.conn.tsccm.BasicPoolEntry r1 = (org.apache.http.impl.conn.tsccm.BasicPoolEntry) r1
            java.lang.Object r2 = r1.getState()
            if (r2 == 0) goto L2e
            java.lang.Object r2 = r1.getState()
            boolean r2 = org.apache.http.util.LangUtils.equals(r4, r2)
            if (r2 == 0) goto L12
        L2e:
            r0.remove()
            return r1
        L32:
            int r4 = r3.getCapacity()
            if (r4 != 0) goto L5c
            java.util.LinkedList<org.apache.http.impl.conn.tsccm.BasicPoolEntry> r4 = r3.freeEntries
            boolean r4 = r4.isEmpty()
            if (r4 != 0) goto L5c
            java.util.LinkedList<org.apache.http.impl.conn.tsccm.BasicPoolEntry> r4 = r3.freeEntries
            java.lang.Object r4 = r4.remove()
            org.apache.http.impl.conn.tsccm.BasicPoolEntry r4 = (org.apache.http.impl.conn.tsccm.BasicPoolEntry) r4
            r4.shutdownEntry()
            org.apache.http.conn.OperatedClientConnection r0 = r4.getConnection()
            r0.close()     // Catch: java.io.IOException -> L53
            goto L5b
        L53:
            r0 = move-exception
            org.apache.commons.logging.Log r1 = r3.f74322a
            java.lang.String r2 = "I/O error closing connection"
            r1.debug(r2, r0)
        L5b:
            return r4
        L5c:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.http.impl.conn.tsccm.RouteSpecificPool.allocEntry(java.lang.Object):org.apache.http.impl.conn.tsccm.BasicPoolEntry");
    }

    public void createdEntry(BasicPoolEntry basicPoolEntry) {
        Args.check(this.route.equals(basicPoolEntry.getPlannedRoute()), "Entry not planned for this pool");
        this.numEntries++;
    }

    public boolean deleteEntry(BasicPoolEntry basicPoolEntry) {
        boolean remove = this.freeEntries.remove(basicPoolEntry);
        if (remove) {
            this.numEntries--;
        }
        return remove;
    }

    public void dropEntry() {
        boolean z;
        if (this.numEntries > 0) {
            z = true;
        } else {
            z = false;
        }
        Asserts.check(z, "There is no entry that could be dropped");
        this.numEntries--;
    }

    public void freeEntry(BasicPoolEntry basicPoolEntry) {
        int i = this.numEntries;
        if (i >= 1) {
            if (i > this.freeEntries.size()) {
                this.freeEntries.add(basicPoolEntry);
                return;
            }
            throw new IllegalStateException("No entry allocated from this pool. " + this.route);
        }
        throw new IllegalStateException("No entry created for this pool. " + this.route);
    }

    public int getCapacity() {
        return this.connPerRoute.getMaxForRoute(this.route) - this.numEntries;
    }

    public final int getEntryCount() {
        return this.numEntries;
    }

    public final int getMaxEntries() {
        return this.maxEntries;
    }

    public final HttpRoute getRoute() {
        return this.route;
    }

    public boolean hasThread() {
        return !this.waitingThreads.isEmpty();
    }

    public boolean isUnused() {
        if (this.numEntries < 1 && this.waitingThreads.isEmpty()) {
            return true;
        }
        return false;
    }

    public WaitingThread nextThread() {
        return this.waitingThreads.peek();
    }

    public void queueThread(WaitingThread waitingThread) {
        Args.notNull(waitingThread, "Waiting thread");
        this.waitingThreads.add(waitingThread);
    }

    public void removeThread(WaitingThread waitingThread) {
        if (waitingThread == null) {
            return;
        }
        this.waitingThreads.remove(waitingThread);
    }

    public RouteSpecificPool(HttpRoute httpRoute, ConnPerRoute connPerRoute) {
        this.f74322a = LogFactory.getLog(getClass());
        this.route = httpRoute;
        this.connPerRoute = connPerRoute;
        this.maxEntries = connPerRoute.getMaxForRoute(httpRoute);
        this.freeEntries = new LinkedList<>();
        this.waitingThreads = new LinkedList();
        this.numEntries = 0;
    }
}
