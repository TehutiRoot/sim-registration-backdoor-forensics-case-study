package com.google.mlkit.vision.face.internal;

import android.os.SystemClock;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.mlkit_vision_face.zzdk;
import com.google.android.gms.internal.mlkit_vision_face.zzdl;
import com.google.android.gms.internal.mlkit_vision_face.zzdn;
import com.google.android.gms.internal.mlkit_vision_face.zzjv;
import com.google.android.gms.internal.mlkit_vision_face.zzke;
import com.google.android.gms.internal.mlkit_vision_face.zzkf;
import com.google.android.gms.internal.mlkit_vision_face.zzkj;
import com.google.android.gms.internal.mlkit_vision_face.zzkr;
import com.google.android.gms.internal.mlkit_vision_face.zzks;
import com.google.android.gms.internal.mlkit_vision_face.zzkt;
import com.google.android.gms.internal.mlkit_vision_face.zzku;
import com.google.android.gms.internal.mlkit_vision_face.zzlj;
import com.google.android.gms.internal.mlkit_vision_face.zzll;
import com.google.android.gms.internal.mlkit_vision_face.zznr;
import com.google.android.gms.internal.mlkit_vision_face.zzoa;
import com.google.android.gms.internal.mlkit_vision_face.zzoc;
import com.google.android.gms.internal.mlkit_vision_face.zzoe;
import com.google.android.gms.internal.mlkit_vision_face.zzof;
import com.google.mlkit.common.MlKitException;
import com.google.mlkit.common.sdkinternal.MLTask;
import com.google.mlkit.common.sdkinternal.MLTaskExecutor;
import com.google.mlkit.common.sdkinternal.MlKitContext;
import com.google.mlkit.vision.common.InputImage;
import com.google.mlkit.vision.common.internal.BitmapInStreamingChecker;
import com.google.mlkit.vision.common.internal.ImageUtils;
import com.google.mlkit.vision.face.Face;
import com.google.mlkit.vision.face.FaceDetectorOptions;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes4.dex */
public final class zzh extends MLTask {

    /* renamed from: i */
    public static final AtomicBoolean f57148i = new AtomicBoolean(true);

    /* renamed from: j */
    public static final ImageUtils f57149j = ImageUtils.getInstance();

    /* renamed from: c */
    public final FaceDetectorOptions f57150c;

    /* renamed from: d */
    public final zzoc f57151d;

    /* renamed from: e */
    public final zzoe f57152e;

    /* renamed from: f */
    public final InterfaceC17272Ad2 f57153f;

    /* renamed from: g */
    public boolean f57154g;

    /* renamed from: h */
    public final BitmapInStreamingChecker f57155h = new BitmapInStreamingChecker();

    @VisibleForTesting
    public zzh(@NonNull zzoc zzocVar, @NonNull FaceDetectorOptions faceDetectorOptions, @NonNull InterfaceC17272Ad2 interfaceC17272Ad2) {
        Preconditions.checkNotNull(faceDetectorOptions, "FaceDetectorOptions can not be null");
        this.f57150c = faceDetectorOptions;
        this.f57151d = zzocVar;
        this.f57153f = interfaceC17272Ad2;
        this.f57152e = zzoe.zza(MlKitContext.getInstance().getApplicationContext());
    }

    /* renamed from: e */
    public static void m37178e(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((Face) it.next()).zzc(-1);
        }
    }

    /* renamed from: c */
    public final /* synthetic */ zznr m37180c(long j, zzks zzksVar, int i, int i2, InputImage inputImage) {
        zzkf zzkfVar;
        zzkr zzkrVar;
        zzlj zzljVar = new zzlj();
        zzkj zzkjVar = new zzkj();
        zzkjVar.zzc(Long.valueOf(j));
        zzkjVar.zzd(zzksVar);
        zzkjVar.zze(Boolean.valueOf(f57148i.get()));
        Boolean bool = Boolean.TRUE;
        zzkjVar.zza(bool);
        zzkjVar.zzb(bool);
        zzljVar.zzg(zzkjVar.zzf());
        zzljVar.zze(zzj.zza(this.f57150c));
        zzljVar.zzd(Integer.valueOf(i));
        zzljVar.zzh(Integer.valueOf(i2));
        ImageUtils imageUtils = f57149j;
        int mobileVisionImageFormat = imageUtils.getMobileVisionImageFormat(inputImage);
        int mobileVisionImageSize = imageUtils.getMobileVisionImageSize(inputImage);
        zzke zzkeVar = new zzke();
        if (mobileVisionImageFormat != -1) {
            if (mobileVisionImageFormat != 35) {
                if (mobileVisionImageFormat != 842094169) {
                    if (mobileVisionImageFormat != 16) {
                        if (mobileVisionImageFormat != 17) {
                            zzkfVar = zzkf.UNKNOWN_FORMAT;
                        } else {
                            zzkfVar = zzkf.NV21;
                        }
                    } else {
                        zzkfVar = zzkf.NV16;
                    }
                } else {
                    zzkfVar = zzkf.YV12;
                }
            } else {
                zzkfVar = zzkf.YUV_420_888;
            }
        } else {
            zzkfVar = zzkf.BITMAP;
        }
        zzkeVar.zza(zzkfVar);
        zzkeVar.zzb(Integer.valueOf(mobileVisionImageSize));
        zzljVar.zzf(zzkeVar.zzd());
        zzll zzi = zzljVar.zzi();
        zzku zzkuVar = new zzku();
        if (this.f57154g) {
            zzkrVar = zzkr.TYPE_THICK;
        } else {
            zzkrVar = zzkr.TYPE_THIN;
        }
        zzkuVar.zze(zzkrVar);
        zzkuVar.zzg(zzi);
        return zzof.zzf(zzkuVar);
    }

    /* renamed from: d */
    public final /* synthetic */ zznr m37179d(zzdn zzdnVar, int i, zzjv zzjvVar) {
        zzkr zzkrVar;
        zzku zzkuVar = new zzku();
        if (this.f57154g) {
            zzkrVar = zzkr.TYPE_THICK;
        } else {
            zzkrVar = zzkr.TYPE_THIN;
        }
        zzkuVar.zze(zzkrVar);
        zzdk zzdkVar = new zzdk();
        zzdkVar.zza(Integer.valueOf(i));
        zzdkVar.zzc(zzdnVar);
        zzdkVar.zzb(zzjvVar);
        zzkuVar.zzd(zzdkVar.zze());
        return zzof.zzf(zzkuVar);
    }

    /* renamed from: f */
    public final synchronized void m37177f(final zzks zzksVar, long j, final InputImage inputImage, final int i, final int i2) {
        int i3;
        final long elapsedRealtime = SystemClock.elapsedRealtime() - j;
        this.f57151d.zzf(new zzoa() { // from class: com.google.mlkit.vision.face.internal.zzf
            @Override // com.google.android.gms.internal.mlkit_vision_face.zzoa
            public final zznr zza() {
                return zzh.this.m37180c(elapsedRealtime, zzksVar, i, i2, inputImage);
            }
        }, zzkt.ON_DEVICE_FACE_DETECT);
        zzdl zzdlVar = new zzdl();
        zzdlVar.zzc(zzksVar);
        zzdlVar.zzd(Boolean.valueOf(f57148i.get()));
        zzdlVar.zza(Integer.valueOf(i));
        zzdlVar.zze(Integer.valueOf(i2));
        zzdlVar.zzb(zzj.zza(this.f57150c));
        final zzdn zzf = zzdlVar.zzf();
        final zzg zzgVar = new zzg(this);
        final zzoc zzocVar = this.f57151d;
        final zzkt zzktVar = zzkt.AGGREGATED_ON_DEVICE_FACE_DETECTION;
        MLTaskExecutor.workerThreadExecutor().execute(new Runnable(zzktVar, zzf, elapsedRealtime, zzgVar, null) { // from class: com.google.android.gms.internal.mlkit_vision_face.zzny
            public final /* synthetic */ zzkt zzb;
            public final /* synthetic */ Object zzc;
            public final /* synthetic */ long zzd;
            public final /* synthetic */ com.google.mlkit.vision.face.internal.zzg zze;

            @Override // java.lang.Runnable
            public final void run() {
                zzoc.this.m46731e(this.zzb, this.zzc, this.zzd, this.zze);
            }
        });
        long currentTimeMillis = System.currentTimeMillis();
        boolean z = this.f57154g;
        long j2 = currentTimeMillis - elapsedRealtime;
        zzoe zzoeVar = this.f57152e;
        if (true != z) {
            i3 = 24303;
        } else {
            i3 = 24304;
        }
        zzoeVar.zzc(i3, zzksVar.zza(), j2, currentTimeMillis);
    }

    @Override // com.google.mlkit.common.sdkinternal.ModelResource
    @WorkerThread
    public final synchronized void load() throws MlKitException {
        this.f57154g = this.f57153f.zzd();
    }

    @Override // com.google.mlkit.common.sdkinternal.ModelResource
    @WorkerThread
    public final synchronized void release() {
        zzkr zzkrVar;
        try {
            this.f57153f.zzb();
            f57148i.set(true);
            zzoc zzocVar = this.f57151d;
            zzku zzkuVar = new zzku();
            if (this.f57154g) {
                zzkrVar = zzkr.TYPE_THICK;
            } else {
                zzkrVar = zzkr.TYPE_THIN;
            }
            zzkuVar.zze(zzkrVar);
            zzocVar.zzd(zzof.zzf(zzkuVar), zzkt.ON_DEVICE_FACE_CLOSE);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0035, code lost:
        r2 = (java.util.List) com.google.android.gms.common.internal.Preconditions.checkNotNull(r0);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0117 A[Catch: all -> 0x002b, MlKitException -> 0x00e3, TryCatch #1 {all -> 0x002b, blocks: (B:4:0x0005, B:5:0x000e, B:9:0x0021, B:10:0x002a, B:16:0x0035, B:46:0x0111, B:53:0x0125, B:52:0x0120, B:49:0x0117, B:19:0x0042, B:20:0x0049, B:21:0x0052, B:23:0x0058, B:24:0x0063, B:26:0x0069, B:28:0x0075, B:30:0x007b, B:32:0x0089, B:34:0x00b4, B:36:0x00da, B:40:0x00eb, B:56:0x0136, B:58:0x013e, B:61:0x0145, B:62:0x0150, B:60:0x0142, B:43:0x00fe, B:45:0x0109), top: B:66:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0120 A[Catch: all -> 0x002b, MlKitException -> 0x00e3, TryCatch #1 {all -> 0x002b, blocks: (B:4:0x0005, B:5:0x000e, B:9:0x0021, B:10:0x002a, B:16:0x0035, B:46:0x0111, B:53:0x0125, B:52:0x0120, B:49:0x0117, B:19:0x0042, B:20:0x0049, B:21:0x0052, B:23:0x0058, B:24:0x0063, B:26:0x0069, B:28:0x0075, B:30:0x007b, B:32:0x0089, B:34:0x00b4, B:36:0x00da, B:40:0x00eb, B:56:0x0136, B:58:0x013e, B:61:0x0145, B:62:0x0150, B:60:0x0142, B:43:0x00fe, B:45:0x0109), top: B:66:0x0005 }] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.util.List] */
    @Override // com.google.mlkit.common.sdkinternal.MLTask
    @androidx.annotation.WorkerThread
    /* renamed from: zze */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized java.util.List run(@androidx.annotation.NonNull com.google.mlkit.vision.common.InputImage r21) throws com.google.mlkit.common.MlKitException {
        /*
            Method dump skipped, instructions count: 339
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.mlkit.vision.face.internal.zzh.run(com.google.mlkit.vision.common.InputImage):java.util.List");
    }
}
