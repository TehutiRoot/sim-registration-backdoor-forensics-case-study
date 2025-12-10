package th.p047co.dtac.android.dtacone.view.appOne.buyDol.viewModel;

import co.omise.android.api.Request;
import co.omise.android.models.Token;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.model.buy_dol.OmisePublicKey;

@Metadata(m29143d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, m29142d2 = {"<anonymous>", "Lio/reactivex/ObservableSource;", "Lco/omise/android/models/Token;", "kotlin.jvm.PlatformType", "it", "Lth/co/dtac/android/dtacone/model/buy_dol/OmisePublicKey;", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.buyDol.viewModel.OneBuyDolViewModel$getTokenObservable$1 */
/* loaded from: classes10.dex */
public final class OneBuyDolViewModel$getTokenObservable$1 extends Lambda implements Function1<OmisePublicKey, ObservableSource<? extends Token>> {
    final /* synthetic */ Request<Token> $tokenRequest;
    final /* synthetic */ OneBuyDolViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneBuyDolViewModel$getTokenObservable$1(OneBuyDolViewModel oneBuyDolViewModel, Request<Token> request) {
        super(1);
        this.this$0 = oneBuyDolViewModel;
        this.$tokenRequest = request;
    }

    @Override // kotlin.jvm.functions.Function1
    public final ObservableSource<? extends Token> invoke(@NotNull OmisePublicKey it) {
        Observable m15902K;
        Intrinsics.checkNotNullParameter(it, "it");
        m15902K = this.this$0.m15902K(this.$tokenRequest, it.getPublicKey());
        return m15902K;
    }
}