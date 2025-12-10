package androidx.camera.extensions.internal.sessionprocessor;

import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.util.LongSparseArray;
import androidx.core.util.Preconditions;
import java.util.HashMap;
import java.util.Map;

/* renamed from: androidx.camera.extensions.internal.sessionprocessor.b */
/* loaded from: classes.dex */
public class C2584b {

    /* renamed from: a */
    public final Object f11584a = new Object();

    /* renamed from: b */
    public final LongSparseArray f11585b = new LongSparseArray();

    /* renamed from: c */
    public Map f11586c = new HashMap();

    /* renamed from: d */
    public final LongSparseArray f11587d = new LongSparseArray();

    /* renamed from: e */
    public InterfaceC2585a f11588e;

    /* renamed from: androidx.camera.extensions.internal.sessionprocessor.b$a */
    /* loaded from: classes.dex */
    public interface InterfaceC2585a {
        /* renamed from: a */
        void mo62550a(ImageReference imageReference, TotalCaptureResult totalCaptureResult, int i);
    }

    /* renamed from: a */
    public void m62566a(TotalCaptureResult totalCaptureResult) {
        m62565b(totalCaptureResult, 0);
    }

    /* renamed from: b */
    public void m62565b(TotalCaptureResult totalCaptureResult, int i) {
        synchronized (this.f11584a) {
            try {
                long m62562e = m62562e(totalCaptureResult);
                if (m62562e == -1) {
                    return;
                }
                this.f11585b.put(m62562e, totalCaptureResult);
                this.f11586c.put(totalCaptureResult, Integer.valueOf(i));
                m62560g();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: c */
    public void m62564c() {
        synchronized (this.f11584a) {
            try {
                this.f11585b.clear();
                for (int i = 0; i < this.f11587d.size(); i++) {
                    ((ImageReference) this.f11587d.get(this.f11587d.keyAt(i))).decrement();
                }
                this.f11587d.clear();
                this.f11586c.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: d */
    public void m62563d() {
        synchronized (this.f11584a) {
            this.f11588e = null;
        }
    }

    /* renamed from: e */
    public final long m62562e(TotalCaptureResult totalCaptureResult) {
        Long l = (Long) totalCaptureResult.get(CaptureResult.SENSOR_TIMESTAMP);
        if (l != null) {
            return l.longValue();
        }
        return -1L;
    }

    /* renamed from: f */
    public void m62561f(ImageReference imageReference) {
        synchronized (this.f11584a) {
            this.f11587d.put(imageReference.get().getTimestamp(), imageReference);
        }
        m62560g();
    }

    /* renamed from: g */
    public final void m62560g() {
        ImageReference imageReference;
        TotalCaptureResult totalCaptureResult;
        synchronized (this.f11584a) {
            try {
                imageReference = null;
                totalCaptureResult = null;
                for (int size = this.f11585b.size() - 1; size >= 0; size--) {
                    TotalCaptureResult totalCaptureResult2 = (TotalCaptureResult) this.f11585b.valueAt(size);
                    long m62562e = m62562e(totalCaptureResult2);
                    ImageReference imageReference2 = (ImageReference) this.f11587d.get(m62562e);
                    if (imageReference2 != null) {
                        this.f11587d.remove(m62562e);
                        this.f11585b.removeAt(size);
                        totalCaptureResult = totalCaptureResult2;
                        imageReference = imageReference2;
                    }
                }
                m62558i();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (imageReference != null && totalCaptureResult != null) {
            m62559h(imageReference, totalCaptureResult);
        }
    }

    /* renamed from: h */
    public final void m62559h(ImageReference imageReference, TotalCaptureResult totalCaptureResult) {
        InterfaceC2585a interfaceC2585a;
        Integer num;
        synchronized (this.f11584a) {
            try {
                interfaceC2585a = this.f11588e;
                if (interfaceC2585a != null) {
                    num = (Integer) this.f11586c.get(totalCaptureResult);
                } else {
                    imageReference.decrement();
                    interfaceC2585a = null;
                    num = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (interfaceC2585a != null) {
            interfaceC2585a.mo62550a(imageReference, totalCaptureResult, num.intValue());
        }
    }

    /* renamed from: i */
    public final void m62558i() {
        synchronized (this.f11584a) {
            try {
                if (this.f11587d.size() != 0 && this.f11585b.size() != 0) {
                    long keyAt = this.f11587d.keyAt(0);
                    Long valueOf = Long.valueOf(keyAt);
                    long keyAt2 = this.f11585b.keyAt(0);
                    Preconditions.checkArgument(!Long.valueOf(keyAt2).equals(valueOf));
                    if (keyAt2 > keyAt) {
                        for (int size = this.f11587d.size() - 1; size >= 0; size--) {
                            if (this.f11587d.keyAt(size) < keyAt2) {
                                ((ImageReference) this.f11587d.valueAt(size)).decrement();
                                this.f11587d.removeAt(size);
                            }
                        }
                    } else {
                        for (int size2 = this.f11585b.size() - 1; size2 >= 0; size2--) {
                            if (this.f11585b.keyAt(size2) < keyAt) {
                                this.f11585b.removeAt(size2);
                            }
                        }
                    }
                }
            } finally {
            }
        }
    }

    /* renamed from: j */
    public void m62557j(InterfaceC2585a interfaceC2585a) {
        synchronized (this.f11584a) {
            this.f11588e = interfaceC2585a;
        }
    }
}
