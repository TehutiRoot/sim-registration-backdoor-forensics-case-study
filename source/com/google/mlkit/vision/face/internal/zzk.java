package com.google.mlkit.vision.face.internal;

import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.mlkit.common.sdkinternal.MlKitContext;

/* loaded from: classes4.dex */
public final /* synthetic */ class zzk implements ComponentFactory {
    public static final /* synthetic */ zzk zza = new zzk();

    @Override // com.google.firebase.components.ComponentFactory
    public final Object create(ComponentContainer componentContainer) {
        return new zze((MlKitContext) componentContainer.get(MlKitContext.class));
    }
}
