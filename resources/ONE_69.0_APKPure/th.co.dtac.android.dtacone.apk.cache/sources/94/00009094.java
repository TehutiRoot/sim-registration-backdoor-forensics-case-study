package com.google.android.gms.internal.firebase_ml;

import android.annotation.TargetApi;
import com.google.android.gms.internal.firebase_ml.zznq;
import com.google.firebase.p015ml.vision.face.FirebaseVisionFaceDetectorOptions;

/* loaded from: classes3.dex */
public final class zzsi {
    @TargetApi(19)
    public static zznq.zzae zzc(zzsn zzsnVar) {
        zznq.zzae.zza zzaVar;
        int capacity;
        if (zzsnVar.zzbuo.getBitmap() != null) {
            zzaVar = zznq.zzae.zza.BITMAP;
            capacity = zzsnVar.zzbuo.getBitmap().getAllocationByteCount();
        } else {
            int format = zzsnVar.zzbuo.getMetadata().getFormat();
            if (format != 16) {
                if (format != 17) {
                    if (format != 842094169) {
                        zzaVar = zznq.zzae.zza.UNKNOWN_FORMAT;
                    } else {
                        zzaVar = zznq.zzae.zza.YV12;
                    }
                } else {
                    zzaVar = zznq.zzae.zza.NV21;
                }
            } else {
                zzaVar = zznq.zzae.zza.NV16;
            }
            capacity = zzsnVar.zzbuo.getGrayscaleImageData().capacity();
        }
        return (zznq.zzae) ((zzxh) zznq.zzae.zzmi().zzb(zzaVar).zzbe(capacity).zzvn());
    }

    public static int zzcb(@FirebaseVisionFaceDetectorOptions.LandmarkMode int i) {
        if (i != 1) {
            if (i == 2) {
                return 1;
            }
            StringBuilder sb = new StringBuilder(34);
            sb.append("Invalid landmark type: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
        return 0;
    }

    public static int zzcc(@FirebaseVisionFaceDetectorOptions.PerformanceMode int i) {
        if (i != 1) {
            if (i == 2) {
                return 1;
            }
            StringBuilder sb = new StringBuilder(30);
            sb.append("Invalid mode type: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
        return 0;
    }

    public static int zzcd(@FirebaseVisionFaceDetectorOptions.ClassificationMode int i) {
        if (i != 1) {
            if (i == 2) {
                return 1;
            }
            StringBuilder sb = new StringBuilder(40);
            sb.append("Invalid classification type: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
        return 0;
    }
}