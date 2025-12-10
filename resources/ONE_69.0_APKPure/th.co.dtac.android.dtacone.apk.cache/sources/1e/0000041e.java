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

/* renamed from: EI2 */
/* loaded from: classes4.dex */
public final class EI2 implements HE2 {

    /* renamed from: h */
    public static final zzcv f1322h = zzcv.zzh(OptionalModuleUtils.BARCODE_MODULE_ID, OptionalModuleUtils.TFLITE_DYNAMITE_MODULE_ID);

    /* renamed from: a */
    public boolean f1323a;

    /* renamed from: b */
    public boolean f1324b;

    /* renamed from: c */
    public boolean f1325c;

    /* renamed from: d */
    public final Context f1326d;

    /* renamed from: e */
    public final BarcodeScannerOptions f1327e;

    /* renamed from: f */
    public final zztx f1328f;

    /* renamed from: g */
    public zzvt f1329g;

    public EI2(Context context, BarcodeScannerOptions barcodeScannerOptions, zztx zztxVar) {
        this.f1326d = context;
        this.f1327e = barcodeScannerOptions;
        this.f1328f = zztxVar;
    }

    /* renamed from: b */
    public static boolean m68669b(Context context) {
        if (DynamiteModule.getLocalVersion(context, ModuleDescriptor.MODULE_ID) > 0) {
            return true;
        }
        return false;
    }

    @Override // p000.HE2
    /* renamed from: a */
    public final List mo22702a(InputImage inputImage) {
        if (this.f1329g == null) {
            zzc();
        }
        zzvt zzvtVar = (zzvt) Preconditions.checkNotNull(this.f1329g);
        if (!this.f1323a) {
            try {
                zzvtVar.zze();
                this.f1323a = true;
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
    public final zzvt m68668c(DynamiteModule.VersionPolicy versionPolicy, String str, String str2) {
        zzvw zza = zzvv.zza(DynamiteModule.load(this.f1326d, versionPolicy, str).instantiate(str2));
        IObjectWrapper wrap = ObjectWrapper.wrap(this.f1326d);
        int zza2 = this.f1327e.zza();
        boolean z = true;
        if (!this.f1327e.zzd() && this.f1327e.zzb() == null) {
            z = false;
        }
        return zza.zzd(wrap, new zzvl(zza2, z));
    }

    @Override // p000.HE2
    public final void zzb() {
        zzvt zzvtVar = this.f1329g;
        if (zzvtVar != null) {
            try {
                zzvtVar.zzf();
            } catch (RemoteException unused) {
            }
            this.f1329g = null;
            this.f1323a = false;
        }
    }

    @Override // p000.HE2
    public final boolean zzc() {
        if (this.f1329g != null) {
            return this.f1324b;
        }
        if (m68669b(this.f1326d)) {
            this.f1324b = true;
            try {
                this.f1329g = m68668c(DynamiteModule.PREFER_LOCAL, ModuleDescriptor.MODULE_ID, "com.google.mlkit.vision.barcode.bundled.internal.ThickBarcodeScannerCreator");
            } catch (RemoteException e) {
                throw new MlKitException("Failed to create thick barcode scanner.", 13, e);
            } catch (DynamiteModule.LoadingException e2) {
                throw new MlKitException("Failed to load the bundled barcode module.", 13, e2);
            }
        } else {
            this.f1324b = false;
            if (!OptionalModuleUtils.areAllRequiredModulesAvailable(this.f1326d, f1322h)) {
                if (!this.f1325c) {
                    OptionalModuleUtils.requestDownload(this.f1326d, zzcv.zzh(OptionalModuleUtils.BARCODE, OptionalModuleUtils.TFLITE_DYNAMITE));
                    this.f1325c = true;
                }
                zzb.m37193a(this.f1328f, zzpj.OPTIONAL_MODULE_NOT_AVAILABLE);
                throw new MlKitException("Waiting for the barcode module to be downloaded. Please wait.", 14);
            }
            try {
                this.f1329g = m68668c(DynamiteModule.PREFER_REMOTE, OptionalModuleUtils.BARCODE_MODULE_ID, "com.google.android.gms.vision.barcode.mlkit.BarcodeScannerCreator");
            } catch (RemoteException | DynamiteModule.LoadingException e3) {
                zzb.m37193a(this.f1328f, zzpj.OPTIONAL_MODULE_INIT_ERROR);
                throw new MlKitException("Failed to create thin barcode scanner.", 13, e3);
            }
        }
        zzb.m37193a(this.f1328f, zzpj.NO_ERROR);
        return this.f1324b;
    }
}