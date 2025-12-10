package th.p047co.dtac.android.dtacone.configuration;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import th.p047co.dtac.android.dtacone.data.cache.room.RoomLocationDatabase;

@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.configuration.RoomModule_ProvideRoomLocationDatabaseFactory */
/* loaded from: classes7.dex */
public final class RoomModule_ProvideRoomLocationDatabaseFactory implements Factory<RoomLocationDatabase> {

    /* renamed from: a */
    public final RoomModule f83212a;

    public RoomModule_ProvideRoomLocationDatabaseFactory(RoomModule roomModule) {
        this.f83212a = roomModule;
    }

    public static RoomModule_ProvideRoomLocationDatabaseFactory create(RoomModule roomModule) {
        return new RoomModule_ProvideRoomLocationDatabaseFactory(roomModule);
    }

    public static RoomLocationDatabase provideRoomLocationDatabase(RoomModule roomModule) {
        return (RoomLocationDatabase) Preconditions.checkNotNullFromProvides(roomModule.provideRoomLocationDatabase());
    }

    @Override // javax.inject.Provider
    public RoomLocationDatabase get() {
        return provideRoomLocationDatabase(this.f83212a);
    }
}
