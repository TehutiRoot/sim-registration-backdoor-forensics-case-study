package p000;

import com.google.android.gms.internal.mlkit_common.zzsb;
import com.google.android.gms.internal.mlkit_common.zzsc;
import com.google.android.gms.internal.mlkit_common.zzsh;
import com.google.android.gms.internal.mlkit_common.zzsq;
import com.google.mlkit.common.sdkinternal.LazyInstanceMap;
import com.google.mlkit.common.sdkinternal.MlKitContext;
import com.google.mlkit.common.sdkinternal.SharedPrefManager;

/* renamed from: AJ2 */
/* loaded from: classes3.dex */
public final class AJ2 extends LazyInstanceMap {
    public /* synthetic */ AJ2(zzsq zzsqVar) {
    }

    @Override // com.google.mlkit.common.sdkinternal.LazyInstanceMap
    public final /* bridge */ /* synthetic */ Object create(Object obj) {
        zzsb zzsbVar = (zzsb) obj;
        MlKitContext mlKitContext = MlKitContext.getInstance();
        return new zzsh(mlKitContext.getApplicationContext(), (SharedPrefManager) mlKitContext.get(SharedPrefManager.class), new zzsc(MlKitContext.getInstance().getApplicationContext(), zzsbVar), zzsbVar.zzb());
    }
}
