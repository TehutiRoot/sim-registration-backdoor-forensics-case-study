package androidx.room.paging;

import android.database.Cursor;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.paging.PositionalDataSource;
import androidx.room.InvalidationTracker;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.sqlite.p007db.SupportSQLiteQuery;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes2.dex */
public abstract class LimitOffsetDataSource<T> extends PositionalDataSource<T> {

    /* renamed from: a */
    public final RoomSQLiteQuery f37426a;

    /* renamed from: b */
    public final String f37427b;

    /* renamed from: c */
    public final String f37428c;

    /* renamed from: d */
    public final RoomDatabase f37429d;

    /* renamed from: e */
    public final InvalidationTracker.Observer f37430e;

    /* renamed from: f */
    public final boolean f37431f;

    /* renamed from: g */
    public final AtomicBoolean f37432g;

    /* renamed from: androidx.room.paging.LimitOffsetDataSource$a */
    /* loaded from: classes2.dex */
    public class C5023a extends InvalidationTracker.Observer {
        public C5023a(String[] strArr) {
            super(strArr);
        }

        @Override // androidx.room.InvalidationTracker.Observer
        public void onInvalidated(Set set) {
            LimitOffsetDataSource.this.invalidate();
        }
    }

    public LimitOffsetDataSource(@NonNull RoomDatabase roomDatabase, @NonNull SupportSQLiteQuery supportSQLiteQuery, boolean z, @NonNull String... strArr) {
        this(roomDatabase, RoomSQLiteQuery.copyFrom(supportSQLiteQuery), z, strArr);
    }

    /* renamed from: a */
    public final RoomSQLiteQuery m52846a(int i, int i2) {
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire(this.f37428c, this.f37426a.getArgCount() + 2);
        acquire.copyArgumentsFrom(this.f37426a);
        acquire.bindLong(acquire.getArgCount() - 1, i2);
        acquire.bindLong(acquire.getArgCount(), i);
        return acquire;
    }

    /* renamed from: b */
    public final void m52845b() {
        if (this.f37432g.compareAndSet(false, true)) {
            this.f37429d.getInvalidationTracker().addWeakObserver(this.f37430e);
        }
    }

    @NonNull
    public abstract List<T> convertRows(@NonNull Cursor cursor);

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public int countItems() {
        m52845b();
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire(this.f37427b, this.f37426a.getArgCount());
        acquire.copyArgumentsFrom(this.f37426a);
        Cursor query = this.f37429d.query(acquire);
        try {
            if (!query.moveToFirst()) {
                return 0;
            }
            return query.getInt(0);
        } finally {
            query.close();
            acquire.release();
        }
    }

    public boolean isInvalid() {
        m52845b();
        this.f37429d.getInvalidationTracker().refreshVersionsSync();
        return super.isInvalid();
    }

    public void loadInitial(@NonNull PositionalDataSource.LoadInitialParams loadInitialParams, @NonNull PositionalDataSource.LoadInitialCallback<T> loadInitialCallback) {
        RoomSQLiteQuery roomSQLiteQuery;
        int i;
        RoomSQLiteQuery roomSQLiteQuery2;
        m52845b();
        List<T> emptyList = Collections.emptyList();
        this.f37429d.beginTransaction();
        Cursor cursor = null;
        try {
            int countItems = countItems();
            if (countItems != 0) {
                int computeInitialLoadPosition = computeInitialLoadPosition(loadInitialParams, countItems);
                roomSQLiteQuery = m52846a(computeInitialLoadPosition, computeInitialLoadSize(loadInitialParams, computeInitialLoadPosition, countItems));
                try {
                    cursor = this.f37429d.query(roomSQLiteQuery);
                    List<T> convertRows = convertRows(cursor);
                    this.f37429d.setTransactionSuccessful();
                    roomSQLiteQuery2 = roomSQLiteQuery;
                    i = computeInitialLoadPosition;
                    emptyList = convertRows;
                } catch (Throwable th2) {
                    th = th2;
                    if (cursor != null) {
                        cursor.close();
                    }
                    this.f37429d.endTransaction();
                    if (roomSQLiteQuery != null) {
                        roomSQLiteQuery.release();
                    }
                    throw th;
                }
            } else {
                i = 0;
                roomSQLiteQuery2 = null;
            }
            if (cursor != null) {
                cursor.close();
            }
            this.f37429d.endTransaction();
            if (roomSQLiteQuery2 != null) {
                roomSQLiteQuery2.release();
            }
            loadInitialCallback.onResult(emptyList, i, countItems);
        } catch (Throwable th3) {
            th = th3;
            roomSQLiteQuery = null;
        }
    }

    public void loadRange(@NonNull PositionalDataSource.LoadRangeParams loadRangeParams, @NonNull PositionalDataSource.LoadRangeCallback<T> loadRangeCallback) {
        loadRangeCallback.onResult(loadRange(loadRangeParams.startPosition, loadRangeParams.loadSize));
    }

    public LimitOffsetDataSource(@NonNull RoomDatabase roomDatabase, @NonNull SupportSQLiteQuery supportSQLiteQuery, boolean z, boolean z2, @NonNull String... strArr) {
        this(roomDatabase, RoomSQLiteQuery.copyFrom(supportSQLiteQuery), z, z2, strArr);
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public List<T> loadRange(int i, int i2) {
        RoomSQLiteQuery m52846a = m52846a(i, i2);
        if (this.f37431f) {
            this.f37429d.beginTransaction();
            Cursor cursor = null;
            try {
                cursor = this.f37429d.query(m52846a);
                List<T> convertRows = convertRows(cursor);
                this.f37429d.setTransactionSuccessful();
                return convertRows;
            } finally {
                if (cursor != null) {
                    cursor.close();
                }
                this.f37429d.endTransaction();
                m52846a.release();
            }
        }
        Cursor query = this.f37429d.query(m52846a);
        try {
            return convertRows(query);
        } finally {
            query.close();
            m52846a.release();
        }
    }

    public LimitOffsetDataSource(@NonNull RoomDatabase roomDatabase, @NonNull RoomSQLiteQuery roomSQLiteQuery, boolean z, @NonNull String... strArr) {
        this(roomDatabase, roomSQLiteQuery, z, true, strArr);
    }

    public LimitOffsetDataSource(@NonNull RoomDatabase roomDatabase, @NonNull RoomSQLiteQuery roomSQLiteQuery, boolean z, boolean z2, @NonNull String... strArr) {
        this.f37432g = new AtomicBoolean(false);
        this.f37429d = roomDatabase;
        this.f37426a = roomSQLiteQuery;
        this.f37431f = z;
        this.f37427b = "SELECT COUNT(*) FROM ( " + roomSQLiteQuery.getSql() + " )";
        this.f37428c = "SELECT * FROM ( " + roomSQLiteQuery.getSql() + " ) LIMIT ? OFFSET ?";
        this.f37430e = new C5023a(strArr);
        if (z2) {
            m52845b();
        }
    }
}
