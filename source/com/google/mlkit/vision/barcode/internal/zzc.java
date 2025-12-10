package com.google.mlkit.vision.barcode.internal;

import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.mlkit.common.sdkinternal.MlKitContext;

/* loaded from: classes4.dex */
public final /* synthetic */ class zzc implements ComponentFactory {
    public static final /* synthetic */ zzc zza = new zzc();

    @Override // com.google.firebase.components.ComponentFactory
    public final Object create(ComponentContainer componentContainer) {
        return new zzh((MlKitContext) componentContainer.get(MlKitContext.class));
    }
}
