package p000;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import org.apache.http.ExceptionLogger;
import org.apache.http.HttpConnectionFactory;
import org.apache.http.HttpServerConnection;
import org.apache.http.config.SocketConfig;
import org.apache.http.protocol.HttpService;

/* renamed from: fy1  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class RunnableC20010fy1 implements Runnable {

    /* renamed from: a */
    public final SocketConfig f62029a;

    /* renamed from: b */
    public final ServerSocket f62030b;

    /* renamed from: c */
    public final HttpService f62031c;

    /* renamed from: d */
    public final HttpConnectionFactory f62032d;

    /* renamed from: e */
    public final ExceptionLogger f62033e;

    /* renamed from: f */
    public final ExecutorService f62034f;

    /* renamed from: g */
    public final AtomicBoolean f62035g = new AtomicBoolean(false);

    public RunnableC20010fy1(SocketConfig socketConfig, ServerSocket serverSocket, HttpService httpService, HttpConnectionFactory httpConnectionFactory, ExceptionLogger exceptionLogger, ExecutorService executorService) {
        this.f62029a = socketConfig;
        this.f62030b = serverSocket;
        this.f62032d = httpConnectionFactory;
        this.f62031c = httpService;
        this.f62033e = exceptionLogger;
        this.f62034f = executorService;
    }

    /* renamed from: a */
    public boolean m31457a() {
        return this.f62035g.get();
    }

    /* renamed from: b */
    public void m31456b() {
        if (this.f62035g.compareAndSet(false, true)) {
            this.f62030b.close();
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        while (!m31457a() && !Thread.interrupted()) {
            try {
                Socket accept = this.f62030b.accept();
                accept.setSoTimeout(this.f62029a.getSoTimeout());
                accept.setKeepAlive(this.f62029a.isSoKeepAlive());
                accept.setTcpNoDelay(this.f62029a.isTcpNoDelay());
                if (this.f62029a.getRcvBufSize() > 0) {
                    accept.setReceiveBufferSize(this.f62029a.getRcvBufSize());
                }
                if (this.f62029a.getSndBufSize() > 0) {
                    accept.setSendBufferSize(this.f62029a.getSndBufSize());
                }
                if (this.f62029a.getSoLinger() >= 0) {
                    accept.setSoLinger(true, this.f62029a.getSoLinger());
                }
                this.f62034f.execute(new RunnableC21422o72(this.f62031c, (HttpServerConnection) this.f62032d.createConnection(accept), this.f62033e));
            } catch (Exception e) {
                this.f62033e.log(e);
                return;
            }
        }
    }
}