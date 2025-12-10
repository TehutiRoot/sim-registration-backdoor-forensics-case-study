package p000;

import com.google.android.gms.internal.measurement.zzae;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: ib2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C20406ib2 implements Iterator {

    /* renamed from: a */
    public int f62828a = 0;

    /* renamed from: b */
    public final /* synthetic */ zzae f62829b;

    public C20406ib2(zzae zzaeVar) {
        this.f62829b = zzaeVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f62828a < this.f62829b.zzc()) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        if (this.f62828a < this.f62829b.zzc()) {
            zzae zzaeVar = this.f62829b;
            int i = this.f62828a;
            this.f62828a = i + 1;
            return zzaeVar.zze(i);
        }
        int i2 = this.f62828a;
        throw new NoSuchElementException("Out of bounds index: " + i2);
    }
}
