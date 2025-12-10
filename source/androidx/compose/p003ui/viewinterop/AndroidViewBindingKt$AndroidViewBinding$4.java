package androidx.compose.p003ui.viewinterop;

import androidx.viewbinding.ViewBinding;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: androidx.compose.ui.viewinterop.AndroidViewBindingKt$AndroidViewBinding$4 */
/* loaded from: classes2.dex */
public final class AndroidViewBindingKt$AndroidViewBinding$4 extends Lambda implements Function1<T, Unit> {
    public static final AndroidViewBindingKt$AndroidViewBinding$4 INSTANCE = new AndroidViewBindingKt$AndroidViewBinding$4();

    public AndroidViewBindingKt$AndroidViewBinding$4() {
        super(1);
    }

    /* JADX WARN: Incorrect types in method signature: (TT;)V */
    public final void invoke(@NotNull ViewBinding viewBinding) {
        Intrinsics.checkNotNullParameter(viewBinding, "$this$null");
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
        invoke((ViewBinding) obj);
        return Unit.INSTANCE;
    }
}
