package p000;

import com.google.android.gms.internal.mlkit_vision_common.zzk;
import java.util.Arrays;

/* renamed from: lA2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC20912lA2 extends zzk {

    /* renamed from: a */
    public Object[] f71605a = new Object[4];

    /* renamed from: b */
    public int f71606b = 0;

    /* renamed from: c */
    public boolean f71607c;

    public AbstractC20912lA2(int i) {
    }

    /* renamed from: a */
    public final void m26853a(int i) {
        Object[] objArr = this.f71605a;
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
            this.f71605a = Arrays.copyOf(objArr, i2);
            this.f71607c = false;
        } else if (this.f71607c) {
            this.f71605a = (Object[]) objArr.clone();
            this.f71607c = false;
        }
    }

    public final AbstractC20912lA2 zza(Object obj) {
        obj.getClass();
        m26853a(this.f71606b + 1);
        Object[] objArr = this.f71605a;
        int i = this.f71606b;
        this.f71606b = i + 1;
        objArr[i] = obj;
        return this;
    }
}