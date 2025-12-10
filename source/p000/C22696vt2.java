package p000;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzew;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhd;
import java.util.Iterator;

/* renamed from: vt2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C22696vt2 implements Iterator {

    /* renamed from: a */
    public final Iterator f107831a;

    /* renamed from: b */
    public final /* synthetic */ zzhd f107832b;

    public C22696vt2(zzhd zzhdVar) {
        zzew zzewVar;
        this.f107832b = zzhdVar;
        zzewVar = zzhdVar.f46982a;
        this.f107831a = zzewVar.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f107831a.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return (String) this.f107831a.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
