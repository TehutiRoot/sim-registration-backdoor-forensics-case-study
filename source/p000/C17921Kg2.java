package p000;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdb;
import java.util.NoSuchElementException;

/* renamed from: Kg2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C17921Kg2 extends AbstractC18561Ug2 {

    /* renamed from: a */
    public int f3249a = 0;

    /* renamed from: b */
    public final int f3250b;

    /* renamed from: c */
    public final /* synthetic */ zzdb f3251c;

    public C17921Kg2(zzdb zzdbVar) {
        this.f3251c = zzdbVar;
        this.f3250b = zzdbVar.zzd();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f3249a < this.f3250b) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcw
    public final byte zza() {
        int i = this.f3249a;
        if (i < this.f3250b) {
            this.f3249a = i + 1;
            return this.f3251c.zzb(i);
        }
        throw new NoSuchElementException();
    }
}
