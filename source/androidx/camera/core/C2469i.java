package androidx.camera.core;

import androidx.camera.core.C2469i;
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
public final class C2469i extends AbstractC2468h {

    /* renamed from: t */
    public final Executor f10991t;

    /* renamed from: u */
    public final Object f10992u = new Object();

    /* renamed from: v */
    public ImageProxy f10993v;

    /* renamed from: w */
    public C2471b f10994w;

    /* renamed from: androidx.camera.core.i$a */
    /* loaded from: classes.dex */
    public class C2470a implements FutureCallback {

        /* renamed from: a */
        public final /* synthetic */ C2471b f10995a;

        public C2470a(C2471b c2471b) {
            C2469i.this = r1;
            this.f10995a = c2471b;
        }

        @Override // androidx.camera.core.impl.utils.futures.FutureCallback
        /* renamed from: a */
        public void onSuccess(Void r1) {
        }

        @Override // androidx.camera.core.impl.utils.futures.FutureCallback
        public void onFailure(Throwable th2) {
            this.f10995a.close();
        }
    }

    /* renamed from: androidx.camera.core.i$b */
    /* loaded from: classes.dex */
    public static class C2471b extends ForwardingImageProxy {

        /* renamed from: c */
        public final WeakReference f10997c;

        public C2471b(ImageProxy imageProxy, C2469i c2469i) {
            super(imageProxy);
            this.f10997c = new WeakReference(c2469i);
            addOnImageCloseListener(new ForwardingImageProxy.OnImageCloseListener() { // from class: Sc0
                @Override // androidx.camera.core.ForwardingImageProxy.OnImageCloseListener
                public final void onImageClose(ImageProxy imageProxy2) {
                    C2469i.C2471b.m63126b(C2469i.C2471b.this, imageProxy2);
                }
            });
        }

        /* renamed from: b */
        public static /* synthetic */ void m63126b(C2471b c2471b, ImageProxy imageProxy) {
            c2471b.m63123i(imageProxy);
        }

        /* renamed from: d */
        public static /* synthetic */ void m63125d(C2469i c2469i) {
            c2469i.m63128y();
        }

        /* renamed from: i */
        public final /* synthetic */ void m63123i(ImageProxy imageProxy) {
            final C2469i c2469i = (C2469i) this.f10997c.get();
            if (c2469i != null) {
                c2469i.f10991t.execute(new Runnable() { // from class: Tc0
                    @Override // java.lang.Runnable
                    public final void run() {
                        C2469i.C2471b.m63125d(c2469i);
                    }
                });
            }
        }
    }

    public C2469i(Executor executor) {
        this.f10991t = executor;
    }

    @Override // androidx.camera.core.AbstractC2468h
    /* renamed from: c */
    public ImageProxy mo63131c(ImageReaderProxy imageReaderProxy) {
        return imageReaderProxy.acquireLatestImage();
    }

    @Override // androidx.camera.core.AbstractC2468h
    /* renamed from: f */
    public void mo63130f() {
        synchronized (this.f10992u) {
            try {
                ImageProxy imageProxy = this.f10993v;
                if (imageProxy != null) {
                    imageProxy.close();
                    this.f10993v = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.camera.core.AbstractC2468h
    /* renamed from: n */
    public void mo63129n(ImageProxy imageProxy) {
        synchronized (this.f10992u) {
            try {
                if (!this.f10990s) {
                    imageProxy.close();
                } else if (this.f10994w != null) {
                    if (imageProxy.getImageInfo().getTimestamp() <= this.f10994w.getImageInfo().getTimestamp()) {
                        imageProxy.close();
                    } else {
                        ImageProxy imageProxy2 = this.f10993v;
                        if (imageProxy2 != null) {
                            imageProxy2.close();
                        }
                        this.f10993v = imageProxy;
                    }
                } else {
                    C2471b c2471b = new C2471b(imageProxy, this);
                    this.f10994w = c2471b;
                    Futures.addCallback(m63150d(c2471b), new C2470a(c2471b), CameraXExecutors.directExecutor());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: y */
    public void m63128y() {
        synchronized (this.f10992u) {
            try {
                this.f10994w = null;
                ImageProxy imageProxy = this.f10993v;
                if (imageProxy != null) {
                    this.f10993v = null;
                    mo63129n(imageProxy);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
