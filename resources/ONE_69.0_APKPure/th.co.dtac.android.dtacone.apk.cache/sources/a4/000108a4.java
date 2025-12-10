package p000;

import com.google.android.gms.internal.mlkit_vision_barcode.zzcp;
import com.google.android.gms.internal.mlkit_vision_barcode.zzcq;
import java.util.Arrays;
import java.util.Collection;

/* renamed from: rh2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC22036rh2 extends zzcp {

    /* renamed from: a */
    public Object[] f77600a = new Object[4];

    /* renamed from: b */
    public int f77601b = 0;

    /* renamed from: c */
    public boolean f77602c;

    public AbstractC22036rh2(int i) {
    }

    /* renamed from: a */
    public final void m23458a(int i) {
        Object[] objArr = this.f77600a;
        int length = objArr.length;
        if (length < i) {
            int i2 = length + (length >> 1) + 1;
            if (i2 < i) {
                int highestOneBit = Integer.highestOneBit(i - 1);
                i2 = highestOneBit + highestOneBit;
            }
            if (i2 < 0) {
                i2 = Integer.MAX_VALUE;
            }
            this.f77600a = Arrays.copyOf(objArr, i2);
            this.f77602c = false;
        } else if (this.f77602c) {
            this.f77600a = (Object[]) objArr.clone();
            this.f77602c = false;
        }
    }

    public final AbstractC22036rh2 zza(Object obj) {
        obj.getClass();
        m23458a(this.f77601b + 1);
        Object[] objArr = this.f77600a;
        int i = this.f77601b;
        this.f77601b = i + 1;
        objArr[i] = obj;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final zzcp zzc(Iterable iterable) {
        if (iterable instanceof Collection) {
            m23458a(this.f77601b + iterable.size());
            if (iterable instanceof zzcq) {
                this.f77601b = ((zzcq) iterable).zza(this.f77600a, this.f77601b);
                return this;
            }
        }
        for (Object obj : iterable) {
            zzb(obj);
        }
        return this;
    }
}