package p000;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzew;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhd;
import java.util.ListIterator;

/* renamed from: ot2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C21492ot2 implements ListIterator {

    /* renamed from: a */
    public final ListIterator f76416a;

    /* renamed from: b */
    public final /* synthetic */ int f76417b;

    /* renamed from: c */
    public final /* synthetic */ zzhd f76418c;

    public C21492ot2(zzhd zzhdVar, int i) {
        zzew zzewVar;
        this.f76418c = zzhdVar;
        this.f76417b = i;
        zzewVar = zzhdVar.f46982a;
        this.f76416a = zzewVar.listIterator(i);
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ void add(Object obj) {
        String str = (String) obj;
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f76416a.hasNext();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f76416a.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return (String) this.f76416a.next();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f76416a.nextIndex();
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ Object previous() {
        return (String) this.f76416a.previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f76416a.previousIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ void set(Object obj) {
        String str = (String) obj;
        throw new UnsupportedOperationException();
    }
}
