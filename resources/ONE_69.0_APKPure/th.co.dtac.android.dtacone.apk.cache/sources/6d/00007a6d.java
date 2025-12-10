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
    public final Lock f39915c = new ReentrantLock();

    /* renamed from: d */
    public final Collection f39916d = new ArrayList();

    /* renamed from: e */
    public final ServerListener f39917e;

    /* renamed from: f */
    public final Executor f39918f;

    /* renamed from: g */
    public boolean f39919g;

    /* renamed from: ch.qos.logback.core.net.server.ConcurrentServerRunner$a */
    /* loaded from: classes.dex */
    public class C5470a implements ClientVisitor {
        public C5470a() {
        }

        @Override // ch.qos.logback.core.net.server.ClientVisitor
        public void visit(Client client) {
            client.close();
        }
    }

    /* renamed from: ch.qos.logback.core.net.server.ConcurrentServerRunner$b */
    /* loaded from: classes.dex */
    public class C5471b implements Client {

        /* renamed from: a */
        public final Client f39921a;

        public C5471b(Client client) {
            this.f39921a = client;
        }

        @Override // ch.qos.logback.core.net.server.Client, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f39921a.close();
        }

        @Override // java.lang.Runnable
        public void run() {
            ConcurrentServerRunner.this.m51442g(this.f39921a);
            try {
                this.f39921a.run();
            } finally {
                ConcurrentServerRunner.this.m51440j(this.f39921a);
            }
        }
    }

    public ConcurrentServerRunner(ServerListener<T> serverListener, Executor executor) {
        this.f39917e = serverListener;
        this.f39918f = executor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ch.qos.logback.core.net.server.ServerRunner
    public void accept(ClientVisitor<T> clientVisitor) {
        for (Client client : m51441i()) {
            try {
                clientVisitor.visit(client);
            } catch (RuntimeException e) {
                addError(client + ": " + e);
            }
        }
    }

    public abstract boolean configureClient(T t);

    /* renamed from: g */
    public final void m51442g(Client client) {
        this.f39915c.lock();
        try {
            this.f39916d.add(client);
        } finally {
            this.f39915c.unlock();
        }
    }

    /* renamed from: i */
    public final Collection m51441i() {
        this.f39915c.lock();
        try {
            return new ArrayList(this.f39916d);
        } finally {
            this.f39915c.unlock();
        }
    }

    @Override // ch.qos.logback.core.net.server.ServerRunner
    public boolean isRunning() {
        return this.f39919g;
    }

    /* renamed from: j */
    public final void m51440j(Client client) {
        this.f39915c.lock();
        try {
            this.f39916d.remove(client);
        } finally {
            this.f39915c.unlock();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public void run() {
        setRunning(true);
        try {
            addInfo("listening on " + this.f39917e);
            while (!Thread.currentThread().isInterrupted()) {
                Client acceptClient = this.f39917e.acceptClient();
                if (configureClient(acceptClient)) {
                    try {
                        this.f39918f.execute(new C5471b(acceptClient));
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
        this.f39917e.close();
    }

    public void setRunning(boolean z) {
        this.f39919g = z;
    }

    @Override // ch.qos.logback.core.net.server.ServerRunner
    public void stop() throws IOException {
        this.f39917e.close();
        accept(new C5470a());
    }
}