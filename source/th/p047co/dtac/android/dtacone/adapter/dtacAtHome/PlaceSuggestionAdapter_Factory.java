package th.p047co.dtac.android.dtacone.adapter.dtacAtHome;

import android.app.Activity;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import java.util.List;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.model.dtacAtHome.placeSuggest.PlaceSuggestionItem;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.adapter.dtacAtHome.PlaceSuggestionAdapter_Factory */
/* loaded from: classes7.dex */
public final class PlaceSuggestionAdapter_Factory implements Factory<PlaceSuggestionAdapter> {

    /* renamed from: a */
    public final Provider f81185a;

    /* renamed from: b */
    public final Provider f81186b;

    public PlaceSuggestionAdapter_Factory(Provider<Activity> provider, Provider<List<PlaceSuggestionItem>> provider2) {
        this.f81185a = provider;
        this.f81186b = provider2;
    }

    public static PlaceSuggestionAdapter_Factory create(Provider<Activity> provider, Provider<List<PlaceSuggestionItem>> provider2) {
        return new PlaceSuggestionAdapter_Factory(provider, provider2);
    }

    public static PlaceSuggestionAdapter newInstance(Activity activity, List<PlaceSuggestionItem> list) {
        return new PlaceSuggestionAdapter(activity, list);
    }

    @Override // javax.inject.Provider
    public PlaceSuggestionAdapter get() {
        return newInstance((Activity) this.f81185a.get(), (List) this.f81186b.get());
    }
}
