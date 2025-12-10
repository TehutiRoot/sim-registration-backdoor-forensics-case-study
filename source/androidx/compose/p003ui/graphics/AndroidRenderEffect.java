package androidx.compose.p003ui.graphics;

import android.graphics.RenderEffect;
import androidx.compose.runtime.Immutable;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Immutable
@Metadata(m28851d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u0007¨\u0006\u000b"}, m28850d2 = {"Landroidx/compose/ui/graphics/AndroidRenderEffect;", "Landroidx/compose/ui/graphics/RenderEffect;", "Landroid/graphics/RenderEffect;", "androidRenderEffect", "<init>", "(Landroid/graphics/RenderEffect;)V", "createRenderEffect", "()Landroid/graphics/RenderEffect;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Landroid/graphics/RenderEffect;", "getAndroidRenderEffect", "ui-graphics_release"}, m28849k = 1, m28848mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.graphics.AndroidRenderEffect */
/* loaded from: classes2.dex */
public final class AndroidRenderEffect extends RenderEffect {

    /* renamed from: b */
    public final RenderEffect f28987b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidRenderEffect(@NotNull RenderEffect androidRenderEffect) {
        super(null);
        Intrinsics.checkNotNullParameter(androidRenderEffect, "androidRenderEffect");
        this.f28987b = androidRenderEffect;
    }

    @Override // androidx.compose.p003ui.graphics.RenderEffect
    @NotNull
    public RenderEffect createRenderEffect() {
        return this.f28987b;
    }

    @NotNull
    public final RenderEffect getAndroidRenderEffect() {
        return this.f28987b;
    }
}
