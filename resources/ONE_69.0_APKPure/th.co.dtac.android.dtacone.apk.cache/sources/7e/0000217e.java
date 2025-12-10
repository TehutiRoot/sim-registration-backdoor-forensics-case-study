package androidx.camera.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Matrix;
import android.os.Build;
import android.util.Size;
import androidx.annotation.DoNotInline;
import androidx.annotation.FloatRange;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.arch.core.util.Function;
import androidx.camera.core.Camera;
import androidx.camera.core.CameraControl;
import androidx.camera.core.CameraEffect;
import androidx.camera.core.CameraInfo;
import androidx.camera.core.CameraInfoUnavailableException;
import androidx.camera.core.CameraSelector;
import androidx.camera.core.FocusMeteringAction;
import androidx.camera.core.FocusMeteringResult;
import androidx.camera.core.ImageAnalysis;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.Logger;
import androidx.camera.core.MeteringPoint;
import androidx.camera.core.MeteringPointFactory;
import androidx.camera.core.Preview;
import androidx.camera.core.UseCaseGroup;
import androidx.camera.core.ViewPort;
import androidx.camera.core.ZoomState;
import androidx.camera.core.impl.ImageOutputConfig;
import androidx.camera.core.impl.utils.Threads;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.impl.utils.futures.FutureCallback;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.camera.lifecycle.ProcessCameraProvider;
import androidx.camera.video.FileDescriptorOutputOptions;
import androidx.camera.video.FileOutputOptions;
import androidx.camera.video.MediaStoreOutputOptions;
import androidx.camera.video.OutputOptions;
import androidx.camera.video.PendingRecording;
import androidx.camera.video.QualitySelector;
import androidx.camera.video.Recorder;
import androidx.camera.video.Recording;
import androidx.camera.video.VideoCapture;
import androidx.camera.video.VideoRecordEvent;
import androidx.camera.view.CameraController;
import androidx.camera.view.RotationProvider;
import androidx.camera.view.video.AudioConfig;
import androidx.core.content.ContextCompat;
import androidx.core.content.PermissionChecker;
import androidx.core.util.Consumer;
import androidx.core.util.Preconditions;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.google.common.util.concurrent.ListenableFuture;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Executor;

@RequiresApi(21)
/* loaded from: classes.dex */
public abstract class CameraController {
    public static final int COORDINATE_SYSTEM_VIEW_REFERENCED = 1;
    public static final int IMAGE_ANALYSIS = 2;
    public static final int IMAGE_CAPTURE = 1;
    public static final int TAP_TO_FOCUS_FAILED = 4;
    public static final int TAP_TO_FOCUS_FOCUSED = 2;
    public static final int TAP_TO_FOCUS_NOT_FOCUSED = 3;
    public static final int TAP_TO_FOCUS_NOT_STARTED = 0;
    public static final int TAP_TO_FOCUS_STARTED = 1;
    public static final int VIDEO_CAPTURE = 4;

    /* renamed from: A */
    public final MutableLiveData f12206A;

    /* renamed from: B */
    public final C18030Lk1 f12207B;

    /* renamed from: C */
    public final C18030Lk1 f12208C;

    /* renamed from: D */
    public final C18030Lk1 f12209D;

    /* renamed from: E */
    public final Set f12210E;

    /* renamed from: F */
    public final Context f12211F;

    /* renamed from: G */
    public final ListenableFuture f12212G;

    /* renamed from: a */
    public CameraSelector f12213a;

    /* renamed from: b */
    public int f12214b;

    /* renamed from: c */
    public Preview f12215c;

    /* renamed from: d */
    public OutputSize f12216d;

    /* renamed from: e */
    public ImageCapture f12217e;

    /* renamed from: f */
    public OutputSize f12218f;

    /* renamed from: g */
    public Executor f12219g;

    /* renamed from: h */
    public Executor f12220h;

    /* renamed from: i */
    public Executor f12221i;

    /* renamed from: j */
    public ImageAnalysis.Analyzer f12222j;

    /* renamed from: k */
    public ImageAnalysis f12223k;

    /* renamed from: l */
    public OutputSize f12224l;

    /* renamed from: m */
    public VideoCapture f12225m;

    /* renamed from: n */
    public Recording f12226n;

    /* renamed from: o */
    public Map f12227o;

    /* renamed from: p */
    public QualitySelector f12228p;

    /* renamed from: q */
    public Camera f12229q;

    /* renamed from: r */
    public InterfaceC18366Qo1 f12230r;

    /* renamed from: s */
    public ViewPort f12231s;

    /* renamed from: t */
    public Preview.SurfaceProvider f12232t;

    /* renamed from: u */
    public final RotationProvider f12233u;

    /* renamed from: v */
    public final RotationProvider.Listener f12234v;

    /* renamed from: w */
    public boolean f12235w;

    /* renamed from: x */
    public boolean f12236x;

    /* renamed from: y */
    public final J40 f12237y;

    /* renamed from: z */
    public final J40 f12238z;

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* loaded from: classes.dex */
    public @interface UseCases {
    }

    /* renamed from: androidx.camera.view.CameraController$a */
    /* loaded from: classes.dex */
    public class C2665a implements Consumer {

        /* renamed from: a */
        public final /* synthetic */ Executor f12241a;

        /* renamed from: b */
        public final /* synthetic */ Consumer f12242b;

        public C2665a(Executor executor, Consumer consumer) {
            CameraController.this = r1;
            this.f12241a = executor;
            this.f12242b = consumer;
        }

        /* renamed from: a */
        public static /* synthetic */ void m61838a(C2665a c2665a) {
            c2665a.m61836c();
        }

        @Override // androidx.core.util.Consumer
        /* renamed from: b */
        public void accept(VideoRecordEvent videoRecordEvent) {
            if (videoRecordEvent instanceof VideoRecordEvent.Finalize) {
                if (!Threads.isMainThread()) {
                    this.f12241a.execute(new Runnable() { // from class: wj
                        @Override // java.lang.Runnable
                        public final void run() {
                            CameraController.C2665a.m61838a(CameraController.C2665a.this);
                        }
                    });
                } else {
                    CameraController.this.m61855j(this);
                }
            }
            this.f12242b.accept(videoRecordEvent);
        }

        /* renamed from: c */
        public final /* synthetic */ void m61836c() {
            CameraController.this.m61855j(this);
        }
    }

    /* renamed from: androidx.camera.view.CameraController$b */
    /* loaded from: classes.dex */
    public class C2666b implements FutureCallback {
        public C2666b() {
            CameraController.this = r1;
        }

        @Override // androidx.camera.core.impl.utils.futures.FutureCallback
        /* renamed from: a */
        public void onSuccess(FocusMeteringResult focusMeteringResult) {
            int i;
            if (focusMeteringResult == null) {
                return;
            }
            Logger.m63178d("CameraController", "Tap to focus onSuccess: " + focusMeteringResult.isFocusSuccessful());
            MutableLiveData mutableLiveData = CameraController.this.f12206A;
            if (focusMeteringResult.isFocusSuccessful()) {
                i = 2;
            } else {
                i = 3;
            }
            mutableLiveData.postValue(Integer.valueOf(i));
        }

        @Override // androidx.camera.core.impl.utils.futures.FutureCallback
        public void onFailure(Throwable th2) {
            if (th2 instanceof CameraControl.OperationCanceledException) {
                Logger.m63178d("CameraController", "Tap-to-focus is canceled by new action.");
                return;
            }
            Logger.m63177d("CameraController", "Tap to focus failed.", th2);
            CameraController.this.f12206A.postValue(4);
        }
    }

    /* renamed from: androidx.camera.view.CameraController$c */
    /* loaded from: classes.dex */
    public static class C2667c {
        @NonNull
        @DoNotInline
        /* renamed from: a */
        public static Context m61834a(@NonNull Context context, @Nullable String str) {
            return context.createAttributionContext(str);
        }

        @Nullable
        @DoNotInline
        /* renamed from: b */
        public static String m61833b(@NonNull Context context) {
            return context.getAttributionTag();
        }
    }

    public CameraController(Context context) {
        this(context, Futures.transform(ProcessCameraProvider.getInstance(context), new Function() { // from class: rj
            @Override // androidx.arch.core.util.Function
            public final Object apply(Object obj) {
                return new C18431Ro1((ProcessCameraProvider) obj);
            }
        }, CameraXExecutors.directExecutor()));
    }

    /* renamed from: b */
    public static /* synthetic */ void m61863b(CameraController cameraController, int i) {
        cameraController.m61846s(i);
    }

    /* renamed from: c */
    public static /* synthetic */ void m61862c(CameraController cameraController, int i) {
        cameraController.m61844u(i);
    }

    /* renamed from: k */
    public static Recorder m61854k(QualitySelector qualitySelector) {
        return new Recorder.Builder().setQualitySelector(qualitySelector).build();
    }

    /* renamed from: l */
    public static Context m61853l(Context context) {
        String m61833b;
        Context applicationContext = context.getApplicationContext();
        if (Build.VERSION.SDK_INT >= 30 && (m61833b = C2667c.m61833b(context)) != null) {
            return C2667c.m61834a(applicationContext, m61833b);
        }
        return applicationContext;
    }

    /* renamed from: A */
    public final void m61879A(ImageOutputConfig.Builder builder, OutputSize outputSize) {
        if (outputSize == null) {
            return;
        }
        if (outputSize.getResolution() != null) {
            builder.setTargetResolution(outputSize.getResolution());
        } else if (outputSize.getAspectRatio() != -1) {
            builder.setTargetAspectRatio(outputSize.getAspectRatio());
        } else {
            Logger.m63176e("CameraController", "Invalid target surface size. " + outputSize);
        }
    }

    /* renamed from: B */
    public final float m61878B(float f) {
        return f > 1.0f ? ((f - 1.0f) * 2.0f) + 1.0f : 1.0f - ((1.0f - f) * 2.0f);
    }

    /* renamed from: C */
    public abstract Camera mo61832C();

    /* renamed from: D */
    public void m61877D() {
        m61876E(null);
    }

    /* renamed from: E */
    public void m61876E(Runnable runnable) {
        try {
            this.f12229q = mo61832C();
            if (!m61852m()) {
                Logger.m63178d("CameraController", "Use cases not attached to camera.");
                return;
            }
            this.f12237y.m67924f(this.f12229q.getCameraInfo().getZoomState());
            this.f12238z.m67924f(this.f12229q.getCameraInfo().getTorchState());
            this.f12207B.m67512c(new Function() { // from class: oj
                @Override // androidx.arch.core.util.Function
                public final Object apply(Object obj) {
                    return CameraController.this.enableTorch(((Boolean) obj).booleanValue());
                }
            });
            this.f12208C.m67512c(new Function() { // from class: pj
                @Override // androidx.arch.core.util.Function
                public final Object apply(Object obj) {
                    return CameraController.this.setLinearZoom(((Float) obj).floatValue());
                }
            });
            this.f12209D.m67512c(new Function() { // from class: qj
                @Override // androidx.arch.core.util.Function
                public final Object apply(Object obj) {
                    return CameraController.this.setZoomRatio(((Float) obj).floatValue());
                }
            });
        } catch (RuntimeException e) {
            if (runnable != null) {
                runnable.run();
            }
            throw e;
        }
    }

    /* renamed from: F */
    public final void m61875F() {
        this.f12233u.addListener(CameraXExecutors.mainThreadExecutor(), this.f12234v);
    }

    /* renamed from: G */
    public final Recording m61874G(OutputOptions outputOptions, AudioConfig audioConfig, Executor executor, Consumer consumer) {
        Threads.checkMainThread();
        Preconditions.checkState(m61851n(), "Camera not initialized.");
        Preconditions.checkState(isVideoCaptureEnabled(), "VideoCapture disabled.");
        Preconditions.checkState(!isRecording(), "Recording video. Only one recording can be active at a time.");
        Consumer m61865P = m61865P(consumer);
        PendingRecording m61841x = m61841x(outputOptions);
        if (audioConfig.getAudioEnabled()) {
            m61859f();
            m61841x.withAudioEnabled();
        }
        Recording start = m61841x.start(executor, m61865P);
        m61839z(start, m61865P);
        return start;
    }

    /* renamed from: H */
    public final void m61873H() {
        this.f12233u.removeListener(this.f12234v);
    }

    /* renamed from: I */
    public final void m61872I() {
        Threads.checkMainThread();
        Recording recording = this.f12226n;
        if (recording != null) {
            recording.stop();
            m61856i(this.f12226n);
        }
    }

    /* renamed from: J */
    public final void m61871J(int i, int i2) {
        ImageAnalysis.Analyzer analyzer;
        Threads.checkMainThread();
        if (m61851n()) {
            this.f12230r.mo66588b(this.f12223k);
        }
        ImageAnalysis.Builder imageQueueDepth = new ImageAnalysis.Builder().setBackpressureStrategy(i).setImageQueueDepth(i2);
        m61879A(imageQueueDepth, this.f12224l);
        Executor executor = this.f12221i;
        if (executor != null) {
            imageQueueDepth.setBackgroundExecutor(executor);
        }
        ImageAnalysis build = imageQueueDepth.build();
        this.f12223k = build;
        Executor executor2 = this.f12220h;
        if (executor2 != null && (analyzer = this.f12222j) != null) {
            build.setAnalyzer(executor2, analyzer);
        }
    }

    /* renamed from: K */
    public final void m61870K(int i) {
        if (m61851n()) {
            this.f12230r.mo66588b(this.f12217e);
        }
        ImageCapture.Builder captureMode = new ImageCapture.Builder().setCaptureMode(i);
        m61879A(captureMode, this.f12218f);
        Executor executor = this.f12219g;
        if (executor != null) {
            captureMode.setIoExecutor(executor);
        }
        this.f12217e = captureMode.build();
    }

    /* renamed from: L */
    public final void m61869L() {
        if (m61851n()) {
            this.f12230r.mo66588b(this.f12215c);
        }
        Preview.Builder builder = new Preview.Builder();
        m61879A(builder, this.f12216d);
        this.f12215c = builder.build();
    }

    /* renamed from: M */
    public final void m61868M() {
        if (m61851n()) {
            this.f12230r.mo66588b(this.f12225m);
        }
        this.f12225m = m61857h();
    }

    /* renamed from: N */
    public void m61867N(ImageCapture.OutputFileOptions outputFileOptions) {
        boolean z;
        if (this.f12213a.getLensFacing() != null && !outputFileOptions.getMetadata().isReversedHorizontalSet()) {
            ImageCapture.Metadata metadata = outputFileOptions.getMetadata();
            if (this.f12213a.getLensFacing().intValue() == 0) {
                z = true;
            } else {
                z = false;
            }
            metadata.setReversedHorizontal(z);
        }
    }

    /* renamed from: O */
    public void m61866O(Matrix matrix) {
        Threads.checkMainThread();
        ImageAnalysis.Analyzer analyzer = this.f12222j;
        if (analyzer != null && analyzer.getTargetCoordinateSystem() == 1) {
            this.f12222j.updateTransform(matrix);
        }
    }

    /* renamed from: P */
    public final Consumer m61865P(Consumer consumer) {
        return new C2665a(ContextCompat.getMainExecutor(this.f12211F), consumer);
    }

    @MainThread
    public void clearEffects() {
        Threads.checkMainThread();
        InterfaceC18366Qo1 interfaceC18366Qo1 = this.f12230r;
        if (interfaceC18366Qo1 != null) {
            interfaceC18366Qo1.mo66587c();
        }
        this.f12210E.clear();
        m61877D();
    }

    @MainThread
    public void clearImageAnalysisAnalyzer() {
        Threads.checkMainThread();
        ImageAnalysis.Analyzer analyzer = this.f12222j;
        this.f12220h = null;
        this.f12222j = null;
        this.f12223k.clearAnalyzer();
        m61840y(analyzer, null);
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public UseCaseGroup createUseCaseGroup() {
        if (!m61851n()) {
            Logger.m63178d("CameraController", "Camera not initialized.");
            return null;
        } else if (!m61849p()) {
            Logger.m63178d("CameraController", "PreviewView not attached to CameraController.");
            return null;
        } else {
            UseCaseGroup.Builder addUseCase = new UseCaseGroup.Builder().addUseCase(this.f12215c);
            if (isImageCaptureEnabled()) {
                addUseCase.addUseCase(this.f12217e);
            } else {
                this.f12230r.mo66588b(this.f12217e);
            }
            if (isImageAnalysisEnabled()) {
                addUseCase.addUseCase(this.f12223k);
            } else {
                this.f12230r.mo66588b(this.f12223k);
            }
            if (isVideoCaptureEnabled()) {
                addUseCase.addUseCase(this.f12225m);
            } else {
                this.f12230r.mo66588b(this.f12225m);
            }
            addUseCase.setViewPort(this.f12231s);
            for (CameraEffect cameraEffect : this.f12210E) {
                addUseCase.addEffect(cameraEffect);
            }
            return addUseCase.build();
        }
    }

    /* renamed from: e */
    public void m61860e(Preview.SurfaceProvider surfaceProvider, ViewPort viewPort) {
        Threads.checkMainThread();
        if (this.f12232t != surfaceProvider) {
            this.f12232t = surfaceProvider;
            this.f12215c.setSurfaceProvider(surfaceProvider);
        }
        this.f12231s = viewPort;
        m61875F();
        m61877D();
    }

    @NonNull
    @MainThread
    public ListenableFuture<Void> enableTorch(boolean z) {
        Threads.checkMainThread();
        if (!m61852m()) {
            return this.f12207B.m67511d(Boolean.valueOf(z));
        }
        return this.f12229q.getCameraControl().enableTorch(z);
    }

    /* renamed from: f */
    public final void m61859f() {
        if (PermissionChecker.checkSelfPermission(this.f12211F, "android.permission.RECORD_AUDIO") != -1) {
            return;
        }
        throw new SecurityException("Attempted to start recording with audio, but application does not have RECORD_AUDIO permission granted.");
    }

    /* renamed from: g */
    public void m61858g() {
        Threads.checkMainThread();
        InterfaceC18366Qo1 interfaceC18366Qo1 = this.f12230r;
        if (interfaceC18366Qo1 != null) {
            interfaceC18366Qo1.mo66588b(this.f12215c, this.f12217e, this.f12223k, this.f12225m);
        }
        this.f12215c.setSurfaceProvider(null);
        this.f12229q = null;
        this.f12232t = null;
        this.f12231s = null;
        m61873H();
    }

    @Nullable
    @MainThread
    public CameraControl getCameraControl() {
        Threads.checkMainThread();
        Camera camera = this.f12229q;
        if (camera == null) {
            return null;
        }
        return camera.getCameraControl();
    }

    @Nullable
    @MainThread
    public CameraInfo getCameraInfo() {
        Threads.checkMainThread();
        Camera camera = this.f12229q;
        if (camera == null) {
            return null;
        }
        return camera.getCameraInfo();
    }

    @NonNull
    @MainThread
    public CameraSelector getCameraSelector() {
        Threads.checkMainThread();
        return this.f12213a;
    }

    @Nullable
    @MainThread
    public Executor getImageAnalysisBackgroundExecutor() {
        Threads.checkMainThread();
        return this.f12221i;
    }

    @MainThread
    public int getImageAnalysisBackpressureStrategy() {
        Threads.checkMainThread();
        return this.f12223k.getBackpressureStrategy();
    }

    @MainThread
    public int getImageAnalysisImageQueueDepth() {
        Threads.checkMainThread();
        return this.f12223k.getImageQueueDepth();
    }

    @Nullable
    @MainThread
    public OutputSize getImageAnalysisTargetSize() {
        Threads.checkMainThread();
        return this.f12224l;
    }

    @MainThread
    public int getImageCaptureFlashMode() {
        Threads.checkMainThread();
        return this.f12217e.getFlashMode();
    }

    @Nullable
    @MainThread
    public Executor getImageCaptureIoExecutor() {
        Threads.checkMainThread();
        return this.f12219g;
    }

    @MainThread
    public int getImageCaptureMode() {
        Threads.checkMainThread();
        return this.f12217e.getCaptureMode();
    }

    @Nullable
    @MainThread
    public OutputSize getImageCaptureTargetSize() {
        Threads.checkMainThread();
        return this.f12218f;
    }

    @NonNull
    public ListenableFuture<Void> getInitializationFuture() {
        return this.f12212G;
    }

    @Nullable
    @MainThread
    public OutputSize getPreviewTargetSize() {
        Threads.checkMainThread();
        return this.f12216d;
    }

    @NonNull
    @MainThread
    public LiveData<Integer> getTapToFocusState() {
        Threads.checkMainThread();
        return this.f12206A;
    }

    @NonNull
    @MainThread
    public LiveData<Integer> getTorchState() {
        Threads.checkMainThread();
        return this.f12238z;
    }

    @NonNull
    @MainThread
    public QualitySelector getVideoCaptureQualitySelector() {
        Threads.checkMainThread();
        return this.f12228p;
    }

    @NonNull
    @MainThread
    public LiveData<ZoomState> getZoomState() {
        Threads.checkMainThread();
        return this.f12237y;
    }

    /* renamed from: h */
    public final VideoCapture m61857h() {
        return VideoCapture.withOutput(m61854k(this.f12228p));
    }

    @MainThread
    public boolean hasCamera(@NonNull CameraSelector cameraSelector) {
        Threads.checkMainThread();
        Preconditions.checkNotNull(cameraSelector);
        InterfaceC18366Qo1 interfaceC18366Qo1 = this.f12230r;
        if (interfaceC18366Qo1 != null) {
            try {
                return interfaceC18366Qo1.hasCamera(cameraSelector);
            } catch (CameraInfoUnavailableException e) {
                Logger.m63170w("CameraController", "Failed to check camera availability", e);
                return false;
            }
        }
        throw new IllegalStateException("Camera not initialized. Please wait for the initialization future to finish. See #getInitializationFuture().");
    }

    /* renamed from: i */
    public final void m61856i(Recording recording) {
        if (this.f12226n == recording) {
            this.f12226n = null;
        }
    }

    @MainThread
    public boolean isImageAnalysisEnabled() {
        Threads.checkMainThread();
        return m61848q(2);
    }

    @MainThread
    public boolean isImageCaptureEnabled() {
        Threads.checkMainThread();
        return m61848q(1);
    }

    @MainThread
    public boolean isPinchToZoomEnabled() {
        Threads.checkMainThread();
        return this.f12235w;
    }

    @MainThread
    public boolean isRecording() {
        Threads.checkMainThread();
        Recording recording = this.f12226n;
        if (recording != null && !recording.isClosed()) {
            return true;
        }
        return false;
    }

    @MainThread
    public boolean isTapToFocusEnabled() {
        Threads.checkMainThread();
        return this.f12236x;
    }

    @MainThread
    public boolean isVideoCaptureEnabled() {
        Threads.checkMainThread();
        return m61848q(4);
    }

    /* renamed from: j */
    public void m61855j(Consumer consumer) {
        Recording recording = (Recording) this.f12227o.remove(consumer);
        if (recording != null) {
            m61856i(recording);
        }
    }

    /* renamed from: m */
    public final boolean m61852m() {
        if (this.f12229q != null) {
            return true;
        }
        return false;
    }

    /* renamed from: n */
    public final boolean m61851n() {
        if (this.f12230r != null) {
            return true;
        }
        return false;
    }

    /* renamed from: o */
    public final boolean m61850o(OutputSize outputSize, OutputSize outputSize2) {
        if (outputSize == outputSize2) {
            return true;
        }
        if (outputSize != null && outputSize.equals(outputSize2)) {
            return true;
        }
        return false;
    }

    /* renamed from: p */
    public final boolean m61849p() {
        if (this.f12232t != null && this.f12231s != null) {
            return true;
        }
        return false;
    }

    /* renamed from: q */
    public final boolean m61848q(int i) {
        if ((i & this.f12214b) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: r */
    public final /* synthetic */ Void m61847r(InterfaceC18366Qo1 interfaceC18366Qo1) {
        this.f12230r = interfaceC18366Qo1;
        m61877D();
        return null;
    }

    /* renamed from: s */
    public final /* synthetic */ void m61846s(int i) {
        this.f12223k.setTargetRotation(i);
        this.f12217e.setTargetRotation(i);
        this.f12225m.setTargetRotation(i);
    }

    @MainThread
    public void setCameraSelector(@NonNull CameraSelector cameraSelector) {
        Threads.checkMainThread();
        final CameraSelector cameraSelector2 = this.f12213a;
        if (cameraSelector2 == cameraSelector) {
            return;
        }
        this.f12213a = cameraSelector;
        InterfaceC18366Qo1 interfaceC18366Qo1 = this.f12230r;
        if (interfaceC18366Qo1 == null) {
            return;
        }
        interfaceC18366Qo1.mo66588b(this.f12215c, this.f12217e, this.f12223k, this.f12225m);
        m61876E(new Runnable() { // from class: tj
            @Override // java.lang.Runnable
            public final void run() {
                CameraController.this.m61845t(cameraSelector2);
            }
        });
    }

    @MainThread
    public void setEffects(@NonNull Set<CameraEffect> set) {
        Threads.checkMainThread();
        if (Objects.equals(this.f12210E, set)) {
            return;
        }
        InterfaceC18366Qo1 interfaceC18366Qo1 = this.f12230r;
        if (interfaceC18366Qo1 != null) {
            interfaceC18366Qo1.mo66587c();
        }
        this.f12210E.clear();
        this.f12210E.addAll(set);
        m61877D();
    }

    @MainThread
    public void setEnabledUseCases(int i) {
        Threads.checkMainThread();
        final int i2 = this.f12214b;
        if (i == i2) {
            return;
        }
        this.f12214b = i;
        if (!isVideoCaptureEnabled() && isRecording()) {
            m61872I();
        }
        m61876E(new Runnable() { // from class: sj
            @Override // java.lang.Runnable
            public final void run() {
                CameraController.m61862c(CameraController.this, i2);
            }
        });
    }

    @MainThread
    public void setImageAnalysisAnalyzer(@NonNull Executor executor, @NonNull ImageAnalysis.Analyzer analyzer) {
        Threads.checkMainThread();
        ImageAnalysis.Analyzer analyzer2 = this.f12222j;
        if (analyzer2 == analyzer && this.f12220h == executor) {
            return;
        }
        this.f12220h = executor;
        this.f12222j = analyzer;
        this.f12223k.setAnalyzer(executor, analyzer);
        m61840y(analyzer2, analyzer);
    }

    @MainThread
    public void setImageAnalysisBackgroundExecutor(@Nullable Executor executor) {
        Threads.checkMainThread();
        if (this.f12221i == executor) {
            return;
        }
        this.f12221i = executor;
        m61871J(this.f12223k.getBackpressureStrategy(), this.f12223k.getImageQueueDepth());
        m61877D();
    }

    @MainThread
    public void setImageAnalysisBackpressureStrategy(int i) {
        Threads.checkMainThread();
        if (this.f12223k.getBackpressureStrategy() == i) {
            return;
        }
        m61871J(i, this.f12223k.getImageQueueDepth());
        m61877D();
    }

    @MainThread
    public void setImageAnalysisImageQueueDepth(int i) {
        Threads.checkMainThread();
        if (this.f12223k.getImageQueueDepth() == i) {
            return;
        }
        m61871J(this.f12223k.getBackpressureStrategy(), i);
        m61877D();
    }

    @MainThread
    public void setImageAnalysisTargetSize(@Nullable OutputSize outputSize) {
        Threads.checkMainThread();
        if (m61850o(this.f12224l, outputSize)) {
            return;
        }
        this.f12224l = outputSize;
        m61871J(this.f12223k.getBackpressureStrategy(), this.f12223k.getImageQueueDepth());
        m61877D();
    }

    @MainThread
    public void setImageCaptureFlashMode(int i) {
        Threads.checkMainThread();
        this.f12217e.setFlashMode(i);
    }

    @MainThread
    public void setImageCaptureIoExecutor(@Nullable Executor executor) {
        Threads.checkMainThread();
        if (this.f12219g == executor) {
            return;
        }
        this.f12219g = executor;
        m61870K(this.f12217e.getCaptureMode());
        m61877D();
    }

    @MainThread
    public void setImageCaptureMode(int i) {
        Threads.checkMainThread();
        if (this.f12217e.getCaptureMode() == i) {
            return;
        }
        m61870K(i);
        m61877D();
    }

    @MainThread
    public void setImageCaptureTargetSize(@Nullable OutputSize outputSize) {
        Threads.checkMainThread();
        if (m61850o(this.f12218f, outputSize)) {
            return;
        }
        this.f12218f = outputSize;
        m61870K(getImageCaptureMode());
        m61877D();
    }

    @NonNull
    @MainThread
    public ListenableFuture<Void> setLinearZoom(@FloatRange(from = 0.0d, m64694to = 1.0d) float f) {
        Threads.checkMainThread();
        if (!m61852m()) {
            return this.f12208C.m67511d(Float.valueOf(f));
        }
        return this.f12229q.getCameraControl().setLinearZoom(f);
    }

    @MainThread
    public void setPinchToZoomEnabled(boolean z) {
        Threads.checkMainThread();
        this.f12235w = z;
    }

    @MainThread
    public void setPreviewTargetSize(@Nullable OutputSize outputSize) {
        Threads.checkMainThread();
        if (m61850o(this.f12216d, outputSize)) {
            return;
        }
        this.f12216d = outputSize;
        m61869L();
        m61877D();
    }

    @MainThread
    public void setTapToFocusEnabled(boolean z) {
        Threads.checkMainThread();
        this.f12236x = z;
    }

    @MainThread
    public void setVideoCaptureQualitySelector(@NonNull QualitySelector qualitySelector) {
        Threads.checkMainThread();
        this.f12228p = qualitySelector;
        m61868M();
        m61877D();
    }

    @NonNull
    @MainThread
    public ListenableFuture<Void> setZoomRatio(float f) {
        Threads.checkMainThread();
        if (!m61852m()) {
            return this.f12209D.m67511d(Float.valueOf(f));
        }
        return this.f12229q.getCameraControl().setZoomRatio(f);
    }

    @NonNull
    @SuppressLint({"MissingPermission"})
    @MainThread
    public Recording startRecording(@NonNull FileOutputOptions fileOutputOptions, @NonNull AudioConfig audioConfig, @NonNull Executor executor, @NonNull Consumer<VideoRecordEvent> consumer) {
        return m61874G(fileOutputOptions, audioConfig, executor, consumer);
    }

    /* renamed from: t */
    public final /* synthetic */ void m61845t(CameraSelector cameraSelector) {
        this.f12213a = cameraSelector;
    }

    @MainThread
    public void takePicture(@NonNull ImageCapture.OutputFileOptions outputFileOptions, @NonNull Executor executor, @NonNull ImageCapture.OnImageSavedCallback onImageSavedCallback) {
        Threads.checkMainThread();
        Preconditions.checkState(m61851n(), "Camera not initialized.");
        Preconditions.checkState(isImageCaptureEnabled(), "ImageCapture disabled.");
        m61867N(outputFileOptions);
        this.f12217e.m63196u(outputFileOptions, executor, onImageSavedCallback);
    }

    /* renamed from: u */
    public final /* synthetic */ void m61844u(int i) {
        this.f12214b = i;
    }

    /* renamed from: v */
    public void m61843v(float f) {
        if (!m61852m()) {
            Logger.m63171w("CameraController", "Use cases not attached to camera.");
        } else if (!this.f12235w) {
            Logger.m63178d("CameraController", "Pinch to zoom disabled.");
        } else {
            Logger.m63178d("CameraController", "Pinch to zoom with scale: " + f);
            ZoomState value = getZoomState().getValue();
            if (value == null) {
                return;
            }
            setZoomRatio(Math.min(Math.max(value.getZoomRatio() * m61878B(f), value.getMinZoomRatio()), value.getMaxZoomRatio()));
        }
    }

    /* renamed from: w */
    public void m61842w(MeteringPointFactory meteringPointFactory, float f, float f2) {
        if (!m61852m()) {
            Logger.m63171w("CameraController", "Use cases not attached to camera.");
        } else if (!this.f12236x) {
            Logger.m63178d("CameraController", "Tap to focus disabled. ");
        } else {
            Logger.m63178d("CameraController", "Tap to focus started: " + f + ", " + f2);
            this.f12206A.postValue(1);
            MeteringPoint createPoint = meteringPointFactory.createPoint(f, f2, 0.16666667f);
            Futures.addCallback(this.f12229q.getCameraControl().startFocusAndMetering(new FocusMeteringAction.Builder(createPoint, 1).addPoint(meteringPointFactory.createPoint(f, f2, 0.25f), 2).build()), new C2666b(), CameraXExecutors.directExecutor());
        }
    }

    /* renamed from: x */
    public final PendingRecording m61841x(OutputOptions outputOptions) {
        Recorder recorder = (Recorder) this.f12225m.getOutput();
        if (outputOptions instanceof FileOutputOptions) {
            return recorder.prepareRecording(this.f12211F, (FileOutputOptions) outputOptions);
        }
        if (outputOptions instanceof FileDescriptorOutputOptions) {
            if (Build.VERSION.SDK_INT >= 26) {
                return recorder.prepareRecording(this.f12211F, (FileDescriptorOutputOptions) outputOptions);
            }
            throw new UnsupportedOperationException("File descriptors are not supported on pre-Android O (API 26) devices.");
        } else if (outputOptions instanceof MediaStoreOutputOptions) {
            return recorder.prepareRecording(this.f12211F, (MediaStoreOutputOptions) outputOptions);
        } else {
            throw new IllegalArgumentException("Unsupported OutputOptions type.");
        }
    }

    /* renamed from: y */
    public final void m61840y(ImageAnalysis.Analyzer analyzer, ImageAnalysis.Analyzer analyzer2) {
        Size defaultTargetResolution;
        Size size = null;
        if (analyzer == null) {
            defaultTargetResolution = null;
        } else {
            defaultTargetResolution = analyzer.getDefaultTargetResolution();
        }
        if (analyzer2 != null) {
            size = analyzer2.getDefaultTargetResolution();
        }
        if (!Objects.equals(defaultTargetResolution, size)) {
            m61871J(this.f12223k.getBackpressureStrategy(), this.f12223k.getImageQueueDepth());
            m61877D();
        }
    }

    /* renamed from: z */
    public final void m61839z(Recording recording, Consumer consumer) {
        this.f12227o.put(consumer, recording);
        this.f12226n = recording;
    }

    @NonNull
    @SuppressLint({"MissingPermission"})
    @RequiresApi(26)
    @MainThread
    public Recording startRecording(@NonNull FileDescriptorOutputOptions fileDescriptorOutputOptions, @NonNull AudioConfig audioConfig, @NonNull Executor executor, @NonNull Consumer<VideoRecordEvent> consumer) {
        return m61874G(fileDescriptorOutputOptions, audioConfig, executor, consumer);
    }

    @NonNull
    @SuppressLint({"MissingPermission"})
    @MainThread
    public Recording startRecording(@NonNull MediaStoreOutputOptions mediaStoreOutputOptions, @NonNull AudioConfig audioConfig, @NonNull Executor executor, @NonNull Consumer<VideoRecordEvent> consumer) {
        return m61874G(mediaStoreOutputOptions, audioConfig, executor, consumer);
    }

    @RequiresApi(21)
    /* loaded from: classes.dex */
    public static final class OutputSize {
        public static final int UNASSIGNED_ASPECT_RATIO = -1;

        /* renamed from: a */
        public final int f12239a;

        /* renamed from: b */
        public final Size f12240b;

        @Retention(RetentionPolicy.SOURCE)
        @RestrictTo({RestrictTo.Scope.LIBRARY})
        /* loaded from: classes.dex */
        public @interface OutputAspectRatio {
        }

        public OutputSize(int i) {
            Preconditions.checkArgument(i != -1);
            this.f12239a = i;
            this.f12240b = null;
        }

        public int getAspectRatio() {
            return this.f12239a;
        }

        @Nullable
        public Size getResolution() {
            return this.f12240b;
        }

        @NonNull
        public String toString() {
            return "aspect ratio: " + this.f12239a + " resolution: " + this.f12240b;
        }

        public OutputSize(@NonNull Size size) {
            Preconditions.checkNotNull(size);
            this.f12239a = -1;
            this.f12240b = size;
        }
    }

    public CameraController(Context context, ListenableFuture listenableFuture) {
        this.f12213a = CameraSelector.DEFAULT_BACK_CAMERA;
        this.f12214b = 3;
        this.f12226n = null;
        this.f12227o = new HashMap();
        this.f12228p = Recorder.DEFAULT_QUALITY_SELECTOR;
        this.f12235w = true;
        this.f12236x = true;
        this.f12237y = new J40();
        this.f12238z = new J40();
        this.f12206A = new MutableLiveData(0);
        this.f12207B = new C18030Lk1();
        this.f12208C = new C18030Lk1();
        this.f12209D = new C18030Lk1();
        this.f12210E = new HashSet();
        Context m61853l = m61853l(context);
        this.f12211F = m61853l;
        this.f12215c = new Preview.Builder().build();
        this.f12217e = new ImageCapture.Builder().build();
        this.f12223k = new ImageAnalysis.Builder().build();
        this.f12225m = m61857h();
        this.f12212G = Futures.transform(listenableFuture, new Function() { // from class: uj
            @Override // androidx.arch.core.util.Function
            public final Object apply(Object obj) {
                Void m61847r;
                m61847r = CameraController.this.m61847r((InterfaceC18366Qo1) obj);
                return m61847r;
            }
        }, CameraXExecutors.mainThreadExecutor());
        this.f12233u = new RotationProvider(m61853l);
        this.f12234v = new RotationProvider.Listener() { // from class: vj
            @Override // androidx.camera.view.RotationProvider.Listener
            public final void onRotationChanged(int i) {
                CameraController.m61863b(CameraController.this, i);
            }
        };
    }

    @MainThread
    public void takePicture(@NonNull Executor executor, @NonNull ImageCapture.OnImageCapturedCallback onImageCapturedCallback) {
        Threads.checkMainThread();
        Preconditions.checkState(m61851n(), "Camera not initialized.");
        Preconditions.checkState(isImageCaptureEnabled(), "ImageCapture disabled.");
        this.f12217e.m63197t(executor, onImageCapturedCallback);
    }
}