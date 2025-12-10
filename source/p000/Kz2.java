package p000;

import com.google.android.gms.internal.firebase_ml.zziv;
import com.google.android.gms.internal.firebase_ml.zzjd;
import com.google.android.gms.internal.firebase_ml.zzml;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: Kz2 */
/* loaded from: classes3.dex */
public final class Kz2 implements Iterator {

    /* renamed from: a */
    public int f3344a = -1;

    /* renamed from: b */
    public zzjd f3345b;

    /* renamed from: c */
    public Object f3346c;

    /* renamed from: d */
    public boolean f3347d;

    /* renamed from: e */
    public boolean f3348e;

    /* renamed from: f */
    public zzjd f3349f;

    /* renamed from: g */
    public final /* synthetic */ C23402zz2 f3350g;

    public Kz2(C23402zz2 c23402zz2) {
        this.f3350g = c23402zz2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (!this.f3348e) {
            this.f3348e = true;
            this.f3346c = null;
            while (this.f3346c == null) {
                int i = this.f3344a + 1;
                this.f3344a = i;
                if (i >= this.f3350g.f109247b.f45897d.size()) {
                    break;
                }
                zziv zzivVar = this.f3350g.f109247b;
                zzjd zzao = zzivVar.zzao((String) zzivVar.f45897d.get(this.f3344a));
                this.f3345b = zzao;
                this.f3346c = zzao.zzh(this.f3350g.f109246a);
            }
        }
        if (this.f3346c != null) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        if (hasNext()) {
            zzjd zzjdVar = this.f3345b;
            this.f3349f = zzjdVar;
            Object obj = this.f3346c;
            this.f3348e = false;
            this.f3347d = false;
            this.f3345b = null;
            this.f3346c = null;
            return new C20306hz2(this.f3350g, zzjdVar, obj);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        boolean z;
        if (this.f3349f != null && !this.f3347d) {
            z = true;
        } else {
            z = false;
        }
        zzml.checkState(z);
        this.f3347d = true;
        this.f3349f.zzb(this.f3350g.f109246a, null);
    }
}
