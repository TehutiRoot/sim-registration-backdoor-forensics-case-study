package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraDevice;
import androidx.camera.camera2.internal.C2401f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;

/* renamed from: androidx.camera.camera2.internal.f */
/* loaded from: classes.dex */
public class C2401f {

    /* renamed from: a */
    public final Executor f10710a;

    /* renamed from: b */
    public final Object f10711b = new Object();

    /* renamed from: c */
    public final Set f10712c = new LinkedHashSet();

    /* renamed from: d */
    public final Set f10713d = new LinkedHashSet();

    /* renamed from: e */
    public final Set f10714e = new LinkedHashSet();

    /* renamed from: f */
    public final CameraDevice.StateCallback f10715f = new C2402a();

    /* renamed from: androidx.camera.camera2.internal.f$a */
    /* loaded from: classes.dex */
    public class C2402a extends CameraDevice.StateCallback {
        public C2402a() {
            C2401f.this = r1;
        }

        /* renamed from: a */
        public static /* synthetic */ void m63452a(LinkedHashSet linkedHashSet) {
            C2401f.m63463b(linkedHashSet);
        }

        /* renamed from: b */
        public final void m63451b() {
            List<SynchronizedCaptureSession> m63458g;
            synchronized (C2401f.this.f10711b) {
                m63458g = C2401f.this.m63458g();
                C2401f.this.f10714e.clear();
                C2401f.this.f10712c.clear();
                C2401f.this.f10713d.clear();
            }
            for (SynchronizedCaptureSession synchronizedCaptureSession : m63458g) {
                synchronizedCaptureSession.finishClose();
            }
        }

        /* renamed from: c */
        public final void m63450c() {
            final LinkedHashSet linkedHashSet = new LinkedHashSet();
            synchronized (C2401f.this.f10711b) {
                linkedHashSet.addAll(C2401f.this.f10714e);
                linkedHashSet.addAll(C2401f.this.f10712c);
            }
            C2401f.this.f10710a.execute(new Runnable() { // from class: Ll
                @Override // java.lang.Runnable
                public final void run() {
                    C2401f.C2402a.m63452a(linkedHashSet);
                }
            });
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onClosed(CameraDevice cameraDevice) {
            m63451b();
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onDisconnected(CameraDevice cameraDevice) {
            m63450c();
            m63451b();
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onError(CameraDevice cameraDevice, int i) {
            m63450c();
            m63451b();
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onOpened(CameraDevice cameraDevice) {
        }
    }

    public C2401f(Executor executor) {
        this.f10710a = executor;
    }

    /* renamed from: b */
    public static void m63463b(Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            SynchronizedCaptureSession synchronizedCaptureSession = (SynchronizedCaptureSession) it.next();
            synchronizedCaptureSession.getStateCallback().onClosed(synchronizedCaptureSession);
        }
    }

    /* renamed from: a */
    public final void m63464a(SynchronizedCaptureSession synchronizedCaptureSession) {
        SynchronizedCaptureSession synchronizedCaptureSession2;
        Iterator it = m63458g().iterator();
        while (it.hasNext() && (synchronizedCaptureSession2 = (SynchronizedCaptureSession) it.next()) != synchronizedCaptureSession) {
            synchronizedCaptureSession2.finishClose();
        }
    }

    /* renamed from: c */
    public CameraDevice.StateCallback m63462c() {
        return this.f10715f;
    }

    /* renamed from: d */
    public List m63461d() {
        ArrayList arrayList;
        synchronized (this.f10711b) {
            arrayList = new ArrayList(this.f10712c);
        }
        return arrayList;
    }

    /* renamed from: e */
    public List m63460e() {
        ArrayList arrayList;
        synchronized (this.f10711b) {
            arrayList = new ArrayList(this.f10713d);
        }
        return arrayList;
    }

    /* renamed from: f */
    public List m63459f() {
        ArrayList arrayList;
        synchronized (this.f10711b) {
            arrayList = new ArrayList(this.f10714e);
        }
        return arrayList;
    }

    /* renamed from: g */
    public List m63458g() {
        ArrayList arrayList;
        synchronized (this.f10711b) {
            arrayList = new ArrayList();
            arrayList.addAll(m63461d());
            arrayList.addAll(m63459f());
        }
        return arrayList;
    }

    /* renamed from: h */
    public void m63457h(SynchronizedCaptureSession synchronizedCaptureSession) {
        synchronized (this.f10711b) {
            this.f10712c.remove(synchronizedCaptureSession);
            this.f10713d.remove(synchronizedCaptureSession);
        }
    }

    /* renamed from: i */
    public void m63456i(SynchronizedCaptureSession synchronizedCaptureSession) {
        synchronized (this.f10711b) {
            this.f10713d.add(synchronizedCaptureSession);
        }
    }

    /* renamed from: j */
    public void m63455j(SynchronizedCaptureSession synchronizedCaptureSession) {
        m63464a(synchronizedCaptureSession);
        synchronized (this.f10711b) {
            this.f10714e.remove(synchronizedCaptureSession);
        }
    }

    /* renamed from: k */
    public void m63454k(SynchronizedCaptureSession synchronizedCaptureSession) {
        synchronized (this.f10711b) {
            this.f10712c.add(synchronizedCaptureSession);
            this.f10714e.remove(synchronizedCaptureSession);
        }
        m63464a(synchronizedCaptureSession);
    }

    /* renamed from: l */
    public void m63453l(SynchronizedCaptureSession synchronizedCaptureSession) {
        synchronized (this.f10711b) {
            this.f10714e.add(synchronizedCaptureSession);
        }
    }
}