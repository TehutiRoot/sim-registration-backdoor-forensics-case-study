package th.p047co.dtac.android.dtacone.viewmodel.take_photo;

import io.fotoapparat.preview.Frame;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m29142d2 = {"<anonymous>", "", "it", "Lio/fotoapparat/preview/Frame;", "invoke", "(Lio/fotoapparat/preview/Frame;)Ljava/lang/Boolean;"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.viewmodel.take_photo.QRViewModel$start$1$1 */
/* loaded from: classes9.dex */
public final class QRViewModel$start$1$1 extends Lambda implements Function1<Frame, Boolean> {
    final /* synthetic */ QRViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QRViewModel$start$1$1(QRViewModel qRViewModel) {
        super(1);
        this.this$0 = qRViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final Boolean invoke(@NotNull Frame it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Boolean.valueOf(this.this$0.checkPause());
    }
}