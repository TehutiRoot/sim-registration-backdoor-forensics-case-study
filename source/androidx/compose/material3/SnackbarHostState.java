package androidx.compose.material3;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.Stable;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Stable
@Metadata(m28851d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0012\u0017B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J;\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\tH\u0086@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0086@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R/\u0010\u001c\u001a\u0004\u0018\u00010\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00158F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u0012\u0010\u001b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001d"}, m28850d2 = {"Landroidx/compose/material3/SnackbarHostState;", "", "<init>", "()V", "", "message", "actionLabel", "", "withDismissAction", "Landroidx/compose/material3/SnackbarDuration;", TypedValues.TransitionType.S_DURATION, "Landroidx/compose/material3/SnackbarResult;", "showSnackbar", "(Ljava/lang/String;Ljava/lang/String;ZLandroidx/compose/material3/SnackbarDuration;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/material3/SnackbarVisuals;", "visuals", "(Landroidx/compose/material3/SnackbarVisuals;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/sync/Mutex;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lkotlinx/coroutines/sync/Mutex;", "mutex", "Landroidx/compose/material3/SnackbarData;", "<set-?>", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Landroidx/compose/runtime/MutableState;", "getCurrentSnackbarData", "()Landroidx/compose/material3/SnackbarData;", "(Landroidx/compose/material3/SnackbarData;)V", "currentSnackbarData", "material3_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSnackbarHost.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnackbarHost.kt\nandroidx/compose/material3/SnackbarHostState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n+ 4 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,456:1\n76#2:457\n102#2,2:458\n107#3,8:460\n116#3:479\n115#3:480\n314#4,11:468\n*S KotlinDebug\n*F\n+ 1 SnackbarHost.kt\nandroidx/compose/material3/SnackbarHostState\n*L\n69#1:457\n69#1:458,2\n125#1:460,8\n125#1:479\n125#1:480\n127#1:468,11\n*E\n"})
/* loaded from: classes2.dex */
public final class SnackbarHostState {
    public static final int $stable = 0;

    /* renamed from: a */
    public final Mutex f26102a = MutexKt.Mutex$default(false, 1, null);

    /* renamed from: b */
    public final MutableState f26103b;

    /* renamed from: androidx.compose.material3.SnackbarHostState$a */
    /* loaded from: classes2.dex */
    public static final class C3374a implements SnackbarData {

        /* renamed from: a */
        public final SnackbarVisuals f26104a;

        /* renamed from: b */
        public final CancellableContinuation f26105b;

        public C3374a(SnackbarVisuals visuals, CancellableContinuation continuation) {
            Intrinsics.checkNotNullParameter(visuals, "visuals");
            Intrinsics.checkNotNullParameter(continuation, "continuation");
            this.f26104a = visuals;
            this.f26105b = continuation;
        }

        @Override // androidx.compose.material3.SnackbarData
        public void dismiss() {
            if (this.f26105b.isActive()) {
                CancellableContinuation cancellableContinuation = this.f26105b;
                Result.Companion companion = Result.Companion;
                cancellableContinuation.resumeWith(Result.m74087constructorimpl(SnackbarResult.Dismissed));
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C3374a.class != obj.getClass()) {
                return false;
            }
            C3374a c3374a = (C3374a) obj;
            if (Intrinsics.areEqual(getVisuals(), c3374a.getVisuals()) && Intrinsics.areEqual(this.f26105b, c3374a.f26105b)) {
                return true;
            }
            return false;
        }

        @Override // androidx.compose.material3.SnackbarData
        public SnackbarVisuals getVisuals() {
            return this.f26104a;
        }

        public int hashCode() {
            return (getVisuals().hashCode() * 31) + this.f26105b.hashCode();
        }

        @Override // androidx.compose.material3.SnackbarData
        public void performAction() {
            if (this.f26105b.isActive()) {
                CancellableContinuation cancellableContinuation = this.f26105b;
                Result.Companion companion = Result.Companion;
                cancellableContinuation.resumeWith(Result.m74087constructorimpl(SnackbarResult.ActionPerformed));
            }
        }
    }

    /* renamed from: androidx.compose.material3.SnackbarHostState$b */
    /* loaded from: classes2.dex */
    public static final class C3375b implements SnackbarVisuals {

        /* renamed from: a */
        public final String f26106a;

        /* renamed from: b */
        public final String f26107b;

        /* renamed from: c */
        public final boolean f26108c;

        /* renamed from: d */
        public final SnackbarDuration f26109d;

        public C3375b(String message, String str, boolean z, SnackbarDuration duration) {
            Intrinsics.checkNotNullParameter(message, "message");
            Intrinsics.checkNotNullParameter(duration, "duration");
            this.f26106a = message;
            this.f26107b = str;
            this.f26108c = z;
            this.f26109d = duration;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C3375b.class != obj.getClass()) {
                return false;
            }
            C3375b c3375b = (C3375b) obj;
            if (Intrinsics.areEqual(getMessage(), c3375b.getMessage()) && Intrinsics.areEqual(getActionLabel(), c3375b.getActionLabel()) && getWithDismissAction() == c3375b.getWithDismissAction() && getDuration() == c3375b.getDuration()) {
                return true;
            }
            return false;
        }

        @Override // androidx.compose.material3.SnackbarVisuals
        public String getActionLabel() {
            return this.f26107b;
        }

        @Override // androidx.compose.material3.SnackbarVisuals
        public SnackbarDuration getDuration() {
            return this.f26109d;
        }

        @Override // androidx.compose.material3.SnackbarVisuals
        public String getMessage() {
            return this.f26106a;
        }

        @Override // androidx.compose.material3.SnackbarVisuals
        public boolean getWithDismissAction() {
            return this.f26108c;
        }

        public int hashCode() {
            int i;
            int hashCode = getMessage().hashCode() * 31;
            String actionLabel = getActionLabel();
            if (actionLabel != null) {
                i = actionLabel.hashCode();
            } else {
                i = 0;
            }
            return ((((hashCode + i) * 31) + AbstractC1705Xp.m65430a(getWithDismissAction())) * 31) + getDuration().hashCode();
        }
    }

    public SnackbarHostState() {
        MutableState m31891g;
        m31891g = AbstractC19508dK1.m31891g(null, null, 2, null);
        this.f26103b = m31891g;
    }

    public static /* synthetic */ Object showSnackbar$default(SnackbarHostState snackbarHostState, String str, String str2, boolean z, SnackbarDuration snackbarDuration, Continuation continuation, int i, Object obj) {
        boolean z2;
        SnackbarDuration snackbarDuration2;
        if ((i & 2) != 0) {
            str2 = null;
        }
        String str3 = str2;
        if ((i & 4) != 0) {
            z2 = false;
        } else {
            z2 = z;
        }
        if ((i & 8) != 0) {
            if (str3 == null) {
                snackbarDuration2 = SnackbarDuration.Short;
            } else {
                snackbarDuration2 = SnackbarDuration.Indefinite;
            }
            snackbarDuration = snackbarDuration2;
        }
        return snackbarHostState.showSnackbar(str, str3, z2, snackbarDuration, continuation);
    }

    /* renamed from: a */
    public final void m60534a(SnackbarData snackbarData) {
        this.f26103b.setValue(snackbarData);
    }

    @Nullable
    public final SnackbarData getCurrentSnackbarData() {
        return (SnackbarData) this.f26103b.getValue();
    }

    @Nullable
    public final Object showSnackbar(@NotNull String str, @Nullable String str2, boolean z, @NotNull SnackbarDuration snackbarDuration, @NotNull Continuation<? super SnackbarResult> continuation) {
        return showSnackbar(new C3375b(str, str2, z, snackbarDuration), continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0098 A[Catch: all -> 0x009c, TRY_LEAVE, TryCatch #1 {all -> 0x009c, blocks: (B:24:0x0070, B:26:0x0098), top: B:43:0x0070 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a5  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object showSnackbar(@org.jetbrains.annotations.NotNull androidx.compose.material3.SnackbarVisuals r9, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super androidx.compose.material3.SnackbarResult> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof androidx.compose.material3.SnackbarHostState$showSnackbar$2
            if (r0 == 0) goto L13
            r0 = r10
            androidx.compose.material3.SnackbarHostState$showSnackbar$2 r0 = (androidx.compose.material3.SnackbarHostState$showSnackbar$2) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.material3.SnackbarHostState$showSnackbar$2 r0 = new androidx.compose.material3.SnackbarHostState$showSnackbar$2
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = p000.AbstractC18812Yf0.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L5b
            if (r2 == r4) goto L49
            if (r2 != r3) goto L41
            java.lang.Object r9 = r0.L$3
            androidx.compose.material3.SnackbarHostState$showSnackbar$2 r9 = (androidx.compose.material3.SnackbarHostState$showSnackbar$2) r9
            java.lang.Object r9 = r0.L$2
            kotlinx.coroutines.sync.Mutex r9 = (kotlinx.coroutines.sync.Mutex) r9
            java.lang.Object r1 = r0.L$1
            androidx.compose.material3.SnackbarVisuals r1 = (androidx.compose.material3.SnackbarVisuals) r1
            java.lang.Object r0 = r0.L$0
            androidx.compose.material3.SnackbarHostState r0 = (androidx.compose.material3.SnackbarHostState) r0
            kotlin.ResultKt.throwOnFailure(r10)     // Catch: java.lang.Throwable -> L3e
            goto La9
        L3e:
            r10 = move-exception
            goto Lb2
        L41:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L49:
            java.lang.Object r9 = r0.L$2
            kotlinx.coroutines.sync.Mutex r9 = (kotlinx.coroutines.sync.Mutex) r9
            java.lang.Object r2 = r0.L$1
            androidx.compose.material3.SnackbarVisuals r2 = (androidx.compose.material3.SnackbarVisuals) r2
            java.lang.Object r6 = r0.L$0
            androidx.compose.material3.SnackbarHostState r6 = (androidx.compose.material3.SnackbarHostState) r6
            kotlin.ResultKt.throwOnFailure(r10)
            r10 = r9
            r9 = r2
            goto L70
        L5b:
            kotlin.ResultKt.throwOnFailure(r10)
            kotlinx.coroutines.sync.Mutex r10 = r8.f26102a
            r0.L$0 = r8
            r0.L$1 = r9
            r0.L$2 = r10
            r0.label = r4
            java.lang.Object r2 = r10.lock(r5, r0)
            if (r2 != r1) goto L6f
            return r1
        L6f:
            r6 = r8
        L70:
            r0.L$0 = r6     // Catch: java.lang.Throwable -> L9c
            r0.L$1 = r9     // Catch: java.lang.Throwable -> L9c
            r0.L$2 = r10     // Catch: java.lang.Throwable -> L9c
            r0.L$3 = r0     // Catch: java.lang.Throwable -> L9c
            r0.label = r3     // Catch: java.lang.Throwable -> L9c
            kotlinx.coroutines.CancellableContinuationImpl r2 = new kotlinx.coroutines.CancellableContinuationImpl     // Catch: java.lang.Throwable -> L9c
            kotlin.coroutines.Continuation r3 = kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.intercepted(r0)     // Catch: java.lang.Throwable -> L9c
            r2.<init>(r3, r4)     // Catch: java.lang.Throwable -> L9c
            r2.initCancellability()     // Catch: java.lang.Throwable -> L9c
            androidx.compose.material3.SnackbarHostState$a r3 = new androidx.compose.material3.SnackbarHostState$a     // Catch: java.lang.Throwable -> L9c
            r3.<init>(r9, r2)     // Catch: java.lang.Throwable -> L9c
            access$setCurrentSnackbarData(r6, r3)     // Catch: java.lang.Throwable -> L9c
            java.lang.Object r9 = r2.getResult()     // Catch: java.lang.Throwable -> L9c
            java.lang.Object r2 = p000.AbstractC18812Yf0.getCOROUTINE_SUSPENDED()     // Catch: java.lang.Throwable -> L9c
            if (r9 != r2) goto La2
            kotlin.coroutines.jvm.internal.DebugProbes.probeCoroutineSuspended(r0)     // Catch: java.lang.Throwable -> L9c
            goto La2
        L9c:
            r9 = move-exception
            r0 = r6
            r7 = r10
            r10 = r9
            r9 = r7
            goto Lb2
        La2:
            if (r9 != r1) goto La5
            return r1
        La5:
            r0 = r6
            r7 = r10
            r10 = r9
            r9 = r7
        La9:
            r0.m60534a(r5)     // Catch: java.lang.Throwable -> Lb0
            r9.unlock(r5)
            return r10
        Lb0:
            r10 = move-exception
            goto Lb6
        Lb2:
            r0.m60534a(r5)     // Catch: java.lang.Throwable -> Lb0
            throw r10     // Catch: java.lang.Throwable -> Lb0
        Lb6:
            r9.unlock(r5)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SnackbarHostState.showSnackbar(androidx.compose.material3.SnackbarVisuals, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
