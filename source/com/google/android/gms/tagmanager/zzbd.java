package com.google.android.gms.tagmanager;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import ch.qos.logback.core.joran.action.Action;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.internal.gtm.zzgb;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import org.apache.http.cookie.ClientCookie;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzbd implements zzaw {
    private static final String zza = String.format("CREATE TABLE IF NOT EXISTS %s ( '%s' INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, '%s' STRING NOT NULL, '%s' BLOB NOT NULL, '%s' INTEGER NOT NULL);", "datalayer", OperatorName.BEGIN_INLINE_IMAGE_DATA, Action.KEY_ATTRIBUTE, "value", ClientCookie.EXPIRES_ATTR);
    private final Executor zzb;
    private final Context zzc;
    private final zzbb zzd;
    private final Clock zze;

    public zzbd(Context context) {
        Clock defaultClock = DefaultClock.getInstance();
        ExecutorService zza2 = zzgb.zza().zza(2);
        this.zzc = context;
        this.zze = defaultClock;
        this.zzb = zza2;
        this.zzd = new zzbb(this, context, "google_tagmanager.db");
    }

    public static /* bridge */ /* synthetic */ List zzf(zzbd zzbdVar) {
        ObjectInputStream objectInputStream;
        try {
            zzbdVar.zzk(zzbdVar.zze.currentTimeMillis());
            SQLiteDatabase zzi = zzbdVar.zzi("Error opening database for loadSerialized.");
            ArrayList<zzbc> arrayList = new ArrayList();
            if (zzi != null) {
                Cursor query = zzi.query("datalayer", new String[]{Action.KEY_ATTRIBUTE, "value"}, null, null, null, null, OperatorName.BEGIN_INLINE_IMAGE_DATA, null);
                while (query.moveToNext()) {
                    arrayList.add(new zzbc(query.getString(0), query.getBlob(1)));
                }
                query.close();
            }
            ArrayList arrayList2 = new ArrayList();
            for (zzbc zzbcVar : arrayList) {
                String str = zzbcVar.zza;
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(zzbcVar.zzb);
                ObjectInputStream objectInputStream2 = null;
                r2 = null;
                r2 = null;
                r2 = null;
                Object obj = null;
                try {
                    objectInputStream = new ObjectInputStream(byteArrayInputStream);
                    try {
                        obj = objectInputStream.readObject();
                    } catch (IOException unused) {
                        if (objectInputStream != null) {
                            objectInputStream.close();
                        }
                        byteArrayInputStream.close();
                        arrayList2.add(new zzat(str, obj));
                    } catch (ClassNotFoundException unused2) {
                        if (objectInputStream != null) {
                            objectInputStream.close();
                        }
                        byteArrayInputStream.close();
                        arrayList2.add(new zzat(str, obj));
                    } catch (Throwable th2) {
                        th = th2;
                        objectInputStream2 = objectInputStream;
                        if (objectInputStream2 != null) {
                            try {
                                objectInputStream2.close();
                            } catch (IOException unused3) {
                                throw th;
                            }
                        }
                        byteArrayInputStream.close();
                        throw th;
                    }
                } catch (IOException unused4) {
                    objectInputStream = null;
                } catch (ClassNotFoundException unused5) {
                    objectInputStream = null;
                } catch (Throwable th3) {
                    th = th3;
                }
                try {
                    objectInputStream.close();
                    byteArrayInputStream.close();
                } catch (IOException unused6) {
                }
                arrayList2.add(new zzat(str, obj));
            }
            return arrayList2;
        } finally {
            zzbdVar.zzj();
        }
    }

    public static /* synthetic */ void zzg(zzbd zzbdVar, String str) {
        SQLiteDatabase zzi = zzbdVar.zzi("Error opening database for clearKeysWithPrefix.");
        if (zzi == null) {
            return;
        }
        try {
            int delete = zzi.delete("datalayer", "key = ? OR key LIKE ?", new String[]{str, str + ".%"});
            zzdg.zzb.zzd("Cleared " + delete + " items");
        } catch (SQLiteException e) {
            String obj = e.toString();
            Log.w("GoogleTagManager", "Error deleting entries with key prefix: " + str + " (" + obj + ").");
        } finally {
            zzbdVar.zzj();
        }
    }

    private final SQLiteDatabase zzi(String str) {
        try {
            return this.zzd.getWritableDatabase();
        } catch (SQLiteException unused) {
            Log.w("GoogleTagManager", str);
            return null;
        }
    }

    private final void zzj() {
        try {
            this.zzd.close();
        } catch (SQLiteException unused) {
        }
    }

    private final void zzk(long j) {
        SQLiteDatabase zzi = zzi("Error opening database for deleteOlderThan.");
        if (zzi == null) {
            return;
        }
        try {
            int delete = zzi.delete("datalayer", "expires <= ?", new String[]{Long.toString(j)});
            zzdg.zzb.zzd("Deleted " + delete + " expired items");
        } catch (SQLiteException unused) {
            Log.w("GoogleTagManager", "Error deleting old entries.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00c4, code lost:
        if (r8 == null) goto L13;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0052 A[Catch: all -> 0x0036, TRY_LEAVE, TryCatch #5 {, blocks: (B:75:0x0174, B:4:0x0005, B:27:0x004d, B:29:0x0052, B:42:0x009d, B:65:0x0133, B:66:0x0136, B:53:0x00c7, B:55:0x00f0, B:58:0x00f4, B:60:0x00fc, B:61:0x0117, B:63:0x011d, B:67:0x0137, B:70:0x0142, B:71:0x0146, B:73:0x014c, B:16:0x0032, B:81:0x017d, B:82:0x0180, B:26:0x0049), top: B:90:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0142 A[Catch: all -> 0x0036, TryCatch #5 {, blocks: (B:75:0x0174, B:4:0x0005, B:27:0x004d, B:29:0x0052, B:42:0x009d, B:65:0x0133, B:66:0x0136, B:53:0x00c7, B:55:0x00f0, B:58:0x00f4, B:60:0x00fc, B:61:0x0117, B:63:0x011d, B:67:0x0137, B:70:0x0142, B:71:0x0146, B:73:0x014c, B:16:0x0032, B:81:0x017d, B:82:0x0180, B:26:0x0049), top: B:90:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x017d A[Catch: all -> 0x0036, TRY_ENTER, TryCatch #5 {, blocks: (B:75:0x0174, B:4:0x0005, B:27:0x004d, B:29:0x0052, B:42:0x009d, B:65:0x0133, B:66:0x0136, B:53:0x00c7, B:55:0x00f0, B:58:0x00f4, B:60:0x00fc, B:61:0x0117, B:63:0x011d, B:67:0x0137, B:70:0x0142, B:71:0x0146, B:73:0x014c, B:16:0x0032, B:81:0x017d, B:82:0x0180, B:26:0x0049), top: B:90:0x0005 }] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void zzl(java.util.List r20, long r21) {
        /*
            Method dump skipped, instructions count: 391
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.tagmanager.zzbd.zzl(java.util.List, long):void");
    }

    @Override // com.google.android.gms.tagmanager.zzaw
    public final void zza(String str) {
        this.zzb.execute(new zzba(this, str));
    }

    @Override // com.google.android.gms.tagmanager.zzaw
    public final void zzb(zzav zzavVar) {
        this.zzb.execute(new zzaz(this, zzavVar));
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0048, code lost:
        if (r6 == null) goto L11;
     */
    @Override // com.google.android.gms.tagmanager.zzaw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzc(java.util.List r8, long r9) {
        /*
            r7 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r8 = r8.iterator()
        L9:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto L52
            java.lang.Object r1 = r8.next()
            com.google.android.gms.tagmanager.zzat r1 = (com.google.android.gms.tagmanager.zzat) r1
            com.google.android.gms.tagmanager.zzbc r2 = new com.google.android.gms.tagmanager.zzbc
            java.lang.String r3 = r1.zza
            java.lang.Object r1 = r1.zzb
            java.io.ByteArrayOutputStream r4 = new java.io.ByteArrayOutputStream
            r4.<init>()
            r5 = 0
            java.io.ObjectOutputStream r6 = new java.io.ObjectOutputStream     // Catch: java.lang.Throwable -> L3a java.io.IOException -> L3c
            r6.<init>(r4)     // Catch: java.lang.Throwable -> L3a java.io.IOException -> L3c
            r6.writeObject(r1)     // Catch: java.lang.Throwable -> L34 java.io.IOException -> L36
            byte[] r5 = r4.toByteArray()     // Catch: java.lang.Throwable -> L34 java.io.IOException -> L36
        L2d:
            r6.close()     // Catch: java.io.IOException -> L4b
        L30:
            r4.close()     // Catch: java.io.IOException -> L4b
            goto L4b
        L34:
            r8 = move-exception
            goto L38
        L36:
            goto L48
        L38:
            r5 = r6
            goto L3e
        L3a:
            r8 = move-exception
            goto L3e
        L3c:
            goto L47
        L3e:
            if (r5 == 0) goto L43
            r5.close()     // Catch: java.io.IOException -> L46
        L43:
            r4.close()     // Catch: java.io.IOException -> L46
        L46:
            throw r8
        L47:
            r6 = r5
        L48:
            if (r6 == 0) goto L30
            goto L2d
        L4b:
            r2.<init>(r3, r5)
            r0.add(r2)
            goto L9
        L52:
            java.util.concurrent.Executor r8 = r7.zzb
            com.google.android.gms.tagmanager.zzay r1 = new com.google.android.gms.tagmanager.zzay
            r1.<init>(r7, r0, r9)
            r8.execute(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.tagmanager.zzbd.zzc(java.util.List, long):void");
    }
}
