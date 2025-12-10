package androidx.compose.animation.graphics.vector;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.State;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004J3\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH'¢\u0006\u0004\b\r\u0010\u000eJ9\u0010\u0014\u001a$\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00110\u000f¢\u0006\u0002\b\u0012¢\u0006\u0002\b\u00132\u0006\u0010\u000b\u001a\u00020\nH\u0004¢\u0006\u0004\b\u0014\u0010\u0015R#\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00170\u00168\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\u0082\u0001\u0003\u001d\u001e\u001f¨\u0006 "}, m28850d2 = {"Landroidx/compose/animation/graphics/vector/PropertyValues;", "T", "", "<init>", "()V", "Landroidx/compose/animation/core/Transition;", "", "transition", "", "propertyName", "", "overallDuration", "Landroidx/compose/runtime/State;", "createState", "(Landroidx/compose/animation/core/Transition;Ljava/lang/String;ILandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "Lkotlin/Function1;", "Landroidx/compose/animation/core/Transition$Segment;", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "createAnimationSpec", "(I)Lkotlin/jvm/functions/Function3;", "", "Landroidx/compose/animation/graphics/vector/Timestamp;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/util/List;", "getTimestamps", "()Ljava/util/List;", "timestamps", "LDs;", "LW20;", "Landroidx/compose/animation/graphics/vector/PathPropertyValues;", "animation-graphics_release"}, m28849k = 1, m28848mv = {1, 8, 0})
/* loaded from: classes.dex */
public abstract class PropertyValues<T> {

    /* renamed from: a */
    public final List f12709a;

    public /* synthetic */ PropertyValues(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @NotNull
    public final Function3<Transition.Segment<Boolean>, Composer, Integer, FiniteAnimationSpec<T>> createAnimationSpec(int i) {
        return new PropertyValues$createAnimationSpec$1(this, i);
    }

    @Composable
    @NotNull
    public abstract State<T> createState(@NotNull Transition<Boolean> transition, @NotNull String str, int i, @Nullable Composer composer, int i2);

    @NotNull
    public final List<Timestamp<T>> getTimestamps() {
        return this.f12709a;
    }

    public PropertyValues() {
        this.f12709a = new ArrayList();
    }
}
