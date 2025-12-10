package androidx.camera.camera2.internal.compat;

import android.content.Context;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.os.Handler;
import android.util.ArrayMap;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RequiresPermission;
import androidx.annotation.VisibleForTesting;
import androidx.camera.camera2.internal.compat.ApiCompat;
import androidx.camera.camera2.internal.compat.CameraManagerCompat;
import androidx.camera.core.impl.utils.MainThreadAsyncHandler;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

@RequiresApi(21)
/* loaded from: classes.dex */
public final class CameraManagerCompat {

    /* renamed from: a */
    public final CameraManagerCompatImpl f10469a;

    /* renamed from: b */
    public final Map f10470b = new ArrayMap(4);

    /* loaded from: classes.dex */
    public interface CameraManagerCompatImpl {
        @NonNull
        CameraCharacteristics getCameraCharacteristics(@NonNull String str) throws CameraAccessExceptionCompat;

        @NonNull
        String[] getCameraIdList() throws CameraAccessExceptionCompat;

        @NonNull
        CameraManager getCameraManager();

        @NonNull
        Set<Set<String>> getConcurrentCameraIds() throws CameraAccessExceptionCompat;

        @RequiresPermission("android.permission.CAMERA")
        void openCamera(@NonNull String str, @NonNull Executor executor, @NonNull CameraDevice.StateCallback stateCallback) throws CameraAccessExceptionCompat;

        void registerAvailabilityCallback(@NonNull Executor executor, @NonNull CameraManager.AvailabilityCallback availabilityCallback);

        void unregisterAvailabilityCallback(@NonNull CameraManager.AvailabilityCallback availabilityCallback);
    }

    /* renamed from: androidx.camera.camera2.internal.compat.CameraManagerCompat$a */
    /* loaded from: classes.dex */
    public static final class C2379a extends CameraManager.AvailabilityCallback {

        /* renamed from: a */
        public final Executor f10471a;

        /* renamed from: b */
        public final CameraManager.AvailabilityCallback f10472b;

        /* renamed from: c */
        public final Object f10473c = new Object();

        /* renamed from: d */
        public boolean f10474d = false;

        public C2379a(Executor executor, CameraManager.AvailabilityCallback availabilityCallback) {
            this.f10471a = executor;
            this.f10472b = availabilityCallback;
        }

        /* renamed from: a */
        public static /* synthetic */ void m63686a(C2379a c2379a, String str) {
            c2379a.m63682e(str);
        }

        /* renamed from: b */
        public static /* synthetic */ void m63685b(C2379a c2379a) {
            c2379a.m63683d();
        }

        /* renamed from: c */
        public static /* synthetic */ void m63684c(C2379a c2379a, String str) {
            c2379a.m63681f(str);
        }

        /* renamed from: d */
        public final /* synthetic */ void m63683d() {
            ApiCompat.Api29Impl.onCameraAccessPrioritiesChanged(this.f10472b);
        }

        /* renamed from: e */
        public final /* synthetic */ void m63682e(String str) {
            this.f10472b.onCameraAvailable(str);
        }

        /* renamed from: f */
        public final /* synthetic */ void m63681f(String str) {
            this.f10472b.onCameraUnavailable(str);
        }

        /* renamed from: g */
        public void m63680g() {
            synchronized (this.f10473c) {
                this.f10474d = true;
            }
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public void onCameraAccessPrioritiesChanged() {
            synchronized (this.f10473c) {
                try {
                    if (!this.f10474d) {
                        this.f10471a.execute(new Runnable() { // from class: Yj
                            {
                                CameraManagerCompat.C2379a.this = this;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                CameraManagerCompat.C2379a.m63685b(CameraManagerCompat.C2379a.this);
                            }
                        });
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public void onCameraAvailable(final String str) {
            synchronized (this.f10473c) {
                try {
                    if (!this.f10474d) {
                        this.f10471a.execute(new Runnable() { // from class: Xj
                            {
                                CameraManagerCompat.C2379a.this = this;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                CameraManagerCompat.C2379a.m63686a(CameraManagerCompat.C2379a.this, str);
                            }
                        });
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public void onCameraUnavailable(final String str) {
            synchronized (this.f10473c) {
                try {
                    if (!this.f10474d) {
                        this.f10471a.execute(new Runnable() { // from class: Zj
                            {
                                CameraManagerCompat.C2379a.this = this;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                CameraManagerCompat.C2379a.m63684c(CameraManagerCompat.C2379a.this, str);
                            }
                        });
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public CameraManagerCompat(CameraManagerCompatImpl cameraManagerCompatImpl) {
        this.f10469a = cameraManagerCompatImpl;
    }

    @NonNull
    public static CameraManagerCompat from(@NonNull Context context) {
        return from(context, MainThreadAsyncHandler.getInstance());
    }

    @NonNull
    public CameraCharacteristicsCompat getCameraCharacteristicsCompat(@NonNull String str) throws CameraAccessExceptionCompat {
        CameraCharacteristicsCompat cameraCharacteristicsCompat;
        synchronized (this.f10470b) {
            cameraCharacteristicsCompat = (CameraCharacteristicsCompat) this.f10470b.get(str);
            if (cameraCharacteristicsCompat == null) {
                try {
                    cameraCharacteristicsCompat = CameraCharacteristicsCompat.toCameraCharacteristicsCompat(this.f10469a.getCameraCharacteristics(str), str);
                    this.f10470b.put(str, cameraCharacteristicsCompat);
                } catch (AssertionError e) {
                    throw new CameraAccessExceptionCompat(CameraAccessExceptionCompat.CAMERA_CHARACTERISTICS_CREATION_ERROR, e.getMessage(), e);
                }
            }
        }
        return cameraCharacteristicsCompat;
    }

    @NonNull
    public String[] getCameraIdList() throws CameraAccessExceptionCompat {
        return this.f10469a.getCameraIdList();
    }

    @NonNull
    public Set<Set<String>> getConcurrentCameraIds() throws CameraAccessExceptionCompat {
        return this.f10469a.getConcurrentCameraIds();
    }

    @RequiresPermission("android.permission.CAMERA")
    public void openCamera(@NonNull String str, @NonNull Executor executor, @NonNull CameraDevice.StateCallback stateCallback) throws CameraAccessExceptionCompat {
        this.f10469a.openCamera(str, executor, stateCallback);
    }

    public void registerAvailabilityCallback(@NonNull Executor executor, @NonNull CameraManager.AvailabilityCallback availabilityCallback) {
        this.f10469a.registerAvailabilityCallback(executor, availabilityCallback);
    }

    public void unregisterAvailabilityCallback(@NonNull CameraManager.AvailabilityCallback availabilityCallback) {
        this.f10469a.unregisterAvailabilityCallback(availabilityCallback);
    }

    @NonNull
    public CameraManager unwrap() {
        return this.f10469a.getCameraManager();
    }

    @NonNull
    public static CameraManagerCompat from(@NonNull Context context, @NonNull Handler handler) {
        return new CameraManagerCompat(AbstractC1913ak.m65055a(context, handler));
    }

    @NonNull
    @VisibleForTesting
    public static CameraManagerCompat from(@NonNull CameraManagerCompatImpl cameraManagerCompatImpl) {
        return new CameraManagerCompat(cameraManagerCompatImpl);
    }
}
