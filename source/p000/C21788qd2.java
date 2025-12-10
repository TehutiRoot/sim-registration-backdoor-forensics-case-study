package p000;

import android.content.Context;
import com.google.android.gms.internal.firebase_ml.zzrd;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;

/* renamed from: qd2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* synthetic */ class C21788qd2 implements ComponentFactory {

    /* renamed from: a */
    public static final ComponentFactory f77017a = new C21788qd2();

    @Override // com.google.firebase.components.ComponentFactory
    public final Object create(ComponentContainer componentContainer) {
        return new zzrd((Context) componentContainer.get(Context.class));
    }
}
