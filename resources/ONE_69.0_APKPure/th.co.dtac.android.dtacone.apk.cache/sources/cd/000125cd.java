package th.p047co.dtac.android.dtacone.presenter.updateprepaid;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(m29143d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\u0010\u0000\u001a\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u00012\u001a\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u00012\u001a\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0006"}, m29142d2 = {"<anonymous>", "", "", "kotlin.jvm.PlatformType", "requireIdCard", "optionalCard", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.presenter.updateprepaid.UpdatePrepaidProfileSubmitPresenter$getFileImagesObs$1 */
/* loaded from: classes8.dex */
public final class UpdatePrepaidProfileSubmitPresenter$getFileImagesObs$1 extends Lambda implements Function2<List<? extends String>, List<? extends String>, List<? extends String>> {
    final /* synthetic */ UpdatePrepaidProfileSubmitPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpdatePrepaidProfileSubmitPresenter$getFileImagesObs$1(UpdatePrepaidProfileSubmitPresenter updatePrepaidProfileSubmitPresenter) {
        super(2);
        this.this$0 = updatePrepaidProfileSubmitPresenter;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ List<? extends String> invoke(List<? extends String> list, List<? extends String> list2) {
        return invoke2((List<String>) list, (List<String>) list2);
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final List<String> invoke2(List<String> requireIdCard, List<String> optionalCard) {
        List<String> m17063h;
        UpdatePrepaidProfileSubmitPresenter updatePrepaidProfileSubmitPresenter = this.this$0;
        Intrinsics.checkNotNullExpressionValue(requireIdCard, "requireIdCard");
        Intrinsics.checkNotNullExpressionValue(optionalCard, "optionalCard");
        m17063h = updatePrepaidProfileSubmitPresenter.m17063h(requireIdCard, optionalCard);
        return m17063h;
    }
}