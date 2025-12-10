package p000;

import android.content.Context;
import android.os.RemoteException;
import android.os.SystemClock;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.internal.mlkit_vision_text_common.zzou;
import com.google.android.gms.internal.mlkit_vision_text_common.zzuc;
import com.google.android.gms.internal.mlkit_vision_text_common.zzuq;
import com.google.android.gms.internal.mlkit_vision_text_common.zzut;
import com.google.android.gms.internal.mlkit_vision_text_common.zzuv;
import com.google.android.gms.internal.mlkit_vision_text_common.zzux;
import com.google.android.gms.internal.mlkit_vision_text_common.zzuy;
import com.google.android.gms.internal.mlkit_vision_text_common.zzvh;
import com.google.mlkit.common.MlKitException;
import com.google.mlkit.common.sdkinternal.OptionalModuleUtils;
import com.google.mlkit.vision.common.InputImage;
import com.google.mlkit.vision.common.internal.CommonConvertUtils;
import com.google.mlkit.vision.common.internal.ImageUtils;
import com.google.mlkit.vision.text.Text;
import com.google.mlkit.vision.text.TextRecognizerOptionsInterface;
import com.google.mlkit.vision.text.internal.LoggingUtils;
import com.google.mlkit.vision.text.internal.TextOptionalModuleUtils;
import com.google.mlkit.vision.text.internal.zzb;
import com.google.mlkit.vision.text.internal.zzc;

/* renamed from: xh2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23004xh2 implements InterfaceC18975aG2 {

    /* renamed from: a */
    public final Context f108464a;

    /* renamed from: b */
    public final TextRecognizerOptionsInterface f108465b;

    /* renamed from: c */
    public boolean f108466c;

    /* renamed from: d */
    public boolean f108467d;

    /* renamed from: e */
    public final zzuc f108468e;

    /* renamed from: f */
    public zzuv f108469f;

    public C23004xh2(Context context, TextRecognizerOptionsInterface textRecognizerOptionsInterface, zzuc zzucVar) {
        this.f108464a = context;
        this.f108465b = textRecognizerOptionsInterface;
        this.f108468e = zzucVar;
    }

    /* renamed from: b */
    public static zzvh m406b(TextRecognizerOptionsInterface textRecognizerOptionsInterface, String str) {
        boolean z;
        int i = 1;
        if ((textRecognizerOptionsInterface instanceof zzc) && ((zzc) textRecognizerOptionsInterface).zza()) {
            z = true;
        } else {
            z = false;
        }
        String configLabel = textRecognizerOptionsInterface.getConfigLabel();
        String loggingLibraryNameForOptionalModule = textRecognizerOptionsInterface.getLoggingLibraryNameForOptionalModule();
        switch (textRecognizerOptionsInterface.getLoggingLanguageOption()) {
            case 1:
                i = 2;
                break;
            case 2:
                i = 3;
                break;
            case 3:
                i = 4;
                break;
            case 4:
                i = 5;
                break;
            case 5:
                i = 6;
                break;
            case 6:
                i = 7;
                break;
            case 7:
                i = 8;
                break;
            case 8:
                i = 9;
                break;
        }
        return new zzvh(configLabel, loggingLibraryNameForOptionalModule, str, true, i - 1, textRecognizerOptionsInterface.getLanguageHint(), z);
    }

    @Override // p000.InterfaceC18975aG2
    /* renamed from: a */
    public final Text mo407a(InputImage inputImage) {
        if (this.f108469f == null) {
            zzb();
        }
        zzuv zzuvVar = (zzuv) Preconditions.checkNotNull(this.f108469f);
        if (!this.f108466c) {
            try {
                zzuvVar.zze();
                this.f108466c = true;
            } catch (RemoteException e) {
                throw new MlKitException("Failed to init text recognizer ".concat(String.valueOf(this.f108465b.getLoggingLibraryName())), 13, e);
            }
        }
        try {
            return new Text(zzuvVar.zzd(ImageUtils.getInstance().getImageDataWrapper(inputImage), new zzuq(inputImage.getFormat(), inputImage.getWidth(), inputImage.getHeight(), CommonConvertUtils.convertToMVRotation(inputImage.getRotationDegrees()), SystemClock.elapsedRealtime())), inputImage.getCoordinatesMatrix());
        } catch (RemoteException e2) {
            throw new MlKitException("Failed to run text recognizer ".concat(String.valueOf(this.f108465b.getLoggingLibraryName())), 13, e2);
        }
    }

    @Override // p000.InterfaceC18975aG2
    public final void zzb() {
        String str;
        zzuv zze;
        if (this.f108469f != null) {
            return;
        }
        try {
            TextRecognizerOptionsInterface textRecognizerOptionsInterface = this.f108465b;
            boolean z = textRecognizerOptionsInterface instanceof zzb;
            if (z) {
                str = ((zzb) textRecognizerOptionsInterface).zza();
            } else {
                str = null;
            }
            if (this.f108465b.getIsThickClient()) {
                zze = zzux.zza(DynamiteModule.load(this.f108464a, DynamiteModule.PREFER_LOCAL, this.f108465b.getModuleId()).instantiate("com.google.mlkit.vision.text.bundled.common.BundledTextRecognizerCreator")).zze(ObjectWrapper.wrap(this.f108464a), m406b(this.f108465b, str));
            } else if (z) {
                zze = zzut.zza(DynamiteModule.load(this.f108464a, DynamiteModule.PREFER_REMOTE, this.f108465b.getModuleId()).instantiate("com.google.android.gms.vision.text.mlkit.CommonTextRecognizerCreator")).zzd(ObjectWrapper.wrap(this.f108464a), null, m406b(this.f108465b, str));
            } else {
                zzuy zza = zzux.zza(DynamiteModule.load(this.f108464a, DynamiteModule.PREFER_REMOTE, this.f108465b.getModuleId()).instantiate("com.google.android.gms.vision.text.mlkit.TextRecognizerCreator"));
                if (this.f108465b.getLoggingLanguageOption() == 1) {
                    zze = zza.zzd(ObjectWrapper.wrap(this.f108464a));
                } else {
                    zze = zza.zze(ObjectWrapper.wrap(this.f108464a), m406b(this.f108465b, str));
                }
            }
            this.f108469f = zze;
            LoggingUtils.m37174b(this.f108468e, this.f108465b.getIsThickClient(), zzou.NO_ERROR);
        } catch (RemoteException e) {
            LoggingUtils.m37174b(this.f108468e, this.f108465b.getIsThickClient(), zzou.OPTIONAL_MODULE_INIT_ERROR);
            throw new MlKitException("Failed to create text recognizer ".concat(String.valueOf(this.f108465b.getLoggingLibraryName())), 13, e);
        } catch (DynamiteModule.LoadingException e2) {
            LoggingUtils.m37174b(this.f108468e, this.f108465b.getIsThickClient(), zzou.OPTIONAL_MODULE_NOT_AVAILABLE);
            if (!this.f108465b.getIsThickClient()) {
                if (!this.f108467d) {
                    OptionalModuleUtils.requestDownload(this.f108464a, TextOptionalModuleUtils.m37173a(this.f108465b));
                    this.f108467d = true;
                }
                throw new MlKitException("Waiting for the text optional module to be downloaded. Please wait.", 14);
            }
            throw new MlKitException(String.format("Failed to load text module %s. %s", this.f108465b.getLoggingLibraryName(), e2.getMessage()), 13, e2);
        }
    }

    @Override // p000.InterfaceC18975aG2
    public final void zzc() {
        zzuv zzuvVar = this.f108469f;
        if (zzuvVar != null) {
            try {
                zzuvVar.zzf();
            } catch (RemoteException unused) {
                "Failed to release text recognizer ".concat(String.valueOf(this.f108465b.getLoggingLibraryName()));
            }
            this.f108469f = null;
        }
        this.f108466c = false;
    }
}
