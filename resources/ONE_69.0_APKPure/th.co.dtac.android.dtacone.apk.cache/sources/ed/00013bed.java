package th.p047co.dtac.android.dtacone.view.appOne.pre2post.viewModel;

import io.reactivex.ObservableSource;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.model.upload_image.request.UploadImageRequest;
import th.p047co.dtac.android.dtacone.model.upload_image.response.UploadImageResponse;
import th.p047co.dtac.android.dtacone.util.image.ImageUtil;
import th.p047co.dtac.android.dtacone.view.appOne.pre2post.repository.OnePre2PostRepository;

@Metadata(m29143d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, m29142d2 = {"<anonymous>", "Lio/reactivex/ObservableSource;", "Lth/co/dtac/android/dtacone/model/upload_image/response/UploadImageResponse;", "kotlin.jvm.PlatformType", "imageName", "", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.pre2post.viewModel.OnePre2PostViewModel$uploadImage$2 */
/* loaded from: classes10.dex */
public final class OnePre2PostViewModel$uploadImage$2 extends Lambda implements Function1<String, ObservableSource<? extends UploadImageResponse>> {
    final /* synthetic */ OnePre2PostViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnePre2PostViewModel$uploadImage$2(OnePre2PostViewModel onePre2PostViewModel) {
        super(1);
        this.this$0 = onePre2PostViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final ObservableSource<? extends UploadImageResponse> invoke(@NotNull String imageName) {
        OnePre2PostRepository onePre2PostRepository;
        OnePre2PostRepository onePre2PostRepository2;
        ImageUtil imageUtil;
        OnePre2PostRepository onePre2PostRepository3;
        OnePre2PostRepository onePre2PostRepository4;
        Intrinsics.checkNotNullParameter(imageName, "imageName");
        onePre2PostRepository = this.this$0.f95516c;
        onePre2PostRepository2 = this.this$0.f95516c;
        String simCardNumber = onePre2PostRepository2.getOnePre2PostModel().getSimCardNumber();
        imageUtil = this.this$0.f95537j;
        String imageBase64 = imageUtil.getImageBase64(imageName);
        onePre2PostRepository3 = this.this$0.f95516c;
        onePre2PostRepository4 = this.this$0.f95516c;
        return onePre2PostRepository.uploadImage(new UploadImageRequest(simCardNumber, imageBase64, "M_PRE2POST", onePre2PostRepository3.encryptCBC(onePre2PostRepository4.getOnePre2PostModel().getSubscriberNumber()), null, 16, null)).toObservable();
    }
}