package p000;

import com.google.android.gms.internal.firebase_ml.zzwd;
import java.util.NoSuchElementException;

/* renamed from: zL2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C23367zL2 extends AL2 {

    /* renamed from: a */
    public int f109351a = 0;

    /* renamed from: b */
    public final int f109352b;

    /* renamed from: c */
    public final /* synthetic */ zzwd f109353c;

    public C23367zL2(zzwd zzwdVar) {
        this.f109353c = zzwdVar;
        this.f109352b = zzwdVar.size();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f109351a < this.f109352b) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzwi
    public final byte nextByte() {
        int i = this.f109351a;
        if (i < this.f109352b) {
            this.f109351a = i + 1;
            return this.f109353c.zzdc(i);
        }
        throw new NoSuchElementException();
    }
}