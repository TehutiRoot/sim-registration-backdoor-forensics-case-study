package p000;

import java.io.Closeable;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.apache.commons.logging.Log;
import org.apache.http.HttpClientConnection;
import org.apache.http.concurrent.Cancellable;
import org.apache.http.conn.ConnectionReleaseTrigger;
import org.apache.http.conn.HttpClientConnectionManager;

/* renamed from: Qw */
/* loaded from: classes6.dex */
public class C1210Qw implements ConnectionReleaseTrigger, Cancellable, Closeable {

    /* renamed from: a */
    public final Log f5210a;

    /* renamed from: b */
    public final HttpClientConnectionManager f5211b;

    /* renamed from: c */
    public final HttpClientConnection f5212c;

    /* renamed from: d */
    public final AtomicBoolean f5213d = new AtomicBoolean(false);

    /* renamed from: e */
    public volatile boolean f5214e;

    /* renamed from: f */
    public volatile Object f5215f;

    /* renamed from: g */
    public volatile long f5216g;

    /* renamed from: h */
    public volatile TimeUnit f5217h;

    public C1210Qw(Log log, HttpClientConnectionManager httpClientConnectionManager, HttpClientConnection httpClientConnection) {
        this.f5210a = log;
        this.f5211b = httpClientConnectionManager;
        this.f5212c = httpClientConnection;
    }

    @Override // org.apache.http.conn.ConnectionReleaseTrigger
    public void abortConnection() {
        if (this.f5213d.compareAndSet(false, true)) {
            synchronized (this.f5212c) {
                try {
                    this.f5212c.shutdown();
                    this.f5210a.debug("Connection discarded");
                    this.f5211b.releaseConnection(this.f5212c, null, 0L, TimeUnit.MILLISECONDS);
                } catch (IOException e) {
                    if (this.f5210a.isDebugEnabled()) {
                        this.f5210a.debug(e.getMessage(), e);
                    }
                    this.f5211b.releaseConnection(this.f5212c, null, 0L, TimeUnit.MILLISECONDS);
                }
            }
        }
    }

    /* renamed from: b */
    public boolean m66519b() {
        return this.f5213d.get();
    }

    @Override // org.apache.http.concurrent.Cancellable
    public boolean cancel() {
        boolean z = this.f5213d.get();
        this.f5210a.debug("Cancelling request execution");
        abortConnection();
        return !z;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        m66516i(false);
    }

    /* renamed from: d */
    public boolean m66518d() {
        return this.f5214e;
    }

    /* renamed from: g */
    public void m66517g() {
        this.f5214e = false;
    }

    /* renamed from: i */
    public final void m66516i(boolean z) {
        if (this.f5213d.compareAndSet(false, true)) {
            synchronized (this.f5212c) {
                if (z) {
                    this.f5211b.releaseConnection(this.f5212c, this.f5215f, this.f5216g, this.f5217h);
                } else {
                    try {
                        this.f5212c.close();
                        this.f5210a.debug("Connection discarded");
                        this.f5211b.releaseConnection(this.f5212c, null, 0L, TimeUnit.MILLISECONDS);
                    } catch (IOException e) {
                        if (this.f5210a.isDebugEnabled()) {
                            this.f5210a.debug(e.getMessage(), e);
                        }
                        this.f5211b.releaseConnection(this.f5212c, null, 0L, TimeUnit.MILLISECONDS);
                    }
                }
            }
        }
    }

    /* renamed from: j */
    public void m66515j(long j, TimeUnit timeUnit) {
        synchronized (this.f5212c) {
            this.f5216g = j;
            this.f5217h = timeUnit;
        }
    }

    public void markReusable() {
        this.f5214e = true;
    }

    @Override // org.apache.http.conn.ConnectionReleaseTrigger
    public void releaseConnection() {
        m66516i(this.f5214e);
    }

    public void setState(Object obj) {
        this.f5215f = obj;
    }
}
