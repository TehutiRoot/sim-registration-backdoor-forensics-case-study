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
    public final OpenGlRenderer f11378a;

    /* renamed from: b */
    public final HandlerThread f11379b;

    /* renamed from: c */
    public final Executor f11380c;

    /* renamed from: d */
    public final Handler f11381d;

    /* renamed from: e */
    public final AtomicBoolean f11382e;

    /* renamed from: f */
    public final float[] f11383f;

    /* renamed from: g */
    public final float[] f11384g;

    /* renamed from: h */
    public final Map f11385h;

    /* renamed from: i */
    public int f11386i;

    /* renamed from: j */
    public boolean f11387j;

    /* renamed from: k */
    public final List f11388k;

    /* loaded from: classes.dex */
    public static class Factory {

        /* renamed from: a */
        public static Function f11389a = new Function() { // from class: nF
            @Override // androidx.arch.core.util.Function
            public final Object apply(Object obj) {
                return new DefaultSurfaceProcessor((DynamicRange) obj);
            }
        };

        @NonNull
        public static SurfaceProcessorInternal newInstance(@NonNull DynamicRange dynamicRange) {
            return (SurfaceProcessorInternal) f11389a.apply(dynamicRange);
        }

        @VisibleForTesting
        public static void setSupplier(@NonNull Function<DynamicRange, SurfaceProcessorInternal> function) {
            f11389a = function;
        }
    }

    /* renamed from: androidx.camera.core.processing.DefaultSurfaceProcessor$a */
    /* loaded from: classes.dex */
    public static abstract class AbstractC2555a {
        /* renamed from: d */
        public static C2561a m62740d(int i, int i2, CallbackToFutureAdapter.Completer completer) {
            return new C2561a(i, i2, completer);
        }

        /* renamed from: a */
        public abstract CallbackToFutureAdapter.Completer mo62663a();

        /* renamed from: b */
        public abstract int mo62662b();

        /* renamed from: c */
        public abstract int mo62661c();
    }

    public DefaultSurfaceProcessor(DynamicRange dynamicRange) {
        this(dynamicRange, ShaderProvider.DEFAULT);
    }

    /* renamed from: C */
    public static /* synthetic */ void m62769C(CallbackToFutureAdapter.Completer completer) {
        completer.setException(new Exception("Failed to snapshot: OpenGLRenderer not ready."));
    }

    /* renamed from: a */
    public static /* synthetic */ void m62766a() {
        m62748s();
    }

    /* renamed from: b */
    public static /* synthetic */ Object m62765b(DefaultSurfaceProcessor defaultSurfaceProcessor, int i, int i2, CallbackToFutureAdapter.Completer completer) {
        return defaultSurfaceProcessor.m62768D(i, i2, completer);
    }

    /* renamed from: c */
    public static /* synthetic */ void m62764c(DefaultSurfaceProcessor defaultSurfaceProcessor, SurfaceOutput surfaceOutput, SurfaceOutput.Event event) {
        defaultSurfaceProcessor.m62742y(surfaceOutput, event);
    }

    /* renamed from: d */
    public static /* synthetic */ void m62763d(DefaultSurfaceProcessor defaultSurfaceProcessor, SurfaceRequest surfaceRequest) {
        defaultSurfaceProcessor.m62743x(surfaceRequest);
    }

    /* renamed from: e */
    public static /* synthetic */ void m62762e(CallbackToFutureAdapter.Completer completer) {
        m62769C(completer);
    }

    /* renamed from: f */
    public static /* synthetic */ void m62761f(DefaultSurfaceProcessor defaultSurfaceProcessor, AbstractC2555a abstractC2555a) {
        defaultSurfaceProcessor.m62770B(abstractC2555a);
    }

    /* renamed from: g */
    public static /* synthetic */ Object m62760g(DefaultSurfaceProcessor defaultSurfaceProcessor, DynamicRange dynamicRange, ShaderProvider shaderProvider, CallbackToFutureAdapter.Completer completer) {
        return defaultSurfaceProcessor.m62745v(dynamicRange, shaderProvider, completer);
    }

    /* renamed from: h */
    public static /* synthetic */ void m62759h(DefaultSurfaceProcessor defaultSurfaceProcessor) {
        defaultSurfaceProcessor.m62771A();
    }

    /* renamed from: i */
    public static /* synthetic */ void m62758i(DefaultSurfaceProcessor defaultSurfaceProcessor, DynamicRange dynamicRange, ShaderProvider shaderProvider, CallbackToFutureAdapter.Completer completer) {
        defaultSurfaceProcessor.m62746u(dynamicRange, shaderProvider, completer);
    }

    /* renamed from: j */
    public static /* synthetic */ void m62757j(DefaultSurfaceProcessor defaultSurfaceProcessor, SurfaceTexture surfaceTexture, Surface surface, SurfaceRequest.Result result) {
        defaultSurfaceProcessor.m62744w(surfaceTexture, surface, result);
    }

    /* renamed from: k */
    public static /* synthetic */ void m62756k(DefaultSurfaceProcessor defaultSurfaceProcessor, SurfaceOutput surfaceOutput) {
        defaultSurfaceProcessor.m62741z(surfaceOutput);
    }

    /* renamed from: l */
    public static /* synthetic */ void m62755l(DefaultSurfaceProcessor defaultSurfaceProcessor, Runnable runnable, Runnable runnable2) {
        defaultSurfaceProcessor.m62747t(runnable, runnable2);
    }

    /* renamed from: s */
    public static /* synthetic */ void m62748s() {
    }

    /* renamed from: A */
    public final /* synthetic */ void m62771A() {
        this.f11387j = true;
        m62754m();
    }

    /* renamed from: B */
    public final /* synthetic */ void m62770B(AbstractC2555a abstractC2555a) {
        this.f11388k.add(abstractC2555a);
    }

    /* renamed from: D */
    public final /* synthetic */ Object m62768D(int i, int i2, final CallbackToFutureAdapter.Completer completer) {
        final C2561a m62740d = AbstractC2555a.m62740d(i, i2, completer);
        m62752o(new Runnable() { // from class: bF
            {
                DefaultSurfaceProcessor.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                DefaultSurfaceProcessor.m62761f(DefaultSurfaceProcessor.this, m62740d);
            }
        }, new Runnable() { // from class: cF
            @Override // java.lang.Runnable
            public final void run() {
                DefaultSurfaceProcessor.m62762e(completer);
            }
        });
        return "DefaultSurfaceProcessor#snapshot";
    }

    /* renamed from: E */
    public final void m62767E(Triple triple) {
        if (this.f11388k.isEmpty()) {
            return;
        }
        if (triple == null) {
            m62751p(new Exception("Failed to snapshot: no JPEG Surface."));
            return;
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            Iterator it = this.f11388k.iterator();
            Bitmap bitmap = null;
            byte[] bArr = null;
            int i = -1;
            int i2 = -1;
            while (it.hasNext()) {
                AbstractC2555a abstractC2555a = (AbstractC2555a) it.next();
                if (i != abstractC2555a.mo62661c() || bitmap == null) {
                    i = abstractC2555a.mo62661c();
                    if (bitmap != null) {
                        bitmap.recycle();
                    }
                    bitmap = m62750q((Size) triple.getSecond(), (float[]) triple.getThird(), i);
                    i2 = -1;
                }
                if (i2 != abstractC2555a.mo62662b()) {
                    byteArrayOutputStream.reset();
                    i2 = abstractC2555a.mo62662b();
                    bitmap.compress(Bitmap.CompressFormat.JPEG, i2, byteArrayOutputStream);
                    bArr = byteArrayOutputStream.toByteArray();
                }
                Objects.requireNonNull(bArr);
                ImageProcessingUtil.writeJpegBytesToSurface((Surface) triple.getFirst(), bArr);
                abstractC2555a.mo62663a().set(null);
                it.remove();
            }
            byteArrayOutputStream.close();
        } catch (IOException e) {
            m62751p(e);
        }
    }

    /* renamed from: m */
    public final void m62754m() {
        if (this.f11387j && this.f11386i == 0) {
            for (SurfaceOutput surfaceOutput : this.f11385h.keySet()) {
                surfaceOutput.close();
            }
            for (AbstractC2555a abstractC2555a : this.f11388k) {
                abstractC2555a.mo62663a().setException(new Exception("Failed to snapshot: DefaultSurfaceProcessor is released."));
            }
            this.f11385h.clear();
            this.f11378a.release();
            this.f11379b.quit();
        }
    }

    /* renamed from: n */
    public final void m62753n(Runnable runnable) {
        m62752o(runnable, new Runnable() { // from class: kF
            @Override // java.lang.Runnable
            public final void run() {
                DefaultSurfaceProcessor.m62766a();
            }
        });
    }

    /* renamed from: o */
    public final void m62752o(final Runnable runnable, final Runnable runnable2) {
        try {
            this.f11380c.execute(new Runnable() { // from class: lF
                {
                    DefaultSurfaceProcessor.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    DefaultSurfaceProcessor.m62755l(DefaultSurfaceProcessor.this, runnable2, runnable);
                }
            });
        } catch (RejectedExecutionException e) {
            Logger.m63222w("DefaultSurfaceProcessor", "Unable to executor runnable", e);
            runnable2.run();
        }
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(@NonNull SurfaceTexture surfaceTexture) {
        boolean z;
        if (this.f11382e.get()) {
            return;
        }
        surfaceTexture.updateTexImage();
        surfaceTexture.getTransformMatrix(this.f11383f);
        Triple triple = null;
        for (Map.Entry entry : this.f11385h.entrySet()) {
            Surface surface = (Surface) entry.getValue();
            SurfaceOutput surfaceOutput = (SurfaceOutput) entry.getKey();
            surfaceOutput.updateTransformMatrix(this.f11384g, this.f11383f);
            if (surfaceOutput.getFormat() == 34) {
                try {
                    this.f11378a.render(surfaceTexture.getTimestamp(), this.f11384g, surface);
                } catch (RuntimeException e) {
                    Logger.m63227e("DefaultSurfaceProcessor", "Failed to render with OpenGL.", e);
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
                triple = new Triple(surface, surfaceOutput.getSize(), (float[]) this.f11384g.clone());
            }
        }
        try {
            m62767E(triple);
        } catch (RuntimeException e2) {
            m62751p(e2);
        }
    }

    @Override // androidx.camera.core.SurfaceProcessor
    public void onInputSurface(@NonNull final SurfaceRequest surfaceRequest) {
        if (this.f11382e.get()) {
            surfaceRequest.willNotProvideSurface();
            return;
        }
        Runnable runnable = new Runnable() { // from class: fF
            @Override // java.lang.Runnable
            public final void run() {
                DefaultSurfaceProcessor.m62763d(DefaultSurfaceProcessor.this, surfaceRequest);
            }
        };
        Objects.requireNonNull(surfaceRequest);
        m62752o(runnable, new Runnable() { // from class: gF
            @Override // java.lang.Runnable
            public final void run() {
                SurfaceRequest.this.willNotProvideSurface();
            }
        });
    }

    @Override // androidx.camera.core.SurfaceProcessor
    public void onOutputSurface(@NonNull final SurfaceOutput surfaceOutput) {
        if (this.f11382e.get()) {
            surfaceOutput.close();
            return;
        }
        Runnable runnable = new Runnable() { // from class: ZE
            {
                DefaultSurfaceProcessor.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                DefaultSurfaceProcessor.m62756k(DefaultSurfaceProcessor.this, surfaceOutput);
            }
        };
        Objects.requireNonNull(surfaceOutput);
        m62752o(runnable, new Runnable() { // from class: eF
            @Override // java.lang.Runnable
            public final void run() {
                surfaceOutput.close();
            }
        });
    }

    /* renamed from: p */
    public final void m62751p(Throwable th2) {
        for (AbstractC2555a abstractC2555a : this.f11388k) {
            abstractC2555a.mo62663a().setException(th2);
        }
        this.f11388k.clear();
    }

    /* renamed from: q */
    public final Bitmap m62750q(Size size, float[] fArr, int i) {
        float[] fArr2 = new float[16];
        Matrix.setIdentityM(fArr2, 0);
        MatrixExt.preVerticalFlip(fArr2, 0.5f);
        MatrixExt.preRotate(fArr2, i, 0.5f, 0.5f);
        Matrix.multiplyMM(fArr2, 0, fArr2, 0, fArr, 0);
        return this.f11378a.snapshot(TransformUtils.rotateSize(size, i), fArr2);
    }

    /* renamed from: r */
    public final void m62749r(final DynamicRange dynamicRange, final ShaderProvider shaderProvider) {
        try {
            CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: aF
                @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
                public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                    return DefaultSurfaceProcessor.m62760g(DefaultSurfaceProcessor.this, dynamicRange, shaderProvider, completer);
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
        if (this.f11382e.getAndSet(true)) {
            return;
        }
        m62753n(new Runnable() { // from class: hF
            {
                DefaultSurfaceProcessor.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                DefaultSurfaceProcessor.m62759h(DefaultSurfaceProcessor.this);
            }
        });
    }

    @Override // androidx.camera.core.processing.SurfaceProcessorInternal
    @NonNull
    public ListenableFuture<Void> snapshot(@IntRange(from = 0, m64742to = 100) final int i, @IntRange(from = 0, m64742to = 359) final int i2) {
        return Futures.nonCancellationPropagating(CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: iF
            {
                DefaultSurfaceProcessor.this = this;
            }

            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                return DefaultSurfaceProcessor.m62765b(DefaultSurfaceProcessor.this, i, i2, completer);
            }
        }));
    }

    /* renamed from: t */
    public final /* synthetic */ void m62747t(Runnable runnable, Runnable runnable2) {
        if (this.f11387j) {
            runnable.run();
        } else {
            runnable2.run();
        }
    }

    /* renamed from: u */
    public final /* synthetic */ void m62746u(DynamicRange dynamicRange, ShaderProvider shaderProvider, CallbackToFutureAdapter.Completer completer) {
        try {
            this.f11378a.init(dynamicRange, shaderProvider);
            completer.set(null);
        } catch (RuntimeException e) {
            completer.setException(e);
        }
    }

    /* renamed from: v */
    public final /* synthetic */ Object m62745v(final DynamicRange dynamicRange, final ShaderProvider shaderProvider, final CallbackToFutureAdapter.Completer completer) {
        m62753n(new Runnable() { // from class: dF
            @Override // java.lang.Runnable
            public final void run() {
                DefaultSurfaceProcessor.m62758i(DefaultSurfaceProcessor.this, dynamicRange, shaderProvider, completer);
            }
        });
        return "Init GlRenderer";
    }

    /* renamed from: w */
    public final /* synthetic */ void m62744w(SurfaceTexture surfaceTexture, Surface surface, SurfaceRequest.Result result) {
        surfaceTexture.setOnFrameAvailableListener(null);
        surfaceTexture.release();
        surface.release();
        this.f11386i--;
        m62754m();
    }

    /* renamed from: x */
    public final /* synthetic */ void m62743x(SurfaceRequest surfaceRequest) {
        this.f11386i++;
        final SurfaceTexture surfaceTexture = new SurfaceTexture(this.f11378a.getTextureName());
        surfaceTexture.setDefaultBufferSize(surfaceRequest.getResolution().getWidth(), surfaceRequest.getResolution().getHeight());
        final Surface surface = new Surface(surfaceTexture);
        surfaceRequest.provideSurface(surface, this.f11380c, new Consumer() { // from class: mF
            @Override // androidx.core.util.Consumer
            public final void accept(Object obj) {
                DefaultSurfaceProcessor.m62757j(DefaultSurfaceProcessor.this, surfaceTexture, surface, (SurfaceRequest.Result) obj);
            }
        });
        surfaceTexture.setOnFrameAvailableListener(this, this.f11381d);
    }

    /* renamed from: y */
    public final /* synthetic */ void m62742y(SurfaceOutput surfaceOutput, SurfaceOutput.Event event) {
        surfaceOutput.close();
        Surface surface = (Surface) this.f11385h.remove(surfaceOutput);
        if (surface != null) {
            this.f11378a.unregisterOutputSurface(surface);
        }
    }

    /* renamed from: z */
    public final /* synthetic */ void m62741z(final SurfaceOutput surfaceOutput) {
        Surface surface = surfaceOutput.getSurface(this.f11380c, new Consumer() { // from class: jF
            {
                DefaultSurfaceProcessor.this = this;
            }

            @Override // androidx.core.util.Consumer
            public final void accept(Object obj) {
                DefaultSurfaceProcessor.m62764c(DefaultSurfaceProcessor.this, surfaceOutput, (SurfaceOutput.Event) obj);
            }
        });
        this.f11378a.registerOutputSurface(surface);
        this.f11385h.put(surfaceOutput, surface);
    }

    public DefaultSurfaceProcessor(DynamicRange dynamicRange, ShaderProvider shaderProvider) {
        this.f11382e = new AtomicBoolean(false);
        this.f11383f = new float[16];
        this.f11384g = new float[16];
        this.f11385h = new LinkedHashMap();
        this.f11386i = 0;
        this.f11387j = false;
        this.f11388k = new ArrayList();
        HandlerThread handlerThread = new HandlerThread("GL Thread");
        this.f11379b = handlerThread;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        this.f11381d = handler;
        this.f11380c = CameraXExecutors.newHandlerExecutor(handler);
        this.f11378a = new OpenGlRenderer();
        try {
            m62749r(dynamicRange, shaderProvider);
        } catch (RuntimeException e) {
            release();
            throw e;
        }
    }
}
