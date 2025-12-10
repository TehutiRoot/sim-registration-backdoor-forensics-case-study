package androidx.camera.view;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Size;
import android.view.PixelCopy;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.camera.core.Logger;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.camera.view.AbstractC2699c;
import androidx.camera.view.C2701d;
import androidx.camera.view.PreviewView;
import androidx.core.content.ContextCompat;
import androidx.core.util.Consumer;
import androidx.core.util.Preconditions;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/* renamed from: androidx.camera.view.d */
/* loaded from: classes.dex */
public final class C2701d extends AbstractC2699c {

    /* renamed from: e */
    public SurfaceView f12215e;

    /* renamed from: f */
    public final SurfaceHolder$CallbackC2703b f12216f;

    /* renamed from: androidx.camera.view.d$a */
    /* loaded from: classes.dex */
    public static class C2702a {
        @DoNotInline
        /* renamed from: a */
        public static void m61821a(@NonNull SurfaceView surfaceView, @NonNull Bitmap bitmap, @NonNull PixelCopy.OnPixelCopyFinishedListener onPixelCopyFinishedListener, @NonNull Handler handler) {
            PixelCopy.request(surfaceView, bitmap, onPixelCopyFinishedListener, handler);
        }
    }

    /* renamed from: androidx.camera.view.d$b */
    /* loaded from: classes.dex */
    public class SurfaceHolder$CallbackC2703b implements SurfaceHolder.Callback {

        /* renamed from: a */
        public Size f12217a;

        /* renamed from: b */
        public SurfaceRequest f12218b;

        /* renamed from: c */
        public SurfaceRequest f12219c;

        /* renamed from: d */
        public AbstractC2699c.InterfaceC2700a f12220d;

        /* renamed from: e */
        public Size f12221e;

        /* renamed from: f */
        public boolean f12222f = false;

        /* renamed from: g */
        public boolean f12223g = false;

        public SurfaceHolder$CallbackC2703b() {
            C2701d.this = r1;
        }

        /* renamed from: a */
        public static /* synthetic */ void m61820a(AbstractC2699c.InterfaceC2700a interfaceC2700a, SurfaceRequest.Result result) {
            m61816e(interfaceC2700a, result);
        }

        /* renamed from: e */
        public static /* synthetic */ void m61816e(AbstractC2699c.InterfaceC2700a interfaceC2700a, SurfaceRequest.Result result) {
            Logger.m63230d("SurfaceViewImpl", "Safe to release surface.");
            if (interfaceC2700a != null) {
                interfaceC2700a.mo61828a();
            }
        }

        /* renamed from: b */
        public final boolean m61819b() {
            if (!this.f12222f && this.f12218b != null && Objects.equals(this.f12217a, this.f12221e)) {
                return true;
            }
            return false;
        }

        /* renamed from: c */
        public final void m61818c() {
            if (this.f12218b != null) {
                Logger.m63230d("SurfaceViewImpl", "Request canceled: " + this.f12218b);
                this.f12218b.willNotProvideSurface();
            }
        }

        /* renamed from: d */
        public final void m61817d() {
            if (this.f12218b != null) {
                Logger.m63230d("SurfaceViewImpl", "Surface closed " + this.f12218b);
                this.f12218b.getDeferrableSurface().close();
            }
        }

        /* renamed from: f */
        public void m61815f(SurfaceRequest surfaceRequest, AbstractC2699c.InterfaceC2700a interfaceC2700a) {
            m61818c();
            if (this.f12223g) {
                this.f12223g = false;
                surfaceRequest.invalidate();
                return;
            }
            this.f12218b = surfaceRequest;
            this.f12220d = interfaceC2700a;
            Size resolution = surfaceRequest.getResolution();
            this.f12217a = resolution;
            this.f12222f = false;
            if (!m61814g()) {
                Logger.m63230d("SurfaceViewImpl", "Wait for new Surface creation.");
                C2701d.this.f12215e.getHolder().setFixedSize(resolution.getWidth(), resolution.getHeight());
            }
        }

        /* renamed from: g */
        public final boolean m61814g() {
            Surface surface = C2701d.this.f12215e.getHolder().getSurface();
            if (m61819b()) {
                Logger.m63230d("SurfaceViewImpl", "Surface set on Preview.");
                final AbstractC2699c.InterfaceC2700a interfaceC2700a = this.f12220d;
                SurfaceRequest surfaceRequest = this.f12218b;
                Objects.requireNonNull(surfaceRequest);
                surfaceRequest.provideSurface(surface, ContextCompat.getMainExecutor(C2701d.this.f12215e.getContext()), new Consumer() { // from class: OP1
                    @Override // androidx.core.util.Consumer
                    public final void accept(Object obj) {
                        C2701d.SurfaceHolder$CallbackC2703b.m61820a(AbstractC2699c.InterfaceC2700a.this, (SurfaceRequest.Result) obj);
                    }
                });
                this.f12222f = true;
                C2701d.this.m61830f();
                return true;
            }
            return false;
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
            Logger.m63230d("SurfaceViewImpl", "Surface changed. Size: " + i2 + "x" + i3);
            this.f12221e = new Size(i2, i3);
            m61814g();
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            SurfaceRequest surfaceRequest;
            Logger.m63230d("SurfaceViewImpl", "Surface created.");
            if (this.f12223g && (surfaceRequest = this.f12219c) != null) {
                surfaceRequest.invalidate();
                this.f12219c = null;
                this.f12223g = false;
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            Logger.m63230d("SurfaceViewImpl", "Surface destroyed.");
            if (this.f12222f) {
                m61817d();
            } else {
                m61818c();
            }
            this.f12223g = true;
            SurfaceRequest surfaceRequest = this.f12218b;
            if (surfaceRequest != null) {
                this.f12219c = surfaceRequest;
            }
            this.f12222f = false;
            this.f12218b = null;
            this.f12220d = null;
            this.f12221e = null;
            this.f12217a = null;
        }
    }

    public C2701d(FrameLayout frameLayout, C2697b c2697b) {
        super(frameLayout, c2697b);
        this.f12216f = new SurfaceHolder$CallbackC2703b();
    }

    /* renamed from: k */
    public static /* synthetic */ void m61827k(C2701d c2701d, SurfaceRequest surfaceRequest, AbstractC2699c.InterfaceC2700a interfaceC2700a) {
        c2701d.m61823o(surfaceRequest, interfaceC2700a);
    }

    /* renamed from: l */
    public static /* synthetic */ void m61826l(Semaphore semaphore, int i) {
        m61824n(semaphore, i);
    }

    /* renamed from: n */
    public static /* synthetic */ void m61824n(Semaphore semaphore, int i) {
        if (i == 0) {
            Logger.m63230d("SurfaceViewImpl", "PreviewView.SurfaceViewImplementation.getBitmap() succeeded");
        } else {
            Logger.m63228e("SurfaceViewImpl", "PreviewView.SurfaceViewImplementation.getBitmap() failed with error " + i);
        }
        semaphore.release();
    }

    /* renamed from: p */
    public static boolean m61822p(SurfaceView surfaceView, Size size, SurfaceRequest surfaceRequest) {
        boolean equals = Objects.equals(size, surfaceRequest.getResolution());
        if (surfaceView != null && equals) {
            return true;
        }
        return false;
    }

    @Override // androidx.camera.view.AbstractC2699c
    /* renamed from: b */
    public View mo61813b() {
        return this.f12215e;
    }

    @Override // androidx.camera.view.AbstractC2699c
    /* renamed from: c */
    public Bitmap mo61812c() {
        SurfaceView surfaceView = this.f12215e;
        if (surfaceView != null && surfaceView.getHolder().getSurface() != null && this.f12215e.getHolder().getSurface().isValid()) {
            final Semaphore semaphore = new Semaphore(0);
            Bitmap createBitmap = Bitmap.createBitmap(this.f12215e.getWidth(), this.f12215e.getHeight(), Bitmap.Config.ARGB_8888);
            HandlerThread handlerThread = new HandlerThread("pixelCopyRequest Thread");
            handlerThread.start();
            C2702a.m61821a(this.f12215e, createBitmap, new PixelCopy.OnPixelCopyFinishedListener() { // from class: MP1
                @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
                public final void onPixelCopyFinished(int i) {
                    C2701d.m61826l(semaphore, i);
                }
            }, new Handler(handlerThread.getLooper()));
            try {
                try {
                    if (!semaphore.tryAcquire(1, 100L, TimeUnit.MILLISECONDS)) {
                        Logger.m63228e("SurfaceViewImpl", "Timed out while trying to acquire screenshot.");
                    }
                } catch (InterruptedException e) {
                    Logger.m63227e("SurfaceViewImpl", "Interrupted while trying to acquire screenshot.", e);
                }
                return createBitmap;
            } finally {
                handlerThread.quitSafely();
            }
        }
        return null;
    }

    @Override // androidx.camera.view.AbstractC2699c
    /* renamed from: d */
    public void mo61811d() {
    }

    @Override // androidx.camera.view.AbstractC2699c
    /* renamed from: e */
    public void mo61810e() {
    }

    @Override // androidx.camera.view.AbstractC2699c
    /* renamed from: g */
    public void mo61809g(final SurfaceRequest surfaceRequest, final AbstractC2699c.InterfaceC2700a interfaceC2700a) {
        if (!m61822p(this.f12215e, this.f12211a, surfaceRequest)) {
            this.f12211a = surfaceRequest.getResolution();
            m61825m();
        }
        if (interfaceC2700a != null) {
            surfaceRequest.addRequestCancellationListener(ContextCompat.getMainExecutor(this.f12215e.getContext()), new Runnable() { // from class: KP1
                @Override // java.lang.Runnable
                public final void run() {
                    interfaceC2700a.mo61828a();
                }
            });
        }
        this.f12215e.post(new Runnable() { // from class: LP1
            @Override // java.lang.Runnable
            public final void run() {
                C2701d.m61827k(C2701d.this, surfaceRequest, interfaceC2700a);
            }
        });
    }

    @Override // androidx.camera.view.AbstractC2699c
    /* renamed from: i */
    public void mo61808i(Executor executor, PreviewView.OnFrameUpdateListener onFrameUpdateListener) {
        throw new IllegalArgumentException("SurfaceView doesn't support frame update listener");
    }

    @Override // androidx.camera.view.AbstractC2699c
    /* renamed from: j */
    public ListenableFuture mo61807j() {
        return Futures.immediateFuture(null);
    }

    /* renamed from: m */
    public void m61825m() {
        Preconditions.checkNotNull(this.f12212b);
        Preconditions.checkNotNull(this.f12211a);
        SurfaceView surfaceView = new SurfaceView(this.f12212b.getContext());
        this.f12215e = surfaceView;
        surfaceView.setLayoutParams(new FrameLayout.LayoutParams(this.f12211a.getWidth(), this.f12211a.getHeight()));
        this.f12212b.removeAllViews();
        this.f12212b.addView(this.f12215e);
        this.f12215e.getHolder().addCallback(this.f12216f);
    }

    /* renamed from: o */
    public final /* synthetic */ void m61823o(SurfaceRequest surfaceRequest, AbstractC2699c.InterfaceC2700a interfaceC2700a) {
        this.f12216f.m61815f(surfaceRequest, interfaceC2700a);
    }
}
