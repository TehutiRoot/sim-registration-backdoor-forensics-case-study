package p000;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.Logger;
import androidx.camera.core.SurfaceOutput;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.utils.MatrixExt;
import androidx.camera.core.impl.utils.TransformUtils;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.core.util.Consumer;
import androidx.core.util.Preconditions;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: qQ1 */
/* loaded from: classes.dex */
public final class C21821qQ1 implements SurfaceOutput {

    /* renamed from: b */
    public final Surface f77192b;

    /* renamed from: c */
    public final int f77193c;

    /* renamed from: d */
    public final int f77194d;

    /* renamed from: e */
    public final Size f77195e;

    /* renamed from: f */
    public final Size f77196f;

    /* renamed from: g */
    public final Rect f77197g;

    /* renamed from: h */
    public final int f77198h;

    /* renamed from: i */
    public final boolean f77199i;

    /* renamed from: l */
    public Consumer f77202l;

    /* renamed from: m */
    public Executor f77203m;

    /* renamed from: p */
    public final ListenableFuture f77206p;

    /* renamed from: q */
    public CallbackToFutureAdapter.Completer f77207q;

    /* renamed from: r */
    public CameraInternal f77208r;

    /* renamed from: s */
    public Matrix f77209s;

    /* renamed from: a */
    public final Object f77191a = new Object();

    /* renamed from: j */
    public final float[] f77200j = new float[16];

    /* renamed from: k */
    public final float[] f77201k = new float[16];

    /* renamed from: n */
    public boolean f77204n = false;

    /* renamed from: o */
    public boolean f77205o = false;

    public C21821qQ1(Surface surface, int i, int i2, Size size, Size size2, Rect rect, int i3, boolean z, CameraInternal cameraInternal, Matrix matrix) {
        this.f77192b = surface;
        this.f77193c = i;
        this.f77194d = i2;
        this.f77195e = size;
        this.f77196f = size2;
        this.f77197g = new Rect(rect);
        this.f77199i = z;
        this.f77198h = i3;
        this.f77208r = cameraInternal;
        this.f77209s = matrix;
        m23642g();
        this.f77206p = CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: oQ1
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                return C21821qQ1.m23644b(C21821qQ1.this, completer);
            }
        });
    }

    /* renamed from: b */
    public static /* synthetic */ Object m23644b(C21821qQ1 c21821qQ1, CallbackToFutureAdapter.Completer completer) {
        return c21821qQ1.m23639k(completer);
    }

    /* renamed from: d */
    public static /* synthetic */ void m23643d(C21821qQ1 c21821qQ1, AtomicReference atomicReference) {
        c21821qQ1.m23638l(atomicReference);
    }

    @Override // androidx.camera.core.SurfaceOutput, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this.f77191a) {
            try {
                if (!this.f77205o) {
                    this.f77205o = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f77207q.set(null);
    }

    /* renamed from: g */
    public final void m23642g() {
        android.opengl.Matrix.setIdentityM(this.f77200j, 0);
        MatrixExt.preVerticalFlip(this.f77200j, 0.5f);
        MatrixExt.preRotate(this.f77200j, this.f77198h, 0.5f, 0.5f);
        if (this.f77199i) {
            android.opengl.Matrix.translateM(this.f77200j, 0, 1.0f, 0.0f, 0.0f);
            android.opengl.Matrix.scaleM(this.f77200j, 0, -1.0f, 1.0f, 1.0f);
        }
        Size rotateSize = TransformUtils.rotateSize(this.f77196f, this.f77198h);
        Matrix rectToRect = TransformUtils.getRectToRect(TransformUtils.sizeToRectF(this.f77196f), TransformUtils.sizeToRectF(rotateSize), this.f77198h, this.f77199i);
        RectF rectF = new RectF(this.f77197g);
        rectToRect.mapRect(rectF);
        float width = rectF.left / rotateSize.getWidth();
        float height = ((rotateSize.getHeight() - rectF.height()) - rectF.top) / rotateSize.getHeight();
        float height2 = rectF.height() / rotateSize.getHeight();
        android.opengl.Matrix.translateM(this.f77200j, 0, width, height, 0.0f);
        android.opengl.Matrix.scaleM(this.f77200j, 0, rectF.width() / rotateSize.getWidth(), height2, 1.0f);
        m23641i();
        float[] fArr = this.f77200j;
        android.opengl.Matrix.multiplyMM(fArr, 0, this.f77201k, 0, fArr, 0);
    }

    @Override // androidx.camera.core.SurfaceOutput
    public int getFormat() {
        return this.f77194d;
    }

    @Override // androidx.camera.core.SurfaceOutput
    public Matrix getSensorToBufferTransform() {
        return new Matrix(this.f77209s);
    }

    @Override // androidx.camera.core.SurfaceOutput
    public Size getSize() {
        return this.f77195e;
    }

    @Override // androidx.camera.core.SurfaceOutput
    public Surface getSurface(Executor executor, Consumer consumer) {
        boolean z;
        synchronized (this.f77191a) {
            this.f77203m = executor;
            this.f77202l = consumer;
            z = this.f77204n;
        }
        if (z) {
            m23637m();
        }
        return this.f77192b;
    }

    @Override // androidx.camera.core.SurfaceOutput
    public int getTargets() {
        return this.f77193c;
    }

    /* renamed from: i */
    public final void m23641i() {
        android.opengl.Matrix.setIdentityM(this.f77201k, 0);
        MatrixExt.preVerticalFlip(this.f77201k, 0.5f);
        CameraInternal cameraInternal = this.f77208r;
        if (cameraInternal != null) {
            Preconditions.checkState(cameraInternal.getHasTransform(), "Camera has no transform.");
            MatrixExt.preRotate(this.f77201k, this.f77208r.getCameraInfo().getSensorRotationDegrees(), 0.5f, 0.5f);
            if (this.f77208r.isFrontFacing()) {
                android.opengl.Matrix.translateM(this.f77201k, 0, 1.0f, 0.0f, 0.0f);
                android.opengl.Matrix.scaleM(this.f77201k, 0, -1.0f, 1.0f, 1.0f);
            }
        }
        float[] fArr = this.f77201k;
        android.opengl.Matrix.invertM(fArr, 0, fArr, 0);
    }

    /* renamed from: j */
    public ListenableFuture m23640j() {
        return this.f77206p;
    }

    /* renamed from: k */
    public final /* synthetic */ Object m23639k(CallbackToFutureAdapter.Completer completer) {
        this.f77207q = completer;
        return "SurfaceOutputImpl close future complete";
    }

    /* renamed from: l */
    public final /* synthetic */ void m23638l(AtomicReference atomicReference) {
        ((Consumer) atomicReference.get()).accept(SurfaceOutput.Event.m63136of(0, this));
    }

    /* renamed from: m */
    public void m23637m() {
        Executor executor;
        Consumer consumer;
        final AtomicReference atomicReference = new AtomicReference();
        synchronized (this.f77191a) {
            try {
                if (this.f77203m != null && (consumer = this.f77202l) != null) {
                    if (!this.f77205o) {
                        atomicReference.set(consumer);
                        executor = this.f77203m;
                        this.f77204n = false;
                    }
                    executor = null;
                }
                this.f77204n = true;
                executor = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (executor != null) {
            try {
                executor.execute(new Runnable() { // from class: pQ1
                    @Override // java.lang.Runnable
                    public final void run() {
                        C21821qQ1.m23643d(C21821qQ1.this, atomicReference);
                    }
                });
            } catch (RejectedExecutionException e) {
                Logger.m63177d("SurfaceOutputImpl", "Processor executor closed. Close request not posted.", e);
            }
        }
    }

    @Override // androidx.camera.core.SurfaceOutput
    public void updateTransformMatrix(float[] fArr, float[] fArr2) {
        android.opengl.Matrix.multiplyMM(fArr, 0, fArr2, 0, this.f77200j, 0);
    }
}