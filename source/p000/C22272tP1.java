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

/* renamed from: tP1 */
/* loaded from: classes.dex */
public final class C22272tP1 implements SurfaceOutput {

    /* renamed from: b */
    public final Surface f80094b;

    /* renamed from: c */
    public final int f80095c;

    /* renamed from: d */
    public final int f80096d;

    /* renamed from: e */
    public final Size f80097e;

    /* renamed from: f */
    public final Size f80098f;

    /* renamed from: g */
    public final Rect f80099g;

    /* renamed from: h */
    public final int f80100h;

    /* renamed from: i */
    public final boolean f80101i;

    /* renamed from: l */
    public Consumer f80104l;

    /* renamed from: m */
    public Executor f80105m;

    /* renamed from: p */
    public final ListenableFuture f80108p;

    /* renamed from: q */
    public CallbackToFutureAdapter.Completer f80109q;

    /* renamed from: r */
    public CameraInternal f80110r;

    /* renamed from: s */
    public Matrix f80111s;

    /* renamed from: a */
    public final Object f80093a = new Object();

    /* renamed from: j */
    public final float[] f80102j = new float[16];

    /* renamed from: k */
    public final float[] f80103k = new float[16];

    /* renamed from: n */
    public boolean f80106n = false;

    /* renamed from: o */
    public boolean f80107o = false;

    public C22272tP1(Surface surface, int i, int i2, Size size, Size size2, Rect rect, int i3, boolean z, CameraInternal cameraInternal, Matrix matrix) {
        this.f80094b = surface;
        this.f80095c = i;
        this.f80096d = i2;
        this.f80097e = size;
        this.f80098f = size2;
        this.f80099g = new Rect(rect);
        this.f80101i = z;
        this.f80100h = i3;
        this.f80110r = cameraInternal;
        this.f80111s = matrix;
        m22444g();
        this.f80108p = CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: rP1
            {
                C22272tP1.this = this;
            }

            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                return C22272tP1.m22446b(C22272tP1.this, completer);
            }
        });
    }

    /* renamed from: b */
    public static /* synthetic */ Object m22446b(C22272tP1 c22272tP1, CallbackToFutureAdapter.Completer completer) {
        return c22272tP1.m22441k(completer);
    }

    /* renamed from: d */
    public static /* synthetic */ void m22445d(C22272tP1 c22272tP1, AtomicReference atomicReference) {
        c22272tP1.m22440l(atomicReference);
    }

    @Override // androidx.camera.core.SurfaceOutput, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this.f80093a) {
            try {
                if (!this.f80107o) {
                    this.f80107o = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f80109q.set(null);
    }

    /* renamed from: g */
    public final void m22444g() {
        android.opengl.Matrix.setIdentityM(this.f80102j, 0);
        MatrixExt.preVerticalFlip(this.f80102j, 0.5f);
        MatrixExt.preRotate(this.f80102j, this.f80100h, 0.5f, 0.5f);
        if (this.f80101i) {
            android.opengl.Matrix.translateM(this.f80102j, 0, 1.0f, 0.0f, 0.0f);
            android.opengl.Matrix.scaleM(this.f80102j, 0, -1.0f, 1.0f, 1.0f);
        }
        Size rotateSize = TransformUtils.rotateSize(this.f80098f, this.f80100h);
        Matrix rectToRect = TransformUtils.getRectToRect(TransformUtils.sizeToRectF(this.f80098f), TransformUtils.sizeToRectF(rotateSize), this.f80100h, this.f80101i);
        RectF rectF = new RectF(this.f80099g);
        rectToRect.mapRect(rectF);
        float width = rectF.left / rotateSize.getWidth();
        float height = ((rotateSize.getHeight() - rectF.height()) - rectF.top) / rotateSize.getHeight();
        float height2 = rectF.height() / rotateSize.getHeight();
        android.opengl.Matrix.translateM(this.f80102j, 0, width, height, 0.0f);
        android.opengl.Matrix.scaleM(this.f80102j, 0, rectF.width() / rotateSize.getWidth(), height2, 1.0f);
        m22443i();
        float[] fArr = this.f80102j;
        android.opengl.Matrix.multiplyMM(fArr, 0, this.f80103k, 0, fArr, 0);
    }

    @Override // androidx.camera.core.SurfaceOutput
    public int getFormat() {
        return this.f80096d;
    }

    @Override // androidx.camera.core.SurfaceOutput
    public Matrix getSensorToBufferTransform() {
        return new Matrix(this.f80111s);
    }

    @Override // androidx.camera.core.SurfaceOutput
    public Size getSize() {
        return this.f80097e;
    }

    @Override // androidx.camera.core.SurfaceOutput
    public Surface getSurface(Executor executor, Consumer consumer) {
        boolean z;
        synchronized (this.f80093a) {
            this.f80105m = executor;
            this.f80104l = consumer;
            z = this.f80106n;
        }
        if (z) {
            m22439m();
        }
        return this.f80094b;
    }

    @Override // androidx.camera.core.SurfaceOutput
    public int getTargets() {
        return this.f80095c;
    }

    /* renamed from: i */
    public final void m22443i() {
        android.opengl.Matrix.setIdentityM(this.f80103k, 0);
        MatrixExt.preVerticalFlip(this.f80103k, 0.5f);
        CameraInternal cameraInternal = this.f80110r;
        if (cameraInternal != null) {
            Preconditions.checkState(cameraInternal.getHasTransform(), "Camera has no transform.");
            MatrixExt.preRotate(this.f80103k, this.f80110r.getCameraInfo().getSensorRotationDegrees(), 0.5f, 0.5f);
            if (this.f80110r.isFrontFacing()) {
                android.opengl.Matrix.translateM(this.f80103k, 0, 1.0f, 0.0f, 0.0f);
                android.opengl.Matrix.scaleM(this.f80103k, 0, -1.0f, 1.0f, 1.0f);
            }
        }
        float[] fArr = this.f80103k;
        android.opengl.Matrix.invertM(fArr, 0, fArr, 0);
    }

    /* renamed from: j */
    public ListenableFuture m22442j() {
        return this.f80108p;
    }

    /* renamed from: k */
    public final /* synthetic */ Object m22441k(CallbackToFutureAdapter.Completer completer) {
        this.f80109q = completer;
        return "SurfaceOutputImpl close future complete";
    }

    /* renamed from: l */
    public final /* synthetic */ void m22440l(AtomicReference atomicReference) {
        ((Consumer) atomicReference.get()).accept(SurfaceOutput.Event.m63188of(0, this));
    }

    /* renamed from: m */
    public void m22439m() {
        Executor executor;
        Consumer consumer;
        final AtomicReference atomicReference = new AtomicReference();
        synchronized (this.f80093a) {
            try {
                if (this.f80105m != null && (consumer = this.f80104l) != null) {
                    if (!this.f80107o) {
                        atomicReference.set(consumer);
                        executor = this.f80105m;
                        this.f80106n = false;
                    }
                    executor = null;
                }
                this.f80106n = true;
                executor = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (executor != null) {
            try {
                executor.execute(new Runnable() { // from class: sP1
                    {
                        C22272tP1.this = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        C22272tP1.m22445d(C22272tP1.this, atomicReference);
                    }
                });
            } catch (RejectedExecutionException e) {
                Logger.m63229d("SurfaceOutputImpl", "Processor executor closed. Close request not posted.", e);
            }
        }
    }

    @Override // androidx.camera.core.SurfaceOutput
    public void updateTransformMatrix(float[] fArr, float[] fArr2) {
        android.opengl.Matrix.multiplyMM(fArr, 0, fArr2, 0, this.f80102j, 0);
    }
}
