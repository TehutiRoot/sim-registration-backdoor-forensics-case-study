package th.p047co.dtac.android.dtacone.view.appOne.postpaid_registration.fragment.true_company;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;

@Metadata(m29143d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m29142d2 = {"<anonymous>", "", "postCode", "", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.postpaid_registration.fragment.true_company.OnePostpaidTrueMailingFragment$getAddressFromOCRUpPassForTrueCompany$4 */
/* loaded from: classes10.dex */
public final class C14971xdb6e4c0f extends Lambda implements Function1<String, Unit> {
    final /* synthetic */ OnePostpaidTrueMailingFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14971xdb6e4c0f(OnePostpaidTrueMailingFragment onePostpaidTrueMailingFragment) {
        super(1);
        this.this$0 = onePostpaidTrueMailingFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull String postCode) {
        OneFontTextView oneFontTextView;
        OneFontTextView oneFontTextView2;
        Intrinsics.checkNotNullParameter(postCode, "postCode");
        oneFontTextView = this.this$0.f94359E;
        OneFontTextView oneFontTextView3 = null;
        if (oneFontTextView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tvPostcode");
            oneFontTextView = null;
        }
        oneFontTextView.setOneTag(postCode);
        oneFontTextView2 = this.this$0.f94359E;
        if (oneFontTextView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tvPostcode");
        } else {
            oneFontTextView3 = oneFontTextView2;
        }
        oneFontTextView3.setText(postCode);
    }
}