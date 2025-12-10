package androidx.camera.core;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Range;
import android.util.Size;
import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.StreamSpec;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.impl.utils.futures.FutureCallback;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.core.util.Consumer;
import androidx.core.util.Preconditions;
import com.google.auto.value.AutoValue;
import com.google.common.util.concurrent.ListenableFuture;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

@RequiresApi(21)
/* loaded from: classes.dex */
public final class SurfaceRequest {
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final Range<Integer> FRAME_RATE_RANGE_UNSPECIFIED = StreamSpec.FRAME_RATE_RANGE_UNSPECIFIED;

    /* renamed from: a */
    public final Object f10891a;

    /* renamed from: b */
    public final Size f10892b;

    /* renamed from: c */
    public final DynamicRange f10893c;

    /* renamed from: d */
    public final Range f10894d;

    /* renamed from: e */
    public final CameraInternal f10895e;

    /* renamed from: f */
    public final ListenableFuture f10896f;

    /* renamed from: g */
    public final CallbackToFutureAdapter.Completer f10897g;

    /* renamed from: h */
    public final ListenableFuture f10898h;

    /* renamed from: i */
    public final CallbackToFutureAdapter.Completer f10899i;

    /* renamed from: j */
    public final CallbackToFutureAdapter.Completer f10900j;

    /* renamed from: k */
    public final DeferrableSurface f10901k;

    /* renamed from: l */
    public TransformationInfo f10902l;

    /* renamed from: m */
    public TransformationInfoListener f10903m;

    /* renamed from: n */
    public Executor f10904n;

    /* loaded from: classes.dex */
    public static final class RequestCancelledException extends RuntimeException {
        public RequestCancelledException(@NonNull String str, @NonNull Throwable th2) {
            super(str, th2);
        }
    }

    @AutoValue
    /* loaded from: classes.dex */
    public static abstract class Result {
        public static final int RESULT_INVALID_SURFACE = 2;
        public static final int RESULT_REQUEST_CANCELLED = 1;
        public static final int RESULT_SURFACE_ALREADY_PROVIDED = 3;
        public static final int RESULT_SURFACE_USED_SUCCESSFULLY = 0;
        public static final int RESULT_WILL_NOT_PROVIDE_SURFACE = 4;

        @Retention(RetentionPolicy.SOURCE)
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        /* loaded from: classes.dex */
        public @interface ResultCode {
        }

        /* renamed from: a */
        public static Result m63168a(int i, Surface surface) {
            return new C2466f(i, surface);
        }

        public abstract int getResultCode();

        @NonNull
        public abstract Surface getSurface();
    }

    @AutoValue
    /* loaded from: classes.dex */
    public static abstract class TransformationInfo {
        @NonNull
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        /* renamed from: of */
        public static TransformationInfo m63167of(@NonNull Rect rect, int i, int i2, boolean z, @NonNull Matrix matrix, boolean z2) {
            return new C2467g(rect, i, i2, z, matrix, z2);
        }

        @NonNull
        public abstract Rect getCropRect();

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public abstract boolean getMirroring();

        public abstract int getRotationDegrees();

        @NonNull
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public abstract Matrix getSensorToBufferTransform();

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public abstract int getTargetRotation();

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public abstract boolean hasCameraTransform();
    }

    /* loaded from: classes.dex */
    public interface TransformationInfoListener {
        void onTransformationInfoUpdate(@NonNull TransformationInfo transformationInfo);
    }

    /* renamed from: androidx.camera.core.SurfaceRequest$a */
    /* loaded from: classes.dex */
    public class C2452a implements FutureCallback {

        /* renamed from: a */
        public final /* synthetic */ CallbackToFutureAdapter.Completer f10905a;

        /* renamed from: b */
        public final /* synthetic */ ListenableFuture f10906b;

        public C2452a(CallbackToFutureAdapter.Completer completer, ListenableFuture listenableFuture) {
            SurfaceRequest.this = r1;
            this.f10905a = completer;
            this.f10906b = listenableFuture;
        }

        @Override // androidx.camera.core.impl.utils.futures.FutureCallback
        /* renamed from: a */
        public void onSuccess(Void r2) {
            Preconditions.checkState(this.f10905a.set(null));
        }

        @Override // androidx.camera.core.impl.utils.futures.FutureCallback
        public void onFailure(Throwable th2) {
            if (th2 instanceof RequestCancelledException) {
                Preconditions.checkState(this.f10906b.cancel(false));
            } else {
                Preconditions.checkState(this.f10905a.set(null));
            }
        }
    }

    /* renamed from: androidx.camera.core.SurfaceRequest$b */
    /* loaded from: classes.dex */
    public class C2453b extends DeferrableSurface {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2453b(Size size, int i) {
            super(size, i);
            SurfaceRequest.this = r1;
        }

        @Override // androidx.camera.core.impl.DeferrableSurface
        public ListenableFuture provideSurface() {
            return SurfaceRequest.this.f10896f;
        }
    }

    /* renamed from: androidx.camera.core.SurfaceRequest$c */
    /* loaded from: classes.dex */
    public class C2454c implements FutureCallback {

        /* renamed from: a */
        public final /* synthetic */ ListenableFuture f10909a;

        /* renamed from: b */
        public final /* synthetic */ CallbackToFutureAdapter.Completer f10910b;

        /* renamed from: c */
        public final /* synthetic */ String f10911c;

        public C2454c(ListenableFuture listenableFuture, CallbackToFutureAdapter.Completer completer, String str) {
            SurfaceRequest.this = r1;
            this.f10909a = listenableFuture;
            this.f10910b = completer;
            this.f10911c = str;
        }

        @Override // androidx.camera.core.impl.utils.futures.FutureCallback
        /* renamed from: a */
        public void onSuccess(Surface surface) {
            Futures.propagate(this.f10909a, this.f10910b);
        }

        @Override // androidx.camera.core.impl.utils.futures.FutureCallback
        public void onFailure(Throwable th2) {
            if (th2 instanceof CancellationException) {
                CallbackToFutureAdapter.Completer completer = this.f10910b;
                Preconditions.checkState(completer.setException(new RequestCancelledException(this.f10911c + " cancelled.", th2)));
                return;
            }
            this.f10910b.set(null);
        }
    }

    /* renamed from: androidx.camera.core.SurfaceRequest$d */
    /* loaded from: classes.dex */
    public class C2455d implements FutureCallback {

        /* renamed from: a */
        public final /* synthetic */ Consumer f10913a;

        /* renamed from: b */
        public final /* synthetic */ Surface f10914b;

        public C2455d(Consumer consumer, Surface surface) {
            SurfaceRequest.this = r1;
            this.f10913a = consumer;
            this.f10914b = surface;
        }

        @Override // androidx.camera.core.impl.utils.futures.FutureCallback
        /* renamed from: a */
        public void onSuccess(Void r3) {
            this.f10913a.accept(Result.m63168a(0, this.f10914b));
        }

        @Override // androidx.camera.core.impl.utils.futures.FutureCallback
        public void onFailure(Throwable th2) {
            Preconditions.checkState(th2 instanceof RequestCancelledException, "Camera surface session should only fail with request cancellation. Instead failed due to:\n" + th2);
            this.f10913a.accept(Result.m63168a(1, this.f10914b));
        }
    }

    /* renamed from: androidx.camera.core.SurfaceRequest$e */
    /* loaded from: classes.dex */
    public class C2456e implements FutureCallback {

        /* renamed from: a */
        public final /* synthetic */ Runnable f10916a;

        public C2456e(Runnable runnable) {
            SurfaceRequest.this = r1;
            this.f10916a = runnable;
        }

        @Override // androidx.camera.core.impl.utils.futures.FutureCallback
        /* renamed from: a */
        public void onSuccess(Void r1) {
            this.f10916a.run();
        }

        @Override // androidx.camera.core.impl.utils.futures.FutureCallback
        public void onFailure(Throwable th2) {
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public SurfaceRequest(@NonNull Size size, @NonNull CameraInternal cameraInternal, @NonNull Runnable runnable) {
        this(size, cameraInternal, DynamicRange.SDR, FRAME_RATE_RANGE_UNSPECIFIED, runnable);
    }

    /* renamed from: l */
    public static /* synthetic */ Object m63176l(AtomicReference atomicReference, String str, CallbackToFutureAdapter.Completer completer) {
        atomicReference.set(completer);
        return str + "-cancellation";
    }

    /* renamed from: m */
    public static /* synthetic */ Object m63175m(AtomicReference atomicReference, String str, CallbackToFutureAdapter.Completer completer) {
        atomicReference.set(completer);
        return str + "-status";
    }

    /* renamed from: n */
    public static /* synthetic */ Object m63174n(AtomicReference atomicReference, String str, CallbackToFutureAdapter.Completer completer) {
        atomicReference.set(completer);
        return str + "-Surface";
    }

    /* renamed from: p */
    public static /* synthetic */ void m63172p(Consumer consumer, Surface surface) {
        consumer.accept(Result.m63168a(3, surface));
    }

    /* renamed from: q */
    public static /* synthetic */ void m63171q(Consumer consumer, Surface surface) {
        consumer.accept(Result.m63168a(4, surface));
    }

    @SuppressLint({"PairedRegistration"})
    public void addRequestCancellationListener(@NonNull Executor executor, @NonNull Runnable runnable) {
        this.f10900j.addCancellationListener(runnable, executor);
    }

    public void clearTransformationInfoListener() {
        synchronized (this.f10891a) {
            this.f10903m = null;
            this.f10904n = null;
        }
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public CameraInternal getCamera() {
        return this.f10895e;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public DeferrableSurface getDeferrableSurface() {
        return this.f10901k;
    }

    @NonNull
    public DynamicRange getDynamicRange() {
        return this.f10893c;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public Range<Integer> getExpectedFrameRate() {
        return this.f10894d;
    }

    @NonNull
    public Size getResolution() {
        return this.f10892b;
    }

    public boolean invalidate() {
        willNotProvideSurface();
        return this.f10899i.set(null);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public boolean isServiced() {
        return this.f10896f.isDone();
    }

    /* renamed from: j */
    public final CallbackToFutureAdapter.Completer m63178j(Executor executor, Runnable runnable) {
        final AtomicReference atomicReference = new AtomicReference(null);
        Futures.addCallback(CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: IP1
            {
                SurfaceRequest.this = this;
            }

            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                Object m63177k;
                m63177k = SurfaceRequest.this.m63177k(atomicReference, completer);
                return m63177k;
            }
        }), new C2456e(runnable), executor);
        return (CallbackToFutureAdapter.Completer) Preconditions.checkNotNull((CallbackToFutureAdapter.Completer) atomicReference.get());
    }

    /* renamed from: k */
    public final /* synthetic */ Object m63177k(AtomicReference atomicReference, CallbackToFutureAdapter.Completer completer) {
        atomicReference.set(completer);
        return "SurfaceRequest-surface-recreation(" + hashCode() + ")";
    }

    /* renamed from: o */
    public final /* synthetic */ void m63173o() {
        this.f10896f.cancel(true);
    }

    public void provideSurface(@NonNull final Surface surface, @NonNull Executor executor, @NonNull final Consumer<Result> consumer) {
        if (!this.f10897g.set(surface) && !this.f10896f.isCancelled()) {
            Preconditions.checkState(this.f10896f.isDone());
            try {
                this.f10896f.get();
                executor.execute(new Runnable() { // from class: CP1
                    @Override // java.lang.Runnable
                    public final void run() {
                        SurfaceRequest.m63172p(consumer, surface);
                    }
                });
                return;
            } catch (InterruptedException | ExecutionException unused) {
                executor.execute(new Runnable() { // from class: DP1
                    @Override // java.lang.Runnable
                    public final void run() {
                        SurfaceRequest.m63171q(consumer, surface);
                    }
                });
                return;
            }
        }
        Futures.addCallback(this.f10898h, new C2455d(consumer, surface), executor);
    }

    public void setTransformationInfoListener(@NonNull Executor executor, @NonNull final TransformationInfoListener transformationInfoListener) {
        final TransformationInfo transformationInfo;
        synchronized (this.f10891a) {
            this.f10903m = transformationInfoListener;
            this.f10904n = executor;
            transformationInfo = this.f10902l;
        }
        if (transformationInfo != null) {
            executor.execute(new Runnable() { // from class: BP1
                @Override // java.lang.Runnable
                public final void run() {
                    transformationInfoListener.onTransformationInfoUpdate(transformationInfo);
                }
            });
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void updateTransformationInfo(@NonNull final TransformationInfo transformationInfo) {
        final TransformationInfoListener transformationInfoListener;
        Executor executor;
        synchronized (this.f10891a) {
            this.f10902l = transformationInfo;
            transformationInfoListener = this.f10903m;
            executor = this.f10904n;
        }
        if (transformationInfoListener != null && executor != null) {
            executor.execute(new Runnable() { // from class: AP1
                @Override // java.lang.Runnable
                public final void run() {
                    transformationInfoListener.onTransformationInfoUpdate(transformationInfo);
                }
            });
        }
    }

    public boolean willNotProvideSurface() {
        return this.f10897g.setException(new DeferrableSurface.SurfaceUnavailableException("Surface request will not complete."));
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public SurfaceRequest(@NonNull Size size, @NonNull CameraInternal cameraInternal, @NonNull DynamicRange dynamicRange, @NonNull Range<Integer> range, @NonNull Runnable runnable) {
        this.f10891a = new Object();
        this.f10892b = size;
        this.f10895e = cameraInternal;
        this.f10893c = dynamicRange;
        this.f10894d = range;
        final String str = "SurfaceRequest[size: " + size + ", id: " + hashCode() + "]";
        final AtomicReference atomicReference = new AtomicReference(null);
        ListenableFuture future = CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: EP1
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                Object m63176l;
                m63176l = SurfaceRequest.m63176l(atomicReference, str, completer);
                return m63176l;
            }
        });
        CallbackToFutureAdapter.Completer completer = (CallbackToFutureAdapter.Completer) Preconditions.checkNotNull((CallbackToFutureAdapter.Completer) atomicReference.get());
        this.f10900j = completer;
        final AtomicReference atomicReference2 = new AtomicReference(null);
        ListenableFuture future2 = CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: FP1
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final Object attachCompleter(CallbackToFutureAdapter.Completer completer2) {
                Object m63175m;
                m63175m = SurfaceRequest.m63175m(atomicReference2, str, completer2);
                return m63175m;
            }
        });
        this.f10898h = future2;
        Futures.addCallback(future2, new C2452a(completer, future), CameraXExecutors.directExecutor());
        final AtomicReference atomicReference3 = new AtomicReference(null);
        ListenableFuture future3 = CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: GP1
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final Object attachCompleter(CallbackToFutureAdapter.Completer completer2) {
                Object m63174n;
                m63174n = SurfaceRequest.m63174n(atomicReference3, str, completer2);
                return m63174n;
            }
        });
        this.f10896f = future3;
        this.f10897g = (CallbackToFutureAdapter.Completer) Preconditions.checkNotNull((CallbackToFutureAdapter.Completer) atomicReference3.get());
        C2453b c2453b = new C2453b(size, 34);
        this.f10901k = c2453b;
        ListenableFuture<Void> terminationFuture = c2453b.getTerminationFuture();
        Futures.addCallback(future3, new C2454c(terminationFuture, (CallbackToFutureAdapter.Completer) Preconditions.checkNotNull((CallbackToFutureAdapter.Completer) atomicReference2.get()), str), CameraXExecutors.directExecutor());
        terminationFuture.addListener(new Runnable() { // from class: HP1
            {
                SurfaceRequest.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                SurfaceRequest.this.m63173o();
            }
        }, CameraXExecutors.directExecutor());
        this.f10899i = m63178j(CameraXExecutors.directExecutor(), runnable);
    }
}
