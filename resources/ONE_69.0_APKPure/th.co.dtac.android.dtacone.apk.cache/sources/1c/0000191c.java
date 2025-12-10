package p000;

import androidx.compose.runtime.ActualAndroid_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.runtime.snapshots.SnapshotStateMap;
import java.util.Collection;
import kotlin.Pair;
import kotlin.collections.AbstractC11663a;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* renamed from: aL1 */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC19036aL1 {
    /* renamed from: a */
    public static final Object m65154a(State state, Object obj, KProperty property) {
        Intrinsics.checkNotNullParameter(state, "<this>");
        Intrinsics.checkNotNullParameter(property, "property");
        return state.getValue();
    }

    /* renamed from: b */
    public static final SnapshotStateList m65153b() {
        return new SnapshotStateList();
    }

    /* renamed from: c */
    public static final SnapshotStateList m65152c(Object... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        SnapshotStateList snapshotStateList = new SnapshotStateList();
        snapshotStateList.addAll(ArraysKt___ArraysKt.toList(elements));
        return snapshotStateList;
    }

    /* renamed from: d */
    public static final SnapshotStateMap m65151d() {
        return new SnapshotStateMap();
    }

    /* renamed from: e */
    public static final SnapshotStateMap m65150e(Pair... pairs) {
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        SnapshotStateMap snapshotStateMap = new SnapshotStateMap();
        snapshotStateMap.putAll(AbstractC11663a.toMap(pairs));
        return snapshotStateMap;
    }

    /* renamed from: f */
    public static final MutableState m65149f(Object obj, SnapshotMutationPolicy policy) {
        Intrinsics.checkNotNullParameter(policy, "policy");
        return ActualAndroid_androidKt.createSnapshotMutableState(obj, policy);
    }

    /* renamed from: g */
    public static /* synthetic */ MutableState m65148g(Object obj, SnapshotMutationPolicy snapshotMutationPolicy, int i, Object obj2) {
        if ((i & 2) != 0) {
            snapshotMutationPolicy = SnapshotStateKt.structuralEqualityPolicy();
        }
        return SnapshotStateKt.mutableStateOf(obj, snapshotMutationPolicy);
    }

    /* renamed from: h */
    public static final State m65147h(Object obj, Composer composer, int i) {
        composer.startReplaceableGroup(-1058319986);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1058319986, i, -1, "androidx.compose.runtime.rememberUpdatedState (SnapshotState.kt:303)");
        }
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = m65148g(obj, null, 2, null);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        MutableState mutableState = (MutableState) rememberedValue;
        mutableState.setValue(obj);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return mutableState;
    }

    /* renamed from: i */
    public static final void m65146i(MutableState mutableState, Object obj, KProperty property, Object obj2) {
        Intrinsics.checkNotNullParameter(mutableState, "<this>");
        Intrinsics.checkNotNullParameter(property, "property");
        mutableState.setValue(obj2);
    }

    /* renamed from: j */
    public static final SnapshotStateList m65145j(Collection collection) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        SnapshotStateList snapshotStateList = new SnapshotStateList();
        snapshotStateList.addAll(collection);
        return snapshotStateList;
    }

    /* renamed from: k */
    public static final SnapshotStateMap m65144k(Iterable iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        SnapshotStateMap snapshotStateMap = new SnapshotStateMap();
        snapshotStateMap.putAll(AbstractC11663a.toMap(iterable));
        return snapshotStateMap;
    }
}