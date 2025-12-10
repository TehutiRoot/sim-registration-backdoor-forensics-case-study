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

/* renamed from: fk2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C19917fk2 implements InterfaceC18975aG2 {

    /* renamed from: a */
    public final Context f61906a;

    /* renamed from: b */
    public final zzp f61907b = new zzp(null);

    /* renamed from: c */
    public boolean f61908c;

    /* renamed from: d */
    public zzh f61909d;

    public C19917fk2(Context context) {
        this.f61906a = context;
    }

    @Override // p000.InterfaceC18975aG2
    /* renamed from: a */
    public final Text mo407a(InputImage inputImage) {
        Bitmap convertToUpRightBitmap;
        int i;
        if (this.f61909d == null) {
            zzb();
        }
        if (this.f61909d != null) {
            if (inputImage.getFormat() == -1) {
                convertToUpRightBitmap = inputImage.getBitmapInternal();
                i = CommonConvertUtils.convertToMVRotation(inputImage.getRotationDegrees());
            } else {
                convertToUpRightBitmap = ImageConvertUtils.getInstance().convertToUpRightBitmap(inputImage);
                i = 0;
            }
            try {
                return KB2.m67632a(((zzh) Preconditions.checkNotNull(this.f61909d)).zze(ObjectWrapper.wrap(convertToUpRightBitmap), new zzd(inputImage.getWidth(), inputImage.getHeight(), 0, 0L, i)), inputImage.getCoordinatesMatrix());
            } catch (RemoteException e) {
                throw new MlKitException("Failed to run legacy text recognizer.", 13, e);
            }
        }
        throw new MlKitException("Waiting for the text recognition module to be downloaded. Please wait.", 14);
    }

    @Override // p000.InterfaceC18975aG2
    public final void zzb() {
        if (this.f61909d == null) {
            try {
                zzh zzd = zzj.zza(DynamiteModule.load(this.f61906a, DynamiteModule.PREFER_REMOTE, OptionalModuleUtils.DEPRECATED_DYNAMITE_MODULE_ID).instantiate("com.google.android.gms.vision.text.ChimeraNativeTextRecognizerCreator")).zzd(ObjectWrapper.wrap(this.f61906a), this.f61907b);
                this.f61909d = zzd;
                if (zzd == null && !this.f61908c) {
                    OptionalModuleUtils.requestDownload(this.f61906a, OptionalModuleUtils.OCR);
                    this.f61908c = true;
                }
            } catch (RemoteException e) {
                throw new MlKitException("Failed to create legacy text recognizer.", 13, e);
            } catch (DynamiteModule.LoadingException e2) {
                throw new MlKitException("Failed to load deprecated vision dynamite module.", 13, e2);
            }
        }
    }

    @Override // p000.InterfaceC18975aG2
    public final void zzc() {
        zzh zzhVar = this.f61909d;
        if (zzhVar != null) {
            try {
                zzhVar.zzd();
            } catch (RemoteException unused) {
            }
            this.f61909d = null;
        }
    }
}
