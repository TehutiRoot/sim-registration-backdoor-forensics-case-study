package p000;

import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.p015ml.common.modeldownload.FirebaseModelManager;
import com.google.firebase.p015ml.vision.automl.FirebaseAutoMLRemoteModel;
import com.google.firebase.p015ml.vision.automl.internal.zzb;

/* renamed from: zf2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* synthetic */ class C23342zf2 implements ComponentFactory {

    /* renamed from: a */
    public static final ComponentFactory f109147a = new C23342zf2();

    @Override // com.google.firebase.components.ComponentFactory
    public final Object create(ComponentContainer componentContainer) {
        return new FirebaseModelManager.RemoteModelManagerRegistration(FirebaseAutoMLRemoteModel.class, componentContainer.getProvider(zzb.class));
    }
}
