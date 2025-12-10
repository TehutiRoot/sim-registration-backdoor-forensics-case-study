package th.p047co.dtac.android.dtacone.widget.compose.signature;

import android.view.MotionEvent;
import androidx.compose.p003ui.geometry.Offset;
import androidx.compose.p003ui.geometry.OffsetKt;
import androidx.compose.p003ui.graphics.Path;
import androidx.compose.runtime.MutableState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.widget.compose.signature.ComposeSignatureCustomKt$DrawingCanvas$1 */
/* loaded from: classes9.dex */
public final class ComposeSignatureCustomKt$DrawingCanvas$1 extends Lambda implements Function1<MotionEvent, Boolean> {
    final /* synthetic */ Path $currentPath;
    final /* synthetic */ MutableState<Offset> $movePath;
    final /* synthetic */ Function0<Unit> $onUpdateDrawing;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposeSignatureCustomKt$DrawingCanvas$1(Path path, Function0<Unit> function0, MutableState<Offset> mutableState) {
        super(1);
        this.$currentPath = path;
        this.$onUpdateDrawing = function0;
        this.$movePath = mutableState;
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final Boolean invoke(@NotNull MotionEvent it) {
        Intrinsics.checkNotNullParameter(it, "it");
        int action = it.getAction();
        if (action == 0) {
            this.$currentPath.moveTo(it.getX(), it.getY());
            this.$onUpdateDrawing.invoke();
        } else if (action != 2) {
            this.$movePath.setValue(null);
        } else {
            this.$movePath.setValue(Offset.m71675boximpl(OffsetKt.Offset(it.getX(), it.getY())));
            this.$onUpdateDrawing.invoke();
        }
        return Boolean.TRUE;
    }
}