package androidx.compose.animation.graphics.vector.compat;

import androidx.compose.animation.graphics.vector.Keyframe;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m29143d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004H\n¢\u0006\u0002\b\u0007"}, m29142d2 = {"<anonymous>", "Landroidx/compose/animation/graphics/vector/compat/ValueType;", "vt", "<anonymous parameter 1>", "", "Landroidx/compose/animation/graphics/vector/Keyframe;", "", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* loaded from: classes.dex */
public final class XmlAnimatorParser_androidKt$getPropertyValuesHolder1D$1 extends Lambda implements Function2<ValueType, List<Keyframe<Object>>, ValueType> {
    public static final XmlAnimatorParser_androidKt$getPropertyValuesHolder1D$1 INSTANCE = new XmlAnimatorParser_androidKt$getPropertyValuesHolder1D$1();

    public XmlAnimatorParser_androidKt$getPropertyValuesHolder1D$1() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public final ValueType invoke(@Nullable ValueType valueType, @NotNull List<Keyframe<Object>> list) {
        ValueType valueType2;
        Intrinsics.checkNotNullParameter(list, "<anonymous parameter 1>");
        if (valueType == null) {
            valueType2 = XmlAnimatorParser_androidKt.f12841a;
            return valueType2;
        }
        return valueType;
    }
}