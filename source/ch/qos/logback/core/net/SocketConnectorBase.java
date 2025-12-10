package ch.qos.logback.core.net;

import ch.qos.logback.core.net.SocketConnector;
import java.net.InetAddress;
import java.net.Socket;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import javax.net.SocketFactory;

/* loaded from: classes.dex */
public class SocketConnectorBase implements SocketConnector {

    /* renamed from: a */
    public final Lock f39888a;

    /* renamed from: b */
    public final Condition f39889b;

    /* renamed from: c */
    public final InetAddress f39890c;

    /* renamed from: d */
    public final int f39891d;

    /* renamed from: e */
    public SocketConnector.ExceptionHandler f39892e;

    /* renamed from: f */
    public SocketFactory f39893f;

    /* renamed from: g */
    public DelayStrategy f39894g;

    /* renamed from: h */
    public Socket f39895h;

    /* loaded from: classes.dex */
    public interface DelayStrategy {
        int nextDelay();
    }

    /* renamed from: ch.qos.logback.core.net.SocketConnectorBase$b */
    /* loaded from: classes.dex */
    public static class C5478b implements SocketConnector.ExceptionHandler {
        public C5478b() {
        }

        @Override // ch.qos.logback.core.net.SocketConnector.ExceptionHandler
        public void connectionFailed(SocketConnector socketConnector, Exception exc) {
            System.out.println(exc);
        }
    }

    /* renamed from: ch.qos.logback.core.net.SocketConnectorBase$c */
    /* loaded from: classes.dex */
    public static class C5479c implements DelayStrategy {

        /* renamed from: a */
        public final int f39896a;

        /* renamed from: b */
        public int f39897b;

        public C5479c(int i, int i2) {
            this.f39897b = i;
            this.f39896a = i2;
        }

        @Override // ch.qos.logback.core.net.SocketConnectorBase.DelayStrategy
        public int nextDelay() {
            int i = this.f39897b;
            this.f39897b = this.f39896a;
            return i;
        }
    }

    public SocketConnectorBase(InetAddress inetAddress, int i, int i2, int i3) {
        this(inetAddress, i, new C5479c(i2, i3));
    }

    /* renamed from: a */
    public final void m51453a() {
        this.f39888a.lock();
        try {
            this.f39889b.signalAll();
        } finally {
            this.f39888a.unlock();
        }
    }

    public Socket awaitConnection() throws InterruptedException {
        return awaitConnection(Long.MAX_VALUE);
    }

    public void run() {
        if (this.f39895h != null) {
            throw new IllegalStateException("connector cannot be reused");
        }
        if (this.f39892e == null) {
            this.f39892e = new C5478b();
        }
        if (this.f39893f == null) {
            this.f39893f = SocketFactory.getDefault();
        }
        while (!Thread.currentThread().isInterrupted()) {
            try {
                Thread.sleep(this.f39894g.nextDelay());
                try {
                    this.f39895h = this.f39893f.createSocket(this.f39890c, this.f39891d);
                    m51453a();
                    return;
                } catch (Exception e) {
                    this.f39892e.connectionFailed(this, e);
                }
            } catch (InterruptedException e2) {
                this.f39892e.connectionFailed(this, e2);
                return;
            }
        }
    }

    @Override // ch.qos.logback.core.net.SocketConnector
    public void setExceptionHandler(SocketConnector.ExceptionHandler exceptionHandler) {
        this.f39892e = exceptionHandler;
    }

    @Override // ch.qos.logback.core.net.SocketConnector
    public void setSocketFactory(SocketFactory socketFactory) {
        this.f39893f = socketFactory;
    }

    public SocketConnectorBase(InetAddress inetAddress, int i, DelayStrategy delayStrategy) {
        ReentrantLock reentrantLock = new ReentrantLock();
        this.f39888a = reentrantLock;
        this.f39889b = reentrantLock.newCondition();
        this.f39890c = inetAddress;
        this.f39891d = i;
        this.f39894g = delayStrategy;
    }

    public Socket awaitConnection(long j) throws InterruptedException {
        Socket socket;
        this.f39888a.lock();
        boolean z = false;
        while (true) {
            try {
                socket = this.f39895h;
                if (socket != null || z) {
                    break;
                }
                z = !this.f39889b.await(j, TimeUnit.MILLISECONDS);
            } finally {
                this.f39888a.unlock();
            }
        }
        return socket;
    }

    @Override // ch.qos.logback.core.net.SocketConnector, java.util.concurrent.Callable
    public Socket call() throws InterruptedException {
        return null;
    }
}
