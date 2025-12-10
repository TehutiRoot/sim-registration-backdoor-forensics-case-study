package p000;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.firebase_ml.zzqn;
import com.google.android.gms.internal.firebase_ml.zzqo;
import com.google.firebase.FirebaseApp;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.p015ml.vision.automl.internal.zzb;

/* renamed from: Sa2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* synthetic */ class C18456Sa2 implements ComponentFactory {

    /* renamed from: a */
    public static final ComponentFactory f5865a = new C18456Sa2();

    @Override // com.google.firebase.components.ComponentFactory
    public final Object create(ComponentContainer componentContainer) {
        Preconditions.checkArgument(((zzqn) componentContainer.get(zzqn.class)).zzos().getName().equals(FirebaseApp.DEFAULT_APP_NAME), "FirebaseAutoMLModelManager doesn't support Nondefault FirebaseApp");
        return new zzb((zzqn) componentContainer.get(zzqn.class), ((zzqo.zza) componentContainer.get(zzqo.zza.class)).get(5));
    }
}