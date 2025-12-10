package androidx.camera.core.imagecapture;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.imagecapture.C2485h;
import androidx.camera.core.imagecapture.C2492j;
import androidx.camera.core.imagecapture.C2494k;
import androidx.camera.core.imagecapture.ProcessingNode;
import androidx.camera.core.impl.Quirks;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.internal.compat.quirk.DeviceQuirks;
import androidx.camera.core.internal.compat.quirk.IncorrectJpegMetadataQuirk;
import androidx.camera.core.internal.compat.quirk.LowMemoryQuirk;
import androidx.camera.core.processing.Edge;
import androidx.camera.core.processing.InternalImageProcessor;
import androidx.camera.core.processing.Node;
import androidx.camera.core.processing.Operation;
import androidx.camera.core.processing.Packet;
import androidx.core.util.Consumer;
import androidx.core.util.Preconditions;
import java.util.Objects;
import java.util.concurrent.Executor;

@RequiresApi(api = 21)
/* loaded from: classes.dex */
public class ProcessingNode implements Node<AbstractC2472a, Void> {

    /* renamed from: a */
    public final Executor f11010a;

    /* renamed from: b */
    public final InternalImageProcessor f11011b;

    /* renamed from: c */
    public AbstractC2472a f11012c;

    /* renamed from: d */
    public Operation f11013d;

    /* renamed from: e */
    public Operation f11014e;

    /* renamed from: f */
    public Operation f11015f;

    /* renamed from: g */
    public Operation f11016g;

    /* renamed from: h */
    public Operation f11017h;

    /* renamed from: i */
    public Operation f11018i;

    /* renamed from: j */
    public Operation f11019j;

    /* renamed from: k */
    public Operation f11020k;

    /* renamed from: l */
    public final Quirks f11021l;

    /* renamed from: m */
    public final boolean f11022m;

    /* renamed from: androidx.camera.core.imagecapture.ProcessingNode$a */
    /* loaded from: classes.dex */
    public static abstract class AbstractC2472a {
        /* renamed from: d */
        public static AbstractC2472a m63093d(int i, int i2) {
            return new C2483f(new Edge(), i, i2);
        }

        /* renamed from: a */
        public abstract Edge mo63068a();

        /* renamed from: b */
        public abstract int mo63067b();

        /* renamed from: c */
        public abstract int mo63066c();
    }

    /* renamed from: androidx.camera.core.imagecapture.ProcessingNode$b */
    /* loaded from: classes.dex */
    public static abstract class AbstractC2473b {
        /* renamed from: c */
        public static AbstractC2473b m63092c(C21132mo1 c21132mo1, ImageProxy imageProxy) {
            return new C2484g(c21132mo1, imageProxy);
        }

        /* renamed from: a */
        public abstract ImageProxy mo63065a();

        /* renamed from: b */
        public abstract C21132mo1 mo63064b();
    }

    public ProcessingNode(Executor executor, InternalImageProcessor internalImageProcessor) {
        this(executor, internalImageProcessor, DeviceQuirks.getAll());
    }

    /* renamed from: a */
    public static /* synthetic */ void m63108a(ProcessingNode processingNode, AbstractC2473b abstractC2473b) {
        processingNode.m63098k(abstractC2473b);
    }

    /* renamed from: b */
    public static /* synthetic */ void m63107b(C21132mo1 c21132mo1, ImageProxy imageProxy) {
        c21132mo1.m26192m(imageProxy);
    }

    /* renamed from: d */
    public static /* synthetic */ void m63105d(ProcessingNode processingNode, AbstractC2473b abstractC2473b) {
        processingNode.m63099j(abstractC2473b);
    }

    /* renamed from: e */
    public static /* synthetic */ void m63104e(C21132mo1 c21132mo1, ImageCaptureException imageCaptureException) {
        c21132mo1.m26190o(imageCaptureException);
    }

    /* renamed from: o */
    public static void m63094o(final C21132mo1 c21132mo1, final ImageCaptureException imageCaptureException) {
        CameraXExecutors.mainThreadExecutor().execute(new Runnable() { // from class: lo1
            @Override // java.lang.Runnable
            public final void run() {
                ProcessingNode.m63104e(C21132mo1.this, imageCaptureException);
            }
        });
    }

    /* renamed from: f */
    public final Packet m63103f(Packet packet, int i) {
        boolean z;
        if (packet.getFormat() == 256) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkState(z);
        Packet packet2 = (Packet) this.f11017h.apply(packet);
        Operation operation = this.f11020k;
        if (operation != null) {
            packet2 = (Packet) operation.apply(packet2);
        }
        return (Packet) this.f11015f.apply(C2485h.AbstractC2486a.m63060c(packet2, i));
    }

    /* renamed from: k */
    public final /* synthetic */ void m63098k(final AbstractC2473b abstractC2473b) {
        if (abstractC2473b.mo63064b().m26196i()) {
            return;
        }
        this.f11010a.execute(new Runnable() { // from class: io1
            {
                ProcessingNode.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ProcessingNode.m63105d(ProcessingNode.this, abstractC2473b);
            }
        });
    }

    /* renamed from: l */
    public ImageProxy m63097l(AbstractC2473b abstractC2473b) {
        C21132mo1 mo63064b = abstractC2473b.mo63064b();
        Packet packet = (Packet) this.f11013d.apply(abstractC2473b);
        if ((packet.getFormat() == 35 || this.f11020k != null || this.f11022m) && this.f11012c.mo63066c() == 256) {
            Packet packet2 = (Packet) this.f11014e.apply(C2492j.AbstractC2493a.m63021c(packet, mo63064b.m26202c()));
            if (this.f11020k != null) {
                packet2 = m63103f(packet2, mo63064b.m26202c());
            }
            packet = (Packet) this.f11019j.apply(packet2);
        }
        return (ImageProxy) this.f11018i.apply(packet);
    }

    /* renamed from: m */
    public void m63099j(AbstractC2473b abstractC2473b) {
        final C21132mo1 mo63064b = abstractC2473b.mo63064b();
        try {
            if (abstractC2473b.mo63064b().m26195j()) {
                final ImageProxy m63097l = m63097l(abstractC2473b);
                CameraXExecutors.mainThreadExecutor().execute(new Runnable() { // from class: jo1
                    @Override // java.lang.Runnable
                    public final void run() {
                        ProcessingNode.m63107b(C21132mo1.this, m63097l);
                    }
                });
            } else {
                final ImageCapture.OutputFileResults m63095n = m63095n(abstractC2473b);
                CameraXExecutors.mainThreadExecutor().execute(new Runnable() { // from class: ko1
                    @Override // java.lang.Runnable
                    public final void run() {
                        C21132mo1.this.m26193l(m63095n);
                    }
                });
            }
        } catch (ImageCaptureException e) {
            m63094o(mo63064b, e);
        } catch (OutOfMemoryError e2) {
            m63094o(mo63064b, new ImageCaptureException(0, "Processing failed due to low memory.", e2));
        } catch (RuntimeException e3) {
            m63094o(mo63064b, new ImageCaptureException(0, "Processing failed.", e3));
        }
    }

    /* renamed from: n */
    public ImageCapture.OutputFileResults m63095n(AbstractC2473b abstractC2473b) {
        boolean z;
        if (this.f11012c.mo63066c() == 256) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z, String.format("On-disk capture only support JPEG output format. Output format: %s", Integer.valueOf(this.f11012c.mo63066c())));
        C21132mo1 mo63064b = abstractC2473b.mo63064b();
        Packet packet = (Packet) this.f11014e.apply(C2492j.AbstractC2493a.m63021c((Packet) this.f11013d.apply(abstractC2473b), mo63064b.m26202c()));
        if (packet.hasCropping() || this.f11020k != null) {
            packet = m63103f(packet, mo63064b.m26202c());
        }
        Operation operation = this.f11016g;
        ImageCapture.OutputFileOptions m26201d = mo63064b.m26201d();
        Objects.requireNonNull(m26201d);
        return (ImageCapture.OutputFileResults) operation.apply(C2494k.AbstractC2495a.m63003c(packet, m26201d));
    }

    @Override // androidx.camera.core.processing.Node
    public void release() {
    }

    public ProcessingNode(Executor executor, InternalImageProcessor internalImageProcessor, Quirks quirks) {
        if (DeviceQuirks.get(LowMemoryQuirk.class) != null) {
            this.f11010a = CameraXExecutors.newSequentialExecutor(executor);
        } else {
            this.f11010a = executor;
        }
        this.f11011b = internalImageProcessor;
        this.f11021l = quirks;
        this.f11022m = quirks.contains(IncorrectJpegMetadataQuirk.class);
    }

    @Override // androidx.camera.core.processing.Node
    @NonNull
    public Void transform(@NonNull AbstractC2472a abstractC2472a) {
        this.f11012c = abstractC2472a;
        abstractC2472a.mo63068a().setListener(new Consumer() { // from class: ho1
            {
                ProcessingNode.this = this;
            }

            @Override // androidx.core.util.Consumer
            public final void accept(Object obj) {
                ProcessingNode.m63108a(ProcessingNode.this, (ProcessingNode.AbstractC2473b) obj);
            }
        });
        this.f11013d = new C2496l();
        this.f11014e = new C2492j(this.f11021l);
        this.f11017h = new C18687Wg0();
        this.f11015f = new C2485h();
        this.f11016g = new C2494k();
        this.f11018i = new JpegImage2Result();
        if (abstractC2472a.mo63067b() == 35 || this.f11011b != null || this.f11022m) {
            this.f11019j = new JpegBytes2Image();
        }
        InternalImageProcessor internalImageProcessor = this.f11011b;
        if (internalImageProcessor != null) {
            this.f11020k = new BitmapEffect(internalImageProcessor);
            return null;
        }
        return null;
    }
}
