package th.p047co.dtac.android.dtacone.view.appOne.stvProSermOnline.fragment;

import android.text.Editable;
import android.widget.TextView;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.apache.commons.cli.HelpFormatter;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.model.stv.BalanceResponse;
import th.p047co.dtac.android.dtacone.app_one.viewmodel.stv.OneStvProsermOnlineViewModel;
import th.p047co.dtac.android.dtacone.app_one.widget.OnePhoneBookEditText;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.StatusResource;
import th.p047co.dtac.android.dtacone.util.format.MoneyFormat;

@Metadata(m29143d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u000122\u0010\u0002\u001a.\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004 \u0007*\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\b"}, m29142d2 = {"<anonymous>", "", "resource", "Lth/co/dtac/android/dtacone/model/Resource;", "Lkotlin/Pair;", "", "Lth/co/dtac/android/dtacone/app_one/model/stv/BalanceResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.stvProSermOnline.fragment.OneProsermOnlineInputNumberFragment$initViewModel$1$8 */
/* loaded from: classes10.dex */
public final class OneProsermOnlineInputNumberFragment$initViewModel$1$8 extends Lambda implements Function1<Resource<? extends Pair<? extends Boolean, ? extends BalanceResponse>>, Unit> {
    final /* synthetic */ OneStvProsermOnlineViewModel $this_apply;
    final /* synthetic */ OneProsermOnlineInputNumberFragment this$0;

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.stvProSermOnline.fragment.OneProsermOnlineInputNumberFragment$initViewModel$1$8$WhenMappings */
    /* loaded from: classes10.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[StatusResource.values().length];
            try {
                iArr[StatusResource.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StatusResource.LOADING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[StatusResource.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneProsermOnlineInputNumberFragment$initViewModel$1$8(OneProsermOnlineInputNumberFragment oneProsermOnlineInputNumberFragment, OneStvProsermOnlineViewModel oneStvProsermOnlineViewModel) {
        super(1);
        this.this$0 = oneProsermOnlineInputNumberFragment;
        this.$this_apply = oneStvProsermOnlineViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Resource<? extends Pair<? extends Boolean, ? extends BalanceResponse>> resource) {
        invoke2((Resource<Pair<Boolean, BalanceResponse>>) resource);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Resource<Pair<Boolean, BalanceResponse>> resource) {
        TextView textView;
        String str;
        TextView textView2;
        OnePhoneBookEditText onePhoneBookEditText;
        BalanceResponse.Data data;
        BalanceResponse.Data data2;
        TextView textView3;
        TextView textView4;
        int i = WhenMappings.$EnumSwitchMapping$0[resource.getStatus().ordinal()];
        TextView textView5 = null;
        if (i != 1) {
            if (i == 2) {
                this.this$0.showLoading();
                return;
            } else if (i != 3) {
                return;
            } else {
                this.this$0.dismissLoading();
                textView3 = this.this$0.f97599p;
                if (textView3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("tvLastUpdate");
                    textView3 = null;
                }
                textView3.setText("");
                textView4 = this.this$0.f97600q;
                if (textView4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("tvBalance");
                } else {
                    textView5 = textView4;
                }
                textView5.setText(this.this$0.getString(R.string.empty_balance_case));
                return;
            }
        }
        this.this$0.dismissLoading();
        Pair<Boolean, BalanceResponse> data3 = resource.getData();
        Pair<Boolean, BalanceResponse> data4 = resource.getData();
        boolean booleanValue = data4 != null ? data4.getFirst().booleanValue() : false;
        BalanceResponse second = data3 != null ? data3.getSecond() : null;
        textView = this.this$0.f97599p;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tvLastUpdate");
            textView = null;
        }
        OneProsermOnlineInputNumberFragment oneProsermOnlineInputNumberFragment = this.this$0;
        int i2 = R.string.one_stv_balance_update;
        if (second == null || (data2 = second.getData()) == null || (str = data2.getDisplayDate()) == null) {
            str = HelpFormatter.DEFAULT_OPT_PREFIX;
        }
        textView.setText(oneProsermOnlineInputNumberFragment.getString(i2, str));
        textView2 = this.this$0.f97600q;
        if (textView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tvBalance");
            textView2 = null;
        }
        textView2.setText(MoneyFormat.convertToMoneyFormatWithBigDecimal((second == null || (data = second.getData()) == null || (r2 = data.getBalance()) == null) ? "0" : "0"));
        if (booleanValue) {
            this.$this_apply.setRefresh(false);
            onePhoneBookEditText = this.this$0.f97597n;
            if (onePhoneBookEditText == null) {
                Intrinsics.throwUninitializedPropertyAccessException("onePhoneBookEditText");
                onePhoneBookEditText = null;
            }
            Editable text = onePhoneBookEditText.getText();
            if (text == null || text.length() != 12) {
                return;
            }
            OneProsermOnlineInputNumberFragment.m9815J(this.this$0, null, 1, null);
            return;
        }
        OneStvProsermOnlineViewModel.callGetSTVPackagesTrueCompany$default(this.$this_apply, null, 1, null);
    }
}