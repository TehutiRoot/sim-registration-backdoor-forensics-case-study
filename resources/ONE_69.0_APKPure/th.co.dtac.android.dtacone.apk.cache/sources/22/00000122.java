package p000;

import java.util.AbstractSet;
import java.util.Iterator;

/* renamed from: BA2 */
/* loaded from: classes3.dex */
public final class BA2 extends AbstractSet {

    /* renamed from: a */
    public final /* synthetic */ C22815wA2 f336a;

    public BA2(C22815wA2 c22815wA2) {
        this.f336a = c22815wA2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        for (String str : this.f336a.f108355b.f45909d) {
            this.f336a.f108355b.zzao(str).zzb(this.f336a.f108354a, null);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        for (String str : this.f336a.f108355b.f45909d) {
            if (this.f336a.f108355b.zzao(str).zzh(this.f336a.f108354a) != null) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return new HA2(this.f336a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        int i = 0;
        for (String str : this.f336a.f108355b.f45909d) {
            if (this.f336a.f108355b.zzao(str).zzh(this.f336a.f108354a) != null) {
                i++;
            }
        }
        return i;
    }
}