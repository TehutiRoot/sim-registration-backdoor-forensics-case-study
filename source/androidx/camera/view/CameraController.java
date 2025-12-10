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
    public final MutableLiveData f12118A;

    /* renamed from: B */
    public final C18185Oj1 f12119B;

    /* renamed from: C */
    public final C18185Oj1 f12120C;

    /* renamed from: D */
    public final C18185Oj1 f12121D;

    /* renamed from: E */
    public final Set f12122E;

    /* renamed from: F */
    public final Context f12123F;

    /* renamed from: G */
    public final ListenableFuture f12124G;

    /* renamed from: a */
    public CameraSelector f12125a;

    /* renamed from: b */
    public int f12126b;

    /* renamed from: c */
    public Preview f12127c;

    /* renamed from: d */
    public OutputSize f12128d;

    /* renamed from: e */
    public ImageCapture f12129e;

    /* renamed from: f */
    public OutputSize f12130f;

    /* renamed from: g */
    public Executor f12131g;

    /* renamed from: h */
    public Executor f12132h;

    /* renamed from: i */
    public Executor f12133i;

    /* renamed from: j */
    public ImageAnalysis.Analyzer f12134j;

    /* renamed from: k */
    public ImageAnalysis f12135k;

    /* renamed from: l */
    public OutputSize f12136l;

    /* renamed from: m */
    public VideoCapture f12137m;

    /* renamed from: n */
    public Recording f12138n;

    /* renamed from: o */
    public Map f12139o;

    /* renamed from: p */
    public QualitySelector f12140p;

    /* renamed from: q */
    public Camera f12141q;

    /* renamed from: r */
    public InterfaceC18516Tn1 f12142r;

    /* renamed from: s */
    public ViewPort f12143s;

    /* renamed from: t */
    public Preview.SurfaceProvider f12144t;

    /* renamed from: u */
    public final RotationProvider f12145u;

    /* renamed from: v */
    public final RotationProvider.Listener f12146v;

    /* renamed from: w */
    public boolean f12147w;

    /* renamed from: x */
    public boolean f12148x;

    /* renamed from: y */
    public final F40 f12149y;

    /* renamed from: z */
    public final F40 f12150z;

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* loaded from: classes.dex */
    public @interface UseCases {
    }

    /* renamed from: androidx.camera.view.CameraController$a */
    /* loaded from: classes.dex */
    public class C2683a implements Consumer {

        /* renamed from: a */
        public final /* synthetic */ Executor f12153a;

        /* renamed from: b */
        public final /* synthetic */ Consumer f12154b;

        public C2683a(Executor executor, Consumer consumer) {
            CameraController.this = r1;
            this.f12153a = executor;
            this.f12154b = consumer;
        }

        /* renamed from: a */
        public static /* synthetic */ void m61890a(C2683a c2683a) {
            c2683a.m61888c();
        }

        @Override // androidx.core.util.Consumer
        /* renamed from: b */
        public void accept(VideoRecordEvent videoRecordEvent) {
            if (videoRecordEvent instanceof VideoRecordEvent.Finalize) {
                if (!Threads.isMainThread()) {
                    this.f12153a.execute(new Runnable() { // from class: wj
                        {
                            CameraController.C2683a.this = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            CameraController.C2683a.m61890a(CameraController.C2683a.this);
                        }
                    });
                } else {
                    CameraController.this.m61907j(this);
                }
            }
            this.f12154b.accept(videoRecordEvent);
        }

        /* renamed from: c */
        public final /* synthetic */ void m61888c() {
            CameraController.this.m61907j(this);
        }
    }

    /* renamed from: androidx.camera.view.CameraController$b */
    /* loaded from: classes.dex */
    public class C2684b implements FutureCallback {
        public C2684b() {
            CameraController.this = r1;
        }

        @Override // androidx.camera.core.impl.utils.futures.FutureCallback
        /* renamed from: a */
        public void onSuccess(FocusMeteringResult focusMeteringResult) {
            int i;
            if (focusMeteringResult == null) {
                return;
            }
            Logger.m63230d("CameraController", "Tap to focus onSuccess: " + focusMeteringResult.isFocusSuccessful());
            MutableLiveData mutableLiveData = CameraController.this.f12118A;
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
                Logger.m63230d("CameraController", "Tap-to-focus is canceled by new action.");
                return;
            }
            Logger.m63229d("CameraController", "Tap to focus failed.", th2);
            CameraController.this.f12118A.postValue(4);
        }
    }

    /* renamed from: androidx.camera.view.CameraController$c */
    /* loaded from: classes.dex */
    public static class C2685c {
        @NonNull
        @DoNotInline
        /* renamed from: a */
        public static Context m61886a(@NonNull Context context, @Nullable String str) {
            return context.createAttributionContext(str);
        }

        @Nullable
        @DoNotInline
        /* renamed from: b */
        public static String m61885b(@NonNull Context context) {
            return context.getAttributionTag();
        }
    }

    public CameraController(Context context) {
        this(context, Futures.transform(ProcessCameraProvider.getInstance(context), new Function() { // from class: rj
            @Override // androidx.arch.core.util.Function
            public final Object apply(Object obj) {
                return new C18580Un1((ProcessCameraProvider) obj);
            }
        }, CameraXExecutors.directExecutor()));
    }

    /* renamed from: a */
    public static /* synthetic */ Void m61916a(CameraController cameraController, InterfaceC18516Tn1 interfaceC18516Tn1) {
        return cameraController.m61899r(interfaceC18516Tn1);
    }

    /* renamed from: b */
    public static /* synthetic */ void m61915b(CameraController cameraController, int i) {
        cameraController.m61898s(i);
    }

    /* renamed from: c */
    public static /* synthetic */ void m61914c(CameraController cameraController, int i) {
        cameraController.m61896u(i);
    }

    /* renamed from: d */
    public static /* synthetic */ void m61913d(CameraController cameraController, CameraSelector cameraSelector) {
        cameraController.m61897t(cameraSelector);
    }

    /* renamed from: k */
    public static Recorder m61906k(QualitySelector qualitySelector) {
        return new Recorder.Builder().setQualitySelector(qualitySelector).build();
    }

    /* renamed from: l */
    public static Context m61905l(Context context) {
        String m61885b;
        Context applicationContext = context.getApplicationContext();
        if (Build.VERSION.SDK_INT >= 30 && (m61885b = C2685c.m61885b(context)) != null) {
            return C2685c.m61886a(applicationContext, m61885b);
        }
        return applicationContext;
    }

    /* renamed from: A */
    public final void m61931A(ImageOutputConfig.Builder builder, OutputSize outputSize) {
        if (outputSize == null) {
            return;
        }
        if (outputSize.getResolution() != null) {
            builder.setTargetResolution(outputSize.getResolution());
        } else if (outputSize.getAspectRatio() != -1) {
            builder.setTargetAspectRatio(outputSize.getAspectRatio());
        } else {
            Logger.m63228e("CameraController", "Invalid target surface size. " + outputSize);
        }
    }

    /* renamed from: B */
    public final float m61930B(float f) {
        return f > 1.0f ? ((f - 1.0f) * 2.0f) + 1.0f : 1.0f - ((1.0f - f) * 2.0f);
    }

    /* renamed from: C */
    public abstract Camera mo61884C();

    /* renamed from: D */
    public void m61929D() {
        m61928E(null);
    }

    /* renamed from: E */
    public void m61928E(Runnable runnable) {
        try {
            this.f12141q = mo61884C();
            if (!m61904m()) {
                Logger.m63230d("CameraController", "Use cases not attached to camera.");
                return;
            }
            this.f12149y.m68424f(this.f12141q.getCameraInfo().getZoomState());
            this.f12150z.m68424f(this.f12141q.getCameraInfo().getTorchState());
            this.f12119B.m66989c(new Function() { // from class: oj
                {
                    CameraController.this = this;
                }

                @Override // androidx.arch.core.util.Function
                public final Object apply(Object obj) {
                    return CameraController.this.enableTorch(((Boolean) obj).booleanValue());
                }
            });
            this.f12120C.m66989c(new Function() { // from class: pj
                {
                    CameraController.this = this;
                }

                @Override // androidx.arch.core.util.Function
                public final Object apply(Object obj) {
                    return CameraController.this.setLinearZoom(((Float) obj).floatValue());
                }
            });
            this.f12121D.m66989c(new Function() { // from class: qj
                {
                    CameraController.this = this;
                }

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
    public final void m61927F() {
        this.f12145u.addListener(CameraXExecutors.mainThreadExecutor(), this.f12146v);
    }

    /* renamed from: G */
    public final Recording m61926G(OutputOptions outputOptions, AudioConfig audioConfig, Executor executor, Consumer consumer) {
        Threads.checkMainThread();
        Preconditions.checkState(m61903n(), "Camera not initialized.");
        Preconditions.checkState(isVideoCaptureEnabled(), "VideoCapture disabled.");
        Preconditions.checkState(!isRecording(), "Recording video. Only one recording can be active at a time.");
        Consumer m61917P = m61917P(consumer);
        PendingRecording m61893x = m61893x(outputOptions);
        if (audioConfig.getAudioEnabled()) {
            m61911f();
            m61893x.withAudioEnabled();
        }
        Recording start = m61893x.start(executor, m61917P);
        m61891z(start, m61917P);
        return start;
    }

    /* renamed from: H */
    public final void m61925H() {
        this.f12145u.removeListener(this.f12146v);
    }

    /* renamed from: I */
    public final void m61924I() {
        Threads.checkMainThread();
        Recording recording = this.f12138n;
        if (recording != null) {
            recording.stop();
            m61908i(this.f12138n);
        }
    }

    /* renamed from: J */
    public final void m61923J(int i, int i2) {
        ImageAnalysis.Analyzer analyzer;
        Threads.checkMainThread();
        if (m61903n()) {
            this.f12142r.mo65973b(this.f12135k);
        }
        ImageAnalysis.Builder imageQueueDepth = new ImageAnalysis.Builder().setBackpressureStrategy(i).setImageQueueDepth(i2);
        m61931A(imageQueueDepth, this.f12136l);
        Executor executor = this.f12133i;
        if (executor != null) {
            imageQueueDepth.setBackgroundExecutor(executor);
        }
        ImageAnalysis build = imageQueueDepth.build();
        this.f12135k = build;
        Executor executor2 = this.f12132h;
        if (executor2 != null && (analyzer = this.f12134j) != null) {
            build.setAnalyzer(executor2, analyzer);
        }
    }

    /* renamed from: K */
    public final void m61922K(int i) {
        if (m61903n()) {
            this.f12142r.mo65973b(this.f12129e);
        }
        ImageCapture.Builder captureMode = new ImageCapture.Builder().setCaptureMode(i);
        m61931A(captureMode, this.f12130f);
        Executor executor = this.f12131g;
        if (executor != null) {
            captureMode.setIoExecutor(executor);
        }
        this.f12129e = captureMode.build();
    }

    /* renamed from: L */
    public final void m61921L() {
        if (m61903n()) {
            this.f12142r.mo65973b(this.f12127c);
        }
        Preview.Builder builder = new Preview.Builder();
        m61931A(builder, this.f12128d);
        this.f12127c = builder.build();
    }

    /* renamed from: M */
    public final void m61920M() {
        if (m61903n()) {
            this.f12142r.mo65973b(this.f12137m);
        }
        this.f12137m = m61909h();
    }

    /* renamed from: N */
    public void m61919N(ImageCapture.OutputFileOptions outputFileOptions) {
        boolean z;
        if (this.f12125a.getLensFacing() != null && !outputFileOptions.getMetadata().isReversedHorizontalSet()) {
            ImageCapture.Metadata metadata = outputFileOptions.getMetadata();
            if (this.f12125a.getLensFacing().intValue() == 0) {
                z = true;
            } else {
                z = false;
            }
            metadata.setReversedHorizontal(z);
        }
    }

    /* renamed from: O */
    public void m61918O(Matrix matrix) {
        Threads.checkMainThread();
        ImageAnalysis.Analyzer analyzer = this.f12134j;
        if (analyzer != null && analyzer.getTargetCoordinateSystem() == 1) {
            this.f12134j.updateTransform(matrix);
        }
    }

    /* renamed from: P */
    public final Consumer m61917P(Consumer consumer) {
        return new C2683a(ContextCompat.getMainExecutor(this.f12123F), consumer);
    }

    @MainThread
    public void clearEffects() {
        Threads.checkMainThread();
        InterfaceC18516Tn1 interfaceC18516Tn1 = this.f12142r;
        if (interfaceC18516Tn1 != null) {
            interfaceC18516Tn1.mo65972c();
        }
        this.f12122E.clear();
        m61929D();
    }

    @MainThread
    public void clearImageAnalysisAnalyzer() {
        Threads.checkMainThread();
        ImageAnalysis.Analyzer analyzer = this.f12134j;
        this.f12132h = null;
        this.f12134j = null;
        this.f12135k.clearAnalyzer();
        m61892y(analyzer, null);
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public UseCaseGroup createUseCaseGroup() {
        if (!m61903n()) {
            Logger.m63230d("CameraController", "Camera not initialized.");
            return null;
        } else if (!m61901p()) {
            Logger.m63230d("CameraController", "PreviewView not attached to CameraController.");
            return null;
        } else {
            UseCaseGroup.Builder addUseCase = new UseCaseGroup.Builder().addUseCase(this.f12127c);
            if (isImageCaptureEnabled()) {
                addUseCase.addUseCase(this.f12129e);
            } else {
                this.f12142r.mo65973b(this.f12129e);
            }
            if (isImageAnalysisEnabled()) {
                addUseCase.addUseCase(this.f12135k);
            } else {
                this.f12142r.mo65973b(this.f12135k);
            }
            if (isVideoCaptureEnabled()) {
                addUseCase.addUseCase(this.f12137m);
            } else {
                this.f12142r.mo65973b(this.f12137m);
            }
            addUseCase.setViewPort(this.f12143s);
            for (CameraEffect cameraEffect : this.f12122E) {
                addUseCase.addEffect(cameraEffect);
            }
            return addUseCase.build();
        }
    }

    /* renamed from: e */
    public void m61912e(Preview.SurfaceProvider surfaceProvider, ViewPort viewPort) {
        Threads.checkMainThread();
        if (this.f12144t != surfaceProvider) {
            this.f12144t = surfaceProvider;
            this.f12127c.setSurfaceProvider(surfaceProvider);
        }
        this.f12143s = viewPort;
        m61927F();
        m61929D();
    }

    @NonNull
    @MainThread
    public ListenableFuture<Void> enableTorch(boolean z) {
        Threads.checkMainThread();
        if (!m61904m()) {
            return this.f12119B.m66988d(Boolean.valueOf(z));
        }
        return this.f12141q.getCameraControl().enableTorch(z);
    }

    /* renamed from: f */
    public final void m61911f() {
        if (PermissionChecker.checkSelfPermission(this.f12123F, "android.permission.RECORD_AUDIO") != -1) {
            return;
        }
        throw new SecurityException("Attempted to start recording with audio, but application does not have RECORD_AUDIO permission granted.");
    }

    /* renamed from: g */
    public void m61910g() {
        Threads.checkMainThread();
        InterfaceC18516Tn1 interfaceC18516Tn1 = this.f12142r;
        if (interfaceC18516Tn1 != null) {
            interfaceC18516Tn1.mo65973b(this.f12127c, this.f12129e, this.f12135k, this.f12137m);
        }
        this.f12127c.setSurfaceProvider(null);
        this.f12141q = null;
        this.f12144t = null;
        this.f12143s = null;
        m61925H();
    }

    @Nullable
    @MainThread
    public CameraControl getCameraControl() {
        Threads.checkMainThread();
        Camera camera = this.f12141q;
        if (camera == null) {
            return null;
        }
        return camera.getCameraControl();
    }

    @Nullable
    @MainThread
    public CameraInfo getCameraInfo() {
        Threads.checkMainThread();
        Camera camera = this.f12141q;
        if (camera == null) {
            return null;
        }
        return camera.getCameraInfo();
    }

    @NonNull
    @MainThread
    public CameraSelector getCameraSelector() {
        Threads.checkMainThread();
        return this.f12125a;
    }

    @Nullable
    @MainThread
    public Executor getImageAnalysisBackgroundExecutor() {
        Threads.checkMainThread();
        return this.f12133i;
    }

    @MainThread
    public int getImageAnalysisBackpressureStrategy() {
        Threads.checkMainThread();
        return this.f12135k.getBackpressureStrategy();
    }

    @MainThread
    public int getImageAnalysisImageQueueDepth() {
        Threads.checkMainThread();
        return this.f12135k.getImageQueueDepth();
    }

    @Nullable
    @MainThread
    public OutputSize getImageAnalysisTargetSize() {
        Threads.checkMainThread();
        return this.f12136l;
    }

    @MainThread
    public int getImageCaptureFlashMode() {
        Threads.checkMainThread();
        return this.f12129e.getFlashMode();
    }

    @Nullable
    @MainThread
    public Executor getImageCaptureIoExecutor() {
        Threads.checkMainThread();
        return this.f12131g;
    }

    @MainThread
    public int getImageCaptureMode() {
        Threads.checkMainThread();
        return this.f12129e.getCaptureMode();
    }

    @Nullable
    @MainThread
    public OutputSize getImageCaptureTargetSize() {
        Threads.checkMainThread();
        return this.f12130f;
    }

    @NonNull
    public ListenableFuture<Void> getInitializationFuture() {
        return this.f12124G;
    }

    @Nullable
    @MainThread
    public OutputSize getPreviewTargetSize() {
        Threads.checkMainThread();
        return this.f12128d;
    }

    @NonNull
    @MainThread
    public LiveData<Integer> getTapToFocusState() {
        Threads.checkMainThread();
        return this.f12118A;
    }

    @NonNull
    @MainThread
    public LiveData<Integer> getTorchState() {
        Threads.checkMainThread();
        return this.f12150z;
    }

    @NonNull
    @MainThread
    public QualitySelector getVideoCaptureQualitySelector() {
        Threads.checkMainThread();
        return this.f12140p;
    }

    @NonNull
    @MainThread
    public LiveData<ZoomState> getZoomState() {
        Threads.checkMainThread();
        return this.f12149y;
    }

    /* renamed from: h */
    public final VideoCapture m61909h() {
        return VideoCapture.withOutput(m61906k(this.f12140p));
    }

    @MainThread
    public boolean hasCamera(@NonNull CameraSelector cameraSelector) {
        Threads.checkMainThread();
        Preconditions.checkNotNull(cameraSelector);
        InterfaceC18516Tn1 interfaceC18516Tn1 = this.f12142r;
        if (interfaceC18516Tn1 != null) {
            try {
                return interfaceC18516Tn1.hasCamera(cameraSelector);
            } catch (CameraInfoUnavailableException e) {
                Logger.m63222w("CameraController", "Failed to check camera availability", e);
                return false;
            }
        }
        throw new IllegalStateException("Camera not initialized. Please wait for the initialization future to finish. See #getInitializationFuture().");
    }

    /* renamed from: i */
    public final void m61908i(Recording recording) {
        if (this.f12138n == recording) {
            this.f12138n = null;
        }
    }

    @MainThread
    public boolean isImageAnalysisEnabled() {
        Threads.checkMainThread();
        return m61900q(2);
    }

    @MainThread
    public boolean isImageCaptureEnabled() {
        Threads.checkMainThread();
        return m61900q(1);
    }

    @MainThread
    public boolean isPinchToZoomEnabled() {
        Threads.checkMainThread();
        return this.f12147w;
    }

    @MainThread
    public boolean isRecording() {
        Threads.checkMainThread();
        Recording recording = this.f12138n;
        if (recording != null && !recording.isClosed()) {
            return true;
        }
        return false;
    }

    @MainThread
    public boolean isTapToFocusEnabled() {
        Threads.checkMainThread();
        return this.f12148x;
    }

    @MainThread
    public boolean isVideoCaptureEnabled() {
        Threads.checkMainThread();
        return m61900q(4);
    }

    /* renamed from: j */
    public void m61907j(Consumer consumer) {
        Recording recording = (Recording) this.f12139o.remove(consumer);
        if (recording != null) {
            m61908i(recording);
        }
    }

    /* renamed from: m */
    public final boolean m61904m() {
        if (this.f12141q != null) {
            return true;
        }
        return false;
    }

    /* renamed from: n */
    public final boolean m61903n() {
        if (this.f12142r != null) {
            return true;
        }
        return false;
    }

    /* renamed from: o */
    public final boolean m61902o(OutputSize outputSize, OutputSize outputSize2) {
        if (outputSize == outputSize2) {
            return true;
        }
        if (outputSize != null && outputSize.equals(outputSize2)) {
            return true;
        }
        return false;
    }

    /* renamed from: p */
    public final boolean m61901p() {
        if (this.f12144t != null && this.f12143s != null) {
            return true;
        }
        return false;
    }

    /* renamed from: q */
    public final boolean m61900q(int i) {
        if ((i & this.f12126b) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: r */
    public final /* synthetic */ Void m61899r(InterfaceC18516Tn1 interfaceC18516Tn1) {
        this.f12142r = interfaceC18516Tn1;
        m61929D();
        return null;
    }

    /* renamed from: s */
    public final /* synthetic */ void m61898s(int i) {
        this.f12135k.setTargetRotation(i);
        this.f12129e.setTargetRotation(i);
        this.f12137m.setTargetRotation(i);
    }

    @MainThread
    public void setCameraSelector(@NonNull CameraSelector cameraSelector) {
        Threads.checkMainThread();
        final CameraSelector cameraSelector2 = this.f12125a;
        if (cameraSelector2 == cameraSelector) {
            return;
        }
        this.f12125a = cameraSelector;
        InterfaceC18516Tn1 interfaceC18516Tn1 = this.f12142r;
        if (interfaceC18516Tn1 == null) {
            return;
        }
        interfaceC18516Tn1.mo65973b(this.f12127c, this.f12129e, this.f12135k, this.f12137m);
        m61928E(new Runnable() { // from class: tj
            @Override // java.lang.Runnable
            public final void run() {
                CameraController.m61913d(CameraController.this, cameraSelector2);
            }
        });
    }

    @MainThread
    public void setEffects(@NonNull Set<CameraEffect> set) {
        Threads.checkMainThread();
        if (Objects.equals(this.f12122E, set)) {
            return;
        }
        InterfaceC18516Tn1 interfaceC18516Tn1 = this.f12142r;
        if (interfaceC18516Tn1 != null) {
            interfaceC18516Tn1.mo65972c();
        }
        this.f12122E.clear();
        this.f12122E.addAll(set);
        m61929D();
    }

    @MainThread
    public void setEnabledUseCases(int i) {
        Threads.checkMainThread();
        final int i2 = this.f12126b;
        if (i == i2) {
            return;
        }
        this.f12126b = i;
        if (!isVideoCaptureEnabled() && isRecording()) {
            m61924I();
        }
        m61928E(new Runnable() { // from class: sj
            {
                CameraController.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                CameraController.m61914c(CameraController.this, i2);
            }
        });
    }

    @MainThread
    public void setImageAnalysisAnalyzer(@NonNull Executor executor, @NonNull ImageAnalysis.Analyzer analyzer) {
        Threads.checkMainThread();
        ImageAnalysis.Analyzer analyzer2 = this.f12134j;
        if (analyzer2 == analyzer && this.f12132h == executor) {
            return;
        }
        this.f12132h = executor;
        this.f12134j = analyzer;
        this.f12135k.setAnalyzer(executor, analyzer);
        m61892y(analyzer2, analyzer);
    }

    @MainThread
    public void setImageAnalysisBackgroundExecutor(@Nullable Executor executor) {
        Threads.checkMainThread();
        if (this.f12133i == executor) {
            return;
        }
        this.f12133i = executor;
        m61923J(this.f12135k.getBackpressureStrategy(), this.f12135k.getImageQueueDepth());
        m61929D();
    }

    @MainThread
    public void setImageAnalysisBackpressureStrategy(int i) {
        Threads.checkMainThread();
        if (this.f12135k.getBackpressureStrategy() == i) {
            return;
        }
        m61923J(i, this.f12135k.getImageQueueDepth());
        m61929D();
    }

    @MainThread
    public void setImageAnalysisImageQueueDepth(int i) {
        Threads.checkMainThread();
        if (this.f12135k.getImageQueueDepth() == i) {
            return;
        }
        m61923J(this.f12135k.getBackpressureStrategy(), i);
        m61929D();
    }

    @MainThread
    public void setImageAnalysisTargetSize(@Nullable OutputSize outputSize) {
        Threads.checkMainThread();
        if (m61902o(this.f12136l, outputSize)) {
            return;
        }
        this.f12136l = outputSize;
        m61923J(this.f12135k.getBackpressureStrategy(), this.f12135k.getImageQueueDepth());
        m61929D();
    }

    @MainThread
    public void setImageCaptureFlashMode(int i) {
        Threads.checkMainThread();
        this.f12129e.setFlashMode(i);
    }

    @MainThread
    public void setImageCaptureIoExecutor(@Nullable Executor executor) {
        Threads.checkMainThread();
        if (this.f12131g == executor) {
            return;
        }
        this.f12131g = executor;
        m61922K(this.f12129e.getCaptureMode());
        m61929D();
    }

    @MainThread
    public void setImageCaptureMode(int i) {
        Threads.checkMainThread();
        if (this.f12129e.getCaptureMode() == i) {
            return;
        }
        m61922K(i);
        m61929D();
    }

    @MainThread
    public void setImageCaptureTargetSize(@Nullable OutputSize outputSize) {
        Threads.checkMainThread();
        if (m61902o(this.f12130f, outputSize)) {
            return;
        }
        this.f12130f = outputSize;
        m61922K(getImageCaptureMode());
        m61929D();
    }

    @NonNull
    @MainThread
    public ListenableFuture<Void> setLinearZoom(@FloatRange(from = 0.0d, m64743to = 1.0d) float f) {
        Threads.checkMainThread();
        if (!m61904m()) {
            return this.f12120C.m66988d(Float.valueOf(f));
        }
        return this.f12141q.getCameraControl().setLinearZoom(f);
    }

    @MainThread
    public void setPinchToZoomEnabled(boolean z) {
        Threads.checkMainThread();
        this.f12147w = z;
    }

    @MainThread
    public void setPreviewTargetSize(@Nullable OutputSize outputSize) {
        Threads.checkMainThread();
        if (m61902o(this.f12128d, outputSize)) {
            return;
        }
        this.f12128d = outputSize;
        m61921L();
        m61929D();
    }

    @MainThread
    public void setTapToFocusEnabled(boolean z) {
        Threads.checkMainThread();
        this.f12148x = z;
    }

    @MainThread
    public void setVideoCaptureQualitySelector(@NonNull QualitySelector qualitySelector) {
        Threads.checkMainThread();
        this.f12140p = qualitySelector;
        m61920M();
        m61929D();
    }

    @NonNull
    @MainThread
    public ListenableFuture<Void> setZoomRatio(float f) {
        Threads.checkMainThread();
        if (!m61904m()) {
            return this.f12121D.m66988d(Float.valueOf(f));
        }
        return this.f12141q.getCameraControl().setZoomRatio(f);
    }

    @NonNull
    @SuppressLint({"MissingPermission"})
    @MainThread
    public Recording startRecording(@NonNull FileOutputOptions fileOutputOptions, @NonNull AudioConfig audioConfig, @NonNull Executor executor, @NonNull Consumer<VideoRecordEvent> consumer) {
        return m61926G(fileOutputOptions, audioConfig, executor, consumer);
    }

    /* renamed from: t */
    public final /* synthetic */ void m61897t(CameraSelector cameraSelector) {
        this.f12125a = cameraSelector;
    }

    @MainThread
    public void takePicture(@NonNull ImageCapture.OutputFileOptions outputFileOptions, @NonNull Executor executor, @NonNull ImageCapture.OnImageSavedCallback onImageSavedCallback) {
        Threads.checkMainThread();
        Preconditions.checkState(m61903n(), "Camera not initialized.");
        Preconditions.checkState(isImageCaptureEnabled(), "ImageCapture disabled.");
        m61919N(outputFileOptions);
        this.f12129e.m63248u(outputFileOptions, executor, onImageSavedCallback);
    }

    /* renamed from: u */
    public final /* synthetic */ void m61896u(int i) {
        this.f12126b = i;
    }

    /* renamed from: v */
    public void m61895v(float f) {
        if (!m61904m()) {
            Logger.m63223w("CameraController", "Use cases not attached to camera.");
        } else if (!this.f12147w) {
            Logger.m63230d("CameraController", "Pinch to zoom disabled.");
        } else {
            Logger.m63230d("CameraController", "Pinch to zoom with scale: " + f);
            ZoomState value = getZoomState().getValue();
            if (value == null) {
                return;
            }
            setZoomRatio(Math.min(Math.max(value.getZoomRatio() * m61930B(f), value.getMinZoomRatio()), value.getMaxZoomRatio()));
        }
    }

    /* renamed from: w */
    public void m61894w(MeteringPointFactory meteringPointFactory, float f, float f2) {
        if (!m61904m()) {
            Logger.m63223w("CameraController", "Use cases not attached to camera.");
        } else if (!this.f12148x) {
            Logger.m63230d("CameraController", "Tap to focus disabled. ");
        } else {
            Logger.m63230d("CameraController", "Tap to focus started: " + f + ", " + f2);
            this.f12118A.postValue(1);
            MeteringPoint createPoint = meteringPointFactory.createPoint(f, f2, 0.16666667f);
            Futures.addCallback(this.f12141q.getCameraControl().startFocusAndMetering(new FocusMeteringAction.Builder(createPoint, 1).addPoint(meteringPointFactory.createPoint(f, f2, 0.25f), 2).build()), new C2684b(), CameraXExecutors.directExecutor());
        }
    }

    /* renamed from: x */
    public final PendingRecording m61893x(OutputOptions outputOptions) {
        Recorder recorder = (Recorder) this.f12137m.getOutput();
        if (outputOptions instanceof FileOutputOptions) {
            return recorder.prepareRecording(this.f12123F, (FileOutputOptions) outputOptions);
        }
        if (outputOptions instanceof FileDescriptorOutputOptions) {
            if (Build.VERSION.SDK_INT >= 26) {
                return recorder.prepareRecording(this.f12123F, (FileDescriptorOutputOptions) outputOptions);
            }
            throw new UnsupportedOperationException("File descriptors are not supported on pre-Android O (API 26) devices.");
        } else if (outputOptions instanceof MediaStoreOutputOptions) {
            return recorder.prepareRecording(this.f12123F, (MediaStoreOutputOptions) outputOptions);
        } else {
            throw new IllegalArgumentException("Unsupported OutputOptions type.");
        }
    }

    /* renamed from: y */
    public final void m61892y(ImageAnalysis.Analyzer analyzer, ImageAnalysis.Analyzer analyzer2) {
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
            m61923J(this.f12135k.getBackpressureStrategy(), this.f12135k.getImageQueueDepth());
            m61929D();
        }
    }

    /* renamed from: z */
    public final void m61891z(Recording recording, Consumer consumer) {
        this.f12139o.put(consumer, recording);
        this.f12138n = recording;
    }

    @NonNull
    @SuppressLint({"MissingPermission"})
    @RequiresApi(26)
    @MainThread
    public Recording startRecording(@NonNull FileDescriptorOutputOptions fileDescriptorOutputOptions, @NonNull AudioConfig audioConfig, @NonNull Executor executor, @NonNull Consumer<VideoRecordEvent> consumer) {
        return m61926G(fileDescriptorOutputOptions, audioConfig, executor, consumer);
    }

    @NonNull
    @SuppressLint({"MissingPermission"})
    @MainThread
    public Recording startRecording(@NonNull MediaStoreOutputOptions mediaStoreOutputOptions, @NonNull AudioConfig audioConfig, @NonNull Executor executor, @NonNull Consumer<VideoRecordEvent> consumer) {
        return m61926G(mediaStoreOutputOptions, audioConfig, executor, consumer);
    }

    @RequiresApi(21)
    /* loaded from: classes.dex */
    public static final class OutputSize {
        public static final int UNASSIGNED_ASPECT_RATIO = -1;

        /* renamed from: a */
        public final int f12151a;

        /* renamed from: b */
        public final Size f12152b;

        @Retention(RetentionPolicy.SOURCE)
        @RestrictTo({RestrictTo.Scope.LIBRARY})
        /* loaded from: classes.dex */
        public @interface OutputAspectRatio {
        }

        public OutputSize(int i) {
            Preconditions.checkArgument(i != -1);
            this.f12151a = i;
            this.f12152b = null;
        }

        public int getAspectRatio() {
            return this.f12151a;
        }

        @Nullable
        public Size getResolution() {
            return this.f12152b;
        }

        @NonNull
        public String toString() {
            return "aspect ratio: " + this.f12151a + " resolution: " + this.f12152b;
        }

        public OutputSize(@NonNull Size size) {
            Preconditions.checkNotNull(size);
            this.f12151a = -1;
            this.f12152b = size;
        }
    }

    public CameraController(Context context, ListenableFuture listenableFuture) {
        this.f12125a = CameraSelector.DEFAULT_BACK_CAMERA;
        this.f12126b = 3;
        this.f12138n = null;
        this.f12139o = new HashMap();
        this.f12140p = Recorder.DEFAULT_QUALITY_SELECTOR;
        this.f12147w = true;
        this.f12148x = true;
        this.f12149y = new F40();
        this.f12150z = new F40();
        this.f12118A = new MutableLiveData(0);
        this.f12119B = new C18185Oj1();
        this.f12120C = new C18185Oj1();
        this.f12121D = new C18185Oj1();
        this.f12122E = new HashSet();
        Context m61905l = m61905l(context);
        this.f12123F = m61905l;
        this.f12127c = new Preview.Builder().build();
        this.f12129e = new ImageCapture.Builder().build();
        this.f12135k = new ImageAnalysis.Builder().build();
        this.f12137m = m61909h();
        this.f12124G = Futures.transform(listenableFuture, new Function() { // from class: uj
            @Override // androidx.arch.core.util.Function
            public final Object apply(Object obj) {
                return CameraController.m61916a(CameraController.this, (InterfaceC18516Tn1) obj);
            }
        }, CameraXExecutors.mainThreadExecutor());
        this.f12145u = new RotationProvider(m61905l);
        this.f12146v = new RotationProvider.Listener() { // from class: vj
            {
                CameraController.this = this;
            }

            @Override // androidx.camera.view.RotationProvider.Listener
            public final void onRotationChanged(int i) {
                CameraController.m61915b(CameraController.this, i);
            }
        };
    }

    @MainThread
    public void takePicture(@NonNull Executor executor, @NonNull ImageCapture.OnImageCapturedCallback onImageCapturedCallback) {
        Threads.checkMainThread();
        Preconditions.checkState(m61903n(), "Camera not initialized.");
        Preconditions.checkState(isImageCaptureEnabled(), "ImageCapture disabled.");
        this.f12129e.m63249t(executor, onImageCapturedCallback);
    }
}
