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
import th.p047co.dtac.android.dtacone.data.cache.room.entity.District;

/* renamed from: th.co.dtac.android.dtacone.data.cache.room.dao.DistrictDao_Impl */
/* loaded from: classes7.dex */
public final class DistrictDao_Impl implements DistrictDao {

    /* renamed from: a */
    public final RoomDatabase f83464a;

    /* renamed from: th.co.dtac.android.dtacone.data.cache.room.dao.DistrictDao_Impl$a */
    /* loaded from: classes7.dex */
    public class CallableC14212a implements Callable {

        /* renamed from: a */
        public final /* synthetic */ RoomSQLiteQuery f83465a;

        public CallableC14212a(RoomSQLiteQuery roomSQLiteQuery) {
            this.f83465a = roomSQLiteQuery;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public List call() {
            String string;
            String string2;
            Cursor query = DBUtil.query(DistrictDao_Impl.this.f83464a, this.f83465a, false, null);
            try {
                int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, "district_id");
                int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, "district_name_th");
                int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "district_name_en");
                int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "province_id");
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
                    arrayList.add(new District(j, string, string2, query.getLong(columnIndexOrThrow4)));
                }
                return arrayList;
            } finally {
                query.close();
                this.f83465a.release();
            }
        }
    }

    /* renamed from: th.co.dtac.android.dtacone.data.cache.room.dao.DistrictDao_Impl$b */
    /* loaded from: classes7.dex */
    public class CallableC14213b implements Callable {

        /* renamed from: a */
        public final /* synthetic */ RoomSQLiteQuery f83467a;

        public CallableC14213b(RoomSQLiteQuery roomSQLiteQuery) {
            this.f83467a = roomSQLiteQuery;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public List call() {
            String string;
            String string2;
            Cursor query = DBUtil.query(DistrictDao_Impl.this.f83464a, this.f83467a, false, null);
            try {
                int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, "district_id");
                int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, "district_name_th");
                int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "district_name_en");
                int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "province_id");
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
                    arrayList.add(new District(j, string, string2, query.getLong(columnIndexOrThrow4)));
                }
                return arrayList;
            } finally {
                query.close();
                this.f83467a.release();
            }
        }
    }

    public DistrictDao_Impl(@NonNull RoomDatabase roomDatabase) {
        this.f83464a = roomDatabase;
    }

    @NonNull
    public static List<Class<?>> getRequiredConverters() {
        return Collections.emptyList();
    }

    @Override // th.p047co.dtac.android.dtacone.data.cache.room.dao.DistrictDao
    public Object getAll(Continuation<? super List<District>> continuation) {
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT * FROM district", 0);
        return CoroutinesRoom.execute(this.f83464a, false, DBUtil.createCancellationSignal(), new CallableC14212a(acquire), continuation);
    }

    @Override // th.p047co.dtac.android.dtacone.data.cache.room.dao.DistrictDao
    public Object getByProvinceId(long j, Continuation<? super List<District>> continuation) {
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT * FROM district WHERE province_id = ?", 1);
        acquire.bindLong(1, j);
        return CoroutinesRoom.execute(this.f83464a, false, DBUtil.createCancellationSignal(), new CallableC14213b(acquire), continuation);
    }
}
