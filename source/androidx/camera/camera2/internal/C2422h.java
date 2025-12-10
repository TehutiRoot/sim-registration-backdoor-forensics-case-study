package androidx.camera.camera2.internal;

import android.graphics.PointF;
import android.graphics.Rect;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.MeteringRectangle;
import android.os.Build;
import android.util.Rational;
import androidx.camera.camera2.impl.Camera2ImplConfig;
import androidx.camera.camera2.internal.C2422h;
import androidx.camera.camera2.internal.Camera2CameraControlImpl;
import androidx.camera.camera2.internal.compat.workaround.MeteringRegionCorrection;
import androidx.camera.core.CameraControl;
import androidx.camera.core.FocusMeteringAction;
import androidx.camera.core.FocusMeteringResult;
import androidx.camera.core.MeteringPoint;
import androidx.camera.core.impl.CameraCaptureCallback;
import androidx.camera.core.impl.CameraCaptureFailure;
import androidx.camera.core.impl.CameraCaptureResult;
import androidx.camera.core.impl.CameraControlInternal;
import androidx.camera.core.impl.CaptureConfig;
import androidx.camera.core.impl.Quirks;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.lifecycle.CoroutineLiveDataKt;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: androidx.camera.camera2.internal.h */
/* loaded from: classes.dex */
public class C2422h {

    /* renamed from: v */
    public static final MeteringRectangle[] f10633v = new MeteringRectangle[0];

    /* renamed from: a */
    public final Camera2CameraControlImpl f10634a;

    /* renamed from: b */
    public final Executor f10635b;

    /* renamed from: c */
    public final ScheduledExecutorService f10636c;

    /* renamed from: f */
    public final MeteringRegionCorrection f10639f;

    /* renamed from: i */
    public ScheduledFuture f10642i;

    /* renamed from: j */
    public ScheduledFuture f10643j;

    /* renamed from: q */
    public MeteringRectangle[] f10650q;

    /* renamed from: r */
    public MeteringRectangle[] f10651r;

    /* renamed from: s */
    public MeteringRectangle[] f10652s;

    /* renamed from: t */
    public CallbackToFutureAdapter.Completer f10653t;

    /* renamed from: u */
    public CallbackToFutureAdapter.Completer f10654u;

    /* renamed from: d */
    public volatile boolean f10637d = false;

    /* renamed from: e */
    public volatile Rational f10638e = null;

    /* renamed from: g */
    public boolean f10640g = false;

    /* renamed from: h */
    public Integer f10641h = 0;

    /* renamed from: k */
    public long f10644k = 0;

    /* renamed from: l */
    public boolean f10645l = false;

    /* renamed from: m */
    public boolean f10646m = false;

    /* renamed from: n */
    public int f10647n = 1;

    /* renamed from: o */
    public Camera2CameraControlImpl.CaptureResultListener f10648o = null;

    /* renamed from: p */
    public Camera2CameraControlImpl.CaptureResultListener f10649p = null;

    /* renamed from: androidx.camera.camera2.internal.h$a */
    /* loaded from: classes.dex */
    public class C2423a extends CameraCaptureCallback {

        /* renamed from: a */
        public final /* synthetic */ CallbackToFutureAdapter.Completer f10655a;

        public C2423a(CallbackToFutureAdapter.Completer completer) {
            C2422h.this = r1;
            this.f10655a = completer;
        }

        @Override // androidx.camera.core.impl.CameraCaptureCallback
        public void onCaptureCancelled() {
            CallbackToFutureAdapter.Completer completer = this.f10655a;
            if (completer != null) {
                completer.setException(new CameraControl.OperationCanceledException("Camera is closed"));
            }
        }

        @Override // androidx.camera.core.impl.CameraCaptureCallback
        public void onCaptureCompleted(CameraCaptureResult cameraCaptureResult) {
            CallbackToFutureAdapter.Completer completer = this.f10655a;
            if (completer != null) {
                completer.set(cameraCaptureResult);
            }
        }

        @Override // androidx.camera.core.impl.CameraCaptureCallback
        public void onCaptureFailed(CameraCaptureFailure cameraCaptureFailure) {
            CallbackToFutureAdapter.Completer completer = this.f10655a;
            if (completer != null) {
                completer.setException(new CameraControlInternal.CameraControlException(cameraCaptureFailure));
            }
        }
    }

    /* renamed from: androidx.camera.camera2.internal.h$b */
    /* loaded from: classes.dex */
    public class C2424b extends CameraCaptureCallback {

        /* renamed from: a */
        public final /* synthetic */ CallbackToFutureAdapter.Completer f10657a;

        public C2424b(CallbackToFutureAdapter.Completer completer) {
            C2422h.this = r1;
            this.f10657a = completer;
        }

        @Override // androidx.camera.core.impl.CameraCaptureCallback
        public void onCaptureCancelled() {
            CallbackToFutureAdapter.Completer completer = this.f10657a;
            if (completer != null) {
                completer.setException(new CameraControl.OperationCanceledException("Camera is closed"));
            }
        }

        @Override // androidx.camera.core.impl.CameraCaptureCallback
        public void onCaptureCompleted(CameraCaptureResult cameraCaptureResult) {
            CallbackToFutureAdapter.Completer completer = this.f10657a;
            if (completer != null) {
                completer.set(null);
            }
        }

        @Override // androidx.camera.core.impl.CameraCaptureCallback
        public void onCaptureFailed(CameraCaptureFailure cameraCaptureFailure) {
            CallbackToFutureAdapter.Completer completer = this.f10657a;
            if (completer != null) {
                completer.setException(new CameraControlInternal.CameraControlException(cameraCaptureFailure));
            }
        }
    }

    public C2422h(Camera2CameraControlImpl camera2CameraControlImpl, ScheduledExecutorService scheduledExecutorService, Executor executor, Quirks quirks) {
        MeteringRectangle[] meteringRectangleArr = f10633v;
        this.f10650q = meteringRectangleArr;
        this.f10651r = meteringRectangleArr;
        this.f10652s = meteringRectangleArr;
        this.f10653t = null;
        this.f10654u = null;
        this.f10634a = camera2CameraControlImpl;
        this.f10635b = executor;
        this.f10636c = scheduledExecutorService;
        this.f10639f = new MeteringRegionCorrection(quirks);
    }

    /* renamed from: D */
    public static boolean m63492D(MeteringPoint meteringPoint) {
        if (meteringPoint.getX() >= 0.0f && meteringPoint.getX() <= 1.0f && meteringPoint.getY() >= 0.0f && meteringPoint.getY() <= 1.0f) {
            return true;
        }
        return false;
    }

    /* renamed from: O */
    public static int m63481O(int i, int i2, int i3) {
        return Math.min(Math.max(i, i3), i2);
    }

    /* renamed from: b */
    public static /* synthetic */ Object m63470b(C2422h c2422h, FocusMeteringAction focusMeteringAction, long j, CallbackToFutureAdapter.Completer completer) {
        return c2422h.m63482N(focusMeteringAction, j, completer);
    }

    /* renamed from: d */
    public static /* synthetic */ void m63468d(C2422h c2422h, long j) {
        c2422h.m63486J(j);
    }

    /* renamed from: e */
    public static /* synthetic */ void m63467e(C2422h c2422h, long j) {
        c2422h.m63485K(j);
    }

    /* renamed from: f */
    public static /* synthetic */ void m63466f(C2422h c2422h, CallbackToFutureAdapter.Completer completer) {
        c2422h.m63491E(completer);
    }

    /* renamed from: g */
    public static /* synthetic */ void m63465g(C2422h c2422h, long j) {
        c2422h.m63487I(j);
    }

    /* renamed from: h */
    public static /* synthetic */ Object m63464h(C2422h c2422h, CallbackToFutureAdapter.Completer completer) {
        return c2422h.m63490F(completer);
    }

    /* renamed from: i */
    public static /* synthetic */ void m63463i(C2422h c2422h, long j) {
        c2422h.m63484L(j);
    }

    /* renamed from: j */
    public static /* synthetic */ void m63462j(C2422h c2422h, CallbackToFutureAdapter.Completer completer, FocusMeteringAction focusMeteringAction, long j) {
        c2422h.m63483M(completer, focusMeteringAction, j);
    }

    /* renamed from: y */
    public static PointF m63447y(MeteringPoint meteringPoint, Rational rational, Rational rational2, int i, MeteringRegionCorrection meteringRegionCorrection) {
        if (meteringPoint.getSurfaceAspectRatio() != null) {
            rational2 = meteringPoint.getSurfaceAspectRatio();
        }
        PointF correctedPoint = meteringRegionCorrection.getCorrectedPoint(meteringPoint, i);
        if (!rational2.equals(rational)) {
            if (rational2.compareTo(rational) > 0) {
                float doubleValue = (float) (rational2.doubleValue() / rational.doubleValue());
                correctedPoint.y = (((float) ((doubleValue - 1.0d) / 2.0d)) + correctedPoint.y) * (1.0f / doubleValue);
            } else {
                float doubleValue2 = (float) (rational.doubleValue() / rational2.doubleValue());
                correctedPoint.x = (((float) ((doubleValue2 - 1.0d) / 2.0d)) + correctedPoint.x) * (1.0f / doubleValue2);
            }
        }
        return correctedPoint;
    }

    /* renamed from: z */
    public static MeteringRectangle m63446z(MeteringPoint meteringPoint, PointF pointF, Rect rect) {
        int width = (int) (rect.left + (pointF.x * rect.width()));
        int height = (int) (rect.top + (pointF.y * rect.height()));
        int size = ((int) (meteringPoint.getSize() * rect.width())) / 2;
        int size2 = ((int) (meteringPoint.getSize() * rect.height())) / 2;
        Rect rect2 = new Rect(width - size, height - size2, width + size, height + size2);
        rect2.left = m63481O(rect2.left, rect.right, rect.left);
        rect2.right = m63481O(rect2.right, rect.right, rect.left);
        rect2.top = m63481O(rect2.top, rect.bottom, rect.top);
        rect2.bottom = m63481O(rect2.bottom, rect.bottom, rect.top);
        return new MeteringRectangle(rect2, 1000);
    }

    /* renamed from: A */
    public final List m63495A(List list, int i, Rational rational, Rect rect, int i2) {
        if (!list.isEmpty() && i != 0) {
            ArrayList arrayList = new ArrayList();
            Rational rational2 = new Rational(rect.width(), rect.height());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                MeteringPoint meteringPoint = (MeteringPoint) it.next();
                if (arrayList.size() == i) {
                    break;
                } else if (m63492D(meteringPoint)) {
                    MeteringRectangle m63446z = m63446z(meteringPoint, m63447y(meteringPoint, rational2, rational, i2, this.f10639f), rect);
                    if (m63446z.getWidth() != 0 && m63446z.getHeight() != 0) {
                        arrayList.add(m63446z);
                    }
                }
            }
            return Collections.unmodifiableList(arrayList);
        }
        return Collections.emptyList();
    }

    /* renamed from: B */
    public final boolean m63494B() {
        if (this.f10634a.m63935u(1) == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: C */
    public boolean m63493C(FocusMeteringAction focusMeteringAction) {
        Rect m63941o = this.f10634a.m63941o();
        Rational m63448x = m63448x();
        List m63495A = m63495A(focusMeteringAction.getMeteringPointsAf(), this.f10634a.m63939q(), m63448x, m63941o, 1);
        List m63495A2 = m63495A(focusMeteringAction.getMeteringPointsAe(), this.f10634a.m63940p(), m63448x, m63941o, 2);
        List m63495A3 = m63495A(focusMeteringAction.getMeteringPointsAwb(), this.f10634a.m63938r(), m63448x, m63941o, 4);
        if (m63495A.isEmpty() && m63495A2.isEmpty() && m63495A3.isEmpty()) {
            return false;
        }
        return true;
    }

    /* renamed from: F */
    public final /* synthetic */ Object m63490F(final CallbackToFutureAdapter.Completer completer) {
        this.f10635b.execute(new Runnable() { // from class: G30
            {
                C2422h.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C2422h.m63466f(C2422h.this, completer);
            }
        });
        return "cancelFocusAndMetering";
    }

    /* renamed from: G */
    public final /* synthetic */ boolean m63489G(int i, long j, TotalCaptureResult totalCaptureResult) {
        if (((Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_MODE)).intValue() == i && Camera2CameraControlImpl.m63976A(totalCaptureResult, j)) {
            m63454r();
            return true;
        }
        return false;
    }

    /* renamed from: H */
    public final /* synthetic */ boolean m63488H(boolean z, long j, TotalCaptureResult totalCaptureResult) {
        Integer num = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_STATE);
        if (m63477S()) {
            if (z && num != null) {
                if (this.f10641h.intValue() == 3) {
                    if (num.intValue() == 4) {
                        this.f10646m = true;
                        this.f10645l = true;
                    } else if (num.intValue() == 5) {
                        this.f10646m = false;
                        this.f10645l = true;
                    }
                }
            } else {
                this.f10646m = true;
                this.f10645l = true;
            }
        }
        if (this.f10645l && Camera2CameraControlImpl.m63976A(totalCaptureResult, j)) {
            m63455q(this.f10646m);
            return true;
        }
        if (!this.f10641h.equals(num) && num != null) {
            this.f10641h = num;
        }
        return false;
    }

    /* renamed from: I */
    public final /* synthetic */ void m63487I(long j) {
        if (j == this.f10644k) {
            this.f10646m = false;
            m63455q(false);
        }
    }

    /* renamed from: J */
    public final /* synthetic */ void m63486J(final long j) {
        this.f10635b.execute(new Runnable() { // from class: L30
            {
                C2422h.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C2422h.m63465g(C2422h.this, j);
            }
        });
    }

    /* renamed from: K */
    public final /* synthetic */ void m63485K(long j) {
        if (j == this.f10644k) {
            m63457o();
        }
    }

    /* renamed from: L */
    public final /* synthetic */ void m63484L(final long j) {
        this.f10635b.execute(new Runnable() { // from class: K30
            {
                C2422h.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C2422h.m63467e(C2422h.this, j);
            }
        });
    }

    /* renamed from: N */
    public final /* synthetic */ Object m63482N(final FocusMeteringAction focusMeteringAction, final long j, final CallbackToFutureAdapter.Completer completer) {
        this.f10635b.execute(new Runnable() { // from class: F30
            @Override // java.lang.Runnable
            public final void run() {
                C2422h.m63462j(C2422h.this, completer, focusMeteringAction, j);
            }
        });
        return "startFocusAndMetering";
    }

    /* renamed from: P */
    public void m63480P(boolean z) {
        if (z == this.f10637d) {
            return;
        }
        this.f10637d = z;
        if (!this.f10637d) {
            m63457o();
        }
    }

    /* renamed from: Q */
    public void m63479Q(Rational rational) {
        this.f10638e = rational;
    }

    /* renamed from: R */
    public void m63478R(int i) {
        this.f10647n = i;
    }

    /* renamed from: S */
    public final boolean m63477S() {
        if (this.f10650q.length > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: T */
    public ListenableFuture m63476T(FocusMeteringAction focusMeteringAction) {
        return m63475U(focusMeteringAction, CoroutineLiveDataKt.DEFAULT_TIMEOUT);
    }

    /* renamed from: U */
    public ListenableFuture m63475U(final FocusMeteringAction focusMeteringAction, final long j) {
        return CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: C30
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                return C2422h.m63470b(C2422h.this, focusMeteringAction, j, completer);
            }
        });
    }

    /* renamed from: V */
    public void m63483M(CallbackToFutureAdapter.Completer completer, FocusMeteringAction focusMeteringAction, long j) {
        if (!this.f10637d) {
            completer.setException(new CameraControl.OperationCanceledException("Camera is not active."));
            return;
        }
        Rect m63941o = this.f10634a.m63941o();
        Rational m63448x = m63448x();
        List m63495A = m63495A(focusMeteringAction.getMeteringPointsAf(), this.f10634a.m63939q(), m63448x, m63941o, 1);
        List m63495A2 = m63495A(focusMeteringAction.getMeteringPointsAe(), this.f10634a.m63940p(), m63448x, m63941o, 2);
        List m63495A3 = m63495A(focusMeteringAction.getMeteringPointsAwb(), this.f10634a.m63938r(), m63448x, m63941o, 4);
        if (m63495A.isEmpty() && m63495A2.isEmpty() && m63495A3.isEmpty()) {
            completer.setException(new IllegalArgumentException("None of the specified AF/AE/AWB MeteringPoints is supported on this camera."));
            return;
        }
        m63451u("Cancelled by another startFocusAndMetering()");
        m63450v("Cancelled by another startFocusAndMetering()");
        m63453s();
        this.f10653t = completer;
        MeteringRectangle[] meteringRectangleArr = f10633v;
        m63452t((MeteringRectangle[]) m63495A.toArray(meteringRectangleArr), (MeteringRectangle[]) m63495A2.toArray(meteringRectangleArr), (MeteringRectangle[]) m63495A3.toArray(meteringRectangleArr), focusMeteringAction, j);
    }

    /* renamed from: W */
    public void m63473W(CallbackToFutureAdapter.Completer completer) {
        if (!this.f10637d) {
            if (completer != null) {
                completer.setException(new CameraControl.OperationCanceledException("Camera is not active."));
                return;
            }
            return;
        }
        CaptureConfig.Builder builder = new CaptureConfig.Builder();
        builder.setTemplateType(this.f10647n);
        builder.setUseRepeatingSurface(true);
        Camera2ImplConfig.Builder builder2 = new Camera2ImplConfig.Builder();
        builder2.setCaptureRequestOption(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 1);
        builder.addImplementationOptions(builder2.build());
        builder.addCameraCaptureCallback(new C2424b(completer));
        this.f10634a.m63959R(Collections.singletonList(builder.build()));
    }

    /* renamed from: X */
    public void m63472X(CallbackToFutureAdapter.Completer completer, boolean z) {
        if (!this.f10637d) {
            if (completer != null) {
                completer.setException(new CameraControl.OperationCanceledException("Camera is not active."));
                return;
            }
            return;
        }
        CaptureConfig.Builder builder = new CaptureConfig.Builder();
        builder.setTemplateType(this.f10647n);
        builder.setUseRepeatingSurface(true);
        Camera2ImplConfig.Builder builder2 = new Camera2ImplConfig.Builder();
        builder2.setCaptureRequestOption(CaptureRequest.CONTROL_AF_TRIGGER, 1);
        if (z) {
            builder2.setCaptureRequestOption(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(this.f10634a.m63936t(1)));
        }
        builder.addImplementationOptions(builder2.build());
        builder.addCameraCaptureCallback(new C2423a(completer));
        this.f10634a.m63959R(Collections.singletonList(builder.build()));
    }

    /* renamed from: k */
    public void m63461k(Camera2ImplConfig.Builder builder) {
        int m63449w;
        if (this.f10640g) {
            m63449w = 1;
        } else {
            m63449w = m63449w();
        }
        builder.setCaptureRequestOption(CaptureRequest.CONTROL_AF_MODE, Integer.valueOf(this.f10634a.m63935u(m63449w)));
        MeteringRectangle[] meteringRectangleArr = this.f10650q;
        if (meteringRectangleArr.length != 0) {
            builder.setCaptureRequestOption(CaptureRequest.CONTROL_AF_REGIONS, meteringRectangleArr);
        }
        MeteringRectangle[] meteringRectangleArr2 = this.f10651r;
        if (meteringRectangleArr2.length != 0) {
            builder.setCaptureRequestOption(CaptureRequest.CONTROL_AE_REGIONS, meteringRectangleArr2);
        }
        MeteringRectangle[] meteringRectangleArr3 = this.f10652s;
        if (meteringRectangleArr3.length != 0) {
            builder.setCaptureRequestOption(CaptureRequest.CONTROL_AWB_REGIONS, meteringRectangleArr3);
        }
    }

    /* renamed from: l */
    public void m63460l(boolean z, boolean z2) {
        if (!this.f10637d) {
            return;
        }
        CaptureConfig.Builder builder = new CaptureConfig.Builder();
        builder.setUseRepeatingSurface(true);
        builder.setTemplateType(this.f10647n);
        Camera2ImplConfig.Builder builder2 = new Camera2ImplConfig.Builder();
        if (z) {
            builder2.setCaptureRequestOption(CaptureRequest.CONTROL_AF_TRIGGER, 2);
        }
        if (Build.VERSION.SDK_INT >= 23 && z2) {
            builder2.setCaptureRequestOption(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 2);
        }
        builder.addImplementationOptions(builder2.build());
        this.f10634a.m63959R(Collections.singletonList(builder.build()));
    }

    /* renamed from: m */
    public ListenableFuture m63459m() {
        return CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: E30
            {
                C2422h.this = this;
            }

            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                return C2422h.m63464h(C2422h.this, completer);
            }
        });
    }

    /* renamed from: n */
    public void m63491E(CallbackToFutureAdapter.Completer completer) {
        m63450v("Cancelled by another cancelFocusAndMetering()");
        m63451u("Cancelled by cancelFocusAndMetering()");
        this.f10654u = completer;
        m63453s();
        m63456p();
        if (m63477S()) {
            m63460l(true, false);
        }
        MeteringRectangle[] meteringRectangleArr = f10633v;
        this.f10650q = meteringRectangleArr;
        this.f10651r = meteringRectangleArr;
        this.f10652s = meteringRectangleArr;
        this.f10640g = false;
        final long m63957T = this.f10634a.m63957T();
        if (this.f10654u != null) {
            final int m63935u = this.f10634a.m63935u(m63449w());
            Camera2CameraControlImpl.CaptureResultListener captureResultListener = new Camera2CameraControlImpl.CaptureResultListener() { // from class: D30
                @Override // androidx.camera.camera2.internal.Camera2CameraControlImpl.CaptureResultListener
                public final boolean onCaptureResult(TotalCaptureResult totalCaptureResult) {
                    boolean m63489G;
                    m63489G = C2422h.this.m63489G(m63935u, m63957T, totalCaptureResult);
                    return m63489G;
                }
            };
            this.f10649p = captureResultListener;
            this.f10634a.m63945k(captureResultListener);
        }
    }

    /* renamed from: o */
    public void m63457o() {
        m63491E(null);
    }

    /* renamed from: p */
    public final void m63456p() {
        ScheduledFuture scheduledFuture = this.f10643j;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
            this.f10643j = null;
        }
    }

    /* renamed from: q */
    public void m63455q(boolean z) {
        m63456p();
        CallbackToFutureAdapter.Completer completer = this.f10653t;
        if (completer != null) {
            completer.set(FocusMeteringResult.create(z));
            this.f10653t = null;
        }
    }

    /* renamed from: r */
    public final void m63454r() {
        CallbackToFutureAdapter.Completer completer = this.f10654u;
        if (completer != null) {
            completer.set(null);
            this.f10654u = null;
        }
    }

    /* renamed from: s */
    public final void m63453s() {
        ScheduledFuture scheduledFuture = this.f10642i;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
            this.f10642i = null;
        }
    }

    /* renamed from: t */
    public final void m63452t(MeteringRectangle[] meteringRectangleArr, MeteringRectangle[] meteringRectangleArr2, MeteringRectangle[] meteringRectangleArr3, FocusMeteringAction focusMeteringAction, long j) {
        final long m63957T;
        this.f10634a.m63964M(this.f10648o);
        m63453s();
        m63456p();
        this.f10650q = meteringRectangleArr;
        this.f10651r = meteringRectangleArr2;
        this.f10652s = meteringRectangleArr3;
        if (m63477S()) {
            this.f10640g = true;
            this.f10645l = false;
            this.f10646m = false;
            m63957T = this.f10634a.m63957T();
            m63472X(null, true);
        } else {
            this.f10640g = false;
            this.f10645l = true;
            this.f10646m = false;
            m63957T = this.f10634a.m63957T();
        }
        this.f10641h = 0;
        final boolean m63494B = m63494B();
        Camera2CameraControlImpl.CaptureResultListener captureResultListener = new Camera2CameraControlImpl.CaptureResultListener() { // from class: H30
            @Override // androidx.camera.camera2.internal.Camera2CameraControlImpl.CaptureResultListener
            public final boolean onCaptureResult(TotalCaptureResult totalCaptureResult) {
                boolean m63488H;
                m63488H = C2422h.this.m63488H(m63494B, m63957T, totalCaptureResult);
                return m63488H;
            }
        };
        this.f10648o = captureResultListener;
        this.f10634a.m63945k(captureResultListener);
        final long j2 = this.f10644k + 1;
        this.f10644k = j2;
        Runnable runnable = new Runnable() { // from class: I30
            {
                C2422h.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C2422h.m63468d(C2422h.this, j2);
            }
        };
        ScheduledExecutorService scheduledExecutorService = this.f10636c;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.f10643j = scheduledExecutorService.schedule(runnable, j, timeUnit);
        if (focusMeteringAction.isAutoCancelEnabled()) {
            this.f10642i = this.f10636c.schedule(new Runnable() { // from class: J30
                {
                    C2422h.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C2422h.m63463i(C2422h.this, j2);
                }
            }, focusMeteringAction.getAutoCancelDurationInMillis(), timeUnit);
        }
    }

    /* renamed from: u */
    public final void m63451u(String str) {
        this.f10634a.m63964M(this.f10648o);
        CallbackToFutureAdapter.Completer completer = this.f10653t;
        if (completer != null) {
            completer.setException(new CameraControl.OperationCanceledException(str));
            this.f10653t = null;
        }
    }

    /* renamed from: v */
    public final void m63450v(String str) {
        this.f10634a.m63964M(this.f10649p);
        CallbackToFutureAdapter.Completer completer = this.f10654u;
        if (completer != null) {
            completer.setException(new CameraControl.OperationCanceledException(str));
            this.f10654u = null;
        }
    }

    /* renamed from: w */
    public int m63449w() {
        if (this.f10647n == 3) {
            return 3;
        }
        return 4;
    }

    /* renamed from: x */
    public final Rational m63448x() {
        if (this.f10638e != null) {
            return this.f10638e;
        }
        Rect m63941o = this.f10634a.m63941o();
        return new Rational(m63941o.width(), m63941o.height());
    }
}
