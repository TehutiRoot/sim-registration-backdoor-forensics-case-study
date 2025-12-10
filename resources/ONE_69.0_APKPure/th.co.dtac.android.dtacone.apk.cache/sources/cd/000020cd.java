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
    public static final Defaults f11838A = new Defaults();

    /* renamed from: B */
    public static boolean f11839B;

    /* renamed from: C */
    public static final boolean f11840C;

    /* renamed from: n */
    public DeferrableSurface f11841n;

    /* renamed from: o */
    public SurfaceEdge f11842o;

    /* renamed from: p */
    public StreamInfo f11843p;

    /* renamed from: q */
    public SessionConfig.Builder f11844q;

    /* renamed from: r */
    public ListenableFuture f11845r;

    /* renamed from: s */
    public SurfaceRequest f11846s;

    /* renamed from: t */
    public VideoOutput.SourceState f11847t;

    /* renamed from: u */
    public SurfaceProcessorNode f11848u;

    /* renamed from: v */
    public VideoEncoderInfo f11849v;

    /* renamed from: w */
    public Rect f11850w;

    /* renamed from: x */
    public int f11851x;

    /* renamed from: y */
    public boolean f11852y;

    /* renamed from: z */
    public final Observable.Observer f11853z;

    @RequiresApi(21)
    /* loaded from: classes.dex */
    public static final class Builder<T extends VideoOutput> implements UseCaseConfig.Builder<VideoCapture<T>, VideoCaptureConfig<T>, Builder<T>>, ImageOutputConfig.Builder<Builder<T>>, ImageInputConfig.Builder<Builder<T>>, ThreadConfig.Builder<Builder<T>> {

        /* renamed from: a */
        public final MutableOptionsBundle f11854a;

        public Builder(@NonNull T t) {
            this(m62258a(t));
        }

        /* renamed from: a */
        public static MutableOptionsBundle m62258a(VideoOutput videoOutput) {
            MutableOptionsBundle create = MutableOptionsBundle.create();
            create.insertOption(VideoCaptureConfig.OPTION_VIDEO_OUTPUT, videoOutput);
            return create;
        }

        /* renamed from: b */
        public static Builder m62257b(Config config) {
            return new Builder(MutableOptionsBundle.from(config));
        }

        @NonNull
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public static <T extends VideoOutput> Builder<T> fromConfig(@NonNull VideoCaptureConfig<T> videoCaptureConfig) {
            return new Builder<>(MutableOptionsBundle.from((Config) videoCaptureConfig));
        }

        /* renamed from: c */
        public Builder m62256c(Function function) {
            getMutableConfig().insertOption(VideoCaptureConfig.OPTION_VIDEO_ENCODER_INFO_FINDER, function);
            return this;
        }

        @Override // androidx.camera.core.ExtendableBuilder
        @NonNull
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public MutableConfig getMutableConfig() {
            return this.f11854a;
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
            this.f11854a = mutableOptionsBundle;
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
            return new VideoCaptureConfig<>(OptionsBundle.from(this.f11854a));
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
        public static final VideoOutput f11855a;

        /* renamed from: b */
        public static final VideoCaptureConfig f11856b;

        /* renamed from: c */
        public static final Function f11857c;

        /* renamed from: d */
        public static final Range f11858d;

        /* renamed from: e */
        public static final DynamicRange f11859e;

        static {
            VideoOutput videoOutput = new VideoOutput() { // from class: O22
                @Override // androidx.camera.video.VideoOutput
                public /* synthetic */ VideoCapabilities getMediaCapabilities(CameraInfo cameraInfo) {
                    return AbstractC18983a32.m65186a(this, cameraInfo);
                }

                @Override // androidx.camera.video.VideoOutput
                public /* synthetic */ Observable getMediaSpec() {
                    return AbstractC18983a32.m65185b(this);
                }

                @Override // androidx.camera.video.VideoOutput
                public /* synthetic */ Observable getStreamInfo() {
                    return AbstractC18983a32.m65184c(this);
                }

                @Override // androidx.camera.video.VideoOutput
                public /* synthetic */ void onSourceStateChanged(VideoOutput.SourceState sourceState) {
                    AbstractC18983a32.m65183d(this, sourceState);
                }

                @Override // androidx.camera.video.VideoOutput
                public final void onSurfaceRequested(SurfaceRequest surfaceRequest) {
                    surfaceRequest.willNotProvideSurface();
                }

                @Override // androidx.camera.video.VideoOutput
                public /* synthetic */ void onSurfaceRequested(SurfaceRequest surfaceRequest, Timebase timebase) {
                    AbstractC18983a32.m65182e(this, surfaceRequest, timebase);
                }
            };
            f11855a = videoOutput;
            Function m62254b = m62254b();
            f11857c = m62254b;
            f11858d = new Range(30, 30);
            DynamicRange dynamicRange = DynamicRange.SDR;
            f11859e = dynamicRange;
            f11856b = new Builder(videoOutput).setSurfaceOccupancyPriority(5).m62256c(m62254b).setDynamicRange(dynamicRange).setCaptureType(UseCaseConfigFactory.CaptureType.VIDEO_CAPTURE).getUseCaseConfig();
        }

        /* renamed from: a */
        public static /* synthetic */ VideoEncoderInfo m62255a(VideoEncoderConfig videoEncoderConfig) {
            return m62253c(videoEncoderConfig);
        }

        /* renamed from: b */
        public static Function m62254b() {
            return new Function() { // from class: P22
                @Override // androidx.arch.core.util.Function
                public final Object apply(Object obj) {
                    return VideoCapture.Defaults.m62255a((VideoEncoderConfig) obj);
                }
            };
        }

        /* renamed from: c */
        public static /* synthetic */ VideoEncoderInfo m62253c(VideoEncoderConfig videoEncoderConfig) {
            try {
                return VideoEncoderInfoImpl.from(videoEncoderConfig);
            } catch (InvalidConfigException e) {
                Logger.m63170w("VideoCapture", "Unable to find VideoEncoderInfo", e);
                return null;
            }
        }

        @Override // androidx.camera.core.impl.ConfigProvider
        @NonNull
        public VideoCaptureConfig<?> getConfig() {
            return f11856b;
        }
    }

    /* renamed from: androidx.camera.video.VideoCapture$a */
    /* loaded from: classes.dex */
    public class C2604a implements Observable.Observer {
        public C2604a() {
            VideoCapture.this = r1;
        }

        @Override // androidx.camera.core.impl.Observable.Observer
        /* renamed from: a */
        public void onNewData(StreamInfo streamInfo) {
            if (streamInfo != null) {
                if (VideoCapture.this.f11847t == VideoOutput.SourceState.INACTIVE) {
                    return;
                }
                Logger.m63178d("VideoCapture", "Stream info update: old: " + VideoCapture.this.f11843p + " new: " + streamInfo);
                VideoCapture videoCapture = VideoCapture.this;
                StreamInfo streamInfo2 = videoCapture.f11843p;
                videoCapture.f11843p = streamInfo;
                StreamSpec streamSpec = (StreamSpec) Preconditions.checkNotNull(videoCapture.getAttachedStreamSpec());
                if (!VideoCapture.this.m62302G(streamInfo2.getId(), streamInfo.getId()) && !VideoCapture.this.m62284Y(streamInfo2, streamInfo)) {
                    if ((streamInfo2.getId() != -1 && streamInfo.getId() == -1) || (streamInfo2.getId() == -1 && streamInfo.getId() != -1)) {
                        VideoCapture videoCapture2 = VideoCapture.this;
                        videoCapture2.m62262w(videoCapture2.f11844q, streamInfo, streamSpec);
                        VideoCapture videoCapture3 = VideoCapture.this;
                        videoCapture3.updateSessionConfig(videoCapture3.f11844q.build());
                        VideoCapture.this.notifyReset();
                        return;
                    } else if (streamInfo2.getStreamState() != streamInfo.getStreamState()) {
                        VideoCapture videoCapture4 = VideoCapture.this;
                        videoCapture4.m62262w(videoCapture4.f11844q, streamInfo, streamSpec);
                        VideoCapture videoCapture5 = VideoCapture.this;
                        videoCapture5.updateSessionConfig(videoCapture5.f11844q.build());
                        VideoCapture.this.notifyUpdated();
                        return;
                    } else {
                        return;
                    }
                }
                VideoCapture videoCapture6 = VideoCapture.this;
                videoCapture6.m62293P(videoCapture6.getCameraId(), (VideoCaptureConfig) VideoCapture.this.getCurrentConfig(), (StreamSpec) Preconditions.checkNotNull(VideoCapture.this.getAttachedStreamSpec()));
                return;
            }
            throw new IllegalArgumentException("StreamInfo can't be null");
        }

        @Override // androidx.camera.core.impl.Observable.Observer
        public void onError(Throwable th2) {
            Logger.m63170w("VideoCapture", "Receive onError from StreamState observer", th2);
        }
    }

    /* renamed from: androidx.camera.video.VideoCapture$b */
    /* loaded from: classes.dex */
    public class C2605b extends CameraCaptureCallback {

        /* renamed from: a */
        public boolean f11861a = true;

        /* renamed from: b */
        public final /* synthetic */ AtomicBoolean f11862b;

        /* renamed from: c */
        public final /* synthetic */ CallbackToFutureAdapter.Completer f11863c;

        /* renamed from: d */
        public final /* synthetic */ SessionConfig.Builder f11864d;

        public C2605b(AtomicBoolean atomicBoolean, CallbackToFutureAdapter.Completer completer, SessionConfig.Builder builder) {
            VideoCapture.this = r1;
            this.f11862b = atomicBoolean;
            this.f11863c = completer;
            this.f11864d = builder;
        }

        /* renamed from: a */
        public static /* synthetic */ void m62251a(C2605b c2605b, SessionConfig.Builder builder) {
            c2605b.m62250b(builder);
        }

        /* renamed from: b */
        public final /* synthetic */ void m62250b(SessionConfig.Builder builder) {
            builder.removeCameraCaptureCallback(this);
        }

        @Override // androidx.camera.core.impl.CameraCaptureCallback
        public void onCaptureCompleted(CameraCaptureResult cameraCaptureResult) {
            Object tag;
            super.onCaptureCompleted(cameraCaptureResult);
            if (this.f11861a) {
                this.f11861a = false;
                Logger.m63178d("VideoCapture", "cameraCaptureResult timestampNs = " + cameraCaptureResult.getTimestamp() + ", current system uptimeMs = " + SystemClock.uptimeMillis() + ", current system realtimeMs = " + SystemClock.elapsedRealtime());
            }
            if (!this.f11862b.get() && (tag = cameraCaptureResult.getTagBundle().getTag("androidx.camera.video.VideoCapture.streamUpdate")) != null && ((Integer) tag).intValue() == this.f11863c.hashCode() && this.f11863c.set(null) && !this.f11862b.getAndSet(true)) {
                ScheduledExecutorService mainThreadExecutor = CameraXExecutors.mainThreadExecutor();
                final SessionConfig.Builder builder = this.f11864d;
                mainThreadExecutor.execute(new Runnable() { // from class: N22
                    @Override // java.lang.Runnable
                    public final void run() {
                        VideoCapture.C2605b.m62251a(VideoCapture.C2605b.this, builder);
                    }
                });
            }
        }
    }

    /* renamed from: androidx.camera.video.VideoCapture$c */
    /* loaded from: classes.dex */
    public class C2606c implements FutureCallback {

        /* renamed from: a */
        public final /* synthetic */ ListenableFuture f11866a;

        /* renamed from: b */
        public final /* synthetic */ boolean f11867b;

        public C2606c(ListenableFuture listenableFuture, boolean z) {
            VideoCapture.this = r1;
            this.f11866a = listenableFuture;
            this.f11867b = z;
        }

        @Override // androidx.camera.core.impl.utils.futures.FutureCallback
        /* renamed from: a */
        public void onSuccess(Void r3) {
            VideoOutput.SourceState sourceState;
            ListenableFuture listenableFuture = this.f11866a;
            VideoCapture videoCapture = VideoCapture.this;
            if (listenableFuture == videoCapture.f11845r && videoCapture.f11847t != VideoOutput.SourceState.INACTIVE) {
                if (this.f11867b) {
                    sourceState = VideoOutput.SourceState.ACTIVE_STREAMING;
                } else {
                    sourceState = VideoOutput.SourceState.ACTIVE_NON_STREAMING;
                }
                videoCapture.m62290S(sourceState);
            }
        }

        @Override // androidx.camera.core.impl.utils.futures.FutureCallback
        public void onFailure(Throwable th2) {
            if (!(th2 instanceof CancellationException)) {
                Logger.m63175e("VideoCapture", "Surface update completed with unexpected exception", th2);
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
        boolean m62303F = m62303F();
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
        f11840C = z5;
        f11839B = (z2 || z3 || m62303F || z4) ? true : true;
    }

    public VideoCapture(VideoCaptureConfig videoCaptureConfig) {
        super(videoCaptureConfig);
        this.f11843p = StreamInfo.f11835a;
        this.f11844q = new SessionConfig.Builder();
        this.f11845r = null;
        this.f11847t = VideoOutput.SourceState.INACTIVE;
        this.f11852y = false;
        this.f11853z = new C2604a();
    }

    /* renamed from: B */
    public static Object m62307B(Observable observable, Object obj) {
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
    public static boolean m62303F() {
        for (VideoQualityQuirk videoQualityQuirk : DeviceQuirks.getAll(VideoQualityQuirk.class)) {
            if (videoQualityQuirk.workaroundBySurfaceProcessing()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: H */
    public static /* synthetic */ int m62301H(Rect rect, Size size, Size size2) {
        return (Math.abs(size.getWidth() - rect.width()) + Math.abs(size.getHeight() - rect.height())) - (Math.abs(size2.getWidth() - rect.width()) + Math.abs(size2.getHeight() - rect.height()));
    }

    /* renamed from: M */
    public static /* synthetic */ void m62296M(AtomicBoolean atomicBoolean, SessionConfig.Builder builder, CameraCaptureCallback cameraCaptureCallback) {
        Preconditions.checkState(Threads.isMainThread(), "Surface update cancellation should only occur on main thread.");
        atomicBoolean.set(true);
        builder.removeCameraCaptureCallback(cameraCaptureCallback);
    }

    /* renamed from: Q */
    public static VideoEncoderInfo m62292Q(Function function, VideoValidatedEncoderProfilesProxy videoValidatedEncoderProfilesProxy, MediaSpec mediaSpec, Size size, DynamicRange dynamicRange, Range range) {
        return (VideoEncoderInfo) function.apply(VideoConfigUtil.resolveVideoEncoderConfig(VideoConfigUtil.resolveVideoMimeInfo(mediaSpec, dynamicRange, videoValidatedEncoderProfilesProxy), Timebase.UPTIME, mediaSpec.getVideoSpec(), size, dynamicRange, range));
    }

    /* renamed from: R */
    private void m62291R() {
        CameraInternal camera = getCamera();
        SurfaceEdge surfaceEdge = this.f11842o;
        if (camera != null && surfaceEdge != null) {
            int m62266s = m62266s(getRelativeRotation(camera, isMirroringRequired(camera)));
            this.f11851x = m62266s;
            surfaceEdge.updateTransformation(m62266s, getAppTargetRotation());
        }
    }

    /* renamed from: V */
    public static boolean m62287V(Rect rect, Size size) {
        if (size.getWidth() == rect.width() && size.getHeight() == rect.height()) {
            return false;
        }
        return true;
    }

    /* renamed from: W */
    public static boolean m62286W(CameraInternal cameraInternal) {
        if (cameraInternal.getHasTransform() && f11839B) {
            return true;
        }
        return false;
    }

    /* renamed from: X */
    private boolean m62285X(CameraInternal cameraInternal) {
        if (cameraInternal.getHasTransform() && isMirroringRequired(cameraInternal)) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static /* synthetic */ void m62282c(VideoCapture videoCapture, String str, VideoCaptureConfig videoCaptureConfig, StreamSpec streamSpec, SessionConfig sessionConfig, SessionConfig.SessionError sessionError) {
        videoCapture.m62297L(str, videoCaptureConfig, streamSpec, sessionConfig, sessionError);
    }

    /* renamed from: d */
    public static /* synthetic */ int m62281d(Rect rect, Size size, Size size2) {
        return m62301H(rect, size, size2);
    }

    /* renamed from: e */
    public static /* synthetic */ void m62280e(VideoCapture videoCapture, DeferrableSurface deferrableSurface) {
        videoCapture.m62298K(deferrableSurface);
    }

    /* renamed from: f */
    public static /* synthetic */ void m62279f(VideoCapture videoCapture) {
        videoCapture.notifyReset();
    }

    /* renamed from: g */
    public static /* synthetic */ void m62278g(AtomicBoolean atomicBoolean, SessionConfig.Builder builder, CameraCaptureCallback cameraCaptureCallback) {
        m62296M(atomicBoolean, builder, cameraCaptureCallback);
    }

    /* renamed from: h */
    public static /* synthetic */ Object m62277h(VideoCapture videoCapture, SessionConfig.Builder builder, CallbackToFutureAdapter.Completer completer) {
        return videoCapture.m62295N(builder, completer);
    }

    /* renamed from: i */
    public static /* synthetic */ void m62276i(VideoCapture videoCapture, SurfaceEdge surfaceEdge, CameraInternal cameraInternal, VideoCaptureConfig videoCaptureConfig, Timebase timebase) {
        videoCapture.m62299J(surfaceEdge, cameraInternal, videoCaptureConfig, timebase);
    }

    /* renamed from: o */
    public static void m62270o(Set set, int i, int i2, Size size, VideoEncoderInfo videoEncoderInfo) {
        if (i <= size.getWidth() && i2 <= size.getHeight()) {
            try {
                set.add(new Size(i, videoEncoderInfo.getSupportedHeightsFor(i).clamp(Integer.valueOf(i2)).intValue()));
            } catch (IllegalArgumentException e) {
                Logger.m63170w("VideoCapture", "No supportedHeights for width: " + i, e);
            }
            try {
                set.add(new Size(videoEncoderInfo.getSupportedWidthsFor(i2).clamp(Integer.valueOf(i)).intValue(), i2));
            } catch (IllegalArgumentException e2) {
                Logger.m63170w("VideoCapture", "No supportedWidths for height: " + i2, e2);
            }
        }
    }

    /* renamed from: p */
    public static Rect m62269p(final Rect rect, Size size, VideoEncoderInfo videoEncoderInfo) {
        boolean z;
        Logger.m63178d("VideoCapture", String.format("Adjust cropRect %s by width/height alignment %d/%d and supported widths %s / supported heights %s", TransformUtils.rectToString(rect), Integer.valueOf(videoEncoderInfo.getWidthAlignment()), Integer.valueOf(videoEncoderInfo.getHeightAlignment()), videoEncoderInfo.getSupportedWidths(), videoEncoderInfo.getSupportedHeights()));
        int widthAlignment = videoEncoderInfo.getWidthAlignment();
        int heightAlignment = videoEncoderInfo.getHeightAlignment();
        Range<Integer> supportedWidths = videoEncoderInfo.getSupportedWidths();
        Range<Integer> supportedHeights = videoEncoderInfo.getSupportedHeights();
        int m62264u = m62264u(rect.width(), widthAlignment, supportedWidths);
        int m62263v = m62263v(rect.width(), widthAlignment, supportedWidths);
        int m62264u2 = m62264u(rect.height(), heightAlignment, supportedHeights);
        int m62263v2 = m62263v(rect.height(), heightAlignment, supportedHeights);
        HashSet hashSet = new HashSet();
        m62270o(hashSet, m62264u, m62264u2, size, videoEncoderInfo);
        m62270o(hashSet, m62264u, m62263v2, size, videoEncoderInfo);
        m62270o(hashSet, m62263v, m62264u2, size, videoEncoderInfo);
        m62270o(hashSet, m62263v, m62263v2, size, videoEncoderInfo);
        if (hashSet.isEmpty()) {
            Logger.m63171w("VideoCapture", "Can't find valid cropped size");
            return rect;
        }
        ArrayList arrayList = new ArrayList(hashSet);
        Logger.m63178d("VideoCapture", "candidatesList = " + arrayList);
        Collections.sort(arrayList, new Comparator() { // from class: M22
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return VideoCapture.m62281d(rect, (Size) obj, (Size) obj2);
            }
        });
        Logger.m63178d("VideoCapture", "sorted candidatesList = " + arrayList);
        Size size2 = (Size) arrayList.get(0);
        int width = size2.getWidth();
        int height = size2.getHeight();
        if (width == rect.width() && height == rect.height()) {
            Logger.m63178d("VideoCapture", "No need to adjust cropRect because crop size is valid.");
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
        Logger.m63178d("VideoCapture", String.format("Adjust cropRect from %s to %s", TransformUtils.rectToString(rect), TransformUtils.rectToString(rect2)));
        return rect2;
    }

    /* renamed from: t */
    public static int m62265t(boolean z, int i, int i2, Range range) {
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
    public static int m62264u(int i, int i2, Range range) {
        return m62265t(true, i, i2, range);
    }

    /* renamed from: v */
    public static int m62263v(int i, int i2, Range range) {
        return m62265t(false, i, i2, range);
    }

    @NonNull
    public static <T extends VideoOutput> VideoCapture<T> withOutput(@NonNull T t) {
        return new Builder((VideoOutput) Preconditions.checkNotNull(t)).setCaptureType(UseCaseConfigFactory.CaptureType.VIDEO_CAPTURE).build();
    }

    /* renamed from: y */
    private void m62260y() {
        Threads.checkMainThread();
        DeferrableSurface deferrableSurface = this.f11841n;
        if (deferrableSurface != null) {
            deferrableSurface.close();
            this.f11841n = null;
        }
        SurfaceProcessorNode surfaceProcessorNode = this.f11848u;
        if (surfaceProcessorNode != null) {
            surfaceProcessorNode.release();
            this.f11848u = null;
        }
        SurfaceEdge surfaceEdge = this.f11842o;
        if (surfaceEdge != null) {
            surfaceEdge.close();
            this.f11842o = null;
        }
        this.f11849v = null;
        this.f11850w = null;
        this.f11846s = null;
        this.f11843p = StreamInfo.f11835a;
        this.f11851x = 0;
        this.f11852y = false;
    }

    /* renamed from: A */
    public final SessionConfig.Builder m62308A(final String str, final VideoCaptureConfig videoCaptureConfig, final StreamSpec streamSpec) {
        Timebase timebase;
        boolean z;
        Threads.checkMainThread();
        final CameraInternal cameraInternal = (CameraInternal) Preconditions.checkNotNull(getCamera());
        Size resolution = streamSpec.getResolution();
        Runnable runnable = new Runnable() { // from class: H22
            @Override // java.lang.Runnable
            public final void run() {
                VideoCapture.m62279f(VideoCapture.this);
            }
        };
        Range<Integer> expectedFrameRateRange = streamSpec.getExpectedFrameRateRange();
        if (Objects.equals(expectedFrameRateRange, StreamSpec.FRAME_RATE_RANGE_UNSPECIFIED)) {
            expectedFrameRateRange = Defaults.f11858d;
        }
        Range<Integer> range = expectedFrameRateRange;
        MediaSpec m62306C = m62306C();
        Objects.requireNonNull(m62306C);
        VideoCapabilities m62305D = m62305D(cameraInternal.getCameraInfo());
        DynamicRange dynamicRange = streamSpec.getDynamicRange();
        VideoEncoderInfo m62304E = m62304E(videoCaptureConfig.getVideoEncoderInfoFinder(), m62305D, dynamicRange, m62306C, resolution, range);
        this.f11851x = m62266s(getRelativeRotation(cameraInternal, isMirroringRequired(cameraInternal)));
        Rect m62261x = m62261x(resolution, m62304E);
        Rect m62268q = m62268q(m62261x, this.f11851x);
        this.f11850w = m62268q;
        Size m62267r = m62267r(resolution, m62261x, m62268q);
        if (m62288U()) {
            this.f11852y = true;
        }
        SurfaceProcessorNode m62259z = m62259z(cameraInternal, this.f11850w, resolution, dynamicRange);
        this.f11848u = m62259z;
        if (m62259z == null && cameraInternal.getHasTransform()) {
            timebase = Timebase.UPTIME;
        } else {
            timebase = cameraInternal.getCameraInfoInternal().getTimebase();
        }
        final Timebase timebase2 = timebase;
        Logger.m63178d("VideoCapture", "camera timebase = " + cameraInternal.getCameraInfoInternal().getTimebase() + ", processing timebase = " + timebase2);
        StreamSpec build = streamSpec.toBuilder().setResolution(m62267r).setExpectedFrameRateRange(range).build();
        if (this.f11842o == null) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkState(z);
        SurfaceEdge surfaceEdge = new SurfaceEdge(2, 34, build, getSensorToBufferTransformMatrix(), cameraInternal.getHasTransform(), this.f11850w, this.f11851x, getAppTargetRotation(), m62285X(cameraInternal));
        this.f11842o = surfaceEdge;
        surfaceEdge.addOnInvalidatedListener(runnable);
        if (this.f11848u != null) {
            SurfaceProcessorNode.OutConfig m62618of = SurfaceProcessorNode.OutConfig.m62618of(this.f11842o);
            final SurfaceEdge surfaceEdge2 = this.f11848u.transform(SurfaceProcessorNode.AbstractC2541In.m62620of(this.f11842o, Collections.singletonList(m62618of))).get(m62618of);
            Objects.requireNonNull(surfaceEdge2);
            surfaceEdge2.addOnInvalidatedListener(new Runnable() { // from class: I22
                @Override // java.lang.Runnable
                public final void run() {
                    VideoCapture.m62276i(VideoCapture.this, surfaceEdge2, cameraInternal, videoCaptureConfig, timebase2);
                }
            });
            this.f11846s = surfaceEdge2.createSurfaceRequest(cameraInternal);
            final DeferrableSurface deferrableSurface = this.f11842o.getDeferrableSurface();
            this.f11841n = deferrableSurface;
            deferrableSurface.getTerminationFuture().addListener(new Runnable() { // from class: J22
                @Override // java.lang.Runnable
                public final void run() {
                    VideoCapture.m62280e(VideoCapture.this, deferrableSurface);
                }
            }, CameraXExecutors.mainThreadExecutor());
        } else {
            SurfaceRequest createSurfaceRequest = this.f11842o.createSurfaceRequest(cameraInternal);
            this.f11846s = createSurfaceRequest;
            this.f11841n = createSurfaceRequest.getDeferrableSurface();
        }
        videoCaptureConfig.getVideoOutput().onSurfaceRequested(this.f11846s, timebase2);
        m62291R();
        this.f11841n.setContainerClass(MediaCodec.class);
        SessionConfig.Builder createFrom = SessionConfig.Builder.createFrom(videoCaptureConfig, streamSpec.getResolution());
        createFrom.setExpectedFrameRateRange(streamSpec.getExpectedFrameRateRange());
        createFrom.addErrorListener(new SessionConfig.ErrorListener() { // from class: K22
            @Override // androidx.camera.core.impl.SessionConfig.ErrorListener
            public final void onError(SessionConfig sessionConfig, SessionConfig.SessionError sessionError) {
                VideoCapture.m62282c(VideoCapture.this, str, videoCaptureConfig, streamSpec, sessionConfig, sessionError);
            }
        });
        if (f11840C) {
            createFrom.setTemplateType(1);
        }
        if (streamSpec.getImplementationOptions() != null) {
            createFrom.addImplementationOptions(streamSpec.getImplementationOptions());
        }
        return createFrom;
    }

    /* renamed from: C */
    public final MediaSpec m62306C() {
        return (MediaSpec) m62307B(getOutput().getMediaSpec(), null);
    }

    /* renamed from: D */
    public final VideoCapabilities m62305D(CameraInfo cameraInfo) {
        return getOutput().getMediaCapabilities(cameraInfo);
    }

    /* renamed from: E */
    public final VideoEncoderInfo m62304E(Function function, VideoCapabilities videoCapabilities, DynamicRange dynamicRange, MediaSpec mediaSpec, Size size, Range range) {
        VideoEncoderInfo videoEncoderInfo = this.f11849v;
        if (videoEncoderInfo != null) {
            return videoEncoderInfo;
        }
        VideoValidatedEncoderProfilesProxy findHighestSupportedEncoderProfilesFor = videoCapabilities.findHighestSupportedEncoderProfilesFor(size, dynamicRange);
        VideoEncoderInfo m62292Q = m62292Q(function, findHighestSupportedEncoderProfilesFor, mediaSpec, size, dynamicRange, range);
        Size size2 = null;
        if (m62292Q == null) {
            Logger.m63171w("VideoCapture", "Can't find videoEncoderInfo");
            return null;
        }
        if (findHighestSupportedEncoderProfilesFor != null) {
            size2 = new Size(findHighestSupportedEncoderProfilesFor.getDefaultVideoProfile().getWidth(), findHighestSupportedEncoderProfilesFor.getDefaultVideoProfile().getHeight());
        }
        VideoEncoderInfo from = VideoEncoderInfoWrapper.from(m62292Q, size2);
        this.f11849v = from;
        return from;
    }

    /* renamed from: G */
    public boolean m62302G(int i, int i2) {
        Set set = StreamInfo.f11836b;
        if (!set.contains(Integer.valueOf(i)) && !set.contains(Integer.valueOf(i2)) && i != i2) {
            return true;
        }
        return false;
    }

    /* renamed from: K */
    public final /* synthetic */ void m62298K(DeferrableSurface deferrableSurface) {
        if (deferrableSurface == this.f11841n) {
            m62260y();
        }
    }

    /* renamed from: L */
    public final /* synthetic */ void m62297L(String str, VideoCaptureConfig videoCaptureConfig, StreamSpec streamSpec, SessionConfig sessionConfig, SessionConfig.SessionError sessionError) {
        m62293P(str, videoCaptureConfig, streamSpec);
    }

    /* renamed from: N */
    public final /* synthetic */ Object m62295N(final SessionConfig.Builder builder, CallbackToFutureAdapter.Completer completer) {
        builder.addTag("androidx.camera.video.VideoCapture.streamUpdate", Integer.valueOf(completer.hashCode()));
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        final C2605b c2605b = new C2605b(atomicBoolean, completer, builder);
        completer.addCancellationListener(new Runnable() { // from class: L22
            @Override // java.lang.Runnable
            public final void run() {
                VideoCapture.m62278g(atomicBoolean, builder, c2605b);
            }
        }, CameraXExecutors.directExecutor());
        builder.addRepeatingCameraCaptureCallback(c2605b);
        return String.format("%s[0x%x]", "androidx.camera.video.VideoCapture.streamUpdate", Integer.valueOf(completer.hashCode()));
    }

    /* renamed from: O */
    public final void m62299J(SurfaceEdge surfaceEdge, CameraInternal cameraInternal, VideoCaptureConfig videoCaptureConfig, Timebase timebase) {
        if (cameraInternal == getCamera()) {
            this.f11846s = surfaceEdge.createSurfaceRequest(cameraInternal);
            videoCaptureConfig.getVideoOutput().onSurfaceRequested(this.f11846s, timebase);
            m62291R();
        }
    }

    /* renamed from: P */
    public void m62293P(String str, VideoCaptureConfig videoCaptureConfig, StreamSpec streamSpec) {
        m62260y();
        if (isCurrentCamera(str)) {
            SessionConfig.Builder m62308A = m62308A(str, videoCaptureConfig, streamSpec);
            this.f11844q = m62308A;
            m62262w(m62308A, this.f11843p, streamSpec);
            updateSessionConfig(this.f11844q.build());
            notifyReset();
        }
    }

    /* renamed from: S */
    public void m62290S(VideoOutput.SourceState sourceState) {
        if (sourceState != this.f11847t) {
            this.f11847t = sourceState;
            getOutput().onSourceStateChanged(sourceState);
        }
    }

    /* renamed from: T */
    public final void m62289T(final SessionConfig.Builder builder, boolean z) {
        ListenableFuture listenableFuture = this.f11845r;
        if (listenableFuture != null && listenableFuture.cancel(false)) {
            Logger.m63178d("VideoCapture", "A newer surface update is requested. Previous surface update cancelled.");
        }
        ListenableFuture future = CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: G22
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                return VideoCapture.m62277h(VideoCapture.this, builder, completer);
            }
        });
        this.f11845r = future;
        Futures.addCallback(future, new C2606c(future, z), CameraXExecutors.mainThreadExecutor());
    }

    /* renamed from: U */
    public final boolean m62288U() {
        if (this.f11843p.getInProgressTransformationInfo() != null) {
            return true;
        }
        return false;
    }

    /* renamed from: Y */
    public boolean m62284Y(StreamInfo streamInfo, StreamInfo streamInfo2) {
        if (this.f11852y && streamInfo.getInProgressTransformationInfo() != null && streamInfo2.getInProgressTransformationInfo() == null) {
            return true;
        }
        return false;
    }

    /* renamed from: Z */
    public final void m62283Z(CameraInfoInternal cameraInfoInternal, UseCaseConfig.Builder builder) {
        boolean z;
        MediaSpec m62306C = m62306C();
        if (m62306C != null) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z, "Unable to update target resolution by null MediaSpec.");
        DynamicRange dynamicRange = getDynamicRange();
        VideoCapabilities m62305D = m62305D(cameraInfoInternal);
        List<Quality> supportedQualities = m62305D.getSupportedQualities(dynamicRange);
        if (supportedQualities.isEmpty()) {
            Logger.m63171w("VideoCapture", "Can't find any supported quality on the device.");
            return;
        }
        VideoSpec videoSpec = m62306C.getVideoSpec();
        QualitySelector qualitySelector = videoSpec.getQualitySelector();
        List<Quality> m62460d = qualitySelector.m62460d(supportedQualities);
        Logger.m63178d("VideoCapture", "Found selectedQualities " + m62460d + " by " + qualitySelector);
        if (!m62460d.isEmpty()) {
            int mo61881a = videoSpec.mo61881a();
            C22235sq1 c22235sq1 = new C22235sq1(cameraInfoInternal.getSupportedResolutions(getImageFormat()), QualitySelector.getQualityToResolutionMap(m62305D, dynamicRange));
            ArrayList arrayList = new ArrayList();
            for (Quality quality : m62460d) {
                arrayList.addAll(c22235sq1.m22777g(quality, mo61881a));
            }
            Logger.m63178d("VideoCapture", "Set custom ordered resolutions = " + arrayList);
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
        Defaults defaults = f11838A;
        Config config = useCaseConfigFactory.getConfig(defaults.getConfig().getCaptureType(), 1);
        if (z) {
            config = AbstractC12160kw.m26885b(config, defaults.getConfig());
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
        return Defaults.f11859e;
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
        return Builder.m62257b(config);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [androidx.camera.core.impl.UseCaseConfig, androidx.camera.core.impl.UseCaseConfig<?>] */
    @Override // androidx.camera.core.UseCase
    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public UseCaseConfig<?> onMergeConfig(@NonNull CameraInfoInternal cameraInfoInternal, @NonNull UseCaseConfig.Builder<?, ?, ?> builder) {
        m62283Z(cameraInfoInternal, builder);
        return builder.getUseCaseConfig();
    }

    @Override // androidx.camera.core.UseCase
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void onStateAttached() {
        boolean z;
        super.onStateAttached();
        Preconditions.checkNotNull(getAttachedStreamSpec(), "The suggested stream specification should be already updated and shouldn't be null.");
        if (this.f11846s == null) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkState(z, "The surface request should be null when VideoCapture is attached.");
        StreamSpec streamSpec = (StreamSpec) Preconditions.checkNotNull(getAttachedStreamSpec());
        this.f11843p = (StreamInfo) m62307B(getOutput().getStreamInfo(), StreamInfo.f11835a);
        SessionConfig.Builder m62308A = m62308A(getCameraId(), (VideoCaptureConfig) getCurrentConfig(), streamSpec);
        this.f11844q = m62308A;
        m62262w(m62308A, this.f11843p, streamSpec);
        updateSessionConfig(this.f11844q.build());
        notifyActive();
        getOutput().getStreamInfo().addObserver(CameraXExecutors.mainThreadExecutor(), this.f11853z);
        m62290S(VideoOutput.SourceState.ACTIVE_NON_STREAMING);
    }

    @Override // androidx.camera.core.UseCase
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void onStateDetached() {
        Preconditions.checkState(Threads.isMainThread(), "VideoCapture can only be detached on the main thread.");
        m62290S(VideoOutput.SourceState.INACTIVE);
        getOutput().getStreamInfo().removeObserver(this.f11853z);
        ListenableFuture listenableFuture = this.f11845r;
        if (listenableFuture != null && listenableFuture.cancel(false)) {
            Logger.m63178d("VideoCapture", "VideoCapture is detached from the camera. Surface update cancelled.");
        }
        m62260y();
    }

    @Override // androidx.camera.core.UseCase
    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public StreamSpec onSuggestedStreamSpecImplementationOptionsUpdated(@NonNull Config config) {
        this.f11844q.addImplementationOptions(config);
        updateSessionConfig(this.f11844q.build());
        return getAttachedStreamSpec().toBuilder().setImplementationOptions(config).build();
    }

    @Override // androidx.camera.core.UseCase
    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public StreamSpec onSuggestedStreamSpecUpdated(@NonNull StreamSpec streamSpec) {
        Logger.m63178d("VideoCapture", "onSuggestedStreamSpecUpdated: " + streamSpec);
        List customOrderedResolutions = ((VideoCaptureConfig) getCurrentConfig()).getCustomOrderedResolutions(null);
        if (customOrderedResolutions != null && !customOrderedResolutions.contains(streamSpec.getResolution())) {
            Logger.m63171w("VideoCapture", "suggested resolution " + streamSpec.getResolution() + " is not in custom ordered resolutions " + customOrderedResolutions);
        }
        return streamSpec;
    }

    /* renamed from: q */
    public final Rect m62268q(Rect rect, int i) {
        if (m62288U()) {
            return TransformUtils.sizeToRect(TransformUtils.getRotatedSize(((SurfaceRequest.TransformationInfo) Preconditions.checkNotNull(this.f11843p.getInProgressTransformationInfo())).getCropRect(), i));
        }
        return rect;
    }

    /* renamed from: r */
    public final Size m62267r(Size size, Rect rect, Rect rect2) {
        if (m62288U() && !rect2.equals(rect)) {
            float height = rect2.height() / rect.height();
            return new Size((int) Math.ceil(size.getWidth() * height), (int) Math.ceil(size.getHeight() * height));
        }
        return size;
    }

    /* renamed from: s */
    public final int m62266s(int i) {
        if (m62288U()) {
            return TransformUtils.within360(i - this.f11843p.getInProgressTransformationInfo().getRotationDegrees());
        }
        return i;
    }

    public void setTargetRotation(int i) {
        if (setTargetRotationInternal(i)) {
            m62291R();
        }
    }

    @Override // androidx.camera.core.UseCase
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setViewPortCropRect(@NonNull Rect rect) {
        super.setViewPortCropRect(rect);
        m62291R();
    }

    @NonNull
    public String toString() {
        return "VideoCapture:" + getName();
    }

    /* renamed from: w */
    public void m62262w(SessionConfig.Builder builder, StreamInfo streamInfo, StreamSpec streamSpec) {
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
                builder.addSurface(this.f11841n, dynamicRange);
            } else {
                builder.addNonRepeatingSurface(this.f11841n, dynamicRange);
            }
        }
        m62289T(builder, z2);
    }

    /* renamed from: x */
    public final Rect m62261x(Size size, VideoEncoderInfo videoEncoderInfo) {
        Rect rect;
        if (getViewPortCropRect() != null) {
            rect = getViewPortCropRect();
        } else {
            rect = new Rect(0, 0, size.getWidth(), size.getHeight());
        }
        if (videoEncoderInfo != null && !videoEncoderInfo.isSizeSupported(rect.width(), rect.height())) {
            return m62269p(rect, size, videoEncoderInfo);
        }
        return rect;
    }

    /* renamed from: z */
    public final SurfaceProcessorNode m62259z(CameraInternal cameraInternal, Rect rect, Size size, DynamicRange dynamicRange) {
        SurfaceProcessorInternal newInstance;
        if (getEffect() == null && !m62286W(cameraInternal) && !m62287V(rect, size) && !m62285X(cameraInternal) && !m62288U()) {
            return null;
        }
        Logger.m63178d("VideoCapture", "Surface processing is enabled.");
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