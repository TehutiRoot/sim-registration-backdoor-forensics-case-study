package androidx.camera.view;

import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.util.Size;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import androidx.camera.core.Logger;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.impl.utils.futures.FutureCallback;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.camera.view.AbstractC2699c;
import androidx.camera.view.C2704e;
import androidx.camera.view.PreviewView;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.core.content.ContextCompat;
import androidx.core.util.Consumer;
import androidx.core.util.Preconditions;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: androidx.camera.view.e */
/* loaded from: classes.dex */
public final class C2704e extends AbstractC2699c {

    /* renamed from: e */
    public TextureView f12225e;

    /* renamed from: f */
    public SurfaceTexture f12226f;

    /* renamed from: g */
    public ListenableFuture f12227g;

    /* renamed from: h */
    public SurfaceRequest f12228h;

    /* renamed from: i */
    public boolean f12229i;

    /* renamed from: j */
    public SurfaceTexture f12230j;

    /* renamed from: k */
    public AtomicReference f12231k;

    /* renamed from: l */
    public AbstractC2699c.InterfaceC2700a f12232l;

    /* renamed from: m */
    public PreviewView.OnFrameUpdateListener f12233m;

    /* renamed from: n */
    public Executor f12234n;

    /* renamed from: androidx.camera.view.e$a */
    /* loaded from: classes.dex */
    public class TextureView$SurfaceTextureListenerC2705a implements TextureView.SurfaceTextureListener {

        /* renamed from: androidx.camera.view.e$a$a */
        /* loaded from: classes.dex */
        public class C2706a implements FutureCallback {

            /* renamed from: a */
            public final /* synthetic */ SurfaceTexture f12236a;

            public C2706a(SurfaceTexture surfaceTexture) {
                TextureView$SurfaceTextureListenerC2705a.this = r1;
                this.f12236a = surfaceTexture;
            }

            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            /* renamed from: a */
            public void onSuccess(SurfaceRequest.Result result) {
                boolean z;
                if (result.getResultCode() != 3) {
                    z = true;
                } else {
                    z = false;
                }
                Preconditions.checkState(z, "Unexpected result from SurfaceRequest. Surface was provided twice.");
                Logger.m63230d("TextureViewImpl", "SurfaceTexture about to manually be destroyed");
                this.f12236a.release();
                C2704e c2704e = C2704e.this;
                if (c2704e.f12230j != null) {
                    c2704e.f12230j = null;
                }
            }

            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public void onFailure(Throwable th2) {
                throw new IllegalStateException("SurfaceReleaseFuture did not complete nicely.", th2);
            }
        }

        public TextureView$SurfaceTextureListenerC2705a() {
            C2704e.this = r1;
        }

        /* renamed from: b */
        public static /* synthetic */ void m61793b(PreviewView.OnFrameUpdateListener onFrameUpdateListener, SurfaceTexture surfaceTexture) {
            onFrameUpdateListener.onFrameUpdate(surfaceTexture.getTimestamp());
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            Logger.m63230d("TextureViewImpl", "SurfaceTexture available. Size: " + i + "x" + i2);
            C2704e c2704e = C2704e.this;
            c2704e.f12226f = surfaceTexture;
            if (c2704e.f12227g != null) {
                Preconditions.checkNotNull(c2704e.f12228h);
                Logger.m63230d("TextureViewImpl", "Surface invalidated " + C2704e.this.f12228h);
                C2704e.this.f12228h.getDeferrableSurface().close();
                return;
            }
            c2704e.m61795v();
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            C2704e c2704e = C2704e.this;
            c2704e.f12226f = null;
            ListenableFuture listenableFuture = c2704e.f12227g;
            if (listenableFuture != null) {
                Futures.addCallback(listenableFuture, new C2706a(surfaceTexture), ContextCompat.getMainExecutor(C2704e.this.f12225e.getContext()));
                C2704e.this.f12230j = surfaceTexture;
                return false;
            }
            Logger.m63230d("TextureViewImpl", "SurfaceTexture about to be destroyed");
            return true;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
            Logger.m63230d("TextureViewImpl", "SurfaceTexture size changed: " + i + "x" + i2);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(final SurfaceTexture surfaceTexture) {
            CallbackToFutureAdapter.Completer completer = (CallbackToFutureAdapter.Completer) C2704e.this.f12231k.getAndSet(null);
            if (completer != null) {
                completer.set(null);
            }
            C2704e c2704e = C2704e.this;
            final PreviewView.OnFrameUpdateListener onFrameUpdateListener = c2704e.f12233m;
            Executor executor = c2704e.f12234n;
            if (onFrameUpdateListener != null && executor != null) {
                executor.execute(new Runnable() { // from class: JS1
                    @Override // java.lang.Runnable
                    public final void run() {
                        C2704e.TextureView$SurfaceTextureListenerC2705a.m61793b(PreviewView.OnFrameUpdateListener.this, surfaceTexture);
                    }
                });
            }
        }
    }

    public C2704e(FrameLayout frameLayout, C2697b c2697b) {
        super(frameLayout, c2697b);
        this.f12229i = false;
        this.f12231k = new AtomicReference();
    }

    /* renamed from: k */
    public static /* synthetic */ Object m61806k(C2704e c2704e, Surface surface, CallbackToFutureAdapter.Completer completer) {
        return c2704e.m61800q(surface, completer);
    }

    /* renamed from: l */
    public static /* synthetic */ void m61805l(C2704e c2704e, Surface surface, ListenableFuture listenableFuture, SurfaceRequest surfaceRequest) {
        c2704e.m61799r(surface, listenableFuture, surfaceRequest);
    }

    /* renamed from: m */
    public static /* synthetic */ void m61804m(C2704e c2704e, SurfaceRequest surfaceRequest) {
        c2704e.m61801p(surfaceRequest);
    }

    /* renamed from: n */
    public static /* synthetic */ Object m61803n(C2704e c2704e, CallbackToFutureAdapter.Completer completer) {
        return c2704e.m61798s(completer);
    }

    @Override // androidx.camera.view.AbstractC2699c
    /* renamed from: b */
    public View mo61813b() {
        return this.f12225e;
    }

    @Override // androidx.camera.view.AbstractC2699c
    /* renamed from: c */
    public Bitmap mo61812c() {
        TextureView textureView = this.f12225e;
        if (textureView != null && textureView.isAvailable()) {
            return this.f12225e.getBitmap();
        }
        return null;
    }

    @Override // androidx.camera.view.AbstractC2699c
    /* renamed from: d */
    public void mo61811d() {
        m61796u();
    }

    @Override // androidx.camera.view.AbstractC2699c
    /* renamed from: e */
    public void mo61810e() {
        this.f12229i = true;
    }

    @Override // androidx.camera.view.AbstractC2699c
    /* renamed from: g */
    public void mo61809g(final SurfaceRequest surfaceRequest, AbstractC2699c.InterfaceC2700a interfaceC2700a) {
        this.f12211a = surfaceRequest.getResolution();
        this.f12232l = interfaceC2700a;
        m61802o();
        SurfaceRequest surfaceRequest2 = this.f12228h;
        if (surfaceRequest2 != null) {
            surfaceRequest2.willNotProvideSurface();
        }
        this.f12228h = surfaceRequest;
        surfaceRequest.addRequestCancellationListener(ContextCompat.getMainExecutor(this.f12225e.getContext()), new Runnable() { // from class: ES1
            @Override // java.lang.Runnable
            public final void run() {
                C2704e.m61804m(C2704e.this, surfaceRequest);
            }
        });
        m61795v();
    }

    @Override // androidx.camera.view.AbstractC2699c
    /* renamed from: i */
    public void mo61808i(Executor executor, PreviewView.OnFrameUpdateListener onFrameUpdateListener) {
        this.f12233m = onFrameUpdateListener;
        this.f12234n = executor;
    }

    @Override // androidx.camera.view.AbstractC2699c
    /* renamed from: j */
    public ListenableFuture mo61807j() {
        return CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: FS1
            {
                C2704e.this = this;
            }

            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                return C2704e.m61803n(C2704e.this, completer);
            }
        });
    }

    /* renamed from: o */
    public void m61802o() {
        Preconditions.checkNotNull(this.f12212b);
        Preconditions.checkNotNull(this.f12211a);
        TextureView textureView = new TextureView(this.f12212b.getContext());
        this.f12225e = textureView;
        textureView.setLayoutParams(new FrameLayout.LayoutParams(this.f12211a.getWidth(), this.f12211a.getHeight()));
        this.f12225e.setSurfaceTextureListener(new TextureView$SurfaceTextureListenerC2705a());
        this.f12212b.removeAllViews();
        this.f12212b.addView(this.f12225e);
    }

    /* renamed from: p */
    public final /* synthetic */ void m61801p(SurfaceRequest surfaceRequest) {
        SurfaceRequest surfaceRequest2 = this.f12228h;
        if (surfaceRequest2 != null && surfaceRequest2 == surfaceRequest) {
            this.f12228h = null;
            this.f12227g = null;
        }
        m61797t();
    }

    /* renamed from: q */
    public final /* synthetic */ Object m61800q(Surface surface, final CallbackToFutureAdapter.Completer completer) {
        Logger.m63230d("TextureViewImpl", "Surface set on Preview.");
        SurfaceRequest surfaceRequest = this.f12228h;
        Executor directExecutor = CameraXExecutors.directExecutor();
        Objects.requireNonNull(completer);
        surfaceRequest.provideSurface(surface, directExecutor, new Consumer() { // from class: IS1
            @Override // androidx.core.util.Consumer
            public final void accept(Object obj) {
                CallbackToFutureAdapter.Completer.this.set((SurfaceRequest.Result) obj);
            }
        });
        return "provideSurface[request=" + this.f12228h + " surface=" + surface + "]";
    }

    /* renamed from: r */
    public final /* synthetic */ void m61799r(Surface surface, ListenableFuture listenableFuture, SurfaceRequest surfaceRequest) {
        Logger.m63230d("TextureViewImpl", "Safe to release surface.");
        m61797t();
        surface.release();
        if (this.f12227g == listenableFuture) {
            this.f12227g = null;
        }
        if (this.f12228h == surfaceRequest) {
            this.f12228h = null;
        }
    }

    /* renamed from: s */
    public final /* synthetic */ Object m61798s(CallbackToFutureAdapter.Completer completer) {
        this.f12231k.set(completer);
        return "textureViewImpl_waitForNextFrame";
    }

    /* renamed from: t */
    public final void m61797t() {
        AbstractC2699c.InterfaceC2700a interfaceC2700a = this.f12232l;
        if (interfaceC2700a != null) {
            interfaceC2700a.mo61828a();
            this.f12232l = null;
        }
    }

    /* renamed from: u */
    public final void m61796u() {
        if (this.f12229i && this.f12230j != null) {
            SurfaceTexture surfaceTexture = this.f12225e.getSurfaceTexture();
            SurfaceTexture surfaceTexture2 = this.f12230j;
            if (surfaceTexture != surfaceTexture2) {
                this.f12225e.setSurfaceTexture(surfaceTexture2);
                this.f12230j = null;
                this.f12229i = false;
            }
        }
    }

    /* renamed from: v */
    public void m61795v() {
        SurfaceTexture surfaceTexture;
        Size size = this.f12211a;
        if (size != null && (surfaceTexture = this.f12226f) != null && this.f12228h != null) {
            surfaceTexture.setDefaultBufferSize(size.getWidth(), this.f12211a.getHeight());
            final Surface surface = new Surface(this.f12226f);
            final SurfaceRequest surfaceRequest = this.f12228h;
            final ListenableFuture future = CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: GS1
                {
                    C2704e.this = this;
                }

                @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
                public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                    return C2704e.m61806k(C2704e.this, surface, completer);
                }
            });
            this.f12227g = future;
            future.addListener(new Runnable() { // from class: HS1
                @Override // java.lang.Runnable
                public final void run() {
                    C2704e.m61805l(C2704e.this, surface, future, surfaceRequest);
                }
            }, ContextCompat.getMainExecutor(this.f12225e.getContext()));
            m61830f();
        }
    }
}
