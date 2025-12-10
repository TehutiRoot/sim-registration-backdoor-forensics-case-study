package p000;

import com.google.android.gms.internal.mlkit_vision_barcode.zztp;
import com.google.android.gms.internal.mlkit_vision_barcode.zztq;
import com.google.android.gms.internal.mlkit_vision_barcode.zztx;
import com.google.android.gms.internal.mlkit_vision_barcode.zzug;
import com.google.mlkit.common.sdkinternal.LazyInstanceMap;
import com.google.mlkit.common.sdkinternal.MlKitContext;
import com.google.mlkit.common.sdkinternal.SharedPrefManager;

/* renamed from: bK2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C19165bK2 extends LazyInstanceMap {
    public /* synthetic */ C19165bK2(zzug zzugVar) {
    }

    @Override // com.google.mlkit.common.sdkinternal.LazyInstanceMap
    public final /* bridge */ /* synthetic */ Object create(Object obj) {
        zztp zztpVar = (zztp) obj;
        MlKitContext mlKitContext = MlKitContext.getInstance();
        return new zztx(mlKitContext.getApplicationContext(), (SharedPrefManager) mlKitContext.get(SharedPrefManager.class), new zztq(MlKitContext.getInstance().getApplicationContext(), zztpVar), zztpVar.zzb());
    }
}
