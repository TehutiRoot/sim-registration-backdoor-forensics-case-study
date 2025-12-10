package th.p047co.dtac.android.dtacone.view.appOne.deviceSaleTrueCompany.repository;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.true_company.OnePostpaidValidateBlacklist3OperResponse;

@Metadata(m29143d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0004"}, m29142d2 = {"<anonymous>", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/true_company/OnePostpaidValidateBlacklist3OperResponse;", "kotlin.jvm.PlatformType", "it", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.deviceSaleTrueCompany.repository.OneDeviceSaleTrueRepository$validateBlackList$1 */
/* loaded from: classes10.dex */
public final class OneDeviceSaleTrueRepository$validateBlackList$1 extends Lambda implements Function1<OnePostpaidValidateBlacklist3OperResponse, OnePostpaidValidateBlacklist3OperResponse> {
    final /* synthetic */ OneDeviceSaleTrueRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneDeviceSaleTrueRepository$validateBlackList$1(OneDeviceSaleTrueRepository oneDeviceSaleTrueRepository) {
        super(1);
        this.this$0 = oneDeviceSaleTrueRepository;
    }

    @Override // kotlin.jvm.functions.Function1
    public final OnePostpaidValidateBlacklist3OperResponse invoke(@NotNull OnePostpaidValidateBlacklist3OperResponse it) {
        Intrinsics.checkNotNullParameter(it, "it");
        this.this$0.getDeviceSaleModel().setValidateBlacklist3OperData(it.getData());
        return it;
    }
}