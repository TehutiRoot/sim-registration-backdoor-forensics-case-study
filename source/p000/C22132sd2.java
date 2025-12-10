package p000;

import com.google.android.gms.internal.firebase_ml.zzqn;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.p015ml.vision.FirebaseVision;

/* renamed from: sd2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* synthetic */ class C22132sd2 implements ComponentFactory {

    /* renamed from: a */
    public static final ComponentFactory f79846a = new C22132sd2();

    @Override // com.google.firebase.components.ComponentFactory
    public final Object create(ComponentContainer componentContainer) {
        return new FirebaseVision((zzqn) componentContainer.get(zzqn.class));
    }
}
