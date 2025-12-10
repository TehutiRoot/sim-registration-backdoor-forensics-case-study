package p000;

import com.google.android.gms.internal.mlkit_vision_common.zzk;
import java.util.Arrays;

/* renamed from: oz2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC21510oz2 extends zzk {

    /* renamed from: a */
    public Object[] f76449a = new Object[4];

    /* renamed from: b */
    public int f76450b = 0;

    /* renamed from: c */
    public boolean f76451c;

    public AbstractC21510oz2(int i) {
    }

    /* renamed from: a */
    public final void m23741a(int i) {
        Object[] objArr = this.f76449a;
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
            this.f76449a = Arrays.copyOf(objArr, i2);
            this.f76451c = false;
        } else if (this.f76451c) {
            this.f76449a = (Object[]) objArr.clone();
            this.f76451c = false;
        }
    }

    public final AbstractC21510oz2 zza(Object obj) {
        obj.getClass();
        m23741a(this.f76450b + 1);
        Object[] objArr = this.f76449a;
        int i = this.f76450b;
        this.f76450b = i + 1;
        objArr[i] = obj;
        return this;
    }
}
