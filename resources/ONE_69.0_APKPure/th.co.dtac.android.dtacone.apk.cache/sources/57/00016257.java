package p000;

import com.google.android.gms.internal.maps.zzbx;
import java.util.NoSuchElementException;

/* renamed from: yf2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C23241yf2 extends zzbx {

    /* renamed from: a */
    public final Object f109102a;

    /* renamed from: b */
    public boolean f109103b;

    public C23241yf2(Object obj) {
        this.f109102a = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (!this.f109103b) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.f109103b) {
            this.f109103b = true;
            return this.f109102a;
        }
        throw new NoSuchElementException();
    }
}