package androidx.compose.animation.graphics.vector;

import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.graphics.SolidColor;
import androidx.compose.p003ui.graphics.vector.PathNode;
import androidx.compose.p003ui.graphics.vector.VectorConfig;
import androidx.compose.p003ui.graphics.vector.VectorProperty;
import androidx.compose.runtime.State;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u001f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b!\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\u0006\u0010\u0007\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\b\u0010\tR*\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R*\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\r\u001a\u0004\b\u0014\u0010\u000f\"\u0004\b\u0015\u0010\u0011R*\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\r\u001a\u0004\b\u0018\u0010\u000f\"\u0004\b\u0019\u0010\u0011R*\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\r\u001a\u0004\b\u001c\u0010\u000f\"\u0004\b\u001d\u0010\u0011R*\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\r\u001a\u0004\b \u0010\u000f\"\u0004\b!\u0010\u0011R*\u0010&\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010\r\u001a\u0004\b$\u0010\u000f\"\u0004\b%\u0010\u0011R*\u0010*\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010\r\u001a\u0004\b(\u0010\u000f\"\u0004\b)\u0010\u0011R0\u00100\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020,0+\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010\r\u001a\u0004\b.\u0010\u000f\"\u0004\b/\u0010\u0011R-\u00105\u001a\n\u0012\u0004\u0012\u000201\u0018\u00010\n8\u0006@\u0006X\u0086\u000eø\u0001\u0000¢\u0006\u0012\n\u0004\b2\u0010\r\u001a\u0004\b3\u0010\u000f\"\u0004\b4\u0010\u0011R-\u00109\u001a\n\u0012\u0004\u0012\u000201\u0018\u00010\n8\u0006@\u0006X\u0086\u000eø\u0001\u0000¢\u0006\u0012\n\u0004\b6\u0010\r\u001a\u0004\b7\u0010\u000f\"\u0004\b8\u0010\u0011R*\u0010=\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b:\u0010\r\u001a\u0004\b;\u0010\u000f\"\u0004\b<\u0010\u0011R*\u0010A\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b>\u0010\r\u001a\u0004\b?\u0010\u000f\"\u0004\b@\u0010\u0011R*\u0010E\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bB\u0010\r\u001a\u0004\bC\u0010\u000f\"\u0004\bD\u0010\u0011R*\u0010I\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bF\u0010\r\u001a\u0004\bG\u0010\u000f\"\u0004\bH\u0010\u0011R*\u0010M\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bJ\u0010\r\u001a\u0004\bK\u0010\u000f\"\u0004\bL\u0010\u0011R*\u0010Q\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bN\u0010\r\u001a\u0004\bO\u0010\u000f\"\u0004\bP\u0010\u0011\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006R"}, m28850d2 = {"Landroidx/compose/animation/graphics/vector/StateVectorConfig;", "Landroidx/compose/ui/graphics/vector/VectorConfig;", "<init>", "()V", "T", "Landroidx/compose/ui/graphics/vector/VectorProperty;", "property", "defaultValue", "getOrDefault", "(Landroidx/compose/ui/graphics/vector/VectorProperty;Ljava/lang/Object;)Ljava/lang/Object;", "Landroidx/compose/runtime/State;", "", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/runtime/State;", "getRotationState", "()Landroidx/compose/runtime/State;", "setRotationState", "(Landroidx/compose/runtime/State;)V", "rotationState", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getPivotXState", "setPivotXState", "pivotXState", OperatorName.CURVE_TO, "getPivotYState", "setPivotYState", "pivotYState", "d", "getScaleXState", "setScaleXState", "scaleXState", "e", "getScaleYState", "setScaleYState", "scaleYState", OperatorName.FILL_NON_ZERO, "getTranslateXState", "setTranslateXState", "translateXState", OperatorName.NON_STROKING_GRAY, "getTranslateYState", "setTranslateYState", "translateYState", "", "Landroidx/compose/ui/graphics/vector/PathNode;", OperatorName.CLOSE_PATH, "getPathDataState", "setPathDataState", "pathDataState", "Landroidx/compose/ui/graphics/Color;", "i", "getFillColorState", "setFillColorState", "fillColorState", OperatorName.SET_LINE_JOINSTYLE, "getStrokeColorState", "setStrokeColorState", "strokeColorState", OperatorName.NON_STROKING_CMYK, "getStrokeWidthState", "setStrokeWidthState", "strokeWidthState", OperatorName.LINE_TO, "getStrokeAlphaState", "setStrokeAlphaState", "strokeAlphaState", OperatorName.MOVE_TO, "getFillAlphaState", "setFillAlphaState", "fillAlphaState", OperatorName.ENDPATH, "getTrimPathStartState", "setTrimPathStartState", "trimPathStartState", "o", "getTrimPathEndState", "setTrimPathEndState", "trimPathEndState", "p", "getTrimPathOffsetState", "setTrimPathOffsetState", "trimPathOffsetState", "animation-graphics_release"}, m28849k = 1, m28848mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class StateVectorConfig implements VectorConfig {

    /* renamed from: a */
    public State f12719a;

    /* renamed from: b */
    public State f12720b;

    /* renamed from: c */
    public State f12721c;

    /* renamed from: d */
    public State f12722d;

    /* renamed from: e */
    public State f12723e;

    /* renamed from: f */
    public State f12724f;

    /* renamed from: g */
    public State f12725g;

    /* renamed from: h */
    public State f12726h;

    /* renamed from: i */
    public State f12727i;

    /* renamed from: j */
    public State f12728j;

    /* renamed from: k */
    public State f12729k;

    /* renamed from: l */
    public State f12730l;

    /* renamed from: m */
    public State f12731m;

    /* renamed from: n */
    public State f12732n;

    /* renamed from: o */
    public State f12733o;

    /* renamed from: p */
    public State f12734p;

    @Nullable
    public final State<Float> getFillAlphaState() {
        return this.f12731m;
    }

    @Nullable
    public final State<Color> getFillColorState() {
        return this.f12727i;
    }

    @Override // androidx.compose.p003ui.graphics.vector.VectorConfig
    public <T> T getOrDefault(@NotNull VectorProperty<T> property, T t) {
        T t2;
        Intrinsics.checkNotNullParameter(property, "property");
        if (property instanceof VectorProperty.Rotation) {
            State state = this.f12719a;
            if (state != null) {
                return (T) Float.valueOf(((Number) state.getValue()).floatValue());
            }
            return t;
        } else if (property instanceof VectorProperty.PivotX) {
            State state2 = this.f12720b;
            if (state2 != null) {
                return (T) Float.valueOf(((Number) state2.getValue()).floatValue());
            }
            return t;
        } else if (property instanceof VectorProperty.PivotY) {
            State state3 = this.f12721c;
            if (state3 != null) {
                return (T) Float.valueOf(((Number) state3.getValue()).floatValue());
            }
            return t;
        } else if (property instanceof VectorProperty.ScaleX) {
            State state4 = this.f12722d;
            if (state4 != null) {
                return (T) Float.valueOf(((Number) state4.getValue()).floatValue());
            }
            return t;
        } else if (property instanceof VectorProperty.ScaleY) {
            State state5 = this.f12723e;
            if (state5 != null) {
                return (T) Float.valueOf(((Number) state5.getValue()).floatValue());
            }
            return t;
        } else if (property instanceof VectorProperty.TranslateX) {
            State state6 = this.f12724f;
            if (state6 != null) {
                return (T) Float.valueOf(((Number) state6.getValue()).floatValue());
            }
            return t;
        } else if (property instanceof VectorProperty.TranslateY) {
            State state7 = this.f12725g;
            if (state7 != null) {
                return (T) Float.valueOf(((Number) state7.getValue()).floatValue());
            }
            return t;
        } else if (property instanceof VectorProperty.PathData) {
            State state8 = this.f12726h;
            if (state8 != null && (t2 = (T) ((List) state8.getValue())) != null) {
                return t2;
            }
            return t;
        } else if (property instanceof VectorProperty.Fill) {
            State state9 = this.f12727i;
            if (state9 != null) {
                return (T) new SolidColor(((Color) state9.getValue()).m71745unboximpl(), null);
            }
            return t;
        } else if (property instanceof VectorProperty.FillAlpha) {
            State state10 = this.f12731m;
            if (state10 != null) {
                return (T) Float.valueOf(((Number) state10.getValue()).floatValue());
            }
            return t;
        } else if (property instanceof VectorProperty.Stroke) {
            State state11 = this.f12728j;
            if (state11 != null) {
                return (T) new SolidColor(((Color) state11.getValue()).m71745unboximpl(), null);
            }
            return t;
        } else if (property instanceof VectorProperty.StrokeLineWidth) {
            State state12 = this.f12729k;
            if (state12 != null) {
                return (T) Float.valueOf(((Number) state12.getValue()).floatValue());
            }
            return t;
        } else if (property instanceof VectorProperty.StrokeAlpha) {
            State state13 = this.f12730l;
            if (state13 != null) {
                return (T) Float.valueOf(((Number) state13.getValue()).floatValue());
            }
            return t;
        } else if (property instanceof VectorProperty.TrimPathStart) {
            State state14 = this.f12732n;
            if (state14 != null) {
                return (T) Float.valueOf(((Number) state14.getValue()).floatValue());
            }
            return t;
        } else if (property instanceof VectorProperty.TrimPathEnd) {
            State state15 = this.f12733o;
            if (state15 != null) {
                return (T) Float.valueOf(((Number) state15.getValue()).floatValue());
            }
            return t;
        } else if (property instanceof VectorProperty.TrimPathOffset) {
            State state16 = this.f12734p;
            if (state16 != null) {
                return (T) Float.valueOf(((Number) state16.getValue()).floatValue());
            }
            return t;
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    @Nullable
    public final State<List<PathNode>> getPathDataState() {
        return this.f12726h;
    }

    @Nullable
    public final State<Float> getPivotXState() {
        return this.f12720b;
    }

    @Nullable
    public final State<Float> getPivotYState() {
        return this.f12721c;
    }

    @Nullable
    public final State<Float> getRotationState() {
        return this.f12719a;
    }

    @Nullable
    public final State<Float> getScaleXState() {
        return this.f12722d;
    }

    @Nullable
    public final State<Float> getScaleYState() {
        return this.f12723e;
    }

    @Nullable
    public final State<Float> getStrokeAlphaState() {
        return this.f12730l;
    }

    @Nullable
    public final State<Color> getStrokeColorState() {
        return this.f12728j;
    }

    @Nullable
    public final State<Float> getStrokeWidthState() {
        return this.f12729k;
    }

    @Nullable
    public final State<Float> getTranslateXState() {
        return this.f12724f;
    }

    @Nullable
    public final State<Float> getTranslateYState() {
        return this.f12725g;
    }

    @Nullable
    public final State<Float> getTrimPathEndState() {
        return this.f12733o;
    }

    @Nullable
    public final State<Float> getTrimPathOffsetState() {
        return this.f12734p;
    }

    @Nullable
    public final State<Float> getTrimPathStartState() {
        return this.f12732n;
    }

    public final void setFillAlphaState(@Nullable State<Float> state) {
        this.f12731m = state;
    }

    public final void setFillColorState(@Nullable State<Color> state) {
        this.f12727i = state;
    }

    public final void setPathDataState(@Nullable State<? extends List<? extends PathNode>> state) {
        this.f12726h = state;
    }

    public final void setPivotXState(@Nullable State<Float> state) {
        this.f12720b = state;
    }

    public final void setPivotYState(@Nullable State<Float> state) {
        this.f12721c = state;
    }

    public final void setRotationState(@Nullable State<Float> state) {
        this.f12719a = state;
    }

    public final void setScaleXState(@Nullable State<Float> state) {
        this.f12722d = state;
    }

    public final void setScaleYState(@Nullable State<Float> state) {
        this.f12723e = state;
    }

    public final void setStrokeAlphaState(@Nullable State<Float> state) {
        this.f12730l = state;
    }

    public final void setStrokeColorState(@Nullable State<Color> state) {
        this.f12728j = state;
    }

    public final void setStrokeWidthState(@Nullable State<Float> state) {
        this.f12729k = state;
    }

    public final void setTranslateXState(@Nullable State<Float> state) {
        this.f12724f = state;
    }

    public final void setTranslateYState(@Nullable State<Float> state) {
        this.f12725g = state;
    }

    public final void setTrimPathEndState(@Nullable State<Float> state) {
        this.f12733o = state;
    }

    public final void setTrimPathOffsetState(@Nullable State<Float> state) {
        this.f12734p = state;
    }

    public final void setTrimPathStartState(@Nullable State<Float> state) {
        this.f12732n = state;
    }
}
