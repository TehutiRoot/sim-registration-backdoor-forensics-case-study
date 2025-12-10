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
import th.p047co.dtac.android.dtacone.data.cache.room.entity.SubDistrict;

/* renamed from: th.co.dtac.android.dtacone.data.cache.room.dao.SubDistrictDao_Impl */
/* loaded from: classes7.dex */
public final class SubDistrictDao_Impl implements SubDistrictDao {

    /* renamed from: a */
    public final RoomDatabase f83477a;

    /* renamed from: th.co.dtac.android.dtacone.data.cache.room.dao.SubDistrictDao_Impl$a */
    /* loaded from: classes7.dex */
    public class CallableC14217a implements Callable {

        /* renamed from: a */
        public final /* synthetic */ RoomSQLiteQuery f83478a;

        public CallableC14217a(RoomSQLiteQuery roomSQLiteQuery) {
            this.f83478a = roomSQLiteQuery;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public List call() {
            String string;
            String string2;
            Cursor query = DBUtil.query(SubDistrictDao_Impl.this.f83477a, this.f83478a, false, null);
            try {
                int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, "sub_district_id");
                int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, "sub_district_name_th");
                int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "sub_district_name_en");
                int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "district_id");
                ArrayList arrayList = new ArrayList(query.getCount());
                while (query.moveToNext()) {
                    long j = query.getLong(columnIndexOrThrow);
                    if (query.isNull(columnIndexOrThrow2)) {
                        string = null;
                    } else {
                        string = query.getString(columnIndexOrThrow2);
                    }
                    if (query.isNull(columnIndexOrThrow3)) {
                        string2 = null;
                    } else {
                        string2 = query.getString(columnIndexOrThrow3);
                    }
                    arrayList.add(new SubDistrict(j, string, string2, query.getLong(columnIndexOrThrow4)));
                }
                return arrayList;
            } finally {
                query.close();
                this.f83478a.release();
            }
        }
    }

    /* renamed from: th.co.dtac.android.dtacone.data.cache.room.dao.SubDistrictDao_Impl$b */
    /* loaded from: classes7.dex */
    public class CallableC14218b implements Callable {

        /* renamed from: a */
        public final /* synthetic */ RoomSQLiteQuery f83480a;

        public CallableC14218b(RoomSQLiteQuery roomSQLiteQuery) {
            this.f83480a = roomSQLiteQuery;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public List call() {
            String string;
            String string2;
            Cursor query = DBUtil.query(SubDistrictDao_Impl.this.f83477a, this.f83480a, false, null);
            try {
                int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, "sub_district_id");
                int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, "sub_district_name_th");
                int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "sub_district_name_en");
                int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "district_id");
                ArrayList arrayList = new ArrayList(query.getCount());
                while (query.moveToNext()) {
                    long j = query.getLong(columnIndexOrThrow);
                    if (query.isNull(columnIndexOrThrow2)) {
                        string = null;
                    } else {
                        string = query.getString(columnIndexOrThrow2);
                    }
                    if (query.isNull(columnIndexOrThrow3)) {
                        string2 = null;
                    } else {
                        string2 = query.getString(columnIndexOrThrow3);
                    }
                    arrayList.add(new SubDistrict(j, string, string2, query.getLong(columnIndexOrThrow4)));
                }
                return arrayList;
            } finally {
                query.close();
                this.f83480a.release();
            }
        }
    }

    public SubDistrictDao_Impl(@NonNull RoomDatabase roomDatabase) {
        this.f83477a = roomDatabase;
    }

    @NonNull
    public static List<Class<?>> getRequiredConverters() {
        return Collections.emptyList();
    }

    @Override // th.p047co.dtac.android.dtacone.data.cache.room.dao.SubDistrictDao
    public Object getAll(Continuation<? super List<SubDistrict>> continuation) {
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT * FROM sub_district", 0);
        return CoroutinesRoom.execute(this.f83477a, false, DBUtil.createCancellationSignal(), new CallableC14217a(acquire), continuation);
    }

    @Override // th.p047co.dtac.android.dtacone.data.cache.room.dao.SubDistrictDao
    public Object getByDistrictId(long j, Continuation<? super List<SubDistrict>> continuation) {
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT * FROM sub_district WHERE district_id = ?", 1);
        acquire.bindLong(1, j);
        return CoroutinesRoom.execute(this.f83477a, false, DBUtil.createCancellationSignal(), new CallableC14218b(acquire), continuation);
    }
}
