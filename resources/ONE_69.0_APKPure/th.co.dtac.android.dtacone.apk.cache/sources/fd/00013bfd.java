package th.p047co.dtac.android.dtacone.view.appOne.pre2post.viewModel;

import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import okhttp3.ResponseBody;
import th.p047co.dtac.android.dtacone.model.postcode.Data;
import th.p047co.dtac.android.dtacone.model.postcode.GetPostCodeInfoResponse;

@Metadata(m29143d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012&\u0010\u0002\u001a\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005 \u0006*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0007"}, m29142d2 = {"<anonymous>", "", "response", "Lkotlin/Pair;", "Lokhttp3/ResponseBody;", "Lth/co/dtac/android/dtacone/model/postcode/GetPostCodeInfoResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.pre2post.viewModel.OnePre2PostViewModel$validateIdNumber$4 */
/* loaded from: classes10.dex */
public final class OnePre2PostViewModel$validateIdNumber$4 extends Lambda implements Function1<Pair<? extends ResponseBody, ? extends GetPostCodeInfoResponse>, Unit> {
    final /* synthetic */ OnePre2PostViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnePre2PostViewModel$validateIdNumber$4(OnePre2PostViewModel onePre2PostViewModel) {
        super(1);
        this.this$0 = onePre2PostViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends ResponseBody, ? extends GetPostCodeInfoResponse> pair) {
        invoke2((Pair<? extends ResponseBody, GetPostCodeInfoResponse>) pair);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Pair<? extends ResponseBody, GetPostCodeInfoResponse> pair) {
        OnePre2PostViewModel.m10877V1(this.this$0, pair.getSecond(), null, 2, null);
        this.this$0.getOneModel().setPostCodeFromSmartCard(((Data) CollectionsKt___CollectionsKt.first((List<? extends Object>) pair.getSecond().getData())).getPostcode());
        this.this$0.m10919H1(pair.getFirst());
    }
}