package androidx.camera.core.imagecapture;

import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import androidx.camera.core.ForwardingImageProxy;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.Logger;
import androidx.camera.core.imagecapture.TakePictureManager;
import androidx.camera.core.imagecapture.TakePictureRequest;
import androidx.camera.core.impl.utils.Threads;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.impl.utils.futures.FutureCallback;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.core.util.Pair;
import androidx.core.util.Preconditions;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.Objects;

@RequiresApi(api = 21)
/* loaded from: classes.dex */
public class TakePictureManager implements ForwardingImageProxy.OnImageCloseListener, TakePictureRequest.InterfaceC2459a {

    /* renamed from: b */
    public final ImageCaptureControl f11124b;

    /* renamed from: c */
    public ImagePipeline f11125c;

    /* renamed from: d */
    public C2479m f11126d;

    /* renamed from: e */
    public final List f11127e;

    /* renamed from: a */
    public final Deque f11123a = new ArrayDeque();

    /* renamed from: f */
    public boolean f11128f = false;

    /* renamed from: androidx.camera.core.imagecapture.TakePictureManager$a */
    /* loaded from: classes.dex */
    public class C2458a implements FutureCallback {

        /* renamed from: a */
        public final /* synthetic */ CameraRequest f11129a;

        public C2458a(CameraRequest cameraRequest) {
            TakePictureManager.this = r1;
            this.f11129a = cameraRequest;
        }

        @Override // androidx.camera.core.impl.utils.futures.FutureCallback
        /* renamed from: a */
        public void onSuccess(Void r1) {
            TakePictureManager.this.f11124b.unlockFlashMode();
        }

        @Override // androidx.camera.core.impl.utils.futures.FutureCallback
        public void onFailure(Throwable th2) {
            if (this.f11129a.m63069b()) {
                return;
            }
            if (th2 instanceof ImageCaptureException) {
                TakePictureManager.this.f11125c.m63062g((ImageCaptureException) th2);
            } else {
                TakePictureManager.this.f11125c.m63062g(new ImageCaptureException(2, "Failed to submit capture request", th2));
            }
            TakePictureManager.this.f11124b.unlockFlashMode();
        }
    }

    @MainThread
    public TakePictureManager(@NonNull ImageCaptureControl imageCaptureControl) {
        Threads.checkMainThread();
        this.f11124b = imageCaptureControl;
        this.f11127e = new ArrayList();
    }

    /* renamed from: a */
    public static /* synthetic */ void m63036a(TakePictureManager takePictureManager) {
        takePictureManager.m63032e();
    }

    /* renamed from: b */
    public static /* synthetic */ void m63035b(TakePictureManager takePictureManager, C2479m c2479m) {
        takePictureManager.m63031f(c2479m);
    }

    @MainThread
    public void abortRequests() {
        Threads.checkMainThread();
        ImageCaptureException imageCaptureException = new ImageCaptureException(3, "Camera is closed.", null);
        for (TakePictureRequest takePictureRequest : this.f11123a) {
            takePictureRequest.m63019r(imageCaptureException);
        }
        this.f11123a.clear();
        for (C2479m c2479m : new ArrayList(this.f11127e)) {
            c2479m.m62935i(imageCaptureException);
        }
    }

    /* renamed from: c */
    public boolean m63034c() {
        if (this.f11126d != null) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public void m63033d() {
        TakePictureRequest takePictureRequest;
        Threads.checkMainThread();
        if (m63034c() || this.f11128f || this.f11125c.getCapacity() == 0 || (takePictureRequest = (TakePictureRequest) this.f11123a.poll()) == null) {
            return;
        }
        C2479m c2479m = new C2479m(takePictureRequest, this);
        m63029h(c2479m);
        Pair m63065d = this.f11125c.m63065d(takePictureRequest, c2479m, c2479m.m62932l());
        CameraRequest cameraRequest = (CameraRequest) m63065d.first;
        Objects.requireNonNull(cameraRequest);
        C20675jp1 c20675jp1 = (C20675jp1) m63065d.second;
        Objects.requireNonNull(c20675jp1);
        this.f11125c.m63061h(c20675jp1);
        c2479m.m62926r(m63030g(cameraRequest));
    }

    /* renamed from: e */
    public final /* synthetic */ void m63032e() {
        this.f11126d = null;
        m63033d();
    }

    /* renamed from: f */
    public final /* synthetic */ void m63031f(C2479m c2479m) {
        this.f11127e.remove(c2479m);
    }

    /* renamed from: g */
    public final ListenableFuture m63030g(CameraRequest cameraRequest) {
        Threads.checkMainThread();
        this.f11124b.lockFlashMode();
        ListenableFuture<Void> submitStillCaptureRequests = this.f11124b.submitStillCaptureRequests(cameraRequest.m63070a());
        Futures.addCallback(submitStillCaptureRequests, new C2458a(cameraRequest), CameraXExecutors.mainThreadExecutor());
        return submitStillCaptureRequests;
    }

    @NonNull
    @VisibleForTesting
    public ImagePipeline getImagePipeline() {
        return this.f11125c;
    }

    /* renamed from: h */
    public final void m63029h(final C2479m c2479m) {
        Preconditions.checkState(!m63034c());
        this.f11126d = c2479m;
        c2479m.m62932l().addListener(new Runnable() { // from class: OR1
            @Override // java.lang.Runnable
            public final void run() {
                TakePictureManager.m63036a(TakePictureManager.this);
            }
        }, CameraXExecutors.directExecutor());
        this.f11127e.add(c2479m);
        c2479m.m62931m().addListener(new Runnable() { // from class: PR1
            @Override // java.lang.Runnable
            public final void run() {
                TakePictureManager.m63035b(TakePictureManager.this, c2479m);
            }
        }, CameraXExecutors.directExecutor());
    }

    @MainThread
    public void offerRequest(@NonNull TakePictureRequest takePictureRequest) {
        Threads.checkMainThread();
        this.f11123a.offer(takePictureRequest);
        m63033d();
    }

    @Override // androidx.camera.core.ForwardingImageProxy.OnImageCloseListener
    public void onImageClose(@NonNull ImageProxy imageProxy) {
        CameraXExecutors.mainThreadExecutor().execute(new Runnable() { // from class: QR1
            @Override // java.lang.Runnable
            public final void run() {
                TakePictureManager.this.m63033d();
            }
        });
    }

    @MainThread
    public void pause() {
        Threads.checkMainThread();
        this.f11128f = true;
        C2479m c2479m = this.f11126d;
        if (c2479m != null) {
            c2479m.m62934j();
        }
    }

    @MainThread
    public void resume() {
        Threads.checkMainThread();
        this.f11128f = false;
        m63033d();
    }

    @Override // androidx.camera.core.imagecapture.TakePictureRequest.InterfaceC2459a
    @MainThread
    public void retryRequest(@NonNull TakePictureRequest takePictureRequest) {
        Threads.checkMainThread();
        Logger.m63178d("TakePictureManager", "Add a new request for retrying.");
        this.f11123a.addFirst(takePictureRequest);
        m63033d();
    }

    @MainThread
    public void setImagePipeline(@NonNull ImagePipeline imagePipeline) {
        Threads.checkMainThread();
        this.f11125c = imagePipeline;
        imagePipeline.setOnImageCloseListener(this);
    }
}