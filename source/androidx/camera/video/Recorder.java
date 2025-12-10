package androidx.camera.video;

import android.content.ContentValues;
import android.content.Context;
import android.location.Location;
import android.media.MediaMuxer;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.util.Pair;
import android.util.Range;
import android.util.Size;
import android.view.Surface;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.camera.core.CameraInfo;
import androidx.camera.core.DynamicRange;
import androidx.camera.core.Logger;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.core.impl.MutableStateObservable;
import androidx.camera.core.impl.Observable;
import androidx.camera.core.impl.StateObservable;
import androidx.camera.core.impl.Timebase;
import androidx.camera.core.impl.utils.CloseGuardHelper;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.impl.utils.futures.FutureCallback;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.camera.core.internal.utils.ArrayRingBuffer;
import androidx.camera.core.internal.utils.RingBuffer;
import androidx.camera.video.MediaSpec;
import androidx.camera.video.QualitySelector;
import androidx.camera.video.Recorder;
import androidx.camera.video.StreamInfo;
import androidx.camera.video.VideoOutput;
import androidx.camera.video.VideoRecordEvent;
import androidx.camera.video.VideoSpec;
import androidx.camera.video.internal.DebugUtils;
import androidx.camera.video.internal.VideoValidatedEncoderProfilesProxy;
import androidx.camera.video.internal.audio.AudioSettings;
import androidx.camera.video.internal.audio.AudioSource;
import androidx.camera.video.internal.audio.AudioSourceAccessException;
import androidx.camera.video.internal.compat.Api26Impl;
import androidx.camera.video.internal.compat.quirk.DeactivateEncoderSurfaceBeforeStopEncoderQuirk;
import androidx.camera.video.internal.compat.quirk.DeviceQuirks;
import androidx.camera.video.internal.compat.quirk.EncoderNotUsePersistentInputSurfaceQuirk;
import androidx.camera.video.internal.config.AudioConfigUtil;
import androidx.camera.video.internal.config.AudioMimeInfo;
import androidx.camera.video.internal.encoder.BufferCopiedEncodedData;
import androidx.camera.video.internal.encoder.EncodeException;
import androidx.camera.video.internal.encoder.EncodedData;
import androidx.camera.video.internal.encoder.Encoder;
import androidx.camera.video.internal.encoder.EncoderCallback;
import androidx.camera.video.internal.encoder.EncoderConfig;
import androidx.camera.video.internal.encoder.EncoderFactory;
import androidx.camera.video.internal.encoder.EncoderImpl;
import androidx.camera.video.internal.encoder.OutputConfig;
import androidx.camera.video.internal.encoder.VideoEncoderInfo;
import androidx.camera.video.internal.utils.OutputUtil;
import androidx.camera.video.internal.workaround.CorrectNegativeLatLongForMediaMuxer;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.core.util.Consumer;
import androidx.core.util.Preconditions;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

@RequiresApi(21)
/* loaded from: classes.dex */
public final class Recorder implements VideoOutput {
    public static final QualitySelector DEFAULT_QUALITY_SELECTOR;

    /* renamed from: g0 */
    public static final Set f11638g0 = Collections.unmodifiableSet(EnumSet.of(State.PENDING_RECORDING, State.PENDING_PAUSED));

    /* renamed from: h0 */
    public static final Set f11639h0 = Collections.unmodifiableSet(EnumSet.of(State.CONFIGURING, State.IDLING, State.RESETTING, State.STOPPING, State.ERROR));

    /* renamed from: i0 */
    public static final VideoSpec f11640i0;

    /* renamed from: j0 */
    public static final MediaSpec f11641j0;

    /* renamed from: k0 */
    public static final Exception f11642k0;

    /* renamed from: l0 */
    public static final EncoderFactory f11643l0;

    /* renamed from: m0 */
    public static final Executor f11644m0;

    /* renamed from: A */
    public MediaMuxer f11645A;

    /* renamed from: B */
    public final MutableStateObservable f11646B;

    /* renamed from: C */
    public AudioSource f11647C;

    /* renamed from: D */
    public Encoder f11648D;

    /* renamed from: E */
    public OutputConfig f11649E;

    /* renamed from: F */
    public Encoder f11650F;

    /* renamed from: G */
    public OutputConfig f11651G;

    /* renamed from: H */
    public AudioState f11652H;

    /* renamed from: I */
    public Uri f11653I;

    /* renamed from: J */
    public long f11654J;

    /* renamed from: K */
    public long f11655K;

    /* renamed from: L */
    public long f11656L;

    /* renamed from: M */
    public int f11657M;

    /* renamed from: N */
    public Range f11658N;

    /* renamed from: O */
    public long f11659O;

    /* renamed from: P */
    public long f11660P;

    /* renamed from: Q */
    public long f11661Q;

    /* renamed from: R */
    public long f11662R;

    /* renamed from: S */
    public long f11663S;

    /* renamed from: T */
    public int f11664T;

    /* renamed from: U */
    public Throwable f11665U;

    /* renamed from: V */
    public EncodedData f11666V;

    /* renamed from: W */
    public final RingBuffer f11667W;

    /* renamed from: X */
    public Throwable f11668X;

    /* renamed from: Y */
    public boolean f11669Y;

    /* renamed from: Z */
    public VideoOutput.SourceState f11670Z;

    /* renamed from: a */
    public final MutableStateObservable f11671a;

    /* renamed from: a0 */
    public ScheduledFuture f11672a0;

    /* renamed from: b */
    public final Executor f11673b;

    /* renamed from: b0 */
    public boolean f11674b0;

    /* renamed from: c */
    public final Executor f11675c;

    /* renamed from: c0 */
    public VideoEncoderSession f11676c0;

    /* renamed from: d */
    public final Executor f11677d;

    /* renamed from: d0 */
    public VideoEncoderSession f11678d0;

    /* renamed from: e */
    public final EncoderFactory f11679e;

    /* renamed from: e0 */
    public double f11680e0;

    /* renamed from: f */
    public final EncoderFactory f11681f;

    /* renamed from: f0 */
    public boolean f11682f0;

    /* renamed from: g */
    public final Object f11683g = new Object();

    /* renamed from: h */
    public final boolean f11684h;

    /* renamed from: i */
    public State f11685i;

    /* renamed from: j */
    public State f11686j;

    /* renamed from: k */
    public int f11687k;

    /* renamed from: l */
    public AbstractC2615i f11688l;

    /* renamed from: m */
    public AbstractC2615i f11689m;

    /* renamed from: n */
    public long f11690n;

    /* renamed from: o */
    public AbstractC2615i f11691o;

    /* renamed from: p */
    public boolean f11692p;

    /* renamed from: q */
    public SurfaceRequest.TransformationInfo f11693q;

    /* renamed from: r */
    public SurfaceRequest.TransformationInfo f11694r;

    /* renamed from: s */
    public VideoValidatedEncoderProfilesProxy f11695s;

    /* renamed from: t */
    public final List f11696t;

    /* renamed from: u */
    public Integer f11697u;

    /* renamed from: v */
    public Integer f11698v;

    /* renamed from: w */
    public SurfaceRequest f11699w;

    /* renamed from: x */
    public Timebase f11700x;

    /* renamed from: y */
    public Surface f11701y;

    /* renamed from: z */
    public Surface f11702z;

    /* loaded from: classes.dex */
    public enum AudioState {
        INITIALIZING,
        IDLING,
        DISABLED,
        ENABLED,
        ERROR_ENCODER,
        ERROR_SOURCE
    }

    @RequiresApi(21)
    /* loaded from: classes.dex */
    public static final class Builder {

        /* renamed from: a */
        public final MediaSpec.Builder f11703a;

        /* renamed from: b */
        public Executor f11704b = null;

        /* renamed from: c */
        public EncoderFactory f11705c;

        /* renamed from: d */
        public EncoderFactory f11706d;

        public Builder() {
            EncoderFactory encoderFactory = Recorder.f11643l0;
            this.f11705c = encoderFactory;
            this.f11706d = encoderFactory;
            this.f11703a = MediaSpec.builder();
        }

        /* renamed from: b */
        public static /* synthetic */ void m62418b(int i, VideoSpec.Builder builder) {
            m62414f(i, builder);
        }

        /* renamed from: c */
        public static /* synthetic */ void m62417c(int i, VideoSpec.Builder builder) {
            builder.mo61932a(i);
        }

        /* renamed from: f */
        public static /* synthetic */ void m62414f(int i, VideoSpec.Builder builder) {
            builder.setBitrate(new Range<>(Integer.valueOf(i), Integer.valueOf(i)));
        }

        @NonNull
        public Recorder build() {
            return new Recorder(this.f11704b, this.f11703a.build(), this.f11705c, this.f11706d);
        }

        @NonNull
        public Builder setAspectRatio(final int i) {
            this.f11703a.configureVideo(new Consumer() { // from class: Os1
                @Override // androidx.core.util.Consumer
                public final void accept(Object obj) {
                    Recorder.Builder.m62417c(i, (VideoSpec.Builder) obj);
                }
            });
            return this;
        }

        @NonNull
        public Builder setExecutor(@NonNull Executor executor) {
            Preconditions.checkNotNull(executor, "The specified executor can't be null.");
            this.f11704b = executor;
            return this;
        }

        @NonNull
        public Builder setQualitySelector(@NonNull final QualitySelector qualitySelector) {
            Preconditions.checkNotNull(qualitySelector, "The specified quality selector can't be null.");
            this.f11703a.configureVideo(new Consumer() { // from class: Ps1
                @Override // androidx.core.util.Consumer
                public final void accept(Object obj) {
                    ((VideoSpec.Builder) obj).setQualitySelector(QualitySelector.this);
                }
            });
            return this;
        }

        @NonNull
        public Builder setTargetVideoEncodingBitRate(@IntRange(from = 1) final int i) {
            if (i > 0) {
                this.f11703a.configureVideo(new Consumer() { // from class: Ns1
                    @Override // androidx.core.util.Consumer
                    public final void accept(Object obj) {
                        Recorder.Builder.m62418b(i, (VideoSpec.Builder) obj);
                    }
                });
                return this;
            }
            throw new IllegalArgumentException("The requested target bitrate " + i + " is not supported. Target bitrate must be greater than 0.");
        }
    }

    /* loaded from: classes.dex */
    public enum State {
        CONFIGURING,
        PENDING_RECORDING,
        PENDING_PAUSED,
        IDLING,
        RECORDING,
        PAUSED,
        STOPPING,
        RESETTING,
        ERROR
    }

    /* renamed from: androidx.camera.video.Recorder$a */
    /* loaded from: classes.dex */
    public class C2607a implements FutureCallback {

        /* renamed from: a */
        public final /* synthetic */ VideoEncoderSession f11707a;

        public C2607a(VideoEncoderSession videoEncoderSession) {
            Recorder.this = r1;
            this.f11707a = videoEncoderSession;
        }

        @Override // androidx.camera.core.impl.utils.futures.FutureCallback
        /* renamed from: a */
        public void onSuccess(Encoder encoder) {
            boolean z;
            Logger.m63230d("Recorder", "VideoEncoder is created. " + encoder);
            if (encoder == null) {
                return;
            }
            boolean z2 = false;
            if (Recorder.this.f11676c0 == this.f11707a) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkState(z);
            if (Recorder.this.f11648D == null) {
                z2 = true;
            }
            Preconditions.checkState(z2);
            Recorder.this.m62460f0(this.f11707a);
            Recorder.this.m62473Y();
        }

        @Override // androidx.camera.core.impl.utils.futures.FutureCallback
        public void onFailure(Throwable th2) {
            Logger.m63230d("Recorder", "VideoEncoder Setup error: " + th2);
            Recorder.this.m62472Z(th2);
        }
    }

    /* renamed from: androidx.camera.video.Recorder$b */
    /* loaded from: classes.dex */
    public class C2608b implements FutureCallback {

        /* renamed from: a */
        public final /* synthetic */ VideoEncoderSession f11709a;

        public C2608b(VideoEncoderSession videoEncoderSession) {
            Recorder.this = r1;
            this.f11709a = videoEncoderSession;
        }

        @Override // androidx.camera.core.impl.utils.futures.FutureCallback
        /* renamed from: a */
        public void onSuccess(Encoder encoder) {
            Encoder encoder2;
            Logger.m63230d("Recorder", "VideoEncoder can be released: " + encoder);
            if (encoder == null) {
                return;
            }
            ScheduledFuture scheduledFuture = Recorder.this.f11672a0;
            if (scheduledFuture != null && scheduledFuture.cancel(false) && (encoder2 = Recorder.this.f11648D) != null && encoder2 == encoder) {
                Recorder.m62474X(encoder2);
            }
            Recorder recorder = Recorder.this;
            recorder.f11678d0 = this.f11709a;
            recorder.m62432t0(null);
            Recorder recorder2 = Recorder.this;
            recorder2.m62450k0(4, null, recorder2.m62506C());
        }

        @Override // androidx.camera.core.impl.utils.futures.FutureCallback
        public void onFailure(Throwable th2) {
            Logger.m63230d("Recorder", "Error in ReadyToReleaseFuture: " + th2);
        }
    }

    /* renamed from: androidx.camera.video.Recorder$c */
    /* loaded from: classes.dex */
    public class C2609c implements FutureCallback {

        /* renamed from: a */
        public final /* synthetic */ AudioSource f11711a;

        public C2609c(AudioSource audioSource) {
            Recorder.this = r1;
            this.f11711a = audioSource;
        }

        @Override // androidx.camera.core.impl.utils.futures.FutureCallback
        /* renamed from: a */
        public void onSuccess(Void r3) {
            Logger.m63230d("Recorder", String.format("Released audio source successfully: 0x%x", Integer.valueOf(this.f11711a.hashCode())));
        }

        @Override // androidx.camera.core.impl.utils.futures.FutureCallback
        public void onFailure(Throwable th2) {
            Logger.m63230d("Recorder", String.format("An error occurred while attempting to release audio source: 0x%x", Integer.valueOf(this.f11711a.hashCode())));
        }
    }

    /* renamed from: androidx.camera.video.Recorder$d */
    /* loaded from: classes.dex */
    public class C2610d implements EncoderCallback {

        /* renamed from: a */
        public final /* synthetic */ CallbackToFutureAdapter.Completer f11713a;

        /* renamed from: b */
        public final /* synthetic */ AbstractC2615i f11714b;

        public C2610d(CallbackToFutureAdapter.Completer completer, AbstractC2615i abstractC2615i) {
            Recorder.this = r1;
            this.f11713a = completer;
            this.f11714b = abstractC2615i;
        }

        @Override // androidx.camera.video.internal.encoder.EncoderCallback
        public void onEncodeError(EncodeException encodeException) {
            this.f11713a.setException(encodeException);
        }

        @Override // androidx.camera.video.internal.encoder.EncoderCallback
        public /* synthetic */ void onEncodePaused() {
            AbstractC17047xR.m509a(this);
        }

        @Override // androidx.camera.video.internal.encoder.EncoderCallback
        public void onEncodeStart() {
        }

        @Override // androidx.camera.video.internal.encoder.EncoderCallback
        public void onEncodeStop() {
            this.f11713a.set(null);
        }

        @Override // androidx.camera.video.internal.encoder.EncoderCallback
        public void onEncodedData(EncodedData encodedData) {
            boolean z;
            Recorder recorder = Recorder.this;
            if (recorder.f11645A == null) {
                if (!recorder.f11692p) {
                    EncodedData encodedData2 = recorder.f11666V;
                    if (encodedData2 != null) {
                        encodedData2.close();
                        Recorder.this.f11666V = null;
                        z = true;
                    } else {
                        z = false;
                    }
                    if (encodedData.isKeyFrame()) {
                        Recorder recorder2 = Recorder.this;
                        recorder2.f11666V = encodedData;
                        if (recorder2.m62510A() && Recorder.this.f11667W.isEmpty()) {
                            if (z) {
                                Logger.m63230d("Recorder", "Replaced cached video keyframe with newer keyframe.");
                                return;
                            } else {
                                Logger.m63230d("Recorder", "Cached video keyframe while we wait for first audio sample before starting muxer.");
                                return;
                            }
                        }
                        Logger.m63230d("Recorder", "Received video keyframe. Starting muxer...");
                        Recorder.this.m62426w0(this.f11714b);
                        return;
                    }
                    if (z) {
                        Logger.m63230d("Recorder", "Dropped cached keyframe since we have new video data and have not yet received audio data.");
                    }
                    Logger.m63230d("Recorder", "Dropped video data since muxer has not yet started and data is not a keyframe.");
                    Recorder.this.f11648D.requestKeyFrame();
                    encodedData.close();
                    return;
                }
                Logger.m63230d("Recorder", "Drop video data since recording is stopping.");
                encodedData.close();
                return;
            }
            try {
                recorder.m62485M0(encodedData, this.f11714b);
                if (encodedData != null) {
                    encodedData.close();
                }
            } catch (Throwable th2) {
                if (encodedData != null) {
                    try {
                        encodedData.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        }

        @Override // androidx.camera.video.internal.encoder.EncoderCallback
        public void onOutputConfigUpdate(OutputConfig outputConfig) {
            Recorder.this.f11649E = outputConfig;
        }
    }

    /* renamed from: androidx.camera.video.Recorder$e */
    /* loaded from: classes.dex */
    public class C2611e implements AudioSource.AudioSourceCallback {

        /* renamed from: a */
        public final /* synthetic */ Consumer f11716a;

        public C2611e(Consumer consumer) {
            Recorder.this = r1;
            this.f11716a = consumer;
        }

        @Override // androidx.camera.video.internal.audio.AudioSource.AudioSourceCallback
        public void onAmplitudeValue(double d) {
            Recorder.this.f11680e0 = d;
        }

        @Override // androidx.camera.video.internal.audio.AudioSource.AudioSourceCallback
        public void onError(Throwable th2) {
            Logger.m63227e("Recorder", "Error occurred after audio source started.", th2);
            if (th2 instanceof AudioSourceAccessException) {
                this.f11716a.accept(th2);
            }
        }

        @Override // androidx.camera.video.internal.audio.AudioSource.AudioSourceCallback
        public void onSilenceStateChanged(boolean z) {
            Recorder recorder = Recorder.this;
            if (recorder.f11669Y != z) {
                recorder.f11669Y = z;
                recorder.m62491J0();
                return;
            }
            Logger.m63223w("Recorder", "Audio source silenced transitions to the same state " + z);
        }

        @Override // androidx.camera.video.internal.audio.AudioSource.AudioSourceCallback
        public /* synthetic */ void onSuspendStateChanged(boolean z) {
            AbstractC0010A7.m69137a(this, z);
        }
    }

    /* renamed from: androidx.camera.video.Recorder$f */
    /* loaded from: classes.dex */
    public class C2612f implements EncoderCallback {

        /* renamed from: a */
        public final /* synthetic */ CallbackToFutureAdapter.Completer f11718a;

        /* renamed from: b */
        public final /* synthetic */ Consumer f11719b;

        /* renamed from: c */
        public final /* synthetic */ AbstractC2615i f11720c;

        public C2612f(CallbackToFutureAdapter.Completer completer, Consumer consumer, AbstractC2615i abstractC2615i) {
            Recorder.this = r1;
            this.f11718a = completer;
            this.f11719b = consumer;
            this.f11720c = abstractC2615i;
        }

        @Override // androidx.camera.video.internal.encoder.EncoderCallback
        public void onEncodeError(EncodeException encodeException) {
            if (Recorder.this.f11668X == null) {
                this.f11719b.accept(encodeException);
            }
        }

        @Override // androidx.camera.video.internal.encoder.EncoderCallback
        public /* synthetic */ void onEncodePaused() {
            AbstractC17047xR.m509a(this);
        }

        @Override // androidx.camera.video.internal.encoder.EncoderCallback
        public void onEncodeStart() {
        }

        @Override // androidx.camera.video.internal.encoder.EncoderCallback
        public void onEncodeStop() {
            this.f11718a.set(null);
        }

        @Override // androidx.camera.video.internal.encoder.EncoderCallback
        public void onEncodedData(EncodedData encodedData) {
            Recorder recorder = Recorder.this;
            if (recorder.f11652H != AudioState.DISABLED) {
                if (recorder.f11645A == null) {
                    if (!recorder.f11692p) {
                        recorder.f11667W.enqueue(new BufferCopiedEncodedData(encodedData));
                        if (Recorder.this.f11666V != null) {
                            Logger.m63230d("Recorder", "Received audio data. Starting muxer...");
                            Recorder.this.m62426w0(this.f11720c);
                        } else {
                            Logger.m63230d("Recorder", "Cached audio data while we wait for video keyframe before starting muxer.");
                        }
                    } else {
                        Logger.m63230d("Recorder", "Drop audio data since recording is stopping.");
                    }
                    encodedData.close();
                    return;
                }
                try {
                    recorder.m62487L0(encodedData, this.f11720c);
                    if (encodedData != null) {
                        encodedData.close();
                        return;
                    }
                    return;
                } catch (Throwable th2) {
                    if (encodedData != null) {
                        try {
                            encodedData.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                    }
                    throw th2;
                }
            }
            encodedData.close();
            throw new AssertionError("Audio is not enabled but audio encoded data is being produced.");
        }

        @Override // androidx.camera.video.internal.encoder.EncoderCallback
        public void onOutputConfigUpdate(OutputConfig outputConfig) {
            Recorder.this.f11651G = outputConfig;
        }
    }

    /* renamed from: androidx.camera.video.Recorder$g */
    /* loaded from: classes.dex */
    public class C2613g implements FutureCallback {
        public C2613g() {
            Recorder.this = r1;
        }

        @Override // androidx.camera.core.impl.utils.futures.FutureCallback
        /* renamed from: a */
        public void onSuccess(List list) {
            Logger.m63230d("Recorder", "Encodings end successfully.");
            Recorder recorder = Recorder.this;
            recorder.m62433t(recorder.f11664T, recorder.f11665U);
        }

        @Override // androidx.camera.core.impl.utils.futures.FutureCallback
        public void onFailure(Throwable th2) {
            boolean z;
            int i;
            if (Recorder.this.f11691o != null) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkState(z, "In-progress recording shouldn't be null");
            if (!Recorder.this.f11691o.mo62229w()) {
                Logger.m63230d("Recorder", "Encodings end with error: " + th2);
                Recorder recorder = Recorder.this;
                if (recorder.f11645A == null) {
                    i = 8;
                } else {
                    i = 6;
                }
                recorder.m62433t(i, th2);
            }
        }
    }

    /* renamed from: androidx.camera.video.Recorder$h */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C2614h {

        /* renamed from: a */
        public static final /* synthetic */ int[] f11723a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f11724b;

        static {
            int[] iArr = new int[AudioState.values().length];
            f11724b = iArr;
            try {
                iArr[AudioState.ERROR_ENCODER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11724b[AudioState.ERROR_SOURCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f11724b[AudioState.ENABLED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f11724b[AudioState.DISABLED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f11724b[AudioState.IDLING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f11724b[AudioState.INITIALIZING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr2 = new int[State.values().length];
            f11723a = iArr2;
            try {
                iArr2[State.PAUSED.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f11723a[State.RECORDING.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f11723a[State.PENDING_PAUSED.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f11723a[State.PENDING_RECORDING.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f11723a[State.RESETTING.ordinal()] = 5;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f11723a[State.STOPPING.ordinal()] = 6;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f11723a[State.CONFIGURING.ordinal()] = 7;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f11723a[State.ERROR.ordinal()] = 8;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f11723a[State.IDLING.ordinal()] = 9;
            } catch (NoSuchFieldError unused15) {
            }
        }
    }

    /* renamed from: androidx.camera.video.Recorder$i */
    /* loaded from: classes.dex */
    public static abstract class AbstractC2615i implements AutoCloseable {

        /* renamed from: a */
        public final CloseGuardHelper f11725a = CloseGuardHelper.create();

        /* renamed from: b */
        public final AtomicBoolean f11726b = new AtomicBoolean(false);

        /* renamed from: c */
        public final AtomicReference f11727c = new AtomicReference(null);

        /* renamed from: d */
        public final AtomicReference f11728d = new AtomicReference(null);

        /* renamed from: e */
        public final AtomicReference f11729e = new AtomicReference(new Consumer() { // from class: Us1
            @Override // androidx.core.util.Consumer
            public final void accept(Object obj) {
                Recorder.AbstractC2615i.m62400d((Uri) obj);
            }
        });

        /* renamed from: f */
        public final AtomicBoolean f11730f = new AtomicBoolean(false);

        /* renamed from: androidx.camera.video.Recorder$i$a */
        /* loaded from: classes.dex */
        public class C2616a implements InterfaceC2618c {

            /* renamed from: a */
            public final /* synthetic */ Context f11731a;

            public C2616a(Context context) {
                AbstractC2615i.this = r1;
                this.f11731a = context;
            }

            @Override // androidx.camera.video.Recorder.AbstractC2615i.InterfaceC2618c
            /* renamed from: a */
            public AudioSource mo62386a(AudioSettings audioSettings, Executor executor) {
                return new AudioSource(audioSettings, executor, this.f11731a);
            }
        }

        /* renamed from: androidx.camera.video.Recorder$i$b */
        /* loaded from: classes.dex */
        public class C2617b implements InterfaceC2618c {
            public C2617b() {
                AbstractC2615i.this = r1;
            }

            @Override // androidx.camera.video.Recorder.AbstractC2615i.InterfaceC2618c
            /* renamed from: a */
            public AudioSource mo62386a(AudioSettings audioSettings, Executor executor) {
                return new AudioSource(audioSettings, executor, null);
            }
        }

        /* renamed from: androidx.camera.video.Recorder$i$c */
        /* loaded from: classes.dex */
        public interface InterfaceC2618c {
            /* renamed from: a */
            AudioSource mo62386a(AudioSettings audioSettings, Executor executor);
        }

        /* renamed from: androidx.camera.video.Recorder$i$d */
        /* loaded from: classes.dex */
        public interface InterfaceC2619d {
            /* renamed from: a */
            MediaMuxer mo62385a(int i, Consumer consumer);
        }

        /* renamed from: A */
        public static /* synthetic */ void m62409A(MediaStoreOutputOptions mediaStoreOutputOptions, Context context, Uri uri) {
            if (uri.equals(Uri.EMPTY)) {
                return;
            }
            String absolutePathFromUri = OutputUtil.getAbsolutePathFromUri(mediaStoreOutputOptions.getContentResolver(), uri, "_data");
            if (absolutePathFromUri != null) {
                MediaScannerConnection.scanFile(context, new String[]{absolutePathFromUri}, null, new MediaScannerConnection.OnScanCompletedListener() { // from class: Ws1
                    @Override // android.media.MediaScannerConnection.OnScanCompletedListener
                    public final void onScanCompleted(String str, Uri uri2) {
                        Recorder.AbstractC2615i.m62401b(str, uri2);
                    }
                });
                return;
            }
            Logger.m63230d("Recorder", "Skipping media scanner scan. Unable to retrieve file path from URI: " + uri);
        }

        /* renamed from: B */
        public static /* synthetic */ void m62408B(ParcelFileDescriptor parcelFileDescriptor, Uri uri) {
            try {
                parcelFileDescriptor.close();
            } catch (IOException e) {
                Logger.m63227e("Recorder", "Failed to close dup'd ParcelFileDescriptor", e);
            }
        }

        /* renamed from: C */
        public static /* synthetic */ void m62407C(Uri uri) {
        }

        /* renamed from: b */
        public static /* synthetic */ void m62401b(String str, Uri uri) {
            m62387z(str, uri);
        }

        /* renamed from: d */
        public static /* synthetic */ void m62400d(Uri uri) {
            m62407C(uri);
        }

        /* renamed from: g */
        public static /* synthetic */ void m62399g(MediaStoreOutputOptions mediaStoreOutputOptions, Context context, Uri uri) {
            m62409A(mediaStoreOutputOptions, context, uri);
        }

        /* renamed from: i */
        public static /* synthetic */ void m62398i(MediaStoreOutputOptions mediaStoreOutputOptions, Uri uri) {
            m62388y(mediaStoreOutputOptions, uri);
        }

        /* renamed from: j */
        public static /* synthetic */ void m62397j(AbstractC2615i abstractC2615i, VideoRecordEvent videoRecordEvent) {
            abstractC2615i.m62406D(videoRecordEvent);
        }

        /* renamed from: k */
        public static /* synthetic */ MediaMuxer m62396k(OutputOptions outputOptions, ParcelFileDescriptor parcelFileDescriptor, int i, Consumer consumer) {
            return m62389x(outputOptions, parcelFileDescriptor, i, consumer);
        }

        /* renamed from: l */
        public static /* synthetic */ void m62395l(ParcelFileDescriptor parcelFileDescriptor, Uri uri) {
            m62408B(parcelFileDescriptor, uri);
        }

        /* renamed from: o */
        public static AbstractC2615i m62392o(PendingRecording pendingRecording, long j) {
            return new C2644h(pendingRecording.m62522d(), pendingRecording.m62523c(), pendingRecording.m62524b(), pendingRecording.m62520f(), pendingRecording.m62519g(), j);
        }

        /* renamed from: x */
        public static /* synthetic */ MediaMuxer m62389x(OutputOptions outputOptions, ParcelFileDescriptor parcelFileDescriptor, int i, Consumer consumer) {
            MediaMuxer createMediaMuxer;
            MediaMuxer mediaMuxer;
            Uri uri = Uri.EMPTY;
            if (outputOptions instanceof FileOutputOptions) {
                File file = ((FileOutputOptions) outputOptions).getFile();
                if (!OutputUtil.createParentFolder(file)) {
                    Logger.m63223w("Recorder", "Failed to create folder for " + file.getAbsolutePath());
                }
                mediaMuxer = new MediaMuxer(file.getAbsolutePath(), i);
                uri = Uri.fromFile(file);
            } else if (outputOptions instanceof FileDescriptorOutputOptions) {
                if (Build.VERSION.SDK_INT >= 26) {
                    mediaMuxer = Api26Impl.createMediaMuxer(parcelFileDescriptor.getFileDescriptor(), i);
                } else {
                    throw new IOException("MediaMuxer doesn't accept FileDescriptor as output destination.");
                }
            } else if (outputOptions instanceof MediaStoreOutputOptions) {
                MediaStoreOutputOptions mediaStoreOutputOptions = (MediaStoreOutputOptions) outputOptions;
                ContentValues contentValues = new ContentValues(mediaStoreOutputOptions.getContentValues());
                int i2 = Build.VERSION.SDK_INT;
                if (i2 >= 29) {
                    contentValues.put("is_pending", (Integer) 1);
                }
                try {
                    Uri insert = mediaStoreOutputOptions.getContentResolver().insert(mediaStoreOutputOptions.getCollectionUri(), contentValues);
                    if (insert != null) {
                        if (i2 < 26) {
                            String absolutePathFromUri = OutputUtil.getAbsolutePathFromUri(mediaStoreOutputOptions.getContentResolver(), insert, "_data");
                            if (absolutePathFromUri != null) {
                                if (!OutputUtil.createParentFolder(new File(absolutePathFromUri))) {
                                    Logger.m63223w("Recorder", "Failed to create folder for " + absolutePathFromUri);
                                }
                                createMediaMuxer = new MediaMuxer(absolutePathFromUri, i);
                            } else {
                                throw new IOException("Unable to get path from uri " + insert);
                            }
                        } else {
                            ParcelFileDescriptor openFileDescriptor = mediaStoreOutputOptions.getContentResolver().openFileDescriptor(insert, "rw");
                            createMediaMuxer = Api26Impl.createMediaMuxer(openFileDescriptor.getFileDescriptor(), i);
                            openFileDescriptor.close();
                        }
                        uri = insert;
                        mediaMuxer = createMediaMuxer;
                    } else {
                        throw new IOException("Unable to create MediaStore entry.");
                    }
                } catch (RuntimeException e) {
                    throw new IOException("Unable to create MediaStore entry by " + e, e);
                }
            } else {
                throw new AssertionError("Invalid output options type: " + outputOptions.getClass().getSimpleName());
            }
            consumer.accept(uri);
            return mediaMuxer;
        }

        /* renamed from: y */
        public static /* synthetic */ void m62388y(MediaStoreOutputOptions mediaStoreOutputOptions, Uri uri) {
            if (uri.equals(Uri.EMPTY)) {
                return;
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("is_pending", (Integer) 0);
            mediaStoreOutputOptions.getContentResolver().update(uri, contentValues, null, null);
        }

        /* renamed from: z */
        public static /* synthetic */ void m62387z(String str, Uri uri) {
            if (uri == null) {
                Logger.m63228e("Recorder", String.format("File scanning operation failed [path: %s]", str));
            } else {
                Logger.m63230d("Recorder", String.format("File scan completed successfully [path: %s, URI: %s]", str, uri));
            }
        }

        /* renamed from: D */
        public final /* synthetic */ void m62406D(VideoRecordEvent videoRecordEvent) {
            mo62233q().accept(videoRecordEvent);
        }

        /* renamed from: E */
        public void m62405E(boolean z) {
            this.f11730f.set(z);
        }

        /* renamed from: F */
        public AudioSource m62404F(AudioSettings audioSettings, Executor executor) {
            if (mo62230t()) {
                InterfaceC2618c interfaceC2618c = (InterfaceC2618c) this.f11728d.getAndSet(null);
                if (interfaceC2618c != null) {
                    return interfaceC2618c.mo62386a(audioSettings, executor);
                }
                throw new AssertionError("One-time audio source creation has already occurred for recording " + this);
            }
            throw new AssertionError("Recording does not have audio enabled. Unable to create audio source for recording " + this);
        }

        /* renamed from: G */
        public MediaMuxer m62403G(int i, Consumer consumer) {
            if (this.f11726b.get()) {
                InterfaceC2619d interfaceC2619d = (InterfaceC2619d) this.f11727c.getAndSet(null);
                if (interfaceC2619d != null) {
                    try {
                        return interfaceC2619d.mo62385a(i, consumer);
                    } catch (RuntimeException e) {
                        throw new IOException("Failed to create MediaMuxer by " + e, e);
                    }
                }
                throw new AssertionError("One-time media muxer creation has already occurred for recording " + this);
            }
            throw new AssertionError("Recording " + this + " has not been initialized");
        }

        /* renamed from: H */
        public void m62402H(final VideoRecordEvent videoRecordEvent) {
            VideoRecordEvent.Finalize finalize;
            if (Objects.equals(videoRecordEvent.getOutputOptions(), mo62232r())) {
                String str = "Sending VideoRecordEvent " + videoRecordEvent.getClass().getSimpleName();
                if (videoRecordEvent instanceof VideoRecordEvent.Finalize) {
                    if (((VideoRecordEvent.Finalize) videoRecordEvent).hasError()) {
                        str = str + String.format(" [error: %s]", VideoRecordEvent.Finalize.m62269g(finalize.getError()));
                    }
                }
                Logger.m63230d("Recorder", str);
                if (mo62234p() != null && mo62233q() != null) {
                    try {
                        mo62234p().execute(new Runnable() { // from class: Vs1
                            {
                                Recorder.AbstractC2615i.this = this;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                Recorder.AbstractC2615i.m62397j(Recorder.AbstractC2615i.this, videoRecordEvent);
                            }
                        });
                        return;
                    } catch (RejectedExecutionException e) {
                        Logger.m63227e("Recorder", "The callback executor is invalid.", e);
                        return;
                    }
                }
                return;
            }
            throw new AssertionError("Attempted to update event listener with event from incorrect recording [Recording: " + videoRecordEvent.getOutputOptions() + ", Expected: " + mo62232r() + "]");
        }

        @Override // java.lang.AutoCloseable
        public void close() {
            m62394m(Uri.EMPTY);
        }

        public void finalize() {
            try {
                this.f11725a.warnIfOpen();
                Consumer consumer = (Consumer) this.f11729e.getAndSet(null);
                if (consumer != null) {
                    m62393n(consumer, Uri.EMPTY);
                }
            } finally {
                super.finalize();
            }
        }

        /* renamed from: m */
        public void m62394m(Uri uri) {
            if (!this.f11726b.get()) {
                return;
            }
            m62393n((Consumer) this.f11729e.getAndSet(null), uri);
        }

        /* renamed from: n */
        public final void m62393n(Consumer consumer, Uri uri) {
            if (consumer != null) {
                this.f11725a.close();
                consumer.accept(uri);
                return;
            }
            throw new AssertionError("Recording " + this + " has already been finalized");
        }

        /* renamed from: p */
        public abstract Executor mo62234p();

        /* renamed from: q */
        public abstract Consumer mo62233q();

        /* renamed from: r */
        public abstract OutputOptions mo62232r();

        /* renamed from: s */
        public abstract long mo62231s();

        /* renamed from: t */
        public abstract boolean mo62230t();

        /* renamed from: u */
        public void m62391u(final Context context) {
            final ParcelFileDescriptor parcelFileDescriptor;
            if (!this.f11726b.getAndSet(true)) {
                final OutputOptions mo62232r = mo62232r();
                boolean z = mo62232r instanceof FileDescriptorOutputOptions;
                Consumer consumer = null;
                if (z) {
                    parcelFileDescriptor = ((FileDescriptorOutputOptions) mo62232r).getParcelFileDescriptor().dup();
                } else {
                    parcelFileDescriptor = null;
                }
                this.f11725a.open("finalizeRecording");
                this.f11727c.set(new InterfaceC2619d() { // from class: Qs1
                    @Override // androidx.camera.video.Recorder.AbstractC2615i.InterfaceC2619d
                    /* renamed from: a */
                    public final MediaMuxer mo62385a(int i, Consumer consumer2) {
                        return Recorder.AbstractC2615i.m62396k(mo62232r, parcelFileDescriptor, i, consumer2);
                    }
                });
                if (mo62230t()) {
                    if (Build.VERSION.SDK_INT >= 31) {
                        this.f11728d.set(new C2616a(context));
                    } else {
                        this.f11728d.set(new C2617b());
                    }
                }
                if (mo62232r instanceof MediaStoreOutputOptions) {
                    final MediaStoreOutputOptions mediaStoreOutputOptions = (MediaStoreOutputOptions) mo62232r;
                    if (Build.VERSION.SDK_INT >= 29) {
                        consumer = new Consumer() { // from class: Rs1
                            @Override // androidx.core.util.Consumer
                            public final void accept(Object obj) {
                                Recorder.AbstractC2615i.m62398i(mediaStoreOutputOptions, (Uri) obj);
                            }
                        };
                    } else {
                        consumer = new Consumer() { // from class: Ss1
                            @Override // androidx.core.util.Consumer
                            public final void accept(Object obj) {
                                Recorder.AbstractC2615i.m62399g(mediaStoreOutputOptions, context, (Uri) obj);
                            }
                        };
                    }
                } else if (z) {
                    consumer = new Consumer() { // from class: Ts1
                        @Override // androidx.core.util.Consumer
                        public final void accept(Object obj) {
                            Recorder.AbstractC2615i.m62395l(parcelFileDescriptor, (Uri) obj);
                        }
                    };
                }
                if (consumer != null) {
                    this.f11729e.set(consumer);
                    return;
                }
                return;
            }
            throw new AssertionError("Recording " + this + " has already been initialized");
        }

        /* renamed from: v */
        public boolean m62390v() {
            return this.f11730f.get();
        }

        /* renamed from: w */
        public abstract boolean mo62229w();
    }

    static {
        Quality quality = Quality.FHD;
        QualitySelector fromOrderedList = QualitySelector.fromOrderedList(Arrays.asList(quality, Quality.f11631HD, Quality.f11632SD), FallbackStrategy.higherQualityOrLowerThan(quality));
        DEFAULT_QUALITY_SELECTOR = fromOrderedList;
        VideoSpec build = VideoSpec.builder().setQualitySelector(fromOrderedList).mo61932a(-1).build();
        f11640i0 = build;
        f11641j0 = MediaSpec.builder().setOutputFormat(-1).setVideoSpec(build).build();
        f11642k0 = new RuntimeException("The video frame producer became inactive before any data was received.");
        f11643l0 = new EncoderFactory() { // from class: Ms1
            @Override // androidx.camera.video.internal.encoder.EncoderFactory
            public final Encoder createEncoder(Executor executor, EncoderConfig encoderConfig) {
                return new EncoderImpl(executor, encoderConfig);
            }
        };
        f11644m0 = CameraXExecutors.newSequentialExecutor(CameraXExecutors.ioExecutor());
    }

    public Recorder(Executor executor, MediaSpec mediaSpec, EncoderFactory encoderFactory, EncoderFactory encoderFactory2) {
        boolean z;
        if (DeviceQuirks.get(EncoderNotUsePersistentInputSurfaceQuirk.class) != null) {
            z = true;
        } else {
            z = false;
        }
        this.f11684h = z;
        this.f11685i = State.CONFIGURING;
        this.f11686j = null;
        this.f11687k = 0;
        this.f11688l = null;
        this.f11689m = null;
        this.f11690n = 0L;
        this.f11691o = null;
        this.f11692p = false;
        this.f11693q = null;
        this.f11694r = null;
        this.f11695s = null;
        this.f11696t = new ArrayList();
        this.f11697u = null;
        this.f11698v = null;
        this.f11701y = null;
        this.f11702z = null;
        this.f11645A = null;
        this.f11647C = null;
        this.f11648D = null;
        this.f11649E = null;
        this.f11650F = null;
        this.f11651G = null;
        this.f11652H = AudioState.INITIALIZING;
        this.f11653I = Uri.EMPTY;
        this.f11654J = 0L;
        this.f11655K = 0L;
        this.f11656L = Long.MAX_VALUE;
        this.f11657M = 0;
        this.f11658N = null;
        this.f11659O = Long.MAX_VALUE;
        this.f11660P = Long.MAX_VALUE;
        this.f11661Q = Long.MAX_VALUE;
        this.f11662R = 0L;
        this.f11663S = 0L;
        this.f11664T = 1;
        this.f11665U = null;
        this.f11666V = null;
        this.f11667W = new ArrayRingBuffer(60);
        this.f11668X = null;
        this.f11669Y = false;
        this.f11670Z = VideoOutput.SourceState.INACTIVE;
        this.f11672a0 = null;
        this.f11674b0 = false;
        this.f11678d0 = null;
        this.f11680e0 = 0.0d;
        this.f11682f0 = false;
        this.f11673b = executor;
        executor = executor == null ? CameraXExecutors.ioExecutor() : executor;
        this.f11675c = executor;
        Executor newSequentialExecutor = CameraXExecutors.newSequentialExecutor(executor);
        this.f11677d = newSequentialExecutor;
        this.f11646B = MutableStateObservable.withInitialState(m62437r(mediaSpec));
        this.f11671a = MutableStateObservable.withInitialState(StreamInfo.m62362a(this.f11687k, m62421z(this.f11685i)));
        this.f11679e = encoderFactory;
        this.f11681f = encoderFactory2;
        this.f11676c0 = new VideoEncoderSession(encoderFactory, newSequentialExecutor, executor);
    }

    /* renamed from: D */
    public static boolean m62504D(Recording recording, AbstractC2615i abstractC2615i) {
        if (abstractC2615i == null || recording.m62365i() != abstractC2615i.mo62231s()) {
            return false;
        }
        return true;
    }

    /* renamed from: E */
    public static /* synthetic */ void m62502E(VideoSpec.Builder builder) {
        builder.mo61932a(f11640i0.mo61933a());
    }

    /* renamed from: F0 */
    public static int m62499F0(VideoValidatedEncoderProfilesProxy videoValidatedEncoderProfilesProxy, int i) {
        if (videoValidatedEncoderProfilesProxy != null) {
            int recommendedFileFormat = videoValidatedEncoderProfilesProxy.getRecommendedFileFormat();
            if (recommendedFileFormat != 1) {
                if (recommendedFileFormat == 2) {
                    return 0;
                }
                if (recommendedFileFormat == 9) {
                    return 1;
                }
            } else if (Build.VERSION.SDK_INT < 26) {
                return 0;
            } else {
                return 2;
            }
        }
        return i;
    }

    /* renamed from: P */
    public static /* synthetic */ void m62482P(Encoder encoder) {
        Logger.m63230d("Recorder", "The source didn't become non-streaming before timeout. Waited 1000ms");
        if (DeviceQuirks.get(DeactivateEncoderSurfaceBeforeStopEncoderQuirk.class) != null) {
            m62474X(encoder);
        }
    }

    /* renamed from: X */
    public static void m62474X(Encoder encoder) {
        if (encoder instanceof EncoderImpl) {
            ((EncoderImpl) encoder).signalSourceStopped();
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m62471a(Recorder recorder, AbstractC2615i abstractC2615i) {
        recorder.m62492J(abstractC2615i);
    }

    /* renamed from: b */
    public static /* synthetic */ void m62469b(Encoder encoder) {
        m62482P(encoder);
    }

    /* renamed from: c */
    public static /* synthetic */ void m62467c(Recorder recorder, AbstractC2615i abstractC2615i) {
        recorder.m62490K(abstractC2615i);
    }

    /* renamed from: e */
    public static /* synthetic */ void m62463e(Recorder recorder, CallbackToFutureAdapter.Completer completer, Throwable th2) {
        recorder.m62479S(completer, th2);
    }

    /* renamed from: g */
    public static /* synthetic */ void m62459g(Recorder recorder, Uri uri) {
        recorder.m62488L(uri);
    }

    @NonNull
    public static VideoCapabilities getVideoCapabilities(@NonNull CameraInfo cameraInfo) {
        return RecorderVideoCapabilities.m62381d(cameraInfo);
    }

    /* renamed from: h */
    public static /* synthetic */ void m62457h(Recorder recorder, VideoOutput.SourceState sourceState) {
        recorder.m62496H(sourceState);
    }

    /* renamed from: i */
    public static /* synthetic */ void m62455i(Recorder recorder, AbstractC2615i abstractC2615i, long j, int i, Throwable th2) {
        recorder.m62483O(abstractC2615i, j, i, th2);
    }

    /* renamed from: j */
    public static /* synthetic */ void m62453j(VideoSpec.Builder builder) {
        m62502E(builder);
    }

    /* renamed from: k */
    public static /* synthetic */ void m62451k(Recorder recorder, Encoder encoder) {
        recorder.m62481Q(encoder);
    }

    /* renamed from: l */
    public static /* synthetic */ void m62449l(Recorder recorder, AbstractC2615i abstractC2615i, boolean z) {
        recorder.m62498G(abstractC2615i, z);
    }

    /* renamed from: m */
    public static /* synthetic */ void m62447m(Recorder recorder) {
        recorder.m62484N();
    }

    /* renamed from: n */
    public static /* synthetic */ Object m62445n(Recorder recorder, AbstractC2615i abstractC2615i, CallbackToFutureAdapter.Completer completer) {
        return recorder.m62480R(abstractC2615i, completer);
    }

    /* renamed from: o */
    public static /* synthetic */ Object m62443o(Recorder recorder, AbstractC2615i abstractC2615i, CallbackToFutureAdapter.Completer completer) {
        return recorder.m62478T(abstractC2615i, completer);
    }

    /* renamed from: A */
    public boolean m62510A() {
        if (this.f11652H == AudioState.ENABLED) {
            return true;
        }
        return false;
    }

    /* renamed from: A0 */
    public Recording m62509A0(PendingRecording pendingRecording) {
        long j;
        AbstractC2615i abstractC2615i;
        int i;
        AbstractC2615i abstractC2615i2;
        IOException e;
        boolean z;
        Preconditions.checkNotNull(pendingRecording, "The given PendingRecording cannot be null.");
        synchronized (this.f11683g) {
            try {
                j = this.f11690n + 1;
                this.f11690n = j;
                abstractC2615i = null;
                i = 0;
                switch (C2614h.f11723a[this.f11685i.ordinal()]) {
                    case 1:
                    case 2:
                        abstractC2615i2 = this.f11688l;
                        abstractC2615i = abstractC2615i2;
                        e = null;
                        break;
                    case 3:
                    case 4:
                        abstractC2615i2 = (AbstractC2615i) Preconditions.checkNotNull(this.f11689m);
                        abstractC2615i = abstractC2615i2;
                        e = null;
                        break;
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                        State state = this.f11685i;
                        State state2 = State.IDLING;
                        if (state == state2) {
                            if (this.f11688l == null && this.f11689m == null) {
                                z = true;
                            } else {
                                z = false;
                            }
                            Preconditions.checkState(z, "Expected recorder to be idle but a recording is either pending or in progress.");
                        }
                        try {
                            AbstractC2615i m62392o = AbstractC2615i.m62392o(pendingRecording, j);
                            m62392o.m62391u(pendingRecording.m62525a());
                            this.f11689m = m62392o;
                            State state3 = this.f11685i;
                            if (state3 == state2) {
                                m62430u0(State.PENDING_RECORDING);
                                this.f11677d.execute(new Runnable() { // from class: Es1
                                    {
                                        Recorder.this = this;
                                    }

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        Recorder.this.m62495H0();
                                    }
                                });
                            } else if (state3 == State.ERROR) {
                                m62430u0(State.PENDING_RECORDING);
                                this.f11677d.execute(new Runnable() { // from class: Fs1
                                    {
                                        Recorder.this = this;
                                    }

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        Recorder.m62447m(Recorder.this);
                                    }
                                });
                            } else {
                                m62430u0(State.PENDING_RECORDING);
                            }
                            e = null;
                            break;
                        } catch (IOException e2) {
                            e = e2;
                            i = 5;
                            break;
                        }
                        break;
                    default:
                        e = null;
                        break;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (abstractC2615i == null) {
            if (i != 0) {
                Logger.m63228e("Recorder", "Recording was started when the Recorder had encountered error " + e);
                m62431u(AbstractC2615i.m62392o(pendingRecording, j), i, e);
                return Recording.m62368b(pendingRecording, j);
            }
            return Recording.m62367d(pendingRecording, j);
        }
        throw new IllegalStateException("A recording is already in progress. Previous recordings must be stopped before a new recording can be started.");
    }

    /* renamed from: B */
    public boolean m62508B() {
        if (((MediaSpec) m62425x(this.f11646B)).getAudioSpec().getChannelCount() != 0) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:87:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x00e2  */
    /* renamed from: B0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m62507B0(androidx.camera.video.Recorder.AbstractC2615i r8) {
        /*
            Method dump skipped, instructions count: 312
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.video.Recorder.m62507B0(androidx.camera.video.Recorder$i):void");
    }

    /* renamed from: C */
    public boolean m62506C() {
        AbstractC2615i abstractC2615i = this.f11691o;
        if (abstractC2615i != null && abstractC2615i.mo62229w()) {
            return true;
        }
        return false;
    }

    /* renamed from: C0 */
    public final void m62505C0(AbstractC2615i abstractC2615i, boolean z) {
        m62507B0(abstractC2615i);
        if (z) {
            m62492J(abstractC2615i);
        }
    }

    /* renamed from: D0 */
    public void m62503D0(Recording recording, final int i, final Throwable th2) {
        synchronized (this.f11683g) {
            try {
                if (!m62504D(recording, this.f11689m) && !m62504D(recording, this.f11688l)) {
                    Logger.m63230d("Recorder", "stop() called on a recording that is no longer active: " + recording.m62366g());
                    return;
                }
                AbstractC2615i abstractC2615i = null;
                switch (C2614h.f11723a[this.f11685i.ordinal()]) {
                    case 1:
                    case 2:
                        m62430u0(State.STOPPING);
                        final long micros = TimeUnit.NANOSECONDS.toMicros(System.nanoTime());
                        final AbstractC2615i abstractC2615i2 = this.f11688l;
                        this.f11677d.execute(new Runnable() { // from class: Hs1
                            {
                                Recorder.this = this;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                Recorder.m62455i(Recorder.this, abstractC2615i2, micros, i, th2);
                            }
                        });
                        break;
                    case 3:
                    case 4:
                        Preconditions.checkState(m62504D(recording, this.f11689m));
                        AbstractC2615i abstractC2615i3 = this.f11689m;
                        this.f11689m = null;
                        m62444n0();
                        abstractC2615i = abstractC2615i3;
                        break;
                    case 5:
                    case 6:
                        Preconditions.checkState(m62504D(recording, this.f11688l));
                        break;
                    case 7:
                    case 9:
                        throw new IllegalStateException("Calling stop() while idling or initializing is invalid.");
                }
                if (abstractC2615i != null) {
                    if (i == 10) {
                        Logger.m63228e("Recorder", "Recording was stopped due to recording being garbage collected before any valid data has been produced.");
                    }
                    m62431u(abstractC2615i, 8, new RuntimeException("Recording was stopped before any data could be produced.", th2));
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    /* renamed from: E0 */
    public void m62483O(AbstractC2615i abstractC2615i, long j, int i, Throwable th2) {
        if (this.f11691o == abstractC2615i && !this.f11692p) {
            this.f11692p = true;
            this.f11664T = i;
            this.f11665U = th2;
            if (m62510A()) {
                m62439q();
                this.f11650F.stop(j);
            }
            EncodedData encodedData = this.f11666V;
            if (encodedData != null) {
                encodedData.close();
                this.f11666V = null;
            }
            if (this.f11670Z != VideoOutput.SourceState.ACTIVE_NON_STREAMING) {
                final Encoder encoder = this.f11648D;
                this.f11672a0 = CameraXExecutors.mainThreadExecutor().schedule(new Runnable() { // from class: ws1
                    @Override // java.lang.Runnable
                    public final void run() {
                        Recorder.m62451k(Recorder.this, encoder);
                    }
                }, 1000L, TimeUnit.MILLISECONDS);
            } else {
                m62474X(this.f11648D);
            }
            this.f11648D.stop(j);
        }
    }

    /* renamed from: F */
    public final /* synthetic */ void m62500F(SurfaceRequest.TransformationInfo transformationInfo) {
        this.f11694r = transformationInfo;
    }

    /* renamed from: G0 */
    public final void m62497G0() {
        boolean z;
        VideoEncoderSession videoEncoderSession = this.f11678d0;
        if (videoEncoderSession != null) {
            if (videoEncoderSession.m62288m() == this.f11648D) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkState(z);
            Logger.m63230d("Recorder", "Releasing video encoder: " + this.f11648D);
            this.f11678d0.m62277x();
            this.f11678d0 = null;
            this.f11648D = null;
            this.f11649E = null;
            m62432t0(null);
            return;
        }
        m62438q0();
    }

    /* renamed from: H0 */
    public void m62495H0() {
        int i;
        boolean z;
        AbstractC2615i abstractC2615i;
        boolean z2;
        Exception exc;
        AbstractC2615i abstractC2615i2;
        synchronized (this.f11683g) {
            try {
                int i2 = C2614h.f11723a[this.f11685i.ordinal()];
                i = 4;
                z = false;
                abstractC2615i = null;
                if (i2 != 3) {
                    if (i2 == 4) {
                        z2 = false;
                    }
                    exc = null;
                    abstractC2615i2 = null;
                    i = 0;
                } else {
                    z2 = true;
                }
                if (this.f11688l == null && !this.f11674b0) {
                    if (this.f11670Z == VideoOutput.SourceState.INACTIVE) {
                        abstractC2615i2 = this.f11689m;
                        this.f11689m = null;
                        m62444n0();
                        z = z2;
                        exc = f11642k0;
                    } else if (this.f11648D != null) {
                        z = z2;
                        exc = null;
                        i = 0;
                        abstractC2615i = m62477U(this.f11685i);
                        abstractC2615i2 = null;
                    }
                }
                z = z2;
                exc = null;
                abstractC2615i2 = null;
                i = 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (abstractC2615i != null) {
            m62505C0(abstractC2615i, z);
        } else if (abstractC2615i2 != null) {
            m62431u(abstractC2615i2, i, exc);
        }
    }

    /* renamed from: I0 */
    public final void m62493I0(final AbstractC2615i abstractC2615i, boolean z) {
        if (!this.f11696t.isEmpty()) {
            ListenableFuture allAsList = Futures.allAsList(this.f11696t);
            if (!allAsList.isDone()) {
                allAsList.cancel(true);
            }
            this.f11696t.clear();
        }
        this.f11696t.add(CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: xs1
            {
                Recorder.this = this;
            }

            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                return Recorder.m62445n(Recorder.this, abstractC2615i, completer);
            }
        }));
        if (m62510A() && !z) {
            this.f11696t.add(CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: ys1
                {
                    Recorder.this = this;
                }

                @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
                public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                    return Recorder.m62443o(Recorder.this, abstractC2615i, completer);
                }
            }));
        }
        Futures.addCallback(Futures.allAsList(this.f11696t), new C2613g(), CameraXExecutors.directExecutor());
    }

    /* renamed from: J0 */
    public void m62491J0() {
        AbstractC2615i abstractC2615i = this.f11691o;
        if (abstractC2615i != null) {
            abstractC2615i.m62402H(VideoRecordEvent.m62270f(abstractC2615i.mo62232r(), m62427w()));
        }
    }

    /* renamed from: K0 */
    public final void m62489K0(State state) {
        if (f11638g0.contains(this.f11685i)) {
            if (f11639h0.contains(state)) {
                if (this.f11686j != state) {
                    this.f11686j = state;
                    this.f11671a.setState(StreamInfo.m62361b(this.f11687k, m62421z(state), this.f11693q));
                    return;
                }
                return;
            }
            throw new AssertionError("Invalid state transition. State is not a valid non-pending state while in a pending state: " + state);
        }
        throw new AssertionError("Can only updated non-pending state from a pending state, but state is " + this.f11685i);
    }

    /* renamed from: L */
    public final /* synthetic */ void m62488L(Uri uri) {
        this.f11653I = uri;
    }

    /* renamed from: L0 */
    public void m62487L0(EncodedData encodedData, AbstractC2615i abstractC2615i) {
        boolean z;
        long size = this.f11654J + encodedData.size();
        long j = this.f11662R;
        if (j != 0 && size > j) {
            Logger.m63230d("Recorder", String.format("Reach file size limit %d > %d", Long.valueOf(size), Long.valueOf(this.f11662R)));
            m62470a0(abstractC2615i, 2, null);
            return;
        }
        long presentationTimeUs = encodedData.getPresentationTimeUs();
        long j2 = this.f11659O;
        if (j2 == Long.MAX_VALUE) {
            this.f11659O = presentationTimeUs;
            Logger.m63230d("Recorder", String.format("First audio time: %d (%s)", Long.valueOf(presentationTimeUs), DebugUtils.readableUs(this.f11659O)));
        } else {
            TimeUnit timeUnit = TimeUnit.MICROSECONDS;
            long nanos = timeUnit.toNanos(presentationTimeUs - Math.min(this.f11656L, j2));
            if (this.f11661Q != Long.MAX_VALUE) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkState(z, "There should be a previous data for adjusting the duration.");
            long nanos2 = nanos + timeUnit.toNanos(presentationTimeUs - this.f11661Q);
            long j3 = this.f11663S;
            if (j3 != 0 && nanos2 > j3) {
                Logger.m63230d("Recorder", String.format("Audio data reaches duration limit %d > %d", Long.valueOf(nanos2), Long.valueOf(this.f11663S)));
                m62470a0(abstractC2615i, 9, null);
                return;
            }
        }
        this.f11645A.writeSampleData(this.f11697u.intValue(), encodedData.getByteBuffer(), encodedData.getBufferInfo());
        this.f11654J = size;
        this.f11661Q = presentationTimeUs;
    }

    /* renamed from: M */
    public final /* synthetic */ void m62486M(SurfaceRequest surfaceRequest, Timebase timebase) {
        if (!surfaceRequest.isServiced() && (!this.f11676c0.m62287n(surfaceRequest) || m62506C())) {
            VideoEncoderSession videoEncoderSession = new VideoEncoderSession(this.f11679e, this.f11677d, this.f11675c);
            ListenableFuture m62292i = videoEncoderSession.m62292i(surfaceRequest, timebase, (MediaSpec) m62425x(this.f11646B), this.f11695s);
            this.f11676c0 = videoEncoderSession;
            Futures.addCallback(m62292i, new C2607a(videoEncoderSession), this.f11677d);
            return;
        }
        Logger.m63223w("Recorder", "Ignore the SurfaceRequest " + surfaceRequest + " isServiced: " + surfaceRequest.isServiced() + " VideoEncoderSession: " + this.f11676c0 + " has been configured with a persistent in-progress recording.");
    }

    /* renamed from: M0 */
    public void m62485M0(EncodedData encodedData, AbstractC2615i abstractC2615i) {
        boolean z;
        long j;
        if (this.f11698v != null) {
            long size = this.f11654J + encodedData.size();
            long j2 = this.f11662R;
            long j3 = 0;
            if (j2 != 0 && size > j2) {
                Logger.m63230d("Recorder", String.format("Reach file size limit %d > %d", Long.valueOf(size), Long.valueOf(this.f11662R)));
                m62470a0(abstractC2615i, 2, null);
                return;
            }
            long presentationTimeUs = encodedData.getPresentationTimeUs();
            long j4 = this.f11656L;
            if (j4 == Long.MAX_VALUE) {
                this.f11656L = presentationTimeUs;
                Logger.m63230d("Recorder", String.format("First video time: %d (%s)", Long.valueOf(presentationTimeUs), DebugUtils.readableUs(this.f11656L)));
                j = size;
            } else {
                TimeUnit timeUnit = TimeUnit.MICROSECONDS;
                long nanos = timeUnit.toNanos(presentationTimeUs - Math.min(j4, this.f11659O));
                if (this.f11660P != Long.MAX_VALUE) {
                    z = true;
                } else {
                    z = false;
                }
                Preconditions.checkState(z, "There should be a previous data for adjusting the duration.");
                long nanos2 = timeUnit.toNanos(presentationTimeUs - this.f11660P) + nanos;
                j = size;
                long j5 = this.f11663S;
                if (j5 != 0 && nanos2 > j5) {
                    Logger.m63230d("Recorder", String.format("Video data reaches duration limit %d > %d", Long.valueOf(nanos2), Long.valueOf(this.f11663S)));
                    m62470a0(abstractC2615i, 9, null);
                    return;
                }
                j3 = nanos;
            }
            this.f11645A.writeSampleData(this.f11698v.intValue(), encodedData.getByteBuffer(), encodedData.getBufferInfo());
            this.f11654J = j;
            this.f11655K = j3;
            this.f11660P = presentationTimeUs;
            m62491J0();
            return;
        }
        throw new AssertionError("Video data comes before the track is added to MediaMuxer.");
    }

    /* renamed from: N */
    public final /* synthetic */ void m62484N() {
        SurfaceRequest surfaceRequest = this.f11699w;
        if (surfaceRequest != null) {
            m62435s(surfaceRequest, this.f11700x);
            return;
        }
        throw new AssertionError("surface request is required to retry initialization.");
    }

    /* renamed from: Q */
    public final /* synthetic */ void m62481Q(final Encoder encoder) {
        this.f11677d.execute(new Runnable() { // from class: zs1
            @Override // java.lang.Runnable
            public final void run() {
                Recorder.m62469b(Encoder.this);
            }
        });
    }

    /* renamed from: R */
    public final /* synthetic */ Object m62480R(AbstractC2615i abstractC2615i, CallbackToFutureAdapter.Completer completer) {
        this.f11648D.setEncoderCallback(new C2610d(completer, abstractC2615i), this.f11677d);
        return "videoEncodingFuture";
    }

    /* renamed from: S */
    public final /* synthetic */ void m62479S(CallbackToFutureAdapter.Completer completer, Throwable th2) {
        if (this.f11668X == null) {
            if (th2 instanceof EncodeException) {
                m62436r0(AudioState.ERROR_ENCODER);
            } else {
                m62436r0(AudioState.ERROR_SOURCE);
            }
            this.f11668X = th2;
            m62491J0();
            completer.set(null);
        }
    }

    /* renamed from: T */
    public final /* synthetic */ Object m62478T(AbstractC2615i abstractC2615i, final CallbackToFutureAdapter.Completer completer) {
        Consumer consumer = new Consumer() { // from class: Bs1
            {
                Recorder.this = this;
            }

            @Override // androidx.core.util.Consumer
            public final void accept(Object obj) {
                Recorder.m62463e(Recorder.this, completer, (Throwable) obj);
            }
        };
        this.f11647C.setAudioSourceCallback(this.f11677d, new C2611e(consumer));
        this.f11650F.setEncoderCallback(new C2612f(completer, consumer, abstractC2615i), this.f11677d);
        return "audioEncodingFuture";
    }

    /* renamed from: U */
    public final AbstractC2615i m62477U(State state) {
        boolean z;
        if (state == State.PENDING_PAUSED) {
            z = true;
        } else if (state == State.PENDING_RECORDING) {
            z = false;
        } else {
            throw new AssertionError("makePendingRecordingActiveLocked() can only be called from a pending state.");
        }
        if (this.f11688l == null) {
            AbstractC2615i abstractC2615i = this.f11689m;
            if (abstractC2615i != null) {
                this.f11688l = abstractC2615i;
                this.f11689m = null;
                if (z) {
                    m62430u0(State.PAUSED);
                } else {
                    m62430u0(State.RECORDING);
                }
                return abstractC2615i;
            }
            throw new AssertionError("Pending recording should exist when in a PENDING state.");
        }
        throw new AssertionError("Cannot make pending recording active because another recording is already active.");
    }

    /* renamed from: V */
    public void m62476V(Recording recording, final boolean z) {
        final AbstractC2615i abstractC2615i;
        synchronized (this.f11683g) {
            try {
                if (!m62504D(recording, this.f11689m) && !m62504D(recording, this.f11688l)) {
                    Logger.m63230d("Recorder", "mute() called on a recording that is no longer active: " + recording.m62366g());
                    return;
                }
                if (m62504D(recording, this.f11689m)) {
                    abstractC2615i = this.f11689m;
                } else {
                    abstractC2615i = this.f11688l;
                }
                this.f11677d.execute(new Runnable() { // from class: Ls1
                    {
                        Recorder.this = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        Recorder.m62449l(Recorder.this, abstractC2615i, z);
                    }
                });
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: W */
    public final void m62498G(AbstractC2615i abstractC2615i, boolean z) {
        AudioSource audioSource;
        if (abstractC2615i.m62390v() == z) {
            return;
        }
        abstractC2615i.m62405E(z);
        if (this.f11691o == abstractC2615i && !this.f11692p && (audioSource = this.f11647C) != null) {
            audioSource.mute(z);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:75:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x005b A[Catch: all -> 0x001d, TryCatch #0 {all -> 0x001d, blocks: (B:55:0x0003, B:56:0x0010, B:83:0x0088, B:58:0x0014, B:61:0x0020, B:62:0x0026, B:67:0x0030, B:68:0x0037, B:69:0x0038, B:70:0x0050, B:73:0x0054, B:76:0x005b, B:78:0x0061, B:79:0x006c, B:82:0x007b), top: B:97:0x0003 }] */
    /* renamed from: Y */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m62473Y() {
        /*
            Method dump skipped, instructions count: 216
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.video.Recorder.m62473Y():void");
    }

    /* renamed from: Z */
    public void m62472Z(Throwable th2) {
        AbstractC2615i abstractC2615i;
        synchronized (this.f11683g) {
            abstractC2615i = null;
            switch (C2614h.f11723a[this.f11685i.ordinal()]) {
                case 1:
                case 2:
                case 5:
                case 6:
                case 9:
                    throw new AssertionError("Encountered encoder setup error while in unexpected state " + this.f11685i + ": " + th2);
                case 3:
                case 4:
                    AbstractC2615i abstractC2615i2 = this.f11689m;
                    this.f11689m = null;
                    abstractC2615i = abstractC2615i2;
                case 7:
                    m62428v0(-1);
                    m62430u0(State.ERROR);
                    break;
            }
        }
        if (abstractC2615i != null) {
            m62431u(abstractC2615i, 7, th2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0048 A[Catch: all -> 0x002f, TRY_ENTER, TryCatch #0 {all -> 0x002f, blocks: (B:34:0x0007, B:35:0x0012, B:44:0x003b, B:37:0x0016, B:38:0x002e, B:41:0x0031, B:42:0x0037, B:48:0x0048, B:49:0x004f), top: B:54:0x0007 }] */
    /* renamed from: a0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m62470a0(androidx.camera.video.Recorder.AbstractC2615i r10, int r11, java.lang.Throwable r12) {
        /*
            r9 = this;
            androidx.camera.video.Recorder$i r0 = r9.f11691o
            if (r10 != r0) goto L52
            java.lang.Object r0 = r9.f11683g
            monitor-enter(r0)
            int[] r1 = androidx.camera.video.Recorder.C2614h.f11723a     // Catch: java.lang.Throwable -> L2f
            androidx.camera.video.Recorder$State r2 = r9.f11685i     // Catch: java.lang.Throwable -> L2f
            int r2 = r2.ordinal()     // Catch: java.lang.Throwable -> L2f
            r1 = r1[r2]     // Catch: java.lang.Throwable -> L2f
            r2 = 0
            switch(r1) {
                case 1: goto L31;
                case 2: goto L31;
                case 3: goto L37;
                case 4: goto L37;
                case 5: goto L37;
                case 6: goto L37;
                case 7: goto L16;
                case 8: goto L16;
                case 9: goto L16;
                default: goto L15;
            }     // Catch: java.lang.Throwable -> L2f
        L15:
            goto L3b
        L16:
            java.lang.AssertionError r10 = new java.lang.AssertionError     // Catch: java.lang.Throwable -> L2f
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2f
            r11.<init>()     // Catch: java.lang.Throwable -> L2f
            java.lang.String r12 = "In-progress recording error occurred while in unexpected state: "
            r11.append(r12)     // Catch: java.lang.Throwable -> L2f
            androidx.camera.video.Recorder$State r12 = r9.f11685i     // Catch: java.lang.Throwable -> L2f
            r11.append(r12)     // Catch: java.lang.Throwable -> L2f
            java.lang.String r11 = r11.toString()     // Catch: java.lang.Throwable -> L2f
            r10.<init>(r11)     // Catch: java.lang.Throwable -> L2f
            throw r10     // Catch: java.lang.Throwable -> L2f
        L2f:
            r10 = move-exception
            goto L50
        L31:
            androidx.camera.video.Recorder$State r1 = androidx.camera.video.Recorder.State.STOPPING     // Catch: java.lang.Throwable -> L2f
            r9.m62430u0(r1)     // Catch: java.lang.Throwable -> L2f
            r2 = 1
        L37:
            androidx.camera.video.Recorder$i r1 = r9.f11688l     // Catch: java.lang.Throwable -> L2f
            if (r10 != r1) goto L48
        L3b:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2f
            if (r2 == 0) goto L47
            r5 = -1
            r3 = r9
            r4 = r10
            r7 = r11
            r8 = r12
            r3.m62483O(r4, r5, r7, r8)
        L47:
            return
        L48:
            java.lang.AssertionError r10 = new java.lang.AssertionError     // Catch: java.lang.Throwable -> L2f
            java.lang.String r11 = "Internal error occurred for recording but it is not the active recording."
            r10.<init>(r11)     // Catch: java.lang.Throwable -> L2f
            throw r10     // Catch: java.lang.Throwable -> L2f
        L50:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2f
            throw r10
        L52:
            java.lang.AssertionError r10 = new java.lang.AssertionError
            java.lang.String r11 = "Internal error occurred on recording that is not the current in-progress recording."
            r10.<init>(r11)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.video.Recorder.m62470a0(androidx.camera.video.Recorder$i, int, java.lang.Throwable):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:87:0x0030 A[Catch: all -> 0x0040, TryCatch #0 {all -> 0x0040, blocks: (B:74:0x0003, B:76:0x0007, B:79:0x001a, B:115:0x009b, B:85:0x002a, B:87:0x0030, B:90:0x0043, B:92:0x0047, B:94:0x004d, B:98:0x0055, B:100:0x0060, B:102:0x0064, B:104:0x0076, B:106:0x007a, B:108:0x0080, B:112:0x0088, B:113:0x0092, B:129:0x00c4, B:130:0x00dc, B:131:0x00dd, B:132:0x00e4), top: B:135:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0043 A[Catch: all -> 0x0040, TryCatch #0 {all -> 0x0040, blocks: (B:74:0x0003, B:76:0x0007, B:79:0x001a, B:115:0x009b, B:85:0x002a, B:87:0x0030, B:90:0x0043, B:92:0x0047, B:94:0x004d, B:98:0x0055, B:100:0x0060, B:102:0x0064, B:104:0x0076, B:106:0x007a, B:108:0x0080, B:112:0x0088, B:113:0x0092, B:129:0x00c4, B:130:0x00dc, B:131:0x00dd, B:132:0x00e4), top: B:135:0x0003 }] */
    /* renamed from: b0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m62468b0(androidx.camera.video.Recorder.AbstractC2615i r8) {
        /*
            Method dump skipped, instructions count: 248
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.video.Recorder.m62468b0(androidx.camera.video.Recorder$i):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: c0 */
    public final void m62466c0() {
        boolean z;
        SurfaceRequest surfaceRequest;
        synchronized (this.f11683g) {
            try {
                switch (C2614h.f11723a[this.f11685i.ordinal()]) {
                    case 1:
                    case 2:
                    case 8:
                        if (m62506C()) {
                            z = false;
                            break;
                        }
                        m62430u0(State.CONFIGURING);
                        z = true;
                        break;
                    case 3:
                    case 4:
                        m62489K0(State.CONFIGURING);
                        z = true;
                        break;
                    case 5:
                    case 6:
                    case 9:
                        m62430u0(State.CONFIGURING);
                        z = true;
                        break;
                    case 7:
                    default:
                        z = true;
                        break;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f11674b0 = false;
        if (z && (surfaceRequest = this.f11699w) != null && !surfaceRequest.isServiced()) {
            m62435s(this.f11699w, this.f11700x);
        }
    }

    /* renamed from: d0 */
    public void m62496H(VideoOutput.SourceState sourceState) {
        ScheduledFuture scheduledFuture;
        Encoder encoder;
        VideoOutput.SourceState sourceState2 = this.f11670Z;
        this.f11670Z = sourceState;
        if (sourceState2 != sourceState) {
            Logger.m63230d("Recorder", "Video source has transitioned to state: " + sourceState);
            if (sourceState == VideoOutput.SourceState.INACTIVE) {
                if (this.f11702z == null) {
                    m62450k0(4, null, false);
                    return;
                }
                this.f11674b0 = true;
                AbstractC2615i abstractC2615i = this.f11691o;
                if (abstractC2615i != null && !abstractC2615i.mo62229w()) {
                    m62470a0(this.f11691o, 4, null);
                    return;
                }
                return;
            } else if (sourceState == VideoOutput.SourceState.ACTIVE_NON_STREAMING && (scheduledFuture = this.f11672a0) != null && scheduledFuture.cancel(false) && (encoder = this.f11648D) != null) {
                m62474X(encoder);
                return;
            } else {
                return;
            }
        }
        Logger.m63230d("Recorder", "Video source transitions to the same state: " + sourceState);
    }

    /* renamed from: e0 */
    public final void m62494I(SurfaceRequest surfaceRequest, Timebase timebase) {
        SurfaceRequest surfaceRequest2 = this.f11699w;
        if (surfaceRequest2 != null && !surfaceRequest2.isServiced()) {
            this.f11699w.willNotProvideSurface();
        }
        this.f11699w = surfaceRequest;
        this.f11700x = timebase;
        m62435s(surfaceRequest, timebase);
    }

    /* renamed from: f0 */
    public void m62460f0(VideoEncoderSession videoEncoderSession) {
        Encoder m62288m = videoEncoderSession.m62288m();
        this.f11648D = m62288m;
        this.f11658N = ((VideoEncoderInfo) m62288m.getEncoderInfo()).getSupportedBitrateRange();
        this.f11657M = this.f11648D.getConfiguredBitrate();
        Surface m62290k = videoEncoderSession.m62290k();
        this.f11702z = m62290k;
        m62432t0(m62290k);
        videoEncoderSession.m62279v(this.f11677d, new Encoder.SurfaceInput.OnSurfaceUpdateListener() { // from class: Ds1
            @Override // androidx.camera.video.internal.encoder.Encoder.SurfaceInput.OnSurfaceUpdateListener
            public final void onSurfaceUpdate(Surface surface) {
                Recorder.this.m62432t0(surface);
            }
        });
        Futures.addCallback(videoEncoderSession.m62289l(), new C2608b(videoEncoderSession), this.f11677d);
    }

    /* renamed from: g0 */
    public void m62458g0(Recording recording) {
        synchronized (this.f11683g) {
            try {
                if (!m62504D(recording, this.f11689m) && !m62504D(recording, this.f11688l)) {
                    Logger.m63230d("Recorder", "pause() called on a recording that is no longer active: " + recording.m62366g());
                    return;
                }
                int i = C2614h.f11723a[this.f11685i.ordinal()];
                if (i != 2) {
                    if (i != 4) {
                        if (i == 7 || i == 9) {
                            throw new IllegalStateException("Called pause() from invalid state: " + this.f11685i);
                        }
                    } else {
                        m62430u0(State.PENDING_PAUSED);
                    }
                } else {
                    m62430u0(State.PAUSED);
                    final AbstractC2615i abstractC2615i = this.f11688l;
                    this.f11677d.execute(new Runnable() { // from class: Gs1
                        {
                            Recorder.this = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            Recorder.m62471a(Recorder.this, abstractC2615i);
                        }
                    });
                }
            } finally {
            }
        }
    }

    public int getAspectRatio() {
        return ((MediaSpec) m62425x(this.f11646B)).getVideoSpec().mo61933a();
    }

    @Nullable
    public Executor getExecutor() {
        return this.f11673b;
    }

    @Override // androidx.camera.video.VideoOutput
    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public VideoCapabilities getMediaCapabilities(@NonNull CameraInfo cameraInfo) {
        return getVideoCapabilities(cameraInfo);
    }

    @Override // androidx.camera.video.VideoOutput
    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public Observable<MediaSpec> getMediaSpec() {
        return this.f11646B;
    }

    @NonNull
    public QualitySelector getQualitySelector() {
        return ((MediaSpec) m62425x(this.f11646B)).getVideoSpec().getQualitySelector();
    }

    @Override // androidx.camera.video.VideoOutput
    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public Observable<StreamInfo> getStreamInfo() {
        return this.f11671a;
    }

    public int getTargetVideoEncodingBitRate() {
        return ((MediaSpec) m62425x(this.f11646B)).getVideoSpec().getBitrate().getLower().intValue();
    }

    /* renamed from: h0 */
    public final void m62492J(AbstractC2615i abstractC2615i) {
        if (this.f11691o == abstractC2615i && !this.f11692p) {
            if (m62510A()) {
                this.f11650F.pause();
            }
            this.f11648D.pause();
            AbstractC2615i abstractC2615i2 = this.f11691o;
            abstractC2615i2.m62402H(VideoRecordEvent.m62273c(abstractC2615i2.mo62232r(), m62427w()));
        }
    }

    /* renamed from: i0 */
    public final PendingRecording m62454i0(Context context, OutputOptions outputOptions) {
        Preconditions.checkNotNull(outputOptions, "The OutputOptions cannot be null.");
        return new PendingRecording(context, this, outputOptions);
    }

    /* renamed from: j0 */
    public final void m62452j0() {
        AudioSource audioSource = this.f11647C;
        if (audioSource != null) {
            this.f11647C = null;
            Logger.m63230d("Recorder", String.format("Releasing audio source: 0x%x", Integer.valueOf(audioSource.hashCode())));
            Futures.addCallback(audioSource.release(), new C2609c(audioSource), CameraXExecutors.directExecutor());
            return;
        }
        throw new AssertionError("Cannot release null audio source.");
    }

    /* renamed from: k0 */
    public void m62450k0(int i, Throwable th2, boolean z) {
        boolean z2;
        boolean z3;
        boolean z4;
        synchronized (this.f11683g) {
            try {
                z2 = true;
                z3 = false;
                switch (C2614h.f11723a[this.f11685i.ordinal()]) {
                    case 1:
                    case 2:
                        if (this.f11691o != null) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        Preconditions.checkState(z4, "In-progress recording shouldn't be null when in state " + this.f11685i);
                        if (this.f11688l == this.f11691o) {
                            if (!m62506C()) {
                                m62430u0(State.RESETTING);
                                z2 = false;
                                z3 = true;
                                break;
                            } else {
                                break;
                            }
                        } else {
                            throw new AssertionError("In-progress recording does not match the active recording. Unable to reset encoder.");
                        }
                    case 3:
                    case 4:
                        m62489K0(State.RESETTING);
                        break;
                    case 5:
                    default:
                        z2 = false;
                        break;
                    case 6:
                        m62430u0(State.RESETTING);
                        z2 = false;
                        break;
                    case 7:
                    case 8:
                    case 9:
                        break;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (z2) {
            if (z) {
                m62446m0();
            } else {
                m62448l0();
            }
        } else if (z3) {
            m62483O(this.f11691o, -1L, i, th2);
        }
    }

    /* renamed from: l0 */
    public final void m62448l0() {
        if (this.f11650F != null) {
            Logger.m63230d("Recorder", "Releasing audio encoder.");
            this.f11650F.release();
            this.f11650F = null;
            this.f11651G = null;
        }
        if (this.f11647C != null) {
            m62452j0();
        }
        m62436r0(AudioState.INITIALIZING);
        m62446m0();
    }

    /* renamed from: m0 */
    public final void m62446m0() {
        if (this.f11648D != null) {
            Logger.m63230d("Recorder", "Releasing video encoder.");
            m62497G0();
        }
        m62466c0();
    }

    /* renamed from: n0 */
    public final void m62444n0() {
        if (f11638g0.contains(this.f11685i)) {
            m62430u0(this.f11686j);
            return;
        }
        throw new AssertionError("Cannot restore non-pending state when in state " + this.f11685i);
    }

    /* renamed from: o0 */
    public void m62442o0(Recording recording) {
        synchronized (this.f11683g) {
            try {
                if (!m62504D(recording, this.f11689m) && !m62504D(recording, this.f11688l)) {
                    Logger.m63230d("Recorder", "resume() called on a recording that is no longer active: " + recording.m62366g());
                    return;
                }
                int i = C2614h.f11723a[this.f11685i.ordinal()];
                if (i != 1) {
                    if (i != 3) {
                        if (i == 7 || i == 9) {
                            throw new IllegalStateException("Called resume() from invalid state: " + this.f11685i);
                        }
                    } else {
                        m62430u0(State.PENDING_RECORDING);
                    }
                } else {
                    m62430u0(State.RECORDING);
                    final AbstractC2615i abstractC2615i = this.f11688l;
                    this.f11677d.execute(new Runnable() { // from class: Ks1
                        {
                            Recorder.this = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            Recorder.m62467c(Recorder.this, abstractC2615i);
                        }
                    });
                }
            } finally {
            }
        }
    }

    @Override // androidx.camera.video.VideoOutput
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void onSourceStateChanged(@NonNull final VideoOutput.SourceState sourceState) {
        this.f11677d.execute(new Runnable() { // from class: Js1
            @Override // java.lang.Runnable
            public final void run() {
                Recorder.m62457h(Recorder.this, sourceState);
            }
        });
    }

    @Override // androidx.camera.video.VideoOutput
    public void onSurfaceRequested(@NonNull SurfaceRequest surfaceRequest) {
        onSurfaceRequested(surfaceRequest, Timebase.UPTIME);
    }

    /* renamed from: p0 */
    public final void m62490K(AbstractC2615i abstractC2615i) {
        if (this.f11691o == abstractC2615i && !this.f11692p) {
            if (m62510A()) {
                this.f11650F.start();
            }
            Encoder encoder = this.f11648D;
            if (encoder != null) {
                encoder.start();
                AbstractC2615i abstractC2615i2 = this.f11691o;
                abstractC2615i2.m62402H(VideoRecordEvent.m62272d(abstractC2615i2.mo62232r(), m62427w()));
                return;
            }
            this.f11682f0 = true;
        }
    }

    @NonNull
    public PendingRecording prepareRecording(@NonNull Context context, @NonNull FileOutputOptions fileOutputOptions) {
        return m62454i0(context, fileOutputOptions);
    }

    /* renamed from: q */
    public final void m62439q() {
        while (!this.f11667W.isEmpty()) {
            this.f11667W.dequeue();
        }
    }

    /* renamed from: q0 */
    public final ListenableFuture m62438q0() {
        Logger.m63230d("Recorder", "Try to safely release video encoder: " + this.f11648D);
        return this.f11676c0.m62278w();
    }

    /* renamed from: r */
    public final MediaSpec m62437r(MediaSpec mediaSpec) {
        MediaSpec.Builder builder = mediaSpec.toBuilder();
        if (mediaSpec.getVideoSpec().mo61933a() == -1) {
            builder.configureVideo(new Consumer() { // from class: us1
                @Override // androidx.core.util.Consumer
                public final void accept(Object obj) {
                    Recorder.m62453j((VideoSpec.Builder) obj);
                }
            });
        }
        return builder.build();
    }

    /* renamed from: r0 */
    public void m62436r0(AudioState audioState) {
        Logger.m63230d("Recorder", "Transitioning audio state: " + this.f11652H + " --> " + audioState);
        this.f11652H = audioState;
    }

    /* renamed from: s */
    public final void m62435s(SurfaceRequest surfaceRequest, Timebase timebase) {
        if (surfaceRequest.isServiced()) {
            Logger.m63223w("Recorder", "Ignore the SurfaceRequest since it is already served.");
            return;
        }
        surfaceRequest.setTransformationInfoListener(this.f11677d, new SurfaceRequest.TransformationInfoListener() { // from class: vs1
            @Override // androidx.camera.core.SurfaceRequest.TransformationInfoListener
            public final void onTransformationInfoUpdate(SurfaceRequest.TransformationInfo transformationInfo) {
                Recorder.this.m62500F(transformationInfo);
            }
        });
        Size resolution = surfaceRequest.getResolution();
        DynamicRange dynamicRange = surfaceRequest.getDynamicRange();
        VideoCapabilities videoCapabilities = getVideoCapabilities(surfaceRequest.getCamera().getCameraInfo());
        Quality findHighestSupportedQualityFor = videoCapabilities.findHighestSupportedQualityFor(resolution, dynamicRange);
        Logger.m63230d("Recorder", "Using supported quality of " + findHighestSupportedQualityFor + " for surface size " + resolution);
        if (findHighestSupportedQualityFor != Quality.f11633a) {
            VideoValidatedEncoderProfilesProxy profiles = videoCapabilities.getProfiles(findHighestSupportedQualityFor, dynamicRange);
            this.f11695s = profiles;
            if (profiles == null) {
                throw new AssertionError("Camera advertised available quality but did not produce EncoderProfiles  for advertised quality.");
            }
        }
        m62420z0(surfaceRequest, timebase);
    }

    /* renamed from: s0 */
    public void m62434s0(SurfaceRequest.TransformationInfo transformationInfo) {
        Logger.m63230d("Recorder", "Update stream transformation info: " + transformationInfo);
        this.f11693q = transformationInfo;
        synchronized (this.f11683g) {
            this.f11671a.setState(StreamInfo.m62361b(this.f11687k, m62421z(this.f11685i), transformationInfo));
        }
    }

    /* renamed from: t */
    public void m62433t(int i, Throwable th2) {
        VideoRecordEvent.Finalize m62274b;
        if (this.f11691o != null) {
            MediaMuxer mediaMuxer = this.f11645A;
            if (mediaMuxer != null) {
                try {
                    mediaMuxer.stop();
                    this.f11645A.release();
                } catch (IllegalStateException e) {
                    Logger.m63228e("Recorder", "MediaMuxer failed to stop or release with error: " + e.getMessage());
                    if (i == 0) {
                        i = 1;
                    }
                }
                this.f11645A = null;
            } else if (i == 0) {
                i = 8;
            }
            this.f11691o.m62394m(this.f11653I);
            OutputOptions mo62232r = this.f11691o.mo62232r();
            RecordingStats m62427w = m62427w();
            OutputResults m62526a = OutputResults.m62526a(this.f11653I);
            AbstractC2615i abstractC2615i = this.f11691o;
            if (i == 0) {
                m62274b = VideoRecordEvent.m62275a(mo62232r, m62427w, m62526a);
            } else {
                m62274b = VideoRecordEvent.m62274b(mo62232r, m62427w, m62526a, i, th2);
            }
            abstractC2615i.m62402H(m62274b);
            AbstractC2615i abstractC2615i2 = this.f11691o;
            this.f11691o = null;
            this.f11692p = false;
            this.f11697u = null;
            this.f11698v = null;
            this.f11696t.clear();
            this.f11653I = Uri.EMPTY;
            this.f11654J = 0L;
            this.f11655K = 0L;
            this.f11656L = Long.MAX_VALUE;
            this.f11659O = Long.MAX_VALUE;
            this.f11660P = Long.MAX_VALUE;
            this.f11661Q = Long.MAX_VALUE;
            this.f11664T = 1;
            this.f11665U = null;
            this.f11668X = null;
            this.f11680e0 = 0.0d;
            m62439q();
            m62434s0(null);
            int i2 = C2614h.f11724b[this.f11652H.ordinal()];
            if (i2 != 1 && i2 != 2) {
                if (i2 != 3 && i2 != 4) {
                    if (i2 == 5) {
                        throw new AssertionError("Incorrectly finalize recording when audio state is IDLING");
                    }
                } else {
                    m62436r0(AudioState.IDLING);
                    this.f11647C.stop();
                }
            } else {
                m62436r0(AudioState.INITIALIZING);
            }
            m62468b0(abstractC2615i2);
            return;
        }
        throw new AssertionError("Attempted to finalize in-progress recording, but no recording is in progress.");
    }

    /* renamed from: t0 */
    public void m62432t0(Surface surface) {
        int hashCode;
        if (this.f11701y == surface) {
            return;
        }
        this.f11701y = surface;
        synchronized (this.f11683g) {
            if (surface != null) {
                try {
                    hashCode = surface.hashCode();
                } catch (Throwable th2) {
                    throw th2;
                }
            } else {
                hashCode = 0;
            }
            m62428v0(hashCode);
        }
    }

    /* renamed from: u */
    public final void m62431u(AbstractC2615i abstractC2615i, int i, Throwable th2) {
        Uri uri = Uri.EMPTY;
        abstractC2615i.m62394m(uri);
        abstractC2615i.m62402H(VideoRecordEvent.m62274b(abstractC2615i.mo62232r(), RecordingStats.m62363a(0L, 0L, AudioStats.m62528b(1, this.f11668X, 0.0d)), OutputResults.m62526a(uri), i, th2));
    }

    /* renamed from: u0 */
    public void m62430u0(State state) {
        if (this.f11685i != state) {
            Logger.m63230d("Recorder", "Transitioning Recorder internal state: " + this.f11685i + " --> " + state);
            Set set = f11638g0;
            StreamInfo.StreamState streamState = null;
            if (set.contains(state)) {
                if (!set.contains(this.f11685i)) {
                    if (f11639h0.contains(this.f11685i)) {
                        State state2 = this.f11685i;
                        this.f11686j = state2;
                        streamState = m62421z(state2);
                    } else {
                        throw new AssertionError("Invalid state transition. Should not be transitioning to a PENDING state from state " + this.f11685i);
                    }
                }
            } else if (this.f11686j != null) {
                this.f11686j = null;
            }
            this.f11685i = state;
            if (streamState == null) {
                streamState = m62421z(state);
            }
            this.f11671a.setState(StreamInfo.m62361b(this.f11687k, streamState, this.f11693q));
            return;
        }
        throw new AssertionError("Attempted to transition to state " + state + ", but Recorder is already in state " + state);
    }

    /* renamed from: v */
    public final List m62429v(long j) {
        ArrayList arrayList = new ArrayList();
        while (!this.f11667W.isEmpty()) {
            EncodedData encodedData = (EncodedData) this.f11667W.dequeue();
            if (encodedData.getPresentationTimeUs() >= j) {
                arrayList.add(encodedData);
            }
        }
        return arrayList;
    }

    /* renamed from: v0 */
    public final void m62428v0(int i) {
        if (this.f11687k == i) {
            return;
        }
        Logger.m63230d("Recorder", "Transitioning streamId: " + this.f11687k + " --> " + i);
        this.f11687k = i;
        this.f11671a.setState(StreamInfo.m62361b(i, m62421z(this.f11685i), this.f11693q));
    }

    /* renamed from: w */
    public RecordingStats m62427w() {
        return RecordingStats.m62363a(this.f11655K, this.f11654J, AudioStats.m62528b(m62423y(this.f11652H), this.f11668X, this.f11680e0));
    }

    /* renamed from: w0 */
    public void m62426w0(AbstractC2615i abstractC2615i) {
        int m62527a;
        if (this.f11645A == null) {
            if (m62510A() && this.f11667W.isEmpty()) {
                throw new AssertionError("Audio is enabled but no audio sample is ready. Cannot start media muxer.");
            }
            EncodedData encodedData = this.f11666V;
            if (encodedData != null) {
                try {
                    this.f11666V = null;
                    List<EncodedData> m62429v = m62429v(encodedData.getPresentationTimeUs());
                    long size = encodedData.size();
                    for (EncodedData encodedData2 : m62429v) {
                        size += encodedData2.size();
                    }
                    long j = this.f11662R;
                    if (j != 0 && size > j) {
                        Logger.m63230d("Recorder", String.format("Initial data exceeds file size limit %d > %d", Long.valueOf(size), Long.valueOf(this.f11662R)));
                        m62470a0(abstractC2615i, 2, null);
                        encodedData.close();
                        return;
                    }
                    try {
                        MediaSpec mediaSpec = (MediaSpec) m62425x(this.f11646B);
                        if (mediaSpec.getOutputFormat() == -1) {
                            m62527a = m62499F0(this.f11695s, MediaSpec.m62527a(f11641j0.getOutputFormat()));
                        } else {
                            m62527a = MediaSpec.m62527a(mediaSpec.getOutputFormat());
                        }
                        MediaMuxer m62403G = abstractC2615i.m62403G(m62527a, new Consumer() { // from class: As1
                            {
                                Recorder.this = this;
                            }

                            @Override // androidx.core.util.Consumer
                            public final void accept(Object obj) {
                                Recorder.m62459g(Recorder.this, (Uri) obj);
                            }
                        });
                        SurfaceRequest.TransformationInfo transformationInfo = this.f11694r;
                        if (transformationInfo != null) {
                            m62434s0(transformationInfo);
                            m62403G.setOrientationHint(transformationInfo.getRotationDegrees());
                        }
                        Location location = abstractC2615i.mo62232r().getLocation();
                        if (location != null) {
                            try {
                                Pair<Double, Double> adjustGeoLocation = CorrectNegativeLatLongForMediaMuxer.adjustGeoLocation(location.getLatitude(), location.getLongitude());
                                m62403G.setLocation((float) ((Double) adjustGeoLocation.first).doubleValue(), (float) ((Double) adjustGeoLocation.second).doubleValue());
                            } catch (IllegalArgumentException e) {
                                m62403G.release();
                                m62470a0(abstractC2615i, 5, e);
                                encodedData.close();
                                return;
                            }
                        }
                        this.f11698v = Integer.valueOf(m62403G.addTrack(this.f11649E.getMediaFormat()));
                        if (m62510A()) {
                            this.f11697u = Integer.valueOf(m62403G.addTrack(this.f11651G.getMediaFormat()));
                        }
                        m62403G.start();
                        this.f11645A = m62403G;
                        m62485M0(encodedData, abstractC2615i);
                        for (EncodedData encodedData3 : m62429v) {
                            m62487L0(encodedData3, abstractC2615i);
                        }
                        encodedData.close();
                        return;
                    } catch (IOException e2) {
                        m62470a0(abstractC2615i, 5, e2);
                        encodedData.close();
                        return;
                    }
                } catch (Throwable th2) {
                    if (encodedData != null) {
                        try {
                            encodedData.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                    }
                    throw th2;
                }
            }
            throw new AssertionError("Media muxer cannot be started without an encoded video frame.");
        }
        throw new AssertionError("Unable to set up media muxer when one already exists.");
    }

    /* renamed from: x */
    public Object m62425x(StateObservable stateObservable) {
        try {
            return stateObservable.fetchData().get();
        } catch (InterruptedException | ExecutionException e) {
            throw new IllegalStateException(e);
        }
    }

    /* renamed from: x0 */
    public final void m62424x0(AbstractC2615i abstractC2615i) {
        MediaSpec mediaSpec = (MediaSpec) m62425x(this.f11646B);
        AudioMimeInfo resolveAudioMimeInfo = AudioConfigUtil.resolveAudioMimeInfo(mediaSpec, this.f11695s);
        Timebase timebase = Timebase.UPTIME;
        AudioSettings resolveAudioSettings = AudioConfigUtil.resolveAudioSettings(resolveAudioMimeInfo, mediaSpec.getAudioSpec());
        if (this.f11647C != null) {
            m62452j0();
        }
        AudioSource m62422y0 = m62422y0(abstractC2615i, resolveAudioSettings);
        this.f11647C = m62422y0;
        Logger.m63230d("Recorder", String.format("Set up new audio source: 0x%x", Integer.valueOf(m62422y0.hashCode())));
        Encoder createEncoder = this.f11681f.createEncoder(this.f11675c, AudioConfigUtil.resolveAudioEncoderConfig(resolveAudioMimeInfo, timebase, resolveAudioSettings, mediaSpec.getAudioSpec()));
        this.f11650F = createEncoder;
        Encoder.EncoderInput input = createEncoder.getInput();
        if (input instanceof Encoder.ByteBufferInput) {
            this.f11647C.setBufferProvider((Encoder.ByteBufferInput) input);
            return;
        }
        throw new AssertionError("The EncoderInput of audio isn't a ByteBufferInput.");
    }

    /* renamed from: y */
    public final int m62423y(AudioState audioState) {
        int i = C2614h.f11724b[audioState.ordinal()];
        if (i == 1) {
            return 3;
        }
        if (i == 2) {
            return 4;
        }
        if (i != 3) {
            if (i == 4 || i == 6) {
                return 1;
            }
            throw new AssertionError("Invalid internal audio state: " + audioState);
        }
        AbstractC2615i abstractC2615i = this.f11691o;
        if (abstractC2615i != null && abstractC2615i.m62390v()) {
            return 5;
        }
        if (this.f11669Y) {
            return 2;
        }
        return 0;
    }

    /* renamed from: y0 */
    public final AudioSource m62422y0(AbstractC2615i abstractC2615i, AudioSettings audioSettings) {
        return abstractC2615i.m62404F(audioSettings, f11644m0);
    }

    /* renamed from: z */
    public final StreamInfo.StreamState m62421z(State state) {
        DeactivateEncoderSurfaceBeforeStopEncoderQuirk deactivateEncoderSurfaceBeforeStopEncoderQuirk = (DeactivateEncoderSurfaceBeforeStopEncoderQuirk) DeviceQuirks.get(DeactivateEncoderSurfaceBeforeStopEncoderQuirk.class);
        if (state != State.RECORDING && (state != State.STOPPING || deactivateEncoderSurfaceBeforeStopEncoderQuirk != null)) {
            return StreamInfo.StreamState.INACTIVE;
        }
        return StreamInfo.StreamState.ACTIVE;
    }

    /* renamed from: z0 */
    public final void m62420z0(final SurfaceRequest surfaceRequest, final Timebase timebase) {
        m62438q0().addListener(new Runnable() { // from class: Cs1
            @Override // java.lang.Runnable
            public final void run() {
                Recorder.this.m62486M(surfaceRequest, timebase);
            }
        }, this.f11677d);
    }

    @Override // androidx.camera.video.VideoOutput
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void onSurfaceRequested(@NonNull final SurfaceRequest surfaceRequest, @NonNull final Timebase timebase) {
        synchronized (this.f11683g) {
            try {
                Logger.m63230d("Recorder", "Surface is requested in state: " + this.f11685i + ", Current surface: " + this.f11687k);
                if (this.f11685i == State.ERROR) {
                    m62430u0(State.CONFIGURING);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f11677d.execute(new Runnable() { // from class: Is1
            @Override // java.lang.Runnable
            public final void run() {
                Recorder.this.m62494I(surfaceRequest, timebase);
            }
        });
    }

    @NonNull
    @RequiresApi(26)
    public PendingRecording prepareRecording(@NonNull Context context, @NonNull FileDescriptorOutputOptions fileDescriptorOutputOptions) {
        if (Build.VERSION.SDK_INT >= 26) {
            return m62454i0(context, fileDescriptorOutputOptions);
        }
        throw new UnsupportedOperationException("File descriptors as output destinations are not supported on pre-Android O (API 26) devices.");
    }

    @NonNull
    public PendingRecording prepareRecording(@NonNull Context context, @NonNull MediaStoreOutputOptions mediaStoreOutputOptions) {
        return m62454i0(context, mediaStoreOutputOptions);
    }
}
