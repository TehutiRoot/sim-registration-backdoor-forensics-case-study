package p000;

import androidx.camera.core.AbstractC2450h;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.impl.ImageReaderProxy;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.impl.utils.futures.FutureCallback;
import androidx.camera.core.impl.utils.futures.Futures;

/* renamed from: Xc0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C18785Xc0 extends AbstractC2450h {
    @Override // androidx.camera.core.AbstractC2450h
    /* renamed from: c */
    public ImageProxy mo63079c(ImageReaderProxy imageReaderProxy) {
        return imageReaderProxy.acquireNextImage();
    }

    @Override // androidx.camera.core.AbstractC2450h
    /* renamed from: n */
    public void mo63077n(ImageProxy imageProxy) {
        Futures.addCallback(m63098d(imageProxy), new C1679a(imageProxy), CameraXExecutors.directExecutor());
    }

    @Override // androidx.camera.core.AbstractC2450h
    /* renamed from: f */
    public void mo63078f() {
    }

    /* renamed from: Xc0$a */
    /* loaded from: classes.dex */
    public class C1679a implements FutureCallback {

        /* renamed from: a */
        public final /* synthetic */ ImageProxy f7589a;

        public C1679a(ImageProxy imageProxy) {
            this.f7589a = imageProxy;
        }

        @Override // androidx.camera.core.impl.utils.futures.FutureCallback
        public void onFailure(Throwable th2) {
            this.f7589a.close();
        }

        @Override // androidx.camera.core.impl.utils.futures.FutureCallback
        /* renamed from: a */
        public void onSuccess(Void r1) {
        }
    }
}