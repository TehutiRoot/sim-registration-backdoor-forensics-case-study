package p000;

import com.google.android.gms.internal.mlkit_vision_face.zzbh;
import java.util.Arrays;

/* renamed from: kf2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC20819kf2 extends zzbh {

    /* renamed from: a */
    public Object[] f68019a = new Object[4];

    /* renamed from: b */
    public int f68020b = 0;

    /* renamed from: c */
    public boolean f68021c;

    public AbstractC20819kf2(int i) {
    }

    /* renamed from: a */
    public final void m29175a(int i) {
        Object[] objArr = this.f68019a;
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
            this.f68019a = Arrays.copyOf(objArr, i2);
            this.f68021c = false;
        } else if (this.f68021c) {
            this.f68019a = (Object[]) objArr.clone();
            this.f68021c = false;
        }
    }

    public final AbstractC20819kf2 zza(Object obj) {
        obj.getClass();
        m29175a(this.f68020b + 1);
        Object[] objArr = this.f68019a;
        int i = this.f68020b;
        this.f68020b = i + 1;
        objArr[i] = obj;
        return this;
    }
}