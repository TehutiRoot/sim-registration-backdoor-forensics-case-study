package io.fotoapparat.concurrent;

import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import io.fotoapparat.concurrent.CameraExecutor;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u0019B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t\"\u0004\b\u0000\u0010\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0014\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t0\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0013R\u001c\u0010\u0018\u001a\u00020\u0015*\u0006\u0012\u0002\b\u00030\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, m28850d2 = {"Lio/fotoapparat/concurrent/CameraExecutor;", "", "Ljava/util/concurrent/ExecutorService;", "executor", "<init>", "(Ljava/util/concurrent/ExecutorService;)V", "T", "Lio/fotoapparat/concurrent/CameraExecutor$Operation;", "operation", "Ljava/util/concurrent/Future;", "execute", "(Lio/fotoapparat/concurrent/CameraExecutor$Operation;)Ljava/util/concurrent/Future;", "", "cancelTasks", "()V", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/util/concurrent/ExecutorService;", "Ljava/util/LinkedList;", "Ljava/util/LinkedList;", "cancellableTasksQueue", "", "d", "(Ljava/util/concurrent/Future;)Z", "isPending", "Operation", "fotoapparat_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nCameraExecutor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CameraExecutor.kt\nio/fotoapparat/concurrent/CameraExecutor\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,78:1\n766#2:79\n857#2,2:80\n1855#2,2:82\n*S KotlinDebug\n*F\n+ 1 CameraExecutor.kt\nio/fotoapparat/concurrent/CameraExecutor\n*L\n52#1:79\n52#1:80,2\n53#1:82,2\n*E\n"})
/* loaded from: classes5.dex */
public final class CameraExecutor {

    /* renamed from: a */
    public final ExecutorService f62929a;

    /* renamed from: b */
    public final LinkedList f62930b;

    public CameraExecutor() {
        this(null, 1, null);
    }

    /* renamed from: a */
    public static /* synthetic */ Object m30561a(Operation operation) {
        return m30559c(operation);
    }

    /* renamed from: c */
    public static final Object m30559c(Operation operation) {
        Intrinsics.checkNotNullParameter(operation, "$operation");
        return operation.getFunction().invoke();
    }

    /* renamed from: b */
    public final void m30560b() {
        AbstractC10410hs.removeAll((List) this.f62930b, (Function1) new CameraExecutor$cleanUpCancelledTasks$1(this));
    }

    public final void cancelTasks() {
        LinkedList linkedList = this.f62930b;
        ArrayList<Future> arrayList = new ArrayList();
        for (Object obj : linkedList) {
            if (m30558d((Future) obj)) {
                arrayList.add(obj);
            }
        }
        for (Future future : arrayList) {
            future.cancel(true);
        }
        this.f62930b.clear();
    }

    /* renamed from: d */
    public final boolean m30558d(Future future) {
        if (!future.isCancelled() && !future.isDone()) {
            return true;
        }
        return false;
    }

    @NotNull
    public final <T> Future<T> execute(@NotNull final Operation<? extends T> operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        Future<T> future = this.f62929a.submit(new Callable() { // from class: Ej
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return CameraExecutor.m30561a(operation);
            }
        });
        if (operation.getCancellable()) {
            this.f62930b.add(future);
        }
        m30560b();
        Intrinsics.checkNotNullExpressionValue(future, "future");
        return future;
    }

    public CameraExecutor(@NotNull ExecutorService executor) {
        Intrinsics.checkNotNullParameter(executor, "executor");
        this.f62929a = executor;
        this.f62930b = new LinkedList();
    }

    @Metadata(m28851d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0086\b\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002B\u001f\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ0\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0016\u001a\u00020\u00032\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\nR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\f¨\u0006\u001e"}, m28850d2 = {"Lio/fotoapparat/concurrent/CameraExecutor$Operation;", "T", "", "", "cancellable", "Lkotlin/Function0;", "function", "<init>", "(ZLkotlin/jvm/functions/Function0;)V", "component1", "()Z", "component2", "()Lkotlin/jvm/functions/Function0;", "copy", "(ZLkotlin/jvm/functions/Function0;)Lio/fotoapparat/concurrent/CameraExecutor$Operation;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "Z", "getCancellable", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lkotlin/jvm/functions/Function0;", "getFunction", "fotoapparat_release"}, m28849k = 1, m28848mv = {1, 8, 0})
    /* loaded from: classes5.dex */
    public static final class Operation<T> {

        /* renamed from: a */
        public final boolean f62931a;

        /* renamed from: b */
        public final Function0 f62932b;

        public Operation(boolean z, @NotNull Function0<? extends T> function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f62931a = z;
            this.f62932b = function;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Operation copy$default(Operation operation, boolean z, Function0 function0, int i, Object obj) {
            if ((i & 1) != 0) {
                z = operation.f62931a;
            }
            if ((i & 2) != 0) {
                function0 = operation.f62932b;
            }
            return operation.copy(z, function0);
        }

        public final boolean component1() {
            return this.f62931a;
        }

        @NotNull
        public final Function0<T> component2() {
            return this.f62932b;
        }

        @NotNull
        public final Operation<T> copy(boolean z, @NotNull Function0<? extends T> function) {
            Intrinsics.checkNotNullParameter(function, "function");
            return new Operation<>(z, function);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Operation) {
                Operation operation = (Operation) obj;
                return this.f62931a == operation.f62931a && Intrinsics.areEqual(this.f62932b, operation.f62932b);
            }
            return false;
        }

        public final boolean getCancellable() {
            return this.f62931a;
        }

        @NotNull
        public final Function0<T> getFunction() {
            return this.f62932b;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [int] */
        /* JADX WARN: Type inference failed for: r0v4 */
        /* JADX WARN: Type inference failed for: r0v5 */
        public int hashCode() {
            boolean z = this.f62931a;
            ?? r0 = z;
            if (z) {
                r0 = 1;
            }
            return (r0 * 31) + this.f62932b.hashCode();
        }

        @NotNull
        public String toString() {
            boolean z = this.f62931a;
            Function0 function0 = this.f62932b;
            return "Operation(cancellable=" + z + ", function=" + function0 + ")";
        }

        public /* synthetic */ Operation(boolean z, Function0 function0, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z, function0);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ CameraExecutor(java.util.concurrent.ExecutorService r1, int r2, kotlin.jvm.internal.DefaultConstructorMarker r3) {
        /*
            r0 = this;
            r2 = r2 & 1
            if (r2 == 0) goto Ld
            java.util.concurrent.ExecutorService r1 = java.util.concurrent.Executors.newSingleThreadExecutor()
            java.lang.String r2 = "newSingleThreadExecutor()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
        Ld:
            r0.<init>(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.fotoapparat.concurrent.CameraExecutor.<init>(java.util.concurrent.ExecutorService, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
