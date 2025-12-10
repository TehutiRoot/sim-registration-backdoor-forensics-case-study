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
    public final Lock f39886a;

    /* renamed from: b */
    public final Condition f39887b;

    /* renamed from: c */
    public final InetAddress f39888c;

    /* renamed from: d */
    public final int f39889d;

    /* renamed from: e */
    public SocketConnector.ExceptionHandler f39890e;

    /* renamed from: f */
    public SocketFactory f39891f;

    /* renamed from: g */
    public DelayStrategy f39892g;

    /* renamed from: h */
    public Socket f39893h;

    /* loaded from: classes.dex */
    public interface DelayStrategy {
        int nextDelay();
    }

    /* renamed from: ch.qos.logback.core.net.SocketConnectorBase$b */
    /* loaded from: classes.dex */
    public static class C5467b implements SocketConnector.ExceptionHandler {
        public C5467b() {
        }

        @Override // ch.qos.logback.core.net.SocketConnector.ExceptionHandler
        public void connectionFailed(SocketConnector socketConnector, Exception exc) {
            System.out.println(exc);
        }
    }

    /* renamed from: ch.qos.logback.core.net.SocketConnectorBase$c */
    /* loaded from: classes.dex */
    public static class C5468c implements DelayStrategy {

        /* renamed from: a */
        public final int f39894a;

        /* renamed from: b */
        public int f39895b;

        public C5468c(int i, int i2) {
            this.f39895b = i;
            this.f39894a = i2;
        }

        @Override // ch.qos.logback.core.net.SocketConnectorBase.DelayStrategy
        public int nextDelay() {
            int i = this.f39895b;
            this.f39895b = this.f39894a;
            return i;
        }
    }

    public SocketConnectorBase(InetAddress inetAddress, int i, int i2, int i3) {
        this(inetAddress, i, new C5468c(i2, i3));
    }

    /* renamed from: a */
    public final void m51448a() {
        this.f39886a.lock();
        try {
            this.f39887b.signalAll();
        } finally {
            this.f39886a.unlock();
        }
    }

    public Socket awaitConnection() throws InterruptedException {
        return awaitConnection(Long.MAX_VALUE);
    }

    public void run() {
        if (this.f39893h != null) {
            throw new IllegalStateException("connector cannot be reused");
        }
        if (this.f39890e == null) {
            this.f39890e = new C5467b();
        }
        if (this.f39891f == null) {
            this.f39891f = SocketFactory.getDefault();
        }
        while (!Thread.currentThread().isInterrupted()) {
            try {
                Thread.sleep(this.f39892g.nextDelay());
                try {
                    this.f39893h = this.f39891f.createSocket(this.f39888c, this.f39889d);
                    m51448a();
                    return;
                } catch (Exception e) {
                    this.f39890e.connectionFailed(this, e);
                }
            } catch (InterruptedException e2) {
                this.f39890e.connectionFailed(this, e2);
                return;
            }
        }
    }

    @Override // ch.qos.logback.core.net.SocketConnector
    public void setExceptionHandler(SocketConnector.ExceptionHandler exceptionHandler) {
        this.f39890e = exceptionHandler;
    }

    @Override // ch.qos.logback.core.net.SocketConnector
    public void setSocketFactory(SocketFactory socketFactory) {
        this.f39891f = socketFactory;
    }

    public SocketConnectorBase(InetAddress inetAddress, int i, DelayStrategy delayStrategy) {
        ReentrantLock reentrantLock = new ReentrantLock();
        this.f39886a = reentrantLock;
        this.f39887b = reentrantLock.newCondition();
        this.f39888c = inetAddress;
        this.f39889d = i;
        this.f39892g = delayStrategy;
    }

    public Socket awaitConnection(long j) throws InterruptedException {
        Socket socket;
        this.f39886a.lock();
        boolean z = false;
        while (true) {
            try {
                socket = this.f39893h;
                if (socket != null || z) {
                    break;
                }
                z = !this.f39887b.await(j, TimeUnit.MILLISECONDS);
            } finally {
                this.f39886a.unlock();
            }
        }
        return socket;
    }

    @Override // ch.qos.logback.core.net.SocketConnector, java.util.concurrent.Callable
    public Socket call() throws InterruptedException {
        return null;
    }
}