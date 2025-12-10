package androidx.work.impl.model;

import android.database.Cursor;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.p007db.SupportSQLiteStatement;
import androidx.work.impl.model.SystemIdInfoDao;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class SystemIdInfoDao_Impl implements SystemIdInfoDao {

    /* renamed from: a */
    public final RoomDatabase f38579a;

    /* renamed from: b */
    public final EntityInsertionAdapter f38580b;

    /* renamed from: c */
    public final SharedSQLiteStatement f38581c;

    /* renamed from: d */
    public final SharedSQLiteStatement f38582d;

    /* renamed from: androidx.work.impl.model.SystemIdInfoDao_Impl$a */
    /* loaded from: classes.dex */
    public class C5258a extends EntityInsertionAdapter {
        public C5258a(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`generation`,`system_id`) VALUES (?,?,?)";
        }

        @Override // androidx.room.EntityInsertionAdapter
        /* renamed from: d */
        public void bind(SupportSQLiteStatement supportSQLiteStatement, SystemIdInfo systemIdInfo) {
            String str = systemIdInfo.workSpecId;
            if (str == null) {
                supportSQLiteStatement.bindNull(1);
            } else {
                supportSQLiteStatement.bindString(1, str);
            }
            supportSQLiteStatement.bindLong(2, systemIdInfo.getGeneration());
            supportSQLiteStatement.bindLong(3, systemIdInfo.systemId);
        }
    }

    /* renamed from: androidx.work.impl.model.SystemIdInfoDao_Impl$b */
    /* loaded from: classes.dex */
    public class C5259b extends SharedSQLiteStatement {
        public C5259b(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "DELETE FROM SystemIdInfo where work_spec_id=? AND generation=?";
        }
    }

    /* renamed from: androidx.work.impl.model.SystemIdInfoDao_Impl$c */
    /* loaded from: classes.dex */
    public class C5260c extends SharedSQLiteStatement {
        public C5260c(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "DELETE FROM SystemIdInfo where work_spec_id=?";
        }
    }

    public SystemIdInfoDao_Impl(RoomDatabase roomDatabase) {
        this.f38579a = roomDatabase;
        this.f38580b = new C5258a(roomDatabase);
        this.f38581c = new C5259b(roomDatabase);
        this.f38582d = new C5260c(roomDatabase);
    }

    public static List<Class<?>> getRequiredConverters() {
        return Collections.emptyList();
    }

    @Override // androidx.work.impl.model.SystemIdInfoDao
    public SystemIdInfo getSystemIdInfo(String str, int i) {
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT * FROM SystemIdInfo WHERE work_spec_id=? AND generation=?", 2);
        if (str == null) {
            acquire.bindNull(1);
        } else {
            acquire.bindString(1, str);
        }
        acquire.bindLong(2, i);
        this.f38579a.assertNotSuspendingTransaction();
        SystemIdInfo systemIdInfo = null;
        String string = null;
        Cursor query = DBUtil.query(this.f38579a, acquire, false, null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, "work_spec_id");
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, "generation");
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "system_id");
            if (query.moveToFirst()) {
                if (!query.isNull(columnIndexOrThrow)) {
                    string = query.getString(columnIndexOrThrow);
                }
                systemIdInfo = new SystemIdInfo(string, query.getInt(columnIndexOrThrow2), query.getInt(columnIndexOrThrow3));
            }
            return systemIdInfo;
        } finally {
            query.close();
            acquire.release();
        }
    }

    @Override // androidx.work.impl.model.SystemIdInfoDao
    public List<String> getWorkSpecIds() {
        String string;
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT DISTINCT work_spec_id FROM SystemIdInfo", 0);
        this.f38579a.assertNotSuspendingTransaction();
        Cursor query = DBUtil.query(this.f38579a, acquire, false, null);
        try {
            ArrayList arrayList = new ArrayList(query.getCount());
            while (query.moveToNext()) {
                if (query.isNull(0)) {
                    string = null;
                } else {
                    string = query.getString(0);
                }
                arrayList.add(string);
            }
            return arrayList;
        } finally {
            query.close();
            acquire.release();
        }
    }

    @Override // androidx.work.impl.model.SystemIdInfoDao
    public void insertSystemIdInfo(SystemIdInfo systemIdInfo) {
        this.f38579a.assertNotSuspendingTransaction();
        this.f38579a.beginTransaction();
        try {
            this.f38580b.insert((EntityInsertionAdapter) systemIdInfo);
            this.f38579a.setTransactionSuccessful();
        } finally {
            this.f38579a.endTransaction();
        }
    }

    @Override // androidx.work.impl.model.SystemIdInfoDao
    public void removeSystemIdInfo(String str, int i) {
        this.f38579a.assertNotSuspendingTransaction();
        SupportSQLiteStatement acquire = this.f38581c.acquire();
        if (str == null) {
            acquire.bindNull(1);
        } else {
            acquire.bindString(1, str);
        }
        acquire.bindLong(2, i);
        this.f38579a.beginTransaction();
        try {
            acquire.executeUpdateDelete();
            this.f38579a.setTransactionSuccessful();
        } finally {
            this.f38579a.endTransaction();
            this.f38581c.release(acquire);
        }
    }

    @Override // androidx.work.impl.model.SystemIdInfoDao
    public void removeSystemIdInfo(String str) {
        this.f38579a.assertNotSuspendingTransaction();
        SupportSQLiteStatement acquire = this.f38582d.acquire();
        if (str == null) {
            acquire.bindNull(1);
        } else {
            acquire.bindString(1, str);
        }
        this.f38579a.beginTransaction();
        try {
            acquire.executeUpdateDelete();
            this.f38579a.setTransactionSuccessful();
        } finally {
            this.f38579a.endTransaction();
            this.f38582d.release(acquire);
        }
    }

    @Override // androidx.work.impl.model.SystemIdInfoDao
    public SystemIdInfo getSystemIdInfo(WorkGenerationalId workGenerationalId) {
        return SystemIdInfoDao.DefaultImpls.getSystemIdInfo(this, workGenerationalId);
    }

    @Override // androidx.work.impl.model.SystemIdInfoDao
    public void removeSystemIdInfo(WorkGenerationalId workGenerationalId) {
        SystemIdInfoDao.DefaultImpls.removeSystemIdInfo(this, workGenerationalId);
    }
}
