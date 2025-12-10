package p000;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.measurement.internal.zzfy;
import com.google.android.gms.measurement.internal.zzkz;

/* renamed from: qD2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C21724qD2 implements InterfaceC22587vE2 {

    /* renamed from: a */
    public final /* synthetic */ zzkz f76904a;

    public C21724qD2(zzkz zzkzVar) {
        this.f76904a = zzkzVar;
    }

    @Override // p000.InterfaceC22587vE2
    /* renamed from: a */
    public final void mo1092a(String str, String str2, Bundle bundle) {
        zzfy zzfyVar;
        zzfy zzfyVar2;
        if (TextUtils.isEmpty(str)) {
            zzkz zzkzVar = this.f76904a;
            zzfyVar = zzkzVar.f48463l;
            if (zzfyVar != null) {
                zzfyVar2 = zzkzVar.f48463l;
                zzfyVar2.zzay().zzd().zzb("AppId not known when logging event", "_err");
                return;
            }
            return;
        }
        this.f76904a.zzaz().zzp(new RunnableC21036mD2(this, str, "_err", bundle));
    }
}
