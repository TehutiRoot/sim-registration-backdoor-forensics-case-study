package com.google.common.util.concurrent;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.lang.Thread;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

@J2ktIncompatible
@GwtIncompatible
/* loaded from: classes4.dex */
public final class ThreadFactoryBuilder {

    /* renamed from: a */
    public String f54438a = null;

    /* renamed from: b */
    public Boolean f54439b = null;

    /* renamed from: c */
    public Integer f54440c = null;

    /* renamed from: d */
    public Thread.UncaughtExceptionHandler f54441d = null;

    /* renamed from: e */
    public ThreadFactory f54442e = null;

    /* renamed from: com.google.common.util.concurrent.ThreadFactoryBuilder$a */
    /* loaded from: classes4.dex */
    public class ThreadFactoryC8290a implements ThreadFactory {

        /* renamed from: a */
        public final /* synthetic */ ThreadFactory f54443a;

        /* renamed from: b */
        public final /* synthetic */ String f54444b;

        /* renamed from: c */
        public final /* synthetic */ AtomicLong f54445c;

        /* renamed from: d */
        public final /* synthetic */ Boolean f54446d;

        /* renamed from: e */
        public final /* synthetic */ Integer f54447e;

        /* renamed from: f */
        public final /* synthetic */ Thread.UncaughtExceptionHandler f54448f;

        public ThreadFactoryC8290a(ThreadFactory threadFactory, String str, AtomicLong atomicLong, Boolean bool, Integer num, Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
            this.f54443a = threadFactory;
            this.f54444b = str;
            this.f54445c = atomicLong;
            this.f54446d = bool;
            this.f54447e = num;
            this.f54448f = uncaughtExceptionHandler;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread newThread = this.f54443a.newThread(runnable);
            Objects.requireNonNull(newThread);
            String str = this.f54444b;
            if (str != null) {
                AtomicLong atomicLong = this.f54445c;
                Objects.requireNonNull(atomicLong);
                newThread.setName(ThreadFactoryBuilder.m39394c(str, Long.valueOf(atomicLong.getAndIncrement())));
            }
            Boolean bool = this.f54446d;
            if (bool != null) {
                newThread.setDaemon(bool.booleanValue());
            }
            Integer num = this.f54447e;
            if (num != null) {
                newThread.setPriority(num.intValue());
            }
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f54448f;
            if (uncaughtExceptionHandler != null) {
                newThread.setUncaughtExceptionHandler(uncaughtExceptionHandler);
            }
            return newThread;
        }
    }

    /* renamed from: b */
    public static ThreadFactory m39395b(ThreadFactoryBuilder threadFactoryBuilder) {
        AtomicLong atomicLong;
        String str = threadFactoryBuilder.f54438a;
        Boolean bool = threadFactoryBuilder.f54439b;
        Integer num = threadFactoryBuilder.f54440c;
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = threadFactoryBuilder.f54441d;
        ThreadFactory threadFactory = threadFactoryBuilder.f54442e;
        if (threadFactory == null) {
            threadFactory = Executors.defaultThreadFactory();
        }
        ThreadFactory threadFactory2 = threadFactory;
        if (str != null) {
            atomicLong = new AtomicLong(0L);
        } else {
            atomicLong = null;
        }
        return new ThreadFactoryC8290a(threadFactory2, str, atomicLong, bool, num, uncaughtExceptionHandler);
    }

    /* renamed from: c */
    public static String m39394c(String str, Object... objArr) {
        return String.format(Locale.ROOT, str, objArr);
    }

    public ThreadFactory build() {
        return m39395b(this);
    }

    @CanIgnoreReturnValue
    public ThreadFactoryBuilder setDaemon(boolean z) {
        this.f54439b = Boolean.valueOf(z);
        return this;
    }

    @CanIgnoreReturnValue
    public ThreadFactoryBuilder setNameFormat(String str) {
        m39394c(str, 0);
        this.f54438a = str;
        return this;
    }

    @CanIgnoreReturnValue
    public ThreadFactoryBuilder setPriority(int i) {
        boolean z;
        boolean z2 = false;
        if (i >= 1) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z, "Thread priority (%s) must be >= %s", i, 1);
        if (i <= 10) {
            z2 = true;
        }
        Preconditions.checkArgument(z2, "Thread priority (%s) must be <= %s", i, 10);
        this.f54440c = Integer.valueOf(i);
        return this;
    }

    @CanIgnoreReturnValue
    public ThreadFactoryBuilder setThreadFactory(ThreadFactory threadFactory) {
        this.f54442e = (ThreadFactory) Preconditions.checkNotNull(threadFactory);
        return this;
    }

    @CanIgnoreReturnValue
    public ThreadFactoryBuilder setUncaughtExceptionHandler(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f54441d = (Thread.UncaughtExceptionHandler) Preconditions.checkNotNull(uncaughtExceptionHandler);
        return this;
    }
}
