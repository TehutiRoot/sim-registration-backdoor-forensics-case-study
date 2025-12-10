package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.CallSuper;
import androidx.core.p005os.CancellationSignal;
import androidx.core.view.ViewCompat;
import androidx.fragment.R;
import androidx.fragment.app.SpecialEffectsController;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.util.Constant;
import th.p047co.dtac.android.dtacone.util.constant.mixpanel.top_up.TopUpMixpanel;

@Metadata(m28851d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010!\n\u0002\b\f\b \u0018\u0000 :2\u00020\u0001:\u0003:,;B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0012\u0010\u0011J\u0015\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0013\u0010\u0011J\u0015\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\r¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\r¢\u0006\u0004\b\u001a\u0010\u0019J\r\u0010\u001b\u001a\u00020\r¢\u0006\u0004\b\u001b\u0010\u0019J\r\u0010\u001c\u001a\u00020\r¢\u0006\u0004\b\u001c\u0010\u0019J*\u0010!\u001a\u00020\r2\u0011\u0010 \u001a\r\u0012\t\u0012\u00070\u001e¢\u0006\u0002\b\u001f0\u001d2\u0006\u0010\u0015\u001a\u00020\u0014H&¢\u0006\u0004\b!\u0010\"J\u0019\u0010%\u001a\u0004\u0018\u00010\u001e2\u0006\u0010$\u001a\u00020#H\u0002¢\u0006\u0004\b%\u0010&J\u0019\u0010'\u001a\u0004\u0018\u00010\u001e2\u0006\u0010$\u001a\u00020#H\u0002¢\u0006\u0004\b'\u0010&J'\u0010)\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010(\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\rH\u0002¢\u0006\u0004\b+\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u001a\u00103\u001a\b\u0012\u0004\u0012\u00020\u001e008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u001a\u00104\u001a\b\u0012\u0004\u0012\u00020\u001e008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u00102R\u0016\u00107\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u0016\u00109\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00106¨\u0006<"}, m28850d2 = {"Landroidx/fragment/app/SpecialEffectsController;", "", "Landroid/view/ViewGroup;", "container", "<init>", "(Landroid/view/ViewGroup;)V", "Landroidx/fragment/app/j;", "fragmentStateManager", "Landroidx/fragment/app/SpecialEffectsController$Operation$LifecycleImpact;", "getAwaitingCompletionLifecycleImpact", "(Landroidx/fragment/app/j;)Landroidx/fragment/app/SpecialEffectsController$Operation$LifecycleImpact;", "Landroidx/fragment/app/SpecialEffectsController$Operation$State;", "finalState", "", "enqueueAdd", "(Landroidx/fragment/app/SpecialEffectsController$Operation$State;Landroidx/fragment/app/j;)V", "enqueueShow", "(Landroidx/fragment/app/j;)V", "enqueueHide", "enqueueRemove", "", "isPop", "updateOperationDirection", "(Z)V", "markPostponedState", "()V", "forcePostponedExecutePendingOperations", "executePendingOperations", "forceCompleteAllOperations", "", "Landroidx/fragment/app/SpecialEffectsController$Operation;", "Lkotlin/jvm/JvmSuppressWildcards;", "operations", "executeOperations", "(Ljava/util/List;Z)V", "Landroidx/fragment/app/Fragment;", "fragment", OperatorName.FILL_NON_ZERO, "(Landroidx/fragment/app/Fragment;)Landroidx/fragment/app/SpecialEffectsController$Operation;", OperatorName.NON_STROKING_GRAY, "lifecycleImpact", OperatorName.CURVE_TO, "(Landroidx/fragment/app/SpecialEffectsController$Operation$State;Landroidx/fragment/app/SpecialEffectsController$Operation$LifecycleImpact;Landroidx/fragment/app/j;)V", OperatorName.CLOSE_PATH, PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroid/view/ViewGroup;", "getContainer", "()Landroid/view/ViewGroup;", "", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Ljava/util/List;", "pendingOperations", "runningOperations", "d", "Z", "operationDirectionIsPop", "e", "isContainerPostponed", "Companion", "Operation", "fragment_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSpecialEffectsController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpecialEffectsController.kt\nandroidx/fragment/app/SpecialEffectsController\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,710:1\n288#2,2:711\n288#2,2:713\n533#2,6:715\n*S KotlinDebug\n*F\n+ 1 SpecialEffectsController.kt\nandroidx/fragment/app/SpecialEffectsController\n*L\n69#1:711,2\n75#1:713,2\n166#1:715,6\n*E\n"})
/* loaded from: classes2.dex */
public abstract class SpecialEffectsController {
    @NotNull
    public static final Companion Companion = new Companion(null);

    /* renamed from: a */
    public final ViewGroup f35608a;

    /* renamed from: b */
    public final List f35609b;

    /* renamed from: c */
    public final List f35610c;

    /* renamed from: d */
    public boolean f35611d;

    /* renamed from: e */
    public boolean f35612e;

    @Metadata(m28851d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\t\u0010\r¨\u0006\u000e"}, m28850d2 = {"Landroidx/fragment/app/SpecialEffectsController$Companion;", "", "<init>", "()V", "Landroid/view/ViewGroup;", "container", "Landroidx/fragment/app/FragmentManager;", "fragmentManager", "Landroidx/fragment/app/SpecialEffectsController;", "getOrCreateController", "(Landroid/view/ViewGroup;Landroidx/fragment/app/FragmentManager;)Landroidx/fragment/app/SpecialEffectsController;", "LAK1;", "factory", "(Landroid/view/ViewGroup;LAK1;)Landroidx/fragment/app/SpecialEffectsController;", "fragment_release"}, m28849k = 1, m28848mv = {1, 8, 0})
    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final SpecialEffectsController getOrCreateController(@NotNull ViewGroup container, @NotNull FragmentManager fragmentManager) {
            Intrinsics.checkNotNullParameter(container, "container");
            Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
            AK1 m54335u0 = fragmentManager.m54335u0();
            Intrinsics.checkNotNullExpressionValue(m54335u0, "fragmentManager.specialEffectsControllerFactory");
            return getOrCreateController(container, m54335u0);
        }

        public Companion() {
        }

        @JvmStatic
        @NotNull
        public final SpecialEffectsController getOrCreateController(@NotNull ViewGroup container, @NotNull AK1 factory) {
            Intrinsics.checkNotNullParameter(container, "container");
            Intrinsics.checkNotNullParameter(factory, "factory");
            Object tag = container.getTag(R.id.special_effects_controller_view_tag);
            if (tag instanceof SpecialEffectsController) {
                return (SpecialEffectsController) tag;
            }
            SpecialEffectsController mo54323a = factory.mo54323a(container);
            Intrinsics.checkNotNullExpressionValue(mo54323a, "factory.createController(container)");
            container.setTag(R.id.special_effects_controller_view_tag, mo54323a);
            return mo54323a;
        }
    }

    @Metadata(m28851d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0010\u0018\u00002\u00020\u0001:\u0002>?B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0018\u0010\u0011J\u0015\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\b¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\b¢\u0006\u0004\b\u001c\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u000fH\u0017¢\u0006\u0004\b\u001d\u0010\u0011R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u001a\u00101\u001a\b\u0012\u0004\u0012\u00020\u00140.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u001a\u00105\u001a\b\u0012\u0004\u0012\u00020\b028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R$\u0010:\u001a\u0002062\u0006\u00107\u001a\u0002068\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R$\u0010=\u001a\u0002062\u0006\u00107\u001a\u0002068\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b<\u00109\u001a\u0004\b=\u0010;¨\u0006@"}, m28850d2 = {"Landroidx/fragment/app/SpecialEffectsController$Operation;", "", "Landroidx/fragment/app/SpecialEffectsController$Operation$State;", "finalState", "Landroidx/fragment/app/SpecialEffectsController$Operation$LifecycleImpact;", "lifecycleImpact", "Landroidx/fragment/app/Fragment;", "fragment", "Landroidx/core/os/CancellationSignal;", "cancellationSignal", "<init>", "(Landroidx/fragment/app/SpecialEffectsController$Operation$State;Landroidx/fragment/app/SpecialEffectsController$Operation$LifecycleImpact;Landroidx/fragment/app/Fragment;Landroidx/core/os/CancellationSignal;)V", "", "toString", "()Ljava/lang/String;", "", "cancel", "()V", "mergeWith", "(Landroidx/fragment/app/SpecialEffectsController$Operation$State;Landroidx/fragment/app/SpecialEffectsController$Operation$LifecycleImpact;)V", "Ljava/lang/Runnable;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "addCompletionListener", "(Ljava/lang/Runnable;)V", Constant.ServiceAPIName.onStart, "signal", "markStartedSpecialEffect", "(Landroidx/core/os/CancellationSignal;)V", "completeSpecialEffect", "complete", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/fragment/app/SpecialEffectsController$Operation$State;", "getFinalState", "()Landroidx/fragment/app/SpecialEffectsController$Operation$State;", "setFinalState", "(Landroidx/fragment/app/SpecialEffectsController$Operation$State;)V", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Landroidx/fragment/app/SpecialEffectsController$Operation$LifecycleImpact;", "getLifecycleImpact", "()Landroidx/fragment/app/SpecialEffectsController$Operation$LifecycleImpact;", "setLifecycleImpact", "(Landroidx/fragment/app/SpecialEffectsController$Operation$LifecycleImpact;)V", OperatorName.CURVE_TO, "Landroidx/fragment/app/Fragment;", "getFragment", "()Landroidx/fragment/app/Fragment;", "", "d", "Ljava/util/List;", "completionListeners", "", "e", "Ljava/util/Set;", "specialEffectsSignals", "", "<set-?>", OperatorName.FILL_NON_ZERO, "Z", "isCanceled", "()Z", OperatorName.NON_STROKING_GRAY, "isComplete", "LifecycleImpact", "State", "fragment_release"}, m28849k = 1, m28848mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nSpecialEffectsController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpecialEffectsController.kt\nandroidx/fragment/app/SpecialEffectsController$Operation\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,710:1\n1855#2,2:711\n*S KotlinDebug\n*F\n+ 1 SpecialEffectsController.kt\nandroidx/fragment/app/SpecialEffectsController$Operation\n*L\n607#1:711,2\n*E\n"})
    /* loaded from: classes2.dex */
    public static class Operation {

        /* renamed from: a */
        public State f35613a;

        /* renamed from: b */
        public LifecycleImpact f35614b;

        /* renamed from: c */
        public final Fragment f35615c;

        /* renamed from: d */
        public final List f35616d;

        /* renamed from: e */
        public final Set f35617e;

        /* renamed from: f */
        public boolean f35618f;

        /* renamed from: g */
        public boolean f35619g;

        @Metadata(m28851d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m28850d2 = {"Landroidx/fragment/app/SpecialEffectsController$Operation$LifecycleImpact;", "", "(Ljava/lang/String;I)V", TopUpMixpanel.OFFER_NONE, "ADDING", "REMOVING", "fragment_release"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
        /* loaded from: classes2.dex */
        public enum LifecycleImpact {
            NONE,
            ADDING,
            REMOVING
        }

        @Metadata(m28851d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0080\u0001\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, m28850d2 = {"Landroidx/fragment/app/SpecialEffectsController$Operation$State;", "", "(Ljava/lang/String;I)V", "applyState", "", Promotion.ACTION_VIEW, "Landroid/view/View;", "REMOVED", "VISIBLE", "GONE", "INVISIBLE", "Companion", "fragment_release"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
        /* loaded from: classes2.dex */
        public enum State {
            REMOVED,
            VISIBLE,
            GONE,
            INVISIBLE;
            
            @NotNull
            public static final Companion Companion = new Companion(null);

            @Metadata(m28851d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\n\u0010\u0007\u001a\u00020\u0004*\u00020\b¨\u0006\t"}, m28850d2 = {"Landroidx/fragment/app/SpecialEffectsController$Operation$State$Companion;", "", "()V", "from", "Landroidx/fragment/app/SpecialEffectsController$Operation$State;", "visibility", "", "asOperationState", "Landroid/view/View;", "fragment_release"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
            /* loaded from: classes2.dex */
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                @NotNull
                public final State asOperationState(@NotNull View view) {
                    Intrinsics.checkNotNullParameter(view, "<this>");
                    if (view.getAlpha() == 0.0f && view.getVisibility() == 0) {
                        return State.INVISIBLE;
                    }
                    return from(view.getVisibility());
                }

                @JvmStatic
                @NotNull
                public final State from(int i) {
                    if (i != 0) {
                        if (i != 4) {
                            if (i == 8) {
                                return State.GONE;
                            }
                            throw new IllegalArgumentException("Unknown visibility " + i);
                        }
                        return State.INVISIBLE;
                    }
                    return State.VISIBLE;
                }

                public Companion() {
                }
            }

            @Metadata(m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
            /* loaded from: classes2.dex */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[State.values().length];
                    try {
                        iArr[State.REMOVED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[State.VISIBLE.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[State.GONE.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[State.INVISIBLE.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            @JvmStatic
            @NotNull
            public static final State from(int i) {
                return Companion.from(i);
            }

            public final void applyState(@NotNull View view) {
                ViewGroup viewGroup;
                Intrinsics.checkNotNullParameter(view, "view");
                int i = WhenMappings.$EnumSwitchMapping$0[ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i == 4) {
                                if (FragmentManager.isLoggingEnabled(2)) {
                                    StringBuilder sb = new StringBuilder();
                                    sb.append("SpecialEffectsController: Setting view ");
                                    sb.append(view);
                                    sb.append(" to INVISIBLE");
                                }
                                view.setVisibility(4);
                                return;
                            }
                            return;
                        }
                        if (FragmentManager.isLoggingEnabled(2)) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("SpecialEffectsController: Setting view ");
                            sb2.append(view);
                            sb2.append(" to GONE");
                        }
                        view.setVisibility(8);
                        return;
                    }
                    if (FragmentManager.isLoggingEnabled(2)) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("SpecialEffectsController: Setting view ");
                        sb3.append(view);
                        sb3.append(" to VISIBLE");
                    }
                    view.setVisibility(0);
                    return;
                }
                ViewParent parent = view.getParent();
                if (parent instanceof ViewGroup) {
                    viewGroup = (ViewGroup) parent;
                } else {
                    viewGroup = null;
                }
                if (viewGroup != null) {
                    if (FragmentManager.isLoggingEnabled(2)) {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("SpecialEffectsController: Removing view ");
                        sb4.append(view);
                        sb4.append(" from container ");
                        sb4.append(viewGroup);
                    }
                    viewGroup.removeView(view);
                }
            }
        }

        @Metadata(m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
        /* loaded from: classes2.dex */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[LifecycleImpact.values().length];
                try {
                    iArr[LifecycleImpact.ADDING.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[LifecycleImpact.REMOVING.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[LifecycleImpact.NONE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public Operation(@NotNull State finalState, @NotNull LifecycleImpact lifecycleImpact, @NotNull Fragment fragment, @NotNull CancellationSignal cancellationSignal) {
            Intrinsics.checkNotNullParameter(finalState, "finalState");
            Intrinsics.checkNotNullParameter(lifecycleImpact, "lifecycleImpact");
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            Intrinsics.checkNotNullParameter(cancellationSignal, "cancellationSignal");
            this.f35613a = finalState;
            this.f35614b = lifecycleImpact;
            this.f35615c = fragment;
            this.f35616d = new ArrayList();
            this.f35617e = new LinkedHashSet();
            cancellationSignal.setOnCancelListener(new CancellationSignal.OnCancelListener() { // from class: zK1
                {
                    SpecialEffectsController.Operation.this = this;
                }

                @Override // androidx.core.p005os.CancellationSignal.OnCancelListener
                public final void onCancel() {
                    SpecialEffectsController.Operation.m54286a(SpecialEffectsController.Operation.this);
                }
            });
        }

        /* renamed from: a */
        public static /* synthetic */ void m54286a(Operation operation) {
            m54285b(operation);
        }

        /* renamed from: b */
        public static final void m54285b(Operation this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this$0.cancel();
        }

        public final void addCompletionListener(@NotNull Runnable listener) {
            Intrinsics.checkNotNullParameter(listener, "listener");
            this.f35616d.add(listener);
        }

        public final void cancel() {
            if (this.f35618f) {
                return;
            }
            this.f35618f = true;
            if (this.f35617e.isEmpty()) {
                complete();
                return;
            }
            for (CancellationSignal cancellationSignal : CollectionsKt___CollectionsKt.toMutableSet(this.f35617e)) {
                cancellationSignal.cancel();
            }
        }

        @CallSuper
        public void complete() {
            if (this.f35619g) {
                return;
            }
            if (FragmentManager.isLoggingEnabled(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("SpecialEffectsController: ");
                sb.append(this);
                sb.append(" has called complete.");
            }
            this.f35619g = true;
            for (Runnable runnable : this.f35616d) {
                runnable.run();
            }
        }

        public final void completeSpecialEffect(@NotNull CancellationSignal signal) {
            Intrinsics.checkNotNullParameter(signal, "signal");
            if (this.f35617e.remove(signal) && this.f35617e.isEmpty()) {
                complete();
            }
        }

        @NotNull
        public final State getFinalState() {
            return this.f35613a;
        }

        @NotNull
        public final Fragment getFragment() {
            return this.f35615c;
        }

        @NotNull
        public final LifecycleImpact getLifecycleImpact() {
            return this.f35614b;
        }

        public final boolean isCanceled() {
            return this.f35618f;
        }

        public final boolean isComplete() {
            return this.f35619g;
        }

        public final void markStartedSpecialEffect(@NotNull CancellationSignal signal) {
            Intrinsics.checkNotNullParameter(signal, "signal");
            onStart();
            this.f35617e.add(signal);
        }

        public final void mergeWith(@NotNull State finalState, @NotNull LifecycleImpact lifecycleImpact) {
            Intrinsics.checkNotNullParameter(finalState, "finalState");
            Intrinsics.checkNotNullParameter(lifecycleImpact, "lifecycleImpact");
            int i = WhenMappings.$EnumSwitchMapping$0[lifecycleImpact.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i == 3 && this.f35613a != State.REMOVED) {
                        if (FragmentManager.isLoggingEnabled(2)) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("SpecialEffectsController: For fragment ");
                            sb.append(this.f35615c);
                            sb.append(" mFinalState = ");
                            sb.append(this.f35613a);
                            sb.append(" -> ");
                            sb.append(finalState);
                            sb.append('.');
                        }
                        this.f35613a = finalState;
                        return;
                    }
                    return;
                }
                if (FragmentManager.isLoggingEnabled(2)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("SpecialEffectsController: For fragment ");
                    sb2.append(this.f35615c);
                    sb2.append(" mFinalState = ");
                    sb2.append(this.f35613a);
                    sb2.append(" -> REMOVED. mLifecycleImpact  = ");
                    sb2.append(this.f35614b);
                    sb2.append(" to REMOVING.");
                }
                this.f35613a = State.REMOVED;
                this.f35614b = LifecycleImpact.REMOVING;
            } else if (this.f35613a == State.REMOVED) {
                if (FragmentManager.isLoggingEnabled(2)) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("SpecialEffectsController: For fragment ");
                    sb3.append(this.f35615c);
                    sb3.append(" mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = ");
                    sb3.append(this.f35614b);
                    sb3.append(" to ADDING.");
                }
                this.f35613a = State.VISIBLE;
                this.f35614b = LifecycleImpact.ADDING;
            }
        }

        public void onStart() {
        }

        public final void setFinalState(@NotNull State state) {
            Intrinsics.checkNotNullParameter(state, "<set-?>");
            this.f35613a = state;
        }

        public final void setLifecycleImpact(@NotNull LifecycleImpact lifecycleImpact) {
            Intrinsics.checkNotNullParameter(lifecycleImpact, "<set-?>");
            this.f35614b = lifecycleImpact;
        }

        @NotNull
        public String toString() {
            String hexString = Integer.toHexString(System.identityHashCode(this));
            return "Operation {" + hexString + "} {finalState = " + this.f35613a + " lifecycleImpact = " + this.f35614b + " fragment = " + this.f35615c + '}';
        }
    }

    @Metadata(m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* loaded from: classes2.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Operation.LifecycleImpact.values().length];
            try {
                iArr[Operation.LifecycleImpact.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* renamed from: androidx.fragment.app.SpecialEffectsController$a */
    /* loaded from: classes2.dex */
    public static final class C4614a extends Operation {

        /* renamed from: h */
        public final C4633j f35620h;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public C4614a(androidx.fragment.app.SpecialEffectsController.Operation.State r3, androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact r4, androidx.fragment.app.C4633j r5, androidx.core.p005os.CancellationSignal r6) {
            /*
                r2 = this;
                java.lang.String r0 = "finalState"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                java.lang.String r0 = "lifecycleImpact"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
                java.lang.String r0 = "fragmentStateManager"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
                java.lang.String r0 = "cancellationSignal"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
                androidx.fragment.app.Fragment r0 = r5.m54214k()
                java.lang.String r1 = "fragmentStateManager.fragment"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
                r2.<init>(r3, r4, r0, r6)
                r2.f35620h = r5
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.SpecialEffectsController.C4614a.<init>(androidx.fragment.app.SpecialEffectsController$Operation$State, androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact, androidx.fragment.app.j, androidx.core.os.CancellationSignal):void");
        }

        @Override // androidx.fragment.app.SpecialEffectsController.Operation
        public void complete() {
            super.complete();
            this.f35620h.m54212m();
        }

        @Override // androidx.fragment.app.SpecialEffectsController.Operation
        public void onStart() {
            if (getLifecycleImpact() == Operation.LifecycleImpact.ADDING) {
                Fragment m54214k = this.f35620h.m54214k();
                Intrinsics.checkNotNullExpressionValue(m54214k, "fragmentStateManager.fragment");
                View findFocus = m54214k.mView.findFocus();
                if (findFocus != null) {
                    m54214k.setFocusedView(findFocus);
                    if (FragmentManager.isLoggingEnabled(2)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("requestFocus: Saved focused view ");
                        sb.append(findFocus);
                        sb.append(" for Fragment ");
                        sb.append(m54214k);
                    }
                }
                View requireView = getFragment().requireView();
                Intrinsics.checkNotNullExpressionValue(requireView, "this.fragment.requireView()");
                if (requireView.getParent() == null) {
                    this.f35620h.m54223b();
                    requireView.setAlpha(0.0f);
                }
                if (requireView.getAlpha() == 0.0f && requireView.getVisibility() == 0) {
                    requireView.setVisibility(4);
                }
                requireView.setAlpha(m54214k.getPostOnViewCreatedAlpha());
            } else if (getLifecycleImpact() == Operation.LifecycleImpact.REMOVING) {
                Fragment m54214k2 = this.f35620h.m54214k();
                Intrinsics.checkNotNullExpressionValue(m54214k2, "fragmentStateManager.fragment");
                View requireView2 = m54214k2.requireView();
                Intrinsics.checkNotNullExpressionValue(requireView2, "fragment.requireView()");
                if (FragmentManager.isLoggingEnabled(2)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Clearing focus ");
                    sb2.append(requireView2.findFocus());
                    sb2.append(" on view ");
                    sb2.append(requireView2);
                    sb2.append(" for Fragment ");
                    sb2.append(m54214k2);
                }
                requireView2.clearFocus();
            }
        }
    }

    public SpecialEffectsController(@NotNull ViewGroup container) {
        Intrinsics.checkNotNullParameter(container, "container");
        this.f35608a = container;
        this.f35609b = new ArrayList();
        this.f35610c = new ArrayList();
    }

    /* renamed from: a */
    public static /* synthetic */ void m54294a(SpecialEffectsController specialEffectsController, C4614a c4614a) {
        m54291d(specialEffectsController, c4614a);
    }

    /* renamed from: b */
    public static /* synthetic */ void m54293b(SpecialEffectsController specialEffectsController, C4614a c4614a) {
        m54290e(specialEffectsController, c4614a);
    }

    /* renamed from: d */
    public static final void m54291d(SpecialEffectsController this$0, C4614a operation) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(operation, "$operation");
        if (this$0.f35609b.contains(operation)) {
            Operation.State finalState = operation.getFinalState();
            View view = operation.getFragment().mView;
            Intrinsics.checkNotNullExpressionValue(view, "operation.fragment.mView");
            finalState.applyState(view);
        }
    }

    /* renamed from: e */
    public static final void m54290e(SpecialEffectsController this$0, C4614a operation) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(operation, "$operation");
        this$0.f35609b.remove(operation);
        this$0.f35610c.remove(operation);
    }

    @JvmStatic
    @NotNull
    public static final SpecialEffectsController getOrCreateController(@NotNull ViewGroup viewGroup, @NotNull AK1 ak1) {
        return Companion.getOrCreateController(viewGroup, ak1);
    }

    /* renamed from: c */
    public final void m54292c(Operation.State state, Operation.LifecycleImpact lifecycleImpact, C4633j c4633j) {
        synchronized (this.f35609b) {
            CancellationSignal cancellationSignal = new CancellationSignal();
            Fragment m54214k = c4633j.m54214k();
            Intrinsics.checkNotNullExpressionValue(m54214k, "fragmentStateManager.fragment");
            Operation m54289f = m54289f(m54214k);
            if (m54289f != null) {
                m54289f.mergeWith(state, lifecycleImpact);
                return;
            }
            final C4614a c4614a = new C4614a(state, lifecycleImpact, c4633j, cancellationSignal);
            this.f35609b.add(c4614a);
            c4614a.addCompletionListener(new Runnable() { // from class: xK1
                {
                    SpecialEffectsController.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    SpecialEffectsController.m54294a(SpecialEffectsController.this, c4614a);
                }
            });
            c4614a.addCompletionListener(new Runnable() { // from class: yK1
                {
                    SpecialEffectsController.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    SpecialEffectsController.m54293b(SpecialEffectsController.this, c4614a);
                }
            });
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void enqueueAdd(@NotNull Operation.State finalState, @NotNull C4633j fragmentStateManager) {
        Intrinsics.checkNotNullParameter(finalState, "finalState");
        Intrinsics.checkNotNullParameter(fragmentStateManager, "fragmentStateManager");
        if (FragmentManager.isLoggingEnabled(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("SpecialEffectsController: Enqueuing add operation for fragment ");
            sb.append(fragmentStateManager.m54214k());
        }
        m54292c(finalState, Operation.LifecycleImpact.ADDING, fragmentStateManager);
    }

    public final void enqueueHide(@NotNull C4633j fragmentStateManager) {
        Intrinsics.checkNotNullParameter(fragmentStateManager, "fragmentStateManager");
        if (FragmentManager.isLoggingEnabled(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("SpecialEffectsController: Enqueuing hide operation for fragment ");
            sb.append(fragmentStateManager.m54214k());
        }
        m54292c(Operation.State.GONE, Operation.LifecycleImpact.NONE, fragmentStateManager);
    }

    public final void enqueueRemove(@NotNull C4633j fragmentStateManager) {
        Intrinsics.checkNotNullParameter(fragmentStateManager, "fragmentStateManager");
        if (FragmentManager.isLoggingEnabled(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("SpecialEffectsController: Enqueuing remove operation for fragment ");
            sb.append(fragmentStateManager.m54214k());
        }
        m54292c(Operation.State.REMOVED, Operation.LifecycleImpact.REMOVING, fragmentStateManager);
    }

    public final void enqueueShow(@NotNull C4633j fragmentStateManager) {
        Intrinsics.checkNotNullParameter(fragmentStateManager, "fragmentStateManager");
        if (FragmentManager.isLoggingEnabled(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("SpecialEffectsController: Enqueuing show operation for fragment ");
            sb.append(fragmentStateManager.m54214k());
        }
        m54292c(Operation.State.VISIBLE, Operation.LifecycleImpact.NONE, fragmentStateManager);
    }

    public abstract void executeOperations(@NotNull List<Operation> list, boolean z);

    public final void executePendingOperations() {
        if (this.f35612e) {
            return;
        }
        if (!ViewCompat.isAttachedToWindow(this.f35608a)) {
            forceCompleteAllOperations();
            this.f35611d = false;
            return;
        }
        synchronized (this.f35609b) {
            try {
                if (!this.f35609b.isEmpty()) {
                    List<Operation> mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) this.f35610c);
                    this.f35610c.clear();
                    for (Operation operation : mutableList) {
                        if (FragmentManager.isLoggingEnabled(2)) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("SpecialEffectsController: Cancelling operation ");
                            sb.append(operation);
                        }
                        operation.cancel();
                        if (!operation.isComplete()) {
                            this.f35610c.add(operation);
                        }
                    }
                    m54287h();
                    List<Operation> mutableList2 = CollectionsKt___CollectionsKt.toMutableList((Collection) this.f35609b);
                    this.f35609b.clear();
                    this.f35610c.addAll(mutableList2);
                    FragmentManager.isLoggingEnabled(2);
                    for (Operation operation2 : mutableList2) {
                        operation2.onStart();
                    }
                    executeOperations(mutableList2, this.f35611d);
                    this.f35611d = false;
                    FragmentManager.isLoggingEnabled(2);
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: f */
    public final Operation m54289f(Fragment fragment) {
        Object obj;
        Iterator it = this.f35609b.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                Operation operation = (Operation) obj;
                if (Intrinsics.areEqual(operation.getFragment(), fragment) && !operation.isCanceled()) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        return (Operation) obj;
    }

    public final void forceCompleteAllOperations() {
        String str;
        String str2;
        FragmentManager.isLoggingEnabled(2);
        boolean isAttachedToWindow = ViewCompat.isAttachedToWindow(this.f35608a);
        synchronized (this.f35609b) {
            try {
                m54287h();
                for (Operation operation : this.f35609b) {
                    operation.onStart();
                }
                for (Operation operation2 : CollectionsKt___CollectionsKt.toMutableList((Collection) this.f35610c)) {
                    if (FragmentManager.isLoggingEnabled(2)) {
                        if (isAttachedToWindow) {
                            str2 = "";
                        } else {
                            str2 = "Container " + this.f35608a + " is not attached to window. ";
                        }
                        StringBuilder sb = new StringBuilder();
                        sb.append("SpecialEffectsController: ");
                        sb.append(str2);
                        sb.append("Cancelling running operation ");
                        sb.append(operation2);
                    }
                    operation2.cancel();
                }
                for (Operation operation3 : CollectionsKt___CollectionsKt.toMutableList((Collection) this.f35609b)) {
                    if (FragmentManager.isLoggingEnabled(2)) {
                        if (isAttachedToWindow) {
                            str = "";
                        } else {
                            str = "Container " + this.f35608a + " is not attached to window. ";
                        }
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("SpecialEffectsController: ");
                        sb2.append(str);
                        sb2.append("Cancelling pending operation ");
                        sb2.append(operation3);
                    }
                    operation3.cancel();
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void forcePostponedExecutePendingOperations() {
        if (this.f35612e) {
            FragmentManager.isLoggingEnabled(2);
            this.f35612e = false;
            executePendingOperations();
        }
    }

    /* renamed from: g */
    public final Operation m54288g(Fragment fragment) {
        Object obj;
        Iterator it = this.f35610c.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                Operation operation = (Operation) obj;
                if (Intrinsics.areEqual(operation.getFragment(), fragment) && !operation.isCanceled()) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        return (Operation) obj;
    }

    @Nullable
    public final Operation.LifecycleImpact getAwaitingCompletionLifecycleImpact(@NotNull C4633j fragmentStateManager) {
        Operation.LifecycleImpact lifecycleImpact;
        int i;
        Intrinsics.checkNotNullParameter(fragmentStateManager, "fragmentStateManager");
        Fragment m54214k = fragmentStateManager.m54214k();
        Intrinsics.checkNotNullExpressionValue(m54214k, "fragmentStateManager.fragment");
        Operation m54289f = m54289f(m54214k);
        Operation.LifecycleImpact lifecycleImpact2 = null;
        if (m54289f != null) {
            lifecycleImpact = m54289f.getLifecycleImpact();
        } else {
            lifecycleImpact = null;
        }
        Operation m54288g = m54288g(m54214k);
        if (m54288g != null) {
            lifecycleImpact2 = m54288g.getLifecycleImpact();
        }
        if (lifecycleImpact == null) {
            i = -1;
        } else {
            i = WhenMappings.$EnumSwitchMapping$0[lifecycleImpact.ordinal()];
        }
        if (i == -1 || i == 1) {
            return lifecycleImpact2;
        }
        return lifecycleImpact;
    }

    @NotNull
    public final ViewGroup getContainer() {
        return this.f35608a;
    }

    /* renamed from: h */
    public final void m54287h() {
        for (Operation operation : this.f35609b) {
            if (operation.getLifecycleImpact() == Operation.LifecycleImpact.ADDING) {
                View requireView = operation.getFragment().requireView();
                Intrinsics.checkNotNullExpressionValue(requireView, "fragment.requireView()");
                operation.mergeWith(Operation.State.Companion.from(requireView.getVisibility()), Operation.LifecycleImpact.NONE);
            }
        }
    }

    public final void markPostponedState() {
        Fragment fragment;
        Object obj;
        boolean z;
        synchronized (this.f35609b) {
            try {
                m54287h();
                List list = this.f35609b;
                ListIterator listIterator = list.listIterator(list.size());
                while (true) {
                    fragment = null;
                    if (listIterator.hasPrevious()) {
                        obj = listIterator.previous();
                        Operation operation = (Operation) obj;
                        Operation.State.Companion companion = Operation.State.Companion;
                        View view = operation.getFragment().mView;
                        Intrinsics.checkNotNullExpressionValue(view, "operation.fragment.mView");
                        Operation.State asOperationState = companion.asOperationState(view);
                        Operation.State finalState = operation.getFinalState();
                        Operation.State state = Operation.State.VISIBLE;
                        if (finalState == state && asOperationState != state) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                Operation operation2 = (Operation) obj;
                if (operation2 != null) {
                    fragment = operation2.getFragment();
                }
                if (fragment != null) {
                    z = fragment.isPostponed();
                } else {
                    z = false;
                }
                this.f35612e = z;
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void updateOperationDirection(boolean z) {
        this.f35611d = z;
    }

    @JvmStatic
    @NotNull
    public static final SpecialEffectsController getOrCreateController(@NotNull ViewGroup viewGroup, @NotNull FragmentManager fragmentManager) {
        return Companion.getOrCreateController(viewGroup, fragmentManager);
    }
}
