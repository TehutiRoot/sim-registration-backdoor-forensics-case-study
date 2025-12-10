package ch.qos.logback.core;

import ch.qos.logback.core.spi.AppenderAttachable;
import ch.qos.logback.core.spi.AppenderAttachableImpl;
import ch.qos.logback.core.util.InterruptUtil;
import java.util.Iterator;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/* loaded from: classes.dex */
public class AsyncAppenderBase<E> extends UnsynchronizedAppenderBase<E> implements AppenderAttachable<E> {
    public static final int DEFAULT_MAX_FLUSH_TIME = 1000;
    public static final int DEFAULT_QUEUE_SIZE = 256;

    /* renamed from: h */
    public BlockingQueue f39700h;

    /* renamed from: g */
    public AppenderAttachableImpl f39699g = new AppenderAttachableImpl();

    /* renamed from: i */
    public int f39701i = 256;

    /* renamed from: j */
    public int f39702j = 0;

    /* renamed from: k */
    public int f39703k = -1;

    /* renamed from: l */
    public boolean f39704l = false;

    /* renamed from: m */
    public C5466a f39705m = new C5466a();

    /* renamed from: n */
    public int f39706n = 1000;

    /* renamed from: ch.qos.logback.core.AsyncAppenderBase$a */
    /* loaded from: classes.dex */
    public class C5466a extends Thread {
        public C5466a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            AsyncAppenderBase asyncAppenderBase = AsyncAppenderBase.this;
            AppenderAttachableImpl appenderAttachableImpl = asyncAppenderBase.f39699g;
            while (asyncAppenderBase.isStarted()) {
                try {
                    appenderAttachableImpl.appendLoopOnAppenders(asyncAppenderBase.f39700h.take());
                } catch (InterruptedException unused) {
                }
            }
            AsyncAppenderBase.this.addInfo("Worker thread will flush remaining events before exiting.");
            for (E e : asyncAppenderBase.f39700h) {
                appenderAttachableImpl.appendLoopOnAppenders(e);
                asyncAppenderBase.f39700h.remove(e);
            }
            appenderAttachableImpl.detachAndStopAllAppenders();
        }
    }

    @Override // ch.qos.logback.core.spi.AppenderAttachable
    public void addAppender(Appender<E> appender) {
        int i = this.f39702j;
        if (i != 0) {
            addWarn("One and only one appender may be attached to AsyncAppender.");
            addWarn("Ignoring additional appender named [" + appender.getName() + "]");
            return;
        }
        this.f39702j = i + 1;
        addInfo("Attaching appender named [" + appender.getName() + "] to AsyncAppender.");
        this.f39699g.addAppender(appender);
    }

    @Override // ch.qos.logback.core.UnsynchronizedAppenderBase
    public void append(E e) {
        if (m51551b() && isDiscardable(e)) {
            return;
        }
        preprocess(e);
        m51550d(e);
    }

    /* renamed from: b */
    public final boolean m51551b() {
        return this.f39700h.remainingCapacity() < this.f39703k;
    }

    /* renamed from: d */
    public final void m51550d(Object obj) {
        if (this.f39704l) {
            this.f39700h.offer(obj);
        } else {
            m51549g(obj);
        }
    }

    @Override // ch.qos.logback.core.spi.AppenderAttachable
    public void detachAndStopAllAppenders() {
        this.f39699g.detachAndStopAllAppenders();
    }

    @Override // ch.qos.logback.core.spi.AppenderAttachable
    public boolean detachAppender(Appender<E> appender) {
        return this.f39699g.detachAppender(appender);
    }

    /* renamed from: g */
    public final void m51549g(Object obj) {
        boolean z = false;
        while (true) {
            try {
                this.f39700h.put(obj);
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th2) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th2;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    @Override // ch.qos.logback.core.spi.AppenderAttachable
    public Appender<E> getAppender(String str) {
        return this.f39699g.getAppender(str);
    }

    public int getDiscardingThreshold() {
        return this.f39703k;
    }

    public int getMaxFlushTime() {
        return this.f39706n;
    }

    public int getNumberOfElementsInQueue() {
        return this.f39700h.size();
    }

    public int getQueueSize() {
        return this.f39701i;
    }

    public int getRemainingCapacity() {
        return this.f39700h.remainingCapacity();
    }

    @Override // ch.qos.logback.core.spi.AppenderAttachable
    public boolean isAttached(Appender<E> appender) {
        return this.f39699g.isAttached(appender);
    }

    public boolean isDiscardable(E e) {
        return false;
    }

    public boolean isNeverBlock() {
        return this.f39704l;
    }

    @Override // ch.qos.logback.core.spi.AppenderAttachable
    public Iterator<Appender<E>> iteratorForAppenders() {
        return this.f39699g.iteratorForAppenders();
    }

    public void preprocess(E e) {
    }

    public void setDiscardingThreshold(int i) {
        this.f39703k = i;
    }

    public void setMaxFlushTime(int i) {
        this.f39706n = i;
    }

    public void setNeverBlock(boolean z) {
        this.f39704l = z;
    }

    public void setQueueSize(int i) {
        this.f39701i = i;
    }

    @Override // ch.qos.logback.core.UnsynchronizedAppenderBase, ch.qos.logback.core.spi.LifeCycle
    public void start() {
        if (isStarted()) {
            return;
        }
        if (this.f39702j == 0) {
            addError("No attached appenders found.");
        } else if (this.f39701i < 1) {
            addError("Invalid queue size [" + this.f39701i + "]");
        } else {
            this.f39700h = new ArrayBlockingQueue(this.f39701i);
            if (this.f39703k == -1) {
                this.f39703k = this.f39701i / 5;
            }
            addInfo("Setting discardingThreshold to " + this.f39703k);
            this.f39705m.setDaemon(true);
            C5466a c5466a = this.f39705m;
            c5466a.setName("AsyncAppender-Worker-" + getName());
            super.start();
            this.f39705m.start();
        }
    }

    @Override // ch.qos.logback.core.UnsynchronizedAppenderBase, ch.qos.logback.core.spi.LifeCycle
    public void stop() {
        if (isStarted()) {
            super.stop();
            this.f39705m.interrupt();
            InterruptUtil interruptUtil = new InterruptUtil(this.context);
            try {
                try {
                    interruptUtil.maskInterruptFlag();
                    this.f39705m.join(this.f39706n);
                    if (this.f39705m.isAlive()) {
                        addWarn("Max queue flush timeout (" + this.f39706n + " ms) exceeded. " + this.f39700h.size() + " queued events were possibly discarded.");
                    } else {
                        addInfo("Queue flush finished successfully within timeout.");
                    }
                } catch (InterruptedException e) {
                    int size = this.f39700h.size();
                    addError("Failed to join worker thread. " + size + " queued events may be discarded.", e);
                }
                interruptUtil.unmaskInterruptFlag();
            } catch (Throwable th2) {
                interruptUtil.unmaskInterruptFlag();
                throw th2;
            }
        }
    }

    @Override // ch.qos.logback.core.spi.AppenderAttachable
    public boolean detachAppender(String str) {
        return this.f39699g.detachAppender(str);
    }
}
