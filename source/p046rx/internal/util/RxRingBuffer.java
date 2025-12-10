package p046rx.internal.util;

import java.io.PrintStream;
import java.util.Queue;
import p046rx.Observer;
import p046rx.Subscription;
import p046rx.exceptions.MissingBackpressureException;
import p046rx.internal.operators.NotificationLite;
import p046rx.internal.util.unsafe.SpmcArrayQueue;
import p046rx.internal.util.unsafe.SpscArrayQueue;
import p046rx.internal.util.unsafe.UnsafeAccess;

/* renamed from: rx.internal.util.RxRingBuffer */
/* loaded from: classes7.dex */
public class RxRingBuffer implements Subscription {
    public static final int SIZE;

    /* renamed from: a */
    public Queue f79212a;

    /* renamed from: b */
    public final int f79213b;
    public volatile Object terminalState;

    static {
        int i;
        if (PlatformDependent.isAndroid()) {
            i = 16;
        } else {
            i = 128;
        }
        String property = System.getProperty("rx.ring-buffer.size");
        if (property != null) {
            try {
                i = Integer.parseInt(property);
            } catch (NumberFormatException e) {
                PrintStream printStream = System.err;
                printStream.println("Failed to set 'rx.buffer.size' with value " + property + " => " + e.getMessage());
            }
        }
        SIZE = i;
    }

    public RxRingBuffer(Queue queue, int i) {
        this.f79212a = queue;
        this.f79213b = i;
    }

    public static RxRingBuffer getSpmcInstance() {
        if (UnsafeAccess.isUnsafeAvailable()) {
            return new RxRingBuffer(true, SIZE);
        }
        return new RxRingBuffer();
    }

    public static RxRingBuffer getSpscInstance() {
        if (UnsafeAccess.isUnsafeAvailable()) {
            return new RxRingBuffer(false, SIZE);
        }
        return new RxRingBuffer();
    }

    public boolean accept(Object obj, Observer observer) {
        return NotificationLite.accept(observer, obj);
    }

    public Throwable asError(Object obj) {
        return NotificationLite.getError(obj);
    }

    public int available() {
        return this.f79213b - count();
    }

    public int capacity() {
        return this.f79213b;
    }

    public int count() {
        Queue queue = this.f79212a;
        if (queue == null) {
            return 0;
        }
        return queue.size();
    }

    public Object getValue(Object obj) {
        return NotificationLite.getValue(obj);
    }

    public boolean isCompleted(Object obj) {
        return NotificationLite.isCompleted(obj);
    }

    public boolean isEmpty() {
        Queue queue = this.f79212a;
        if (queue != null && !queue.isEmpty()) {
            return false;
        }
        return true;
    }

    public boolean isError(Object obj) {
        return NotificationLite.isError(obj);
    }

    @Override // p046rx.Subscription
    public boolean isUnsubscribed() {
        if (this.f79212a == null) {
            return true;
        }
        return false;
    }

    public void onCompleted() {
        if (this.terminalState == null) {
            this.terminalState = NotificationLite.completed();
        }
    }

    public void onError(Throwable th2) {
        if (this.terminalState == null) {
            this.terminalState = NotificationLite.error(th2);
        }
    }

    public void onNext(Object obj) throws MissingBackpressureException {
        boolean z;
        boolean z2;
        synchronized (this) {
            try {
                Queue queue = this.f79212a;
                z = true;
                z2 = false;
                if (queue != null) {
                    z2 = !queue.offer(NotificationLite.next(obj));
                    z = false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (!z) {
            if (!z2) {
                return;
            }
            throw new MissingBackpressureException();
        }
        throw new IllegalStateException("This instance has been unsubscribed and the queue is no longer usable.");
    }

    public Object peek() {
        synchronized (this) {
            try {
                Queue queue = this.f79212a;
                if (queue == null) {
                    return null;
                }
                Object peek = queue.peek();
                Object obj = this.terminalState;
                if (peek == null && obj != null && queue.peek() == null) {
                    peek = obj;
                }
                return peek;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public Object poll() {
        synchronized (this) {
            try {
                Queue queue = this.f79212a;
                if (queue == null) {
                    return null;
                }
                Object poll = queue.poll();
                Object obj = this.terminalState;
                if (poll == null && obj != null && queue.peek() == null) {
                    this.terminalState = null;
                    poll = obj;
                }
                return poll;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public synchronized void release() {
    }

    @Override // p046rx.Subscription
    public void unsubscribe() {
        release();
    }

    public RxRingBuffer(boolean z, int i) {
        this.f79212a = z ? new SpmcArrayQueue(i) : new SpscArrayQueue(i);
        this.f79213b = i;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public RxRingBuffer() {
        /*
            r2 = this;
            rx.internal.util.atomic.SpscAtomicArrayQueue r0 = new rx.internal.util.atomic.SpscAtomicArrayQueue
            int r1 = p046rx.internal.util.RxRingBuffer.SIZE
            r0.<init>(r1)
            r2.<init>(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p046rx.internal.util.RxRingBuffer.<init>():void");
    }
}
