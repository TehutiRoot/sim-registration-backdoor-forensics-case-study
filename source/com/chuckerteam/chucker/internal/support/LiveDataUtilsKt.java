package com.chuckerteam.chucker.internal.support;

import androidx.arch.core.executor.ArchTaskExecutor;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.Observer;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.concurrent.Executor;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u00008\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0003\u001aY\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u00032\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0005H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001aE\u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\t0\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003H\u0000¢\u0006\u0004\b\u0007\u0010\n\u001ai\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u000b*\b\u0012\u0004\u0012\u00028\u00000\u00032\b\b\u0002\u0010\r\u001a\u00020\f28\b\u0002\u0010\u0013\u001a2\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u00120\u0005H\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u000f\u0010\u0016\u001a\u00020\fH\u0003¢\u0006\u0004\b\u0016\u0010\u0017\"\u0016\u0010\u001a\u001a\u0004\u0018\u00010\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0019¨\u0006\u001b"}, m28850d2 = {"T1", "T2", "R", "Landroidx/lifecycle/LiveData;", "other", "Lkotlin/Function2;", "func", "combineLatest", "(Landroidx/lifecycle/LiveData;Landroidx/lifecycle/LiveData;Lkotlin/jvm/functions/Function2;)Landroidx/lifecycle/LiveData;", "Lkotlin/Pair;", "(Landroidx/lifecycle/LiveData;Landroidx/lifecycle/LiveData;)Landroidx/lifecycle/LiveData;", "T", "Ljava/util/concurrent/Executor;", "executor", "Lkotlin/ParameterName;", "name", "old", "new", "", "areEqual", "distinctUntilChanged", "(Landroidx/lifecycle/LiveData;Ljava/util/concurrent/Executor;Lkotlin/jvm/functions/Function2;)Landroidx/lifecycle/LiveData;", PDPageLabelRange.STYLE_LETTERS_LOWER, "()Ljava/util/concurrent/Executor;", "", "Ljava/lang/Object;", "uninitializedToken", "com.github.ChuckerTeam.Chucker.library"}, m28849k = 2, m28848mv = {1, 8, 0})
/* loaded from: classes3.dex */
public final class LiveDataUtilsKt {

    /* renamed from: a */
    public static final Object f42942a = new Object();

    /* renamed from: com.chuckerteam.chucker.internal.support.LiveDataUtilsKt$a */
    /* loaded from: classes3.dex */
    public static final class C5972a implements Observer, FunctionAdapter {

        /* renamed from: a */
        public final /* synthetic */ Function1 f42943a;

        public C5972a(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f42943a = function;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof Observer) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        public final Function getFunctionDelegate() {
            return this.f42943a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f42943a.invoke(obj);
        }
    }

    /* renamed from: a */
    public static final Executor m49925a() {
        Executor iOThreadExecutor = ArchTaskExecutor.getIOThreadExecutor();
        Intrinsics.checkNotNullExpressionValue(iOThreadExecutor, "getIOThreadExecutor()");
        return iOThreadExecutor;
    }

    @NotNull
    public static final <T1, T2, R> LiveData<R> combineLatest(@NotNull LiveData<T1> liveData, @NotNull LiveData<T2> other, @NotNull Function2<? super T1, ? super T2, ? extends R> func) {
        Intrinsics.checkNotNullParameter(liveData, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(func, "func");
        MediatorLiveData mediatorLiveData = new MediatorLiveData();
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        mediatorLiveData.addSource(liveData, new C5972a(new LiveDataUtilsKt$combineLatest$1$1(objectRef, objectRef2, mediatorLiveData, func)));
        mediatorLiveData.addSource(other, new C5972a(new LiveDataUtilsKt$combineLatest$1$2(objectRef2, objectRef, mediatorLiveData, func)));
        return mediatorLiveData;
    }

    @NotNull
    public static final <T> LiveData<T> distinctUntilChanged(@NotNull LiveData<T> liveData, @NotNull Executor executor, @NotNull Function2<? super T, ? super T, Boolean> areEqual) {
        Intrinsics.checkNotNullParameter(liveData, "<this>");
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(areEqual, "areEqual");
        MediatorLiveData mediatorLiveData = new MediatorLiveData();
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = (T) f42942a;
        mediatorLiveData.addSource(liveData, new C5972a(new LiveDataUtilsKt$distinctUntilChanged$2(executor, objectRef, areEqual, mediatorLiveData)));
        return mediatorLiveData;
    }

    public static /* synthetic */ LiveData distinctUntilChanged$default(LiveData liveData, Executor executor, Function2 function2, int i, Object obj) {
        if ((i & 1) != 0) {
            executor = m49925a();
        }
        if ((i & 2) != 0) {
            function2 = LiveDataUtilsKt$distinctUntilChanged$1.INSTANCE;
        }
        return distinctUntilChanged(liveData, executor, function2);
    }

    @NotNull
    public static final <T1, T2> LiveData<Pair<T1, T2>> combineLatest(@NotNull LiveData<T1> liveData, @NotNull LiveData<T2> other) {
        Intrinsics.checkNotNullParameter(liveData, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        return combineLatest(liveData, other, LiveDataUtilsKt$combineLatest$2.INSTANCE);
    }
}
