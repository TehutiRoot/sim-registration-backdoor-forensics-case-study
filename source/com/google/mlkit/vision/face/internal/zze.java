package com.google.mlkit.vision.face.internal;

import android.content.Context;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.internal.mlkit_vision_face.zzoc;
import com.google.android.gms.internal.mlkit_vision_face.zzon;
import com.google.mlkit.common.sdkinternal.LazyInstanceMap;
import com.google.mlkit.common.sdkinternal.MlKitContext;
import com.google.mlkit.vision.face.FaceDetectorOptions;

/* loaded from: classes4.dex */
public final class zze extends LazyInstanceMap {

    /* renamed from: b */
    public final MlKitContext f57147b;

    public zze(MlKitContext mlKitContext) {
        this.f57147b = mlKitContext;
    }

    @Override // com.google.mlkit.common.sdkinternal.LazyInstanceMap
    public final /* bridge */ /* synthetic */ Object create(Object obj) {
        InterfaceC17272Ad2 c20059ga2;
        FaceDetectorOptions faceDetectorOptions = (FaceDetectorOptions) obj;
        Context applicationContext = this.f57147b.getApplicationContext();
        zzoc zzb = zzon.zzb(zzj.zzb());
        if (!C20059ga2.m31087b(applicationContext) && GoogleApiAvailabilityLight.getInstance().getApkVersion(applicationContext) < 204500000) {
            c20059ga2 = new ZF2(applicationContext, faceDetectorOptions, zzb);
        } else {
            c20059ga2 = new C20059ga2(applicationContext, faceDetectorOptions, zzb);
        }
        return new zzh(zzon.zzb(zzj.zzb()), faceDetectorOptions, c20059ga2);
    }
}
