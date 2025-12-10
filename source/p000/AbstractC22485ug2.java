package p000;

import com.google.android.gms.internal.mlkit_vision_barcode.zzcp;
import com.google.android.gms.internal.mlkit_vision_barcode.zzcq;
import java.util.Arrays;
import java.util.Collection;

/* renamed from: ug2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC22485ug2 extends zzcp {

    /* renamed from: a */
    public Object[] f107430a = new Object[4];

    /* renamed from: b */
    public int f107431b = 0;

    /* renamed from: c */
    public boolean f107432c;

    public AbstractC22485ug2(int i) {
    }

    /* renamed from: a */
    public final void m1232a(int i) {
        Object[] objArr = this.f107430a;
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
            this.f107430a = Arrays.copyOf(objArr, i2);
            this.f107432c = false;
        } else if (this.f107432c) {
            this.f107430a = (Object[]) objArr.clone();
            this.f107432c = false;
        }
    }

    public final AbstractC22485ug2 zza(Object obj) {
        obj.getClass();
        m1232a(this.f107431b + 1);
        Object[] objArr = this.f107430a;
        int i = this.f107431b;
        this.f107431b = i + 1;
        objArr[i] = obj;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final zzcp zzc(Iterable iterable) {
        if (iterable instanceof Collection) {
            m1232a(this.f107431b + iterable.size());
            if (iterable instanceof zzcq) {
                this.f107431b = ((zzcq) iterable).zza(this.f107430a, this.f107431b);
                return this;
            }
        }
        for (Object obj : iterable) {
            zzb(obj);
        }
        return this;
    }
}
