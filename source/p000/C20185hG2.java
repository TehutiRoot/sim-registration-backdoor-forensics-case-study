package p000;

import com.google.android.gms.internal.firebase_ml.zzml;
import com.google.firebase.analytics.FirebaseAnalytics;

/* renamed from: hG2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C20185hG2 extends HF2 {

    /* renamed from: b */
    public static final C20185hG2 f62457b = new C20185hG2();

    public C20185hG2() {
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
