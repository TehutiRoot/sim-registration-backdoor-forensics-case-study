package androidx.camera.core.impl;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.camera.core.CameraUnavailableException;
import androidx.camera.core.InitializationException;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.CameraRepository;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.core.util.Preconditions;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

@RequiresApi(21)
/* loaded from: classes.dex */
public final class CameraRepository {

    /* renamed from: a */
    public final Object f11093a = new Object();

    /* renamed from: b */
    public final Map f11094b = new LinkedHashMap();

    /* renamed from: c */
    public final Set f11095c = new HashSet();

    /* renamed from: d */
    public ListenableFuture f11096d;

    /* renamed from: e */
    public CallbackToFutureAdapter.Completer f11097e;

    /* renamed from: a */
    public static /* synthetic */ void m62966a(CameraRepository cameraRepository, CameraInternal cameraInternal) {
        cameraRepository.m62963d(cameraInternal);
    }

    /* renamed from: b */
    public static /* synthetic */ Object m62965b(CameraRepository cameraRepository, CallbackToFutureAdapter.Completer completer) {
        return cameraRepository.m62964c(completer);
    }

    /* renamed from: c */
    public final /* synthetic */ Object m62964c(CallbackToFutureAdapter.Completer completer) {
        synchronized (this.f11093a) {
            this.f11097e = completer;
        }
        return "CameraRepository-deinit";
    }

    /* renamed from: d */
    public final /* synthetic */ void m62963d(CameraInternal cameraInternal) {
        synchronized (this.f11093a) {
            try {
                this.f11095c.remove(cameraInternal);
                if (this.f11095c.isEmpty()) {
                    Preconditions.checkNotNull(this.f11097e);
                    this.f11097e.set(null);
                    this.f11097e = null;
                    this.f11096d = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @NonNull
    public ListenableFuture<Void> deinit() {
        synchronized (this.f11093a) {
            try {
                if (this.f11094b.isEmpty()) {
                    ListenableFuture<Void> listenableFuture = this.f11096d;
                    if (listenableFuture == null) {
                        listenableFuture = Futures.immediateFuture(null);
                    }
                    return listenableFuture;
                }
                ListenableFuture<Void> listenableFuture2 = this.f11096d;
                if (listenableFuture2 == null) {
                    listenableFuture2 = CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: gk
                        {
                            CameraRepository.this = this;
                        }

                        @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
                        public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                            return CameraRepository.m62965b(CameraRepository.this, completer);
                        }
                    });
                    this.f11096d = listenableFuture2;
                }
                this.f11095c.addAll(this.f11094b.values());
                for (final CameraInternal cameraInternal : this.f11094b.values()) {
                    cameraInternal.release().addListener(new Runnable() { // from class: hk
                        @Override // java.lang.Runnable
                        public final void run() {
                            CameraRepository.m62966a(CameraRepository.this, cameraInternal);
                        }
                    }, CameraXExecutors.directExecutor());
                }
                this.f11094b.clear();
                return listenableFuture2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @NonNull
    public CameraInternal getCamera(@NonNull String str) {
        CameraInternal cameraInternal;
        synchronized (this.f11093a) {
            try {
                cameraInternal = (CameraInternal) this.f11094b.get(str);
                if (cameraInternal == null) {
                    throw new IllegalArgumentException("Invalid camera: " + str);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return cameraInternal;
    }

    @NonNull
    public LinkedHashSet<CameraInternal> getCameras() {
        LinkedHashSet<CameraInternal> linkedHashSet;
        synchronized (this.f11093a) {
            linkedHashSet = new LinkedHashSet<>(this.f11094b.values());
        }
        return linkedHashSet;
    }

    public void init(@NonNull CameraFactory cameraFactory) throws InitializationException {
        synchronized (this.f11093a) {
            try {
                for (String str : cameraFactory.getAvailableCameraIds()) {
                    Logger.m63230d("CameraRepository", "Added camera: " + str);
                    this.f11094b.put(str, cameraFactory.getCamera(str));
                }
            } catch (CameraUnavailableException e) {
                throw new InitializationException(e);
            }
        }
    }
}
