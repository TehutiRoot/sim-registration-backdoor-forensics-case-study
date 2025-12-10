package p000;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzel;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzez;

/* renamed from: en2 */
/* loaded from: classes3.dex */
public final class C19754en2 extends AbstractC21990rn2 {
    public /* synthetic */ C19754en2(zzez zzezVar) {
        super(null);
    }

    @Override // p000.AbstractC21990rn2
    /* renamed from: a */
    public final void mo23269a(Object obj, long j) {
        ((zzel) AbstractC19775eu2.m31401k(obj, j)).zzb();
    }

    @Override // p000.AbstractC21990rn2
    /* renamed from: b */
    public final void mo23268b(Object obj, Object obj2, long j) {
        zzel zzelVar = (zzel) AbstractC19775eu2.m31401k(obj, j);
        zzel zzelVar2 = (zzel) AbstractC19775eu2.m31401k(obj2, j);
        int size = zzelVar.size();
        int size2 = zzelVar2.size();
        if (size > 0 && size2 > 0) {
            if (!zzelVar.zzc()) {
                zzelVar = zzelVar.zzd(size2 + size);
            }
            zzelVar.addAll(zzelVar2);
        }
        if (size > 0) {
            zzelVar2 = zzelVar;
        }
        AbstractC19775eu2.m31388x(obj, j, zzelVar2);
    }
}
