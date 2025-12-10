package androidx.camera.core.processing;

import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.opengl.Matrix;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Size;
import android.view.Surface;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import androidx.arch.core.util.Function;
import androidx.camera.core.DynamicRange;
import androidx.camera.core.ImageProcessingUtil;
import androidx.camera.core.Logger;
import androidx.camera.core.SurfaceOutput;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.core.impl.utils.MatrixExt;
import androidx.camera.core.impl.utils.TransformUtils;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.camera.core.processing.DefaultSurfaceProcessor;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.core.util.Consumer;
import androidx.core.util.Preconditions;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Triple;

@RequiresApi(21)
/* loaded from: classes.dex */
public class DefaultSurfaceProcessor implements SurfaceProcessorInternal, SurfaceTexture.OnFrameAvailableListener {

    /* renamed from: a */
    public final OpenGlRenderer f11466a;

    /* renamed from: b */
    public final HandlerThread f11467b;

    /* renamed from: c */
    public final Executor f11468c;

    /* renamed from: d */
    public final Handler f11469d;

    /* renamed from: e */
    public final AtomicBoolean f11470e;

    /* renamed from: f */
    public final float[] f11471f;

    /* renamed from: g */
    public final float[] f11472g;

    /* renamed from: h */
    public final Map f11473h;

    /* renamed from: i */
    public int f11474i;

    /* renamed from: j */
    public boolean f11475j;

    /* renamed from: k */
    public final List f11476k;

    /* loaded from: classes.dex */
    public static class Factory {

        /* renamed from: a */
        public static Function f11477a = new Function() { // from class: oF
            @Override // androidx.arch.core.util.Function
            public final Object apply(Object obj) {
                return new DefaultSurfaceProcessor((DynamicRange) obj);
            }
        };

        @NonNull
        public static SurfaceProcessorInternal newInstance(@NonNull DynamicRange dynamicRange) {
            return (SurfaceProcessorInternal) f11477a.apply(dynamicRange);
        }

        @VisibleForTesting
        public static void setSupplier(@NonNull Function<DynamicRange, SurfaceProcessorInternal> function) {
            f11477a = function;
        }
    }

    /* renamed from: androidx.camera.core.processing.DefaultSurfaceProcessor$a */
    /* loaded from: classes.dex */
    public static abstract class AbstractC2537a {
        /* renamed from: d */
        public static C2543a m62688d(int i, int i2, CallbackToFutureAdapter.Completer completer) {
            return new C2543a(i, i2, completer);
        }

        /* renamed from: a */
        public abstract CallbackToFutureAdapter.Completer mo62611a();

        /* renamed from: b */
        public abstract int mo62610b();

        /* renamed from: c */
        public abstract int mo62609c();
    }

    public DefaultSurfaceProcessor(DynamicRange dynamicRange) {
        this(dynamicRange, ShaderProvider.DEFAULT);
    }

    /* renamed from: C */
    public static /* synthetic */ void m62717C(CallbackToFutureAdapter.Completer completer) {
        completer.setException(new Exception("Failed to snapshot: OpenGLRenderer not ready."));
    }

    /* renamed from: a */
    public static /* synthetic */ void m62714a() {
        m62696s();
    }

    /* renamed from: b */
    public static /* synthetic */ Object m62713b(DefaultSurfaceProcessor defaultSurfaceProcessor, int i, int i2, CallbackToFutureAdapter.Completer completer) {
        return defaultSurfaceProcessor.m62716D(i, i2, completer);
    }

    /* renamed from: c */
    public static /* synthetic */ void m62712c(DefaultSurfaceProcessor defaultSurfaceProcessor, SurfaceOutput surfaceOutput, SurfaceOutput.Event event) {
        defaultSurfaceProcessor.m62690y(surfaceOutput, event);
    }

    /* renamed from: e */
    public static /* synthetic */ void m62710e(CallbackToFutureAdapter.Completer completer) {
        m62717C(completer);
    }

    /* renamed from: f */
    public static /* synthetic */ void m62709f(DefaultSurfaceProcessor defaultSurfaceProcessor, AbstractC2537a abstractC2537a) {
        defaultSurfaceProcessor.m62718B(abstractC2537a);
    }

    /* renamed from: h */
    public static /* synthetic */ void m62707h(DefaultSurfaceProcessor defaultSurfaceProcessor) {
        defaultSurfaceProcessor.m62719A();
    }

    /* renamed from: k */
    public static /* synthetic */ void m62704k(DefaultSurfaceProcessor defaultSurfaceProcessor, SurfaceOutput surfaceOutput) {
        defaultSurfaceProcessor.m62689z(surfaceOutput);
    }

    /* renamed from: l */
    public static /* synthetic */ void m62703l(DefaultSurfaceProcessor defaultSurfaceProcessor, Runnable runnable, Runnable runnable2) {
        defaultSurfaceProcessor.m62695t(runnable, runnable2);
    }

    /* renamed from: s */
    public static /* synthetic */ void m62696s() {
    }

    /* renamed from: A */
    public final /* synthetic */ void m62719A() {
        this.f11475j = true;
        m62702m();
    }

    /* renamed from: B */
    public final /* synthetic */ void m62718B(AbstractC2537a abstractC2537a) {
        this.f11476k.add(abstractC2537a);
    }

    /* renamed from: D */
    public final /* synthetic */ Object m62716D(int i, int i2, final CallbackToFutureAdapter.Completer completer) {
        final C2543a m62688d = AbstractC2537a.m62688d(i, i2, completer);
        m62700o(new Runnable() { // from class: cF
            @Override // java.lang.Runnable
            public final void run() {
                DefaultSurfaceProcessor.m62709f(DefaultSurfaceProcessor.this, m62688d);
            }
        }, new Runnable() { // from class: dF
            @Override // java.lang.Runnable
            public final void run() {
                DefaultSurfaceProcessor.m62710e(CallbackToFutureAdapter.Completer.this);
            }
        });
        return "DefaultSurfaceProcessor#snapshot";
    }

    /* renamed from: E */
    public final void m62715E(Triple triple) {
        if (this.f11476k.isEmpty()) {
            return;
        }
        if (triple == null) {
            m62699p(new Exception("Failed to snapshot: no JPEG Surface."));
            return;
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            Iterator it = this.f11476k.iterator();
            Bitmap bitmap = null;
            byte[] bArr = null;
            int i = -1;
            int i2 = -1;
            while (it.hasNext()) {
                AbstractC2537a abstractC2537a = (AbstractC2537a) it.next();
                if (i != abstractC2537a.mo62609c() || bitmap == null) {
                    i = abstractC2537a.mo62609c();
                    if (bitmap != null) {
                        bitmap.recycle();
                    }
                    bitmap = m62698q((Size) triple.getSecond(), (float[]) triple.getThird(), i);
                    i2 = -1;
                }
                if (i2 != abstractC2537a.mo62610b()) {
                    byteArrayOutputStream.reset();
                    i2 = abstractC2537a.mo62610b();
                    bitmap.compress(Bitmap.CompressFormat.JPEG, i2, byteArrayOutputStream);
                    bArr = byteArrayOutputStream.toByteArray();
                }
                Objects.requireNonNull(bArr);
                ImageProcessingUtil.writeJpegBytesToSurface((Surface) triple.getFirst(), bArr);
                abstractC2537a.mo62611a().set(null);
                it.remove();
            }
            byteArrayOutputStream.close();
        } catch (IOException e) {
            m62699p(e);
        }
    }

    /* renamed from: m */
    public final void m62702m() {
        if (this.f11475j && this.f11474i == 0) {
            for (SurfaceOutput surfaceOutput : this.f11473h.keySet()) {
                surfaceOutput.close();
            }
            for (AbstractC2537a abstractC2537a : this.f11476k) {
                abstractC2537a.mo62611a().setException(new Exception("Failed to snapshot: DefaultSurfaceProcessor is released."));
            }
            this.f11473h.clear();
            this.f11466a.release();
            this.f11467b.quit();
        }
    }

    /* renamed from: n */
    public final void m62701n(Runnable runnable) {
        m62700o(runnable, new Runnable() { // from class: lF
            @Override // java.lang.Runnable
            public final void run() {
                DefaultSurfaceProcessor.m62714a();
            }
        });
    }

    /* renamed from: o */
    public final void m62700o(final Runnable runnable, final Runnable runnable2) {
        try {
            this.f11468c.execute(new Runnable() { // from class: mF
                @Override // java.lang.Runnable
                public final void run() {
                    DefaultSurfaceProcessor.m62703l(DefaultSurfaceProcessor.this, runnable2, runnable);
                }
            });
        } catch (RejectedExecutionException e) {
            Logger.m63170w("DefaultSurfaceProcessor", "Unable to executor runnable", e);
            runnable2.run();
        }
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(@NonNull SurfaceTexture surfaceTexture) {
        boolean z;
        if (this.f11470e.get()) {
            return;
        }
        surfaceTexture.updateTexImage();
        surfaceTexture.getTransformMatrix(this.f11471f);
        Triple triple = null;
        for (Map.Entry entry : this.f11473h.entrySet()) {
            Surface surface = (Surface) entry.getValue();
            SurfaceOutput surfaceOutput = (SurfaceOutput) entry.getKey();
            surfaceOutput.updateTransformMatrix(this.f11472g, this.f11471f);
            if (surfaceOutput.getFormat() == 34) {
                try {
                    this.f11466a.render(surfaceTexture.getTimestamp(), this.f11472g, surface);
                } catch (RuntimeException e) {
                    Logger.m63175e("DefaultSurfaceProcessor", "Failed to render with OpenGL.", e);
                }
            } else {
                boolean z2 = false;
                if (surfaceOutput.getFormat() == 256) {
                    z = true;
                } else {
                    z = false;
                }
                Preconditions.checkState(z, "Unsupported format: " + surfaceOutput.getFormat());
                if (triple == null) {
                    z2 = true;
                }
                Preconditions.checkState(z2, "Only one JPEG output is supported.");
                triple = new Triple(surface, surfaceOutput.getSize(), (float[]) this.f11472g.clone());
            }
        }
        try {
            m62715E(triple);
        } catch (RuntimeException e2) {
            m62699p(e2);
        }
    }

    @Override // androidx.camera.core.SurfaceProcessor
    public void onInputSurface(@NonNull final SurfaceRequest surfaceRequest) {
        if (this.f11470e.get()) {
            surfaceRequest.willNotProvideSurface();
            return;
        }
        Runnable runnable = new Runnable() { // from class: gF
            @Override // java.lang.Runnable
            public final void run() {
                DefaultSurfaceProcessor.this.m62691x(surfaceRequest);
            }
        };
        Objects.requireNonNull(surfaceRequest);
        m62700o(runnable, new Runnable() { // from class: hF
            @Override // java.lang.Runnable
            public final void run() {
                SurfaceRequest.this.willNotProvideSurface();
            }
        });
    }

    @Override // androidx.camera.core.SurfaceProcessor
    public void onOutputSurface(@NonNull final SurfaceOutput surfaceOutput) {
        if (this.f11470e.get()) {
            surfaceOutput.close();
            return;
        }
        Runnable runnable = new Runnable() { // from class: aF
            @Override // java.lang.Runnable
            public final void run() {
                DefaultSurfaceProcessor.m62704k(DefaultSurfaceProcessor.this, surfaceOutput);
            }
        };
        Objects.requireNonNull(surfaceOutput);
        m62700o(runnable, new Runnable() { // from class: fF
            @Override // java.lang.Runnable
            public final void run() {
                SurfaceOutput.this.close();
            }
        });
    }

    /* renamed from: p */
    public final void m62699p(Throwable th2) {
        for (AbstractC2537a abstractC2537a : this.f11476k) {
            abstractC2537a.mo62611a().setException(th2);
        }
        this.f11476k.clear();
    }

    /* renamed from: q */
    public final Bitmap m62698q(Size size, float[] fArr, int i) {
        float[] fArr2 = new float[16];
        Matrix.setIdentityM(fArr2, 0);
        MatrixExt.preVerticalFlip(fArr2, 0.5f);
        MatrixExt.preRotate(fArr2, i, 0.5f, 0.5f);
        Matrix.multiplyMM(fArr2, 0, fArr2, 0, fArr, 0);
        return this.f11466a.snapshot(TransformUtils.rotateSize(size, i), fArr2);
    }

    /* renamed from: r */
    public final void m62697r(final DynamicRange dynamicRange, final ShaderProvider shaderProvider) {
        try {
            CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: bF
                @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
                public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                    Object m62693v;
                    m62693v = DefaultSurfaceProcessor.this.m62693v(dynamicRange, shaderProvider, completer);
                    return m62693v;
                }
            }).get();
        } catch (InterruptedException | ExecutionException e) {
            e = e;
            if (e instanceof ExecutionException) {
                e = e.getCause();
            }
            if (e instanceof RuntimeException) {
                throw ((RuntimeException) e);
            }
            throw new IllegalStateException("Failed to create DefaultSurfaceProcessor", e);
        }
    }

    @Override // androidx.camera.core.processing.SurfaceProcessorInternal
    public void release() {
        if (this.f11470e.getAndSet(true)) {
            return;
        }
        m62701n(new Runnable() { // from class: iF
            @Override // java.lang.Runnable
            public final void run() {
                DefaultSurfaceProcessor.m62707h(DefaultSurfaceProcessor.this);
            }
        });
    }

    @Override // androidx.camera.core.processing.SurfaceProcessorInternal
    @NonNull
    public ListenableFuture<Void> snapshot(@IntRange(from = 0, m64693to = 100) final int i, @IntRange(from = 0, m64693to = 359) final int i2) {
        return Futures.nonCancellationPropagating(CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: jF
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                return DefaultSurfaceProcessor.m62713b(DefaultSurfaceProcessor.this, i, i2, completer);
            }
        }));
    }

    /* renamed from: t */
    public final /* synthetic */ void m62695t(Runnable runnable, Runnable runnable2) {
        if (this.f11475j) {
            runnable.run();
        } else {
            runnable2.run();
        }
    }

    /* renamed from: u */
    public final /* synthetic */ void m62694u(DynamicRange dynamicRange, ShaderProvider shaderProvider, CallbackToFutureAdapter.Completer completer) {
        try {
            this.f11466a.init(dynamicRange, shaderProvider);
            completer.set(null);
        } catch (RuntimeException e) {
            completer.setException(e);
        }
    }

    /* renamed from: v */
    public final /* synthetic */ Object m62693v(final DynamicRange dynamicRange, final ShaderProvider shaderProvider, final CallbackToFutureAdapter.Completer completer) {
        m62701n(new Runnable() { // from class: eF
            @Override // java.lang.Runnable
            public final void run() {
                DefaultSurfaceProcessor.this.m62694u(dynamicRange, shaderProvider, completer);
            }
        });
        return "Init GlRenderer";
    }

    /* renamed from: w */
    public final /* synthetic */ void m62692w(SurfaceTexture surfaceTexture, Surface surface, SurfaceRequest.Result result) {
        surfaceTexture.setOnFrameAvailableListener(null);
        surfaceTexture.release();
        surface.release();
        this.f11474i--;
        m62702m();
    }

    /* renamed from: x */
    public final /* synthetic */ void m62691x(SurfaceRequest surfaceRequest) {
        this.f11474i++;
        final SurfaceTexture surfaceTexture = new SurfaceTexture(this.f11466a.getTextureName());
        surfaceTexture.setDefaultBufferSize(surfaceRequest.getResolution().getWidth(), surfaceRequest.getResolution().getHeight());
        final Surface surface = new Surface(surfaceTexture);
        surfaceRequest.provideSurface(surface, this.f11468c, new Consumer() { // from class: nF
            @Override // androidx.core.util.Consumer
            public final void accept(Object obj) {
                DefaultSurfaceProcessor.this.m62692w(surfaceTexture, surface, (SurfaceRequest.Result) obj);
            }
        });
        surfaceTexture.setOnFrameAvailableListener(this, this.f11469d);
    }

    /* renamed from: y */
    public final /* synthetic */ void m62690y(SurfaceOutput surfaceOutput, SurfaceOutput.Event event) {
        surfaceOutput.close();
        Surface surface = (Surface) this.f11473h.remove(surfaceOutput);
        if (surface != null) {
            this.f11466a.unregisterOutputSurface(surface);
        }
    }

    /* renamed from: z */
    public final /* synthetic */ void m62689z(final SurfaceOutput surfaceOutput) {
        Surface surface = surfaceOutput.getSurface(this.f11468c, new Consumer() { // from class: kF
            @Override // androidx.core.util.Consumer
            public final void accept(Object obj) {
                DefaultSurfaceProcessor.m62712c(DefaultSurfaceProcessor.this, surfaceOutput, (SurfaceOutput.Event) obj);
            }
        });
        this.f11466a.registerOutputSurface(surface);
        this.f11473h.put(surfaceOutput, surface);
    }

    public DefaultSurfaceProcessor(DynamicRange dynamicRange, ShaderProvider shaderProvider) {
        this.f11470e = new AtomicBoolean(false);
        this.f11471f = new float[16];
        this.f11472g = new float[16];
        this.f11473h = new LinkedHashMap();
        this.f11474i = 0;
        this.f11475j = false;
        this.f11476k = new ArrayList();
        HandlerThread handlerThread = new HandlerThread("GL Thread");
        this.f11467b = handlerThread;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        this.f11469d = handler;
        this.f11468c = CameraXExecutors.newHandlerExecutor(handler);
        this.f11466a = new OpenGlRenderer();
        try {
            m62697r(dynamicRange, shaderProvider);
        } catch (RuntimeException e) {
            release();
            throw e;
        }
    }
}