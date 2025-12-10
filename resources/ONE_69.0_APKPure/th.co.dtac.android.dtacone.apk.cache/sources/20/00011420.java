package th.p047co.dtac.android.dtacone.data.cache.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/* renamed from: th.co.dtac.android.dtacone.data.cache.database.LocationDbHelper */
/* loaded from: classes7.dex */
public class LocationDbHelper extends SQLiteOpenHelper {
    public static final String DATABASE_LOCATION_NAME = "location.sqlite";

    public LocationDbHelper(Context context) {
        super(context, DATABASE_LOCATION_NAME, (SQLiteDatabase.CursorFactory) null, 1);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }
}