package th.p047co.dtac.android.dtacone.presenter.image;

import android.graphics.Bitmap;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(m29143d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, m29142d2 = {"<anonymous>", "Lio/reactivex/ObservableSource;", "", "kotlin.jvm.PlatformType", "it", "Landroid/graphics/Bitmap;", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.presenter.image.PreviewImagePresenter$getImagePreviewByNameWithCrop$2 */
/* loaded from: classes8.dex */
public final class PreviewImagePresenter$getImagePreviewByNameWithCrop$2 extends Lambda implements Function1<Bitmap, ObservableSource<? extends byte[]>> {
    final /* synthetic */ PreviewImagePresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreviewImagePresenter$getImagePreviewByNameWithCrop$2(PreviewImagePresenter previewImagePresenter) {
        super(1);
        this.this$0 = previewImagePresenter;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final byte[] invoke$lambda$0(PreviewImagePresenter this$0, Bitmap it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "$it");
        return this$0.getBitmapUtil().cropImage(it);
    }

    @Override // kotlin.jvm.functions.Function1
    public final ObservableSource<? extends byte[]> invoke(@NotNull final Bitmap it) {
        Intrinsics.checkNotNullParameter(it, "it");
        final PreviewImagePresenter previewImagePresenter = this.this$0;
        return Observable.fromCallable(new Callable() { // from class: th.co.dtac.android.dtacone.presenter.image.a
            @Override // java.util.concurrent.Callable
            public final Object call() {
                byte[] invoke$lambda$0;
                invoke$lambda$0 = PreviewImagePresenter$getImagePreviewByNameWithCrop$2.invoke$lambda$0(PreviewImagePresenter.this, it);
                return invoke$lambda$0;
            }
        });
    }
}