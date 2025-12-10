package p000;

import com.google.android.gms.internal.vision.zzht;
import java.util.NoSuchElementException;

/* renamed from: nw2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C21389nw2 extends AbstractC23465zw2 {

    /* renamed from: a */
    public int f72638a = 0;

    /* renamed from: b */
    public final int f72639b;

    /* renamed from: c */
    public final /* synthetic */ zzht f72640c;

    public C21389nw2(zzht zzhtVar) {
        this.f72640c = zzhtVar;
        this.f72639b = zzhtVar.zza();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f72638a < this.f72639b) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.vision.zzhy
    public final byte zza() {
        int i = this.f72638a;
        if (i < this.f72639b) {
            this.f72638a = i + 1;
            return this.f72640c.zzb(i);
        }
        throw new NoSuchElementException();
    }
}