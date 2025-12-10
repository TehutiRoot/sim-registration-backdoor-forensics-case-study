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
    public final RoomSQLiteQuery f37514a;

    /* renamed from: b */
    public final String f37515b;

    /* renamed from: c */
    public final String f37516c;

    /* renamed from: d */
    public final RoomDatabase f37517d;

    /* renamed from: e */
    public final InvalidationTracker.Observer f37518e;

    /* renamed from: f */
    public final boolean f37519f;

    /* renamed from: g */
    public final AtomicBoolean f37520g;

    /* renamed from: androidx.room.paging.LimitOffsetDataSource$a */
    /* loaded from: classes2.dex */
    public class C5005a extends InvalidationTracker.Observer {
        public C5005a(String[] strArr) {
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
    public final RoomSQLiteQuery m52797a(int i, int i2) {
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire(this.f37516c, this.f37514a.getArgCount() + 2);
        acquire.copyArgumentsFrom(this.f37514a);
        acquire.bindLong(acquire.getArgCount() - 1, i2);
        acquire.bindLong(acquire.getArgCount(), i);
        return acquire;
    }

    /* renamed from: b */
    public final void m52796b() {
        if (this.f37520g.compareAndSet(false, true)) {
            this.f37517d.getInvalidationTracker().addWeakObserver(this.f37518e);
        }
    }

    @NonNull
    public abstract List<T> convertRows(@NonNull Cursor cursor);

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public int countItems() {
        m52796b();
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire(this.f37515b, this.f37514a.getArgCount());
        acquire.copyArgumentsFrom(this.f37514a);
        Cursor query = this.f37517d.query(acquire);
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
        m52796b();
        this.f37517d.getInvalidationTracker().refreshVersionsSync();
        return super.isInvalid();
    }

    public void loadInitial(@NonNull PositionalDataSource.LoadInitialParams loadInitialParams, @NonNull PositionalDataSource.LoadInitialCallback<T> loadInitialCallback) {
        RoomSQLiteQuery roomSQLiteQuery;
        int i;
        RoomSQLiteQuery roomSQLiteQuery2;
        m52796b();
        List<T> emptyList = Collections.emptyList();
        this.f37517d.beginTransaction();
        Cursor cursor = null;
        try {
            int countItems = countItems();
            if (countItems != 0) {
                int computeInitialLoadPosition = computeInitialLoadPosition(loadInitialParams, countItems);
                roomSQLiteQuery = m52797a(computeInitialLoadPosition, computeInitialLoadSize(loadInitialParams, computeInitialLoadPosition, countItems));
                try {
                    cursor = this.f37517d.query(roomSQLiteQuery);
                    List<T> convertRows = convertRows(cursor);
                    this.f37517d.setTransactionSuccessful();
                    roomSQLiteQuery2 = roomSQLiteQuery;
                    i = computeInitialLoadPosition;
                    emptyList = convertRows;
                } catch (Throwable th2) {
                    th = th2;
                    if (cursor != null) {
                        cursor.close();
                    }
                    this.f37517d.endTransaction();
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
            this.f37517d.endTransaction();
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
        RoomSQLiteQuery m52797a = m52797a(i, i2);
        if (this.f37519f) {
            this.f37517d.beginTransaction();
            Cursor cursor = null;
            try {
                cursor = this.f37517d.query(m52797a);
                List<T> convertRows = convertRows(cursor);
                this.f37517d.setTransactionSuccessful();
                return convertRows;
            } finally {
                if (cursor != null) {
                    cursor.close();
                }
                this.f37517d.endTransaction();
                m52797a.release();
            }
        }
        Cursor query = this.f37517d.query(m52797a);
        try {
            return convertRows(query);
        } finally {
            query.close();
            m52797a.release();
        }
    }

    public LimitOffsetDataSource(@NonNull RoomDatabase roomDatabase, @NonNull RoomSQLiteQuery roomSQLiteQuery, boolean z, @NonNull String... strArr) {
        this(roomDatabase, roomSQLiteQuery, z, true, strArr);
    }

    public LimitOffsetDataSource(@NonNull RoomDatabase roomDatabase, @NonNull RoomSQLiteQuery roomSQLiteQuery, boolean z, boolean z2, @NonNull String... strArr) {
        this.f37520g = new AtomicBoolean(false);
        this.f37517d = roomDatabase;
        this.f37514a = roomSQLiteQuery;
        this.f37519f = z;
        this.f37515b = "SELECT COUNT(*) FROM ( " + roomSQLiteQuery.getSql() + " )";
        this.f37516c = "SELECT * FROM ( " + roomSQLiteQuery.getSql() + " ) LIMIT ? OFFSET ?";
        this.f37518e = new C5005a(strArr);
        if (z2) {
            m52796b();
        }
    }
}