package th.p047co.dtac.android.dtacone.view.appOne.buyDol.fragment;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.view.appOne.buyDol.model.response.OneBuyDolBankListResponse;

@Metadata(m29143d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m29142d2 = {"<anonymous>", "", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.buyDol.fragment.OneBuyDolBankDetailFragment$setupView$1$1 */
/* loaded from: classes10.dex */
public final class OneBuyDolBankDetailFragment$setupView$1$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ OneBuyDolBankListResponse $detail;
    final /* synthetic */ OneBuyDolBankDetailFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneBuyDolBankDetailFragment$setupView$1$1(OneBuyDolBankDetailFragment oneBuyDolBankDetailFragment, OneBuyDolBankListResponse oneBuyDolBankListResponse) {
        super(0);
        this.this$0 = oneBuyDolBankDetailFragment;
        this.$detail = oneBuyDolBankListResponse;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.this$0.m16043n(this.$detail);
    }
}