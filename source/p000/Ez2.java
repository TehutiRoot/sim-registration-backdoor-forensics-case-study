package p000;

import java.util.AbstractSet;
import java.util.Iterator;

/* renamed from: Ez2 */
/* loaded from: classes3.dex */
public final class Ez2 extends AbstractSet {

    /* renamed from: a */
    public final /* synthetic */ C23402zz2 f1470a;

    public Ez2(C23402zz2 c23402zz2) {
        this.f1470a = c23402zz2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        for (String str : this.f1470a.f109247b.f45897d) {
            this.f1470a.f109247b.zzao(str).zzb(this.f1470a.f109246a, null);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        for (String str : this.f1470a.f109247b.f45897d) {
            if (this.f1470a.f109247b.zzao(str).zzh(this.f1470a.f109246a) != null) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return new Kz2(this.f1470a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        int i = 0;
        for (String str : this.f1470a.f109247b.f45897d) {
            if (this.f1470a.f109247b.zzao(str).zzh(this.f1470a.f109246a) != null) {
                i++;
            }
        }
        return i;
    }
}
