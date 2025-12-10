package p000;

import com.google.android.gms.internal.mlkit_vision_face.zzbh;
import java.util.Arrays;

/* renamed from: ne2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC21275ne2 extends zzbh {

    /* renamed from: a */
    public Object[] f72265a = new Object[4];

    /* renamed from: b */
    public int f72266b = 0;

    /* renamed from: c */
    public boolean f72267c;

    public AbstractC21275ne2(int i) {
    }

    /* renamed from: a */
    public final void m26108a(int i) {
        Object[] objArr = this.f72265a;
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
            this.f72265a = Arrays.copyOf(objArr, i2);
            this.f72267c = false;
        } else if (this.f72267c) {
            this.f72265a = (Object[]) objArr.clone();
            this.f72267c = false;
        }
    }

    public final AbstractC21275ne2 zza(Object obj) {
        obj.getClass();
        m26108a(this.f72266b + 1);
        Object[] objArr = this.f72265a;
        int i = this.f72266b;
        this.f72266b = i + 1;
        objArr[i] = obj;
        return this;
    }
}
