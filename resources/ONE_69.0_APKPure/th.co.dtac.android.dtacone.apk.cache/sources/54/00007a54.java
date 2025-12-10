package ch.qos.logback.core.net;

import ch.qos.logback.core.net.SocketConnector;
import ch.qos.logback.core.util.DelayStrategy;
import ch.qos.logback.core.util.FixedDelay;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import javax.net.SocketFactory;

/* loaded from: classes.dex */
public class DefaultSocketConnector implements SocketConnector {

    /* renamed from: a */
    public final InetAddress f39856a;

    /* renamed from: b */
    public final int f39857b;

    /* renamed from: c */
    public final DelayStrategy f39858c;

    /* renamed from: d */
    public SocketConnector.ExceptionHandler f39859d;

    /* renamed from: e */
    public SocketFactory f39860e;

    /* renamed from: ch.qos.logback.core.net.DefaultSocketConnector$b */
    /* loaded from: classes.dex */
    public static class C5464b implements SocketConnector.ExceptionHandler {
        public C5464b() {
        }

        @Override // ch.qos.logback.core.net.SocketConnector.ExceptionHandler
        public void connectionFailed(SocketConnector socketConnector, Exception exc) {
            System.out.println(exc);
        }
    }

    public DefaultSocketConnector(InetAddress inetAddress, int i, long j, long j2) {
        this(inetAddress, i, new FixedDelay(j, j2));
    }

    /* renamed from: a */
    public final Socket m51454a() {
        try {
            return this.f39860e.createSocket(this.f39856a, this.f39857b);
        } catch (IOException e) {
            this.f39859d.connectionFailed(this, e);
            return null;
        }
    }

    /* renamed from: b */
    public final void m51453b() {
        if (this.f39859d == null) {
            this.f39859d = new C5464b();
        }
        if (this.f39860e == null) {
            this.f39860e = SocketFactory.getDefault();
        }
    }

    @Override // ch.qos.logback.core.net.SocketConnector
    public void setExceptionHandler(SocketConnector.ExceptionHandler exceptionHandler) {
        this.f39859d = exceptionHandler;
    }

    @Override // ch.qos.logback.core.net.SocketConnector
    public void setSocketFactory(SocketFactory socketFactory) {
        this.f39860e = socketFactory;
    }

    public DefaultSocketConnector(InetAddress inetAddress, int i, DelayStrategy delayStrategy) {
        this.f39856a = inetAddress;
        this.f39857b = i;
        this.f39858c = delayStrategy;
    }

    @Override // ch.qos.logback.core.net.SocketConnector, java.util.concurrent.Callable
    public Socket call() throws InterruptedException {
        Socket m51454a;
        m51453b();
        while (true) {
            m51454a = m51454a();
            if (m51454a != null || Thread.currentThread().isInterrupted()) {
                break;
            }
            Thread.sleep(this.f39858c.nextDelay());
        }
        return m51454a;
    }
}