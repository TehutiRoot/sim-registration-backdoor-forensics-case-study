package androidx.camera.core;

import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import android.util.SparseArray;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.camera.core.CameraX;
import androidx.camera.core.CameraXConfig;
import androidx.camera.core.impl.CameraDeviceSurfaceManager;
import androidx.camera.core.impl.CameraFactory;
import androidx.camera.core.impl.CameraRepository;
import androidx.camera.core.impl.MetadataHolderService;
import androidx.camera.core.impl.UseCaseConfigFactory;
import androidx.camera.core.impl.utils.ContextUtil;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.core.p005os.HandlerCompat;
import androidx.core.util.Preconditions;
import com.google.common.util.concurrent.ListenableFuture;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.Executor;

@RequiresApi(21)
@MainThread
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes.dex */
public final class CameraX {

    /* renamed from: o */
    public static final Object f10840o = new Object();

    /* renamed from: p */
    public static final SparseArray f10841p = new SparseArray();

    /* renamed from: c */
    public final CameraXConfig f10844c;

    /* renamed from: d */
    public final Executor f10845d;

    /* renamed from: e */
    public final Handler f10846e;

    /* renamed from: f */
    public final HandlerThread f10847f;

    /* renamed from: g */
    public CameraFactory f10848g;

    /* renamed from: h */
    public CameraDeviceSurfaceManager f10849h;

    /* renamed from: i */
    public UseCaseConfigFactory f10850i;

    /* renamed from: j */
    public Context f10851j;

    /* renamed from: k */
    public final ListenableFuture f10852k;

    /* renamed from: n */
    public final Integer f10855n;

    /* renamed from: a */
    public final CameraRepository f10842a = new CameraRepository();

    /* renamed from: b */
    public final Object f10843b = new Object();

    /* renamed from: l */
    public InternalInitState f10853l = InternalInitState.UNINITIALIZED;

    /* renamed from: m */
    public ListenableFuture f10854m = Futures.immediateFuture(null);

    /* loaded from: classes.dex */
    public enum InternalInitState {
        UNINITIALIZED,
        INITIALIZING,
        INITIALIZING_ERROR,
        INITIALIZED,
        SHUTDOWN
    }

    /* renamed from: androidx.camera.core.CameraX$a */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C2427a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f10856a;

        static {
            int[] iArr = new int[InternalInitState.values().length];
            f10856a = iArr;
            try {
                iArr[InternalInitState.UNINITIALIZED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10856a[InternalInitState.INITIALIZING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f10856a[InternalInitState.INITIALIZING_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f10856a[InternalInitState.INITIALIZED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f10856a[InternalInitState.SHUTDOWN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public CameraX(@NonNull Context context, @Nullable CameraXConfig.Provider provider) {
        if (provider != null) {
            this.f10844c = provider.getCameraXConfig();
        } else {
            CameraXConfig.Provider m63244g = m63244g(context);
            if (m63244g != null) {
                this.f10844c = m63244g.getCameraXConfig();
            } else {
                throw new IllegalStateException("CameraX is not configured properly. The most likely cause is you did not include a default implementation in your build such as 'camera-camera2'.");
            }
        }
        Executor cameraExecutor = this.f10844c.getCameraExecutor(null);
        Handler schedulerHandler = this.f10844c.getSchedulerHandler(null);
        this.f10845d = cameraExecutor == null ? new ExecutorC0470Gj() : cameraExecutor;
        if (schedulerHandler == null) {
            HandlerThread handlerThread = new HandlerThread("CameraX-scheduler", 10);
            this.f10847f = handlerThread;
            handlerThread.start();
            this.f10846e = HandlerCompat.createAsync(handlerThread.getLooper());
        } else {
            this.f10847f = null;
            this.f10846e = schedulerHandler;
        }
        Integer num = (Integer) this.f10844c.retrieveOption(CameraXConfig.f10862g, null);
        this.f10855n = num;
        m63243h(num);
        this.f10852k = m63241j(context);
    }

    /* renamed from: a */
    public static /* synthetic */ void m63250a(CameraX cameraX, CallbackToFutureAdapter.Completer completer) {
        cameraX.m63237n(completer);
    }

    /* renamed from: b */
    public static /* synthetic */ void m63249b(CameraX cameraX, Context context, Executor executor, CallbackToFutureAdapter.Completer completer, long j) {
        cameraX.m63239l(context, executor, completer, j);
    }

    /* renamed from: c */
    public static /* synthetic */ Object m63248c(CameraX cameraX, Context context, CallbackToFutureAdapter.Completer completer) {
        return cameraX.m63238m(context, completer);
    }

    /* renamed from: d */
    public static /* synthetic */ Object m63247d(CameraX cameraX, CallbackToFutureAdapter.Completer completer) {
        return cameraX.m63236o(completer);
    }

    /* renamed from: e */
    public static /* synthetic */ void m63246e(CameraX cameraX, Executor executor, long j, CallbackToFutureAdapter.Completer completer) {
        cameraX.m63240k(executor, j, completer);
    }

    /* renamed from: f */
    public static void m63245f(Integer num) {
        synchronized (f10840o) {
            try {
                if (num == null) {
                    return;
                }
                SparseArray sparseArray = f10841p;
                int intValue = ((Integer) sparseArray.get(num.intValue())).intValue() - 1;
                if (intValue == 0) {
                    sparseArray.remove(num.intValue());
                } else {
                    sparseArray.put(num.intValue(), Integer.valueOf(intValue));
                }
                m63233r();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: g */
    public static CameraXConfig.Provider m63244g(Context context) {
        String str;
        Application applicationFromContext = ContextUtil.getApplicationFromContext(context);
        if (applicationFromContext instanceof CameraXConfig.Provider) {
            return (CameraXConfig.Provider) applicationFromContext;
        }
        try {
            Context applicationContext = ContextUtil.getApplicationContext(context);
            Bundle bundle = applicationContext.getPackageManager().getServiceInfo(new ComponentName(applicationContext, MetadataHolderService.class), 640).metaData;
            if (bundle != null) {
                str = bundle.getString("androidx.camera.core.impl.MetadataHolderService.DEFAULT_CONFIG_PROVIDER");
            } else {
                str = null;
            }
            if (str == null) {
                Logger.m63176e("CameraX", "No default CameraXConfig.Provider specified in meta-data. The most likely cause is you did not include a default implementation in your build such as 'camera-camera2'.");
                return null;
            }
            return (CameraXConfig.Provider) Class.forName(str).getDeclaredConstructor(null).newInstance(null);
        } catch (PackageManager.NameNotFoundException e) {
            e = e;
            Logger.m63175e("CameraX", "Failed to retrieve default CameraXConfig.Provider from meta-data", e);
            return null;
        } catch (ClassNotFoundException e2) {
            e = e2;
            Logger.m63175e("CameraX", "Failed to retrieve default CameraXConfig.Provider from meta-data", e);
            return null;
        } catch (IllegalAccessException e3) {
            e = e3;
            Logger.m63175e("CameraX", "Failed to retrieve default CameraXConfig.Provider from meta-data", e);
            return null;
        } catch (InstantiationException e4) {
            e = e4;
            Logger.m63175e("CameraX", "Failed to retrieve default CameraXConfig.Provider from meta-data", e);
            return null;
        } catch (NoSuchMethodException e5) {
            e = e5;
            Logger.m63175e("CameraX", "Failed to retrieve default CameraXConfig.Provider from meta-data", e);
            return null;
        } catch (NullPointerException e6) {
            e = e6;
            Logger.m63175e("CameraX", "Failed to retrieve default CameraXConfig.Provider from meta-data", e);
            return null;
        } catch (InvocationTargetException e7) {
            e = e7;
            Logger.m63175e("CameraX", "Failed to retrieve default CameraXConfig.Provider from meta-data", e);
            return null;
        }
    }

    /* renamed from: h */
    public static void m63243h(Integer num) {
        synchronized (f10840o) {
            try {
                if (num == null) {
                    return;
                }
                Preconditions.checkArgumentInRange(num.intValue(), 3, 6, "minLogLevel");
                SparseArray sparseArray = f10841p;
                int i = 1;
                if (sparseArray.get(num.intValue()) != null) {
                    i = 1 + ((Integer) sparseArray.get(num.intValue())).intValue();
                }
                sparseArray.put(num.intValue(), Integer.valueOf(i));
                m63233r();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: r */
    public static void m63233r() {
        SparseArray sparseArray = f10841p;
        if (sparseArray.size() == 0) {
            Logger.m63180b();
        } else if (sparseArray.get(3) != null) {
            Logger.m63179c(3);
        } else if (sparseArray.get(4) != null) {
            Logger.m63179c(4);
        } else if (sparseArray.get(5) != null) {
            Logger.m63179c(5);
        } else if (sparseArray.get(6) != null) {
            Logger.m63179c(6);
        }
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public CameraDeviceSurfaceManager getCameraDeviceSurfaceManager() {
        CameraDeviceSurfaceManager cameraDeviceSurfaceManager = this.f10849h;
        if (cameraDeviceSurfaceManager != null) {
            return cameraDeviceSurfaceManager;
        }
        throw new IllegalStateException("CameraX not initialized yet.");
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public CameraFactory getCameraFactory() {
        CameraFactory cameraFactory = this.f10848g;
        if (cameraFactory != null) {
            return cameraFactory;
        }
        throw new IllegalStateException("CameraX not initialized yet.");
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public CameraRepository getCameraRepository() {
        return this.f10842a;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public UseCaseConfigFactory getDefaultConfigFactory() {
        UseCaseConfigFactory useCaseConfigFactory = this.f10850i;
        if (useCaseConfigFactory != null) {
            return useCaseConfigFactory;
        }
        throw new IllegalStateException("CameraX not initialized yet.");
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public ListenableFuture<Void> getInitializeFuture() {
        return this.f10852k;
    }

    /* renamed from: i */
    public final void m63242i(final Executor executor, final long j, final Context context, final CallbackToFutureAdapter.Completer completer) {
        executor.execute(new Runnable() { // from class: vk
            @Override // java.lang.Runnable
            public final void run() {
                CameraX.m63249b(CameraX.this, context, executor, completer, j);
            }
        });
    }

    /* renamed from: j */
    public final ListenableFuture m63241j(final Context context) {
        boolean z;
        ListenableFuture future;
        synchronized (this.f10843b) {
            if (this.f10853l == InternalInitState.UNINITIALIZED) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkState(z, "CameraX.initInternal() should only be called once per instance");
            this.f10853l = InternalInitState.INITIALIZING;
            future = CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: sk
                @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
                public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                    return CameraX.m63248c(CameraX.this, context, completer);
                }
            });
        }
        return future;
    }

    /* renamed from: k */
    public final /* synthetic */ void m63240k(Executor executor, long j, CallbackToFutureAdapter.Completer completer) {
        m63242i(executor, j, this.f10851j, completer);
    }

    /* JADX WARN: Removed duplicated region for block: B:83:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00ee  */
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* synthetic */ void m63239l(android.content.Context r8, final java.util.concurrent.Executor r9, final androidx.concurrent.futures.CallbackToFutureAdapter.Completer r10, final long r11) {
        /*
            Method dump skipped, instructions count: 281
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.CameraX.m63239l(android.content.Context, java.util.concurrent.Executor, androidx.concurrent.futures.CallbackToFutureAdapter$Completer, long):void");
    }

    /* renamed from: m */
    public final /* synthetic */ Object m63238m(Context context, CallbackToFutureAdapter.Completer completer) {
        m63242i(this.f10845d, SystemClock.elapsedRealtime(), context, completer);
        return "CameraX initInternal";
    }

    /* renamed from: n */
    public final /* synthetic */ void m63237n(CallbackToFutureAdapter.Completer completer) {
        if (this.f10847f != null) {
            Executor executor = this.f10845d;
            if (executor instanceof ExecutorC0470Gj) {
                ((ExecutorC0470Gj) executor).m68241d();
            }
            this.f10847f.quit();
        }
        completer.set(null);
    }

    /* renamed from: o */
    public final /* synthetic */ Object m63236o(final CallbackToFutureAdapter.Completer completer) {
        this.f10842a.deinit().addListener(new Runnable() { // from class: uk
            @Override // java.lang.Runnable
            public final void run() {
                CameraX.m63250a(CameraX.this, completer);
            }
        }, this.f10845d);
        return "CameraX shutdownInternal";
    }

    /* renamed from: p */
    public final void m63235p() {
        synchronized (this.f10843b) {
            this.f10853l = InternalInitState.INITIALIZED;
        }
    }

    /* renamed from: q */
    public final ListenableFuture m63234q() {
        synchronized (this.f10843b) {
            try {
                this.f10846e.removeCallbacksAndMessages("retry_token");
                int i = C2427a.f10856a[this.f10853l.ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        if (i == 3 || i == 4) {
                            this.f10853l = InternalInitState.SHUTDOWN;
                            m63245f(this.f10855n);
                            this.f10854m = CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: tk
                                @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
                                public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                                    return CameraX.m63247d(CameraX.this, completer);
                                }
                            });
                        }
                        return this.f10854m;
                    }
                    throw new IllegalStateException("CameraX could not be shutdown when it is initializing.");
                }
                this.f10853l = InternalInitState.SHUTDOWN;
                return Futures.immediateFuture(null);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public ListenableFuture<Void> shutdown() {
        return m63234q();
    }
}