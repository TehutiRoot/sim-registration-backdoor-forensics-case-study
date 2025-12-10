package androidx.databinding;

import androidx.annotation.RestrictTo;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.ViewDataBindingKtx;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.util.Constant;

@Metadata(m28851d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\u0011B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\t\u001a\b\u0012\u0002\b\u0003\u0018\u00010\bH\u0007¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, m28850d2 = {"Landroidx/databinding/ViewDataBindingKtx;", "", "<init>", "()V", "Landroidx/databinding/ViewDataBinding;", "viewDataBinding", "", "localFieldId", "Lkotlinx/coroutines/flow/Flow;", "observable", "", "updateStateFlowRegistration", "(Landroidx/databinding/ViewDataBinding;ILkotlinx/coroutines/flow/Flow;)Z", "LLz;", PDPageLabelRange.STYLE_LETTERS_LOWER, "LLz;", "CREATE_STATE_FLOW_LISTENER", "StateFlowListener", "databindingKtx_release"}, m28849k = 1, m28848mv = {1, 9, 0})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes2.dex */
public final class ViewDataBindingKtx {
    @NotNull
    public static final ViewDataBindingKtx INSTANCE = new ViewDataBindingKtx();

    /* renamed from: a */
    public static final InterfaceC0838Lz f34534a = new InterfaceC0838Lz() { // from class: r22
        @Override // p000.InterfaceC0838Lz
        /* renamed from: a */
        public final O32 mo23372a(ViewDataBinding viewDataBinding, int i, ReferenceQueue referenceQueue) {
            return ViewDataBindingKtx.m56303a(viewDataBinding, i, referenceQueue);
        }
    };

    @Metadata(m28851d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00020\u0001B'\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\b¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\r\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0011\u001a\u00020\u00102\u0010\u0010\u000f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0013\u001a\u00020\u00102\u0010\u0010\u000f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0012J\u0019\u0010\u0016\u001a\u00020\u00102\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J'\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u00142\u000e\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H\u0002¢\u0006\u0004\b\u001a\u0010\u001bR\u001e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001dR\u0018\u0010\"\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\"\u0010%\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006&"}, m28850d2 = {"Landroidx/databinding/ViewDataBindingKtx$StateFlowListener;", "LdK0;", "Lkotlinx/coroutines/flow/Flow;", "", "Landroidx/databinding/ViewDataBinding;", "binder", "", "localFieldId", "Ljava/lang/ref/ReferenceQueue;", "referenceQueue", "<init>", "(Landroidx/databinding/ViewDataBinding;ILjava/lang/ref/ReferenceQueue;)V", "LO32;", "getListener", "()LO32;", TypedValues.AttributesType.S_TARGET, "", "addListener", "(Lkotlinx/coroutines/flow/Flow;)V", "removeListener", "Landroidx/lifecycle/LifecycleOwner;", "lifecycleOwner", "setLifecycleOwner", "(Landroidx/lifecycle/LifecycleOwner;)V", Constant.REGISTER_LEVEL_OWNER, "flow", PDPageLabelRange.STYLE_LETTERS_LOWER, "(Landroidx/lifecycle/LifecycleOwner;Lkotlinx/coroutines/flow/Flow;)V", "Ljava/lang/ref/WeakReference;", "Ljava/lang/ref/WeakReference;", "_lifecycleOwnerRef", "Lkotlinx/coroutines/Job;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lkotlinx/coroutines/Job;", "observerJob", OperatorName.CURVE_TO, "LO32;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "databindingKtx_release"}, m28849k = 1, m28848mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    public static final class StateFlowListener implements InterfaceC19507dK0 {

        /* renamed from: a */
        public WeakReference f34535a;

        /* renamed from: b */
        public Job f34536b;

        /* renamed from: c */
        public final O32 f34537c;

        public StateFlowListener(@Nullable ViewDataBinding viewDataBinding, int i, @NotNull ReferenceQueue<ViewDataBinding> referenceQueue) {
            Intrinsics.checkNotNullParameter(referenceQueue, "referenceQueue");
            this.f34537c = new O32(viewDataBinding, i, this, referenceQueue);
        }

        /* renamed from: a */
        public final void m56301a(LifecycleOwner lifecycleOwner, Flow flow) {
            Job m65753e;
            Job job = this.f34536b;
            if (job != null) {
                Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
            }
            m65753e = AbstractC1552Vc.m65753e(LifecycleOwnerKt.getLifecycleScope(lifecycleOwner), null, null, new ViewDataBindingKtx$StateFlowListener$startCollection$1(lifecycleOwner, flow, this, null), 3, null);
            this.f34536b = m65753e;
        }

        @NotNull
        public O32 getListener() {
            return this.f34537c;
        }

        @Override // p000.InterfaceC19507dK0
        public void setLifecycleOwner(@Nullable LifecycleOwner lifecycleOwner) {
            LifecycleOwner lifecycleOwner2;
            WeakReference weakReference = this.f34535a;
            if (weakReference != null) {
                lifecycleOwner2 = (LifecycleOwner) weakReference.get();
            } else {
                lifecycleOwner2 = null;
            }
            if (lifecycleOwner2 == lifecycleOwner) {
                return;
            }
            Job job = this.f34536b;
            if (job != null) {
                Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
            }
            if (lifecycleOwner == null) {
                this.f34535a = null;
                return;
            }
            this.f34535a = new WeakReference(lifecycleOwner);
            Flow flow = (Flow) this.f34537c.m67134b();
            if (flow != null) {
                m56301a(lifecycleOwner, flow);
            }
        }

        @Override // p000.InterfaceC19507dK0
        public void addListener(@Nullable Flow<? extends Object> flow) {
            LifecycleOwner lifecycleOwner;
            WeakReference weakReference = this.f34535a;
            if (weakReference == null || (lifecycleOwner = (LifecycleOwner) weakReference.get()) == null || flow == null) {
                return;
            }
            m56301a(lifecycleOwner, flow);
        }

        @Override // p000.InterfaceC19507dK0
        public void removeListener(@Nullable Flow<? extends Object> flow) {
            Job job = this.f34536b;
            if (job != null) {
                Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
            }
            this.f34536b = null;
        }
    }

    /* renamed from: a */
    public static /* synthetic */ O32 m56303a(ViewDataBinding viewDataBinding, int i, ReferenceQueue referenceQueue) {
        return m56302b(viewDataBinding, i, referenceQueue);
    }

    /* renamed from: b */
    public static final O32 m56302b(ViewDataBinding viewDataBinding, int i, ReferenceQueue referenceQueue) {
        Intrinsics.checkNotNull(referenceQueue);
        return new StateFlowListener(viewDataBinding, i, referenceQueue).getListener();
    }

    @JvmStatic
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final boolean updateStateFlowRegistration(@NotNull ViewDataBinding viewDataBinding, int i, @Nullable Flow<?> flow) {
        Intrinsics.checkNotNullParameter(viewDataBinding, "viewDataBinding");
        viewDataBinding.mInStateFlowRegisterObserver = true;
        try {
            return viewDataBinding.updateRegistration(i, flow, f34534a);
        } finally {
            viewDataBinding.mInStateFlowRegisterObserver = false;
        }
    }
}
