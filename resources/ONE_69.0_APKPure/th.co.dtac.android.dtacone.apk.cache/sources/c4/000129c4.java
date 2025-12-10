package th.p047co.dtac.android.dtacone.view.appOne.buyDol.fragment;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.StatusResource;
import th.p047co.dtac.android.dtacone.view.appOne.buyDol.model.response.OneBuyDolDirectAccountResponse;

@Metadata(m29143d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/Resource;", "Lth/co/dtac/android/dtacone/view/appOne/buyDol/model/response/OneBuyDolDirectAccountResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.buyDol.fragment.OneBuyDolBankAccountFragment$setupObserve$2 */
/* loaded from: classes10.dex */
public final class OneBuyDolBankAccountFragment$setupObserve$2 extends Lambda implements Function1<Resource<? extends OneBuyDolDirectAccountResponse>, Unit> {
    final /* synthetic */ OneBuyDolBankAccountFragment this$0;

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.buyDol.fragment.OneBuyDolBankAccountFragment$setupObserve$2$WhenMappings */
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
    public OneBuyDolBankAccountFragment$setupObserve$2(OneBuyDolBankAccountFragment oneBuyDolBankAccountFragment) {
        super(1);
        this.this$0 = oneBuyDolBankAccountFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Resource<? extends OneBuyDolDirectAccountResponse> resource) {
        invoke2((Resource<OneBuyDolDirectAccountResponse>) resource);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0048, code lost:
        r1 = r0.f88356m;
     */
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void invoke2(th.p047co.dtac.android.dtacone.model.Resource<th.p047co.dtac.android.dtacone.view.appOne.buyDol.model.response.OneBuyDolDirectAccountResponse> r4) {
        /*
            r3 = this;
            if (r4 == 0) goto L68
            th.co.dtac.android.dtacone.model.Resource r4 = r4.getResourceContentIfNotHandled()
            if (r4 == 0) goto L68
            th.co.dtac.android.dtacone.view.appOne.buyDol.fragment.OneBuyDolBankAccountFragment r0 = r3.this$0
            th.co.dtac.android.dtacone.model.StatusResource r1 = r4.getStatus()
            int[] r2 = th.p047co.dtac.android.dtacone.view.appOne.buyDol.fragment.OneBuyDolBankAccountFragment$setupObserve$2.WhenMappings.$EnumSwitchMapping$0
            int r1 = r1.ordinal()
            r1 = r2[r1]
            r2 = 1
            if (r1 == r2) goto L28
            r4 = 2
            if (r1 == r4) goto L24
            r4 = 3
            if (r1 == r4) goto L20
            goto L68
        L20:
            r0.dismissLoading()
            goto L68
        L24:
            r0.showLoading()
            goto L68
        L28:
            r0.dismissLoading()
            java.lang.Object r4 = r4.getData()
            th.co.dtac.android.dtacone.view.appOne.buyDol.model.response.OneBuyDolDirectAccountResponse r4 = (th.p047co.dtac.android.dtacone.view.appOne.buyDol.model.response.OneBuyDolDirectAccountResponse) r4
            th.co.dtac.android.dtacone.view.appOne.buyDol.model.response.OneBuyDolDirectAccountResponse r1 = th.p047co.dtac.android.dtacone.view.appOne.buyDol.fragment.OneBuyDolBankAccountFragment.access$getDirectAccounts$p(r0)
            if (r1 == 0) goto L40
            java.util.List r1 = r1.getDirectAccounts()
            if (r1 == 0) goto L40
            r1.clear()
        L40:
            if (r4 == 0) goto L59
            java.util.List r4 = r4.getDirectAccounts()
            if (r4 == 0) goto L59
            th.co.dtac.android.dtacone.view.appOne.buyDol.model.response.OneBuyDolDirectAccountResponse r1 = th.p047co.dtac.android.dtacone.view.appOne.buyDol.fragment.OneBuyDolBankAccountFragment.access$getDirectAccounts$p(r0)
            if (r1 == 0) goto L59
            java.util.List r1 = r1.getDirectAccounts()
            if (r1 == 0) goto L59
            java.util.Collection r4 = (java.util.Collection) r4
            r1.addAll(r4)
        L59:
            th.co.dtac.android.dtacone.view.appOne.buyDol.adapter.OneBuyDolBankAccountListAdapter r4 = th.p047co.dtac.android.dtacone.view.appOne.buyDol.fragment.OneBuyDolBankAccountFragment.access$getOneBuyDolBankAccountListAdapter$p(r0)
            if (r4 != 0) goto L65
            java.lang.String r4 = "oneBuyDolBankAccountListAdapter"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r4)
            r4 = 0
        L65:
            r4.notifyDataSetChanged()
        L68:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: th.p047co.dtac.android.dtacone.view.appOne.buyDol.fragment.OneBuyDolBankAccountFragment$setupObserve$2.invoke2(th.co.dtac.android.dtacone.model.Resource):void");
    }
}