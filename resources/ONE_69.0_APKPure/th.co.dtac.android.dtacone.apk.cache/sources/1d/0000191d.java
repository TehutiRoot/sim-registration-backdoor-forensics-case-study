package p000;

import com.google.android.gms.internal.mlkit_vision_text_common.zztu;
import com.google.android.gms.internal.mlkit_vision_text_common.zztv;
import com.google.android.gms.internal.mlkit_vision_text_common.zzuc;
import com.google.android.gms.internal.mlkit_vision_text_common.zzul;
import com.google.mlkit.common.sdkinternal.LazyInstanceMap;
import com.google.mlkit.common.sdkinternal.MlKitContext;
import com.google.mlkit.common.sdkinternal.SharedPrefManager;

/* renamed from: aL2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C19037aL2 extends LazyInstanceMap {
    public /* synthetic */ C19037aL2(zzul zzulVar) {
    }

    @Override // com.google.mlkit.common.sdkinternal.LazyInstanceMap
    public final /* bridge */ /* synthetic */ Object create(Object obj) {
        zztu zztuVar = (zztu) obj;
        MlKitContext mlKitContext = MlKitContext.getInstance();
        return new zzuc(mlKitContext.getApplicationContext(), (SharedPrefManager) mlKitContext.get(SharedPrefManager.class), new zztv(MlKitContext.getInstance().getApplicationContext(), zztuVar), zztuVar.zzb());
    }
}