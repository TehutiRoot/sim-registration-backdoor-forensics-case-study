package p000;

import android.content.Context;
import android.os.RemoteException;
import android.util.Pair;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.internal.mlkit_vision_face.zzj;
import com.google.android.gms.internal.mlkit_vision_face.zzks;
import com.google.android.gms.internal.mlkit_vision_face.zzl;
import com.google.android.gms.internal.mlkit_vision_face.zzm;
import com.google.android.gms.internal.mlkit_vision_face.zzoc;
import com.google.mlkit.common.MlKitException;
import com.google.mlkit.common.sdkinternal.OptionalModuleUtils;
import com.google.mlkit.vision.common.InputImage;
import com.google.mlkit.vision.face.FaceDetectorOptions;
import com.google.mlkit.vision.face.internal.zzh;
import java.util.List;

/* renamed from: ZF2 */
/* loaded from: classes4.dex */
public final class ZF2 implements InterfaceC17272Ad2 {

    /* renamed from: a */
    public boolean f7998a;

    /* renamed from: b */
    public final Context f7999b;

    /* renamed from: c */
    public final FaceDetectorOptions f8000c;

    /* renamed from: d */
    public final int f8001d;

    /* renamed from: e */
    public final zzoc f8002e;

    /* renamed from: f */
    public zzj f8003f;

    /* renamed from: g */
    public zzj f8004g;

    public ZF2(Context context, FaceDetectorOptions faceDetectorOptions, zzoc zzocVar) {
        this.f7999b = context;
        this.f8000c = faceDetectorOptions;
        this.f8001d = GoogleApiAvailabilityLight.getInstance().getApkVersion(context);
        this.f8002e = zzocVar;
    }

    /* renamed from: b */
    public static int m65256b(int i) {
        if (i != 1) {
            if (i == 2) {
                return 1;
            }
            throw new IllegalArgumentException("Invalid classification type: " + i);
        }
        return 0;
    }

    /* renamed from: c */
    public static int m65255c(int i) {
        if (i != 1) {
            if (i == 2) {
                return 1;
            }
            throw new IllegalArgumentException("Invalid landmark type: " + i);
        }
        return 0;
    }

    /* renamed from: d */
    public static int m65254d(int i) {
        if (i != 1) {
            if (i == 2) {
                return 1;
            }
            throw new IllegalArgumentException("Invalid mode type: " + i);
        }
        return 0;
    }

    @Override // p000.InterfaceC17272Ad2
    /* renamed from: a */
    public final Pair mo31088a(InputImage inputImage) {
        List list;
        if (this.f8003f == null && this.f8004g == null) {
            zzd();
        }
        zzj zzjVar = this.f8003f;
        if (zzjVar == null && this.f8004g == null) {
            throw new MlKitException("Waiting for the face detection module to be downloaded. Please wait.", 14);
        }
        List list2 = null;
        if (zzjVar != null) {
            list = m65253e(zzjVar, inputImage);
            if (!this.f8000c.zzg()) {
                zzh.m37178e(list);
            }
        } else {
            list = null;
        }
        zzj zzjVar2 = this.f8004g;
        if (zzjVar2 != null) {
            list2 = m65253e(zzjVar2, inputImage);
            zzh.m37178e(list2);
        }
        return new Pair(list, list2);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00a7 A[LOOP:0: B:14:0x00a5->B:15:0x00a7, LOOP_END] */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List m65253e(com.google.android.gms.internal.mlkit_vision_face.zzj r15, com.google.mlkit.vision.common.InputImage r16) {
        /*
            r14 = this;
            com.google.android.gms.internal.mlkit_vision_face.zzp r11 = new com.google.android.gms.internal.mlkit_vision_face.zzp     // Catch: android.os.RemoteException -> Lb9
            int r2 = r16.getWidth()     // Catch: android.os.RemoteException -> Lb9
            int r3 = r16.getHeight()     // Catch: android.os.RemoteException -> Lb9
            long r5 = android.os.SystemClock.elapsedRealtime()     // Catch: android.os.RemoteException -> Lb9
            int r0 = r16.getRotationDegrees()     // Catch: android.os.RemoteException -> Lb9
            int r7 = com.google.mlkit.vision.common.internal.CommonConvertUtils.convertToMVRotation(r0)     // Catch: android.os.RemoteException -> Lb9
            r4 = 0
            r1 = r11
            r1.<init>(r2, r3, r4, r5, r7)     // Catch: android.os.RemoteException -> Lb9
            int r0 = r16.getFormat()     // Catch: android.os.RemoteException -> Lb9
            r1 = 35
            r12 = 0
            if (r0 != r1) goto L8b
            r13 = r14
            int r0 = r13.f8001d     // Catch: android.os.RemoteException -> L89
            r1 = 201500000(0xc02a560, float:1.0064601E-31)
            if (r0 < r1) goto L8c
            android.media.Image$Plane[] r0 = r16.getPlanes()     // Catch: android.os.RemoteException -> L89
            java.lang.Object r0 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)     // Catch: android.os.RemoteException -> L89
            android.media.Image$Plane[] r0 = (android.media.Image.Plane[]) r0     // Catch: android.os.RemoteException -> L89
            r1 = r0[r12]     // Catch: android.os.RemoteException -> L89
            java.nio.ByteBuffer r1 = r1.getBuffer()     // Catch: android.os.RemoteException -> L89
            com.google.android.gms.dynamic.IObjectWrapper r2 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r1)     // Catch: android.os.RemoteException -> L89
            r1 = 1
            r3 = r0[r1]     // Catch: android.os.RemoteException -> L89
            java.nio.ByteBuffer r3 = r3.getBuffer()     // Catch: android.os.RemoteException -> L89
            com.google.android.gms.dynamic.IObjectWrapper r3 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r3)     // Catch: android.os.RemoteException -> L89
            r4 = 2
            r5 = r0[r4]     // Catch: android.os.RemoteException -> L89
            java.nio.ByteBuffer r5 = r5.getBuffer()     // Catch: android.os.RemoteException -> L89
            com.google.android.gms.dynamic.IObjectWrapper r5 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r5)     // Catch: android.os.RemoteException -> L89
            r6 = r0[r12]     // Catch: android.os.RemoteException -> L89
            int r6 = r6.getPixelStride()     // Catch: android.os.RemoteException -> L89
            r7 = r0[r1]     // Catch: android.os.RemoteException -> L89
            int r7 = r7.getPixelStride()     // Catch: android.os.RemoteException -> L89
            r8 = r0[r4]     // Catch: android.os.RemoteException -> L89
            int r8 = r8.getPixelStride()     // Catch: android.os.RemoteException -> L89
            r9 = r0[r12]     // Catch: android.os.RemoteException -> L89
            int r9 = r9.getRowStride()     // Catch: android.os.RemoteException -> L89
            r1 = r0[r1]     // Catch: android.os.RemoteException -> L89
            int r10 = r1.getRowStride()     // Catch: android.os.RemoteException -> L89
            r0 = r0[r4]     // Catch: android.os.RemoteException -> L89
            int r0 = r0.getRowStride()     // Catch: android.os.RemoteException -> L89
            r1 = r15
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r8
            r8 = r9
            r9 = r10
            r10 = r0
            com.google.android.gms.internal.mlkit_vision_face.zzf[] r0 = r1.zzf(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)     // Catch: android.os.RemoteException -> L89
            r1 = r16
            goto L9f
        L89:
            r0 = move-exception
            goto Lbb
        L8b:
            r13 = r14
        L8c:
            com.google.mlkit.vision.common.internal.ImageConvertUtils r0 = com.google.mlkit.vision.common.internal.ImageConvertUtils.getInstance()     // Catch: android.os.RemoteException -> L89
            r1 = r16
            java.nio.ByteBuffer r0 = r0.convertToNv21Buffer(r1, r12)     // Catch: android.os.RemoteException -> L89
            com.google.android.gms.dynamic.IObjectWrapper r0 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r0)     // Catch: android.os.RemoteException -> L89
            r2 = r15
            com.google.android.gms.internal.mlkit_vision_face.zzf[] r0 = r15.zze(r0, r11)     // Catch: android.os.RemoteException -> L89
        L9f:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            int r3 = r0.length
        La5:
            if (r12 >= r3) goto Lb8
            r4 = r0[r12]
            com.google.mlkit.vision.face.Face r5 = new com.google.mlkit.vision.face.Face
            android.graphics.Matrix r6 = r16.getCoordinatesMatrix()
            r5.<init>(r4, r6)
            r2.add(r5)
            int r12 = r12 + 1
            goto La5
        Lb8:
            return r2
        Lb9:
            r0 = move-exception
            r13 = r14
        Lbb:
            com.google.mlkit.common.MlKitException r1 = new com.google.mlkit.common.MlKitException
            java.lang.String r2 = "Failed to detect with legacy face detector"
            r3 = 13
            r1.<init>(r2, r3, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.ZF2.m65253e(com.google.android.gms.internal.mlkit_vision_face.zzj, com.google.mlkit.vision.common.InputImage):java.util.List");
    }

    @Override // p000.InterfaceC17272Ad2
    public final void zzb() {
        zzj zzjVar = this.f8003f;
        if (zzjVar != null) {
            try {
                zzjVar.zzd();
            } catch (RemoteException unused) {
            }
            this.f8003f = null;
        }
        zzj zzjVar2 = this.f8004g;
        if (zzjVar2 != null) {
            try {
                zzjVar2.zzd();
            } catch (RemoteException unused2) {
            }
            this.f8004g = null;
        }
    }

    @Override // p000.InterfaceC17272Ad2
    public final boolean zzd() {
        if (this.f8003f != null || this.f8004g != null) {
            return false;
        }
        try {
            zzm zza = zzl.zza(DynamiteModule.load(this.f7999b, DynamiteModule.PREFER_REMOTE, OptionalModuleUtils.DEPRECATED_DYNAMITE_MODULE_ID).instantiate("com.google.android.gms.vision.face.ChimeraNativeFaceDetectorCreator"));
            IObjectWrapper wrap = ObjectWrapper.wrap(this.f7999b);
            if (this.f8000c.zzc() == 2) {
                if (this.f8004g == null) {
                    this.f8004g = zza.zzd(wrap, new com.google.android.gms.internal.mlkit_vision_face.zzh(2, 2, 0, true, false, this.f8000c.zza()));
                }
                if ((this.f8000c.zzd() == 2 || this.f8000c.zzb() == 2 || this.f8000c.zze() == 2) && this.f8003f == null) {
                    this.f8003f = zza.zzd(wrap, new com.google.android.gms.internal.mlkit_vision_face.zzh(m65254d(this.f8000c.zze()), m65255c(this.f8000c.zzd()), m65256b(this.f8000c.zzb()), false, this.f8000c.zzg(), this.f8000c.zza()));
                }
            } else if (this.f8003f == null) {
                this.f8003f = zza.zzd(wrap, new com.google.android.gms.internal.mlkit_vision_face.zzh(m65254d(this.f8000c.zze()), m65255c(this.f8000c.zzd()), m65256b(this.f8000c.zzb()), false, this.f8000c.zzg(), this.f8000c.zza()));
            }
            if (this.f8003f == null && this.f8004g == null && !this.f7998a) {
                OptionalModuleUtils.requestDownload(this.f7999b, OptionalModuleUtils.BARCODE);
                this.f7998a = true;
            }
            com.google.mlkit.vision.face.internal.zzj.zzc(this.f8002e, false, zzks.NO_ERROR);
            return false;
        } catch (RemoteException e) {
            throw new MlKitException("Failed to create legacy face detector.", 13, e);
        } catch (DynamiteModule.LoadingException e2) {
            throw new MlKitException("Failed to load deprecated vision dynamite module.", 13, e2);
        }
    }
}
