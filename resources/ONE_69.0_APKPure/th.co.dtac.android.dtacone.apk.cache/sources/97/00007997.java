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
    public Socket f39578a;

    /* renamed from: b */
    public LoggerContext f39579b;

    /* renamed from: c */
    public HardenedLoggingEventInputStream f39580c;

    /* renamed from: d */
    public SocketAddress f39581d;

    /* renamed from: e */
    public Logger f39582e;

    /* renamed from: f */
    public boolean f39583f = false;

    /* renamed from: g */
    public SimpleSocketServer f39584g;

    public SocketNode(SimpleSocketServer simpleSocketServer, Socket socket, LoggerContext loggerContext) {
        this.f39584g = simpleSocketServer;
        this.f39578a = socket;
        this.f39581d = socket.getRemoteSocketAddress();
        this.f39579b = loggerContext;
        this.f39582e = loggerContext.getLogger(SocketNode.class);
    }

    public void close() {
        if (this.f39583f) {
            return;
        }
        this.f39583f = true;
        HardenedLoggingEventInputStream hardenedLoggingEventInputStream = this.f39580c;
        if (hardenedLoggingEventInputStream != null) {
            try {
                try {
                    hardenedLoggingEventInputStream.close();
                } catch (IOException e) {
                    this.f39582e.warn("Could not close connection.", (Throwable) e);
                }
            } finally {
                this.f39580c = null;
            }
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        Logger logger;
        String str;
        try {
            this.f39580c = new HardenedLoggingEventInputStream(new BufferedInputStream(this.f39578a.getInputStream()));
        } catch (Exception e) {
            Logger logger2 = this.f39582e;
            logger2.error("Could not open ObjectInputStream to " + this.f39578a, (Throwable) e);
            this.f39583f = true;
        }
        while (!this.f39583f) {
            try {
                ILoggingEvent iLoggingEvent = (ILoggingEvent) this.f39580c.readObject();
                Logger logger3 = this.f39579b.getLogger(iLoggingEvent.getLoggerName());
                if (logger3.isEnabledFor(iLoggingEvent.getLevel())) {
                    logger3.callAppenders(iLoggingEvent);
                }
            } catch (EOFException unused) {
                logger = this.f39582e;
                str = "Caught java.io.EOFException closing connection.";
                logger.info(str);
            } catch (SocketException unused2) {
                logger = this.f39582e;
                str = "Caught java.net.SocketException closing connection.";
                logger.info(str);
            } catch (IOException e2) {
                Logger logger4 = this.f39582e;
                logger4.info("Caught java.io.IOException: " + e2);
                logger = this.f39582e;
                str = "Closing connection.";
                logger.info(str);
            } catch (Exception e3) {
                this.f39582e.error("Unexpected exception. Closing connection.", (Throwable) e3);
            }
        }
        this.f39584g.socketNodeClosing(this);
        close();
    }

    public String toString() {
        return getClass().getName() + this.f39581d.toString();
    }
}