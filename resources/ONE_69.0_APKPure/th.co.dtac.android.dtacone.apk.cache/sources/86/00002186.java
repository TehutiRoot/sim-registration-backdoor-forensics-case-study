package androidx.camera.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Rational;
import android.util.Size;
import android.view.Display;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.UiThread;
import androidx.camera.core.CameraInfo;
import androidx.camera.core.Logger;
import androidx.camera.core.MeteringPointFactory;
import androidx.camera.core.Preview;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.core.ViewPort;
import androidx.camera.core.impl.CameraInfoInternal;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.utils.Threads;
import androidx.camera.core.impl.utils.TransformUtils;
import androidx.camera.view.AbstractC2681c;
import androidx.camera.view.PreviewView;
import androidx.camera.view.internal.compat.quirk.DeviceQuirks;
import androidx.camera.view.internal.compat.quirk.SurfaceViewNotCroppedByParentQuirk;
import androidx.camera.view.internal.compat.quirk.SurfaceViewStretchedQuirk;
import androidx.camera.view.transform.OutputTransform;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewCompat;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.google.firebase.messaging.Constants;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

@RequiresApi(21)
/* loaded from: classes.dex */
public final class PreviewView extends FrameLayout {

    /* renamed from: q */
    public static final ImplementationMode f12246q = ImplementationMode.PERFORMANCE;

    /* renamed from: a */
    public ImplementationMode f12247a;

    /* renamed from: b */
    public AbstractC2681c f12248b;

    /* renamed from: c */
    public final C2679b f12249c;

    /* renamed from: d */
    public boolean f12250d;

    /* renamed from: e */
    public final MutableLiveData f12251e;

    /* renamed from: f */
    public final AtomicReference f12252f;

    /* renamed from: g */
    public CameraController f12253g;

    /* renamed from: h */
    public OnFrameUpdateListener f12254h;

    /* renamed from: i */
    public Executor f12255i;

    /* renamed from: j */
    public C17391Bo1 f12256j;

    /* renamed from: k */
    public final ScaleGestureDetector f12257k;

    /* renamed from: l */
    public CameraInfoInternal f12258l;

    /* renamed from: m */
    public MotionEvent f12259m;

    /* renamed from: n */
    public final C2670c f12260n;

    /* renamed from: o */
    public final View.OnLayoutChangeListener f12261o;

    /* renamed from: p */
    public final Preview.SurfaceProvider f12262p;

    @RequiresApi(21)
    /* loaded from: classes.dex */
    public enum ImplementationMode {
        PERFORMANCE(0),
        COMPATIBLE(1);
        
        private final int mId;

        ImplementationMode(int i) {
            this.mId = i;
        }

        public static ImplementationMode fromId(int i) {
            ImplementationMode[] values;
            for (ImplementationMode implementationMode : values()) {
                if (implementationMode.mId == i) {
                    return implementationMode;
                }
            }
            throw new IllegalArgumentException("Unknown implementation mode id " + i);
        }

        public int getId() {
            return this.mId;
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: classes.dex */
    public interface OnFrameUpdateListener {
        void onFrameUpdate(long j);
    }

    @RequiresApi(21)
    /* loaded from: classes.dex */
    public enum ScaleType {
        FILL_START(0),
        FILL_CENTER(1),
        FILL_END(2),
        FIT_START(3),
        FIT_CENTER(4),
        FIT_END(5);
        
        private final int mId;

        ScaleType(int i) {
            this.mId = i;
        }

        public static ScaleType fromId(int i) {
            ScaleType[] values;
            for (ScaleType scaleType : values()) {
                if (scaleType.mId == i) {
                    return scaleType;
                }
            }
            throw new IllegalArgumentException("Unknown scale type id " + i);
        }

        public int getId() {
            return this.mId;
        }
    }

    /* loaded from: classes.dex */
    public enum StreamState {
        IDLE,
        STREAMING
    }

    /* renamed from: androidx.camera.view.PreviewView$a */
    /* loaded from: classes.dex */
    public class C2668a implements Preview.SurfaceProvider {
        public C2668a() {
            PreviewView.this = r1;
        }

        /* renamed from: b */
        public static /* synthetic */ void m61821b(C2668a c2668a, C2676a c2676a, CameraInternal cameraInternal) {
            c2668a.m61817f(c2676a, cameraInternal);
        }

        /* renamed from: d */
        public final /* synthetic */ void m61819d(SurfaceRequest surfaceRequest) {
            PreviewView.this.f12262p.onSurfaceRequested(surfaceRequest);
        }

        /* renamed from: e */
        public final /* synthetic */ void m61818e(CameraInternal cameraInternal, SurfaceRequest surfaceRequest, SurfaceRequest.TransformationInfo transformationInfo) {
            boolean z;
            PreviewView previewView;
            AbstractC2681c abstractC2681c;
            Logger.m63178d("PreviewView", "Preview transformation info updated. " + transformationInfo);
            if (cameraInternal.getCameraInfoInternal().getLensFacing() == 0) {
                z = true;
            } else {
                z = false;
            }
            PreviewView.this.f12249c.m61781r(transformationInfo, surfaceRequest.getResolution(), z);
            if (transformationInfo.getTargetRotation() != -1 && ((abstractC2681c = (previewView = PreviewView.this).f12248b) == null || !(abstractC2681c instanceof C2683d))) {
                previewView.f12250d = false;
            } else {
                PreviewView.this.f12250d = true;
            }
            PreviewView.this.m61828d();
        }

        /* renamed from: f */
        public final /* synthetic */ void m61817f(C2676a c2676a, CameraInternal cameraInternal) {
            if (AbstractC23094xo1.m479a(PreviewView.this.f12252f, c2676a, null)) {
                c2676a.m61801k(StreamState.IDLE);
            }
            c2676a.m61807e();
            cameraInternal.getCameraState().removeObserver(c2676a);
        }

        @Override // androidx.camera.core.Preview.SurfaceProvider
        public void onSurfaceRequested(final SurfaceRequest surfaceRequest) {
            Executor executor;
            AbstractC2681c c2683d;
            if (!Threads.isMainThread()) {
                ContextCompat.getMainExecutor(PreviewView.this.getContext()).execute(new Runnable() { // from class: yo1
                    @Override // java.lang.Runnable
                    public final void run() {
                        PreviewView.C2668a.this.m61819d(surfaceRequest);
                    }
                });
                return;
            }
            Logger.m63178d("PreviewView", "Surface requested by Preview.");
            final CameraInternal camera = surfaceRequest.getCamera();
            PreviewView.this.f12258l = camera.getCameraInfoInternal();
            surfaceRequest.setTransformationInfoListener(ContextCompat.getMainExecutor(PreviewView.this.getContext()), new SurfaceRequest.TransformationInfoListener() { // from class: zo1
                @Override // androidx.camera.core.SurfaceRequest.TransformationInfoListener
                public final void onTransformationInfoUpdate(SurfaceRequest.TransformationInfo transformationInfo) {
                    PreviewView.C2668a.this.m61818e(camera, surfaceRequest, transformationInfo);
                }
            });
            PreviewView previewView = PreviewView.this;
            if (!PreviewView.m61827e(previewView.f12248b, surfaceRequest, previewView.f12247a)) {
                PreviewView previewView2 = PreviewView.this;
                if (PreviewView.m61826f(surfaceRequest, previewView2.f12247a)) {
                    PreviewView previewView3 = PreviewView.this;
                    c2683d = new C2686e(previewView3, previewView3.f12249c);
                } else {
                    PreviewView previewView4 = PreviewView.this;
                    c2683d = new C2683d(previewView4, previewView4.f12249c);
                }
                previewView2.f12248b = c2683d;
            }
            CameraInfoInternal cameraInfoInternal = camera.getCameraInfoInternal();
            PreviewView previewView5 = PreviewView.this;
            final C2676a c2676a = new C2676a(cameraInfoInternal, previewView5.f12251e, previewView5.f12248b);
            PreviewView.this.f12252f.set(c2676a);
            camera.getCameraState().addObserver(ContextCompat.getMainExecutor(PreviewView.this.getContext()), c2676a);
            PreviewView.this.f12248b.mo61757g(surfaceRequest, new AbstractC2681c.InterfaceC2682a() { // from class: Ao1
                @Override // androidx.camera.view.AbstractC2681c.InterfaceC2682a
                /* renamed from: a */
                public final void mo61776a() {
                    PreviewView.C2668a.m61821b(PreviewView.C2668a.this, c2676a, camera);
                }
            });
            PreviewView previewView6 = PreviewView.this;
            OnFrameUpdateListener onFrameUpdateListener = previewView6.f12254h;
            if (onFrameUpdateListener != null && (executor = previewView6.f12255i) != null) {
                previewView6.f12248b.mo61756i(executor, onFrameUpdateListener);
            }
        }
    }

    /* renamed from: androidx.camera.view.PreviewView$b */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C2669b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f12264a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f12265b;

        static {
            int[] iArr = new int[ImplementationMode.values().length];
            f12265b = iArr;
            try {
                iArr[ImplementationMode.COMPATIBLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f12265b[ImplementationMode.PERFORMANCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[ScaleType.values().length];
            f12264a = iArr2;
            try {
                iArr2[ScaleType.FILL_END.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f12264a[ScaleType.FILL_CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f12264a[ScaleType.FILL_START.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f12264a[ScaleType.FIT_END.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f12264a[ScaleType.FIT_CENTER.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f12264a[ScaleType.FIT_START.ordinal()] = 6;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* renamed from: androidx.camera.view.PreviewView$c */
    /* loaded from: classes.dex */
    public class C2670c implements DisplayManager.DisplayListener {
        public C2670c() {
            PreviewView.this = r1;
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayAdded(int i) {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayChanged(int i) {
            Display display = PreviewView.this.getDisplay();
            if (display != null && display.getDisplayId() == i) {
                PreviewView.this.m61828d();
            }
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayRemoved(int i) {
        }
    }

    /* renamed from: androidx.camera.view.PreviewView$d */
    /* loaded from: classes.dex */
    public class C2671d extends ScaleGestureDetector.SimpleOnScaleGestureListener {
        public C2671d() {
            PreviewView.this = r1;
        }

        @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
        public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            CameraController cameraController = PreviewView.this.f12253g;
            if (cameraController != null) {
                cameraController.m61843v(scaleGestureDetector.getScaleFactor());
                return true;
            }
            return true;
        }
    }

    @UiThread
    public PreviewView(@NonNull Context context) {
        this(context, null);
    }

    /* renamed from: a */
    public static /* synthetic */ void m61831a(PreviewView previewView, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        previewView.m61829c(view, i, i2, i3, i4, i5, i6, i7, i8);
    }

    /* renamed from: e */
    public static boolean m61827e(AbstractC2681c abstractC2681c, SurfaceRequest surfaceRequest, ImplementationMode implementationMode) {
        if ((abstractC2681c instanceof C2683d) && !m61826f(surfaceRequest, implementationMode)) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public static boolean m61826f(SurfaceRequest surfaceRequest, ImplementationMode implementationMode) {
        boolean z;
        int i;
        boolean equals = surfaceRequest.getCamera().getCameraInfoInternal().getImplementationType().equals(CameraInfo.IMPLEMENTATION_TYPE_CAMERA2_LEGACY);
        if (DeviceQuirks.get(SurfaceViewStretchedQuirk.class) == null && DeviceQuirks.get(SurfaceViewNotCroppedByParentQuirk.class) == null) {
            z = false;
        } else {
            z = true;
        }
        if (Build.VERSION.SDK_INT <= 24 || equals || z || (i = C2669b.f12265b[implementationMode.ordinal()]) == 1) {
            return true;
        }
        if (i == 2) {
            return false;
        }
        throw new IllegalArgumentException("Invalid implementation mode: " + implementationMode);
    }

    @Nullable
    private DisplayManager getDisplayManager() {
        Context context = getContext();
        if (context == null) {
            return null;
        }
        return (DisplayManager) context.getApplicationContext().getSystemService(Constants.ScionAnalytics.MessageType.DISPLAY_NOTIFICATION);
    }

    private int getViewPortScaleType() {
        switch (C2669b.f12264a[getScaleType().ordinal()]) {
            case 1:
                return 2;
            case 2:
                return 1;
            case 3:
                return 0;
            case 4:
            case 5:
            case 6:
                return 3;
            default:
                throw new IllegalStateException("Unexpected scale type: " + getScaleType());
        }
    }

    /* renamed from: b */
    public final void m61830b(boolean z) {
        Threads.checkMainThread();
        ViewPort viewPort = getViewPort();
        if (this.f12253g != null && viewPort != null && isAttachedToWindow()) {
            try {
                this.f12253g.m61860e(getSurfaceProvider(), viewPort);
            } catch (IllegalStateException e) {
                if (z) {
                    Logger.m63175e("PreviewView", e.toString(), e);
                    return;
                }
                throw e;
            }
        }
    }

    /* renamed from: c */
    public final /* synthetic */ void m61829c(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (i3 - i != i7 - i5 || i4 - i2 != i8 - i6) {
            m61828d();
            m61830b(true);
        }
    }

    /* renamed from: d */
    public void m61828d() {
        Threads.checkMainThread();
        if (this.f12248b != null) {
            m61823i();
            this.f12248b.m61777h();
        }
        this.f12256j.m69075a(new Size(getWidth(), getHeight()), getLayoutDirection());
        CameraController cameraController = this.f12253g;
        if (cameraController != null) {
            cameraController.m61866O(getSensorToViewTransform());
        }
    }

    /* renamed from: g */
    public final void m61825g() {
        DisplayManager displayManager = getDisplayManager();
        if (displayManager == null) {
            return;
        }
        displayManager.registerDisplayListener(this.f12260n, new Handler(Looper.getMainLooper()));
    }

    @Nullable
    @UiThread
    public Bitmap getBitmap() {
        Threads.checkMainThread();
        AbstractC2681c abstractC2681c = this.f12248b;
        if (abstractC2681c == null) {
            return null;
        }
        return abstractC2681c.m61779a();
    }

    @Nullable
    @UiThread
    public CameraController getController() {
        Threads.checkMainThread();
        return this.f12253g;
    }

    @NonNull
    @UiThread
    public ImplementationMode getImplementationMode() {
        Threads.checkMainThread();
        return this.f12247a;
    }

    @NonNull
    @UiThread
    public MeteringPointFactory getMeteringPointFactory() {
        Threads.checkMainThread();
        return this.f12256j;
    }

    @Nullable
    @TransformExperimental
    public OutputTransform getOutputTransform() {
        Matrix matrix;
        Threads.checkMainThread();
        try {
            matrix = this.f12249c.m61789j(new Size(getWidth(), getHeight()), getLayoutDirection());
        } catch (IllegalStateException unused) {
            matrix = null;
        }
        Rect m61790i = this.f12249c.m61790i();
        if (matrix != null && m61790i != null) {
            matrix.preConcat(TransformUtils.getNormalizedToBuffer(m61790i));
            if (this.f12248b instanceof C2686e) {
                matrix.postConcat(getMatrix());
            } else if (!getMatrix().isIdentity()) {
                Logger.m63171w("PreviewView", "PreviewView needs to be in COMPATIBLE mode for the transform to work correctly.");
            }
            return new OutputTransform(matrix, new Size(m61790i.width(), m61790i.height()));
        }
        Logger.m63178d("PreviewView", "Transform info is not ready");
        return null;
    }

    @NonNull
    public LiveData<StreamState> getPreviewStreamState() {
        return this.f12251e;
    }

    @NonNull
    @UiThread
    public ScaleType getScaleType() {
        Threads.checkMainThread();
        return this.f12249c.m61792g();
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public Matrix getSensorToViewTransform() {
        Threads.checkMainThread();
        return this.f12249c.m61791h(new Size(getWidth(), getHeight()), getLayoutDirection());
    }

    @NonNull
    @UiThread
    public Preview.SurfaceProvider getSurfaceProvider() {
        Threads.checkMainThread();
        return this.f12262p;
    }

    @Nullable
    @UiThread
    public ViewPort getViewPort() {
        Threads.checkMainThread();
        if (getDisplay() == null) {
            return null;
        }
        return getViewPort(getDisplay().getRotation());
    }

    /* renamed from: h */
    public final void m61824h() {
        DisplayManager displayManager = getDisplayManager();
        if (displayManager == null) {
            return;
        }
        displayManager.unregisterDisplayListener(this.f12260n);
    }

    /* renamed from: i */
    public void m61823i() {
        Display display;
        CameraInfoInternal cameraInfoInternal;
        if (this.f12250d && (display = getDisplay()) != null && (cameraInfoInternal = this.f12258l) != null) {
            this.f12249c.m61784o(cameraInfoInternal.getSensorRotationDegrees(display.getRotation()), display.getRotation());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m61825g();
        addOnLayoutChangeListener(this.f12261o);
        AbstractC2681c abstractC2681c = this.f12248b;
        if (abstractC2681c != null) {
            abstractC2681c.mo61759d();
        }
        m61830b(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeOnLayoutChangeListener(this.f12261o);
        AbstractC2681c abstractC2681c = this.f12248b;
        if (abstractC2681c != null) {
            abstractC2681c.mo61758e();
        }
        CameraController cameraController = this.f12253g;
        if (cameraController != null) {
            cameraController.m61858g();
        }
        m61824h();
    }

    @Override // android.view.View
    public boolean onTouchEvent(@NonNull MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        boolean z3;
        if (this.f12253g == null) {
            return super.onTouchEvent(motionEvent);
        }
        if (motionEvent.getPointerCount() == 1) {
            z = true;
        } else {
            z = false;
        }
        if (motionEvent.getAction() == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (motionEvent.getEventTime() - motionEvent.getDownTime() < ViewConfiguration.getLongPressTimeout()) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z && z2 && z3) {
            this.f12259m = motionEvent;
            performClick();
            return true;
        } else if (!this.f12257k.onTouchEvent(motionEvent) && !super.onTouchEvent(motionEvent)) {
            return false;
        } else {
            return true;
        }
    }

    @Override // android.view.View
    public boolean performClick() {
        float width;
        float height;
        if (this.f12253g != null) {
            MotionEvent motionEvent = this.f12259m;
            if (motionEvent != null) {
                width = motionEvent.getX();
            } else {
                width = getWidth() / 2.0f;
            }
            MotionEvent motionEvent2 = this.f12259m;
            if (motionEvent2 != null) {
                height = motionEvent2.getY();
            } else {
                height = getHeight() / 2.0f;
            }
            this.f12253g.m61842w(this.f12256j, width, height);
        }
        this.f12259m = null;
        return super.performClick();
    }

    @UiThread
    public void setController(@Nullable CameraController cameraController) {
        Threads.checkMainThread();
        CameraController cameraController2 = this.f12253g;
        if (cameraController2 != null && cameraController2 != cameraController) {
            cameraController2.m61858g();
        }
        this.f12253g = cameraController;
        m61830b(false);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setFrameUpdateListener(@NonNull Executor executor, @NonNull OnFrameUpdateListener onFrameUpdateListener) {
        if (this.f12247a != ImplementationMode.PERFORMANCE) {
            this.f12254h = onFrameUpdateListener;
            this.f12255i = executor;
            AbstractC2681c abstractC2681c = this.f12248b;
            if (abstractC2681c != null) {
                abstractC2681c.mo61756i(executor, onFrameUpdateListener);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("PERFORMANCE mode doesn't support frame update listener");
    }

    @UiThread
    public void setImplementationMode(@NonNull ImplementationMode implementationMode) {
        Threads.checkMainThread();
        this.f12247a = implementationMode;
        if (implementationMode == ImplementationMode.PERFORMANCE && this.f12254h != null) {
            throw new IllegalArgumentException("PERFORMANCE mode doesn't support frame update listener");
        }
    }

    @UiThread
    public void setScaleType(@NonNull ScaleType scaleType) {
        Threads.checkMainThread();
        this.f12249c.m61782q(scaleType);
        m61828d();
        m61830b(false);
    }

    @UiThread
    public PreviewView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @UiThread
    public PreviewView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    @UiThread
    public PreviewView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        ImplementationMode implementationMode = f12246q;
        this.f12247a = implementationMode;
        C2679b c2679b = new C2679b();
        this.f12249c = c2679b;
        this.f12250d = true;
        this.f12251e = new MutableLiveData(StreamState.IDLE);
        this.f12252f = new AtomicReference();
        this.f12256j = new C17391Bo1(c2679b);
        this.f12260n = new C2670c();
        this.f12261o = new View.OnLayoutChangeListener() { // from class: wo1
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
                PreviewView.m61831a(PreviewView.this, view, i3, i4, i5, i6, i7, i8, i9, i10);
            }
        };
        this.f12262p = new C2668a();
        Threads.checkMainThread();
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R.styleable.PreviewView, i, i2);
        ViewCompat.saveAttributeDataForStyleable(this, context, R.styleable.PreviewView, attributeSet, obtainStyledAttributes, i, i2);
        try {
            setScaleType(ScaleType.fromId(obtainStyledAttributes.getInteger(R.styleable.PreviewView_scaleType, c2679b.m61792g().getId())));
            setImplementationMode(ImplementationMode.fromId(obtainStyledAttributes.getInteger(R.styleable.PreviewView_implementationMode, implementationMode.getId())));
            obtainStyledAttributes.recycle();
            this.f12257k = new ScaleGestureDetector(context, new C2671d());
            if (getBackground() == null) {
                setBackgroundColor(ContextCompat.getColor(getContext(), 17170444));
            }
        } catch (Throwable th2) {
            obtainStyledAttributes.recycle();
            throw th2;
        }
    }

    @Nullable
    @SuppressLint({"WrongConstant"})
    @UiThread
    public ViewPort getViewPort(int i) {
        Threads.checkMainThread();
        if (getWidth() == 0 || getHeight() == 0) {
            return null;
        }
        return new ViewPort.Builder(new Rational(getWidth(), getHeight()), i).setScaleType(getViewPortScaleType()).setLayoutDirection(getLayoutDirection()).build();
    }
}