package p000;

import android.content.Context;
import android.media.Image;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.internal.mlkit_vision_barcode.zzah;
import com.google.android.gms.internal.mlkit_vision_barcode.zzaj;
import com.google.android.gms.internal.mlkit_vision_barcode.zzal;
import com.google.android.gms.internal.mlkit_vision_barcode.zzan;
import com.google.android.gms.internal.mlkit_vision_barcode.zzpj;
import com.google.android.gms.internal.mlkit_vision_barcode.zztx;
import com.google.android.gms.internal.mlkit_vision_barcode.zzu;
import com.google.mlkit.common.MlKitException;
import com.google.mlkit.common.sdkinternal.OptionalModuleUtils;
import com.google.mlkit.vision.barcode.BarcodeScannerOptions;
import com.google.mlkit.vision.barcode.common.Barcode;
import com.google.mlkit.vision.barcode.internal.zzb;
import com.google.mlkit.vision.barcode.internal.zzo;
import com.google.mlkit.vision.common.InputImage;
import com.google.mlkit.vision.common.internal.CommonConvertUtils;
import com.google.mlkit.vision.common.internal.ImageConvertUtils;
import java.util.ArrayList;
import java.util.List;

/* renamed from: tJ2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C22323tJ2 implements HE2 {

    /* renamed from: a */
    public boolean f80146a;

    /* renamed from: b */
    public final Context f80147b;

    /* renamed from: c */
    public final zzah f80148c;

    /* renamed from: d */
    public final zztx f80149d;

    /* renamed from: e */
    public zzaj f80150e;

    public C22323tJ2(Context context, BarcodeScannerOptions barcodeScannerOptions, zztx zztxVar) {
        zzah zzahVar = new zzah();
        this.f80148c = zzahVar;
        this.f80147b = context;
        zzahVar.zza = barcodeScannerOptions.zza();
        this.f80149d = zztxVar;
    }

    @Override // p000.HE2
    /* renamed from: a */
    public final List mo22702a(InputImage inputImage) {
        zzu[] zzf;
        if (this.f80150e == null) {
            zzc();
        }
        zzaj zzajVar = this.f80150e;
        if (zzajVar != null) {
            zzaj zzajVar2 = (zzaj) Preconditions.checkNotNull(zzajVar);
            zzan zzanVar = new zzan(inputImage.getWidth(), inputImage.getHeight(), 0, 0L, CommonConvertUtils.convertToMVRotation(inputImage.getRotationDegrees()));
            try {
                int format = inputImage.getFormat();
                if (format != -1) {
                    if (format != 17) {
                        if (format != 35) {
                            if (format == 842094169) {
                                zzf = zzajVar2.zze(ObjectWrapper.wrap(ImageConvertUtils.getInstance().convertToNv21Buffer(inputImage, false)), zzanVar);
                            } else {
                                throw new MlKitException("Unsupported image format: " + inputImage.getFormat(), 3);
                            }
                        } else {
                            Image.Plane[] planeArr = (Image.Plane[]) Preconditions.checkNotNull(inputImage.getPlanes());
                            zzanVar.zza = planeArr[0].getRowStride();
                            zzf = zzajVar2.zze(ObjectWrapper.wrap(planeArr[0].getBuffer()), zzanVar);
                        }
                    } else {
                        zzf = zzajVar2.zze(ObjectWrapper.wrap(inputImage.getByteBuffer()), zzanVar);
                    }
                } else {
                    zzf = zzajVar2.zzf(ObjectWrapper.wrap(inputImage.getBitmapInternal()), zzanVar);
                }
                ArrayList arrayList = new ArrayList();
                for (zzu zzuVar : zzf) {
                    arrayList.add(new Barcode(new zzo(zzuVar), inputImage.getCoordinatesMatrix()));
                }
                return arrayList;
            } catch (RemoteException e) {
                throw new MlKitException("Failed to detect with legacy barcode detector", 13, e);
            }
        }
        throw new MlKitException("Error initializing the legacy barcode scanner.", 14);
    }

    @Override // p000.HE2
    public final void zzb() {
        zzaj zzajVar = this.f80150e;
        if (zzajVar != null) {
            try {
                zzajVar.zzd();
            } catch (RemoteException unused) {
            }
            this.f80150e = null;
        }
    }

    @Override // p000.HE2
    public final boolean zzc() {
        if (this.f80150e != null) {
            return false;
        }
        try {
            zzaj zzd = zzal.zza(DynamiteModule.load(this.f80147b, DynamiteModule.PREFER_REMOTE, OptionalModuleUtils.DEPRECATED_DYNAMITE_MODULE_ID).instantiate("com.google.android.gms.vision.barcode.ChimeraNativeBarcodeDetectorCreator")).zzd(ObjectWrapper.wrap(this.f80147b), this.f80148c);
            this.f80150e = zzd;
            if (zzd == null && !this.f80146a) {
                OptionalModuleUtils.requestDownload(this.f80147b, OptionalModuleUtils.BARCODE);
                this.f80146a = true;
                zzb.m37193a(this.f80149d, zzpj.OPTIONAL_MODULE_NOT_AVAILABLE);
                throw new MlKitException("Waiting for the barcode module to be downloaded. Please wait.", 14);
            }
            zzb.m37193a(this.f80149d, zzpj.NO_ERROR);
            return false;
        } catch (RemoteException e) {
            throw new MlKitException("Failed to create legacy barcode detector.", 13, e);
        } catch (DynamiteModule.LoadingException e2) {
            throw new MlKitException("Failed to load deprecated vision dynamite module.", 13, e2);
        }
    }
}