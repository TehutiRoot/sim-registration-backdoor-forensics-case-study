package p000;

import com.google.android.gms.internal.measurement.zzat;
import java.util.Iterator;

/* renamed from: Sb2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C18418Sb2 implements Iterator {

    /* renamed from: a */
    public final /* synthetic */ Iterator f5653a;

    public C18418Sb2(Iterator it) {
        this.f5653a = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f5653a.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return new zzat((String) this.f5653a.next());
    }
}
