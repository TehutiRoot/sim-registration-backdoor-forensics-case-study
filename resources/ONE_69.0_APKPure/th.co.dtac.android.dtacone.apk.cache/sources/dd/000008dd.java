package p000;

import com.google.android.gms.internal.common.zzs;
import com.google.android.gms.internal.common.zzx;
import com.google.firebase.analytics.FirebaseAnalytics;

/* renamed from: JK2 */
/* loaded from: classes3.dex */
public final class JK2 extends AbstractC23021xL2 {

    /* renamed from: h */
    public final /* synthetic */ SK2 f2980h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JK2(SK2 sk2, zzx zzxVar, CharSequence charSequence) {
        super(zzxVar, charSequence);
        this.f2980h = sk2;
    }

    @Override // p000.AbstractC23021xL2
    /* renamed from: c */
    public final int mo552c(int i) {
        return i + 1;
    }

    @Override // p000.AbstractC23021xL2
    /* renamed from: d */
    public final int mo551d(int i) {
        CharSequence charSequence = this.f108724c;
        int length = charSequence.length();
        zzs.zzb(i, length, FirebaseAnalytics.Param.INDEX);
        while (i < length) {
            SK2 sk2 = this.f2980h;
            if (!sk2.f5810a.zza(charSequence.charAt(i))) {
                i++;
            } else {
                return i;
            }
        }
        return -1;
    }
}