package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.collection.ArrayMap;
import androidx.core.app.SharedElementCallback;
import androidx.core.p005os.CancellationSignal;
import androidx.core.view.OneShotPreDrawListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewGroupCompat;
import androidx.fragment.app.AbstractC4602d;
import androidx.fragment.app.DefaultSpecialEffectsController;
import androidx.fragment.app.FragmentTransitionImpl;
import androidx.fragment.app.SpecialEffectsController;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(m29143d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001:\u0003345B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J%\u0010\f\u001a\u00020\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u000e\u001a\u00020\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJG\u0010\u0017\u001a\u00020\u000b2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00062\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\u00122\u0006\u0010\u0014\u001a\u00020\t2\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\t0\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018JS\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\t0\u00152\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00062\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\u00122\u0006\u0010\n\u001a\u00020\t2\b\u0010\u001b\u001a\u0004\u0018\u00010\u00072\b\u0010\u001c\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ-\u0010$\u001a\u00020\u000b*\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020!0\u001f2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020 0\"H\u0002¢\u0006\u0004\b$\u0010%J/\u0010*\u001a\u00020\u000b2\u0016\u0010(\u001a\u0012\u0012\u0004\u0012\u00020!0&j\b\u0012\u0004\u0012\u00020!`'2\u0006\u0010)\u001a\u00020!H\u0002¢\u0006\u0004\b*\u0010+J+\u0010.\u001a\u00020\u000b2\u0012\u0010-\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020!0,2\u0006\u0010)\u001a\u00020!H\u0002¢\u0006\u0004\b.\u0010/J\u0017\u00101\u001a\u00020\u000b2\u0006\u00100\u001a\u00020\u0007H\u0002¢\u0006\u0004\b1\u00102¨\u00066"}, m29142d2 = {"Landroidx/fragment/app/DefaultSpecialEffectsController;", "Landroidx/fragment/app/SpecialEffectsController;", "Landroid/view/ViewGroup;", "container", "<init>", "(Landroid/view/ViewGroup;)V", "", "Landroidx/fragment/app/SpecialEffectsController$Operation;", "operations", "", "isPop", "", "executeOperations", "(Ljava/util/List;Z)V", "C", "(Ljava/util/List;)V", "Landroidx/fragment/app/DefaultSpecialEffectsController$a;", "animationInfos", "", "awaitingContainerChanges", "startedAnyTransition", "", "startedTransitions", "u", "(Ljava/util/List;Ljava/util/List;ZLjava/util/Map;)V", "Landroidx/fragment/app/DefaultSpecialEffectsController$c;", "transitionInfos", "firstOut", "lastIn", "x", "(Ljava/util/List;Ljava/util/List;ZLandroidx/fragment/app/SpecialEffectsController$Operation;Landroidx/fragment/app/SpecialEffectsController$Operation;)Ljava/util/Map;", "Landroidx/collection/ArrayMap;", "", "Landroid/view/View;", "", "names", "t", "(Landroidx/collection/ArrayMap;Ljava/util/Collection;)V", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "transitioningViews", Promotion.ACTION_VIEW, OperatorName.SAVE, "(Ljava/util/ArrayList;Landroid/view/View;)V", "", "namedViews", OperatorName.CLOSE_AND_STROKE, "(Ljava/util/Map;Landroid/view/View;)V", "operation", "p", "(Landroidx/fragment/app/SpecialEffectsController$Operation;)V", PDPageLabelRange.STYLE_LETTERS_LOWER, OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, OperatorName.CURVE_TO, "fragment_release"}, m29141k = 1, m29140mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nDefaultSpecialEffectsController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DefaultSpecialEffectsController.kt\nandroidx/fragment/app/DefaultSpecialEffectsController\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,877:1\n288#2,2:878\n533#2,6:880\n819#2:886\n847#2,2:887\n766#2:889\n857#2,2:890\n1789#2,3:892\n819#2:895\n847#2,2:896\n1855#2,2:898\n*S KotlinDebug\n*F\n+ 1 DefaultSpecialEffectsController.kt\nandroidx/fragment/app/DefaultSpecialEffectsController\n*L\n47#1:878,2\n53#1:880,6\n312#1:886\n312#1:887,2\n315#1:889\n315#1:890,2\n317#1:892,3\n629#1:895\n629#1:896,2\n632#1:898,2\n*E\n"})
/* loaded from: classes2.dex */
public final class DefaultSpecialEffectsController extends SpecialEffectsController {

    /* renamed from: androidx.fragment.app.DefaultSpecialEffectsController$a */
    /* loaded from: classes2.dex */
    public static final class C4546a extends C4547b {

        /* renamed from: c */
        public final boolean f35470c;

        /* renamed from: d */
        public boolean f35471d;

        /* renamed from: e */
        public AbstractC4602d.C4603a f35472e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4546a(SpecialEffectsController.Operation operation, CancellationSignal signal, boolean z) {
            super(operation, signal);
            Intrinsics.checkNotNullParameter(operation, "operation");
            Intrinsics.checkNotNullParameter(signal, "signal");
            this.f35470c = z;
        }

        /* renamed from: e */
        public final AbstractC4602d.C4603a m54443e(Context context) {
            boolean z;
            Intrinsics.checkNotNullParameter(context, "context");
            if (this.f35471d) {
                return this.f35472e;
            }
            Fragment fragment = m54441b().getFragment();
            if (m54441b().getFinalState() == SpecialEffectsController.Operation.State.VISIBLE) {
                z = true;
            } else {
                z = false;
            }
            AbstractC4602d.C4603a m54214b = AbstractC4602d.m54214b(context, fragment, z, this.f35470c);
            this.f35472e = m54214b;
            this.f35471d = true;
            return m54214b;
        }
    }

    /* renamed from: androidx.fragment.app.DefaultSpecialEffectsController$b */
    /* loaded from: classes2.dex */
    public static class C4547b {

        /* renamed from: a */
        public final SpecialEffectsController.Operation f35473a;

        /* renamed from: b */
        public final CancellationSignal f35474b;

        public C4547b(SpecialEffectsController.Operation operation, CancellationSignal signal) {
            Intrinsics.checkNotNullParameter(operation, "operation");
            Intrinsics.checkNotNullParameter(signal, "signal");
            this.f35473a = operation;
            this.f35474b = signal;
        }

        /* renamed from: a */
        public final void m54442a() {
            this.f35473a.completeSpecialEffect(this.f35474b);
        }

        /* renamed from: b */
        public final SpecialEffectsController.Operation m54441b() {
            return this.f35473a;
        }

        /* renamed from: c */
        public final CancellationSignal m54440c() {
            return this.f35474b;
        }

        /* renamed from: d */
        public final boolean m54439d() {
            SpecialEffectsController.Operation.State state;
            SpecialEffectsController.Operation.State.Companion companion = SpecialEffectsController.Operation.State.Companion;
            View view = this.f35473a.getFragment().mView;
            Intrinsics.checkNotNullExpressionValue(view, "operation.fragment.mView");
            SpecialEffectsController.Operation.State asOperationState = companion.asOperationState(view);
            SpecialEffectsController.Operation.State finalState = this.f35473a.getFinalState();
            if (asOperationState != finalState && (asOperationState == (state = SpecialEffectsController.Operation.State.VISIBLE) || finalState == state)) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: androidx.fragment.app.DefaultSpecialEffectsController$c */
    /* loaded from: classes2.dex */
    public static final class C4548c extends C4547b {

        /* renamed from: c */
        public final Object f35475c;

        /* renamed from: d */
        public final boolean f35476d;

        /* renamed from: e */
        public final Object f35477e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4548c(SpecialEffectsController.Operation operation, CancellationSignal signal, boolean z, boolean z2) {
            super(operation, signal);
            Object exitTransition;
            boolean z3;
            Object obj;
            Intrinsics.checkNotNullParameter(operation, "operation");
            Intrinsics.checkNotNullParameter(signal, "signal");
            SpecialEffectsController.Operation.State finalState = operation.getFinalState();
            SpecialEffectsController.Operation.State state = SpecialEffectsController.Operation.State.VISIBLE;
            if (finalState == state) {
                Fragment fragment = operation.getFragment();
                if (z) {
                    exitTransition = fragment.getReenterTransition();
                } else {
                    exitTransition = fragment.getEnterTransition();
                }
            } else {
                Fragment fragment2 = operation.getFragment();
                if (z) {
                    exitTransition = fragment2.getReturnTransition();
                } else {
                    exitTransition = fragment2.getExitTransition();
                }
            }
            this.f35475c = exitTransition;
            if (operation.getFinalState() == state) {
                if (z) {
                    z3 = operation.getFragment().getAllowReturnTransitionOverlap();
                } else {
                    z3 = operation.getFragment().getAllowEnterTransitionOverlap();
                }
            } else {
                z3 = true;
            }
            this.f35476d = z3;
            if (z2) {
                if (z) {
                    obj = operation.getFragment().getSharedElementReturnTransition();
                } else {
                    obj = operation.getFragment().getSharedElementEnterTransition();
                }
            } else {
                obj = null;
            }
            this.f35477e = obj;
        }

        /* renamed from: e */
        public final FragmentTransitionImpl m54438e() {
            FragmentTransitionImpl m54437f = m54437f(this.f35475c);
            FragmentTransitionImpl m54437f2 = m54437f(this.f35477e);
            if (m54437f != null && m54437f2 != null && m54437f != m54437f2) {
                throw new IllegalArgumentException(("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + m54441b().getFragment() + " returned Transition " + this.f35475c + " which uses a different Transition  type than its shared element transition " + this.f35477e).toString());
            } else if (m54437f == null) {
                return m54437f2;
            } else {
                return m54437f;
            }
        }

        /* renamed from: f */
        public final FragmentTransitionImpl m54437f(Object obj) {
            if (obj == null) {
                return null;
            }
            FragmentTransitionImpl fragmentTransitionImpl = FragmentTransition.PLATFORM_IMPL;
            if (fragmentTransitionImpl != null && fragmentTransitionImpl.canHandle(obj)) {
                return fragmentTransitionImpl;
            }
            FragmentTransitionImpl fragmentTransitionImpl2 = FragmentTransition.SUPPORT_IMPL;
            if (fragmentTransitionImpl2 != null && fragmentTransitionImpl2.canHandle(obj)) {
                return fragmentTransitionImpl2;
            }
            throw new IllegalArgumentException("Transition " + obj + " for fragment " + m54441b().getFragment() + " is not a valid framework Transition or AndroidX Transition");
        }

        /* renamed from: g */
        public final Object m54436g() {
            return this.f35477e;
        }

        /* renamed from: h */
        public final Object m54435h() {
            return this.f35475c;
        }

        /* renamed from: i */
        public final boolean m54434i() {
            if (this.f35477e != null) {
                return true;
            }
            return false;
        }

        /* renamed from: j */
        public final boolean m54433j() {
            return this.f35476d;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultSpecialEffectsController(@NotNull ViewGroup container) {
        super(container);
        Intrinsics.checkNotNullParameter(container, "container");
    }

    /* renamed from: A */
    public static final void m54466A(C4548c transitionInfo, SpecialEffectsController.Operation operation) {
        Intrinsics.checkNotNullParameter(transitionInfo, "$transitionInfo");
        Intrinsics.checkNotNullParameter(operation, "$operation");
        transitionInfo.m54442a();
        if (FragmentManager.isLoggingEnabled(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Transition for operation ");
            sb.append(operation);
            sb.append(" has completed");
        }
    }

    /* renamed from: B */
    public static final void m54465B(SpecialEffectsController.Operation operation, SpecialEffectsController.Operation operation2, boolean z, ArrayMap lastInViews) {
        Intrinsics.checkNotNullParameter(lastInViews, "$lastInViews");
        FragmentTransition.callSharedElementStartEnd(operation.getFragment(), operation2.getFragment(), z, lastInViews, false);
    }

    /* renamed from: i */
    public static /* synthetic */ void m54463i(List list, SpecialEffectsController.Operation operation, DefaultSpecialEffectsController defaultSpecialEffectsController) {
        m54454r(list, operation, defaultSpecialEffectsController);
    }

    /* renamed from: j */
    public static /* synthetic */ void m54462j(SpecialEffectsController.Operation operation, SpecialEffectsController.Operation operation2, boolean z, ArrayMap arrayMap) {
        m54465B(operation, operation2, z, arrayMap);
    }

    /* renamed from: k */
    public static /* synthetic */ void m54461k(Animator animator, SpecialEffectsController.Operation operation) {
        m54450v(animator, operation);
    }

    /* renamed from: l */
    public static /* synthetic */ void m54460l(View view, DefaultSpecialEffectsController defaultSpecialEffectsController, C4546a c4546a, SpecialEffectsController.Operation operation) {
        m54449w(view, defaultSpecialEffectsController, c4546a, operation);
    }

    /* renamed from: m */
    public static /* synthetic */ void m54459m(ArrayList arrayList) {
        m54446z(arrayList);
    }

    /* renamed from: n */
    public static /* synthetic */ void m54458n(C4548c c4548c, SpecialEffectsController.Operation operation) {
        m54466A(c4548c, operation);
    }

    /* renamed from: o */
    public static /* synthetic */ void m54457o(FragmentTransitionImpl fragmentTransitionImpl, View view, Rect rect) {
        m54447y(fragmentTransitionImpl, view, rect);
    }

    /* renamed from: r */
    public static final void m54454r(List awaitingContainerChanges, SpecialEffectsController.Operation operation, DefaultSpecialEffectsController this$0) {
        Intrinsics.checkNotNullParameter(awaitingContainerChanges, "$awaitingContainerChanges");
        Intrinsics.checkNotNullParameter(operation, "$operation");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (awaitingContainerChanges.contains(operation)) {
            awaitingContainerChanges.remove(operation);
            this$0.m54456p(operation);
        }
    }

    /* renamed from: v */
    public static final void m54450v(Animator animator, SpecialEffectsController.Operation operation) {
        Intrinsics.checkNotNullParameter(operation, "$operation");
        animator.end();
        if (FragmentManager.isLoggingEnabled(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Animator from operation ");
            sb.append(operation);
            sb.append(" has been canceled.");
        }
    }

    /* renamed from: w */
    public static final void m54449w(View view, DefaultSpecialEffectsController this$0, C4546a animationInfo, SpecialEffectsController.Operation operation) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(animationInfo, "$animationInfo");
        Intrinsics.checkNotNullParameter(operation, "$operation");
        view.clearAnimation();
        this$0.getContainer().endViewTransition(view);
        animationInfo.m54442a();
        if (FragmentManager.isLoggingEnabled(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Animation from operation ");
            sb.append(operation);
            sb.append(" has been cancelled.");
        }
    }

    /* renamed from: y */
    public static final void m54447y(FragmentTransitionImpl impl, View view, Rect lastInEpicenterRect) {
        Intrinsics.checkNotNullParameter(impl, "$impl");
        Intrinsics.checkNotNullParameter(lastInEpicenterRect, "$lastInEpicenterRect");
        impl.getBoundsOnScreen(view, lastInEpicenterRect);
    }

    /* renamed from: z */
    public static final void m54446z(ArrayList transitioningViews) {
        Intrinsics.checkNotNullParameter(transitioningViews, "$transitioningViews");
        FragmentTransition.setViewVisibility(transitioningViews, 4);
    }

    /* renamed from: C */
    public final void m54464C(List list) {
        Fragment fragment = ((SpecialEffectsController.Operation) CollectionsKt___CollectionsKt.last((List<? extends Object>) list)).getFragment();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            SpecialEffectsController.Operation operation = (SpecialEffectsController.Operation) it.next();
            operation.getFragment().mAnimationInfo.f35514c = fragment.mAnimationInfo.f35514c;
            operation.getFragment().mAnimationInfo.f35515d = fragment.mAnimationInfo.f35515d;
            operation.getFragment().mAnimationInfo.f35516e = fragment.mAnimationInfo.f35516e;
            operation.getFragment().mAnimationInfo.f35517f = fragment.mAnimationInfo.f35517f;
        }
    }

    @Override // androidx.fragment.app.SpecialEffectsController
    public void executeOperations(@NotNull List<? extends SpecialEffectsController.Operation> operations, boolean z) {
        SpecialEffectsController.Operation operation;
        Object obj;
        Intrinsics.checkNotNullParameter(operations, "operations");
        Iterator<T> it = operations.iterator();
        while (true) {
            operation = null;
            if (it.hasNext()) {
                obj = it.next();
                SpecialEffectsController.Operation operation2 = (SpecialEffectsController.Operation) obj;
                SpecialEffectsController.Operation.State.Companion companion = SpecialEffectsController.Operation.State.Companion;
                View view = operation2.getFragment().mView;
                Intrinsics.checkNotNullExpressionValue(view, "operation.fragment.mView");
                SpecialEffectsController.Operation.State asOperationState = companion.asOperationState(view);
                SpecialEffectsController.Operation.State state = SpecialEffectsController.Operation.State.VISIBLE;
                if (asOperationState == state && operation2.getFinalState() != state) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        SpecialEffectsController.Operation operation3 = (SpecialEffectsController.Operation) obj;
        ListIterator<? extends SpecialEffectsController.Operation> listIterator = operations.listIterator(operations.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                break;
            }
            SpecialEffectsController.Operation previous = listIterator.previous();
            SpecialEffectsController.Operation operation4 = previous;
            SpecialEffectsController.Operation.State.Companion companion2 = SpecialEffectsController.Operation.State.Companion;
            View view2 = operation4.getFragment().mView;
            Intrinsics.checkNotNullExpressionValue(view2, "operation.fragment.mView");
            SpecialEffectsController.Operation.State asOperationState2 = companion2.asOperationState(view2);
            SpecialEffectsController.Operation.State state2 = SpecialEffectsController.Operation.State.VISIBLE;
            if (asOperationState2 != state2 && operation4.getFinalState() == state2) {
                operation = previous;
                break;
            }
        }
        SpecialEffectsController.Operation operation5 = operation;
        if (FragmentManager.isLoggingEnabled(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Executing operations from ");
            sb.append(operation3);
            sb.append(" to ");
            sb.append(operation5);
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        final List<SpecialEffectsController.Operation> mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) operations);
        m54464C(operations);
        for (final SpecialEffectsController.Operation operation6 : operations) {
            CancellationSignal cancellationSignal = new CancellationSignal();
            operation6.markStartedSpecialEffect(cancellationSignal);
            arrayList.add(new C4546a(operation6, cancellationSignal, z));
            CancellationSignal cancellationSignal2 = new CancellationSignal();
            operation6.markStartedSpecialEffect(cancellationSignal2);
            boolean z2 = false;
            if (z) {
                if (operation6 != operation3) {
                    arrayList2.add(new C4548c(operation6, cancellationSignal2, z, z2));
                    operation6.addCompletionListener(new Runnable() { // from class: SE
                        @Override // java.lang.Runnable
                        public final void run() {
                            DefaultSpecialEffectsController.m54463i(mutableList, operation6, this);
                        }
                    });
                }
                z2 = true;
                arrayList2.add(new C4548c(operation6, cancellationSignal2, z, z2));
                operation6.addCompletionListener(new Runnable() { // from class: SE
                    @Override // java.lang.Runnable
                    public final void run() {
                        DefaultSpecialEffectsController.m54463i(mutableList, operation6, this);
                    }
                });
            } else {
                if (operation6 != operation5) {
                    arrayList2.add(new C4548c(operation6, cancellationSignal2, z, z2));
                    operation6.addCompletionListener(new Runnable() { // from class: SE
                        @Override // java.lang.Runnable
                        public final void run() {
                            DefaultSpecialEffectsController.m54463i(mutableList, operation6, this);
                        }
                    });
                }
                z2 = true;
                arrayList2.add(new C4548c(operation6, cancellationSignal2, z, z2));
                operation6.addCompletionListener(new Runnable() { // from class: SE
                    @Override // java.lang.Runnable
                    public final void run() {
                        DefaultSpecialEffectsController.m54463i(mutableList, operation6, this);
                    }
                });
            }
        }
        Map m54448x = m54448x(arrayList2, mutableList, z, operation3, operation5);
        m54451u(arrayList, mutableList, m54448x.containsValue(Boolean.TRUE), m54448x);
        for (SpecialEffectsController.Operation operation7 : mutableList) {
            m54456p(operation7);
        }
        mutableList.clear();
        if (FragmentManager.isLoggingEnabled(2)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Completed executing operations from ");
            sb2.append(operation3);
            sb2.append(" to ");
            sb2.append(operation5);
        }
    }

    /* renamed from: p */
    public final void m54456p(SpecialEffectsController.Operation operation) {
        View view = operation.getFragment().mView;
        SpecialEffectsController.Operation.State finalState = operation.getFinalState();
        Intrinsics.checkNotNullExpressionValue(view, "view");
        finalState.applyState(view);
    }

    /* renamed from: q */
    public final void m54455q(ArrayList arrayList, View view) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (ViewGroupCompat.isTransitionGroup(viewGroup)) {
                if (!arrayList.contains(view)) {
                    arrayList.add(view);
                    return;
                }
                return;
            }
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View child = viewGroup.getChildAt(i);
                if (child.getVisibility() == 0) {
                    Intrinsics.checkNotNullExpressionValue(child, "child");
                    m54455q(arrayList, child);
                }
            }
        } else if (!arrayList.contains(view)) {
            arrayList.add(view);
        }
    }

    /* renamed from: s */
    public final void m54453s(Map map, View view) {
        String transitionName = ViewCompat.getTransitionName(view);
        if (transitionName != null) {
            map.put(transitionName, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View child = viewGroup.getChildAt(i);
                if (child.getVisibility() == 0) {
                    Intrinsics.checkNotNullExpressionValue(child, "child");
                    m54453s(map, child);
                }
            }
        }
    }

    /* renamed from: t */
    public final void m54452t(ArrayMap arrayMap, Collection collection) {
        Set entries = arrayMap.entrySet();
        Intrinsics.checkNotNullExpressionValue(entries, "entries");
        AbstractC10396hs.retainAll(entries, new DefaultSpecialEffectsController$retainMatchingViews$1(collection));
    }

    /* renamed from: u */
    public final void m54451u(List list, List list2, boolean z, Map map) {
        final boolean z2;
        Context context = getContainer().getContext();
        ArrayList<C4546a> arrayList = new ArrayList();
        Iterator it = list.iterator();
        boolean z3 = false;
        while (it.hasNext()) {
            final C4546a c4546a = (C4546a) it.next();
            if (c4546a.m54439d()) {
                c4546a.m54442a();
            } else {
                Intrinsics.checkNotNullExpressionValue(context, "context");
                AbstractC4602d.C4603a m54443e = c4546a.m54443e(context);
                if (m54443e == null) {
                    c4546a.m54442a();
                } else {
                    final Animator animator = m54443e.f35730b;
                    if (animator == null) {
                        arrayList.add(c4546a);
                    } else {
                        final SpecialEffectsController.Operation m54441b = c4546a.m54441b();
                        Fragment fragment = m54441b.getFragment();
                        if (Intrinsics.areEqual(map.get(m54441b), Boolean.TRUE)) {
                            if (FragmentManager.isLoggingEnabled(2)) {
                                StringBuilder sb = new StringBuilder();
                                sb.append("Ignoring Animator set on ");
                                sb.append(fragment);
                                sb.append(" as this Fragment was involved in a Transition.");
                            }
                            c4546a.m54442a();
                        } else {
                            if (m54441b.getFinalState() == SpecialEffectsController.Operation.State.GONE) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (z2) {
                                list2.remove(m54441b);
                            }
                            final View view = fragment.mView;
                            getContainer().startViewTransition(view);
                            animator.addListener(new AnimatorListenerAdapter() { // from class: androidx.fragment.app.DefaultSpecialEffectsController$startAnimations$1
                                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                                public void onAnimationEnd(@NotNull Animator anim) {
                                    Intrinsics.checkNotNullParameter(anim, "anim");
                                    DefaultSpecialEffectsController.this.getContainer().endViewTransition(view);
                                    if (z2) {
                                        SpecialEffectsController.Operation.State finalState = m54441b.getFinalState();
                                        View viewToAnimate = view;
                                        Intrinsics.checkNotNullExpressionValue(viewToAnimate, "viewToAnimate");
                                        finalState.applyState(viewToAnimate);
                                    }
                                    c4546a.m54442a();
                                    if (FragmentManager.isLoggingEnabled(2)) {
                                        StringBuilder sb2 = new StringBuilder();
                                        sb2.append("Animator from operation ");
                                        sb2.append(m54441b);
                                        sb2.append(" has ended.");
                                    }
                                }
                            });
                            animator.setTarget(view);
                            animator.start();
                            if (FragmentManager.isLoggingEnabled(2)) {
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append("Animator from operation ");
                                sb2.append(m54441b);
                                sb2.append(" has started.");
                            }
                            c4546a.m54440c().setOnCancelListener(new CancellationSignal.OnCancelListener() { // from class: TE
                                @Override // androidx.core.p005os.CancellationSignal.OnCancelListener
                                public final void onCancel() {
                                    DefaultSpecialEffectsController.m54461k(animator, m54441b);
                                }
                            });
                            z3 = true;
                        }
                    }
                }
            }
        }
        for (final C4546a c4546a2 : arrayList) {
            final SpecialEffectsController.Operation m54441b2 = c4546a2.m54441b();
            Fragment fragment2 = m54441b2.getFragment();
            if (z) {
                if (FragmentManager.isLoggingEnabled(2)) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("Ignoring Animation set on ");
                    sb3.append(fragment2);
                    sb3.append(" as Animations cannot run alongside Transitions.");
                }
                c4546a2.m54442a();
            } else if (z3) {
                if (FragmentManager.isLoggingEnabled(2)) {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("Ignoring Animation set on ");
                    sb4.append(fragment2);
                    sb4.append(" as Animations cannot run alongside Animators.");
                }
                c4546a2.m54442a();
            } else {
                final View view2 = fragment2.mView;
                Intrinsics.checkNotNullExpressionValue(context, "context");
                AbstractC4602d.C4603a m54443e2 = c4546a2.m54443e(context);
                if (m54443e2 != null) {
                    Animation animation = m54443e2.f35729a;
                    if (animation != null) {
                        if (m54441b2.getFinalState() != SpecialEffectsController.Operation.State.REMOVED) {
                            view2.startAnimation(animation);
                            c4546a2.m54442a();
                        } else {
                            getContainer().startViewTransition(view2);
                            AbstractC4602d.RunnableC4604b runnableC4604b = new AbstractC4602d.RunnableC4604b(animation, getContainer(), view2);
                            runnableC4604b.setAnimationListener(new DefaultSpecialEffectsController$startAnimations$3(m54441b2, this, view2, c4546a2));
                            view2.startAnimation(runnableC4604b);
                            if (FragmentManager.isLoggingEnabled(2)) {
                                StringBuilder sb5 = new StringBuilder();
                                sb5.append("Animation from operation ");
                                sb5.append(m54441b2);
                                sb5.append(" has started.");
                            }
                        }
                        c4546a2.m54440c().setOnCancelListener(new CancellationSignal.OnCancelListener() { // from class: UE
                            @Override // androidx.core.p005os.CancellationSignal.OnCancelListener
                            public final void onCancel() {
                                DefaultSpecialEffectsController.m54460l(view2, this, c4546a2, m54441b2);
                            }
                        });
                    } else {
                        throw new IllegalStateException("Required value was null.".toString());
                    }
                } else {
                    throw new IllegalStateException("Required value was null.".toString());
                }
            }
        }
    }

    /* renamed from: x */
    public final Map m54448x(List list, List list2, boolean z, final SpecialEffectsController.Operation operation, final SpecialEffectsController.Operation operation2) {
        boolean z2;
        boolean z3;
        View view;
        Object obj;
        Object obj2;
        Object obj3;
        LinkedHashMap linkedHashMap;
        final ArrayList arrayList;
        SpecialEffectsController.Operation operation3;
        Object obj4;
        View view2;
        ArrayMap arrayMap;
        ArrayList arrayList2;
        Rect rect;
        Pair m29136to;
        Object obj5;
        ArrayList<String> arrayList3;
        Object obj6;
        View view3;
        final Rect rect2;
        View view4;
        final boolean z4 = z;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        ArrayList arrayList4 = new ArrayList();
        for (Object obj7 : list) {
            if (!((C4548c) obj7).m54439d()) {
                arrayList4.add(obj7);
            }
        }
        ArrayList<C4548c> arrayList5 = new ArrayList();
        for (Object obj8 : arrayList4) {
            if (((C4548c) obj8).m54438e() != null) {
                arrayList5.add(obj8);
            }
        }
        final FragmentTransitionImpl fragmentTransitionImpl = null;
        for (C4548c c4548c : arrayList5) {
            FragmentTransitionImpl m54438e = c4548c.m54438e();
            if (fragmentTransitionImpl != null && m54438e != fragmentTransitionImpl) {
                throw new IllegalArgumentException(("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + c4548c.m54441b().getFragment() + " returned Transition " + c4548c.m54435h() + " which uses a different Transition type than other Fragments.").toString());
            }
            fragmentTransitionImpl = m54438e;
        }
        if (fragmentTransitionImpl == null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C4548c c4548c2 = (C4548c) it.next();
                linkedHashMap2.put(c4548c2.m54441b(), Boolean.FALSE);
                c4548c2.m54442a();
            }
            return linkedHashMap2;
        }
        View view5 = new View(getContainer().getContext());
        Rect rect3 = new Rect();
        ArrayList<View> arrayList6 = new ArrayList<>();
        ArrayList arrayList7 = new ArrayList();
        ArrayMap arrayMap2 = new ArrayMap();
        Iterator it2 = list.iterator();
        View view6 = null;
        Object obj9 = null;
        boolean z5 = false;
        while (it2.hasNext()) {
            C4548c c4548c3 = (C4548c) it2.next();
            if (c4548c3.m54434i() && operation != null && operation2 != null) {
                Object wrapTransitionInSet = fragmentTransitionImpl.wrapTransitionInSet(fragmentTransitionImpl.cloneTransition(c4548c3.m54436g()));
                ArrayList<String> sharedElementSourceNames = operation2.getFragment().getSharedElementSourceNames();
                Intrinsics.checkNotNullExpressionValue(sharedElementSourceNames, "lastIn.fragment.sharedElementSourceNames");
                ArrayList<String> sharedElementSourceNames2 = operation.getFragment().getSharedElementSourceNames();
                Intrinsics.checkNotNullExpressionValue(sharedElementSourceNames2, "firstOut.fragment.sharedElementSourceNames");
                ArrayList<String> sharedElementTargetNames = operation.getFragment().getSharedElementTargetNames();
                View view7 = view6;
                Intrinsics.checkNotNullExpressionValue(sharedElementTargetNames, "firstOut.fragment.sharedElementTargetNames");
                int size = sharedElementTargetNames.size();
                LinkedHashMap linkedHashMap3 = linkedHashMap2;
                View view8 = view5;
                int i = 0;
                while (i < size) {
                    int i2 = size;
                    int indexOf = sharedElementSourceNames.indexOf(sharedElementTargetNames.get(i));
                    if (indexOf != -1) {
                        sharedElementSourceNames.set(indexOf, sharedElementSourceNames2.get(i));
                    }
                    i++;
                    size = i2;
                }
                ArrayList<String> sharedElementTargetNames2 = operation2.getFragment().getSharedElementTargetNames();
                Intrinsics.checkNotNullExpressionValue(sharedElementTargetNames2, "lastIn.fragment.sharedElementTargetNames");
                if (!z4) {
                    m29136to = TuplesKt.m29136to(operation.getFragment().getExitTransitionCallback(), operation2.getFragment().getEnterTransitionCallback());
                } else {
                    m29136to = TuplesKt.m29136to(operation.getFragment().getEnterTransitionCallback(), operation2.getFragment().getExitTransitionCallback());
                }
                SharedElementCallback sharedElementCallback = (SharedElementCallback) m29136to.component1();
                SharedElementCallback sharedElementCallback2 = (SharedElementCallback) m29136to.component2();
                int size2 = sharedElementSourceNames.size();
                int i3 = 0;
                while (i3 < size2) {
                    arrayMap2.put(sharedElementSourceNames.get(i3), sharedElementTargetNames2.get(i3));
                    i3++;
                    size2 = size2;
                    rect3 = rect3;
                }
                Rect rect4 = rect3;
                if (FragmentManager.isLoggingEnabled(2)) {
                    Iterator<String> it3 = sharedElementTargetNames2.iterator();
                    while (it3.hasNext()) {
                        Iterator<String> it4 = it3;
                        StringBuilder sb = new StringBuilder();
                        sb.append("Name: ");
                        sb.append(it3.next());
                        it3 = it4;
                    }
                    Iterator<String> it5 = sharedElementSourceNames.iterator();
                    while (it5.hasNext()) {
                        Iterator<String> it6 = it5;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Name: ");
                        sb2.append(it5.next());
                        it5 = it6;
                    }
                }
                ArrayMap arrayMap3 = new ArrayMap();
                View view9 = operation.getFragment().mView;
                Intrinsics.checkNotNullExpressionValue(view9, "firstOut.fragment.mView");
                m54453s(arrayMap3, view9);
                arrayMap3.retainAll(sharedElementSourceNames);
                if (sharedElementCallback != null) {
                    if (FragmentManager.isLoggingEnabled(2)) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("Executing exit callback for operation ");
                        sb3.append(operation);
                    }
                    sharedElementCallback.onMapSharedElements(sharedElementSourceNames, arrayMap3);
                    int size3 = sharedElementSourceNames.size() - 1;
                    if (size3 >= 0) {
                        while (true) {
                            int i4 = size3 - 1;
                            Object obj10 = (String) sharedElementSourceNames.get(size3);
                            View view10 = (View) arrayMap3.get(obj10);
                            if (view10 == null) {
                                arrayMap2.remove(obj10);
                                obj5 = wrapTransitionInSet;
                            } else {
                                obj5 = wrapTransitionInSet;
                                if (!Intrinsics.areEqual(obj10, ViewCompat.getTransitionName(view10))) {
                                    arrayMap2.put(ViewCompat.getTransitionName(view10), (String) arrayMap2.remove(obj10));
                                }
                            }
                            if (i4 < 0) {
                                break;
                            }
                            size3 = i4;
                            wrapTransitionInSet = obj5;
                        }
                    } else {
                        obj5 = wrapTransitionInSet;
                    }
                } else {
                    obj5 = wrapTransitionInSet;
                    arrayMap2.retainAll(arrayMap3.keySet());
                }
                final ArrayMap arrayMap4 = new ArrayMap();
                View view11 = operation2.getFragment().mView;
                Intrinsics.checkNotNullExpressionValue(view11, "lastIn.fragment.mView");
                m54453s(arrayMap4, view11);
                arrayMap4.retainAll(sharedElementTargetNames2);
                arrayMap4.retainAll(arrayMap2.values());
                if (sharedElementCallback2 != null) {
                    if (FragmentManager.isLoggingEnabled(2)) {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("Executing enter callback for operation ");
                        sb4.append(operation2);
                    }
                    sharedElementCallback2.onMapSharedElements(sharedElementTargetNames2, arrayMap4);
                    int size4 = sharedElementTargetNames2.size() - 1;
                    if (size4 >= 0) {
                        while (true) {
                            int i5 = size4 - 1;
                            String name = sharedElementTargetNames2.get(size4);
                            View view12 = (View) arrayMap4.get(name);
                            if (view12 == null) {
                                Intrinsics.checkNotNullExpressionValue(name, "name");
                                String findKeyForValue = FragmentTransition.findKeyForValue(arrayMap2, name);
                                if (findKeyForValue != null) {
                                    arrayMap2.remove(findKeyForValue);
                                }
                                arrayList3 = sharedElementTargetNames2;
                            } else {
                                arrayList3 = sharedElementTargetNames2;
                                if (!Intrinsics.areEqual(name, ViewCompat.getTransitionName(view12))) {
                                    Intrinsics.checkNotNullExpressionValue(name, "name");
                                    String findKeyForValue2 = FragmentTransition.findKeyForValue(arrayMap2, name);
                                    if (findKeyForValue2 != null) {
                                        arrayMap2.put(findKeyForValue2, ViewCompat.getTransitionName(view12));
                                    }
                                }
                            }
                            if (i5 < 0) {
                                break;
                            }
                            size4 = i5;
                            sharedElementTargetNames2 = arrayList3;
                        }
                    } else {
                        arrayList3 = sharedElementTargetNames2;
                    }
                } else {
                    arrayList3 = sharedElementTargetNames2;
                    FragmentTransition.retainValues(arrayMap2, arrayMap4);
                }
                Collection keySet = arrayMap2.keySet();
                Intrinsics.checkNotNullExpressionValue(keySet, "sharedElementNameMapping.keys");
                m54452t(arrayMap3, keySet);
                Collection values = arrayMap2.values();
                Intrinsics.checkNotNullExpressionValue(values, "sharedElementNameMapping.values");
                m54452t(arrayMap4, values);
                if (arrayMap2.isEmpty()) {
                    arrayList6.clear();
                    arrayList7.clear();
                    view6 = view7;
                    linkedHashMap2 = linkedHashMap3;
                    view5 = view8;
                    rect3 = rect4;
                    obj9 = null;
                } else {
                    FragmentTransition.callSharedElementStartEnd(operation2.getFragment(), operation.getFragment(), z4, arrayMap3, true);
                    OneShotPreDrawListener.add(getContainer(), new Runnable() { // from class: VE
                        @Override // java.lang.Runnable
                        public final void run() {
                            DefaultSpecialEffectsController.m54462j(SpecialEffectsController.Operation.this, operation, z4, arrayMap4);
                        }
                    });
                    arrayList6.addAll(arrayMap3.values());
                    if (!sharedElementSourceNames.isEmpty()) {
                        view3 = (View) arrayMap3.get((String) sharedElementSourceNames.get(0));
                        obj6 = obj5;
                        fragmentTransitionImpl.setEpicenter(obj6, view3);
                    } else {
                        obj6 = obj5;
                        view3 = view7;
                    }
                    arrayList7.addAll(arrayMap4.values());
                    if (!arrayList3.isEmpty()) {
                        final View view13 = (View) arrayMap4.get((String) arrayList3.get(0));
                        if (view13 != null) {
                            rect2 = rect4;
                            OneShotPreDrawListener.add(getContainer(), new Runnable() { // from class: WE
                                @Override // java.lang.Runnable
                                public final void run() {
                                    DefaultSpecialEffectsController.m54457o(FragmentTransitionImpl.this, view13, rect2);
                                }
                            });
                            view4 = view8;
                            z5 = true;
                            fragmentTransitionImpl.setSharedElementTargets(obj6, view4, arrayList6);
                            arrayMap = arrayMap2;
                            arrayList2 = arrayList7;
                            rect = rect2;
                            fragmentTransitionImpl.scheduleRemoveTargets(obj6, null, null, null, null, obj6, arrayList2);
                            Boolean bool = Boolean.TRUE;
                            linkedHashMap3.put(operation, bool);
                            linkedHashMap3.put(operation2, bool);
                            view6 = view3;
                            obj9 = obj6;
                            view5 = view4;
                            linkedHashMap2 = linkedHashMap3;
                            arrayList6 = arrayList6;
                        } else {
                            rect2 = rect4;
                        }
                    } else {
                        rect2 = rect4;
                    }
                    view4 = view8;
                    fragmentTransitionImpl.setSharedElementTargets(obj6, view4, arrayList6);
                    arrayMap = arrayMap2;
                    arrayList2 = arrayList7;
                    rect = rect2;
                    fragmentTransitionImpl.scheduleRemoveTargets(obj6, null, null, null, null, obj6, arrayList2);
                    Boolean bool2 = Boolean.TRUE;
                    linkedHashMap3.put(operation, bool2);
                    linkedHashMap3.put(operation2, bool2);
                    view6 = view3;
                    obj9 = obj6;
                    view5 = view4;
                    linkedHashMap2 = linkedHashMap3;
                    arrayList6 = arrayList6;
                }
            } else {
                arrayMap = arrayMap2;
                arrayList2 = arrayList7;
                rect = rect3;
                view5 = view5;
                linkedHashMap2 = linkedHashMap2;
                arrayList6 = arrayList6;
                view6 = view6;
            }
            arrayMap2 = arrayMap;
            arrayList7 = arrayList2;
            rect3 = rect;
            z4 = z;
        }
        View view14 = view5;
        View view15 = view6;
        ArrayMap arrayMap5 = arrayMap2;
        ArrayList arrayList8 = arrayList7;
        ArrayList<View> arrayList9 = arrayList6;
        Rect rect5 = rect3;
        LinkedHashMap linkedHashMap4 = linkedHashMap2;
        ArrayList arrayList10 = new ArrayList();
        Iterator it7 = list.iterator();
        Object obj11 = null;
        Object obj12 = null;
        while (it7.hasNext()) {
            C4548c c4548c4 = (C4548c) it7.next();
            if (c4548c4.m54439d()) {
                linkedHashMap4.put(c4548c4.m54441b(), Boolean.FALSE);
                c4548c4.m54442a();
            } else {
                Object cloneTransition = fragmentTransitionImpl.cloneTransition(c4548c4.m54435h());
                SpecialEffectsController.Operation m54441b = c4548c4.m54441b();
                if (obj9 != null && (m54441b == operation || m54441b == operation2)) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (cloneTransition == null) {
                    if (!z3) {
                        linkedHashMap4.put(m54441b, Boolean.FALSE);
                        c4548c4.m54442a();
                    }
                } else {
                    ArrayList arrayList11 = new ArrayList();
                    Iterator it8 = it7;
                    View view16 = m54441b.getFragment().mView;
                    Object obj13 = obj9;
                    Intrinsics.checkNotNullExpressionValue(view16, "operation.fragment.mView");
                    m54455q(arrayList11, view16);
                    if (z3) {
                        if (m54441b == operation) {
                            arrayList11.removeAll(CollectionsKt___CollectionsKt.toSet(arrayList9));
                        } else {
                            arrayList11.removeAll(CollectionsKt___CollectionsKt.toSet(arrayList8));
                        }
                    }
                    if (arrayList11.isEmpty()) {
                        fragmentTransitionImpl.addTarget(cloneTransition, view14);
                        obj2 = obj11;
                        obj3 = obj12;
                        linkedHashMap = linkedHashMap4;
                        view = view15;
                        obj = obj13;
                        obj4 = cloneTransition;
                        arrayList = arrayList11;
                        operation3 = m54441b;
                    } else {
                        fragmentTransitionImpl.addTargets(cloneTransition, arrayList11);
                        view = view15;
                        obj = obj13;
                        obj2 = obj11;
                        obj3 = obj12;
                        linkedHashMap = linkedHashMap4;
                        fragmentTransitionImpl.scheduleRemoveTargets(cloneTransition, cloneTransition, arrayList11, null, null, null, null);
                        if (m54441b.getFinalState() == SpecialEffectsController.Operation.State.GONE) {
                            operation3 = m54441b;
                            list2.remove(operation3);
                            arrayList = arrayList11;
                            ArrayList<View> arrayList12 = new ArrayList<>(arrayList);
                            arrayList12.remove(operation3.getFragment().mView);
                            obj4 = cloneTransition;
                            fragmentTransitionImpl.scheduleHideFragmentView(obj4, operation3.getFragment().mView, arrayList12);
                            OneShotPreDrawListener.add(getContainer(), new Runnable() { // from class: XE
                                @Override // java.lang.Runnable
                                public final void run() {
                                    DefaultSpecialEffectsController.m54459m(arrayList);
                                }
                            });
                        } else {
                            arrayList = arrayList11;
                            operation3 = m54441b;
                            obj4 = cloneTransition;
                        }
                    }
                    if (operation3.getFinalState() == SpecialEffectsController.Operation.State.VISIBLE) {
                        arrayList10.addAll(arrayList);
                        if (z5) {
                            fragmentTransitionImpl.setEpicenter(obj4, rect5);
                        }
                        view2 = view;
                    } else {
                        view2 = view;
                        fragmentTransitionImpl.setEpicenter(obj4, view2);
                    }
                    linkedHashMap.put(operation3, Boolean.TRUE);
                    if (c4548c4.m54433j()) {
                        obj12 = fragmentTransitionImpl.mergeTransitionsTogether(obj3, obj4, null);
                        linkedHashMap4 = linkedHashMap;
                        view15 = view2;
                        obj9 = obj;
                        obj11 = obj2;
                    } else {
                        obj12 = obj3;
                        obj11 = fragmentTransitionImpl.mergeTransitionsTogether(obj2, obj4, null);
                        linkedHashMap4 = linkedHashMap;
                        view15 = view2;
                        obj9 = obj;
                    }
                    it7 = it8;
                }
            }
        }
        LinkedHashMap linkedHashMap5 = linkedHashMap4;
        Object obj14 = obj9;
        Object mergeTransitionsInSequence = fragmentTransitionImpl.mergeTransitionsInSequence(obj12, obj11, obj14);
        if (mergeTransitionsInSequence == null) {
            return linkedHashMap5;
        }
        ArrayList<C4548c> arrayList13 = new ArrayList();
        for (Object obj15 : list) {
            if (!((C4548c) obj15).m54439d()) {
                arrayList13.add(obj15);
            }
        }
        for (final C4548c c4548c5 : arrayList13) {
            Object m54435h = c4548c5.m54435h();
            final SpecialEffectsController.Operation m54441b2 = c4548c5.m54441b();
            if (obj14 != null && (m54441b2 == operation || m54441b2 == operation2)) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (m54435h != null || z2) {
                if (!ViewCompat.isLaidOut(getContainer())) {
                    if (FragmentManager.isLoggingEnabled(2)) {
                        StringBuilder sb5 = new StringBuilder();
                        sb5.append("SpecialEffectsController: Container ");
                        sb5.append(getContainer());
                        sb5.append(" has not been laid out. Completing operation ");
                        sb5.append(m54441b2);
                    }
                    c4548c5.m54442a();
                } else {
                    fragmentTransitionImpl.setListenerForTransitionEnd(c4548c5.m54441b().getFragment(), mergeTransitionsInSequence, c4548c5.m54440c(), new Runnable() { // from class: YE
                        @Override // java.lang.Runnable
                        public final void run() {
                            DefaultSpecialEffectsController.m54458n(DefaultSpecialEffectsController.C4548c.this, m54441b2);
                        }
                    });
                }
            }
        }
        if (!ViewCompat.isLaidOut(getContainer())) {
            return linkedHashMap5;
        }
        FragmentTransition.setViewVisibility(arrayList10, 4);
        ArrayList m54251b = fragmentTransitionImpl.m54251b(arrayList8);
        if (FragmentManager.isLoggingEnabled(2)) {
            Iterator<View> it9 = arrayList9.iterator();
            while (it9.hasNext()) {
                View sharedElementFirstOutViews = it9.next();
                Intrinsics.checkNotNullExpressionValue(sharedElementFirstOutViews, "sharedElementFirstOutViews");
                View view17 = sharedElementFirstOutViews;
                StringBuilder sb6 = new StringBuilder();
                sb6.append("View: ");
                sb6.append(view17);
                sb6.append(" Name: ");
                sb6.append(ViewCompat.getTransitionName(view17));
            }
            Iterator it10 = arrayList8.iterator();
            while (it10.hasNext()) {
                Object sharedElementLastInViews = it10.next();
                Intrinsics.checkNotNullExpressionValue(sharedElementLastInViews, "sharedElementLastInViews");
                View view18 = (View) sharedElementLastInViews;
                StringBuilder sb7 = new StringBuilder();
                sb7.append("View: ");
                sb7.append(view18);
                sb7.append(" Name: ");
                sb7.append(ViewCompat.getTransitionName(view18));
            }
        }
        fragmentTransitionImpl.beginDelayedTransition(getContainer(), mergeTransitionsInSequence);
        fragmentTransitionImpl.m54250c(getContainer(), arrayList9, arrayList8, m54251b, arrayMap5);
        FragmentTransition.setViewVisibility(arrayList10, 0);
        fragmentTransitionImpl.swapSharedElementTargets(obj14, arrayList9, arrayList8);
        return linkedHashMap5;
    }
}