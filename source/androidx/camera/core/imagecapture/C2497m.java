package androidx.camera.core.imagecapture;

import androidx.camera.core.ImageCapture;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.imagecapture.C2497m;
import androidx.camera.core.imagecapture.TakePictureRequest;
import androidx.camera.core.impl.utils.Threads;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.core.util.Preconditions;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Objects;

/* renamed from: androidx.camera.core.imagecapture.m */
/* loaded from: classes.dex */
public class C2497m implements QQ1 {

    /* renamed from: a */
    public final TakePictureRequest f11077a;

    /* renamed from: b */
    public final TakePictureRequest.InterfaceC2477a f11078b;

    /* renamed from: e */
    public CallbackToFutureAdapter.Completer f11081e;

    /* renamed from: f */
    public CallbackToFutureAdapter.Completer f11082f;

    /* renamed from: h */
    public ListenableFuture f11084h;

    /* renamed from: g */
    public boolean f11083g = false;

    /* renamed from: c */
    public final ListenableFuture f11079c = CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: rx1
        {
            C2497m.this = this;
        }

        @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
        public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
            return C2497m.m62990f(C2497m.this, completer);
        }
    });

    /* renamed from: d */
    public final ListenableFuture f11080d = CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: sx1
        {
            C2497m.this = this;
        }

        @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
        public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
            return C2497m.m62989g(C2497m.this, completer);
        }
    });

    public C2497m(TakePictureRequest takePictureRequest, TakePictureRequest.InterfaceC2477a interfaceC2477a) {
        this.f11077a = takePictureRequest;
        this.f11078b = interfaceC2477a;
    }

    /* renamed from: f */
    public static /* synthetic */ Object m62990f(C2497m c2497m, CallbackToFutureAdapter.Completer completer) {
        return c2497m.m62982n(completer);
    }

    /* renamed from: g */
    public static /* synthetic */ Object m62989g(C2497m c2497m, CallbackToFutureAdapter.Completer completer) {
        return c2497m.m62981o(completer);
    }

    @Override // p000.QQ1
    /* renamed from: a */
    public void mo62995a(ImageCaptureException imageCaptureException) {
        Threads.checkMainThread();
        if (this.f11083g) {
            return;
        }
        m62985k();
        m62980p();
        m62979q(imageCaptureException);
    }

    @Override // p000.QQ1
    /* renamed from: b */
    public void mo62994b(ImageProxy imageProxy) {
        Threads.checkMainThread();
        if (this.f11083g) {
            return;
        }
        m62985k();
        m62980p();
        this.f11077a.m63069t(imageProxy);
    }

    @Override // p000.QQ1
    /* renamed from: c */
    public void mo62993c() {
        Threads.checkMainThread();
        if (this.f11083g) {
            return;
        }
        this.f11081e.set(null);
    }

    @Override // p000.QQ1
    /* renamed from: d */
    public void mo62992d(ImageCapture.OutputFileResults outputFileResults) {
        Threads.checkMainThread();
        if (this.f11083g) {
            return;
        }
        m62985k();
        m62980p();
        this.f11077a.m63070s(outputFileResults);
    }

    @Override // p000.QQ1
    /* renamed from: e */
    public void mo62991e(ImageCaptureException imageCaptureException) {
        Threads.checkMainThread();
        if (this.f11083g) {
            return;
        }
        boolean m63076d = this.f11077a.m63076d();
        if (!m63076d) {
            m62979q(imageCaptureException);
        }
        m62980p();
        this.f11081e.setException(imageCaptureException);
        if (m63076d) {
            this.f11078b.retryRequest(this.f11077a);
        }
    }

    /* renamed from: h */
    public final void m62988h(ImageCaptureException imageCaptureException) {
        Threads.checkMainThread();
        this.f11083g = true;
        ListenableFuture listenableFuture = this.f11084h;
        Objects.requireNonNull(listenableFuture);
        listenableFuture.cancel(true);
        this.f11081e.setException(imageCaptureException);
        this.f11082f.set(null);
    }

    /* renamed from: i */
    public void m62987i(ImageCaptureException imageCaptureException) {
        Threads.checkMainThread();
        if (this.f11080d.isDone()) {
            return;
        }
        m62988h(imageCaptureException);
        m62979q(imageCaptureException);
    }

    @Override // p000.QQ1
    public boolean isAborted() {
        return this.f11083g;
    }

    /* renamed from: j */
    public void m62986j() {
        Threads.checkMainThread();
        if (this.f11080d.isDone()) {
            return;
        }
        m62988h(new ImageCaptureException(3, "The request is aborted silently and retried.", null));
        this.f11078b.retryRequest(this.f11077a);
    }

    /* renamed from: k */
    public final void m62985k() {
        Preconditions.checkState(this.f11079c.isDone(), "onImageCaptured() must be called before onFinalResult()");
    }

    /* renamed from: l */
    public ListenableFuture m62984l() {
        Threads.checkMainThread();
        return this.f11079c;
    }

    /* renamed from: m */
    public ListenableFuture m62983m() {
        Threads.checkMainThread();
        return this.f11080d;
    }

    /* renamed from: n */
    public final /* synthetic */ Object m62982n(CallbackToFutureAdapter.Completer completer) {
        this.f11081e = completer;
        return "CaptureCompleteFuture";
    }

    /* renamed from: o */
    public final /* synthetic */ Object m62981o(CallbackToFutureAdapter.Completer completer) {
        this.f11082f = completer;
        return "RequestCompleteFuture";
    }

    /* renamed from: p */
    public final void m62980p() {
        Preconditions.checkState(!this.f11080d.isDone(), "The callback can only complete once.");
        this.f11082f.set(null);
    }

    /* renamed from: q */
    public final void m62979q(ImageCaptureException imageCaptureException) {
        Threads.checkMainThread();
        this.f11077a.m63071r(imageCaptureException);
    }

    /* renamed from: r */
    public void m62978r(ListenableFuture listenableFuture) {
        boolean z;
        Threads.checkMainThread();
        if (this.f11084h == null) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkState(z, "CaptureRequestFuture can only be set once.");
        this.f11084h = listenableFuture;
    }
}
