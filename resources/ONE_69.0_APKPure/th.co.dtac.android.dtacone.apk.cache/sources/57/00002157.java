package androidx.camera.video.internal.encoder;

import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Range;
import android.view.Surface;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.Observable;
import androidx.camera.core.impl.Timebase;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.impl.utils.futures.FutureCallback;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.camera.video.internal.BufferProvider;
import androidx.camera.video.internal.DebugUtils;
import androidx.camera.video.internal.compat.quirk.AudioEncoderIgnoresInputTimestampQuirk;
import androidx.camera.video.internal.compat.quirk.CameraUseInconsistentTimebaseQuirk;
import androidx.camera.video.internal.compat.quirk.DeviceQuirks;
import androidx.camera.video.internal.compat.quirk.EncoderNotUsePersistentInputSurfaceQuirk;
import androidx.camera.video.internal.compat.quirk.VideoEncoderSuspendDoesNotIncludeSuspendTimeQuirk;
import androidx.camera.video.internal.encoder.Encoder;
import androidx.camera.video.internal.encoder.EncoderCallback;
import androidx.camera.video.internal.encoder.EncoderImpl;
import androidx.camera.video.internal.workaround.EncoderFinder;
import androidx.camera.video.internal.workaround.VideoTimebaseConverter;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.core.util.Preconditions;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicReference;

@RequiresApi(21)
/* loaded from: classes.dex */
public class EncoderImpl implements Encoder {

    /* renamed from: E */
    public static final Range f12096E = Range.create(Long.MAX_VALUE, Long.MAX_VALUE);

    /* renamed from: D */
    public final EncoderFinder f12100D;

    /* renamed from: a */
    public final String f12101a;

    /* renamed from: c */
    public final boolean f12103c;

    /* renamed from: d */
    public final MediaFormat f12104d;

    /* renamed from: e */
    public final MediaCodec f12105e;

    /* renamed from: f */
    public final Encoder.EncoderInput f12106f;

    /* renamed from: g */
    public final EncoderInfo f12107g;

    /* renamed from: h */
    public final Executor f12108h;

    /* renamed from: i */
    public final ListenableFuture f12109i;

    /* renamed from: j */
    public final CallbackToFutureAdapter.Completer f12110j;

    /* renamed from: p */
    public final Timebase f12116p;

    /* renamed from: t */
    public InternalState f12120t;

    /* renamed from: b */
    public final Object f12102b = new Object();

    /* renamed from: k */
    public final Queue f12111k = new ArrayDeque();

    /* renamed from: l */
    public final Queue f12112l = new ArrayDeque();

    /* renamed from: m */
    public final Set f12113m = new HashSet();

    /* renamed from: n */
    public final Set f12114n = new HashSet();

    /* renamed from: o */
    public final Deque f12115o = new ArrayDeque();

    /* renamed from: q */
    public final TimeProvider f12117q = new SystemTimeProvider();

    /* renamed from: r */
    public EncoderCallback f12118r = EncoderCallback.EMPTY;

    /* renamed from: s */
    public Executor f12119s = CameraXExecutors.directExecutor();

    /* renamed from: u */
    public Range f12121u = f12096E;

    /* renamed from: v */
    public long f12122v = 0;

    /* renamed from: w */
    public boolean f12123w = false;

    /* renamed from: x */
    public Long f12124x = null;

    /* renamed from: y */
    public Future f12125y = null;

    /* renamed from: z */
    public C2652e f12126z = null;

    /* renamed from: A */
    public boolean f12097A = false;

    /* renamed from: B */
    public boolean f12098B = false;

    /* renamed from: C */
    public boolean f12099C = false;

    /* loaded from: classes.dex */
    public enum InternalState {
        CONFIGURED,
        STARTED,
        PAUSED,
        STOPPING,
        PENDING_START,
        PENDING_START_PAUSED,
        PENDING_RELEASE,
        ERROR,
        RELEASED
    }

    /* renamed from: androidx.camera.video.internal.encoder.EncoderImpl$a */
    /* loaded from: classes.dex */
    public class C2647a implements FutureCallback {

        /* renamed from: androidx.camera.video.internal.encoder.EncoderImpl$a$a */
        /* loaded from: classes.dex */
        public class C2648a implements FutureCallback {
            public C2648a() {
                C2647a.this = r1;
            }

            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            /* renamed from: a */
            public void onSuccess(Void r1) {
            }

            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public void onFailure(Throwable th2) {
                if (th2 instanceof MediaCodec.CodecException) {
                    EncoderImpl.this.m61950w((MediaCodec.CodecException) th2);
                } else {
                    EncoderImpl.this.m61951v(0, th2.getMessage(), th2);
                }
            }
        }

        public C2647a() {
            EncoderImpl.this = r1;
        }

        @Override // androidx.camera.core.impl.utils.futures.FutureCallback
        /* renamed from: a */
        public void onSuccess(InputBuffer inputBuffer) {
            inputBuffer.setPresentationTimeUs(EncoderImpl.this.m61953t());
            inputBuffer.setEndOfStream(true);
            inputBuffer.submit();
            Futures.addCallback(inputBuffer.getTerminationFuture(), new C2648a(), EncoderImpl.this.f12108h);
        }

        @Override // androidx.camera.core.impl.utils.futures.FutureCallback
        public void onFailure(Throwable th2) {
            EncoderImpl.this.m61951v(0, "Unable to acquire InputBuffer.", th2);
        }
    }

    /* renamed from: androidx.camera.video.internal.encoder.EncoderImpl$b */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C2649b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f12129a;

        static {
            int[] iArr = new int[InternalState.values().length];
            f12129a = iArr;
            try {
                iArr[InternalState.CONFIGURED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f12129a[InternalState.STARTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f12129a[InternalState.PAUSED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f12129a[InternalState.STOPPING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f12129a[InternalState.PENDING_START_PAUSED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f12129a[InternalState.PENDING_START.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f12129a[InternalState.PENDING_RELEASE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f12129a[InternalState.ERROR.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f12129a[InternalState.RELEASED.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    /* renamed from: androidx.camera.video.internal.encoder.EncoderImpl$c */
    /* loaded from: classes.dex */
    public static class C2650c {
        @NonNull
        @DoNotInline
        /* renamed from: a */
        public static Surface m61944a() {
            Surface createPersistentInputSurface;
            createPersistentInputSurface = MediaCodec.createPersistentInputSurface();
            return createPersistentInputSurface;
        }

        @DoNotInline
        /* renamed from: b */
        public static void m61943b(@NonNull MediaCodec mediaCodec, @NonNull Surface surface) {
            mediaCodec.setInputSurface(surface);
        }
    }

    /* renamed from: androidx.camera.video.internal.encoder.EncoderImpl$d */
    /* loaded from: classes.dex */
    public class C2651d implements Encoder.ByteBufferInput {

        /* renamed from: a */
        public final Map f12130a = new LinkedHashMap();

        /* renamed from: b */
        public BufferProvider.State f12131b = BufferProvider.State.INACTIVE;

        /* renamed from: c */
        public final List f12132c = new ArrayList();

        public C2651d() {
            EncoderImpl.this = r1;
        }

        /* renamed from: a */
        public static /* synthetic */ void m61942a(C2651d c2651d, CallbackToFutureAdapter.Completer completer) {
            c2651d.m61925r(completer);
        }

        /* renamed from: b */
        public static /* synthetic */ void m61941b(Map.Entry entry, BufferProvider.State state) {
            m61922u(entry, state);
        }

        /* renamed from: c */
        public static /* synthetic */ Object m61940c(C2651d c2651d, CallbackToFutureAdapter.Completer completer) {
            return c2651d.m61924s(completer);
        }

        /* renamed from: d */
        public static /* synthetic */ void m61939d(C2651d c2651d, Observable.Observer observer, Executor executor) {
            c2651d.m61926q(observer, executor);
        }

        /* renamed from: f */
        public static /* synthetic */ void m61937f(C2651d c2651d, Observable.Observer observer) {
            c2651d.m61923t(observer);
        }

        /* renamed from: g */
        public static /* synthetic */ void m61936g(C2651d c2651d, ListenableFuture listenableFuture) {
            c2651d.m61930m(listenableFuture);
        }

        /* renamed from: h */
        public static /* synthetic */ Object m61935h(C2651d c2651d, CallbackToFutureAdapter.Completer completer) {
            return c2651d.m61928o(completer);
        }

        /* renamed from: i */
        public static /* synthetic */ void m61934i(C2651d c2651d, CallbackToFutureAdapter.Completer completer) {
            c2651d.m61929n(completer);
        }

        /* renamed from: j */
        public static /* synthetic */ void m61933j(C2651d c2651d, ListenableFuture listenableFuture) {
            c2651d.m61931l(listenableFuture);
        }

        /* renamed from: u */
        public static /* synthetic */ void m61922u(Map.Entry entry, BufferProvider.State state) {
            ((Observable.Observer) entry.getKey()).onNewData(state);
        }

        @Override // androidx.camera.video.internal.BufferProvider
        public ListenableFuture<InputBuffer> acquireBuffer() {
            return CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: YR
                @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
                public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                    return EncoderImpl.C2651d.m61935h(EncoderImpl.C2651d.this, completer);
                }
            });
        }

        @Override // androidx.camera.core.impl.Observable
        public void addObserver(final Executor executor, final Observable.Observer<? super BufferProvider.State> observer) {
            EncoderImpl.this.f12108h.execute(new Runnable() { // from class: WR
                @Override // java.lang.Runnable
                public final void run() {
                    EncoderImpl.C2651d.m61939d(EncoderImpl.C2651d.this, observer, executor);
                }
            });
        }

        @Override // androidx.camera.core.impl.Observable
        public ListenableFuture<BufferProvider.State> fetchData() {
            return CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: XR
                @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
                public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                    return EncoderImpl.C2651d.m61940c(EncoderImpl.C2651d.this, completer);
                }
            });
        }

        /* renamed from: k */
        public final void m61931l(ListenableFuture listenableFuture) {
            if (!listenableFuture.cancel(true)) {
                Preconditions.checkState(listenableFuture.isDone());
                try {
                    ((InputBuffer) listenableFuture.get()).cancel();
                } catch (InterruptedException | CancellationException | ExecutionException e) {
                    String str = EncoderImpl.this.f12101a;
                    Logger.m63171w(str, "Unable to cancel the input buffer: " + e);
                }
            }
        }

        /* renamed from: m */
        public final /* synthetic */ void m61930m(ListenableFuture listenableFuture) {
            this.f12132c.remove(listenableFuture);
        }

        /* renamed from: n */
        public final /* synthetic */ void m61929n(CallbackToFutureAdapter.Completer completer) {
            BufferProvider.State state = this.f12131b;
            if (state == BufferProvider.State.ACTIVE) {
                final ListenableFuture m61956q = EncoderImpl.this.m61956q();
                Futures.propagate(m61956q, completer);
                completer.addCancellationListener(new Runnable() { // from class: eS
                    @Override // java.lang.Runnable
                    public final void run() {
                        EncoderImpl.C2651d.m61933j(EncoderImpl.C2651d.this, m61956q);
                    }
                }, CameraXExecutors.directExecutor());
                this.f12132c.add(m61956q);
                m61956q.addListener(new Runnable() { // from class: fS
                    @Override // java.lang.Runnable
                    public final void run() {
                        EncoderImpl.C2651d.m61936g(EncoderImpl.C2651d.this, m61956q);
                    }
                }, EncoderImpl.this.f12108h);
            } else if (state == BufferProvider.State.INACTIVE) {
                completer.setException(new IllegalStateException("BufferProvider is not active."));
            } else {
                completer.setException(new IllegalStateException("Unknown state: " + this.f12131b));
            }
        }

        /* renamed from: o */
        public final /* synthetic */ Object m61928o(final CallbackToFutureAdapter.Completer completer) {
            EncoderImpl.this.f12108h.execute(new Runnable() { // from class: bS
                @Override // java.lang.Runnable
                public final void run() {
                    EncoderImpl.C2651d.m61934i(EncoderImpl.C2651d.this, completer);
                }
            });
            return "acquireBuffer";
        }

        /* renamed from: q */
        public final /* synthetic */ void m61926q(final Observable.Observer observer, Executor executor) {
            this.f12130a.put((Observable.Observer) Preconditions.checkNotNull(observer), (Executor) Preconditions.checkNotNull(executor));
            final BufferProvider.State state = this.f12131b;
            executor.execute(new Runnable() { // from class: dS
                @Override // java.lang.Runnable
                public final void run() {
                    Observable.Observer.this.onNewData(state);
                }
            });
        }

        /* renamed from: r */
        public final /* synthetic */ void m61925r(CallbackToFutureAdapter.Completer completer) {
            completer.set(this.f12131b);
        }

        @Override // androidx.camera.core.impl.Observable
        public void removeObserver(final Observable.Observer<? super BufferProvider.State> observer) {
            EncoderImpl.this.f12108h.execute(new Runnable() { // from class: aS
                @Override // java.lang.Runnable
                public final void run() {
                    EncoderImpl.C2651d.m61937f(EncoderImpl.C2651d.this, observer);
                }
            });
        }

        /* renamed from: s */
        public final /* synthetic */ Object m61924s(final CallbackToFutureAdapter.Completer completer) {
            EncoderImpl.this.f12108h.execute(new Runnable() { // from class: cS
                @Override // java.lang.Runnable
                public final void run() {
                    EncoderImpl.C2651d.m61942a(EncoderImpl.C2651d.this, completer);
                }
            });
            return "fetchData";
        }

        /* renamed from: t */
        public final /* synthetic */ void m61923t(Observable.Observer observer) {
            this.f12130a.remove(Preconditions.checkNotNull(observer));
        }

        /* renamed from: v */
        public void m61921v(boolean z) {
            final BufferProvider.State state;
            if (z) {
                state = BufferProvider.State.ACTIVE;
            } else {
                state = BufferProvider.State.INACTIVE;
            }
            if (this.f12131b == state) {
                return;
            }
            this.f12131b = state;
            if (state == BufferProvider.State.INACTIVE) {
                for (ListenableFuture listenableFuture : this.f12132c) {
                    listenableFuture.cancel(true);
                }
                this.f12132c.clear();
            }
            for (final Map.Entry entry : this.f12130a.entrySet()) {
                try {
                    ((Executor) entry.getValue()).execute(new Runnable() { // from class: ZR
                        @Override // java.lang.Runnable
                        public final void run() {
                            EncoderImpl.C2651d.m61941b(entry, state);
                        }
                    });
                } catch (RejectedExecutionException e) {
                    Logger.m63175e(EncoderImpl.this.f12101a, "Unable to post to the supplied executor.", e);
                }
            }
        }
    }

    /* renamed from: androidx.camera.video.internal.encoder.EncoderImpl$e */
    /* loaded from: classes.dex */
    public class C2652e extends MediaCodec.Callback {

        /* renamed from: a */
        public final VideoTimebaseConverter f12134a;

        /* renamed from: b */
        public boolean f12135b = false;

        /* renamed from: c */
        public boolean f12136c = false;

        /* renamed from: d */
        public boolean f12137d = false;

        /* renamed from: e */
        public long f12138e = 0;

        /* renamed from: f */
        public long f12139f = 0;

        /* renamed from: g */
        public boolean f12140g = false;

        /* renamed from: h */
        public boolean f12141h = false;

        /* renamed from: i */
        public boolean f12142i = false;

        /* renamed from: androidx.camera.video.internal.encoder.EncoderImpl$e$a */
        /* loaded from: classes.dex */
        public class C2653a implements FutureCallback {

            /* renamed from: a */
            public final /* synthetic */ EncodedDataImpl f12144a;

            public C2653a(EncodedDataImpl encodedDataImpl) {
                C2652e.this = r1;
                this.f12144a = encodedDataImpl;
            }

            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            /* renamed from: a */
            public void onSuccess(Void r2) {
                EncoderImpl.this.f12114n.remove(this.f12144a);
            }

            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public void onFailure(Throwable th2) {
                EncoderImpl.this.f12114n.remove(this.f12144a);
                if (th2 instanceof MediaCodec.CodecException) {
                    EncoderImpl.this.m61950w((MediaCodec.CodecException) th2);
                } else {
                    EncoderImpl.this.m61951v(0, th2.getMessage(), th2);
                }
            }
        }

        public C2652e() {
            EncoderImpl.this = r4;
            Timebase timebase = null;
            if (r4.f12103c) {
                if (DeviceQuirks.get(CameraUseInconsistentTimebaseQuirk.class) != null) {
                    Logger.m63171w(r4.f12101a, "CameraUseInconsistentTimebaseQuirk is enabled");
                } else {
                    timebase = r4.f12116p;
                }
                this.f12134a = new VideoTimebaseConverter(r4.f12117q, timebase);
                return;
            }
            this.f12134a = null;
        }

        /* renamed from: a */
        public static /* synthetic */ void m61920a(C2652e c2652e, MediaCodec.BufferInfo bufferInfo, MediaCodec mediaCodec, int i) {
            c2652e.m61906o(bufferInfo, mediaCodec, i);
        }

        /* renamed from: b */
        public static /* synthetic */ MediaFormat m61919b(MediaFormat mediaFormat) {
            return m61905p(mediaFormat);
        }

        /* renamed from: f */
        public static /* synthetic */ void m61915f(C2652e c2652e, MediaFormat mediaFormat) {
            c2652e.m61903r(mediaFormat);
        }

        /* renamed from: g */
        public static /* synthetic */ void m61914g(C2652e c2652e, int i) {
            c2652e.m61908m(i);
        }

        /* renamed from: h */
        public static /* synthetic */ void m61913h(C2652e c2652e, MediaCodec.CodecException codecException) {
            c2652e.m61909l(codecException);
        }

        /* renamed from: p */
        public static /* synthetic */ MediaFormat m61905p(MediaFormat mediaFormat) {
            return mediaFormat;
        }

        /* renamed from: q */
        public static /* synthetic */ void m61904q(EncoderCallback encoderCallback, final MediaFormat mediaFormat) {
            encoderCallback.onOutputConfigUpdate(new OutputConfig() { // from class: qS
                @Override // androidx.camera.video.internal.encoder.OutputConfig
                public final MediaFormat getMediaFormat() {
                    return EncoderImpl.C2652e.m61919b(mediaFormat);
                }
            });
        }

        /* renamed from: i */
        public final boolean m61912i(MediaCodec.BufferInfo bufferInfo) {
            if (this.f12137d) {
                Logger.m63178d(EncoderImpl.this.f12101a, "Drop buffer by already reach end of stream.");
                return false;
            } else if (bufferInfo.size <= 0) {
                Logger.m63178d(EncoderImpl.this.f12101a, "Drop buffer by invalid buffer size.");
                return false;
            } else if ((bufferInfo.flags & 2) != 0) {
                Logger.m63178d(EncoderImpl.this.f12101a, "Drop buffer by codec config.");
                return false;
            } else {
                VideoTimebaseConverter videoTimebaseConverter = this.f12134a;
                if (videoTimebaseConverter != null) {
                    bufferInfo.presentationTimeUs = videoTimebaseConverter.convertToUptimeUs(bufferInfo.presentationTimeUs);
                }
                long j = bufferInfo.presentationTimeUs;
                if (j <= this.f12138e) {
                    Logger.m63178d(EncoderImpl.this.f12101a, "Drop buffer by out of order buffer from MediaCodec.");
                    return false;
                }
                this.f12138e = j;
                if (!EncoderImpl.this.f12121u.contains((Range) Long.valueOf(j))) {
                    Logger.m63178d(EncoderImpl.this.f12101a, "Drop buffer by not in start-stop range.");
                    EncoderImpl encoderImpl = EncoderImpl.this;
                    if (encoderImpl.f12123w && bufferInfo.presentationTimeUs >= ((Long) encoderImpl.f12121u.getUpper()).longValue()) {
                        Future future = EncoderImpl.this.f12125y;
                        if (future != null) {
                            future.cancel(true);
                        }
                        EncoderImpl.this.f12124x = Long.valueOf(bufferInfo.presentationTimeUs);
                        EncoderImpl.this.m61976X();
                        EncoderImpl.this.f12123w = false;
                    }
                    return false;
                } else if (m61898w(bufferInfo)) {
                    Logger.m63178d(EncoderImpl.this.f12101a, "Drop buffer by pause.");
                    return false;
                } else if (EncoderImpl.this.m61952u(bufferInfo) <= this.f12139f) {
                    Logger.m63178d(EncoderImpl.this.f12101a, "Drop buffer by adjusted time is less than the last sent time.");
                    if (EncoderImpl.this.f12103c && EncoderImpl.m61999A(bufferInfo)) {
                        this.f12141h = true;
                    }
                    return false;
                } else {
                    if (!this.f12136c && !this.f12141h && EncoderImpl.this.f12103c) {
                        this.f12141h = true;
                    }
                    if (this.f12141h) {
                        if (!EncoderImpl.m61999A(bufferInfo)) {
                            Logger.m63178d(EncoderImpl.this.f12101a, "Drop buffer by not a key frame.");
                            EncoderImpl.this.m61980T();
                            return false;
                        }
                        this.f12141h = false;
                    }
                    return true;
                }
            }
        }

        /* renamed from: j */
        public final boolean m61911j(MediaCodec.BufferInfo bufferInfo) {
            if (!EncoderImpl.m61948y(bufferInfo) && !m61910k(bufferInfo)) {
                return false;
            }
            return true;
        }

        /* renamed from: k */
        public final boolean m61910k(MediaCodec.BufferInfo bufferInfo) {
            EncoderImpl encoderImpl = EncoderImpl.this;
            if (encoderImpl.f12099C && bufferInfo.presentationTimeUs > ((Long) encoderImpl.f12121u.getUpper()).longValue()) {
                return true;
            }
            return false;
        }

        /* renamed from: l */
        public final /* synthetic */ void m61909l(MediaCodec.CodecException codecException) {
            switch (C2649b.f12129a[EncoderImpl.this.f12120t.ordinal()]) {
                case 1:
                case 8:
                case 9:
                    return;
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                    EncoderImpl.this.m61950w(codecException);
                    return;
                default:
                    throw new IllegalStateException("Unknown state: " + EncoderImpl.this.f12120t);
            }
        }

        /* renamed from: m */
        public final /* synthetic */ void m61908m(int i) {
            if (this.f12142i) {
                Logger.m63171w(EncoderImpl.this.f12101a, "Receives input frame after codec is reset.");
                return;
            }
            switch (C2649b.f12129a[EncoderImpl.this.f12120t.ordinal()]) {
                case 1:
                case 8:
                case 9:
                    return;
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                    EncoderImpl.this.f12111k.offer(Integer.valueOf(i));
                    EncoderImpl.this.m61983Q();
                    return;
                default:
                    throw new IllegalStateException("Unknown state: " + EncoderImpl.this.f12120t);
            }
        }

        /* renamed from: n */
        public final /* synthetic */ void m61907n(Executor executor, final EncoderCallback encoderCallback) {
            if (EncoderImpl.this.f12120t == InternalState.ERROR) {
                return;
            }
            try {
                Objects.requireNonNull(encoderCallback);
                executor.execute(new Runnable() { // from class: oS
                    @Override // java.lang.Runnable
                    public final void run() {
                        EncoderCallback.this.onEncodeStop();
                    }
                });
            } catch (RejectedExecutionException e) {
                Logger.m63175e(EncoderImpl.this.f12101a, "Unable to post to the supplied executor.", e);
            }
        }

        /* renamed from: o */
        public final /* synthetic */ void m61906o(MediaCodec.BufferInfo bufferInfo, MediaCodec mediaCodec, int i) {
            final EncoderCallback encoderCallback;
            final Executor executor;
            if (this.f12142i) {
                Logger.m63171w(EncoderImpl.this.f12101a, "Receives frame after codec is reset.");
                return;
            }
            switch (C2649b.f12129a[EncoderImpl.this.f12120t.ordinal()]) {
                case 1:
                case 8:
                case 9:
                    return;
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                    synchronized (EncoderImpl.this.f12102b) {
                        EncoderImpl encoderImpl = EncoderImpl.this;
                        encoderCallback = encoderImpl.f12118r;
                        executor = encoderImpl.f12119s;
                    }
                    if (!this.f12135b) {
                        this.f12135b = true;
                        try {
                            Objects.requireNonNull(encoderCallback);
                            executor.execute(new Runnable() { // from class: lS
                                @Override // java.lang.Runnable
                                public final void run() {
                                    EncoderCallback.this.onEncodeStart();
                                }
                            });
                        } catch (RejectedExecutionException e) {
                            Logger.m63175e(EncoderImpl.this.f12101a, "Unable to post to the supplied executor.", e);
                        }
                    }
                    if (m61912i(bufferInfo)) {
                        if (!this.f12136c) {
                            this.f12136c = true;
                            String str = EncoderImpl.this.f12101a;
                            Logger.m63178d(str, "data timestampUs = " + bufferInfo.presentationTimeUs + ", data timebase = " + EncoderImpl.this.f12116p + ", current system uptimeMs = " + SystemClock.uptimeMillis() + ", current system realtimeMs = " + SystemClock.elapsedRealtime());
                        }
                        MediaCodec.BufferInfo m61901t = m61901t(bufferInfo);
                        this.f12139f = m61901t.presentationTimeUs;
                        try {
                            m61900u(new EncodedDataImpl(mediaCodec, i, m61901t), encoderCallback, executor);
                        } catch (MediaCodec.CodecException e2) {
                            EncoderImpl.this.m61950w(e2);
                            return;
                        }
                    } else if (i != -9999) {
                        try {
                            EncoderImpl.this.f12105e.releaseOutputBuffer(i, false);
                        } catch (MediaCodec.CodecException e3) {
                            EncoderImpl.this.m61950w(e3);
                            return;
                        }
                    }
                    if (!this.f12137d && m61911j(bufferInfo)) {
                        this.f12137d = true;
                        EncoderImpl.this.m61974Z(new Runnable() { // from class: mS
                            @Override // java.lang.Runnable
                            public final void run() {
                                EncoderImpl.C2652e.this.m61907n(executor, encoderCallback);
                            }
                        });
                        return;
                    }
                    return;
                default:
                    throw new IllegalStateException("Unknown state: " + EncoderImpl.this.f12120t);
            }
        }

        @Override // android.media.MediaCodec.Callback
        public void onError(MediaCodec mediaCodec, final MediaCodec.CodecException codecException) {
            EncoderImpl.this.f12108h.execute(new Runnable() { // from class: jS
                @Override // java.lang.Runnable
                public final void run() {
                    EncoderImpl.C2652e.m61913h(EncoderImpl.C2652e.this, codecException);
                }
            });
        }

        @Override // android.media.MediaCodec.Callback
        public void onInputBufferAvailable(MediaCodec mediaCodec, final int i) {
            EncoderImpl.this.f12108h.execute(new Runnable() { // from class: gS
                @Override // java.lang.Runnable
                public final void run() {
                    EncoderImpl.C2652e.m61914g(EncoderImpl.C2652e.this, i);
                }
            });
        }

        @Override // android.media.MediaCodec.Callback
        public void onOutputBufferAvailable(final MediaCodec mediaCodec, final int i, final MediaCodec.BufferInfo bufferInfo) {
            EncoderImpl.this.f12108h.execute(new Runnable() { // from class: iS
                @Override // java.lang.Runnable
                public final void run() {
                    EncoderImpl.C2652e.m61920a(EncoderImpl.C2652e.this, bufferInfo, mediaCodec, i);
                }
            });
        }

        @Override // android.media.MediaCodec.Callback
        public void onOutputFormatChanged(MediaCodec mediaCodec, final MediaFormat mediaFormat) {
            EncoderImpl.this.f12108h.execute(new Runnable() { // from class: kS
                @Override // java.lang.Runnable
                public final void run() {
                    EncoderImpl.C2652e.m61915f(EncoderImpl.C2652e.this, mediaFormat);
                }
            });
        }

        /* renamed from: r */
        public final /* synthetic */ void m61903r(final MediaFormat mediaFormat) {
            final EncoderCallback encoderCallback;
            Executor executor;
            if (this.f12142i) {
                Logger.m63171w(EncoderImpl.this.f12101a, "Receives onOutputFormatChanged after codec is reset.");
                return;
            }
            switch (C2649b.f12129a[EncoderImpl.this.f12120t.ordinal()]) {
                case 1:
                case 8:
                case 9:
                    return;
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                    synchronized (EncoderImpl.this.f12102b) {
                        EncoderImpl encoderImpl = EncoderImpl.this;
                        encoderCallback = encoderImpl.f12118r;
                        executor = encoderImpl.f12119s;
                    }
                    try {
                        executor.execute(new Runnable() { // from class: nS
                            @Override // java.lang.Runnable
                            public final void run() {
                                EncoderImpl.C2652e.m61904q(EncoderCallback.this, mediaFormat);
                            }
                        });
                        return;
                    } catch (RejectedExecutionException e) {
                        Logger.m63175e(EncoderImpl.this.f12101a, "Unable to post to the supplied executor.", e);
                        return;
                    }
                default:
                    throw new IllegalStateException("Unknown state: " + EncoderImpl.this.f12120t);
            }
        }

        /* renamed from: t */
        public final MediaCodec.BufferInfo m61901t(MediaCodec.BufferInfo bufferInfo) {
            boolean z;
            long m61952u = EncoderImpl.this.m61952u(bufferInfo);
            if (bufferInfo.presentationTimeUs == m61952u) {
                return bufferInfo;
            }
            if (m61952u > this.f12139f) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkState(z);
            MediaCodec.BufferInfo bufferInfo2 = new MediaCodec.BufferInfo();
            bufferInfo2.set(bufferInfo.offset, bufferInfo.size, m61952u, bufferInfo.flags);
            return bufferInfo2;
        }

        /* renamed from: u */
        public final void m61900u(final EncodedDataImpl encodedDataImpl, final EncoderCallback encoderCallback, Executor executor) {
            EncoderImpl.this.f12114n.add(encodedDataImpl);
            Futures.addCallback(encodedDataImpl.getClosedFuture(), new C2653a(encodedDataImpl), EncoderImpl.this.f12108h);
            try {
                executor.execute(new Runnable() { // from class: pS
                    @Override // java.lang.Runnable
                    public final void run() {
                        EncoderCallback.this.onEncodedData(encodedDataImpl);
                    }
                });
            } catch (RejectedExecutionException e) {
                Logger.m63175e(EncoderImpl.this.f12101a, "Unable to post to the supplied executor.", e);
                encodedDataImpl.close();
            }
        }

        /* renamed from: v */
        public void m61899v() {
            this.f12142i = true;
        }

        /* renamed from: w */
        public final boolean m61898w(MediaCodec.BufferInfo bufferInfo) {
            Executor executor;
            final EncoderCallback encoderCallback;
            EncoderImpl.this.m61972a0(bufferInfo.presentationTimeUs);
            boolean m61947z = EncoderImpl.this.m61947z(bufferInfo.presentationTimeUs);
            boolean z = this.f12140g;
            if (!z && m61947z) {
                Logger.m63178d(EncoderImpl.this.f12101a, "Switch to pause state");
                this.f12140g = true;
                synchronized (EncoderImpl.this.f12102b) {
                    EncoderImpl encoderImpl = EncoderImpl.this;
                    executor = encoderImpl.f12119s;
                    encoderCallback = encoderImpl.f12118r;
                }
                Objects.requireNonNull(encoderCallback);
                executor.execute(new Runnable() { // from class: hS
                    @Override // java.lang.Runnable
                    public final void run() {
                        EncoderCallback.this.onEncodePaused();
                    }
                });
                EncoderImpl encoderImpl2 = EncoderImpl.this;
                if (encoderImpl2.f12120t == InternalState.PAUSED && ((encoderImpl2.f12103c || DeviceQuirks.get(AudioEncoderIgnoresInputTimestampQuirk.class) == null) && (!EncoderImpl.this.f12103c || DeviceQuirks.get(VideoEncoderSuspendDoesNotIncludeSuspendTimeQuirk.class) == null))) {
                    Encoder.EncoderInput encoderInput = EncoderImpl.this.f12106f;
                    if (encoderInput instanceof C2651d) {
                        ((C2651d) encoderInput).m61921v(false);
                    }
                    EncoderImpl.this.m61978V(true);
                }
                EncoderImpl.this.f12124x = Long.valueOf(bufferInfo.presentationTimeUs);
                EncoderImpl encoderImpl3 = EncoderImpl.this;
                if (encoderImpl3.f12123w) {
                    Future future = encoderImpl3.f12125y;
                    if (future != null) {
                        future.cancel(true);
                    }
                    EncoderImpl.this.m61976X();
                    EncoderImpl.this.f12123w = false;
                }
            } else if (z && !m61947z) {
                Logger.m63178d(EncoderImpl.this.f12101a, "Switch to resume state");
                this.f12140g = false;
                if (EncoderImpl.this.f12103c && !EncoderImpl.m61999A(bufferInfo)) {
                    this.f12141h = true;
                }
            }
            return this.f12140g;
        }
    }

    /* renamed from: androidx.camera.video.internal.encoder.EncoderImpl$f */
    /* loaded from: classes.dex */
    public class C2654f implements Encoder.SurfaceInput {

        /* renamed from: b */
        public Surface f12147b;

        /* renamed from: d */
        public Encoder.SurfaceInput.OnSurfaceUpdateListener f12149d;

        /* renamed from: e */
        public Executor f12150e;

        /* renamed from: a */
        public final Object f12146a = new Object();

        /* renamed from: c */
        public final Set f12148c = new HashSet();

        public C2654f() {
            EncoderImpl.this = r1;
        }

        /* renamed from: c */
        public final void m61894c(Executor executor, final Encoder.SurfaceInput.OnSurfaceUpdateListener onSurfaceUpdateListener, final Surface surface) {
            try {
                executor.execute(new Runnable() { // from class: rS
                    @Override // java.lang.Runnable
                    public final void run() {
                        Encoder.SurfaceInput.OnSurfaceUpdateListener.this.onSurfaceUpdate(surface);
                    }
                });
            } catch (RejectedExecutionException e) {
                Logger.m63175e(EncoderImpl.this.f12101a, "Unable to post to the supplied executor.", e);
            }
        }

        /* renamed from: d */
        public void m61893d() {
            Surface surface;
            HashSet<Surface> hashSet;
            synchronized (this.f12146a) {
                surface = this.f12147b;
                this.f12147b = null;
                hashSet = new HashSet(this.f12148c);
                this.f12148c.clear();
            }
            if (surface != null) {
                surface.release();
            }
            for (Surface surface2 : hashSet) {
                surface2.release();
            }
        }

        /* renamed from: e */
        public void m61892e() {
            Surface createInputSurface;
            Encoder.SurfaceInput.OnSurfaceUpdateListener onSurfaceUpdateListener;
            Executor executor;
            EncoderNotUsePersistentInputSurfaceQuirk encoderNotUsePersistentInputSurfaceQuirk = (EncoderNotUsePersistentInputSurfaceQuirk) DeviceQuirks.get(EncoderNotUsePersistentInputSurfaceQuirk.class);
            synchronized (this.f12146a) {
                try {
                    if (encoderNotUsePersistentInputSurfaceQuirk == null) {
                        if (this.f12147b == null) {
                            createInputSurface = C2650c.m61944a();
                            this.f12147b = createInputSurface;
                        } else {
                            createInputSurface = null;
                        }
                        C2650c.m61943b(EncoderImpl.this.f12105e, this.f12147b);
                    } else {
                        Surface surface = this.f12147b;
                        if (surface != null) {
                            this.f12148c.add(surface);
                        }
                        createInputSurface = EncoderImpl.this.f12105e.createInputSurface();
                        this.f12147b = createInputSurface;
                    }
                    onSurfaceUpdateListener = this.f12149d;
                    executor = this.f12150e;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (createInputSurface != null && onSurfaceUpdateListener != null && executor != null) {
                m61894c(executor, onSurfaceUpdateListener, createInputSurface);
            }
        }

        @Override // androidx.camera.video.internal.encoder.Encoder.SurfaceInput
        public void setOnSurfaceUpdateListener(Executor executor, Encoder.SurfaceInput.OnSurfaceUpdateListener onSurfaceUpdateListener) {
            Surface surface;
            synchronized (this.f12146a) {
                this.f12149d = (Encoder.SurfaceInput.OnSurfaceUpdateListener) Preconditions.checkNotNull(onSurfaceUpdateListener);
                this.f12150e = (Executor) Preconditions.checkNotNull(executor);
                surface = this.f12147b;
            }
            if (surface != null) {
                m61894c(executor, onSurfaceUpdateListener, surface);
            }
        }
    }

    public EncoderImpl(@NonNull Executor executor, @NonNull EncoderConfig encoderConfig) throws InvalidConfigException {
        EncoderFinder encoderFinder = new EncoderFinder();
        this.f12100D = encoderFinder;
        Preconditions.checkNotNull(executor);
        Preconditions.checkNotNull(encoderConfig);
        this.f12108h = CameraXExecutors.newSequentialExecutor(executor);
        if (encoderConfig instanceof AudioEncoderConfig) {
            this.f12101a = "AudioEncoder";
            this.f12103c = false;
            this.f12106f = new C2651d();
        } else if (encoderConfig instanceof VideoEncoderConfig) {
            this.f12101a = "VideoEncoder";
            this.f12103c = true;
            this.f12106f = new C2654f();
        } else {
            throw new InvalidConfigException("Unknown encoder config type");
        }
        Timebase inputTimebase = encoderConfig.getInputTimebase();
        this.f12116p = inputTimebase;
        String str = this.f12101a;
        Logger.m63178d(str, "mInputTimebase = " + inputTimebase);
        MediaFormat mediaFormat = encoderConfig.toMediaFormat();
        this.f12104d = mediaFormat;
        String str2 = this.f12101a;
        Logger.m63178d(str2, "mMediaFormat = " + mediaFormat);
        MediaCodec findEncoder = encoderFinder.findEncoder(mediaFormat);
        this.f12105e = findEncoder;
        String str3 = this.f12101a;
        Logger.m63173i(str3, "Selected encoder: " + findEncoder.getName());
        EncoderInfo m61954s = m61954s(this.f12103c, findEncoder.getCodecInfo(), encoderConfig.getMimeType());
        this.f12107g = m61954s;
        if (this.f12103c) {
            m61955r((VideoEncoderInfo) m61954s, mediaFormat);
        }
        try {
            m61979U();
            final AtomicReference atomicReference = new AtomicReference();
            this.f12109i = Futures.nonCancellationPropagating(CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: QR
                @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
                public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                    return EncoderImpl.m61959n(atomicReference, completer);
                }
            }));
            this.f12110j = (CallbackToFutureAdapter.Completer) Preconditions.checkNotNull((CallbackToFutureAdapter.Completer) atomicReference.get());
            m61977W(InternalState.CONFIGURED);
        } catch (MediaCodec.CodecException e) {
            throw new InvalidConfigException(e);
        }
    }

    /* renamed from: A */
    public static boolean m61999A(MediaCodec.BufferInfo bufferInfo) {
        if ((bufferInfo.flags & 1) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: G */
    public static /* synthetic */ void m61993G(EncoderCallback encoderCallback, int i, String str, Throwable th2) {
        encoderCallback.onEncodeError(new EncodeException(i, str, th2));
    }

    /* renamed from: a */
    public static /* synthetic */ void m61973a(EncoderImpl encoderImpl) {
        encoderImpl.m61987M();
    }

    /* renamed from: b */
    public static /* synthetic */ void m61971b(EncoderImpl encoderImpl, C18271Pe0 c18271Pe0) {
        encoderImpl.m61995E(c18271Pe0);
    }

    /* renamed from: c */
    public static /* synthetic */ void m61970c(EncoderImpl encoderImpl) {
        encoderImpl.m61986N();
    }

    /* renamed from: d */
    public static /* synthetic */ void m61969d(EncoderImpl encoderImpl, List list, Runnable runnable) {
        encoderImpl.m61984P(list, runnable);
    }

    /* renamed from: e */
    public static /* synthetic */ void m61968e(EncoderImpl encoderImpl) {
        encoderImpl.m61990J();
    }

    /* renamed from: f */
    public static /* synthetic */ void m61967f(EncoderImpl encoderImpl, int i, String str, Throwable th2) {
        encoderImpl.m61996D(i, str, th2);
    }

    /* renamed from: g */
    public static /* synthetic */ void m61966g(EncoderImpl encoderImpl, long j) {
        encoderImpl.m61992H(j);
    }

    /* renamed from: h */
    public static /* synthetic */ void m61965h(EncoderCallback encoderCallback, int i, String str, Throwable th2) {
        m61993G(encoderCallback, i, str, th2);
    }

    /* renamed from: i */
    public static /* synthetic */ void m61964i(EncoderImpl encoderImpl) {
        encoderImpl.m61975Y();
    }

    /* renamed from: j */
    public static /* synthetic */ void m61963j(EncoderImpl encoderImpl) {
        encoderImpl.m61989K();
    }

    /* renamed from: k */
    public static /* synthetic */ void m61962k(EncoderImpl encoderImpl, CallbackToFutureAdapter.Completer completer) {
        encoderImpl.m61997C(completer);
    }

    /* renamed from: l */
    public static /* synthetic */ void m61961l(EncoderImpl encoderImpl, long j, long j2) {
        encoderImpl.m61985O(j, j2);
    }

    /* renamed from: m */
    public static /* synthetic */ void m61960m(EncoderImpl encoderImpl, long j) {
        encoderImpl.m61988L(j);
    }

    /* renamed from: n */
    public static /* synthetic */ Object m61959n(AtomicReference atomicReference, CallbackToFutureAdapter.Completer completer) {
        return atomicReference.set(completer);
    }

    /* renamed from: o */
    public static /* synthetic */ Object m61958o(AtomicReference atomicReference, CallbackToFutureAdapter.Completer completer) {
        return atomicReference.set(completer);
    }

    /* renamed from: p */
    public static /* synthetic */ void m61957p(EncoderImpl encoderImpl) {
        encoderImpl.m61991I();
    }

    /* renamed from: s */
    public static EncoderInfo m61954s(boolean z, MediaCodecInfo mediaCodecInfo, String str) {
        if (z) {
            return new VideoEncoderInfoImpl(mediaCodecInfo, str);
        }
        return new AudioEncoderInfoImpl(mediaCodecInfo, str);
    }

    /* renamed from: y */
    public static boolean m61948y(MediaCodec.BufferInfo bufferInfo) {
        if ((bufferInfo.flags & 4) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: C */
    public final /* synthetic */ void m61997C(CallbackToFutureAdapter.Completer completer) {
        this.f12112l.remove(completer);
    }

    /* renamed from: E */
    public final /* synthetic */ void m61995E(C18271Pe0 c18271Pe0) {
        this.f12113m.remove(c18271Pe0);
    }

    /* renamed from: H */
    public final /* synthetic */ void m61992H(long j) {
        switch (C2649b.f12129a[this.f12120t.ordinal()]) {
            case 1:
            case 3:
            case 4:
            case 5:
            case 8:
                return;
            case 2:
                String str = this.f12101a;
                Logger.m63178d(str, "Pause on " + DebugUtils.readableUs(j));
                this.f12115o.addLast(Range.create(Long.valueOf(j), Long.MAX_VALUE));
                m61977W(InternalState.PAUSED);
                return;
            case 6:
                m61977W(InternalState.PENDING_START_PAUSED);
                return;
            case 7:
            case 9:
                throw new IllegalStateException("Encoder is released");
            default:
                throw new IllegalStateException("Unknown state: " + this.f12120t);
        }
    }

    /* renamed from: I */
    public final /* synthetic */ void m61991I() {
        switch (C2649b.f12129a[this.f12120t.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 8:
                m61981S();
                return;
            case 4:
            case 5:
            case 6:
                m61977W(InternalState.PENDING_RELEASE);
                return;
            case 7:
            case 9:
                return;
            default:
                throw new IllegalStateException("Unknown state: " + this.f12120t);
        }
    }

    /* renamed from: J */
    public final /* synthetic */ void m61990J() {
        int i = C2649b.f12129a[this.f12120t.ordinal()];
        if (i != 2) {
            if (i == 7 || i == 9) {
                throw new IllegalStateException("Encoder is released");
            }
            return;
        }
        m61980T();
    }

    /* renamed from: K */
    public final /* synthetic */ void m61989K() {
        this.f12098B = true;
        if (this.f12097A) {
            this.f12105e.stop();
            m61979U();
        }
    }

    /* renamed from: L */
    public final /* synthetic */ void m61988L(long j) {
        boolean z;
        switch (C2649b.f12129a[this.f12120t.ordinal()]) {
            case 1:
                this.f12124x = null;
                String str = this.f12101a;
                Logger.m63178d(str, "Start on " + DebugUtils.readableUs(j));
                try {
                    if (this.f12097A) {
                        m61979U();
                    }
                    this.f12121u = Range.create(Long.valueOf(j), Long.MAX_VALUE);
                    this.f12105e.start();
                    Encoder.EncoderInput encoderInput = this.f12106f;
                    if (encoderInput instanceof C2651d) {
                        ((C2651d) encoderInput).m61921v(true);
                    }
                    m61977W(InternalState.STARTED);
                    return;
                } catch (MediaCodec.CodecException e) {
                    m61950w(e);
                    return;
                }
            case 2:
            case 6:
            case 8:
                return;
            case 3:
                this.f12124x = null;
                Range range = (Range) this.f12115o.removeLast();
                if (range != null && ((Long) range.getUpper()).longValue() == Long.MAX_VALUE) {
                    z = true;
                } else {
                    z = false;
                }
                Preconditions.checkState(z, "There should be a \"pause\" before \"resume\"");
                Long l = (Long) range.getLower();
                long longValue = l.longValue();
                this.f12115o.addLast(Range.create(l, Long.valueOf(j)));
                String str2 = this.f12101a;
                Logger.m63178d(str2, "Resume on " + DebugUtils.readableUs(j) + "\nPaused duration = " + DebugUtils.readableUs(j - longValue));
                if ((this.f12103c || DeviceQuirks.get(AudioEncoderIgnoresInputTimestampQuirk.class) == null) && (!this.f12103c || DeviceQuirks.get(VideoEncoderSuspendDoesNotIncludeSuspendTimeQuirk.class) == null)) {
                    m61978V(false);
                    Encoder.EncoderInput encoderInput2 = this.f12106f;
                    if (encoderInput2 instanceof C2651d) {
                        ((C2651d) encoderInput2).m61921v(true);
                    }
                }
                if (this.f12103c) {
                    m61980T();
                }
                m61977W(InternalState.STARTED);
                return;
            case 4:
            case 5:
                m61977W(InternalState.PENDING_START);
                return;
            case 7:
            case 9:
                throw new IllegalStateException("Encoder is released");
            default:
                throw new IllegalStateException("Unknown state: " + this.f12120t);
        }
    }

    /* renamed from: M */
    public final /* synthetic */ void m61987M() {
        if (this.f12123w) {
            Logger.m63171w(this.f12101a, "The data didn't reach the expected timestamp before timeout, stop the codec.");
            this.f12124x = null;
            m61976X();
            this.f12123w = false;
        }
    }

    /* renamed from: N */
    public final /* synthetic */ void m61986N() {
        this.f12108h.execute(new Runnable() { // from class: ER
            @Override // java.lang.Runnable
            public final void run() {
                EncoderImpl.m61973a(EncoderImpl.this);
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00af  */
    /* renamed from: O */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* synthetic */ void m61985O(long r8, long r10) {
        /*
            r7 = this;
            int[] r0 = androidx.camera.video.internal.encoder.EncoderImpl.C2649b.f12129a
            androidx.camera.video.internal.encoder.EncoderImpl$InternalState r1 = r7.f12120t
            int r1 = r1.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 1: goto Lbf;
                case 2: goto L35;
                case 3: goto L35;
                case 4: goto Lbf;
                case 5: goto L2e;
                case 6: goto L2e;
                case 7: goto L26;
                case 8: goto Lbf;
                case 9: goto L26;
                default: goto Ld;
            }
        Ld:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "Unknown state: "
            r9.append(r10)
            androidx.camera.video.internal.encoder.EncoderImpl$InternalState r10 = r7.f12120t
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            throw r8
        L26:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "Encoder is released"
            r8.<init>(r9)
            throw r8
        L2e:
            androidx.camera.video.internal.encoder.EncoderImpl$InternalState r8 = androidx.camera.video.internal.encoder.EncoderImpl.InternalState.CONFIGURED
            r7.m61977W(r8)
            goto Lbf
        L35:
            androidx.camera.video.internal.encoder.EncoderImpl$InternalState r0 = r7.f12120t
            androidx.camera.video.internal.encoder.EncoderImpl$InternalState r1 = androidx.camera.video.internal.encoder.EncoderImpl.InternalState.STOPPING
            r7.m61977W(r1)
            android.util.Range r1 = r7.f12121u
            java.lang.Comparable r1 = r1.getLower()
            java.lang.Long r1 = (java.lang.Long) r1
            long r2 = r1.longValue()
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 == 0) goto Lb7
            r4 = -1
            int r6 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r6 != 0) goto L58
            goto L63
        L58:
            int r4 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r4 >= 0) goto L64
            java.lang.String r8 = r7.f12101a
            java.lang.String r9 = "The expected stop time is less than the start time. Use current time as stop time."
            androidx.camera.core.Logger.m63171w(r8, r9)
        L63:
            r8 = r10
        L64:
            int r10 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r10 < 0) goto Laf
            java.lang.Long r10 = java.lang.Long.valueOf(r8)
            android.util.Range r10 = android.util.Range.create(r1, r10)
            r7.f12121u = r10
            java.lang.String r10 = r7.f12101a
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r1 = "Stop on "
            r11.append(r1)
            java.lang.String r8 = androidx.camera.video.internal.DebugUtils.readableUs(r8)
            r11.append(r8)
            java.lang.String r8 = r11.toString()
            androidx.camera.core.Logger.m63178d(r10, r8)
            androidx.camera.video.internal.encoder.EncoderImpl$InternalState r8 = androidx.camera.video.internal.encoder.EncoderImpl.InternalState.PAUSED
            if (r0 != r8) goto L98
            java.lang.Long r8 = r7.f12124x
            if (r8 == 0) goto L98
            r7.m61976X()
            goto Lbf
        L98:
            r8 = 1
            r7.f12123w = r8
            java.util.concurrent.ScheduledExecutorService r8 = androidx.camera.core.impl.utils.executor.CameraXExecutors.mainThreadExecutor()
            SR r9 = new SR
            r9.<init>()
            r10 = 1000(0x3e8, double:4.94E-321)
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS
            java.util.concurrent.ScheduledFuture r8 = r8.schedule(r9, r10, r0)
            r7.f12125y = r8
            goto Lbf
        Laf:
            java.lang.AssertionError r8 = new java.lang.AssertionError
            java.lang.String r9 = "The start time should be before the stop time."
            r8.<init>(r9)
            throw r8
        Lb7:
            java.lang.AssertionError r8 = new java.lang.AssertionError
            java.lang.String r9 = "There should be a \"start\" before \"stop\""
            r8.<init>(r9)
            throw r8
        Lbf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.video.internal.encoder.EncoderImpl.m61985O(long, long):void");
    }

    /* renamed from: P */
    public final /* synthetic */ void m61984P(List list, Runnable runnable) {
        if (this.f12120t != InternalState.ERROR) {
            if (!list.isEmpty()) {
                Logger.m63178d(this.f12101a, "encoded data and input buffers are returned");
            }
            if ((this.f12106f instanceof C2654f) && !this.f12098B) {
                this.f12105e.flush();
                this.f12097A = true;
            } else {
                this.f12105e.stop();
            }
        }
        if (runnable != null) {
            runnable.run();
        }
        m61949x();
    }

    /* renamed from: Q */
    public void m61983Q() {
        while (!this.f12112l.isEmpty() && !this.f12111k.isEmpty()) {
            CallbackToFutureAdapter.Completer completer = (CallbackToFutureAdapter.Completer) this.f12112l.poll();
            Objects.requireNonNull(completer);
            Integer num = (Integer) this.f12111k.poll();
            Objects.requireNonNull(num);
            try {
                final C18271Pe0 c18271Pe0 = new C18271Pe0(this.f12105e, num.intValue());
                if (completer.set(c18271Pe0)) {
                    this.f12113m.add(c18271Pe0);
                    c18271Pe0.getTerminationFuture().addListener(new Runnable() { // from class: HR
                        @Override // java.lang.Runnable
                        public final void run() {
                            EncoderImpl.m61971b(EncoderImpl.this, c18271Pe0);
                        }
                    }, this.f12108h);
                } else {
                    c18271Pe0.cancel();
                }
            } catch (MediaCodec.CodecException e) {
                m61950w(e);
                return;
            }
        }
    }

    /* renamed from: R */
    public void m61996D(final int i, final String str, final Throwable th2) {
        final EncoderCallback encoderCallback;
        Executor executor;
        synchronized (this.f12102b) {
            encoderCallback = this.f12118r;
            executor = this.f12119s;
        }
        try {
            executor.execute(new Runnable() { // from class: TR
                @Override // java.lang.Runnable
                public final void run() {
                    EncoderImpl.m61965h(EncoderCallback.this, i, str, th2);
                }
            });
        } catch (RejectedExecutionException e) {
            Logger.m63175e(this.f12101a, "Unable to post to the supplied executor.", e);
        }
    }

    /* renamed from: S */
    public final void m61981S() {
        if (this.f12097A) {
            this.f12105e.stop();
            this.f12097A = false;
        }
        this.f12105e.release();
        Encoder.EncoderInput encoderInput = this.f12106f;
        if (encoderInput instanceof C2654f) {
            ((C2654f) encoderInput).m61893d();
        }
        m61977W(InternalState.RELEASED);
        this.f12110j.set(null);
    }

    /* renamed from: T */
    public void m61980T() {
        Bundle bundle = new Bundle();
        bundle.putInt("request-sync", 0);
        this.f12105e.setParameters(bundle);
    }

    /* renamed from: U */
    public final void m61979U() {
        this.f12121u = f12096E;
        this.f12122v = 0L;
        this.f12115o.clear();
        this.f12111k.clear();
        for (CallbackToFutureAdapter.Completer completer : this.f12112l) {
            completer.setCancelled();
        }
        this.f12112l.clear();
        this.f12105e.reset();
        this.f12097A = false;
        this.f12098B = false;
        this.f12099C = false;
        this.f12123w = false;
        Future future = this.f12125y;
        if (future != null) {
            future.cancel(true);
            this.f12125y = null;
        }
        C2652e c2652e = this.f12126z;
        if (c2652e != null) {
            c2652e.m61899v();
        }
        C2652e c2652e2 = new C2652e();
        this.f12126z = c2652e2;
        this.f12105e.setCallback(c2652e2);
        this.f12105e.configure(this.f12104d, (Surface) null, (MediaCrypto) null, 1);
        Encoder.EncoderInput encoderInput = this.f12106f;
        if (encoderInput instanceof C2654f) {
            ((C2654f) encoderInput).m61892e();
        }
    }

    /* renamed from: V */
    public void m61978V(boolean z) {
        Bundle bundle = new Bundle();
        bundle.putInt("drop-input-frames", z ? 1 : 0);
        this.f12105e.setParameters(bundle);
    }

    /* renamed from: W */
    public final void m61977W(InternalState internalState) {
        if (this.f12120t == internalState) {
            return;
        }
        String str = this.f12101a;
        Logger.m63178d(str, "Transitioning encoder internal state: " + this.f12120t + " --> " + internalState);
        this.f12120t = internalState;
    }

    /* renamed from: X */
    public void m61976X() {
        Encoder.EncoderInput encoderInput = this.f12106f;
        if (encoderInput instanceof C2651d) {
            ((C2651d) encoderInput).m61921v(false);
            ArrayList arrayList = new ArrayList();
            for (InputBuffer inputBuffer : this.f12113m) {
                arrayList.add(inputBuffer.getTerminationFuture());
            }
            Futures.successfulAsList(arrayList).addListener(new Runnable() { // from class: GR
                @Override // java.lang.Runnable
                public final void run() {
                    EncoderImpl.m61964i(EncoderImpl.this);
                }
            }, this.f12108h);
        } else if (encoderInput instanceof C2654f) {
            try {
                this.f12105e.signalEndOfInputStream();
                this.f12099C = true;
            } catch (MediaCodec.CodecException e) {
                m61950w(e);
            }
        }
    }

    /* renamed from: Y */
    public final void m61975Y() {
        Futures.addCallback(m61956q(), new C2647a(), this.f12108h);
    }

    /* renamed from: Z */
    public void m61974Z(final Runnable runnable) {
        final ArrayList arrayList = new ArrayList();
        for (EncodedDataImpl encodedDataImpl : this.f12114n) {
            arrayList.add(encodedDataImpl.getClosedFuture());
        }
        for (InputBuffer inputBuffer : this.f12113m) {
            arrayList.add(inputBuffer.getTerminationFuture());
        }
        if (!arrayList.isEmpty()) {
            String str = this.f12101a;
            Logger.m63178d(str, "Waiting for resources to return. encoded data = " + this.f12114n.size() + ", input buffers = " + this.f12113m.size());
        }
        Futures.successfulAsList(arrayList).addListener(new Runnable() { // from class: FR
            @Override // java.lang.Runnable
            public final void run() {
                EncoderImpl.m61969d(EncoderImpl.this, arrayList, runnable);
            }
        }, this.f12108h);
    }

    /* renamed from: a0 */
    public void m61972a0(long j) {
        while (!this.f12115o.isEmpty()) {
            Range range = (Range) this.f12115o.getFirst();
            if (j > ((Long) range.getUpper()).longValue()) {
                this.f12115o.removeFirst();
                this.f12122v += ((Long) range.getUpper()).longValue() - ((Long) range.getLower()).longValue();
                Logger.m63178d(this.f12101a, "Total paused duration = " + DebugUtils.readableUs(this.f12122v));
            } else {
                return;
            }
        }
    }

    @Override // androidx.camera.video.internal.encoder.Encoder
    public int getConfiguredBitrate() {
        if (this.f12104d.containsKey("bitrate")) {
            return this.f12104d.getInteger("bitrate");
        }
        return 0;
    }

    @Override // androidx.camera.video.internal.encoder.Encoder
    @NonNull
    public EncoderInfo getEncoderInfo() {
        return this.f12107g;
    }

    @Override // androidx.camera.video.internal.encoder.Encoder
    @NonNull
    public Encoder.EncoderInput getInput() {
        return this.f12106f;
    }

    @Override // androidx.camera.video.internal.encoder.Encoder
    @NonNull
    public ListenableFuture<Void> getReleasedFuture() {
        return this.f12109i;
    }

    @Override // androidx.camera.video.internal.encoder.Encoder
    public void pause() {
        final long m61953t = m61953t();
        this.f12108h.execute(new Runnable() { // from class: DR
            @Override // java.lang.Runnable
            public final void run() {
                EncoderImpl.m61966g(EncoderImpl.this, m61953t);
            }
        });
    }

    /* renamed from: q */
    public ListenableFuture m61956q() {
        switch (C2649b.f12129a[this.f12120t.ordinal()]) {
            case 1:
                return Futures.immediateFailedFuture(new IllegalStateException("Encoder is not started yet."));
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                final AtomicReference atomicReference = new AtomicReference();
                ListenableFuture future = CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: IR
                    @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
                    public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                        return EncoderImpl.m61958o(atomicReference, completer);
                    }
                });
                final CallbackToFutureAdapter.Completer completer = (CallbackToFutureAdapter.Completer) Preconditions.checkNotNull((CallbackToFutureAdapter.Completer) atomicReference.get());
                this.f12112l.offer(completer);
                completer.addCancellationListener(new Runnable() { // from class: JR
                    @Override // java.lang.Runnable
                    public final void run() {
                        EncoderImpl.m61962k(EncoderImpl.this, completer);
                    }
                }, this.f12108h);
                m61983Q();
                return future;
            case 8:
                return Futures.immediateFailedFuture(new IllegalStateException("Encoder is in error state."));
            case 9:
                return Futures.immediateFailedFuture(new IllegalStateException("Encoder is released."));
            default:
                throw new IllegalStateException("Unknown state: " + this.f12120t);
        }
    }

    /* renamed from: r */
    public final void m61955r(VideoEncoderInfo videoEncoderInfo, MediaFormat mediaFormat) {
        Preconditions.checkState(this.f12103c);
        if (mediaFormat.containsKey("bitrate")) {
            int integer = mediaFormat.getInteger("bitrate");
            int intValue = videoEncoderInfo.getSupportedBitrateRange().clamp(Integer.valueOf(integer)).intValue();
            if (integer != intValue) {
                mediaFormat.setInteger("bitrate", intValue);
                String str = this.f12101a;
                Logger.m63178d(str, "updated bitrate from " + integer + " to " + intValue);
            }
        }
    }

    @Override // androidx.camera.video.internal.encoder.Encoder
    public void release() {
        this.f12108h.execute(new Runnable() { // from class: KR
            @Override // java.lang.Runnable
            public final void run() {
                EncoderImpl.m61957p(EncoderImpl.this);
            }
        });
    }

    @Override // androidx.camera.video.internal.encoder.Encoder
    public void requestKeyFrame() {
        this.f12108h.execute(new Runnable() { // from class: MR
            @Override // java.lang.Runnable
            public final void run() {
                EncoderImpl.m61968e(EncoderImpl.this);
            }
        });
    }

    @Override // androidx.camera.video.internal.encoder.Encoder
    public void setEncoderCallback(@NonNull EncoderCallback encoderCallback, @NonNull Executor executor) {
        synchronized (this.f12102b) {
            this.f12118r = encoderCallback;
            this.f12119s = executor;
        }
    }

    public void signalSourceStopped() {
        this.f12108h.execute(new Runnable() { // from class: NR
            @Override // java.lang.Runnable
            public final void run() {
                EncoderImpl.m61963j(EncoderImpl.this);
            }
        });
    }

    @Override // androidx.camera.video.internal.encoder.Encoder
    public void start() {
        final long m61953t = m61953t();
        this.f12108h.execute(new Runnable() { // from class: OR
            @Override // java.lang.Runnable
            public final void run() {
                EncoderImpl.m61960m(EncoderImpl.this, m61953t);
            }
        });
    }

    @Override // androidx.camera.video.internal.encoder.Encoder
    public void stop() {
        stop(-1L);
    }

    /* renamed from: t */
    public long m61953t() {
        return this.f12117q.uptimeUs();
    }

    /* renamed from: u */
    public long m61952u(MediaCodec.BufferInfo bufferInfo) {
        long j = this.f12122v;
        if (j > 0) {
            return bufferInfo.presentationTimeUs - j;
        }
        return bufferInfo.presentationTimeUs;
    }

    /* renamed from: v */
    public void m61951v(final int i, final String str, final Throwable th2) {
        switch (C2649b.f12129a[this.f12120t.ordinal()]) {
            case 1:
                m61996D(i, str, th2);
                m61979U();
                return;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                m61977W(InternalState.ERROR);
                m61974Z(new Runnable() { // from class: RR
                    @Override // java.lang.Runnable
                    public final void run() {
                        EncoderImpl.m61967f(EncoderImpl.this, i, str, th2);
                    }
                });
                return;
            case 8:
                String str2 = this.f12101a;
                Logger.m63170w(str2, "Get more than one error: " + str + "(" + i + ")", th2);
                return;
            default:
                return;
        }
    }

    /* renamed from: w */
    public void m61950w(MediaCodec.CodecException codecException) {
        m61951v(1, codecException.getMessage(), codecException);
    }

    /* renamed from: x */
    public void m61949x() {
        InternalState internalState = this.f12120t;
        if (internalState == InternalState.PENDING_RELEASE) {
            m61981S();
            return;
        }
        if (!this.f12097A) {
            m61979U();
        }
        m61977W(InternalState.CONFIGURED);
        if (internalState == InternalState.PENDING_START || internalState == InternalState.PENDING_START_PAUSED) {
            start();
            if (internalState == InternalState.PENDING_START_PAUSED) {
                pause();
            }
        }
    }

    /* renamed from: z */
    public boolean m61947z(long j) {
        for (Range range : this.f12115o) {
            if (range.contains((Range) Long.valueOf(j))) {
                return true;
            }
            if (j < ((Long) range.getLower()).longValue()) {
                break;
            }
        }
        return false;
    }

    @Override // androidx.camera.video.internal.encoder.Encoder
    public void stop(final long j) {
        final long m61953t = m61953t();
        this.f12108h.execute(new Runnable() { // from class: PR
            @Override // java.lang.Runnable
            public final void run() {
                EncoderImpl.m61961l(EncoderImpl.this, j, m61953t);
            }
        });
    }
}