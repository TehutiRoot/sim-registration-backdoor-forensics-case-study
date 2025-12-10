package th.p047co.dtac.android.dtacone.viewmodel.face_recognition.recognition;

import io.reactivex.ObservableSource;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.data.remote.RTRApiRx2;
import th.p047co.dtac.android.dtacone.model.face_recognition.FaceCompareResponse;
import th.p047co.dtac.android.dtacone.presenter.face.FaceRecognitionComparePresenter;

@Metadata(m29143d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, m29142d2 = {"<anonymous>", "Lio/reactivex/ObservableSource;", "Lth/co/dtac/android/dtacone/model/face_recognition/FaceCompareResponse;", "kotlin.jvm.PlatformType", "it", "Lth/co/dtac/android/dtacone/presenter/face/FaceRecognitionComparePresenter$MultiPartCompare;", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.viewmodel.face_recognition.recognition.FaceRecognitionViewModel$compareImageChangeSim$2 */
/* loaded from: classes9.dex */
public final class FaceRecognitionViewModel$compareImageChangeSim$2 extends Lambda implements Function1<FaceRecognitionComparePresenter.MultiPartCompare, ObservableSource<? extends FaceCompareResponse>> {
    final /* synthetic */ String $customerNumber;
    final /* synthetic */ FaceRecognitionViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FaceRecognitionViewModel$compareImageChangeSim$2(FaceRecognitionViewModel faceRecognitionViewModel, String str) {
        super(1);
        this.this$0 = faceRecognitionViewModel;
        this.$customerNumber = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final ObservableSource<? extends FaceCompareResponse> invoke(@NotNull FaceRecognitionComparePresenter.MultiPartCompare it) {
        RTRApiRx2 rTRApiRx2;
        Intrinsics.checkNotNullParameter(it, "it");
        rTRApiRx2 = this.this$0.f105913a;
        return rTRApiRx2.changeSimCompareCustomerPhoto(this.$customerNumber, it.getIdCardMultiPart(), it.getCustomerMultiPart());
    }
}