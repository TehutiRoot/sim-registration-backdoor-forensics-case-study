package com.chuckerteam.chucker.internal.data.room;

import androidx.annotation.NonNull;
import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomDatabase;
import androidx.room.RoomMasterTable;
import androidx.room.RoomOpenHelper;
import androidx.room.migration.AutoMigrationSpec;
import androidx.room.migration.Migration;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.p007db.SupportSQLiteDatabase;
import androidx.sqlite.p007db.SupportSQLiteOpenHelper;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.apache.http.cookie.ClientCookie;
import th.p047co.dtac.android.dtacone.util.Constant;

/* loaded from: classes3.dex */
public final class ChuckerDatabase_Impl extends ChuckerDatabase {

    /* renamed from: m */
    public volatile HttpTransactionDao f42902m;

    /* renamed from: com.chuckerteam.chucker.internal.data.room.ChuckerDatabase_Impl$a */
    /* loaded from: classes3.dex */
    public class C5959a extends RoomOpenHelper.Delegate {
        public C5959a(int i) {
            super(i);
        }

        @Override // androidx.room.RoomOpenHelper.Delegate
        public void createAllTables(SupportSQLiteDatabase supportSQLiteDatabase) {
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `transactions` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `requestDate` INTEGER, `responseDate` INTEGER, `tookMs` INTEGER, `protocol` TEXT, `method` TEXT, `url` TEXT, `host` TEXT, `path` TEXT, `scheme` TEXT, `responseTlsVersion` TEXT, `responseCipherSuite` TEXT, `requestPayloadSize` INTEGER, `requestContentType` TEXT, `requestHeaders` TEXT, `requestHeadersSize` INTEGER, `requestBody` TEXT, `isRequestBodyEncoded` INTEGER NOT NULL, `responseCode` INTEGER, `responseMessage` TEXT, `error` TEXT, `responsePayloadSize` INTEGER, `responseContentType` TEXT, `responseHeaders` TEXT, `responseHeadersSize` INTEGER, `responseBody` TEXT, `isResponseBodyEncoded` INTEGER NOT NULL, `responseImageData` BLOB, `graphQlDetected` INTEGER NOT NULL, `graphQlOperationName` TEXT)");
            supportSQLiteDatabase.execSQL(RoomMasterTable.CREATE_QUERY);
            supportSQLiteDatabase.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'ac72c06b37efb89e6417a7707016d4f5')");
        }

        @Override // androidx.room.RoomOpenHelper.Delegate
        public void dropAllTables(SupportSQLiteDatabase supportSQLiteDatabase) {
            supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `transactions`");
            if (((RoomDatabase) ChuckerDatabase_Impl.this).mCallbacks != null) {
                int size = ((RoomDatabase) ChuckerDatabase_Impl.this).mCallbacks.size();
                for (int i = 0; i < size; i++) {
                    ((RoomDatabase.Callback) ((RoomDatabase) ChuckerDatabase_Impl.this).mCallbacks.get(i)).onDestructiveMigration(supportSQLiteDatabase);
                }
            }
        }

        @Override // androidx.room.RoomOpenHelper.Delegate
        public void onCreate(SupportSQLiteDatabase supportSQLiteDatabase) {
            if (((RoomDatabase) ChuckerDatabase_Impl.this).mCallbacks != null) {
                int size = ((RoomDatabase) ChuckerDatabase_Impl.this).mCallbacks.size();
                for (int i = 0; i < size; i++) {
                    ((RoomDatabase.Callback) ((RoomDatabase) ChuckerDatabase_Impl.this).mCallbacks.get(i)).onCreate(supportSQLiteDatabase);
                }
            }
        }

        @Override // androidx.room.RoomOpenHelper.Delegate
        public void onOpen(SupportSQLiteDatabase supportSQLiteDatabase) {
            ((RoomDatabase) ChuckerDatabase_Impl.this).mDatabase = supportSQLiteDatabase;
            ChuckerDatabase_Impl.this.internalInitInvalidationTracker(supportSQLiteDatabase);
            if (((RoomDatabase) ChuckerDatabase_Impl.this).mCallbacks != null) {
                int size = ((RoomDatabase) ChuckerDatabase_Impl.this).mCallbacks.size();
                for (int i = 0; i < size; i++) {
                    ((RoomDatabase.Callback) ((RoomDatabase) ChuckerDatabase_Impl.this).mCallbacks.get(i)).onOpen(supportSQLiteDatabase);
                }
            }
        }

        @Override // androidx.room.RoomOpenHelper.Delegate
        public void onPostMigrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        }

        @Override // androidx.room.RoomOpenHelper.Delegate
        public void onPreMigrate(SupportSQLiteDatabase supportSQLiteDatabase) {
            DBUtil.dropFtsSyncTriggers(supportSQLiteDatabase);
        }

        @Override // androidx.room.RoomOpenHelper.Delegate
        public RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase supportSQLiteDatabase) {
            HashMap hashMap = new HashMap(30);
            hashMap.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, 1));
            hashMap.put("requestDate", new TableInfo.Column("requestDate", "INTEGER", false, 0, null, 1));
            hashMap.put("responseDate", new TableInfo.Column("responseDate", "INTEGER", false, 0, null, 1));
            hashMap.put("tookMs", new TableInfo.Column("tookMs", "INTEGER", false, 0, null, 1));
            hashMap.put("protocol", new TableInfo.Column("protocol", Constant.CampaignType.TYPE_TEXT, false, 0, null, 1));
            hashMap.put(FirebaseAnalytics.Param.METHOD, new TableInfo.Column(FirebaseAnalytics.Param.METHOD, Constant.CampaignType.TYPE_TEXT, false, 0, null, 1));
            hashMap.put(ImagesContract.URL, new TableInfo.Column(ImagesContract.URL, Constant.CampaignType.TYPE_TEXT, false, 0, null, 1));
            hashMap.put("host", new TableInfo.Column("host", Constant.CampaignType.TYPE_TEXT, false, 0, null, 1));
            hashMap.put(ClientCookie.PATH_ATTR, new TableInfo.Column(ClientCookie.PATH_ATTR, Constant.CampaignType.TYPE_TEXT, false, 0, null, 1));
            hashMap.put("scheme", new TableInfo.Column("scheme", Constant.CampaignType.TYPE_TEXT, false, 0, null, 1));
            hashMap.put("responseTlsVersion", new TableInfo.Column("responseTlsVersion", Constant.CampaignType.TYPE_TEXT, false, 0, null, 1));
            hashMap.put("responseCipherSuite", new TableInfo.Column("responseCipherSuite", Constant.CampaignType.TYPE_TEXT, false, 0, null, 1));
            hashMap.put("requestPayloadSize", new TableInfo.Column("requestPayloadSize", "INTEGER", false, 0, null, 1));
            hashMap.put("requestContentType", new TableInfo.Column("requestContentType", Constant.CampaignType.TYPE_TEXT, false, 0, null, 1));
            hashMap.put("requestHeaders", new TableInfo.Column("requestHeaders", Constant.CampaignType.TYPE_TEXT, false, 0, null, 1));
            hashMap.put("requestHeadersSize", new TableInfo.Column("requestHeadersSize", "INTEGER", false, 0, null, 1));
            hashMap.put("requestBody", new TableInfo.Column("requestBody", Constant.CampaignType.TYPE_TEXT, false, 0, null, 1));
            hashMap.put("isRequestBodyEncoded", new TableInfo.Column("isRequestBodyEncoded", "INTEGER", true, 0, null, 1));
            hashMap.put("responseCode", new TableInfo.Column("responseCode", "INTEGER", false, 0, null, 1));
            hashMap.put("responseMessage", new TableInfo.Column("responseMessage", Constant.CampaignType.TYPE_TEXT, false, 0, null, 1));
            hashMap.put(Constants.IPC_BUNDLE_KEY_SEND_ERROR, new TableInfo.Column(Constants.IPC_BUNDLE_KEY_SEND_ERROR, Constant.CampaignType.TYPE_TEXT, false, 0, null, 1));
            hashMap.put("responsePayloadSize", new TableInfo.Column("responsePayloadSize", "INTEGER", false, 0, null, 1));
            hashMap.put("responseContentType", new TableInfo.Column("responseContentType", Constant.CampaignType.TYPE_TEXT, false, 0, null, 1));
            hashMap.put("responseHeaders", new TableInfo.Column("responseHeaders", Constant.CampaignType.TYPE_TEXT, false, 0, null, 1));
            hashMap.put("responseHeadersSize", new TableInfo.Column("responseHeadersSize", "INTEGER", false, 0, null, 1));
            hashMap.put("responseBody", new TableInfo.Column("responseBody", Constant.CampaignType.TYPE_TEXT, false, 0, null, 1));
            hashMap.put("isResponseBodyEncoded", new TableInfo.Column("isResponseBodyEncoded", "INTEGER", true, 0, null, 1));
            hashMap.put("responseImageData", new TableInfo.Column("responseImageData", "BLOB", false, 0, null, 1));
            hashMap.put("graphQlDetected", new TableInfo.Column("graphQlDetected", "INTEGER", true, 0, null, 1));
            hashMap.put("graphQlOperationName", new TableInfo.Column("graphQlOperationName", Constant.CampaignType.TYPE_TEXT, false, 0, null, 1));
            TableInfo tableInfo = new TableInfo("transactions", hashMap, new HashSet(0), new HashSet(0));
            TableInfo read = TableInfo.read(supportSQLiteDatabase, "transactions");
            if (!tableInfo.equals(read)) {
                return new RoomOpenHelper.ValidationResult(false, "transactions(com.chuckerteam.chucker.internal.data.entity.HttpTransaction).\n Expected:\n" + tableInfo + "\n Found:\n" + read);
            }
            return new RoomOpenHelper.ValidationResult(true, null);
        }
    }

    @Override // androidx.room.RoomDatabase
    public void clearAllTables() {
        super.assertNotMainThread();
        SupportSQLiteDatabase writableDatabase = super.getOpenHelper().getWritableDatabase();
        try {
            super.beginTransaction();
            writableDatabase.execSQL("DELETE FROM `transactions`");
            super.setTransactionSuccessful();
        } finally {
            super.endTransaction();
            writableDatabase.query("PRAGMA wal_checkpoint(FULL)").close();
            if (!writableDatabase.inTransaction()) {
                writableDatabase.execSQL("VACUUM");
            }
        }
    }

    @Override // androidx.room.RoomDatabase
    public InvalidationTracker createInvalidationTracker() {
        return new InvalidationTracker(this, new HashMap(0), new HashMap(0), "transactions");
    }

    @Override // androidx.room.RoomDatabase
    public SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration databaseConfiguration) {
        return databaseConfiguration.sqliteOpenHelperFactory.create(SupportSQLiteOpenHelper.Configuration.builder(databaseConfiguration.context).name(databaseConfiguration.name).callback(new RoomOpenHelper(databaseConfiguration, new C5959a(9), "ac72c06b37efb89e6417a7707016d4f5", "a70b1841a05694f746087779f5a5c887")).build());
    }

    @Override // androidx.room.RoomDatabase
    public List<Migration> getAutoMigrations(@NonNull Map<Class<? extends AutoMigrationSpec>, AutoMigrationSpec> map) {
        return Arrays.asList(new Migration[0]);
    }

    @Override // androidx.room.RoomDatabase
    public Set<Class<? extends AutoMigrationSpec>> getRequiredAutoMigrationSpecs() {
        return new HashSet();
    }

    @Override // androidx.room.RoomDatabase
    public Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
        HashMap hashMap = new HashMap();
        hashMap.put(HttpTransactionDao.class, HttpTransactionDao_Impl.getRequiredConverters());
        return hashMap;
    }

    @Override // com.chuckerteam.chucker.internal.data.room.ChuckerDatabase
    public HttpTransactionDao transactionDao() {
        HttpTransactionDao httpTransactionDao;
        if (this.f42902m != null) {
            return this.f42902m;
        }
        synchronized (this) {
            try {
                if (this.f42902m == null) {
                    this.f42902m = new HttpTransactionDao_Impl(this);
                }
                httpTransactionDao = this.f42902m;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return httpTransactionDao;
    }
}
