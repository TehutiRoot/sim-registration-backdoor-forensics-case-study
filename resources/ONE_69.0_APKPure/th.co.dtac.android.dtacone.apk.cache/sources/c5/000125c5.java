package th.p047co.dtac.android.dtacone.presenter.updateprepaid;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.model.updateprepaid.UpdatePrepaidOptionalImage;

@Metadata(m29143d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m29142d2 = {"<anonymous>", "Lth/co/dtac/android/dtacone/model/updateprepaid/UpdatePrepaidOptionalImage;", "kotlin.jvm.PlatformType", "it", "", "invoke", "(Ljava/lang/Boolean;)Lth/co/dtac/android/dtacone/model/updateprepaid/UpdatePrepaidOptionalImage;"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.presenter.updateprepaid.UpdatePrepaidCameraPresenter$deleteImagesObs$3 */
/* loaded from: classes8.dex */
public final class UpdatePrepaidCameraPresenter$deleteImagesObs$3 extends Lambda implements Function1<Boolean, UpdatePrepaidOptionalImage> {
    final /* synthetic */ UpdatePrepaidOptionalImage $optionalImage;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpdatePrepaidCameraPresenter$deleteImagesObs$3(UpdatePrepaidOptionalImage updatePrepaidOptionalImage) {
        super(1);
        this.$optionalImage = updatePrepaidOptionalImage;
    }

    @Override // kotlin.jvm.functions.Function1
    public final UpdatePrepaidOptionalImage invoke(@NotNull Boolean it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return this.$optionalImage;
    }
}