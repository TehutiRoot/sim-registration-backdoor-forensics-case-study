package com.google.android.gms.vision.label.internal.client;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.internal.vision.zzs;
import com.google.android.gms.internal.vision.zzw;
import com.google.android.gms.vision.label.ImageLabel;
import com.google.mlkit.common.sdkinternal.OptionalModuleUtils;

/* loaded from: classes4.dex */
public final class zzi extends zzs {

    /* renamed from: a */
    public ImageLabelerOptions f48712a;

    public zzi(Context context, ImageLabelerOptions imageLabelerOptions) {
        super(context, "LabelerNativeHandle", OptionalModuleUtils.ICA);
        this.f48712a = imageLabelerOptions;
        zzq();
    }

    public final ImageLabel[] zza(Bitmap bitmap, LabelOptions labelOptions) {
        if (!isOperational()) {
            return new ImageLabel[0];
        }
        try {
            zzf[] zza = ((INativeImageLabeler) zzq()).zza(ObjectWrapper.wrap(bitmap), labelOptions);
            ImageLabel[] imageLabelArr = new ImageLabel[zza.length];
            for (int i = 0; i != zza.length; i++) {
                zzf zzfVar = zza[i];
                imageLabelArr[i] = new ImageLabel(zzfVar.zzdv, zzfVar.label, zzfVar.zzdw);
            }
            return imageLabelArr;
        } catch (RemoteException unused) {
            return new ImageLabel[0];
        }
    }

    public final void zzo() throws RemoteException {
        ((INativeImageLabeler) zzq()).zzr();
    }

    public final /* synthetic */ Object zza(DynamiteModule dynamiteModule, Context context) throws RemoteException, DynamiteModule.LoadingException {
        zza asInterface;
        if (zzw.zza(context, "com.google.android.gms.vision.dynamite.ica")) {
            asInterface = zzd.asInterface(dynamiteModule.instantiate("com.google.android.gms.vision.label.NativeImageLabelerCreator"));
        } else {
            asInterface = zzd.asInterface(dynamiteModule.instantiate("com.google.android.gms.vision.label.ChimeraNativeImageLabelerCreator"));
        }
        if (asInterface == null) {
            return null;
        }
        return asInterface.newImageLabeler(ObjectWrapper.wrap(context), this.f48712a);
    }
}