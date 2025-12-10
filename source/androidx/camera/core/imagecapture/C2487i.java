package androidx.camera.core.imagecapture;

import android.util.Size;
import android.view.Surface;
import androidx.camera.core.ForwardingImageProxy;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.ImageReaderProxyProvider;
import androidx.camera.core.ImageReaderProxys;
import androidx.camera.core.Logger;
import androidx.camera.core.MetadataImageReader;
import androidx.camera.core.SafeCloseImageReaderProxy;
import androidx.camera.core.imagecapture.C2487i;
import androidx.camera.core.impl.CameraCaptureCallback;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.ImageReaderProxy;
import androidx.camera.core.impl.ImmediateSurface;
import androidx.camera.core.impl.utils.Threads;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.impl.utils.futures.FutureCallback;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.camera.core.processing.Edge;
import androidx.camera.core.processing.Node;
import androidx.core.util.Consumer;
import androidx.core.util.Preconditions;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/* renamed from: androidx.camera.core.imagecapture.i */
/* loaded from: classes.dex */
public class C2487i implements Node {

    /* renamed from: a */
    public final Set f11066a = new HashSet();

    /* renamed from: b */
    public C21132mo1 f11067b = null;

    /* renamed from: c */
    public SafeCloseImageReaderProxy f11068c;

    /* renamed from: d */
    public AbstractC2491c f11069d;

    /* renamed from: e */
    public AbstractC2489b f11070e;

    /* renamed from: androidx.camera.core.imagecapture.i$a */
    /* loaded from: classes.dex */
    public class C2488a implements FutureCallback {

        /* renamed from: a */
        public final /* synthetic */ C21132mo1 f11071a;

        public C2488a(C21132mo1 c21132mo1) {
            C2487i.this = r1;
            this.f11071a = c21132mo1;
        }

        @Override // androidx.camera.core.impl.utils.futures.FutureCallback
        /* renamed from: a */
        public void onSuccess(Void r1) {
        }

        @Override // androidx.camera.core.impl.utils.futures.FutureCallback
        public void onFailure(Throwable th2) {
            Threads.checkMainThread();
            C21132mo1 c21132mo1 = this.f11071a;
            C2487i c2487i = C2487i.this;
            if (c21132mo1 == c2487i.f11067b) {
                c2487i.f11067b = null;
            }
        }
    }

    /* renamed from: androidx.camera.core.imagecapture.i$b */
    /* loaded from: classes.dex */
    public static abstract class AbstractC2489b {

        /* renamed from: a */
        public CameraCaptureCallback f11073a = new C2490a();

        /* renamed from: b */
        public DeferrableSurface f11074b;

        /* renamed from: androidx.camera.core.imagecapture.i$b$a */
        /* loaded from: classes.dex */
        public class C2490a extends CameraCaptureCallback {
            public C2490a() {
                AbstractC2489b.this = r1;
            }
        }

        /* renamed from: j */
        public static AbstractC2489b m63035j(Size size, int i, int i2, boolean z, ImageReaderProxyProvider imageReaderProxyProvider) {
            return new C2479b(size, i, i2, z, imageReaderProxyProvider, new Edge(), new Edge());
        }

        /* renamed from: a */
        public CameraCaptureCallback m63044a() {
            return this.f11073a;
        }

        /* renamed from: b */
        public abstract Edge mo63043b();

        /* renamed from: c */
        public abstract ImageReaderProxyProvider mo63042c();

        /* renamed from: d */
        public abstract int mo63041d();

        /* renamed from: e */
        public abstract int mo63040e();

        /* renamed from: f */
        public abstract Edge mo63039f();

        /* renamed from: g */
        public abstract Size mo63038g();

        /* renamed from: h */
        public DeferrableSurface m63037h() {
            DeferrableSurface deferrableSurface = this.f11074b;
            Objects.requireNonNull(deferrableSurface);
            return deferrableSurface;
        }

        /* renamed from: i */
        public abstract boolean mo63036i();

        /* renamed from: k */
        public void m63034k(CameraCaptureCallback cameraCaptureCallback) {
            this.f11073a = cameraCaptureCallback;
        }

        /* renamed from: l */
        public void m63033l(Surface surface) {
            boolean z;
            if (this.f11074b == null) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkState(z, "The surface is already set.");
            this.f11074b = new ImmediateSurface(surface, mo63038g(), mo63041d());
        }
    }

    /* renamed from: androidx.camera.core.imagecapture.i$c */
    /* loaded from: classes.dex */
    public static abstract class AbstractC2491c {
        /* renamed from: e */
        public static AbstractC2491c m63028e(int i, int i2) {
            return new C2480c(new Edge(), new Edge(), i, i2);
        }

        /* renamed from: a */
        public abstract Edge mo63032a();

        /* renamed from: b */
        public abstract int mo63031b();

        /* renamed from: c */
        public abstract int mo63030c();

        /* renamed from: d */
        public abstract Edge mo63029d();
    }

    /* renamed from: a */
    public static /* synthetic */ void m63059a(C2487i c2487i, ImageReaderProxy imageReaderProxy) {
        c2487i.m63053g(imageReaderProxy);
    }

    /* renamed from: b */
    public static /* synthetic */ void m63058b(C2487i c2487i, NoMetadataImageReader noMetadataImageReader, C21132mo1 c21132mo1) {
        c2487i.m63054f(noMetadataImageReader, c21132mo1);
    }

    /* renamed from: c */
    public static ImageReaderProxy m63057c(ImageReaderProxyProvider imageReaderProxyProvider, int i, int i2, int i3) {
        if (imageReaderProxyProvider != null) {
            return imageReaderProxyProvider.newInstance(i, i2, i3, 4, 0L);
        }
        return ImageReaderProxys.createIsolatedReader(i, i2, i3, 4);
    }

    /* renamed from: d */
    public int m63056d() {
        boolean z;
        Threads.checkMainThread();
        if (this.f11068c != null) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkState(z, "The ImageReader is not initialized.");
        return this.f11068c.getCapacity();
    }

    /* renamed from: e */
    public SafeCloseImageReaderProxy m63055e() {
        SafeCloseImageReaderProxy safeCloseImageReaderProxy = this.f11068c;
        Objects.requireNonNull(safeCloseImageReaderProxy);
        return safeCloseImageReaderProxy;
    }

    /* renamed from: f */
    public final /* synthetic */ void m63054f(NoMetadataImageReader noMetadataImageReader, C21132mo1 c21132mo1) {
        m63050j(c21132mo1);
        noMetadataImageReader.m63111b(c21132mo1);
    }

    /* renamed from: g */
    public final /* synthetic */ void m63053g(ImageReaderProxy imageReaderProxy) {
        try {
            ImageProxy acquireLatestImage = imageReaderProxy.acquireLatestImage();
            if (acquireLatestImage != null) {
                m63051i(acquireLatestImage);
            } else {
                m63048l(new ImageCaptureException(2, "Failed to acquire latest image", null));
            }
        } catch (IllegalStateException e) {
            m63048l(new ImageCaptureException(2, "Failed to acquire latest image", e));
        }
    }

    /* renamed from: h */
    public final void m63052h(ImageProxy imageProxy) {
        Object tag = imageProxy.getImageInfo().getTagBundle().getTag(this.f11067b.m26197h());
        Objects.requireNonNull(tag);
        Integer num = (Integer) tag;
        int intValue = num.intValue();
        boolean contains = this.f11066a.contains(num);
        Preconditions.checkState(contains, "Received an unexpected stage id" + intValue);
        this.f11066a.remove(num);
        AbstractC2491c abstractC2491c = this.f11069d;
        Objects.requireNonNull(abstractC2491c);
        abstractC2491c.mo63032a().accept(imageProxy);
        if (this.f11066a.isEmpty()) {
            C21132mo1 c21132mo1 = this.f11067b;
            this.f11067b = null;
            c21132mo1.m26191n();
        }
    }

    /* renamed from: i */
    public void m63051i(ImageProxy imageProxy) {
        Threads.checkMainThread();
        if (this.f11067b == null) {
            Logger.m63230d("CaptureNode", "Discarding ImageProxy which was inadvertently acquired: " + imageProxy);
            imageProxy.close();
            return;
        }
        m63052h(imageProxy);
    }

    /* renamed from: j */
    public void m63050j(C21132mo1 c21132mo1) {
        boolean z;
        Threads.checkMainThread();
        boolean z2 = false;
        if (m63056d() > 0) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkState(z, "Too many acquire images. Close image to be able to process next.");
        Preconditions.checkState((this.f11067b == null || this.f11066a.isEmpty()) ? true : true, "The previous request is not complete");
        this.f11067b = c21132mo1;
        this.f11066a.addAll(c21132mo1.m26198g());
        AbstractC2491c abstractC2491c = this.f11069d;
        Objects.requireNonNull(abstractC2491c);
        abstractC2491c.mo63029d().accept(c21132mo1);
        Futures.addCallback(c21132mo1.m26204a(), new C2488a(c21132mo1), CameraXExecutors.directExecutor());
    }

    /* renamed from: k */
    public final void m63049k(AbstractC2489b abstractC2489b, SafeCloseImageReaderProxy safeCloseImageReaderProxy) {
        abstractC2489b.m63037h().close();
        ListenableFuture<Void> terminationFuture = abstractC2489b.m63037h().getTerminationFuture();
        Objects.requireNonNull(safeCloseImageReaderProxy);
        terminationFuture.addListener(new X62(safeCloseImageReaderProxy), CameraXExecutors.mainThreadExecutor());
    }

    /* renamed from: l */
    public void m63048l(ImageCaptureException imageCaptureException) {
        Threads.checkMainThread();
        C21132mo1 c21132mo1 = this.f11067b;
        if (c21132mo1 != null) {
            c21132mo1.m26194k(imageCaptureException);
        }
    }

    /* renamed from: m */
    public void m63047m(ForwardingImageProxy.OnImageCloseListener onImageCloseListener) {
        boolean z;
        Threads.checkMainThread();
        if (this.f11068c != null) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkState(z, "The ImageReader is not initialized.");
        this.f11068c.setOnImageCloseListener(onImageCloseListener);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.camera.core.processing.Node
    /* renamed from: n */
    public AbstractC2491c transform(AbstractC2489b abstractC2489b) {
        boolean z;
        Consumer consumer;
        NoMetadataImageReader noMetadataImageReader;
        if (this.f11070e == null && this.f11068c == null) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkState(z, "CaptureNode does not support recreation yet.");
        this.f11070e = abstractC2489b;
        Size mo63038g = abstractC2489b.mo63038g();
        int mo63041d = abstractC2489b.mo63041d();
        if ((true ^ abstractC2489b.mo63036i()) && abstractC2489b.mo63042c() == null) {
            MetadataImageReader metadataImageReader = new MetadataImageReader(mo63038g.getWidth(), mo63038g.getHeight(), mo63041d, 4);
            abstractC2489b.m63034k(metadataImageReader.getCameraCaptureCallback());
            consumer = new Consumer() { // from class: Cl
                @Override // androidx.core.util.Consumer
                public final void accept(Object obj) {
                    C2487i.this.m63050j((C21132mo1) obj);
                }
            };
            noMetadataImageReader = metadataImageReader;
        } else {
            final NoMetadataImageReader noMetadataImageReader2 = new NoMetadataImageReader(m63057c(abstractC2489b.mo63042c(), mo63038g.getWidth(), mo63038g.getHeight(), mo63041d));
            consumer = new Consumer() { // from class: Dl
                @Override // androidx.core.util.Consumer
                public final void accept(Object obj) {
                    C2487i.m63058b(C2487i.this, noMetadataImageReader2, (C21132mo1) obj);
                }
            };
            noMetadataImageReader = noMetadataImageReader2;
        }
        Surface surface = noMetadataImageReader.getSurface();
        Objects.requireNonNull(surface);
        abstractC2489b.m63033l(surface);
        this.f11068c = new SafeCloseImageReaderProxy(noMetadataImageReader);
        noMetadataImageReader.setOnImageAvailableListener(new ImageReaderProxy.OnImageAvailableListener() { // from class: El
            {
                C2487i.this = this;
            }

            @Override // androidx.camera.core.impl.ImageReaderProxy.OnImageAvailableListener
            public final void onImageAvailable(ImageReaderProxy imageReaderProxy) {
                C2487i.m63059a(C2487i.this, imageReaderProxy);
            }
        }, CameraXExecutors.mainThreadExecutor());
        abstractC2489b.mo63039f().setListener(consumer);
        abstractC2489b.mo63043b().setListener(new Consumer() { // from class: Fl
            {
                C2487i.this = this;
            }

            @Override // androidx.core.util.Consumer
            public final void accept(Object obj) {
                C2487i.this.m63048l((ImageCaptureException) obj);
            }
        });
        AbstractC2491c m63028e = AbstractC2491c.m63028e(abstractC2489b.mo63041d(), abstractC2489b.mo63040e());
        this.f11069d = m63028e;
        return m63028e;
    }

    @Override // androidx.camera.core.processing.Node
    public void release() {
        Threads.checkMainThread();
        AbstractC2489b abstractC2489b = this.f11070e;
        Objects.requireNonNull(abstractC2489b);
        SafeCloseImageReaderProxy safeCloseImageReaderProxy = this.f11068c;
        Objects.requireNonNull(safeCloseImageReaderProxy);
        m63049k(abstractC2489b, safeCloseImageReaderProxy);
    }
}
