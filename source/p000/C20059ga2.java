package p000;

import android.content.Context;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Pair;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.internal.mlkit_vision_face.zzks;
import com.google.android.gms.internal.mlkit_vision_face.zzoc;
import com.google.android.gms.internal.mlkit_vision_face.zzoq;
import com.google.android.gms.internal.mlkit_vision_face.zzou;
import com.google.android.gms.internal.mlkit_vision_face.zzow;
import com.google.android.gms.internal.mlkit_vision_face.zzoy;
import com.google.android.gms.internal.mlkit_vision_face.zzpa;
import com.google.mlkit.common.MlKitException;
import com.google.mlkit.common.sdkinternal.OptionalModuleUtils;
import com.google.mlkit.vision.common.InputImage;
import com.google.mlkit.vision.common.internal.CommonConvertUtils;
import com.google.mlkit.vision.common.internal.ImageConvertUtils;
import com.google.mlkit.vision.common.internal.ImageUtils;
import com.google.mlkit.vision.face.Face;
import com.google.mlkit.vision.face.FaceDetectorOptions;
import com.google.mlkit.vision.face.internal.zzh;
import com.google.mlkit.vision.face.internal.zzj;
import java.util.ArrayList;
import java.util.List;

/* renamed from: ga2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C20059ga2 implements InterfaceC17272Ad2 {

    /* renamed from: a */
    public final Context f62196a;

    /* renamed from: b */
    public final FaceDetectorOptions f62197b;

    /* renamed from: c */
    public boolean f62198c;

    /* renamed from: d */
    public boolean f62199d;

    /* renamed from: e */
    public boolean f62200e;

    /* renamed from: f */
    public final zzoc f62201f;

    /* renamed from: g */
    public zzoy f62202g;

    /* renamed from: h */
    public zzoy f62203h;

    public C20059ga2(Context context, FaceDetectorOptions faceDetectorOptions, zzoc zzocVar) {
        this.f62196a = context;
        this.f62197b = faceDetectorOptions;
        this.f62201f = zzocVar;
    }

    /* renamed from: b */
    public static boolean m31087b(Context context) {
        if (DynamiteModule.getLocalVersion(context, "com.google.mlkit.dynamite.face") > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public static List m31083f(zzoy zzoyVar, InputImage inputImage) {
        if (inputImage.getFormat() == -1) {
            inputImage = InputImage.fromByteBuffer(ImageConvertUtils.getInstance().convertToNv21Buffer(inputImage, false), inputImage.getWidth(), inputImage.getHeight(), inputImage.getRotationDegrees(), 17);
        }
        try {
            List<zzow> zzd = zzoyVar.zzd(ImageUtils.getInstance().getImageDataWrapper(inputImage), new zzoq(inputImage.getFormat(), inputImage.getWidth(), inputImage.getHeight(), CommonConvertUtils.convertToMVRotation(inputImage.getRotationDegrees()), SystemClock.elapsedRealtime()));
            ArrayList arrayList = new ArrayList();
            for (zzow zzowVar : zzd) {
                arrayList.add(new Face(zzowVar, inputImage.getCoordinatesMatrix()));
            }
            return arrayList;
        } catch (RemoteException e) {
            throw new MlKitException("Failed to run face detector.", 13, e);
        }
    }

    @Override // p000.InterfaceC17272Ad2
    /* renamed from: a */
    public final Pair mo31088a(InputImage inputImage) {
        List list;
        if (this.f62203h == null && this.f62202g == null) {
            zzd();
        }
        if (!this.f62198c) {
            try {
                zzoy zzoyVar = this.f62203h;
                if (zzoyVar != null) {
                    zzoyVar.zze();
                }
                zzoy zzoyVar2 = this.f62202g;
                if (zzoyVar2 != null) {
                    zzoyVar2.zze();
                }
                this.f62198c = true;
            } catch (RemoteException e) {
                throw new MlKitException("Failed to init face detector.", 13, e);
            }
        }
        zzoy zzoyVar3 = this.f62203h;
        List list2 = null;
        if (zzoyVar3 != null) {
            list = m31083f(zzoyVar3, inputImage);
            if (!this.f62197b.zzg()) {
                zzh.m37178e(list);
            }
        } else {
            list = null;
        }
        zzoy zzoyVar4 = this.f62202g;
        if (zzoyVar4 != null) {
            list2 = m31083f(zzoyVar4, inputImage);
            zzh.m37178e(list2);
        }
        return new Pair(list, list2);
    }

    /* renamed from: c */
    public final zzoy m31086c(DynamiteModule.VersionPolicy versionPolicy, String str, String str2, zzou zzouVar) {
        return zzpa.zza(DynamiteModule.load(this.f62196a, versionPolicy, str).instantiate(str2)).zzd(ObjectWrapper.wrap(this.f62196a), zzouVar);
    }

    /* renamed from: d */
    public final void m31085d() {
        if (this.f62197b.zzc() == 2) {
            if (this.f62202g == null) {
                this.f62202g = m31084e(new zzou(this.f62197b.zze(), 1, 1, 2, false, this.f62197b.zza()));
            }
            if ((this.f62197b.zzd() == 2 || this.f62197b.zzb() == 2 || this.f62197b.zze() == 2) && this.f62203h == null) {
                this.f62203h = m31084e(new zzou(this.f62197b.zze(), this.f62197b.zzd(), this.f62197b.zzb(), 1, this.f62197b.zzg(), this.f62197b.zza()));
            }
        } else if (this.f62203h == null) {
            this.f62203h = m31084e(new zzou(this.f62197b.zze(), this.f62197b.zzd(), this.f62197b.zzb(), 1, this.f62197b.zzg(), this.f62197b.zza()));
        }
    }

    /* renamed from: e */
    public final zzoy m31084e(zzou zzouVar) {
        if (this.f62199d) {
            return m31086c(DynamiteModule.PREFER_LOCAL, "com.google.mlkit.dynamite.face", "com.google.mlkit.vision.face.bundled.internal.ThickFaceDetectorCreator", zzouVar);
        }
        return m31086c(DynamiteModule.PREFER_REMOTE, OptionalModuleUtils.FACE_MODULE_ID, "com.google.android.gms.vision.face.mlkit.FaceDetectorCreator", zzouVar);
    }

    @Override // p000.InterfaceC17272Ad2
    public final void zzb() {
        try {
            zzoy zzoyVar = this.f62203h;
            if (zzoyVar != null) {
                zzoyVar.zzf();
                this.f62203h = null;
            }
            zzoy zzoyVar2 = this.f62202g;
            if (zzoyVar2 != null) {
                zzoyVar2.zzf();
                this.f62202g = null;
            }
        } catch (RemoteException unused) {
        }
        this.f62198c = false;
    }

    @Override // p000.InterfaceC17272Ad2
    public final boolean zzd() {
        if (this.f62203h == null && this.f62202g == null) {
            if (DynamiteModule.getLocalVersion(this.f62196a, "com.google.mlkit.dynamite.face") > 0) {
                this.f62199d = true;
                try {
                    m31085d();
                } catch (RemoteException e) {
                    throw new MlKitException("Failed to create thick face detector.", 13, e);
                } catch (DynamiteModule.LoadingException e2) {
                    throw new MlKitException("Failed to load the bundled face module.", 13, e2);
                }
            } else {
                this.f62199d = false;
                try {
                    m31085d();
                } catch (RemoteException e3) {
                    zzj.zzc(this.f62201f, this.f62199d, zzks.OPTIONAL_MODULE_INIT_ERROR);
                    throw new MlKitException("Failed to create thin face detector.", 13, e3);
                } catch (DynamiteModule.LoadingException e4) {
                    if (!this.f62200e) {
                        OptionalModuleUtils.requestDownload(this.f62196a, OptionalModuleUtils.FACE);
                        this.f62200e = true;
                    }
                    zzj.zzc(this.f62201f, this.f62199d, zzks.OPTIONAL_MODULE_NOT_AVAILABLE);
                    throw new MlKitException("Waiting for the face module to be downloaded. Please wait.", 14, e4);
                }
            }
            zzj.zzc(this.f62201f, this.f62199d, zzks.NO_ERROR);
            return this.f62199d;
        }
        return this.f62199d;
    }
}
