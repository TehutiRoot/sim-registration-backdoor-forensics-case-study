package org.apache.commons.p028io.output;

import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.util.Objects;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import org.apache.commons.p028io.input.QueueInputStream;

/* renamed from: org.apache.commons.io.output.QueueOutputStream */
/* loaded from: classes6.dex */
public class QueueOutputStream extends OutputStream {

    /* renamed from: a */
    public final BlockingQueue f73569a;

    public QueueOutputStream() {
        this(new LinkedBlockingQueue());
    }

    public QueueInputStream newQueueInputStream() {
        return QueueInputStream.builder().setBlockingQueue(this.f73569a).get();
    }

    @Override // java.io.OutputStream
    public void write(int i) throws InterruptedIOException {
        try {
            this.f73569a.put(Integer.valueOf(i & 255));
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            InterruptedIOException interruptedIOException = new InterruptedIOException();
            interruptedIOException.initCause(e);
            throw interruptedIOException;
        }
    }

    public QueueOutputStream(BlockingQueue<Integer> blockingQueue) {
        Objects.requireNonNull(blockingQueue, "blockingQueue");
        this.f73569a = blockingQueue;
    }
}
