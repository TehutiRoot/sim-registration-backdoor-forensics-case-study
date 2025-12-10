package p000;

import androidx.camera.core.ForwardingImageProxy;
import androidx.camera.core.ImageProxy;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: BK1 */
/* loaded from: classes.dex */
public final class BK1 extends ForwardingImageProxy {

    /* renamed from: c */
    public final AtomicBoolean f378c;

    public BK1(ImageProxy imageProxy) {
        super(imageProxy);
        this.f378c = new AtomicBoolean(false);
    }

    @Override // androidx.camera.core.ForwardingImageProxy, androidx.camera.core.ImageProxy, java.lang.AutoCloseable
    public void close() {
        if (!this.f378c.getAndSet(true)) {
            super.close();
        }
    }
}