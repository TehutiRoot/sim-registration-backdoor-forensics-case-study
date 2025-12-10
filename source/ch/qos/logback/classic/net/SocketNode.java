package ch.qos.logback.classic.net;

import ch.qos.logback.classic.Logger;
import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.classic.net.server.HardenedLoggingEventInputStream;
import ch.qos.logback.classic.spi.ILoggingEvent;
import java.io.BufferedInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketException;

/* loaded from: classes.dex */
public class SocketNode implements Runnable {

    /* renamed from: a */
    public Socket f39580a;

    /* renamed from: b */
    public LoggerContext f39581b;

    /* renamed from: c */
    public HardenedLoggingEventInputStream f39582c;

    /* renamed from: d */
    public SocketAddress f39583d;

    /* renamed from: e */
    public Logger f39584e;

    /* renamed from: f */
    public boolean f39585f = false;

    /* renamed from: g */
    public SimpleSocketServer f39586g;

    public SocketNode(SimpleSocketServer simpleSocketServer, Socket socket, LoggerContext loggerContext) {
        this.f39586g = simpleSocketServer;
        this.f39580a = socket;
        this.f39583d = socket.getRemoteSocketAddress();
        this.f39581b = loggerContext;
        this.f39584e = loggerContext.getLogger(SocketNode.class);
    }

    public void close() {
        if (this.f39585f) {
            return;
        }
        this.f39585f = true;
        HardenedLoggingEventInputStream hardenedLoggingEventInputStream = this.f39582c;
        if (hardenedLoggingEventInputStream != null) {
            try {
                try {
                    hardenedLoggingEventInputStream.close();
                } catch (IOException e) {
                    this.f39584e.warn("Could not close connection.", (Throwable) e);
                }
            } finally {
                this.f39582c = null;
            }
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        Logger logger;
        String str;
        try {
            this.f39582c = new HardenedLoggingEventInputStream(new BufferedInputStream(this.f39580a.getInputStream()));
        } catch (Exception e) {
            Logger logger2 = this.f39584e;
            logger2.error("Could not open ObjectInputStream to " + this.f39580a, (Throwable) e);
            this.f39585f = true;
        }
        while (!this.f39585f) {
            try {
                ILoggingEvent iLoggingEvent = (ILoggingEvent) this.f39582c.readObject();
                Logger logger3 = this.f39581b.getLogger(iLoggingEvent.getLoggerName());
                if (logger3.isEnabledFor(iLoggingEvent.getLevel())) {
                    logger3.callAppenders(iLoggingEvent);
                }
            } catch (EOFException unused) {
                logger = this.f39584e;
                str = "Caught java.io.EOFException closing connection.";
                logger.info(str);
            } catch (SocketException unused2) {
                logger = this.f39584e;
                str = "Caught java.net.SocketException closing connection.";
                logger.info(str);
            } catch (IOException e2) {
                Logger logger4 = this.f39584e;
                logger4.info("Caught java.io.IOException: " + e2);
                logger = this.f39584e;
                str = "Closing connection.";
                logger.info(str);
            } catch (Exception e3) {
                this.f39584e.error("Unexpected exception. Closing connection.", (Throwable) e3);
            }
        }
        this.f39586g.socketNodeClosing(this);
        close();
    }

    public String toString() {
        return getClass().getName() + this.f39583d.toString();
    }
}
