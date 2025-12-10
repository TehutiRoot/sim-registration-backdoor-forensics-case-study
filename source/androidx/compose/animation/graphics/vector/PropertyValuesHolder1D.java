package androidx.compose.animation.graphics.vector;

import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0011\b\u0004\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR \u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\f0\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e\u0082\u0001\u0004\u0010\u0011\u0012\u0013¨\u0006\u0014"}, m28850d2 = {"Landroidx/compose/animation/graphics/vector/PropertyValuesHolder1D;", "T", "Landroidx/compose/animation/graphics/vector/PropertyValuesHolder;", "", "propertyName", "<init>", "(Ljava/lang/String;)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/lang/String;", "getPropertyName", "()Ljava/lang/String;", "", "Landroidx/compose/animation/graphics/vector/Keyframe;", "getAnimatorKeyframes", "()Ljava/util/List;", "animatorKeyframes", "Landroidx/compose/animation/graphics/vector/PropertyValuesHolderColor;", "Landroidx/compose/animation/graphics/vector/PropertyValuesHolderFloat;", "Landroidx/compose/animation/graphics/vector/PropertyValuesHolderInt;", "Landroidx/compose/animation/graphics/vector/PropertyValuesHolderPath;", "animation-graphics_release"}, m28849k = 1, m28848mv = {1, 8, 0})
/* loaded from: classes.dex */
public abstract class PropertyValuesHolder1D<T> extends PropertyValuesHolder<T> {

    /* renamed from: a */
    public final String f12710a;

    public /* synthetic */ PropertyValuesHolder1D(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    @NotNull
    public abstract List<Keyframe<T>> getAnimatorKeyframes();

    @NotNull
    public final String getPropertyName() {
        return this.f12710a;
    }

    public PropertyValuesHolder1D(String str) {
        super(null);
        this.f12710a = str;
    }
}
