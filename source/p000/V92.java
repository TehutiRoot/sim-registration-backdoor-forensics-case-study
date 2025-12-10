package p000;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.firebase_ml.zzqn;
import com.google.android.gms.internal.firebase_ml.zzqo;
import com.google.firebase.FirebaseApp;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.p015ml.vision.automl.internal.zzb;

/* renamed from: V92 */
/* loaded from: classes4.dex */
public final /* synthetic */ class V92 implements ComponentFactory {

    /* renamed from: a */
    public static final ComponentFactory f6571a = new V92();

    @Override // com.google.firebase.components.ComponentFactory
    public final Object create(ComponentContainer componentContainer) {
        Preconditions.checkArgument(((zzqn) componentContainer.get(zzqn.class)).zzos().getName().equals(FirebaseApp.DEFAULT_APP_NAME), "FirebaseAutoMLModelManager doesn't support Nondefault FirebaseApp");
        return new zzb((zzqn) componentContainer.get(zzqn.class), ((zzqo.zza) componentContainer.get(zzqo.zza.class)).get(5));
    }
}
