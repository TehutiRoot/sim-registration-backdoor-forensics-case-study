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

/* renamed from: ui2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C22558ui2 implements XG2 {

    /* renamed from: a */
    public final Context f107853a;

    /* renamed from: b */
    public final TextRecognizerOptionsInterface f107854b;

    /* renamed from: c */
    public boolean f107855c;

    /* renamed from: d */
    public boolean f107856d;

    /* renamed from: e */
    public final zzuc f107857e;

    /* renamed from: f */
    public zzuv f107858f;

    public C22558ui2(Context context, TextRecognizerOptionsInterface textRecognizerOptionsInterface, zzuc zzucVar) {
        this.f107853a = context;
        this.f107854b = textRecognizerOptionsInterface;
        this.f107857e = zzucVar;
    }

    /* renamed from: b */
    public static zzvh m1071b(TextRecognizerOptionsInterface textRecognizerOptionsInterface, String str) {
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

    @Override // p000.XG2
    /* renamed from: a */
    public final Text mo1072a(InputImage inputImage) {
        if (this.f107858f == null) {
            zzb();
        }
        zzuv zzuvVar = (zzuv) Preconditions.checkNotNull(this.f107858f);
        if (!this.f107855c) {
            try {
                zzuvVar.zze();
                this.f107855c = true;
            } catch (RemoteException e) {
                throw new MlKitException("Failed to init text recognizer ".concat(String.valueOf(this.f107854b.getLoggingLibraryName())), 13, e);
            }
        }
        try {
            return new Text(zzuvVar.zzd(ImageUtils.getInstance().getImageDataWrapper(inputImage), new zzuq(inputImage.getFormat(), inputImage.getWidth(), inputImage.getHeight(), CommonConvertUtils.convertToMVRotation(inputImage.getRotationDegrees()), SystemClock.elapsedRealtime())), inputImage.getCoordinatesMatrix());
        } catch (RemoteException e2) {
            throw new MlKitException("Failed to run text recognizer ".concat(String.valueOf(this.f107854b.getLoggingLibraryName())), 13, e2);
        }
    }

    @Override // p000.XG2
    public final void zzb() {
        String str;
        zzuv zze;
        if (this.f107858f != null) {
            return;
        }
        try {
            TextRecognizerOptionsInterface textRecognizerOptionsInterface = this.f107854b;
            boolean z = textRecognizerOptionsInterface instanceof zzb;
            if (z) {
                str = ((zzb) textRecognizerOptionsInterface).zza();
            } else {
                str = null;
            }
            if (this.f107854b.getIsThickClient()) {
                zze = zzux.zza(DynamiteModule.load(this.f107853a, DynamiteModule.PREFER_LOCAL, this.f107854b.getModuleId()).instantiate("com.google.mlkit.vision.text.bundled.common.BundledTextRecognizerCreator")).zze(ObjectWrapper.wrap(this.f107853a), m1071b(this.f107854b, str));
            } else if (z) {
                zze = zzut.zza(DynamiteModule.load(this.f107853a, DynamiteModule.PREFER_REMOTE, this.f107854b.getModuleId()).instantiate("com.google.android.gms.vision.text.mlkit.CommonTextRecognizerCreator")).zzd(ObjectWrapper.wrap(this.f107853a), null, m1071b(this.f107854b, str));
            } else {
                zzuy zza = zzux.zza(DynamiteModule.load(this.f107853a, DynamiteModule.PREFER_REMOTE, this.f107854b.getModuleId()).instantiate("com.google.android.gms.vision.text.mlkit.TextRecognizerCreator"));
                if (this.f107854b.getLoggingLanguageOption() == 1) {
                    zze = zza.zzd(ObjectWrapper.wrap(this.f107853a));
                } else {
                    zze = zza.zze(ObjectWrapper.wrap(this.f107853a), m1071b(this.f107854b, str));
                }
            }
            this.f107858f = zze;
            LoggingUtils.m37166b(this.f107857e, this.f107854b.getIsThickClient(), zzou.NO_ERROR);
        } catch (RemoteException e) {
            LoggingUtils.m37166b(this.f107857e, this.f107854b.getIsThickClient(), zzou.OPTIONAL_MODULE_INIT_ERROR);
            throw new MlKitException("Failed to create text recognizer ".concat(String.valueOf(this.f107854b.getLoggingLibraryName())), 13, e);
        } catch (DynamiteModule.LoadingException e2) {
            LoggingUtils.m37166b(this.f107857e, this.f107854b.getIsThickClient(), zzou.OPTIONAL_MODULE_NOT_AVAILABLE);
            if (!this.f107854b.getIsThickClient()) {
                if (!this.f107856d) {
                    OptionalModuleUtils.requestDownload(this.f107853a, TextOptionalModuleUtils.m37165a(this.f107854b));
                    this.f107856d = true;
                }
                throw new MlKitException("Waiting for the text optional module to be downloaded. Please wait.", 14);
            }
            throw new MlKitException(String.format("Failed to load text module %s. %s", this.f107854b.getLoggingLibraryName(), e2.getMessage()), 13, e2);
        }
    }

    @Override // p000.XG2
    public final void zzc() {
        zzuv zzuvVar = this.f107858f;
        if (zzuvVar != null) {
            try {
                zzuvVar.zzf();
            } catch (RemoteException unused) {
                "Failed to release text recognizer ".concat(String.valueOf(this.f107854b.getLoggingLibraryName()));
            }
            this.f107858f = null;
        }
        this.f107855c = false;
    }
}