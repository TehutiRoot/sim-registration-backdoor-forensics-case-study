package th.p047co.dtac.android.dtacone.view.fragment.login;

import android.content.Intent;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.util.Constant;
import th.p047co.dtac.android.dtacone.view.appOne.sellerID.activity.OneShopListActivity;

@Metadata(m29143d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m29142d2 = {"<anonymous>", "", "it", "", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.fragment.login.LogInFragment$onStart$1$8 */
/* loaded from: classes9.dex */
public final class LogInFragment$onStart$1$8 extends Lambda implements Function1<String, Unit> {
    final /* synthetic */ LogInFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LogInFragment$onStart$1$8(LogInFragment logInFragment) {
        super(1);
        this.this$0 = logInFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Intent intent = new Intent(this.this$0.requireActivity(), OneShopListActivity.class);
        LogInFragment logInFragment = this.this$0;
        intent.putExtra(Constant.IntentConstant.GO_BACK_TO_LOGIN, true);
        intent.putExtra(Constant.IntentConstant.RETAILER_PHONE_NUMBER, it);
        logInFragment.m6699K();
        this.this$0.startActivity(intent);
    }
}