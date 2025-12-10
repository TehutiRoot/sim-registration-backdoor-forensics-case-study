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
public abstract class AbstractServerSocketAppender<E> extends AppenderBase<E> {
    public static final int DEFAULT_BACKLOG = 50;
    public static final int DEFAULT_CLIENT_QUEUE_SIZE = 100;

    /* renamed from: g */
    public int f39910g = AbstractSocketAppender.DEFAULT_PORT;

    /* renamed from: h */
    public int f39911h = 50;

    /* renamed from: i */
    public int f39912i = 100;

    /* renamed from: j */
    public String f39913j;

    /* renamed from: k */
    public ServerRunner f39914k;

    /* renamed from: ch.qos.logback.core.net.server.AbstractServerSocketAppender$a */
    /* loaded from: classes.dex */
    public class C5480a implements ClientVisitor {

        /* renamed from: a */
        public final /* synthetic */ Serializable f39915a;

        public C5480a(Serializable serializable) {
            this.f39915a = serializable;
        }

        @Override // ch.qos.logback.core.net.server.ClientVisitor
        /* renamed from: a */
        public void visit(InterfaceC22185sv1 interfaceC22185sv1) {
            interfaceC22185sv1.mo968e(this.f39915a);
        }
    }

    @Override // ch.qos.logback.core.AppenderBase
    public void append(E e) {
        if (e == null) {
            return;
        }
        postProcessEvent(e);
        this.f39914k.accept(new C5480a(getPST().transform(e)));
    }

    public ServerListener<InterfaceC22185sv1> createServerListener(ServerSocket serverSocket) {
        return new C22357tv1(serverSocket);
    }

    public ServerRunner<InterfaceC22185sv1> createServerRunner(ServerListener<InterfaceC22185sv1> serverListener, Executor executor) {
        return new C22529uv1(serverListener, executor, getClientQueueSize());
    }

    public String getAddress() {
        return this.f39913j;
    }

    public int getBacklog() {
        return this.f39911h;
    }

    public int getClientQueueSize() {
        return this.f39912i;
    }

    public InetAddress getInetAddress() throws UnknownHostException {
        if (getAddress() == null) {
            return null;
        }
        return InetAddress.getByName(getAddress());
    }

    public abstract PreSerializationTransformer<E> getPST();

    public int getPort() {
        return this.f39910g;
    }

    public ServerSocketFactory getServerSocketFactory() throws Exception {
        return ServerSocketFactory.getDefault();
    }

    public abstract void postProcessEvent(E e);

    public void setAddress(String str) {
        this.f39913j = str;
    }

    public void setBacklog(int i) {
        this.f39911h = i;
    }

    public void setClientQueueSize(int i) {
        this.f39912i = i;
    }

    public void setPort(int i) {
        this.f39910g = i;
    }

    @Override // ch.qos.logback.core.AppenderBase, ch.qos.logback.core.spi.LifeCycle
    public void start() {
        if (isStarted()) {
            return;
        }
        try {
            ServerRunner<InterfaceC22185sv1> createServerRunner = createServerRunner(createServerListener(getServerSocketFactory().createServerSocket(getPort(), getBacklog(), getInetAddress())), getContext().getScheduledExecutorService());
            this.f39914k = createServerRunner;
            createServerRunner.setContext(getContext());
            getContext().getScheduledExecutorService().execute(this.f39914k);
            super.start();
        } catch (Exception e) {
            addError("server startup error: " + e, e);
        }
    }

    @Override // ch.qos.logback.core.AppenderBase, ch.qos.logback.core.spi.LifeCycle
    public void stop() {
        if (isStarted()) {
            try {
                this.f39914k.stop();
                super.stop();
            } catch (IOException e) {
                addError("server shutdown error: " + e, e);
            }
        }
    }
}
