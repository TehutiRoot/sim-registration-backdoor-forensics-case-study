package p000;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzew;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhd;
import java.util.ListIterator;

/* renamed from: lu2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C21037lu2 implements ListIterator {

    /* renamed from: a */
    public final ListIterator f71838a;

    /* renamed from: b */
    public final /* synthetic */ int f71839b;

    /* renamed from: c */
    public final /* synthetic */ zzhd f71840c;

    public C21037lu2(zzhd zzhdVar, int i) {
        zzew zzewVar;
        this.f71840c = zzhdVar;
        this.f71839b = i;
        zzewVar = zzhdVar.f46994a;
        this.f71838a = zzewVar.listIterator(i);
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ void add(Object obj) {
        String str = (String) obj;
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f71838a.hasNext();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f71838a.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return (String) this.f71838a.next();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f71838a.nextIndex();
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ Object previous() {
        return (String) this.f71838a.previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f71838a.previousIndex();
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