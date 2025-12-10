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
    public final InetAddress f39858a;

    /* renamed from: b */
    public final int f39859b;

    /* renamed from: c */
    public final DelayStrategy f39860c;

    /* renamed from: d */
    public SocketConnector.ExceptionHandler f39861d;

    /* renamed from: e */
    public SocketFactory f39862e;

    /* renamed from: ch.qos.logback.core.net.DefaultSocketConnector$b */
    /* loaded from: classes.dex */
    public static class C5475b implements SocketConnector.ExceptionHandler {
        public C5475b() {
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
    public final Socket m51459a() {
        try {
            return this.f39862e.createSocket(this.f39858a, this.f39859b);
        } catch (IOException e) {
            this.f39861d.connectionFailed(this, e);
            return null;
        }
    }

    /* renamed from: b */
    public final void m51458b() {
        if (this.f39861d == null) {
            this.f39861d = new C5475b();
        }
        if (this.f39862e == null) {
            this.f39862e = SocketFactory.getDefault();
        }
    }

    @Override // ch.qos.logback.core.net.SocketConnector
    public void setExceptionHandler(SocketConnector.ExceptionHandler exceptionHandler) {
        this.f39861d = exceptionHandler;
    }

    @Override // ch.qos.logback.core.net.SocketConnector
    public void setSocketFactory(SocketFactory socketFactory) {
        this.f39862e = socketFactory;
    }

    public DefaultSocketConnector(InetAddress inetAddress, int i, DelayStrategy delayStrategy) {
        this.f39858a = inetAddress;
        this.f39859b = i;
        this.f39860c = delayStrategy;
    }

    @Override // ch.qos.logback.core.net.SocketConnector, java.util.concurrent.Callable
    public Socket call() throws InterruptedException {
        Socket m51459a;
        m51458b();
        while (true) {
            m51459a = m51459a();
            if (m51459a != null || Thread.currentThread().isInterrupted()) {
                break;
            }
            Thread.sleep(this.f39860c.nextDelay());
        }
        return m51459a;
    }
}
