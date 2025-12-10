package com.google.firebase.p015ml.vision;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.firebase_ml.zzmx;
import com.google.android.gms.internal.firebase_ml.zzqn;
import com.google.android.gms.internal.firebase_ml.zzqo;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.Dependency;
import com.google.firebase.p015ml.common.modeldownload.FirebaseModelManager;
import com.google.firebase.p015ml.vision.automl.internal.zzb;
import java.util.List;

@KeepForSdk
/* renamed from: com.google.firebase.ml.vision.VisionRegistrar */
/* loaded from: classes4.dex */
public class VisionRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public List<Component<?>> getComponents() {
        return zzmx.zza(Component.builder(FirebaseVision.class).add(Dependency.required(zzqn.class)).factory(C21681pe2.f76867a).build(), Component.builder(zzb.class).add(Dependency.required(zzqo.zza.class)).add(Dependency.required(zzqn.class)).factory(C18456Sa2.f5865a).build(), Component.intoSetBuilder(FirebaseModelManager.RemoteModelManagerRegistration.class).add(Dependency.requiredProvider(zzb.class)).factory(C22898wg2.f108529a).build());
    }
}