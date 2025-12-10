package org.apache.http.impl.conn;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.HttpConnection;

@Deprecated
/* loaded from: classes6.dex */
public class IdleConnectionHandler {

    /* renamed from: a */
    public final Log f74254a = LogFactory.getLog(getClass());

    /* renamed from: b */
    public final Map f74255b = new HashMap();

    /* renamed from: org.apache.http.impl.conn.IdleConnectionHandler$a */
    /* loaded from: classes6.dex */
    public static class C12591a {

        /* renamed from: a */
        public final long f74256a;

        /* renamed from: b */
        public final long f74257b;

        public C12591a(long j, long j2, TimeUnit timeUnit) {
            this.f74256a = j;
            if (j2 > 0) {
                this.f74257b = j + timeUnit.toMillis(j2);
            } else {
                this.f74257b = Long.MAX_VALUE;
            }
        }
    }

    public void add(HttpConnection httpConnection, long j, TimeUnit timeUnit) {
        long currentTimeMillis = System.currentTimeMillis();
        if (this.f74254a.isDebugEnabled()) {
            Log log = this.f74254a;
            log.debug("Adding connection at: " + currentTimeMillis);
        }
        this.f74255b.put(httpConnection, new C12591a(currentTimeMillis, j, timeUnit));
    }

    public void closeExpiredConnections() {
        long currentTimeMillis = System.currentTimeMillis();
        if (this.f74254a.isDebugEnabled()) {
            Log log = this.f74254a;
            log.debug("Checking for expired connections, now: " + currentTimeMillis);
        }
        for (Map.Entry entry : this.f74255b.entrySet()) {
            HttpConnection httpConnection = (HttpConnection) entry.getKey();
            C12591a c12591a = (C12591a) entry.getValue();
            if (c12591a.f74257b <= currentTimeMillis) {
                if (this.f74254a.isDebugEnabled()) {
                    Log log2 = this.f74254a;
                    log2.debug("Closing connection, expired @: " + c12591a.f74257b);
                }
                try {
                    httpConnection.close();
                } catch (IOException e) {
                    this.f74254a.debug("I/O error closing connection", e);
                }
            }
        }
    }

    public void closeIdleConnections(long j) {
        long currentTimeMillis = System.currentTimeMillis() - j;
        if (this.f74254a.isDebugEnabled()) {
            Log log = this.f74254a;
            log.debug("Checking for connections, idle timeout: " + currentTimeMillis);
        }
        for (Map.Entry entry : this.f74255b.entrySet()) {
            HttpConnection httpConnection = (HttpConnection) entry.getKey();
            long j2 = ((C12591a) entry.getValue()).f74256a;
            if (j2 <= currentTimeMillis) {
                if (this.f74254a.isDebugEnabled()) {
                    Log log2 = this.f74254a;
                    log2.debug("Closing idle connection, connection time: " + j2);
                }
                try {
                    httpConnection.close();
                } catch (IOException e) {
                    this.f74254a.debug("I/O error closing connection", e);
                }
            }
        }
    }

    public boolean remove(HttpConnection httpConnection) {
        C12591a c12591a = (C12591a) this.f74255b.remove(httpConnection);
        if (c12591a == null) {
            this.f74254a.warn("Removing a connection that never existed!");
            return true;
        } else if (System.currentTimeMillis() <= c12591a.f74257b) {
            return true;
        } else {
            return false;
        }
    }

    public void removeAll() {
        this.f74255b.clear();
    }
}
