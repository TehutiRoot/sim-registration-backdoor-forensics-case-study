package androidx.compose.animation.graphics.vector;

import androidx.compose.animation.core.RepeatMode;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import ch.qos.logback.core.CoreConstants;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0080\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0010\u0010\n\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t0\b¢\u0006\u0004\b\u000b\u0010\fJ7\u0010\u0014\u001a\u00020\u00132\u0016\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000f0\r2\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0017J\u0010\u0010\u001a\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001c\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t0\bHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJL\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u0012\b\u0002\u0010\n\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t0\bHÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010\u0017J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b+\u0010)\u001a\u0004\b,\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b-\u0010)\u001a\u0004\b.\u0010\u0017R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u0010\u001bR!\u0010\n\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t0\b8\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u0010\u001dR\u001a\u00107\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b5\u0010)\u001a\u0004\b6\u0010\u0017¨\u00068"}, m28850d2 = {"Landroidx/compose/animation/graphics/vector/ObjectAnimator;", "Landroidx/compose/animation/graphics/vector/Animator;", "", TypedValues.TransitionType.S_DURATION, "startDelay", "repeatCount", "Landroidx/compose/animation/core/RepeatMode;", "repeatMode", "", "Landroidx/compose/animation/graphics/vector/PropertyValuesHolder;", "holders", "<init>", "(IIILandroidx/compose/animation/core/RepeatMode;Ljava/util/List;)V", "", "", "Landroidx/compose/animation/graphics/vector/PropertyValues;", "propertyValuesMap", "overallDuration", "parentDelay", "", "collectPropertyValues", "(Ljava/util/Map;II)V", "component1", "()I", "component2", "component3", "component4", "()Landroidx/compose/animation/core/RepeatMode;", "component5", "()Ljava/util/List;", "copy", "(IIILandroidx/compose/animation/core/RepeatMode;Ljava/util/List;)Landroidx/compose/animation/graphics/vector/ObjectAnimator;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "I", "getDuration", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getStartDelay", OperatorName.CURVE_TO, "getRepeatCount", "d", "Landroidx/compose/animation/core/RepeatMode;", "getRepeatMode", "e", "Ljava/util/List;", "getHolders", OperatorName.FILL_NON_ZERO, "getTotalDuration", "totalDuration", "animation-graphics_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nAnimator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Animator.kt\nandroidx/compose/animation/graphics/vector/ObjectAnimator\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,650:1\n33#2,6:651\n*S KotlinDebug\n*F\n+ 1 Animator.kt\nandroidx/compose/animation/graphics/vector/ObjectAnimator\n*L\n262#1:651,6\n*E\n"})
/* loaded from: classes.dex */
public final class ObjectAnimator extends Animator {

    /* renamed from: a */
    public final int f12703a;

    /* renamed from: b */
    public final int f12704b;

    /* renamed from: c */
    public final int f12705c;

    /* renamed from: d */
    public final RepeatMode f12706d;

    /* renamed from: e */
    public final List f12707e;

    /* renamed from: f */
    public final int f12708f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ObjectAnimator(int i, int i2, int i3, @NotNull RepeatMode repeatMode, @NotNull List<? extends PropertyValuesHolder<?>> holders) {
        super(null);
        int i4;
        Intrinsics.checkNotNullParameter(repeatMode, "repeatMode");
        Intrinsics.checkNotNullParameter(holders, "holders");
        this.f12703a = i;
        this.f12704b = i2;
        this.f12705c = i3;
        this.f12706d = repeatMode;
        this.f12707e = holders;
        if (i3 == -1) {
            i4 = Integer.MAX_VALUE;
        } else {
            i4 = (i * (i3 + 1)) + i2;
        }
        this.f12708f = i4;
    }

    public static /* synthetic */ ObjectAnimator copy$default(ObjectAnimator objectAnimator, int i, int i2, int i3, RepeatMode repeatMode, List list, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = objectAnimator.f12703a;
        }
        if ((i4 & 2) != 0) {
            i2 = objectAnimator.f12704b;
        }
        int i5 = i2;
        if ((i4 & 4) != 0) {
            i3 = objectAnimator.f12705c;
        }
        int i6 = i3;
        if ((i4 & 8) != 0) {
            repeatMode = objectAnimator.f12706d;
        }
        RepeatMode repeatMode2 = repeatMode;
        List list2 = list;
        if ((i4 & 16) != 0) {
            list2 = objectAnimator.f12707e;
        }
        return objectAnimator.copy(i, i5, i6, repeatMode2, list2);
    }

    @Override // androidx.compose.animation.graphics.vector.Animator
    public void collectPropertyValues(@NotNull Map<String, PropertyValues<?>> propertyValuesMap, int i, int i2) {
        Intrinsics.checkNotNullParameter(propertyValuesMap, "propertyValuesMap");
        List list = this.f12707e;
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            PropertyValuesHolder propertyValuesHolder = (PropertyValuesHolder) list.get(i3);
            if (!(propertyValuesHolder instanceof PropertyValuesHolder2D)) {
                if (propertyValuesHolder instanceof PropertyValuesHolderFloat) {
                    PropertyValuesHolderFloat propertyValuesHolderFloat = (PropertyValuesHolderFloat) propertyValuesHolder;
                    W20 w20 = (W20) propertyValuesMap.get(propertyValuesHolderFloat.getPropertyName());
                    if (w20 == null) {
                        w20 = new W20();
                    }
                    W20 w202 = w20;
                    w202.getTimestamps().add(new Timestamp<>(i2 + this.f12704b, this.f12703a, this.f12705c, this.f12706d, propertyValuesHolder));
                    propertyValuesMap.put(propertyValuesHolderFloat.getPropertyName(), w202);
                } else if (propertyValuesHolder instanceof PropertyValuesHolderColor) {
                    PropertyValuesHolderColor propertyValuesHolderColor = (PropertyValuesHolderColor) propertyValuesHolder;
                    C0282Ds c0282Ds = (C0282Ds) propertyValuesMap.get(propertyValuesHolderColor.getPropertyName());
                    if (c0282Ds == null) {
                        c0282Ds = new C0282Ds();
                    }
                    C0282Ds c0282Ds2 = c0282Ds;
                    c0282Ds2.getTimestamps().add(new Timestamp<>(i2 + this.f12704b, this.f12703a, this.f12705c, this.f12706d, propertyValuesHolder));
                    propertyValuesMap.put(propertyValuesHolderColor.getPropertyName(), c0282Ds2);
                } else if (propertyValuesHolder instanceof PropertyValuesHolderPath) {
                    PropertyValuesHolderPath propertyValuesHolderPath = (PropertyValuesHolderPath) propertyValuesHolder;
                    PathPropertyValues pathPropertyValues = (PathPropertyValues) propertyValuesMap.get(propertyValuesHolderPath.getPropertyName());
                    if (pathPropertyValues == null) {
                        pathPropertyValues = new PathPropertyValues();
                    }
                    PathPropertyValues pathPropertyValues2 = pathPropertyValues;
                    pathPropertyValues2.getTimestamps().add(new Timestamp<>(i2 + this.f12704b, this.f12703a, this.f12705c, this.f12706d, propertyValuesHolder));
                    propertyValuesMap.put(propertyValuesHolderPath.getPropertyName(), pathPropertyValues2);
                } else {
                    boolean z = propertyValuesHolder instanceof PropertyValuesHolderInt;
                }
            }
        }
    }

    public final int component1() {
        return this.f12703a;
    }

    public final int component2() {
        return this.f12704b;
    }

    public final int component3() {
        return this.f12705c;
    }

    @NotNull
    public final RepeatMode component4() {
        return this.f12706d;
    }

    @NotNull
    public final List<PropertyValuesHolder<?>> component5() {
        return this.f12707e;
    }

    @NotNull
    public final ObjectAnimator copy(int i, int i2, int i3, @NotNull RepeatMode repeatMode, @NotNull List<? extends PropertyValuesHolder<?>> holders) {
        Intrinsics.checkNotNullParameter(repeatMode, "repeatMode");
        Intrinsics.checkNotNullParameter(holders, "holders");
        return new ObjectAnimator(i, i2, i3, repeatMode, holders);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ObjectAnimator) {
            ObjectAnimator objectAnimator = (ObjectAnimator) obj;
            return this.f12703a == objectAnimator.f12703a && this.f12704b == objectAnimator.f12704b && this.f12705c == objectAnimator.f12705c && this.f12706d == objectAnimator.f12706d && Intrinsics.areEqual(this.f12707e, objectAnimator.f12707e);
        }
        return false;
    }

    public final int getDuration() {
        return this.f12703a;
    }

    @NotNull
    public final List<PropertyValuesHolder<?>> getHolders() {
        return this.f12707e;
    }

    public final int getRepeatCount() {
        return this.f12705c;
    }

    @NotNull
    public final RepeatMode getRepeatMode() {
        return this.f12706d;
    }

    public final int getStartDelay() {
        return this.f12704b;
    }

    @Override // androidx.compose.animation.graphics.vector.Animator
    public int getTotalDuration() {
        return this.f12708f;
    }

    public int hashCode() {
        return (((((((this.f12703a * 31) + this.f12704b) * 31) + this.f12705c) * 31) + this.f12706d.hashCode()) * 31) + this.f12707e.hashCode();
    }

    @NotNull
    public String toString() {
        return "ObjectAnimator(duration=" + this.f12703a + ", startDelay=" + this.f12704b + ", repeatCount=" + this.f12705c + ", repeatMode=" + this.f12706d + ", holders=" + this.f12707e + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
