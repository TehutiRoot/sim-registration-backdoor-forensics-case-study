package th.p047co.dtac.android.dtacone.presenter.bitmap;

import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p046rx.Observable;

@Metadata(m29143d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u000e\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00050\u0005H\n¢\u0006\u0002\b\u0006"}, m29142d2 = {"<anonymous>", "Lrx/Observable;", "", "kotlin.jvm.PlatformType", "imageName", "", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.presenter.bitmap.DeleteBitmapPresenter$deleteImageObs$2 */
/* loaded from: classes8.dex */
public final class DeleteBitmapPresenter$deleteImageObs$2 extends Lambda implements Function1<String, Observable<? extends Boolean>> {
    final /* synthetic */ DeleteBitmapPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeleteBitmapPresenter$deleteImageObs$2(DeleteBitmapPresenter deleteBitmapPresenter) {
        super(1);
        this.this$0 = deleteBitmapPresenter;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Boolean invoke$lambda$0(DeleteBitmapPresenter this$0, String str) {
        boolean m18896z;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        m18896z = this$0.m18896z(str);
        return Boolean.valueOf(m18896z);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Observable<? extends Boolean> invoke(final String str) {
        final DeleteBitmapPresenter deleteBitmapPresenter = this.this$0;
        return Observable.fromCallable(new Callable() { // from class: th.co.dtac.android.dtacone.presenter.bitmap.d
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Boolean invoke$lambda$0;
                invoke$lambda$0 = DeleteBitmapPresenter$deleteImageObs$2.invoke$lambda$0(DeleteBitmapPresenter.this, str);
                return invoke$lambda$0;
            }
        });
    }
}