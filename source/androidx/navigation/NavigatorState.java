package androidx.navigation;

import android.os.Bundle;
import androidx.annotation.CallSuper;
import androidx.annotation.RestrictTo;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\bJ!\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH&¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0015\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\u0016\u0010\bJ\u0017\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\u0017\u0010\bJ\u0017\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0019\u0010\bJ\u0017\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\u001a\u0010\bR\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR \u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040 0\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R \u0010&\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040$0\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\"R*\u0010*\u001a\u00020\u00112\u0006\u0010'\u001a\u00020\u00118G@GX\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R#\u00103\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040 0.8\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R#\u00106\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040$0.8\u0006¢\u0006\f\n\u0004\b4\u00100\u001a\u0004\b5\u00102¨\u00067"}, m28850d2 = {"Landroidx/navigation/NavigatorState;", "", "<init>", "()V", "Landroidx/navigation/NavBackStackEntry;", "backStackEntry", "", "push", "(Landroidx/navigation/NavBackStackEntry;)V", "pushWithTransition", "Landroidx/navigation/NavDestination;", FirebaseAnalytics.Param.DESTINATION, "Landroid/os/Bundle;", "arguments", "createBackStackEntry", "(Landroidx/navigation/NavDestination;Landroid/os/Bundle;)Landroidx/navigation/NavBackStackEntry;", "popUpTo", "", "saveState", "pop", "(Landroidx/navigation/NavBackStackEntry;Z)V", "popWithTransition", "onLaunchSingleTop", "onLaunchSingleTopWithTransition", "entry", "markTransitionComplete", "prepareForTransition", "Ljava/util/concurrent/locks/ReentrantLock;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/util/concurrent/locks/ReentrantLock;", "backStackLock", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lkotlinx/coroutines/flow/MutableStateFlow;", "_backStack", "", OperatorName.CURVE_TO, "_transitionsInProgress", "<set-?>", "d", "Z", "isNavigating", "()Z", "setNavigating", "(Z)V", "Lkotlinx/coroutines/flow/StateFlow;", "e", "Lkotlinx/coroutines/flow/StateFlow;", "getBackStack", "()Lkotlinx/coroutines/flow/StateFlow;", "backStack", OperatorName.FILL_NON_ZERO, "getTransitionsInProgress", "transitionsInProgress", "navigation-common_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nNavigatorState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavigatorState.kt\nandroidx/navigation/NavigatorState\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,228:1\n1747#2,3:229\n1747#2,3:232\n959#2,7:235\n1747#2,3:242\n2624#2,3:245\n533#2,6:248\n378#2,7:254\n451#2,6:261\n*S KotlinDebug\n*F\n+ 1 NavigatorState.kt\nandroidx/navigation/NavigatorState\n*L\n83#1:229,3\n84#1:232,3\n112#1:235,7\n134#1:242,3\n135#1:245,3\n140#1:248,6\n167#1:254,7\n192#1:261,6\n*E\n"})
/* loaded from: classes2.dex */
public abstract class NavigatorState {

    /* renamed from: a */
    public final ReentrantLock f36390a = new ReentrantLock(true);

    /* renamed from: b */
    public final MutableStateFlow f36391b;

    /* renamed from: c */
    public final MutableStateFlow f36392c;

    /* renamed from: d */
    public boolean f36393d;

    /* renamed from: e */
    public final StateFlow f36394e;

    /* renamed from: f */
    public final StateFlow f36395f;

    public NavigatorState() {
        MutableStateFlow MutableStateFlow = StateFlowKt.MutableStateFlow(CollectionsKt__CollectionsKt.emptyList());
        this.f36391b = MutableStateFlow;
        MutableStateFlow MutableStateFlow2 = StateFlowKt.MutableStateFlow(DG1.emptySet());
        this.f36392c = MutableStateFlow2;
        this.f36394e = FlowKt.asStateFlow(MutableStateFlow);
        this.f36395f = FlowKt.asStateFlow(MutableStateFlow2);
    }

    @NotNull
    public abstract NavBackStackEntry createBackStackEntry(@NotNull NavDestination navDestination, @Nullable Bundle bundle);

    @NotNull
    public final StateFlow<List<NavBackStackEntry>> getBackStack() {
        return this.f36394e;
    }

    @NotNull
    public final StateFlow<Set<NavBackStackEntry>> getTransitionsInProgress() {
        return this.f36395f;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final boolean isNavigating() {
        return this.f36393d;
    }

    public void markTransitionComplete(@NotNull NavBackStackEntry entry) {
        Intrinsics.checkNotNullParameter(entry, "entry");
        MutableStateFlow mutableStateFlow = this.f36392c;
        mutableStateFlow.setValue(EG1.minus((Set) mutableStateFlow.getValue(), entry));
    }

    @CallSuper
    public void onLaunchSingleTop(@NotNull NavBackStackEntry backStackEntry) {
        int i;
        Intrinsics.checkNotNullParameter(backStackEntry, "backStackEntry");
        ReentrantLock reentrantLock = this.f36390a;
        reentrantLock.lock();
        try {
            List mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) this.f36394e.getValue());
            ListIterator listIterator = mutableList.listIterator(mutableList.size());
            while (true) {
                if (listIterator.hasPrevious()) {
                    if (Intrinsics.areEqual(((NavBackStackEntry) listIterator.previous()).getId(), backStackEntry.getId())) {
                        i = listIterator.nextIndex();
                        break;
                    }
                } else {
                    i = -1;
                    break;
                }
            }
            mutableList.set(i, backStackEntry);
            this.f36391b.setValue(mutableList);
            Unit unit = Unit.INSTANCE;
            reentrantLock.unlock();
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    @CallSuper
    public void onLaunchSingleTopWithTransition(@NotNull NavBackStackEntry backStackEntry) {
        Intrinsics.checkNotNullParameter(backStackEntry, "backStackEntry");
        List list = (List) this.f36394e.getValue();
        ListIterator listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            NavBackStackEntry navBackStackEntry = (NavBackStackEntry) listIterator.previous();
            if (Intrinsics.areEqual(navBackStackEntry.getId(), backStackEntry.getId())) {
                MutableStateFlow mutableStateFlow = this.f36392c;
                mutableStateFlow.setValue(EG1.plus(EG1.plus((Set) mutableStateFlow.getValue(), navBackStackEntry), backStackEntry));
                onLaunchSingleTop(backStackEntry);
                return;
            }
        }
        throw new NoSuchElementException("List contains no element matching the predicate.");
    }

    public void pop(@NotNull NavBackStackEntry popUpTo, boolean z) {
        Intrinsics.checkNotNullParameter(popUpTo, "popUpTo");
        ReentrantLock reentrantLock = this.f36390a;
        reentrantLock.lock();
        try {
            MutableStateFlow mutableStateFlow = this.f36391b;
            ArrayList arrayList = new ArrayList();
            for (Object obj : (Iterable) mutableStateFlow.getValue()) {
                if (!(!Intrinsics.areEqual((NavBackStackEntry) obj, popUpTo))) {
                    break;
                }
                arrayList.add(obj);
            }
            mutableStateFlow.setValue(arrayList);
            Unit unit = Unit.INSTANCE;
            reentrantLock.unlock();
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public void popWithTransition(@NotNull NavBackStackEntry popUpTo, boolean z) {
        Object obj;
        Intrinsics.checkNotNullParameter(popUpTo, "popUpTo");
        Iterable iterable = (Iterable) this.f36392c.getValue();
        if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
            Iterator it = iterable.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((NavBackStackEntry) it.next()) == popUpTo) {
                    Iterable<NavBackStackEntry> iterable2 = (Iterable) this.f36394e.getValue();
                    if (!(iterable2 instanceof Collection) || !((Collection) iterable2).isEmpty()) {
                        for (NavBackStackEntry navBackStackEntry : iterable2) {
                            if (navBackStackEntry == popUpTo) {
                            }
                        }
                        return;
                    }
                    return;
                }
            }
        }
        MutableStateFlow mutableStateFlow = this.f36392c;
        mutableStateFlow.setValue(EG1.plus((Set) mutableStateFlow.getValue(), popUpTo));
        List list = (List) this.f36394e.getValue();
        ListIterator listIterator = list.listIterator(list.size());
        while (true) {
            if (listIterator.hasPrevious()) {
                obj = listIterator.previous();
                NavBackStackEntry navBackStackEntry2 = (NavBackStackEntry) obj;
                if (!Intrinsics.areEqual(navBackStackEntry2, popUpTo) && ((List) this.f36394e.getValue()).lastIndexOf(navBackStackEntry2) < ((List) this.f36394e.getValue()).lastIndexOf(popUpTo)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        NavBackStackEntry navBackStackEntry3 = (NavBackStackEntry) obj;
        if (navBackStackEntry3 != null) {
            MutableStateFlow mutableStateFlow2 = this.f36392c;
            mutableStateFlow2.setValue(EG1.plus((Set) mutableStateFlow2.getValue(), navBackStackEntry3));
        }
        pop(popUpTo, z);
    }

    @CallSuper
    public void prepareForTransition(@NotNull NavBackStackEntry entry) {
        Intrinsics.checkNotNullParameter(entry, "entry");
        MutableStateFlow mutableStateFlow = this.f36392c;
        mutableStateFlow.setValue(EG1.plus((Set) mutableStateFlow.getValue(), entry));
    }

    public void push(@NotNull NavBackStackEntry backStackEntry) {
        Intrinsics.checkNotNullParameter(backStackEntry, "backStackEntry");
        ReentrantLock reentrantLock = this.f36390a;
        reentrantLock.lock();
        try {
            MutableStateFlow mutableStateFlow = this.f36391b;
            mutableStateFlow.setValue(CollectionsKt___CollectionsKt.plus((Collection<? extends NavBackStackEntry>) mutableStateFlow.getValue(), backStackEntry));
            Unit unit = Unit.INSTANCE;
        } finally {
            reentrantLock.unlock();
        }
    }

    public void pushWithTransition(@NotNull NavBackStackEntry backStackEntry) {
        Intrinsics.checkNotNullParameter(backStackEntry, "backStackEntry");
        Iterable iterable = (Iterable) this.f36392c.getValue();
        if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
            Iterator it = iterable.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((NavBackStackEntry) it.next()) == backStackEntry) {
                    Iterable<NavBackStackEntry> iterable2 = (Iterable) this.f36394e.getValue();
                    if (!(iterable2 instanceof Collection) || !((Collection) iterable2).isEmpty()) {
                        for (NavBackStackEntry navBackStackEntry : iterable2) {
                            if (navBackStackEntry == backStackEntry) {
                                return;
                            }
                        }
                    }
                }
            }
        }
        NavBackStackEntry navBackStackEntry2 = (NavBackStackEntry) CollectionsKt___CollectionsKt.lastOrNull((List<? extends Object>) this.f36394e.getValue());
        if (navBackStackEntry2 != null) {
            MutableStateFlow mutableStateFlow = this.f36392c;
            mutableStateFlow.setValue(EG1.plus((Set) mutableStateFlow.getValue(), navBackStackEntry2));
        }
        MutableStateFlow mutableStateFlow2 = this.f36392c;
        mutableStateFlow2.setValue(EG1.plus((Set) mutableStateFlow2.getValue(), backStackEntry));
        push(backStackEntry);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void setNavigating(boolean z) {
        this.f36393d = z;
    }
}
