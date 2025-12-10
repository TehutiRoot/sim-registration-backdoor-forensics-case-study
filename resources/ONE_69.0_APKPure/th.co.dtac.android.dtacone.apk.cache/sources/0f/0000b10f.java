package com.google.firebase.p015ml.common.internal.modeldownload;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.GmsLogger;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.firebase_ml.zzoa;
import com.google.firebase.p015ml.common.FirebaseMLException;
import java.nio.MappedByteBuffer;
import java.util.ArrayList;
import java.util.List;

@WorkerThread
/* renamed from: com.google.firebase.ml.common.internal.modeldownload.zzj */
/* loaded from: classes4.dex */
public class zzj {

    /* renamed from: c */
    public static final GmsLogger f55785c = new GmsLogger("ModelLoader", "");

    /* renamed from: a */
    public final zzai f55786a;

    /* renamed from: b */
    public final zzl f55787b;
    @Nullable
    @VisibleForTesting
    public final zzf zzbns;
    protected int zzbnu = zzo.zzbob;

    public zzj(@Nullable zzai zzaiVar, @Nullable zzf zzfVar, @NonNull zzl zzlVar) {
        boolean z;
        if (zzaiVar == null && zzfVar == null) {
            z = false;
        } else {
            z = true;
        }
        Preconditions.checkArgument(z, "At least one of RemoteModelLoader or LocalModelLoader must be non-null.");
        Preconditions.checkNotNull(zzlVar);
        this.f55786a = zzaiVar;
        this.zzbns = zzfVar;
        this.f55787b = zzlVar;
    }

    /* renamed from: a */
    public final synchronized boolean m38379a(zzm zzmVar, List list) {
        zzai zzaiVar = this.f55786a;
        if (zzaiVar != null) {
            try {
                MappedByteBuffer load = zzaiVar.load();
                if (load != null) {
                    try {
                        zzmVar.zza(load);
                        f55785c.m48405d("ModelLoader", "Remote model source is loaded successfully");
                        return true;
                    } catch (RuntimeException e) {
                        list.add(zzoa.REMOTE_MODEL_INVALID);
                        throw e;
                    }
                }
                f55785c.m48405d("ModelLoader", "Remote model source can NOT be loaded, try local model.");
                list.add(zzoa.REMOTE_MODEL_LOADER_LOADS_NO_MODEL);
            } catch (FirebaseMLException e2) {
                f55785c.m48405d("ModelLoader", "Remote model source can NOT be loaded, try local model.");
                list.add(zzoa.REMOTE_MODEL_LOADER_ERROR);
                throw e2;
            }
        }
        return false;
    }

    /* renamed from: b */
    public final synchronized boolean m38378b(zzm zzmVar, List list) {
        MappedByteBuffer load;
        zzf zzfVar = this.zzbns;
        if (zzfVar != null && (load = zzfVar.load()) != null) {
            try {
                zzmVar.zza(load);
                f55785c.m48405d("ModelLoader", "Local model source is loaded successfully");
                return true;
            } catch (RuntimeException e) {
                list.add(zzoa.LOCAL_MODEL_INVALID);
                throw e;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0038  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String m38377c() {
        /*
            r5 = this;
            com.google.firebase.ml.common.internal.modeldownload.zzf r0 = r5.zzbns
            if (r0 == 0) goto L30
            com.google.firebase.ml.common.modeldownload.FirebaseLocalModel r0 = r0.zzpe()
            java.lang.String r0 = r0.getAssetFilePath()
            if (r0 == 0) goto L19
            com.google.firebase.ml.common.internal.modeldownload.zzf r0 = r5.zzbns
            com.google.firebase.ml.common.modeldownload.FirebaseLocalModel r0 = r0.zzpe()
            java.lang.String r0 = r0.getAssetFilePath()
            goto L31
        L19:
            com.google.firebase.ml.common.internal.modeldownload.zzf r0 = r5.zzbns
            com.google.firebase.ml.common.modeldownload.FirebaseLocalModel r0 = r0.zzpe()
            java.lang.String r0 = r0.getFilePath()
            if (r0 == 0) goto L30
            com.google.firebase.ml.common.internal.modeldownload.zzf r0 = r5.zzbns
            com.google.firebase.ml.common.modeldownload.FirebaseLocalModel r0 = r0.zzpe()
            java.lang.String r0 = r0.getFilePath()
            goto L31
        L30:
            r0 = 0
        L31:
            com.google.firebase.ml.common.internal.modeldownload.zzai r1 = r5.f55786a
            if (r1 != 0) goto L38
            java.lang.String r1 = "unspecified"
            goto L40
        L38:
            com.google.firebase.ml.common.modeldownload.FirebaseRemoteModel r1 = r1.zzpy()
            java.lang.String r1 = r1.getUniqueModelNameForPersist()
        L40:
            java.lang.String r2 = "Local model path: %s. Remote model name: %s. "
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = 0
            r3[r4] = r0
            r0 = 1
            r3[r0] = r1
            java.lang.String r0 = java.lang.String.format(r2, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.p015ml.common.internal.modeldownload.zzj.m38377c():java.lang.String");
    }

    public final synchronized void zza(zzm zzmVar) throws FirebaseMLException {
        Exception exc;
        boolean z;
        String str;
        String str2;
        String str3;
        ArrayList arrayList = new ArrayList();
        boolean z2 = false;
        Exception e = null;
        try {
            z = m38379a(zzmVar, arrayList);
            exc = null;
        } catch (Exception e2) {
            exc = e2;
            z = false;
        }
        if (z) {
            this.f55787b.zze(arrayList);
            this.zzbnu = zzo.zzboc;
            return;
        }
        try {
            z2 = m38378b(zzmVar, arrayList);
        } catch (Exception e3) {
            e = e3;
        }
        if (z2) {
            this.f55787b.zze(arrayList);
            this.zzbnu = zzo.zzbod;
            return;
        }
        arrayList.add(zzoa.NO_VALID_MODEL);
        this.f55787b.zze(arrayList);
        this.zzbnu = zzo.zzbob;
        if (exc != null) {
            String valueOf = String.valueOf(m38377c());
            if (valueOf.length() != 0) {
                str3 = "Remote model load failed with the model options: ".concat(valueOf);
            } else {
                str3 = new String("Remote model load failed with the model options: ");
            }
            throw new FirebaseMLException(str3, 14, exc);
        } else if (e != null) {
            String valueOf2 = String.valueOf(m38377c());
            if (valueOf2.length() != 0) {
                str2 = "Local model load failed with the model options: ".concat(valueOf2);
            } else {
                str2 = new String("Local model load failed with the model options: ");
            }
            throw new FirebaseMLException(str2, 14, e);
        } else {
            String valueOf3 = String.valueOf(m38377c());
            if (valueOf3.length() != 0) {
                str = "Cannot load any model with the model options: ".concat(valueOf3);
            } else {
                str = new String("Cannot load any model with the model options: ");
            }
            throw new FirebaseMLException(str, 14);
        }
    }

    public final synchronized boolean zzpf() {
        if (this.zzbnu == zzo.zzboc) {
            return true;
        }
        return false;
    }
}