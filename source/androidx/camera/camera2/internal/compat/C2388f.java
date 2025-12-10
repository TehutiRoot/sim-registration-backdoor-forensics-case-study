package androidx.camera.camera2.internal.compat;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.os.Handler;
import androidx.camera.camera2.internal.compat.CameraDeviceCompat;
import androidx.camera.camera2.internal.compat.CameraManagerCompat;
import androidx.core.util.Preconditions;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* renamed from: androidx.camera.camera2.internal.compat.f */
/* loaded from: classes.dex */
public class C2388f implements CameraManagerCompat.CameraManagerCompatImpl {

    /* renamed from: a */
    public final CameraManager f10487a;

    /* renamed from: b */
    public final Object f10488b;

    /* renamed from: androidx.camera.camera2.internal.compat.f$a */
    /* loaded from: classes.dex */
    public static final class C2389a {

        /* renamed from: a */
        public final Map f10489a = new HashMap();

        /* renamed from: b */
        public final Handler f10490b;

        public C2389a(Handler handler) {
            this.f10490b = handler;
        }
    }

    public C2388f(Context context, Object obj) {
        this.f10487a = (CameraManager) context.getSystemService("camera");
        this.f10488b = obj;
    }

    /* renamed from: a */
    public static C2388f m63669a(Context context, Handler handler) {
        return new C2388f(context, new C2389a(handler));
    }

    @Override // androidx.camera.camera2.internal.compat.CameraManagerCompat.CameraManagerCompatImpl
    public CameraCharacteristics getCameraCharacteristics(String str) {
        try {
            return this.f10487a.getCameraCharacteristics(str);
        } catch (CameraAccessException e) {
            throw CameraAccessExceptionCompat.toCameraAccessExceptionCompat(e);
        }
    }

    @Override // androidx.camera.camera2.internal.compat.CameraManagerCompat.CameraManagerCompatImpl
    public String[] getCameraIdList() {
        try {
            return this.f10487a.getCameraIdList();
        } catch (CameraAccessException e) {
            throw CameraAccessExceptionCompat.toCameraAccessExceptionCompat(e);
        }
    }

    @Override // androidx.camera.camera2.internal.compat.CameraManagerCompat.CameraManagerCompatImpl
    public CameraManager getCameraManager() {
        return this.f10487a;
    }

    @Override // androidx.camera.camera2.internal.compat.CameraManagerCompat.CameraManagerCompatImpl
    public Set getConcurrentCameraIds() {
        return Collections.emptySet();
    }

    @Override // androidx.camera.camera2.internal.compat.CameraManagerCompat.CameraManagerCompatImpl
    public void openCamera(String str, Executor executor, CameraDevice.StateCallback stateCallback) {
        Preconditions.checkNotNull(executor);
        Preconditions.checkNotNull(stateCallback);
        try {
            this.f10487a.openCamera(str, new CameraDeviceCompat.C2378b(executor, stateCallback), ((C2389a) this.f10488b).f10490b);
        } catch (CameraAccessException e) {
            throw CameraAccessExceptionCompat.toCameraAccessExceptionCompat(e);
        }
    }

    @Override // androidx.camera.camera2.internal.compat.CameraManagerCompat.CameraManagerCompatImpl
    public void registerAvailabilityCallback(Executor executor, CameraManager.AvailabilityCallback availabilityCallback) {
        CameraManagerCompat.C2379a c2379a;
        if (executor != null) {
            C2389a c2389a = (C2389a) this.f10488b;
            if (availabilityCallback != null) {
                synchronized (c2389a.f10489a) {
                    try {
                        c2379a = (CameraManagerCompat.C2379a) c2389a.f10489a.get(availabilityCallback);
                        if (c2379a == null) {
                            c2379a = new CameraManagerCompat.C2379a(executor, availabilityCallback);
                            c2389a.f10489a.put(availabilityCallback, c2379a);
                        }
                    } finally {
                    }
                }
            } else {
                c2379a = null;
            }
            this.f10487a.registerAvailabilityCallback(c2379a, c2389a.f10490b);
            return;
        }
        throw new IllegalArgumentException("executor was null");
    }

    @Override // androidx.camera.camera2.internal.compat.CameraManagerCompat.CameraManagerCompatImpl
    public void unregisterAvailabilityCallback(CameraManager.AvailabilityCallback availabilityCallback) {
        CameraManagerCompat.C2379a c2379a;
        if (availabilityCallback != null) {
            C2389a c2389a = (C2389a) this.f10488b;
            synchronized (c2389a.f10489a) {
                c2379a = (CameraManagerCompat.C2379a) c2389a.f10489a.remove(availabilityCallback);
            }
        } else {
            c2379a = null;
        }
        if (c2379a != null) {
            c2379a.m63680g();
        }
        this.f10487a.unregisterAvailabilityCallback(c2379a);
    }
}
