package th.p047co.dtac.android.dtacone.view.fragment.customerenquiry;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.apache.commons.cli.HelpFormatter;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.extension.format.StringExtKt;
import th.p047co.dtac.android.dtacone.extension.view.ActivityExtKt;
import th.p047co.dtac.android.dtacone.util.Constant;
import th.p047co.dtac.android.dtacone.view.activity.customerenquiry.CustomerEnquiryActivity;
import th.p047co.dtac.android.dtacone.viewmodel.customerenquiry.SubscriberInfoViewModel;

@Metadata(m29143d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m29142d2 = {"<anonymous>", "", "it", "", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.fragment.customerenquiry.SubscriberListPagerFragment$onViewCreated$2 */
/* loaded from: classes9.dex */
public final class SubscriberListPagerFragment$onViewCreated$2 extends Lambda implements Function1<String, Unit> {
    final /* synthetic */ SubscriberListPagerFragment this$0;

    @Metadata(m29143d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m29142d2 = {"<anonymous>", "", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.fragment.customerenquiry.SubscriberListPagerFragment$onViewCreated$2$1 */
    /* loaded from: classes9.dex */
    public static final class C159391 extends Lambda implements Function0<Unit> {
        final /* synthetic */ String $subscriberNumber;
        final /* synthetic */ SubscriberListPagerFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C159391(SubscriberListPagerFragment subscriberListPagerFragment, String str) {
            super(0);
            this.this$0 = subscriberListPagerFragment;
            this.$subscriberNumber = str;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            SubscriberInfoViewModel subscriberInfoViewModel;
            subscriberInfoViewModel = this.this$0.f99626k;
            if (subscriberInfoViewModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("subscriberInfoViewModel");
                subscriberInfoViewModel = null;
            }
            subscriberInfoViewModel.clearRepository();
            Bundle bundle = new Bundle();
            bundle.putString(CustomerEnquiryActivity.RESULT, CustomerEnquiryActivity.MENU_HOME);
            Intent intent = new Intent(this.this$0.getContext(), CustomerEnquiryActivity.class);
            intent.putExtra("subs_numb", this.$subscriberNumber);
            intent.putExtras(bundle);
            FragmentActivity activity = this.this$0.getActivity();
            if (activity != null) {
                activity.setResult(-1, intent);
                activity.finish();
                activity.startActivity(intent);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubscriberListPagerFragment$onViewCreated$2(SubscriberListPagerFragment subscriberListPagerFragment) {
        super(1);
        this.this$0 = subscriberListPagerFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull String it) {
        String str;
        Intrinsics.checkNotNullParameter(it, "it");
        if (it.length() > 0) {
            str = StringExtKt.maskText(StringExtKt.subscriberToPrefix0(it), Constant.PHONE_FORMAT);
        } else {
            str = HelpFormatter.DEFAULT_OPT_PREFIX;
        }
        FragmentActivity activity = this.this$0.getActivity();
        if (activity != null) {
            String string = this.this$0.getString(R.string.advisory_enquiry_customer_title_goto_service);
            Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.advis…tomer_title_goto_service)");
            String string2 = this.this$0.getString(R.string.advisory_enquiry_customer_goto_search_by_subr);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.advis…omer_goto_search_by_subr)");
            Dialog createConfirmDialogHtmlText = ActivityExtKt.createConfirmDialogHtmlText(activity, string, AbstractC19741eO1.replace(string2, "{{subr}}", "<font color=#00ACE7>" + str + "</font>", false), new C159391(this.this$0, str));
            if (createConfirmDialogHtmlText != null) {
                createConfirmDialogHtmlText.show();
            }
        }
    }
}