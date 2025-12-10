package com.bumptech.glide.request;

import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.request.target.SizeReadyCallback;
import com.bumptech.glide.request.target.Target;
import com.bumptech.glide.request.transition.Transition;
import com.bumptech.glide.util.Util;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import th.p047co.dtac.android.dtacone.util.Constant;

/* loaded from: classes3.dex */
public class RequestFutureTarget<R> implements FutureTarget<R>, RequestListener<R> {

    /* renamed from: k */
    public static final C5919a f42569k = new C5919a();

    /* renamed from: a */
    public final int f42570a;

    /* renamed from: b */
    public final int f42571b;

    /* renamed from: c */
    public final boolean f42572c;

    /* renamed from: d */
    public final C5919a f42573d;

    /* renamed from: e */
    public Object f42574e;

    /* renamed from: f */
    public Request f42575f;

    /* renamed from: g */
    public boolean f42576g;

    /* renamed from: h */
    public boolean f42577h;

    /* renamed from: i */
    public boolean f42578i;

    /* renamed from: j */
    public GlideException f42579j;

    /* renamed from: com.bumptech.glide.request.RequestFutureTarget$a */
    /* loaded from: classes3.dex */
    public static class C5919a {
        /* renamed from: a */
        public void m50060a(Object obj) {
            obj.notifyAll();
        }

        /* renamed from: b */
        public void m50059b(Object obj, long j) {
            obj.wait(j);
        }
    }

    public RequestFutureTarget(int i, int i2) {
        this(i, i2, true, f42569k);
    }

    /* renamed from: a */
    public final synchronized Object m50061a(Long l) {
        try {
            if (this.f42572c && !isDone()) {
                Util.assertBackgroundThread();
            }
            if (!this.f42576g) {
                if (!this.f42578i) {
                    if (this.f42577h) {
                        return this.f42574e;
                    }
                    if (l == null) {
                        this.f42573d.m50059b(this, 0L);
                    } else if (l.longValue() > 0) {
                        long currentTimeMillis = System.currentTimeMillis();
                        long longValue = l.longValue() + currentTimeMillis;
                        while (!isDone() && currentTimeMillis < longValue) {
                            this.f42573d.m50059b(this, longValue - currentTimeMillis);
                            currentTimeMillis = System.currentTimeMillis();
                        }
                    }
                    if (!Thread.interrupted()) {
                        if (!this.f42578i) {
                            if (!this.f42576g) {
                                if (this.f42577h) {
                                    return this.f42574e;
                                }
                                throw new TimeoutException();
                            }
                            throw new CancellationException();
                        }
                        throw new ExecutionException(this.f42579j);
                    }
                    throw new InterruptedException();
                }
                throw new ExecutionException(this.f42579j);
            }
            throw new CancellationException();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        synchronized (this) {
            try {
                if (isDone()) {
                    return false;
                }
                this.f42576g = true;
                this.f42573d.m50060a(this);
                Request request = null;
                if (z) {
                    Request request2 = this.f42575f;
                    this.f42575f = null;
                    request = request2;
                }
                if (request != null) {
                    request.clear();
                }
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // java.util.concurrent.Future
    public R get() throws InterruptedException, ExecutionException {
        try {
            return (R) m50061a(null);
        } catch (TimeoutException e) {
            throw new AssertionError(e);
        }
    }

    @Override // com.bumptech.glide.request.target.Target
    @Nullable
    public synchronized Request getRequest() {
        return this.f42575f;
    }

    @Override // com.bumptech.glide.request.target.Target
    public void getSize(@NonNull SizeReadyCallback sizeReadyCallback) {
        sizeReadyCallback.onSizeReady(this.f42570a, this.f42571b);
    }

    @Override // java.util.concurrent.Future
    public synchronized boolean isCancelled() {
        return this.f42576g;
    }

    @Override // java.util.concurrent.Future
    public synchronized boolean isDone() {
        boolean z;
        if (!this.f42576g && !this.f42577h) {
            if (!this.f42578i) {
                z = false;
            }
        }
        z = true;
        return z;
    }

    @Override // com.bumptech.glide.manager.LifecycleListener
    public void onDestroy() {
    }

    @Override // com.bumptech.glide.request.target.Target
    public void onLoadCleared(@Nullable Drawable drawable) {
    }

    @Override // com.bumptech.glide.request.target.Target
    public synchronized void onLoadFailed(@Nullable Drawable drawable) {
    }

    @Override // com.bumptech.glide.request.target.Target
    public void onLoadStarted(@Nullable Drawable drawable) {
    }

    @Override // com.bumptech.glide.request.target.Target
    public synchronized void onResourceReady(@NonNull R r, @Nullable Transition<? super R> transition) {
    }

    @Override // com.bumptech.glide.manager.LifecycleListener
    public void onStart() {
    }

    @Override // com.bumptech.glide.manager.LifecycleListener
    public void onStop() {
    }

    @Override // com.bumptech.glide.request.target.Target
    public void removeCallback(@NonNull SizeReadyCallback sizeReadyCallback) {
    }

    @Override // com.bumptech.glide.request.target.Target
    public synchronized void setRequest(@Nullable Request request) {
        this.f42575f = request;
    }

    public String toString() {
        Request request;
        String str;
        String str2 = super.toString() + "[status=";
        synchronized (this) {
            try {
                request = null;
                if (this.f42576g) {
                    str = Constant.QueryTransactionStatus.CANCELLED;
                } else if (this.f42578i) {
                    str = "FAILURE";
                } else if (this.f42577h) {
                    str = "SUCCESS";
                } else {
                    str = "PENDING";
                    request = this.f42575f;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (request != null) {
            return str2 + str + ", request=[" + request + "]]";
        }
        return str2 + str + "]";
    }

    public RequestFutureTarget(int i, int i2, boolean z, C5919a c5919a) {
        this.f42570a = i;
        this.f42571b = i2;
        this.f42572c = z;
        this.f42573d = c5919a;
    }

    @Override // com.bumptech.glide.request.RequestListener
    public synchronized boolean onLoadFailed(@Nullable GlideException glideException, Object obj, @NonNull Target<R> target, boolean z) {
        this.f42578i = true;
        this.f42579j = glideException;
        this.f42573d.m50060a(this);
        return false;
    }

    @Override // com.bumptech.glide.request.RequestListener
    public synchronized boolean onResourceReady(@NonNull R r, @NonNull Object obj, Target<R> target, @NonNull DataSource dataSource, boolean z) {
        this.f42577h = true;
        this.f42574e = r;
        this.f42573d.m50060a(this);
        return false;
    }

    @Override // java.util.concurrent.Future
    public R get(long j, @NonNull TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return (R) m50061a(Long.valueOf(timeUnit.toMillis(j)));
    }
}
