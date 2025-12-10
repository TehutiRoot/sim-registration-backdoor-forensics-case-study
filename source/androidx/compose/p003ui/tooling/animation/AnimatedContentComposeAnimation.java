package androidx.compose.p003ui.tooling.animation;

import androidx.compose.animation.core.Transition;
import androidx.compose.animation.tooling.ComposeAnimation;
import androidx.compose.animation.tooling.ComposeAnimationType;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \u001f*\u0004\b\u0000\u0010\u00012\u00020\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001\u001fB/\b\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fR \u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001e\u001a\u00020\u00198\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006 "}, m28850d2 = {"Landroidx/compose/ui/tooling/animation/AnimatedContentComposeAnimation;", "T", "Landroidx/compose/animation/tooling/ComposeAnimation;", "Landroidx/compose/ui/tooling/animation/TransitionBasedAnimation;", "Landroidx/compose/animation/core/Transition;", "animationObject", "", "", "states", "", "label", "<init>", "(Landroidx/compose/animation/core/Transition;Ljava/util/Set;Ljava/lang/String;)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/animation/core/Transition;", "getAnimationObject", "()Landroidx/compose/animation/core/Transition;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Ljava/util/Set;", "getStates", "()Ljava/util/Set;", OperatorName.CURVE_TO, "Ljava/lang/String;", "getLabel", "()Ljava/lang/String;", "Landroidx/compose/animation/tooling/ComposeAnimationType;", "d", "Landroidx/compose/animation/tooling/ComposeAnimationType;", "getType", "()Landroidx/compose/animation/tooling/ComposeAnimationType;", "type", "Companion", "ui-tooling_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nAnimatedContentComposeAnimation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimatedContentComposeAnimation.kt\nandroidx/compose/ui/tooling/animation/AnimatedContentComposeAnimation\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,63:1\n12744#2,2:64\n*S KotlinDebug\n*F\n+ 1 AnimatedContentComposeAnimation.kt\nandroidx/compose/ui/tooling/animation/AnimatedContentComposeAnimation\n*L\n41#1:64,2\n*E\n"})
/* renamed from: androidx.compose.ui.tooling.animation.AnimatedContentComposeAnimation */
/* loaded from: classes2.dex */
public final class AnimatedContentComposeAnimation<T> implements ComposeAnimation, TransitionBasedAnimation<T> {
    @NotNull
    public static final Companion Companion = new Companion(null);

    /* renamed from: e */
    public static boolean f31637e;

    /* renamed from: a */
    public final Transition f31638a;

    /* renamed from: b */
    public final Set f31639b;

    /* renamed from: c */
    public final String f31640c;

    /* renamed from: d */
    public final ComposeAnimationType f31641d;

    @Metadata(m28851d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0004J\u0014\u0010\u000b\u001a\b\u0012\u0002\b\u0003\u0018\u00010\f*\u0006\u0012\u0002\b\u00030\rR\u001e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000e"}, m28850d2 = {"Landroidx/compose/ui/tooling/animation/AnimatedContentComposeAnimation$Companion;", "", "()V", "<set-?>", "", "apiAvailable", "getApiAvailable", "()Z", "testOverrideAvailability", "", "override", "parseAnimatedContent", "Landroidx/compose/ui/tooling/animation/AnimatedContentComposeAnimation;", "Landroidx/compose/animation/core/Transition;", "ui-tooling_release"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: androidx.compose.ui.tooling.animation.AnimatedContentComposeAnimation$Companion */
    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean getApiAvailable() {
            return AnimatedContentComposeAnimation.f31637e;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0026, code lost:
            if (r2 == null) goto L16;
         */
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final androidx.compose.p003ui.tooling.animation.AnimatedContentComposeAnimation<?> parseAnimatedContent(@org.jetbrains.annotations.NotNull androidx.compose.animation.core.Transition<?> r6) {
            /*
                r5 = this;
                java.lang.String r0 = "<this>"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
                boolean r0 = r5.getApiAvailable()
                r1 = 0
                if (r0 != 0) goto Ld
                return r1
            Ld:
                java.lang.Object r0 = r6.getCurrentState()
                if (r0 == 0) goto L44
                java.lang.Class r2 = r0.getClass()
                java.lang.Object[] r2 = r2.getEnumConstants()
                if (r2 == 0) goto L28
                java.lang.String r3 = "enumConstants"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
                java.util.Set r2 = kotlin.collections.ArraysKt___ArraysKt.toSet(r2)
                if (r2 != 0) goto L2c
            L28:
                java.util.Set r2 = p000.CG1.setOf(r0)
            L2c:
                androidx.compose.ui.tooling.animation.AnimatedContentComposeAnimation r3 = new androidx.compose.ui.tooling.animation.AnimatedContentComposeAnimation
                java.lang.String r4 = r6.getLabel()
                if (r4 != 0) goto L40
                java.lang.Class r0 = r0.getClass()
                kotlin.reflect.KClass r0 = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(r0)
                java.lang.String r4 = r0.getSimpleName()
            L40:
                r3.<init>(r6, r2, r4, r1)
                r1 = r3
            L44:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p003ui.tooling.animation.AnimatedContentComposeAnimation.Companion.parseAnimatedContent(androidx.compose.animation.core.Transition):androidx.compose.ui.tooling.animation.AnimatedContentComposeAnimation");
        }

        public final void testOverrideAvailability(boolean z) {
            AnimatedContentComposeAnimation.f31637e = z;
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
            } else if (Intrinsics.areEqual(values[i].name(), "ANIMATED_CONTENT")) {
                z = true;
                break;
            } else {
                i++;
            }
        }
        f31637e = z;
    }

    public /* synthetic */ AnimatedContentComposeAnimation(Transition transition, Set set, String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(transition, set, str);
    }

    @Nullable
    public String getLabel() {
        return this.f31640c;
    }

    @NotNull
    public Set<Object> getStates() {
        return this.f31639b;
    }

    @NotNull
    public ComposeAnimationType getType() {
        return this.f31641d;
    }

    public AnimatedContentComposeAnimation(Transition transition, Set set, String str) {
        this.f31638a = transition;
        this.f31639b = set;
        this.f31640c = str;
        this.f31641d = ComposeAnimationType.ANIMATED_CONTENT;
    }

    @Override // androidx.compose.p003ui.tooling.animation.TransitionBasedAnimation
    @NotNull
    public Transition<T> getAnimationObject() {
        return this.f31638a;
    }
}
