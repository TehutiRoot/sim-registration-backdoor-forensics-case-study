package p000;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzfr;
import com.google.android.gms.internal.measurement.zzfs;
import com.google.android.gms.internal.measurement.zzgb;
import com.google.android.gms.internal.measurement.zzgc;
import com.google.android.gms.internal.measurement.zzns;
import com.google.android.gms.internal.measurement.zzoz;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.gms.measurement.internal.C6718a;
import com.google.android.gms.measurement.internal.zzac;
import com.google.android.gms.measurement.internal.zzag;
import com.google.android.gms.measurement.internal.zzak;
import com.google.android.gms.measurement.internal.zzeb;
import com.google.android.gms.measurement.internal.zzeo;
import com.google.android.gms.measurement.internal.zzkz;
import com.google.android.gms.measurement.internal.zzlb;
import com.google.android.gms.measurement.internal.zzlh;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.slf4j.Marker;

/* renamed from: Zb2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C18866Zb2 extends RC2 {

    /* renamed from: d */
    public static final String[] f8066d = {"last_bundled_timestamp", "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;", "last_bundled_day", "ALTER TABLE events ADD COLUMN last_bundled_day INTEGER;", "last_sampled_complex_event_id", "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;", "last_sampling_rate", "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;", "last_exempt_from_sampling", "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;", "current_session_count", "ALTER TABLE events ADD COLUMN current_session_count INTEGER;"};

    /* renamed from: e */
    public static final String[] f8067e = {"origin", "ALTER TABLE user_attributes ADD COLUMN origin TEXT;"};

    /* renamed from: f */
    public static final String[] f8068f = {"app_version", "ALTER TABLE apps ADD COLUMN app_version TEXT;", "app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;", "gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;", "dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;", "measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;", "last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;", "day", "ALTER TABLE apps ADD COLUMN day INTEGER;", "daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;", "daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;", "daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;", "remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;", "config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;", "failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;", "app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;", "firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;", "daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;", "daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;", "health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;", "android_id", "ALTER TABLE apps ADD COLUMN android_id INTEGER;", "adid_reporting_enabled", "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;", "ssaid_reporting_enabled", "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;", "admob_app_id", "ALTER TABLE apps ADD COLUMN admob_app_id TEXT;", "linked_admob_app_id", "ALTER TABLE apps ADD COLUMN linked_admob_app_id TEXT;", "dynamite_version", "ALTER TABLE apps ADD COLUMN dynamite_version INTEGER;", "safelisted_events", "ALTER TABLE apps ADD COLUMN safelisted_events TEXT;", "ga_app_id", "ALTER TABLE apps ADD COLUMN ga_app_id TEXT;", "config_last_modified_time", "ALTER TABLE apps ADD COLUMN config_last_modified_time TEXT;", "e_tag", "ALTER TABLE apps ADD COLUMN e_tag TEXT;", "session_stitching_token", "ALTER TABLE apps ADD COLUMN session_stitching_token TEXT;"};

    /* renamed from: g */
    public static final String[] f8069g = {"realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;"};

    /* renamed from: h */
    public static final String[] f8070h = {"has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;", "retry_count", "ALTER TABLE queue ADD COLUMN retry_count INTEGER;"};

    /* renamed from: i */
    public static final String[] f8071i = {"session_scoped", "ALTER TABLE event_filters ADD COLUMN session_scoped BOOLEAN;"};

    /* renamed from: j */
    public static final String[] f8072j = {"session_scoped", "ALTER TABLE property_filters ADD COLUMN session_scoped BOOLEAN;"};

    /* renamed from: k */
    public static final String[] f8073k = {"previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;"};

    /* renamed from: b */
    public final C6718a f8074b;

    /* renamed from: c */
    public final DC2 f8075c;

    public C18866Zb2(zzkz zzkzVar) {
        super(zzkzVar);
        this.f8075c = new DC2(this.zzs.zzav());
        this.zzs.zzf();
        this.f8074b = new C6718a(this, this.zzs.zzau(), "google_app_measurement.db");
    }

    /* renamed from: v */
    public static final void m65173v(ContentValues contentValues, String str, Object obj) {
        Preconditions.checkNotEmpty("value");
        Preconditions.checkNotNull(obj);
        if (obj instanceof String) {
            contentValues.put("value", (String) obj);
        } else if (obj instanceof Long) {
            contentValues.put("value", (Long) obj);
        } else if (obj instanceof Double) {
            contentValues.put("value", (Double) obj);
        } else {
            throw new IllegalArgumentException("Invalid value type");
        }
    }

    /* renamed from: A */
    public final long m65212A() {
        return m65170y("select max(bundle_end_timestamp) from queue", null, 0L);
    }

    /* renamed from: B */
    public final long m65211B() {
        return m65170y("select max(timestamp) from raw_events", null, 0L);
    }

    /* renamed from: C */
    public final long m65210C(String str) {
        Preconditions.checkNotEmpty(str);
        return m65170y("select count(1) from events where app_id=? and name not like '!_%' escape '!'", new String[]{str}, 0L);
    }

    /* renamed from: D */
    public final SQLiteDatabase m65209D() {
        zzg();
        try {
            return this.f8074b.getWritableDatabase();
        } catch (SQLiteException e) {
            this.zzs.zzay().zzk().zzb("Error opening database", e);
            throw e;
        }
    }

    /* JADX WARN: Not initialized variable reg: 1, insn: 0x00bf: MOVE  (r0 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]), block:B:38:0x00bf */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00dc  */
    /* renamed from: E */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.os.Bundle m65208E(java.lang.String r8) {
        /*
            r7 = this;
            r7.zzg()
            r7.zzW()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r7.m65209D()     // Catch: java.lang.Throwable -> Lc1 android.database.sqlite.SQLiteException -> Lc3
            java.lang.String[] r2 = new java.lang.String[]{r8}     // Catch: java.lang.Throwable -> Lc1 android.database.sqlite.SQLiteException -> Lc3
            java.lang.String r3 = "select parameters from default_event_params where app_id=?"
            android.database.Cursor r1 = r1.rawQuery(r3, r2)     // Catch: java.lang.Throwable -> Lc1 android.database.sqlite.SQLiteException -> Lc3
            boolean r2 = r1.moveToFirst()     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L31
            if (r2 != 0) goto L34
            com.google.android.gms.measurement.internal.zzfy r8 = r7.zzs     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L31
            com.google.android.gms.measurement.internal.zzeo r8 = r8.zzay()     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L31
            com.google.android.gms.measurement.internal.zzem r8 = r8.zzj()     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L31
            java.lang.String r2 = "Default event parameters not found"
            r8.zza(r2)     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L31
            r1.close()
            return r0
        L2e:
            r8 = move-exception
            goto Lbf
        L31:
            r8 = move-exception
            goto Lc5
        L34:
            r2 = 0
            byte[] r2 = r1.getBlob(r2)     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L31
            com.google.android.gms.internal.measurement.zzfr r3 = com.google.android.gms.internal.measurement.zzfs.zze()     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L31 java.io.IOException -> La7
            com.google.android.gms.internal.measurement.zzlk r2 = com.google.android.gms.measurement.internal.zzlb.m46139r(r3, r2)     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L31 java.io.IOException -> La7
            com.google.android.gms.internal.measurement.zzfr r2 = (com.google.android.gms.internal.measurement.zzfr) r2     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L31 java.io.IOException -> La7
            com.google.android.gms.internal.measurement.zzke r2 = r2.zzaE()     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L31 java.io.IOException -> La7
            com.google.android.gms.internal.measurement.zzfs r2 = (com.google.android.gms.internal.measurement.zzfs) r2     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L31 java.io.IOException -> La7
            com.google.android.gms.measurement.internal.zzkz r8 = r7.zzf     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L31
            r8.zzu()     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L31
            java.util.List r8 = r2.zzi()     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L31
            android.os.Bundle r2 = new android.os.Bundle     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L31
            r2.<init>()     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L31
            java.util.Iterator r8 = r8.iterator()     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L31
        L5b:
            boolean r3 = r8.hasNext()     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L31
            if (r3 == 0) goto La3
            java.lang.Object r3 = r8.next()     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L31
            com.google.android.gms.internal.measurement.zzfw r3 = (com.google.android.gms.internal.measurement.zzfw) r3     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L31
            java.lang.String r4 = r3.zzg()     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L31
            boolean r5 = r3.zzu()     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L31
            if (r5 == 0) goto L79
            double r5 = r3.zza()     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L31
            r2.putDouble(r4, r5)     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L31
            goto L5b
        L79:
            boolean r5 = r3.zzv()     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L31
            if (r5 == 0) goto L87
            float r3 = r3.zzb()     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L31
            r2.putFloat(r4, r3)     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L31
            goto L5b
        L87:
            boolean r5 = r3.zzy()     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L31
            if (r5 == 0) goto L95
            java.lang.String r3 = r3.zzh()     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L31
            r2.putString(r4, r3)     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L31
            goto L5b
        L95:
            boolean r5 = r3.zzw()     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L31
            if (r5 == 0) goto L5b
            long r5 = r3.zzd()     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L31
            r2.putLong(r4, r5)     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L31
            goto L5b
        La3:
            r1.close()
            return r2
        La7:
            r2 = move-exception
            com.google.android.gms.measurement.internal.zzfy r3 = r7.zzs     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L31
            com.google.android.gms.measurement.internal.zzeo r3 = r3.zzay()     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L31
            com.google.android.gms.measurement.internal.zzem r3 = r3.zzd()     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L31
            java.lang.String r4 = "Failed to retrieve default event parameters. appId"
            java.lang.Object r8 = com.google.android.gms.measurement.internal.zzeo.zzn(r8)     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L31
            r3.zzc(r4, r8, r2)     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L31
            r1.close()
            return r0
        Lbf:
            r0 = r1
            goto Lda
        Lc1:
            r8 = move-exception
            goto Lda
        Lc3:
            r8 = move-exception
            r1 = r0
        Lc5:
            com.google.android.gms.measurement.internal.zzfy r2 = r7.zzs     // Catch: java.lang.Throwable -> L2e
            com.google.android.gms.measurement.internal.zzeo r2 = r2.zzay()     // Catch: java.lang.Throwable -> L2e
            com.google.android.gms.measurement.internal.zzem r2 = r2.zzd()     // Catch: java.lang.Throwable -> L2e
            java.lang.String r3 = "Error selecting default event parameters"
            r2.zzb(r3, r8)     // Catch: java.lang.Throwable -> L2e
            if (r1 == 0) goto Ld9
            r1.close()
        Ld9:
            return r0
        Lda:
            if (r0 == 0) goto Ldf
            r0.close()
        Ldf:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C18866Zb2.m65208E(java.lang.String):android.os.Bundle");
    }

    /* renamed from: F */
    public final C19256bt2 m65207F(String str) {
        Cursor cursor;
        boolean z;
        long j;
        long j2;
        Preconditions.checkNotEmpty(str);
        zzg();
        zzW();
        Cursor cursor2 = null;
        try {
            cursor = m65209D().query("apps", new String[]{"app_instance_id", "gmp_app_id", "resettable_device_id_hash", "last_bundle_index", "last_bundle_start_timestamp", "last_bundle_end_timestamp", "app_version", "app_store", "gmp_version", "dev_cert_hash", "measurement_enabled", "day", "daily_public_events_count", "daily_events_count", "daily_conversions_count", "config_fetched_time", "failed_config_fetch_time", "app_version_int", "firebase_instance_id", "daily_error_events_count", "daily_realtime_events_count", "health_monitor_sample", "android_id", "adid_reporting_enabled", "admob_app_id", "dynamite_version", "safelisted_events", "ga_app_id", "session_stitching_token"}, "app_id=?", new String[]{str}, null, null, null);
            try {
                try {
                    if (!cursor.moveToFirst()) {
                        cursor.close();
                        return null;
                    }
                    try {
                        C19256bt2 c19256bt2 = new C19256bt2(this.zzf.m46191O(), str);
                        boolean z2 = false;
                        c19256bt2.m51760h(cursor.getString(0));
                        c19256bt2.m51742w(cursor.getString(1));
                        c19256bt2.m51795F(cursor.getString(2));
                        c19256bt2.m51799B(cursor.getLong(3));
                        c19256bt2.m51798C(cursor.getLong(4));
                        c19256bt2.m51739z(cursor.getLong(5));
                        c19256bt2.m51756j(cursor.getString(6));
                        c19256bt2.m51758i(cursor.getString(7));
                        c19256bt2.m51741x(cursor.getLong(8));
                        c19256bt2.m51746s(cursor.getLong(9));
                        if (cursor.isNull(10) || cursor.getInt(10) != 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        c19256bt2.m51797D(z);
                        c19256bt2.m51747r(cursor.getLong(11));
                        c19256bt2.m51749p(cursor.getLong(12));
                        c19256bt2.m51750o(cursor.getLong(13));
                        c19256bt2.m51752m(cursor.getLong(14));
                        c19256bt2.m51753l(cursor.getLong(15));
                        c19256bt2.m51744u(cursor.getLong(16));
                        if (cursor.isNull(17)) {
                            j = -2147483648L;
                        } else {
                            j = cursor.getInt(17);
                        }
                        c19256bt2.m51754k(j);
                        c19256bt2.m51743v(cursor.getString(18));
                        c19256bt2.m51751n(cursor.getLong(19));
                        c19256bt2.m51748q(cursor.getLong(20));
                        c19256bt2.m51740y(cursor.getString(21));
                        c19256bt2.m51762g((cursor.isNull(23) || cursor.getInt(23) != 0) ? true : true);
                        c19256bt2.m51764f(cursor.getString(24));
                        if (cursor.isNull(25)) {
                            j2 = 0;
                        } else {
                            j2 = cursor.getLong(25);
                        }
                        c19256bt2.m51745t(j2);
                        if (!cursor.isNull(26)) {
                            c19256bt2.m51794G(Arrays.asList(cursor.getString(26).split(",", -1)));
                        }
                        zzoz.zzc();
                        if (this.zzs.zzf().zzs(null, zzeb.zzar)) {
                            c19256bt2.m51793H(cursor.getString(28));
                        }
                        c19256bt2.m51768d();
                        if (cursor.moveToNext()) {
                            this.zzs.zzay().zzd().zzb("Got multiple records for app, expected one. appId", zzeo.zzn(str));
                        }
                        cursor.close();
                        return c19256bt2;
                    } catch (SQLiteException e) {
                        e = e;
                        this.zzs.zzay().zzd().zzc("Error querying app. appId", zzeo.zzn(str), e);
                        if (cursor != null) {
                            cursor.close();
                        }
                        return null;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    cursor2 = cursor;
                    if (cursor2 != null) {
                        cursor2.close();
                    }
                    throw th;
                }
            } catch (SQLiteException e2) {
                e = e2;
            }
        } catch (SQLiteException e3) {
            e = e3;
            cursor = null;
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0126  */
    /* renamed from: G */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.measurement.internal.zzac m65206G(java.lang.String r27, java.lang.String r28) {
        /*
            Method dump skipped, instructions count: 298
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C18866Zb2.m65206G(java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.zzac");
    }

    /* renamed from: H */
    public final zzak m65205H(long j, String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        return m65204I(j, str, 1L, false, false, z3, false, z5);
    }

    /* renamed from: I */
    public final zzak m65204I(long j, String str, long j2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        Preconditions.checkNotEmpty(str);
        zzg();
        zzW();
        String[] strArr = {str};
        zzak zzakVar = new zzak();
        Cursor cursor = null;
        try {
            try {
                SQLiteDatabase m65209D = m65209D();
                Cursor query = m65209D.query("apps", new String[]{"day", "daily_events_count", "daily_public_events_count", "daily_conversions_count", "daily_error_events_count", "daily_realtime_events_count"}, "app_id=?", new String[]{str}, null, null, null);
                if (!query.moveToFirst()) {
                    this.zzs.zzay().zzk().zzb("Not updating daily counts, app is not known. appId", zzeo.zzn(str));
                    query.close();
                    return zzakVar;
                }
                if (query.getLong(0) == j) {
                    zzakVar.f48252b = query.getLong(1);
                    zzakVar.f48251a = query.getLong(2);
                    zzakVar.f48253c = query.getLong(3);
                    zzakVar.f48254d = query.getLong(4);
                    zzakVar.f48255e = query.getLong(5);
                }
                if (z) {
                    zzakVar.f48252b += j2;
                }
                if (z2) {
                    zzakVar.f48251a += j2;
                }
                if (z3) {
                    zzakVar.f48253c += j2;
                }
                if (z4) {
                    zzakVar.f48254d += j2;
                }
                if (z5) {
                    zzakVar.f48255e += j2;
                }
                ContentValues contentValues = new ContentValues();
                contentValues.put("day", Long.valueOf(j));
                contentValues.put("daily_public_events_count", Long.valueOf(zzakVar.f48251a));
                contentValues.put("daily_events_count", Long.valueOf(zzakVar.f48252b));
                contentValues.put("daily_conversions_count", Long.valueOf(zzakVar.f48253c));
                contentValues.put("daily_error_events_count", Long.valueOf(zzakVar.f48254d));
                contentValues.put("daily_realtime_events_count", Long.valueOf(zzakVar.f48255e));
                m65209D.update("apps", contentValues, "app_id=?", strArr);
                query.close();
                return zzakVar;
            } catch (SQLiteException e) {
                this.zzs.zzay().zzd().zzc("Error updating daily counts. appId", zzeo.zzn(str), e);
                if (0 != 0) {
                    cursor.close();
                }
                return zzakVar;
            }
        } catch (Throwable th2) {
            if (0 != 0) {
                cursor.close();
            }
            throw th2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x0135  */
    /* renamed from: J */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final p000.C23333zc2 m65203J(java.lang.String r30, java.lang.String r31) {
        /*
            Method dump skipped, instructions count: 313
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C18866Zb2.m65203J(java.lang.String, java.lang.String):zc2");
    }

    /* JADX WARN: Not initialized variable reg: 1, insn: 0x0073: MOVE  (r0 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]), block:B:24:0x0073 */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009f  */
    /* renamed from: L */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final p000.C21211nE2 m65201L(java.lang.String r11, java.lang.String r12) {
        /*
            r10 = this;
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r11)
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r12)
            r10.zzg()
            r10.zzW()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r10.m65209D()     // Catch: java.lang.Throwable -> L75 android.database.sqlite.SQLiteException -> L77
            java.lang.String r2 = "set_timestamp"
            java.lang.String r3 = "value"
            java.lang.String r4 = "origin"
            java.lang.String[] r3 = new java.lang.String[]{r2, r3, r4}     // Catch: java.lang.Throwable -> L75 android.database.sqlite.SQLiteException -> L77
            java.lang.String[] r5 = new java.lang.String[]{r11, r12}     // Catch: java.lang.Throwable -> L75 android.database.sqlite.SQLiteException -> L77
            java.lang.String r2 = "user_attributes"
            java.lang.String r4 = "app_id=? and name=?"
            r7 = 0
            r8 = 0
            r6 = 0
            android.database.Cursor r1 = r1.query(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L75 android.database.sqlite.SQLiteException -> L77
            boolean r2 = r1.moveToFirst()     // Catch: java.lang.Throwable -> L6b android.database.sqlite.SQLiteException -> L6d
            if (r2 != 0) goto L34
            r1.close()
            return r0
        L34:
            r2 = 0
            long r7 = r1.getLong(r2)     // Catch: java.lang.Throwable -> L6b android.database.sqlite.SQLiteException -> L6d
            r2 = 1
            java.lang.Object r9 = r10.m65200M(r1, r2)     // Catch: java.lang.Throwable -> L6b android.database.sqlite.SQLiteException -> L6d
            if (r9 != 0) goto L44
            r1.close()
            return r0
        L44:
            r2 = 2
            java.lang.String r5 = r1.getString(r2)     // Catch: java.lang.Throwable -> L6b android.database.sqlite.SQLiteException -> L6d
            nE2 r2 = new nE2     // Catch: java.lang.Throwable -> L6b android.database.sqlite.SQLiteException -> L6d
            r3 = r2
            r4 = r11
            r6 = r12
            r3.<init>(r4, r5, r6, r7, r9)     // Catch: java.lang.Throwable -> L6b android.database.sqlite.SQLiteException -> L6d
            boolean r3 = r1.moveToNext()     // Catch: java.lang.Throwable -> L6b android.database.sqlite.SQLiteException -> L6d
            if (r3 == 0) goto L6f
            com.google.android.gms.measurement.internal.zzfy r3 = r10.zzs     // Catch: java.lang.Throwable -> L6b android.database.sqlite.SQLiteException -> L6d
            com.google.android.gms.measurement.internal.zzeo r3 = r3.zzay()     // Catch: java.lang.Throwable -> L6b android.database.sqlite.SQLiteException -> L6d
            com.google.android.gms.measurement.internal.zzem r3 = r3.zzd()     // Catch: java.lang.Throwable -> L6b android.database.sqlite.SQLiteException -> L6d
            java.lang.String r4 = "Got multiple records for user property, expected one. appId"
            java.lang.Object r5 = com.google.android.gms.measurement.internal.zzeo.zzn(r11)     // Catch: java.lang.Throwable -> L6b android.database.sqlite.SQLiteException -> L6d
            r3.zzb(r4, r5)     // Catch: java.lang.Throwable -> L6b android.database.sqlite.SQLiteException -> L6d
            goto L6f
        L6b:
            r11 = move-exception
            goto L73
        L6d:
            r2 = move-exception
            goto L7a
        L6f:
            r1.close()
            return r2
        L73:
            r0 = r1
            goto L9d
        L75:
            r11 = move-exception
            goto L9d
        L77:
            r1 = move-exception
            r2 = r1
            r1 = r0
        L7a:
            com.google.android.gms.measurement.internal.zzfy r3 = r10.zzs     // Catch: java.lang.Throwable -> L6b
            com.google.android.gms.measurement.internal.zzeo r3 = r3.zzay()     // Catch: java.lang.Throwable -> L6b
            com.google.android.gms.measurement.internal.zzem r3 = r3.zzd()     // Catch: java.lang.Throwable -> L6b
            java.lang.String r4 = "Error querying user property. appId"
            java.lang.Object r11 = com.google.android.gms.measurement.internal.zzeo.zzn(r11)     // Catch: java.lang.Throwable -> L6b
            com.google.android.gms.measurement.internal.zzfy r5 = r10.zzs     // Catch: java.lang.Throwable -> L6b
            com.google.android.gms.measurement.internal.zzej r5 = r5.zzj()     // Catch: java.lang.Throwable -> L6b
            java.lang.String r12 = r5.zzf(r12)     // Catch: java.lang.Throwable -> L6b
            r3.zzd(r4, r11, r12, r2)     // Catch: java.lang.Throwable -> L6b
            if (r1 == 0) goto L9c
            r1.close()
        L9c:
            return r0
        L9d:
            if (r0 == 0) goto La2
            r0.close()
        La2:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C18866Zb2.m65201L(java.lang.String, java.lang.String):nE2");
    }

    /* renamed from: M */
    public final Object m65200M(Cursor cursor, int i) {
        int type = cursor.getType(i);
        if (type != 0) {
            if (type != 1) {
                if (type != 2) {
                    if (type != 3) {
                        if (type != 4) {
                            this.zzs.zzay().zzd().zzb("Loaded invalid unknown value type, ignoring it", Integer.valueOf(type));
                            return null;
                        }
                        this.zzs.zzay().zzd().zza("Loaded invalid blob type value, ignoring it");
                        return null;
                    }
                    return cursor.getString(i);
                }
                return Double.valueOf(cursor.getDouble(i));
            }
            return Long.valueOf(cursor.getLong(i));
        }
        this.zzs.zzay().zzd().zza("Loaded invalid null value from database");
        return null;
    }

    /* renamed from: N */
    public final List m65199N(String str, String str2, String str3) {
        Preconditions.checkNotEmpty(str);
        zzg();
        zzW();
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(str);
        StringBuilder sb = new StringBuilder("app_id=?");
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(str2);
            sb.append(" and origin=?");
        }
        if (!TextUtils.isEmpty(str3)) {
            arrayList.add(String.valueOf(str3).concat(Marker.ANY_MARKER));
            sb.append(" and name glob ?");
        }
        return m65198O(sb.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0058, code lost:
        r2 = r27.zzs.zzay().zzd();
        r27.zzs.zzf();
        r2.zzb("Read more than the max allowed conditional properties, ignoring extra", 1000);
     */
    /* renamed from: O */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List m65198O(java.lang.String r28, java.lang.String[] r29) {
        /*
            Method dump skipped, instructions count: 302
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C18866Zb2.m65198O(java.lang.String, java.lang.String[]):java.util.List");
    }

    /* renamed from: P */
    public final List m65197P(String str) {
        Preconditions.checkNotEmpty(str);
        zzg();
        zzW();
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            try {
                this.zzs.zzf();
                cursor = m65209D().query("user_attributes", new String[]{"name", "origin", "set_timestamp", "value"}, "app_id=?", new String[]{str}, null, null, "rowid", "1000");
                if (cursor.moveToFirst()) {
                    do {
                        String string = cursor.getString(0);
                        String string2 = cursor.getString(1);
                        if (string2 == null) {
                            string2 = "";
                        }
                        String str2 = string2;
                        long j = cursor.getLong(2);
                        Object m65200M = m65200M(cursor, 3);
                        if (m65200M == null) {
                            this.zzs.zzay().zzd().zzb("Read invalid user property value, ignoring it. appId", zzeo.zzn(str));
                        } else {
                            arrayList.add(new C21211nE2(str, str2, string, j, m65200M));
                        }
                    } while (cursor.moveToNext());
                    cursor.close();
                    return arrayList;
                }
                cursor.close();
                return arrayList;
            } catch (SQLiteException e) {
                this.zzs.zzay().zzd().zzc("Error querying user properties. appId", zzeo.zzn(str), e);
                List emptyList = Collections.emptyList();
                if (cursor != null) {
                    cursor.close();
                }
                return emptyList;
            }
        } catch (Throwable th2) {
            if (cursor != null) {
                cursor.close();
            }
            throw th2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00a7, code lost:
        r0 = r17.zzs.zzay().zzd();
        r17.zzs.zzf();
        r0.zzb("Read more than the max allowed user properties, ignoring excess", 1000);
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0125  */
    /* renamed from: Q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List m65196Q(java.lang.String r18, java.lang.String r19, java.lang.String r20) {
        /*
            Method dump skipped, instructions count: 303
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C18866Zb2.m65196Q(java.lang.String, java.lang.String, java.lang.String):java.util.List");
    }

    /* renamed from: R */
    public final void m65195R() {
        zzW();
        m65209D().endTransaction();
    }

    /* renamed from: S */
    public final void m65194S(List list) {
        zzg();
        zzW();
        Preconditions.checkNotNull(list);
        Preconditions.checkNotZero(list.size());
        if (!m65186i()) {
            return;
        }
        String str = "(" + TextUtils.join(",", list) + ")";
        if (m65172w("SELECT COUNT(1) FROM queue WHERE rowid IN " + str + " AND retry_count =  2147483647 LIMIT 1", null) > 0) {
            this.zzs.zzay().zzk().zza("The number of upload retries exceeds the limit. Will remain unchanged.");
        }
        try {
            m65209D().execSQL("UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN " + str + " AND (retry_count IS NULL OR retry_count < 2147483647)");
        } catch (SQLiteException e) {
            this.zzs.zzay().zzd().zzb("Error incrementing retry count. error", e);
        }
    }

    /* renamed from: b */
    public final void m65193b(String str, String str2) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        zzg();
        zzW();
        try {
            m65209D().delete("user_attributes", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e) {
            this.zzs.zzay().zzd().zzd("Error deleting user property. appId", zzeo.zzn(str), this.zzs.zzj().zzf(str2), e);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0337, code lost:
        r10.put("session_scoped", r0);
        r10.put("data", r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x034b, code lost:
        if (m65209D().insertWithOnConflict("property_filters", null, r10, 5) != (-1)) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x034d, code lost:
        r23.zzs.zzay().zzd().zzb("Failed to insert property filter (got -1). appId", com.google.android.gms.measurement.internal.zzeo.zzn(r24));
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0361, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0363, code lost:
        r0 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0367, code lost:
        r23.zzs.zzay().zzd().zzc("Error storing property filter. appId", com.google.android.gms.measurement.internal.zzeo.zzn(r24), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x037a, code lost:
        zzW();
        zzg();
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r24);
        r0 = m65209D();
        r7 = r18;
        r0.delete("property_filters", r7, new java.lang.String[]{r24, java.lang.String.valueOf(r9)});
        r0.delete("event_filters", r7, new java.lang.String[]{r24, java.lang.String.valueOf(r9)});
        r18 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x03a3, code lost:
        r7 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x017b, code lost:
        r10 = r0.zzh().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0187, code lost:
        if (r10.hasNext() == false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0193, code lost:
        if (((com.google.android.gms.internal.measurement.zzes) r10.next()).zzj() != false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0195, code lost:
        r23.zzs.zzay().zzk().zzc("Property filter with no ID. Audience definition ignored. appId, audienceId", com.google.android.gms.measurement.internal.zzeo.zzn(r24), java.lang.Integer.valueOf(r9));
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x01ae, code lost:
        r10 = r0.zzg().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x01c4, code lost:
        if (r10.hasNext() == false) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x01c6, code lost:
        r11 = (com.google.android.gms.internal.measurement.zzej) r10.next();
        zzW();
        zzg();
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r24);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x01e0, code lost:
        if (r11.zzg().isEmpty() == false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x01e2, code lost:
        r0 = r23.zzs.zzay().zzk();
        r10 = com.google.android.gms.measurement.internal.zzeo.zzn(r24);
        r12 = java.lang.Integer.valueOf(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01fa, code lost:
        if (r11.zzp() == false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x01fc, code lost:
        r16 = java.lang.Integer.valueOf(r11.zzb());
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0207, code lost:
        r16 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0209, code lost:
        r0.zzd("Event filter had no event name. Audience definition ignored. appId, audienceId, filterId", r10, r12, java.lang.String.valueOf(r16));
        r21 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0214, code lost:
        r3 = r11.zzbv();
        r21 = r7;
        r7 = new android.content.ContentValues();
        r7.put("app_id", r24);
        r7.put("audience_id", java.lang.Integer.valueOf(r9));
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x022d, code lost:
        if (r11.zzp() == false) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x022f, code lost:
        r8 = java.lang.Integer.valueOf(r11.zzb());
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0238, code lost:
        r8 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0239, code lost:
        r7.put("filter_id", r8);
        r7.put("event_name", r11.zzg());
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0249, code lost:
        if (r11.zzq() == false) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x024b, code lost:
        r8 = java.lang.Boolean.valueOf(r11.zzn());
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0254, code lost:
        r8 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0255, code lost:
        r7.put("session_scoped", r8);
        r7.put("data", r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0269, code lost:
        if (m65209D().insertWithOnConflict("event_filters", null, r7, 5) != (-1)) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x026b, code lost:
        r23.zzs.zzay().zzd().zzb("Failed to insert event filter (got -1). appId", com.google.android.gms.measurement.internal.zzeo.zzn(r24));
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x027e, code lost:
        r7 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0284, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0285, code lost:
        r23.zzs.zzay().zzd().zzc("Error storing event filter. appId", com.google.android.gms.measurement.internal.zzeo.zzn(r24), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x029a, code lost:
        r21 = r7;
        r0 = r0.zzh().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x02a8, code lost:
        if (r0.hasNext() == false) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x02aa, code lost:
        r3 = (com.google.android.gms.internal.measurement.zzes) r0.next();
        zzW();
        zzg();
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r24);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x02c4, code lost:
        if (r3.zze().isEmpty() == false) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x02c6, code lost:
        r0 = r23.zzs.zzay().zzk();
        r8 = com.google.android.gms.measurement.internal.zzeo.zzn(r24);
        r10 = java.lang.Integer.valueOf(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x02de, code lost:
        if (r3.zzj() == false) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x02e0, code lost:
        r16 = java.lang.Integer.valueOf(r3.zza());
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x02eb, code lost:
        r16 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x02ed, code lost:
        r0.zzd("Property filter had no property name. Audience definition ignored. appId, audienceId, filterId", r8, r10, java.lang.String.valueOf(r16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x02f6, code lost:
        r7 = r3.zzbv();
        r10 = new android.content.ContentValues();
        r10.put("app_id", r24);
        r10.put("audience_id", java.lang.Integer.valueOf(r9));
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x030d, code lost:
        if (r3.zzj() == false) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x030f, code lost:
        r11 = java.lang.Integer.valueOf(r3.zza());
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0318, code lost:
        r11 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0319, code lost:
        r10.put("filter_id", r11);
        r22 = r0;
        r10.put("property_name", r3.zze());
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x032b, code lost:
        if (r3.zzk() == false) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x032d, code lost:
        r0 = java.lang.Boolean.valueOf(r3.zzi());
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0336, code lost:
        r0 = null;
     */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m65192c(java.lang.String r24, java.util.List r25) {
        /*
            Method dump skipped, instructions count: 1160
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C18866Zb2.m65192c(java.lang.String, java.util.List):void");
    }

    /* renamed from: d */
    public final void m65191d(C19256bt2 c19256bt2) {
        Preconditions.checkNotNull(c19256bt2);
        zzg();
        zzW();
        String m51767d0 = c19256bt2.m51767d0();
        Preconditions.checkNotNull(m51767d0);
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", m51767d0);
        contentValues.put("app_instance_id", c19256bt2.m51765e0());
        contentValues.put("gmp_app_id", c19256bt2.m51757i0());
        contentValues.put("resettable_device_id_hash", c19256bt2.m51774a());
        contentValues.put("last_bundle_index", Long.valueOf(c19256bt2.m51776Y()));
        contentValues.put("last_bundle_start_timestamp", Long.valueOf(c19256bt2.m51775Z()));
        contentValues.put("last_bundle_end_timestamp", Long.valueOf(c19256bt2.m51777X()));
        contentValues.put("app_version", c19256bt2.m51761g0());
        contentValues.put("app_store", c19256bt2.m51763f0());
        contentValues.put("gmp_version", Long.valueOf(c19256bt2.m51778W()));
        contentValues.put("dev_cert_hash", Long.valueOf(c19256bt2.m51781T()));
        contentValues.put("measurement_enabled", Boolean.valueOf(c19256bt2.m51791J()));
        contentValues.put("day", Long.valueOf(c19256bt2.m51782S()));
        contentValues.put("daily_public_events_count", Long.valueOf(c19256bt2.m51784Q()));
        contentValues.put("daily_events_count", Long.valueOf(c19256bt2.m51785P()));
        contentValues.put("daily_conversions_count", Long.valueOf(c19256bt2.m51787N()));
        contentValues.put("config_fetched_time", Long.valueOf(c19256bt2.m51788M()));
        contentValues.put("failed_config_fetch_time", Long.valueOf(c19256bt2.m51779V()));
        contentValues.put("app_version_int", Long.valueOf(c19256bt2.m51789L()));
        contentValues.put("firebase_instance_id", c19256bt2.m51759h0());
        contentValues.put("daily_error_events_count", Long.valueOf(c19256bt2.m51786O()));
        contentValues.put("daily_realtime_events_count", Long.valueOf(c19256bt2.m51783R()));
        contentValues.put("health_monitor_sample", c19256bt2.m51755j0());
        c19256bt2.m51800A();
        contentValues.put("android_id", (Long) 0L);
        contentValues.put("adid_reporting_enabled", Boolean.valueOf(c19256bt2.m51792I()));
        contentValues.put("admob_app_id", c19256bt2.m51771b0());
        contentValues.put("dynamite_version", Long.valueOf(c19256bt2.m51780U()));
        contentValues.put("session_stitching_token", c19256bt2.m51772b());
        List m51770c = c19256bt2.m51770c();
        if (m51770c != null) {
            if (m51770c.isEmpty()) {
                this.zzs.zzay().zzk().zzb("Safelisted events should not be an empty list. appId", m51767d0);
            } else {
                contentValues.put("safelisted_events", TextUtils.join(",", m51770c));
            }
        }
        zzns.zzc();
        if (this.zzs.zzf().zzs(null, zzeb.zzai) && !contentValues.containsKey("safelisted_events")) {
            contentValues.put("safelisted_events", (String) null);
        }
        try {
            SQLiteDatabase m65209D = m65209D();
            if (m65209D.update("apps", contentValues, "app_id = ?", new String[]{m51767d0}) == 0 && m65209D.insertWithOnConflict("apps", null, contentValues, 5) == -1) {
                this.zzs.zzay().zzd().zzb("Failed to insert/update app (got -1). appId", zzeo.zzn(m51767d0));
            }
        } catch (SQLiteException e) {
            this.zzs.zzay().zzd().zzc("Error storing app. appId", zzeo.zzn(m51767d0), e);
        }
    }

    /* renamed from: e */
    public final void m65190e(C23333zc2 c23333zc2) {
        Long l;
        Preconditions.checkNotNull(c23333zc2);
        zzg();
        zzW();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", c23333zc2.f109121a);
        contentValues.put("name", c23333zc2.f109122b);
        contentValues.put("lifetime_count", Long.valueOf(c23333zc2.f109123c));
        contentValues.put("current_bundle_count", Long.valueOf(c23333zc2.f109124d));
        contentValues.put("last_fire_timestamp", Long.valueOf(c23333zc2.f109126f));
        contentValues.put("last_bundled_timestamp", Long.valueOf(c23333zc2.f109127g));
        contentValues.put("last_bundled_day", c23333zc2.f109128h);
        contentValues.put("last_sampled_complex_event_id", c23333zc2.f109129i);
        contentValues.put("last_sampling_rate", c23333zc2.f109130j);
        contentValues.put("current_session_count", Long.valueOf(c23333zc2.f109125e));
        Boolean bool = c23333zc2.f109131k;
        if (bool != null && bool.booleanValue()) {
            l = 1L;
        } else {
            l = null;
        }
        contentValues.put("last_exempt_from_sampling", l);
        try {
            if (m65209D().insertWithOnConflict("events", null, contentValues, 5) == -1) {
                this.zzs.zzay().zzd().zzb("Failed to insert/update event aggregates (got -1). appId", zzeo.zzn(c23333zc2.f109121a));
            }
        } catch (SQLiteException e) {
            this.zzs.zzay().zzd().zzc("Error storing event aggregates. appId", zzeo.zzn(c23333zc2.f109121a), e);
        }
    }

    /* renamed from: f */
    public final boolean m65189f() {
        if (m65172w("select count(1) > 0 from raw_events", null) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public final boolean m65188g() {
        if (m65172w("select count(1) > 0 from queue where has_realtime = 1", null) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public final boolean m65187h() {
        if (m65172w("select count(1) > 0 from raw_events where realtime = 1", null) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public final boolean m65186i() {
        Context zzau = this.zzs.zzau();
        this.zzs.zzf();
        return zzau.getDatabasePath("google_app_measurement.db").exists();
    }

    /* renamed from: j */
    public final boolean m65185j(String str, Long l, long j, zzfs zzfsVar) {
        zzg();
        zzW();
        Preconditions.checkNotNull(zzfsVar);
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(l);
        byte[] zzbv = zzfsVar.zzbv();
        this.zzs.zzay().zzj().zzc("Saving complex main event, appId, data size", this.zzs.zzj().zzd(str), Integer.valueOf(zzbv.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("event_id", l);
        contentValues.put("children_to_process", Long.valueOf(j));
        contentValues.put("main_event", zzbv);
        try {
            if (m65209D().insertWithOnConflict("main_event_params", null, contentValues, 5) == -1) {
                this.zzs.zzay().zzd().zzb("Failed to insert complex main event (got -1). appId", zzeo.zzn(str));
                return false;
            }
            return true;
        } catch (SQLiteException e) {
            this.zzs.zzay().zzd().zzc("Error storing complex main event. appId", zzeo.zzn(str), e);
            return false;
        }
    }

    /* renamed from: k */
    public final boolean m65184k(zzac zzacVar) {
        Preconditions.checkNotNull(zzacVar);
        zzg();
        zzW();
        String str = zzacVar.zza;
        Preconditions.checkNotNull(str);
        if (m65201L(str, zzacVar.zzc.zzb) == null) {
            long m65172w = m65172w("SELECT COUNT(1) FROM conditional_properties WHERE app_id=?", new String[]{str});
            this.zzs.zzf();
            if (m65172w >= 1000) {
                return false;
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("origin", zzacVar.zzb);
        contentValues.put("name", zzacVar.zzc.zzb);
        m65173v(contentValues, "value", Preconditions.checkNotNull(zzacVar.zzc.zza()));
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.ACTIVE, Boolean.valueOf(zzacVar.zze));
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME, zzacVar.zzf);
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT, Long.valueOf(zzacVar.zzh));
        contentValues.put("timed_out_event", this.zzs.zzv().m46126D(zzacVar.zzg));
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, Long.valueOf(zzacVar.zzd));
        contentValues.put("triggered_event", this.zzs.zzv().m46126D(zzacVar.zzi));
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_TIMESTAMP, Long.valueOf(zzacVar.zzc.zzc));
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE, Long.valueOf(zzacVar.zzj));
        contentValues.put("expired_event", this.zzs.zzv().m46126D(zzacVar.zzk));
        try {
            if (m65209D().insertWithOnConflict("conditional_properties", null, contentValues, 5) == -1) {
                this.zzs.zzay().zzd().zzb("Failed to insert/update conditional user property (got -1)", zzeo.zzn(str));
                return true;
            }
            return true;
        } catch (SQLiteException e) {
            this.zzs.zzay().zzd().zzc("Error storing conditional user property", zzeo.zzn(str), e);
            return true;
        }
    }

    /* renamed from: l */
    public final boolean m65183l(C21211nE2 c21211nE2) {
        Preconditions.checkNotNull(c21211nE2);
        zzg();
        zzW();
        if (m65201L(c21211nE2.f72163a, c21211nE2.f72165c) == null) {
            if (zzlh.m46086z(c21211nE2.f72165c)) {
                if (m65172w("select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'", new String[]{c21211nE2.f72163a}) >= this.zzs.zzf().zzf(c21211nE2.f72163a, zzeb.zzF, 25, 100)) {
                    return false;
                }
            } else if (!"_npa".equals(c21211nE2.f72165c)) {
                long m65172w = m65172w("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", new String[]{c21211nE2.f72163a, c21211nE2.f72164b});
                this.zzs.zzf();
                if (m65172w >= 25) {
                    return false;
                }
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", c21211nE2.f72163a);
        contentValues.put("origin", c21211nE2.f72164b);
        contentValues.put("name", c21211nE2.f72165c);
        contentValues.put("set_timestamp", Long.valueOf(c21211nE2.f72166d));
        m65173v(contentValues, "value", c21211nE2.f72167e);
        try {
            if (m65209D().insertWithOnConflict("user_attributes", null, contentValues, 5) == -1) {
                this.zzs.zzay().zzd().zzb("Failed to insert/update user property (got -1). appId", zzeo.zzn(c21211nE2.f72163a));
                return true;
            }
            return true;
        } catch (SQLiteException e) {
            this.zzs.zzay().zzd().zzc("Error storing user property. appId", zzeo.zzn(c21211nE2.f72163a), e);
            return true;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 4, insn: 0x0079: MOVE  (r3 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]), block:B:27:0x0079 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v2, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r4v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* renamed from: u */
    public final void m65174u(String str, long j, long j2, C22928xD2 c22928xD2) {
        ?? r4;
        Cursor cursor;
        String[] strArr;
        Cursor rawQuery;
        String string;
        String str2;
        String[] strArr2;
        String[] strArr3;
        Preconditions.checkNotNull(c22928xD2);
        zzg();
        zzW();
        Cursor cursor2 = null;
        r3 = null;
        r3 = null;
        String str3 = null;
        try {
            try {
                SQLiteDatabase m65209D = m65209D();
                r4 = TextUtils.isEmpty(null);
                String str4 = "";
                try {
                    if (r4 != 0) {
                        int i = (j2 > (-1L) ? 1 : (j2 == (-1L) ? 0 : -1));
                        if (i != 0) {
                            strArr3 = new String[]{String.valueOf(j2), String.valueOf(j)};
                        } else {
                            strArr3 = new String[]{String.valueOf(j)};
                        }
                        if (i != 0) {
                            str4 = "rowid <= ? and ";
                        }
                        rawQuery = m65209D.rawQuery("select app_id, metadata_fingerprint from raw_events where " + str4 + "app_id in (select app_id from apps where config_fetched_time >= ?) order by rowid limit 1;", strArr3);
                        if (!rawQuery.moveToFirst()) {
                            rawQuery.close();
                            return;
                        }
                        str3 = rawQuery.getString(0);
                        string = rawQuery.getString(1);
                        rawQuery.close();
                    } else {
                        int i2 = (j2 > (-1L) ? 1 : (j2 == (-1L) ? 0 : -1));
                        if (i2 != 0) {
                            strArr = new String[]{null, String.valueOf(j2)};
                        } else {
                            strArr = new String[]{null};
                        }
                        if (i2 != 0) {
                            str4 = " and rowid <= ?";
                        }
                        rawQuery = m65209D.rawQuery("select metadata_fingerprint from raw_events where app_id = ?" + str4 + " order by rowid limit 1;", strArr);
                        if (!rawQuery.moveToFirst()) {
                            rawQuery.close();
                            return;
                        } else {
                            string = rawQuery.getString(0);
                            rawQuery.close();
                        }
                    }
                    Cursor cursor3 = rawQuery;
                    String str5 = string;
                    try {
                        Cursor query = m65209D.query("raw_events_metadata", new String[]{"metadata"}, "app_id = ? and metadata_fingerprint = ?", new String[]{str3, str5}, null, null, "rowid", "2");
                        try {
                            if (!query.moveToFirst()) {
                                this.zzs.zzay().zzd().zzb("Raw event metadata record is missing. appId", zzeo.zzn(str3));
                                query.close();
                                return;
                            }
                            try {
                                zzgc zzgcVar = (zzgc) ((zzgb) zzlb.m46139r(zzgc.zzt(), query.getBlob(0))).zzaE();
                                if (query.moveToNext()) {
                                    this.zzs.zzay().zzk().zzb("Get multiple raw event metadata records, expected one. appId", zzeo.zzn(str3));
                                }
                                query.close();
                                Preconditions.checkNotNull(zzgcVar);
                                c22928xD2.f108275a = zzgcVar;
                                if (j2 != -1) {
                                    str2 = "app_id = ? and metadata_fingerprint = ? and rowid <= ?";
                                    strArr2 = new String[]{str3, str5, String.valueOf(j2)};
                                } else {
                                    str2 = "app_id = ? and metadata_fingerprint = ?";
                                    strArr2 = new String[]{str3, str5};
                                }
                                Cursor query2 = m65209D.query("raw_events", new String[]{"rowid", "name", "timestamp", "data"}, str2, strArr2, null, null, "rowid", null);
                                if (query2.moveToFirst()) {
                                    do {
                                        long j3 = query2.getLong(0);
                                        try {
                                            zzfr zzfrVar = (zzfr) zzlb.m46139r(zzfs.zze(), query2.getBlob(3));
                                            zzfrVar.zzi(query2.getString(1));
                                            zzfrVar.zzm(query2.getLong(2));
                                            if (!c22928xD2.m593a(j3, (zzfs) zzfrVar.zzaE())) {
                                                query2.close();
                                                return;
                                            }
                                        } catch (IOException e) {
                                            this.zzs.zzay().zzd().zzc("Data loss. Failed to merge raw event. appId", zzeo.zzn(str3), e);
                                        }
                                    } while (query2.moveToNext());
                                    query2.close();
                                    return;
                                }
                                this.zzs.zzay().zzk().zzb("Raw event data disappeared while in transaction. appId", zzeo.zzn(str3));
                                query2.close();
                            } catch (IOException e2) {
                                this.zzs.zzay().zzd().zzc("Data loss. Failed to merge raw event metadata. appId", zzeo.zzn(str3), e2);
                                query.close();
                            }
                        } catch (SQLiteException e3) {
                            e = e3;
                            r4 = query;
                            this.zzs.zzay().zzd().zzc("Data loss. Error selecting raw event. appId", zzeo.zzn(str3), e);
                            if (r4 != 0) {
                                r4.close();
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            cursor2 = query;
                            if (cursor2 != null) {
                                cursor2.close();
                            }
                            throw th;
                        }
                    } catch (SQLiteException e4) {
                        e = e4;
                        r4 = cursor3;
                    } catch (Throwable th3) {
                        th = th3;
                        cursor2 = cursor3;
                    }
                } catch (SQLiteException e5) {
                    e = e5;
                }
            } catch (SQLiteException e6) {
                e = e6;
                r4 = 0;
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (Throwable th5) {
            th = th5;
            cursor2 = cursor;
        }
    }

    /* renamed from: w */
    public final long m65172w(String str, String[] strArr) {
        Cursor cursor = null;
        try {
            try {
                Cursor rawQuery = m65209D().rawQuery(str, strArr);
                if (rawQuery.moveToFirst()) {
                    long j = rawQuery.getLong(0);
                    rawQuery.close();
                    return j;
                }
                throw new SQLiteException("Database returned empty set");
            } catch (SQLiteException e) {
                this.zzs.zzay().zzd().zzc("Database error", str, e);
                throw e;
            }
        } catch (Throwable th2) {
            if (0 != 0) {
                cursor.close();
            }
            throw th2;
        }
    }

    /* renamed from: x */
    public final int m65171x(String str, String str2) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        zzg();
        zzW();
        try {
            return m65209D().delete("conditional_properties", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e) {
            this.zzs.zzay().zzd().zzd("Error deleting conditional property", zzeo.zzn(str), this.zzs.zzj().zzf(str2), e);
            return 0;
        }
    }

    /* renamed from: y */
    public final long m65170y(String str, String[] strArr, long j) {
        Cursor cursor = null;
        try {
            try {
                cursor = m65209D().rawQuery(str, strArr);
                if (cursor.moveToFirst()) {
                    long j2 = cursor.getLong(0);
                    cursor.close();
                    return j2;
                }
                cursor.close();
                return j;
            } catch (SQLiteException e) {
                this.zzs.zzay().zzd().zzc("Database error", str, e);
                throw e;
            }
        } catch (Throwable th2) {
            if (cursor != null) {
                cursor.close();
            }
            throw th2;
        }
    }

    /* renamed from: z */
    public final long m65169z(String str, String str2) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty("first_open_count");
        zzg();
        zzW();
        SQLiteDatabase m65209D = m65209D();
        m65209D.beginTransaction();
        long j = 0;
        try {
            try {
                long m65170y = m65170y("select first_open_count from app2 where app_id=?", new String[]{str}, -1L);
                if (m65170y == -1) {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("app_id", str);
                    contentValues.put("first_open_count", (Integer) 0);
                    contentValues.put("previous_install_count", (Integer) 0);
                    if (m65209D.insertWithOnConflict("app2", null, contentValues, 5) == -1) {
                        this.zzs.zzay().zzd().zzc("Failed to insert column (got -1). appId", zzeo.zzn(str), "first_open_count");
                        return -1L;
                    }
                    m65170y = 0;
                }
                try {
                    ContentValues contentValues2 = new ContentValues();
                    contentValues2.put("app_id", str);
                    contentValues2.put("first_open_count", Long.valueOf(1 + m65170y));
                    if (m65209D.update("app2", contentValues2, "app_id = ?", new String[]{str}) == 0) {
                        this.zzs.zzay().zzd().zzc("Failed to update column (got 0). appId", zzeo.zzn(str), "first_open_count");
                        return -1L;
                    }
                    m65209D.setTransactionSuccessful();
                    return m65170y;
                } catch (SQLiteException e) {
                    e = e;
                    j = m65170y;
                    this.zzs.zzay().zzd().zzd("Error inserting column. appId", zzeo.zzn(str), "first_open_count", e);
                    m65209D.endTransaction();
                    return j;
                }
            } finally {
                m65209D.endTransaction();
            }
        } catch (SQLiteException e2) {
            e = e2;
        }
    }

    public final void zzC() {
        zzW();
        m65209D().setTransactionSuccessful();
    }

    @Override // p000.RC2
    public final boolean zzb() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0042  */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String zzr() {
        /*
            r6 = this;
            android.database.sqlite.SQLiteDatabase r0 = r6.m65209D()
            r1 = 0
            java.lang.String r2 = "select app_id from queue order by has_realtime desc, rowid asc limit 1;"
            android.database.Cursor r0 = r0.rawQuery(r2, r1)     // Catch: java.lang.Throwable -> L26 android.database.sqlite.SQLiteException -> L28
            boolean r2 = r0.moveToFirst()     // Catch: java.lang.Throwable -> L1a android.database.sqlite.SQLiteException -> L1c
            if (r2 == 0) goto L1e
            r2 = 0
            java.lang.String r1 = r0.getString(r2)     // Catch: java.lang.Throwable -> L1a android.database.sqlite.SQLiteException -> L1c
            r0.close()
            return r1
        L1a:
            r1 = move-exception
            goto L22
        L1c:
            r2 = move-exception
            goto L2b
        L1e:
            r0.close()
            return r1
        L22:
            r5 = r1
            r1 = r0
            r0 = r5
            goto L40
        L26:
            r0 = move-exception
            goto L40
        L28:
            r0 = move-exception
            r2 = r0
            r0 = r1
        L2b:
            com.google.android.gms.measurement.internal.zzfy r3 = r6.zzs     // Catch: java.lang.Throwable -> L1a
            com.google.android.gms.measurement.internal.zzeo r3 = r3.zzay()     // Catch: java.lang.Throwable -> L1a
            com.google.android.gms.measurement.internal.zzem r3 = r3.zzd()     // Catch: java.lang.Throwable -> L1a
            java.lang.String r4 = "Database error getting next bundle app id"
            r3.zzb(r4, r2)     // Catch: java.lang.Throwable -> L1a
            if (r0 == 0) goto L3f
            r0.close()
        L3f:
            return r1
        L40:
            if (r1 == 0) goto L45
            r1.close()
        L45:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C18866Zb2.zzr():java.lang.String");
    }

    public final void zzw() {
        zzW();
        m65209D().beginTransaction();
    }

    public final void zzz() {
        zzg();
        zzW();
        if (m65186i()) {
            long zza = this.zzf.zzs().zza.zza();
            long elapsedRealtime = this.zzs.zzav().elapsedRealtime();
            long abs = Math.abs(elapsedRealtime - zza);
            this.zzs.zzf();
            if (abs > ((Long) zzeb.zzx.zza(null)).longValue()) {
                this.zzf.zzs().zza.zzb(elapsedRealtime);
                zzg();
                zzW();
                if (m65186i()) {
                    SQLiteDatabase m65209D = m65209D();
                    String valueOf = String.valueOf(this.zzs.zzav().currentTimeMillis());
                    this.zzs.zzf();
                    int delete = m65209D.delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new String[]{valueOf, String.valueOf(zzag.zzA())});
                    if (delete > 0) {
                        this.zzs.zzay().zzj().zzb("Deleted stale rows. rowsDeleted", Integer.valueOf(delete));
                    }
                }
            }
        }
    }
}
