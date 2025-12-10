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

/* renamed from: ix1  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class RunnableC20471ix1 implements Runnable {

    /* renamed from: a */
    public final SocketConfig f67119a;

    /* renamed from: b */
    public final ServerSocket f67120b;

    /* renamed from: c */
    public final HttpService f67121c;

    /* renamed from: d */
    public final HttpConnectionFactory f67122d;

    /* renamed from: e */
    public final ExceptionLogger f67123e;

    /* renamed from: f */
    public final ExecutorService f67124f;

    /* renamed from: g */
    public final AtomicBoolean f67125g = new AtomicBoolean(false);

    public RunnableC20471ix1(SocketConfig socketConfig, ServerSocket serverSocket, HttpService httpService, HttpConnectionFactory httpConnectionFactory, ExceptionLogger exceptionLogger, ExecutorService executorService) {
        this.f67119a = socketConfig;
        this.f67120b = serverSocket;
        this.f67122d = httpConnectionFactory;
        this.f67121c = httpService;
        this.f67123e = exceptionLogger;
        this.f67124f = executorService;
    }

    /* renamed from: a */
    public boolean m29296a() {
        return this.f67125g.get();
    }

    /* renamed from: b */
    public void m29295b() {
        if (this.f67125g.compareAndSet(false, true)) {
            this.f67120b.close();
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        while (!m29296a() && !Thread.interrupted()) {
            try {
                Socket accept = this.f67120b.accept();
                accept.setSoTimeout(this.f67119a.getSoTimeout());
                accept.setKeepAlive(this.f67119a.isSoKeepAlive());
                accept.setTcpNoDelay(this.f67119a.isTcpNoDelay());
                if (this.f67119a.getRcvBufSize() > 0) {
                    accept.setReceiveBufferSize(this.f67119a.getRcvBufSize());
                }
                if (this.f67119a.getSndBufSize() > 0) {
                    accept.setSendBufferSize(this.f67119a.getSndBufSize());
                }
                if (this.f67119a.getSoLinger() >= 0) {
                    accept.setSoLinger(true, this.f67119a.getSoLinger());
                }
                this.f67124f.execute(new RunnableC21875r62(this.f67121c, (HttpServerConnection) this.f67122d.createConnection(accept), this.f67123e));
            } catch (Exception e) {
                this.f67123e.log(e);
                return;
            }
        }
    }
}
