package ch.qos.logback.classic.net;

import ch.qos.logback.classic.Logger;
import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.classic.net.server.HardenedLoggingEventInputStream;
import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.net.DefaultSocketConnector;
import ch.qos.logback.core.net.SocketConnector;
import ch.qos.logback.core.util.CloseUtil;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.net.ConnectException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import javax.net.SocketFactory;

/* loaded from: classes.dex */
public class SocketReceiver extends ReceiverBase implements Runnable, SocketConnector.ExceptionHandler {

    /* renamed from: d */
    public String f39587d;

    /* renamed from: e */
    public InetAddress f39588e;

    /* renamed from: f */
    public int f39589f;

    /* renamed from: g */
    public int f39590g;

    /* renamed from: h */
    public int f39591h = 5000;

    /* renamed from: i */
    public String f39592i;

    /* renamed from: j */
    public volatile Socket f39593j;

    /* renamed from: k */
    public Future f39594k;

    /* renamed from: b */
    public final Future m51609b(SocketConnector socketConnector) {
        try {
            return getContext().getScheduledExecutorService().submit(socketConnector);
        } catch (RejectedExecutionException unused) {
            return null;
        }
    }

    @Override // ch.qos.logback.core.net.SocketConnector.ExceptionHandler
    public void connectionFailed(SocketConnector socketConnector, Exception exc) {
        StringBuilder sb;
        String str;
        String sb2;
        if (exc instanceof InterruptedException) {
            sb2 = "connector interrupted";
        } else {
            if (exc instanceof ConnectException) {
                sb = new StringBuilder();
                sb.append(this.f39592i);
                str = "connection refused";
            } else {
                sb = new StringBuilder();
                sb.append(this.f39592i);
                str = "unspecified error";
            }
            sb.append(str);
            sb2 = sb.toString();
        }
        addWarn(sb2, exc);
    }

    /* renamed from: d */
    public final SocketConnector m51608d(InetAddress inetAddress, int i, int i2, int i3) {
        SocketConnector newConnector = newConnector(inetAddress, i, i2, i3);
        newConnector.setExceptionHandler(this);
        newConnector.setSocketFactory(getSocketFactory());
        return newConnector;
    }

    /* renamed from: g */
    public final void m51607g(LoggerContext loggerContext) {
        HardenedLoggingEventInputStream hardenedLoggingEventInputStream;
        StringBuilder sb;
        try {
            try {
                this.f39593j.setSoTimeout(this.f39591h);
                hardenedLoggingEventInputStream = new HardenedLoggingEventInputStream(this.f39593j.getInputStream());
            } catch (EOFException unused) {
                hardenedLoggingEventInputStream = null;
            } catch (IOException e) {
                e = e;
                hardenedLoggingEventInputStream = null;
            } catch (ClassNotFoundException e2) {
                e = e2;
                hardenedLoggingEventInputStream = null;
            } catch (Throwable th2) {
                th = th2;
                CloseUtil.closeQuietly((Closeable) null);
                CloseUtil.closeQuietly(this.f39593j);
                this.f39593j = null;
                addInfo(this.f39592i + "connection closed");
                throw th;
            }
            try {
                this.f39593j.setSoTimeout(0);
                addInfo(this.f39592i + "connection established");
                while (true) {
                    ILoggingEvent iLoggingEvent = (ILoggingEvent) hardenedLoggingEventInputStream.readObject();
                    Logger logger = loggerContext.getLogger(iLoggingEvent.getLoggerName());
                    if (logger.isEnabledFor(iLoggingEvent.getLevel())) {
                        logger.callAppenders(iLoggingEvent);
                    }
                }
            } catch (EOFException unused2) {
                addInfo(this.f39592i + "end-of-stream detected");
                CloseUtil.closeQuietly(hardenedLoggingEventInputStream);
                CloseUtil.closeQuietly(this.f39593j);
                this.f39593j = null;
                sb = new StringBuilder();
                sb.append(this.f39592i);
                sb.append("connection closed");
                addInfo(sb.toString());
            } catch (IOException e3) {
                e = e3;
                addInfo(this.f39592i + "connection failed: " + e);
                CloseUtil.closeQuietly(hardenedLoggingEventInputStream);
                CloseUtil.closeQuietly(this.f39593j);
                this.f39593j = null;
                sb = new StringBuilder();
                sb.append(this.f39592i);
                sb.append("connection closed");
                addInfo(sb.toString());
            } catch (ClassNotFoundException e4) {
                e = e4;
                addInfo(this.f39592i + "unknown event class: " + e);
                CloseUtil.closeQuietly(hardenedLoggingEventInputStream);
                CloseUtil.closeQuietly(this.f39593j);
                this.f39593j = null;
                sb = new StringBuilder();
                sb.append(this.f39592i);
                sb.append("connection closed");
                addInfo(sb.toString());
            }
        } catch (Throwable th3) {
            th = th3;
            CloseUtil.closeQuietly((Closeable) null);
            CloseUtil.closeQuietly(this.f39593j);
            this.f39593j = null;
            addInfo(this.f39592i + "connection closed");
            throw th;
        }
    }

    @Override // ch.qos.logback.classic.net.ReceiverBase
    public Runnable getRunnableTask() {
        return this;
    }

    public SocketFactory getSocketFactory() {
        return SocketFactory.getDefault();
    }

    /* renamed from: i */
    public final Socket m51606i() {
        try {
            Socket socket = (Socket) this.f39594k.get();
            this.f39594k = null;
            return socket;
        } catch (ExecutionException unused) {
            return null;
        }
    }

    public SocketConnector newConnector(InetAddress inetAddress, int i, int i2, int i3) {
        return new DefaultSocketConnector(inetAddress, i, i2, i3);
    }

    @Override // ch.qos.logback.classic.net.ReceiverBase
    public void onStop() {
        if (this.f39593j != null) {
            CloseUtil.closeQuietly(this.f39593j);
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            LoggerContext loggerContext = (LoggerContext) getContext();
            while (!Thread.currentThread().isInterrupted()) {
                Future m51609b = m51609b(m51608d(this.f39588e, this.f39589f, 0, this.f39590g));
                this.f39594k = m51609b;
                if (m51609b == null) {
                    break;
                }
                this.f39593j = m51606i();
                if (this.f39593j == null) {
                    break;
                }
                m51607g(loggerContext);
            }
        } catch (InterruptedException unused) {
        }
        addInfo("shutting down");
    }

    public void setAcceptConnectionTimeout(int i) {
        this.f39591h = i;
    }

    public void setPort(int i) {
        this.f39589f = i;
    }

    public void setReconnectionDelay(int i) {
        this.f39590g = i;
    }

    public void setRemoteHost(String str) {
        this.f39587d = str;
    }

    @Override // ch.qos.logback.classic.net.ReceiverBase
    public boolean shouldStart() {
        int i;
        if (this.f39589f == 0) {
            addError("No port was configured for receiver. For more information, please visit http://logback.qos.ch/codes.html#receiver_no_port");
            i = 1;
        } else {
            i = 0;
        }
        if (this.f39587d == null) {
            i++;
            addError("No host name or address was configured for receiver. For more information, please visit http://logback.qos.ch/codes.html#receiver_no_host");
        }
        if (this.f39590g == 0) {
            this.f39590g = 30000;
        }
        if (i == 0) {
            try {
                this.f39588e = InetAddress.getByName(this.f39587d);
            } catch (UnknownHostException unused) {
                addError("unknown host: " + this.f39587d);
                i++;
            }
        }
        if (i == 0) {
            this.f39592i = "receiver " + this.f39587d + ":" + this.f39589f + ": ";
        }
        return i == 0;
    }
}
