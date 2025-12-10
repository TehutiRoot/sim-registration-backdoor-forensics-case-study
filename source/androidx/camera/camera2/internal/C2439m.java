package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraCaptureSession;
import android.view.Surface;
import androidx.camera.camera2.internal.SynchronizedCaptureSession;
import androidx.camera.camera2.internal.compat.ApiCompat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: androidx.camera.camera2.internal.m */
/* loaded from: classes.dex */
public final class C2439m extends SynchronizedCaptureSession.StateCallback {

    /* renamed from: a */
    public final List f10715a;

    public C2439m(List list) {
        ArrayList arrayList = new ArrayList();
        this.f10715a = arrayList;
        arrayList.addAll(list);
    }

    /* renamed from: j */
    public static SynchronizedCaptureSession.StateCallback m63368j(SynchronizedCaptureSession.StateCallback... stateCallbackArr) {
        return new C2439m(Arrays.asList(stateCallbackArr));
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback
    /* renamed from: d */
    public void mo63367d(SynchronizedCaptureSession synchronizedCaptureSession) {
        for (SynchronizedCaptureSession.StateCallback stateCallback : this.f10715a) {
            stateCallback.mo63367d(synchronizedCaptureSession);
        }
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback
    /* renamed from: e */
    public void mo63366e(SynchronizedCaptureSession synchronizedCaptureSession) {
        for (SynchronizedCaptureSession.StateCallback stateCallback : this.f10715a) {
            stateCallback.mo63366e(synchronizedCaptureSession);
        }
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback
    /* renamed from: f */
    public void mo52015f(SynchronizedCaptureSession synchronizedCaptureSession) {
        for (SynchronizedCaptureSession.StateCallback stateCallback : this.f10715a) {
            stateCallback.mo52015f(synchronizedCaptureSession);
        }
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback
    /* renamed from: g */
    public void mo63365g(SynchronizedCaptureSession synchronizedCaptureSession) {
        for (SynchronizedCaptureSession.StateCallback stateCallback : this.f10715a) {
            stateCallback.mo63365g(synchronizedCaptureSession);
        }
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback
    /* renamed from: h */
    public void mo63364h(SynchronizedCaptureSession synchronizedCaptureSession) {
        for (SynchronizedCaptureSession.StateCallback stateCallback : this.f10715a) {
            stateCallback.mo63364h(synchronizedCaptureSession);
        }
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback
    /* renamed from: i */
    public void mo63363i(SynchronizedCaptureSession synchronizedCaptureSession, Surface surface) {
        for (SynchronizedCaptureSession.StateCallback stateCallback : this.f10715a) {
            stateCallback.mo63363i(synchronizedCaptureSession, surface);
        }
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback
    public void onClosed(SynchronizedCaptureSession synchronizedCaptureSession) {
        for (SynchronizedCaptureSession.StateCallback stateCallback : this.f10715a) {
            stateCallback.onClosed(synchronizedCaptureSession);
        }
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback
    public void onConfigureFailed(SynchronizedCaptureSession synchronizedCaptureSession) {
        for (SynchronizedCaptureSession.StateCallback stateCallback : this.f10715a) {
            stateCallback.onConfigureFailed(synchronizedCaptureSession);
        }
    }

    /* renamed from: androidx.camera.camera2.internal.m$a */
    /* loaded from: classes.dex */
    public static class C2440a extends SynchronizedCaptureSession.StateCallback {

        /* renamed from: a */
        public final CameraCaptureSession.StateCallback f10716a;

        public C2440a(CameraCaptureSession.StateCallback stateCallback) {
            this.f10716a = stateCallback;
        }

        @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback
        /* renamed from: d */
        public void mo63367d(SynchronizedCaptureSession synchronizedCaptureSession) {
            this.f10716a.onActive(synchronizedCaptureSession.toCameraCaptureSessionCompat().toCameraCaptureSession());
        }

        @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback
        /* renamed from: e */
        public void mo63366e(SynchronizedCaptureSession synchronizedCaptureSession) {
            ApiCompat.Api26Impl.onCaptureQueueEmpty(this.f10716a, synchronizedCaptureSession.toCameraCaptureSessionCompat().toCameraCaptureSession());
        }

        @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback
        /* renamed from: f */
        public void mo52015f(SynchronizedCaptureSession synchronizedCaptureSession) {
            this.f10716a.onConfigured(synchronizedCaptureSession.toCameraCaptureSessionCompat().toCameraCaptureSession());
        }

        @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback
        /* renamed from: g */
        public void mo63365g(SynchronizedCaptureSession synchronizedCaptureSession) {
            this.f10716a.onReady(synchronizedCaptureSession.toCameraCaptureSessionCompat().toCameraCaptureSession());
        }

        @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback
        /* renamed from: h */
        public void mo63364h(SynchronizedCaptureSession synchronizedCaptureSession) {
        }

        @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback
        /* renamed from: i */
        public void mo63363i(SynchronizedCaptureSession synchronizedCaptureSession, Surface surface) {
            ApiCompat.Api23Impl.onSurfacePrepared(this.f10716a, synchronizedCaptureSession.toCameraCaptureSessionCompat().toCameraCaptureSession(), surface);
        }

        @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback
        public void onClosed(SynchronizedCaptureSession synchronizedCaptureSession) {
            this.f10716a.onClosed(synchronizedCaptureSession.toCameraCaptureSessionCompat().toCameraCaptureSession());
        }

        @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback
        public void onConfigureFailed(SynchronizedCaptureSession synchronizedCaptureSession) {
            this.f10716a.onConfigureFailed(synchronizedCaptureSession.toCameraCaptureSessionCompat().toCameraCaptureSession());
        }

        public C2440a(List list) {
            this(CameraCaptureSessionStateCallbacks.createComboCallback(list));
        }
    }
}
