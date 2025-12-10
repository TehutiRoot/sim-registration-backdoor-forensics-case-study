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
import kotlinx.coroutines.AbstractC12015a;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m29143d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m29142d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@DebugMetadata(m29093c = "androidx.compose.foundation.gestures.ContentInViewModifier$launchAnimation$1", m29092f = "ContentInViewModifier.kt", m29091i = {}, m29090l = {193}, m29089m = "invokeSuspend", m29088n = {}, m29087s = {})
/* loaded from: classes.dex */
public final class ContentInViewModifier$launchAnimation$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ContentInViewModifier this$0;

    @Metadata(m29143d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m29142d2 = {"<anonymous>", "", "Landroidx/compose/foundation/gestures/ScrollScope;"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    @DebugMetadata(m29093c = "androidx.compose.foundation.gestures.ContentInViewModifier$launchAnimation$1$1", m29092f = "ContentInViewModifier.kt", m29091i = {}, m29090l = {198}, m29089m = "invokeSuspend", m29088n = {}, m29087s = {})
    /* renamed from: androidx.compose.foundation.gestures.ContentInViewModifier$launchAnimation$1$1 */
    /* loaded from: classes.dex */
    public static final class C27721 extends SuspendLambda implements Function2<ScrollScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Job $animationJob;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ ContentInViewModifier this$0;

        @Metadata(m29143d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m29142d2 = {"<anonymous>", "", "delta", "", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
        /* renamed from: androidx.compose.foundation.gestures.ContentInViewModifier$launchAnimation$1$1$1 */
        /* loaded from: classes.dex */
        public static final class C27731 extends Lambda implements Function1<Float, Unit> {
            final /* synthetic */ ScrollScope $$this$scroll;
            final /* synthetic */ Job $animationJob;
            final /* synthetic */ ContentInViewModifier this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C27731(ContentInViewModifier contentInViewModifier, ScrollScope scrollScope, Job job) {
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
                z = this.this$0.f13021d;
                float f2 = z ? 1.0f : -1.0f;
                float scrollBy = f2 * this.$$this$scroll.scrollBy(f2 * f);
                if (scrollBy < f) {
                    Job job = this.$animationJob;
                    AbstractC12015a.m27601j(job, "Scroll animation cancelled because scroll was not consumed (" + scrollBy + " < " + f + CoreConstants.RIGHT_PARENTHESIS_CHAR, null, 2, null);
                }
            }
        }

        @Metadata(m29143d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m29142d2 = {"<anonymous>", "", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
        @SourceDebugExtension({"SMAP\nContentInViewModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContentInViewModifier.kt\nandroidx/compose/foundation/gestures/ContentInViewModifier$launchAnimation$1$1$2\n+ 2 BringIntoViewRequestPriorityQueue.kt\nandroidx/compose/foundation/gestures/BringIntoViewRequestPriorityQueue\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,427:1\n118#2,4:428\n123#2,4:433\n48#3:432\n*S KotlinDebug\n*F\n+ 1 ContentInViewModifier.kt\nandroidx/compose/foundation/gestures/ContentInViewModifier$launchAnimation$1$1$2\n*L\n236#1:428,4\n236#1:433,4\n236#1:432\n*E\n"})
        /* renamed from: androidx.compose.foundation.gestures.ContentInViewModifier$launchAnimation$1$1$2 */
        /* loaded from: classes.dex */
        public static final class C27742 extends Lambda implements Function0<Unit> {
            final /* synthetic */ ContentInViewModifier this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C27742(ContentInViewModifier contentInViewModifier) {
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
                float m61473c;
                Rect m61468h;
                BringIntoViewRequestPriorityQueue bringIntoViewRequestPriorityQueue = this.this$0.f13022e;
                ContentInViewModifier contentInViewModifier = this.this$0;
                while (true) {
                    boolean z2 = true;
                    if (!bringIntoViewRequestPriorityQueue.f13017a.isNotEmpty()) {
                        break;
                    }
                    Rect invoke = ((ContentInViewModifier.Request) bringIntoViewRequestPriorityQueue.f13017a.last()).getCurrentBounds().invoke();
                    if (!(invoke == null ? true : ContentInViewModifier.m61466j(contentInViewModifier, invoke, 0L, 1, null))) {
                        break;
                    }
                    ((ContentInViewModifier.Request) bringIntoViewRequestPriorityQueue.f13017a.removeAt(bringIntoViewRequestPriorityQueue.f13017a.getSize() - 1)).getContinuation().resumeWith(Result.m74271constructorimpl(Unit.INSTANCE));
                }
                z = this.this$0.f13026i;
                if (z) {
                    m61468h = this.this$0.m61468h();
                    if ((m61468h == null || !ContentInViewModifier.m61466j(this.this$0, m61468h, 0L, 1, null)) ? false : false) {
                        this.this$0.f13026i = false;
                    }
                }
                updatableAnimationState = this.this$0.f13029l;
                m61473c = this.this$0.m61473c();
                updatableAnimationState.setValue(m61473c);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C27721(ContentInViewModifier contentInViewModifier, Job job, Continuation<? super C27721> continuation) {
            super(2, continuation);
            this.this$0 = contentInViewModifier;
            this.$animationJob = job;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            C27721 c27721 = new C27721(this.this$0, this.$animationJob, continuation);
            c27721.L$0 = obj;
            return c27721;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull ScrollScope scrollScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C27721) create(scrollScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            UpdatableAnimationState updatableAnimationState;
            float m61473c;
            UpdatableAnimationState updatableAnimationState2;
            Object coroutine_suspended = AbstractC19782eg0.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                updatableAnimationState = this.this$0.f13029l;
                m61473c = this.this$0.m61473c();
                updatableAnimationState.setValue(m61473c);
                updatableAnimationState2 = this.this$0.f13029l;
                C27731 c27731 = new C27731(this.this$0, (ScrollScope) this.L$0, this.$animationJob);
                C27742 c27742 = new C27742(this.this$0);
                this.label = 1;
                if (updatableAnimationState2.animateToZero(c27731, c27742, this) == coroutine_suspended) {
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
        Object coroutine_suspended = AbstractC19782eg0.getCOROUTINE_SUSPENDED();
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
                    this.this$0.f13028k = true;
                    scrollableState = this.this$0.f13020c;
                    C27721 c27721 = new C27721(this.this$0, job, null);
                    this.label = 1;
                    if (GF1.m68300e(scrollableState, null, c27721, this, 1, null) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                this.this$0.f13022e.resumeAndRemoveAll();
                this.this$0.f13028k = false;
                this.this$0.f13022e.cancelAndRemoveAll(null);
                this.this$0.f13026i = false;
                return Unit.INSTANCE;
            } catch (CancellationException e) {
                throw e;
            }
        } catch (Throwable th2) {
            this.this$0.f13028k = false;
            this.this$0.f13022e.cancelAndRemoveAll(null);
            this.this$0.f13026i = false;
            throw th2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((ContentInViewModifier$launchAnimation$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}