package th.p047co.dtac.android.dtacone.widget.compose.signature;

import android.graphics.Bitmap;
import androidx.compose.p003ui.platform.ComposeView;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.widget.compose.signature.ComposeSignatureCustomKt$captureBitmap$2 */
/* loaded from: classes9.dex */
public /* synthetic */ class ComposeSignatureCustomKt$captureBitmap$2 extends FunctionReferenceImpl implements Function0<Bitmap> {
    final /* synthetic */ ComposeView $composeView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposeSignatureCustomKt$captureBitmap$2(ComposeView composeView) {
        super(0, Intrinsics.Kotlin.class, "captureBitmap", "captureBitmap$captureBitmap(Landroidx/compose/ui/platform/ComposeView;)Landroid/graphics/Bitmap;", 0);
        this.$composeView = composeView;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final Bitmap invoke() {
        Bitmap m1775a;
        m1775a = ComposeSignatureCustomKt.m1775a(this.$composeView);
        return m1775a;
    }
}