package th.p047co.dtac.android.dtacone.view.appOne.pre2post.fragment.trueCompany;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.app_one.widget.OneCustomClearableEditText;
import th.p047co.dtac.android.dtacone.model.appOne.pre2post.response.PropositionListItem;
import th.p047co.dtac.android.dtacone.view.appOne.pre2post.viewModel.OnePre2PostViewModel;

@Metadata(m29143d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m29142d2 = {"<anonymous>", "", "item", "Lth/co/dtac/android/dtacone/model/appOne/pre2post/response/PropositionListItem;", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.pre2post.fragment.trueCompany.OnePre2PostSelectPropositionFragment$initView$3$1 */
/* loaded from: classes10.dex */
public final class OnePre2PostSelectPropositionFragment$initView$3$1 extends Lambda implements Function1<PropositionListItem, Unit> {
    final /* synthetic */ OnePre2PostSelectPropositionFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnePre2PostSelectPropositionFragment$initView$3$1(OnePre2PostSelectPropositionFragment onePre2PostSelectPropositionFragment) {
        super(1);
        this.this$0 = onePre2PostSelectPropositionFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(PropositionListItem propositionListItem) {
        invoke2(propositionListItem);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull PropositionListItem item) {
        OnePre2PostViewModel m11039t;
        OneCustomClearableEditText oneCustomClearableEditText;
        Intrinsics.checkNotNullParameter(item, "item");
        m11039t = this.this$0.m11039t();
        m11039t.getOneModel().setPropositionTrueItem(item);
        m11039t.validatePrivilegeTrueCompany();
        oneCustomClearableEditText = this.this$0.f95322k;
        if (oneCustomClearableEditText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("searchPropositionEditText");
            oneCustomClearableEditText = null;
        }
        oneCustomClearableEditText.setText("");
    }
}