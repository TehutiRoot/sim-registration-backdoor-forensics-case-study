package th.p047co.dtac.android.dtacone.configuration.activity;

import android.app.Activity;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata("th.co.dtac.android.dtacone.configuration.PerActivity")
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.configuration.activity.ActivityModule_ActivityFactory */
/* loaded from: classes7.dex */
public final class ActivityModule_ActivityFactory implements Factory<Activity> {

    /* renamed from: a */
    public final ActivityModule f83416a;

    public ActivityModule_ActivityFactory(ActivityModule activityModule) {
        this.f83416a = activityModule;
    }

    public static Activity activity(ActivityModule activityModule) {
        return (Activity) Preconditions.checkNotNullFromProvides(activityModule.activity());
    }

    public static ActivityModule_ActivityFactory create(ActivityModule activityModule) {
        return new ActivityModule_ActivityFactory(activityModule);
    }

    @Override // javax.inject.Provider
    public Activity get() {
        return activity(this.f83416a);
    }
}
