package th.p047co.dtac.android.dtacone.view.appOne.tol.screen.signaturePage;

import androidx.compose.p003ui.graphics.ImageBitmap;
import androidx.compose.runtime.MutableState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.signaturePage.OneRegisterTrueOnlineSignaturePageScreenKt$OneRegisterTrueOnlineSignaturePageScreen$3$3$1 */
/* loaded from: classes10.dex */
public final class C15531xfe2ebf46 extends Lambda implements Function1<ImageBitmap, Unit> {
    final /* synthetic */ MutableState<ImageBitmap> $imageBitmap$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15531xfe2ebf46(MutableState<ImageBitmap> mutableState) {
        super(1);
        this.$imageBitmap$delegate = mutableState;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ImageBitmap imageBitmap) {
        invoke2(imageBitmap);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull ImageBitmap it) {
        Intrinsics.checkNotNullParameter(it, "it");
        OneRegisterTrueOnlineSignaturePageScreenKt.m9424d(this.$imageBitmap$delegate, it);
    }
}