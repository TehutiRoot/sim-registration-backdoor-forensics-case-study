package androidx.camera.video;

import android.view.Surface;
import androidx.camera.core.DynamicRange;
import androidx.camera.core.Logger;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.core.impl.Timebase;
import androidx.camera.core.impl.utils.futures.FutureCallback;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.camera.video.VideoEncoderSession;
import androidx.camera.video.internal.VideoValidatedEncoderProfilesProxy;
import androidx.camera.video.internal.config.VideoConfigUtil;
import androidx.camera.video.internal.encoder.Encoder;
import androidx.camera.video.internal.encoder.EncoderFactory;
import androidx.camera.video.internal.encoder.InvalidConfigException;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.core.util.Consumer;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Objects;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class VideoEncoderSession {

    /* renamed from: a */
    public final Executor f11781a;

    /* renamed from: b */
    public final Executor f11782b;

    /* renamed from: c */
    public final EncoderFactory f11783c;

    /* renamed from: d */
    public Encoder f11784d = null;

    /* renamed from: e */
    public Surface f11785e = null;

    /* renamed from: f */
    public SurfaceRequest f11786f = null;

    /* renamed from: g */
    public Executor f11787g = null;

    /* renamed from: h */
    public Encoder.SurfaceInput.OnSurfaceUpdateListener f11788h = null;

    /* renamed from: i */
    public VideoEncoderState f11789i = VideoEncoderState.NOT_INITIALIZED;

    /* renamed from: j */
    public ListenableFuture f11790j = Futures.immediateFailedFuture(new IllegalStateException("Cannot close the encoder before configuring."));

    /* renamed from: k */
    public CallbackToFutureAdapter.Completer f11791k = null;

    /* renamed from: l */
    public ListenableFuture f11792l = Futures.immediateFailedFuture(new IllegalStateException("Cannot close the encoder before configuring."));

    /* renamed from: m */
    public CallbackToFutureAdapter.Completer f11793m = null;

    /* loaded from: classes.dex */
    public enum VideoEncoderState {
        NOT_INITIALIZED,
        INITIALIZING,
        PENDING_RELEASE,
        READY,
        RELEASED
    }

    /* renamed from: androidx.camera.video.VideoEncoderSession$a */
    /* loaded from: classes.dex */
    public class C2625a implements FutureCallback {
        public C2625a() {
            VideoEncoderSession.this = r1;
        }

        @Override // androidx.camera.core.impl.utils.futures.FutureCallback
        /* renamed from: a */
        public void onSuccess(Encoder encoder) {
        }

        @Override // androidx.camera.core.impl.utils.futures.FutureCallback
        public void onFailure(Throwable th2) {
            Logger.m63222w("VideoEncoderSession", "VideoEncoder configuration failed.", th2);
            VideoEncoderSession.this.m62277x();
        }
    }

    /* renamed from: androidx.camera.video.VideoEncoderSession$b */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C2626b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f11795a;

        static {
            int[] iArr = new int[VideoEncoderState.values().length];
            f11795a = iArr;
            try {
                iArr[VideoEncoderState.NOT_INITIALIZED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11795a[VideoEncoderState.INITIALIZING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f11795a[VideoEncoderState.READY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f11795a[VideoEncoderState.PENDING_RELEASE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f11795a[VideoEncoderState.RELEASED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public VideoEncoderSession(EncoderFactory encoderFactory, Executor executor, Executor executor2) {
        this.f11781a = executor2;
        this.f11782b = executor;
        this.f11783c = encoderFactory;
    }

    /* renamed from: a */
    public static /* synthetic */ Object m62300a(VideoEncoderSession videoEncoderSession, SurfaceRequest surfaceRequest, Timebase timebase, VideoValidatedEncoderProfilesProxy videoValidatedEncoderProfilesProxy, MediaSpec mediaSpec, CallbackToFutureAdapter.Completer completer) {
        return videoEncoderSession.m62284q(surfaceRequest, timebase, videoValidatedEncoderProfilesProxy, mediaSpec, completer);
    }

    /* renamed from: b */
    public static /* synthetic */ void m62299b(VideoEncoderSession videoEncoderSession, SurfaceRequest.Result result) {
        videoEncoderSession.m62280u(result);
    }

    /* renamed from: c */
    public static /* synthetic */ void m62298c(VideoEncoderSession videoEncoderSession, Surface surface) {
        videoEncoderSession.m62283r(surface);
    }

    /* renamed from: d */
    public static /* synthetic */ Object m62297d(VideoEncoderSession videoEncoderSession, CallbackToFutureAdapter.Completer completer) {
        return videoEncoderSession.m62286o(completer);
    }

    /* renamed from: e */
    public static /* synthetic */ void m62296e(VideoEncoderSession videoEncoderSession) {
        videoEncoderSession.m62281t();
    }

    /* renamed from: f */
    public static /* synthetic */ Object m62295f(VideoEncoderSession videoEncoderSession, CallbackToFutureAdapter.Completer completer) {
        return videoEncoderSession.m62285p(completer);
    }

    /* renamed from: g */
    public static /* synthetic */ void m62294g(VideoEncoderSession videoEncoderSession, CallbackToFutureAdapter.Completer completer, SurfaceRequest surfaceRequest, Surface surface) {
        videoEncoderSession.m62282s(completer, surfaceRequest, surface);
    }

    /* renamed from: h */
    public final void m62293h() {
        int i = C2626b.f11795a[this.f11789i.ordinal()];
        if (i != 1 && i != 2) {
            if (i != 3 && i != 4) {
                if (i == 5) {
                    Logger.m63230d("VideoEncoderSession", "closeInternal in RELEASED state, No-op");
                    return;
                }
                throw new IllegalStateException("State " + this.f11789i + " is not handled");
            }
            Logger.m63230d("VideoEncoderSession", "closeInternal in " + this.f11789i + " state");
            this.f11789i = VideoEncoderState.PENDING_RELEASE;
            return;
        }
        m62277x();
    }

    /* renamed from: i */
    public ListenableFuture m62292i(final SurfaceRequest surfaceRequest, final Timebase timebase, final MediaSpec mediaSpec, final VideoValidatedEncoderProfilesProxy videoValidatedEncoderProfilesProxy) {
        if (C2626b.f11795a[this.f11789i.ordinal()] != 1) {
            return Futures.immediateFailedFuture(new IllegalStateException("configure() shouldn't be called in " + this.f11789i));
        }
        this.f11789i = VideoEncoderState.INITIALIZING;
        this.f11786f = surfaceRequest;
        Logger.m63230d("VideoEncoderSession", "Create VideoEncoderSession: " + this);
        this.f11790j = CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: X12
            {
                VideoEncoderSession.this = this;
            }

            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                return VideoEncoderSession.m62297d(VideoEncoderSession.this, completer);
            }
        });
        this.f11792l = CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: Y12
            {
                VideoEncoderSession.this = this;
            }

            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                return VideoEncoderSession.m62295f(VideoEncoderSession.this, completer);
            }
        });
        ListenableFuture future = CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: Z12
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                return VideoEncoderSession.m62300a(VideoEncoderSession.this, surfaceRequest, timebase, videoValidatedEncoderProfilesProxy, mediaSpec, completer);
            }
        });
        Futures.addCallback(future, new C2625a(), this.f11782b);
        return Futures.nonCancellationPropagating(future);
    }

    /* renamed from: j */
    public final void m62291j(final SurfaceRequest surfaceRequest, Timebase timebase, VideoValidatedEncoderProfilesProxy videoValidatedEncoderProfilesProxy, MediaSpec mediaSpec, final CallbackToFutureAdapter.Completer completer) {
        DynamicRange dynamicRange = surfaceRequest.getDynamicRange();
        try {
            Encoder createEncoder = this.f11783c.createEncoder(this.f11781a, VideoConfigUtil.resolveVideoEncoderConfig(VideoConfigUtil.resolveVideoMimeInfo(mediaSpec, dynamicRange, videoValidatedEncoderProfilesProxy), timebase, mediaSpec.getVideoSpec(), surfaceRequest.getResolution(), dynamicRange, surfaceRequest.getExpectedFrameRate()));
            this.f11784d = createEncoder;
            Encoder.EncoderInput input = createEncoder.getInput();
            if (!(input instanceof Encoder.SurfaceInput)) {
                completer.setException(new AssertionError("The EncoderInput of video isn't a SurfaceInput."));
            } else {
                ((Encoder.SurfaceInput) input).setOnSurfaceUpdateListener(this.f11782b, new Encoder.SurfaceInput.OnSurfaceUpdateListener() { // from class: a22
                    @Override // androidx.camera.video.internal.encoder.Encoder.SurfaceInput.OnSurfaceUpdateListener
                    public final void onSurfaceUpdate(Surface surface) {
                        VideoEncoderSession.m62294g(VideoEncoderSession.this, completer, surfaceRequest, surface);
                    }
                });
            }
        } catch (InvalidConfigException e) {
            Logger.m63227e("VideoEncoderSession", "Unable to initialize video encoder.", e);
            completer.setException(e);
        }
    }

    /* renamed from: k */
    public Surface m62290k() {
        if (this.f11789i != VideoEncoderState.READY) {
            return null;
        }
        return this.f11785e;
    }

    /* renamed from: l */
    public ListenableFuture m62289l() {
        return Futures.nonCancellationPropagating(this.f11792l);
    }

    /* renamed from: m */
    public Encoder m62288m() {
        return this.f11784d;
    }

    /* renamed from: n */
    public boolean m62287n(SurfaceRequest surfaceRequest) {
        int i = C2626b.f11795a[this.f11789i.ordinal()];
        if (i == 1) {
            return false;
        }
        if (i != 2 && i != 3) {
            if (i == 4 || i == 5) {
                return false;
            }
            throw new IllegalStateException("State " + this.f11789i + " is not handled");
        } else if (this.f11786f != surfaceRequest) {
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: o */
    public final /* synthetic */ Object m62286o(CallbackToFutureAdapter.Completer completer) {
        this.f11791k = completer;
        return "ReleasedFuture " + this;
    }

    /* renamed from: p */
    public final /* synthetic */ Object m62285p(CallbackToFutureAdapter.Completer completer) {
        this.f11793m = completer;
        return "ReadyToReleaseFuture " + this;
    }

    /* renamed from: q */
    public final /* synthetic */ Object m62284q(SurfaceRequest surfaceRequest, Timebase timebase, VideoValidatedEncoderProfilesProxy videoValidatedEncoderProfilesProxy, MediaSpec mediaSpec, CallbackToFutureAdapter.Completer completer) {
        m62291j(surfaceRequest, timebase, videoValidatedEncoderProfilesProxy, mediaSpec, completer);
        return "ConfigureVideoEncoderFuture " + this;
    }

    /* renamed from: r */
    public final /* synthetic */ void m62283r(Surface surface) {
        this.f11788h.onSurfaceUpdate(surface);
    }

    /* renamed from: s */
    public final /* synthetic */ void m62282s(CallbackToFutureAdapter.Completer completer, SurfaceRequest surfaceRequest, final Surface surface) {
        Executor executor;
        int i = C2626b.f11795a[this.f11789i.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4 && i != 5) {
                        throw new IllegalStateException("State " + this.f11789i + " is not handled");
                    }
                } else {
                    if (this.f11788h != null && (executor = this.f11787g) != null) {
                        executor.execute(new Runnable() { // from class: c22
                            {
                                VideoEncoderSession.this = this;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                VideoEncoderSession.m62298c(VideoEncoderSession.this, surface);
                            }
                        });
                    }
                    Logger.m63223w("VideoEncoderSession", "Surface is updated in READY state: " + surface);
                    return;
                }
            } else if (surfaceRequest.isServiced()) {
                Logger.m63230d("VideoEncoderSession", "Not provide surface, " + Objects.toString(surfaceRequest, "EMPTY") + " is already serviced.");
                completer.set(null);
                m62293h();
                return;
            } else {
                this.f11785e = surface;
                Logger.m63230d("VideoEncoderSession", "provide surface: " + surface);
                surfaceRequest.provideSurface(surface, this.f11782b, new Consumer() { // from class: b22
                    @Override // androidx.core.util.Consumer
                    public final void accept(Object obj) {
                        VideoEncoderSession.m62299b(VideoEncoderSession.this, (SurfaceRequest.Result) obj);
                    }
                });
                this.f11789i = VideoEncoderState.READY;
                completer.set(this.f11784d);
                return;
            }
        }
        Logger.m63230d("VideoEncoderSession", "Not provide surface in " + this.f11789i);
        completer.set(null);
    }

    /* renamed from: t */
    public final /* synthetic */ void m62281t() {
        this.f11791k.set(null);
    }

    public String toString() {
        return "VideoEncoderSession@" + hashCode() + " for " + Objects.toString(this.f11786f, "SURFACE_REQUEST_NOT_CONFIGURED");
    }

    /* renamed from: u */
    public final void m62280u(SurfaceRequest.Result result) {
        Logger.m63230d("VideoEncoderSession", "Surface can be closed: " + result.getSurface().hashCode());
        Surface surface = result.getSurface();
        if (surface == this.f11785e) {
            this.f11785e = null;
            this.f11793m.set(this.f11784d);
            m62293h();
            return;
        }
        surface.release();
    }

    /* renamed from: v */
    public void m62279v(Executor executor, Encoder.SurfaceInput.OnSurfaceUpdateListener onSurfaceUpdateListener) {
        this.f11787g = executor;
        this.f11788h = onSurfaceUpdateListener;
    }

    /* renamed from: w */
    public ListenableFuture m62278w() {
        m62293h();
        return Futures.nonCancellationPropagating(this.f11790j);
    }

    /* renamed from: x */
    public void m62277x() {
        int i = C2626b.f11795a[this.f11789i.ordinal()];
        if (i != 1) {
            if (i != 2 && i != 3 && i != 4) {
                if (i == 5) {
                    Logger.m63230d("VideoEncoderSession", "terminateNow in " + this.f11789i + ", No-op");
                    return;
                }
                throw new IllegalStateException("State " + this.f11789i + " is not handled");
            }
            this.f11789i = VideoEncoderState.RELEASED;
            this.f11793m.set(this.f11784d);
            this.f11786f = null;
            if (this.f11784d != null) {
                Logger.m63230d("VideoEncoderSession", "VideoEncoder is releasing: " + this.f11784d);
                this.f11784d.release();
                this.f11784d.getReleasedFuture().addListener(new Runnable() { // from class: W12
                    {
                        VideoEncoderSession.this = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        VideoEncoderSession.m62296e(VideoEncoderSession.this);
                    }
                }, this.f11782b);
                this.f11784d = null;
                return;
            }
            Logger.m63223w("VideoEncoderSession", "There's no VideoEncoder to release! Finish release completer.");
            this.f11791k.set(null);
            return;
        }
        this.f11789i = VideoEncoderState.RELEASED;
    }
}
