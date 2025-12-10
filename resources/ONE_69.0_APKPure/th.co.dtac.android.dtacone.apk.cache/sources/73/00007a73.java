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
    public int f39925g = AbstractSocketAppender.DEFAULT_PORT;

    /* renamed from: h */
    public int f39926h = 50;

    /* renamed from: i */
    public int f39927i = 100;

    /* renamed from: j */
    public String f39928j;

    /* renamed from: k */
    public ServerRunner f39929k;

    /* renamed from: ch.qos.logback.core.net.server.ServerSocketAppenderBase$a */
    /* loaded from: classes.dex */
    public class C5472a implements ClientVisitor {

        /* renamed from: a */
        public final /* synthetic */ Serializable f39930a;

        public C5472a(Serializable serializable) {
            this.f39930a = serializable;
        }

        @Override // ch.qos.logback.core.net.server.ClientVisitor
        /* renamed from: a */
        public void visit(InterfaceC21734pw1 interfaceC21734pw1) {
            interfaceC21734pw1.mo22763e(this.f39930a);
        }
    }

    @Override // ch.qos.logback.core.AppenderBase
    public void append(E e) {
        if (e == null) {
            return;
        }
        postProcessEvent(e);
        this.f39929k.accept(new C5472a(getPST().transform(e)));
    }

    public ServerListener<InterfaceC21734pw1> createServerListener(ServerSocket serverSocket) {
        return new C21907qw1(serverSocket);
    }

    public ServerRunner<InterfaceC21734pw1> createServerRunner(ServerListener<InterfaceC21734pw1> serverListener, Executor executor) {
        return new C22080rw1(serverListener, executor, getClientQueueSize());
    }

    public String getAddress() {
        return this.f39928j;
    }

    public Integer getBacklog() {
        return Integer.valueOf(this.f39926h);
    }

    public int getClientQueueSize() {
        return this.f39927i;
    }

    public InetAddress getInetAddress() throws UnknownHostException {
        if (getAddress() == null) {
            return null;
        }
        return InetAddress.getByName(getAddress());
    }

    public abstract PreSerializationTransformer<E> getPST();

    public int getPort() {
        return this.f39925g;
    }

    public ServerSocketFactory getServerSocketFactory() throws Exception {
        return ServerSocketFactory.getDefault();
    }

    public abstract void postProcessEvent(E e);

    public void setAddress(String str) {
        this.f39928j = str;
    }

    public void setBacklog(Integer num) {
        this.f39926h = num.intValue();
    }

    public void setClientQueueSize(int i) {
        this.f39927i = i;
    }

    public void setPort(int i) {
        this.f39925g = i;
    }

    @Override // ch.qos.logback.core.AppenderBase, ch.qos.logback.core.spi.LifeCycle
    public void start() {
        if (isStarted()) {
            return;
        }
        try {
            ServerRunner<InterfaceC21734pw1> createServerRunner = createServerRunner(createServerListener(getServerSocketFactory().createServerSocket(getPort(), getBacklog().intValue(), getInetAddress())), getContext().getScheduledExecutorService());
            this.f39929k = createServerRunner;
            createServerRunner.setContext(getContext());
            getContext().getScheduledExecutorService().execute(this.f39929k);
            super.start();
        } catch (Exception e) {
            addError("server startup error: " + e, e);
        }
    }

    @Override // ch.qos.logback.core.AppenderBase, ch.qos.logback.core.spi.LifeCycle
    public void stop() {
        if (isStarted()) {
            try {
                this.f39929k.stop();
                super.stop();
            } catch (IOException e) {
                addError("server shutdown error: " + e, e);
            }
        }
    }
}