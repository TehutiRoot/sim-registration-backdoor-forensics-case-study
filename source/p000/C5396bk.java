package p000;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import androidx.camera.camera2.internal.compat.C2388f;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import java.util.concurrent.Executor;

/* renamed from: bk */
/* loaded from: classes.dex */
public class C5396bk extends C2388f {
    public C5396bk(Context context) {
        super(context, null);
    }

    /* renamed from: b */
    public static C5396bk m51867b(Context context) {
        return new C5396bk(context);
    }

    /* renamed from: d */
    public static boolean m51865d(Throwable th2) {
        StackTraceElement[] stackTrace;
        if (!th2.getClass().equals(RuntimeException.class) || (stackTrace = th2.getStackTrace()) == null || stackTrace.length < 0) {
            return false;
        }
        return "_enableShutterSound".equals(stackTrace[0].getMethodName());
    }

    /* renamed from: c */
    public final boolean m51866c(Throwable th2) {
        if (Build.VERSION.SDK_INT == 28 && m51865d(th2)) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public final void m51864e(Throwable th2) {
        throw new CameraAccessExceptionCompat((int) CameraAccessExceptionCompat.CAMERA_UNAVAILABLE_DO_NOT_DISTURB, th2);
    }

    @Override // androidx.camera.camera2.internal.compat.C2388f, androidx.camera.camera2.internal.compat.CameraManagerCompat.CameraManagerCompatImpl
    public CameraCharacteristics getCameraCharacteristics(String str) {
        try {
            return super.getCameraCharacteristics(str);
        } catch (RuntimeException e) {
            if (m51866c(e)) {
                m51864e(e);
            }
            throw e;
        }
    }

    @Override // androidx.camera.camera2.internal.compat.C2388f, androidx.camera.camera2.internal.compat.CameraManagerCompat.CameraManagerCompatImpl
    public void openCamera(String str, Executor executor, CameraDevice.StateCallback stateCallback) {
        try {
            this.f10487a.openCamera(str, executor, stateCallback);
        } catch (CameraAccessException e) {
            throw CameraAccessExceptionCompat.toCameraAccessExceptionCompat(e);
        } catch (IllegalArgumentException e2) {
        } catch (SecurityException e3) {
            throw e3;
        } catch (RuntimeException e4) {
            if (m51866c(e4)) {
                m51864e(e4);
            }
            throw e4;
        }
    }

    @Override // androidx.camera.camera2.internal.compat.C2388f, androidx.camera.camera2.internal.compat.CameraManagerCompat.CameraManagerCompatImpl
    public void registerAvailabilityCallback(Executor executor, CameraManager.AvailabilityCallback availabilityCallback) {
        this.f10487a.registerAvailabilityCallback(executor, availabilityCallback);
    }

    @Override // androidx.camera.camera2.internal.compat.C2388f, androidx.camera.camera2.internal.compat.CameraManagerCompat.CameraManagerCompatImpl
    public void unregisterAvailabilityCallback(CameraManager.AvailabilityCallback availabilityCallback) {
        this.f10487a.unregisterAvailabilityCallback(availabilityCallback);
    }
}
