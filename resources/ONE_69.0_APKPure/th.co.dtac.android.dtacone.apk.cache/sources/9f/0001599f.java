package th.p047co.dtac.android.dtacone.viewmodel.mrtr_pre2post;

import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import okhttp3.ResponseBody;
import th.p047co.dtac.android.dtacone.model.mnp.IdCardInformationCollection;
import th.p047co.dtac.android.dtacone.model.postcode.Data;
import th.p047co.dtac.android.dtacone.model.postcode.GetPostCodeInfoResponse;
import th.p047co.dtac.android.dtacone.repository.mrtr_pre2post.MrtrPre2PostRepository;

@Metadata(m29143d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012&\u0010\u0002\u001a\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005 \u0006*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0007"}, m29142d2 = {"<anonymous>", "", "it", "Lkotlin/Pair;", "Lokhttp3/ResponseBody;", "Lth/co/dtac/android/dtacone/model/postcode/GetPostCodeInfoResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.viewmodel.mrtr_pre2post.MrtrPre2PostViewModel$verifyIDNumber$7 */
/* loaded from: classes9.dex */
public final class MrtrPre2PostViewModel$verifyIDNumber$7 extends Lambda implements Function1<Pair<? extends ResponseBody, ? extends GetPostCodeInfoResponse>, Unit> {
    final /* synthetic */ IdCardInformationCollection $smartCardData;
    final /* synthetic */ MrtrPre2PostViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MrtrPre2PostViewModel$verifyIDNumber$7(MrtrPre2PostViewModel mrtrPre2PostViewModel, IdCardInformationCollection idCardInformationCollection) {
        super(1);
        this.this$0 = mrtrPre2PostViewModel;
        this.$smartCardData = idCardInformationCollection;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends ResponseBody, ? extends GetPostCodeInfoResponse> pair) {
        invoke2((Pair<? extends ResponseBody, GetPostCodeInfoResponse>) pair);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Pair<? extends ResponseBody, GetPostCodeInfoResponse> pair) {
        MrtrPre2PostRepository mrtrPre2PostRepository;
        MrtrPre2PostRepository mrtrPre2PostRepository2;
        MrtrPre2PostRepository mrtrPre2PostRepository3;
        mrtrPre2PostRepository = this.this$0.f106609c;
        mrtrPre2PostRepository.storeSmartCardData(this.$smartCardData);
        mrtrPre2PostRepository2 = this.this$0.f106609c;
        MrtrPre2PostRepository.storePostCodeInfo$default(mrtrPre2PostRepository2, pair.getSecond(), null, 2, null);
        mrtrPre2PostRepository3 = this.this$0.f106609c;
        mrtrPre2PostRepository3.getModel().setPostCodeFromSmartCard(((Data) CollectionsKt___CollectionsKt.first((List<? extends Object>) pair.getSecond().getData())).getPostcode());
        this.this$0.m2127v0(pair.getFirst());
    }
}