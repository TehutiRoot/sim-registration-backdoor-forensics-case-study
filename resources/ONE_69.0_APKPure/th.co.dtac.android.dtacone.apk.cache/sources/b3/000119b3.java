package th.p047co.dtac.android.dtacone.manager.messaging;

import com.google.firebase.messaging.FirebaseMessaging;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.data.cache.realm.RtrRepository;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.manager.messaging.FirebaseMessagingTopic_Factory */
/* loaded from: classes7.dex */
public final class FirebaseMessagingTopic_Factory implements Factory<FirebaseMessagingTopic> {

    /* renamed from: a */
    public final Provider f85072a;

    /* renamed from: b */
    public final Provider f85073b;

    public FirebaseMessagingTopic_Factory(Provider<FirebaseMessaging> provider, Provider<RtrRepository> provider2) {
        this.f85072a = provider;
        this.f85073b = provider2;
    }

    public static FirebaseMessagingTopic_Factory create(Provider<FirebaseMessaging> provider, Provider<RtrRepository> provider2) {
        return new FirebaseMessagingTopic_Factory(provider, provider2);
    }

    public static FirebaseMessagingTopic newInstance(FirebaseMessaging firebaseMessaging, RtrRepository rtrRepository) {
        return new FirebaseMessagingTopic(firebaseMessaging, rtrRepository);
    }

    @Override // javax.inject.Provider
    public FirebaseMessagingTopic get() {
        return newInstance((FirebaseMessaging) this.f85072a.get(), (RtrRepository) this.f85073b.get());
    }
}