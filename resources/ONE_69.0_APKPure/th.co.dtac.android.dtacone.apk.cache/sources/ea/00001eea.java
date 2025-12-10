package androidx.camera.core;

import androidx.camera.core.C2451i;
import androidx.camera.core.ForwardingImageProxy;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.impl.ImageReaderProxy;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.impl.utils.futures.FutureCallback;
import androidx.camera.core.impl.utils.futures.Futures;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

/* renamed from: androidx.camera.core.i */
/* loaded from: classes.dex */
public final class C2451i extends AbstractC2450h {

    /* renamed from: t */
    public final Executor f11079t;

    /* renamed from: u */
    public final Object f11080u = new Object();

    /* renamed from: v */
    public ImageProxy f11081v;

    /* renamed from: w */
    public C2453b f11082w;

    /* renamed from: androidx.camera.core.i$a */
    /* loaded from: classes.dex */
    public class C2452a implements FutureCallback {

        /* renamed from: a */
        public final /* synthetic */ C2453b f11083a;

        public C2452a(C2453b c2453b) {
            C2451i.this = r1;
            this.f11083a = c2453b;
        }

        @Override // androidx.camera.core.impl.utils.futures.FutureCallback
        /* renamed from: a */
        public void onSuccess(Void r1) {
        }

        @Override // androidx.camera.core.impl.utils.futures.FutureCallback
        public void onFailure(Throwable th2) {
            this.f11083a.close();
        }
    }

    /* renamed from: androidx.camera.core.i$b */
    /* loaded from: classes.dex */
    public static class C2453b extends ForwardingImageProxy {

        /* renamed from: c */
        public final WeakReference f11085c;

        public C2453b(ImageProxy imageProxy, C2451i c2451i) {
            super(imageProxy);
            this.f11085c = new WeakReference(c2451i);
            addOnImageCloseListener(new ForwardingImageProxy.OnImageCloseListener() { // from class: Yc0
                @Override // androidx.camera.core.ForwardingImageProxy.OnImageCloseListener
                public final void onImageClose(ImageProxy imageProxy2) {
                    C2451i.C2453b.m63074b(C2451i.C2453b.this, imageProxy2);
                }
            });
        }

        /* renamed from: b */
        public static /* synthetic */ void m63074b(C2453b c2453b, ImageProxy imageProxy) {
            c2453b.m63071i(imageProxy);
        }

        /* renamed from: d */
        public static /* synthetic */ void m63073d(C2451i c2451i) {
            c2451i.m63076y();
        }

        /* renamed from: i */
        public final /* synthetic */ void m63071i(ImageProxy imageProxy) {
            final C2451i c2451i = (C2451i) this.f11085c.get();
            if (c2451i != null) {
                c2451i.f11079t.execute(new Runnable() { // from class: Zc0
                    @Override // java.lang.Runnable
                    public final void run() {
                        C2451i.C2453b.m63073d(C2451i.this);
                    }
                });
            }
        }
    }

    public C2451i(Executor executor) {
        this.f11079t = executor;
    }

    @Override // androidx.camera.core.AbstractC2450h
    /* renamed from: c */
    public ImageProxy mo63079c(ImageReaderProxy imageReaderProxy) {
        return imageReaderProxy.acquireLatestImage();
    }

    @Override // androidx.camera.core.AbstractC2450h
    /* renamed from: f */
    public void mo63078f() {
        synchronized (this.f11080u) {
            try {
                ImageProxy imageProxy = this.f11081v;
                if (imageProxy != null) {
                    imageProxy.close();
                    this.f11081v = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.camera.core.AbstractC2450h
    /* renamed from: n */
    public void mo63077n(ImageProxy imageProxy) {
        synchronized (this.f11080u) {
            try {
                if (!this.f11078s) {
                    imageProxy.close();
                } else if (this.f11082w != null) {
                    if (imageProxy.getImageInfo().getTimestamp() <= this.f11082w.getImageInfo().getTimestamp()) {
                        imageProxy.close();
                    } else {
                        ImageProxy imageProxy2 = this.f11081v;
                        if (imageProxy2 != null) {
                            imageProxy2.close();
                        }
                        this.f11081v = imageProxy;
                    }
                } else {
                    C2453b c2453b = new C2453b(imageProxy, this);
                    this.f11082w = c2453b;
                    Futures.addCallback(m63098d(c2453b), new C2452a(c2453b), CameraXExecutors.directExecutor());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: y */
    public void m63076y() {
        synchronized (this.f11080u) {
            try {
                this.f11082w = null;
                ImageProxy imageProxy = this.f11081v;
                if (imageProxy != null) {
                    this.f11081v = null;
                    mo63077n(imageProxy);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}