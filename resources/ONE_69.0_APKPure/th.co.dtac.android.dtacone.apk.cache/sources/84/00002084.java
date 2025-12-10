package androidx.camera.extensions.internal.sessionprocessor;

import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.util.LongSparseArray;
import androidx.core.util.Preconditions;
import java.util.HashMap;
import java.util.Map;

/* renamed from: androidx.camera.extensions.internal.sessionprocessor.b */
/* loaded from: classes.dex */
public class C2566b {

    /* renamed from: a */
    public final Object f11672a = new Object();

    /* renamed from: b */
    public final LongSparseArray f11673b = new LongSparseArray();

    /* renamed from: c */
    public Map f11674c = new HashMap();

    /* renamed from: d */
    public final LongSparseArray f11675d = new LongSparseArray();

    /* renamed from: e */
    public InterfaceC2567a f11676e;

    /* renamed from: androidx.camera.extensions.internal.sessionprocessor.b$a */
    /* loaded from: classes.dex */
    public interface InterfaceC2567a {
        /* renamed from: a */
        void mo62498a(ImageReference imageReference, TotalCaptureResult totalCaptureResult, int i);
    }

    /* renamed from: a */
    public void m62514a(TotalCaptureResult totalCaptureResult) {
        m62513b(totalCaptureResult, 0);
    }

    /* renamed from: b */
    public void m62513b(TotalCaptureResult totalCaptureResult, int i) {
        synchronized (this.f11672a) {
            try {
                long m62510e = m62510e(totalCaptureResult);
                if (m62510e == -1) {
                    return;
                }
                this.f11673b.put(m62510e, totalCaptureResult);
                this.f11674c.put(totalCaptureResult, Integer.valueOf(i));
                m62508g();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: c */
    public void m62512c() {
        synchronized (this.f11672a) {
            try {
                this.f11673b.clear();
                for (int i = 0; i < this.f11675d.size(); i++) {
                    ((ImageReference) this.f11675d.get(this.f11675d.keyAt(i))).decrement();
                }
                this.f11675d.clear();
                this.f11674c.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: d */
    public void m62511d() {
        synchronized (this.f11672a) {
            this.f11676e = null;
        }
    }

    /* renamed from: e */
    public final long m62510e(TotalCaptureResult totalCaptureResult) {
        Long l = (Long) totalCaptureResult.get(CaptureResult.SENSOR_TIMESTAMP);
        if (l != null) {
            return l.longValue();
        }
        return -1L;
    }

    /* renamed from: f */
    public void m62509f(ImageReference imageReference) {
        synchronized (this.f11672a) {
            this.f11675d.put(imageReference.get().getTimestamp(), imageReference);
        }
        m62508g();
    }

    /* renamed from: g */
    public final void m62508g() {
        ImageReference imageReference;
        TotalCaptureResult totalCaptureResult;
        synchronized (this.f11672a) {
            try {
                imageReference = null;
                totalCaptureResult = null;
                for (int size = this.f11673b.size() - 1; size >= 0; size--) {
                    TotalCaptureResult totalCaptureResult2 = (TotalCaptureResult) this.f11673b.valueAt(size);
                    long m62510e = m62510e(totalCaptureResult2);
                    ImageReference imageReference2 = (ImageReference) this.f11675d.get(m62510e);
                    if (imageReference2 != null) {
                        this.f11675d.remove(m62510e);
                        this.f11673b.removeAt(size);
                        totalCaptureResult = totalCaptureResult2;
                        imageReference = imageReference2;
                    }
                }
                m62506i();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (imageReference != null && totalCaptureResult != null) {
            m62507h(imageReference, totalCaptureResult);
        }
    }

    /* renamed from: h */
    public final void m62507h(ImageReference imageReference, TotalCaptureResult totalCaptureResult) {
        InterfaceC2567a interfaceC2567a;
        Integer num;
        synchronized (this.f11672a) {
            try {
                interfaceC2567a = this.f11676e;
                if (interfaceC2567a != null) {
                    num = (Integer) this.f11674c.get(totalCaptureResult);
                } else {
                    imageReference.decrement();
                    interfaceC2567a = null;
                    num = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (interfaceC2567a != null) {
            interfaceC2567a.mo62498a(imageReference, totalCaptureResult, num.intValue());
        }
    }

    /* renamed from: i */
    public final void m62506i() {
        synchronized (this.f11672a) {
            try {
                if (this.f11675d.size() != 0 && this.f11673b.size() != 0) {
                    long keyAt = this.f11675d.keyAt(0);
                    Long valueOf = Long.valueOf(keyAt);
                    long keyAt2 = this.f11673b.keyAt(0);
                    Preconditions.checkArgument(!Long.valueOf(keyAt2).equals(valueOf));
                    if (keyAt2 > keyAt) {
                        for (int size = this.f11675d.size() - 1; size >= 0; size--) {
                            if (this.f11675d.keyAt(size) < keyAt2) {
                                ((ImageReference) this.f11675d.valueAt(size)).decrement();
                                this.f11675d.removeAt(size);
                            }
                        }
                    } else {
                        for (int size2 = this.f11673b.size() - 1; size2 >= 0; size2--) {
                            if (this.f11673b.keyAt(size2) < keyAt) {
                                this.f11673b.removeAt(size2);
                            }
                        }
                    }
                }
            } finally {
            }
        }
    }

    /* renamed from: j */
    public void m62505j(InterfaceC2567a interfaceC2567a) {
        synchronized (this.f11672a) {
            this.f11676e = interfaceC2567a;
        }
    }
}