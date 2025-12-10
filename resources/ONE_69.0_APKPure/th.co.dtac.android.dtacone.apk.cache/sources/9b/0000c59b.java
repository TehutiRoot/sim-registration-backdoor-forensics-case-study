package p000;

import com.google.android.gms.internal.firebase_ml.zzml;
import com.google.firebase.analytics.FirebaseAnalytics;

/* renamed from: eH2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C19722eH2 extends EG2 {

    /* renamed from: b */
    public static final C19722eH2 f61527b = new C19722eH2();

    public C19722eH2() {
        super("CharMatcher.none()");
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzlw
    public final int zza(CharSequence charSequence, int i) {
        zzml.zza(i, charSequence.length(), FirebaseAnalytics.Param.INDEX);
        return -1;
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzlw
    public final boolean zzb(char c) {
        return false;
    }
}