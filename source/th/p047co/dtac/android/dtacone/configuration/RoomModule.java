package th.p047co.dtac.android.dtacone.configuration;

import android.app.Application;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.room.Room;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.data.cache.database.LocationDbHelper;
import th.p047co.dtac.android.dtacone.data.cache.room.RoomLocationDatabase;
import th.p047co.dtac.android.dtacone.data.cache.room.dao.DistrictDao;
import th.p047co.dtac.android.dtacone.data.cache.room.dao.PostCodeDao;
import th.p047co.dtac.android.dtacone.data.cache.room.dao.ProvinceDao;
import th.p047co.dtac.android.dtacone.data.cache.room.dao.SubDistrictDao;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, m28850d2 = {"Lth/co/dtac/android/dtacone/configuration/RoomModule;", "", "Landroid/app/Application;", "application", "<init>", "(Landroid/app/Application;)V", "Lth/co/dtac/android/dtacone/data/cache/room/RoomLocationDatabase;", "provideRoomLocationDatabase", "()Lth/co/dtac/android/dtacone/data/cache/room/RoomLocationDatabase;", "roomLocationDatabase", "Lth/co/dtac/android/dtacone/data/cache/room/dao/ProvinceDao;", "provideProvinceDao", "(Lth/co/dtac/android/dtacone/data/cache/room/RoomLocationDatabase;)Lth/co/dtac/android/dtacone/data/cache/room/dao/ProvinceDao;", "Lth/co/dtac/android/dtacone/data/cache/room/dao/DistrictDao;", "provideDistrictDao", "(Lth/co/dtac/android/dtacone/data/cache/room/RoomLocationDatabase;)Lth/co/dtac/android/dtacone/data/cache/room/dao/DistrictDao;", "Lth/co/dtac/android/dtacone/data/cache/room/dao/SubDistrictDao;", "provideSubDistrictDao", "(Lth/co/dtac/android/dtacone/data/cache/room/RoomLocationDatabase;)Lth/co/dtac/android/dtacone/data/cache/room/dao/SubDistrictDao;", "Lth/co/dtac/android/dtacone/data/cache/room/dao/PostCodeDao;", "providePostCodeDao", "(Lth/co/dtac/android/dtacone/data/cache/room/RoomLocationDatabase;)Lth/co/dtac/android/dtacone/data/cache/room/dao/PostCodeDao;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroid/app/Application;", "getApplication", "()Landroid/app/Application;", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0})
@Module
/* renamed from: th.co.dtac.android.dtacone.configuration.RoomModule */
/* loaded from: classes7.dex */
public final class RoomModule {
    public static final int $stable = 8;

    /* renamed from: a */
    public final Application f83205a;

    public RoomModule(@NotNull Application application) {
        Intrinsics.checkNotNullParameter(application, "application");
        this.f83205a = application;
    }

    @NotNull
    public final Application getApplication() {
        return this.f83205a;
    }

    @Provides
    @NotNull
    public final DistrictDao provideDistrictDao(@NotNull RoomLocationDatabase roomLocationDatabase) {
        Intrinsics.checkNotNullParameter(roomLocationDatabase, "roomLocationDatabase");
        return roomLocationDatabase.districtDao();
    }

    @Provides
    @NotNull
    public final PostCodeDao providePostCodeDao(@NotNull RoomLocationDatabase roomLocationDatabase) {
        Intrinsics.checkNotNullParameter(roomLocationDatabase, "roomLocationDatabase");
        return roomLocationDatabase.postCodeDao();
    }

    @Provides
    @NotNull
    public final ProvinceDao provideProvinceDao(@NotNull RoomLocationDatabase roomLocationDatabase) {
        Intrinsics.checkNotNullParameter(roomLocationDatabase, "roomLocationDatabase");
        return roomLocationDatabase.provinceDao();
    }

    @Provides
    @Singleton
    @NotNull
    public final RoomLocationDatabase provideRoomLocationDatabase() {
        return (RoomLocationDatabase) Room.databaseBuilder(this.f83205a, RoomLocationDatabase.class, LocationDbHelper.DATABASE_LOCATION_NAME).build();
    }

    @Provides
    @NotNull
    public final SubDistrictDao provideSubDistrictDao(@NotNull RoomLocationDatabase roomLocationDatabase) {
        Intrinsics.checkNotNullParameter(roomLocationDatabase, "roomLocationDatabase");
        return roomLocationDatabase.subDistrictDao();
    }
}
