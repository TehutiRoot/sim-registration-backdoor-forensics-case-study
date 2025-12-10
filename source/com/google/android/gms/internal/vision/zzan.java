package com.google.android.gms.internal.vision;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.mlkit.common.sdkinternal.OptionalModuleUtils;

/* loaded from: classes3.dex */
public final class zzan extends zzt<zzad> {

    /* renamed from: i */
    public final zzam f47536i;

    public zzan(Context context, zzam zzamVar) {
        super(context, "TextNativeHandle", OptionalModuleUtils.OCR);
        this.f47536i = zzamVar;
        zzd();
    }

    public final zzah[] zza(Bitmap bitmap, zzs zzsVar, zzaj zzajVar) {
        if (!zzb()) {
            return new zzah[0];
        }
        try {
            return ((zzad) Preconditions.checkNotNull(zzd())).zza(ObjectWrapper.wrap(bitmap), zzsVar, zzajVar);
        } catch (RemoteException unused) {
            return new zzah[0];
        }
    }

    @Override // com.google.android.gms.internal.vision.zzt
    public final void zza() throws RemoteException {
        ((zzad) Preconditions.checkNotNull(zzd())).zzb();
    }

    @Override // com.google.android.gms.internal.vision.zzt
    @Nullable
    public final /* synthetic */ zzad zza(DynamiteModule dynamiteModule, Context context) throws RemoteException, DynamiteModule.LoadingException {
        zzaf zzaeVar;
        IBinder instantiate = dynamiteModule.instantiate("com.google.android.gms.vision.text.ChimeraNativeTextRecognizerCreator");
        if (instantiate == null) {
            zzaeVar = null;
        } else {
            IInterface queryLocalInterface = instantiate.queryLocalInterface("com.google.android.gms.vision.text.internal.client.INativeTextRecognizerCreator");
            if (queryLocalInterface instanceof zzaf) {
                zzaeVar = (zzaf) queryLocalInterface;
            } else {
                zzaeVar = new zzae(instantiate);
            }
        }
        if (zzaeVar == null) {
            return null;
        }
        return zzaeVar.zza(ObjectWrapper.wrap(context), (zzam) Preconditions.checkNotNull(this.f47536i));
    }
}
