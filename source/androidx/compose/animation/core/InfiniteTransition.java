package androidx.compose.animation.core;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.exifinterface.media.ExifInterface;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010 \n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001,B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\u000b\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0006R\u00020\u0000H\u0000¢\u0006\u0004\b\t\u0010\nJ#\u0010\r\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0006R\u00020\u0000H\u0000¢\u0006\u0004\b\f\u0010\nJ\u000f\u0010\u0010\u001a\u00020\bH\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R&\u0010\u001c\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0006R\u00020\u00000\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR+\u0010#\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001d8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0013\u0010\u001f\u001a\u0004\b\u0015\u0010 \"\u0004\b!\u0010\"R\u0016\u0010%\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010$R+\u0010'\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001d8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b&\u0010\u001f\u001a\u0004\b\u001a\u0010 \"\u0004\b&\u0010\"R#\u0010+\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0006R\u00020\u00000(8F¢\u0006\u0006\u001a\u0004\b)\u0010*¨\u0006-"}, m28850d2 = {"Landroidx/compose/animation/core/InfiniteTransition;", "", "", "label", "<init>", "(Ljava/lang/String;)V", "Landroidx/compose/animation/core/InfiniteTransition$TransitionAnimationState;", "animation", "", "addAnimation$animation_core_release", "(Landroidx/compose/animation/core/InfiniteTransition$TransitionAnimationState;)V", "addAnimation", "removeAnimation$animation_core_release", "removeAnimation", "run$animation_core_release", "(Landroidx/compose/runtime/Composer;I)V", "run", "", "playTimeNanos", OperatorName.CURVE_TO, "(J)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/lang/String;", "getLabel", "()Ljava/lang/String;", "Landroidx/compose/runtime/collection/MutableVector;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Landroidx/compose/runtime/collection/MutableVector;", "_animations", "", "<set-?>", "Landroidx/compose/runtime/MutableState;", "()Z", "d", "(Z)V", "refreshChildNeeded", OperatorName.SET_LINE_CAPSTYLE, "startTimeNanos", "e", "isRunning", "", "getAnimations", "()Ljava/util/List;", "animations", "TransitionAnimationState", "animation-core_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nInfiniteTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InfiniteTransition.kt\nandroidx/compose/animation/core/InfiniteTransition\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 6 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,364:1\n1182#2:365\n1161#2,2:366\n81#3:368\n107#3,2:369\n81#3:371\n107#3,2:372\n25#4:374\n1097#5,6:375\n460#6,11:381\n*S KotlinDebug\n*F\n+ 1 InfiniteTransition.kt\nandroidx/compose/animation/core/InfiniteTransition\n*L\n150#1:365\n150#1:366,2\n151#1:368\n151#1:369,2\n153#1:371\n153#1:372,2\n173#1:374\n173#1:375,6\n217#1:381,11\n*E\n"})
/* loaded from: classes.dex */
public final class InfiniteTransition {
    public static final int $stable = 8;

    /* renamed from: a */
    public final String f12532a;

    /* renamed from: b */
    public final MutableVector f12533b;

    /* renamed from: c */
    public final MutableState f12534c;

    /* renamed from: d */
    public long f12535d;

    /* renamed from: e */
    public final MutableState f12536e;

    @Metadata(m28851d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b$\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\u0004\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0003*\u00020\u00022\b\u0012\u0004\u0012\u00028\u00000\u0004BC\b\u0000\u0012\u0006\u0010\u0005\u001a\u00028\u0000\u0012\u0006\u0010\u0006\u001a\u00028\u0000\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ-\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00028\u00002\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0013H\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u001a\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001c\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u001b\u0010\u0019R\"\u0010\u0005\u001a\u00028\u00008\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\"\u0010\u0006\u001a\u00028\u00008\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b#\u0010\u001e\u001a\u0004\b$\u0010 \"\u0004\b%\u0010\"R#\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00078\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R+\u00103\u001a\u00028\u00002\u0006\u0010.\u001a\u00028\u00008V@PX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u0010 \"\u0004\b2\u0010\"R0\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t2\f\u0010.\u001a\b\u0012\u0004\u0012\u00028\u00000\t8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107RB\u0010?\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001082\u0012\u0010.\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001088\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\"\u0010G\u001a\u00020@8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bA\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\u0016\u0010I\u001a\u00020@8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010BR\u0016\u0010L\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010K¨\u0006M"}, m28850d2 = {"Landroidx/compose/animation/core/InfiniteTransition$TransitionAnimationState;", "T", "Landroidx/compose/animation/core/AnimationVector;", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Landroidx/compose/runtime/State;", "initialValue", "targetValue", "Landroidx/compose/animation/core/TwoWayConverter;", "typeConverter", "Landroidx/compose/animation/core/AnimationSpec;", "animationSpec", "", "label", "<init>", "(Landroidx/compose/animation/core/InfiniteTransition;Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/animation/core/TwoWayConverter;Landroidx/compose/animation/core/AnimationSpec;Ljava/lang/String;)V", "", "updateValues$animation_core_release", "(Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/animation/core/AnimationSpec;)V", "updateValues", "", "playTimeNanos", "onPlayTimeChanged$animation_core_release", "(J)V", "onPlayTimeChanged", "skipToEnd$animation_core_release", "()V", "skipToEnd", "reset$animation_core_release", "reset", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/lang/Object;", "getInitialValue$animation_core_release", "()Ljava/lang/Object;", "setInitialValue$animation_core_release", "(Ljava/lang/Object;)V", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getTargetValue$animation_core_release", "setTargetValue$animation_core_release", OperatorName.CURVE_TO, "Landroidx/compose/animation/core/TwoWayConverter;", "getTypeConverter", "()Landroidx/compose/animation/core/TwoWayConverter;", "d", "Ljava/lang/String;", "getLabel", "()Ljava/lang/String;", "<set-?>", "e", "Landroidx/compose/runtime/MutableState;", "getValue", "setValue$animation_core_release", "value", OperatorName.FILL_NON_ZERO, "Landroidx/compose/animation/core/AnimationSpec;", "getAnimationSpec", "()Landroidx/compose/animation/core/AnimationSpec;", "Landroidx/compose/animation/core/TargetBasedAnimation;", OperatorName.NON_STROKING_GRAY, "Landroidx/compose/animation/core/TargetBasedAnimation;", "getAnimation", "()Landroidx/compose/animation/core/TargetBasedAnimation;", "setAnimation$animation_core_release", "(Landroidx/compose/animation/core/TargetBasedAnimation;)V", "animation", "", OperatorName.CLOSE_PATH, "Z", "isFinished$animation_core_release", "()Z", "setFinished$animation_core_release", "(Z)V", "isFinished", "i", "startOnTheNextFrame", OperatorName.SET_LINE_JOINSTYLE, OperatorName.SET_LINE_CAPSTYLE, "playTimeNanosOffset", "animation-core_release"}, m28849k = 1, m28848mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nInfiniteTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InfiniteTransition.kt\nandroidx/compose/animation/core/InfiniteTransition$TransitionAnimationState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,364:1\n81#2:365\n107#2,2:366\n*S KotlinDebug\n*F\n+ 1 InfiniteTransition.kt\nandroidx/compose/animation/core/InfiniteTransition$TransitionAnimationState\n*L\n76#1:365\n76#1:366,2\n*E\n"})
    /* loaded from: classes.dex */
    public final class TransitionAnimationState<T, V extends AnimationVector> implements State<T> {

        /* renamed from: a */
        public Object f12537a;

        /* renamed from: b */
        public Object f12538b;

        /* renamed from: c */
        public final TwoWayConverter f12539c;

        /* renamed from: d */
        public final String f12540d;

        /* renamed from: e */
        public final MutableState f12541e;

        /* renamed from: f */
        public AnimationSpec f12542f;

        /* renamed from: g */
        public TargetBasedAnimation f12543g;

        /* renamed from: h */
        public boolean f12544h;

        /* renamed from: i */
        public boolean f12545i;

        /* renamed from: j */
        public long f12546j;

        /* renamed from: k */
        public final /* synthetic */ InfiniteTransition f12547k;

        public TransitionAnimationState(InfiniteTransition infiniteTransition, T t, @NotNull T t2, @NotNull TwoWayConverter<T, V> typeConverter, @NotNull AnimationSpec<T> animationSpec, String label) {
            MutableState m31891g;
            Intrinsics.checkNotNullParameter(typeConverter, "typeConverter");
            Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
            Intrinsics.checkNotNullParameter(label, "label");
            this.f12547k = infiniteTransition;
            this.f12537a = t;
            this.f12538b = t2;
            this.f12539c = typeConverter;
            this.f12540d = label;
            m31891g = AbstractC19508dK1.m31891g(t, null, 2, null);
            this.f12541e = m31891g;
            this.f12542f = animationSpec;
            this.f12543g = new TargetBasedAnimation(this.f12542f, typeConverter, this.f12537a, this.f12538b, (AnimationVector) null, 16, (DefaultConstructorMarker) null);
        }

        @NotNull
        public final TargetBasedAnimation<T, V> getAnimation() {
            return this.f12543g;
        }

        @NotNull
        public final AnimationSpec<T> getAnimationSpec() {
            return this.f12542f;
        }

        public final T getInitialValue$animation_core_release() {
            return (T) this.f12537a;
        }

        @NotNull
        public final String getLabel() {
            return this.f12540d;
        }

        public final T getTargetValue$animation_core_release() {
            return (T) this.f12538b;
        }

        @NotNull
        public final TwoWayConverter<T, V> getTypeConverter() {
            return this.f12539c;
        }

        @Override // androidx.compose.runtime.State
        public T getValue() {
            return this.f12541e.getValue();
        }

        public final boolean isFinished$animation_core_release() {
            return this.f12544h;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void onPlayTimeChanged$animation_core_release(long j) {
            this.f12547k.m61696d(false);
            if (this.f12545i) {
                this.f12545i = false;
                this.f12546j = j;
            }
            long j2 = j - this.f12546j;
            setValue$animation_core_release(this.f12543g.getValueFromNanos(j2));
            this.f12544h = this.f12543g.isFinishedFromNanos(j2);
        }

        public final void reset$animation_core_release() {
            this.f12545i = true;
        }

        public final void setAnimation$animation_core_release(@NotNull TargetBasedAnimation<T, V> targetBasedAnimation) {
            Intrinsics.checkNotNullParameter(targetBasedAnimation, "<set-?>");
            this.f12543g = targetBasedAnimation;
        }

        public final void setFinished$animation_core_release(boolean z) {
            this.f12544h = z;
        }

        public final void setInitialValue$animation_core_release(T t) {
            this.f12537a = t;
        }

        public final void setTargetValue$animation_core_release(T t) {
            this.f12538b = t;
        }

        public void setValue$animation_core_release(T t) {
            this.f12541e.setValue(t);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void skipToEnd$animation_core_release() {
            setValue$animation_core_release(this.f12543g.getTargetValue());
            this.f12545i = true;
        }

        public final void updateValues$animation_core_release(T t, T t2, @NotNull AnimationSpec<T> animationSpec) {
            Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
            this.f12537a = t;
            this.f12538b = t2;
            this.f12542f = animationSpec;
            this.f12543g = new TargetBasedAnimation(animationSpec, this.f12539c, t, t2, (AnimationVector) null, 16, (DefaultConstructorMarker) null);
            this.f12547k.m61696d(true);
            this.f12544h = false;
            this.f12545i = true;
        }
    }

    public InfiniteTransition(@NotNull String label) {
        MutableState m31891g;
        MutableState m31891g2;
        Intrinsics.checkNotNullParameter(label, "label");
        this.f12532a = label;
        this.f12533b = new MutableVector(new TransitionAnimationState[16], 0);
        m31891g = AbstractC19508dK1.m31891g(Boolean.FALSE, null, 2, null);
        this.f12534c = m31891g;
        this.f12535d = Long.MIN_VALUE;
        m31891g2 = AbstractC19508dK1.m31891g(Boolean.TRUE, null, 2, null);
        this.f12536e = m31891g2;
    }

    /* renamed from: a */
    public final boolean m61699a() {
        return ((Boolean) this.f12534c.getValue()).booleanValue();
    }

    public final void addAnimation$animation_core_release(@NotNull TransitionAnimationState<?, ?> animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        this.f12533b.add(animation);
        m61696d(true);
    }

    /* renamed from: b */
    public final boolean m61698b() {
        return ((Boolean) this.f12536e.getValue()).booleanValue();
    }

    /* renamed from: c */
    public final void m61697c(long j) {
        boolean z;
        MutableVector mutableVector = this.f12533b;
        int size = mutableVector.getSize();
        if (size > 0) {
            Object[] content = mutableVector.getContent();
            int i = 0;
            z = true;
            do {
                TransitionAnimationState transitionAnimationState = (TransitionAnimationState) content[i];
                if (!transitionAnimationState.isFinished$animation_core_release()) {
                    transitionAnimationState.onPlayTimeChanged$animation_core_release(j);
                }
                if (!transitionAnimationState.isFinished$animation_core_release()) {
                    z = false;
                }
                i++;
            } while (i < size);
        } else {
            z = true;
        }
        m61695e(!z);
    }

    /* renamed from: d */
    public final void m61696d(boolean z) {
        this.f12534c.setValue(Boolean.valueOf(z));
    }

    /* renamed from: e */
    public final void m61695e(boolean z) {
        this.f12536e.setValue(Boolean.valueOf(z));
    }

    @NotNull
    public final List<TransitionAnimationState<?, ?>> getAnimations() {
        return this.f12533b.asMutableList();
    }

    @NotNull
    public final String getLabel() {
        return this.f12532a;
    }

    public final void removeAnimation$animation_core_release(@NotNull TransitionAnimationState<?, ?> animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        this.f12533b.remove(animation);
    }

    @Composable
    public final void run$animation_core_release(@Nullable Composer composer, int i) {
        Composer startRestartGroup = composer.startRestartGroup(-318043801);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-318043801, i, -1, "androidx.compose.animation.core.InfiniteTransition.run (InfiniteTransition.kt:171)");
        }
        startRestartGroup.startReplaceableGroup(-492369756);
        Object rememberedValue = startRestartGroup.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = AbstractC19508dK1.m31891g(null, null, 2, null);
            startRestartGroup.updateRememberedValue(rememberedValue);
        }
        startRestartGroup.endReplaceableGroup();
        MutableState mutableState = (MutableState) rememberedValue;
        if (m61698b() || m61699a()) {
            EffectsKt.LaunchedEffect(this, new InfiniteTransition$run$1(mutableState, this, null), startRestartGroup, 72);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new InfiniteTransition$run$2(this, i));
        }
    }
}
