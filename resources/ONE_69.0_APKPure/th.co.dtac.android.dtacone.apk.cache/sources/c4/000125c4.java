package th.p047co.dtac.android.dtacone.presenter.updateprepaid;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.util.FileUtil;

@Metadata(m29143d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, m29142d2 = {"<anonymous>", "Lio/reactivex/ObservableSource;", "", "kotlin.jvm.PlatformType", "imageFileWithExtension", "", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.presenter.updateprepaid.UpdatePrepaidCameraPresenter$deleteImagesObs$2 */
/* loaded from: classes8.dex */
public final class UpdatePrepaidCameraPresenter$deleteImagesObs$2 extends Lambda implements Function1<String, ObservableSource<? extends Boolean>> {
    final /* synthetic */ UpdatePrepaidCameraPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpdatePrepaidCameraPresenter$deleteImagesObs$2(UpdatePrepaidCameraPresenter updatePrepaidCameraPresenter) {
        super(1);
        this.this$0 = updatePrepaidCameraPresenter;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Boolean invoke$lambda$0(UpdatePrepaidCameraPresenter this$0, String imageFileWithExtension) {
        FileUtil fileUtil;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(imageFileWithExtension, "$imageFileWithExtension");
        fileUtil = this$0.f86704d;
        return Boolean.valueOf(fileUtil.deleteInternalFile(imageFileWithExtension));
    }

    @Override // kotlin.jvm.functions.Function1
    public final ObservableSource<? extends Boolean> invoke(@NotNull final String imageFileWithExtension) {
        Intrinsics.checkNotNullParameter(imageFileWithExtension, "imageFileWithExtension");
        final UpdatePrepaidCameraPresenter updatePrepaidCameraPresenter = this.this$0;
        return Observable.fromCallable(new Callable() { // from class: th.co.dtac.android.dtacone.presenter.updateprepaid.a
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Boolean invoke$lambda$0;
                invoke$lambda$0 = UpdatePrepaidCameraPresenter$deleteImagesObs$2.invoke$lambda$0(UpdatePrepaidCameraPresenter.this, imageFileWithExtension);
                return invoke$lambda$0;
            }
        });
    }
}