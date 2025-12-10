package androidx.work.impl.model;

import android.database.Cursor;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.DBUtil;
import androidx.sqlite.p007db.SupportSQLiteStatement;
import androidx.work.Data;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class WorkProgressDao_Impl implements WorkProgressDao {

    /* renamed from: a */
    public final RoomDatabase f38595a;

    /* renamed from: b */
    public final EntityInsertionAdapter f38596b;

    /* renamed from: c */
    public final SharedSQLiteStatement f38597c;

    /* renamed from: d */
    public final SharedSQLiteStatement f38598d;

    /* renamed from: androidx.work.impl.model.WorkProgressDao_Impl$a */
    /* loaded from: classes.dex */
    public class C5262a extends EntityInsertionAdapter {
        public C5262a(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "INSERT OR REPLACE INTO `WorkProgress` (`work_spec_id`,`progress`) VALUES (?,?)";
        }

        @Override // androidx.room.EntityInsertionAdapter
        /* renamed from: d */
        public void bind(SupportSQLiteStatement supportSQLiteStatement, WorkProgress workProgress) {
            if (workProgress.getWorkSpecId() == null) {
                supportSQLiteStatement.bindNull(1);
            } else {
                supportSQLiteStatement.bindString(1, workProgress.getWorkSpecId());
            }
            byte[] byteArrayInternal = Data.toByteArrayInternal(workProgress.getProgress());
            if (byteArrayInternal == null) {
                supportSQLiteStatement.bindNull(2);
            } else {
                supportSQLiteStatement.bindBlob(2, byteArrayInternal);
            }
        }
    }

    /* renamed from: androidx.work.impl.model.WorkProgressDao_Impl$b */
    /* loaded from: classes.dex */
    public class C5263b extends SharedSQLiteStatement {
        public C5263b(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "DELETE from WorkProgress where work_spec_id=?";
        }
    }

    /* renamed from: androidx.work.impl.model.WorkProgressDao_Impl$c */
    /* loaded from: classes.dex */
    public class C5264c extends SharedSQLiteStatement {
        public C5264c(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "DELETE FROM WorkProgress";
        }
    }

    public WorkProgressDao_Impl(RoomDatabase roomDatabase) {
        this.f38595a = roomDatabase;
        this.f38596b = new C5262a(roomDatabase);
        this.f38597c = new C5263b(roomDatabase);
        this.f38598d = new C5264c(roomDatabase);
    }

    public static List<Class<?>> getRequiredConverters() {
        return Collections.emptyList();
    }

    @Override // androidx.work.impl.model.WorkProgressDao
    public void delete(String str) {
        this.f38595a.assertNotSuspendingTransaction();
        SupportSQLiteStatement acquire = this.f38597c.acquire();
        if (str == null) {
            acquire.bindNull(1);
        } else {
            acquire.bindString(1, str);
        }
        this.f38595a.beginTransaction();
        try {
            acquire.executeUpdateDelete();
            this.f38595a.setTransactionSuccessful();
        } finally {
            this.f38595a.endTransaction();
            this.f38597c.release(acquire);
        }
    }

    @Override // androidx.work.impl.model.WorkProgressDao
    public void deleteAll() {
        this.f38595a.assertNotSuspendingTransaction();
        SupportSQLiteStatement acquire = this.f38598d.acquire();
        this.f38595a.beginTransaction();
        try {
            acquire.executeUpdateDelete();
            this.f38595a.setTransactionSuccessful();
        } finally {
            this.f38595a.endTransaction();
            this.f38598d.release(acquire);
        }
    }

    @Override // androidx.work.impl.model.WorkProgressDao
    public Data getProgressForWorkSpecId(String str) {
        byte[] blob;
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT progress FROM WorkProgress WHERE work_spec_id=?", 1);
        if (str == null) {
            acquire.bindNull(1);
        } else {
            acquire.bindString(1, str);
        }
        this.f38595a.assertNotSuspendingTransaction();
        Data data = null;
        Cursor query = DBUtil.query(this.f38595a, acquire, false, null);
        try {
            if (query.moveToFirst()) {
                if (query.isNull(0)) {
                    blob = null;
                } else {
                    blob = query.getBlob(0);
                }
                if (blob != null) {
                    data = Data.fromByteArray(blob);
                }
            }
            return data;
        } finally {
            query.close();
            acquire.release();
        }
    }

    @Override // androidx.work.impl.model.WorkProgressDao
    public void insert(WorkProgress workProgress) {
        this.f38595a.assertNotSuspendingTransaction();
        this.f38595a.beginTransaction();
        try {
            this.f38596b.insert((EntityInsertionAdapter) workProgress);
            this.f38595a.setTransactionSuccessful();
        } finally {
            this.f38595a.endTransaction();
        }
    }
}
