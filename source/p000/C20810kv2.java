package p000;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.measurement.internal.zzid;
import kotlinx.coroutines.DebugKt;

/* renamed from: kv2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C20810kv2 implements InterfaceC22587vE2 {

    /* renamed from: a */
    public final /* synthetic */ zzid f71482a;

    public C20810kv2(zzid zzidVar) {
        this.f71482a = zzidVar;
    }

    @Override // p000.InterfaceC22587vE2
    /* renamed from: a */
    public final void mo1092a(String str, String str2, Bundle bundle) {
        if (!TextUtils.isEmpty(str)) {
            this.f71482a.zzF(DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "_err", bundle, str);
        } else {
            this.f71482a.zzD(DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "_err", bundle);
        }
    }
}
