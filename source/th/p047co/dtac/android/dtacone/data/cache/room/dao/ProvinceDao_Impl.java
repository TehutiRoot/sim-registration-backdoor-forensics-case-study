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
import th.p047co.dtac.android.dtacone.data.cache.room.entity.Province;

/* renamed from: th.co.dtac.android.dtacone.data.cache.room.dao.ProvinceDao_Impl */
/* loaded from: classes7.dex */
public final class ProvinceDao_Impl implements ProvinceDao {

    /* renamed from: a */
    public final RoomDatabase f83474a;

    /* renamed from: th.co.dtac.android.dtacone.data.cache.room.dao.ProvinceDao_Impl$a */
    /* loaded from: classes7.dex */
    public class CallableC14216a implements Callable {

        /* renamed from: a */
        public final /* synthetic */ RoomSQLiteQuery f83475a;

        public CallableC14216a(RoomSQLiteQuery roomSQLiteQuery) {
            this.f83475a = roomSQLiteQuery;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public List call() {
            String string;
            String string2;
            String string3;
            Cursor query = DBUtil.query(ProvinceDao_Impl.this.f83474a, this.f83475a, false, null);
            try {
                int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, "country_code");
                int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, "province_name_th");
                int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "province_name_en");
                int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "province_id");
                ArrayList arrayList = new ArrayList(query.getCount());
                while (query.moveToNext()) {
                    if (query.isNull(columnIndexOrThrow)) {
                        string = null;
                    } else {
                        string = query.getString(columnIndexOrThrow);
                    }
                    if (query.isNull(columnIndexOrThrow2)) {
                        string2 = null;
                    } else {
                        string2 = query.getString(columnIndexOrThrow2);
                    }
                    if (query.isNull(columnIndexOrThrow3)) {
                        string3 = null;
                    } else {
                        string3 = query.getString(columnIndexOrThrow3);
                    }
                    arrayList.add(new Province(string, string2, string3, query.getLong(columnIndexOrThrow4)));
                }
                return arrayList;
            } finally {
                query.close();
                this.f83475a.release();
            }
        }
    }

    public ProvinceDao_Impl(@NonNull RoomDatabase roomDatabase) {
        this.f83474a = roomDatabase;
    }

    @NonNull
    public static List<Class<?>> getRequiredConverters() {
        return Collections.emptyList();
    }

    @Override // th.p047co.dtac.android.dtacone.data.cache.room.dao.ProvinceDao
    public Object getAll(Continuation<? super List<Province>> continuation) {
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT * FROM province", 0);
        return CoroutinesRoom.execute(this.f83474a, false, DBUtil.createCancellationSignal(), new CallableC14216a(acquire), continuation);
    }
}
