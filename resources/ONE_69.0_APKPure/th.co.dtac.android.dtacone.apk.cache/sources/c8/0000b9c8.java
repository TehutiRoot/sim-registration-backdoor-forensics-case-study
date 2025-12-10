package com.mixpanel.android.mpmetrics;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import com.mixpanel.android.util.MPLog;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public class MPDbAdapter {

    /* renamed from: b */
    public static final Map f58592b = new HashMap();

    /* renamed from: c */
    public static final String f58593c;

    /* renamed from: d */
    public static final String f58594d;

    /* renamed from: e */
    public static final String f58595e;

    /* renamed from: f */
    public static final String f58596f;

    /* renamed from: a */
    public final C9142a f58597a;

    /* loaded from: classes5.dex */
    public enum Table {
        EVENTS("events"),
        PEOPLE("people");
        
        private final String mTableName;

        Table(String str) {
            this.mTableName = str;
        }

        public String getName() {
            return this.mTableName;
        }
    }

    /* renamed from: com.mixpanel.android.mpmetrics.MPDbAdapter$a */
    /* loaded from: classes5.dex */
    public static class C9142a extends SQLiteOpenHelper {

        /* renamed from: a */
        public final File f58598a;

        /* renamed from: b */
        public final MPConfig f58599b;

        public C9142a(Context context, String str) {
            super(context, str, (SQLiteDatabase.CursorFactory) null, 5);
            this.f58598a = context.getDatabasePath(str);
            this.f58599b = MPConfig.getInstance(context);
        }

        /* renamed from: d */
        public boolean m33600d() {
            if (!this.f58598a.exists() || Math.max(this.f58598a.getUsableSpace(), this.f58599b.getMinimumDatabaseLimit()) >= this.f58598a.length()) {
                return true;
            }
            return false;
        }

        /* renamed from: g */
        public void m33599g() {
            close();
            this.f58598a.delete();
        }

        /* renamed from: i */
        public final void m33598i(SQLiteDatabase sQLiteDatabase) {
            int i;
            StringBuilder sb = new StringBuilder();
            sb.append("ALTER TABLE ");
            Table table = Table.EVENTS;
            sb.append(table.getName());
            sb.append(" ADD COLUMN ");
            sb.append("automatic_data");
            sb.append(" INTEGER DEFAULT 0");
            sQLiteDatabase.execSQL(sb.toString());
            StringBuilder sb2 = new StringBuilder();
            sb2.append("ALTER TABLE ");
            Table table2 = Table.PEOPLE;
            sb2.append(table2.getName());
            sb2.append(" ADD COLUMN ");
            sb2.append("automatic_data");
            sb2.append(" INTEGER DEFAULT 0");
            sQLiteDatabase.execSQL(sb2.toString());
            sQLiteDatabase.execSQL("ALTER TABLE " + table.getName() + " ADD COLUMN token STRING NOT NULL DEFAULT ''");
            sQLiteDatabase.execSQL("ALTER TABLE " + table2.getName() + " ADD COLUMN token STRING NOT NULL DEFAULT ''");
            StringBuilder sb3 = new StringBuilder();
            sb3.append("SELECT * FROM ");
            sb3.append(table.getName());
            Cursor rawQuery = sQLiteDatabase.rawQuery(sb3.toString(), null);
            while (true) {
                int i2 = 0;
                if (!rawQuery.moveToNext()) {
                    break;
                }
                try {
                    String string = new JSONObject(rawQuery.getString(rawQuery.getColumnIndex("data"))).getJSONObject("properties").getString("token");
                    i2 = rawQuery.getInt(rawQuery.getColumnIndex("_id"));
                    sQLiteDatabase.execSQL("UPDATE " + Table.EVENTS.getName() + " SET token = '" + string + "' WHERE _id = " + i2);
                } catch (JSONException unused) {
                    String name = Table.EVENTS.getName();
                    sQLiteDatabase.delete(name, "_id = " + i2, null);
                }
            }
            Cursor rawQuery2 = sQLiteDatabase.rawQuery("SELECT * FROM " + Table.PEOPLE.getName(), null);
            while (rawQuery2.moveToNext()) {
                try {
                    String string2 = new JSONObject(rawQuery2.getString(rawQuery2.getColumnIndex("data"))).getString("$token");
                    i = rawQuery2.getInt(rawQuery2.getColumnIndex("_id"));
                    try {
                        sQLiteDatabase.execSQL("UPDATE " + Table.PEOPLE.getName() + " SET token = '" + string2 + "' WHERE _id = " + i);
                    } catch (JSONException unused2) {
                        String name2 = Table.PEOPLE.getName();
                        sQLiteDatabase.delete(name2, "_id = " + i, null);
                    }
                } catch (JSONException unused3) {
                    i = 0;
                }
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            MPLog.m33445v("MixpanelAPI.Database", "Creating a new Mixpanel events DB");
            sQLiteDatabase.execSQL(MPDbAdapter.f58593c);
            sQLiteDatabase.execSQL(MPDbAdapter.f58594d);
            sQLiteDatabase.execSQL(MPDbAdapter.f58595e);
            sQLiteDatabase.execSQL(MPDbAdapter.f58596f);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            MPLog.m33445v("MixpanelAPI.Database", "Upgrading app, replacing Mixpanel events DB");
            if (i2 == 5) {
                m33598i(sQLiteDatabase);
                return;
            }
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS " + Table.EVENTS.getName());
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS " + Table.PEOPLE.getName());
            sQLiteDatabase.execSQL(MPDbAdapter.f58593c);
            sQLiteDatabase.execSQL(MPDbAdapter.f58594d);
            sQLiteDatabase.execSQL(MPDbAdapter.f58595e);
            sQLiteDatabase.execSQL(MPDbAdapter.f58596f);
        }
    }

    static {
        Table table;
        Table table2;
        StringBuilder sb = new StringBuilder();
        sb.append("CREATE TABLE ");
        sb.append(Table.EVENTS.getName());
        sb.append(" (_id INTEGER PRIMARY KEY AUTOINCREMENT, ");
        sb.append("data");
        sb.append(" STRING NOT NULL, ");
        sb.append("created_at");
        sb.append(" INTEGER NOT NULL, ");
        sb.append("automatic_data");
        sb.append(" INTEGER DEFAULT 0, ");
        sb.append("token");
        sb.append(" STRING NOT NULL DEFAULT '')");
        f58593c = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("CREATE TABLE ");
        sb2.append(Table.PEOPLE.getName());
        sb2.append(" (_id INTEGER PRIMARY KEY AUTOINCREMENT, ");
        sb2.append("data");
        sb2.append(" STRING NOT NULL, ");
        sb2.append("created_at");
        sb2.append(" INTEGER NOT NULL, ");
        sb2.append("automatic_data");
        sb2.append(" INTEGER DEFAULT 0, ");
        sb2.append("token");
        sb2.append(" STRING NOT NULL DEFAULT '')");
        f58594d = sb2.toString();
        f58595e = "CREATE INDEX IF NOT EXISTS time_idx ON " + table.getName() + " (created_at);";
        f58596f = "CREATE INDEX IF NOT EXISTS time_idx ON " + table2.getName() + " (created_at);";
    }

    public MPDbAdapter(Context context) {
        this(context, "mixpanel");
    }

    /* renamed from: o */
    public static MPDbAdapter m33602o(Context context) {
        MPDbAdapter mPDbAdapter;
        Map map = f58592b;
        synchronized (map) {
            try {
                Context applicationContext = context.getApplicationContext();
                if (!map.containsKey(applicationContext)) {
                    mPDbAdapter = new MPDbAdapter(applicationContext);
                    map.put(applicationContext, mPDbAdapter);
                } else {
                    mPDbAdapter = (MPDbAdapter) map.get(applicationContext);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return mPDbAdapter;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v6, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* renamed from: e */
    public int m33612e(JSONObject jSONObject, String str, Table table, boolean z) {
        Cursor cursor;
        if (!m33611f()) {
            MPLog.m33449e("MixpanelAPI.Database", "There is not enough space left on the device to store Mixpanel data, so data was discarded");
            return -2;
        }
        String name = table.getName();
        Cursor cursor2 = 0;
        cursor2 = 0;
        try {
            try {
                try {
                    SQLiteDatabase writableDatabase = this.f58597a.getWritableDatabase();
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("data", jSONObject.toString());
                    contentValues.put("created_at", Long.valueOf(System.currentTimeMillis()));
                    contentValues.put("automatic_data", Boolean.valueOf(z));
                    contentValues.put("token", str);
                    writableDatabase.insert(name, null, contentValues);
                    cursor = writableDatabase.rawQuery("SELECT COUNT(*) FROM " + name + " WHERE token='" + str + OperatorName.SHOW_TEXT_LINE, null);
                    try {
                        cursor.moveToFirst();
                        int i = cursor.getInt(0);
                        cursor.close();
                        this.f58597a.close();
                        return i;
                    } catch (SQLiteException e) {
                        e = e;
                        MPLog.m33448e("MixpanelAPI.Database", "Could not add Mixpanel data to table " + name + ". Re-initializing database.", e);
                        if (cursor != null) {
                            cursor.close();
                        } else {
                            cursor2 = cursor;
                        }
                        this.f58597a.m33599g();
                        if (cursor2 != 0) {
                            cursor2.close();
                        }
                        this.f58597a.close();
                        return -1;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (cursor2 != 0) {
                        cursor2.close();
                    }
                    this.f58597a.close();
                    throw th;
                }
            } catch (SQLiteException e2) {
                e = e2;
                cursor = null;
            }
        } catch (Throwable th3) {
            th = th3;
            cursor2 = jSONObject;
        }
    }

    /* renamed from: f */
    public boolean m33611f() {
        return this.f58597a.m33600d();
    }

    /* renamed from: g */
    public void m33610g(Table table, String str) {
        String name = table.getName();
        try {
            try {
                SQLiteDatabase writableDatabase = this.f58597a.getWritableDatabase();
                writableDatabase.delete(name, "token = '" + str + OperatorName.SHOW_TEXT_LINE, null);
            } catch (SQLiteException e) {
                MPLog.m33448e("MixpanelAPI.Database", "Could not clean timed-out Mixpanel records from " + name + ". Re-initializing database.", e);
                this.f58597a.m33599g();
            }
        } finally {
            this.f58597a.close();
        }
    }

    /* renamed from: h */
    public final void m33609h(Table table, String str) {
        String name = table.getName();
        try {
            try {
                SQLiteDatabase writableDatabase = this.f58597a.getWritableDatabase();
                writableDatabase.delete(name, "automatic_data = 1 AND token = '" + str + OperatorName.SHOW_TEXT_LINE, null);
            } catch (SQLiteException e) {
                MPLog.m33448e("MixpanelAPI.Database", "Could not clean automatic Mixpanel records from " + name + ". Re-initializing database.", e);
                this.f58597a.m33599g();
            }
        } finally {
            this.f58597a.close();
        }
    }

    /* renamed from: i */
    public synchronized void m33608i(String str) {
        m33609h(Table.EVENTS, str);
        m33609h(Table.PEOPLE, str);
    }

    /* renamed from: j */
    public void m33607j(long j, Table table) {
        String name = table.getName();
        try {
            try {
                SQLiteDatabase writableDatabase = this.f58597a.getWritableDatabase();
                writableDatabase.delete(name, "created_at <= " + j, null);
            } catch (SQLiteException e) {
                MPLog.m33448e("MixpanelAPI.Database", "Could not clean timed-out Mixpanel records from " + name + ". Re-initializing database.", e);
                this.f58597a.m33599g();
            }
        } finally {
            this.f58597a.close();
        }
    }

    /* renamed from: k */
    public void m33606k(String str, Table table, String str2, boolean z) {
        String name = table.getName();
        try {
            try {
                SQLiteDatabase writableDatabase = this.f58597a.getWritableDatabase();
                StringBuffer stringBuffer = new StringBuffer("_id <= " + str + " AND token = '" + str2 + OperatorName.SHOW_TEXT_LINE);
                if (!z) {
                    stringBuffer.append(" AND automatic_data=0");
                }
                writableDatabase.delete(name, stringBuffer.toString(), null);
            } catch (SQLiteException e) {
                MPLog.m33448e("MixpanelAPI.Database", "Could not clean sent Mixpanel records from " + name + ". Re-initializing database.", e);
                this.f58597a.m33599g();
            }
            this.f58597a.close();
        } catch (Throwable th2) {
            this.f58597a.close();
            throw th2;
        }
    }

    /* renamed from: l */
    public void m33605l() {
        this.f58597a.m33599g();
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x013d  */
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String[] m33604m(com.mixpanel.android.mpmetrics.MPDbAdapter.Table r12, java.lang.String r13, boolean r14) {
        /*
            Method dump skipped, instructions count: 321
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mixpanel.android.mpmetrics.MPDbAdapter.m33604m(com.mixpanel.android.mpmetrics.MPDbAdapter$Table, java.lang.String, boolean):java.lang.String[]");
    }

    /* renamed from: n */
    public File m33603n() {
        return this.f58597a.f58598a;
    }

    public MPDbAdapter(Context context, String str) {
        this.f58597a = new C9142a(context, str);
    }
}