package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraDevice;
import androidx.camera.camera2.internal.C2419f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;

/* renamed from: androidx.camera.camera2.internal.f */
/* loaded from: classes.dex */
public class C2419f {

    /* renamed from: a */
    public final Executor f10622a;

    /* renamed from: b */
    public final Object f10623b = new Object();

    /* renamed from: c */
    public final Set f10624c = new LinkedHashSet();

    /* renamed from: d */
    public final Set f10625d = new LinkedHashSet();

    /* renamed from: e */
    public final Set f10626e = new LinkedHashSet();

    /* renamed from: f */
    public final CameraDevice.StateCallback f10627f = new C2420a();

    /* renamed from: androidx.camera.camera2.internal.f$a */
    /* loaded from: classes.dex */
    public class C2420a extends CameraDevice.StateCallback {
        public C2420a() {
            C2419f.this = r1;
        }

        /* renamed from: a */
        public static /* synthetic */ void m63501a(LinkedHashSet linkedHashSet) {
            C2419f.m63512b(linkedHashSet);
        }

        /* renamed from: b */
        public final void m63500b() {
            List<SynchronizedCaptureSession> m63507g;
            synchronized (C2419f.this.f10623b) {
                m63507g = C2419f.this.m63507g();
                C2419f.this.f10626e.clear();
                C2419f.this.f10624c.clear();
                C2419f.this.f10625d.clear();
            }
            for (SynchronizedCaptureSession synchronizedCaptureSession : m63507g) {
                synchronizedCaptureSession.finishClose();
            }
        }

        /* renamed from: c */
        public final void m63499c() {
            final LinkedHashSet linkedHashSet = new LinkedHashSet();
            synchronized (C2419f.this.f10623b) {
                linkedHashSet.addAll(C2419f.this.f10626e);
                linkedHashSet.addAll(C2419f.this.f10624c);
            }
            C2419f.this.f10622a.execute(new Runnable() { // from class: Ll
                @Override // java.lang.Runnable
                public final void run() {
                    C2419f.C2420a.m63501a(linkedHashSet);
                }
            });
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onClosed(CameraDevice cameraDevice) {
            m63500b();
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onDisconnected(CameraDevice cameraDevice) {
            m63499c();
            m63500b();
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onError(CameraDevice cameraDevice, int i) {
            m63499c();
            m63500b();
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onOpened(CameraDevice cameraDevice) {
        }
    }

    public C2419f(Executor executor) {
        this.f10622a = executor;
    }

    /* renamed from: b */
    public static void m63512b(Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            SynchronizedCaptureSession synchronizedCaptureSession = (SynchronizedCaptureSession) it.next();
            synchronizedCaptureSession.getStateCallback().onClosed(synchronizedCaptureSession);
        }
    }

    /* renamed from: a */
    public final void m63513a(SynchronizedCaptureSession synchronizedCaptureSession) {
        SynchronizedCaptureSession synchronizedCaptureSession2;
        Iterator it = m63507g().iterator();
        while (it.hasNext() && (synchronizedCaptureSession2 = (SynchronizedCaptureSession) it.next()) != synchronizedCaptureSession) {
            synchronizedCaptureSession2.finishClose();
        }
    }

    /* renamed from: c */
    public CameraDevice.StateCallback m63511c() {
        return this.f10627f;
    }

    /* renamed from: d */
    public List m63510d() {
        ArrayList arrayList;
        synchronized (this.f10623b) {
            arrayList = new ArrayList(this.f10624c);
        }
        return arrayList;
    }

    /* renamed from: e */
    public List m63509e() {
        ArrayList arrayList;
        synchronized (this.f10623b) {
            arrayList = new ArrayList(this.f10625d);
        }
        return arrayList;
    }

    /* renamed from: f */
    public List m63508f() {
        ArrayList arrayList;
        synchronized (this.f10623b) {
            arrayList = new ArrayList(this.f10626e);
        }
        return arrayList;
    }

    /* renamed from: g */
    public List m63507g() {
        ArrayList arrayList;
        synchronized (this.f10623b) {
            arrayList = new ArrayList();
            arrayList.addAll(m63510d());
            arrayList.addAll(m63508f());
        }
        return arrayList;
    }

    /* renamed from: h */
    public void m63506h(SynchronizedCaptureSession synchronizedCaptureSession) {
        synchronized (this.f10623b) {
            this.f10624c.remove(synchronizedCaptureSession);
            this.f10625d.remove(synchronizedCaptureSession);
        }
    }

    /* renamed from: i */
    public void m63505i(SynchronizedCaptureSession synchronizedCaptureSession) {
        synchronized (this.f10623b) {
            this.f10625d.add(synchronizedCaptureSession);
        }
    }

    /* renamed from: j */
    public void m63504j(SynchronizedCaptureSession synchronizedCaptureSession) {
        m63513a(synchronizedCaptureSession);
        synchronized (this.f10623b) {
            this.f10626e.remove(synchronizedCaptureSession);
        }
    }

    /* renamed from: k */
    public void m63503k(SynchronizedCaptureSession synchronizedCaptureSession) {
        synchronized (this.f10623b) {
            this.f10624c.add(synchronizedCaptureSession);
            this.f10626e.remove(synchronizedCaptureSession);
        }
        m63513a(synchronizedCaptureSession);
    }

    /* renamed from: l */
    public void m63502l(SynchronizedCaptureSession synchronizedCaptureSession) {
        synchronized (this.f10623b) {
            this.f10626e.add(synchronizedCaptureSession);
        }
    }
}
