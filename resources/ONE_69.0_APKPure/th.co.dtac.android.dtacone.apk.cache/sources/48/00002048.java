package androidx.camera.extensions;

import android.content.Context;
import android.util.Range;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.camera.core.CameraProvider;
import androidx.camera.core.CameraSelector;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.ExtendedCameraConfigProviderStore;
import androidx.camera.core.impl.utils.ContextUtil;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.camera.extensions.ExtensionsManager;
import androidx.camera.extensions.impl.InitializerImpl;
import androidx.camera.extensions.internal.ClientVersion;
import androidx.camera.extensions.internal.ExtensionVersion;
import androidx.camera.extensions.internal.Version;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutionException;

@RequiresApi(21)
/* loaded from: classes.dex */
public final class ExtensionsManager {

    /* renamed from: c */
    public static final Object f11580c = new Object();

    /* renamed from: d */
    public static ListenableFuture f11581d;

    /* renamed from: e */
    public static ListenableFuture f11582e;

    /* renamed from: f */
    public static ExtensionsManager f11583f;

    /* renamed from: a */
    public final ExtensionsAvailability f11584a;

    /* renamed from: b */
    public final C10224fU f11585b;

    /* loaded from: classes.dex */
    public enum ExtensionsAvailability {
        LIBRARY_AVAILABLE,
        LIBRARY_UNAVAILABLE_ERROR_LOADING,
        LIBRARY_UNAVAILABLE_MISSING_IMPLEMENTATION,
        NONE
    }

    public ExtensionsManager(ExtensionsAvailability extensionsAvailability, CameraProvider cameraProvider) {
        this.f11584a = extensionsAvailability;
        this.f11585b = new C10224fU(cameraProvider);
    }

    /* renamed from: b */
    public static /* synthetic */ Object m62570b(ExtensionsManager extensionsManager, CallbackToFutureAdapter.Completer completer) {
        return extensionsManager.m62566f(completer);
    }

    /* renamed from: c */
    public static ListenableFuture m62569c(final Context context, final CameraProvider cameraProvider, final ClientVersion clientVersion) {
        synchronized (f11580c) {
            try {
                ListenableFuture listenableFuture = f11582e;
                if (listenableFuture != null && !listenableFuture.isDone()) {
                    throw new IllegalStateException("Not yet done deinitializing extensions");
                }
                f11582e = null;
                if (ExtensionVersion.getRuntimeVersion() == null) {
                    return Futures.immediateFuture(m62568d(ExtensionsAvailability.NONE, cameraProvider));
                } else if (ExtensionVersion.getRuntimeVersion().compareTo(Version.VERSION_1_1) < 0) {
                    return Futures.immediateFuture(m62568d(ExtensionsAvailability.LIBRARY_AVAILABLE, cameraProvider));
                } else {
                    if (f11581d == null) {
                        f11581d = CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: hU
                            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
                            public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                                Object m62567e;
                                m62567e = ExtensionsManager.m62567e(ClientVersion.this, context, cameraProvider, completer);
                                return m62567e;
                            }
                        });
                    }
                    return f11581d;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: d */
    public static ExtensionsManager m62568d(ExtensionsAvailability extensionsAvailability, CameraProvider cameraProvider) {
        synchronized (f11580c) {
            try {
                ExtensionsManager extensionsManager = f11583f;
                if (extensionsManager != null) {
                    return extensionsManager;
                }
                ExtensionsManager extensionsManager2 = new ExtensionsManager(extensionsAvailability, cameraProvider);
                f11583f = extensionsManager2;
                return extensionsManager2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: e */
    public static /* synthetic */ Object m62567e(ClientVersion clientVersion, Context context, final CameraProvider cameraProvider, final CallbackToFutureAdapter.Completer completer) {
        try {
            InitializerImpl.init(clientVersion.toVersionString(), ContextUtil.getApplicationContext(context), new InitializerImpl.OnExtensionsInitializedCallback() { // from class: androidx.camera.extensions.ExtensionsManager.1
                public void onFailure(int i) {
                    Logger.m63176e("ExtensionsManager", "Failed to initialize extensions");
                    completer.set(ExtensionsManager.m62568d(ExtensionsAvailability.LIBRARY_UNAVAILABLE_ERROR_LOADING, cameraProvider));
                }

                public void onSuccess() {
                    Logger.m63178d("ExtensionsManager", "Successfully initialized extensions");
                    completer.set(ExtensionsManager.m62568d(ExtensionsAvailability.LIBRARY_AVAILABLE, cameraProvider));
                }
            }, CameraXExecutors.directExecutor());
            return "Initialize extensions";
        } catch (AbstractMethodError e) {
            e = e;
            Logger.m63176e("ExtensionsManager", "Failed to initialize extensions. Some classes or methods are missed in the vendor library. " + e);
            completer.set(m62568d(ExtensionsAvailability.LIBRARY_UNAVAILABLE_MISSING_IMPLEMENTATION, cameraProvider));
            return "Initialize extensions";
        } catch (NoClassDefFoundError e2) {
            e = e2;
            Logger.m63176e("ExtensionsManager", "Failed to initialize extensions. Some classes or methods are missed in the vendor library. " + e);
            completer.set(m62568d(ExtensionsAvailability.LIBRARY_UNAVAILABLE_MISSING_IMPLEMENTATION, cameraProvider));
            return "Initialize extensions";
        } catch (NoSuchMethodError e3) {
            e = e3;
            Logger.m63176e("ExtensionsManager", "Failed to initialize extensions. Some classes or methods are missed in the vendor library. " + e);
            completer.set(m62568d(ExtensionsAvailability.LIBRARY_UNAVAILABLE_MISSING_IMPLEMENTATION, cameraProvider));
            return "Initialize extensions";
        } catch (RuntimeException e4) {
            Logger.m63176e("ExtensionsManager", "Failed to initialize extensions. Something wents wrong when initializing the vendor library. " + e4);
            completer.set(m62568d(ExtensionsAvailability.LIBRARY_UNAVAILABLE_ERROR_LOADING, cameraProvider));
            return "Initialize extensions";
        }
    }

    @NonNull
    public static ListenableFuture<ExtensionsManager> getInstanceAsync(@NonNull Context context, @NonNull CameraProvider cameraProvider) {
        return m62569c(context, cameraProvider, ClientVersion.getCurrentVersion());
    }

    /* renamed from: f */
    public final /* synthetic */ Object m62566f(final CallbackToFutureAdapter.Completer completer) {
        try {
            InitializerImpl.deinit(new InitializerImpl.OnExtensionsDeinitializedCallback() { // from class: androidx.camera.extensions.ExtensionsManager.2
                {
                    ExtensionsManager.this = this;
                }

                public void onFailure(int i) {
                    completer.setException(new Exception("Failed to deinitialize extensions."));
                }

                public void onSuccess() {
                    completer.set(null);
                }
            }, CameraXExecutors.directExecutor());
            return null;
        } catch (NoClassDefFoundError | NoSuchMethodError e) {
            completer.setException(e);
            return null;
        }
    }

    @Nullable
    public Range<Long> getEstimatedCaptureLatencyRange(@NonNull CameraSelector cameraSelector, int i) {
        if (i == 0 || this.f11584a != ExtensionsAvailability.LIBRARY_AVAILABLE) {
            return null;
        }
        return this.f11585b.m31531c(cameraSelector, i, null);
    }

    @NonNull
    public CameraSelector getExtensionEnabledCameraSelector(@NonNull CameraSelector cameraSelector, int i) {
        if (i == 0) {
            return cameraSelector;
        }
        if (this.f11584a == ExtensionsAvailability.LIBRARY_AVAILABLE) {
            return this.f11585b.m31529e(cameraSelector, i);
        }
        throw new IllegalArgumentException("This device doesn't support extensions function! isExtensionAvailable should be checked first before calling getExtensionEnabledCameraSelector.");
    }

    public boolean isExtensionAvailable(@NonNull CameraSelector cameraSelector, int i) {
        if (i == 0) {
            return true;
        }
        if (this.f11584a != ExtensionsAvailability.LIBRARY_AVAILABLE) {
            return false;
        }
        return this.f11585b.m31524j(cameraSelector, i);
    }

    public boolean isImageAnalysisSupported(@NonNull CameraSelector cameraSelector, int i) {
        if (i == 0) {
            return true;
        }
        if (this.f11584a != ExtensionsAvailability.LIBRARY_AVAILABLE) {
            return false;
        }
        return this.f11585b.m31523k(cameraSelector, i);
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @VisibleForTesting
    public ListenableFuture<Void> shutdown() {
        synchronized (f11580c) {
            try {
                if (ExtensionVersion.getRuntimeVersion() == null) {
                    f11581d = null;
                    f11583f = null;
                    ExtensionVersion.injectInstance(null);
                    return Futures.immediateFuture(null);
                }
                ExtensionVersion.injectInstance(null);
                ListenableFuture listenableFuture = f11581d;
                if (listenableFuture == null) {
                    return Futures.immediateFuture(null);
                }
                ListenableFuture<Void> listenableFuture2 = f11582e;
                if (listenableFuture2 != null) {
                    return listenableFuture2;
                }
                try {
                    listenableFuture.get();
                    f11581d = null;
                    ExtensionsAvailability extensionsAvailability = f11583f.f11584a;
                    f11583f = null;
                    if (extensionsAvailability == ExtensionsAvailability.LIBRARY_AVAILABLE) {
                        ExtendedCameraConfigProviderStore.clear();
                        f11582e = CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: gU
                            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
                            public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                                return ExtensionsManager.m62570b(ExtensionsManager.this, completer);
                            }
                        });
                    } else {
                        f11582e = Futures.immediateFuture(null);
                    }
                    return f11582e;
                } catch (InterruptedException e) {
                    e = e;
                    ListenableFuture<Void> immediateFailedFuture = Futures.immediateFailedFuture(e);
                    f11582e = immediateFailedFuture;
                    return immediateFailedFuture;
                } catch (ExecutionException e2) {
                    e = e2;
                    ListenableFuture<Void> immediateFailedFuture2 = Futures.immediateFailedFuture(e);
                    f11582e = immediateFailedFuture2;
                    return immediateFailedFuture2;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @VisibleForTesting
    public static ListenableFuture<ExtensionsManager> getInstanceAsync(@NonNull Context context, @NonNull CameraProvider cameraProvider, @NonNull String str) {
        ClientVersion clientVersion = new ClientVersion(str);
        ClientVersion.setCurrentVersion(clientVersion);
        return m62569c(context, cameraProvider, clientVersion);
    }
}