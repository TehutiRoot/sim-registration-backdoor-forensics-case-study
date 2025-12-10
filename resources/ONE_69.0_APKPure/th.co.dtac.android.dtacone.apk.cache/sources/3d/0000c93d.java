package p000;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.measurement.internal.zzid;
import kotlinx.coroutines.DebugKt;

/* renamed from: hw2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C20351hw2 implements InterfaceC22138sF2 {

    /* renamed from: a */
    public final /* synthetic */ zzid f62718a;

    public C20351hw2(zzid zzidVar) {
        this.f62718a = zzidVar;
    }

    @Override // p000.InterfaceC22138sF2
    /* renamed from: a */
    public final void mo22854a(String str, String str2, Bundle bundle) {
        if (!TextUtils.isEmpty(str)) {
            this.f62718a.zzF(DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "_err", bundle, str);
        } else {
            this.f62718a.zzD(DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "_err", bundle);
        }
    }
}