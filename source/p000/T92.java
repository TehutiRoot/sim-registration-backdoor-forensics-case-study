package p000;

import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.p015ml.common.modeldownload.FirebaseModelManager;

/* renamed from: T92 */
/* loaded from: classes4.dex */
public final /* synthetic */ class T92 implements ComponentFactory {

    /* renamed from: a */
    public static final ComponentFactory f5944a = new T92();

    @Override // com.google.firebase.components.ComponentFactory
    public final Object create(ComponentContainer componentContainer) {
        return new FirebaseModelManager(componentContainer.setOf(FirebaseModelManager.RemoteModelManagerRegistration.class));
    }
}
