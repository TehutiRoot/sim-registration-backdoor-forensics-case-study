package androidx.camera.camera2.internal;

import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Build;
import android.os.Looper;
import android.util.Range;
import androidx.camera.camera2.impl.Camera2ImplConfig;
import androidx.camera.camera2.internal.C2442o;
import androidx.camera.camera2.internal.Camera2CameraControlImpl;
import androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat;
import androidx.camera.core.CameraControl;
import androidx.camera.core.Logger;
import androidx.camera.core.ZoomState;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.camera.core.internal.ImmutableZoomState;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* renamed from: androidx.camera.camera2.internal.o */
/* loaded from: classes.dex */
public final class C2442o {

    /* renamed from: a */
    public final Camera2CameraControlImpl f10724a;

    /* renamed from: b */
    public final Executor f10725b;

    /* renamed from: c */
    public final N62 f10726c;

    /* renamed from: d */
    public final MutableLiveData f10727d;

    /* renamed from: e */
    public final InterfaceC2444b f10728e;

    /* renamed from: f */
    public boolean f10729f = false;

    /* renamed from: g */
    public Camera2CameraControlImpl.CaptureResultListener f10730g = new C2443a();

    /* renamed from: androidx.camera.camera2.internal.o$a */
    /* loaded from: classes.dex */
    public class C2443a implements Camera2CameraControlImpl.CaptureResultListener {
        public C2443a() {
            C2442o.this = r1;
        }

        @Override // androidx.camera.camera2.internal.Camera2CameraControlImpl.CaptureResultListener
        public boolean onCaptureResult(TotalCaptureResult totalCaptureResult) {
            C2442o.this.f10728e.onCaptureResult(totalCaptureResult);
            return false;
        }
    }

    /* renamed from: androidx.camera.camera2.internal.o$b */
    /* loaded from: classes.dex */
    public interface InterfaceC2444b {
        /* renamed from: a */
        void mo63331a(Camera2ImplConfig.Builder builder);

        /* renamed from: b */
        float mo63330b();

        /* renamed from: c */
        float mo63329c();

        /* renamed from: d */
        void mo63328d(float f, CallbackToFutureAdapter.Completer completer);

        /* renamed from: e */
        void mo63327e();

        /* renamed from: f */
        Rect mo63326f();

        void onCaptureResult(TotalCaptureResult totalCaptureResult);
    }

    public C2442o(Camera2CameraControlImpl camera2CameraControlImpl, CameraCharacteristicsCompat cameraCharacteristicsCompat, Executor executor) {
        this.f10724a = camera2CameraControlImpl;
        this.f10725b = executor;
        InterfaceC2444b m63346f = m63346f(cameraCharacteristicsCompat);
        this.f10728e = m63346f;
        N62 n62 = new N62(m63346f.mo63329c(), m63346f.mo63330b());
        this.f10726c = n62;
        n62.m67243d(1.0f);
        this.f10727d = new MutableLiveData(ImmutableZoomState.create(n62));
        camera2CameraControlImpl.m63945k(this.f10730g);
    }

    /* renamed from: a */
    public static /* synthetic */ void m63351a(C2442o c2442o, CallbackToFutureAdapter.Completer completer, ZoomState zoomState) {
        c2442o.m63338n(completer, zoomState);
    }

    /* renamed from: b */
    public static /* synthetic */ void m63350b(C2442o c2442o, CallbackToFutureAdapter.Completer completer, ZoomState zoomState) {
        c2442o.m63340l(completer, zoomState);
    }

    /* renamed from: c */
    public static /* synthetic */ Object m63349c(C2442o c2442o, ZoomState zoomState, CallbackToFutureAdapter.Completer completer) {
        return c2442o.m63339m(zoomState, completer);
    }

    /* renamed from: d */
    public static /* synthetic */ Object m63348d(C2442o c2442o, ZoomState zoomState, CallbackToFutureAdapter.Completer completer) {
        return c2442o.m63337o(zoomState, completer);
    }

    /* renamed from: f */
    public static InterfaceC2444b m63346f(CameraCharacteristicsCompat cameraCharacteristicsCompat) {
        if (m63341k(cameraCharacteristicsCompat)) {
            return new C2371a(cameraCharacteristicsCompat);
        }
        return new C2421g(cameraCharacteristicsCompat);
    }

    /* renamed from: h */
    public static ZoomState m63344h(CameraCharacteristicsCompat cameraCharacteristicsCompat) {
        InterfaceC2444b m63346f = m63346f(cameraCharacteristicsCompat);
        N62 n62 = new N62(m63346f.mo63329c(), m63346f.mo63330b());
        n62.m67243d(1.0f);
        return ImmutableZoomState.create(n62);
    }

    /* renamed from: i */
    public static Range m63343i(CameraCharacteristicsCompat cameraCharacteristicsCompat) {
        CameraCharacteristics.Key key;
        try {
            key = CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE;
            return (Range) cameraCharacteristicsCompat.get(key);
        } catch (AssertionError e) {
            Logger.m63222w("ZoomControl", "AssertionError, fail to get camera characteristic.", e);
            return null;
        }
    }

    /* renamed from: k */
    public static boolean m63341k(CameraCharacteristicsCompat cameraCharacteristicsCompat) {
        if (Build.VERSION.SDK_INT >= 30 && m63343i(cameraCharacteristicsCompat) != null) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public void m63347e(Camera2ImplConfig.Builder builder) {
        this.f10728e.mo63331a(builder);
    }

    /* renamed from: g */
    public Rect m63345g() {
        return this.f10728e.mo63326f();
    }

    /* renamed from: j */
    public LiveData m63342j() {
        return this.f10727d;
    }

    /* renamed from: m */
    public final /* synthetic */ Object m63339m(final ZoomState zoomState, final CallbackToFutureAdapter.Completer completer) {
        this.f10725b.execute(new Runnable() { // from class: M62
            {
                C2442o.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C2442o.m63350b(C2442o.this, completer, zoomState);
            }
        });
        return "setLinearZoom";
    }

    /* renamed from: o */
    public final /* synthetic */ Object m63337o(final ZoomState zoomState, final CallbackToFutureAdapter.Completer completer) {
        this.f10725b.execute(new Runnable() { // from class: L62
            {
                C2442o.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C2442o.m63351a(C2442o.this, completer, zoomState);
            }
        });
        return "setZoomRatio";
    }

    /* renamed from: p */
    public void m63336p(boolean z) {
        ZoomState create;
        if (this.f10729f == z) {
            return;
        }
        this.f10729f = z;
        if (!z) {
            synchronized (this.f10726c) {
                this.f10726c.m67243d(1.0f);
                create = ImmutableZoomState.create(this.f10726c);
            }
            m63332t(create);
            this.f10728e.mo63327e();
            this.f10724a.m63957T();
        }
    }

    /* renamed from: q */
    public ListenableFuture m63335q(float f) {
        final ZoomState create;
        synchronized (this.f10726c) {
            try {
                this.f10726c.m67244c(f);
                create = ImmutableZoomState.create(this.f10726c);
            } catch (IllegalArgumentException e) {
                return Futures.immediateFailedFuture(e);
            }
        }
        m63332t(create);
        return CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: K62
            {
                C2442o.this = this;
            }

            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                return C2442o.m63349c(C2442o.this, create, completer);
            }
        });
    }

    /* renamed from: r */
    public ListenableFuture m63334r(float f) {
        final ZoomState create;
        synchronized (this.f10726c) {
            try {
                this.f10726c.m67243d(f);
                create = ImmutableZoomState.create(this.f10726c);
            } catch (IllegalArgumentException e) {
                return Futures.immediateFailedFuture(e);
            }
        }
        m63332t(create);
        return CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: J62
            {
                C2442o.this = this;
            }

            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                return C2442o.m63348d(C2442o.this, create, completer);
            }
        });
    }

    /* renamed from: s */
    public final void m63338n(CallbackToFutureAdapter.Completer completer, ZoomState zoomState) {
        ZoomState create;
        if (!this.f10729f) {
            synchronized (this.f10726c) {
                this.f10726c.m67243d(1.0f);
                create = ImmutableZoomState.create(this.f10726c);
            }
            m63332t(create);
            completer.setException(new CameraControl.OperationCanceledException("Camera is not active."));
            return;
        }
        this.f10728e.mo63328d(zoomState.getZoomRatio(), completer);
        this.f10724a.m63957T();
    }

    /* renamed from: t */
    public final void m63332t(ZoomState zoomState) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            this.f10727d.setValue(zoomState);
        } else {
            this.f10727d.postValue(zoomState);
        }
    }
}
