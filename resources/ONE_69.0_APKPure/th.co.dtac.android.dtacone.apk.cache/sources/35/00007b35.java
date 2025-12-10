package p000;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.internal.mlkit_vision_text_common.zzd;
import com.google.android.gms.internal.mlkit_vision_text_common.zzh;
import com.google.android.gms.internal.mlkit_vision_text_common.zzj;
import com.google.android.gms.internal.mlkit_vision_text_common.zzp;
import com.google.mlkit.common.MlKitException;
import com.google.mlkit.common.sdkinternal.OptionalModuleUtils;
import com.google.mlkit.vision.common.InputImage;
import com.google.mlkit.vision.common.internal.CommonConvertUtils;
import com.google.mlkit.vision.common.internal.ImageConvertUtils;
import com.google.mlkit.vision.text.Text;

/* renamed from: cl2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C19453cl2 implements XG2 {

    /* renamed from: a */
    public final Context f40214a;

    /* renamed from: b */
    public final zzp f40215b = new zzp(null);

    /* renamed from: c */
    public boolean f40216c;

    /* renamed from: d */
    public zzh f40217d;

    public C19453cl2(Context context) {
        this.f40214a = context;
    }

    @Override // p000.XG2
    /* renamed from: a */
    public final Text mo1072a(InputImage inputImage) {
        Bitmap convertToUpRightBitmap;
        int i;
        if (this.f40217d == null) {
            zzb();
        }
        if (this.f40217d != null) {
            if (inputImage.getFormat() == -1) {
                convertToUpRightBitmap = inputImage.getBitmapInternal();
                i = CommonConvertUtils.convertToMVRotation(inputImage.getRotationDegrees());
            } else {
                convertToUpRightBitmap = ImageConvertUtils.getInstance().convertToUpRightBitmap(inputImage);
                i = 0;
            }
            try {
                return HC2.m68158a(((zzh) Preconditions.checkNotNull(this.f40217d)).zze(ObjectWrapper.wrap(convertToUpRightBitmap), new zzd(inputImage.getWidth(), inputImage.getHeight(), 0, 0L, i)), inputImage.getCoordinatesMatrix());
            } catch (RemoteException e) {
                throw new MlKitException("Failed to run legacy text recognizer.", 13, e);
            }
        }
        throw new MlKitException("Waiting for the text recognition module to be downloaded. Please wait.", 14);
    }

    @Override // p000.XG2
    public final void zzb() {
        if (this.f40217d == null) {
            try {
                zzh zzd = zzj.zza(DynamiteModule.load(this.f40214a, DynamiteModule.PREFER_REMOTE, OptionalModuleUtils.DEPRECATED_DYNAMITE_MODULE_ID).instantiate("com.google.android.gms.vision.text.ChimeraNativeTextRecognizerCreator")).zzd(ObjectWrapper.wrap(this.f40214a), this.f40215b);
                this.f40217d = zzd;
                if (zzd == null && !this.f40216c) {
                    OptionalModuleUtils.requestDownload(this.f40214a, OptionalModuleUtils.OCR);
                    this.f40216c = true;
                }
            } catch (RemoteException e) {
                throw new MlKitException("Failed to create legacy text recognizer.", 13, e);
            } catch (DynamiteModule.LoadingException e2) {
                throw new MlKitException("Failed to load deprecated vision dynamite module.", 13, e2);
            }
        }
    }

    @Override // p000.XG2
    public final void zzc() {
        zzh zzhVar = this.f40217d;
        if (zzhVar != null) {
            try {
                zzhVar.zzd();
            } catch (RemoteException unused) {
            }
            this.f40217d = null;
        }
    }
}