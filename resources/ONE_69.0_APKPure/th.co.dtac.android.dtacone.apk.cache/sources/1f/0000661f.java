package androidx.compose.p003ui.tooling.animation;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationVector;
import androidx.compose.animation.tooling.ComposeAnimation;
import androidx.compose.animation.tooling.ComposeAnimationType;
import androidx.compose.p003ui.tooling.animation.AnimationSearch;
import androidx.exifinterface.media.ExifInterface;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m29143d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0000\u0018\u0000 0*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0003*\u00020\u00022\u00020\u0004:\u00010B9\b\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00078\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R&\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010#\u001a\u00020\u001e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R \u0010)\u001a\b\u0012\u0004\u0012\u00020\r0$8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u001a\u0010/\u001a\u00020*8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.¨\u00061"}, m29142d2 = {"Landroidx/compose/ui/tooling/animation/AnimateXAsStateComposeAnimation;", "T", "Landroidx/compose/animation/core/AnimationVector;", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Landroidx/compose/animation/tooling/ComposeAnimation;", "Landroidx/compose/ui/tooling/animation/ToolingState;", "toolingState", "Landroidx/compose/animation/core/AnimationSpec;", "animationSpec", "Landroidx/compose/animation/core/Animatable;", "animationObject", "<init>", "(Landroidx/compose/ui/tooling/animation/ToolingState;Landroidx/compose/animation/core/AnimationSpec;Landroidx/compose/animation/core/Animatable;)V", "", "value", "", "setState", "(Ljava/lang/Object;)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/ui/tooling/animation/ToolingState;", "getToolingState", "()Landroidx/compose/ui/tooling/animation/ToolingState;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Landroidx/compose/animation/core/AnimationSpec;", "getAnimationSpec", "()Landroidx/compose/animation/core/AnimationSpec;", OperatorName.CURVE_TO, "Landroidx/compose/animation/core/Animatable;", "getAnimationObject", "()Landroidx/compose/animation/core/Animatable;", "Landroidx/compose/animation/tooling/ComposeAnimationType;", "d", "Landroidx/compose/animation/tooling/ComposeAnimationType;", "getType", "()Landroidx/compose/animation/tooling/ComposeAnimationType;", "type", "", "e", "Ljava/util/Set;", "getStates", "()Ljava/util/Set;", "states", "", OperatorName.FILL_NON_ZERO, "Ljava/lang/String;", "getLabel", "()Ljava/lang/String;", "label", "Companion", "ui-tooling_release"}, m29141k = 1, m29140mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nAnimateXAsStateComposeAnimation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimateXAsStateComposeAnimation.kt\nandroidx/compose/ui/tooling/animation/AnimateXAsStateComposeAnimation\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,76:1\n12744#2,2:77\n*S KotlinDebug\n*F\n+ 1 AnimateXAsStateComposeAnimation.kt\nandroidx/compose/ui/tooling/animation/AnimateXAsStateComposeAnimation\n*L\n56#1:77,2\n*E\n"})
/* renamed from: androidx.compose.ui.tooling.animation.AnimateXAsStateComposeAnimation */
/* loaded from: classes2.dex */
public final class AnimateXAsStateComposeAnimation<T, V extends AnimationVector> implements ComposeAnimation {
    @NotNull
    public static final Companion Companion = new Companion(null);

    /* renamed from: g */
    public static boolean f31718g;

    /* renamed from: a */
    public final ToolingState f31719a;

    /* renamed from: b */
    public final AnimationSpec f31720b;

    /* renamed from: c */
    public final Animatable f31721c;

    /* renamed from: d */
    public final ComposeAnimationType f31722d;

    /* renamed from: e */
    public final Set f31723e;

    /* renamed from: f */
    public final String f31724f;

    @Metadata(m29143d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0004J7\u0010\u000b\u001a\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\f\"\u0004\b\u0002\u0010\r\"\b\b\u0003\u0010\u000e*\u00020\u000f*\u000e\u0012\u0004\u0012\u0002H\r\u0012\u0004\u0012\u0002H\u000e0\u0010H\u0000¢\u0006\u0002\b\u0011R\u001e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m29142d2 = {"Landroidx/compose/ui/tooling/animation/AnimateXAsStateComposeAnimation$Companion;", "", "()V", "<set-?>", "", "apiAvailable", "getApiAvailable", "()Z", "testOverrideAvailability", "", "override", "parse", "Landroidx/compose/ui/tooling/animation/AnimateXAsStateComposeAnimation;", "T", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Landroidx/compose/animation/core/AnimationVector;", "Landroidx/compose/ui/tooling/animation/AnimationSearch$AnimateXAsStateSearchInfo;", "parse$ui_tooling_release", "ui-tooling_release"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: androidx.compose.ui.tooling.animation.AnimateXAsStateComposeAnimation$Companion */
    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean getApiAvailable() {
            return AnimateXAsStateComposeAnimation.f31718g;
        }

        @Nullable
        public final <T, V extends AnimationVector> AnimateXAsStateComposeAnimation<?, ?> parse$ui_tooling_release(@NotNull AnimationSearch.AnimateXAsStateSearchInfo<T, V> animateXAsStateSearchInfo) {
            Intrinsics.checkNotNullParameter(animateXAsStateSearchInfo, "<this>");
            if (!getApiAvailable() || animateXAsStateSearchInfo.getAnimatable().getValue() == null) {
                return null;
            }
            return new AnimateXAsStateComposeAnimation<>(animateXAsStateSearchInfo.getToolingState(), animateXAsStateSearchInfo.getAnimationSpec(), animateXAsStateSearchInfo.getAnimatable(), null);
        }

        public final void testOverrideAvailability(boolean z) {
            AnimateXAsStateComposeAnimation.f31718g = z;
        }

        public Companion() {
        }
    }

    static {
        ComposeAnimationType[] values = ComposeAnimationType.values();
        int length = values.length;
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            } else if (Intrinsics.areEqual(values[i].name(), "UNSUPPORTED")) {
                z = true;
                break;
            } else {
                i++;
            }
        }
        f31718g = z;
    }

    public /* synthetic */ AnimateXAsStateComposeAnimation(ToolingState toolingState, AnimationSpec animationSpec, Animatable animatable, DefaultConstructorMarker defaultConstructorMarker) {
        this(toolingState, animationSpec, animatable);
    }

    @NotNull
    public final AnimationSpec<T> getAnimationSpec() {
        return this.f31720b;
    }

    @NotNull
    public String getLabel() {
        return this.f31724f;
    }

    @NotNull
    public Set<Object> getStates() {
        return this.f31723e;
    }

    @NotNull
    public final ToolingState<T> getToolingState() {
        return this.f31719a;
    }

    @NotNull
    public ComposeAnimationType getType() {
        return this.f31722d;
    }

    public final void setState(@NotNull Object value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f31719a.setValue(value);
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x002d, code lost:
        if (r2 == null) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public AnimateXAsStateComposeAnimation(androidx.compose.p003ui.tooling.animation.ToolingState r1, androidx.compose.animation.core.AnimationSpec r2, androidx.compose.animation.core.Animatable r3) {
        /*
            r0 = this;
            r0.<init>()
            r0.f31719a = r1
            r0.f31720b = r2
            r0.f31721c = r3
            androidx.compose.animation.tooling.ComposeAnimationType r1 = androidx.compose.animation.tooling.ComposeAnimationType.ANIMATE_X_AS_STATE
            r0.f31722d = r1
            androidx.compose.animation.core.Animatable r1 = r0.m73785getAnimationObject()
            java.lang.Object r1 = r1.getValue()
            java.lang.String r2 = "null cannot be cast to non-null type kotlin.Any"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1, r2)
            java.lang.Class r2 = r1.getClass()
            java.lang.Object[] r2 = r2.getEnumConstants()
            if (r2 == 0) goto L2f
            java.lang.String r3 = "enumConstants"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            java.util.Set r2 = kotlin.collections.ArraysKt___ArraysKt.toSet(r2)
            if (r2 != 0) goto L33
        L2f:
            java.util.Set r2 = p000.AbstractC23354zH1.setOf(r1)
        L33:
            r0.f31723e = r2
            androidx.compose.animation.core.Animatable r1 = r0.m73785getAnimationObject()
            java.lang.String r1 = r1.getLabel()
            r0.f31724f = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p003ui.tooling.animation.AnimateXAsStateComposeAnimation.<init>(androidx.compose.ui.tooling.animation.ToolingState, androidx.compose.animation.core.AnimationSpec, androidx.compose.animation.core.Animatable):void");
    }

    @NotNull
    /* renamed from: getAnimationObject */
    public Animatable<T, V> m73785getAnimationObject() {
        return this.f31721c;
    }
}