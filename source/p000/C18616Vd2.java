package p000;

import com.google.android.gms.internal.clearcut.zzbb;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: Vd2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C18616Vd2 implements Iterator {

    /* renamed from: a */
    public int f6759a = 0;

    /* renamed from: b */
    public final int f6760b;

    /* renamed from: c */
    public final /* synthetic */ zzbb f6761c;

    public C18616Vd2(zzbb zzbbVar) {
        this.f6761c = zzbbVar;
        this.f6760b = zzbbVar.size();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f6759a < this.f6760b) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        return Byte.valueOf(nextByte());
    }

    public final byte nextByte() {
        try {
            zzbb zzbbVar = this.f6761c;
            int i = this.f6759a;
            this.f6759a = i + 1;
            return zzbbVar.zzj(i);
        } catch (IndexOutOfBoundsException e) {
            throw new NoSuchElementException(e.getMessage());
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
