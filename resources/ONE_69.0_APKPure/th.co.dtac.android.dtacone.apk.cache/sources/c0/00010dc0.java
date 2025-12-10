package p000;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzew;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhd;
import java.util.Iterator;

/* renamed from: su2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C22248su2 implements Iterator {

    /* renamed from: a */
    public final Iterator f80030a;

    /* renamed from: b */
    public final /* synthetic */ zzhd f80031b;

    public C22248su2(zzhd zzhdVar) {
        zzew zzewVar;
        this.f80031b = zzhdVar;
        zzewVar = zzhdVar.f46994a;
        this.f80030a = zzewVar.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f80030a.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return (String) this.f80030a.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}