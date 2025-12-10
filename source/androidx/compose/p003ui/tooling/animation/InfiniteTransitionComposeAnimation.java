package androidx.compose.p003ui.tooling.animation;

import androidx.compose.animation.core.InfiniteTransition;
import androidx.compose.animation.tooling.ComposeAnimation;
import androidx.compose.animation.tooling.ComposeAnimationType;
import androidx.compose.p003ui.tooling.animation.AnimationSearch;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0000\u0018\u0000 &2\u00020\u0001:\u0001&B\u001f\b\u0002\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0018\u001a\u00020\u00138\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R \u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010%\u001a\u00020 8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$¨\u0006'"}, m28850d2 = {"Landroidx/compose/ui/tooling/animation/InfiniteTransitionComposeAnimation;", "Landroidx/compose/animation/tooling/ComposeAnimation;", "Landroidx/compose/ui/tooling/animation/ToolingState;", "", "toolingState", "Landroidx/compose/animation/core/InfiniteTransition;", "animationObject", "<init>", "(Landroidx/compose/ui/tooling/animation/ToolingState;Landroidx/compose/animation/core/InfiniteTransition;)V", "playTimeNanos", "", "setTimeNanos", "(J)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/ui/tooling/animation/ToolingState;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Landroidx/compose/animation/core/InfiniteTransition;", "getAnimationObject", "()Landroidx/compose/animation/core/InfiniteTransition;", "Landroidx/compose/animation/tooling/ComposeAnimationType;", OperatorName.CURVE_TO, "Landroidx/compose/animation/tooling/ComposeAnimationType;", "getType", "()Landroidx/compose/animation/tooling/ComposeAnimationType;", "type", "", "", "d", "Ljava/util/Set;", "getStates", "()Ljava/util/Set;", "states", "", "e", "Ljava/lang/String;", "getLabel", "()Ljava/lang/String;", "label", "Companion", "ui-tooling_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nInfiniteTransitionComposeAnimation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InfiniteTransitionComposeAnimation.kt\nandroidx/compose/ui/tooling/animation/InfiniteTransitionComposeAnimation\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,68:1\n12744#2,2:69\n*S KotlinDebug\n*F\n+ 1 InfiniteTransitionComposeAnimation.kt\nandroidx/compose/ui/tooling/animation/InfiniteTransitionComposeAnimation\n*L\n51#1:69,2\n*E\n"})
/* renamed from: androidx.compose.ui.tooling.animation.InfiniteTransitionComposeAnimation */
/* loaded from: classes2.dex */
public final class InfiniteTransitionComposeAnimation implements ComposeAnimation {
    @NotNull
    public static final Companion Companion = new Companion(null);

    /* renamed from: f */
    public static boolean f31662f;

    /* renamed from: a */
    public final ToolingState f31663a;

    /* renamed from: b */
    public final InfiniteTransition f31664b;

    /* renamed from: c */
    public final ComposeAnimationType f31665c;

    /* renamed from: d */
    public final Set f31666d;

    /* renamed from: e */
    public final String f31667e;

    @Metadata(m28851d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0004J\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f*\u00020\rH\u0000¢\u0006\u0002\b\u000eR\u001e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, m28850d2 = {"Landroidx/compose/ui/tooling/animation/InfiniteTransitionComposeAnimation$Companion;", "", "()V", "<set-?>", "", "apiAvailable", "getApiAvailable", "()Z", "testOverrideAvailability", "", "override", "parse", "Landroidx/compose/ui/tooling/animation/InfiniteTransitionComposeAnimation;", "Landroidx/compose/ui/tooling/animation/AnimationSearch$InfiniteTransitionSearchInfo;", "parse$ui_tooling_release", "ui-tooling_release"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: androidx.compose.ui.tooling.animation.InfiniteTransitionComposeAnimation$Companion */
    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean getApiAvailable() {
            return InfiniteTransitionComposeAnimation.f31662f;
        }

        @Nullable
        public final InfiniteTransitionComposeAnimation parse$ui_tooling_release(@NotNull AnimationSearch.InfiniteTransitionSearchInfo infiniteTransitionSearchInfo) {
            Intrinsics.checkNotNullParameter(infiniteTransitionSearchInfo, "<this>");
            if (!getApiAvailable()) {
                return null;
            }
            return new InfiniteTransitionComposeAnimation(infiniteTransitionSearchInfo.getToolingState(), infiniteTransitionSearchInfo.getInfiniteTransition(), null);
        }

        public final void testOverrideAvailability(boolean z) {
            InfiniteTransitionComposeAnimation.f31662f = z;
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
            } else if (Intrinsics.areEqual(values[i].name(), "INFINITE_TRANSITION")) {
                z = true;
                break;
            } else {
                i++;
            }
        }
        f31662f = z;
    }

    public /* synthetic */ InfiniteTransitionComposeAnimation(ToolingState toolingState, InfiniteTransition infiniteTransition, DefaultConstructorMarker defaultConstructorMarker) {
        this(toolingState, infiniteTransition);
    }

    @NotNull
    public String getLabel() {
        return this.f31667e;
    }

    @NotNull
    public Set<Object> getStates() {
        return this.f31666d;
    }

    @NotNull
    public ComposeAnimationType getType() {
        return this.f31665c;
    }

    public final void setTimeNanos(long j) {
        this.f31663a.setValue(Long.valueOf(j));
    }

    public InfiniteTransitionComposeAnimation(ToolingState toolingState, InfiniteTransition infiniteTransition) {
        this.f31663a = toolingState;
        this.f31664b = infiniteTransition;
        this.f31665c = ComposeAnimationType.INFINITE_TRANSITION;
        this.f31666d = CG1.setOf(0);
        this.f31667e = m73603getAnimationObject().getLabel();
    }

    @NotNull
    /* renamed from: getAnimationObject */
    public InfiniteTransition m73603getAnimationObject() {
        return this.f31664b;
    }
}
