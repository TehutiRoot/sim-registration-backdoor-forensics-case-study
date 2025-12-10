package com.google.mlkit.vision.face.internal;

import com.google.android.gms.internal.mlkit_vision_face.zzjx;
import com.google.android.gms.internal.mlkit_vision_face.zzjy;
import com.google.android.gms.internal.mlkit_vision_face.zzjz;
import com.google.android.gms.internal.mlkit_vision_face.zzka;
import com.google.android.gms.internal.mlkit_vision_face.zzkb;
import com.google.android.gms.internal.mlkit_vision_face.zzkd;
import com.google.android.gms.internal.mlkit_vision_face.zzkr;
import com.google.android.gms.internal.mlkit_vision_face.zzks;
import com.google.android.gms.internal.mlkit_vision_face.zzkt;
import com.google.android.gms.internal.mlkit_vision_face.zzku;
import com.google.android.gms.internal.mlkit_vision_face.zzlm;
import com.google.android.gms.internal.mlkit_vision_face.zznr;
import com.google.android.gms.internal.mlkit_vision_face.zzoa;
import com.google.android.gms.internal.mlkit_vision_face.zzoc;
import com.google.android.gms.internal.mlkit_vision_face.zzof;
import com.google.mlkit.common.sdkinternal.MlKitContext;
import com.google.mlkit.vision.face.FaceDetectorOptions;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes4.dex */
public final class zzj {

    /* renamed from: a */
    public static final AtomicReference f57156a = new AtomicReference();

    /* renamed from: a */
    public static boolean m37176a() {
        AtomicReference atomicReference = f57156a;
        if (atomicReference.get() != null) {
            return ((Boolean) atomicReference.get()).booleanValue();
        }
        boolean m31087b = C20059ga2.m31087b(MlKitContext.getInstance().getApplicationContext());
        atomicReference.set(Boolean.valueOf(m31087b));
        return m31087b;
    }

    public static zzkd zza(FaceDetectorOptions faceDetectorOptions) {
        zzka zzkaVar;
        zzjy zzjyVar;
        zzkb zzkbVar;
        zzjz zzjzVar;
        zzjx zzjxVar = new zzjx();
        int zzd = faceDetectorOptions.zzd();
        if (zzd != 1) {
            if (zzd != 2) {
                zzkaVar = zzka.UNKNOWN_LANDMARKS;
            } else {
                zzkaVar = zzka.ALL_LANDMARKS;
            }
        } else {
            zzkaVar = zzka.NO_LANDMARKS;
        }
        zzjxVar.zzd(zzkaVar);
        int zzb = faceDetectorOptions.zzb();
        if (zzb != 1) {
            if (zzb != 2) {
                zzjyVar = zzjy.UNKNOWN_CLASSIFICATIONS;
            } else {
                zzjyVar = zzjy.ALL_CLASSIFICATIONS;
            }
        } else {
            zzjyVar = zzjy.NO_CLASSIFICATIONS;
        }
        zzjxVar.zza(zzjyVar);
        int zze = faceDetectorOptions.zze();
        if (zze != 1) {
            if (zze != 2) {
                zzkbVar = zzkb.UNKNOWN_PERFORMANCE;
            } else {
                zzkbVar = zzkb.ACCURATE;
            }
        } else {
            zzkbVar = zzkb.FAST;
        }
        zzjxVar.zzf(zzkbVar);
        int zzc = faceDetectorOptions.zzc();
        if (zzc != 1) {
            if (zzc != 2) {
                zzjzVar = zzjz.UNKNOWN_CONTOURS;
            } else {
                zzjzVar = zzjz.ALL_CONTOURS;
            }
        } else {
            zzjzVar = zzjz.NO_CONTOURS;
        }
        zzjxVar.zzb(zzjzVar);
        zzjxVar.zzc(Boolean.valueOf(faceDetectorOptions.zzg()));
        zzjxVar.zze(Float.valueOf(faceDetectorOptions.zza()));
        return zzjxVar.zzk();
    }

    public static String zzb() {
        if (true != m37176a()) {
            return "play-services-mlkit-face-detection";
        }
        return "face-detection";
    }

    public static void zzc(zzoc zzocVar, final boolean z, final zzks zzksVar) {
        zzocVar.zzf(new zzoa() { // from class: com.google.mlkit.vision.face.internal.zzi
            @Override // com.google.android.gms.internal.mlkit_vision_face.zzoa
            public final zznr zza() {
                zzkr zzkrVar;
                boolean z2 = z;
                zzks zzksVar2 = zzksVar;
                zzku zzkuVar = new zzku();
                if (z2) {
                    zzkrVar = zzkr.TYPE_THICK;
                } else {
                    zzkrVar = zzkr.TYPE_THIN;
                }
                zzkuVar.zze(zzkrVar);
                zzlm zzlmVar = new zzlm();
                zzlmVar.zzb(zzksVar2);
                zzkuVar.zzh(zzlmVar.zzc());
                return zzof.zzf(zzkuVar);
            }
        }, zzkt.ON_DEVICE_FACE_LOAD);
    }
}
