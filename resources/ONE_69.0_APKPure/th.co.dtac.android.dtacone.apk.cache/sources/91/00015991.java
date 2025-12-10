package th.p047co.dtac.android.dtacone.viewmodel.mrtr_pre2post;

import io.reactivex.ObservableSource;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.model.upload_image.request.UploadImageRequest;
import th.p047co.dtac.android.dtacone.model.upload_image.response.UploadImageResponse;
import th.p047co.dtac.android.dtacone.repository.mrtr_pre2post.MrtrPre2PostRepository;

@Metadata(m29143d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, m29142d2 = {"<anonymous>", "Lio/reactivex/ObservableSource;", "Lth/co/dtac/android/dtacone/model/upload_image/response/UploadImageResponse;", "kotlin.jvm.PlatformType", "it", "", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.viewmodel.mrtr_pre2post.MrtrPre2PostViewModel$uploadImage$1 */
/* loaded from: classes9.dex */
public final class MrtrPre2PostViewModel$uploadImage$1 extends Lambda implements Function1<String, ObservableSource<? extends UploadImageResponse>> {
    final /* synthetic */ MrtrPre2PostViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MrtrPre2PostViewModel$uploadImage$1(MrtrPre2PostViewModel mrtrPre2PostViewModel) {
        super(1);
        this.this$0 = mrtrPre2PostViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final ObservableSource<? extends UploadImageResponse> invoke(@NotNull String it) {
        MrtrPre2PostRepository mrtrPre2PostRepository;
        MrtrPre2PostRepository mrtrPre2PostRepository2;
        String m2189K;
        MrtrPre2PostRepository mrtrPre2PostRepository3;
        Intrinsics.checkNotNullParameter(it, "it");
        mrtrPre2PostRepository = this.this$0.f106609c;
        mrtrPre2PostRepository2 = this.this$0.f106609c;
        String simCardNumber = mrtrPre2PostRepository2.getModel().getSimCardNumber();
        m2189K = this.this$0.m2189K(it);
        mrtrPre2PostRepository3 = this.this$0.f106609c;
        return mrtrPre2PostRepository.uploadImage(new UploadImageRequest(simCardNumber, m2189K, "M_PRE2POST", mrtrPre2PostRepository3.getModel().getSubscriberNumber(), null, 16, null)).toObservable();
    }
}