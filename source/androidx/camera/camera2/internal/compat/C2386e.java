package androidx.camera.camera2.internal.compat;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.os.Handler;
import androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat;
import androidx.camera.camera2.internal.compat.CameraDeviceCompat;
import androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat;
import androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat;
import androidx.camera.core.Logger;
import androidx.core.util.Preconditions;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: androidx.camera.camera2.internal.compat.e */
/* loaded from: classes.dex */
public class C2386e implements CameraDeviceCompat.InterfaceC2377a {

    /* renamed from: a */
    public final CameraDevice f10484a;

    /* renamed from: b */
    public final Object f10485b;

    /* renamed from: androidx.camera.camera2.internal.compat.e$a */
    /* loaded from: classes.dex */
    public static class C2387a {

        /* renamed from: a */
        public final Handler f10486a;

        public C2387a(Handler handler) {
            this.f10486a = handler;
        }
    }

    public C2386e(CameraDevice cameraDevice, Object obj) {
        this.f10484a = (CameraDevice) Preconditions.checkNotNull(cameraDevice);
        this.f10485b = obj;
    }

    /* renamed from: b */
    public static void m63674b(CameraDevice cameraDevice, List list) {
        String id2 = cameraDevice.getId();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String physicalCameraId = ((OutputConfigurationCompat) it.next()).getPhysicalCameraId();
            if (physicalCameraId != null && !physicalCameraId.isEmpty()) {
                Logger.m63223w("CameraDeviceCompat", "Camera " + id2 + ": Camera doesn't support physicalCameraId " + physicalCameraId + ". Ignoring.");
            }
        }
    }

    /* renamed from: c */
    public static void m63673c(CameraDevice cameraDevice, SessionConfigurationCompat sessionConfigurationCompat) {
        Preconditions.checkNotNull(cameraDevice);
        Preconditions.checkNotNull(sessionConfigurationCompat);
        Preconditions.checkNotNull(sessionConfigurationCompat.getStateCallback());
        List<OutputConfigurationCompat> outputConfigurations = sessionConfigurationCompat.getOutputConfigurations();
        if (outputConfigurations != null) {
            if (sessionConfigurationCompat.getExecutor() != null) {
                m63674b(cameraDevice, outputConfigurations);
                return;
            }
            throw new IllegalArgumentException("Invalid executor");
        }
        throw new IllegalArgumentException("Invalid output configurations");
    }

    /* renamed from: d */
    public static C2386e m63672d(CameraDevice cameraDevice, Handler handler) {
        return new C2386e(cameraDevice, new C2387a(handler));
    }

    /* renamed from: f */
    public static List m63670f(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((OutputConfigurationCompat) it.next()).getSurface());
        }
        return arrayList;
    }

    @Override // androidx.camera.camera2.internal.compat.CameraDeviceCompat.InterfaceC2377a
    /* renamed from: a */
    public void mo63675a(SessionConfigurationCompat sessionConfigurationCompat) {
        m63673c(this.f10484a, sessionConfigurationCompat);
        if (sessionConfigurationCompat.getInputConfiguration() == null) {
            if (sessionConfigurationCompat.getSessionType() != 1) {
                CameraCaptureSessionCompat.C2376c c2376c = new CameraCaptureSessionCompat.C2376c(sessionConfigurationCompat.getExecutor(), sessionConfigurationCompat.getStateCallback());
                m63671e(this.f10484a, m63670f(sessionConfigurationCompat.getOutputConfigurations()), c2376c, ((C2387a) this.f10485b).f10486a);
                return;
            }
            throw new IllegalArgumentException("High speed capture sessions not supported until API 23");
        }
        throw new IllegalArgumentException("Reprocessing sessions not supported until API 23");
    }

    /* renamed from: e */
    public void m63671e(CameraDevice cameraDevice, List list, CameraCaptureSession.StateCallback stateCallback, Handler handler) {
        try {
            cameraDevice.createCaptureSession(list, stateCallback, handler);
        } catch (CameraAccessException e) {
            throw CameraAccessExceptionCompat.toCameraAccessExceptionCompat(e);
        }
    }

    @Override // androidx.camera.camera2.internal.compat.CameraDeviceCompat.InterfaceC2377a
    public CameraDevice unwrap() {
        return this.f10484a;
    }
}
