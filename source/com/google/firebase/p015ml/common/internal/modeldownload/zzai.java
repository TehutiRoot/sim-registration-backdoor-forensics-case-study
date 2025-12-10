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
    public static final GmsLogger f55750i = new GmsLogger("RemoteModelLoader", "");

    /* renamed from: j */
    public static final Map f55751j = new HashMap();

    /* renamed from: a */
    public final zzqn f55752a;

    /* renamed from: b */
    public final FirebaseRemoteModel f55753b;

    /* renamed from: c */
    public final zzx f55754c;

    /* renamed from: d */
    public final zzab f55755d;

    /* renamed from: e */
    public final zzy f55756e;

    /* renamed from: f */
    public final zzah f55757f;

    /* renamed from: g */
    public final zzn f55758g;

    /* renamed from: h */
    public boolean f55759h = true;

    public zzai(zzqn zzqnVar, FirebaseRemoteModel firebaseRemoteModel, zzp zzpVar, zzah zzahVar, zzn zznVar) {
        this.f55755d = new zzab(zzqnVar, firebaseRemoteModel, zzpVar, zznVar, new zzi(zzqnVar));
        zzy zzyVar = new zzy(zzqnVar, firebaseRemoteModel);
        this.f55756e = zzyVar;
        this.f55754c = zzx.zza(zzqnVar, firebaseRemoteModel, new zzg(zzqnVar), zzyVar);
        this.f55757f = zzahVar;
        this.f55752a = zzqnVar;
        this.f55753b = firebaseRemoteModel;
        this.f55758g = zznVar;
    }

    public static synchronized zzai zza(@NonNull zzqn zzqnVar, @NonNull FirebaseRemoteModel firebaseRemoteModel, @NonNull zzp zzpVar, zzah zzahVar, zzn zznVar) {
        zzai zzaiVar;
        synchronized (zzai.class) {
            try {
                String uniqueModelNameForPersist = firebaseRemoteModel.getUniqueModelNameForPersist();
                Map map = f55751j;
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
    public final MappedByteBuffer m38399a(boolean z) {
        zzx zzxVar;
        String str;
        Long m38370m = this.f55754c.m38370m();
        String m38369n = this.f55754c.m38369n();
        if (m38370m != null && m38369n != null) {
            Integer m38367p = this.f55754c.m38367p();
            if (m38367p == null) {
                return null;
            }
            GmsLogger gmsLogger = f55750i;
            String valueOf = String.valueOf(m38367p);
            StringBuilder sb = new StringBuilder(valueOf.length() + 22);
            sb.append("Download Status code: ");
            sb.append(valueOf);
            gmsLogger.m48408d("RemoteModelLoader", sb.toString());
            if (m38367p.intValue() == 8) {
                gmsLogger.m48408d("RemoteModelLoader", "Model downloaded successfully");
                this.f55756e.zza(zzoa.NO_ERROR, true, this.f55758g, zznq.zzak.zzb.SUCCEEDED);
                ParcelFileDescriptor m38366q = this.f55754c.m38366q();
                if (m38366q == null) {
                    return null;
                }
                gmsLogger.m48408d("RemoteModelLoader", "moving downloaded model from external storage to private folder.");
                try {
                    File zza = this.f55755d.zza(m38366q, m38369n, this.f55756e);
                    if (zza == null) {
                        return null;
                    }
                    MappedByteBuffer m38397c = m38397c(zza);
                    String valueOf2 = String.valueOf(zza.getParent());
                    if (valueOf2.length() != 0) {
                        str = "Moved the downloaded model to private folder successfully: ".concat(valueOf2);
                    } else {
                        str = new String("Moved the downloaded model to private folder successfully: ");
                    }
                    gmsLogger.m48408d("RemoteModelLoader", str);
                    this.f55754c.m38371l(m38369n, this.f55758g);
                    if (z && this.f55755d.zzd(zza)) {
                        gmsLogger.m48408d("RemoteModelLoader", "All old models are deleted.");
                        return m38397c(this.f55755d.zzf(zza));
                    }
                    return m38397c;
                } finally {
                    this.f55754c.m38368o();
                }
            }
            if (m38367p.intValue() == 16) {
                this.f55756e.zza(false, this.f55758g, this.f55754c.m38382a(m38370m));
            }
            return null;
        }
        f55750i.m48408d("RemoteModelLoader", "No new model is downloading.");
        return null;
    }

    /* renamed from: b */
    public final MappedByteBuffer m38398b(String str) {
        return this.f55757f.zzbz(str);
    }

    /* renamed from: c */
    public final MappedByteBuffer m38397c(File file) {
        try {
            return m38398b(file.getAbsolutePath());
        } catch (Exception e) {
            this.f55755d.zze(file);
            throw new FirebaseMLException("Failed to load newly downloaded model.", 14, e);
        }
    }

    /* renamed from: d */
    public final MappedByteBuffer m38396d() {
        String zzpv = this.f55755d.zzpv();
        if (zzpv == null) {
            f55750i.m48408d("RemoteModelLoader", "No existing model file");
            return null;
        }
        try {
            return m38398b(zzpv);
        } catch (Exception e) {
            this.f55755d.zze(new File(zzpv));
            zzrc.zzb(this.f55752a).zzi(this.f55753b);
            throw new FirebaseMLException("Failed to load an already downloaded model.", 14, e);
        }
    }

    @Nullable
    @WorkerThread
    public final synchronized MappedByteBuffer load() throws FirebaseMLException {
        MappedByteBuffer m38399a;
        GmsLogger gmsLogger = f55750i;
        gmsLogger.m48408d("RemoteModelLoader", "Try to load newly downloaded model file.");
        m38399a = m38399a(this.f55759h);
        if (m38399a == null) {
            gmsLogger.m48408d("RemoteModelLoader", "Loading existing model file.");
            m38399a = m38396d();
        }
        return m38399a;
    }

    public final FirebaseRemoteModel zzpy() {
        return this.f55753b;
    }
}
