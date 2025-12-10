package androidx.compose.p003ui.graphics;

import android.graphics.PathEffect;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, m29142d2 = {"Landroidx/compose/ui/graphics/AndroidPathEffect;", "Landroidx/compose/ui/graphics/PathEffect;", "Landroid/graphics/PathEffect;", "nativePathEffect", "<init>", "(Landroid/graphics/PathEffect;)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroid/graphics/PathEffect;", "getNativePathEffect", "()Landroid/graphics/PathEffect;", "ui-graphics_release"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.graphics.AndroidPathEffect */
/* loaded from: classes2.dex */
public final class AndroidPathEffect implements PathEffect {

    /* renamed from: a */
    public final PathEffect f29071a;

    public AndroidPathEffect(@NotNull PathEffect nativePathEffect) {
        Intrinsics.checkNotNullParameter(nativePathEffect, "nativePathEffect");
        this.f29071a = nativePathEffect;
    }

    @NotNull
    public final PathEffect getNativePathEffect() {
        return this.f29071a;
    }
}