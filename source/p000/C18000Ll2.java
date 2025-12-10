package p000;

import com.google.android.gms.internal.vision.zzfa;
import java.util.NoSuchElementException;

/* renamed from: Ll2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C18000Ll2 extends zzfa {

    /* renamed from: a */
    public boolean f3584a;

    /* renamed from: b */
    public final /* synthetic */ Object f3585b;

    public C18000Ll2(Object obj) {
        this.f3585b = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (!this.f3584a) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.f3584a) {
            this.f3584a = true;
            return this.f3585b;
        }
        throw new NoSuchElementException();
    }
}
