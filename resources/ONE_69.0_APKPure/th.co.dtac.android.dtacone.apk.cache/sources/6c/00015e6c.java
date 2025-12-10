package p000;

import com.google.android.gms.internal.common.zzab;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Arrays;

/* renamed from: ub2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC22537ub2 extends zzab {

    /* renamed from: a */
    public Object[] f107821a = new Object[4];

    /* renamed from: b */
    public int f107822b = 0;

    /* renamed from: c */
    public boolean f107823c;

    public AbstractC22537ub2(int i) {
    }

    @CanIgnoreReturnValue
    public final AbstractC22537ub2 zza(Object obj) {
        obj.getClass();
        int i = this.f107822b;
        int i2 = i + 1;
        Object[] objArr = this.f107821a;
        int length = objArr.length;
        if (length < i2) {
            int i3 = length + (length >> 1) + 1;
            if (i3 < i2) {
                int highestOneBit = Integer.highestOneBit(i);
                i3 = highestOneBit + highestOneBit;
            }
            if (i3 < 0) {
                i3 = Integer.MAX_VALUE;
            }
            this.f107821a = Arrays.copyOf(objArr, i3);
            this.f107823c = false;
        } else if (this.f107823c) {
            this.f107821a = (Object[]) objArr.clone();
            this.f107823c = false;
        }
        Object[] objArr2 = this.f107821a;
        int i4 = this.f107822b;
        this.f107822b = i4 + 1;
        objArr2[i4] = obj;
        return this;
    }
}