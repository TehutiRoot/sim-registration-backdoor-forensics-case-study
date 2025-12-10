package th.p047co.dtac.android.dtacone.view.appOne.pre2post.viewModel;

import io.reactivex.ObservableSource;
import kotlin.Metadata;
import kotlin.collections.IndexedValue;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.uploadImage.request.OneUploadDocumentRequest;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.uploadImage.response.OneUploadDocumentResponse;
import th.p047co.dtac.android.dtacone.util.image.ImageUtil;
import th.p047co.dtac.android.dtacone.view.appOne.pre2post.repository.OnePre2PostRepository;

@Metadata(m29143d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\n¢\u0006\u0002\b\u0007"}, m29142d2 = {"<anonymous>", "Lio/reactivex/ObservableSource;", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/uploadImage/response/OneUploadDocumentResponse;", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "Lkotlin/collections/IndexedValue;", "", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.pre2post.viewModel.OnePre2PostViewModel$uploadImageTrueCompany$1 */
/* loaded from: classes10.dex */
public final class OnePre2PostViewModel$uploadImageTrueCompany$1 extends Lambda implements Function1<IndexedValue<? extends String>, ObservableSource<? extends OneUploadDocumentResponse>> {
    final /* synthetic */ OnePre2PostViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnePre2PostViewModel$uploadImageTrueCompany$1(OnePre2PostViewModel onePre2PostViewModel) {
        super(1);
        this.this$0 = onePre2PostViewModel;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final ObservableSource<? extends OneUploadDocumentResponse> invoke2(@NotNull IndexedValue<String> indexedValue) {
        OnePre2PostRepository onePre2PostRepository;
        ImageUtil imageUtil;
        OnePre2PostRepository onePre2PostRepository2;
        ImageUtil imageUtil2;
        OnePre2PostRepository onePre2PostRepository3;
        ImageUtil imageUtil3;
        int m10923G0;
        Intrinsics.checkNotNullParameter(indexedValue, "<name for destructuring parameter 0>");
        int component1 = indexedValue.component1();
        onePre2PostRepository = this.this$0.f95516c;
        String transactionId = this.this$0.getOneModel().getTransactionId();
        imageUtil = this.this$0.f95537j;
        onePre2PostRepository2 = this.this$0.f95516c;
        String pre2PostDocType = imageUtil.getPre2PostDocType(component1, onePre2PostRepository2.getOnePre2PostModel().getRequireFaceRecognition());
        imageUtil2 = this.this$0.f95537j;
        onePre2PostRepository3 = this.this$0.f95516c;
        String pre2PostDocType2 = imageUtil2.getPre2PostDocType(component1, onePre2PostRepository3.getOnePre2PostModel().getRequireFaceRecognition());
        imageUtil3 = this.this$0.f95537j;
        String imageBase64 = imageUtil3.getImageBase64(indexedValue.component2());
        m10923G0 = this.this$0.m10923G0(component1);
        return onePre2PostRepository.uploadImageTrueCompany(new OneUploadDocumentRequest(transactionId, pre2PostDocType, pre2PostDocType2, "image/jpg", imageBase64, Integer.valueOf(m10923G0), "jpg")).toObservable();
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ ObservableSource<? extends OneUploadDocumentResponse> invoke(IndexedValue<? extends String> indexedValue) {
        return invoke2((IndexedValue<String>) indexedValue);
    }
}