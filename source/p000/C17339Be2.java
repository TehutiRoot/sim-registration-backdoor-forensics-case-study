package p000;

import com.google.android.gms.internal.maps.zzbx;
import java.util.NoSuchElementException;

/* renamed from: Be2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C17339Be2 extends zzbx {

    /* renamed from: a */
    public final Object f452a;

    /* renamed from: b */
    public boolean f453b;

    public C17339Be2(Object obj) {
        this.f452a = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (!this.f453b) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.f453b) {
            this.f453b = true;
            return this.f452a;
        }
        throw new NoSuchElementException();
    }
}
