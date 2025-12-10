package th.p047co.dtac.android.dtacone.repository.mrtr_prepaid_reregist;

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

@Metadata(m29143d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m29142d2 = {"<anonymous>", "", "response", "Lth/co/dtac/android/dtacone/model/postcode/GetPostCodeInfoResponse;", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.repository.mrtr_prepaid_reregist.MrtrPrepaidReregistRepository$getPostCodeInfo$1 */
/* loaded from: classes8.dex */
public final class MrtrPrepaidReregistRepository$getPostCodeInfo$1 extends Lambda implements Function1<GetPostCodeInfoResponse, Unit> {
    final /* synthetic */ MrtrPrepaidReregistRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MrtrPrepaidReregistRepository$getPostCodeInfo$1(MrtrPrepaidReregistRepository mrtrPrepaidReregistRepository) {
        super(1);
        this.this$0 = mrtrPrepaidReregistRepository;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(GetPostCodeInfoResponse getPostCodeInfoResponse) {
        invoke2(getPostCodeInfoResponse);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull GetPostCodeInfoResponse response) {
        Intrinsics.checkNotNullParameter(response, "response");
        if (!response.getData().isEmpty()) {
            Object first = CollectionsKt___CollectionsKt.first((List<? extends Object>) response.getData());
            MrtrPrepaidReregistRepository mrtrPrepaidReregistRepository = this.this$0;
            Data data = (Data) first;
            mrtrPrepaidReregistRepository.getModel().setPostcode(data.getPostcode());
            mrtrPrepaidReregistRepository.getModel().setPostcodeSequence(String.valueOf(data.getPostcodeSequence()));
        }
    }
}