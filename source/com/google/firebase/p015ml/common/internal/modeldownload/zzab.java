package com.google.firebase.p015ml.common.internal.modeldownload;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.GmsLogger;
import com.google.android.gms.internal.firebase_ml.zzqn;
import com.google.android.gms.internal.firebase_ml.zzrc;
import com.google.firebase.p015ml.common.FirebaseMLException;
import com.google.firebase.p015ml.common.modeldownload.FirebaseRemoteModel;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.io.File;

/* renamed from: com.google.firebase.ml.common.internal.modeldownload.zzab */
/* loaded from: classes4.dex */
public final class zzab {

    /* renamed from: i */
    public static final GmsLogger f55736i = new GmsLogger("RemoteModelFileManager", "");

    /* renamed from: a */
    public final zzqn f55737a;

    /* renamed from: b */
    public final String f55738b;

    /* renamed from: c */
    public final FirebaseRemoteModel f55739c;

    /* renamed from: d */
    public final zzn f55740d;

    /* renamed from: e */
    public final zzaj f55741e;

    /* renamed from: f */
    public final zzk f55742f;

    /* renamed from: g */
    public final zzrc f55743g;

    /* renamed from: h */
    public final zzi f55744h;

    public zzab(@NonNull zzqn zzqnVar, @NonNull FirebaseRemoteModel firebaseRemoteModel, @NonNull zzp zzpVar, @NonNull zzn zznVar, @NonNull zzi zziVar) {
        String uniqueModelNameForPersist;
        this.f55737a = zzqnVar;
        this.f55739c = firebaseRemoteModel;
        if (zznVar == zzn.TRANSLATE) {
            uniqueModelNameForPersist = firebaseRemoteModel.getModelNameForBackend();
        } else {
            uniqueModelNameForPersist = firebaseRemoteModel.getUniqueModelNameForPersist();
        }
        this.f55738b = uniqueModelNameForPersist;
        this.f55740d = zznVar;
        this.f55741e = new zzaj(zzpVar);
        this.f55743g = zzrc.zzb(zzqnVar);
        this.f55744h = zziVar;
        int i = AbstractC22642vb2.f107722a[zznVar.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3 && i != 4) {
                    throw new IllegalArgumentException("Unexpected model type");
                }
                this.f55742f = new C21438ob2(zzqnVar, uniqueModelNameForPersist);
                return;
            }
            this.f55742f = new C17650Gb2(zzqnVar, uniqueModelNameForPersist);
            return;
        }
        this.f55742f = new zza(zzqnVar, uniqueModelNameForPersist);
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00bc, code lost:
        r9 = com.google.firebase.p015ml.common.internal.modeldownload.zzab.f55736i;
        r10 = java.lang.String.valueOf(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00ca, code lost:
        if (r10.length() == 0) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00cc, code lost:
        r10 = "Hash does not match with expected: ".concat(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00d1, code lost:
        r10 = new java.lang.String("Hash does not match with expected: ");
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00d6, code lost:
        r9.m48408d("RemoteModelFileManager", r10);
        r11.zza(com.google.android.gms.internal.firebase_ml.zzoa.MODEL_HASH_MISMATCH, true, r8.f55740d, com.google.android.gms.internal.firebase_ml.zznq.zzak.zzb.SUCCEEDED);
        r9 = new com.google.firebase.p015ml.common.FirebaseMLException("Hash does not match with expected", 102);
     */
    @androidx.annotation.Nullable
    @androidx.annotation.WorkerThread
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized java.io.File zza(@androidx.annotation.NonNull android.os.ParcelFileDescriptor r9, @androidx.annotation.NonNull java.lang.String r10, @androidx.annotation.NonNull com.google.firebase.p015ml.common.internal.modeldownload.zzy r11) throws com.google.firebase.p015ml.common.FirebaseMLException {
        /*
            Method dump skipped, instructions count: 421
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.p015ml.common.internal.modeldownload.zzab.zza(android.os.ParcelFileDescriptor, java.lang.String, com.google.firebase.ml.common.internal.modeldownload.zzy):java.io.File");
    }

    @WorkerThread
    public final synchronized boolean zzd(@NonNull File file) throws FirebaseMLException {
        File[] listFiles;
        File m38390c = this.f55744h.m38390c(this.f55738b, this.f55740d);
        if (!m38390c.exists()) {
            return false;
        }
        boolean z = true;
        for (File file2 : m38390c.listFiles()) {
            if (!file2.equals(file) && !this.f55744h.m38389d(file2)) {
                z = false;
            }
        }
        return z;
    }

    @WorkerThread
    public final synchronized void zze(@NonNull File file) {
        File zzb = this.f55744h.zzb(this.f55738b, this.f55740d, false);
        if (!zzb.exists()) {
            return;
        }
        for (File file2 : zzb.listFiles()) {
            if (file2.equals(file)) {
                this.f55744h.m38389d(file);
                return;
            }
        }
    }

    @WorkerThread
    public final synchronized File zzf(@NonNull File file) throws FirebaseMLException {
        File file2 = new File(String.valueOf(this.f55744h.m38390c(this.f55738b, this.f55740d).getAbsolutePath()).concat("/0"));
        if (file2.exists()) {
            return file;
        }
        if (file.renameTo(file2)) {
            return file2;
        }
        return file;
    }

    @Nullable
    @WorkerThread
    public final synchronized String zzpv() throws FirebaseMLException {
        File m38390c = this.f55744h.m38390c(this.f55738b, this.f55740d);
        int m38391b = zzi.m38391b(m38390c);
        if (m38391b < 0) {
            return null;
        }
        String absolutePath = m38390c.getAbsolutePath();
        StringBuilder sb = new StringBuilder(String.valueOf(absolutePath).length() + 12);
        sb.append(absolutePath);
        sb.append(RemoteSettings.FORWARD_SLASH_STRING);
        sb.append(m38391b);
        return sb.toString();
    }
}
