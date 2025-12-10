package th.p047co.dtac.android.dtacone.data.cache.room;

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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import th.p047co.dtac.android.dtacone.data.cache.room.dao.DistrictDao;
import th.p047co.dtac.android.dtacone.data.cache.room.dao.DistrictDao_Impl;
import th.p047co.dtac.android.dtacone.data.cache.room.dao.PostCodeDao;
import th.p047co.dtac.android.dtacone.data.cache.room.dao.PostCodeDao_Impl;
import th.p047co.dtac.android.dtacone.data.cache.room.dao.ProvinceDao;
import th.p047co.dtac.android.dtacone.data.cache.room.dao.ProvinceDao_Impl;
import th.p047co.dtac.android.dtacone.data.cache.room.dao.SubDistrictDao;
import th.p047co.dtac.android.dtacone.data.cache.room.dao.SubDistrictDao_Impl;
import th.p047co.dtac.android.dtacone.util.Constant;

/* renamed from: th.co.dtac.android.dtacone.data.cache.room.RoomLocationDatabase_Impl */
/* loaded from: classes7.dex */
public final class RoomLocationDatabase_Impl extends RoomLocationDatabase {

    /* renamed from: m */
    public volatile ProvinceDao f83459m;

    /* renamed from: n */
    public volatile DistrictDao f83460n;

    /* renamed from: o */
    public volatile SubDistrictDao f83461o;

    /* renamed from: p */
    public volatile PostCodeDao f83462p;

    /* renamed from: th.co.dtac.android.dtacone.data.cache.room.RoomLocationDatabase_Impl$a */
    /* loaded from: classes7.dex */
    public class C14211a extends RoomOpenHelper.Delegate {
        public C14211a(int i) {
            super(i);
        }

        @Override // androidx.room.RoomOpenHelper.Delegate
        public void createAllTables(SupportSQLiteDatabase supportSQLiteDatabase) {
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `province` (`country_code` TEXT NOT NULL, `province_name_th` TEXT NOT NULL, `province_name_en` TEXT NOT NULL, `province_id` INTEGER NOT NULL, PRIMARY KEY(`province_id`))");
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `district` (`district_id` INTEGER NOT NULL, `district_name_th` TEXT, `district_name_en` TEXT, `province_id` INTEGER NOT NULL, PRIMARY KEY(`district_id`))");
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `sub_district` (`sub_district_id` INTEGER NOT NULL, `sub_district_name_th` TEXT, `sub_district_name_en` TEXT, `district_id` INTEGER NOT NULL, PRIMARY KEY(`sub_district_id`))");
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `postcode` (`postcode_id` INTEGER NOT NULL, `postcode` TEXT NOT NULL, `district_id` INTEGER NOT NULL, PRIMARY KEY(`postcode_id`))");
            supportSQLiteDatabase.execSQL(RoomMasterTable.CREATE_QUERY);
            supportSQLiteDatabase.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '238d80c17c8e3d42604a3f0ed8eb6ffd')");
        }

        @Override // androidx.room.RoomOpenHelper.Delegate
        public void dropAllTables(SupportSQLiteDatabase supportSQLiteDatabase) {
            supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `province`");
            supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `district`");
            supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `sub_district`");
            supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `postcode`");
            List<RoomDatabase.Callback> list = ((RoomDatabase) RoomLocationDatabase_Impl.this).mCallbacks;
            if (list != null) {
                for (RoomDatabase.Callback callback : list) {
                    callback.onDestructiveMigration(supportSQLiteDatabase);
                }
            }
        }

        @Override // androidx.room.RoomOpenHelper.Delegate
        public void onCreate(SupportSQLiteDatabase supportSQLiteDatabase) {
            List<RoomDatabase.Callback> list = ((RoomDatabase) RoomLocationDatabase_Impl.this).mCallbacks;
            if (list != null) {
                for (RoomDatabase.Callback callback : list) {
                    callback.onCreate(supportSQLiteDatabase);
                }
            }
        }

        @Override // androidx.room.RoomOpenHelper.Delegate
        public void onOpen(SupportSQLiteDatabase supportSQLiteDatabase) {
            ((RoomDatabase) RoomLocationDatabase_Impl.this).mDatabase = supportSQLiteDatabase;
            RoomLocationDatabase_Impl.this.internalInitInvalidationTracker(supportSQLiteDatabase);
            List<RoomDatabase.Callback> list = ((RoomDatabase) RoomLocationDatabase_Impl.this).mCallbacks;
            if (list != null) {
                for (RoomDatabase.Callback callback : list) {
                    callback.onOpen(supportSQLiteDatabase);
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
            HashMap hashMap = new HashMap(4);
            hashMap.put("country_code", new TableInfo.Column("country_code", Constant.CampaignType.TYPE_TEXT, true, 0, null, 1));
            hashMap.put("province_name_th", new TableInfo.Column("province_name_th", Constant.CampaignType.TYPE_TEXT, true, 0, null, 1));
            hashMap.put("province_name_en", new TableInfo.Column("province_name_en", Constant.CampaignType.TYPE_TEXT, true, 0, null, 1));
            hashMap.put("province_id", new TableInfo.Column("province_id", "INTEGER", true, 1, null, 1));
            TableInfo tableInfo = new TableInfo("province", hashMap, new HashSet(0), new HashSet(0));
            TableInfo read = TableInfo.read(supportSQLiteDatabase, "province");
            if (!tableInfo.equals(read)) {
                return new RoomOpenHelper.ValidationResult(false, "province(th.co.dtac.android.dtacone.data.cache.room.entity.Province).\n Expected:\n" + tableInfo + "\n Found:\n" + read);
            }
            HashMap hashMap2 = new HashMap(4);
            hashMap2.put("district_id", new TableInfo.Column("district_id", "INTEGER", true, 1, null, 1));
            hashMap2.put("district_name_th", new TableInfo.Column("district_name_th", Constant.CampaignType.TYPE_TEXT, false, 0, null, 1));
            hashMap2.put("district_name_en", new TableInfo.Column("district_name_en", Constant.CampaignType.TYPE_TEXT, false, 0, null, 1));
            hashMap2.put("province_id", new TableInfo.Column("province_id", "INTEGER", true, 0, null, 1));
            TableInfo tableInfo2 = new TableInfo("district", hashMap2, new HashSet(0), new HashSet(0));
            TableInfo read2 = TableInfo.read(supportSQLiteDatabase, "district");
            if (!tableInfo2.equals(read2)) {
                return new RoomOpenHelper.ValidationResult(false, "district(th.co.dtac.android.dtacone.data.cache.room.entity.District).\n Expected:\n" + tableInfo2 + "\n Found:\n" + read2);
            }
            HashMap hashMap3 = new HashMap(4);
            hashMap3.put("sub_district_id", new TableInfo.Column("sub_district_id", "INTEGER", true, 1, null, 1));
            hashMap3.put("sub_district_name_th", new TableInfo.Column("sub_district_name_th", Constant.CampaignType.TYPE_TEXT, false, 0, null, 1));
            hashMap3.put("sub_district_name_en", new TableInfo.Column("sub_district_name_en", Constant.CampaignType.TYPE_TEXT, false, 0, null, 1));
            hashMap3.put("district_id", new TableInfo.Column("district_id", "INTEGER", true, 0, null, 1));
            TableInfo tableInfo3 = new TableInfo("sub_district", hashMap3, new HashSet(0), new HashSet(0));
            TableInfo read3 = TableInfo.read(supportSQLiteDatabase, "sub_district");
            if (!tableInfo3.equals(read3)) {
                return new RoomOpenHelper.ValidationResult(false, "sub_district(th.co.dtac.android.dtacone.data.cache.room.entity.SubDistrict).\n Expected:\n" + tableInfo3 + "\n Found:\n" + read3);
            }
            HashMap hashMap4 = new HashMap(3);
            hashMap4.put("postcode_id", new TableInfo.Column("postcode_id", "INTEGER", true, 1, null, 1));
            hashMap4.put("postcode", new TableInfo.Column("postcode", Constant.CampaignType.TYPE_TEXT, true, 0, null, 1));
            hashMap4.put("district_id", new TableInfo.Column("district_id", "INTEGER", true, 0, null, 1));
            TableInfo tableInfo4 = new TableInfo("postcode", hashMap4, new HashSet(0), new HashSet(0));
            TableInfo read4 = TableInfo.read(supportSQLiteDatabase, "postcode");
            if (!tableInfo4.equals(read4)) {
                return new RoomOpenHelper.ValidationResult(false, "postcode(th.co.dtac.android.dtacone.data.cache.room.entity.PostCode).\n Expected:\n" + tableInfo4 + "\n Found:\n" + read4);
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
            writableDatabase.execSQL("DELETE FROM `province`");
            writableDatabase.execSQL("DELETE FROM `district`");
            writableDatabase.execSQL("DELETE FROM `sub_district`");
            writableDatabase.execSQL("DELETE FROM `postcode`");
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
    @NonNull
    public InvalidationTracker createInvalidationTracker() {
        return new InvalidationTracker(this, new HashMap(0), new HashMap(0), "province", "district", "sub_district", "postcode");
    }

    @Override // androidx.room.RoomDatabase
    @NonNull
    public SupportSQLiteOpenHelper createOpenHelper(@NonNull DatabaseConfiguration databaseConfiguration) {
        return databaseConfiguration.sqliteOpenHelperFactory.create(SupportSQLiteOpenHelper.Configuration.builder(databaseConfiguration.context).name(databaseConfiguration.name).callback(new RoomOpenHelper(databaseConfiguration, new C14211a(1), "238d80c17c8e3d42604a3f0ed8eb6ffd", "657d735b6a8eb9f5ed9380ace8708af0")).build());
    }

    @Override // th.p047co.dtac.android.dtacone.data.cache.room.RoomLocationDatabase
    public DistrictDao districtDao() {
        DistrictDao districtDao;
        if (this.f83460n != null) {
            return this.f83460n;
        }
        synchronized (this) {
            try {
                if (this.f83460n == null) {
                    this.f83460n = new DistrictDao_Impl(this);
                }
                districtDao = this.f83460n;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return districtDao;
    }

    @Override // androidx.room.RoomDatabase
    @NonNull
    public List<Migration> getAutoMigrations(@NonNull Map<Class<? extends AutoMigrationSpec>, AutoMigrationSpec> map) {
        return new ArrayList();
    }

    @Override // androidx.room.RoomDatabase
    @NonNull
    public Set<Class<? extends AutoMigrationSpec>> getRequiredAutoMigrationSpecs() {
        return new HashSet();
    }

    @Override // androidx.room.RoomDatabase
    @NonNull
    public Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
        HashMap hashMap = new HashMap();
        hashMap.put(ProvinceDao.class, ProvinceDao_Impl.getRequiredConverters());
        hashMap.put(DistrictDao.class, DistrictDao_Impl.getRequiredConverters());
        hashMap.put(SubDistrictDao.class, SubDistrictDao_Impl.getRequiredConverters());
        hashMap.put(PostCodeDao.class, PostCodeDao_Impl.getRequiredConverters());
        return hashMap;
    }

    @Override // th.p047co.dtac.android.dtacone.data.cache.room.RoomLocationDatabase
    public PostCodeDao postCodeDao() {
        PostCodeDao postCodeDao;
        if (this.f83462p != null) {
            return this.f83462p;
        }
        synchronized (this) {
            try {
                if (this.f83462p == null) {
                    this.f83462p = new PostCodeDao_Impl(this);
                }
                postCodeDao = this.f83462p;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return postCodeDao;
    }

    @Override // th.p047co.dtac.android.dtacone.data.cache.room.RoomLocationDatabase
    public ProvinceDao provinceDao() {
        ProvinceDao provinceDao;
        if (this.f83459m != null) {
            return this.f83459m;
        }
        synchronized (this) {
            try {
                if (this.f83459m == null) {
                    this.f83459m = new ProvinceDao_Impl(this);
                }
                provinceDao = this.f83459m;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return provinceDao;
    }

    @Override // th.p047co.dtac.android.dtacone.data.cache.room.RoomLocationDatabase
    public SubDistrictDao subDistrictDao() {
        SubDistrictDao subDistrictDao;
        if (this.f83461o != null) {
            return this.f83461o;
        }
        synchronized (this) {
            try {
                if (this.f83461o == null) {
                    this.f83461o = new SubDistrictDao_Impl(this);
                }
                subDistrictDao = this.f83461o;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return subDistrictDao;
    }
}
