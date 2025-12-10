package androidx.camera.core.imagecapture;

import androidx.camera.core.ImageProxy;
import androidx.camera.core.imagecapture.C2487i;
import androidx.camera.core.imagecapture.C2498n;
import androidx.camera.core.imagecapture.ProcessingNode;
import androidx.camera.core.impl.utils.Threads;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.impl.utils.futures.FutureCallback;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.core.util.Consumer;
import androidx.core.util.Preconditions;
import java.util.Objects;

/* renamed from: androidx.camera.core.imagecapture.n */
/* loaded from: classes.dex */
public class C2498n implements BundlingNode {

    /* renamed from: a */
    public C21132mo1 f11085a;

    /* renamed from: b */
    public ProcessingNode.AbstractC2472a f11086b;

    /* renamed from: androidx.camera.core.imagecapture.n$a */
    /* loaded from: classes.dex */
    public class C2499a implements FutureCallback {

        /* renamed from: a */
        public final /* synthetic */ C21132mo1 f11087a;

        public C2499a(C21132mo1 c21132mo1) {
            C2498n.this = r1;
            this.f11087a = c21132mo1;
        }

        @Override // androidx.camera.core.impl.utils.futures.FutureCallback
        /* renamed from: a */
        public void onSuccess(Void r1) {
        }

        @Override // androidx.camera.core.impl.utils.futures.FutureCallback
        public void onFailure(Throwable th2) {
            Threads.checkMainThread();
            C21132mo1 c21132mo1 = this.f11087a;
            C2498n c2498n = C2498n.this;
            if (c21132mo1 == c2498n.f11085a) {
                c2498n.f11085a = null;
            }
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m62977a(C2498n c2498n, C21132mo1 c21132mo1) {
        c2498n.m62974d(c21132mo1);
    }

    /* renamed from: b */
    public static /* synthetic */ void m62976b(C2498n c2498n, ImageProxy imageProxy) {
        c2498n.m62975c(imageProxy);
    }

    /* renamed from: c */
    public final void m62975c(ImageProxy imageProxy) {
        boolean z;
        Threads.checkMainThread();
        boolean z2 = true;
        if (this.f11085a != null) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkState(z);
        Object tag = imageProxy.getImageInfo().getTagBundle().getTag(this.f11085a.m26197h());
        Objects.requireNonNull(tag);
        if (((Integer) tag).intValue() != ((Integer) this.f11085a.m26198g().get(0)).intValue()) {
            z2 = false;
        }
        Preconditions.checkState(z2);
        this.f11086b.mo63068a().accept(ProcessingNode.AbstractC2473b.m63092c(this.f11085a, imageProxy));
        this.f11085a = null;
    }

    /* renamed from: d */
    public final void m62974d(C21132mo1 c21132mo1) {
        boolean z;
        Threads.checkMainThread();
        boolean z2 = false;
        if (c21132mo1.m26198g().size() == 1) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkState(z, "Cannot handle multi-image capture.");
        if (this.f11085a == null) {
            z2 = true;
        }
        Preconditions.checkState(z2, "Already has an existing request.");
        this.f11085a = c21132mo1;
        Futures.addCallback(c21132mo1.m26204a(), new C2499a(c21132mo1), CameraXExecutors.directExecutor());
    }

    @Override // androidx.camera.core.processing.Node
    /* renamed from: e */
    public ProcessingNode.AbstractC2472a transform(C2487i.AbstractC2491c abstractC2491c) {
        abstractC2491c.mo63032a().setListener(new Consumer() { // from class: CJ1
            {
                C2498n.this = this;
            }

            @Override // androidx.core.util.Consumer
            public final void accept(Object obj) {
                C2498n.m62976b(C2498n.this, (ImageProxy) obj);
            }
        });
        abstractC2491c.mo63029d().setListener(new Consumer() { // from class: DJ1
            @Override // androidx.core.util.Consumer
            public final void accept(Object obj) {
                C2498n.m62977a(C2498n.this, (C21132mo1) obj);
            }
        });
        ProcessingNode.AbstractC2472a m63093d = ProcessingNode.AbstractC2472a.m63093d(abstractC2491c.mo63031b(), abstractC2491c.mo63030c());
        this.f11086b = m63093d;
        return m63093d;
    }

    @Override // androidx.camera.core.processing.Node
    public void release() {
    }
}
