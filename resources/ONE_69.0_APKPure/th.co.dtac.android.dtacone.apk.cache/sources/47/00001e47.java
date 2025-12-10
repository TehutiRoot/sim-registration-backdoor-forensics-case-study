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
public final class C2421m extends SynchronizedCaptureSession.StateCallback {

    /* renamed from: a */
    public final List f10803a;

    public C2421m(List list) {
        ArrayList arrayList = new ArrayList();
        this.f10803a = arrayList;
        arrayList.addAll(list);
    }

    /* renamed from: j */
    public static SynchronizedCaptureSession.StateCallback m63317j(SynchronizedCaptureSession.StateCallback... stateCallbackArr) {
        return new C2421m(Arrays.asList(stateCallbackArr));
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback
    /* renamed from: d */
    public void mo63316d(SynchronizedCaptureSession synchronizedCaptureSession) {
        for (SynchronizedCaptureSession.StateCallback stateCallback : this.f10803a) {
            stateCallback.mo63316d(synchronizedCaptureSession);
        }
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback
    /* renamed from: e */
    public void mo63315e(SynchronizedCaptureSession synchronizedCaptureSession) {
        for (SynchronizedCaptureSession.StateCallback stateCallback : this.f10803a) {
            stateCallback.mo63315e(synchronizedCaptureSession);
        }
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback
    /* renamed from: f */
    public void mo63314f(SynchronizedCaptureSession synchronizedCaptureSession) {
        for (SynchronizedCaptureSession.StateCallback stateCallback : this.f10803a) {
            stateCallback.mo63314f(synchronizedCaptureSession);
        }
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback
    /* renamed from: g */
    public void mo63313g(SynchronizedCaptureSession synchronizedCaptureSession) {
        for (SynchronizedCaptureSession.StateCallback stateCallback : this.f10803a) {
            stateCallback.mo63313g(synchronizedCaptureSession);
        }
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback
    /* renamed from: h */
    public void mo63312h(SynchronizedCaptureSession synchronizedCaptureSession) {
        for (SynchronizedCaptureSession.StateCallback stateCallback : this.f10803a) {
            stateCallback.mo63312h(synchronizedCaptureSession);
        }
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback
    /* renamed from: i */
    public void mo63311i(SynchronizedCaptureSession synchronizedCaptureSession, Surface surface) {
        for (SynchronizedCaptureSession.StateCallback stateCallback : this.f10803a) {
            stateCallback.mo63311i(synchronizedCaptureSession, surface);
        }
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback
    public void onClosed(SynchronizedCaptureSession synchronizedCaptureSession) {
        for (SynchronizedCaptureSession.StateCallback stateCallback : this.f10803a) {
            stateCallback.onClosed(synchronizedCaptureSession);
        }
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback
    public void onConfigureFailed(SynchronizedCaptureSession synchronizedCaptureSession) {
        for (SynchronizedCaptureSession.StateCallback stateCallback : this.f10803a) {
            stateCallback.onConfigureFailed(synchronizedCaptureSession);
        }
    }

    /* renamed from: androidx.camera.camera2.internal.m$a */
    /* loaded from: classes.dex */
    public static class C2422a extends SynchronizedCaptureSession.StateCallback {

        /* renamed from: a */
        public final CameraCaptureSession.StateCallback f10804a;

        public C2422a(CameraCaptureSession.StateCallback stateCallback) {
            this.f10804a = stateCallback;
        }

        @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback
        /* renamed from: d */
        public void mo63316d(SynchronizedCaptureSession synchronizedCaptureSession) {
            this.f10804a.onActive(synchronizedCaptureSession.toCameraCaptureSessionCompat().toCameraCaptureSession());
        }

        @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback
        /* renamed from: e */
        public void mo63315e(SynchronizedCaptureSession synchronizedCaptureSession) {
            ApiCompat.Api26Impl.onCaptureQueueEmpty(this.f10804a, synchronizedCaptureSession.toCameraCaptureSessionCompat().toCameraCaptureSession());
        }

        @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback
        /* renamed from: f */
        public void mo63314f(SynchronizedCaptureSession synchronizedCaptureSession) {
            this.f10804a.onConfigured(synchronizedCaptureSession.toCameraCaptureSessionCompat().toCameraCaptureSession());
        }

        @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback
        /* renamed from: g */
        public void mo63313g(SynchronizedCaptureSession synchronizedCaptureSession) {
            this.f10804a.onReady(synchronizedCaptureSession.toCameraCaptureSessionCompat().toCameraCaptureSession());
        }

        @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback
        /* renamed from: h */
        public void mo63312h(SynchronizedCaptureSession synchronizedCaptureSession) {
        }

        @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback
        /* renamed from: i */
        public void mo63311i(SynchronizedCaptureSession synchronizedCaptureSession, Surface surface) {
            ApiCompat.Api23Impl.onSurfacePrepared(this.f10804a, synchronizedCaptureSession.toCameraCaptureSessionCompat().toCameraCaptureSession(), surface);
        }

        @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback
        public void onClosed(SynchronizedCaptureSession synchronizedCaptureSession) {
            this.f10804a.onClosed(synchronizedCaptureSession.toCameraCaptureSessionCompat().toCameraCaptureSession());
        }

        @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback
        public void onConfigureFailed(SynchronizedCaptureSession synchronizedCaptureSession) {
            this.f10804a.onConfigureFailed(synchronizedCaptureSession.toCameraCaptureSessionCompat().toCameraCaptureSession());
        }

        public C2422a(List list) {
            this(CameraCaptureSessionStateCallbacks.createComboCallback(list));
        }
    }
}