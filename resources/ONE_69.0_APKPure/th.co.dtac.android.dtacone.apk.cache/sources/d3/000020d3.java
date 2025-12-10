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
    public final Executor f11869a;

    /* renamed from: b */
    public final Executor f11870b;

    /* renamed from: c */
    public final EncoderFactory f11871c;

    /* renamed from: d */
    public Encoder f11872d = null;

    /* renamed from: e */
    public Surface f11873e = null;

    /* renamed from: f */
    public SurfaceRequest f11874f = null;

    /* renamed from: g */
    public Executor f11875g = null;

    /* renamed from: h */
    public Encoder.SurfaceInput.OnSurfaceUpdateListener f11876h = null;

    /* renamed from: i */
    public VideoEncoderState f11877i = VideoEncoderState.NOT_INITIALIZED;

    /* renamed from: j */
    public ListenableFuture f11878j = Futures.immediateFailedFuture(new IllegalStateException("Cannot close the encoder before configuring."));

    /* renamed from: k */
    public CallbackToFutureAdapter.Completer f11879k = null;

    /* renamed from: l */
    public ListenableFuture f11880l = Futures.immediateFailedFuture(new IllegalStateException("Cannot close the encoder before configuring."));

    /* renamed from: m */
    public CallbackToFutureAdapter.Completer f11881m = null;

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
    public class C2607a implements FutureCallback {
        public C2607a() {
            VideoEncoderSession.this = r1;
        }

        @Override // androidx.camera.core.impl.utils.futures.FutureCallback
        /* renamed from: a */
        public void onSuccess(Encoder encoder) {
        }

        @Override // androidx.camera.core.impl.utils.futures.FutureCallback
        public void onFailure(Throwable th2) {
            Logger.m63170w("VideoEncoderSession", "VideoEncoder configuration failed.", th2);
            VideoEncoderSession.this.m62225x();
        }
    }

    /* renamed from: androidx.camera.video.VideoEncoderSession$b */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C2608b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f11883a;

        static {
            int[] iArr = new int[VideoEncoderState.values().length];
            f11883a = iArr;
            try {
                iArr[VideoEncoderState.NOT_INITIALIZED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11883a[VideoEncoderState.INITIALIZING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f11883a[VideoEncoderState.READY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f11883a[VideoEncoderState.PENDING_RELEASE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f11883a[VideoEncoderState.RELEASED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public VideoEncoderSession(EncoderFactory encoderFactory, Executor executor, Executor executor2) {
        this.f11869a = executor2;
        this.f11870b = executor;
        this.f11871c = encoderFactory;
    }

    /* renamed from: a */
    public static /* synthetic */ Object m62248a(VideoEncoderSession videoEncoderSession, SurfaceRequest surfaceRequest, Timebase timebase, VideoValidatedEncoderProfilesProxy videoValidatedEncoderProfilesProxy, MediaSpec mediaSpec, CallbackToFutureAdapter.Completer completer) {
        return videoEncoderSession.m62232q(surfaceRequest, timebase, videoValidatedEncoderProfilesProxy, mediaSpec, completer);
    }

    /* renamed from: b */
    public static /* synthetic */ void m62247b(VideoEncoderSession videoEncoderSession, SurfaceRequest.Result result) {
        videoEncoderSession.m62228u(result);
    }

    /* renamed from: c */
    public static /* synthetic */ void m62246c(VideoEncoderSession videoEncoderSession, Surface surface) {
        videoEncoderSession.m62231r(surface);
    }

    /* renamed from: d */
    public static /* synthetic */ Object m62245d(VideoEncoderSession videoEncoderSession, CallbackToFutureAdapter.Completer completer) {
        return videoEncoderSession.m62234o(completer);
    }

    /* renamed from: e */
    public static /* synthetic */ void m62244e(VideoEncoderSession videoEncoderSession) {
        videoEncoderSession.m62229t();
    }

    /* renamed from: f */
    public static /* synthetic */ Object m62243f(VideoEncoderSession videoEncoderSession, CallbackToFutureAdapter.Completer completer) {
        return videoEncoderSession.m62233p(completer);
    }

    /* renamed from: g */
    public static /* synthetic */ void m62242g(VideoEncoderSession videoEncoderSession, CallbackToFutureAdapter.Completer completer, SurfaceRequest surfaceRequest, Surface surface) {
        videoEncoderSession.m62230s(completer, surfaceRequest, surface);
    }

    /* renamed from: h */
    public final void m62241h() {
        int i = C2608b.f11883a[this.f11877i.ordinal()];
        if (i != 1 && i != 2) {
            if (i != 3 && i != 4) {
                if (i == 5) {
                    Logger.m63178d("VideoEncoderSession", "closeInternal in RELEASED state, No-op");
                    return;
                }
                throw new IllegalStateException("State " + this.f11877i + " is not handled");
            }
            Logger.m63178d("VideoEncoderSession", "closeInternal in " + this.f11877i + " state");
            this.f11877i = VideoEncoderState.PENDING_RELEASE;
            return;
        }
        m62225x();
    }

    /* renamed from: i */
    public ListenableFuture m62240i(final SurfaceRequest surfaceRequest, final Timebase timebase, final MediaSpec mediaSpec, final VideoValidatedEncoderProfilesProxy videoValidatedEncoderProfilesProxy) {
        if (C2608b.f11883a[this.f11877i.ordinal()] != 1) {
            return Futures.immediateFailedFuture(new IllegalStateException("configure() shouldn't be called in " + this.f11877i));
        }
        this.f11877i = VideoEncoderState.INITIALIZING;
        this.f11874f = surfaceRequest;
        Logger.m63178d("VideoEncoderSession", "Create VideoEncoderSession: " + this);
        this.f11878j = CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: U22
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                return VideoEncoderSession.m62245d(VideoEncoderSession.this, completer);
            }
        });
        this.f11880l = CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: V22
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                return VideoEncoderSession.m62243f(VideoEncoderSession.this, completer);
            }
        });
        ListenableFuture future = CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: W22
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                return VideoEncoderSession.m62248a(VideoEncoderSession.this, surfaceRequest, timebase, videoValidatedEncoderProfilesProxy, mediaSpec, completer);
            }
        });
        Futures.addCallback(future, new C2607a(), this.f11870b);
        return Futures.nonCancellationPropagating(future);
    }

    /* renamed from: j */
    public final void m62239j(final SurfaceRequest surfaceRequest, Timebase timebase, VideoValidatedEncoderProfilesProxy videoValidatedEncoderProfilesProxy, MediaSpec mediaSpec, final CallbackToFutureAdapter.Completer completer) {
        DynamicRange dynamicRange = surfaceRequest.getDynamicRange();
        try {
            Encoder createEncoder = this.f11871c.createEncoder(this.f11869a, VideoConfigUtil.resolveVideoEncoderConfig(VideoConfigUtil.resolveVideoMimeInfo(mediaSpec, dynamicRange, videoValidatedEncoderProfilesProxy), timebase, mediaSpec.getVideoSpec(), surfaceRequest.getResolution(), dynamicRange, surfaceRequest.getExpectedFrameRate()));
            this.f11872d = createEncoder;
            Encoder.EncoderInput input = createEncoder.getInput();
            if (!(input instanceof Encoder.SurfaceInput)) {
                completer.setException(new AssertionError("The EncoderInput of video isn't a SurfaceInput."));
            } else {
                ((Encoder.SurfaceInput) input).setOnSurfaceUpdateListener(this.f11870b, new Encoder.SurfaceInput.OnSurfaceUpdateListener() { // from class: X22
                    @Override // androidx.camera.video.internal.encoder.Encoder.SurfaceInput.OnSurfaceUpdateListener
                    public final void onSurfaceUpdate(Surface surface) {
                        VideoEncoderSession.m62242g(VideoEncoderSession.this, completer, surfaceRequest, surface);
                    }
                });
            }
        } catch (InvalidConfigException e) {
            Logger.m63175e("VideoEncoderSession", "Unable to initialize video encoder.", e);
            completer.setException(e);
        }
    }

    /* renamed from: k */
    public Surface m62238k() {
        if (this.f11877i != VideoEncoderState.READY) {
            return null;
        }
        return this.f11873e;
    }

    /* renamed from: l */
    public ListenableFuture m62237l() {
        return Futures.nonCancellationPropagating(this.f11880l);
    }

    /* renamed from: m */
    public Encoder m62236m() {
        return this.f11872d;
    }

    /* renamed from: n */
    public boolean m62235n(SurfaceRequest surfaceRequest) {
        int i = C2608b.f11883a[this.f11877i.ordinal()];
        if (i == 1) {
            return false;
        }
        if (i != 2 && i != 3) {
            if (i == 4 || i == 5) {
                return false;
            }
            throw new IllegalStateException("State " + this.f11877i + " is not handled");
        } else if (this.f11874f != surfaceRequest) {
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: o */
    public final /* synthetic */ Object m62234o(CallbackToFutureAdapter.Completer completer) {
        this.f11879k = completer;
        return "ReleasedFuture " + this;
    }

    /* renamed from: p */
    public final /* synthetic */ Object m62233p(CallbackToFutureAdapter.Completer completer) {
        this.f11881m = completer;
        return "ReadyToReleaseFuture " + this;
    }

    /* renamed from: q */
    public final /* synthetic */ Object m62232q(SurfaceRequest surfaceRequest, Timebase timebase, VideoValidatedEncoderProfilesProxy videoValidatedEncoderProfilesProxy, MediaSpec mediaSpec, CallbackToFutureAdapter.Completer completer) {
        m62239j(surfaceRequest, timebase, videoValidatedEncoderProfilesProxy, mediaSpec, completer);
        return "ConfigureVideoEncoderFuture " + this;
    }

    /* renamed from: r */
    public final /* synthetic */ void m62231r(Surface surface) {
        this.f11876h.onSurfaceUpdate(surface);
    }

    /* renamed from: s */
    public final /* synthetic */ void m62230s(CallbackToFutureAdapter.Completer completer, SurfaceRequest surfaceRequest, final Surface surface) {
        Executor executor;
        int i = C2608b.f11883a[this.f11877i.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4 && i != 5) {
                        throw new IllegalStateException("State " + this.f11877i + " is not handled");
                    }
                } else {
                    if (this.f11876h != null && (executor = this.f11875g) != null) {
                        executor.execute(new Runnable() { // from class: Z22
                            @Override // java.lang.Runnable
                            public final void run() {
                                VideoEncoderSession.m62246c(VideoEncoderSession.this, surface);
                            }
                        });
                    }
                    Logger.m63171w("VideoEncoderSession", "Surface is updated in READY state: " + surface);
                    return;
                }
            } else if (surfaceRequest.isServiced()) {
                Logger.m63178d("VideoEncoderSession", "Not provide surface, " + Objects.toString(surfaceRequest, "EMPTY") + " is already serviced.");
                completer.set(null);
                m62241h();
                return;
            } else {
                this.f11873e = surface;
                Logger.m63178d("VideoEncoderSession", "provide surface: " + surface);
                surfaceRequest.provideSurface(surface, this.f11870b, new Consumer() { // from class: Y22
                    @Override // androidx.core.util.Consumer
                    public final void accept(Object obj) {
                        VideoEncoderSession.m62247b(VideoEncoderSession.this, (SurfaceRequest.Result) obj);
                    }
                });
                this.f11877i = VideoEncoderState.READY;
                completer.set(this.f11872d);
                return;
            }
        }
        Logger.m63178d("VideoEncoderSession", "Not provide surface in " + this.f11877i);
        completer.set(null);
    }

    /* renamed from: t */
    public final /* synthetic */ void m62229t() {
        this.f11879k.set(null);
    }

    public String toString() {
        return "VideoEncoderSession@" + hashCode() + " for " + Objects.toString(this.f11874f, "SURFACE_REQUEST_NOT_CONFIGURED");
    }

    /* renamed from: u */
    public final void m62228u(SurfaceRequest.Result result) {
        Logger.m63178d("VideoEncoderSession", "Surface can be closed: " + result.getSurface().hashCode());
        Surface surface = result.getSurface();
        if (surface == this.f11873e) {
            this.f11873e = null;
            this.f11881m.set(this.f11872d);
            m62241h();
            return;
        }
        surface.release();
    }

    /* renamed from: v */
    public void m62227v(Executor executor, Encoder.SurfaceInput.OnSurfaceUpdateListener onSurfaceUpdateListener) {
        this.f11875g = executor;
        this.f11876h = onSurfaceUpdateListener;
    }

    /* renamed from: w */
    public ListenableFuture m62226w() {
        m62241h();
        return Futures.nonCancellationPropagating(this.f11878j);
    }

    /* renamed from: x */
    public void m62225x() {
        int i = C2608b.f11883a[this.f11877i.ordinal()];
        if (i != 1) {
            if (i != 2 && i != 3 && i != 4) {
                if (i == 5) {
                    Logger.m63178d("VideoEncoderSession", "terminateNow in " + this.f11877i + ", No-op");
                    return;
                }
                throw new IllegalStateException("State " + this.f11877i + " is not handled");
            }
            this.f11877i = VideoEncoderState.RELEASED;
            this.f11881m.set(this.f11872d);
            this.f11874f = null;
            if (this.f11872d != null) {
                Logger.m63178d("VideoEncoderSession", "VideoEncoder is releasing: " + this.f11872d);
                this.f11872d.release();
                this.f11872d.getReleasedFuture().addListener(new Runnable() { // from class: T22
                    @Override // java.lang.Runnable
                    public final void run() {
                        VideoEncoderSession.m62244e(VideoEncoderSession.this);
                    }
                }, this.f11870b);
                this.f11872d = null;
                return;
            }
            Logger.m63171w("VideoEncoderSession", "There's no VideoEncoder to release! Finish release completer.");
            this.f11879k.set(null);
            return;
        }
        this.f11877i = VideoEncoderState.RELEASED;
    }
}