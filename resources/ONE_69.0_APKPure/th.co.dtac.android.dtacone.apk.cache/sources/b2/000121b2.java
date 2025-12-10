package th.p047co.dtac.android.dtacone.presenter.bitmap;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m29142d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Boolean;)V"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.presenter.bitmap.DeleteBitmapPresenter$deleteAllOptionalWatermarkImage$1 */
/* loaded from: classes8.dex */
public final class DeleteBitmapPresenter$deleteAllOptionalWatermarkImage$1 extends Lambda implements Function1<Boolean, Unit> {
    final /* synthetic */ DeleteBitmapPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeleteBitmapPresenter$deleteAllOptionalWatermarkImage$1(DeleteBitmapPresenter deleteBitmapPresenter) {
        super(1);
        this.this$0 = deleteBitmapPresenter;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        invoke2(bool);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Boolean bool) {
        String unused;
        unused = this.this$0.f85312e;
        StringBuilder sb = new StringBuilder();
        sb.append("Delete watermark bitmap: ");
        sb.append(bool);
    }
}