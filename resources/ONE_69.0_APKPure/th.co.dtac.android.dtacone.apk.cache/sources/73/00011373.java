package th.p047co.dtac.android.dtacone.configuration;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.data.cache.room.RoomLocationDatabase;
import th.p047co.dtac.android.dtacone.data.cache.room.dao.ProvinceDao;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.configuration.RoomModule_ProvideProvinceDaoFactory */
/* loaded from: classes7.dex */
public final class RoomModule_ProvideProvinceDaoFactory implements Factory<ProvinceDao> {

    /* renamed from: a */
    public final RoomModule f83304a;

    /* renamed from: b */
    public final Provider f83305b;

    public RoomModule_ProvideProvinceDaoFactory(RoomModule roomModule, Provider<RoomLocationDatabase> provider) {
        this.f83304a = roomModule;
        this.f83305b = provider;
    }

    public static RoomModule_ProvideProvinceDaoFactory create(RoomModule roomModule, Provider<RoomLocationDatabase> provider) {
        return new RoomModule_ProvideProvinceDaoFactory(roomModule, provider);
    }

    public static ProvinceDao provideProvinceDao(RoomModule roomModule, RoomLocationDatabase roomLocationDatabase) {
        return (ProvinceDao) Preconditions.checkNotNullFromProvides(roomModule.provideProvinceDao(roomLocationDatabase));
    }

    @Override // javax.inject.Provider
    public ProvinceDao get() {
        return provideProvinceDao(this.f83304a, (RoomLocationDatabase) this.f83305b.get());
    }
}