package com.google.common.util.concurrent;

import com.google.common.base.Preconditions;
import com.google.common.util.concurrent.FluentFuture;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes4.dex */
public final class TimeoutFuture extends FluentFuture.AbstractC8235a {

    /* renamed from: h */
    public ListenableFuture f54461h;

    /* renamed from: i */
    public ScheduledFuture f54462i;

    /* loaded from: classes4.dex */
    public static final class TimeoutFutureException extends TimeoutException {
        @Override // java.lang.Throwable
        public synchronized Throwable fillInStackTrace() {
            setStackTrace(new StackTraceElement[0]);
            return this;
        }

        private TimeoutFutureException(String str) {
            super(str);
        }
    }

    /* renamed from: com.google.common.util.concurrent.TimeoutFuture$b */
    /* loaded from: classes4.dex */
    public static final class RunnableC8281b implements Runnable {

        /* renamed from: a */
        public TimeoutFuture f54463a;

        public RunnableC8281b(TimeoutFuture timeoutFuture) {
            this.f54463a = timeoutFuture;
        }

        @Override // java.lang.Runnable
        public void run() {
            ListenableFuture listenableFuture;
            TimeoutFuture timeoutFuture = this.f54463a;
            if (timeoutFuture == null || (listenableFuture = timeoutFuture.f54461h) == null) {
                return;
            }
            this.f54463a = null;
            if (listenableFuture.isDone()) {
                timeoutFuture.setFuture(listenableFuture);
                return;
            }
            try {
                ScheduledFuture scheduledFuture = timeoutFuture.f54462i;
                timeoutFuture.f54462i = null;
                String str = "Timed out";
                if (scheduledFuture != null) {
                    long abs = Math.abs(scheduledFuture.getDelay(TimeUnit.MILLISECONDS));
                    if (abs > 10) {
                        str = "Timed out (timeout delayed by " + abs + " ms after scheduled time)";
                    }
                }
                timeoutFuture.setException(new TimeoutFutureException(str + ": " + listenableFuture));
            } finally {
                listenableFuture.cancel(true);
            }
        }
    }

    public TimeoutFuture(ListenableFuture listenableFuture) {
        this.f54461h = (ListenableFuture) Preconditions.checkNotNull(listenableFuture);
    }

    /* renamed from: C */
    public static ListenableFuture m39383C(ListenableFuture listenableFuture, long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        TimeoutFuture timeoutFuture = new TimeoutFuture(listenableFuture);
        RunnableC8281b runnableC8281b = new RunnableC8281b(timeoutFuture);
        timeoutFuture.f54462i = scheduledExecutorService.schedule(runnableC8281b, j, timeUnit);
        listenableFuture.addListener(runnableC8281b, MoreExecutors.directExecutor());
        return timeoutFuture;
    }

    @Override // com.google.common.util.concurrent.AbstractFuture
    public void afterDone() {
        m39662w(this.f54461h);
        ScheduledFuture scheduledFuture = this.f54462i;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.f54461h = null;
        this.f54462i = null;
    }

    @Override // com.google.common.util.concurrent.AbstractFuture
    public String pendingToString() {
        ListenableFuture listenableFuture = this.f54461h;
        ScheduledFuture scheduledFuture = this.f54462i;
        if (listenableFuture != null) {
            String str = "inputFuture=[" + listenableFuture + "]";
            if (scheduledFuture != null) {
                long delay = scheduledFuture.getDelay(TimeUnit.MILLISECONDS);
                if (delay > 0) {
                    return str + ", remaining delay=[" + delay + " ms]";
                }
                return str;
            }
            return str;
        }
        return null;
    }
}