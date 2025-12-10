package p000;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdb;
import java.util.NoSuchElementException;

/* renamed from: Hh2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C17762Hh2 extends AbstractC18412Rh2 {

    /* renamed from: a */
    public int f2454a = 0;

    /* renamed from: b */
    public final int f2455b;

    /* renamed from: c */
    public final /* synthetic */ zzdb f2456c;

    public C17762Hh2(zzdb zzdbVar) {
        this.f2456c = zzdbVar;
        this.f2455b = zzdbVar.zzd();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f2454a < this.f2455b) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcw
    public final byte zza() {
        int i = this.f2454a;
        if (i < this.f2455b) {
            this.f2454a = i + 1;
            return this.f2456c.zzb(i);
        }
        throw new NoSuchElementException();
    }
}