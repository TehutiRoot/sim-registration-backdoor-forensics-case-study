package com.google.mlkit.vision.text.internal;

import android.content.Context;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.internal.mlkit_vision_text_common.zzuc;
import com.google.android.gms.internal.mlkit_vision_text_common.zzun;
import com.google.mlkit.common.sdkinternal.LazyInstanceMap;
import com.google.mlkit.common.sdkinternal.MlKitContext;
import com.google.mlkit.vision.text.TextRecognizerOptionsInterface;

/* loaded from: classes4.dex */
public final class zzp extends LazyInstanceMap {

    /* renamed from: b */
    public final MlKitContext f57182b;

    public zzp(MlKitContext mlKitContext) {
        this.f57182b = mlKitContext;
    }

    @Override // com.google.mlkit.common.sdkinternal.LazyInstanceMap
    public final /* bridge */ /* synthetic */ Object create(Object obj) {
        InterfaceC18975aG2 c23004xh2;
        TextRecognizerOptionsInterface textRecognizerOptionsInterface = (TextRecognizerOptionsInterface) obj;
        zzuc zzb = zzun.zzb(textRecognizerOptionsInterface.getLoggingLibraryName());
        Context applicationContext = this.f57182b.getApplicationContext();
        if (GoogleApiAvailabilityLight.getInstance().getApkVersion(applicationContext) < 204700000 && !textRecognizerOptionsInterface.getIsThickClient()) {
            c23004xh2 = new C19917fk2(applicationContext);
        } else {
            c23004xh2 = new C23004xh2(applicationContext, textRecognizerOptionsInterface, zzb);
        }
        return new TextRecognizerTaskWithResource(zzb, c23004xh2, textRecognizerOptionsInterface);
    }
}
