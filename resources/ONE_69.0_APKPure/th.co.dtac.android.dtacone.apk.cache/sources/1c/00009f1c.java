package com.google.android.gms.tagmanager;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import androidx.annotation.VisibleForTesting;
import ch.qos.logback.core.joran.action.Action;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import java.util.HashSet;
import org.apache.http.cookie.ClientCookie;

/* JADX INFO: Access modifiers changed from: package-private */
@VisibleForTesting
/* loaded from: classes3.dex */
public final class zzbb extends SQLiteOpenHelper {
    final /* synthetic */ zzbd zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzbb(zzbd zzbdVar, Context context, String str) {
        super(context, "google_tagmanager.db", (SQLiteDatabase.CursorFactory) null, 1);
        this.zza = zzbdVar;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final SQLiteDatabase getWritableDatabase() {
        Context context;
        SQLiteDatabase sQLiteDatabase;
        try {
            sQLiteDatabase = super.getWritableDatabase();
        } catch (SQLiteException unused) {
            context = this.zza.zzc;
            context.getDatabasePath("google_tagmanager.db").delete();
            sQLiteDatabase = null;
        }
        if (sQLiteDatabase == null) {
            return super.getWritableDatabase();
        }
        return sQLiteDatabase;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        zzbu.zza(sQLiteDatabase.getPath());
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        String str;
        Cursor cursor = null;
        try {
            try {
                Cursor query = sQLiteDatabase.query("SQLITE_MASTER", new String[]{"name"}, "name=?", new String[]{"datalayer"}, null, null, null);
                try {
                    boolean moveToFirst = query.moveToFirst();
                    query.close();
                    if (moveToFirst) {
                        Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT * FROM datalayer WHERE 0", null);
                        HashSet hashSet = new HashSet();
                        try {
                            for (String str2 : rawQuery.getColumnNames()) {
                                hashSet.add(str2);
                            }
                            rawQuery.close();
                            if (hashSet.remove(Action.KEY_ATTRIBUTE) && hashSet.remove("value") && hashSet.remove(OperatorName.BEGIN_INLINE_IMAGE_DATA) && hashSet.remove(ClientCookie.EXPIRES_ATTR)) {
                                if (hashSet.isEmpty()) {
                                    return;
                                }
                                throw new SQLiteException("Database has extra columns");
                            }
                            throw new SQLiteException("Database column missing");
                        } catch (Throwable th2) {
                            rawQuery.close();
                            throw th2;
                        }
                    }
                } catch (SQLiteException unused) {
                    cursor = query;
                    Log.w("GoogleTagManager", "Error querying for table datalayer");
                    if (cursor != null) {
                        cursor.close();
                    }
                    str = zzbd.zza;
                    sQLiteDatabase.execSQL(str);
                } catch (Throwable th3) {
                    th = th3;
                    cursor = query;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            } catch (SQLiteException unused2) {
            }
            str = zzbd.zza;
            sQLiteDatabase.execSQL(str);
        } catch (Throwable th4) {
            th = th4;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }
}