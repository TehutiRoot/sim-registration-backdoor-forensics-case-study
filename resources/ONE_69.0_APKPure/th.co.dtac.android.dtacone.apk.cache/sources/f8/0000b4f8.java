package com.google.mlkit.vision.barcode.internal;

import android.os.SystemClock;
import androidx.annotation.NonNull;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.mlkit_vision_barcode.zzcs;
import com.google.android.gms.internal.mlkit_vision_barcode.zzfs;
import com.google.android.gms.internal.mlkit_vision_barcode.zzft;
import com.google.android.gms.internal.mlkit_vision_barcode.zzfv;
import com.google.android.gms.internal.mlkit_vision_barcode.zzol;
import com.google.android.gms.internal.mlkit_vision_barcode.zzop;
import com.google.android.gms.internal.mlkit_vision_barcode.zzoq;
import com.google.android.gms.internal.mlkit_vision_barcode.zzow;
import com.google.android.gms.internal.mlkit_vision_barcode.zzpi;
import com.google.android.gms.internal.mlkit_vision_barcode.zzpj;
import com.google.android.gms.internal.mlkit_vision_barcode.zzpk;
import com.google.android.gms.internal.mlkit_vision_barcode.zzpl;
import com.google.android.gms.internal.mlkit_vision_barcode.zzpx;
import com.google.android.gms.internal.mlkit_vision_barcode.zztm;
import com.google.android.gms.internal.mlkit_vision_barcode.zztw;
import com.google.android.gms.internal.mlkit_vision_barcode.zztx;
import com.google.android.gms.internal.mlkit_vision_barcode.zztz;
import com.google.android.gms.internal.mlkit_vision_barcode.zzua;
import com.google.mlkit.common.MlKitException;
import com.google.mlkit.common.sdkinternal.MLTask;
import com.google.mlkit.common.sdkinternal.MLTaskExecutor;
import com.google.mlkit.common.sdkinternal.MlKitContext;
import com.google.mlkit.vision.barcode.BarcodeScannerOptions;
import com.google.mlkit.vision.barcode.common.Barcode;
import com.google.mlkit.vision.common.InputImage;
import com.google.mlkit.vision.common.internal.BitmapInStreamingChecker;
import com.google.mlkit.vision.common.internal.ImageUtils;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public final class zzk extends MLTask {

    /* renamed from: i */
    public static final ImageUtils f57092i = ImageUtils.getInstance();

    /* renamed from: j */
    public static boolean f57093j = true;

    /* renamed from: c */
    public final BarcodeScannerOptions f57094c;

    /* renamed from: d */
    public final HE2 f57095d;

    /* renamed from: e */
    public final zztx f57096e;

    /* renamed from: f */
    public final zztz f57097f;

    /* renamed from: g */
    public final BitmapInStreamingChecker f57098g = new BitmapInStreamingChecker();

    /* renamed from: h */
    public boolean f57099h;

    public zzk(MlKitContext mlKitContext, BarcodeScannerOptions barcodeScannerOptions, HE2 he2, zztx zztxVar) {
        Preconditions.checkNotNull(mlKitContext, "MlKitContext can not be null");
        Preconditions.checkNotNull(barcodeScannerOptions, "BarcodeScannerOptions can not be null");
        this.f57094c = barcodeScannerOptions;
        this.f57095d = he2;
        this.f57096e = zztxVar;
        this.f57097f = zztz.zza(mlKitContext.getApplicationContext());
    }

    /* renamed from: c */
    public final /* synthetic */ zztm m37191c(long j, zzpj zzpjVar, zzcs zzcsVar, zzcs zzcsVar2, InputImage inputImage) {
        zzoq zzoqVar;
        zzpi zzpiVar;
        zzpx zzpxVar = new zzpx();
        zzow zzowVar = new zzow();
        zzowVar.zzc(Long.valueOf(j));
        zzowVar.zzd(zzpjVar);
        zzowVar.zze(Boolean.valueOf(f57093j));
        Boolean bool = Boolean.TRUE;
        zzowVar.zza(bool);
        zzowVar.zzb(bool);
        zzpxVar.zzh(zzowVar.zzf());
        zzpxVar.zzi(zzb.zzc(this.f57094c));
        zzpxVar.zze(zzcsVar.zzf());
        zzpxVar.zzf(zzcsVar2.zzf());
        int format = inputImage.getFormat();
        int mobileVisionImageSize = f57092i.getMobileVisionImageSize(inputImage);
        zzop zzopVar = new zzop();
        if (format != -1) {
            if (format != 35) {
                if (format != 842094169) {
                    if (format != 16) {
                        if (format != 17) {
                            zzoqVar = zzoq.UNKNOWN_FORMAT;
                        } else {
                            zzoqVar = zzoq.NV21;
                        }
                    } else {
                        zzoqVar = zzoq.NV16;
                    }
                } else {
                    zzoqVar = zzoq.YV12;
                }
            } else {
                zzoqVar = zzoq.YUV_420_888;
            }
        } else {
            zzoqVar = zzoq.BITMAP;
        }
        zzopVar.zza(zzoqVar);
        zzopVar.zzb(Integer.valueOf(mobileVisionImageSize));
        zzpxVar.zzg(zzopVar.zzd());
        zzpl zzplVar = new zzpl();
        if (this.f57099h) {
            zzpiVar = zzpi.TYPE_THICK;
        } else {
            zzpiVar = zzpi.TYPE_THIN;
        }
        zzplVar.zze(zzpiVar);
        zzplVar.zzg(zzpxVar.zzj());
        return zzua.zzf(zzplVar);
    }

    /* renamed from: d */
    public final /* synthetic */ zztm m37190d(zzfv zzfvVar, int i, zzol zzolVar) {
        zzpi zzpiVar;
        zzpl zzplVar = new zzpl();
        if (this.f57099h) {
            zzpiVar = zzpi.TYPE_THICK;
        } else {
            zzpiVar = zzpi.TYPE_THIN;
        }
        zzplVar.zze(zzpiVar);
        zzfs zzfsVar = new zzfs();
        zzfsVar.zza(Integer.valueOf(i));
        zzfsVar.zzc(zzfvVar);
        zzfsVar.zzb(zzolVar);
        zzplVar.zzd(zzfsVar.zze());
        return zzua.zzf(zzplVar);
    }

    /* renamed from: e */
    public final void m37189e(final zzpj zzpjVar, long j, final InputImage inputImage, List list) {
        int i;
        final zzcs zzcsVar = new zzcs();
        final zzcs zzcsVar2 = new zzcs();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Barcode barcode = (Barcode) it.next();
                zzcsVar.zzd(zzb.zza(barcode.getFormat()));
                zzcsVar2.zzd(zzb.zzb(barcode.getValueType()));
            }
        }
        final long elapsedRealtime = SystemClock.elapsedRealtime() - j;
        this.f57096e.zzf(new zztw() { // from class: com.google.mlkit.vision.barcode.internal.zzi
            @Override // com.google.android.gms.internal.mlkit_vision_barcode.zztw
            public final zztm zza() {
                return zzk.this.m37191c(elapsedRealtime, zzpjVar, zzcsVar, zzcsVar2, inputImage);
            }
        }, zzpk.ON_DEVICE_BARCODE_DETECT);
        zzft zzftVar = new zzft();
        zzftVar.zze(zzpjVar);
        zzftVar.zzf(Boolean.valueOf(f57093j));
        zzftVar.zzg(zzb.zzc(this.f57094c));
        zzftVar.zzc(zzcsVar.zzf());
        zzftVar.zzd(zzcsVar2.zzf());
        final zzfv zzh = zzftVar.zzh();
        final zzj zzjVar = new zzj(this);
        final zztx zztxVar = this.f57096e;
        final zzpk zzpkVar = zzpk.AGGREGATED_ON_DEVICE_BARCODE_DETECTION;
        MLTaskExecutor.workerThreadExecutor().execute(new Runnable() { // from class: com.google.android.gms.internal.mlkit_vision_barcode.zztu
            @Override // java.lang.Runnable
            public final void run() {
                zztx.this.m46993e(zzpkVar, zzh, elapsedRealtime, zzjVar);
            }
        });
        long currentTimeMillis = System.currentTimeMillis();
        boolean z = this.f57099h;
        long j2 = currentTimeMillis - elapsedRealtime;
        zztz zztzVar = this.f57097f;
        if (true != z) {
            i = 24301;
        } else {
            i = 24302;
        }
        zztzVar.zzc(i, zzpjVar.zza(), j2, currentTimeMillis);
    }

    @Override // com.google.mlkit.common.sdkinternal.ModelResource
    @WorkerThread
    public final synchronized void load() throws MlKitException {
        this.f57099h = this.f57095d.zzc();
    }

    @Override // com.google.mlkit.common.sdkinternal.ModelResource
    @WorkerThread
    public final synchronized void release() {
        zzpi zzpiVar;
        try {
            this.f57095d.zzb();
            f57093j = true;
            zztx zztxVar = this.f57096e;
            zzpl zzplVar = new zzpl();
            if (this.f57099h) {
                zzpiVar = zzpi.TYPE_THICK;
            } else {
                zzpiVar = zzpi.TYPE_THIN;
            }
            zzplVar.zze(zzpiVar);
            zzpx zzpxVar = new zzpx();
            zzpxVar.zzi(zzb.zzc(this.f57094c));
            zzplVar.zzg(zzpxVar.zzj());
            zztxVar.zzd(zzua.zzf(zzplVar), zzpk.ON_DEVICE_BARCODE_CLOSE);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.google.mlkit.common.sdkinternal.MLTask
    @WorkerThread
    /* renamed from: zze */
    public final synchronized List run(@NonNull InputImage inputImage) throws MlKitException {
        zzpj zzpjVar;
        List mo22702a;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.f57098g.check(inputImage);
        try {
            mo22702a = this.f57095d.mo22702a(inputImage);
            m37189e(zzpj.NO_ERROR, elapsedRealtime, inputImage, mo22702a);
            f57093j = false;
        } catch (MlKitException e) {
            if (e.getErrorCode() == 14) {
                zzpjVar = zzpj.MODEL_NOT_DOWNLOADED;
            } else {
                zzpjVar = zzpj.UNKNOWN_ERROR;
            }
            m37189e(zzpjVar, elapsedRealtime, inputImage, null);
            throw e;
        }
        return mo22702a;
    }
}