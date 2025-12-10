package th.p047co.dtac.android.dtacone.configuration;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.data.cache.room.RoomLocationDatabase;
import th.p047co.dtac.android.dtacone.data.cache.room.dao.DistrictDao;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.configuration.RoomModule_ProvideDistrictDaoFactory */
/* loaded from: classes7.dex */
public final class RoomModule_ProvideDistrictDaoFactory implements Factory<DistrictDao> {

    /* renamed from: a */
    public final RoomModule f83300a;

    /* renamed from: b */
    public final Provider f83301b;

    public RoomModule_ProvideDistrictDaoFactory(RoomModule roomModule, Provider<RoomLocationDatabase> provider) {
        this.f83300a = roomModule;
        this.f83301b = provider;
    }

    public static RoomModule_ProvideDistrictDaoFactory create(RoomModule roomModule, Provider<RoomLocationDatabase> provider) {
        return new RoomModule_ProvideDistrictDaoFactory(roomModule, provider);
    }

    public static DistrictDao provideDistrictDao(RoomModule roomModule, RoomLocationDatabase roomLocationDatabase) {
        return (DistrictDao) Preconditions.checkNotNullFromProvides(roomModule.provideDistrictDao(roomLocationDatabase));
    }

    @Override // javax.inject.Provider
    public DistrictDao get() {
        return provideDistrictDao(this.f83300a, (RoomLocationDatabase) this.f83301b.get());
    }
}