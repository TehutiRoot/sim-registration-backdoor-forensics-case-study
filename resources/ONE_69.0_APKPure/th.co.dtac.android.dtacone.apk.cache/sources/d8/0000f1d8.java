package org.apache.http.impl.bootstrap;

import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import javax.net.ServerSocketFactory;
import javax.net.ssl.SSLServerSocket;
import org.apache.http.ExceptionLogger;
import org.apache.http.HttpConnectionFactory;
import org.apache.http.config.SocketConfig;
import org.apache.http.protocol.HttpService;

/* loaded from: classes6.dex */
public class HttpServer {

    /* renamed from: a */
    public final int f74077a;

    /* renamed from: b */
    public final InetAddress f74078b;

    /* renamed from: c */
    public final SocketConfig f74079c;

    /* renamed from: d */
    public final ServerSocketFactory f74080d;

    /* renamed from: e */
    public final HttpService f74081e;

    /* renamed from: f */
    public final HttpConnectionFactory f74082f;

    /* renamed from: g */
    public final SSLServerSetupHandler f74083g;

    /* renamed from: h */
    public final ExceptionLogger f74084h;

    /* renamed from: i */
    public final ThreadPoolExecutor f74085i;

    /* renamed from: j */
    public final ThreadGroup f74086j;

    /* renamed from: k */
    public final C21595p72 f74087k;

    /* renamed from: l */
    public final AtomicReference f74088l;

    /* renamed from: m */
    public volatile ServerSocket f74089m;

    /* renamed from: n */
    public volatile RunnableC20010fy1 f74090n;

    /* loaded from: classes6.dex */
    public enum Status {
        READY,
        ACTIVE,
        STOPPING
    }

    public HttpServer(int i, InetAddress inetAddress, SocketConfig socketConfig, ServerSocketFactory serverSocketFactory, HttpService httpService, HttpConnectionFactory httpConnectionFactory, SSLServerSetupHandler sSLServerSetupHandler, ExceptionLogger exceptionLogger) {
        this.f74077a = i;
        this.f74078b = inetAddress;
        this.f74079c = socketConfig;
        this.f74080d = serverSocketFactory;
        this.f74081e = httpService;
        this.f74082f = httpConnectionFactory;
        this.f74083g = sSLServerSetupHandler;
        this.f74084h = exceptionLogger;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        SynchronousQueue synchronousQueue = new SynchronousQueue();
        this.f74085i = new ThreadPoolExecutor(1, 1, 0L, timeUnit, synchronousQueue, new KT1("HTTP-listener-" + i));
        ThreadGroup threadGroup = new ThreadGroup("HTTP-workers");
        this.f74086j = threadGroup;
        this.f74087k = new C21595p72(0, Integer.MAX_VALUE, 1L, TimeUnit.SECONDS, new SynchronousQueue(), new KT1("HTTP-worker", threadGroup));
        this.f74088l = new AtomicReference(Status.READY);
    }

    public void awaitTermination(long j, TimeUnit timeUnit) throws InterruptedException {
        this.f74087k.awaitTermination(j, timeUnit);
    }

    public InetAddress getInetAddress() {
        ServerSocket serverSocket = this.f74089m;
        if (serverSocket != null) {
            return serverSocket.getInetAddress();
        }
        return null;
    }

    public int getLocalPort() {
        ServerSocket serverSocket = this.f74089m;
        if (serverSocket != null) {
            return serverSocket.getLocalPort();
        }
        return -1;
    }

    public void shutdown(long j, TimeUnit timeUnit) {
        stop();
        if (j > 0) {
            try {
                awaitTermination(j, timeUnit);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
        for (RunnableC21422o72 runnableC21422o72 : this.f74087k.m23920a()) {
            try {
                runnableC21422o72.m26151a().shutdown();
            } catch (IOException e) {
                this.f74084h.log(e);
            }
        }
    }

    public void start() throws IOException {
        if (AbstractC23094xo1.m479a(this.f74088l, Status.READY, Status.ACTIVE)) {
            this.f74089m = this.f74080d.createServerSocket(this.f74077a, this.f74079c.getBacklogSize(), this.f74078b);
            this.f74089m.setReuseAddress(this.f74079c.isSoReuseAddress());
            if (this.f74079c.getRcvBufSize() > 0) {
                this.f74089m.setReceiveBufferSize(this.f74079c.getRcvBufSize());
            }
            if (this.f74083g != null && (this.f74089m instanceof SSLServerSocket)) {
                this.f74083g.initialize((SSLServerSocket) this.f74089m);
            }
            this.f74090n = new RunnableC20010fy1(this.f74079c, this.f74089m, this.f74081e, this.f74082f, this.f74084h, this.f74087k);
            this.f74085i.execute(this.f74090n);
        }
    }

    public void stop() {
        if (AbstractC23094xo1.m479a(this.f74088l, Status.ACTIVE, Status.STOPPING)) {
            this.f74085i.shutdown();
            this.f74087k.shutdown();
            RunnableC20010fy1 runnableC20010fy1 = this.f74090n;
            if (runnableC20010fy1 != null) {
                try {
                    runnableC20010fy1.m31456b();
                } catch (IOException e) {
                    this.f74084h.log(e);
                }
            }
            this.f74086j.interrupt();
        }
    }
}