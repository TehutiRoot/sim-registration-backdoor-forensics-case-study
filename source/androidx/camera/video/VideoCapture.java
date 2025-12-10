package androidx.camera.video;

import android.graphics.Rect;
import android.media.MediaCodec;
import android.os.SystemClock;
import android.util.Pair;
import android.util.Range;
import android.util.Size;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.arch.core.util.Function;
import androidx.camera.core.CameraInfo;
import androidx.camera.core.CameraSelector;
import androidx.camera.core.DynamicRange;
import androidx.camera.core.Logger;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.core.UseCase;
import androidx.camera.core.impl.CameraCaptureCallback;
import androidx.camera.core.impl.CameraCaptureResult;
import androidx.camera.core.impl.CameraInfoInternal;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.CaptureConfig;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.ConfigProvider;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.ImageInputConfig;
import androidx.camera.core.impl.ImageOutputConfig;
import androidx.camera.core.impl.MutableConfig;
import androidx.camera.core.impl.MutableOptionsBundle;
import androidx.camera.core.impl.Observable;
import androidx.camera.core.impl.OptionsBundle;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.StreamSpec;
import androidx.camera.core.impl.Timebase;
import androidx.camera.core.impl.UseCaseConfig;
import androidx.camera.core.impl.UseCaseConfigFactory;
import androidx.camera.core.impl.utils.Threads;
import androidx.camera.core.impl.utils.TransformUtils;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.impl.utils.futures.FutureCallback;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.camera.core.internal.TargetConfig;
import androidx.camera.core.internal.ThreadConfig;
import androidx.camera.core.internal.UseCaseEventConfig;
import androidx.camera.core.processing.DefaultSurfaceProcessor;
import androidx.camera.core.processing.SurfaceEdge;
import androidx.camera.core.processing.SurfaceProcessorInternal;
import androidx.camera.core.processing.SurfaceProcessorNode;
import androidx.camera.core.resolutionselector.ResolutionSelector;
import androidx.camera.video.StreamInfo;
import androidx.camera.video.VideoCapabilities;
import androidx.camera.video.VideoCapture;
import androidx.camera.video.VideoOutput;
import androidx.camera.video.impl.VideoCaptureConfig;
import androidx.camera.video.internal.VideoValidatedEncoderProfilesProxy;
import androidx.camera.video.internal.compat.quirk.DeviceQuirks;
import androidx.camera.video.internal.compat.quirk.ExtraSupportedResolutionQuirk;
import androidx.camera.video.internal.compat.quirk.ImageCaptureFailedWhenVideoCaptureIsBoundQuirk;
import androidx.camera.video.internal.compat.quirk.PreviewDelayWhenVideoCaptureIsBoundQuirk;
import androidx.camera.video.internal.compat.quirk.PreviewStretchWhenVideoCaptureIsBoundQuirk;
import androidx.camera.video.internal.compat.quirk.VideoQualityQuirk;
import androidx.camera.video.internal.config.VideoConfigUtil;
import androidx.camera.video.internal.encoder.InvalidConfigException;
import androidx.camera.video.internal.encoder.VideoEncoderConfig;
import androidx.camera.video.internal.encoder.VideoEncoderInfo;
import androidx.camera.video.internal.encoder.VideoEncoderInfoImpl;
import androidx.camera.video.internal.workaround.VideoEncoderInfoWrapper;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.core.util.Preconditions;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import org.apache.commons.cli.HelpFormatter;

@RequiresApi(21)
/* loaded from: classes.dex */
public final class VideoCapture<T extends VideoOutput> extends UseCase {

    /* renamed from: A */
    public static final Defaults f11750A = new Defaults();

    /* renamed from: B */
    public static boolean f11751B;

    /* renamed from: C */
    public static final boolean f11752C;

    /* renamed from: n */
    public DeferrableSurface f11753n;

    /* renamed from: o */
    public SurfaceEdge f11754o;

    /* renamed from: p */
    public StreamInfo f11755p;

    /* renamed from: q */
    public SessionConfig.Builder f11756q;

    /* renamed from: r */
    public ListenableFuture f11757r;

    /* renamed from: s */
    public SurfaceRequest f11758s;

    /* renamed from: t */
    public VideoOutput.SourceState f11759t;

    /* renamed from: u */
    public SurfaceProcessorNode f11760u;

    /* renamed from: v */
    public VideoEncoderInfo f11761v;

    /* renamed from: w */
    public Rect f11762w;

    /* renamed from: x */
    public int f11763x;

    /* renamed from: y */
    public boolean f11764y;

    /* renamed from: z */
    public final Observable.Observer f11765z;

    @RequiresApi(21)
    /* loaded from: classes.dex */
    public static final class Builder<T extends VideoOutput> implements UseCaseConfig.Builder<VideoCapture<T>, VideoCaptureConfig<T>, Builder<T>>, ImageOutputConfig.Builder<Builder<T>>, ImageInputConfig.Builder<Builder<T>>, ThreadConfig.Builder<Builder<T>> {

        /* renamed from: a */
        public final MutableOptionsBundle f11766a;

        public Builder(@NonNull T t) {
            this(m62310a(t));
        }

        /* renamed from: a */
        public static MutableOptionsBundle m62310a(VideoOutput videoOutput) {
            MutableOptionsBundle create = MutableOptionsBundle.create();
            create.insertOption(VideoCaptureConfig.OPTION_VIDEO_OUTPUT, videoOutput);
            return create;
        }

        /* renamed from: b */
        public static Builder m62309b(Config config) {
            return new Builder(MutableOptionsBundle.from(config));
        }

        @NonNull
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public static <T extends VideoOutput> Builder<T> fromConfig(@NonNull VideoCaptureConfig<T> videoCaptureConfig) {
            return new Builder<>(MutableOptionsBundle.from((Config) videoCaptureConfig));
        }

        /* renamed from: c */
        public Builder m62308c(Function function) {
            getMutableConfig().insertOption(VideoCaptureConfig.OPTION_VIDEO_ENCODER_INFO_FINDER, function);
            return this;
        }

        @Override // androidx.camera.core.ExtendableBuilder
        @NonNull
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public MutableConfig getMutableConfig() {
            return this.f11766a;
        }

        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        @NonNull
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public /* bridge */ /* synthetic */ Object setCustomOrderedResolutions(@NonNull List list) {
            return setCustomOrderedResolutions((List<Size>) list);
        }

        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        @NonNull
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public /* bridge */ /* synthetic */ Object setSupportedResolutions(@NonNull List list) {
            return setSupportedResolutions((List<Pair<Integer, Size[]>>) list);
        }

        @NonNull
        public Builder<T> setTargetFrameRate(@NonNull Range<Integer> range) {
            getMutableConfig().insertOption(UseCaseConfig.OPTION_TARGET_FRAME_RATE, range);
            return this;
        }

        public Builder(MutableOptionsBundle mutableOptionsBundle) {
            this.f11766a = mutableOptionsBundle;
            if (mutableOptionsBundle.containsOption(VideoCaptureConfig.OPTION_VIDEO_OUTPUT)) {
                Class cls = (Class) mutableOptionsBundle.retrieveOption(TargetConfig.OPTION_TARGET_CLASS, null);
                if (cls != null && !cls.equals(VideoCapture.class)) {
                    throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
                }
                setTargetClass((Class) VideoCapture.class);
                return;
            }
            throw new IllegalArgumentException("VideoOutput is required");
        }

        @Override // androidx.camera.core.ExtendableBuilder
        @NonNull
        public VideoCapture<T> build() {
            return new VideoCapture<>(getUseCaseConfig());
        }

        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        @NonNull
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public VideoCaptureConfig<T> getUseCaseConfig() {
            return new VideoCaptureConfig<>(OptionsBundle.from(this.f11766a));
        }

        @Override // androidx.camera.core.internal.ThreadConfig.Builder
        @NonNull
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public Builder<T> setBackgroundExecutor(@NonNull Executor executor) {
            getMutableConfig().insertOption(ThreadConfig.OPTION_BACKGROUND_EXECUTOR, executor);
            return this;
        }

        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        @NonNull
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public Builder<T> setCameraSelector(@NonNull CameraSelector cameraSelector) {
            getMutableConfig().insertOption(UseCaseConfig.OPTION_CAMERA_SELECTOR, cameraSelector);
            return this;
        }

        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        @NonNull
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public Builder<T> setCaptureOptionUnpacker(@NonNull CaptureConfig.OptionUnpacker optionUnpacker) {
            getMutableConfig().insertOption(UseCaseConfig.OPTION_CAPTURE_CONFIG_UNPACKER, optionUnpacker);
            return this;
        }

        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        @NonNull
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public Builder<T> setCaptureType(@NonNull UseCaseConfigFactory.CaptureType captureType) {
            getMutableConfig().insertOption(UseCaseConfig.OPTION_CAPTURE_TYPE, captureType);
            return this;
        }

        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        @NonNull
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public Builder<T> setCustomOrderedResolutions(@NonNull List<Size> list) {
            getMutableConfig().insertOption(ImageOutputConfig.OPTION_CUSTOM_ORDERED_RESOLUTIONS, list);
            return this;
        }

        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        @NonNull
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public Builder<T> setDefaultCaptureConfig(@NonNull CaptureConfig captureConfig) {
            getMutableConfig().insertOption(UseCaseConfig.OPTION_DEFAULT_CAPTURE_CONFIG, captureConfig);
            return this;
        }

        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        @NonNull
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public Builder<T> setDefaultResolution(@NonNull Size size) {
            getMutableConfig().insertOption(ImageOutputConfig.OPTION_DEFAULT_RESOLUTION, size);
            return this;
        }

        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        @NonNull
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public Builder<T> setDefaultSessionConfig(@NonNull SessionConfig sessionConfig) {
            getMutableConfig().insertOption(UseCaseConfig.OPTION_DEFAULT_SESSION_CONFIG, sessionConfig);
            return this;
        }

        @Override // androidx.camera.core.impl.ImageInputConfig.Builder
        @NonNull
        public Builder<T> setDynamicRange(@NonNull DynamicRange dynamicRange) {
            getMutableConfig().insertOption(ImageInputConfig.OPTION_INPUT_DYNAMIC_RANGE, dynamicRange);
            return this;
        }

        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        @NonNull
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public Builder<T> setHighResolutionDisabled(boolean z) {
            getMutableConfig().insertOption(UseCaseConfig.OPTION_HIGH_RESOLUTION_DISABLED, Boolean.valueOf(z));
            return this;
        }

        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        @NonNull
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public Builder<T> setMaxResolution(@NonNull Size size) {
            getMutableConfig().insertOption(ImageOutputConfig.OPTION_MAX_RESOLUTION, size);
            return this;
        }

        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        @NonNull
        public Builder<T> setMirrorMode(int i) {
            getMutableConfig().insertOption(ImageOutputConfig.OPTION_MIRROR_MODE, Integer.valueOf(i));
            return this;
        }

        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        @NonNull
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public Builder<T> setResolutionSelector(@NonNull ResolutionSelector resolutionSelector) {
            getMutableConfig().insertOption(ImageOutputConfig.OPTION_RESOLUTION_SELECTOR, resolutionSelector);
            return this;
        }

        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        @NonNull
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public Builder<T> setSessionOptionUnpacker(@NonNull SessionConfig.OptionUnpacker optionUnpacker) {
            getMutableConfig().insertOption(UseCaseConfig.OPTION_SESSION_CONFIG_UNPACKER, optionUnpacker);
            return this;
        }

        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        @NonNull
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public Builder<T> setSupportedResolutions(@NonNull List<Pair<Integer, Size[]>> list) {
            getMutableConfig().insertOption(ImageOutputConfig.OPTION_SUPPORTED_RESOLUTIONS, list);
            return this;
        }

        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        @NonNull
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public Builder<T> setSurfaceOccupancyPriority(int i) {
            getMutableConfig().insertOption(UseCaseConfig.OPTION_SURFACE_OCCUPANCY_PRIORITY, Integer.valueOf(i));
            return this;
        }

        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        @NonNull
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public Builder<T> setTargetAspectRatio(int i) {
            throw new UnsupportedOperationException("setTargetAspectRatio is not supported.");
        }

        @Override // androidx.camera.core.internal.TargetConfig.Builder
        @NonNull
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public Builder<T> setTargetClass(@NonNull Class<VideoCapture<T>> cls) {
            getMutableConfig().insertOption(TargetConfig.OPTION_TARGET_CLASS, cls);
            if (getMutableConfig().retrieveOption(TargetConfig.OPTION_TARGET_NAME, null) == null) {
                setTargetName(cls.getCanonicalName() + HelpFormatter.DEFAULT_OPT_PREFIX + UUID.randomUUID());
            }
            return this;
        }

        @Override // androidx.camera.core.internal.TargetConfig.Builder
        @NonNull
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public Builder<T> setTargetName(@NonNull String str) {
            getMutableConfig().insertOption(TargetConfig.OPTION_TARGET_NAME, str);
            return this;
        }

        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        @NonNull
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public Builder<T> setTargetResolution(@NonNull Size size) {
            throw new UnsupportedOperationException("setTargetResolution is not supported.");
        }

        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        @NonNull
        public Builder<T> setTargetRotation(int i) {
            getMutableConfig().insertOption(ImageOutputConfig.OPTION_TARGET_ROTATION, Integer.valueOf(i));
            return this;
        }

        @Override // androidx.camera.core.internal.UseCaseEventConfig.Builder
        @NonNull
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public Builder<T> setUseCaseEventCallback(@NonNull UseCase.EventCallback eventCallback) {
            getMutableConfig().insertOption(UseCaseEventConfig.OPTION_USE_CASE_EVENT_CALLBACK, eventCallback);
            return this;
        }

        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        @NonNull
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public Builder<T> setZslDisabled(boolean z) {
            getMutableConfig().insertOption(UseCaseConfig.OPTION_ZSL_DISABLED, Boolean.valueOf(z));
            return this;
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: classes.dex */
    public static final class Defaults implements ConfigProvider<VideoCaptureConfig<?>> {

        /* renamed from: a */
        public static final VideoOutput f11767a;

        /* renamed from: b */
        public static final VideoCaptureConfig f11768b;

        /* renamed from: c */
        public static final Function f11769c;

        /* renamed from: d */
        public static final Range f11770d;

        /* renamed from: e */
        public static final DynamicRange f11771e;

        static {
            VideoOutput videoOutput = new VideoOutput() { // from class: R12
                @Override // androidx.camera.video.VideoOutput
                public /* synthetic */ VideoCapabilities getMediaCapabilities(CameraInfo cameraInfo) {
                    return AbstractC19455d22.m31941a(this, cameraInfo);
                }

                @Override // androidx.camera.video.VideoOutput
                public /* synthetic */ Observable getMediaSpec() {
                    return AbstractC19455d22.m31940b(this);
                }

                @Override // androidx.camera.video.VideoOutput
                public /* synthetic */ Observable getStreamInfo() {
                    return AbstractC19455d22.m31939c(this);
                }

                @Override // androidx.camera.video.VideoOutput
                public /* synthetic */ void onSourceStateChanged(VideoOutput.SourceState sourceState) {
                    AbstractC19455d22.m31938d(this, sourceState);
                }

                @Override // androidx.camera.video.VideoOutput
                public final void onSurfaceRequested(SurfaceRequest surfaceRequest) {
                    surfaceRequest.willNotProvideSurface();
                }

                @Override // androidx.camera.video.VideoOutput
                public /* synthetic */ void onSurfaceRequested(SurfaceRequest surfaceRequest, Timebase timebase) {
                    AbstractC19455d22.m31937e(this, surfaceRequest, timebase);
                }
            };
            f11767a = videoOutput;
            Function m62306b = m62306b();
            f11769c = m62306b;
            f11770d = new Range(30, 30);
            DynamicRange dynamicRange = DynamicRange.SDR;
            f11771e = dynamicRange;
            f11768b = new Builder(videoOutput).setSurfaceOccupancyPriority(5).m62308c(m62306b).setDynamicRange(dynamicRange).setCaptureType(UseCaseConfigFactory.CaptureType.VIDEO_CAPTURE).getUseCaseConfig();
        }

        /* renamed from: a */
        public static /* synthetic */ VideoEncoderInfo m62307a(VideoEncoderConfig videoEncoderConfig) {
            return m62305c(videoEncoderConfig);
        }

        /* renamed from: b */
        public static Function m62306b() {
            return new Function() { // from class: S12
                @Override // androidx.arch.core.util.Function
                public final Object apply(Object obj) {
                    return VideoCapture.Defaults.m62307a((VideoEncoderConfig) obj);
                }
            };
        }

        /* renamed from: c */
        public static /* synthetic */ VideoEncoderInfo m62305c(VideoEncoderConfig videoEncoderConfig) {
            try {
                return VideoEncoderInfoImpl.from(videoEncoderConfig);
            } catch (InvalidConfigException e) {
                Logger.m63222w("VideoCapture", "Unable to find VideoEncoderInfo", e);
                return null;
            }
        }

        @Override // androidx.camera.core.impl.ConfigProvider
        @NonNull
        public VideoCaptureConfig<?> getConfig() {
            return f11768b;
        }
    }

    /* renamed from: androidx.camera.video.VideoCapture$a */
    /* loaded from: classes.dex */
    public class C2622a implements Observable.Observer {
        public C2622a() {
            VideoCapture.this = r1;
        }

        @Override // androidx.camera.core.impl.Observable.Observer
        /* renamed from: a */
        public void onNewData(StreamInfo streamInfo) {
            if (streamInfo != null) {
                if (VideoCapture.this.f11759t == VideoOutput.SourceState.INACTIVE) {
                    return;
                }
                Logger.m63230d("VideoCapture", "Stream info update: old: " + VideoCapture.this.f11755p + " new: " + streamInfo);
                VideoCapture videoCapture = VideoCapture.this;
                StreamInfo streamInfo2 = videoCapture.f11755p;
                videoCapture.f11755p = streamInfo;
                StreamSpec streamSpec = (StreamSpec) Preconditions.checkNotNull(videoCapture.getAttachedStreamSpec());
                if (!VideoCapture.this.m62354G(streamInfo2.getId(), streamInfo.getId()) && !VideoCapture.this.m62336Y(streamInfo2, streamInfo)) {
                    if ((streamInfo2.getId() != -1 && streamInfo.getId() == -1) || (streamInfo2.getId() == -1 && streamInfo.getId() != -1)) {
                        VideoCapture videoCapture2 = VideoCapture.this;
                        videoCapture2.m62314w(videoCapture2.f11756q, streamInfo, streamSpec);
                        VideoCapture videoCapture3 = VideoCapture.this;
                        videoCapture3.updateSessionConfig(videoCapture3.f11756q.build());
                        VideoCapture.this.notifyReset();
                        return;
                    } else if (streamInfo2.getStreamState() != streamInfo.getStreamState()) {
                        VideoCapture videoCapture4 = VideoCapture.this;
                        videoCapture4.m62314w(videoCapture4.f11756q, streamInfo, streamSpec);
                        VideoCapture videoCapture5 = VideoCapture.this;
                        videoCapture5.updateSessionConfig(videoCapture5.f11756q.build());
                        VideoCapture.this.notifyUpdated();
                        return;
                    } else {
                        return;
                    }
                }
                VideoCapture videoCapture6 = VideoCapture.this;
                videoCapture6.m62345P(videoCapture6.getCameraId(), (VideoCaptureConfig) VideoCapture.this.getCurrentConfig(), (StreamSpec) Preconditions.checkNotNull(VideoCapture.this.getAttachedStreamSpec()));
                return;
            }
            throw new IllegalArgumentException("StreamInfo can't be null");
        }

        @Override // androidx.camera.core.impl.Observable.Observer
        public void onError(Throwable th2) {
            Logger.m63222w("VideoCapture", "Receive onError from StreamState observer", th2);
        }
    }

    /* renamed from: androidx.camera.video.VideoCapture$b */
    /* loaded from: classes.dex */
    public class C2623b extends CameraCaptureCallback {

        /* renamed from: a */
        public boolean f11773a = true;

        /* renamed from: b */
        public final /* synthetic */ AtomicBoolean f11774b;

        /* renamed from: c */
        public final /* synthetic */ CallbackToFutureAdapter.Completer f11775c;

        /* renamed from: d */
        public final /* synthetic */ SessionConfig.Builder f11776d;

        public C2623b(AtomicBoolean atomicBoolean, CallbackToFutureAdapter.Completer completer, SessionConfig.Builder builder) {
            VideoCapture.this = r1;
            this.f11774b = atomicBoolean;
            this.f11775c = completer;
            this.f11776d = builder;
        }

        /* renamed from: a */
        public static /* synthetic */ void m62303a(C2623b c2623b, SessionConfig.Builder builder) {
            c2623b.m62302b(builder);
        }

        /* renamed from: b */
        public final /* synthetic */ void m62302b(SessionConfig.Builder builder) {
            builder.removeCameraCaptureCallback(this);
        }

        @Override // androidx.camera.core.impl.CameraCaptureCallback
        public void onCaptureCompleted(CameraCaptureResult cameraCaptureResult) {
            Object tag;
            super.onCaptureCompleted(cameraCaptureResult);
            if (this.f11773a) {
                this.f11773a = false;
                Logger.m63230d("VideoCapture", "cameraCaptureResult timestampNs = " + cameraCaptureResult.getTimestamp() + ", current system uptimeMs = " + SystemClock.uptimeMillis() + ", current system realtimeMs = " + SystemClock.elapsedRealtime());
            }
            if (!this.f11774b.get() && (tag = cameraCaptureResult.getTagBundle().getTag("androidx.camera.video.VideoCapture.streamUpdate")) != null && ((Integer) tag).intValue() == this.f11775c.hashCode() && this.f11775c.set(null) && !this.f11774b.getAndSet(true)) {
                ScheduledExecutorService mainThreadExecutor = CameraXExecutors.mainThreadExecutor();
                final SessionConfig.Builder builder = this.f11776d;
                mainThreadExecutor.execute(new Runnable() { // from class: Q12
                    @Override // java.lang.Runnable
                    public final void run() {
                        VideoCapture.C2623b.m62303a(VideoCapture.C2623b.this, builder);
                    }
                });
            }
        }
    }

    /* renamed from: androidx.camera.video.VideoCapture$c */
    /* loaded from: classes.dex */
    public class C2624c implements FutureCallback {

        /* renamed from: a */
        public final /* synthetic */ ListenableFuture f11778a;

        /* renamed from: b */
        public final /* synthetic */ boolean f11779b;

        public C2624c(ListenableFuture listenableFuture, boolean z) {
            VideoCapture.this = r1;
            this.f11778a = listenableFuture;
            this.f11779b = z;
        }

        @Override // androidx.camera.core.impl.utils.futures.FutureCallback
        /* renamed from: a */
        public void onSuccess(Void r3) {
            VideoOutput.SourceState sourceState;
            ListenableFuture listenableFuture = this.f11778a;
            VideoCapture videoCapture = VideoCapture.this;
            if (listenableFuture == videoCapture.f11757r && videoCapture.f11759t != VideoOutput.SourceState.INACTIVE) {
                if (this.f11779b) {
                    sourceState = VideoOutput.SourceState.ACTIVE_STREAMING;
                } else {
                    sourceState = VideoOutput.SourceState.ACTIVE_NON_STREAMING;
                }
                videoCapture.m62342S(sourceState);
            }
        }

        @Override // androidx.camera.core.impl.utils.futures.FutureCallback
        public void onFailure(Throwable th2) {
            if (!(th2 instanceof CancellationException)) {
                Logger.m63227e("VideoCapture", "Surface update completed with unexpected exception", th2);
            }
        }
    }

    static {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6 = false;
        if (DeviceQuirks.get(PreviewStretchWhenVideoCaptureIsBoundQuirk.class) != null) {
            z = true;
        } else {
            z = false;
        }
        if (DeviceQuirks.get(PreviewDelayWhenVideoCaptureIsBoundQuirk.class) != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (DeviceQuirks.get(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.class) != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        boolean m62355F = m62355F();
        if (DeviceQuirks.get(ExtraSupportedResolutionQuirk.class) != null) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!z && !z2 && !z3) {
            z5 = false;
        } else {
            z5 = true;
        }
        f11752C = z5;
        f11751B = (z2 || z3 || m62355F || z4) ? true : true;
    }

    public VideoCapture(VideoCaptureConfig videoCaptureConfig) {
        super(videoCaptureConfig);
        this.f11755p = StreamInfo.f11747a;
        this.f11756q = new SessionConfig.Builder();
        this.f11757r = null;
        this.f11759t = VideoOutput.SourceState.INACTIVE;
        this.f11764y = false;
        this.f11765z = new C2622a();
    }

    /* renamed from: B */
    public static Object m62359B(Observable observable, Object obj) {
        ListenableFuture fetchData = observable.fetchData();
        if (!fetchData.isDone()) {
            return obj;
        }
        try {
            return fetchData.get();
        } catch (InterruptedException | ExecutionException e) {
            throw new IllegalStateException(e);
        }
    }

    /* renamed from: F */
    public static boolean m62355F() {
        for (VideoQualityQuirk videoQualityQuirk : DeviceQuirks.getAll(VideoQualityQuirk.class)) {
            if (videoQualityQuirk.workaroundBySurfaceProcessing()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: H */
    public static /* synthetic */ int m62353H(Rect rect, Size size, Size size2) {
        return (Math.abs(size.getWidth() - rect.width()) + Math.abs(size.getHeight() - rect.height())) - (Math.abs(size2.getWidth() - rect.width()) + Math.abs(size2.getHeight() - rect.height()));
    }

    /* renamed from: M */
    public static /* synthetic */ void m62348M(AtomicBoolean atomicBoolean, SessionConfig.Builder builder, CameraCaptureCallback cameraCaptureCallback) {
        Preconditions.checkState(Threads.isMainThread(), "Surface update cancellation should only occur on main thread.");
        atomicBoolean.set(true);
        builder.removeCameraCaptureCallback(cameraCaptureCallback);
    }

    /* renamed from: Q */
    public static VideoEncoderInfo m62344Q(Function function, VideoValidatedEncoderProfilesProxy videoValidatedEncoderProfilesProxy, MediaSpec mediaSpec, Size size, DynamicRange dynamicRange, Range range) {
        return (VideoEncoderInfo) function.apply(VideoConfigUtil.resolveVideoEncoderConfig(VideoConfigUtil.resolveVideoMimeInfo(mediaSpec, dynamicRange, videoValidatedEncoderProfilesProxy), Timebase.UPTIME, mediaSpec.getVideoSpec(), size, dynamicRange, range));
    }

    /* renamed from: R */
    private void m62343R() {
        CameraInternal camera = getCamera();
        SurfaceEdge surfaceEdge = this.f11754o;
        if (camera != null && surfaceEdge != null) {
            int m62318s = m62318s(getRelativeRotation(camera, isMirroringRequired(camera)));
            this.f11763x = m62318s;
            surfaceEdge.updateTransformation(m62318s, getAppTargetRotation());
        }
    }

    /* renamed from: V */
    public static boolean m62339V(Rect rect, Size size) {
        if (size.getWidth() == rect.width() && size.getHeight() == rect.height()) {
            return false;
        }
        return true;
    }

    /* renamed from: W */
    public static boolean m62338W(CameraInternal cameraInternal) {
        if (cameraInternal.getHasTransform() && f11751B) {
            return true;
        }
        return false;
    }

    /* renamed from: X */
    private boolean m62337X(CameraInternal cameraInternal) {
        if (cameraInternal.getHasTransform() && isMirroringRequired(cameraInternal)) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public static /* synthetic */ int m62333d(Rect rect, Size size, Size size2) {
        return m62353H(rect, size, size2);
    }

    /* renamed from: e */
    public static /* synthetic */ void m62332e(VideoCapture videoCapture, DeferrableSurface deferrableSurface) {
        videoCapture.m62350K(deferrableSurface);
    }

    /* renamed from: f */
    public static /* synthetic */ void m62331f(VideoCapture videoCapture) {
        videoCapture.notifyReset();
    }

    /* renamed from: g */
    public static /* synthetic */ void m62330g(AtomicBoolean atomicBoolean, SessionConfig.Builder builder, CameraCaptureCallback cameraCaptureCallback) {
        m62348M(atomicBoolean, builder, cameraCaptureCallback);
    }

    /* renamed from: h */
    public static /* synthetic */ Object m62329h(VideoCapture videoCapture, SessionConfig.Builder builder, CallbackToFutureAdapter.Completer completer) {
        return videoCapture.m62347N(builder, completer);
    }

    /* renamed from: o */
    public static void m62322o(Set set, int i, int i2, Size size, VideoEncoderInfo videoEncoderInfo) {
        if (i <= size.getWidth() && i2 <= size.getHeight()) {
            try {
                set.add(new Size(i, videoEncoderInfo.getSupportedHeightsFor(i).clamp(Integer.valueOf(i2)).intValue()));
            } catch (IllegalArgumentException e) {
                Logger.m63222w("VideoCapture", "No supportedHeights for width: " + i, e);
            }
            try {
                set.add(new Size(videoEncoderInfo.getSupportedWidthsFor(i2).clamp(Integer.valueOf(i)).intValue(), i2));
            } catch (IllegalArgumentException e2) {
                Logger.m63222w("VideoCapture", "No supportedWidths for height: " + i2, e2);
            }
        }
    }

    /* renamed from: p */
    public static Rect m62321p(final Rect rect, Size size, VideoEncoderInfo videoEncoderInfo) {
        boolean z;
        Logger.m63230d("VideoCapture", String.format("Adjust cropRect %s by width/height alignment %d/%d and supported widths %s / supported heights %s", TransformUtils.rectToString(rect), Integer.valueOf(videoEncoderInfo.getWidthAlignment()), Integer.valueOf(videoEncoderInfo.getHeightAlignment()), videoEncoderInfo.getSupportedWidths(), videoEncoderInfo.getSupportedHeights()));
        int widthAlignment = videoEncoderInfo.getWidthAlignment();
        int heightAlignment = videoEncoderInfo.getHeightAlignment();
        Range<Integer> supportedWidths = videoEncoderInfo.getSupportedWidths();
        Range<Integer> supportedHeights = videoEncoderInfo.getSupportedHeights();
        int m62316u = m62316u(rect.width(), widthAlignment, supportedWidths);
        int m62315v = m62315v(rect.width(), widthAlignment, supportedWidths);
        int m62316u2 = m62316u(rect.height(), heightAlignment, supportedHeights);
        int m62315v2 = m62315v(rect.height(), heightAlignment, supportedHeights);
        HashSet hashSet = new HashSet();
        m62322o(hashSet, m62316u, m62316u2, size, videoEncoderInfo);
        m62322o(hashSet, m62316u, m62315v2, size, videoEncoderInfo);
        m62322o(hashSet, m62315v, m62316u2, size, videoEncoderInfo);
        m62322o(hashSet, m62315v, m62315v2, size, videoEncoderInfo);
        if (hashSet.isEmpty()) {
            Logger.m63223w("VideoCapture", "Can't find valid cropped size");
            return rect;
        }
        ArrayList arrayList = new ArrayList(hashSet);
        Logger.m63230d("VideoCapture", "candidatesList = " + arrayList);
        Collections.sort(arrayList, new Comparator() { // from class: P12
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return VideoCapture.m62333d(rect, (Size) obj, (Size) obj2);
            }
        });
        Logger.m63230d("VideoCapture", "sorted candidatesList = " + arrayList);
        Size size2 = (Size) arrayList.get(0);
        int width = size2.getWidth();
        int height = size2.getHeight();
        if (width == rect.width() && height == rect.height()) {
            Logger.m63230d("VideoCapture", "No need to adjust cropRect because crop size is valid.");
            return rect;
        }
        if (width % 2 == 0 && height % 2 == 0 && width <= size.getWidth() && height <= size.getHeight()) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkState(z);
        Rect rect2 = new Rect(rect);
        if (width != rect.width()) {
            int max = Math.max(0, rect.centerX() - (width / 2));
            rect2.left = max;
            int i = max + width;
            rect2.right = i;
            if (i > size.getWidth()) {
                int width2 = size.getWidth();
                rect2.right = width2;
                rect2.left = width2 - width;
            }
        }
        if (height != rect.height()) {
            int max2 = Math.max(0, rect.centerY() - (height / 2));
            rect2.top = max2;
            int i2 = max2 + height;
            rect2.bottom = i2;
            if (i2 > size.getHeight()) {
                int height2 = size.getHeight();
                rect2.bottom = height2;
                rect2.top = height2 - height;
            }
        }
        Logger.m63230d("VideoCapture", String.format("Adjust cropRect from %s to %s", TransformUtils.rectToString(rect), TransformUtils.rectToString(rect2)));
        return rect2;
    }

    /* renamed from: t */
    public static int m62317t(boolean z, int i, int i2, Range range) {
        int i3 = i % i2;
        if (i3 != 0) {
            if (z) {
                i -= i3;
            } else {
                i += i2 - i3;
            }
        }
        return ((Integer) range.clamp(Integer.valueOf(i))).intValue();
    }

    /* renamed from: u */
    public static int m62316u(int i, int i2, Range range) {
        return m62317t(true, i, i2, range);
    }

    /* renamed from: v */
    public static int m62315v(int i, int i2, Range range) {
        return m62317t(false, i, i2, range);
    }

    @NonNull
    public static <T extends VideoOutput> VideoCapture<T> withOutput(@NonNull T t) {
        return new Builder((VideoOutput) Preconditions.checkNotNull(t)).setCaptureType(UseCaseConfigFactory.CaptureType.VIDEO_CAPTURE).build();
    }

    /* renamed from: y */
    private void m62312y() {
        Threads.checkMainThread();
        DeferrableSurface deferrableSurface = this.f11753n;
        if (deferrableSurface != null) {
            deferrableSurface.close();
            this.f11753n = null;
        }
        SurfaceProcessorNode surfaceProcessorNode = this.f11760u;
        if (surfaceProcessorNode != null) {
            surfaceProcessorNode.release();
            this.f11760u = null;
        }
        SurfaceEdge surfaceEdge = this.f11754o;
        if (surfaceEdge != null) {
            surfaceEdge.close();
            this.f11754o = null;
        }
        this.f11761v = null;
        this.f11762w = null;
        this.f11758s = null;
        this.f11755p = StreamInfo.f11747a;
        this.f11763x = 0;
        this.f11764y = false;
    }

    /* renamed from: A */
    public final SessionConfig.Builder m62360A(final String str, final VideoCaptureConfig videoCaptureConfig, final StreamSpec streamSpec) {
        Timebase timebase;
        boolean z;
        Threads.checkMainThread();
        final CameraInternal cameraInternal = (CameraInternal) Preconditions.checkNotNull(getCamera());
        Size resolution = streamSpec.getResolution();
        Runnable runnable = new Runnable() { // from class: K12
            {
                VideoCapture.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                VideoCapture.m62331f(VideoCapture.this);
            }
        };
        Range<Integer> expectedFrameRateRange = streamSpec.getExpectedFrameRateRange();
        if (Objects.equals(expectedFrameRateRange, StreamSpec.FRAME_RATE_RANGE_UNSPECIFIED)) {
            expectedFrameRateRange = Defaults.f11770d;
        }
        Range<Integer> range = expectedFrameRateRange;
        MediaSpec m62358C = m62358C();
        Objects.requireNonNull(m62358C);
        VideoCapabilities m62357D = m62357D(cameraInternal.getCameraInfo());
        DynamicRange dynamicRange = streamSpec.getDynamicRange();
        VideoEncoderInfo m62356E = m62356E(videoCaptureConfig.getVideoEncoderInfoFinder(), m62357D, dynamicRange, m62358C, resolution, range);
        this.f11763x = m62318s(getRelativeRotation(cameraInternal, isMirroringRequired(cameraInternal)));
        Rect m62313x = m62313x(resolution, m62356E);
        Rect m62320q = m62320q(m62313x, this.f11763x);
        this.f11762w = m62320q;
        Size m62319r = m62319r(resolution, m62313x, m62320q);
        if (m62340U()) {
            this.f11764y = true;
        }
        SurfaceProcessorNode m62311z = m62311z(cameraInternal, this.f11762w, resolution, dynamicRange);
        this.f11760u = m62311z;
        if (m62311z == null && cameraInternal.getHasTransform()) {
            timebase = Timebase.UPTIME;
        } else {
            timebase = cameraInternal.getCameraInfoInternal().getTimebase();
        }
        final Timebase timebase2 = timebase;
        Logger.m63230d("VideoCapture", "camera timebase = " + cameraInternal.getCameraInfoInternal().getTimebase() + ", processing timebase = " + timebase2);
        StreamSpec build = streamSpec.toBuilder().setResolution(m62319r).setExpectedFrameRateRange(range).build();
        if (this.f11754o == null) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkState(z);
        SurfaceEdge surfaceEdge = new SurfaceEdge(2, 34, build, getSensorToBufferTransformMatrix(), cameraInternal.getHasTransform(), this.f11762w, this.f11763x, getAppTargetRotation(), m62337X(cameraInternal));
        this.f11754o = surfaceEdge;
        surfaceEdge.addOnInvalidatedListener(runnable);
        if (this.f11760u != null) {
            SurfaceProcessorNode.OutConfig m62670of = SurfaceProcessorNode.OutConfig.m62670of(this.f11754o);
            final SurfaceEdge surfaceEdge2 = this.f11760u.transform(SurfaceProcessorNode.AbstractC2559In.m62672of(this.f11754o, Collections.singletonList(m62670of))).get(m62670of);
            Objects.requireNonNull(surfaceEdge2);
            surfaceEdge2.addOnInvalidatedListener(new Runnable() { // from class: L12
                @Override // java.lang.Runnable
                public final void run() {
                    VideoCapture.this.m62351J(surfaceEdge2, cameraInternal, videoCaptureConfig, timebase2);
                }
            });
            this.f11758s = surfaceEdge2.createSurfaceRequest(cameraInternal);
            final DeferrableSurface deferrableSurface = this.f11754o.getDeferrableSurface();
            this.f11753n = deferrableSurface;
            deferrableSurface.getTerminationFuture().addListener(new Runnable() { // from class: M12
                @Override // java.lang.Runnable
                public final void run() {
                    VideoCapture.m62332e(VideoCapture.this, deferrableSurface);
                }
            }, CameraXExecutors.mainThreadExecutor());
        } else {
            SurfaceRequest createSurfaceRequest = this.f11754o.createSurfaceRequest(cameraInternal);
            this.f11758s = createSurfaceRequest;
            this.f11753n = createSurfaceRequest.getDeferrableSurface();
        }
        videoCaptureConfig.getVideoOutput().onSurfaceRequested(this.f11758s, timebase2);
        m62343R();
        this.f11753n.setContainerClass(MediaCodec.class);
        SessionConfig.Builder createFrom = SessionConfig.Builder.createFrom(videoCaptureConfig, streamSpec.getResolution());
        createFrom.setExpectedFrameRateRange(streamSpec.getExpectedFrameRateRange());
        createFrom.addErrorListener(new SessionConfig.ErrorListener() { // from class: N12
            @Override // androidx.camera.core.impl.SessionConfig.ErrorListener
            public final void onError(SessionConfig sessionConfig, SessionConfig.SessionError sessionError) {
                VideoCapture.this.m62349L(str, videoCaptureConfig, streamSpec, sessionConfig, sessionError);
            }
        });
        if (f11752C) {
            createFrom.setTemplateType(1);
        }
        if (streamSpec.getImplementationOptions() != null) {
            createFrom.addImplementationOptions(streamSpec.getImplementationOptions());
        }
        return createFrom;
    }

    /* renamed from: C */
    public final MediaSpec m62358C() {
        return (MediaSpec) m62359B(getOutput().getMediaSpec(), null);
    }

    /* renamed from: D */
    public final VideoCapabilities m62357D(CameraInfo cameraInfo) {
        return getOutput().getMediaCapabilities(cameraInfo);
    }

    /* renamed from: E */
    public final VideoEncoderInfo m62356E(Function function, VideoCapabilities videoCapabilities, DynamicRange dynamicRange, MediaSpec mediaSpec, Size size, Range range) {
        VideoEncoderInfo videoEncoderInfo = this.f11761v;
        if (videoEncoderInfo != null) {
            return videoEncoderInfo;
        }
        VideoValidatedEncoderProfilesProxy findHighestSupportedEncoderProfilesFor = videoCapabilities.findHighestSupportedEncoderProfilesFor(size, dynamicRange);
        VideoEncoderInfo m62344Q = m62344Q(function, findHighestSupportedEncoderProfilesFor, mediaSpec, size, dynamicRange, range);
        Size size2 = null;
        if (m62344Q == null) {
            Logger.m63223w("VideoCapture", "Can't find videoEncoderInfo");
            return null;
        }
        if (findHighestSupportedEncoderProfilesFor != null) {
            size2 = new Size(findHighestSupportedEncoderProfilesFor.getDefaultVideoProfile().getWidth(), findHighestSupportedEncoderProfilesFor.getDefaultVideoProfile().getHeight());
        }
        VideoEncoderInfo from = VideoEncoderInfoWrapper.from(m62344Q, size2);
        this.f11761v = from;
        return from;
    }

    /* renamed from: G */
    public boolean m62354G(int i, int i2) {
        Set set = StreamInfo.f11748b;
        if (!set.contains(Integer.valueOf(i)) && !set.contains(Integer.valueOf(i2)) && i != i2) {
            return true;
        }
        return false;
    }

    /* renamed from: K */
    public final /* synthetic */ void m62350K(DeferrableSurface deferrableSurface) {
        if (deferrableSurface == this.f11753n) {
            m62312y();
        }
    }

    /* renamed from: L */
    public final /* synthetic */ void m62349L(String str, VideoCaptureConfig videoCaptureConfig, StreamSpec streamSpec, SessionConfig sessionConfig, SessionConfig.SessionError sessionError) {
        m62345P(str, videoCaptureConfig, streamSpec);
    }

    /* renamed from: N */
    public final /* synthetic */ Object m62347N(final SessionConfig.Builder builder, CallbackToFutureAdapter.Completer completer) {
        builder.addTag("androidx.camera.video.VideoCapture.streamUpdate", Integer.valueOf(completer.hashCode()));
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        final C2623b c2623b = new C2623b(atomicBoolean, completer, builder);
        completer.addCancellationListener(new Runnable() { // from class: O12
            @Override // java.lang.Runnable
            public final void run() {
                VideoCapture.m62330g(atomicBoolean, builder, c2623b);
            }
        }, CameraXExecutors.directExecutor());
        builder.addRepeatingCameraCaptureCallback(c2623b);
        return String.format("%s[0x%x]", "androidx.camera.video.VideoCapture.streamUpdate", Integer.valueOf(completer.hashCode()));
    }

    /* renamed from: O */
    public final void m62351J(SurfaceEdge surfaceEdge, CameraInternal cameraInternal, VideoCaptureConfig videoCaptureConfig, Timebase timebase) {
        if (cameraInternal == getCamera()) {
            this.f11758s = surfaceEdge.createSurfaceRequest(cameraInternal);
            videoCaptureConfig.getVideoOutput().onSurfaceRequested(this.f11758s, timebase);
            m62343R();
        }
    }

    /* renamed from: P */
    public void m62345P(String str, VideoCaptureConfig videoCaptureConfig, StreamSpec streamSpec) {
        m62312y();
        if (isCurrentCamera(str)) {
            SessionConfig.Builder m62360A = m62360A(str, videoCaptureConfig, streamSpec);
            this.f11756q = m62360A;
            m62314w(m62360A, this.f11755p, streamSpec);
            updateSessionConfig(this.f11756q.build());
            notifyReset();
        }
    }

    /* renamed from: S */
    public void m62342S(VideoOutput.SourceState sourceState) {
        if (sourceState != this.f11759t) {
            this.f11759t = sourceState;
            getOutput().onSourceStateChanged(sourceState);
        }
    }

    /* renamed from: T */
    public final void m62341T(final SessionConfig.Builder builder, boolean z) {
        ListenableFuture listenableFuture = this.f11757r;
        if (listenableFuture != null && listenableFuture.cancel(false)) {
            Logger.m63230d("VideoCapture", "A newer surface update is requested. Previous surface update cancelled.");
        }
        ListenableFuture future = CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: J12
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                return VideoCapture.m62329h(VideoCapture.this, builder, completer);
            }
        });
        this.f11757r = future;
        Futures.addCallback(future, new C2624c(future, z), CameraXExecutors.mainThreadExecutor());
    }

    /* renamed from: U */
    public final boolean m62340U() {
        if (this.f11755p.getInProgressTransformationInfo() != null) {
            return true;
        }
        return false;
    }

    /* renamed from: Y */
    public boolean m62336Y(StreamInfo streamInfo, StreamInfo streamInfo2) {
        if (this.f11764y && streamInfo.getInProgressTransformationInfo() != null && streamInfo2.getInProgressTransformationInfo() == null) {
            return true;
        }
        return false;
    }

    /* renamed from: Z */
    public final void m62335Z(CameraInfoInternal cameraInfoInternal, UseCaseConfig.Builder builder) {
        boolean z;
        MediaSpec m62358C = m62358C();
        if (m62358C != null) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z, "Unable to update target resolution by null MediaSpec.");
        DynamicRange dynamicRange = getDynamicRange();
        VideoCapabilities m62357D = m62357D(cameraInfoInternal);
        List<Quality> supportedQualities = m62357D.getSupportedQualities(dynamicRange);
        if (supportedQualities.isEmpty()) {
            Logger.m63223w("VideoCapture", "Can't find any supported quality on the device.");
            return;
        }
        VideoSpec videoSpec = m62358C.getVideoSpec();
        QualitySelector qualitySelector = videoSpec.getQualitySelector();
        List<Quality> m62512d = qualitySelector.m62512d(supportedQualities);
        Logger.m63230d("VideoCapture", "Found selectedQualities " + m62512d + " by " + qualitySelector);
        if (!m62512d.isEmpty()) {
            int mo61933a = videoSpec.mo61933a();
            C22683vp1 c22683vp1 = new C22683vp1(cameraInfoInternal.getSupportedResolutions(getImageFormat()), QualitySelector.getQualityToResolutionMap(m62357D, dynamicRange));
            ArrayList arrayList = new ArrayList();
            for (Quality quality : m62512d) {
                arrayList.addAll(c22683vp1.m991g(quality, mo61933a));
            }
            Logger.m63230d("VideoCapture", "Set custom ordered resolutions = " + arrayList);
            builder.getMutableConfig().insertOption(ImageOutputConfig.OPTION_CUSTOM_ORDERED_RESOLUTIONS, arrayList);
            return;
        }
        throw new IllegalArgumentException("Unable to find supported quality by QualitySelector");
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [androidx.camera.core.impl.UseCaseConfig, androidx.camera.core.impl.UseCaseConfig<?>] */
    @Override // androidx.camera.core.UseCase
    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public UseCaseConfig<?> getDefaultConfig(boolean z, @NonNull UseCaseConfigFactory useCaseConfigFactory) {
        Defaults defaults = f11750A;
        Config config = useCaseConfigFactory.getConfig(defaults.getConfig().getCaptureType(), 1);
        if (z) {
            config = AbstractC12183kw.m26583b(config, defaults.getConfig());
        }
        if (config == null) {
            return null;
        }
        return getUseCaseConfigBuilder(config).getUseCaseConfig();
    }

    @NonNull
    public DynamicRange getDynamicRange() {
        if (getCurrentConfig().hasDynamicRange()) {
            return getCurrentConfig().getDynamicRange();
        }
        return Defaults.f11771e;
    }

    public int getMirrorMode() {
        return getMirrorModeInternal();
    }

    @NonNull
    public T getOutput() {
        return (T) ((VideoCaptureConfig) getCurrentConfig()).getVideoOutput();
    }

    @Override // androidx.camera.core.UseCase
    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public Set<Integer> getSupportedEffectTargets() {
        HashSet hashSet = new HashSet();
        hashSet.add(2);
        return hashSet;
    }

    @NonNull
    public Range<Integer> getTargetFrameRate() {
        return getTargetFrameRateInternal();
    }

    public int getTargetRotation() {
        return getTargetRotationInternal();
    }

    @Override // androidx.camera.core.UseCase
    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public UseCaseConfig.Builder<?, ?, ?> getUseCaseConfigBuilder(@NonNull Config config) {
        return Builder.m62309b(config);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [androidx.camera.core.impl.UseCaseConfig, androidx.camera.core.impl.UseCaseConfig<?>] */
    @Override // androidx.camera.core.UseCase
    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public UseCaseConfig<?> onMergeConfig(@NonNull CameraInfoInternal cameraInfoInternal, @NonNull UseCaseConfig.Builder<?, ?, ?> builder) {
        m62335Z(cameraInfoInternal, builder);
        return builder.getUseCaseConfig();
    }

    @Override // androidx.camera.core.UseCase
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void onStateAttached() {
        boolean z;
        super.onStateAttached();
        Preconditions.checkNotNull(getAttachedStreamSpec(), "The suggested stream specification should be already updated and shouldn't be null.");
        if (this.f11758s == null) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkState(z, "The surface request should be null when VideoCapture is attached.");
        StreamSpec streamSpec = (StreamSpec) Preconditions.checkNotNull(getAttachedStreamSpec());
        this.f11755p = (StreamInfo) m62359B(getOutput().getStreamInfo(), StreamInfo.f11747a);
        SessionConfig.Builder m62360A = m62360A(getCameraId(), (VideoCaptureConfig) getCurrentConfig(), streamSpec);
        this.f11756q = m62360A;
        m62314w(m62360A, this.f11755p, streamSpec);
        updateSessionConfig(this.f11756q.build());
        notifyActive();
        getOutput().getStreamInfo().addObserver(CameraXExecutors.mainThreadExecutor(), this.f11765z);
        m62342S(VideoOutput.SourceState.ACTIVE_NON_STREAMING);
    }

    @Override // androidx.camera.core.UseCase
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void onStateDetached() {
        Preconditions.checkState(Threads.isMainThread(), "VideoCapture can only be detached on the main thread.");
        m62342S(VideoOutput.SourceState.INACTIVE);
        getOutput().getStreamInfo().removeObserver(this.f11765z);
        ListenableFuture listenableFuture = this.f11757r;
        if (listenableFuture != null && listenableFuture.cancel(false)) {
            Logger.m63230d("VideoCapture", "VideoCapture is detached from the camera. Surface update cancelled.");
        }
        m62312y();
    }

    @Override // androidx.camera.core.UseCase
    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public StreamSpec onSuggestedStreamSpecImplementationOptionsUpdated(@NonNull Config config) {
        this.f11756q.addImplementationOptions(config);
        updateSessionConfig(this.f11756q.build());
        return getAttachedStreamSpec().toBuilder().setImplementationOptions(config).build();
    }

    @Override // androidx.camera.core.UseCase
    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public StreamSpec onSuggestedStreamSpecUpdated(@NonNull StreamSpec streamSpec) {
        Logger.m63230d("VideoCapture", "onSuggestedStreamSpecUpdated: " + streamSpec);
        List customOrderedResolutions = ((VideoCaptureConfig) getCurrentConfig()).getCustomOrderedResolutions(null);
        if (customOrderedResolutions != null && !customOrderedResolutions.contains(streamSpec.getResolution())) {
            Logger.m63223w("VideoCapture", "suggested resolution " + streamSpec.getResolution() + " is not in custom ordered resolutions " + customOrderedResolutions);
        }
        return streamSpec;
    }

    /* renamed from: q */
    public final Rect m62320q(Rect rect, int i) {
        if (m62340U()) {
            return TransformUtils.sizeToRect(TransformUtils.getRotatedSize(((SurfaceRequest.TransformationInfo) Preconditions.checkNotNull(this.f11755p.getInProgressTransformationInfo())).getCropRect(), i));
        }
        return rect;
    }

    /* renamed from: r */
    public final Size m62319r(Size size, Rect rect, Rect rect2) {
        if (m62340U() && !rect2.equals(rect)) {
            float height = rect2.height() / rect.height();
            return new Size((int) Math.ceil(size.getWidth() * height), (int) Math.ceil(size.getHeight() * height));
        }
        return size;
    }

    /* renamed from: s */
    public final int m62318s(int i) {
        if (m62340U()) {
            return TransformUtils.within360(i - this.f11755p.getInProgressTransformationInfo().getRotationDegrees());
        }
        return i;
    }

    public void setTargetRotation(int i) {
        if (setTargetRotationInternal(i)) {
            m62343R();
        }
    }

    @Override // androidx.camera.core.UseCase
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setViewPortCropRect(@NonNull Rect rect) {
        super.setViewPortCropRect(rect);
        m62343R();
    }

    @NonNull
    public String toString() {
        return "VideoCapture:" + getName();
    }

    /* renamed from: w */
    public void m62314w(SessionConfig.Builder builder, StreamInfo streamInfo, StreamSpec streamSpec) {
        boolean z;
        boolean z2 = false;
        if (streamInfo.getId() == -1) {
            z = true;
        } else {
            z = false;
        }
        if (streamInfo.getStreamState() == StreamInfo.StreamState.ACTIVE) {
            z2 = true;
        }
        if (z && z2) {
            throw new IllegalStateException("Unexpected stream state, stream is error but active");
        }
        builder.clearSurfaces();
        DynamicRange dynamicRange = streamSpec.getDynamicRange();
        if (!z) {
            if (z2) {
                builder.addSurface(this.f11753n, dynamicRange);
            } else {
                builder.addNonRepeatingSurface(this.f11753n, dynamicRange);
            }
        }
        m62341T(builder, z2);
    }

    /* renamed from: x */
    public final Rect m62313x(Size size, VideoEncoderInfo videoEncoderInfo) {
        Rect rect;
        if (getViewPortCropRect() != null) {
            rect = getViewPortCropRect();
        } else {
            rect = new Rect(0, 0, size.getWidth(), size.getHeight());
        }
        if (videoEncoderInfo != null && !videoEncoderInfo.isSizeSupported(rect.width(), rect.height())) {
            return m62321p(rect, size, videoEncoderInfo);
        }
        return rect;
    }

    /* renamed from: z */
    public final SurfaceProcessorNode m62311z(CameraInternal cameraInternal, Rect rect, Size size, DynamicRange dynamicRange) {
        SurfaceProcessorInternal newInstance;
        if (getEffect() == null && !m62338W(cameraInternal) && !m62339V(rect, size) && !m62337X(cameraInternal) && !m62340U()) {
            return null;
        }
        Logger.m63230d("VideoCapture", "Surface processing is enabled.");
        CameraInternal camera = getCamera();
        Objects.requireNonNull(camera);
        CameraInternal cameraInternal2 = camera;
        if (getEffect() != null) {
            newInstance = getEffect().createSurfaceProcessorInternal();
        } else {
            newInstance = DefaultSurfaceProcessor.Factory.newInstance(dynamicRange);
        }
        return new SurfaceProcessorNode(cameraInternal2, newInstance);
    }
}
