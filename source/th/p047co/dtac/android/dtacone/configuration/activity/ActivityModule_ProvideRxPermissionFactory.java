package th.p047co.dtac.android.dtacone.configuration.activity;

import android.app.Activity;
import com.tbruyelle.rxpermissions2.RxPermissions;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata("th.co.dtac.android.dtacone.configuration.PerActivity")
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.configuration.activity.ActivityModule_ProvideRxPermissionFactory */
/* loaded from: classes7.dex */
public final class ActivityModule_ProvideRxPermissionFactory implements Factory<RxPermissions> {

    /* renamed from: a */
    public final ActivityModule f83418a;

    /* renamed from: b */
    public final Provider f83419b;

    public ActivityModule_ProvideRxPermissionFactory(ActivityModule activityModule, Provider<Activity> provider) {
        this.f83418a = activityModule;
        this.f83419b = provider;
    }

    public static ActivityModule_ProvideRxPermissionFactory create(ActivityModule activityModule, Provider<Activity> provider) {
        return new ActivityModule_ProvideRxPermissionFactory(activityModule, provider);
    }

    public static RxPermissions provideRxPermission(ActivityModule activityModule, Activity activity) {
        return (RxPermissions) Preconditions.checkNotNullFromProvides(activityModule.provideRxPermission(activity));
    }

    @Override // javax.inject.Provider
    public RxPermissions get() {
        return provideRxPermission(this.f83418a, (Activity) this.f83419b.get());
    }
}
