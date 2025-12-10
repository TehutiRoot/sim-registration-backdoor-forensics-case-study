package com.google.firebase.p015ml.common;

import android.content.Context;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.firebase_ml.zzmx;
import com.google.android.gms.internal.firebase_ml.zzqj;
import com.google.android.gms.internal.firebase_ml.zzqn;
import com.google.android.gms.internal.firebase_ml.zzqo;
import com.google.android.gms.internal.firebase_ml.zzqz;
import com.google.android.gms.internal.firebase_ml.zzrc;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.Dependency;
import com.google.firebase.p015ml.common.modeldownload.FirebaseModelManager;
import java.util.List;

@KeepForSdk
/* renamed from: com.google.firebase.ml.common.CommonComponentRegistrar */
/* loaded from: classes4.dex */
public class CommonComponentRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public List<Component<?>> getComponents() {
        return zzmx.zza(zzqo.zzbmk, zzqj.zzblr, zzqz.zzblr, zzrc.zzblr, zzqn.zzblr, Component.builder(zzqo.zzb.class).add(Dependency.required(Context.class)).factory(C21788qd2.f77017a).build(), Component.builder(FirebaseModelManager.class).add(Dependency.setOf(FirebaseModelManager.RemoteModelManagerRegistration.class)).factory(T92.f5944a).build());
    }
}
