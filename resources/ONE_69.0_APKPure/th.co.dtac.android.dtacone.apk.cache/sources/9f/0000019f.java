package p000;

import android.content.Context;
import androidx.core.content.PermissionChecker;
import com.google.android.gms.internal.mlkit_common.zzj;
import com.google.android.gms.internal.mlkit_common.zzk;

/* renamed from: Bi2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C17375Bi2 extends zzk {
    @Override // com.google.android.gms.internal.mlkit_common.zzk
    public final int zza(Context context, zzj zzjVar, boolean z) {
        if (zzjVar.zza.getAuthority().lastIndexOf(64) >= 0 && PermissionChecker.checkSelfPermission(context, "android.permission.INTERACT_ACROSS_USERS") == 0) {
            return 2;
        }
        return 3;
    }
}