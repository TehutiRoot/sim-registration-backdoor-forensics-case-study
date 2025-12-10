package androidx.compose.animation.graphics.vector;

import androidx.compose.animation.core.Easing;
import androidx.compose.p003ui.graphics.vector.PathNode;
import ch.qos.logback.core.CoreConstants;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0080\b\u0018\u00002\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00020\u0001B-\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J>\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\u000b\u001a\u00020\nHÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u000fJ\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010\u000fR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b#\u0010!\u001a\u0004\b$\u0010\u000fR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010\u0012R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010\u0014¨\u0006+"}, m28850d2 = {"Landroidx/compose/animation/graphics/vector/PropertyValuesHolder2D;", "Landroidx/compose/animation/graphics/vector/PropertyValuesHolder;", "Lkotlin/Pair;", "", "", "xPropertyName", "yPropertyName", "", "Landroidx/compose/ui/graphics/vector/PathNode;", "pathData", "Landroidx/compose/animation/core/Easing;", "interpolator", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Landroidx/compose/animation/core/Easing;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/util/List;", "component4", "()Landroidx/compose/animation/core/Easing;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Landroidx/compose/animation/core/Easing;)Landroidx/compose/animation/graphics/vector/PropertyValuesHolder2D;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/lang/String;", "getXPropertyName", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getYPropertyName", OperatorName.CURVE_TO, "Ljava/util/List;", "getPathData", "d", "Landroidx/compose/animation/core/Easing;", "getInterpolator", "animation-graphics_release"}, m28849k = 1, m28848mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class PropertyValuesHolder2D extends PropertyValuesHolder<Pair<? extends Float, ? extends Float>> {

    /* renamed from: a */
    public final String f12711a;

    /* renamed from: b */
    public final String f12712b;

    /* renamed from: c */
    public final List f12713c;

    /* renamed from: d */
    public final Easing f12714d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PropertyValuesHolder2D(@NotNull String xPropertyName, @NotNull String yPropertyName, @NotNull List<? extends PathNode> pathData, @NotNull Easing interpolator) {
        super(null);
        Intrinsics.checkNotNullParameter(xPropertyName, "xPropertyName");
        Intrinsics.checkNotNullParameter(yPropertyName, "yPropertyName");
        Intrinsics.checkNotNullParameter(pathData, "pathData");
        Intrinsics.checkNotNullParameter(interpolator, "interpolator");
        this.f12711a = xPropertyName;
        this.f12712b = yPropertyName;
        this.f12713c = pathData;
        this.f12714d = interpolator;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PropertyValuesHolder2D copy$default(PropertyValuesHolder2D propertyValuesHolder2D, String str, String str2, List list, Easing easing, int i, Object obj) {
        if ((i & 1) != 0) {
            str = propertyValuesHolder2D.f12711a;
        }
        if ((i & 2) != 0) {
            str2 = propertyValuesHolder2D.f12712b;
        }
        if ((i & 4) != 0) {
            list = propertyValuesHolder2D.f12713c;
        }
        if ((i & 8) != 0) {
            easing = propertyValuesHolder2D.f12714d;
        }
        return propertyValuesHolder2D.copy(str, str2, list, easing);
    }

    @NotNull
    public final String component1() {
        return this.f12711a;
    }

    @NotNull
    public final String component2() {
        return this.f12712b;
    }

    @NotNull
    public final List<PathNode> component3() {
        return this.f12713c;
    }

    @NotNull
    public final Easing component4() {
        return this.f12714d;
    }

    @NotNull
    public final PropertyValuesHolder2D copy(@NotNull String xPropertyName, @NotNull String yPropertyName, @NotNull List<? extends PathNode> pathData, @NotNull Easing interpolator) {
        Intrinsics.checkNotNullParameter(xPropertyName, "xPropertyName");
        Intrinsics.checkNotNullParameter(yPropertyName, "yPropertyName");
        Intrinsics.checkNotNullParameter(pathData, "pathData");
        Intrinsics.checkNotNullParameter(interpolator, "interpolator");
        return new PropertyValuesHolder2D(xPropertyName, yPropertyName, pathData, interpolator);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PropertyValuesHolder2D) {
            PropertyValuesHolder2D propertyValuesHolder2D = (PropertyValuesHolder2D) obj;
            return Intrinsics.areEqual(this.f12711a, propertyValuesHolder2D.f12711a) && Intrinsics.areEqual(this.f12712b, propertyValuesHolder2D.f12712b) && Intrinsics.areEqual(this.f12713c, propertyValuesHolder2D.f12713c) && Intrinsics.areEqual(this.f12714d, propertyValuesHolder2D.f12714d);
        }
        return false;
    }

    @NotNull
    public final Easing getInterpolator() {
        return this.f12714d;
    }

    @NotNull
    public final List<PathNode> getPathData() {
        return this.f12713c;
    }

    @NotNull
    public final String getXPropertyName() {
        return this.f12711a;
    }

    @NotNull
    public final String getYPropertyName() {
        return this.f12712b;
    }

    public int hashCode() {
        return (((((this.f12711a.hashCode() * 31) + this.f12712b.hashCode()) * 31) + this.f12713c.hashCode()) * 31) + this.f12714d.hashCode();
    }

    @NotNull
    public String toString() {
        return "PropertyValuesHolder2D(xPropertyName=" + this.f12711a + ", yPropertyName=" + this.f12712b + ", pathData=" + this.f12713c + ", interpolator=" + this.f12714d + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
