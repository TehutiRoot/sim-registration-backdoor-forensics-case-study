package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.os.Parcel;
import android.os.SystemClock;
import androidx.annotation.WorkerThread;

/* loaded from: classes3.dex */
public final class zzeh extends AbstractC19410cn2 {

    /* renamed from: b */
    public final C6720b f48296b;

    /* renamed from: c */
    public boolean f48297c;

    public zzeh(zzfy zzfyVar) {
        super(zzfyVar);
        Context zzau = this.zzs.zzau();
        this.zzs.zzf();
        this.f48296b = new C6720b(this, zzau, "google_app_measurement_local.db");
    }

    /* renamed from: b */
    public final SQLiteDatabase m46324b() {
        if (this.f48297c) {
            return null;
        }
        SQLiteDatabase writableDatabase = this.f48296b.getWritableDatabase();
        if (writableDatabase == null) {
            this.f48297c = true;
            return null;
        }
        return writableDatabase;
    }

    /* renamed from: c */
    public final boolean m46323c() {
        Context zzau = this.zzs.zzau();
        this.zzs.zzf();
        return zzau.getDatabasePath("google_app_measurement_local.db").exists();
    }

    /* JADX WARN: Removed duplicated region for block: B:80:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0135  */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m46322d(int r17, byte[] r18) {
        /*
            Method dump skipped, instructions count: 330
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzeh.m46322d(int, byte[]):boolean");
    }

    @Override // p000.AbstractC19410cn2
    public final boolean zzf() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:145:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0214 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:199:0x01fa A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0266 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0266 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0266 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List zzi(int r23) {
        /*
            Method dump skipped, instructions count: 646
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzeh.zzi(int):java.util.List");
    }

    @WorkerThread
    public final void zzj() {
        int delete;
        zzg();
        try {
            SQLiteDatabase m46324b = m46324b();
            if (m46324b != null && (delete = m46324b.delete("messages", null, null)) > 0) {
                this.zzs.zzay().zzj().zzb("Reset local analytics data. records", Integer.valueOf(delete));
            }
        } catch (SQLiteException e) {
            this.zzs.zzay().zzd().zzb("Error resetting local analytics data. error", e);
        }
    }

    @WorkerThread
    public final boolean zzk() {
        return m46322d(3, new byte[0]);
    }

    @WorkerThread
    public final boolean zzm() {
        zzg();
        if (!this.f48297c && m46323c()) {
            int i = 5;
            for (int i2 = 0; i2 < 5; i2++) {
                SQLiteDatabase sQLiteDatabase = null;
                try {
                    try {
                        try {
                            SQLiteDatabase m46324b = m46324b();
                            if (m46324b == null) {
                                this.f48297c = true;
                                return false;
                            }
                            m46324b.beginTransaction();
                            m46324b.delete("messages", "type == ?", new String[]{Integer.toString(3)});
                            m46324b.setTransactionSuccessful();
                            m46324b.endTransaction();
                            m46324b.close();
                            return true;
                        } catch (SQLiteFullException e) {
                            this.zzs.zzay().zzd().zzb("Error deleting app launch break from local database", e);
                            this.f48297c = true;
                            if (0 == 0) {
                            }
                            sQLiteDatabase.close();
                        }
                    } catch (SQLiteDatabaseLockedException unused) {
                        SystemClock.sleep(i);
                        i += 20;
                        if (0 == 0) {
                        }
                        sQLiteDatabase.close();
                    }
                } catch (SQLiteException e2) {
                    if (0 != 0) {
                        try {
                            if (sQLiteDatabase.inTransaction()) {
                                sQLiteDatabase.endTransaction();
                            }
                        } catch (Throwable th2) {
                            if (0 != 0) {
                                sQLiteDatabase.close();
                            }
                            throw th2;
                        }
                    }
                    this.zzs.zzay().zzd().zzb("Error deleting app launch break from local database", e2);
                    this.f48297c = true;
                    if (0 != 0) {
                        sQLiteDatabase.close();
                    }
                }
            }
            this.zzs.zzay().zzk().zza("Error deleting app launch break from local database in reasonable time");
        }
        return false;
    }

    public final boolean zzn(zzac zzacVar) {
        byte[] m46126D = this.zzs.zzv().m46126D(zzacVar);
        if (m46126D.length > 131072) {
            this.zzs.zzay().zzh().zza("Conditional user property too long for local database. Sending directly to service");
            return false;
        }
        return m46322d(2, m46126D);
    }

    public final boolean zzo(zzaw zzawVar) {
        Parcel obtain = Parcel.obtain();
        zzax.m46340a(zzawVar, obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        if (marshall.length > 131072) {
            this.zzs.zzay().zzh().zza("Event is too long for local database. Sending event directly to service");
            return false;
        }
        return m46322d(0, marshall);
    }

    public final boolean zzp(zzlc zzlcVar) {
        Parcel obtain = Parcel.obtain();
        zzld.m46130a(zzlcVar, obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        if (marshall.length > 131072) {
            this.zzs.zzay().zzh().zza("User property too long for local database. Sending directly to service");
            return false;
        }
        return m46322d(1, marshall);
    }
}
