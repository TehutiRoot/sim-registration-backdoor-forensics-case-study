package p000;

import ch.qos.logback.classic.Logger;
import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.classic.net.server.HardenedLoggingEventInputStream;
import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.net.HardenedObjectInputStream;
import ch.qos.logback.core.util.CloseUtil;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

/* renamed from: iv1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C20465iv1 implements InterfaceC19949fv1 {

    /* renamed from: a */
    public final String f67108a;

    /* renamed from: b */
    public final Socket f67109b;

    /* renamed from: c */
    public final InputStream f67110c = null;

    /* renamed from: d */
    public LoggerContext f67111d;

    /* renamed from: e */
    public Logger f67112e;

    public C20465iv1(String str, Socket socket) {
        this.f67108a = str;
        this.f67109b = socket;
    }

    /* renamed from: b */
    public final HardenedObjectInputStream m29298b() {
        if (this.f67110c != null) {
            return new HardenedLoggingEventInputStream(this.f67110c);
        }
        return new HardenedLoggingEventInputStream(this.f67109b.getInputStream());
    }

    @Override // ch.qos.logback.core.net.server.Client, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Socket socket = this.f67109b;
        if (socket == null) {
            return;
        }
        CloseUtil.closeQuietly(socket);
    }

    @Override // java.lang.Runnable
    public void run() {
        Logger logger;
        StringBuilder sb;
        Logger logger2 = this.f67112e;
        logger2.info(this + ": connected");
        HardenedObjectInputStream hardenedObjectInputStream = null;
        try {
            try {
                try {
                    hardenedObjectInputStream = m29298b();
                    while (true) {
                        ILoggingEvent iLoggingEvent = (ILoggingEvent) hardenedObjectInputStream.readObject();
                        Logger logger3 = this.f67111d.getLogger(iLoggingEvent.getLoggerName());
                        if (logger3.isEnabledFor(iLoggingEvent.getLevel())) {
                            logger3.callAppenders(iLoggingEvent);
                        }
                    }
                } catch (ClassNotFoundException unused) {
                    Logger logger4 = this.f67112e;
                    logger4.error(this + ": unknown event class");
                    if (hardenedObjectInputStream != null) {
                        CloseUtil.closeQuietly(hardenedObjectInputStream);
                    }
                    close();
                    logger = this.f67112e;
                    sb = new StringBuilder();
                    sb.append(this);
                    sb.append(": connection closed");
                    logger.info(sb.toString());
                } catch (RuntimeException e) {
                    Logger logger5 = this.f67112e;
                    logger5.error(this + ": " + e);
                    if (hardenedObjectInputStream != null) {
                        CloseUtil.closeQuietly(hardenedObjectInputStream);
                    }
                    close();
                    logger = this.f67112e;
                    sb = new StringBuilder();
                    sb.append(this);
                    sb.append(": connection closed");
                    logger.info(sb.toString());
                }
            } catch (EOFException unused2) {
                if (hardenedObjectInputStream != null) {
                    CloseUtil.closeQuietly(hardenedObjectInputStream);
                }
                close();
                logger = this.f67112e;
                sb = new StringBuilder();
                sb.append(this);
                sb.append(": connection closed");
                logger.info(sb.toString());
            } catch (IOException e2) {
                Logger logger6 = this.f67112e;
                logger6.info(this + ": " + e2);
                if (hardenedObjectInputStream != null) {
                    CloseUtil.closeQuietly(hardenedObjectInputStream);
                }
                close();
                logger = this.f67112e;
                sb = new StringBuilder();
                sb.append(this);
                sb.append(": connection closed");
                logger.info(sb.toString());
            }
        } catch (Throwable th2) {
            if (hardenedObjectInputStream != null) {
                CloseUtil.closeQuietly(hardenedObjectInputStream);
            }
            close();
            Logger logger7 = this.f67112e;
            logger7.info(this + ": connection closed");
            throw th2;
        }
    }

    @Override // p000.InterfaceC19949fv1
    public void setLoggerContext(LoggerContext loggerContext) {
        this.f67111d = loggerContext;
        this.f67112e = loggerContext.getLogger(getClass().getPackage().getName());
    }

    public String toString() {
        return "client " + this.f67108a;
    }
}
