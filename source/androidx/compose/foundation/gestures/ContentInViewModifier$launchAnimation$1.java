package androidx.compose.foundation.gestures;

import androidx.compose.foundation.gestures.ContentInViewModifier;
import androidx.compose.p003ui.geometry.Rect;
import ch.qos.logback.core.CoreConstants;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.AbstractC12039a;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m28850d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
@DebugMetadata(m28801c = "androidx.compose.foundation.gestures.ContentInViewModifier$launchAnimation$1", m28800f = "ContentInViewModifier.kt", m28799i = {}, m28798l = {193}, m28797m = "invokeSuspend", m28796n = {}, m28795s = {})
/* loaded from: classes.dex */
public final class ContentInViewModifier$launchAnimation$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ContentInViewModifier this$0;

    @Metadata(m28851d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m28850d2 = {"<anonymous>", "", "Landroidx/compose/foundation/gestures/ScrollScope;"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
    @DebugMetadata(m28801c = "androidx.compose.foundation.gestures.ContentInViewModifier$launchAnimation$1$1", m28800f = "ContentInViewModifier.kt", m28799i = {}, m28798l = {198}, m28797m = "invokeSuspend", m28796n = {}, m28795s = {})
    /* renamed from: androidx.compose.foundation.gestures.ContentInViewModifier$launchAnimation$1$1 */
    /* loaded from: classes.dex */
    public static final class C27901 extends SuspendLambda implements Function2<ScrollScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Job $animationJob;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ ContentInViewModifier this$0;

        @Metadata(m28851d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m28850d2 = {"<anonymous>", "", "delta", "", "invoke"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
        /* renamed from: androidx.compose.foundation.gestures.ContentInViewModifier$launchAnimation$1$1$1 */
        /* loaded from: classes.dex */
        public static final class C27911 extends Lambda implements Function1<Float, Unit> {
            final /* synthetic */ ScrollScope $$this$scroll;
            final /* synthetic */ Job $animationJob;
            final /* synthetic */ ContentInViewModifier this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C27911(ContentInViewModifier contentInViewModifier, ScrollScope scrollScope, Job job) {
                super(1);
                this.this$0 = contentInViewModifier;
                this.$$this$scroll = scrollScope;
                this.$animationJob = job;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Float f) {
                invoke(f.floatValue());
                return Unit.INSTANCE;
            }

            public final void invoke(float f) {
                boolean z;
                z = this.this$0.f12933d;
                float f2 = z ? 1.0f : -1.0f;
                float scrollBy = f2 * this.$$this$scroll.scrollBy(f2 * f);
                if (scrollBy < f) {
                    Job job = this.$animationJob;
                    AbstractC12039a.m27309j(job, "Scroll animation cancelled because scroll was not consumed (" + scrollBy + " < " + f + CoreConstants.RIGHT_PARENTHESIS_CHAR, null, 2, null);
                }
            }
        }

        @Metadata(m28851d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28850d2 = {"<anonymous>", "", "invoke"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
        @SourceDebugExtension({"SMAP\nContentInViewModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContentInViewModifier.kt\nandroidx/compose/foundation/gestures/ContentInViewModifier$launchAnimation$1$1$2\n+ 2 BringIntoViewRequestPriorityQueue.kt\nandroidx/compose/foundation/gestures/BringIntoViewRequestPriorityQueue\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,427:1\n118#2,4:428\n123#2,4:433\n48#3:432\n*S KotlinDebug\n*F\n+ 1 ContentInViewModifier.kt\nandroidx/compose/foundation/gestures/ContentInViewModifier$launchAnimation$1$1$2\n*L\n236#1:428,4\n236#1:433,4\n236#1:432\n*E\n"})
        /* renamed from: androidx.compose.foundation.gestures.ContentInViewModifier$launchAnimation$1$1$2 */
        /* loaded from: classes.dex */
        public static final class C27922 extends Lambda implements Function0<Unit> {
            final /* synthetic */ ContentInViewModifier this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C27922(ContentInViewModifier contentInViewModifier) {
                super(0);
                this.this$0 = contentInViewModifier;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
                boolean z;
                UpdatableAnimationState updatableAnimationState;
                float m61523c;
                Rect m61518h;
                BringIntoViewRequestPriorityQueue bringIntoViewRequestPriorityQueue = this.this$0.f12934e;
                ContentInViewModifier contentInViewModifier = this.this$0;
                while (true) {
                    boolean z2 = true;
                    if (!bringIntoViewRequestPriorityQueue.f12929a.isNotEmpty()) {
                        break;
                    }
                    Rect invoke = ((ContentInViewModifier.Request) bringIntoViewRequestPriorityQueue.f12929a.last()).getCurrentBounds().invoke();
                    if (!(invoke == null ? true : ContentInViewModifier.m61516j(contentInViewModifier, invoke, 0L, 1, null))) {
                        break;
                    }
                    ((ContentInViewModifier.Request) bringIntoViewRequestPriorityQueue.f12929a.removeAt(bringIntoViewRequestPriorityQueue.f12929a.getSize() - 1)).getContinuation().resumeWith(Result.m74087constructorimpl(Unit.INSTANCE));
                }
                z = this.this$0.f12938i;
                if (z) {
                    m61518h = this.this$0.m61518h();
                    if ((m61518h == null || !ContentInViewModifier.m61516j(this.this$0, m61518h, 0L, 1, null)) ? false : false) {
                        this.this$0.f12938i = false;
                    }
                }
                updatableAnimationState = this.this$0.f12941l;
                m61523c = this.this$0.m61523c();
                updatableAnimationState.setValue(m61523c);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C27901(ContentInViewModifier contentInViewModifier, Job job, Continuation<? super C27901> continuation) {
            super(2, continuation);
            this.this$0 = contentInViewModifier;
            this.$animationJob = job;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            C27901 c27901 = new C27901(this.this$0, this.$animationJob, continuation);
            c27901.L$0 = obj;
            return c27901;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull ScrollScope scrollScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C27901) create(scrollScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            UpdatableAnimationState updatableAnimationState;
            float m61523c;
            UpdatableAnimationState updatableAnimationState2;
            Object coroutine_suspended = AbstractC18812Yf0.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                updatableAnimationState = this.this$0.f12941l;
                m61523c = this.this$0.m61523c();
                updatableAnimationState.setValue(m61523c);
                updatableAnimationState2 = this.this$0.f12941l;
                C27911 c27911 = new C27911(this.this$0, (ScrollScope) this.L$0, this.$animationJob);
                C27922 c27922 = new C27922(this.this$0);
                this.label = 1;
                if (updatableAnimationState2.animateToZero(c27911, c27922, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContentInViewModifier$launchAnimation$1(ContentInViewModifier contentInViewModifier, Continuation<? super ContentInViewModifier$launchAnimation$1> continuation) {
        super(2, continuation);
        this.this$0 = contentInViewModifier;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        ContentInViewModifier$launchAnimation$1 contentInViewModifier$launchAnimation$1 = new ContentInViewModifier$launchAnimation$1(this.this$0, continuation);
        contentInViewModifier$launchAnimation$1.L$0 = obj;
        return contentInViewModifier$launchAnimation$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        ScrollableState scrollableState;
        Object coroutine_suspended = AbstractC18812Yf0.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
            try {
                if (i != 0) {
                    if (i == 1) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    Job job = JobKt.getJob(((CoroutineScope) this.L$0).getCoroutineContext());
                    this.this$0.f12940k = true;
                    scrollableState = this.this$0.f12932c;
                    C27901 c27901 = new C27901(this.this$0, job, null);
                    this.label = 1;
                    if (JE1.m67770e(scrollableState, null, c27901, this, 1, null) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                this.this$0.f12934e.resumeAndRemoveAll();
                this.this$0.f12940k = false;
                this.this$0.f12934e.cancelAndRemoveAll(null);
                this.this$0.f12938i = false;
                return Unit.INSTANCE;
            } catch (CancellationException e) {
                throw e;
            }
        } catch (Throwable th2) {
            this.this$0.f12940k = false;
            this.this$0.f12934e.cancelAndRemoveAll(null);
            this.this$0.f12938i = false;
            throw th2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((ContentInViewModifier$launchAnimation$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
