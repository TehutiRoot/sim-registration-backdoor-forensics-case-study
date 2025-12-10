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
    public static final Range f12008E = Range.create(Long.MAX_VALUE, Long.MAX_VALUE);

    /* renamed from: D */
    public final EncoderFinder f12012D;

    /* renamed from: a */
    public final String f12013a;

    /* renamed from: c */
    public final boolean f12015c;

    /* renamed from: d */
    public final MediaFormat f12016d;

    /* renamed from: e */
    public final MediaCodec f12017e;

    /* renamed from: f */
    public final Encoder.EncoderInput f12018f;

    /* renamed from: g */
    public final EncoderInfo f12019g;

    /* renamed from: h */
    public final Executor f12020h;

    /* renamed from: i */
    public final ListenableFuture f12021i;

    /* renamed from: j */
    public final CallbackToFutureAdapter.Completer f12022j;

    /* renamed from: p */
    public final Timebase f12028p;

    /* renamed from: t */
    public InternalState f12032t;

    /* renamed from: b */
    public final Object f12014b = new Object();

    /* renamed from: k */
    public final Queue f12023k = new ArrayDeque();

    /* renamed from: l */
    public final Queue f12024l = new ArrayDeque();

    /* renamed from: m */
    public final Set f12025m = new HashSet();

    /* renamed from: n */
    public final Set f12026n = new HashSet();

    /* renamed from: o */
    public final Deque f12027o = new ArrayDeque();

    /* renamed from: q */
    public final TimeProvider f12029q = new SystemTimeProvider();

    /* renamed from: r */
    public EncoderCallback f12030r = EncoderCallback.EMPTY;

    /* renamed from: s */
    public Executor f12031s = CameraXExecutors.directExecutor();

    /* renamed from: u */
    public Range f12033u = f12008E;

    /* renamed from: v */
    public long f12034v = 0;

    /* renamed from: w */
    public boolean f12035w = false;

    /* renamed from: x */
    public Long f12036x = null;

    /* renamed from: y */
    public Future f12037y = null;

    /* renamed from: z */
    public C2670e f12038z = null;

    /* renamed from: A */
    public boolean f12009A = false;

    /* renamed from: B */
    public boolean f12010B = false;

    /* renamed from: C */
    public boolean f12011C = false;

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
    public class C2665a implements FutureCallback {

        /* renamed from: androidx.camera.video.internal.encoder.EncoderImpl$a$a */
        /* loaded from: classes.dex */
        public class C2666a implements FutureCallback {
            public C2666a() {
                C2665a.this = r1;
            }

            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            /* renamed from: a */
            public void onSuccess(Void r1) {
            }

            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public void onFailure(Throwable th2) {
                if (th2 instanceof MediaCodec.CodecException) {
                    EncoderImpl.this.m62002w((MediaCodec.CodecException) th2);
                } else {
                    EncoderImpl.this.m62003v(0, th2.getMessage(), th2);
                }
            }
        }

        public C2665a() {
            EncoderImpl.this = r1;
        }

        @Override // androidx.camera.core.impl.utils.futures.FutureCallback
        /* renamed from: a */
        public void onSuccess(InputBuffer inputBuffer) {
            inputBuffer.setPresentationTimeUs(EncoderImpl.this.m62005t());
            inputBuffer.setEndOfStream(true);
            inputBuffer.submit();
            Futures.addCallback(inputBuffer.getTerminationFuture(), new C2666a(), EncoderImpl.this.f12020h);
        }

        @Override // androidx.camera.core.impl.utils.futures.FutureCallback
        public void onFailure(Throwable th2) {
            EncoderImpl.this.m62003v(0, "Unable to acquire InputBuffer.", th2);
        }
    }

    /* renamed from: androidx.camera.video.internal.encoder.EncoderImpl$b */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C2667b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f12041a;

        static {
            int[] iArr = new int[InternalState.values().length];
            f12041a = iArr;
            try {
                iArr[InternalState.CONFIGURED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f12041a[InternalState.STARTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f12041a[InternalState.PAUSED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f12041a[InternalState.STOPPING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f12041a[InternalState.PENDING_START_PAUSED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f12041a[InternalState.PENDING_START.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f12041a[InternalState.PENDING_RELEASE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f12041a[InternalState.ERROR.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f12041a[InternalState.RELEASED.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    /* renamed from: androidx.camera.video.internal.encoder.EncoderImpl$c */
    /* loaded from: classes.dex */
    public static class C2668c {
        @NonNull
        @DoNotInline
        /* renamed from: a */
        public static Surface m61996a() {
            Surface createPersistentInputSurface;
            createPersistentInputSurface = MediaCodec.createPersistentInputSurface();
            return createPersistentInputSurface;
        }

        @DoNotInline
        /* renamed from: b */
        public static void m61995b(@NonNull MediaCodec mediaCodec, @NonNull Surface surface) {
            mediaCodec.setInputSurface(surface);
        }
    }

    /* renamed from: androidx.camera.video.internal.encoder.EncoderImpl$d */
    /* loaded from: classes.dex */
    public class C2669d implements Encoder.ByteBufferInput {

        /* renamed from: a */
        public final Map f12042a = new LinkedHashMap();

        /* renamed from: b */
        public BufferProvider.State f12043b = BufferProvider.State.INACTIVE;

        /* renamed from: c */
        public final List f12044c = new ArrayList();

        public C2669d() {
            EncoderImpl.this = r1;
        }

        /* renamed from: a */
        public static /* synthetic */ void m61994a(C2669d c2669d, CallbackToFutureAdapter.Completer completer) {
            c2669d.m61977r(completer);
        }

        /* renamed from: b */
        public static /* synthetic */ void m61993b(Map.Entry entry, BufferProvider.State state) {
            m61974u(entry, state);
        }

        /* renamed from: c */
        public static /* synthetic */ Object m61992c(C2669d c2669d, CallbackToFutureAdapter.Completer completer) {
            return c2669d.m61976s(completer);
        }

        /* renamed from: d */
        public static /* synthetic */ void m61991d(C2669d c2669d, Observable.Observer observer, Executor executor) {
            c2669d.m61978q(observer, executor);
        }

        /* renamed from: e */
        public static /* synthetic */ void m61990e(Observable.Observer observer, BufferProvider.State state) {
            observer.onNewData(state);
        }

        /* renamed from: f */
        public static /* synthetic */ void m61989f(C2669d c2669d, Observable.Observer observer) {
            c2669d.m61975t(observer);
        }

        /* renamed from: g */
        public static /* synthetic */ void m61988g(C2669d c2669d, ListenableFuture listenableFuture) {
            c2669d.m61982m(listenableFuture);
        }

        /* renamed from: h */
        public static /* synthetic */ Object m61987h(C2669d c2669d, CallbackToFutureAdapter.Completer completer) {
            return c2669d.m61980o(completer);
        }

        /* renamed from: i */
        public static /* synthetic */ void m61986i(C2669d c2669d, CallbackToFutureAdapter.Completer completer) {
            c2669d.m61981n(completer);
        }

        /* renamed from: j */
        public static /* synthetic */ void m61985j(C2669d c2669d, ListenableFuture listenableFuture) {
            c2669d.m61983l(listenableFuture);
        }

        /* renamed from: u */
        public static /* synthetic */ void m61974u(Map.Entry entry, BufferProvider.State state) {
            ((Observable.Observer) entry.getKey()).onNewData(state);
        }

        @Override // androidx.camera.video.internal.BufferProvider
        public ListenableFuture<InputBuffer> acquireBuffer() {
            return CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: UR
                {
                    EncoderImpl.C2669d.this = this;
                }

                @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
                public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                    return EncoderImpl.C2669d.m61987h(EncoderImpl.C2669d.this, completer);
                }
            });
        }

        @Override // androidx.camera.core.impl.Observable
        public void addObserver(final Executor executor, final Observable.Observer<? super BufferProvider.State> observer) {
            EncoderImpl.this.f12020h.execute(new Runnable() { // from class: SR
                {
                    EncoderImpl.C2669d.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    EncoderImpl.C2669d.m61991d(EncoderImpl.C2669d.this, observer, executor);
                }
            });
        }

        @Override // androidx.camera.core.impl.Observable
        public ListenableFuture<BufferProvider.State> fetchData() {
            return CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: TR
                {
                    EncoderImpl.C2669d.this = this;
                }

                @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
                public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                    return EncoderImpl.C2669d.m61992c(EncoderImpl.C2669d.this, completer);
                }
            });
        }

        /* renamed from: k */
        public final void m61983l(ListenableFuture listenableFuture) {
            if (!listenableFuture.cancel(true)) {
                Preconditions.checkState(listenableFuture.isDone());
                try {
                    ((InputBuffer) listenableFuture.get()).cancel();
                } catch (InterruptedException | CancellationException | ExecutionException e) {
                    String str = EncoderImpl.this.f12013a;
                    Logger.m63223w(str, "Unable to cancel the input buffer: " + e);
                }
            }
        }

        /* renamed from: m */
        public final /* synthetic */ void m61982m(ListenableFuture listenableFuture) {
            this.f12044c.remove(listenableFuture);
        }

        /* renamed from: n */
        public final /* synthetic */ void m61981n(CallbackToFutureAdapter.Completer completer) {
            BufferProvider.State state = this.f12043b;
            if (state == BufferProvider.State.ACTIVE) {
                final ListenableFuture m62008q = EncoderImpl.this.m62008q();
                Futures.propagate(m62008q, completer);
                completer.addCancellationListener(new Runnable() { // from class: aS
                    {
                        EncoderImpl.C2669d.this = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        EncoderImpl.C2669d.m61985j(EncoderImpl.C2669d.this, m62008q);
                    }
                }, CameraXExecutors.directExecutor());
                this.f12044c.add(m62008q);
                m62008q.addListener(new Runnable() { // from class: bS
                    {
                        EncoderImpl.C2669d.this = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        EncoderImpl.C2669d.m61988g(EncoderImpl.C2669d.this, m62008q);
                    }
                }, EncoderImpl.this.f12020h);
            } else if (state == BufferProvider.State.INACTIVE) {
                completer.setException(new IllegalStateException("BufferProvider is not active."));
            } else {
                completer.setException(new IllegalStateException("Unknown state: " + this.f12043b));
            }
        }

        /* renamed from: o */
        public final /* synthetic */ Object m61980o(final CallbackToFutureAdapter.Completer completer) {
            EncoderImpl.this.f12020h.execute(new Runnable() { // from class: XR
                {
                    EncoderImpl.C2669d.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    EncoderImpl.C2669d.m61986i(EncoderImpl.C2669d.this, completer);
                }
            });
            return "acquireBuffer";
        }

        /* renamed from: q */
        public final /* synthetic */ void m61978q(final Observable.Observer observer, Executor executor) {
            this.f12042a.put((Observable.Observer) Preconditions.checkNotNull(observer), (Executor) Preconditions.checkNotNull(executor));
            final BufferProvider.State state = this.f12043b;
            executor.execute(new Runnable() { // from class: ZR
                @Override // java.lang.Runnable
                public final void run() {
                    EncoderImpl.C2669d.m61990e(observer, state);
                }
            });
        }

        /* renamed from: r */
        public final /* synthetic */ void m61977r(CallbackToFutureAdapter.Completer completer) {
            completer.set(this.f12043b);
        }

        @Override // androidx.camera.core.impl.Observable
        public void removeObserver(final Observable.Observer<? super BufferProvider.State> observer) {
            EncoderImpl.this.f12020h.execute(new Runnable() { // from class: WR
                {
                    EncoderImpl.C2669d.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    EncoderImpl.C2669d.m61989f(EncoderImpl.C2669d.this, observer);
                }
            });
        }

        /* renamed from: s */
        public final /* synthetic */ Object m61976s(final CallbackToFutureAdapter.Completer completer) {
            EncoderImpl.this.f12020h.execute(new Runnable() { // from class: YR
                {
                    EncoderImpl.C2669d.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    EncoderImpl.C2669d.m61994a(EncoderImpl.C2669d.this, completer);
                }
            });
            return "fetchData";
        }

        /* renamed from: t */
        public final /* synthetic */ void m61975t(Observable.Observer observer) {
            this.f12042a.remove(Preconditions.checkNotNull(observer));
        }

        /* renamed from: v */
        public void m61973v(boolean z) {
            final BufferProvider.State state;
            if (z) {
                state = BufferProvider.State.ACTIVE;
            } else {
                state = BufferProvider.State.INACTIVE;
            }
            if (this.f12043b == state) {
                return;
            }
            this.f12043b = state;
            if (state == BufferProvider.State.INACTIVE) {
                for (ListenableFuture listenableFuture : this.f12044c) {
                    listenableFuture.cancel(true);
                }
                this.f12044c.clear();
            }
            for (final Map.Entry entry : this.f12042a.entrySet()) {
                try {
                    ((Executor) entry.getValue()).execute(new Runnable() { // from class: VR
                        @Override // java.lang.Runnable
                        public final void run() {
                            EncoderImpl.C2669d.m61993b(entry, state);
                        }
                    });
                } catch (RejectedExecutionException e) {
                    Logger.m63227e(EncoderImpl.this.f12013a, "Unable to post to the supplied executor.", e);
                }
            }
        }
    }

    /* renamed from: androidx.camera.video.internal.encoder.EncoderImpl$e */
    /* loaded from: classes.dex */
    public class C2670e extends MediaCodec.Callback {

        /* renamed from: a */
        public final VideoTimebaseConverter f12046a;

        /* renamed from: b */
        public boolean f12047b = false;

        /* renamed from: c */
        public boolean f12048c = false;

        /* renamed from: d */
        public boolean f12049d = false;

        /* renamed from: e */
        public long f12050e = 0;

        /* renamed from: f */
        public long f12051f = 0;

        /* renamed from: g */
        public boolean f12052g = false;

        /* renamed from: h */
        public boolean f12053h = false;

        /* renamed from: i */
        public boolean f12054i = false;

        /* renamed from: androidx.camera.video.internal.encoder.EncoderImpl$e$a */
        /* loaded from: classes.dex */
        public class C2671a implements FutureCallback {

            /* renamed from: a */
            public final /* synthetic */ EncodedDataImpl f12056a;

            public C2671a(EncodedDataImpl encodedDataImpl) {
                C2670e.this = r1;
                this.f12056a = encodedDataImpl;
            }

            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            /* renamed from: a */
            public void onSuccess(Void r2) {
                EncoderImpl.this.f12026n.remove(this.f12056a);
            }

            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public void onFailure(Throwable th2) {
                EncoderImpl.this.f12026n.remove(this.f12056a);
                if (th2 instanceof MediaCodec.CodecException) {
                    EncoderImpl.this.m62002w((MediaCodec.CodecException) th2);
                } else {
                    EncoderImpl.this.m62003v(0, th2.getMessage(), th2);
                }
            }
        }

        public C2670e() {
            EncoderImpl.this = r4;
            Timebase timebase = null;
            if (r4.f12015c) {
                if (DeviceQuirks.get(CameraUseInconsistentTimebaseQuirk.class) != null) {
                    Logger.m63223w(r4.f12013a, "CameraUseInconsistentTimebaseQuirk is enabled");
                } else {
                    timebase = r4.f12028p;
                }
                this.f12046a = new VideoTimebaseConverter(r4.f12029q, timebase);
                return;
            }
            this.f12046a = null;
        }

        /* renamed from: a */
        public static /* synthetic */ void m61972a(C2670e c2670e, MediaCodec.BufferInfo bufferInfo, MediaCodec mediaCodec, int i) {
            c2670e.m61958o(bufferInfo, mediaCodec, i);
        }

        /* renamed from: b */
        public static /* synthetic */ MediaFormat m61971b(MediaFormat mediaFormat) {
            return m61957p(mediaFormat);
        }

        /* renamed from: c */
        public static /* synthetic */ void m61970c(EncoderCallback encoderCallback, EncodedDataImpl encodedDataImpl) {
            encoderCallback.onEncodedData(encodedDataImpl);
        }

        /* renamed from: d */
        public static /* synthetic */ void m61969d(EncoderCallback encoderCallback, MediaFormat mediaFormat) {
            m61956q(encoderCallback, mediaFormat);
        }

        /* renamed from: e */
        public static /* synthetic */ void m61968e(C2670e c2670e, Executor executor, EncoderCallback encoderCallback) {
            c2670e.m61959n(executor, encoderCallback);
        }

        /* renamed from: f */
        public static /* synthetic */ void m61967f(C2670e c2670e, MediaFormat mediaFormat) {
            c2670e.m61955r(mediaFormat);
        }

        /* renamed from: g */
        public static /* synthetic */ void m61966g(C2670e c2670e, int i) {
            c2670e.m61960m(i);
        }

        /* renamed from: h */
        public static /* synthetic */ void m61965h(C2670e c2670e, MediaCodec.CodecException codecException) {
            c2670e.m61961l(codecException);
        }

        /* renamed from: p */
        public static /* synthetic */ MediaFormat m61957p(MediaFormat mediaFormat) {
            return mediaFormat;
        }

        /* renamed from: q */
        public static /* synthetic */ void m61956q(EncoderCallback encoderCallback, final MediaFormat mediaFormat) {
            encoderCallback.onOutputConfigUpdate(new OutputConfig() { // from class: mS
                @Override // androidx.camera.video.internal.encoder.OutputConfig
                public final MediaFormat getMediaFormat() {
                    return EncoderImpl.C2670e.m61971b(mediaFormat);
                }
            });
        }

        /* renamed from: i */
        public final boolean m61964i(MediaCodec.BufferInfo bufferInfo) {
            if (this.f12049d) {
                Logger.m63230d(EncoderImpl.this.f12013a, "Drop buffer by already reach end of stream.");
                return false;
            } else if (bufferInfo.size <= 0) {
                Logger.m63230d(EncoderImpl.this.f12013a, "Drop buffer by invalid buffer size.");
                return false;
            } else if ((bufferInfo.flags & 2) != 0) {
                Logger.m63230d(EncoderImpl.this.f12013a, "Drop buffer by codec config.");
                return false;
            } else {
                VideoTimebaseConverter videoTimebaseConverter = this.f12046a;
                if (videoTimebaseConverter != null) {
                    bufferInfo.presentationTimeUs = videoTimebaseConverter.convertToUptimeUs(bufferInfo.presentationTimeUs);
                }
                long j = bufferInfo.presentationTimeUs;
                if (j <= this.f12050e) {
                    Logger.m63230d(EncoderImpl.this.f12013a, "Drop buffer by out of order buffer from MediaCodec.");
                    return false;
                }
                this.f12050e = j;
                if (!EncoderImpl.this.f12033u.contains((Range) Long.valueOf(j))) {
                    Logger.m63230d(EncoderImpl.this.f12013a, "Drop buffer by not in start-stop range.");
                    EncoderImpl encoderImpl = EncoderImpl.this;
                    if (encoderImpl.f12035w && bufferInfo.presentationTimeUs >= ((Long) encoderImpl.f12033u.getUpper()).longValue()) {
                        Future future = EncoderImpl.this.f12037y;
                        if (future != null) {
                            future.cancel(true);
                        }
                        EncoderImpl.this.f12036x = Long.valueOf(bufferInfo.presentationTimeUs);
                        EncoderImpl.this.m62028X();
                        EncoderImpl.this.f12035w = false;
                    }
                    return false;
                } else if (m61950w(bufferInfo)) {
                    Logger.m63230d(EncoderImpl.this.f12013a, "Drop buffer by pause.");
                    return false;
                } else if (EncoderImpl.this.m62004u(bufferInfo) <= this.f12051f) {
                    Logger.m63230d(EncoderImpl.this.f12013a, "Drop buffer by adjusted time is less than the last sent time.");
                    if (EncoderImpl.this.f12015c && EncoderImpl.m62051A(bufferInfo)) {
                        this.f12053h = true;
                    }
                    return false;
                } else {
                    if (!this.f12048c && !this.f12053h && EncoderImpl.this.f12015c) {
                        this.f12053h = true;
                    }
                    if (this.f12053h) {
                        if (!EncoderImpl.m62051A(bufferInfo)) {
                            Logger.m63230d(EncoderImpl.this.f12013a, "Drop buffer by not a key frame.");
                            EncoderImpl.this.m62032T();
                            return false;
                        }
                        this.f12053h = false;
                    }
                    return true;
                }
            }
        }

        /* renamed from: j */
        public final boolean m61963j(MediaCodec.BufferInfo bufferInfo) {
            if (!EncoderImpl.m62000y(bufferInfo) && !m61962k(bufferInfo)) {
                return false;
            }
            return true;
        }

        /* renamed from: k */
        public final boolean m61962k(MediaCodec.BufferInfo bufferInfo) {
            EncoderImpl encoderImpl = EncoderImpl.this;
            if (encoderImpl.f12011C && bufferInfo.presentationTimeUs > ((Long) encoderImpl.f12033u.getUpper()).longValue()) {
                return true;
            }
            return false;
        }

        /* renamed from: l */
        public final /* synthetic */ void m61961l(MediaCodec.CodecException codecException) {
            switch (C2667b.f12041a[EncoderImpl.this.f12032t.ordinal()]) {
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
                    EncoderImpl.this.m62002w(codecException);
                    return;
                default:
                    throw new IllegalStateException("Unknown state: " + EncoderImpl.this.f12032t);
            }
        }

        /* renamed from: m */
        public final /* synthetic */ void m61960m(int i) {
            if (this.f12054i) {
                Logger.m63223w(EncoderImpl.this.f12013a, "Receives input frame after codec is reset.");
                return;
            }
            switch (C2667b.f12041a[EncoderImpl.this.f12032t.ordinal()]) {
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
                    EncoderImpl.this.f12023k.offer(Integer.valueOf(i));
                    EncoderImpl.this.m62035Q();
                    return;
                default:
                    throw new IllegalStateException("Unknown state: " + EncoderImpl.this.f12032t);
            }
        }

        /* renamed from: n */
        public final /* synthetic */ void m61959n(Executor executor, final EncoderCallback encoderCallback) {
            if (EncoderImpl.this.f12032t == InternalState.ERROR) {
                return;
            }
            try {
                Objects.requireNonNull(encoderCallback);
                executor.execute(new Runnable() { // from class: kS
                    @Override // java.lang.Runnable
                    public final void run() {
                        encoderCallback.onEncodeStop();
                    }
                });
            } catch (RejectedExecutionException e) {
                Logger.m63227e(EncoderImpl.this.f12013a, "Unable to post to the supplied executor.", e);
            }
        }

        /* renamed from: o */
        public final /* synthetic */ void m61958o(MediaCodec.BufferInfo bufferInfo, MediaCodec mediaCodec, int i) {
            final EncoderCallback encoderCallback;
            final Executor executor;
            if (this.f12054i) {
                Logger.m63223w(EncoderImpl.this.f12013a, "Receives frame after codec is reset.");
                return;
            }
            switch (C2667b.f12041a[EncoderImpl.this.f12032t.ordinal()]) {
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
                    synchronized (EncoderImpl.this.f12014b) {
                        EncoderImpl encoderImpl = EncoderImpl.this;
                        encoderCallback = encoderImpl.f12030r;
                        executor = encoderImpl.f12031s;
                    }
                    if (!this.f12047b) {
                        this.f12047b = true;
                        try {
                            Objects.requireNonNull(encoderCallback);
                            executor.execute(new Runnable() { // from class: hS
                                @Override // java.lang.Runnable
                                public final void run() {
                                    encoderCallback.onEncodeStart();
                                }
                            });
                        } catch (RejectedExecutionException e) {
                            Logger.m63227e(EncoderImpl.this.f12013a, "Unable to post to the supplied executor.", e);
                        }
                    }
                    if (m61964i(bufferInfo)) {
                        if (!this.f12048c) {
                            this.f12048c = true;
                            String str = EncoderImpl.this.f12013a;
                            Logger.m63230d(str, "data timestampUs = " + bufferInfo.presentationTimeUs + ", data timebase = " + EncoderImpl.this.f12028p + ", current system uptimeMs = " + SystemClock.uptimeMillis() + ", current system realtimeMs = " + SystemClock.elapsedRealtime());
                        }
                        MediaCodec.BufferInfo m61953t = m61953t(bufferInfo);
                        this.f12051f = m61953t.presentationTimeUs;
                        try {
                            m61952u(new EncodedDataImpl(mediaCodec, i, m61953t), encoderCallback, executor);
                        } catch (MediaCodec.CodecException e2) {
                            EncoderImpl.this.m62002w(e2);
                            return;
                        }
                    } else if (i != -9999) {
                        try {
                            EncoderImpl.this.f12017e.releaseOutputBuffer(i, false);
                        } catch (MediaCodec.CodecException e3) {
                            EncoderImpl.this.m62002w(e3);
                            return;
                        }
                    }
                    if (!this.f12049d && m61963j(bufferInfo)) {
                        this.f12049d = true;
                        EncoderImpl.this.m62026Z(new Runnable() { // from class: iS
                            {
                                EncoderImpl.C2670e.this = this;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                EncoderImpl.C2670e.m61968e(EncoderImpl.C2670e.this, executor, encoderCallback);
                            }
                        });
                        return;
                    }
                    return;
                default:
                    throw new IllegalStateException("Unknown state: " + EncoderImpl.this.f12032t);
            }
        }

        @Override // android.media.MediaCodec.Callback
        public void onError(MediaCodec mediaCodec, final MediaCodec.CodecException codecException) {
            EncoderImpl.this.f12020h.execute(new Runnable() { // from class: fS
                {
                    EncoderImpl.C2670e.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    EncoderImpl.C2670e.m61965h(EncoderImpl.C2670e.this, codecException);
                }
            });
        }

        @Override // android.media.MediaCodec.Callback
        public void onInputBufferAvailable(MediaCodec mediaCodec, final int i) {
            EncoderImpl.this.f12020h.execute(new Runnable() { // from class: cS
                {
                    EncoderImpl.C2670e.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    EncoderImpl.C2670e.m61966g(EncoderImpl.C2670e.this, i);
                }
            });
        }

        @Override // android.media.MediaCodec.Callback
        public void onOutputBufferAvailable(final MediaCodec mediaCodec, final int i, final MediaCodec.BufferInfo bufferInfo) {
            EncoderImpl.this.f12020h.execute(new Runnable() { // from class: eS
                {
                    EncoderImpl.C2670e.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    EncoderImpl.C2670e.m61972a(EncoderImpl.C2670e.this, bufferInfo, mediaCodec, i);
                }
            });
        }

        @Override // android.media.MediaCodec.Callback
        public void onOutputFormatChanged(MediaCodec mediaCodec, final MediaFormat mediaFormat) {
            EncoderImpl.this.f12020h.execute(new Runnable() { // from class: gS
                {
                    EncoderImpl.C2670e.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    EncoderImpl.C2670e.m61967f(EncoderImpl.C2670e.this, mediaFormat);
                }
            });
        }

        /* renamed from: r */
        public final /* synthetic */ void m61955r(final MediaFormat mediaFormat) {
            final EncoderCallback encoderCallback;
            Executor executor;
            if (this.f12054i) {
                Logger.m63223w(EncoderImpl.this.f12013a, "Receives onOutputFormatChanged after codec is reset.");
                return;
            }
            switch (C2667b.f12041a[EncoderImpl.this.f12032t.ordinal()]) {
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
                    synchronized (EncoderImpl.this.f12014b) {
                        EncoderImpl encoderImpl = EncoderImpl.this;
                        encoderCallback = encoderImpl.f12030r;
                        executor = encoderImpl.f12031s;
                    }
                    try {
                        executor.execute(new Runnable() { // from class: jS
                            @Override // java.lang.Runnable
                            public final void run() {
                                EncoderImpl.C2670e.m61969d(encoderCallback, mediaFormat);
                            }
                        });
                        return;
                    } catch (RejectedExecutionException e) {
                        Logger.m63227e(EncoderImpl.this.f12013a, "Unable to post to the supplied executor.", e);
                        return;
                    }
                default:
                    throw new IllegalStateException("Unknown state: " + EncoderImpl.this.f12032t);
            }
        }

        /* renamed from: t */
        public final MediaCodec.BufferInfo m61953t(MediaCodec.BufferInfo bufferInfo) {
            boolean z;
            long m62004u = EncoderImpl.this.m62004u(bufferInfo);
            if (bufferInfo.presentationTimeUs == m62004u) {
                return bufferInfo;
            }
            if (m62004u > this.f12051f) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkState(z);
            MediaCodec.BufferInfo bufferInfo2 = new MediaCodec.BufferInfo();
            bufferInfo2.set(bufferInfo.offset, bufferInfo.size, m62004u, bufferInfo.flags);
            return bufferInfo2;
        }

        /* renamed from: u */
        public final void m61952u(final EncodedDataImpl encodedDataImpl, final EncoderCallback encoderCallback, Executor executor) {
            EncoderImpl.this.f12026n.add(encodedDataImpl);
            Futures.addCallback(encodedDataImpl.getClosedFuture(), new C2671a(encodedDataImpl), EncoderImpl.this.f12020h);
            try {
                executor.execute(new Runnable() { // from class: lS
                    @Override // java.lang.Runnable
                    public final void run() {
                        EncoderImpl.C2670e.m61970c(EncoderCallback.this, encodedDataImpl);
                    }
                });
            } catch (RejectedExecutionException e) {
                Logger.m63227e(EncoderImpl.this.f12013a, "Unable to post to the supplied executor.", e);
                encodedDataImpl.close();
            }
        }

        /* renamed from: v */
        public void m61951v() {
            this.f12054i = true;
        }

        /* renamed from: w */
        public final boolean m61950w(MediaCodec.BufferInfo bufferInfo) {
            Executor executor;
            final EncoderCallback encoderCallback;
            EncoderImpl.this.m62024a0(bufferInfo.presentationTimeUs);
            boolean m61999z = EncoderImpl.this.m61999z(bufferInfo.presentationTimeUs);
            boolean z = this.f12052g;
            if (!z && m61999z) {
                Logger.m63230d(EncoderImpl.this.f12013a, "Switch to pause state");
                this.f12052g = true;
                synchronized (EncoderImpl.this.f12014b) {
                    EncoderImpl encoderImpl = EncoderImpl.this;
                    executor = encoderImpl.f12031s;
                    encoderCallback = encoderImpl.f12030r;
                }
                Objects.requireNonNull(encoderCallback);
                executor.execute(new Runnable() { // from class: dS
                    @Override // java.lang.Runnable
                    public final void run() {
                        encoderCallback.onEncodePaused();
                    }
                });
                EncoderImpl encoderImpl2 = EncoderImpl.this;
                if (encoderImpl2.f12032t == InternalState.PAUSED && ((encoderImpl2.f12015c || DeviceQuirks.get(AudioEncoderIgnoresInputTimestampQuirk.class) == null) && (!EncoderImpl.this.f12015c || DeviceQuirks.get(VideoEncoderSuspendDoesNotIncludeSuspendTimeQuirk.class) == null))) {
                    Encoder.EncoderInput encoderInput = EncoderImpl.this.f12018f;
                    if (encoderInput instanceof C2669d) {
                        ((C2669d) encoderInput).m61973v(false);
                    }
                    EncoderImpl.this.m62030V(true);
                }
                EncoderImpl.this.f12036x = Long.valueOf(bufferInfo.presentationTimeUs);
                EncoderImpl encoderImpl3 = EncoderImpl.this;
                if (encoderImpl3.f12035w) {
                    Future future = encoderImpl3.f12037y;
                    if (future != null) {
                        future.cancel(true);
                    }
                    EncoderImpl.this.m62028X();
                    EncoderImpl.this.f12035w = false;
                }
            } else if (z && !m61999z) {
                Logger.m63230d(EncoderImpl.this.f12013a, "Switch to resume state");
                this.f12052g = false;
                if (EncoderImpl.this.f12015c && !EncoderImpl.m62051A(bufferInfo)) {
                    this.f12053h = true;
                }
            }
            return this.f12052g;
        }
    }

    /* renamed from: androidx.camera.video.internal.encoder.EncoderImpl$f */
    /* loaded from: classes.dex */
    public class C2672f implements Encoder.SurfaceInput {

        /* renamed from: b */
        public Surface f12059b;

        /* renamed from: d */
        public Encoder.SurfaceInput.OnSurfaceUpdateListener f12061d;

        /* renamed from: e */
        public Executor f12062e;

        /* renamed from: a */
        public final Object f12058a = new Object();

        /* renamed from: c */
        public final Set f12060c = new HashSet();

        public C2672f() {
            EncoderImpl.this = r1;
        }

        /* renamed from: a */
        public static /* synthetic */ void m61948a(Encoder.SurfaceInput.OnSurfaceUpdateListener onSurfaceUpdateListener, Surface surface) {
            onSurfaceUpdateListener.onSurfaceUpdate(surface);
        }

        /* renamed from: c */
        public final void m61946c(Executor executor, final Encoder.SurfaceInput.OnSurfaceUpdateListener onSurfaceUpdateListener, final Surface surface) {
            try {
                executor.execute(new Runnable() { // from class: nS
                    @Override // java.lang.Runnable
                    public final void run() {
                        EncoderImpl.C2672f.m61948a(Encoder.SurfaceInput.OnSurfaceUpdateListener.this, surface);
                    }
                });
            } catch (RejectedExecutionException e) {
                Logger.m63227e(EncoderImpl.this.f12013a, "Unable to post to the supplied executor.", e);
            }
        }

        /* renamed from: d */
        public void m61945d() {
            Surface surface;
            HashSet<Surface> hashSet;
            synchronized (this.f12058a) {
                surface = this.f12059b;
                this.f12059b = null;
                hashSet = new HashSet(this.f12060c);
                this.f12060c.clear();
            }
            if (surface != null) {
                surface.release();
            }
            for (Surface surface2 : hashSet) {
                surface2.release();
            }
        }

        /* renamed from: e */
        public void m61944e() {
            Surface createInputSurface;
            Encoder.SurfaceInput.OnSurfaceUpdateListener onSurfaceUpdateListener;
            Executor executor;
            EncoderNotUsePersistentInputSurfaceQuirk encoderNotUsePersistentInputSurfaceQuirk = (EncoderNotUsePersistentInputSurfaceQuirk) DeviceQuirks.get(EncoderNotUsePersistentInputSurfaceQuirk.class);
            synchronized (this.f12058a) {
                try {
                    if (encoderNotUsePersistentInputSurfaceQuirk == null) {
                        if (this.f12059b == null) {
                            createInputSurface = C2668c.m61996a();
                            this.f12059b = createInputSurface;
                        } else {
                            createInputSurface = null;
                        }
                        C2668c.m61995b(EncoderImpl.this.f12017e, this.f12059b);
                    } else {
                        Surface surface = this.f12059b;
                        if (surface != null) {
                            this.f12060c.add(surface);
                        }
                        createInputSurface = EncoderImpl.this.f12017e.createInputSurface();
                        this.f12059b = createInputSurface;
                    }
                    onSurfaceUpdateListener = this.f12061d;
                    executor = this.f12062e;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (createInputSurface != null && onSurfaceUpdateListener != null && executor != null) {
                m61946c(executor, onSurfaceUpdateListener, createInputSurface);
            }
        }

        @Override // androidx.camera.video.internal.encoder.Encoder.SurfaceInput
        public void setOnSurfaceUpdateListener(Executor executor, Encoder.SurfaceInput.OnSurfaceUpdateListener onSurfaceUpdateListener) {
            Surface surface;
            synchronized (this.f12058a) {
                this.f12061d = (Encoder.SurfaceInput.OnSurfaceUpdateListener) Preconditions.checkNotNull(onSurfaceUpdateListener);
                this.f12062e = (Executor) Preconditions.checkNotNull(executor);
                surface = this.f12059b;
            }
            if (surface != null) {
                m61946c(executor, onSurfaceUpdateListener, surface);
            }
        }
    }

    public EncoderImpl(@NonNull Executor executor, @NonNull EncoderConfig encoderConfig) throws InvalidConfigException {
        EncoderFinder encoderFinder = new EncoderFinder();
        this.f12012D = encoderFinder;
        Preconditions.checkNotNull(executor);
        Preconditions.checkNotNull(encoderConfig);
        this.f12020h = CameraXExecutors.newSequentialExecutor(executor);
        if (encoderConfig instanceof AudioEncoderConfig) {
            this.f12013a = "AudioEncoder";
            this.f12015c = false;
            this.f12018f = new C2669d();
        } else if (encoderConfig instanceof VideoEncoderConfig) {
            this.f12013a = "VideoEncoder";
            this.f12015c = true;
            this.f12018f = new C2672f();
        } else {
            throw new InvalidConfigException("Unknown encoder config type");
        }
        Timebase inputTimebase = encoderConfig.getInputTimebase();
        this.f12028p = inputTimebase;
        String str = this.f12013a;
        Logger.m63230d(str, "mInputTimebase = " + inputTimebase);
        MediaFormat mediaFormat = encoderConfig.toMediaFormat();
        this.f12016d = mediaFormat;
        String str2 = this.f12013a;
        Logger.m63230d(str2, "mMediaFormat = " + mediaFormat);
        MediaCodec findEncoder = encoderFinder.findEncoder(mediaFormat);
        this.f12017e = findEncoder;
        String str3 = this.f12013a;
        Logger.m63225i(str3, "Selected encoder: " + findEncoder.getName());
        EncoderInfo m62006s = m62006s(this.f12015c, findEncoder.getCodecInfo(), encoderConfig.getMimeType());
        this.f12019g = m62006s;
        if (this.f12015c) {
            m62007r((VideoEncoderInfo) m62006s, mediaFormat);
        }
        try {
            m62031U();
            final AtomicReference atomicReference = new AtomicReference();
            this.f12021i = Futures.nonCancellationPropagating(CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: MR
                @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
                public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                    return EncoderImpl.m62011n(atomicReference, completer);
                }
            }));
            this.f12022j = (CallbackToFutureAdapter.Completer) Preconditions.checkNotNull((CallbackToFutureAdapter.Completer) atomicReference.get());
            m62029W(InternalState.CONFIGURED);
        } catch (MediaCodec.CodecException e) {
            throw new InvalidConfigException(e);
        }
    }

    /* renamed from: A */
    public static boolean m62051A(MediaCodec.BufferInfo bufferInfo) {
        if ((bufferInfo.flags & 1) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: G */
    public static /* synthetic */ void m62045G(EncoderCallback encoderCallback, int i, String str, Throwable th2) {
        encoderCallback.onEncodeError(new EncodeException(i, str, th2));
    }

    /* renamed from: a */
    public static /* synthetic */ void m62025a(EncoderImpl encoderImpl) {
        encoderImpl.m62039M();
    }

    /* renamed from: b */
    public static /* synthetic */ void m62023b(EncoderImpl encoderImpl, C17849Je0 c17849Je0) {
        encoderImpl.m62047E(c17849Je0);
    }

    /* renamed from: c */
    public static /* synthetic */ void m62022c(EncoderImpl encoderImpl) {
        encoderImpl.m62038N();
    }

    /* renamed from: d */
    public static /* synthetic */ void m62021d(EncoderImpl encoderImpl, List list, Runnable runnable) {
        encoderImpl.m62036P(list, runnable);
    }

    /* renamed from: e */
    public static /* synthetic */ void m62020e(EncoderImpl encoderImpl) {
        encoderImpl.m62042J();
    }

    /* renamed from: f */
    public static /* synthetic */ void m62019f(EncoderImpl encoderImpl, int i, String str, Throwable th2) {
        encoderImpl.m62048D(i, str, th2);
    }

    /* renamed from: g */
    public static /* synthetic */ void m62018g(EncoderImpl encoderImpl, long j) {
        encoderImpl.m62044H(j);
    }

    /* renamed from: h */
    public static /* synthetic */ void m62017h(EncoderCallback encoderCallback, int i, String str, Throwable th2) {
        m62045G(encoderCallback, i, str, th2);
    }

    /* renamed from: i */
    public static /* synthetic */ void m62016i(EncoderImpl encoderImpl) {
        encoderImpl.m62027Y();
    }

    /* renamed from: j */
    public static /* synthetic */ void m62015j(EncoderImpl encoderImpl) {
        encoderImpl.m62041K();
    }

    /* renamed from: k */
    public static /* synthetic */ void m62014k(EncoderImpl encoderImpl, CallbackToFutureAdapter.Completer completer) {
        encoderImpl.m62049C(completer);
    }

    /* renamed from: l */
    public static /* synthetic */ void m62013l(EncoderImpl encoderImpl, long j, long j2) {
        encoderImpl.m62037O(j, j2);
    }

    /* renamed from: m */
    public static /* synthetic */ void m62012m(EncoderImpl encoderImpl, long j) {
        encoderImpl.m62040L(j);
    }

    /* renamed from: n */
    public static /* synthetic */ Object m62011n(AtomicReference atomicReference, CallbackToFutureAdapter.Completer completer) {
        return atomicReference.set(completer);
    }

    /* renamed from: o */
    public static /* synthetic */ Object m62010o(AtomicReference atomicReference, CallbackToFutureAdapter.Completer completer) {
        return atomicReference.set(completer);
    }

    /* renamed from: p */
    public static /* synthetic */ void m62009p(EncoderImpl encoderImpl) {
        encoderImpl.m62043I();
    }

    /* renamed from: s */
    public static EncoderInfo m62006s(boolean z, MediaCodecInfo mediaCodecInfo, String str) {
        if (z) {
            return new VideoEncoderInfoImpl(mediaCodecInfo, str);
        }
        return new AudioEncoderInfoImpl(mediaCodecInfo, str);
    }

    /* renamed from: y */
    public static boolean m62000y(MediaCodec.BufferInfo bufferInfo) {
        if ((bufferInfo.flags & 4) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: C */
    public final /* synthetic */ void m62049C(CallbackToFutureAdapter.Completer completer) {
        this.f12024l.remove(completer);
    }

    /* renamed from: E */
    public final /* synthetic */ void m62047E(C17849Je0 c17849Je0) {
        this.f12025m.remove(c17849Je0);
    }

    /* renamed from: H */
    public final /* synthetic */ void m62044H(long j) {
        switch (C2667b.f12041a[this.f12032t.ordinal()]) {
            case 1:
            case 3:
            case 4:
            case 5:
            case 8:
                return;
            case 2:
                String str = this.f12013a;
                Logger.m63230d(str, "Pause on " + DebugUtils.readableUs(j));
                this.f12027o.addLast(Range.create(Long.valueOf(j), Long.MAX_VALUE));
                m62029W(InternalState.PAUSED);
                return;
            case 6:
                m62029W(InternalState.PENDING_START_PAUSED);
                return;
            case 7:
            case 9:
                throw new IllegalStateException("Encoder is released");
            default:
                throw new IllegalStateException("Unknown state: " + this.f12032t);
        }
    }

    /* renamed from: I */
    public final /* synthetic */ void m62043I() {
        switch (C2667b.f12041a[this.f12032t.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 8:
                m62033S();
                return;
            case 4:
            case 5:
            case 6:
                m62029W(InternalState.PENDING_RELEASE);
                return;
            case 7:
            case 9:
                return;
            default:
                throw new IllegalStateException("Unknown state: " + this.f12032t);
        }
    }

    /* renamed from: J */
    public final /* synthetic */ void m62042J() {
        int i = C2667b.f12041a[this.f12032t.ordinal()];
        if (i != 2) {
            if (i == 7 || i == 9) {
                throw new IllegalStateException("Encoder is released");
            }
            return;
        }
        m62032T();
    }

    /* renamed from: K */
    public final /* synthetic */ void m62041K() {
        this.f12010B = true;
        if (this.f12009A) {
            this.f12017e.stop();
            m62031U();
        }
    }

    /* renamed from: L */
    public final /* synthetic */ void m62040L(long j) {
        boolean z;
        switch (C2667b.f12041a[this.f12032t.ordinal()]) {
            case 1:
                this.f12036x = null;
                String str = this.f12013a;
                Logger.m63230d(str, "Start on " + DebugUtils.readableUs(j));
                try {
                    if (this.f12009A) {
                        m62031U();
                    }
                    this.f12033u = Range.create(Long.valueOf(j), Long.MAX_VALUE);
                    this.f12017e.start();
                    Encoder.EncoderInput encoderInput = this.f12018f;
                    if (encoderInput instanceof C2669d) {
                        ((C2669d) encoderInput).m61973v(true);
                    }
                    m62029W(InternalState.STARTED);
                    return;
                } catch (MediaCodec.CodecException e) {
                    m62002w(e);
                    return;
                }
            case 2:
            case 6:
            case 8:
                return;
            case 3:
                this.f12036x = null;
                Range range = (Range) this.f12027o.removeLast();
                if (range != null && ((Long) range.getUpper()).longValue() == Long.MAX_VALUE) {
                    z = true;
                } else {
                    z = false;
                }
                Preconditions.checkState(z, "There should be a \"pause\" before \"resume\"");
                Long l = (Long) range.getLower();
                long longValue = l.longValue();
                this.f12027o.addLast(Range.create(l, Long.valueOf(j)));
                String str2 = this.f12013a;
                Logger.m63230d(str2, "Resume on " + DebugUtils.readableUs(j) + "\nPaused duration = " + DebugUtils.readableUs(j - longValue));
                if ((this.f12015c || DeviceQuirks.get(AudioEncoderIgnoresInputTimestampQuirk.class) == null) && (!this.f12015c || DeviceQuirks.get(VideoEncoderSuspendDoesNotIncludeSuspendTimeQuirk.class) == null)) {
                    m62030V(false);
                    Encoder.EncoderInput encoderInput2 = this.f12018f;
                    if (encoderInput2 instanceof C2669d) {
                        ((C2669d) encoderInput2).m61973v(true);
                    }
                }
                if (this.f12015c) {
                    m62032T();
                }
                m62029W(InternalState.STARTED);
                return;
            case 4:
            case 5:
                m62029W(InternalState.PENDING_START);
                return;
            case 7:
            case 9:
                throw new IllegalStateException("Encoder is released");
            default:
                throw new IllegalStateException("Unknown state: " + this.f12032t);
        }
    }

    /* renamed from: M */
    public final /* synthetic */ void m62039M() {
        if (this.f12035w) {
            Logger.m63223w(this.f12013a, "The data didn't reach the expected timestamp before timeout, stop the codec.");
            this.f12036x = null;
            m62028X();
            this.f12035w = false;
        }
    }

    /* renamed from: N */
    public final /* synthetic */ void m62038N() {
        this.f12020h.execute(new Runnable() { // from class: AR
            {
                EncoderImpl.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                EncoderImpl.m62025a(EncoderImpl.this);
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
    public final /* synthetic */ void m62037O(long r8, long r10) {
        /*
            r7 = this;
            int[] r0 = androidx.camera.video.internal.encoder.EncoderImpl.C2667b.f12041a
            androidx.camera.video.internal.encoder.EncoderImpl$InternalState r1 = r7.f12032t
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
            androidx.camera.video.internal.encoder.EncoderImpl$InternalState r10 = r7.f12032t
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
            r7.m62029W(r8)
            goto Lbf
        L35:
            androidx.camera.video.internal.encoder.EncoderImpl$InternalState r0 = r7.f12032t
            androidx.camera.video.internal.encoder.EncoderImpl$InternalState r1 = androidx.camera.video.internal.encoder.EncoderImpl.InternalState.STOPPING
            r7.m62029W(r1)
            android.util.Range r1 = r7.f12033u
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
            java.lang.String r8 = r7.f12013a
            java.lang.String r9 = "The expected stop time is less than the start time. Use current time as stop time."
            androidx.camera.core.Logger.m63223w(r8, r9)
        L63:
            r8 = r10
        L64:
            int r10 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r10 < 0) goto Laf
            java.lang.Long r10 = java.lang.Long.valueOf(r8)
            android.util.Range r10 = android.util.Range.create(r1, r10)
            r7.f12033u = r10
            java.lang.String r10 = r7.f12013a
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r1 = "Stop on "
            r11.append(r1)
            java.lang.String r8 = androidx.camera.video.internal.DebugUtils.readableUs(r8)
            r11.append(r8)
            java.lang.String r8 = r11.toString()
            androidx.camera.core.Logger.m63230d(r10, r8)
            androidx.camera.video.internal.encoder.EncoderImpl$InternalState r8 = androidx.camera.video.internal.encoder.EncoderImpl.InternalState.PAUSED
            if (r0 != r8) goto L98
            java.lang.Long r8 = r7.f12036x
            if (r8 == 0) goto L98
            r7.m62028X()
            goto Lbf
        L98:
            r8 = 1
            r7.f12035w = r8
            java.util.concurrent.ScheduledExecutorService r8 = androidx.camera.core.impl.utils.executor.CameraXExecutors.mainThreadExecutor()
            OR r9 = new OR
            r9.<init>()
            r10 = 1000(0x3e8, double:4.94E-321)
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS
            java.util.concurrent.ScheduledFuture r8 = r8.schedule(r9, r10, r0)
            r7.f12037y = r8
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
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.video.internal.encoder.EncoderImpl.m62037O(long, long):void");
    }

    /* renamed from: P */
    public final /* synthetic */ void m62036P(List list, Runnable runnable) {
        if (this.f12032t != InternalState.ERROR) {
            if (!list.isEmpty()) {
                Logger.m63230d(this.f12013a, "encoded data and input buffers are returned");
            }
            if ((this.f12018f instanceof C2672f) && !this.f12010B) {
                this.f12017e.flush();
                this.f12009A = true;
            } else {
                this.f12017e.stop();
            }
        }
        if (runnable != null) {
            runnable.run();
        }
        m62001x();
    }

    /* renamed from: Q */
    public void m62035Q() {
        while (!this.f12024l.isEmpty() && !this.f12023k.isEmpty()) {
            CallbackToFutureAdapter.Completer completer = (CallbackToFutureAdapter.Completer) this.f12024l.poll();
            Objects.requireNonNull(completer);
            Integer num = (Integer) this.f12023k.poll();
            Objects.requireNonNull(num);
            try {
                final C17849Je0 c17849Je0 = new C17849Je0(this.f12017e, num.intValue());
                if (completer.set(c17849Je0)) {
                    this.f12025m.add(c17849Je0);
                    c17849Je0.getTerminationFuture().addListener(new Runnable() { // from class: DR
                        @Override // java.lang.Runnable
                        public final void run() {
                            EncoderImpl.m62023b(EncoderImpl.this, c17849Je0);
                        }
                    }, this.f12020h);
                } else {
                    c17849Je0.cancel();
                }
            } catch (MediaCodec.CodecException e) {
                m62002w(e);
                return;
            }
        }
    }

    /* renamed from: R */
    public void m62048D(final int i, final String str, final Throwable th2) {
        final EncoderCallback encoderCallback;
        Executor executor;
        synchronized (this.f12014b) {
            encoderCallback = this.f12030r;
            executor = this.f12031s;
        }
        try {
            executor.execute(new Runnable() { // from class: PR
                @Override // java.lang.Runnable
                public final void run() {
                    EncoderImpl.m62017h(encoderCallback, i, str, th2);
                }
            });
        } catch (RejectedExecutionException e) {
            Logger.m63227e(this.f12013a, "Unable to post to the supplied executor.", e);
        }
    }

    /* renamed from: S */
    public final void m62033S() {
        if (this.f12009A) {
            this.f12017e.stop();
            this.f12009A = false;
        }
        this.f12017e.release();
        Encoder.EncoderInput encoderInput = this.f12018f;
        if (encoderInput instanceof C2672f) {
            ((C2672f) encoderInput).m61945d();
        }
        m62029W(InternalState.RELEASED);
        this.f12022j.set(null);
    }

    /* renamed from: T */
    public void m62032T() {
        Bundle bundle = new Bundle();
        bundle.putInt("request-sync", 0);
        this.f12017e.setParameters(bundle);
    }

    /* renamed from: U */
    public final void m62031U() {
        this.f12033u = f12008E;
        this.f12034v = 0L;
        this.f12027o.clear();
        this.f12023k.clear();
        for (CallbackToFutureAdapter.Completer completer : this.f12024l) {
            completer.setCancelled();
        }
        this.f12024l.clear();
        this.f12017e.reset();
        this.f12009A = false;
        this.f12010B = false;
        this.f12011C = false;
        this.f12035w = false;
        Future future = this.f12037y;
        if (future != null) {
            future.cancel(true);
            this.f12037y = null;
        }
        C2670e c2670e = this.f12038z;
        if (c2670e != null) {
            c2670e.m61951v();
        }
        C2670e c2670e2 = new C2670e();
        this.f12038z = c2670e2;
        this.f12017e.setCallback(c2670e2);
        this.f12017e.configure(this.f12016d, (Surface) null, (MediaCrypto) null, 1);
        Encoder.EncoderInput encoderInput = this.f12018f;
        if (encoderInput instanceof C2672f) {
            ((C2672f) encoderInput).m61944e();
        }
    }

    /* renamed from: V */
    public void m62030V(boolean z) {
        Bundle bundle = new Bundle();
        bundle.putInt("drop-input-frames", z ? 1 : 0);
        this.f12017e.setParameters(bundle);
    }

    /* renamed from: W */
    public final void m62029W(InternalState internalState) {
        if (this.f12032t == internalState) {
            return;
        }
        String str = this.f12013a;
        Logger.m63230d(str, "Transitioning encoder internal state: " + this.f12032t + " --> " + internalState);
        this.f12032t = internalState;
    }

    /* renamed from: X */
    public void m62028X() {
        Encoder.EncoderInput encoderInput = this.f12018f;
        if (encoderInput instanceof C2669d) {
            ((C2669d) encoderInput).m61973v(false);
            ArrayList arrayList = new ArrayList();
            for (InputBuffer inputBuffer : this.f12025m) {
                arrayList.add(inputBuffer.getTerminationFuture());
            }
            Futures.successfulAsList(arrayList).addListener(new Runnable() { // from class: CR
                {
                    EncoderImpl.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    EncoderImpl.m62016i(EncoderImpl.this);
                }
            }, this.f12020h);
        } else if (encoderInput instanceof C2672f) {
            try {
                this.f12017e.signalEndOfInputStream();
                this.f12011C = true;
            } catch (MediaCodec.CodecException e) {
                m62002w(e);
            }
        }
    }

    /* renamed from: Y */
    public final void m62027Y() {
        Futures.addCallback(m62008q(), new C2665a(), this.f12020h);
    }

    /* renamed from: Z */
    public void m62026Z(final Runnable runnable) {
        final ArrayList arrayList = new ArrayList();
        for (EncodedDataImpl encodedDataImpl : this.f12026n) {
            arrayList.add(encodedDataImpl.getClosedFuture());
        }
        for (InputBuffer inputBuffer : this.f12025m) {
            arrayList.add(inputBuffer.getTerminationFuture());
        }
        if (!arrayList.isEmpty()) {
            String str = this.f12013a;
            Logger.m63230d(str, "Waiting for resources to return. encoded data = " + this.f12026n.size() + ", input buffers = " + this.f12025m.size());
        }
        Futures.successfulAsList(arrayList).addListener(new Runnable() { // from class: BR
            {
                EncoderImpl.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                EncoderImpl.m62021d(EncoderImpl.this, arrayList, runnable);
            }
        }, this.f12020h);
    }

    /* renamed from: a0 */
    public void m62024a0(long j) {
        while (!this.f12027o.isEmpty()) {
            Range range = (Range) this.f12027o.getFirst();
            if (j > ((Long) range.getUpper()).longValue()) {
                this.f12027o.removeFirst();
                this.f12034v += ((Long) range.getUpper()).longValue() - ((Long) range.getLower()).longValue();
                Logger.m63230d(this.f12013a, "Total paused duration = " + DebugUtils.readableUs(this.f12034v));
            } else {
                return;
            }
        }
    }

    @Override // androidx.camera.video.internal.encoder.Encoder
    public int getConfiguredBitrate() {
        if (this.f12016d.containsKey("bitrate")) {
            return this.f12016d.getInteger("bitrate");
        }
        return 0;
    }

    @Override // androidx.camera.video.internal.encoder.Encoder
    @NonNull
    public EncoderInfo getEncoderInfo() {
        return this.f12019g;
    }

    @Override // androidx.camera.video.internal.encoder.Encoder
    @NonNull
    public Encoder.EncoderInput getInput() {
        return this.f12018f;
    }

    @Override // androidx.camera.video.internal.encoder.Encoder
    @NonNull
    public ListenableFuture<Void> getReleasedFuture() {
        return this.f12021i;
    }

    @Override // androidx.camera.video.internal.encoder.Encoder
    public void pause() {
        final long m62005t = m62005t();
        this.f12020h.execute(new Runnable() { // from class: zR
            {
                EncoderImpl.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                EncoderImpl.m62018g(EncoderImpl.this, m62005t);
            }
        });
    }

    /* renamed from: q */
    public ListenableFuture m62008q() {
        switch (C2667b.f12041a[this.f12032t.ordinal()]) {
            case 1:
                return Futures.immediateFailedFuture(new IllegalStateException("Encoder is not started yet."));
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                final AtomicReference atomicReference = new AtomicReference();
                ListenableFuture future = CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: ER
                    @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
                    public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                        return EncoderImpl.m62010o(atomicReference, completer);
                    }
                });
                final CallbackToFutureAdapter.Completer completer = (CallbackToFutureAdapter.Completer) Preconditions.checkNotNull((CallbackToFutureAdapter.Completer) atomicReference.get());
                this.f12024l.offer(completer);
                completer.addCancellationListener(new Runnable() { // from class: FR
                    {
                        EncoderImpl.this = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        EncoderImpl.m62014k(EncoderImpl.this, completer);
                    }
                }, this.f12020h);
                m62035Q();
                return future;
            case 8:
                return Futures.immediateFailedFuture(new IllegalStateException("Encoder is in error state."));
            case 9:
                return Futures.immediateFailedFuture(new IllegalStateException("Encoder is released."));
            default:
                throw new IllegalStateException("Unknown state: " + this.f12032t);
        }
    }

    /* renamed from: r */
    public final void m62007r(VideoEncoderInfo videoEncoderInfo, MediaFormat mediaFormat) {
        Preconditions.checkState(this.f12015c);
        if (mediaFormat.containsKey("bitrate")) {
            int integer = mediaFormat.getInteger("bitrate");
            int intValue = videoEncoderInfo.getSupportedBitrateRange().clamp(Integer.valueOf(integer)).intValue();
            if (integer != intValue) {
                mediaFormat.setInteger("bitrate", intValue);
                String str = this.f12013a;
                Logger.m63230d(str, "updated bitrate from " + integer + " to " + intValue);
            }
        }
    }

    @Override // androidx.camera.video.internal.encoder.Encoder
    public void release() {
        this.f12020h.execute(new Runnable() { // from class: GR
            {
                EncoderImpl.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                EncoderImpl.m62009p(EncoderImpl.this);
            }
        });
    }

    @Override // androidx.camera.video.internal.encoder.Encoder
    public void requestKeyFrame() {
        this.f12020h.execute(new Runnable() { // from class: HR
            {
                EncoderImpl.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                EncoderImpl.m62020e(EncoderImpl.this);
            }
        });
    }

    @Override // androidx.camera.video.internal.encoder.Encoder
    public void setEncoderCallback(@NonNull EncoderCallback encoderCallback, @NonNull Executor executor) {
        synchronized (this.f12014b) {
            this.f12030r = encoderCallback;
            this.f12031s = executor;
        }
    }

    public void signalSourceStopped() {
        this.f12020h.execute(new Runnable() { // from class: IR
            {
                EncoderImpl.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                EncoderImpl.m62015j(EncoderImpl.this);
            }
        });
    }

    @Override // androidx.camera.video.internal.encoder.Encoder
    public void start() {
        final long m62005t = m62005t();
        this.f12020h.execute(new Runnable() { // from class: JR
            {
                EncoderImpl.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                EncoderImpl.m62012m(EncoderImpl.this, m62005t);
            }
        });
    }

    @Override // androidx.camera.video.internal.encoder.Encoder
    public void stop() {
        stop(-1L);
    }

    /* renamed from: t */
    public long m62005t() {
        return this.f12029q.uptimeUs();
    }

    /* renamed from: u */
    public long m62004u(MediaCodec.BufferInfo bufferInfo) {
        long j = this.f12034v;
        if (j > 0) {
            return bufferInfo.presentationTimeUs - j;
        }
        return bufferInfo.presentationTimeUs;
    }

    /* renamed from: v */
    public void m62003v(final int i, final String str, final Throwable th2) {
        switch (C2667b.f12041a[this.f12032t.ordinal()]) {
            case 1:
                m62048D(i, str, th2);
                m62031U();
                return;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                m62029W(InternalState.ERROR);
                m62026Z(new Runnable() { // from class: NR
                    {
                        EncoderImpl.this = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        EncoderImpl.m62019f(EncoderImpl.this, i, str, th2);
                    }
                });
                return;
            case 8:
                String str2 = this.f12013a;
                Logger.m63222w(str2, "Get more than one error: " + str + "(" + i + ")", th2);
                return;
            default:
                return;
        }
    }

    /* renamed from: w */
    public void m62002w(MediaCodec.CodecException codecException) {
        m62003v(1, codecException.getMessage(), codecException);
    }

    /* renamed from: x */
    public void m62001x() {
        InternalState internalState = this.f12032t;
        if (internalState == InternalState.PENDING_RELEASE) {
            m62033S();
            return;
        }
        if (!this.f12009A) {
            m62031U();
        }
        m62029W(InternalState.CONFIGURED);
        if (internalState == InternalState.PENDING_START || internalState == InternalState.PENDING_START_PAUSED) {
            start();
            if (internalState == InternalState.PENDING_START_PAUSED) {
                pause();
            }
        }
    }

    /* renamed from: z */
    public boolean m61999z(long j) {
        for (Range range : this.f12027o) {
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
        final long m62005t = m62005t();
        this.f12020h.execute(new Runnable() { // from class: KR
            {
                EncoderImpl.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                EncoderImpl.m62013l(EncoderImpl.this, j, m62005t);
            }
        });
    }
}
