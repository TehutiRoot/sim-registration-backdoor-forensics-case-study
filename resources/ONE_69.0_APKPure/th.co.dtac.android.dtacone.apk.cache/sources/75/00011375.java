package th.p047co.dtac.android.dtacone.configuration;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.data.cache.room.RoomLocationDatabase;
import th.p047co.dtac.android.dtacone.data.cache.room.dao.SubDistrictDao;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.configuration.RoomModule_ProvideSubDistrictDaoFactory */
/* loaded from: classes7.dex */
public final class RoomModule_ProvideSubDistrictDaoFactory implements Factory<SubDistrictDao> {

    /* renamed from: a */
    public final RoomModule f83307a;

    /* renamed from: b */
    public final Provider f83308b;

    public RoomModule_ProvideSubDistrictDaoFactory(RoomModule roomModule, Provider<RoomLocationDatabase> provider) {
        this.f83307a = roomModule;
        this.f83308b = provider;
    }

    public static RoomModule_ProvideSubDistrictDaoFactory create(RoomModule roomModule, Provider<RoomLocationDatabase> provider) {
        return new RoomModule_ProvideSubDistrictDaoFactory(roomModule, provider);
    }

    public static SubDistrictDao provideSubDistrictDao(RoomModule roomModule, RoomLocationDatabase roomLocationDatabase) {
        return (SubDistrictDao) Preconditions.checkNotNullFromProvides(roomModule.provideSubDistrictDao(roomLocationDatabase));
    }

    @Override // javax.inject.Provider
    public SubDistrictDao get() {
        return provideSubDistrictDao(this.f83307a, (RoomLocationDatabase) this.f83308b.get());
    }
}