package ch.qos.logback.classic.net.server;

import ch.qos.logback.classic.net.ReceiverBase;
import ch.qos.logback.core.net.AbstractSocketAppender;
import ch.qos.logback.core.net.server.ServerListener;
import ch.qos.logback.core.net.server.ServerRunner;
import ch.qos.logback.core.util.CloseUtil;
import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.UnknownHostException;
import java.util.concurrent.Executor;
import javax.net.ServerSocketFactory;

/* loaded from: classes.dex */
public class ServerSocketReceiver extends ReceiverBase {
    public static final int DEFAULT_BACKLOG = 50;

    /* renamed from: d */
    public int f39604d = AbstractSocketAppender.DEFAULT_PORT;

    /* renamed from: e */
    public int f39605e = 50;

    /* renamed from: f */
    public String f39606f;

    /* renamed from: g */
    public ServerRunner f39607g;

    public ServerListener<InterfaceC19949fv1> createServerListener(ServerSocket serverSocket) {
        return new C20121gv1(serverSocket);
    }

    public ServerRunner createServerRunner(ServerListener<InterfaceC19949fv1> serverListener, Executor executor) {
        return new C20293hv1(serverListener, executor);
    }

    public String getAddress() {
        return this.f39606f;
    }

    public int getBacklog() {
        return this.f39605e;
    }

    public InetAddress getInetAddress() throws UnknownHostException {
        if (getAddress() == null) {
            return null;
        }
        return InetAddress.getByName(getAddress());
    }

    public int getPort() {
        return this.f39604d;
    }

    @Override // ch.qos.logback.classic.net.ReceiverBase
    public Runnable getRunnableTask() {
        return this.f39607g;
    }

    public ServerSocketFactory getServerSocketFactory() throws Exception {
        return ServerSocketFactory.getDefault();
    }

    @Override // ch.qos.logback.classic.net.ReceiverBase
    public void onStop() {
        try {
            ServerRunner serverRunner = this.f39607g;
            if (serverRunner == null) {
                return;
            }
            serverRunner.stop();
        } catch (IOException e) {
            addError("server shutdown error: " + e, e);
        }
    }

    public void setAddress(String str) {
        this.f39606f = str;
    }

    public void setBacklog(int i) {
        this.f39605e = i;
    }

    public void setPort(int i) {
        this.f39604d = i;
    }

    @Override // ch.qos.logback.classic.net.ReceiverBase
    public boolean shouldStart() {
        ServerSocket serverSocket = null;
        try {
            serverSocket = getServerSocketFactory().createServerSocket(getPort(), getBacklog(), getInetAddress());
            ServerRunner createServerRunner = createServerRunner(createServerListener(serverSocket), getContext().getScheduledExecutorService());
            this.f39607g = createServerRunner;
            createServerRunner.setContext(getContext());
            return true;
        } catch (Exception e) {
            addError("server startup error: " + e, e);
            CloseUtil.closeQuietly(serverSocket);
            return false;
        }
    }
}
