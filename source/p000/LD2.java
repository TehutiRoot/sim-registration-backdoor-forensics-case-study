package p000;

import java.lang.ref.WeakReference;

/* renamed from: LD2 */
/* loaded from: classes3.dex */
public abstract class LD2 extends AbstractBinderC20822kz2 {

    /* renamed from: c */
    public static final WeakReference f3411c = new WeakReference(null);

    /* renamed from: b */
    public WeakReference f3412b;

    public LD2(byte[] bArr) {
        super(bArr);
        this.f3412b = f3411c;
    }

    @Override // p000.AbstractBinderC20822kz2
    /* renamed from: b */
    public final byte[] mo26574b() {
        byte[] bArr;
        synchronized (this) {
            try {
                bArr = (byte[]) this.f3412b.get();
                if (bArr == null) {
                    bArr = mo30703c();
                    this.f3412b = new WeakReference(bArr);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return bArr;
    }

    /* renamed from: c */
    public abstract byte[] mo30703c();
}
