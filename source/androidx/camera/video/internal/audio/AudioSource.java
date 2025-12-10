package androidx.camera.video.internal.audio;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RequiresPermission;
import androidx.annotation.VisibleForTesting;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.Observable;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.impl.utils.futures.FutureCallback;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.camera.video.internal.BufferProvider;
import androidx.camera.video.internal.audio.AudioSettings;
import androidx.camera.video.internal.audio.AudioSource;
import androidx.camera.video.internal.audio.AudioStream;
import androidx.camera.video.internal.audio.AudioStreamImpl;
import androidx.camera.video.internal.encoder.InputBuffer;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.core.util.Preconditions;
import com.google.common.util.concurrent.ListenableFuture;
import java.nio.ByteBuffer;
import java.nio.ShortBuffer;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

@RequiresApi(21)
/* loaded from: classes.dex */
public final class AudioSource {

    /* renamed from: a */
    public final Executor f11872a;

    /* renamed from: b */
    public final AtomicReference f11873b;

    /* renamed from: c */
    public final AtomicBoolean f11874c;

    /* renamed from: d */
    public final AudioStream f11875d;

    /* renamed from: e */
    public final SilentAudioStream f11876e;

    /* renamed from: f */
    public final long f11877f;

    /* renamed from: g */
    public InternalState f11878g;

    /* renamed from: h */
    public BufferProvider.State f11879h;

    /* renamed from: i */
    public boolean f11880i;

    /* renamed from: j */
    public Executor f11881j;

    /* renamed from: k */
    public AudioSourceCallback f11882k;

    /* renamed from: l */
    public BufferProvider f11883l;

    /* renamed from: m */
    public FutureCallback f11884m;

    /* renamed from: n */
    public Observable.Observer f11885n;

    /* renamed from: o */
    public boolean f11886o;

    /* renamed from: p */
    public long f11887p;

    /* renamed from: q */
    public boolean f11888q;

    /* renamed from: r */
    public boolean f11889r;

    /* renamed from: s */
    public byte[] f11890s;

    /* renamed from: t */
    public double f11891t;

    /* renamed from: u */
    public long f11892u;

    /* renamed from: v */
    public final int f11893v;

    /* loaded from: classes.dex */
    public interface AudioSourceCallback {
        void onAmplitudeValue(double d);

        void onError(@NonNull Throwable th2);

        void onSilenceStateChanged(boolean z);

        @VisibleForTesting
        void onSuspendStateChanged(boolean z);
    }

    /* loaded from: classes.dex */
    public enum InternalState {
        CONFIGURED,
        STARTED,
        RELEASED
    }

    /* renamed from: androidx.camera.video.internal.audio.AudioSource$a */
    /* loaded from: classes.dex */
    public class C2646a implements Observable.Observer {

        /* renamed from: a */
        public final /* synthetic */ BufferProvider f11894a;

        public C2646a(BufferProvider bufferProvider) {
            AudioSource.this = r1;
            this.f11894a = bufferProvider;
        }

        @Override // androidx.camera.core.impl.Observable.Observer
        /* renamed from: a */
        public void onNewData(BufferProvider.State state) {
            Objects.requireNonNull(state);
            if (AudioSource.this.f11883l == this.f11894a) {
                Logger.m63230d("AudioSource", "Receive BufferProvider state change: " + AudioSource.this.f11879h + " to " + state);
                AudioSource audioSource = AudioSource.this;
                if (audioSource.f11879h != state) {
                    audioSource.f11879h = state;
                    audioSource.m62190N();
                }
            }
        }

        @Override // androidx.camera.core.impl.Observable.Observer
        public void onError(Throwable th2) {
            AudioSource audioSource = AudioSource.this;
            if (audioSource.f11883l == this.f11894a) {
                audioSource.m62201C(th2);
            }
        }
    }

    /* renamed from: androidx.camera.video.internal.audio.AudioSource$b */
    /* loaded from: classes.dex */
    public class C2647b implements FutureCallback {

        /* renamed from: a */
        public final /* synthetic */ BufferProvider f11896a;

        public C2647b(BufferProvider bufferProvider) {
            AudioSource.this = r1;
            this.f11896a = bufferProvider;
        }

        @Override // androidx.camera.core.impl.utils.futures.FutureCallback
        /* renamed from: a */
        public void onSuccess(InputBuffer inputBuffer) {
            AudioSource audioSource = AudioSource.this;
            if (audioSource.f11880i && audioSource.f11883l == this.f11896a) {
                if (audioSource.f11886o && audioSource.m62174p()) {
                    AudioSource.this.m62195I();
                }
                AudioStream m62176n = AudioSource.this.m62176n();
                ByteBuffer byteBuffer = inputBuffer.getByteBuffer();
                AudioStream.PacketInfo read = m62176n.read(byteBuffer);
                if (read.getSizeInBytes() > 0) {
                    AudioSource audioSource2 = AudioSource.this;
                    if (audioSource2.f11889r) {
                        audioSource2.m62198F(byteBuffer, read.getSizeInBytes());
                    }
                    if (AudioSource.this.f11881j != null) {
                        long timestampNs = read.getTimestampNs();
                        AudioSource audioSource3 = AudioSource.this;
                        if (timestampNs - audioSource3.f11892u >= 200) {
                            audioSource3.f11892u = read.getTimestampNs();
                            AudioSource.this.m62197G(byteBuffer);
                        }
                    }
                    byteBuffer.limit(byteBuffer.position() + read.getSizeInBytes());
                    inputBuffer.setPresentationTimeUs(TimeUnit.NANOSECONDS.toMicros(read.getTimestampNs()));
                    inputBuffer.submit();
                } else {
                    Logger.m63223w("AudioSource", "Unable to read data from AudioStream.");
                    inputBuffer.cancel();
                }
                AudioSource.this.m62194J();
                return;
            }
            inputBuffer.cancel();
        }

        @Override // androidx.camera.core.impl.utils.futures.FutureCallback
        public void onFailure(Throwable th2) {
            if (AudioSource.this.f11883l != this.f11896a) {
                return;
            }
            Logger.m63230d("AudioSource", "Unable to get input buffer, the BufferProvider could be transitioning to INACTIVE state.");
            if (!(th2 instanceof IllegalStateException)) {
                AudioSource.this.m62201C(th2);
            }
        }
    }

    /* renamed from: androidx.camera.video.internal.audio.AudioSource$c */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C2648c {

        /* renamed from: a */
        public static final /* synthetic */ int[] f11898a;

        static {
            int[] iArr = new int[InternalState.values().length];
            f11898a = iArr;
            try {
                iArr[InternalState.CONFIGURED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11898a[InternalState.STARTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f11898a[InternalState.RELEASED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* renamed from: androidx.camera.video.internal.audio.AudioSource$d */
    /* loaded from: classes.dex */
    public class C2649d implements AudioStream.AudioStreamCallback {
        public C2649d() {
            AudioSource.this = r1;
        }

        @Override // androidx.camera.video.internal.audio.AudioStream.AudioStreamCallback
        public void onSilenceStateChanged(boolean z) {
            AudioSource audioSource = AudioSource.this;
            audioSource.f11888q = z;
            if (audioSource.f11878g == InternalState.STARTED) {
                audioSource.m62200D();
            }
        }
    }

    @RequiresPermission("android.permission.RECORD_AUDIO")
    public AudioSource(@NonNull AudioSettings audioSettings, @NonNull Executor executor, @Nullable Context context) throws AudioSourceAccessException {
        this(audioSettings, executor, context, new InterfaceC2652a() { // from class: x7
            @Override // androidx.camera.video.internal.audio.InterfaceC2652a
            /* renamed from: a */
            public final AudioStream mo618a(AudioSettings audioSettings2, Context context2) {
                return new AudioStreamImpl(audioSettings2, context2);
            }
        }, 3000L);
    }

    /* renamed from: a */
    public static /* synthetic */ Object m62189a(AudioSource audioSource, CallbackToFutureAdapter.Completer completer) {
        return audioSource.m62167w(completer);
    }

    /* renamed from: b */
    public static /* synthetic */ void m62188b(AudioSource audioSource, Executor executor, AudioSourceCallback audioSourceCallback) {
        audioSource.m62166x(executor, audioSourceCallback);
    }

    /* renamed from: c */
    public static /* synthetic */ void m62187c(AudioSourceCallback audioSourceCallback, Throwable th2) {
        audioSourceCallback.onError(th2);
    }

    /* renamed from: d */
    public static /* synthetic */ void m62186d(AudioSource audioSource, BufferProvider bufferProvider) {
        audioSource.m62165y(bufferProvider);
    }

    /* renamed from: e */
    public static /* synthetic */ void m62185e(AudioSource audioSource, boolean z) {
        audioSource.m62173q(z);
    }

    /* renamed from: f */
    public static /* synthetic */ void m62184f(AudioSource audioSource, CallbackToFutureAdapter.Completer completer) {
        audioSource.m62168v(completer);
    }

    /* renamed from: g */
    public static /* synthetic */ void m62183g(AudioSource audioSource) {
        audioSource.m62202B();
    }

    /* renamed from: h */
    public static /* synthetic */ void m62182h(AudioSourceCallback audioSourceCallback, boolean z) {
        audioSourceCallback.onSilenceStateChanged(z);
    }

    /* renamed from: i */
    public static /* synthetic */ void m62181i(AudioSource audioSource, AudioSourceCallback audioSourceCallback) {
        audioSource.m62169u(audioSourceCallback);
    }

    public static boolean isSettingsSupported(int i, int i2, int i3) {
        return AudioStreamImpl.isSettingsSupported(i, i2, i3);
    }

    /* renamed from: j */
    public static /* synthetic */ void m62180j(AudioSourceCallback audioSourceCallback, boolean z) {
        audioSourceCallback.onSuspendStateChanged(z);
    }

    /* renamed from: k */
    public static /* synthetic */ void m62179k(AudioSource audioSource, boolean z) {
        audioSource.m62203A(z);
    }

    /* renamed from: l */
    public static /* synthetic */ void m62178l(AudioSource audioSource) {
        audioSource.m62164z();
    }

    /* renamed from: m */
    public static BufferProvider.State m62177m(BufferProvider bufferProvider) {
        try {
            ListenableFuture<BufferProvider.State> fetchData = bufferProvider.fetchData();
            if (!fetchData.isDone()) {
                return null;
            }
            return fetchData.get();
        } catch (InterruptedException | ExecutionException unused) {
            return null;
        }
    }

    /* renamed from: o */
    public static long m62175o() {
        return System.nanoTime();
    }

    /* renamed from: A */
    public final /* synthetic */ void m62203A(boolean z) {
        int i = C2648c.f11898a[this.f11878g.ordinal()];
        if (i != 1) {
            if (i == 3) {
                throw new AssertionError("AudioSource is released");
            }
            return;
        }
        this.f11873b.set(null);
        this.f11874c.set(false);
        m62193K(InternalState.STARTED);
        mute(z);
        m62190N();
    }

    /* renamed from: B */
    public final /* synthetic */ void m62202B() {
        int i = C2648c.f11898a[this.f11878g.ordinal()];
        if (i != 2) {
            if (i == 3) {
                Logger.m63223w("AudioSource", "AudioSource is released. Calling stop() is a no-op.");
                return;
            }
            return;
        }
        m62193K(InternalState.CONFIGURED);
        m62190N();
    }

    /* renamed from: C */
    public void m62201C(final Throwable th2) {
        Executor executor = this.f11881j;
        final AudioSourceCallback audioSourceCallback = this.f11882k;
        if (executor != null && audioSourceCallback != null) {
            executor.execute(new Runnable() { // from class: q7
                @Override // java.lang.Runnable
                public final void run() {
                    AudioSource.m62187c(audioSourceCallback, th2);
                }
            });
        }
    }

    /* renamed from: D */
    public void m62200D() {
        final boolean z;
        Executor executor = this.f11881j;
        final AudioSourceCallback audioSourceCallback = this.f11882k;
        if (executor != null && audioSourceCallback != null) {
            if (!this.f11889r && !this.f11886o && !this.f11888q) {
                z = false;
            } else {
                z = true;
            }
            if (!Objects.equals(this.f11873b.getAndSet(Boolean.valueOf(z)), Boolean.valueOf(z))) {
                executor.execute(new Runnable() { // from class: y7
                    @Override // java.lang.Runnable
                    public final void run() {
                        AudioSource.m62182h(audioSourceCallback, z);
                    }
                });
            }
        }
    }

    /* renamed from: E */
    public void m62199E(final boolean z) {
        Executor executor = this.f11881j;
        final AudioSourceCallback audioSourceCallback = this.f11882k;
        if (executor != null && audioSourceCallback != null && this.f11874c.getAndSet(z) != z) {
            executor.execute(new Runnable() { // from class: p7
                @Override // java.lang.Runnable
                public final void run() {
                    AudioSource.m62180j(audioSourceCallback, z);
                }
            });
        }
    }

    /* renamed from: F */
    public void m62198F(ByteBuffer byteBuffer, int i) {
        byte[] bArr = this.f11890s;
        if (bArr == null || bArr.length < i) {
            this.f11890s = new byte[i];
        }
        int position = byteBuffer.position();
        byteBuffer.put(this.f11890s, 0, i);
        byteBuffer.limit(byteBuffer.position()).position(position);
    }

    /* renamed from: G */
    public void m62197G(ByteBuffer byteBuffer) {
        Executor executor = this.f11881j;
        final AudioSourceCallback audioSourceCallback = this.f11882k;
        if (this.f11893v == 2) {
            ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
            double d = 0.0d;
            while (asShortBuffer.hasRemaining()) {
                d = Math.max(d, Math.abs((int) asShortBuffer.get()));
            }
            this.f11891t = d / 32767.0d;
            if (executor != null && audioSourceCallback != null) {
                executor.execute(new Runnable() { // from class: o7
                    {
                        AudioSource.this = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        AudioSource.m62181i(AudioSource.this, audioSourceCallback);
                    }
                });
            }
        }
    }

    /* renamed from: H */
    public final void m62196H(BufferProvider bufferProvider) {
        BufferProvider bufferProvider2 = this.f11883l;
        if (bufferProvider2 != null) {
            Observable.Observer observer = this.f11885n;
            Objects.requireNonNull(observer);
            bufferProvider2.removeObserver(observer);
            this.f11883l = null;
            this.f11885n = null;
            this.f11884m = null;
            this.f11879h = BufferProvider.State.INACTIVE;
            m62190N();
        }
        if (bufferProvider != null) {
            this.f11883l = bufferProvider;
            this.f11885n = new C2646a(bufferProvider);
            this.f11884m = new C2647b(bufferProvider);
            BufferProvider.State m62177m = m62177m(bufferProvider);
            if (m62177m != null) {
                this.f11879h = m62177m;
                m62190N();
            }
            this.f11883l.addObserver(this.f11872a, this.f11885n);
        }
    }

    /* renamed from: I */
    public void m62195I() {
        Preconditions.checkState(this.f11886o);
        try {
            this.f11875d.start();
            Logger.m63230d("AudioSource", "Retry start AudioStream succeed");
            this.f11876e.stop();
            this.f11886o = false;
        } catch (AudioStream.AudioStreamException e) {
            Logger.m63222w("AudioSource", "Retry start AudioStream failed", e);
            this.f11887p = m62175o();
        }
    }

    /* renamed from: J */
    public void m62194J() {
        BufferProvider bufferProvider = this.f11883l;
        Objects.requireNonNull(bufferProvider);
        ListenableFuture acquireBuffer = bufferProvider.acquireBuffer();
        FutureCallback futureCallback = this.f11884m;
        Objects.requireNonNull(futureCallback);
        Futures.addCallback(acquireBuffer, futureCallback, this.f11872a);
    }

    /* renamed from: K */
    public void m62193K(InternalState internalState) {
        Logger.m63230d("AudioSource", "Transitioning internal state: " + this.f11878g + " --> " + internalState);
        this.f11878g = internalState;
    }

    /* renamed from: L */
    public final void m62192L() {
        if (this.f11880i) {
            return;
        }
        try {
            Logger.m63230d("AudioSource", "startSendingAudio");
            this.f11875d.start();
            this.f11886o = false;
        } catch (AudioStream.AudioStreamException e) {
            Logger.m63222w("AudioSource", "Failed to start AudioStream", e);
            this.f11886o = true;
            this.f11876e.start();
            this.f11887p = m62175o();
            m62200D();
        }
        this.f11880i = true;
        m62194J();
    }

    /* renamed from: M */
    public final void m62191M() {
        if (!this.f11880i) {
            return;
        }
        this.f11880i = false;
        Logger.m63230d("AudioSource", "stopSendingAudio");
        this.f11875d.stop();
    }

    /* renamed from: N */
    public void m62190N() {
        boolean z;
        if (this.f11878g == InternalState.STARTED) {
            if (this.f11879h == BufferProvider.State.ACTIVE) {
                z = true;
            } else {
                z = false;
            }
            m62199E(!z);
            if (z) {
                m62192L();
                return;
            } else {
                m62191M();
                return;
            }
        }
        m62191M();
    }

    public void mute(final boolean z) {
        this.f11872a.execute(new Runnable() { // from class: n7
            {
                AudioSource.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                AudioSource.m62185e(AudioSource.this, z);
            }
        });
    }

    /* renamed from: n */
    public AudioStream m62176n() {
        if (this.f11886o) {
            return this.f11876e;
        }
        return this.f11875d;
    }

    /* renamed from: p */
    public boolean m62174p() {
        boolean z;
        if (this.f11887p > 0) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkState(z);
        if (m62175o() - this.f11887p < this.f11877f) {
            return false;
        }
        return true;
    }

    /* renamed from: q */
    public final /* synthetic */ void m62173q(boolean z) {
        int i = C2648c.f11898a[this.f11878g.ordinal()];
        if (i != 1 && i != 2) {
            if (i == 3) {
                throw new AssertionError("AudioSource is released");
            }
        } else if (this.f11889r == z) {
        } else {
            this.f11889r = z;
            if (this.f11878g == InternalState.STARTED) {
                m62200D();
            }
        }
    }

    @NonNull
    public ListenableFuture<Void> release() {
        return CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: s7
            {
                AudioSource.this = this;
            }

            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                return AudioSource.m62189a(AudioSource.this, completer);
            }
        });
    }

    public void setAudioSourceCallback(@NonNull final Executor executor, @NonNull final AudioSourceCallback audioSourceCallback) {
        this.f11872a.execute(new Runnable() { // from class: v7
            {
                AudioSource.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                AudioSource.m62188b(AudioSource.this, executor, audioSourceCallback);
            }
        });
    }

    public void setBufferProvider(@NonNull final BufferProvider<? extends InputBuffer> bufferProvider) {
        this.f11872a.execute(new Runnable() { // from class: w7
            {
                AudioSource.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                AudioSource.m62186d(AudioSource.this, bufferProvider);
            }
        });
    }

    public void start() {
        this.f11872a.execute(new Runnable() { // from class: u7
            {
                AudioSource.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                AudioSource.m62178l(AudioSource.this);
            }
        });
    }

    public void stop() {
        this.f11872a.execute(new Runnable() { // from class: r7
            {
                AudioSource.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                AudioSource.m62183g(AudioSource.this);
            }
        });
    }

    /* renamed from: u */
    public final /* synthetic */ void m62169u(AudioSourceCallback audioSourceCallback) {
        audioSourceCallback.onAmplitudeValue(this.f11891t);
    }

    /* renamed from: v */
    public final /* synthetic */ void m62168v(CallbackToFutureAdapter.Completer completer) {
        try {
            int i = C2648c.f11898a[this.f11878g.ordinal()];
            if (i == 1 || i == 2) {
                m62196H(null);
                this.f11876e.release();
                this.f11875d.release();
                m62191M();
                m62193K(InternalState.RELEASED);
            }
            completer.set(null);
        } catch (Throwable th2) {
            completer.setException(th2);
        }
    }

    /* renamed from: w */
    public final /* synthetic */ Object m62167w(final CallbackToFutureAdapter.Completer completer) {
        this.f11872a.execute(new Runnable() { // from class: z7
            {
                AudioSource.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                AudioSource.m62184f(AudioSource.this, completer);
            }
        });
        return "AudioSource-release";
    }

    /* renamed from: x */
    public final /* synthetic */ void m62166x(Executor executor, AudioSourceCallback audioSourceCallback) {
        int i = C2648c.f11898a[this.f11878g.ordinal()];
        if (i != 1) {
            if (i == 2 || i == 3) {
                throw new AssertionError("The audio recording callback must be registered before the audio source is started.");
            }
            return;
        }
        this.f11881j = executor;
        this.f11882k = audioSourceCallback;
    }

    /* renamed from: y */
    public final /* synthetic */ void m62165y(BufferProvider bufferProvider) {
        int i = C2648c.f11898a[this.f11878g.ordinal()];
        if (i != 1 && i != 2) {
            if (i == 3) {
                throw new AssertionError("AudioSource is released");
            }
        } else if (this.f11883l != bufferProvider) {
            m62196H(bufferProvider);
        }
    }

    /* renamed from: z */
    public final /* synthetic */ void m62164z() {
        start(this.f11889r);
    }

    public AudioSource(AudioSettings audioSettings, Executor executor, Context context, InterfaceC2652a interfaceC2652a, long j) {
        this.f11873b = new AtomicReference(null);
        this.f11874c = new AtomicBoolean(false);
        this.f11878g = InternalState.CONFIGURED;
        this.f11879h = BufferProvider.State.INACTIVE;
        this.f11892u = 0L;
        Executor newSequentialExecutor = CameraXExecutors.newSequentialExecutor(executor);
        this.f11872a = newSequentialExecutor;
        this.f11877f = TimeUnit.MILLISECONDS.toNanos(j);
        try {
            BufferedAudioStream bufferedAudioStream = new BufferedAudioStream(interfaceC2652a.mo618a(audioSettings, context), audioSettings);
            this.f11875d = bufferedAudioStream;
            bufferedAudioStream.setCallback(new C2649d(), newSequentialExecutor);
            this.f11876e = new SilentAudioStream(audioSettings);
            this.f11893v = audioSettings.getAudioFormat();
        } catch (AudioStream.AudioStreamException | IllegalArgumentException e) {
            throw new AudioSourceAccessException("Unable to create AudioStream", e);
        }
    }

    public void start(final boolean z) {
        this.f11872a.execute(new Runnable() { // from class: t7
            {
                AudioSource.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                AudioSource.m62179k(AudioSource.this, z);
            }
        });
    }
}
