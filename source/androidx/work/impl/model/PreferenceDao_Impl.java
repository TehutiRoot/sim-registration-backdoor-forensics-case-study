package androidx.work.impl.model;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.DBUtil;
import androidx.sqlite.p007db.SupportSQLiteStatement;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class PreferenceDao_Impl implements PreferenceDao {

    /* renamed from: a */
    public final RoomDatabase f38568a;

    /* renamed from: b */
    public final EntityInsertionAdapter f38569b;

    /* renamed from: androidx.work.impl.model.PreferenceDao_Impl$a */
    /* loaded from: classes.dex */
    public class C5254a extends EntityInsertionAdapter {
        public C5254a(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)";
        }

        @Override // androidx.room.EntityInsertionAdapter
        /* renamed from: d */
        public void bind(SupportSQLiteStatement supportSQLiteStatement, Preference preference) {
            if (preference.getKey() == null) {
                supportSQLiteStatement.bindNull(1);
            } else {
                supportSQLiteStatement.bindString(1, preference.getKey());
            }
            if (preference.getValue() == null) {
                supportSQLiteStatement.bindNull(2);
            } else {
                supportSQLiteStatement.bindLong(2, preference.getValue().longValue());
            }
        }
    }

    /* renamed from: androidx.work.impl.model.PreferenceDao_Impl$b */
    /* loaded from: classes.dex */
    public class CallableC5255b implements Callable {

        /* renamed from: a */
        public final /* synthetic */ RoomSQLiteQuery f38571a;

        public CallableC5255b(RoomSQLiteQuery roomSQLiteQuery) {
            this.f38571a = roomSQLiteQuery;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Long call() {
            Long l = null;
            Cursor query = DBUtil.query(PreferenceDao_Impl.this.f38568a, this.f38571a, false, null);
            try {
                if (query.moveToFirst() && !query.isNull(0)) {
                    l = Long.valueOf(query.getLong(0));
                }
                return l;
            } finally {
                query.close();
            }
        }

        public void finalize() {
            this.f38571a.release();
        }
    }

    public PreferenceDao_Impl(RoomDatabase roomDatabase) {
        this.f38568a = roomDatabase;
        this.f38569b = new C5254a(roomDatabase);
    }

    public static List<Class<?>> getRequiredConverters() {
        return Collections.emptyList();
    }

    @Override // androidx.work.impl.model.PreferenceDao
    public Long getLongValue(String str) {
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT long_value FROM Preference where `key`=?", 1);
        if (str == null) {
            acquire.bindNull(1);
        } else {
            acquire.bindString(1, str);
        }
        this.f38568a.assertNotSuspendingTransaction();
        Long l = null;
        Cursor query = DBUtil.query(this.f38568a, acquire, false, null);
        try {
            if (query.moveToFirst() && !query.isNull(0)) {
                l = Long.valueOf(query.getLong(0));
            }
            return l;
        } finally {
            query.close();
            acquire.release();
        }
    }

    @Override // androidx.work.impl.model.PreferenceDao
    public LiveData<Long> getObservableLongValue(String str) {
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT long_value FROM Preference where `key`=?", 1);
        if (str == null) {
            acquire.bindNull(1);
        } else {
            acquire.bindString(1, str);
        }
        return this.f38568a.getInvalidationTracker().createLiveData(new String[]{"Preference"}, false, new CallableC5255b(acquire));
    }

    @Override // androidx.work.impl.model.PreferenceDao
    public void insertPreference(Preference preference) {
        this.f38568a.assertNotSuspendingTransaction();
        this.f38568a.beginTransaction();
        try {
            this.f38569b.insert((EntityInsertionAdapter) preference);
            this.f38568a.setTransactionSuccessful();
        } finally {
            this.f38568a.endTransaction();
        }
    }
}
