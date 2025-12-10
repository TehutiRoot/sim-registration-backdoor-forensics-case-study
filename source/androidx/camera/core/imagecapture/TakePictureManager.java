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
public class TakePictureManager implements ForwardingImageProxy.OnImageCloseListener, TakePictureRequest.InterfaceC2477a {

    /* renamed from: b */
    public final ImageCaptureControl f11036b;

    /* renamed from: c */
    public ImagePipeline f11037c;

    /* renamed from: d */
    public C2497m f11038d;

    /* renamed from: e */
    public final List f11039e;

    /* renamed from: a */
    public final Deque f11035a = new ArrayDeque();

    /* renamed from: f */
    public boolean f11040f = false;

    /* renamed from: androidx.camera.core.imagecapture.TakePictureManager$a */
    /* loaded from: classes.dex */
    public class C2476a implements FutureCallback {

        /* renamed from: a */
        public final /* synthetic */ CameraRequest f11041a;

        public C2476a(CameraRequest cameraRequest) {
            TakePictureManager.this = r1;
            this.f11041a = cameraRequest;
        }

        @Override // androidx.camera.core.impl.utils.futures.FutureCallback
        /* renamed from: a */
        public void onSuccess(Void r1) {
            TakePictureManager.this.f11036b.unlockFlashMode();
        }

        @Override // androidx.camera.core.impl.utils.futures.FutureCallback
        public void onFailure(Throwable th2) {
            if (this.f11041a.m63121b()) {
                return;
            }
            if (th2 instanceof ImageCaptureException) {
                TakePictureManager.this.f11037c.m63114g((ImageCaptureException) th2);
            } else {
                TakePictureManager.this.f11037c.m63114g(new ImageCaptureException(2, "Failed to submit capture request", th2));
            }
            TakePictureManager.this.f11036b.unlockFlashMode();
        }
    }

    @MainThread
    public TakePictureManager(@NonNull ImageCaptureControl imageCaptureControl) {
        Threads.checkMainThread();
        this.f11036b = imageCaptureControl;
        this.f11039e = new ArrayList();
    }

    /* renamed from: a */
    public static /* synthetic */ void m63088a(TakePictureManager takePictureManager) {
        takePictureManager.m63084e();
    }

    /* renamed from: b */
    public static /* synthetic */ void m63087b(TakePictureManager takePictureManager, C2497m c2497m) {
        takePictureManager.m63083f(c2497m);
    }

    @MainThread
    public void abortRequests() {
        Threads.checkMainThread();
        ImageCaptureException imageCaptureException = new ImageCaptureException(3, "Camera is closed.", null);
        for (TakePictureRequest takePictureRequest : this.f11035a) {
            takePictureRequest.m63071r(imageCaptureException);
        }
        this.f11035a.clear();
        for (C2497m c2497m : new ArrayList(this.f11039e)) {
            c2497m.m62987i(imageCaptureException);
        }
    }

    /* renamed from: c */
    public boolean m63086c() {
        if (this.f11038d != null) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public void m63085d() {
        TakePictureRequest takePictureRequest;
        Threads.checkMainThread();
        if (m63086c() || this.f11040f || this.f11037c.getCapacity() == 0 || (takePictureRequest = (TakePictureRequest) this.f11035a.poll()) == null) {
            return;
        }
        C2497m c2497m = new C2497m(takePictureRequest, this);
        m63081h(c2497m);
        Pair m63117d = this.f11037c.m63117d(takePictureRequest, c2497m, c2497m.m62984l());
        CameraRequest cameraRequest = (CameraRequest) m63117d.first;
        Objects.requireNonNull(cameraRequest);
        C21132mo1 c21132mo1 = (C21132mo1) m63117d.second;
        Objects.requireNonNull(c21132mo1);
        this.f11037c.m63113h(c21132mo1);
        c2497m.m62978r(m63082g(cameraRequest));
    }

    /* renamed from: e */
    public final /* synthetic */ void m63084e() {
        this.f11038d = null;
        m63085d();
    }

    /* renamed from: f */
    public final /* synthetic */ void m63083f(C2497m c2497m) {
        this.f11039e.remove(c2497m);
    }

    /* renamed from: g */
    public final ListenableFuture m63082g(CameraRequest cameraRequest) {
        Threads.checkMainThread();
        this.f11036b.lockFlashMode();
        ListenableFuture<Void> submitStillCaptureRequests = this.f11036b.submitStillCaptureRequests(cameraRequest.m63122a());
        Futures.addCallback(submitStillCaptureRequests, new C2476a(cameraRequest), CameraXExecutors.mainThreadExecutor());
        return submitStillCaptureRequests;
    }

    @NonNull
    @VisibleForTesting
    public ImagePipeline getImagePipeline() {
        return this.f11037c;
    }

    /* renamed from: h */
    public final void m63081h(final C2497m c2497m) {
        Preconditions.checkState(!m63086c());
        this.f11038d = c2497m;
        c2497m.m62984l().addListener(new Runnable() { // from class: RQ1
            {
                TakePictureManager.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                TakePictureManager.m63088a(TakePictureManager.this);
            }
        }, CameraXExecutors.directExecutor());
        this.f11039e.add(c2497m);
        c2497m.m62983m().addListener(new Runnable() { // from class: SQ1
            @Override // java.lang.Runnable
            public final void run() {
                TakePictureManager.m63087b(TakePictureManager.this, c2497m);
            }
        }, CameraXExecutors.directExecutor());
    }

    @MainThread
    public void offerRequest(@NonNull TakePictureRequest takePictureRequest) {
        Threads.checkMainThread();
        this.f11035a.offer(takePictureRequest);
        m63085d();
    }

    @Override // androidx.camera.core.ForwardingImageProxy.OnImageCloseListener
    public void onImageClose(@NonNull ImageProxy imageProxy) {
        CameraXExecutors.mainThreadExecutor().execute(new Runnable() { // from class: TQ1
            {
                TakePictureManager.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                TakePictureManager.this.m63085d();
            }
        });
    }

    @MainThread
    public void pause() {
        Threads.checkMainThread();
        this.f11040f = true;
        C2497m c2497m = this.f11038d;
        if (c2497m != null) {
            c2497m.m62986j();
        }
    }

    @MainThread
    public void resume() {
        Threads.checkMainThread();
        this.f11040f = false;
        m63085d();
    }

    @Override // androidx.camera.core.imagecapture.TakePictureRequest.InterfaceC2477a
    @MainThread
    public void retryRequest(@NonNull TakePictureRequest takePictureRequest) {
        Threads.checkMainThread();
        Logger.m63230d("TakePictureManager", "Add a new request for retrying.");
        this.f11035a.addFirst(takePictureRequest);
        m63085d();
    }

    @MainThread
    public void setImagePipeline(@NonNull ImagePipeline imagePipeline) {
        Threads.checkMainThread();
        this.f11037c = imagePipeline;
        imagePipeline.setOnImageCloseListener(this);
    }
}
