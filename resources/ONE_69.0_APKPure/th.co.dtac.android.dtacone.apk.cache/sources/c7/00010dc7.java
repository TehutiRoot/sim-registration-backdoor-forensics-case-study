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

/* renamed from: sw1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C22253sw1 extends ContextAwareBase implements InterfaceC21734pw1 {

    /* renamed from: c */
    public final String f80040c;

    /* renamed from: d */
    public final Socket f80041d;

    /* renamed from: e */
    public final OutputStream f80042e = null;

    /* renamed from: f */
    public BlockingQueue f80043f;

    public C22253sw1(String str, Socket socket) {
        this.f80040c = "client " + str + ": ";
        this.f80041d = socket;
    }

    /* renamed from: b */
    public final ObjectOutputStream m22764b() {
        if (this.f80041d == null) {
            return new ObjectOutputStream(this.f80042e);
        }
        return new ObjectOutputStream(this.f80041d.getOutputStream());
    }

    @Override // ch.qos.logback.core.net.server.Client, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Socket socket = this.f80041d;
        if (socket == null) {
            return;
        }
        CloseUtil.closeQuietly(socket);
    }

    @Override // p000.InterfaceC21734pw1
    /* renamed from: e */
    public boolean mo22763e(Serializable serializable) {
        BlockingQueue blockingQueue = this.f80043f;
        if (blockingQueue != null) {
            return blockingQueue.offer(serializable);
        }
        throw new IllegalStateException("client has no event queue");
    }

    @Override // p000.InterfaceC21734pw1
    /* renamed from: h */
    public void mo22762h(BlockingQueue blockingQueue) {
        this.f80043f = blockingQueue;
    }

    @Override // java.lang.Runnable
    public void run() {
        StringBuilder sb;
        addInfo(this.f80040c + "connected");
        ObjectOutputStream objectOutputStream = null;
        try {
            try {
                try {
                    try {
                        objectOutputStream = m22764b();
                        loop0: while (true) {
                            int i = 0;
                            while (!Thread.currentThread().isInterrupted()) {
                                try {
                                    objectOutputStream.writeObject((Serializable) this.f80043f.take());
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
                        addError(this.f80040c + e);
                        if (objectOutputStream != null) {
                            CloseUtil.closeQuietly(objectOutputStream);
                        }
                        close();
                        sb = new StringBuilder();
                    }
                } catch (IOException e2) {
                    addError(this.f80040c + e2);
                    if (objectOutputStream != null) {
                        CloseUtil.closeQuietly(objectOutputStream);
                    }
                    close();
                    sb = new StringBuilder();
                }
            } catch (SocketException e3) {
                addInfo(this.f80040c + e3);
                if (objectOutputStream != null) {
                    CloseUtil.closeQuietly(objectOutputStream);
                }
                close();
                sb = new StringBuilder();
            }
            sb.append(this.f80040c);
            sb.append("connection closed");
            addInfo(sb.toString());
        } catch (Throwable th2) {
            if (objectOutputStream != null) {
                CloseUtil.closeQuietly(objectOutputStream);
            }
            close();
            addInfo(this.f80040c + "connection closed");
            throw th2;
        }
    }
}