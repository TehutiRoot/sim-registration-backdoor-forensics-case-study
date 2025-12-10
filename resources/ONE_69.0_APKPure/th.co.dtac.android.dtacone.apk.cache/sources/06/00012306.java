package th.p047co.dtac.android.dtacone.presenter.dtacAtHome;

import io.reactivex.ObservableSource;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.model.dtacAtHome.placeSuggest.PlaceSuggestionItem;

@Metadata(m29143d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0002 \u0004* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, m29142d2 = {"<anonymous>", "Lio/reactivex/ObservableSource;", "", "Lth/co/dtac/android/dtacone/model/dtacAtHome/placeSuggest/PlaceSuggestionItem;", "kotlin.jvm.PlatformType", "it", "", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.presenter.dtacAtHome.CheckMapPresenter$getPlaceAutoComplete$2 */
/* loaded from: classes8.dex */
public final class CheckMapPresenter$getPlaceAutoComplete$2 extends Lambda implements Function1<String, ObservableSource<? extends List<? extends PlaceSuggestionItem>>> {
    final /* synthetic */ String $word;
    final /* synthetic */ CheckMapPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheckMapPresenter$getPlaceAutoComplete$2(CheckMapPresenter checkMapPresenter, String str) {
        super(1);
        this.this$0 = checkMapPresenter;
        this.$word = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final ObservableSource<? extends List<PlaceSuggestionItem>> invoke(@NotNull String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return this.this$0.getApi().getDtacAtHomeAutoComplete(this.$word);
    }
}