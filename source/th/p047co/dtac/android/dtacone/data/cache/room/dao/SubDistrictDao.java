package th.p047co.dtac.android.dtacone.data.cache.room.dao;

import androidx.room.Dao;
import androidx.room.Query;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.data.cache.room.entity.SubDistrict;

@Dao
@Metadata(m28851d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H§@ø\u0001\u0000¢\u0006\u0002\u0010\u0005J\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0007\u001a\u00020\bH§@ø\u0001\u0000¢\u0006\u0002\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\n"}, m28850d2 = {"Lth/co/dtac/android/dtacone/data/cache/room/dao/SubDistrictDao;", "", "getAll", "", "Lth/co/dtac/android/dtacone/data/cache/room/entity/SubDistrict;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getByDistrictId", "districtId", "", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.data.cache.room.dao.SubDistrictDao */
/* loaded from: classes7.dex */
public interface SubDistrictDao {
    @Query("SELECT * FROM sub_district")
    @Nullable
    Object getAll(@NotNull Continuation<? super List<SubDistrict>> continuation);

    @Query("SELECT * FROM sub_district WHERE district_id = :districtId")
    @Nullable
    Object getByDistrictId(long j, @NotNull Continuation<? super List<SubDistrict>> continuation);
}
