package androidx.compose.foundation.text.selection;

import androidx.compose.p003ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.p003ui.input.pointer.PointerInputChange;
import ch.qos.logback.core.net.SyslogConstants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m28850d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
@DebugMetadata(m28801c = "androidx.compose.foundation.text.selection.TextSelectionMouseDetectorKt$mouseSelectionDetector$2", m28800f = "TextSelectionMouseDetector.kt", m28799i = {0, 0, 1, 1, 2, 2}, m28798l = {89, SyslogConstants.LOG_NTP, 111}, m28797m = "invokeSuspend", m28796n = {"$this$awaitEachGesture", "clicksCounter", "$this$awaitEachGesture", "clicksCounter", "$this$awaitEachGesture", "clicksCounter"}, m28795s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$1"})
/* loaded from: classes.dex */
public final class TextSelectionMouseDetectorKt$mouseSelectionDetector$2 extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MouseSelectionObserver $observer;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    @Metadata(m28851d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m28850d2 = {"<anonymous>", "", "it", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "invoke"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: androidx.compose.foundation.text.selection.TextSelectionMouseDetectorKt$mouseSelectionDetector$2$1 */
    /* loaded from: classes.dex */
    public static final class C30501 extends Lambda implements Function1<PointerInputChange, Unit> {
        final /* synthetic */ MouseSelectionObserver $observer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C30501(MouseSelectionObserver mouseSelectionObserver) {
            super(1);
            this.$observer = mouseSelectionObserver;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(PointerInputChange pointerInputChange) {
            invoke2(pointerInputChange);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull PointerInputChange it) {
            Intrinsics.checkNotNullParameter(it, "it");
            if (this.$observer.mo69824onExtendDragk4lQ0M(it.m72714getPositionF1C5BW0())) {
                it.consume();
            }
        }
    }

    @Metadata(m28851d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m28850d2 = {"<anonymous>", "", "it", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "invoke"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: androidx.compose.foundation.text.selection.TextSelectionMouseDetectorKt$mouseSelectionDetector$2$2 */
    /* loaded from: classes.dex */
    public static final class C30512 extends Lambda implements Function1<PointerInputChange, Unit> {
        final /* synthetic */ MouseSelectionObserver $observer;
        final /* synthetic */ SelectionAdjustment $selectionMode;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C30512(MouseSelectionObserver mouseSelectionObserver, SelectionAdjustment selectionAdjustment) {
            super(1);
            this.$observer = mouseSelectionObserver;
            this.$selectionMode = selectionAdjustment;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(PointerInputChange pointerInputChange) {
            invoke2(pointerInputChange);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull PointerInputChange it) {
            Intrinsics.checkNotNullParameter(it, "it");
            if (this.$observer.mo69822onDrag3MmeM6k(it.m72714getPositionF1C5BW0(), this.$selectionMode)) {
                it.consume();
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextSelectionMouseDetectorKt$mouseSelectionDetector$2(MouseSelectionObserver mouseSelectionObserver, Continuation<? super TextSelectionMouseDetectorKt$mouseSelectionDetector$2> continuation) {
        super(2, continuation);
        this.$observer = mouseSelectionObserver;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        TextSelectionMouseDetectorKt$mouseSelectionDetector$2 textSelectionMouseDetectorKt$mouseSelectionDetector$2 = new TextSelectionMouseDetectorKt$mouseSelectionDetector$2(this.$observer, continuation);
        textSelectionMouseDetectorKt$mouseSelectionDetector$2.L$0 = obj;
        return textSelectionMouseDetectorKt$mouseSelectionDetector$2;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull AwaitPointerEventScope awaitPointerEventScope, @Nullable Continuation<? super Unit> continuation) {
        return ((TextSelectionMouseDetectorKt$mouseSelectionDetector$2) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0090  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0073 -> B:35:0x00d3). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x008d -> B:35:0x00d3). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00b6 -> B:35:0x00d3). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00d0 -> B:35:0x00d3). Please submit an issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.Object r0 = p000.AbstractC18812Yf0.getCOROUTINE_SUSPENDED()
            int r1 = r11.label
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L33
            if (r1 == r4) goto L27
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            goto L1a
        L12:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L1a:
            java.lang.Object r1 = r11.L$1
            Yp r1 = (p000.C1782Yp) r1
            java.lang.Object r5 = r11.L$0
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r5 = (androidx.compose.p003ui.input.pointer.AwaitPointerEventScope) r5
            kotlin.ResultKt.throwOnFailure(r12)
            goto Ld3
        L27:
            java.lang.Object r1 = r11.L$1
            Yp r1 = (p000.C1782Yp) r1
            java.lang.Object r5 = r11.L$0
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r5 = (androidx.compose.p003ui.input.pointer.AwaitPointerEventScope) r5
            kotlin.ResultKt.throwOnFailure(r12)
            goto L53
        L33:
            kotlin.ResultKt.throwOnFailure(r12)
            java.lang.Object r12 = r11.L$0
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r12 = (androidx.compose.p003ui.input.pointer.AwaitPointerEventScope) r12
            Yp r1 = new Yp
            androidx.compose.ui.platform.ViewConfiguration r5 = r12.getViewConfiguration()
            r1.<init>(r5)
        L43:
            r11.L$0 = r12
            r11.L$1 = r1
            r11.label = r4
            java.lang.Object r5 = androidx.compose.foundation.text.selection.TextSelectionMouseDetectorKt.access$awaitMouseEventDown(r12, r11)
            if (r5 != r0) goto L50
            return r0
        L50:
            r10 = r5
            r5 = r12
            r12 = r10
        L53:
            androidx.compose.ui.input.pointer.PointerEvent r12 = (androidx.compose.p003ui.input.pointer.PointerEvent) r12
            r1.m65290d(r12)
            java.util.List r6 = r12.getChanges()
            r7 = 0
            java.lang.Object r6 = r6.get(r7)
            androidx.compose.ui.input.pointer.PointerInputChange r6 = (androidx.compose.p003ui.input.pointer.PointerInputChange) r6
            boolean r12 = androidx.compose.foundation.text.selection.TextFieldSelectionManager_androidKt.isShiftPressed(r12)
            if (r12 == 0) goto L90
            androidx.compose.foundation.text.selection.MouseSelectionObserver r12 = r11.$observer
            long r7 = r6.m72714getPositionF1C5BW0()
            boolean r12 = r12.mo69823onExtendk4lQ0M(r7)
            if (r12 == 0) goto Ld3
            r6.consume()
            long r6 = r6.m72713getIdJ3iCeTQ()
            androidx.compose.foundation.text.selection.TextSelectionMouseDetectorKt$mouseSelectionDetector$2$1 r12 = new androidx.compose.foundation.text.selection.TextSelectionMouseDetectorKt$mouseSelectionDetector$2$1
            androidx.compose.foundation.text.selection.MouseSelectionObserver r8 = r11.$observer
            r12.<init>(r8)
            r11.L$0 = r5
            r11.L$1 = r1
            r11.label = r3
            java.lang.Object r12 = androidx.compose.foundation.gestures.DragGestureDetectorKt.m69401dragjO51t88(r5, r6, r12, r11)
            if (r12 != r0) goto Ld3
            return r0
        L90:
            int r12 = r1.m65293a()
            if (r12 == r4) goto La6
            if (r12 == r3) goto L9f
            androidx.compose.foundation.text.selection.SelectionAdjustment$Companion r12 = androidx.compose.foundation.text.selection.SelectionAdjustment.Companion
            androidx.compose.foundation.text.selection.SelectionAdjustment r12 = r12.getParagraph()
            goto Lac
        L9f:
            androidx.compose.foundation.text.selection.SelectionAdjustment$Companion r12 = androidx.compose.foundation.text.selection.SelectionAdjustment.Companion
            androidx.compose.foundation.text.selection.SelectionAdjustment r12 = r12.getWord()
            goto Lac
        La6:
            androidx.compose.foundation.text.selection.SelectionAdjustment$Companion r12 = androidx.compose.foundation.text.selection.SelectionAdjustment.Companion
            androidx.compose.foundation.text.selection.SelectionAdjustment r12 = r12.getNone()
        Lac:
            androidx.compose.foundation.text.selection.MouseSelectionObserver r7 = r11.$observer
            long r8 = r6.m72714getPositionF1C5BW0()
            boolean r7 = r7.mo69825onStart3MmeM6k(r8, r12)
            if (r7 == 0) goto Ld3
            r6.consume()
            long r6 = r6.m72713getIdJ3iCeTQ()
            androidx.compose.foundation.text.selection.TextSelectionMouseDetectorKt$mouseSelectionDetector$2$2 r8 = new androidx.compose.foundation.text.selection.TextSelectionMouseDetectorKt$mouseSelectionDetector$2$2
            androidx.compose.foundation.text.selection.MouseSelectionObserver r9 = r11.$observer
            r8.<init>(r9, r12)
            r11.L$0 = r5
            r11.L$1 = r1
            r11.label = r2
            java.lang.Object r12 = androidx.compose.foundation.gestures.DragGestureDetectorKt.m69401dragjO51t88(r5, r6, r8, r11)
            if (r12 != r0) goto Ld3
            return r0
        Ld3:
            r12 = r5
            goto L43
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.TextSelectionMouseDetectorKt$mouseSelectionDetector$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
