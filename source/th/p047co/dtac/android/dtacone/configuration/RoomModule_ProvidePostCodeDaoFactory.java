package th.p047co.dtac.android.dtacone.configuration;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.data.cache.room.RoomLocationDatabase;
import th.p047co.dtac.android.dtacone.data.cache.room.dao.PostCodeDao;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.configuration.RoomModule_ProvidePostCodeDaoFactory */
/* loaded from: classes7.dex */
public final class RoomModule_ProvidePostCodeDaoFactory implements Factory<PostCodeDao> {

    /* renamed from: a */
    public final RoomModule f83208a;

    /* renamed from: b */
    public final Provider f83209b;

    public RoomModule_ProvidePostCodeDaoFactory(RoomModule roomModule, Provider<RoomLocationDatabase> provider) {
        this.f83208a = roomModule;
        this.f83209b = provider;
    }

    public static RoomModule_ProvidePostCodeDaoFactory create(RoomModule roomModule, Provider<RoomLocationDatabase> provider) {
        return new RoomModule_ProvidePostCodeDaoFactory(roomModule, provider);
    }

    public static PostCodeDao providePostCodeDao(RoomModule roomModule, RoomLocationDatabase roomLocationDatabase) {
        return (PostCodeDao) Preconditions.checkNotNullFromProvides(roomModule.providePostCodeDao(roomLocationDatabase));
    }

    @Override // javax.inject.Provider
    public PostCodeDao get() {
        return providePostCodeDao(this.f83208a, (RoomLocationDatabase) this.f83209b.get());
    }
}
