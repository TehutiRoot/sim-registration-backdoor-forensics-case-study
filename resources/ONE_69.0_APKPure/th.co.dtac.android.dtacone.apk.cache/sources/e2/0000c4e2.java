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

/* renamed from: db2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C19596db2 implements InterfaceC23065xe2 {

    /* renamed from: a */
    public final Context f61297a;

    /* renamed from: b */
    public final FaceDetectorOptions f61298b;

    /* renamed from: c */
    public boolean f61299c;

    /* renamed from: d */
    public boolean f61300d;

    /* renamed from: e */
    public boolean f61301e;

    /* renamed from: f */
    public final zzoc f61302f;

    /* renamed from: g */
    public zzoy f61303g;

    /* renamed from: h */
    public zzoy f61304h;

    public C19596db2(Context context, FaceDetectorOptions faceDetectorOptions, zzoc zzocVar) {
        this.f61297a = context;
        this.f61298b = faceDetectorOptions;
        this.f61302f = zzocVar;
    }

    /* renamed from: b */
    public static boolean m31801b(Context context) {
        if (DynamiteModule.getLocalVersion(context, "com.google.mlkit.dynamite.face") > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public static List m31797f(zzoy zzoyVar, InputImage inputImage) {
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

    @Override // p000.InterfaceC23065xe2
    /* renamed from: a */
    public final Pair mo494a(InputImage inputImage) {
        List list;
        if (this.f61304h == null && this.f61303g == null) {
            zzd();
        }
        if (!this.f61299c) {
            try {
                zzoy zzoyVar = this.f61304h;
                if (zzoyVar != null) {
                    zzoyVar.zze();
                }
                zzoy zzoyVar2 = this.f61303g;
                if (zzoyVar2 != null) {
                    zzoyVar2.zze();
                }
                this.f61299c = true;
            } catch (RemoteException e) {
                throw new MlKitException("Failed to init face detector.", 13, e);
            }
        }
        zzoy zzoyVar3 = this.f61304h;
        List list2 = null;
        if (zzoyVar3 != null) {
            list = m31797f(zzoyVar3, inputImage);
            if (!this.f61298b.zzg()) {
                zzh.m37170e(list);
            }
        } else {
            list = null;
        }
        zzoy zzoyVar4 = this.f61303g;
        if (zzoyVar4 != null) {
            list2 = m31797f(zzoyVar4, inputImage);
            zzh.m37170e(list2);
        }
        return new Pair(list, list2);
    }

    /* renamed from: c */
    public final zzoy m31800c(DynamiteModule.VersionPolicy versionPolicy, String str, String str2, zzou zzouVar) {
        return zzpa.zza(DynamiteModule.load(this.f61297a, versionPolicy, str).instantiate(str2)).zzd(ObjectWrapper.wrap(this.f61297a), zzouVar);
    }

    /* renamed from: d */
    public final void m31799d() {
        if (this.f61298b.zzc() == 2) {
            if (this.f61303g == null) {
                this.f61303g = m31798e(new zzou(this.f61298b.zze(), 1, 1, 2, false, this.f61298b.zza()));
            }
            if ((this.f61298b.zzd() == 2 || this.f61298b.zzb() == 2 || this.f61298b.zze() == 2) && this.f61304h == null) {
                this.f61304h = m31798e(new zzou(this.f61298b.zze(), this.f61298b.zzd(), this.f61298b.zzb(), 1, this.f61298b.zzg(), this.f61298b.zza()));
            }
        } else if (this.f61304h == null) {
            this.f61304h = m31798e(new zzou(this.f61298b.zze(), this.f61298b.zzd(), this.f61298b.zzb(), 1, this.f61298b.zzg(), this.f61298b.zza()));
        }
    }

    /* renamed from: e */
    public final zzoy m31798e(zzou zzouVar) {
        if (this.f61300d) {
            return m31800c(DynamiteModule.PREFER_LOCAL, "com.google.mlkit.dynamite.face", "com.google.mlkit.vision.face.bundled.internal.ThickFaceDetectorCreator", zzouVar);
        }
        return m31800c(DynamiteModule.PREFER_REMOTE, OptionalModuleUtils.FACE_MODULE_ID, "com.google.android.gms.vision.face.mlkit.FaceDetectorCreator", zzouVar);
    }

    @Override // p000.InterfaceC23065xe2
    public final void zzb() {
        try {
            zzoy zzoyVar = this.f61304h;
            if (zzoyVar != null) {
                zzoyVar.zzf();
                this.f61304h = null;
            }
            zzoy zzoyVar2 = this.f61303g;
            if (zzoyVar2 != null) {
                zzoyVar2.zzf();
                this.f61303g = null;
            }
        } catch (RemoteException unused) {
        }
        this.f61299c = false;
    }

    @Override // p000.InterfaceC23065xe2
    public final boolean zzd() {
        if (this.f61304h == null && this.f61303g == null) {
            if (DynamiteModule.getLocalVersion(this.f61297a, "com.google.mlkit.dynamite.face") > 0) {
                this.f61300d = true;
                try {
                    m31799d();
                } catch (RemoteException e) {
                    throw new MlKitException("Failed to create thick face detector.", 13, e);
                } catch (DynamiteModule.LoadingException e2) {
                    throw new MlKitException("Failed to load the bundled face module.", 13, e2);
                }
            } else {
                this.f61300d = false;
                try {
                    m31799d();
                } catch (RemoteException e3) {
                    zzj.zzc(this.f61302f, this.f61300d, zzks.OPTIONAL_MODULE_INIT_ERROR);
                    throw new MlKitException("Failed to create thin face detector.", 13, e3);
                } catch (DynamiteModule.LoadingException e4) {
                    if (!this.f61301e) {
                        OptionalModuleUtils.requestDownload(this.f61297a, OptionalModuleUtils.FACE);
                        this.f61301e = true;
                    }
                    zzj.zzc(this.f61302f, this.f61300d, zzks.OPTIONAL_MODULE_NOT_AVAILABLE);
                    throw new MlKitException("Waiting for the face module to be downloaded. Please wait.", 14, e4);
                }
            }
            zzj.zzc(this.f61302f, this.f61300d, zzks.NO_ERROR);
            return this.f61300d;
        }
        return this.f61300d;
    }
}