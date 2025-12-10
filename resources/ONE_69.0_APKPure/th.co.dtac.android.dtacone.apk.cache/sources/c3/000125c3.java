package th.p047co.dtac.android.dtacone.presenter.updateprepaid;

import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "it", "", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.presenter.updateprepaid.UpdatePrepaidCameraPresenter$deleteImagesObs$1 */
/* loaded from: classes8.dex */
public final class UpdatePrepaidCameraPresenter$deleteImagesObs$1 extends Lambda implements Function1<List<? extends String>, String> {
    public static final UpdatePrepaidCameraPresenter$deleteImagesObs$1 INSTANCE = new UpdatePrepaidCameraPresenter$deleteImagesObs$1();

    public UpdatePrepaidCameraPresenter$deleteImagesObs$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ String invoke(List<? extends String> list) {
        return invoke2((List<String>) list);
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final String invoke2(@NotNull List<String> it) {
        Intrinsics.checkNotNullParameter(it, "it");
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String format = String.format("%s.jpg", Arrays.copyOf(new Object[]{it}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        return format;
    }
}