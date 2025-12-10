package com.google.mlkit.vision.text.internal;

import android.os.SystemClock;
import androidx.annotation.NonNull;
import androidx.annotation.WorkerThread;
import com.google.android.gms.internal.mlkit_vision_text_common.zzep;
import com.google.android.gms.internal.mlkit_vision_text_common.zzeq;
import com.google.android.gms.internal.mlkit_vision_text_common.zzes;
import com.google.android.gms.internal.mlkit_vision_text_common.zznw;
import com.google.android.gms.internal.mlkit_vision_text_common.zzoa;
import com.google.android.gms.internal.mlkit_vision_text_common.zzob;
import com.google.android.gms.internal.mlkit_vision_text_common.zzoh;
import com.google.android.gms.internal.mlkit_vision_text_common.zzot;
import com.google.android.gms.internal.mlkit_vision_text_common.zzou;
import com.google.android.gms.internal.mlkit_vision_text_common.zzov;
import com.google.android.gms.internal.mlkit_vision_text_common.zzow;
import com.google.android.gms.internal.mlkit_vision_text_common.zzrx;
import com.google.android.gms.internal.mlkit_vision_text_common.zzrz;
import com.google.android.gms.internal.mlkit_vision_text_common.zzsa;
import com.google.android.gms.internal.mlkit_vision_text_common.zztr;
import com.google.android.gms.internal.mlkit_vision_text_common.zzub;
import com.google.android.gms.internal.mlkit_vision_text_common.zzuc;
import com.google.android.gms.internal.mlkit_vision_text_common.zzue;
import com.google.android.gms.internal.mlkit_vision_text_common.zzuf;
import com.google.mlkit.common.MlKitException;
import com.google.mlkit.common.sdkinternal.MLTask;
import com.google.mlkit.common.sdkinternal.MLTaskExecutor;
import com.google.mlkit.common.sdkinternal.TaskQueue;
import com.google.mlkit.vision.common.InputImage;
import com.google.mlkit.vision.common.internal.ImageUtils;
import com.google.mlkit.vision.text.Text;
import com.google.mlkit.vision.text.TextRecognizerOptionsInterface;
import java.util.concurrent.Executor;

/* loaded from: classes4.dex */
public class TextRecognizerTaskWithResource extends MLTask<Text, InputImage> {

    /* renamed from: h */
    public static boolean f57185h = true;

    /* renamed from: c */
    public final XG2 f57187c;

    /* renamed from: d */
    public final zzuc f57188d;

    /* renamed from: e */
    public final zzue f57189e;

    /* renamed from: f */
    public final TextRecognizerOptionsInterface f57190f;

    /* renamed from: i */
    public static final ImageUtils f57186i = ImageUtils.getInstance();

    /* renamed from: g */
    public static final TaskQueue f57184g = new TaskQueue();

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public TextRecognizerTaskWithResource(com.google.android.gms.internal.mlkit_vision_text_common.zzuc r3, p000.XG2 r4, com.google.mlkit.vision.text.TextRecognizerOptionsInterface r5) {
        /*
            r2 = this;
            int r0 = r5.getLoggingLanguageOption()
            r1 = 8
            if (r0 == r1) goto L13
            int r0 = r5.getLoggingLanguageOption()
            r1 = 7
            if (r0 != r1) goto L10
            goto L13
        L10:
            com.google.mlkit.common.sdkinternal.TaskQueue r0 = com.google.mlkit.vision.text.internal.TextRecognizerTaskWithResource.f57184g
            goto L18
        L13:
            com.google.mlkit.common.sdkinternal.TaskQueue r0 = new com.google.mlkit.common.sdkinternal.TaskQueue
            r0.<init>()
        L18:
            r2.<init>(r0)
            r2.f57188d = r3
            r2.f57187c = r4
            com.google.mlkit.common.sdkinternal.MlKitContext r3 = com.google.mlkit.common.sdkinternal.MlKitContext.getInstance()
            android.content.Context r3 = r3.getApplicationContext()
            com.google.android.gms.internal.mlkit_vision_text_common.zzue r3 = com.google.android.gms.internal.mlkit_vision_text_common.zzue.zza(r3)
            r2.f57189e = r3
            r2.f57190f = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.mlkit.vision.text.internal.TextRecognizerTaskWithResource.<init>(com.google.android.gms.internal.mlkit_vision_text_common.zzuc, XG2, com.google.mlkit.vision.text.TextRecognizerOptionsInterface):void");
    }

    /* renamed from: c */
    public final /* synthetic */ zztr m37164c(long j, zzou zzouVar, InputImage inputImage) {
        zzob zzobVar;
        zzot zzotVar;
        zzrx zzrxVar = new zzrx();
        zzoh zzohVar = new zzoh();
        zzohVar.zzc(Long.valueOf(j));
        zzohVar.zzd(zzouVar);
        zzohVar.zze(Boolean.valueOf(f57185h));
        Boolean bool = Boolean.TRUE;
        zzohVar.zza(bool);
        zzohVar.zzb(bool);
        zzrxVar.zzd(zzohVar.zzf());
        ImageUtils imageUtils = f57186i;
        int mobileVisionImageFormat = imageUtils.getMobileVisionImageFormat(inputImage);
        int mobileVisionImageSize = imageUtils.getMobileVisionImageSize(inputImage);
        zzoa zzoaVar = new zzoa();
        if (mobileVisionImageFormat != -1) {
            if (mobileVisionImageFormat != 35) {
                if (mobileVisionImageFormat != 842094169) {
                    if (mobileVisionImageFormat != 16) {
                        if (mobileVisionImageFormat != 17) {
                            zzobVar = zzob.UNKNOWN_FORMAT;
                        } else {
                            zzobVar = zzob.NV21;
                        }
                    } else {
                        zzobVar = zzob.NV16;
                    }
                } else {
                    zzobVar = zzob.YV12;
                }
            } else {
                zzobVar = zzob.YUV_420_888;
            }
        } else {
            zzobVar = zzob.BITMAP;
        }
        zzoaVar.zza(zzobVar);
        zzoaVar.zzb(Integer.valueOf(mobileVisionImageSize));
        zzrxVar.zzc(zzoaVar.zzd());
        zzsa zzsaVar = new zzsa();
        zzsaVar.zza(LoggingUtils.m37167a(this.f57190f.getLoggingLanguageOption()));
        zzrxVar.zze(zzsaVar.zzc());
        zzrz zzf = zzrxVar.zzf();
        zzow zzowVar = new zzow();
        if (this.f57190f.getIsThickClient()) {
            zzotVar = zzot.TYPE_THICK;
        } else {
            zzotVar = zzot.TYPE_THIN;
        }
        zzowVar.zze(zzotVar);
        zzowVar.zzh(zzf);
        return zzuf.zzf(zzowVar);
    }

    /* renamed from: d */
    public final /* synthetic */ zztr m37163d(zzes zzesVar, int i, zznw zznwVar) {
        zzot zzotVar;
        zzow zzowVar = new zzow();
        if (this.f57190f.getIsThickClient()) {
            zzotVar = zzot.TYPE_THICK;
        } else {
            zzotVar = zzot.TYPE_THIN;
        }
        zzowVar.zze(zzotVar);
        zzep zzepVar = new zzep();
        zzepVar.zza(Integer.valueOf(i));
        zzepVar.zzc(zzesVar);
        zzepVar.zzb(zznwVar);
        zzowVar.zzd(zzepVar.zze());
        return zzuf.zzf(zzowVar);
    }

    /* renamed from: e */
    public final void m37162e(final zzou zzouVar, long j, final InputImage inputImage) {
        final long elapsedRealtime = SystemClock.elapsedRealtime() - j;
        this.f57188d.zzf(new zzub() { // from class: com.google.mlkit.vision.text.internal.zzq
            @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzub
            public final zztr zza() {
                return TextRecognizerTaskWithResource.this.m37164c(elapsedRealtime, zzouVar, inputImage);
            }
        }, zzov.ON_DEVICE_TEXT_DETECT);
        zzeq zzeqVar = new zzeq();
        zzeqVar.zza(zzouVar);
        zzeqVar.zzb(Boolean.valueOf(f57185h));
        zzsa zzsaVar = new zzsa();
        zzsaVar.zza(LoggingUtils.m37167a(this.f57190f.getLoggingLanguageOption()));
        zzeqVar.zzc(zzsaVar.zzc());
        final zzes zzd = zzeqVar.zzd();
        final zzr zzrVar = new zzr(this);
        final zzov zzovVar = zzov.AGGREGATED_ON_DEVICE_TEXT_DETECTION;
        Executor workerThreadExecutor = MLTaskExecutor.workerThreadExecutor();
        final zzuc zzucVar = this.f57188d;
        workerThreadExecutor.execute(new Runnable() { // from class: com.google.android.gms.internal.mlkit_vision_text_common.zzua
            @Override // java.lang.Runnable
            public final void run() {
                zzuc.this.m46657e(zzovVar, zzd, elapsedRealtime, zzrVar);
            }
        });
        long currentTimeMillis = System.currentTimeMillis();
        this.f57189e.zzc(this.f57190f.getLoggingEventId(), zzouVar.zza(), currentTimeMillis - elapsedRealtime, currentTimeMillis);
    }

    @Override // com.google.mlkit.common.sdkinternal.ModelResource
    @WorkerThread
    public final synchronized void load() throws MlKitException {
        this.f57187c.zzb();
    }

    @Override // com.google.mlkit.common.sdkinternal.ModelResource
    @WorkerThread
    public final synchronized void release() {
        f57185h = true;
        this.f57187c.zzc();
    }

    @Override // com.google.mlkit.common.sdkinternal.MLTask
    @NonNull
    @WorkerThread
    /* renamed from: zze */
    public final synchronized Text run(@NonNull InputImage inputImage) throws MlKitException {
        zzou zzouVar;
        Text mo1072a;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        try {
            mo1072a = this.f57187c.mo1072a(inputImage);
            m37162e(zzou.NO_ERROR, elapsedRealtime, inputImage);
            f57185h = false;
        } catch (MlKitException e) {
            if (e.getErrorCode() == 14) {
                zzouVar = zzou.MODEL_NOT_DOWNLOADED;
            } else {
                zzouVar = zzou.UNKNOWN_ERROR;
            }
            m37162e(zzouVar, elapsedRealtime, inputImage);
            throw e;
        }
        return mo1072a;
    }
}