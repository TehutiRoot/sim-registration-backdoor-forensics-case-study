package androidx.work.impl.model;

import android.database.Cursor;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.DBUtil;
import androidx.sqlite.p007db.SupportSQLiteStatement;
import androidx.work.impl.model.WorkTagDao;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public final class WorkTagDao_Impl implements WorkTagDao {

    /* renamed from: a */
    public final RoomDatabase f38684a;

    /* renamed from: b */
    public final EntityInsertionAdapter f38685b;

    /* renamed from: c */
    public final SharedSQLiteStatement f38686c;

    /* renamed from: androidx.work.impl.model.WorkTagDao_Impl$a */
    /* loaded from: classes.dex */
    public class C5294a extends EntityInsertionAdapter {
        public C5294a(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "INSERT OR IGNORE INTO `WorkTag` (`tag`,`work_spec_id`) VALUES (?,?)";
        }

        @Override // androidx.room.EntityInsertionAdapter
        /* renamed from: d */
        public void bind(SupportSQLiteStatement supportSQLiteStatement, WorkTag workTag) {
            if (workTag.getTag() == null) {
                supportSQLiteStatement.bindNull(1);
            } else {
                supportSQLiteStatement.bindString(1, workTag.getTag());
            }
            if (workTag.getWorkSpecId() == null) {
                supportSQLiteStatement.bindNull(2);
            } else {
                supportSQLiteStatement.bindString(2, workTag.getWorkSpecId());
            }
        }
    }

    /* renamed from: androidx.work.impl.model.WorkTagDao_Impl$b */
    /* loaded from: classes.dex */
    public class C5295b extends SharedSQLiteStatement {
        public C5295b(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "DELETE FROM worktag WHERE work_spec_id=?";
        }
    }

    public WorkTagDao_Impl(RoomDatabase roomDatabase) {
        this.f38684a = roomDatabase;
        this.f38685b = new C5294a(roomDatabase);
        this.f38686c = new C5295b(roomDatabase);
    }

    public static List<Class<?>> getRequiredConverters() {
        return Collections.emptyList();
    }

    @Override // androidx.work.impl.model.WorkTagDao
    public void deleteByWorkSpecId(String str) {
        this.f38684a.assertNotSuspendingTransaction();
        SupportSQLiteStatement acquire = this.f38686c.acquire();
        if (str == null) {
            acquire.bindNull(1);
        } else {
            acquire.bindString(1, str);
        }
        this.f38684a.beginTransaction();
        try {
            acquire.executeUpdateDelete();
            this.f38684a.setTransactionSuccessful();
        } finally {
            this.f38684a.endTransaction();
            this.f38686c.release(acquire);
        }
    }

    @Override // androidx.work.impl.model.WorkTagDao
    public List<String> getTagsForWorkSpecId(String str) {
        String string;
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?", 1);
        if (str == null) {
            acquire.bindNull(1);
        } else {
            acquire.bindString(1, str);
        }
        this.f38684a.assertNotSuspendingTransaction();
        Cursor query = DBUtil.query(this.f38684a, acquire, false, null);
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

    @Override // androidx.work.impl.model.WorkTagDao
    public List<String> getWorkSpecIdsWithTag(String str) {
        String string;
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT work_spec_id FROM worktag WHERE tag=?", 1);
        if (str == null) {
            acquire.bindNull(1);
        } else {
            acquire.bindString(1, str);
        }
        this.f38684a.assertNotSuspendingTransaction();
        Cursor query = DBUtil.query(this.f38684a, acquire, false, null);
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

    @Override // androidx.work.impl.model.WorkTagDao
    public void insert(WorkTag workTag) {
        this.f38684a.assertNotSuspendingTransaction();
        this.f38684a.beginTransaction();
        try {
            this.f38685b.insert((EntityInsertionAdapter) workTag);
            this.f38684a.setTransactionSuccessful();
        } finally {
            this.f38684a.endTransaction();
        }
    }

    @Override // androidx.work.impl.model.WorkTagDao
    public void insertTags(String str, Set<String> set) {
        WorkTagDao.DefaultImpls.insertTags(this, str, set);
    }
}
