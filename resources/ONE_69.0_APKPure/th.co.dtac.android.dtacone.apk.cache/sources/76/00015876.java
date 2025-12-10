package th.p047co.dtac.android.dtacone.viewmodel.mrtr_mnp;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.model.postcode.Data;
import th.p047co.dtac.android.dtacone.model.postcode.GetPostCodeInfoResponse;
import th.p047co.dtac.android.dtacone.repository.mrtr_mnp.MrtrMnpRepository;

@Metadata(m29143d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m29142d2 = {"<anonymous>", "", "response", "Lth/co/dtac/android/dtacone/model/postcode/GetPostCodeInfoResponse;", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.viewmodel.mrtr_mnp.MrtrMnpValidateViewModel$getMailingPostCodeInfo$1$1 */
/* loaded from: classes9.dex */
public final class MrtrMnpValidateViewModel$getMailingPostCodeInfo$1$1 extends Lambda implements Function1<GetPostCodeInfoResponse, Unit> {
    final /* synthetic */ MrtrMnpValidateViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MrtrMnpValidateViewModel$getMailingPostCodeInfo$1$1(MrtrMnpValidateViewModel mrtrMnpValidateViewModel) {
        super(1);
        this.this$0 = mrtrMnpValidateViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(GetPostCodeInfoResponse getPostCodeInfoResponse) {
        invoke2(getPostCodeInfoResponse);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull GetPostCodeInfoResponse response) {
        MrtrMnpRepository mrtrMnpRepository;
        MrtrMnpRepository mrtrMnpRepository2;
        MrtrMnpRepository mrtrMnpRepository3;
        Intrinsics.checkNotNullParameter(response, "response");
        if (!response.getData().isEmpty()) {
            Object first = CollectionsKt___CollectionsKt.first((List<? extends Object>) response.getData());
            MrtrMnpValidateViewModel mrtrMnpValidateViewModel = this.this$0;
            Data data = (Data) first;
            mrtrMnpRepository = mrtrMnpValidateViewModel.f106322b;
            mrtrMnpRepository.setMailingPostCode(data.getPostcode());
            mrtrMnpRepository2 = mrtrMnpValidateViewModel.f106322b;
            mrtrMnpRepository2.setMailingPostcodeSequenceString(String.valueOf(data.getPostcodeSequence()));
            mrtrMnpRepository3 = mrtrMnpValidateViewModel.f106322b;
            mrtrMnpRepository3.setMailingProvinceCode(data.getProvinceCode());
        }
    }
}