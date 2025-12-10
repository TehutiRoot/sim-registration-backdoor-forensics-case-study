package com.google.android.gms.internal.mlkit_vision_barcode;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class zztq implements zztn {

    /* renamed from: a */
    public final List f46717a;

    public zztq(Context context, zztp zztpVar) {
        ArrayList arrayList = new ArrayList();
        this.f46717a = arrayList;
        if (zztpVar.zzc()) {
            arrayList.add(new zzuf(context, zztpVar));
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zztn
    public final void zza(zztm zztmVar) {
        for (zztn zztnVar : this.f46717a) {
            zztnVar.zza(zztmVar);
        }
    }
}
