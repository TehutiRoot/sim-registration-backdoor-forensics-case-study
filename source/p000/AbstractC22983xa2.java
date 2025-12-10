package p000;

import com.google.android.gms.internal.common.zzab;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Arrays;

/* renamed from: xa2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC22983xa2 extends zzab {

    /* renamed from: a */
    public Object[] f108432a = new Object[4];

    /* renamed from: b */
    public int f108433b = 0;

    /* renamed from: c */
    public boolean f108434c;

    public AbstractC22983xa2(int i) {
    }

    @CanIgnoreReturnValue
    public final AbstractC22983xa2 zza(Object obj) {
        obj.getClass();
        int i = this.f108433b;
        int i2 = i + 1;
        Object[] objArr = this.f108432a;
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
            this.f108432a = Arrays.copyOf(objArr, i3);
            this.f108434c = false;
        } else if (this.f108434c) {
            this.f108432a = (Object[]) objArr.clone();
            this.f108434c = false;
        }
        Object[] objArr2 = this.f108432a;
        int i4 = this.f108433b;
        this.f108433b = i4 + 1;
        objArr2[i4] = obj;
        return this;
    }
}
