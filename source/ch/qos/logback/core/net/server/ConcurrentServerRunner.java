package ch.qos.logback.core.net.server;

import ch.qos.logback.core.net.server.Client;
import ch.qos.logback.core.spi.ContextAwareBase;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
public abstract class ConcurrentServerRunner<T extends Client> extends ContextAwareBase implements Runnable, ServerRunner<T> {

    /* renamed from: c */
    public final Lock f39917c = new ReentrantLock();

    /* renamed from: d */
    public final Collection f39918d = new ArrayList();

    /* renamed from: e */
    public final ServerListener f39919e;

    /* renamed from: f */
    public final Executor f39920f;

    /* renamed from: g */
    public boolean f39921g;

    /* renamed from: ch.qos.logback.core.net.server.ConcurrentServerRunner$a */
    /* loaded from: classes.dex */
    public class C5481a implements ClientVisitor {
        public C5481a() {
        }

        @Override // ch.qos.logback.core.net.server.ClientVisitor
        public void visit(Client client) {
            client.close();
        }
    }

    /* renamed from: ch.qos.logback.core.net.server.ConcurrentServerRunner$b */
    /* loaded from: classes.dex */
    public class C5482b implements Client {

        /* renamed from: a */
        public final Client f39923a;

        public C5482b(Client client) {
            this.f39923a = client;
        }

        @Override // ch.qos.logback.core.net.server.Client, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f39923a.close();
        }

        @Override // java.lang.Runnable
        public void run() {
            ConcurrentServerRunner.this.m51447g(this.f39923a);
            try {
                this.f39923a.run();
            } finally {
                ConcurrentServerRunner.this.m51445j(this.f39923a);
            }
        }
    }

    public ConcurrentServerRunner(ServerListener<T> serverListener, Executor executor) {
        this.f39919e = serverListener;
        this.f39920f = executor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ch.qos.logback.core.net.server.ServerRunner
    public void accept(ClientVisitor<T> clientVisitor) {
        for (Client client : m51446i()) {
            try {
                clientVisitor.visit(client);
            } catch (RuntimeException e) {
                addError(client + ": " + e);
            }
        }
    }

    public abstract boolean configureClient(T t);

    /* renamed from: g */
    public final void m51447g(Client client) {
        this.f39917c.lock();
        try {
            this.f39918d.add(client);
        } finally {
            this.f39917c.unlock();
        }
    }

    /* renamed from: i */
    public final Collection m51446i() {
        this.f39917c.lock();
        try {
            return new ArrayList(this.f39918d);
        } finally {
            this.f39917c.unlock();
        }
    }

    @Override // ch.qos.logback.core.net.server.ServerRunner
    public boolean isRunning() {
        return this.f39921g;
    }

    /* renamed from: j */
    public final void m51445j(Client client) {
        this.f39917c.lock();
        try {
            this.f39918d.remove(client);
        } finally {
            this.f39917c.unlock();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public void run() {
        setRunning(true);
        try {
            addInfo("listening on " + this.f39919e);
            while (!Thread.currentThread().isInterrupted()) {
                Client acceptClient = this.f39919e.acceptClient();
                if (configureClient(acceptClient)) {
                    try {
                        this.f39920f.execute(new C5482b(acceptClient));
                    } catch (RejectedExecutionException unused) {
                        addError(acceptClient + ": connection dropped");
                    }
                } else {
                    addError(acceptClient + ": connection dropped");
                }
                acceptClient.close();
            }
        } catch (InterruptedException unused2) {
        } catch (Exception e) {
            addError("listener: " + e);
        }
        setRunning(false);
        addInfo("shutting down");
        this.f39919e.close();
    }

    public void setRunning(boolean z) {
        this.f39921g = z;
    }

    @Override // ch.qos.logback.core.net.server.ServerRunner
    public void stop() throws IOException {
        this.f39919e.close();
        accept(new C5481a());
    }
}
