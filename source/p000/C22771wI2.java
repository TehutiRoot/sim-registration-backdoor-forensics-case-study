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

/* renamed from: wI2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C22771wI2 implements KD2 {

    /* renamed from: a */
    public boolean f107969a;

    /* renamed from: b */
    public final Context f107970b;

    /* renamed from: c */
    public final zzah f107971c;

    /* renamed from: d */
    public final zztx f107972d;

    /* renamed from: e */
    public zzaj f107973e;

    public C22771wI2(Context context, BarcodeScannerOptions barcodeScannerOptions, zztx zztxVar) {
        zzah zzahVar = new zzah();
        this.f107971c = zzahVar;
        this.f107970b = context;
        zzahVar.zza = barcodeScannerOptions.zza();
        this.f107972d = zztxVar;
    }

    @Override // p000.KD2
    /* renamed from: a */
    public final List mo874a(InputImage inputImage) {
        zzu[] zzf;
        if (this.f107973e == null) {
            zzc();
        }
        zzaj zzajVar = this.f107973e;
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

    @Override // p000.KD2
    public final void zzb() {
        zzaj zzajVar = this.f107973e;
        if (zzajVar != null) {
            try {
                zzajVar.zzd();
            } catch (RemoteException unused) {
            }
            this.f107973e = null;
        }
    }

    @Override // p000.KD2
    public final boolean zzc() {
        if (this.f107973e != null) {
            return false;
        }
        try {
            zzaj zzd = zzal.zza(DynamiteModule.load(this.f107970b, DynamiteModule.PREFER_REMOTE, OptionalModuleUtils.DEPRECATED_DYNAMITE_MODULE_ID).instantiate("com.google.android.gms.vision.barcode.ChimeraNativeBarcodeDetectorCreator")).zzd(ObjectWrapper.wrap(this.f107970b), this.f107971c);
            this.f107973e = zzd;
            if (zzd == null && !this.f107969a) {
                OptionalModuleUtils.requestDownload(this.f107970b, OptionalModuleUtils.BARCODE);
                this.f107969a = true;
                zzb.m37201a(this.f107972d, zzpj.OPTIONAL_MODULE_NOT_AVAILABLE);
                throw new MlKitException("Waiting for the barcode module to be downloaded. Please wait.", 14);
            }
            zzb.m37201a(this.f107972d, zzpj.NO_ERROR);
            return false;
        } catch (RemoteException e) {
            throw new MlKitException("Failed to create legacy barcode detector.", 13, e);
        } catch (DynamiteModule.LoadingException e2) {
            throw new MlKitException("Failed to load deprecated vision dynamite module.", 13, e2);
        }
    }
}
