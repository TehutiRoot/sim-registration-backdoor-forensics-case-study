package com.google.mlkit.vision.face.internal;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.mlkit_vision_face.zzbn;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.Dependency;
import com.google.mlkit.common.sdkinternal.ExecutorSelector;
import com.google.mlkit.common.sdkinternal.MlKitContext;
import java.util.List;

@KeepForSdk
/* loaded from: classes4.dex */
public class FaceRegistrar implements ComponentRegistrar {
    public static final /* synthetic */ int zza = 0;

    @Override // com.google.firebase.components.ComponentRegistrar
    @NonNull
    public final List getComponents() {
        return zzbn.zzi(Component.builder(zze.class).add(Dependency.required(MlKitContext.class)).factory(zzk.zza).build(), Component.builder(zzc.class).add(Dependency.required(zze.class)).add(Dependency.required(ExecutorSelector.class)).factory(zzl.zza).build());
    }
}