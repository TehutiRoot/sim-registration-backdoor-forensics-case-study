package com.google.common.util.concurrent;

import com.google.common.base.Preconditions;
import com.google.common.util.concurrent.FluentFuture;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes4.dex */
public final class TimeoutFuture extends FluentFuture.AbstractC8246a {

    /* renamed from: h */
    public ListenableFuture f54449h;

    /* renamed from: i */
    public ScheduledFuture f54450i;

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
    public static final class RunnableC8292b implements Runnable {

        /* renamed from: a */
        public TimeoutFuture f54451a;

        public RunnableC8292b(TimeoutFuture timeoutFuture) {
            this.f54451a = timeoutFuture;
        }

        @Override // java.lang.Runnable
        public void run() {
            ListenableFuture listenableFuture;
            TimeoutFuture timeoutFuture = this.f54451a;
            if (timeoutFuture == null || (listenableFuture = timeoutFuture.f54449h) == null) {
                return;
            }
            this.f54451a = null;
            if (listenableFuture.isDone()) {
                timeoutFuture.setFuture(listenableFuture);
                return;
            }
            try {
                ScheduledFuture scheduledFuture = timeoutFuture.f54450i;
                timeoutFuture.f54450i = null;
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
        this.f54449h = (ListenableFuture) Preconditions.checkNotNull(listenableFuture);
    }

    /* renamed from: C */
    public static ListenableFuture m39391C(ListenableFuture listenableFuture, long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        TimeoutFuture timeoutFuture = new TimeoutFuture(listenableFuture);
        RunnableC8292b runnableC8292b = new RunnableC8292b(timeoutFuture);
        timeoutFuture.f54450i = scheduledExecutorService.schedule(runnableC8292b, j, timeUnit);
        listenableFuture.addListener(runnableC8292b, MoreExecutors.directExecutor());
        return timeoutFuture;
    }

    @Override // com.google.common.util.concurrent.AbstractFuture
    public void afterDone() {
        m39670w(this.f54449h);
        ScheduledFuture scheduledFuture = this.f54450i;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.f54449h = null;
        this.f54450i = null;
    }

    @Override // com.google.common.util.concurrent.AbstractFuture
    public String pendingToString() {
        ListenableFuture listenableFuture = this.f54449h;
        ScheduledFuture scheduledFuture = this.f54450i;
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
