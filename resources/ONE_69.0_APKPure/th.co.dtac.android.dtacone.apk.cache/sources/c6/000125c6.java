package th.p047co.dtac.android.dtacone.presenter.updateprepaid;

import io.reactivex.ObservableSource;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.model.updateprepaid.UpdatePrepaidOptionalImage;

@Metadata(m29143d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0002H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "Lio/reactivex/ObservableSource;", "Lth/co/dtac/android/dtacone/model/updateprepaid/UpdatePrepaidOptionalImage;", "kotlin.jvm.PlatformType", "it", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.presenter.updateprepaid.UpdatePrepaidCameraPresenter$getOptionalImage$1 */
/* loaded from: classes8.dex */
public final class UpdatePrepaidCameraPresenter$getOptionalImage$1 extends Lambda implements Function1<UpdatePrepaidOptionalImage, ObservableSource<? extends UpdatePrepaidOptionalImage>> {
    final /* synthetic */ UpdatePrepaidCameraPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpdatePrepaidCameraPresenter$getOptionalImage$1(UpdatePrepaidCameraPresenter updatePrepaidCameraPresenter) {
        super(1);
        this.this$0 = updatePrepaidCameraPresenter;
    }

    @Override // kotlin.jvm.functions.Function1
    public final ObservableSource<? extends UpdatePrepaidOptionalImage> invoke(@NotNull UpdatePrepaidOptionalImage it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return this.this$0.deleteImagesObs(it);
    }
}