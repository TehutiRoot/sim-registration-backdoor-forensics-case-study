package ch.qos.logback.core.net.server;

import ch.qos.logback.core.AppenderBase;
import ch.qos.logback.core.net.AbstractSocketAppender;
import ch.qos.logback.core.spi.PreSerializationTransformer;
import java.io.IOException;
import java.io.Serializable;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.UnknownHostException;
import java.util.concurrent.Executor;
import javax.net.ServerSocketFactory;

/* loaded from: classes.dex */
public abstract class ServerSocketAppenderBase<E> extends AppenderBase<E> {
    public static final int DEFAULT_BACKLOG = 50;
    public static final int DEFAULT_CLIENT_QUEUE_SIZE = 100;

    /* renamed from: g */
    public int f39927g = AbstractSocketAppender.DEFAULT_PORT;

    /* renamed from: h */
    public int f39928h = 50;

    /* renamed from: i */
    public int f39929i = 100;

    /* renamed from: j */
    public String f39930j;

    /* renamed from: k */
    public ServerRunner f39931k;

    /* renamed from: ch.qos.logback.core.net.server.ServerSocketAppenderBase$a */
    /* loaded from: classes.dex */
    public class C5483a implements ClientVisitor {

        /* renamed from: a */
        public final /* synthetic */ Serializable f39932a;

        public C5483a(Serializable serializable) {
            this.f39932a = serializable;
        }

        @Override // ch.qos.logback.core.net.server.ClientVisitor
        /* renamed from: a */
        public void visit(InterfaceC22185sv1 interfaceC22185sv1) {
            interfaceC22185sv1.mo968e(this.f39932a);
        }
    }

    @Override // ch.qos.logback.core.AppenderBase
    public void append(E e) {
        if (e == null) {
            return;
        }
        postProcessEvent(e);
        this.f39931k.accept(new C5483a(getPST().transform(e)));
    }

    public ServerListener<InterfaceC22185sv1> createServerListener(ServerSocket serverSocket) {
        return new C22357tv1(serverSocket);
    }

    public ServerRunner<InterfaceC22185sv1> createServerRunner(ServerListener<InterfaceC22185sv1> serverListener, Executor executor) {
        return new C22529uv1(serverListener, executor, getClientQueueSize());
    }

    public String getAddress() {
        return this.f39930j;
    }

    public Integer getBacklog() {
        return Integer.valueOf(this.f39928h);
    }

    public int getClientQueueSize() {
        return this.f39929i;
    }

    public InetAddress getInetAddress() throws UnknownHostException {
        if (getAddress() == null) {
            return null;
        }
        return InetAddress.getByName(getAddress());
    }

    public abstract PreSerializationTransformer<E> getPST();

    public int getPort() {
        return this.f39927g;
    }

    public ServerSocketFactory getServerSocketFactory() throws Exception {
        return ServerSocketFactory.getDefault();
    }

    public abstract void postProcessEvent(E e);

    public void setAddress(String str) {
        this.f39930j = str;
    }

    public void setBacklog(Integer num) {
        this.f39928h = num.intValue();
    }

    public void setClientQueueSize(int i) {
        this.f39929i = i;
    }

    public void setPort(int i) {
        this.f39927g = i;
    }

    @Override // ch.qos.logback.core.AppenderBase, ch.qos.logback.core.spi.LifeCycle
    public void start() {
        if (isStarted()) {
            return;
        }
        try {
            ServerRunner<InterfaceC22185sv1> createServerRunner = createServerRunner(createServerListener(getServerSocketFactory().createServerSocket(getPort(), getBacklog().intValue(), getInetAddress())), getContext().getScheduledExecutorService());
            this.f39931k = createServerRunner;
            createServerRunner.setContext(getContext());
            getContext().getScheduledExecutorService().execute(this.f39931k);
            super.start();
        } catch (Exception e) {
            addError("server startup error: " + e, e);
        }
    }

    @Override // ch.qos.logback.core.AppenderBase, ch.qos.logback.core.spi.LifeCycle
    public void stop() {
        if (isStarted()) {
            try {
                this.f39931k.stop();
                super.stop();
            } catch (IOException e) {
                addError("server shutdown error: " + e, e);
            }
        }
    }
}
