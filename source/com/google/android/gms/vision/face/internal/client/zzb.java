package com.google.android.gms.vision.face.internal.client;

import android.content.Context;
import android.graphics.PointF;
import android.media.Image;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.internal.vision.zzs;
import com.google.android.gms.internal.vision.zzt;
import com.google.android.gms.internal.vision.zzu;
import com.google.android.gms.vision.face.Contour;
import com.google.android.gms.vision.face.Face;
import com.google.android.gms.vision.face.Landmark;
import com.google.mlkit.common.sdkinternal.OptionalModuleUtils;
import java.nio.ByteBuffer;

/* loaded from: classes4.dex */
public final class zzb extends zzt<zzh> {

    /* renamed from: i */
    public final zzf f48691i;

    public zzb(Context context, zzf zzfVar) {
        super(context, "FaceNativeHandle", OptionalModuleUtils.FACE);
        this.f48691i = zzfVar;
        zzd();
    }

    /* renamed from: a */
    public static Face m45991a(FaceParcel faceParcel) {
        Landmark[] landmarkArr;
        Contour[] contourArr;
        int i = faceParcel.zza;
        PointF pointF = new PointF(faceParcel.zzb, faceParcel.zzc);
        float f = faceParcel.zzd;
        float f2 = faceParcel.zze;
        float f3 = faceParcel.zzf;
        float f4 = faceParcel.zzg;
        float f5 = faceParcel.zzh;
        LandmarkParcel[] landmarkParcelArr = faceParcel.zzi;
        if (landmarkParcelArr == null) {
            landmarkArr = new Landmark[0];
        } else {
            Landmark[] landmarkArr2 = new Landmark[landmarkParcelArr.length];
            int i2 = 0;
            while (i2 < landmarkParcelArr.length) {
                LandmarkParcel landmarkParcel = landmarkParcelArr[i2];
                landmarkArr2[i2] = new Landmark(new PointF(landmarkParcel.zza, landmarkParcel.zzb), landmarkParcel.zzc);
                i2++;
                landmarkParcelArr = landmarkParcelArr;
            }
            landmarkArr = landmarkArr2;
        }
        zza[] zzaVarArr = faceParcel.zzm;
        if (zzaVarArr == null) {
            contourArr = new Contour[0];
        } else {
            Contour[] contourArr2 = new Contour[zzaVarArr.length];
            for (int i3 = 0; i3 < zzaVarArr.length; i3++) {
                zza zzaVar = zzaVarArr[i3];
                contourArr2[i3] = new Contour(zzaVar.zza, zzaVar.zzb);
            }
            contourArr = contourArr2;
        }
        return new Face(i, pointF, f, f2, f3, f4, f5, landmarkArr, contourArr, faceParcel.zzj, faceParcel.zzk, faceParcel.zzl, faceParcel.zzn);
    }

    public final Face[] zza(ByteBuffer byteBuffer, zzs zzsVar) {
        if (!zzb()) {
            return new Face[0];
        }
        try {
            FaceParcel[] zza = ((zzh) Preconditions.checkNotNull(zzd())).zza(ObjectWrapper.wrap(byteBuffer), zzsVar);
            Face[] faceArr = new Face[zza.length];
            for (int i = 0; i < zza.length; i++) {
                faceArr[i] = m45991a(zza[i]);
            }
            return faceArr;
        } catch (RemoteException unused) {
            return new Face[0];
        }
    }

    @RequiresApi(19)
    public final Face[] zza(Image.Plane[] planeArr, zzs zzsVar) {
        if (!zzb()) {
            return new Face[0];
        }
        if (planeArr != null && planeArr.length != 3) {
            throw new IllegalArgumentException("Only android.graphics.ImageFormat#YUV_420_888 is supported which should have 3 planes.");
        }
        try {
            FaceParcel[] zza = ((zzh) Preconditions.checkNotNull(zzd())).zza(ObjectWrapper.wrap(planeArr[0].getBuffer()), ObjectWrapper.wrap(planeArr[1].getBuffer()), ObjectWrapper.wrap(planeArr[2].getBuffer()), planeArr[0].getPixelStride(), planeArr[1].getPixelStride(), planeArr[2].getPixelStride(), planeArr[0].getRowStride(), planeArr[1].getRowStride(), planeArr[2].getRowStride(), zzsVar);
            Face[] faceArr = new Face[zza.length];
            for (int i = 0; i < zza.length; i++) {
                faceArr[i] = m45991a(zza[i]);
            }
            return faceArr;
        } catch (RemoteException unused) {
            return new Face[0];
        }
    }

    public final boolean zza(int i) {
        if (zzb()) {
            try {
                return ((zzh) Preconditions.checkNotNull(zzd())).zza(i);
            } catch (RemoteException unused) {
                return false;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.vision.zzt
    public final void zza() throws RemoteException {
        ((zzh) Preconditions.checkNotNull(zzd())).zza();
    }

    @Override // com.google.android.gms.internal.vision.zzt
    @Nullable
    public final /* synthetic */ zzh zza(DynamiteModule dynamiteModule, Context context) throws RemoteException, DynamiteModule.LoadingException {
        zzi asInterface;
        if (zzu.zza(context, "com.google.android.gms.vision.dynamite.face")) {
            asInterface = zzl.asInterface(dynamiteModule.instantiate("com.google.android.gms.vision.face.NativeFaceDetectorV2Creator"));
        } else {
            asInterface = zzl.asInterface(dynamiteModule.instantiate("com.google.android.gms.vision.face.ChimeraNativeFaceDetectorCreator"));
        }
        if (asInterface == null) {
            return null;
        }
        return asInterface.newFaceDetector(ObjectWrapper.wrap(context), (zzf) Preconditions.checkNotNull(this.f48691i));
    }
}
