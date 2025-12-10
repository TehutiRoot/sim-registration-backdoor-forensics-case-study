package androidx.camera.core;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.media.ImageWriter;
import android.os.Build;
import androidx.camera.core.AbstractC2468h;
import androidx.camera.core.ImageAnalysis;
import androidx.camera.core.impl.ImageReaderProxy;
import androidx.camera.core.impl.TagBundle;
import androidx.camera.core.impl.utils.TransformUtils;
import androidx.camera.core.internal.compat.ImageWriterCompat;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.core.p005os.OperationCanceledException;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;

/* renamed from: androidx.camera.core.h */
/* loaded from: classes.dex */
public abstract class AbstractC2468h implements ImageReaderProxy.OnImageAvailableListener {

    /* renamed from: a */
    public ImageAnalysis.Analyzer f10972a;

    /* renamed from: b */
    public volatile int f10973b;

    /* renamed from: c */
    public volatile int f10974c;

    /* renamed from: e */
    public volatile boolean f10976e;

    /* renamed from: f */
    public volatile boolean f10977f;

    /* renamed from: g */
    public Executor f10978g;

    /* renamed from: h */
    public SafeCloseImageReaderProxy f10979h;

    /* renamed from: i */
    public ImageWriter f10980i;

    /* renamed from: n */
    public ByteBuffer f10985n;

    /* renamed from: o */
    public ByteBuffer f10986o;

    /* renamed from: p */
    public ByteBuffer f10987p;

    /* renamed from: q */
    public ByteBuffer f10988q;

    /* renamed from: d */
    public volatile int f10975d = 1;

    /* renamed from: j */
    public Rect f10981j = new Rect();

    /* renamed from: k */
    public Rect f10982k = new Rect();

    /* renamed from: l */
    public Matrix f10983l = new Matrix();

    /* renamed from: m */
    public Matrix f10984m = new Matrix();

    /* renamed from: r */
    public final Object f10989r = new Object();

    /* renamed from: s */
    public boolean f10990s = true;

    /* renamed from: h */
    public static SafeCloseImageReaderProxy m63147h(int i, int i2, int i3, int i4, int i5) {
        boolean z;
        int i6;
        if (i3 != 90 && i3 != 270) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            i6 = i2;
        } else {
            i6 = i;
        }
        if (!z) {
            i = i2;
        }
        return new SafeCloseImageReaderProxy(ImageReaderProxys.createIsolatedReader(i6, i, i4, i5));
    }

    /* renamed from: j */
    public static Matrix m63145j(int i, int i2, int i3, int i4, int i5) {
        Matrix matrix = new Matrix();
        if (i5 > 0) {
            matrix.setRectToRect(new RectF(0.0f, 0.0f, i, i2), TransformUtils.NORMALIZED_RECT, Matrix.ScaleToFit.FILL);
            matrix.postRotate(i5);
            matrix.postConcat(TransformUtils.getNormalizedToBuffer(new RectF(0.0f, 0.0f, i3, i4)));
        }
        return matrix;
    }

    /* renamed from: k */
    public static Rect m63144k(Rect rect, Matrix matrix) {
        RectF rectF = new RectF(rect);
        matrix.mapRect(rectF);
        Rect rect2 = new Rect();
        rectF.round(rect2);
        return rect2;
    }

    /* renamed from: c */
    public abstract ImageProxy mo63131c(ImageReaderProxy imageReaderProxy);

    /* JADX WARN: Removed duplicated region for block: B:43:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0081  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.google.common.util.concurrent.ListenableFuture m63150d(final androidx.camera.core.ImageProxy r15) {
        /*
            Method dump skipped, instructions count: 199
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.AbstractC2468h.m63150d(androidx.camera.core.ImageProxy):com.google.common.util.concurrent.ListenableFuture");
    }

    /* renamed from: e */
    public void m63149e() {
        this.f10990s = true;
    }

    /* renamed from: f */
    public abstract void mo63130f();

    /* renamed from: g */
    public final void m63148g(ImageProxy imageProxy) {
        if (this.f10975d == 1) {
            if (this.f10986o == null) {
                this.f10986o = ByteBuffer.allocateDirect(imageProxy.getWidth() * imageProxy.getHeight());
            }
            this.f10986o.position(0);
            if (this.f10987p == null) {
                this.f10987p = ByteBuffer.allocateDirect((imageProxy.getWidth() * imageProxy.getHeight()) / 4);
            }
            this.f10987p.position(0);
            if (this.f10988q == null) {
                this.f10988q = ByteBuffer.allocateDirect((imageProxy.getWidth() * imageProxy.getHeight()) / 4);
            }
            this.f10988q.position(0);
        } else if (this.f10975d == 2 && this.f10985n == null) {
            this.f10985n = ByteBuffer.allocateDirect(imageProxy.getWidth() * imageProxy.getHeight() * 4);
        }
    }

    /* renamed from: i */
    public void m63146i() {
        this.f10990s = false;
        mo63130f();
    }

    /* renamed from: l */
    public final /* synthetic */ void m63143l(ImageProxy imageProxy, Matrix matrix, ImageProxy imageProxy2, Rect rect, ImageAnalysis.Analyzer analyzer, CallbackToFutureAdapter.Completer completer) {
        int i;
        if (this.f10990s) {
            TagBundle tagBundle = imageProxy.getImageInfo().getTagBundle();
            long timestamp = imageProxy.getImageInfo().getTimestamp();
            if (this.f10976e) {
                i = 0;
            } else {
                i = this.f10973b;
            }
            SettableImageProxy settableImageProxy = new SettableImageProxy(imageProxy2, ImmutableImageInfo.create(tagBundle, timestamp, i, matrix));
            if (!rect.isEmpty()) {
                settableImageProxy.setCropRect(rect);
            }
            analyzer.analyze(settableImageProxy);
            completer.set(null);
            return;
        }
        completer.setException(new OperationCanceledException("ImageAnalysis is detached"));
    }

    /* renamed from: m */
    public final /* synthetic */ Object m63142m(Executor executor, final ImageProxy imageProxy, final Matrix matrix, final ImageProxy imageProxy2, final Rect rect, final ImageAnalysis.Analyzer analyzer, final CallbackToFutureAdapter.Completer completer) {
        executor.execute(new Runnable() { // from class: Qc0
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC2468h.this.m63143l(imageProxy, matrix, imageProxy2, rect, analyzer, completer);
            }
        });
        return "analyzeImage";
    }

    /* renamed from: n */
    public abstract void mo63129n(ImageProxy imageProxy);

    /* renamed from: o */
    public final void m63141o(int i, int i2, int i3, int i4) {
        Matrix m63145j = m63145j(i, i2, i3, i4, this.f10973b);
        this.f10982k = m63144k(this.f10981j, m63145j);
        this.f10984m.setConcat(this.f10983l, m63145j);
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy.OnImageAvailableListener
    public void onImageAvailable(ImageReaderProxy imageReaderProxy) {
        try {
            ImageProxy mo63131c = mo63131c(imageReaderProxy);
            if (mo63131c != null) {
                mo63129n(mo63131c);
            }
        } catch (IllegalStateException e) {
            Logger.m63227e("ImageAnalysisAnalyzer", "Failed to acquire image.", e);
        }
    }

    /* renamed from: p */
    public final void m63140p(ImageProxy imageProxy, int i) {
        SafeCloseImageReaderProxy safeCloseImageReaderProxy = this.f10979h;
        if (safeCloseImageReaderProxy == null) {
            return;
        }
        safeCloseImageReaderProxy.safeClose();
        this.f10979h = m63147h(imageProxy.getWidth(), imageProxy.getHeight(), i, this.f10979h.getImageFormat(), this.f10979h.getMaxImages());
        if (Build.VERSION.SDK_INT >= 23 && this.f10975d == 1) {
            ImageWriter imageWriter = this.f10980i;
            if (imageWriter != null) {
                ImageWriterCompat.close(imageWriter);
            }
            this.f10980i = ImageWriterCompat.newInstance(this.f10979h.getSurface(), this.f10979h.getMaxImages());
        }
    }

    /* renamed from: q */
    public void m63139q(Executor executor, ImageAnalysis.Analyzer analyzer) {
        if (analyzer == null) {
            mo63130f();
        }
        synchronized (this.f10989r) {
            this.f10972a = analyzer;
            this.f10978g = executor;
        }
    }

    /* renamed from: r */
    public void m63138r(boolean z) {
        this.f10977f = z;
    }

    /* renamed from: s */
    public void m63137s(int i) {
        this.f10975d = i;
    }

    /* renamed from: t */
    public void m63136t(boolean z) {
        this.f10976e = z;
    }

    /* renamed from: u */
    public void m63135u(SafeCloseImageReaderProxy safeCloseImageReaderProxy) {
        synchronized (this.f10989r) {
            this.f10979h = safeCloseImageReaderProxy;
        }
    }

    /* renamed from: v */
    public void m63134v(int i) {
        this.f10973b = i;
    }

    /* renamed from: w */
    public void m63133w(Matrix matrix) {
        synchronized (this.f10989r) {
            this.f10983l = matrix;
            this.f10984m = new Matrix(this.f10983l);
        }
    }

    /* renamed from: x */
    public void m63132x(Rect rect) {
        synchronized (this.f10989r) {
            this.f10981j = rect;
            this.f10982k = new Rect(this.f10981j);
        }
    }
}
