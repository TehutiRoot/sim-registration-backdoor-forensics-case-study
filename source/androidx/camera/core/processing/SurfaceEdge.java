package androidx.camera.core.processing;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;
import android.view.Surface;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import androidx.camera.core.SurfaceOutput;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.StreamSpec;
import androidx.camera.core.impl.utils.Threads;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.impl.utils.futures.AsyncFunction;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.camera.core.processing.SurfaceEdge;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.core.util.Preconditions;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@RequiresApi(api = 21)
/* loaded from: classes.dex */
public class SurfaceEdge {

    /* renamed from: a */
    public final int f11418a;

    /* renamed from: b */
    public final Matrix f11419b;

    /* renamed from: c */
    public final boolean f11420c;

    /* renamed from: d */
    public final Rect f11421d;

    /* renamed from: e */
    public final boolean f11422e;

    /* renamed from: f */
    public final int f11423f;

    /* renamed from: g */
    public final StreamSpec f11424g;

    /* renamed from: h */
    public int f11425h;

    /* renamed from: i */
    public int f11426i;

    /* renamed from: j */
    public C22272tP1 f11427j;

    /* renamed from: l */
    public SurfaceRequest f11429l;

    /* renamed from: m */
    public C2558a f11430m;

    /* renamed from: k */
    public boolean f11428k = false;

    /* renamed from: n */
    public final Set f11431n = new HashSet();

    /* renamed from: o */
    public boolean f11432o = false;

    /* renamed from: androidx.camera.core.processing.SurfaceEdge$a */
    /* loaded from: classes.dex */
    public static class C2558a extends DeferrableSurface {

        /* renamed from: n */
        public final ListenableFuture f11433n;

        /* renamed from: o */
        public CallbackToFutureAdapter.Completer f11434o;

        /* renamed from: p */
        public DeferrableSurface f11435p;

        public C2558a(Size size, int i) {
            super(size, i);
            this.f11433n = CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: oP1
                {
                    SurfaceEdge.C2558a.this = this;
                }

                @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
                public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                    Object m62688d;
                    m62688d = SurfaceEdge.C2558a.this.m62688d(completer);
                    return m62688d;
                }
            });
        }

        /* renamed from: d */
        public final /* synthetic */ Object m62688d(CallbackToFutureAdapter.Completer completer) {
            this.f11434o = completer;
            return "SettableFuture hashCode: " + hashCode();
        }

        /* renamed from: i */
        public boolean m62686i() {
            Threads.checkMainThread();
            if (this.f11435p == null && !isClosed()) {
                return true;
            }
            return false;
        }

        /* renamed from: j */
        public boolean m62685j() {
            if (this.f11435p != null) {
                return true;
            }
            return false;
        }

        /* renamed from: k */
        public boolean m62684k(final DeferrableSurface deferrableSurface, Runnable runnable) {
            boolean z;
            Threads.checkMainThread();
            Preconditions.checkNotNull(deferrableSurface);
            DeferrableSurface deferrableSurface2 = this.f11435p;
            boolean z2 = false;
            if (deferrableSurface2 == deferrableSurface) {
                return false;
            }
            if (deferrableSurface2 == null) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkState(z, "A different provider has been set. To change the provider, call SurfaceEdge#invalidate before calling SurfaceEdge#setProvider");
            Preconditions.checkArgument(getPrescribedSize().equals(deferrableSurface.getPrescribedSize()), "The provider's size must match the parent");
            if (getPrescribedStreamFormat() == deferrableSurface.getPrescribedStreamFormat()) {
                z2 = true;
            }
            Preconditions.checkArgument(z2, "The provider's format must match the parent");
            Preconditions.checkState(!isClosed(), "The parent is closed. Call SurfaceEdge#invalidate() before setting a new provider.");
            this.f11435p = deferrableSurface;
            Futures.propagate(deferrableSurface.getSurface(), this.f11434o);
            deferrableSurface.incrementUseCount();
            getTerminationFuture().addListener(new Runnable() { // from class: pP1
                @Override // java.lang.Runnable
                public final void run() {
                    DeferrableSurface.this.decrementUseCount();
                }
            }, CameraXExecutors.directExecutor());
            deferrableSurface.getCloseFuture().addListener(runnable, CameraXExecutors.mainThreadExecutor());
            return true;
        }

        @Override // androidx.camera.core.impl.DeferrableSurface
        public ListenableFuture provideSurface() {
            return this.f11433n;
        }
    }

    public SurfaceEdge(int i, int i2, @NonNull StreamSpec streamSpec, @NonNull Matrix matrix, boolean z, @NonNull Rect rect, int i3, int i4, boolean z2) {
        this.f11423f = i;
        this.f11418a = i2;
        this.f11424g = streamSpec;
        this.f11419b = matrix;
        this.f11420c = z;
        this.f11421d = rect;
        this.f11426i = i3;
        this.f11425h = i4;
        this.f11422e = z2;
        this.f11430m = new C2558a(streamSpec.getResolution(), i2);
    }

    @MainThread
    public void addOnInvalidatedListener(@NonNull Runnable runnable) {
        Threads.checkMainThread();
        m62695g();
        this.f11431n.add(runnable);
    }

    @MainThread
    public final void close() {
        Threads.checkMainThread();
        m62694h();
        this.f11432o = true;
    }

    @NonNull
    @MainThread
    public ListenableFuture<SurfaceOutput> createSurfaceOutputFuture(@NonNull final Size size, final int i, @NonNull final Rect rect, final int i2, final boolean z, @Nullable final CameraInternal cameraInternal) {
        Threads.checkMainThread();
        m62695g();
        m62696f();
        final C2558a c2558a = this.f11430m;
        return Futures.transformAsync(c2558a.getSurface(), new AsyncFunction() { // from class: lP1
            @Override // androidx.camera.core.impl.utils.futures.AsyncFunction
            public final ListenableFuture apply(Object obj) {
                ListenableFuture m62693i;
                m62693i = SurfaceEdge.this.m62693i(c2558a, i, size, rect, i2, z, cameraInternal, (Surface) obj);
                return m62693i;
            }
        }, CameraXExecutors.mainThreadExecutor());
    }

    @NonNull
    @MainThread
    public SurfaceRequest createSurfaceRequest(@NonNull CameraInternal cameraInternal) {
        Threads.checkMainThread();
        m62695g();
        SurfaceRequest surfaceRequest = new SurfaceRequest(this.f11424g.getResolution(), cameraInternal, this.f11424g.getDynamicRange(), this.f11424g.getExpectedFrameRateRange(), new Runnable() { // from class: hP1
            {
                SurfaceEdge.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                SurfaceEdge.this.m62691k();
            }
        });
        try {
            final DeferrableSurface deferrableSurface = surfaceRequest.getDeferrableSurface();
            if (this.f11430m.m62684k(deferrableSurface, new RunnableC20380iP1(this))) {
                ListenableFuture<Void> terminationFuture = this.f11430m.getTerminationFuture();
                Objects.requireNonNull(deferrableSurface);
                terminationFuture.addListener(new Runnable() { // from class: jP1
                    @Override // java.lang.Runnable
                    public final void run() {
                        DeferrableSurface.this.close();
                    }
                }, CameraXExecutors.directExecutor());
            }
            this.f11429l = surfaceRequest;
            m62689m();
            return surfaceRequest;
        } catch (DeferrableSurface.SurfaceClosedException e) {
            throw new AssertionError("Surface is somehow already closed", e);
        } catch (RuntimeException e2) {
            surfaceRequest.willNotProvideSurface();
            throw e2;
        }
    }

    @MainThread
    public final void disconnect() {
        Threads.checkMainThread();
        m62695g();
        m62694h();
    }

    /* renamed from: f */
    public final void m62696f() {
        Preconditions.checkState(!this.f11428k, "Consumer can only be linked once.");
        this.f11428k = true;
    }

    /* renamed from: g */
    public final void m62695g() {
        Preconditions.checkState(!this.f11432o, "Edge is already closed.");
    }

    @NonNull
    public Rect getCropRect() {
        return this.f11421d;
    }

    @NonNull
    @MainThread
    public DeferrableSurface getDeferrableSurface() {
        Threads.checkMainThread();
        m62695g();
        m62696f();
        return this.f11430m;
    }

    @NonNull
    @VisibleForTesting
    public DeferrableSurface getDeferrableSurfaceForTesting() {
        return this.f11430m;
    }

    public int getFormat() {
        return this.f11418a;
    }

    public boolean getMirroring() {
        return this.f11422e;
    }

    public int getRotationDegrees() {
        return this.f11426i;
    }

    @NonNull
    public Matrix getSensorToBufferTransform() {
        return this.f11419b;
    }

    @NonNull
    public StreamSpec getStreamSpec() {
        return this.f11424g;
    }

    public int getTargets() {
        return this.f11423f;
    }

    /* renamed from: h */
    public final void m62694h() {
        Threads.checkMainThread();
        this.f11430m.close();
        C22272tP1 c22272tP1 = this.f11427j;
        if (c22272tP1 != null) {
            c22272tP1.m22439m();
            this.f11427j = null;
        }
    }

    public boolean hasCameraTransform() {
        return this.f11420c;
    }

    @VisibleForTesting
    public boolean hasProvider() {
        return this.f11430m.m62685j();
    }

    /* renamed from: i */
    public final /* synthetic */ ListenableFuture m62693i(final C2558a c2558a, int i, Size size, Rect rect, int i2, boolean z, CameraInternal cameraInternal, Surface surface) {
        Preconditions.checkNotNull(surface);
        try {
            c2558a.incrementUseCount();
            C22272tP1 c22272tP1 = new C22272tP1(surface, getTargets(), i, this.f11424g.getResolution(), size, rect, i2, z, cameraInternal, this.f11419b);
            c22272tP1.m22442j().addListener(new Runnable() { // from class: nP1
                @Override // java.lang.Runnable
                public final void run() {
                    SurfaceEdge.C2558a.this.decrementUseCount();
                }
            }, CameraXExecutors.directExecutor());
            this.f11427j = c22272tP1;
            return Futures.immediateFuture(c22272tP1);
        } catch (DeferrableSurface.SurfaceClosedException e) {
            return Futures.immediateFailedFuture(e);
        }
    }

    @MainThread
    public void invalidate() {
        Threads.checkMainThread();
        m62695g();
        if (this.f11430m.m62686i()) {
            return;
        }
        m62694h();
        this.f11428k = false;
        this.f11430m = new C2558a(this.f11424g.getResolution(), this.f11418a);
        for (Runnable runnable : this.f11431n) {
            runnable.run();
        }
    }

    @VisibleForTesting
    public boolean isClosed() {
        return this.f11432o;
    }

    /* renamed from: j */
    public final /* synthetic */ void m62692j() {
        if (!this.f11432o) {
            invalidate();
        }
    }

    /* renamed from: k */
    public final /* synthetic */ void m62691k() {
        CameraXExecutors.mainThreadExecutor().execute(new Runnable() { // from class: mP1
            {
                SurfaceEdge.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                SurfaceEdge.this.m62692j();
            }
        });
    }

    /* renamed from: l */
    public final /* synthetic */ void m62690l(int i, int i2) {
        boolean z;
        boolean z2 = true;
        if (this.f11426i != i) {
            this.f11426i = i;
            z = true;
        } else {
            z = false;
        }
        if (this.f11425h != i2) {
            this.f11425h = i2;
        } else {
            z2 = z;
        }
        if (z2) {
            m62689m();
        }
    }

    /* renamed from: m */
    public final void m62689m() {
        Threads.checkMainThread();
        SurfaceRequest surfaceRequest = this.f11429l;
        if (surfaceRequest != null) {
            surfaceRequest.updateTransformationInfo(SurfaceRequest.TransformationInfo.m63167of(this.f11421d, this.f11426i, this.f11425h, hasCameraTransform(), this.f11419b, this.f11422e));
        }
    }

    @MainThread
    public void setProvider(@NonNull DeferrableSurface deferrableSurface) throws DeferrableSurface.SurfaceClosedException {
        Threads.checkMainThread();
        m62695g();
        this.f11430m.m62684k(deferrableSurface, new RunnableC20380iP1(this));
    }

    public void updateTransformation(int i) {
        updateTransformation(i, -1);
    }

    public void updateTransformation(final int i, final int i2) {
        Threads.runOnMain(new Runnable() { // from class: kP1
            {
                SurfaceEdge.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                SurfaceEdge.this.m62690l(i, i2);
            }
        });
    }
}
