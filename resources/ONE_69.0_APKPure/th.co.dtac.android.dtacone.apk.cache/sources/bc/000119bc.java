package th.p047co.dtac.android.dtacone.manager.messaging.module;

import android.app.Application;
import android.app.NotificationManager;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.manager.messaging.module.NotificationModule_ProvideNotificationManagerFactory */
/* loaded from: classes7.dex */
public final class NotificationModule_ProvideNotificationManagerFactory implements Factory<NotificationManager> {

    /* renamed from: a */
    public final NotificationModule f85078a;

    /* renamed from: b */
    public final Provider f85079b;

    public NotificationModule_ProvideNotificationManagerFactory(NotificationModule notificationModule, Provider<Application> provider) {
        this.f85078a = notificationModule;
        this.f85079b = provider;
    }

    public static NotificationModule_ProvideNotificationManagerFactory create(NotificationModule notificationModule, Provider<Application> provider) {
        return new NotificationModule_ProvideNotificationManagerFactory(notificationModule, provider);
    }

    public static NotificationManager provideNotificationManager(NotificationModule notificationModule, Application application) {
        return (NotificationManager) Preconditions.checkNotNullFromProvides(notificationModule.provideNotificationManager(application));
    }

    @Override // javax.inject.Provider
    public NotificationManager get() {
        return provideNotificationManager(this.f85078a, (Application) this.f85079b.get());
    }
}