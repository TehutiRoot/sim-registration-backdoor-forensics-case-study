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
    public static final Object f10752o = new Object();

    /* renamed from: p */
    public static final SparseArray f10753p = new SparseArray();

    /* renamed from: c */
    public final CameraXConfig f10756c;

    /* renamed from: d */
    public final Executor f10757d;

    /* renamed from: e */
    public final Handler f10758e;

    /* renamed from: f */
    public final HandlerThread f10759f;

    /* renamed from: g */
    public CameraFactory f10760g;

    /* renamed from: h */
    public CameraDeviceSurfaceManager f10761h;

    /* renamed from: i */
    public UseCaseConfigFactory f10762i;

    /* renamed from: j */
    public Context f10763j;

    /* renamed from: k */
    public final ListenableFuture f10764k;

    /* renamed from: n */
    public final Integer f10767n;

    /* renamed from: a */
    public final CameraRepository f10754a = new CameraRepository();

    /* renamed from: b */
    public final Object f10755b = new Object();

    /* renamed from: l */
    public InternalInitState f10765l = InternalInitState.UNINITIALIZED;

    /* renamed from: m */
    public ListenableFuture f10766m = Futures.immediateFuture(null);

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
    public static /* synthetic */ class C2445a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f10768a;

        static {
            int[] iArr = new int[InternalInitState.values().length];
            f10768a = iArr;
            try {
                iArr[InternalInitState.UNINITIALIZED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10768a[InternalInitState.INITIALIZING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f10768a[InternalInitState.INITIALIZING_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f10768a[InternalInitState.INITIALIZED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f10768a[InternalInitState.SHUTDOWN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public CameraX(@NonNull Context context, @Nullable CameraXConfig.Provider provider) {
        if (provider != null) {
            this.f10756c = provider.getCameraXConfig();
        } else {
            CameraXConfig.Provider m63296g = m63296g(context);
            if (m63296g != null) {
                this.f10756c = m63296g.getCameraXConfig();
            } else {
                throw new IllegalStateException("CameraX is not configured properly. The most likely cause is you did not include a default implementation in your build such as 'camera-camera2'.");
            }
        }
        Executor cameraExecutor = this.f10756c.getCameraExecutor(null);
        Handler schedulerHandler = this.f10756c.getSchedulerHandler(null);
        this.f10757d = cameraExecutor == null ? new ExecutorC0475Gj() : cameraExecutor;
        if (schedulerHandler == null) {
            HandlerThread handlerThread = new HandlerThread("CameraX-scheduler", 10);
            this.f10759f = handlerThread;
            handlerThread.start();
            this.f10758e = HandlerCompat.createAsync(handlerThread.getLooper());
        } else {
            this.f10759f = null;
            this.f10758e = schedulerHandler;
        }
        Integer num = (Integer) this.f10756c.retrieveOption(CameraXConfig.f10774g, null);
        this.f10767n = num;
        m63295h(num);
        this.f10764k = m63293j(context);
    }

    /* renamed from: a */
    public static /* synthetic */ void m63302a(CameraX cameraX, CallbackToFutureAdapter.Completer completer) {
        cameraX.m63289n(completer);
    }

    /* renamed from: b */
    public static /* synthetic */ void m63301b(CameraX cameraX, Context context, Executor executor, CallbackToFutureAdapter.Completer completer, long j) {
        cameraX.m63291l(context, executor, completer, j);
    }

    /* renamed from: c */
    public static /* synthetic */ Object m63300c(CameraX cameraX, Context context, CallbackToFutureAdapter.Completer completer) {
        return cameraX.m63290m(context, completer);
    }

    /* renamed from: d */
    public static /* synthetic */ Object m63299d(CameraX cameraX, CallbackToFutureAdapter.Completer completer) {
        return cameraX.m63288o(completer);
    }

    /* renamed from: e */
    public static /* synthetic */ void m63298e(CameraX cameraX, Executor executor, long j, CallbackToFutureAdapter.Completer completer) {
        cameraX.m63292k(executor, j, completer);
    }

    /* renamed from: f */
    public static void m63297f(Integer num) {
        synchronized (f10752o) {
            try {
                if (num == null) {
                    return;
                }
                SparseArray sparseArray = f10753p;
                int intValue = ((Integer) sparseArray.get(num.intValue())).intValue() - 1;
                if (intValue == 0) {
                    sparseArray.remove(num.intValue());
                } else {
                    sparseArray.put(num.intValue(), Integer.valueOf(intValue));
                }
                m63285r();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: g */
    public static CameraXConfig.Provider m63296g(Context context) {
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
                Logger.m63228e("CameraX", "No default CameraXConfig.Provider specified in meta-data. The most likely cause is you did not include a default implementation in your build such as 'camera-camera2'.");
                return null;
            }
            return (CameraXConfig.Provider) Class.forName(str).getDeclaredConstructor(null).newInstance(null);
        } catch (PackageManager.NameNotFoundException e) {
            e = e;
            Logger.m63227e("CameraX", "Failed to retrieve default CameraXConfig.Provider from meta-data", e);
            return null;
        } catch (ClassNotFoundException e2) {
            e = e2;
            Logger.m63227e("CameraX", "Failed to retrieve default CameraXConfig.Provider from meta-data", e);
            return null;
        } catch (IllegalAccessException e3) {
            e = e3;
            Logger.m63227e("CameraX", "Failed to retrieve default CameraXConfig.Provider from meta-data", e);
            return null;
        } catch (InstantiationException e4) {
            e = e4;
            Logger.m63227e("CameraX", "Failed to retrieve default CameraXConfig.Provider from meta-data", e);
            return null;
        } catch (NoSuchMethodException e5) {
            e = e5;
            Logger.m63227e("CameraX", "Failed to retrieve default CameraXConfig.Provider from meta-data", e);
            return null;
        } catch (NullPointerException e6) {
            e = e6;
            Logger.m63227e("CameraX", "Failed to retrieve default CameraXConfig.Provider from meta-data", e);
            return null;
        } catch (InvocationTargetException e7) {
            e = e7;
            Logger.m63227e("CameraX", "Failed to retrieve default CameraXConfig.Provider from meta-data", e);
            return null;
        }
    }

    /* renamed from: h */
    public static void m63295h(Integer num) {
        synchronized (f10752o) {
            try {
                if (num == null) {
                    return;
                }
                Preconditions.checkArgumentInRange(num.intValue(), 3, 6, "minLogLevel");
                SparseArray sparseArray = f10753p;
                int i = 1;
                if (sparseArray.get(num.intValue()) != null) {
                    i = 1 + ((Integer) sparseArray.get(num.intValue())).intValue();
                }
                sparseArray.put(num.intValue(), Integer.valueOf(i));
                m63285r();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: r */
    public static void m63285r() {
        SparseArray sparseArray = f10753p;
        if (sparseArray.size() == 0) {
            Logger.m63232b();
        } else if (sparseArray.get(3) != null) {
            Logger.m63231c(3);
        } else if (sparseArray.get(4) != null) {
            Logger.m63231c(4);
        } else if (sparseArray.get(5) != null) {
            Logger.m63231c(5);
        } else if (sparseArray.get(6) != null) {
            Logger.m63231c(6);
        }
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public CameraDeviceSurfaceManager getCameraDeviceSurfaceManager() {
        CameraDeviceSurfaceManager cameraDeviceSurfaceManager = this.f10761h;
        if (cameraDeviceSurfaceManager != null) {
            return cameraDeviceSurfaceManager;
        }
        throw new IllegalStateException("CameraX not initialized yet.");
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public CameraFactory getCameraFactory() {
        CameraFactory cameraFactory = this.f10760g;
        if (cameraFactory != null) {
            return cameraFactory;
        }
        throw new IllegalStateException("CameraX not initialized yet.");
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public CameraRepository getCameraRepository() {
        return this.f10754a;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public UseCaseConfigFactory getDefaultConfigFactory() {
        UseCaseConfigFactory useCaseConfigFactory = this.f10762i;
        if (useCaseConfigFactory != null) {
            return useCaseConfigFactory;
        }
        throw new IllegalStateException("CameraX not initialized yet.");
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public ListenableFuture<Void> getInitializeFuture() {
        return this.f10764k;
    }

    /* renamed from: i */
    public final void m63294i(final Executor executor, final long j, final Context context, final CallbackToFutureAdapter.Completer completer) {
        executor.execute(new Runnable() { // from class: vk
            {
                CameraX.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                CameraX.m63301b(CameraX.this, context, executor, completer, j);
            }
        });
    }

    /* renamed from: j */
    public final ListenableFuture m63293j(final Context context) {
        boolean z;
        ListenableFuture future;
        synchronized (this.f10755b) {
            if (this.f10765l == InternalInitState.UNINITIALIZED) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkState(z, "CameraX.initInternal() should only be called once per instance");
            this.f10765l = InternalInitState.INITIALIZING;
            future = CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: sk
                {
                    CameraX.this = this;
                }

                @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
                public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                    return CameraX.m63300c(CameraX.this, context, completer);
                }
            });
        }
        return future;
    }

    /* renamed from: k */
    public final /* synthetic */ void m63292k(Executor executor, long j, CallbackToFutureAdapter.Completer completer) {
        m63294i(executor, j, this.f10763j, completer);
    }

    /* JADX WARN: Removed duplicated region for block: B:83:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00ee  */
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* synthetic */ void m63291l(android.content.Context r8, final java.util.concurrent.Executor r9, final androidx.concurrent.futures.CallbackToFutureAdapter.Completer r10, final long r11) {
        /*
            Method dump skipped, instructions count: 281
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.CameraX.m63291l(android.content.Context, java.util.concurrent.Executor, androidx.concurrent.futures.CallbackToFutureAdapter$Completer, long):void");
    }

    /* renamed from: m */
    public final /* synthetic */ Object m63290m(Context context, CallbackToFutureAdapter.Completer completer) {
        m63294i(this.f10757d, SystemClock.elapsedRealtime(), context, completer);
        return "CameraX initInternal";
    }

    /* renamed from: n */
    public final /* synthetic */ void m63289n(CallbackToFutureAdapter.Completer completer) {
        if (this.f10759f != null) {
            Executor executor = this.f10757d;
            if (executor instanceof ExecutorC0475Gj) {
                ((ExecutorC0475Gj) executor).m68208d();
            }
            this.f10759f.quit();
        }
        completer.set(null);
    }

    /* renamed from: o */
    public final /* synthetic */ Object m63288o(final CallbackToFutureAdapter.Completer completer) {
        this.f10754a.deinit().addListener(new Runnable() { // from class: uk
            {
                CameraX.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                CameraX.m63302a(CameraX.this, completer);
            }
        }, this.f10757d);
        return "CameraX shutdownInternal";
    }

    /* renamed from: p */
    public final void m63287p() {
        synchronized (this.f10755b) {
            this.f10765l = InternalInitState.INITIALIZED;
        }
    }

    /* renamed from: q */
    public final ListenableFuture m63286q() {
        synchronized (this.f10755b) {
            try {
                this.f10758e.removeCallbacksAndMessages("retry_token");
                int i = C2445a.f10768a[this.f10765l.ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        if (i == 3 || i == 4) {
                            this.f10765l = InternalInitState.SHUTDOWN;
                            m63297f(this.f10767n);
                            this.f10766m = CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: tk
                                {
                                    CameraX.this = this;
                                }

                                @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
                                public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                                    return CameraX.m63299d(CameraX.this, completer);
                                }
                            });
                        }
                        return this.f10766m;
                    }
                    throw new IllegalStateException("CameraX could not be shutdown when it is initializing.");
                }
                this.f10765l = InternalInitState.SHUTDOWN;
                return Futures.immediateFuture(null);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public ListenableFuture<Void> shutdown() {
        return m63286q();
    }
}
