package p000;

import com.google.android.gms.internal.clearcut.zzbb;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: Se2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C18468Se2 implements Iterator {

    /* renamed from: a */
    public int f5880a = 0;

    /* renamed from: b */
    public final int f5881b;

    /* renamed from: c */
    public final /* synthetic */ zzbb f5882c;

    public C18468Se2(zzbb zzbbVar) {
        this.f5882c = zzbbVar;
        this.f5881b = zzbbVar.size();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f5880a < this.f5881b) {
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
            zzbb zzbbVar = this.f5882c;
            int i = this.f5880a;
            this.f5880a = i + 1;
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