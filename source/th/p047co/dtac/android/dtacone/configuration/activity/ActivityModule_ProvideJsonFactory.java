package th.p047co.dtac.android.dtacone.configuration.activity;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import org.json.JSONObject;

@ScopeMetadata("th.co.dtac.android.dtacone.configuration.PerActivity")
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.configuration.activity.ActivityModule_ProvideJsonFactory */
/* loaded from: classes7.dex */
public final class ActivityModule_ProvideJsonFactory implements Factory<JSONObject> {

    /* renamed from: a */
    public final ActivityModule f83417a;

    public ActivityModule_ProvideJsonFactory(ActivityModule activityModule) {
        this.f83417a = activityModule;
    }

    public static ActivityModule_ProvideJsonFactory create(ActivityModule activityModule) {
        return new ActivityModule_ProvideJsonFactory(activityModule);
    }

    public static JSONObject provideJson(ActivityModule activityModule) {
        return (JSONObject) Preconditions.checkNotNullFromProvides(activityModule.provideJson());
    }

    @Override // javax.inject.Provider
    public JSONObject get() {
        return provideJson(this.f83417a);
    }
}
