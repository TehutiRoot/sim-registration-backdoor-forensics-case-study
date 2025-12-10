package p000;

import ch.qos.logback.core.spi.ContextAwareBase;
import ch.qos.logback.core.util.CloseUtil;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.net.Socket;
import java.net.SocketException;
import java.util.concurrent.BlockingQueue;

/* renamed from: vv1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C22701vv1 extends ContextAwareBase implements InterfaceC22185sv1 {

    /* renamed from: c */
    public final String f107837c;

    /* renamed from: d */
    public final Socket f107838d;

    /* renamed from: e */
    public final OutputStream f107839e = null;

    /* renamed from: f */
    public BlockingQueue f107840f;

    public C22701vv1(String str, Socket socket) {
        this.f107837c = "client " + str + ": ";
        this.f107838d = socket;
    }

    /* renamed from: b */
    public final ObjectOutputStream m969b() {
        if (this.f107838d == null) {
            return new ObjectOutputStream(this.f107839e);
        }
        return new ObjectOutputStream(this.f107838d.getOutputStream());
    }

    @Override // ch.qos.logback.core.net.server.Client, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Socket socket = this.f107838d;
        if (socket == null) {
            return;
        }
        CloseUtil.closeQuietly(socket);
    }

    @Override // p000.InterfaceC22185sv1
    /* renamed from: e */
    public boolean mo968e(Serializable serializable) {
        BlockingQueue blockingQueue = this.f107840f;
        if (blockingQueue != null) {
            return blockingQueue.offer(serializable);
        }
        throw new IllegalStateException("client has no event queue");
    }

    @Override // p000.InterfaceC22185sv1
    /* renamed from: h */
    public void mo967h(BlockingQueue blockingQueue) {
        this.f107840f = blockingQueue;
    }

    @Override // java.lang.Runnable
    public void run() {
        StringBuilder sb;
        addInfo(this.f107837c + "connected");
        ObjectOutputStream objectOutputStream = null;
        try {
            try {
                try {
                    try {
                        objectOutputStream = m969b();
                        loop0: while (true) {
                            int i = 0;
                            while (!Thread.currentThread().isInterrupted()) {
                                try {
                                    objectOutputStream.writeObject((Serializable) this.f107840f.take());
                                    objectOutputStream.flush();
                                    i++;
                                } catch (InterruptedException unused) {
                                }
                                if (i >= 70) {
                                    try {
                                        objectOutputStream.reset();
                                        break;
                                    } catch (InterruptedException unused2) {
                                        i = 0;
                                        Thread.currentThread().interrupt();
                                    }
                                } else {
                                    continue;
                                }
                            }
                        }
                        if (objectOutputStream != null) {
                            CloseUtil.closeQuietly(objectOutputStream);
                        }
                        close();
                        sb = new StringBuilder();
                    } catch (RuntimeException e) {
                        addError(this.f107837c + e);
                        if (objectOutputStream != null) {
                            CloseUtil.closeQuietly(objectOutputStream);
                        }
                        close();
                        sb = new StringBuilder();
                    }
                } catch (IOException e2) {
                    addError(this.f107837c + e2);
                    if (objectOutputStream != null) {
                        CloseUtil.closeQuietly(objectOutputStream);
                    }
                    close();
                    sb = new StringBuilder();
                }
            } catch (SocketException e3) {
                addInfo(this.f107837c + e3);
                if (objectOutputStream != null) {
                    CloseUtil.closeQuietly(objectOutputStream);
                }
                close();
                sb = new StringBuilder();
            }
            sb.append(this.f107837c);
            sb.append("connection closed");
            addInfo(sb.toString());
        } catch (Throwable th2) {
            if (objectOutputStream != null) {
                CloseUtil.closeQuietly(objectOutputStream);
            }
            close();
            addInfo(this.f107837c + "connection closed");
            throw th2;
        }
    }
}
