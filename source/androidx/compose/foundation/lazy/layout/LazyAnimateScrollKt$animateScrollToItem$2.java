package androidx.compose.foundation.lazy.layout;

import androidx.compose.animation.core.AnimationScope;
import androidx.compose.animation.core.AnimationState;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.foundation.gestures.ScrollScope;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.AbstractC11719c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m28850d2 = {"<anonymous>", "", "Landroidx/compose/foundation/gestures/ScrollScope;"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
@DebugMetadata(m28801c = "androidx.compose.foundation.lazy.layout.LazyAnimateScrollKt$animateScrollToItem$2", m28800f = "LazyAnimateScroll.kt", m28799i = {0, 0, 0, 0, 0, 0, 0, 0, 1}, m28798l = {137, 237}, m28797m = "invokeSuspend", m28796n = {"$this$scroll", "loop", "anim", "loops", "targetDistancePx", "boundDistancePx", "minDistancePx", "forward", "$this$scroll"}, m28795s = {"L$0", "L$1", "L$2", "L$3", "F$0", "F$1", "F$2", "I$0", "L$0"})
@SourceDebugExtension({"SMAP\nLazyAnimateScroll.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyAnimateScroll.kt\nandroidx/compose/foundation/lazy/layout/LazyAnimateScrollKt$animateScrollToItem$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 LazyAnimateScroll.kt\nandroidx/compose/foundation/lazy/layout/LazyAnimateScrollKt\n*L\n1#1,268:1\n1#2:269\n40#3,4:270\n40#3,4:274\n*S KotlinDebug\n*F\n+ 1 LazyAnimateScroll.kt\nandroidx/compose/foundation/lazy/layout/LazyAnimateScrollKt$animateScrollToItem$2\n*L\n129#1:270,4\n234#1:274,4\n*E\n"})
/* loaded from: classes.dex */
public final class LazyAnimateScrollKt$animateScrollToItem$2 extends SuspendLambda implements Function2<ScrollScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ int $index;
    final /* synthetic */ int $scrollOffset;
    final /* synthetic */ LazyAnimateScrollScope $this_animateScrollToItem;
    float F$0;
    float F$1;
    float F$2;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;

    @Metadata(m28851d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\n¢\u0006\u0002\b\u0005"}, m28850d2 = {"<anonymous>", "", "Landroidx/compose/animation/core/AnimationScope;", "", "Landroidx/compose/animation/core/AnimationVector1D;", "invoke"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
    @SourceDebugExtension({"SMAP\nLazyAnimateScroll.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyAnimateScroll.kt\nandroidx/compose/foundation/lazy/layout/LazyAnimateScrollKt$animateScrollToItem$2$3\n+ 2 LazyAnimateScroll.kt\nandroidx/compose/foundation/lazy/layout/LazyAnimateScrollKt\n*L\n1#1,268:1\n40#2,4:269\n40#2,4:273\n40#2,4:277\n40#2,4:281\n40#2,4:285\n40#2,4:289\n40#2,4:293\n40#2,4:297\n40#2,4:301\n*S KotlinDebug\n*F\n+ 1 LazyAnimateScroll.kt\nandroidx/compose/foundation/lazy/layout/LazyAnimateScrollKt$animateScrollToItem$2$3\n*L\n152#1:269,4\n159#1:273,4\n162#1:277,4\n170#1:281,4\n175#1:285,4\n186#1:289,4\n198#1:293,4\n211#1:297,4\n221#1:301,4\n*E\n"})
    /* renamed from: androidx.compose.foundation.lazy.layout.LazyAnimateScrollKt$animateScrollToItem$2$3 */
    /* loaded from: classes.dex */
    public static final class C29243 extends Lambda implements Function1<AnimationScope<Float, AnimationVector1D>, Unit> {
        final /* synthetic */ ScrollScope $$this$scroll;
        final /* synthetic */ Ref.ObjectRef<AnimationState<Float, AnimationVector1D>> $anim;
        final /* synthetic */ float $boundDistancePx;
        final /* synthetic */ boolean $forward;
        final /* synthetic */ int $index;
        final /* synthetic */ Ref.BooleanRef $loop;
        final /* synthetic */ Ref.IntRef $loops;
        final /* synthetic */ Ref.FloatRef $prevValue;
        final /* synthetic */ int $scrollOffset;
        final /* synthetic */ float $target;
        final /* synthetic */ LazyAnimateScrollScope $this_animateScrollToItem;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C29243(LazyAnimateScrollScope lazyAnimateScrollScope, int i, float f, Ref.FloatRef floatRef, ScrollScope scrollScope, Ref.BooleanRef booleanRef, boolean z, float f2, Ref.IntRef intRef, int i2, Ref.ObjectRef<AnimationState<Float, AnimationVector1D>> objectRef) {
            super(1);
            this.$this_animateScrollToItem = lazyAnimateScrollScope;
            this.$index = i;
            this.$target = f;
            this.$prevValue = floatRef;
            this.$$this$scroll = scrollScope;
            this.$loop = booleanRef;
            this.$forward = z;
            this.$boundDistancePx = f2;
            this.$loops = intRef;
            this.$scrollOffset = i2;
            this.$anim = objectRef;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(AnimationScope<Float, AnimationVector1D> animationScope) {
            invoke2(animationScope);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull AnimationScope<Float, AnimationVector1D> animateTo) {
            float coerceAtLeast;
            Intrinsics.checkNotNullParameter(animateTo, "$this$animateTo");
            Integer targetItemOffset = this.$this_animateScrollToItem.getTargetItemOffset(this.$index);
            if (targetItemOffset == null) {
                if (this.$target > 0.0f) {
                    coerceAtLeast = AbstractC11719c.coerceAtMost(animateTo.getValue().floatValue(), this.$target);
                } else {
                    coerceAtLeast = AbstractC11719c.coerceAtLeast(animateTo.getValue().floatValue(), this.$target);
                }
                float f = coerceAtLeast - this.$prevValue.element;
                float scrollBy = this.$$this$scroll.scrollBy(f);
                Integer targetItemOffset2 = this.$this_animateScrollToItem.getTargetItemOffset(this.$index);
                if (targetItemOffset2 == null && !LazyAnimateScrollKt$animateScrollToItem$2.invokeSuspend$isOvershot(this.$forward, this.$this_animateScrollToItem, this.$index, this.$scrollOffset)) {
                    if (f == scrollBy) {
                        this.$prevValue.element += f;
                        if (this.$forward) {
                            if (animateTo.getValue().floatValue() > this.$boundDistancePx) {
                                animateTo.cancelAnimation();
                            }
                        } else if (animateTo.getValue().floatValue() < (-this.$boundDistancePx)) {
                            animateTo.cancelAnimation();
                        }
                        if (this.$forward) {
                            if (this.$loops.element >= 2 && this.$index - this.$this_animateScrollToItem.getLastVisibleItemIndex() > this.$this_animateScrollToItem.getNumOfItemsForTeleport()) {
                                LazyAnimateScrollScope lazyAnimateScrollScope = this.$this_animateScrollToItem;
                                lazyAnimateScrollScope.snapToItem(this.$$this$scroll, this.$index - lazyAnimateScrollScope.getNumOfItemsForTeleport(), 0);
                            }
                        } else if (this.$loops.element >= 2 && this.$this_animateScrollToItem.getFirstVisibleItemIndex() - this.$index > this.$this_animateScrollToItem.getNumOfItemsForTeleport()) {
                            LazyAnimateScrollScope lazyAnimateScrollScope2 = this.$this_animateScrollToItem;
                            lazyAnimateScrollScope2.snapToItem(this.$$this$scroll, this.$index + lazyAnimateScrollScope2.getNumOfItemsForTeleport(), 0);
                        }
                    } else {
                        animateTo.cancelAnimation();
                        this.$loop.element = false;
                        return;
                    }
                }
                targetItemOffset = targetItemOffset2;
            }
            if (!LazyAnimateScrollKt$animateScrollToItem$2.invokeSuspend$isOvershot(this.$forward, this.$this_animateScrollToItem, this.$index, this.$scrollOffset)) {
                if (targetItemOffset != null) {
                    throw new ItemFoundInScroll(targetItemOffset.intValue(), this.$anim.element);
                }
                return;
            }
            this.$this_animateScrollToItem.snapToItem(this.$$this$scroll, this.$index, this.$scrollOffset);
            this.$loop.element = false;
            animateTo.cancelAnimation();
        }
    }

    @Metadata(m28851d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\n¢\u0006\u0002\b\u0005"}, m28850d2 = {"<anonymous>", "", "Landroidx/compose/animation/core/AnimationScope;", "", "Landroidx/compose/animation/core/AnimationVector1D;", "invoke"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
    @SourceDebugExtension({"SMAP\nLazyAnimateScroll.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyAnimateScroll.kt\nandroidx/compose/foundation/lazy/layout/LazyAnimateScrollKt$animateScrollToItem$2$5\n+ 2 LazyAnimateScroll.kt\nandroidx/compose/foundation/lazy/layout/LazyAnimateScrollKt\n*L\n1#1,268:1\n40#2,4:269\n40#2,4:273\n*S KotlinDebug\n*F\n+ 1 LazyAnimateScroll.kt\nandroidx/compose/foundation/lazy/layout/LazyAnimateScrollKt$animateScrollToItem$2$5\n*L\n247#1:269,4\n252#1:273,4\n*E\n"})
    /* renamed from: androidx.compose.foundation.lazy.layout.LazyAnimateScrollKt$animateScrollToItem$2$5 */
    /* loaded from: classes.dex */
    public static final class C29255 extends Lambda implements Function1<AnimationScope<Float, AnimationVector1D>, Unit> {
        final /* synthetic */ ScrollScope $$this$scroll;
        final /* synthetic */ Ref.FloatRef $prevValue;
        final /* synthetic */ float $target;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C29255(float f, Ref.FloatRef floatRef, ScrollScope scrollScope) {
            super(1);
            this.$target = f;
            this.$prevValue = floatRef;
            this.$$this$scroll = scrollScope;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(AnimationScope<Float, AnimationVector1D> animationScope) {
            invoke2(animationScope);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull AnimationScope<Float, AnimationVector1D> animateTo) {
            Intrinsics.checkNotNullParameter(animateTo, "$this$animateTo");
            float f = this.$target;
            float f2 = 0.0f;
            if (f > 0.0f) {
                f2 = AbstractC11719c.coerceAtMost(animateTo.getValue().floatValue(), this.$target);
            } else if (f < 0.0f) {
                f2 = AbstractC11719c.coerceAtLeast(animateTo.getValue().floatValue(), this.$target);
            }
            float f3 = f2 - this.$prevValue.element;
            if (f3 != this.$$this$scroll.scrollBy(f3) || f2 != animateTo.getValue().floatValue()) {
                animateTo.cancelAnimation();
            }
            this.$prevValue.element += f3;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyAnimateScrollKt$animateScrollToItem$2(int i, LazyAnimateScrollScope lazyAnimateScrollScope, int i2, Continuation<? super LazyAnimateScrollKt$animateScrollToItem$2> continuation) {
        super(2, continuation);
        this.$index = i;
        this.$this_animateScrollToItem = lazyAnimateScrollScope;
        this.$scrollOffset = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean invokeSuspend$isOvershot(boolean z, LazyAnimateScrollScope lazyAnimateScrollScope, int i, int i2) {
        if (z) {
            if (lazyAnimateScrollScope.getFirstVisibleItemIndex() <= i && (lazyAnimateScrollScope.getFirstVisibleItemIndex() != i || lazyAnimateScrollScope.getFirstVisibleItemScrollOffset() <= i2)) {
                return false;
            }
        } else if (lazyAnimateScrollScope.getFirstVisibleItemIndex() >= i && (lazyAnimateScrollScope.getFirstVisibleItemIndex() != i || lazyAnimateScrollScope.getFirstVisibleItemScrollOffset() >= i2)) {
            return false;
        }
        return true;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        LazyAnimateScrollKt$animateScrollToItem$2 lazyAnimateScrollKt$animateScrollToItem$2 = new LazyAnimateScrollKt$animateScrollToItem$2(this.$index, this.$this_animateScrollToItem, this.$scrollOffset, continuation);
        lazyAnimateScrollKt$animateScrollToItem$2.L$0 = obj;
        return lazyAnimateScrollKt$animateScrollToItem$2;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull ScrollScope scrollScope, @Nullable Continuation<? super Unit> continuation) {
        return ((LazyAnimateScrollKt$animateScrollToItem$2) create(scrollScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00d8 A[Catch: ItemFoundInScroll -> 0x01b4, TryCatch #0 {ItemFoundInScroll -> 0x01b4, blocks: (B:27:0x00d4, B:29:0x00d8, B:31:0x00e0, B:43:0x010d, B:47:0x0149, B:51:0x0156), top: B:79:0x00d4 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00f2 A[Catch: ItemFoundInScroll -> 0x0101, TRY_ENTER, TRY_LEAVE, TryCatch #3 {ItemFoundInScroll -> 0x0101, blocks: (B:57:0x01a4, B:34:0x00f2), top: B:84:0x01a4 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x019a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0227 A[RETURN] */
    /* JADX WARN: Type inference failed for: r1v21, types: [androidx.compose.animation.core.AnimationState, T] */
    /* JADX WARN: Type inference failed for: r6v0, types: [androidx.compose.animation.core.AnimationState, T] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x019b -> B:84:0x01a4). Please submit an issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r41) {
        /*
            Method dump skipped, instructions count: 596
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.layout.LazyAnimateScrollKt$animateScrollToItem$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
