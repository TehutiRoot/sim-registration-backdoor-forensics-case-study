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
    public final int f73993a;

    /* renamed from: b */
    public final InetAddress f73994b;

    /* renamed from: c */
    public final SocketConfig f73995c;

    /* renamed from: d */
    public final ServerSocketFactory f73996d;

    /* renamed from: e */
    public final HttpService f73997e;

    /* renamed from: f */
    public final HttpConnectionFactory f73998f;

    /* renamed from: g */
    public final SSLServerSetupHandler f73999g;

    /* renamed from: h */
    public final ExceptionLogger f74000h;

    /* renamed from: i */
    public final ThreadPoolExecutor f74001i;

    /* renamed from: j */
    public final ThreadGroup f74002j;

    /* renamed from: k */
    public final C22047s62 f74003k;

    /* renamed from: l */
    public final AtomicReference f74004l;

    /* renamed from: m */
    public volatile ServerSocket f74005m;

    /* renamed from: n */
    public volatile RunnableC20471ix1 f74006n;

    /* loaded from: classes6.dex */
    public enum Status {
        READY,
        ACTIVE,
        STOPPING
    }

    public HttpServer(int i, InetAddress inetAddress, SocketConfig socketConfig, ServerSocketFactory serverSocketFactory, HttpService httpService, HttpConnectionFactory httpConnectionFactory, SSLServerSetupHandler sSLServerSetupHandler, ExceptionLogger exceptionLogger) {
        this.f73993a = i;
        this.f73994b = inetAddress;
        this.f73995c = socketConfig;
        this.f73996d = serverSocketFactory;
        this.f73997e = httpService;
        this.f73998f = httpConnectionFactory;
        this.f73999g = sSLServerSetupHandler;
        this.f74000h = exceptionLogger;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        SynchronousQueue synchronousQueue = new SynchronousQueue();
        this.f74001i = new ThreadPoolExecutor(1, 1, 0L, timeUnit, synchronousQueue, new NS1("HTTP-listener-" + i));
        ThreadGroup threadGroup = new ThreadGroup("HTTP-workers");
        this.f74002j = threadGroup;
        this.f74003k = new C22047s62(0, Integer.MAX_VALUE, 1L, TimeUnit.SECONDS, new SynchronousQueue(), new NS1("HTTP-worker", threadGroup));
        this.f74004l = new AtomicReference(Status.READY);
    }

    public void awaitTermination(long j, TimeUnit timeUnit) throws InterruptedException {
        this.f74003k.awaitTermination(j, timeUnit);
    }

    public InetAddress getInetAddress() {
        ServerSocket serverSocket = this.f74005m;
        if (serverSocket != null) {
            return serverSocket.getInetAddress();
        }
        return null;
    }

    public int getLocalPort() {
        ServerSocket serverSocket = this.f74005m;
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
        for (RunnableC21875r62 runnableC21875r62 : this.f74003k.m22711a()) {
            try {
                runnableC21875r62.m23358a().shutdown();
            } catch (IOException e) {
                this.f74000h.log(e);
            }
        }
    }

    public void start() throws IOException {
        if (AbstractC17300An1.m69050a(this.f74004l, Status.READY, Status.ACTIVE)) {
            this.f74005m = this.f73996d.createServerSocket(this.f73993a, this.f73995c.getBacklogSize(), this.f73994b);
            this.f74005m.setReuseAddress(this.f73995c.isSoReuseAddress());
            if (this.f73995c.getRcvBufSize() > 0) {
                this.f74005m.setReceiveBufferSize(this.f73995c.getRcvBufSize());
            }
            if (this.f73999g != null && (this.f74005m instanceof SSLServerSocket)) {
                this.f73999g.initialize((SSLServerSocket) this.f74005m);
            }
            this.f74006n = new RunnableC20471ix1(this.f73995c, this.f74005m, this.f73997e, this.f73998f, this.f74000h, this.f74003k);
            this.f74001i.execute(this.f74006n);
        }
    }

    public void stop() {
        if (AbstractC17300An1.m69050a(this.f74004l, Status.ACTIVE, Status.STOPPING)) {
            this.f74001i.shutdown();
            this.f74003k.shutdown();
            RunnableC20471ix1 runnableC20471ix1 = this.f74006n;
            if (runnableC20471ix1 != null) {
                try {
                    runnableC20471ix1.m29295b();
                } catch (IOException e) {
                    this.f74000h.log(e);
                }
            }
            this.f74002j.interrupt();
        }
    }
}
