package com.google.firebase.p015ml.common.internal.modeldownload;

import android.app.DownloadManager;
import android.content.IntentFilter;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.util.LongSparseArray;
import androidx.annotation.NonNull;
import androidx.annotation.WorkerThread;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.common.internal.GmsLogger;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.firebase_ml.zznq;
import com.google.android.gms.internal.firebase_ml.zzoa;
import com.google.android.gms.internal.firebase_ml.zzqb;
import com.google.android.gms.internal.firebase_ml.zzqf;
import com.google.android.gms.internal.firebase_ml.zzqn;
import com.google.android.gms.internal.firebase_ml.zzrc;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.p015ml.common.FirebaseMLException;
import com.google.firebase.p015ml.common.modeldownload.FirebaseModelDownloadConditions;
import com.google.firebase.p015ml.common.modeldownload.FirebaseRemoteModel;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.firebase.ml.common.internal.modeldownload.zzx */
/* loaded from: classes4.dex */
public final class zzx {

    /* renamed from: j */
    public static final GmsLogger f55781j = new GmsLogger("ModelDownloadManager", "");

    /* renamed from: k */
    public static final Map f55782k = new HashMap();

    /* renamed from: a */
    public final LongSparseArray f55783a = new LongSparseArray();

    /* renamed from: b */
    public final LongSparseArray f55784b = new LongSparseArray();

    /* renamed from: c */
    public final zzqn f55785c;

    /* renamed from: d */
    public final DownloadManager f55786d;

    /* renamed from: e */
    public final FirebaseRemoteModel f55787e;

    /* renamed from: f */
    public final zzy f55788f;

    /* renamed from: g */
    public final zzrc f55789g;

    /* renamed from: h */
    public final zzg f55790h;

    /* renamed from: i */
    public FirebaseModelDownloadConditions f55791i;

    public zzx(zzqn zzqnVar, FirebaseRemoteModel firebaseRemoteModel, zzg zzgVar, zzy zzyVar) {
        this.f55785c = zzqnVar;
        this.f55787e = firebaseRemoteModel;
        DownloadManager downloadManager = (DownloadManager) zzqnVar.getApplicationContext().getSystemService("download");
        this.f55786d = downloadManager;
        if (downloadManager == null) {
            f55781j.m48408d("ModelDownloadManager", "Download manager service is not available in the service.");
        }
        this.f55790h = zzgVar;
        this.f55788f = zzyVar;
        this.f55789g = zzrc.zzb(zzqnVar);
    }

    /* renamed from: h */
    public static boolean m38375h(Integer num) {
        if (num != null) {
            if (num.intValue() == 8 || num.intValue() == 16) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static synchronized zzx zza(@NonNull zzqn zzqnVar, @NonNull FirebaseRemoteModel firebaseRemoteModel, @NonNull zzg zzgVar, @NonNull zzy zzyVar) {
        zzx zzxVar;
        synchronized (zzx.class) {
            try {
                String uniqueModelNameForPersist = firebaseRemoteModel.getUniqueModelNameForPersist();
                Map map = f55782k;
                if (!map.containsKey(uniqueModelNameForPersist)) {
                    map.put(uniqueModelNameForPersist, new zzx(zzqnVar, firebaseRemoteModel, zzgVar, zzyVar));
                }
                zzxVar = (zzx) map.get(uniqueModelNameForPersist);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzxVar;
    }

    /* renamed from: a */
    public final int m38382a(Long l) {
        Cursor cursor;
        int columnIndex;
        DownloadManager downloadManager = this.f55786d;
        if (downloadManager != null && l != null) {
            cursor = downloadManager.query(new DownloadManager.Query().setFilterById(l.longValue()));
        } else {
            cursor = null;
        }
        if (cursor == null || !cursor.moveToFirst() || (columnIndex = cursor.getColumnIndex("reason")) == -1) {
            return 0;
        }
        return cursor.getInt(columnIndex);
    }

    /* renamed from: d */
    public final synchronized Long m38379d(DownloadManager.Request request, zzac zzacVar) {
        DownloadManager downloadManager = this.f55786d;
        if (downloadManager == null) {
            return null;
        }
        long enqueue = downloadManager.enqueue(request);
        GmsLogger gmsLogger = f55781j;
        StringBuilder sb = new StringBuilder(53);
        sb.append("Schedule a new downloading task: ");
        sb.append(enqueue);
        gmsLogger.m48408d("ModelDownloadManager", sb.toString());
        this.f55789g.zza(enqueue, zzacVar);
        this.f55788f.zza(zzoa.NO_ERROR, false, zzacVar.zzpx(), zznq.zzak.zzb.SCHEDULED);
        return Long.valueOf(enqueue);
    }

    /* renamed from: e */
    public final synchronized Long m38378e(zzac zzacVar, FirebaseModelDownloadConditions firebaseModelDownloadConditions) {
        Uri uri;
        String str;
        try {
            Preconditions.checkNotNull(firebaseModelDownloadConditions, "DownloadConditions can not be null");
            String zzb = this.f55789g.zzb(this.f55787e);
            Integer m38367p = m38367p();
            if (zzb != null) {
                str = zzacVar.f55747c;
                if (zzb.equals(str) && m38367p != null) {
                    if (!m38375h(m38367p())) {
                        this.f55788f.zza(zzoa.NO_ERROR, false, m38363t(), zznq.zzak.zzb.DOWNLOADING);
                    }
                    f55781j.m48408d("ModelDownloadManager", "New model is already in downloading, do nothing.");
                    return null;
                }
            }
            GmsLogger gmsLogger = f55781j;
            gmsLogger.m48408d("ModelDownloadManager", "Need to download a new model.");
            m38368o();
            uri = zzacVar.f55746b;
            DownloadManager.Request request = new DownloadManager.Request(uri);
            request.setDestinationUri(null);
            if (this.f55790h.zza(zzacVar)) {
                gmsLogger.m48408d("ModelDownloadManager", "Model update is enabled and have a previous downloaded model, use download condition");
                this.f55788f.zza(zzoa.NO_ERROR, false, zzacVar.zzpx(), zznq.zzak.zzb.UPDATE_AVAILABLE);
            }
            if (Build.VERSION.SDK_INT >= 24) {
                request.setRequiresCharging(firebaseModelDownloadConditions.isChargingRequired());
                request.setRequiresDeviceIdle(firebaseModelDownloadConditions.isDeviceIdleRequired());
            }
            if (firebaseModelDownloadConditions.isWifiRequired()) {
                request.setAllowedNetworkTypes(2);
            }
            return m38379d(request, zzacVar);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* renamed from: g */
    public final FirebaseMLException m38376g(Long l) {
        Cursor cursor;
        String str;
        DownloadManager downloadManager = this.f55786d;
        if (downloadManager != null && l != null) {
            cursor = downloadManager.query(new DownloadManager.Query().setFilterById(l.longValue()));
        } else {
            cursor = null;
        }
        int i = 13;
        if (cursor != null && cursor.moveToFirst()) {
            int i2 = cursor.getInt(cursor.getColumnIndex("reason"));
            if (i2 == 1006) {
                str = "Model downloading failed due to insufficient space on the device.";
                i = 101;
            } else {
                StringBuilder sb = new StringBuilder(84);
                sb.append("Model downloading failed due to error code: ");
                sb.append(i2);
                sb.append(" from Android DownloadManager");
                str = sb.toString();
            }
        } else {
            str = "Model downloading failed";
        }
        return new FirebaseMLException(str, i);
    }

    /* renamed from: l */
    public final synchronized void m38371l(String str, zzn zznVar) {
        this.f55789g.zza(this.f55787e, str, zznVar);
        m38368o();
    }

    /* renamed from: m */
    public final synchronized Long m38370m() {
        return this.f55789g.zza(this.f55787e);
    }

    /* renamed from: n */
    public final synchronized String m38369n() {
        return this.f55789g.zzb(this.f55787e);
    }

    /* renamed from: o */
    public final synchronized void m38368o() {
        try {
            Long m38370m = m38370m();
            if (this.f55786d != null && m38370m != null) {
                GmsLogger gmsLogger = f55781j;
                String valueOf = String.valueOf(m38370m);
                StringBuilder sb = new StringBuilder(valueOf.length() + 44);
                sb.append("Cancel or remove existing downloading task: ");
                sb.append(valueOf);
                gmsLogger.m48408d("ModelDownloadManager", sb.toString());
                if (this.f55786d.remove(m38370m.longValue()) <= 0) {
                    if (m38367p() == null) {
                    }
                }
                this.f55790h.zza(this.f55787e.getUniqueModelNameForPersist(), m38363t());
                this.f55789g.zzh(this.f55787e);
            }
        } finally {
        }
    }

    /* renamed from: p */
    public final synchronized Integer m38367p() {
        Integer num;
        Long m38370m = m38370m();
        DownloadManager downloadManager = this.f55786d;
        Integer num2 = null;
        if (downloadManager != null && m38370m != null) {
            Cursor query = downloadManager.query(new DownloadManager.Query().setFilterById(m38370m.longValue()));
            if (query != null && query.moveToFirst()) {
                num = Integer.valueOf(query.getInt(query.getColumnIndex(NotificationCompat.CATEGORY_STATUS)));
            } else {
                num = null;
            }
            if (num == null) {
                if (query != null) {
                    query.close();
                }
                return null;
            }
            if (num.intValue() == 2 || num.intValue() == 4 || num.intValue() == 1 || num.intValue() == 8 || num.intValue() == 16) {
                num2 = num;
            }
            if (query != null) {
                query.close();
            }
            return num2;
        }
        return null;
    }

    /* renamed from: q */
    public final synchronized ParcelFileDescriptor m38366q() {
        Long m38370m = m38370m();
        DownloadManager downloadManager = this.f55786d;
        ParcelFileDescriptor parcelFileDescriptor = null;
        if (downloadManager == null || m38370m == null) {
            return null;
        }
        try {
            parcelFileDescriptor = downloadManager.openDownloadedFile(m38370m.longValue());
        } catch (FileNotFoundException unused) {
            f55781j.m48406e("ModelDownloadManager", "Downloaded file is not found");
        }
        return parcelFileDescriptor;
    }

    /* renamed from: r */
    public final synchronized zzac m38365r() {
        String str;
        String str2;
        try {
            boolean m38364s = m38364s();
            boolean z = false;
            if (m38364s) {
                this.f55788f.zza(zzoa.NO_ERROR, false, this.f55789g.zzd(this.f55787e), zznq.zzak.zzb.LIVE);
            }
            zzac m38401a = zzaf.m38401a(this.f55785c, this.f55787e, this.f55788f);
            if (m38401a == null) {
                return null;
            }
            zzqn zzqnVar = this.f55785c;
            FirebaseRemoteModel firebaseRemoteModel = this.f55787e;
            str = m38401a.f55747c;
            zzrc zzb = zzrc.zzb(zzqnVar);
            if (str.equals(zzb.zze(firebaseRemoteModel)) && zzqb.zzb(zzqnVar.getApplicationContext()).equals(zzb.zzpc())) {
                f55781j.m48406e("ModelDownloadManager", "The model is incompatible with TFLite and the app is not upgraded, do not download");
            } else {
                z = true;
            }
            if (!m38364s) {
                this.f55789g.zzi(this.f55787e);
            }
            zzqn zzqnVar2 = this.f55785c;
            FirebaseRemoteModel firebaseRemoteModel2 = this.f55787e;
            str2 = m38401a.f55747c;
            boolean z2 = !str2.equals(zzrc.zzb(zzqnVar2).zzc(firebaseRemoteModel2));
            if (z && (!m38364s || z2)) {
                return m38401a;
            }
            if (m38364s && (z2 ^ z)) {
                return null;
            }
            String modelName = this.f55787e.getModelName();
            StringBuilder sb = new StringBuilder(String.valueOf(modelName).length() + 46);
            sb.append("The model ");
            sb.append(modelName);
            sb.append(" is incompatible with TFLite runtime");
            throw new FirebaseMLException(sb.toString(), 100);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* renamed from: s */
    public final boolean m38364s() {
        return this.f55790h.zzb(this.f55787e.getUniqueModelNameForPersist(), this.f55789g.zzd(this.f55787e));
    }

    /* renamed from: t */
    public final zzn m38363t() {
        String zzb = this.f55789g.zzb(this.f55787e);
        if (zzb == null) {
            return zzn.UNKNOWN;
        }
        return this.f55789g.zzbw(zzb);
    }

    /* renamed from: v */
    public final synchronized GL2 m38361v(long j) {
        GL2 gl2;
        gl2 = (GL2) this.f55783a.get(j);
        if (gl2 == null) {
            gl2 = new GL2(this, j, m38360w(j));
            this.f55783a.put(j, gl2);
        }
        return gl2;
    }

    /* renamed from: w */
    public final synchronized TaskCompletionSource m38360w(long j) {
        TaskCompletionSource taskCompletionSource;
        taskCompletionSource = (TaskCompletionSource) this.f55784b.get(j);
        if (taskCompletionSource == null) {
            taskCompletionSource = new TaskCompletionSource();
            this.f55784b.put(j, taskCompletionSource);
        }
        return taskCompletionSource;
    }

    /* renamed from: x */
    public final Task m38359x(long j) {
        this.f55785c.getApplicationContext().registerReceiver(m38361v(j), new IntentFilter("android.intent.action.DOWNLOAD_COMPLETE"), null, zzqf.zzoq().getHandler());
        return m38360w(j).getTask();
    }

    @WorkerThread
    public final boolean zzpq() throws FirebaseMLException {
        try {
            if (!m38364s()) {
                if (!Objects.equal(m38367p(), 8)) {
                    return false;
                }
                return true;
            }
            return true;
        } catch (FirebaseMLException e) {
            throw new FirebaseMLException("Failed to check if the model is downloaded.", 13, e);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0088, code lost:
        r1 = m38378e(r1, r9.f55791i);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x008e, code lost:
        if (r1 == null) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0098, code lost:
        return m38359x(r1.longValue());
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0099, code lost:
        com.google.firebase.p015ml.common.internal.modeldownload.zzx.f55781j.m48404i("ModelDownloadManager", "Didn't schedule download for the updated model");
     */
    @androidx.annotation.WorkerThread
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.tasks.Task<java.lang.Void> zzpr() {
        /*
            r9 = this;
            com.google.firebase.ml.common.internal.modeldownload.zzy r0 = r9.f55788f
            com.google.android.gms.internal.firebase_ml.zzoa r1 = com.google.android.gms.internal.firebase_ml.zzoa.NO_ERROR
            com.google.firebase.ml.common.internal.modeldownload.zzn r2 = com.google.firebase.p015ml.common.internal.modeldownload.zzn.UNKNOWN
            com.google.android.gms.internal.firebase_ml.zznq$zzak$zzb r3 = com.google.android.gms.internal.firebase_ml.zznq.zzak.zzb.EXPLICITLY_REQUESTED
            r4 = 0
            r0.zza(r1, r4, r2, r3)
            r0 = 0
            com.google.firebase.ml.common.internal.modeldownload.zzac r1 = r9.m38365r()     // Catch: com.google.firebase.p015ml.common.FirebaseMLException -> L13
            r2 = r0
            goto L16
        L13:
            r1 = move-exception
            r2 = r1
            r1 = r0
        L16:
            r3 = 13
            java.lang.Integer r5 = r9.m38367p()     // Catch: com.google.firebase.p015ml.common.FirebaseMLException -> L45
            java.lang.Long r6 = r9.m38370m()     // Catch: com.google.firebase.p015ml.common.FirebaseMLException -> L45
            boolean r7 = r9.m38364s()     // Catch: com.google.firebase.p015ml.common.FirebaseMLException -> L45
            if (r7 != 0) goto L86
            boolean r7 = m38375h(r5)     // Catch: com.google.firebase.p015ml.common.FirebaseMLException -> L45
            if (r7 == 0) goto L2d
            goto L86
        L2d:
            if (r5 == 0) goto L66
            int r7 = r5.intValue()     // Catch: com.google.firebase.p015ml.common.FirebaseMLException -> L45
            r8 = 4
            if (r7 == r8) goto L48
            int r7 = r5.intValue()     // Catch: com.google.firebase.p015ml.common.FirebaseMLException -> L45
            r8 = 2
            if (r7 == r8) goto L48
            int r5 = r5.intValue()     // Catch: com.google.firebase.p015ml.common.FirebaseMLException -> L45
            r7 = 1
            if (r5 != r7) goto L66
            goto L48
        L45:
            r0 = move-exception
            goto Lbd
        L48:
            if (r6 == 0) goto L66
            java.lang.String r5 = r9.m38369n()     // Catch: com.google.firebase.p015ml.common.FirebaseMLException -> L45
            if (r5 == 0) goto L66
            com.google.firebase.ml.common.internal.modeldownload.zzy r0 = r9.f55788f     // Catch: com.google.firebase.p015ml.common.FirebaseMLException -> L45
            com.google.android.gms.internal.firebase_ml.zzoa r1 = com.google.android.gms.internal.firebase_ml.zzoa.NO_ERROR     // Catch: com.google.firebase.p015ml.common.FirebaseMLException -> L45
            com.google.firebase.ml.common.internal.modeldownload.zzn r2 = r9.m38363t()     // Catch: com.google.firebase.p015ml.common.FirebaseMLException -> L45
            com.google.android.gms.internal.firebase_ml.zznq$zzak$zzb r5 = com.google.android.gms.internal.firebase_ml.zznq.zzak.zzb.DOWNLOADING     // Catch: com.google.firebase.p015ml.common.FirebaseMLException -> L45
            r0.zza(r1, r4, r2, r5)     // Catch: com.google.firebase.p015ml.common.FirebaseMLException -> L45
            long r0 = r6.longValue()     // Catch: com.google.firebase.p015ml.common.FirebaseMLException -> L45
            com.google.android.gms.tasks.Task r0 = r9.m38359x(r0)     // Catch: com.google.firebase.p015ml.common.FirebaseMLException -> L45
            return r0
        L66:
            if (r1 != 0) goto L69
            goto L6f
        L69:
            com.google.firebase.ml.common.modeldownload.FirebaseModelDownloadConditions r0 = r9.f55791i     // Catch: com.google.firebase.p015ml.common.FirebaseMLException -> L45
            java.lang.Long r0 = r9.m38378e(r1, r0)     // Catch: com.google.firebase.p015ml.common.FirebaseMLException -> L45
        L6f:
            if (r0 != 0) goto L7d
            com.google.firebase.ml.common.FirebaseMLException r0 = new com.google.firebase.ml.common.FirebaseMLException     // Catch: com.google.firebase.p015ml.common.FirebaseMLException -> L45
            java.lang.String r1 = "Failed to schedule the download task"
            r0.<init>(r1, r3, r2)     // Catch: com.google.firebase.p015ml.common.FirebaseMLException -> L45
            com.google.android.gms.tasks.Task r0 = com.google.android.gms.tasks.Tasks.forException(r0)     // Catch: com.google.firebase.p015ml.common.FirebaseMLException -> L45
            return r0
        L7d:
            long r0 = r0.longValue()     // Catch: com.google.firebase.p015ml.common.FirebaseMLException -> L45
            com.google.android.gms.tasks.Task r0 = r9.m38359x(r0)     // Catch: com.google.firebase.p015ml.common.FirebaseMLException -> L45
            return r0
        L86:
            if (r1 == 0) goto La2
            com.google.firebase.ml.common.modeldownload.FirebaseModelDownloadConditions r2 = r9.f55791i     // Catch: com.google.firebase.p015ml.common.FirebaseMLException -> L45
            java.lang.Long r1 = r9.m38378e(r1, r2)     // Catch: com.google.firebase.p015ml.common.FirebaseMLException -> L45
            if (r1 == 0) goto L99
            long r0 = r1.longValue()     // Catch: com.google.firebase.p015ml.common.FirebaseMLException -> L45
            com.google.android.gms.tasks.Task r0 = r9.m38359x(r0)     // Catch: com.google.firebase.p015ml.common.FirebaseMLException -> L45
            return r0
        L99:
            com.google.android.gms.common.internal.GmsLogger r1 = com.google.firebase.p015ml.common.internal.modeldownload.zzx.f55781j     // Catch: com.google.firebase.p015ml.common.FirebaseMLException -> L45
            java.lang.String r2 = "ModelDownloadManager"
            java.lang.String r4 = "Didn't schedule download for the updated model"
            r1.m48404i(r2, r4)     // Catch: com.google.firebase.p015ml.common.FirebaseMLException -> L45
        La2:
            if (r5 == 0) goto Lb8
            int r1 = r5.intValue()     // Catch: com.google.firebase.p015ml.common.FirebaseMLException -> L45
            r2 = 16
            if (r1 != r2) goto Lb8
            com.google.firebase.ml.common.FirebaseMLException r0 = r9.m38376g(r6)     // Catch: com.google.firebase.p015ml.common.FirebaseMLException -> L45
            r9.m38368o()     // Catch: com.google.firebase.p015ml.common.FirebaseMLException -> L45
            com.google.android.gms.tasks.Task r0 = com.google.android.gms.tasks.Tasks.forException(r0)     // Catch: com.google.firebase.p015ml.common.FirebaseMLException -> L45
            return r0
        Lb8:
            com.google.android.gms.tasks.Task r0 = com.google.android.gms.tasks.Tasks.forResult(r0)     // Catch: com.google.firebase.p015ml.common.FirebaseMLException -> L45
            return r0
        Lbd:
            com.google.firebase.ml.common.FirebaseMLException r1 = new com.google.firebase.ml.common.FirebaseMLException
            java.lang.String r2 = "Failed to ensure the model is downloaded."
            r1.<init>(r2, r3, r0)
            com.google.android.gms.tasks.Task r0 = com.google.android.gms.tasks.Tasks.forException(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.p015ml.common.internal.modeldownload.zzx.zzpr():com.google.android.gms.tasks.Task");
    }

    public final void zza(@NonNull FirebaseModelDownloadConditions firebaseModelDownloadConditions) {
        Preconditions.checkNotNull(firebaseModelDownloadConditions, "DownloadConditions can not be null");
        this.f55791i = firebaseModelDownloadConditions;
    }
}
