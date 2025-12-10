package p000;

import com.google.android.gms.internal.common.zzs;
import com.google.android.gms.internal.common.zzx;
import com.google.firebase.analytics.FirebaseAnalytics;

/* renamed from: MJ2 */
/* loaded from: classes3.dex */
public final class MJ2 extends AK2 {

    /* renamed from: h */
    public final /* synthetic */ VJ2 f3744h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MJ2(VJ2 vj2, zzx zzxVar, CharSequence charSequence) {
        super(zzxVar, charSequence);
        this.f3744h = vj2;
    }

    @Override // p000.AK2
    /* renamed from: c */
    public final int mo67403c(int i) {
        return i + 1;
    }

    @Override // p000.AK2
    /* renamed from: d */
    public final int mo67402d(int i) {
        CharSequence charSequence = this.f78c;
        int length = charSequence.length();
        zzs.zzb(i, length, FirebaseAnalytics.Param.INDEX);
        while (i < length) {
            VJ2 vj2 = this.f3744h;
            if (!vj2.f6619a.zza(charSequence.charAt(i))) {
                i++;
            } else {
                return i;
            }
        }
        return -1;
    }
}
