package ch.qos.logback.classic.net;

import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.classic.joran.JoranConfigurator;
import ch.qos.logback.core.joran.spi.JoranException;
import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;
import javax.net.ServerSocketFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* loaded from: classes.dex */
public class SimpleSocketServer extends Thread {

    /* renamed from: b */
    public final int f39572b;

    /* renamed from: c */
    public final LoggerContext f39573c;

    /* renamed from: e */
    public ServerSocket f39575e;

    /* renamed from: g */
    public CountDownLatch f39577g;

    /* renamed from: a */
    public Logger f39571a = LoggerFactory.getLogger(SimpleSocketServer.class);

    /* renamed from: d */
    public boolean f39574d = false;

    /* renamed from: f */
    public List f39576f = new ArrayList();

    public SimpleSocketServer(LoggerContext loggerContext, int i) {
        this.f39573c = loggerContext;
        this.f39572b = i;
    }

    /* renamed from: a */
    public static int m51612a(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            e.printStackTrace();
            m51610c("Could not interpret port number [" + str + "].");
            return -1;
        }
    }

    /* renamed from: c */
    public static void m51610c(String str) {
        PrintStream printStream = System.err;
        printStream.println(str);
        printStream.println("Usage: java " + SimpleSocketServer.class.getName() + " port configFile");
        System.exit(1);
    }

    public static void configureLC(LoggerContext loggerContext, String str) throws JoranException {
        JoranConfigurator joranConfigurator = new JoranConfigurator();
        loggerContext.reset();
        joranConfigurator.setContext(loggerContext);
        joranConfigurator.doConfigure(str);
    }

    public static void doMain(Class<? extends SimpleSocketServer> cls, String[] strArr) throws Exception {
        int i;
        if (strArr.length == 2) {
            i = m51612a(strArr[0]);
        } else {
            m51610c("Wrong number of arguments.");
            i = -1;
        }
        String str = strArr[1];
        LoggerContext loggerContext = (LoggerContext) LoggerFactory.getILoggerFactory();
        configureLC(loggerContext, str);
        new SimpleSocketServer(loggerContext, i).start();
    }

    public static void main(String[] strArr) throws Exception {
        doMain(SimpleSocketServer.class, strArr);
    }

    /* renamed from: b */
    public void m51611b() {
        CountDownLatch countDownLatch = this.f39577g;
        if (countDownLatch == null || countDownLatch.getCount() == 0) {
            return;
        }
        this.f39577g.countDown();
    }

    public void close() {
        this.f39574d = true;
        ServerSocket serverSocket = this.f39575e;
        if (serverSocket != null) {
            try {
                try {
                    serverSocket.close();
                } finally {
                    this.f39575e = null;
                }
            } catch (IOException e) {
                this.f39571a.error("Failed to close serverSocket", (Throwable) e);
            }
        }
        this.f39571a.info("closing this server");
        synchronized (this.f39576f) {
            try {
                for (SocketNode socketNode : this.f39576f) {
                    socketNode.close();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (this.f39576f.size() != 0) {
            this.f39571a.warn("Was expecting a 0-sized socketNodeList after server shutdown");
        }
    }

    public String getClientThreadName(Socket socket) {
        return String.format(Locale.US, "Logback SocketNode (client: %s)", socket.getRemoteSocketAddress());
    }

    public CountDownLatch getLatch() {
        return this.f39577g;
    }

    public ServerSocketFactory getServerSocketFactory() {
        return ServerSocketFactory.getDefault();
    }

    public String getServerThreadName() {
        return String.format(Locale.US, "Logback %s (port %d)", getClass().getSimpleName(), Integer.valueOf(this.f39572b));
    }

    public boolean isClosed() {
        return this.f39574d;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        String name = Thread.currentThread().getName();
        try {
            try {
                Thread.currentThread().setName(getServerThreadName());
                Logger logger = this.f39571a;
                logger.info("Listening on port " + this.f39572b);
                this.f39575e = getServerSocketFactory().createServerSocket(this.f39572b);
                while (!this.f39574d) {
                    this.f39571a.info("Waiting to accept a new client.");
                    m51611b();
                    Socket accept = this.f39575e.accept();
                    Logger logger2 = this.f39571a;
                    logger2.info("Connected to client at " + accept.getInetAddress());
                    this.f39571a.info("Starting new socket node.");
                    SocketNode socketNode = new SocketNode(this, accept, this.f39573c);
                    synchronized (this.f39576f) {
                        this.f39576f.add(socketNode);
                    }
                    new Thread(socketNode, getClientThreadName(accept)).start();
                }
            } catch (Exception e) {
                if (this.f39574d) {
                    this.f39571a.info("Exception in run method for a closed server. This is normal.");
                } else {
                    this.f39571a.error("Unexpected failure in run method", (Throwable) e);
                }
            }
        } finally {
            Thread.currentThread().setName(name);
        }
    }

    public void socketNodeClosing(SocketNode socketNode) {
        this.f39571a.debug("Removing {}", socketNode);
        synchronized (this.f39576f) {
            this.f39576f.remove(socketNode);
        }
    }
}
