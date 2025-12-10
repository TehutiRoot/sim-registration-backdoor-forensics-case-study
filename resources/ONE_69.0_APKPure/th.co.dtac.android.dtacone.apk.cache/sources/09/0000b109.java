package com.google.firebase.p015ml.common.internal.modeldownload;

import android.os.ParcelFileDescriptor;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.GmsLogger;
import com.google.android.gms.internal.firebase_ml.zznq;
import com.google.android.gms.internal.firebase_ml.zzoa;
import com.google.android.gms.internal.firebase_ml.zzqn;
import com.google.android.gms.internal.firebase_ml.zzrc;
import com.google.firebase.p015ml.common.FirebaseMLException;
import com.google.firebase.p015ml.common.modeldownload.FirebaseRemoteModel;
import java.io.File;
import java.nio.MappedByteBuffer;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.firebase.ml.common.internal.modeldownload.zzai */
/* loaded from: classes4.dex */
public final class zzai {

    /* renamed from: i */
    public static final GmsLogger f55762i = new GmsLogger("RemoteModelLoader", "");

    /* renamed from: j */
    public static final Map f55763j = new HashMap();

    /* renamed from: a */
    public final zzqn f55764a;

    /* renamed from: b */
    public final FirebaseRemoteModel f55765b;

    /* renamed from: c */
    public final zzx f55766c;

    /* renamed from: d */
    public final zzab f55767d;

    /* renamed from: e */
    public final zzy f55768e;

    /* renamed from: f */
    public final zzah f55769f;

    /* renamed from: g */
    public final zzn f55770g;

    /* renamed from: h */
    public boolean f55771h = true;

    public zzai(zzqn zzqnVar, FirebaseRemoteModel firebaseRemoteModel, zzp zzpVar, zzah zzahVar, zzn zznVar) {
        this.f55767d = new zzab(zzqnVar, firebaseRemoteModel, zzpVar, zznVar, new zzi(zzqnVar));
        zzy zzyVar = new zzy(zzqnVar, firebaseRemoteModel);
        this.f55768e = zzyVar;
        this.f55766c = zzx.zza(zzqnVar, firebaseRemoteModel, new zzg(zzqnVar), zzyVar);
        this.f55769f = zzahVar;
        this.f55764a = zzqnVar;
        this.f55765b = firebaseRemoteModel;
        this.f55770g = zznVar;
    }

    public static synchronized zzai zza(@NonNull zzqn zzqnVar, @NonNull FirebaseRemoteModel firebaseRemoteModel, @NonNull zzp zzpVar, zzah zzahVar, zzn zznVar) {
        zzai zzaiVar;
        synchronized (zzai.class) {
            try {
                String uniqueModelNameForPersist = firebaseRemoteModel.getUniqueModelNameForPersist();
                Map map = f55763j;
                if (!map.containsKey(uniqueModelNameForPersist)) {
                    map.put(uniqueModelNameForPersist, new zzai(zzqnVar, firebaseRemoteModel, zzpVar, zzahVar, zznVar));
                }
                zzaiVar = (zzai) map.get(uniqueModelNameForPersist);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzaiVar;
    }

    /* renamed from: a */
    public final MappedByteBuffer m38391a(boolean z) {
        zzx zzxVar;
        String str;
        Long m38362m = this.f55766c.m38362m();
        String m38361n = this.f55766c.m38361n();
        if (m38362m != null && m38361n != null) {
            Integer m38359p = this.f55766c.m38359p();
            if (m38359p == null) {
                return null;
            }
            GmsLogger gmsLogger = f55762i;
            String valueOf = String.valueOf(m38359p);
            StringBuilder sb = new StringBuilder(valueOf.length() + 22);
            sb.append("Download Status code: ");
            sb.append(valueOf);
            gmsLogger.m48405d("RemoteModelLoader", sb.toString());
            if (m38359p.intValue() == 8) {
                gmsLogger.m48405d("RemoteModelLoader", "Model downloaded successfully");
                this.f55768e.zza(zzoa.NO_ERROR, true, this.f55770g, zznq.zzak.zzb.SUCCEEDED);
                ParcelFileDescriptor m38358q = this.f55766c.m38358q();
                if (m38358q == null) {
                    return null;
                }
                gmsLogger.m48405d("RemoteModelLoader", "moving downloaded model from external storage to private folder.");
                try {
                    File zza = this.f55767d.zza(m38358q, m38361n, this.f55768e);
                    if (zza == null) {
                        return null;
                    }
                    MappedByteBuffer m38389c = m38389c(zza);
                    String valueOf2 = String.valueOf(zza.getParent());
                    if (valueOf2.length() != 0) {
                        str = "Moved the downloaded model to private folder successfully: ".concat(valueOf2);
                    } else {
                        str = new String("Moved the downloaded model to private folder successfully: ");
                    }
                    gmsLogger.m48405d("RemoteModelLoader", str);
                    this.f55766c.m38363l(m38361n, this.f55770g);
                    if (z && this.f55767d.zzd(zza)) {
                        gmsLogger.m48405d("RemoteModelLoader", "All old models are deleted.");
                        return m38389c(this.f55767d.zzf(zza));
                    }
                    return m38389c;
                } finally {
                    this.f55766c.m38360o();
                }
            }
            if (m38359p.intValue() == 16) {
                this.f55768e.zza(false, this.f55770g, this.f55766c.m38374a(m38362m));
            }
            return null;
        }
        f55762i.m48405d("RemoteModelLoader", "No new model is downloading.");
        return null;
    }

    /* renamed from: b */
    public final MappedByteBuffer m38390b(String str) {
        return this.f55769f.zzbz(str);
    }

    /* renamed from: c */
    public final MappedByteBuffer m38389c(File file) {
        try {
            return m38390b(file.getAbsolutePath());
        } catch (Exception e) {
            this.f55767d.zze(file);
            throw new FirebaseMLException("Failed to load newly downloaded model.", 14, e);
        }
    }

    /* renamed from: d */
    public final MappedByteBuffer m38388d() {
        String zzpv = this.f55767d.zzpv();
        if (zzpv == null) {
            f55762i.m48405d("RemoteModelLoader", "No existing model file");
            return null;
        }
        try {
            return m38390b(zzpv);
        } catch (Exception e) {
            this.f55767d.zze(new File(zzpv));
            zzrc.zzb(this.f55764a).zzi(this.f55765b);
            throw new FirebaseMLException("Failed to load an already downloaded model.", 14, e);
        }
    }

    @Nullable
    @WorkerThread
    public final synchronized MappedByteBuffer load() throws FirebaseMLException {
        MappedByteBuffer m38391a;
        GmsLogger gmsLogger = f55762i;
        gmsLogger.m48405d("RemoteModelLoader", "Try to load newly downloaded model file.");
        m38391a = m38391a(this.f55771h);
        if (m38391a == null) {
            gmsLogger.m48405d("RemoteModelLoader", "Loading existing model file.");
            m38391a = m38388d();
        }
        return m38391a;
    }

    public final FirebaseRemoteModel zzpy() {
        return this.f55765b;
    }
}