package p000;

import android.content.Context;
import android.media.Image;
import android.os.RemoteException;
import android.os.SystemClock;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.mlkit.dynamite.barcode.ModuleDescriptor;
import com.google.android.gms.internal.mlkit_vision_barcode.zzcv;
import com.google.android.gms.internal.mlkit_vision_barcode.zzpj;
import com.google.android.gms.internal.mlkit_vision_barcode.zztx;
import com.google.android.gms.internal.mlkit_vision_barcode.zzvj;
import com.google.android.gms.internal.mlkit_vision_barcode.zzvl;
import com.google.android.gms.internal.mlkit_vision_barcode.zzvt;
import com.google.android.gms.internal.mlkit_vision_barcode.zzvv;
import com.google.android.gms.internal.mlkit_vision_barcode.zzvw;
import com.google.android.gms.internal.mlkit_vision_barcode.zzwc;
import com.google.mlkit.common.MlKitException;
import com.google.mlkit.common.sdkinternal.OptionalModuleUtils;
import com.google.mlkit.vision.barcode.BarcodeScannerOptions;
import com.google.mlkit.vision.barcode.common.Barcode;
import com.google.mlkit.vision.barcode.internal.zzb;
import com.google.mlkit.vision.barcode.internal.zzm;
import com.google.mlkit.vision.common.InputImage;
import com.google.mlkit.vision.common.internal.CommonConvertUtils;
import com.google.mlkit.vision.common.internal.ImageUtils;
import java.util.ArrayList;
import java.util.List;

/* renamed from: HH2 */
/* loaded from: classes4.dex */
public final class HH2 implements KD2 {

    /* renamed from: h */
    public static final zzcv f2180h = zzcv.zzh(OptionalModuleUtils.BARCODE_MODULE_ID, OptionalModuleUtils.TFLITE_DYNAMITE_MODULE_ID);

    /* renamed from: a */
    public boolean f2181a;

    /* renamed from: b */
    public boolean f2182b;

    /* renamed from: c */
    public boolean f2183c;

    /* renamed from: d */
    public final Context f2184d;

    /* renamed from: e */
    public final BarcodeScannerOptions f2185e;

    /* renamed from: f */
    public final zztx f2186f;

    /* renamed from: g */
    public zzvt f2187g;

    public HH2(Context context, BarcodeScannerOptions barcodeScannerOptions, zztx zztxVar) {
        this.f2184d = context;
        this.f2185e = barcodeScannerOptions;
        this.f2186f = zztxVar;
    }

    /* renamed from: b */
    public static boolean m68109b(Context context) {
        if (DynamiteModule.getLocalVersion(context, ModuleDescriptor.MODULE_ID) > 0) {
            return true;
        }
        return false;
    }

    @Override // p000.KD2
    /* renamed from: a */
    public final List mo874a(InputImage inputImage) {
        if (this.f2187g == null) {
            zzc();
        }
        zzvt zzvtVar = (zzvt) Preconditions.checkNotNull(this.f2187g);
        if (!this.f2181a) {
            try {
                zzvtVar.zze();
                this.f2181a = true;
            } catch (RemoteException e) {
                throw new MlKitException("Failed to init barcode scanner.", 13, e);
            }
        }
        int width = inputImage.getWidth();
        if (inputImage.getFormat() == 35) {
            width = ((Image.Plane[]) Preconditions.checkNotNull(inputImage.getPlanes()))[0].getRowStride();
        }
        try {
            List<zzvj> zzd = zzvtVar.zzd(ImageUtils.getInstance().getImageDataWrapper(inputImage), new zzwc(inputImage.getFormat(), width, inputImage.getHeight(), CommonConvertUtils.convertToMVRotation(inputImage.getRotationDegrees()), SystemClock.elapsedRealtime()));
            ArrayList arrayList = new ArrayList();
            for (zzvj zzvjVar : zzd) {
                arrayList.add(new Barcode(new zzm(zzvjVar), inputImage.getCoordinatesMatrix()));
            }
            return arrayList;
        } catch (RemoteException e2) {
            throw new MlKitException("Failed to run barcode scanner.", 13, e2);
        }
    }

    /* renamed from: c */
    public final zzvt m68108c(DynamiteModule.VersionPolicy versionPolicy, String str, String str2) {
        zzvw zza = zzvv.zza(DynamiteModule.load(this.f2184d, versionPolicy, str).instantiate(str2));
        IObjectWrapper wrap = ObjectWrapper.wrap(this.f2184d);
        int zza2 = this.f2185e.zza();
        boolean z = true;
        if (!this.f2185e.zzd() && this.f2185e.zzb() == null) {
            z = false;
        }
        return zza.zzd(wrap, new zzvl(zza2, z));
    }

    @Override // p000.KD2
    public final void zzb() {
        zzvt zzvtVar = this.f2187g;
        if (zzvtVar != null) {
            try {
                zzvtVar.zzf();
            } catch (RemoteException unused) {
            }
            this.f2187g = null;
            this.f2181a = false;
        }
    }

    @Override // p000.KD2
    public final boolean zzc() {
        if (this.f2187g != null) {
            return this.f2182b;
        }
        if (m68109b(this.f2184d)) {
            this.f2182b = true;
            try {
                this.f2187g = m68108c(DynamiteModule.PREFER_LOCAL, ModuleDescriptor.MODULE_ID, "com.google.mlkit.vision.barcode.bundled.internal.ThickBarcodeScannerCreator");
            } catch (RemoteException e) {
                throw new MlKitException("Failed to create thick barcode scanner.", 13, e);
            } catch (DynamiteModule.LoadingException e2) {
                throw new MlKitException("Failed to load the bundled barcode module.", 13, e2);
            }
        } else {
            this.f2182b = false;
            if (!OptionalModuleUtils.areAllRequiredModulesAvailable(this.f2184d, f2180h)) {
                if (!this.f2183c) {
                    OptionalModuleUtils.requestDownload(this.f2184d, zzcv.zzh(OptionalModuleUtils.BARCODE, OptionalModuleUtils.TFLITE_DYNAMITE));
                    this.f2183c = true;
                }
                zzb.m37201a(this.f2186f, zzpj.OPTIONAL_MODULE_NOT_AVAILABLE);
                throw new MlKitException("Waiting for the barcode module to be downloaded. Please wait.", 14);
            }
            try {
                this.f2187g = m68108c(DynamiteModule.PREFER_REMOTE, OptionalModuleUtils.BARCODE_MODULE_ID, "com.google.android.gms.vision.barcode.mlkit.BarcodeScannerCreator");
            } catch (RemoteException | DynamiteModule.LoadingException e3) {
                zzb.m37201a(this.f2186f, zzpj.OPTIONAL_MODULE_INIT_ERROR);
                throw new MlKitException("Failed to create thin barcode scanner.", 13, e3);
            }
        }
        zzb.m37201a(this.f2186f, zzpj.NO_ERROR);
        return this.f2182b;
    }
}
