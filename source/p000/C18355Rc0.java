package p000;

import androidx.camera.core.AbstractC2468h;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.impl.ImageReaderProxy;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.impl.utils.futures.FutureCallback;
import androidx.camera.core.impl.utils.futures.Futures;

/* renamed from: Rc0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C18355Rc0 extends AbstractC2468h {
    @Override // androidx.camera.core.AbstractC2468h
    /* renamed from: c */
    public ImageProxy mo63131c(ImageReaderProxy imageReaderProxy) {
        return imageReaderProxy.acquireNextImage();
    }

    @Override // androidx.camera.core.AbstractC2468h
    /* renamed from: n */
    public void mo63129n(ImageProxy imageProxy) {
        Futures.addCallback(m63150d(imageProxy), new C1258a(imageProxy), CameraXExecutors.directExecutor());
    }

    @Override // androidx.camera.core.AbstractC2468h
    /* renamed from: f */
    public void mo63130f() {
    }

    /* renamed from: Rc0$a */
    /* loaded from: classes.dex */
    public class C1258a implements FutureCallback {

        /* renamed from: a */
        public final /* synthetic */ ImageProxy f5370a;

        public C1258a(ImageProxy imageProxy) {
            this.f5370a = imageProxy;
        }

        @Override // androidx.camera.core.impl.utils.futures.FutureCallback
        public void onFailure(Throwable th2) {
            this.f5370a.close();
        }

        @Override // androidx.camera.core.impl.utils.futures.FutureCallback
        /* renamed from: a */
        public void onSuccess(Void r1) {
        }
    }
}
