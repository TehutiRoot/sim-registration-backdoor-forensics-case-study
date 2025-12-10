package th.p047co.dtac.android.dtacone.view.appOne.registration.activity;

import android.content.Intent;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.Event;
import th.p047co.dtac.android.dtacone.util.Constant;
import th.p047co.dtac.android.dtacone.view.appOne.home.activity.OneHomeActivity;

@Metadata(m29143d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m29142d2 = {"<anonymous>", "", "stringEvent", "Lth/co/dtac/android/dtacone/model/Event;", "", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.registration.activity.OneRegistrationActivity$initViewModelLogin$5 */
/* loaded from: classes10.dex */
public final class OneRegistrationActivity$initViewModelLogin$5 extends Lambda implements Function1<Event<? extends String>, Unit> {
    final /* synthetic */ String $phoneNumber;
    final /* synthetic */ OneRegistrationActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneRegistrationActivity$initViewModelLogin$5(OneRegistrationActivity oneRegistrationActivity, String str) {
        super(1);
        this.this$0 = oneRegistrationActivity;
        this.$phoneNumber = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Event<? extends String> event) {
        invoke2((Event<String>) event);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Event<String> event) {
        if (event.getContentIfNotHandled() != null) {
            Intent intent = new Intent(this.this$0, OneHomeActivity.class);
            intent.addFlags(268468224);
            intent.putExtra(Constant.IntentConstant.RETAILER_PHONE_NUMBER, this.$phoneNumber);
            intent.putExtra(Constant.IntentConstant.HOME_FROM_LOGIN, true);
            this.this$0.startActivity(intent);
            this.this$0.overridePendingTransition(17432576, 17432577);
        }
    }
}