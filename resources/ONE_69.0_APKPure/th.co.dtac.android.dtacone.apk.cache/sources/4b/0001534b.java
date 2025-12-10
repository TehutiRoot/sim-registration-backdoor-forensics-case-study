package th.p047co.dtac.android.dtacone.view.fragment.take_photo;

import io.fotoapparat.preview.Frame;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.viewmodel.take_photo.QRViewModel;

@Metadata(m29143d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m29142d2 = {"<anonymous>", "", "it", "Lio/fotoapparat/preview/Frame;", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.fragment.take_photo.QrFragment$frameProcess$1 */
/* loaded from: classes9.dex */
public final class QrFragment$frameProcess$1 extends Lambda implements Function1<Frame, Unit> {
    final /* synthetic */ QrFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QrFragment$frameProcess$1(QrFragment qrFragment) {
        super(1);
        this.this$0 = qrFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Frame frame) {
        invoke2(frame);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull Frame it) {
        QRViewModel qRViewModel;
        Intrinsics.checkNotNullParameter(it, "it");
        qRViewModel = this.this$0.f104898p;
        if (qRViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("qrViewModel");
            qRViewModel = null;
        }
        qRViewModel.detectQrImage(it);
    }
}