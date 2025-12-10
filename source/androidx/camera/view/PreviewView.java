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
import androidx.camera.view.AbstractC2699c;
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
    public static final ImplementationMode f12158q = ImplementationMode.PERFORMANCE;

    /* renamed from: a */
    public ImplementationMode f12159a;

    /* renamed from: b */
    public AbstractC2699c f12160b;

    /* renamed from: c */
    public final C2697b f12161c;

    /* renamed from: d */
    public boolean f12162d;

    /* renamed from: e */
    public final MutableLiveData f12163e;

    /* renamed from: f */
    public final AtomicReference f12164f;

    /* renamed from: g */
    public CameraController f12165g;

    /* renamed from: h */
    public OnFrameUpdateListener f12166h;

    /* renamed from: i */
    public Executor f12167i;

    /* renamed from: j */
    public C17556En1 f12168j;

    /* renamed from: k */
    public final ScaleGestureDetector f12169k;

    /* renamed from: l */
    public CameraInfoInternal f12170l;

    /* renamed from: m */
    public MotionEvent f12171m;

    /* renamed from: n */
    public final C2688c f12172n;

    /* renamed from: o */
    public final View.OnLayoutChangeListener f12173o;

    /* renamed from: p */
    public final Preview.SurfaceProvider f12174p;

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
    public class C2686a implements Preview.SurfaceProvider {
        public C2686a() {
            PreviewView.this = r1;
        }

        /* renamed from: d */
        public final /* synthetic */ void m61871d(SurfaceRequest surfaceRequest) {
            PreviewView.this.f12174p.onSurfaceRequested(surfaceRequest);
        }

        /* renamed from: e */
        public final /* synthetic */ void m61870e(CameraInternal cameraInternal, SurfaceRequest surfaceRequest, SurfaceRequest.TransformationInfo transformationInfo) {
            boolean z;
            PreviewView previewView;
            AbstractC2699c abstractC2699c;
            Logger.m63230d("PreviewView", "Preview transformation info updated. " + transformationInfo);
            if (cameraInternal.getCameraInfoInternal().getLensFacing() == 0) {
                z = true;
            } else {
                z = false;
            }
            PreviewView.this.f12161c.m61833r(transformationInfo, surfaceRequest.getResolution(), z);
            if (transformationInfo.getTargetRotation() != -1 && ((abstractC2699c = (previewView = PreviewView.this).f12160b) == null || !(abstractC2699c instanceof C2701d))) {
                previewView.f12162d = false;
            } else {
                PreviewView.this.f12162d = true;
            }
            PreviewView.this.m61880d();
        }

        /* renamed from: f */
        public final /* synthetic */ void m61869f(C2694a c2694a, CameraInternal cameraInternal) {
            if (AbstractC17300An1.m69050a(PreviewView.this.f12164f, c2694a, null)) {
                c2694a.m61853k(StreamState.IDLE);
            }
            c2694a.m61859e();
            cameraInternal.getCameraState().removeObserver(c2694a);
        }

        @Override // androidx.camera.core.Preview.SurfaceProvider
        public void onSurfaceRequested(final SurfaceRequest surfaceRequest) {
            Executor executor;
            AbstractC2699c c2701d;
            if (!Threads.isMainThread()) {
                ContextCompat.getMainExecutor(PreviewView.this.getContext()).execute(new Runnable() { // from class: Bn1
                    @Override // java.lang.Runnable
                    public final void run() {
                        PreviewView.C2686a.this.m61871d(surfaceRequest);
                    }
                });
                return;
            }
            Logger.m63230d("PreviewView", "Surface requested by Preview.");
            final CameraInternal camera = surfaceRequest.getCamera();
            PreviewView.this.f12170l = camera.getCameraInfoInternal();
            surfaceRequest.setTransformationInfoListener(ContextCompat.getMainExecutor(PreviewView.this.getContext()), new SurfaceRequest.TransformationInfoListener() { // from class: Cn1
                @Override // androidx.camera.core.SurfaceRequest.TransformationInfoListener
                public final void onTransformationInfoUpdate(SurfaceRequest.TransformationInfo transformationInfo) {
                    PreviewView.C2686a.this.m61870e(camera, surfaceRequest, transformationInfo);
                }
            });
            PreviewView previewView = PreviewView.this;
            if (!PreviewView.m61879e(previewView.f12160b, surfaceRequest, previewView.f12159a)) {
                PreviewView previewView2 = PreviewView.this;
                if (PreviewView.m61878f(surfaceRequest, previewView2.f12159a)) {
                    PreviewView previewView3 = PreviewView.this;
                    c2701d = new C2704e(previewView3, previewView3.f12161c);
                } else {
                    PreviewView previewView4 = PreviewView.this;
                    c2701d = new C2701d(previewView4, previewView4.f12161c);
                }
                previewView2.f12160b = c2701d;
            }
            CameraInfoInternal cameraInfoInternal = camera.getCameraInfoInternal();
            PreviewView previewView5 = PreviewView.this;
            final C2694a c2694a = new C2694a(cameraInfoInternal, previewView5.f12163e, previewView5.f12160b);
            PreviewView.this.f12164f.set(c2694a);
            camera.getCameraState().addObserver(ContextCompat.getMainExecutor(PreviewView.this.getContext()), c2694a);
            PreviewView.this.f12160b.mo61809g(surfaceRequest, new AbstractC2699c.InterfaceC2700a() { // from class: Dn1
                @Override // androidx.camera.view.AbstractC2699c.InterfaceC2700a
                /* renamed from: a */
                public final void mo61828a() {
                    PreviewView.C2686a.this.m61869f(c2694a, camera);
                }
            });
            PreviewView previewView6 = PreviewView.this;
            OnFrameUpdateListener onFrameUpdateListener = previewView6.f12166h;
            if (onFrameUpdateListener != null && (executor = previewView6.f12167i) != null) {
                previewView6.f12160b.mo61808i(executor, onFrameUpdateListener);
            }
        }
    }

    /* renamed from: androidx.camera.view.PreviewView$b */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C2687b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f12176a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f12177b;

        static {
            int[] iArr = new int[ImplementationMode.values().length];
            f12177b = iArr;
            try {
                iArr[ImplementationMode.COMPATIBLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f12177b[ImplementationMode.PERFORMANCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[ScaleType.values().length];
            f12176a = iArr2;
            try {
                iArr2[ScaleType.FILL_END.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f12176a[ScaleType.FILL_CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f12176a[ScaleType.FILL_START.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f12176a[ScaleType.FIT_END.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f12176a[ScaleType.FIT_CENTER.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f12176a[ScaleType.FIT_START.ordinal()] = 6;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* renamed from: androidx.camera.view.PreviewView$c */
    /* loaded from: classes.dex */
    public class C2688c implements DisplayManager.DisplayListener {
        public C2688c() {
            PreviewView.this = r1;
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayAdded(int i) {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayChanged(int i) {
            Display display = PreviewView.this.getDisplay();
            if (display != null && display.getDisplayId() == i) {
                PreviewView.this.m61880d();
            }
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayRemoved(int i) {
        }
    }

    /* renamed from: androidx.camera.view.PreviewView$d */
    /* loaded from: classes.dex */
    public class C2689d extends ScaleGestureDetector.SimpleOnScaleGestureListener {
        public C2689d() {
            PreviewView.this = r1;
        }

        @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
        public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            CameraController cameraController = PreviewView.this.f12165g;
            if (cameraController != null) {
                cameraController.m61895v(scaleGestureDetector.getScaleFactor());
                return true;
            }
            return true;
        }
    }

    @UiThread
    public PreviewView(@NonNull Context context) {
        this(context, null);
    }

    /* renamed from: e */
    public static boolean m61879e(AbstractC2699c abstractC2699c, SurfaceRequest surfaceRequest, ImplementationMode implementationMode) {
        if ((abstractC2699c instanceof C2701d) && !m61878f(surfaceRequest, implementationMode)) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public static boolean m61878f(SurfaceRequest surfaceRequest, ImplementationMode implementationMode) {
        boolean z;
        int i;
        boolean equals = surfaceRequest.getCamera().getCameraInfoInternal().getImplementationType().equals(CameraInfo.IMPLEMENTATION_TYPE_CAMERA2_LEGACY);
        if (DeviceQuirks.get(SurfaceViewStretchedQuirk.class) == null && DeviceQuirks.get(SurfaceViewNotCroppedByParentQuirk.class) == null) {
            z = false;
        } else {
            z = true;
        }
        if (Build.VERSION.SDK_INT <= 24 || equals || z || (i = C2687b.f12177b[implementationMode.ordinal()]) == 1) {
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
        switch (C2687b.f12176a[getScaleType().ordinal()]) {
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
    public final void m61882b(boolean z) {
        Threads.checkMainThread();
        ViewPort viewPort = getViewPort();
        if (this.f12165g != null && viewPort != null && isAttachedToWindow()) {
            try {
                this.f12165g.m61912e(getSurfaceProvider(), viewPort);
            } catch (IllegalStateException e) {
                if (z) {
                    Logger.m63227e("PreviewView", e.toString(), e);
                    return;
                }
                throw e;
            }
        }
    }

    /* renamed from: c */
    public final /* synthetic */ void m61881c(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (i3 - i != i7 - i5 || i4 - i2 != i8 - i6) {
            m61880d();
            m61882b(true);
        }
    }

    /* renamed from: d */
    public void m61880d() {
        Threads.checkMainThread();
        if (this.f12160b != null) {
            m61875i();
            this.f12160b.m61829h();
        }
        this.f12168j.m68458a(new Size(getWidth(), getHeight()), getLayoutDirection());
        CameraController cameraController = this.f12165g;
        if (cameraController != null) {
            cameraController.m61918O(getSensorToViewTransform());
        }
    }

    /* renamed from: g */
    public final void m61877g() {
        DisplayManager displayManager = getDisplayManager();
        if (displayManager == null) {
            return;
        }
        displayManager.registerDisplayListener(this.f12172n, new Handler(Looper.getMainLooper()));
    }

    @Nullable
    @UiThread
    public Bitmap getBitmap() {
        Threads.checkMainThread();
        AbstractC2699c abstractC2699c = this.f12160b;
        if (abstractC2699c == null) {
            return null;
        }
        return abstractC2699c.m61831a();
    }

    @Nullable
    @UiThread
    public CameraController getController() {
        Threads.checkMainThread();
        return this.f12165g;
    }

    @NonNull
    @UiThread
    public ImplementationMode getImplementationMode() {
        Threads.checkMainThread();
        return this.f12159a;
    }

    @NonNull
    @UiThread
    public MeteringPointFactory getMeteringPointFactory() {
        Threads.checkMainThread();
        return this.f12168j;
    }

    @Nullable
    @TransformExperimental
    public OutputTransform getOutputTransform() {
        Matrix matrix;
        Threads.checkMainThread();
        try {
            matrix = this.f12161c.m61841j(new Size(getWidth(), getHeight()), getLayoutDirection());
        } catch (IllegalStateException unused) {
            matrix = null;
        }
        Rect m61842i = this.f12161c.m61842i();
        if (matrix != null && m61842i != null) {
            matrix.preConcat(TransformUtils.getNormalizedToBuffer(m61842i));
            if (this.f12160b instanceof C2704e) {
                matrix.postConcat(getMatrix());
            } else if (!getMatrix().isIdentity()) {
                Logger.m63223w("PreviewView", "PreviewView needs to be in COMPATIBLE mode for the transform to work correctly.");
            }
            return new OutputTransform(matrix, new Size(m61842i.width(), m61842i.height()));
        }
        Logger.m63230d("PreviewView", "Transform info is not ready");
        return null;
    }

    @NonNull
    public LiveData<StreamState> getPreviewStreamState() {
        return this.f12163e;
    }

    @NonNull
    @UiThread
    public ScaleType getScaleType() {
        Threads.checkMainThread();
        return this.f12161c.m61844g();
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public Matrix getSensorToViewTransform() {
        Threads.checkMainThread();
        return this.f12161c.m61843h(new Size(getWidth(), getHeight()), getLayoutDirection());
    }

    @NonNull
    @UiThread
    public Preview.SurfaceProvider getSurfaceProvider() {
        Threads.checkMainThread();
        return this.f12174p;
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
    public final void m61876h() {
        DisplayManager displayManager = getDisplayManager();
        if (displayManager == null) {
            return;
        }
        displayManager.unregisterDisplayListener(this.f12172n);
    }

    /* renamed from: i */
    public void m61875i() {
        Display display;
        CameraInfoInternal cameraInfoInternal;
        if (this.f12162d && (display = getDisplay()) != null && (cameraInfoInternal = this.f12170l) != null) {
            this.f12161c.m61836o(cameraInfoInternal.getSensorRotationDegrees(display.getRotation()), display.getRotation());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m61877g();
        addOnLayoutChangeListener(this.f12173o);
        AbstractC2699c abstractC2699c = this.f12160b;
        if (abstractC2699c != null) {
            abstractC2699c.mo61811d();
        }
        m61882b(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeOnLayoutChangeListener(this.f12173o);
        AbstractC2699c abstractC2699c = this.f12160b;
        if (abstractC2699c != null) {
            abstractC2699c.mo61810e();
        }
        CameraController cameraController = this.f12165g;
        if (cameraController != null) {
            cameraController.m61910g();
        }
        m61876h();
    }

    @Override // android.view.View
    public boolean onTouchEvent(@NonNull MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        boolean z3;
        if (this.f12165g == null) {
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
            this.f12171m = motionEvent;
            performClick();
            return true;
        } else if (!this.f12169k.onTouchEvent(motionEvent) && !super.onTouchEvent(motionEvent)) {
            return false;
        } else {
            return true;
        }
    }

    @Override // android.view.View
    public boolean performClick() {
        float width;
        float height;
        if (this.f12165g != null) {
            MotionEvent motionEvent = this.f12171m;
            if (motionEvent != null) {
                width = motionEvent.getX();
            } else {
                width = getWidth() / 2.0f;
            }
            MotionEvent motionEvent2 = this.f12171m;
            if (motionEvent2 != null) {
                height = motionEvent2.getY();
            } else {
                height = getHeight() / 2.0f;
            }
            this.f12165g.m61894w(this.f12168j, width, height);
        }
        this.f12171m = null;
        return super.performClick();
    }

    @UiThread
    public void setController(@Nullable CameraController cameraController) {
        Threads.checkMainThread();
        CameraController cameraController2 = this.f12165g;
        if (cameraController2 != null && cameraController2 != cameraController) {
            cameraController2.m61910g();
        }
        this.f12165g = cameraController;
        m61882b(false);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setFrameUpdateListener(@NonNull Executor executor, @NonNull OnFrameUpdateListener onFrameUpdateListener) {
        if (this.f12159a != ImplementationMode.PERFORMANCE) {
            this.f12166h = onFrameUpdateListener;
            this.f12167i = executor;
            AbstractC2699c abstractC2699c = this.f12160b;
            if (abstractC2699c != null) {
                abstractC2699c.mo61808i(executor, onFrameUpdateListener);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("PERFORMANCE mode doesn't support frame update listener");
    }

    @UiThread
    public void setImplementationMode(@NonNull ImplementationMode implementationMode) {
        Threads.checkMainThread();
        this.f12159a = implementationMode;
        if (implementationMode == ImplementationMode.PERFORMANCE && this.f12166h != null) {
            throw new IllegalArgumentException("PERFORMANCE mode doesn't support frame update listener");
        }
    }

    @UiThread
    public void setScaleType(@NonNull ScaleType scaleType) {
        Threads.checkMainThread();
        this.f12161c.m61834q(scaleType);
        m61880d();
        m61882b(false);
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
        ImplementationMode implementationMode = f12158q;
        this.f12159a = implementationMode;
        C2697b c2697b = new C2697b();
        this.f12161c = c2697b;
        this.f12162d = true;
        this.f12163e = new MutableLiveData(StreamState.IDLE);
        this.f12164f = new AtomicReference();
        this.f12168j = new C17556En1(c2697b);
        this.f12172n = new C2688c();
        this.f12173o = new View.OnLayoutChangeListener() { // from class: zn1
            {
                PreviewView.this = this;
            }

            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
                PreviewView.this.m61881c(view, i3, i4, i5, i6, i7, i8, i9, i10);
            }
        };
        this.f12174p = new C2686a();
        Threads.checkMainThread();
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R.styleable.PreviewView, i, i2);
        ViewCompat.saveAttributeDataForStyleable(this, context, R.styleable.PreviewView, attributeSet, obtainStyledAttributes, i, i2);
        try {
            setScaleType(ScaleType.fromId(obtainStyledAttributes.getInteger(R.styleable.PreviewView_scaleType, c2697b.m61844g().getId())));
            setImplementationMode(ImplementationMode.fromId(obtainStyledAttributes.getInteger(R.styleable.PreviewView_implementationMode, implementationMode.getId())));
            obtainStyledAttributes.recycle();
            this.f12169k = new ScaleGestureDetector(context, new C2689d());
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
