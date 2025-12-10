package th.p047co.dtac.android.dtacone.manager.messaging.module;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.data.cache.realm.RtrRepository;
import th.p047co.dtac.android.dtacone.manager.messaging.FirebaseMessagingTopic;

@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.manager.messaging.module.FirebaseModule_ProvideFirebaseTopicFactory */
/* loaded from: classes7.dex */
public final class FirebaseModule_ProvideFirebaseTopicFactory implements Factory<FirebaseMessagingTopic> {

    /* renamed from: a */
    public final FirebaseModule f84966a;

    /* renamed from: b */
    public final Provider f84967b;

    public FirebaseModule_ProvideFirebaseTopicFactory(FirebaseModule firebaseModule, Provider<RtrRepository> provider) {
        this.f84966a = firebaseModule;
        this.f84967b = provider;
    }

    public static FirebaseModule_ProvideFirebaseTopicFactory create(FirebaseModule firebaseModule, Provider<RtrRepository> provider) {
        return new FirebaseModule_ProvideFirebaseTopicFactory(firebaseModule, provider);
    }

    public static FirebaseMessagingTopic provideFirebaseTopic(FirebaseModule firebaseModule, RtrRepository rtrRepository) {
        return (FirebaseMessagingTopic) Preconditions.checkNotNullFromProvides(firebaseModule.provideFirebaseTopic(rtrRepository));
    }

    @Override // javax.inject.Provider
    public FirebaseMessagingTopic get() {
        return provideFirebaseTopic(this.f84966a, (RtrRepository) this.f84967b.get());
    }
}
