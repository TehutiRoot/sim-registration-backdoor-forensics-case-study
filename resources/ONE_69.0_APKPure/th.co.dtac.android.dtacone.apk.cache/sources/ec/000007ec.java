package p000;

import com.google.firebase.FirebaseApp;
import com.google.firebase.installations.FirebaseInstallations;
import com.google.firebase.p015ml.common.internal.modeldownload.zzw;

/* renamed from: IK2 */
/* loaded from: classes4.dex */
public final /* synthetic */ class IK2 implements zzw {

    /* renamed from: a */
    public static final zzw f2667a = new IK2();

    @Override // com.google.firebase.p015ml.common.internal.modeldownload.zzw
    public final FirebaseInstallations zza(FirebaseApp firebaseApp) {
        return FirebaseInstallations.getInstance(firebaseApp);
    }
}