package com.google.mlkit.vision.barcode.internal;

import android.graphics.Point;
import androidx.annotation.NonNull;
import com.google.android.gms.common.Feature;
import com.google.android.gms.internal.mlkit_vision_barcode.zzew;
import com.google.android.gms.internal.mlkit_vision_barcode.zzpi;
import com.google.android.gms.internal.mlkit_vision_barcode.zzpk;
import com.google.android.gms.internal.mlkit_vision_barcode.zzpl;
import com.google.android.gms.internal.mlkit_vision_barcode.zzpx;
import com.google.android.gms.internal.mlkit_vision_barcode.zzpz;
import com.google.android.gms.internal.mlkit_vision_barcode.zztx;
import com.google.android.gms.internal.mlkit_vision_barcode.zzua;
import com.google.android.gms.internal.mlkit_vision_barcode.zzus;
import com.google.android.gms.internal.mlkit_vision_barcode.zzuv;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.odml.image.MlImage;
import com.google.mlkit.common.sdkinternal.MlKitContext;
import com.google.mlkit.common.sdkinternal.OptionalModuleUtils;
import com.google.mlkit.vision.barcode.BarcodeScanner;
import com.google.mlkit.vision.barcode.BarcodeScannerOptions;
import com.google.mlkit.vision.barcode.ZoomSuggestionOptions;
import com.google.mlkit.vision.barcode.common.Barcode;
import com.google.mlkit.vision.common.InputImage;
import com.google.mlkit.vision.common.internal.MobileVisionBase;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes4.dex */
public class BarcodeScannerImpl extends MobileVisionBase<List<Barcode>> implements BarcodeScanner {

    /* renamed from: l */
    public static final BarcodeScannerOptions f57066l = new BarcodeScannerOptions.Builder().build();
    public static final /* synthetic */ int zzc = 0;

    /* renamed from: g */
    public final boolean f57067g;

    /* renamed from: h */
    public final BarcodeScannerOptions f57068h;

    /* renamed from: i */
    public final zzus f57069i;

    /* renamed from: j */
    public int f57070j;

    /* renamed from: k */
    public boolean f57071k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BarcodeScannerImpl(BarcodeScannerOptions barcodeScannerOptions, zzk zzkVar, Executor executor, zztx zztxVar, MlKitContext mlKitContext) {
        super(zzkVar, executor);
        zzus zzd;
        zzpi zzpiVar;
        ZoomSuggestionOptions zzb = barcodeScannerOptions.zzb();
        if (zzb == null) {
            zzd = null;
        } else {
            zzd = zzus.zzd(mlKitContext.getApplicationContext(), mlKitContext.getApplicationContext().getPackageName());
            zzd.zzo(new zzf(zzb), zzew.zza());
            if (zzb.zza() >= 1.0f) {
                zzd.zzk(zzb.zza());
            }
            zzd.zzm();
        }
        this.f57068h = barcodeScannerOptions;
        boolean m37200b = zzb.m37200b();
        this.f57067g = m37200b;
        zzpx zzpxVar = new zzpx();
        zzpxVar.zzi(zzb.zzc(barcodeScannerOptions));
        zzpz zzj = zzpxVar.zzj();
        zzpl zzplVar = new zzpl();
        if (m37200b) {
            zzpiVar = zzpi.TYPE_THICK;
        } else {
            zzpiVar = zzpi.TYPE_THIN;
        }
        zzplVar.zze(zzpiVar);
        zzplVar.zzg(zzj);
        zztxVar.zzd(zzua.zzg(zzplVar, 1), zzpk.ON_DEVICE_BARCODE_CREATE);
        this.f57069i = zzd;
    }

    @Override // com.google.mlkit.vision.common.internal.MobileVisionBase, java.io.Closeable, java.lang.AutoCloseable, com.google.mlkit.vision.barcode.BarcodeScanner
    public final synchronized void close() {
        try {
            zzus zzusVar = this.f57069i;
            if (zzusVar != null) {
                zzusVar.zzn(this.f57071k);
                this.f57069i.zzj();
            }
            super.close();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.google.mlkit.vision.interfaces.Detector
    public final int getDetectorType() {
        return 1;
    }

    @Override // com.google.android.gms.common.api.OptionalModuleApi
    @NonNull
    public final Feature[] getOptionalFeatures() {
        return this.f57067g ? OptionalModuleUtils.EMPTY_FEATURES : new Feature[]{OptionalModuleUtils.FEATURE_BARCODE};
    }

    /* renamed from: i */
    public final /* synthetic */ Task m37204i(int i, int i2, List list) {
        if (this.f57069i == null) {
            return Tasks.forResult(list);
        }
        boolean z = true;
        this.f57070j++;
        List arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Barcode barcode = (Barcode) it.next();
            if (barcode.getFormat() == -1) {
                arrayList2.add(barcode);
            } else {
                arrayList.add(barcode);
            }
        }
        if (arrayList.isEmpty()) {
            int size = arrayList2.size();
            int i3 = 0;
            while (i3 < size) {
                Point[] cornerPoints = ((Barcode) arrayList2.get(i3)).getCornerPoints();
                if (cornerPoints != null) {
                    zzus zzusVar = this.f57069i;
                    int i4 = this.f57070j;
                    int i5 = i;
                    int i6 = i2;
                    int i7 = 0;
                    int i8 = 0;
                    for (Point point : Arrays.asList(cornerPoints)) {
                        i5 = Math.min(i5, point.x);
                        i6 = Math.min(i6, point.y);
                        i7 = Math.max(i7, point.x);
                        i8 = Math.max(i8, point.y);
                    }
                    float f = i;
                    float f2 = i2;
                    zzusVar.zzi(i4, zzuv.zzg((i5 + 0.0f) / f, (i6 + 0.0f) / f2, (i7 + 0.0f) / f, (i8 + 0.0f) / f2, 0.0f));
                }
                i3++;
                z = true;
            }
        } else {
            this.f57071k = true;
        }
        if (z == this.f57068h.zzd()) {
            arrayList = list;
        }
        return Tasks.forResult(arrayList);
    }

    /* renamed from: k */
    public final Task m37202k(Task task, final int i, final int i2) {
        return task.onSuccessTask(new SuccessContinuation() { // from class: com.google.mlkit.vision.barcode.internal.zze
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                return BarcodeScannerImpl.this.m37204i(i, i2, (List) obj);
            }
        });
    }

    @Override // com.google.mlkit.vision.barcode.BarcodeScanner
    @NonNull
    public final Task<List<Barcode>> process(@NonNull MlImage mlImage) {
        return m37202k(super.processBase(mlImage), mlImage.getWidth(), mlImage.getHeight());
    }

    @Override // com.google.mlkit.vision.barcode.BarcodeScanner
    @NonNull
    public final Task<List<Barcode>> process(@NonNull InputImage inputImage) {
        return m37202k(super.processBase(inputImage), inputImage.getWidth(), inputImage.getHeight());
    }
}
