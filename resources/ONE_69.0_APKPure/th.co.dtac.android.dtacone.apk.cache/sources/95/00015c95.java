package th.p047co.dtac.android.dtacone.widget.compose.signature;

import androidx.compose.p003ui.graphics.ImageBitmap;
import androidx.compose.runtime.MutableState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.widget.compose.signature.SignaturePageScreenKt$SignaturePageScreen$13$1 */
/* loaded from: classes9.dex */
public final class SignaturePageScreenKt$SignaturePageScreen$13$1 extends Lambda implements Function1<ImageBitmap, Unit> {
    final /* synthetic */ MutableState<ImageBitmap> $imageBitmap$delegate;
    final /* synthetic */ MutableState<Boolean> $showBottomSheet;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SignaturePageScreenKt$SignaturePageScreen$13$1(MutableState<Boolean> mutableState, MutableState<ImageBitmap> mutableState2) {
        super(1);
        this.$showBottomSheet = mutableState;
        this.$imageBitmap$delegate = mutableState2;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ImageBitmap imageBitmap) {
        invoke2(imageBitmap);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull ImageBitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        SignaturePageScreenKt.m1753v(this.$imageBitmap$delegate, bitmap);
        this.$showBottomSheet.setValue(Boolean.FALSE);
    }
}