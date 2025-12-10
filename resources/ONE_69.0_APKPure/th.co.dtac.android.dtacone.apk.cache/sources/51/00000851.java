package p000;

import com.google.android.gms.internal.vision.zzfa;
import java.util.NoSuchElementException;

/* renamed from: Im2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C17842Im2 extends zzfa {

    /* renamed from: a */
    public boolean f2808a;

    /* renamed from: b */
    public final /* synthetic */ Object f2809b;

    public C17842Im2(Object obj) {
        this.f2809b = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (!this.f2808a) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.f2808a) {
            this.f2808a = true;
            return this.f2809b;
        }
        throw new NoSuchElementException();
    }
}