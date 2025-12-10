package th.p047co.dtac.android.dtacone.viewmodel.mrtr_postpaid_registration;

import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.mrtr_postpaid.postpaid_validation.Check3LevelResponse;
import th.p047co.dtac.android.dtacone.model.mrtr_postpaid.postpaid_validation.SpecialPackageForNewIDResponse;
import th.p047co.dtac.android.dtacone.repository.mrtr_postpaid.MrtrPostpaidRepository;

@Metadata(m29143d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012&\u0010\u0002\u001a\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005 \u0006*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0007"}, m29142d2 = {"<anonymous>", "", "it", "Lkotlin/Pair;", "Lth/co/dtac/android/dtacone/model/mrtr_postpaid/postpaid_validation/SpecialPackageForNewIDResponse;", "Lth/co/dtac/android/dtacone/model/mrtr_postpaid/postpaid_validation/Check3LevelResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.viewmodel.mrtr_postpaid_registration.MrtrPostpaidValidationViewModel$callSpecialPackageForNewIDAndCheck3Level$4 */
/* loaded from: classes9.dex */
public final class C16626x3295877 extends Lambda implements Function1<Pair<? extends SpecialPackageForNewIDResponse, ? extends Check3LevelResponse>, Unit> {
    final /* synthetic */ MrtrPostpaidValidationViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16626x3295877(MrtrPostpaidValidationViewModel mrtrPostpaidValidationViewModel) {
        super(1);
        this.this$0 = mrtrPostpaidValidationViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends SpecialPackageForNewIDResponse, ? extends Check3LevelResponse> pair) {
        invoke2((Pair<SpecialPackageForNewIDResponse, Check3LevelResponse>) pair);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Pair<SpecialPackageForNewIDResponse, Check3LevelResponse> pair) {
        MrtrPostpaidRepository mrtrPostpaidRepository;
        MrtrPostpaidRepository mrtrPostpaidRepository2;
        mrtrPostpaidRepository = this.this$0.f106550b;
        mrtrPostpaidRepository.setSpecialPackageForNewIDResponse(pair.getFirst());
        mrtrPostpaidRepository2 = this.this$0.f106550b;
        mrtrPostpaidRepository2.setCheck3LevelResponse(pair.getSecond());
        this.this$0.navigateNext();
    }
}