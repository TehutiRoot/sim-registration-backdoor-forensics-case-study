package androidx.compose.runtime;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.runtime.snapshots.SnapshotStateMap;
import androidx.compose.runtime.snapshots.StateFactoryMarker;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"bK1", "androidx/compose/runtime/SnapshotStateKt__ProduceStateKt", "androidx/compose/runtime/SnapshotStateKt__SnapshotFlowKt", "cK1", "dK1"}, m28850d2 = {}, m28849k = 4, m28848mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class SnapshotStateKt {
    @Composable
    @NotNull
    public static final <T extends R, R> State<R> collectAsState(@NotNull Flow<? extends T> flow, R r, @Nullable CoroutineContext coroutineContext, @Nullable Composer composer, int i, int i2) {
        return SnapshotStateKt__SnapshotFlowKt.m60115b(flow, r, coroutineContext, composer, i, i2);
    }

    @NotNull
    public static final MutableVector<DerivedStateObserver> derivedStateObservers() {
        return AbstractC19164bK1.m52028b();
    }

    @StateFactoryMarker
    @NotNull
    public static final <T> State<T> derivedStateOf(@NotNull SnapshotMutationPolicy<T> snapshotMutationPolicy, @NotNull Function0<? extends T> function0) {
        return AbstractC19164bK1.m52027c(snapshotMutationPolicy, function0);
    }

    public static final <T> T getValue(@NotNull State<? extends T> state, @Nullable Object obj, @NotNull KProperty<?> kProperty) {
        return (T) AbstractC19508dK1.m31897a(state, obj, kProperty);
    }

    @StateFactoryMarker
    @NotNull
    public static final <T> SnapshotStateList<T> mutableStateListOf() {
        return AbstractC19508dK1.m31896b();
    }

    @StateFactoryMarker
    @NotNull
    public static final <K, V> SnapshotStateMap<K, V> mutableStateMapOf() {
        return AbstractC19508dK1.m31894d();
    }

    @StateFactoryMarker
    @NotNull
    public static final <T> MutableState<T> mutableStateOf(T t, @NotNull SnapshotMutationPolicy<T> snapshotMutationPolicy) {
        return AbstractC19508dK1.m31892f(t, snapshotMutationPolicy);
    }

    public static /* synthetic */ MutableState mutableStateOf$default(Object obj, SnapshotMutationPolicy snapshotMutationPolicy, int i, Object obj2) {
        return AbstractC19508dK1.m31891g(obj, snapshotMutationPolicy, i, obj2);
    }

    @NotNull
    public static final <T> SnapshotMutationPolicy<T> neverEqualPolicy() {
        return AbstractC19336cK1.m51693a();
    }

    public static final <R> void observeDerivedStateRecalculations(@NotNull DerivedStateObserver derivedStateObserver, @NotNull Function0<? extends R> function0) {
        AbstractC19164bK1.m52025e(derivedStateObserver, function0);
    }

    @Composable
    @NotNull
    public static final <T> State<T> produceState(T t, @Nullable Object obj, @Nullable Object obj2, @Nullable Object obj3, @NotNull Function2<? super ProduceStateScope<T>, ? super Continuation<? super Unit>, ? extends Object> function2, @Nullable Composer composer, int i) {
        return SnapshotStateKt__ProduceStateKt.m60121a(t, obj, obj2, obj3, function2, composer, i);
    }

    @NotNull
    public static final <T> SnapshotMutationPolicy<T> referentialEqualityPolicy() {
        return AbstractC19336cK1.m51692b();
    }

    @Composable
    @NotNull
    public static final <T> State<T> rememberUpdatedState(T t, @Nullable Composer composer, int i) {
        return AbstractC19508dK1.m31890h(t, composer, i);
    }

    public static final <T> void setValue(@NotNull MutableState<T> mutableState, @Nullable Object obj, @NotNull KProperty<?> kProperty, T t) {
        AbstractC19508dK1.m31889i(mutableState, obj, kProperty, t);
    }

    @NotNull
    public static final <T> Flow<T> snapshotFlow(@NotNull Function0<? extends T> function0) {
        return SnapshotStateKt__SnapshotFlowKt.m60112e(function0);
    }

    @NotNull
    public static final <T> SnapshotMutationPolicy<T> structuralEqualityPolicy() {
        return AbstractC19336cK1.m51691c();
    }

    @NotNull
    public static final <T> SnapshotStateList<T> toMutableStateList(@NotNull Collection<? extends T> collection) {
        return AbstractC19508dK1.m31888j(collection);
    }

    @NotNull
    public static final <K, V> SnapshotStateMap<K, V> toMutableStateMap(@NotNull Iterable<? extends Pair<? extends K, ? extends V>> iterable) {
        return AbstractC19508dK1.m31887k(iterable);
    }

    @Composable
    @NotNull
    public static final <T> State<T> collectAsState(@NotNull StateFlow<? extends T> stateFlow, @Nullable CoroutineContext coroutineContext, @Nullable Composer composer, int i, int i2) {
        return SnapshotStateKt__SnapshotFlowKt.m60114c(stateFlow, coroutineContext, composer, i, i2);
    }

    @StateFactoryMarker
    @NotNull
    public static final <T> State<T> derivedStateOf(@NotNull Function0<? extends T> function0) {
        return AbstractC19164bK1.m52026d(function0);
    }

    @StateFactoryMarker
    @NotNull
    public static final <T> SnapshotStateList<T> mutableStateListOf(@NotNull T... tArr) {
        return AbstractC19508dK1.m31895c(tArr);
    }

    @StateFactoryMarker
    @NotNull
    public static final <K, V> SnapshotStateMap<K, V> mutableStateMapOf(@NotNull Pair<? extends K, ? extends V>... pairArr) {
        return AbstractC19508dK1.m31893e(pairArr);
    }

    @Composable
    @NotNull
    public static final <T> State<T> produceState(T t, @Nullable Object obj, @Nullable Object obj2, @NotNull Function2<? super ProduceStateScope<T>, ? super Continuation<? super Unit>, ? extends Object> function2, @Nullable Composer composer, int i) {
        return SnapshotStateKt__ProduceStateKt.m60120b(t, obj, obj2, function2, composer, i);
    }

    @Composable
    @NotNull
    public static final <T> State<T> produceState(T t, @Nullable Object obj, @NotNull Function2<? super ProduceStateScope<T>, ? super Continuation<? super Unit>, ? extends Object> function2, @Nullable Composer composer, int i) {
        return SnapshotStateKt__ProduceStateKt.m60119c(t, obj, function2, composer, i);
    }

    @Composable
    @NotNull
    public static final <T> State<T> produceState(T t, @NotNull Function2<? super ProduceStateScope<T>, ? super Continuation<? super Unit>, ? extends Object> function2, @Nullable Composer composer, int i) {
        return SnapshotStateKt__ProduceStateKt.m60118d(t, function2, composer, i);
    }

    @Composable
    @NotNull
    public static final <T> State<T> produceState(T t, @NotNull Object[] objArr, @NotNull Function2<? super ProduceStateScope<T>, ? super Continuation<? super Unit>, ? extends Object> function2, @Nullable Composer composer, int i) {
        return SnapshotStateKt__ProduceStateKt.m60117e(t, objArr, function2, composer, i);
    }
}
