package p000;

import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.p015ml.common.modeldownload.FirebaseModelManager;

/* renamed from: Qa2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* synthetic */ class C18326Qa2 implements ComponentFactory {

    /* renamed from: a */
    public static final ComponentFactory f5250a = new C18326Qa2();

    @Override // com.google.firebase.components.ComponentFactory
    public final Object create(ComponentContainer componentContainer) {
        return new FirebaseModelManager(componentContainer.setOf(FirebaseModelManager.RemoteModelManagerRegistration.class));
    }
}