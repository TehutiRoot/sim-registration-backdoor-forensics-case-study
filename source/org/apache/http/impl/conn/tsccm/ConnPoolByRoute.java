package org.apache.http.impl.conn.tsccm;

import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.conn.ClientConnectionOperator;
import org.apache.http.conn.OperatedClientConnection;
import org.apache.http.conn.params.ConnManagerParams;
import org.apache.http.conn.params.ConnPerRoute;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.params.HttpParams;
import org.apache.http.util.Args;

@Deprecated
/* loaded from: classes6.dex */
public class ConnPoolByRoute extends AbstractConnPool {

    /* renamed from: b */
    public final Log f74314b;

    /* renamed from: c */
    public final Lock f74315c;
    protected final ConnPerRoute connPerRoute;

    /* renamed from: d */
    public final long f74316d;

    /* renamed from: e */
    public final TimeUnit f74317e;
    protected final Queue<BasicPoolEntry> freeConnections;
    protected final Set<BasicPoolEntry> leasedConnections;
    protected volatile int maxTotalConnections;
    protected volatile int numConnections;
    protected final ClientConnectionOperator operator;
    protected final Map<HttpRoute, RouteSpecificPool> routeToPool;
    protected volatile boolean shutdown;
    protected final Queue<WaitingThread> waitingThreads;

    /* renamed from: org.apache.http.impl.conn.tsccm.ConnPoolByRoute$a */
    /* loaded from: classes6.dex */
    public class C12600a implements PoolEntryRequest {

        /* renamed from: a */
        public final /* synthetic */ WaitingThreadAborter f74318a;

        /* renamed from: b */
        public final /* synthetic */ HttpRoute f74319b;

        /* renamed from: c */
        public final /* synthetic */ Object f74320c;

        public C12600a(WaitingThreadAborter waitingThreadAborter, HttpRoute httpRoute, Object obj) {
            this.f74318a = waitingThreadAborter;
            this.f74319b = httpRoute;
            this.f74320c = obj;
        }

        @Override // org.apache.http.impl.conn.tsccm.PoolEntryRequest
        public void abortRequest() {
            ConnPoolByRoute.this.f74315c.lock();
            try {
                this.f74318a.abort();
            } finally {
                ConnPoolByRoute.this.f74315c.unlock();
            }
        }

        @Override // org.apache.http.impl.conn.tsccm.PoolEntryRequest
        public BasicPoolEntry getPoolEntry(long j, TimeUnit timeUnit) {
            return ConnPoolByRoute.this.getEntryBlocking(this.f74319b, this.f74320c, j, timeUnit, this.f74318a);
        }
    }

    public ConnPoolByRoute(ClientConnectionOperator clientConnectionOperator, ConnPerRoute connPerRoute, int i) {
        this(clientConnectionOperator, connPerRoute, i, -1L, TimeUnit.MILLISECONDS);
    }

    /* renamed from: b */
    public final void m24615b(BasicPoolEntry basicPoolEntry) {
        OperatedClientConnection connection = basicPoolEntry.getConnection();
        if (connection != null) {
            try {
                connection.close();
            } catch (IOException e) {
                this.f74314b.debug("I/O error closing connection", e);
            }
        }
    }

    @Override // org.apache.http.impl.conn.tsccm.AbstractConnPool
    public void closeExpiredConnections() {
        this.f74314b.debug("Closing expired connections");
        long currentTimeMillis = System.currentTimeMillis();
        this.f74315c.lock();
        try {
            Iterator<BasicPoolEntry> it = this.freeConnections.iterator();
            while (it.hasNext()) {
                BasicPoolEntry next = it.next();
                if (next.isExpired(currentTimeMillis)) {
                    if (this.f74314b.isDebugEnabled()) {
                        Log log = this.f74314b;
                        log.debug("Closing connection expired @ " + new Date(next.getExpiry()));
                    }
                    it.remove();
                    deleteEntry(next);
                }
            }
            this.f74315c.unlock();
        } catch (Throwable th2) {
            this.f74315c.unlock();
            throw th2;
        }
    }

    @Override // org.apache.http.impl.conn.tsccm.AbstractConnPool
    public void closeIdleConnections(long j, TimeUnit timeUnit) {
        Args.notNull(timeUnit, "Time unit");
        if (j <= 0) {
            j = 0;
        }
        if (this.f74314b.isDebugEnabled()) {
            this.f74314b.debug("Closing connections idle longer than " + j + HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR + timeUnit);
        }
        long currentTimeMillis = System.currentTimeMillis() - timeUnit.toMillis(j);
        this.f74315c.lock();
        try {
            Iterator<BasicPoolEntry> it = this.freeConnections.iterator();
            while (it.hasNext()) {
                BasicPoolEntry next = it.next();
                if (next.getUpdated() <= currentTimeMillis) {
                    if (this.f74314b.isDebugEnabled()) {
                        this.f74314b.debug("Closing connection last used @ " + new Date(next.getUpdated()));
                    }
                    it.remove();
                    deleteEntry(next);
                }
            }
            this.f74315c.unlock();
        } catch (Throwable th2) {
            this.f74315c.unlock();
            throw th2;
        }
    }

    public BasicPoolEntry createEntry(RouteSpecificPool routeSpecificPool, ClientConnectionOperator clientConnectionOperator) {
        if (this.f74314b.isDebugEnabled()) {
            this.f74314b.debug("Creating new connection [" + routeSpecificPool.getRoute() + "]");
        }
        BasicPoolEntry basicPoolEntry = new BasicPoolEntry(clientConnectionOperator, routeSpecificPool.getRoute(), this.f74316d, this.f74317e);
        this.f74315c.lock();
        try {
            routeSpecificPool.createdEntry(basicPoolEntry);
            this.numConnections++;
            this.leasedConnections.add(basicPoolEntry);
            return basicPoolEntry;
        } finally {
            this.f74315c.unlock();
        }
    }

    public Queue<BasicPoolEntry> createFreeConnQueue() {
        return new LinkedList();
    }

    public Map<HttpRoute, RouteSpecificPool> createRouteToPoolMap() {
        return new HashMap();
    }

    public Queue<WaitingThread> createWaitingThreadQueue() {
        return new LinkedList();
    }

    @Override // org.apache.http.impl.conn.tsccm.AbstractConnPool
    public void deleteClosedConnections() {
        this.f74315c.lock();
        try {
            Iterator<BasicPoolEntry> it = this.freeConnections.iterator();
            while (it.hasNext()) {
                BasicPoolEntry next = it.next();
                if (!next.getConnection().isOpen()) {
                    it.remove();
                    deleteEntry(next);
                }
            }
        } finally {
            this.f74315c.unlock();
        }
    }

    public void deleteEntry(BasicPoolEntry basicPoolEntry) {
        HttpRoute plannedRoute = basicPoolEntry.getPlannedRoute();
        if (this.f74314b.isDebugEnabled()) {
            this.f74314b.debug("Deleting connection [" + plannedRoute + "][" + basicPoolEntry.getState() + "]");
        }
        this.f74315c.lock();
        try {
            m24615b(basicPoolEntry);
            RouteSpecificPool routePool = getRoutePool(plannedRoute, true);
            routePool.deleteEntry(basicPoolEntry);
            this.numConnections--;
            if (routePool.isUnused()) {
                this.routeToPool.remove(plannedRoute);
            }
        } finally {
            this.f74315c.unlock();
        }
    }

    public void deleteLeastUsedEntry() {
        this.f74315c.lock();
        try {
            BasicPoolEntry remove = this.freeConnections.remove();
            if (remove != null) {
                deleteEntry(remove);
            } else if (this.f74314b.isDebugEnabled()) {
                this.f74314b.debug("No free connection to delete");
            }
            this.f74315c.unlock();
        } catch (Throwable th2) {
            this.f74315c.unlock();
            throw th2;
        }
    }

    @Override // org.apache.http.impl.conn.tsccm.AbstractConnPool
    public void freeEntry(BasicPoolEntry basicPoolEntry, boolean z, long j, TimeUnit timeUnit) {
        String str;
        HttpRoute plannedRoute = basicPoolEntry.getPlannedRoute();
        if (this.f74314b.isDebugEnabled()) {
            this.f74314b.debug("Releasing connection [" + plannedRoute + "][" + basicPoolEntry.getState() + "]");
        }
        this.f74315c.lock();
        try {
            if (this.shutdown) {
                m24615b(basicPoolEntry);
                return;
            }
            this.leasedConnections.remove(basicPoolEntry);
            RouteSpecificPool routePool = getRoutePool(plannedRoute, true);
            if (z && routePool.getCapacity() >= 0) {
                if (this.f74314b.isDebugEnabled()) {
                    if (j > 0) {
                        str = "for " + j + HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR + timeUnit;
                    } else {
                        str = "indefinitely";
                    }
                    this.f74314b.debug("Pooling connection [" + plannedRoute + "][" + basicPoolEntry.getState() + "]; keep alive " + str);
                }
                routePool.freeEntry(basicPoolEntry);
                basicPoolEntry.updateExpiry(j, timeUnit);
                this.freeConnections.add(basicPoolEntry);
            } else {
                m24615b(basicPoolEntry);
                routePool.dropEntry();
                this.numConnections--;
            }
            notifyWaitingThread(routePool);
        } finally {
            this.f74315c.unlock();
        }
    }

    public int getConnectionsInPool(HttpRoute httpRoute) {
        this.f74315c.lock();
        try {
            RouteSpecificPool routePool = getRoutePool(httpRoute, false);
            return routePool != null ? routePool.getEntryCount() : 0;
        } finally {
            this.f74315c.unlock();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x015b, code lost:
        throw new org.apache.http.conn.ConnectionPoolTimeoutException("Timeout waiting for connection from pool");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public org.apache.http.impl.conn.tsccm.BasicPoolEntry getEntryBlocking(org.apache.http.conn.routing.HttpRoute r10, java.lang.Object r11, long r12, java.util.concurrent.TimeUnit r14, org.apache.http.impl.conn.tsccm.WaitingThreadAborter r15) throws org.apache.http.conn.ConnectionPoolTimeoutException, java.lang.InterruptedException {
        /*
            Method dump skipped, instructions count: 370
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.http.impl.conn.tsccm.ConnPoolByRoute.getEntryBlocking(org.apache.http.conn.routing.HttpRoute, java.lang.Object, long, java.util.concurrent.TimeUnit, org.apache.http.impl.conn.tsccm.WaitingThreadAborter):org.apache.http.impl.conn.tsccm.BasicPoolEntry");
    }

    public BasicPoolEntry getFreeEntry(RouteSpecificPool routeSpecificPool, Object obj) {
        this.f74315c.lock();
        BasicPoolEntry basicPoolEntry = null;
        boolean z = false;
        while (!z) {
            try {
                basicPoolEntry = routeSpecificPool.allocEntry(obj);
                if (basicPoolEntry != null) {
                    if (this.f74314b.isDebugEnabled()) {
                        this.f74314b.debug("Getting free connection [" + routeSpecificPool.getRoute() + "][" + obj + "]");
                    }
                    this.freeConnections.remove(basicPoolEntry);
                    if (basicPoolEntry.isExpired(System.currentTimeMillis())) {
                        if (this.f74314b.isDebugEnabled()) {
                            this.f74314b.debug("Closing expired free connection [" + routeSpecificPool.getRoute() + "][" + obj + "]");
                        }
                        m24615b(basicPoolEntry);
                        routeSpecificPool.dropEntry();
                        this.numConnections--;
                    } else {
                        this.leasedConnections.add(basicPoolEntry);
                    }
                } else if (this.f74314b.isDebugEnabled()) {
                    this.f74314b.debug("No free connections [" + routeSpecificPool.getRoute() + "][" + obj + "]");
                }
                z = true;
            } catch (Throwable th2) {
                this.f74315c.unlock();
                throw th2;
            }
        }
        this.f74315c.unlock();
        return basicPoolEntry;
    }

    public Lock getLock() {
        return this.f74315c;
    }

    public int getMaxTotalConnections() {
        return this.maxTotalConnections;
    }

    public RouteSpecificPool getRoutePool(HttpRoute httpRoute, boolean z) {
        this.f74315c.lock();
        try {
            RouteSpecificPool routeSpecificPool = this.routeToPool.get(httpRoute);
            if (routeSpecificPool == null && z) {
                routeSpecificPool = newRouteSpecificPool(httpRoute);
                this.routeToPool.put(httpRoute, routeSpecificPool);
            }
            return routeSpecificPool;
        } finally {
            this.f74315c.unlock();
        }
    }

    @Override // org.apache.http.impl.conn.tsccm.AbstractConnPool
    public void handleLostEntry(HttpRoute httpRoute) {
        this.f74315c.lock();
        try {
            RouteSpecificPool routePool = getRoutePool(httpRoute, true);
            routePool.dropEntry();
            if (routePool.isUnused()) {
                this.routeToPool.remove(httpRoute);
            }
            this.numConnections--;
            notifyWaitingThread(routePool);
            this.f74315c.unlock();
        } catch (Throwable th2) {
            this.f74315c.unlock();
            throw th2;
        }
    }

    public RouteSpecificPool newRouteSpecificPool(HttpRoute httpRoute) {
        return new RouteSpecificPool(httpRoute, this.connPerRoute);
    }

    public WaitingThread newWaitingThread(Condition condition, RouteSpecificPool routeSpecificPool) {
        return new WaitingThread(condition, routeSpecificPool);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x006e A[Catch: all -> 0x0035, TRY_LEAVE, TryCatch #0 {all -> 0x0035, blocks: (B:4:0x0007, B:6:0x000d, B:8:0x0015, B:11:0x0037, B:23:0x006e, B:12:0x003c, B:14:0x0044, B:16:0x004c, B:17:0x0053, B:18:0x005c, B:20:0x0064), top: B:28:0x0007 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void notifyWaitingThread(org.apache.http.impl.conn.tsccm.RouteSpecificPool r4) {
        /*
            r3 = this;
            java.util.concurrent.locks.Lock r0 = r3.f74315c
            r0.lock()
            if (r4 == 0) goto L3c
            boolean r0 = r4.hasThread()     // Catch: java.lang.Throwable -> L35
            if (r0 == 0) goto L3c
            org.apache.commons.logging.Log r0 = r3.f74314b     // Catch: java.lang.Throwable -> L35
            boolean r0 = r0.isDebugEnabled()     // Catch: java.lang.Throwable -> L35
            if (r0 == 0) goto L37
            org.apache.commons.logging.Log r0 = r3.f74314b     // Catch: java.lang.Throwable -> L35
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L35
            r1.<init>()     // Catch: java.lang.Throwable -> L35
            java.lang.String r2 = "Notifying thread waiting on pool ["
            r1.append(r2)     // Catch: java.lang.Throwable -> L35
            org.apache.http.conn.routing.HttpRoute r2 = r4.getRoute()     // Catch: java.lang.Throwable -> L35
            r1.append(r2)     // Catch: java.lang.Throwable -> L35
            java.lang.String r2 = "]"
            r1.append(r2)     // Catch: java.lang.Throwable -> L35
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L35
            r0.debug(r1)     // Catch: java.lang.Throwable -> L35
            goto L37
        L35:
            r4 = move-exception
            goto L77
        L37:
            org.apache.http.impl.conn.tsccm.WaitingThread r4 = r4.nextThread()     // Catch: java.lang.Throwable -> L35
            goto L6c
        L3c:
            java.util.Queue<org.apache.http.impl.conn.tsccm.WaitingThread> r4 = r3.waitingThreads     // Catch: java.lang.Throwable -> L35
            boolean r4 = r4.isEmpty()     // Catch: java.lang.Throwable -> L35
            if (r4 != 0) goto L5c
            org.apache.commons.logging.Log r4 = r3.f74314b     // Catch: java.lang.Throwable -> L35
            boolean r4 = r4.isDebugEnabled()     // Catch: java.lang.Throwable -> L35
            if (r4 == 0) goto L53
            org.apache.commons.logging.Log r4 = r3.f74314b     // Catch: java.lang.Throwable -> L35
            java.lang.String r0 = "Notifying thread waiting on any pool"
            r4.debug(r0)     // Catch: java.lang.Throwable -> L35
        L53:
            java.util.Queue<org.apache.http.impl.conn.tsccm.WaitingThread> r4 = r3.waitingThreads     // Catch: java.lang.Throwable -> L35
            java.lang.Object r4 = r4.remove()     // Catch: java.lang.Throwable -> L35
            org.apache.http.impl.conn.tsccm.WaitingThread r4 = (org.apache.http.impl.conn.tsccm.WaitingThread) r4     // Catch: java.lang.Throwable -> L35
            goto L6c
        L5c:
            org.apache.commons.logging.Log r4 = r3.f74314b     // Catch: java.lang.Throwable -> L35
            boolean r4 = r4.isDebugEnabled()     // Catch: java.lang.Throwable -> L35
            if (r4 == 0) goto L6b
            org.apache.commons.logging.Log r4 = r3.f74314b     // Catch: java.lang.Throwable -> L35
            java.lang.String r0 = "Notifying no-one, there are no waiting threads"
            r4.debug(r0)     // Catch: java.lang.Throwable -> L35
        L6b:
            r4 = 0
        L6c:
            if (r4 == 0) goto L71
            r4.wakeup()     // Catch: java.lang.Throwable -> L35
        L71:
            java.util.concurrent.locks.Lock r4 = r3.f74315c
            r4.unlock()
            return
        L77:
            java.util.concurrent.locks.Lock r0 = r3.f74315c
            r0.unlock()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.http.impl.conn.tsccm.ConnPoolByRoute.notifyWaitingThread(org.apache.http.impl.conn.tsccm.RouteSpecificPool):void");
    }

    @Override // org.apache.http.impl.conn.tsccm.AbstractConnPool
    public PoolEntryRequest requestPoolEntry(HttpRoute httpRoute, Object obj) {
        return new C12600a(new WaitingThreadAborter(), httpRoute, obj);
    }

    public void setMaxTotalConnections(int i) {
        this.f74315c.lock();
        try {
            this.maxTotalConnections = i;
        } finally {
            this.f74315c.unlock();
        }
    }

    @Override // org.apache.http.impl.conn.tsccm.AbstractConnPool
    public void shutdown() {
        this.f74315c.lock();
        try {
            if (this.shutdown) {
                this.f74315c.unlock();
                return;
            }
            this.shutdown = true;
            Iterator<BasicPoolEntry> it = this.leasedConnections.iterator();
            while (it.hasNext()) {
                it.remove();
                m24615b(it.next());
            }
            Iterator<BasicPoolEntry> it2 = this.freeConnections.iterator();
            while (it2.hasNext()) {
                BasicPoolEntry next = it2.next();
                it2.remove();
                if (this.f74314b.isDebugEnabled()) {
                    Log log = this.f74314b;
                    log.debug("Closing connection [" + next.getPlannedRoute() + "][" + next.getState() + "]");
                }
                m24615b(next);
            }
            Iterator<WaitingThread> it3 = this.waitingThreads.iterator();
            while (it3.hasNext()) {
                it3.remove();
                it3.next().wakeup();
            }
            this.routeToPool.clear();
            this.f74315c.unlock();
        } catch (Throwable th2) {
            this.f74315c.unlock();
            throw th2;
        }
    }

    public ConnPoolByRoute(ClientConnectionOperator clientConnectionOperator, ConnPerRoute connPerRoute, int i, long j, TimeUnit timeUnit) {
        this.f74314b = LogFactory.getLog(getClass());
        Args.notNull(clientConnectionOperator, "Connection operator");
        Args.notNull(connPerRoute, "Connections per route");
        this.f74315c = this.poolLock;
        this.leasedConnections = super.leasedConnections;
        this.operator = clientConnectionOperator;
        this.connPerRoute = connPerRoute;
        this.maxTotalConnections = i;
        this.freeConnections = createFreeConnQueue();
        this.waitingThreads = createWaitingThreadQueue();
        this.routeToPool = createRouteToPoolMap();
        this.f74316d = j;
        this.f74317e = timeUnit;
    }

    public int getConnectionsInPool() {
        this.f74315c.lock();
        try {
            return this.numConnections;
        } finally {
            this.f74315c.unlock();
        }
    }

    @Deprecated
    public ConnPoolByRoute(ClientConnectionOperator clientConnectionOperator, HttpParams httpParams) {
        this(clientConnectionOperator, ConnManagerParams.getMaxConnectionsPerRoute(httpParams), ConnManagerParams.getMaxTotalConnections(httpParams));
    }
}
