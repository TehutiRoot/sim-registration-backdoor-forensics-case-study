package p000;

import com.google.android.gms.internal.measurement.zzae;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: fc2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C19945fc2 implements Iterator {

    /* renamed from: a */
    public int f61907a = 0;

    /* renamed from: b */
    public final /* synthetic */ zzae f61908b;

    public C19945fc2(zzae zzaeVar) {
        this.f61908b = zzaeVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f61907a < this.f61908b.zzc()) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        if (this.f61907a < this.f61908b.zzc()) {
            zzae zzaeVar = this.f61908b;
            int i = this.f61907a;
            this.f61907a = i + 1;
            return zzaeVar.zze(i);
        }
        int i2 = this.f61907a;
        throw new NoSuchElementException("Out of bounds index: " + i2);
    }
}