package th.p047co.dtac.android.dtacone.data.cache.room.dao;

import android.database.Cursor;
import androidx.annotation.NonNull;
import androidx.room.CoroutinesRoom;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.coroutines.Continuation;
import th.p047co.dtac.android.dtacone.data.cache.room.entity.PostCode;

/* renamed from: th.co.dtac.android.dtacone.data.cache.room.dao.PostCodeDao_Impl */
/* loaded from: classes7.dex */
public final class PostCodeDao_Impl implements PostCodeDao {

    /* renamed from: a */
    public final RoomDatabase f83469a;

    /* renamed from: th.co.dtac.android.dtacone.data.cache.room.dao.PostCodeDao_Impl$a */
    /* loaded from: classes7.dex */
    public class CallableC14214a implements Callable {

        /* renamed from: a */
        public final /* synthetic */ RoomSQLiteQuery f83470a;

        public CallableC14214a(RoomSQLiteQuery roomSQLiteQuery) {
            this.f83470a = roomSQLiteQuery;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public List call() {
            String string;
            Cursor query = DBUtil.query(PostCodeDao_Impl.this.f83469a, this.f83470a, false, null);
            try {
                int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, "postcode_id");
                int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, "postcode");
                int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "district_id");
                ArrayList arrayList = new ArrayList(query.getCount());
                while (query.moveToNext()) {
                    long j = query.getLong(columnIndexOrThrow);
                    if (query.isNull(columnIndexOrThrow2)) {
                        string = null;
                    } else {
                        string = query.getString(columnIndexOrThrow2);
                    }
                    arrayList.add(new PostCode(j, string, query.getLong(columnIndexOrThrow3)));
                }
                return arrayList;
            } finally {
                query.close();
                this.f83470a.release();
            }
        }
    }

    /* renamed from: th.co.dtac.android.dtacone.data.cache.room.dao.PostCodeDao_Impl$b */
    /* loaded from: classes7.dex */
    public class CallableC14215b implements Callable {

        /* renamed from: a */
        public final /* synthetic */ RoomSQLiteQuery f83472a;

        public CallableC14215b(RoomSQLiteQuery roomSQLiteQuery) {
            this.f83472a = roomSQLiteQuery;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public List call() {
            String string;
            Cursor query = DBUtil.query(PostCodeDao_Impl.this.f83469a, this.f83472a, false, null);
            try {
                int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, "postcode_id");
                int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, "postcode");
                int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "district_id");
                ArrayList arrayList = new ArrayList(query.getCount());
                while (query.moveToNext()) {
                    long j = query.getLong(columnIndexOrThrow);
                    if (query.isNull(columnIndexOrThrow2)) {
                        string = null;
                    } else {
                        string = query.getString(columnIndexOrThrow2);
                    }
                    arrayList.add(new PostCode(j, string, query.getLong(columnIndexOrThrow3)));
                }
                return arrayList;
            } finally {
                query.close();
                this.f83472a.release();
            }
        }
    }

    public PostCodeDao_Impl(@NonNull RoomDatabase roomDatabase) {
        this.f83469a = roomDatabase;
    }

    @NonNull
    public static List<Class<?>> getRequiredConverters() {
        return Collections.emptyList();
    }

    @Override // th.p047co.dtac.android.dtacone.data.cache.room.dao.PostCodeDao
    public Object getAll(Continuation<? super List<PostCode>> continuation) {
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT * FROM postcode", 0);
        return CoroutinesRoom.execute(this.f83469a, false, DBUtil.createCancellationSignal(), new CallableC14214a(acquire), continuation);
    }

    @Override // th.p047co.dtac.android.dtacone.data.cache.room.dao.PostCodeDao
    public Object getByDistrictId(long j, Continuation<? super List<PostCode>> continuation) {
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT * FROM postcode WHERE district_id = ?", 1);
        acquire.bindLong(1, j);
        return CoroutinesRoom.execute(this.f83469a, false, DBUtil.createCancellationSignal(), new CallableC14215b(acquire), continuation);
    }
}
