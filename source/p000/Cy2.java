package p000;

import com.google.android.gms.internal.measurement.zzjd;
import java.util.NoSuchElementException;

/* renamed from: Cy2 */
/* loaded from: classes3.dex */
public final class Cy2 extends Ty2 {

    /* renamed from: a */
    public int f876a = 0;

    /* renamed from: b */
    public final int f877b;

    /* renamed from: c */
    public final /* synthetic */ zzjd f878c;

    public Cy2(zzjd zzjdVar) {
        this.f878c = zzjdVar;
        this.f877b = zzjdVar.zzd();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f876a < this.f877b) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.zziy
    public final byte zza() {
        int i = this.f876a;
        if (i < this.f877b) {
            this.f876a = i + 1;
            return this.f878c.zzb(i);
        }
        throw new NoSuchElementException();
    }
}
