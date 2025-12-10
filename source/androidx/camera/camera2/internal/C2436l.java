package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraDevice;
import android.os.Handler;
import androidx.camera.camera2.internal.SynchronizedCaptureSession;
import androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat;
import androidx.camera.camera2.internal.compat.workaround.ForceCloseCaptureSession;
import androidx.camera.camera2.internal.compat.workaround.ForceCloseDeferrableSurface;
import androidx.camera.camera2.internal.compat.workaround.WaitForRepeatingRequestStart;
import androidx.camera.core.impl.Quirks;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: androidx.camera.camera2.internal.l */
/* loaded from: classes.dex */
public final class C2436l {

    /* renamed from: a */
    public final InterfaceC2438b f10707a;

    /* renamed from: androidx.camera.camera2.internal.l$a */
    /* loaded from: classes.dex */
    public static class C2437a {

        /* renamed from: a */
        public final Executor f10708a;

        /* renamed from: b */
        public final ScheduledExecutorService f10709b;

        /* renamed from: c */
        public final Handler f10710c;

        /* renamed from: d */
        public final C2419f f10711d;

        /* renamed from: e */
        public final Quirks f10712e;

        /* renamed from: f */
        public final Quirks f10713f;

        /* renamed from: g */
        public final boolean f10714g;

        public C2437a(Executor executor, ScheduledExecutorService scheduledExecutorService, Handler handler, C2419f c2419f, Quirks quirks, Quirks quirks2) {
            boolean z;
            this.f10708a = executor;
            this.f10709b = scheduledExecutorService;
            this.f10710c = handler;
            this.f10711d = c2419f;
            this.f10712e = quirks;
            this.f10713f = quirks2;
            if (!new ForceCloseDeferrableSurface(quirks, quirks2).shouldForceClose() && !new WaitForRepeatingRequestStart(quirks).shouldWaitRepeatingSubmit() && !new ForceCloseCaptureSession(quirks2).shouldForceClose()) {
                z = false;
            } else {
                z = true;
            }
            this.f10714g = z;
        }

        /* renamed from: a */
        public C2436l m63370a() {
            InterfaceC2438b c2432k;
            if (this.f10714g) {
                c2432k = new C19178bQ1(this.f10712e, this.f10713f, this.f10711d, this.f10708a, this.f10709b, this.f10710c);
            } else {
                c2432k = new C2432k(this.f10711d, this.f10708a, this.f10709b, this.f10710c);
            }
            return new C2436l(c2432k);
        }
    }

    /* renamed from: androidx.camera.camera2.internal.l$b */
    /* loaded from: classes.dex */
    public interface InterfaceC2438b {
        /* renamed from: a */
        ListenableFuture mo52017a(CameraDevice cameraDevice, SessionConfigurationCompat sessionConfigurationCompat, List list);

        /* renamed from: b */
        SessionConfigurationCompat mo63369b(int i, List list, SynchronizedCaptureSession.StateCallback stateCallback);

        /* renamed from: c */
        ListenableFuture mo52016c(List list, long j);

        Executor getExecutor();

        boolean stop();
    }

    public C2436l(InterfaceC2438b interfaceC2438b) {
        this.f10707a = interfaceC2438b;
    }

    /* renamed from: a */
    public SessionConfigurationCompat m63375a(int i, List list, SynchronizedCaptureSession.StateCallback stateCallback) {
        return this.f10707a.mo63369b(i, list, stateCallback);
    }

    /* renamed from: b */
    public Executor m63374b() {
        return this.f10707a.getExecutor();
    }

    /* renamed from: c */
    public ListenableFuture m63373c(CameraDevice cameraDevice, SessionConfigurationCompat sessionConfigurationCompat, List list) {
        return this.f10707a.mo52017a(cameraDevice, sessionConfigurationCompat, list);
    }

    /* renamed from: d */
    public ListenableFuture m63372d(List list, long j) {
        return this.f10707a.mo52016c(list, j);
    }

    /* renamed from: e */
    public boolean m63371e() {
        return this.f10707a.stop();
    }
}
