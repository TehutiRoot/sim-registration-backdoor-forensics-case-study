package androidx.camera.core.impl;

import android.util.Log;
import android.util.Size;
import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.atomic.AtomicInteger;
import org.apache.commons.cli.HelpFormatter;

@RequiresApi(21)
/* loaded from: classes.dex */
public abstract class DeferrableSurface {
    public static final Size SIZE_UNDEFINED = new Size(0, 0);

    /* renamed from: k */
    public static final boolean f11128k = Logger.isDebugEnabled("DeferrableSurface");

    /* renamed from: l */
    public static final AtomicInteger f11129l = new AtomicInteger(0);

    /* renamed from: m */
    public static final AtomicInteger f11130m = new AtomicInteger(0);

    /* renamed from: a */
    public final Object f11131a;

    /* renamed from: b */
    public int f11132b;

    /* renamed from: c */
    public boolean f11133c;

    /* renamed from: d */
    public CallbackToFutureAdapter.Completer f11134d;

    /* renamed from: e */
    public final ListenableFuture f11135e;

    /* renamed from: f */
    public CallbackToFutureAdapter.Completer f11136f;

    /* renamed from: g */
    public final ListenableFuture f11137g;

    /* renamed from: h */
    public final Size f11138h;

    /* renamed from: i */
    public final int f11139i;

    /* renamed from: j */
    public Class f11140j;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: classes.dex */
    public static final class SurfaceClosedException extends Exception {
        DeferrableSurface mDeferrableSurface;

        public SurfaceClosedException(@NonNull String str, @NonNull DeferrableSurface deferrableSurface) {
            super(str);
            this.mDeferrableSurface = deferrableSurface;
        }

        @NonNull
        public DeferrableSurface getDeferrableSurface() {
            return this.mDeferrableSurface;
        }
    }

    /* loaded from: classes.dex */
    public static final class SurfaceUnavailableException extends Exception {
        public SurfaceUnavailableException(@NonNull String str) {
            super(str);
        }
    }

    public DeferrableSurface() {
        this(SIZE_UNDEFINED, 0);
    }

    /* renamed from: a */
    public static /* synthetic */ Object m62950a(DeferrableSurface deferrableSurface, CallbackToFutureAdapter.Completer completer) {
        return deferrableSurface.m62947d(completer);
    }

    /* renamed from: b */
    public static /* synthetic */ Object m62949b(DeferrableSurface deferrableSurface, CallbackToFutureAdapter.Completer completer) {
        return deferrableSurface.m62946e(completer);
    }

    /* renamed from: c */
    public static /* synthetic */ void m62948c(DeferrableSurface deferrableSurface, String str) {
        deferrableSurface.m62945f(str);
    }

    /* renamed from: d */
    public /* synthetic */ Object m62947d(CallbackToFutureAdapter.Completer completer) {
        synchronized (this.f11131a) {
            this.f11134d = completer;
        }
        return "DeferrableSurface-termination(" + this + ")";
    }

    public void close() {
        CallbackToFutureAdapter.Completer completer;
        synchronized (this.f11131a) {
            try {
                if (!this.f11133c) {
                    this.f11133c = true;
                    this.f11136f.set(null);
                    if (this.f11132b == 0) {
                        completer = this.f11134d;
                        this.f11134d = null;
                    } else {
                        completer = null;
                    }
                    if (Logger.isDebugEnabled("DeferrableSurface")) {
                        Logger.m63230d("DeferrableSurface", "surface closed,  useCount=" + this.f11132b + " closed=true " + this);
                    }
                } else {
                    completer = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (completer != null) {
            completer.set(null);
        }
    }

    public void decrementUseCount() {
        CallbackToFutureAdapter.Completer completer;
        synchronized (this.f11131a) {
            try {
                int i = this.f11132b;
                if (i != 0) {
                    int i2 = i - 1;
                    this.f11132b = i2;
                    if (i2 == 0 && this.f11133c) {
                        completer = this.f11134d;
                        this.f11134d = null;
                    } else {
                        completer = null;
                    }
                    if (Logger.isDebugEnabled("DeferrableSurface")) {
                        Logger.m63230d("DeferrableSurface", "use count-1,  useCount=" + this.f11132b + " closed=" + this.f11133c + HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR + this);
                        if (this.f11132b == 0) {
                            m62944g("Surface no longer in use", f11130m.get(), f11129l.decrementAndGet());
                        }
                    }
                } else {
                    throw new IllegalStateException("Decrementing use count occurs more times than incrementing");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (completer != null) {
            completer.set(null);
        }
    }

    /* renamed from: e */
    public final /* synthetic */ Object m62946e(CallbackToFutureAdapter.Completer completer) {
        synchronized (this.f11131a) {
            this.f11136f = completer;
        }
        return "DeferrableSurface-close(" + this + ")";
    }

    /* renamed from: f */
    public final /* synthetic */ void m62945f(String str) {
        try {
            this.f11135e.get();
            m62944g("Surface terminated", f11130m.decrementAndGet(), f11129l.get());
        } catch (Exception e) {
            Logger.m63228e("DeferrableSurface", "Unexpected surface termination for " + this + "\nStack Trace:\n" + str);
            synchronized (this.f11131a) {
                throw new IllegalArgumentException(String.format("DeferrableSurface %s [closed: %b, use_count: %s] terminated with unexpected exception.", this, Boolean.valueOf(this.f11133c), Integer.valueOf(this.f11132b)), e);
            }
        }
    }

    /* renamed from: g */
    public final void m62944g(String str, int i, int i2) {
        if (!f11128k && Logger.isDebugEnabled("DeferrableSurface")) {
            Logger.m63230d("DeferrableSurface", "DeferrableSurface usage statistics may be inaccurate since debug logging was not enabled at static initialization time. App restart may be required to enable accurate usage statistics.");
        }
        Logger.m63230d("DeferrableSurface", str + "[total_surfaces=" + i + ", used_surfaces=" + i2 + "](" + this + "}");
    }

    @NonNull
    public ListenableFuture<Void> getCloseFuture() {
        return Futures.nonCancellationPropagating(this.f11137g);
    }

    @Nullable
    public Class<?> getContainerClass() {
        return this.f11140j;
    }

    @NonNull
    public Size getPrescribedSize() {
        return this.f11138h;
    }

    public int getPrescribedStreamFormat() {
        return this.f11139i;
    }

    @NonNull
    public final ListenableFuture<Surface> getSurface() {
        synchronized (this.f11131a) {
            try {
                if (this.f11133c) {
                    return Futures.immediateFailedFuture(new SurfaceClosedException("DeferrableSurface already closed.", this));
                }
                return provideSurface();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @NonNull
    public ListenableFuture<Void> getTerminationFuture() {
        return Futures.nonCancellationPropagating(this.f11135e);
    }

    @VisibleForTesting
    public int getUseCount() {
        int i;
        synchronized (this.f11131a) {
            i = this.f11132b;
        }
        return i;
    }

    public void incrementUseCount() throws SurfaceClosedException {
        synchronized (this.f11131a) {
            try {
                int i = this.f11132b;
                if (i == 0 && this.f11133c) {
                    throw new SurfaceClosedException("Cannot begin use on a closed surface.", this);
                }
                this.f11132b = i + 1;
                if (Logger.isDebugEnabled("DeferrableSurface")) {
                    if (this.f11132b == 1) {
                        m62944g("New surface in use", f11130m.get(), f11129l.incrementAndGet());
                    }
                    Logger.m63230d("DeferrableSurface", "use count+1, useCount=" + this.f11132b + HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR + this);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean isClosed() {
        boolean z;
        synchronized (this.f11131a) {
            z = this.f11133c;
        }
        return z;
    }

    @NonNull
    public abstract ListenableFuture<Surface> provideSurface();

    public void setContainerClass(@NonNull Class<?> cls) {
        this.f11140j = cls;
    }

    public DeferrableSurface(@NonNull Size size, int i) {
        this.f11131a = new Object();
        this.f11132b = 0;
        this.f11133c = false;
        this.f11138h = size;
        this.f11139i = i;
        ListenableFuture future = CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: sF
            {
                DeferrableSurface.this = this;
            }

            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                return DeferrableSurface.m62950a(DeferrableSurface.this, completer);
            }
        });
        this.f11135e = future;
        this.f11137g = CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: tF
            {
                DeferrableSurface.this = this;
            }

            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                return DeferrableSurface.m62949b(DeferrableSurface.this, completer);
            }
        });
        if (Logger.isDebugEnabled("DeferrableSurface")) {
            m62944g("Surface created", f11130m.incrementAndGet(), f11129l.get());
            final String stackTraceString = Log.getStackTraceString(new Exception());
            future.addListener(new Runnable() { // from class: uF
                {
                    DeferrableSurface.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    DeferrableSurface.m62948c(DeferrableSurface.this, stackTraceString);
                }
            }, CameraXExecutors.directExecutor());
        }
    }
}
