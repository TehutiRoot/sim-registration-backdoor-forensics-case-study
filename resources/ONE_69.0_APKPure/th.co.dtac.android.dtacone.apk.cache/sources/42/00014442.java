package th.p047co.dtac.android.dtacone.view.appOne.tol.screen.signaturePage;

import androidx.compose.p003ui.graphics.ImageBitmap;
import androidx.compose.runtime.MutableState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.signaturePage.OneRegisterTrueOnlineSignaturePageScreenKt$OneRegisterTrueOnlineSignaturePageScreen$3$1$3$1 */
/* loaded from: classes10.dex */
public final class C15529x2d5fe2d3 extends Lambda implements Function0<Unit> {
    final /* synthetic */ MutableState<ImageBitmap> $imageBitmap$delegate;
    final /* synthetic */ Function1<ImageBitmap, Unit> $onNext;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C15529x2d5fe2d3(Function1<? super ImageBitmap, Unit> function1, MutableState<ImageBitmap> mutableState) {
        super(0);
        this.$onNext = function1;
        this.$imageBitmap$delegate = mutableState;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ImageBitmap m9425c;
        ImageBitmap m9425c2;
        m9425c = OneRegisterTrueOnlineSignaturePageScreenKt.m9425c(this.$imageBitmap$delegate);
        if (m9425c != null) {
            Function1<ImageBitmap, Unit> function1 = this.$onNext;
            m9425c2 = OneRegisterTrueOnlineSignaturePageScreenKt.m9425c(this.$imageBitmap$delegate);
            Intrinsics.checkNotNull(m9425c2);
            function1.invoke(m9425c2);
            return;
        }
        this.$onNext.invoke(null);
    }
}