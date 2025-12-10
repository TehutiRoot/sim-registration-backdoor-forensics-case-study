package p000;

import androidx.camera.core.ForwardingImageProxy;
import androidx.camera.core.ImageProxy;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: EJ1 */
/* loaded from: classes.dex */
public final class EJ1 extends ForwardingImageProxy {

    /* renamed from: c */
    public final AtomicBoolean f1272c;

    public EJ1(ImageProxy imageProxy) {
        super(imageProxy);
        this.f1272c = new AtomicBoolean(false);
    }

    @Override // androidx.camera.core.ForwardingImageProxy, androidx.camera.core.ImageProxy, java.lang.AutoCloseable
    public void close() {
        if (!this.f1272c.getAndSet(true)) {
            super.close();
        }
    }
}
