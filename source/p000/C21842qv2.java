package p000;

import com.google.android.gms.internal.vision.zzht;
import java.util.NoSuchElementException;

/* renamed from: qv2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C21842qv2 extends Cv2 {

    /* renamed from: a */
    public int f77123a = 0;

    /* renamed from: b */
    public final int f77124b;

    /* renamed from: c */
    public final /* synthetic */ zzht f77125c;

    public C21842qv2(zzht zzhtVar) {
        this.f77125c = zzhtVar;
        this.f77124b = zzhtVar.zza();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f77123a < this.f77124b) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.vision.zzhy
    public final byte zza() {
        int i = this.f77123a;
        if (i < this.f77124b) {
            this.f77123a = i + 1;
            return this.f77125c.zzb(i);
        }
        throw new NoSuchElementException();
    }
}
