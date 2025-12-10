package th.p047co.dtac.android.dtacone.data.cache.room;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.room.Database;
import androidx.room.RoomDatabase;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.data.cache.room.dao.DistrictDao;
import th.p047co.dtac.android.dtacone.data.cache.room.dao.PostCodeDao;
import th.p047co.dtac.android.dtacone.data.cache.room.dao.ProvinceDao;
import th.p047co.dtac.android.dtacone.data.cache.room.dao.SubDistrictDao;
import th.p047co.dtac.android.dtacone.data.cache.room.entity.District;
import th.p047co.dtac.android.dtacone.data.cache.room.entity.PostCode;
import th.p047co.dtac.android.dtacone.data.cache.room.entity.Province;
import th.p047co.dtac.android.dtacone.data.cache.room.entity.SubDistrict;

@StabilityInferred(parameters = 0)
@Database(entities = {Province.class, District.class, SubDistrict.class, PostCode.class}, exportSchema = false, version = 1)
@Metadata(m28851d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b'\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\bH&J\b\u0010\t\u001a\u00020\nH&¨\u0006\u000b"}, m28850d2 = {"Lth/co/dtac/android/dtacone/data/cache/room/RoomLocationDatabase;", "Landroidx/room/RoomDatabase;", "()V", "districtDao", "Lth/co/dtac/android/dtacone/data/cache/room/dao/DistrictDao;", "postCodeDao", "Lth/co/dtac/android/dtacone/data/cache/room/dao/PostCodeDao;", "provinceDao", "Lth/co/dtac/android/dtacone/data/cache/room/dao/ProvinceDao;", "subDistrictDao", "Lth/co/dtac/android/dtacone/data/cache/room/dao/SubDistrictDao;", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.data.cache.room.RoomLocationDatabase */
/* loaded from: classes7.dex */
public abstract class RoomLocationDatabase extends RoomDatabase {
    public static final int $stable = 0;

    @NotNull
    public abstract DistrictDao districtDao();

    @NotNull
    public abstract PostCodeDao postCodeDao();

    @NotNull
    public abstract ProvinceDao provinceDao();

    @NotNull
    public abstract SubDistrictDao subDistrictDao();
}
