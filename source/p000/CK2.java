package p000;

import com.google.android.gms.internal.firebase_ml.zzwd;
import java.util.NoSuchElementException;

/* renamed from: CK2 */
/* loaded from: classes3.dex */
public final class CK2 extends DK2 {

    /* renamed from: a */
    public int f703a = 0;

    /* renamed from: b */
    public final int f704b;

    /* renamed from: c */
    public final /* synthetic */ zzwd f705c;

    public CK2(zzwd zzwdVar) {
        this.f705c = zzwdVar;
        this.f704b = zzwdVar.size();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f703a < this.f704b) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzwi
    public final byte nextByte() {
        int i = this.f703a;
        if (i < this.f704b) {
            this.f703a = i + 1;
            return this.f705c.zzdc(i);
        }
        throw new NoSuchElementException();
    }
}
