package th.p047co.dtac.android.dtacone.view.appOne.stvProSermOnline.fragment;

import android.widget.TextView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.apache.commons.cli.HelpFormatter;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.model.stv.BalanceResponse;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.StatusResource;
import th.p047co.dtac.android.dtacone.util.format.MoneyFormat;

@Metadata(m29143d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/Resource;", "Lth/co/dtac/android/dtacone/app_one/model/stv/BalanceResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.stvProSermOnline.fragment.OneProsermOnlineConfirmFragment$setupViewModel$1 */
/* loaded from: classes10.dex */
public final class OneProsermOnlineConfirmFragment$setupViewModel$1 extends Lambda implements Function1<Resource<? extends BalanceResponse>, Unit> {
    final /* synthetic */ OneProsermOnlineConfirmFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneProsermOnlineConfirmFragment$setupViewModel$1(OneProsermOnlineConfirmFragment oneProsermOnlineConfirmFragment) {
        super(1);
        this.this$0 = oneProsermOnlineConfirmFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Resource<? extends BalanceResponse> resource) {
        invoke2((Resource<BalanceResponse>) resource);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Resource<BalanceResponse> resource) {
        TextView textView;
        TextView textView2;
        TextView textView3;
        String str;
        TextView textView4;
        BalanceResponse.Data data;
        BalanceResponse.Data data2;
        TextView textView5 = null;
        if (resource.getStatus() == StatusResource.SUCCESS) {
            BalanceResponse data3 = resource.getData();
            textView3 = this.this$0.f97558n;
            if (textView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("tvLastUpdate");
                textView3 = null;
            }
            OneProsermOnlineConfirmFragment oneProsermOnlineConfirmFragment = this.this$0;
            int i = R.string.one_stv_balance_update;
            if (data3 == null || (data2 = data3.getData()) == null || (str = data2.getDisplayDate()) == null) {
                str = HelpFormatter.DEFAULT_OPT_PREFIX;
            }
            textView3.setText(oneProsermOnlineConfirmFragment.getString(i, str));
            textView4 = this.this$0.f97559o;
            if (textView4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("tvBalance");
            } else {
                textView5 = textView4;
            }
            textView5.setText(MoneyFormat.convertToMoneyFormatWithBigDecimal((data3 == null || (data = data3.getData()) == null || (r9 = data.getBalance()) == null) ? "0" : "0"));
        } else if (resource.getStatus() == StatusResource.ERROR) {
            textView = this.this$0.f97558n;
            if (textView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("tvLastUpdate");
                textView = null;
            }
            textView.setText("");
            textView2 = this.this$0.f97559o;
            if (textView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("tvBalance");
            } else {
                textView5 = textView2;
            }
            textView5.setText(this.this$0.getString(R.string.empty_balance_case));
        }
    }
}