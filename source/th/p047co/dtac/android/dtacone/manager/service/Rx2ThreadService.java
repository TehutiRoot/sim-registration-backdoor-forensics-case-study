package th.p047co.dtac.android.dtacone.manager.service;

import androidx.compose.runtime.internal.StabilityInferred;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import io.reactivex.Completable;
import io.reactivex.CompletableSource;
import io.reactivex.CompletableTransformer;
import io.reactivex.Flowable;
import io.reactivex.FlowableTransformer;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.Scheduler;
import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.SingleTransformer;
import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.reactivestreams.Publisher;
import th.p047co.dtac.android.dtacone.configuration.ThreadingModule;
import th.p047co.dtac.android.dtacone.manager.service.Rx2ThreadService;

@StabilityInferred(parameters = 0)
@Singleton
@Metadata(m28851d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\t\"\u0004\b\u0000\u0010\b¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u000f\"\u0004\b\u0000\u0010\b¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u000f\"\u0004\b\u0000\u0010\b¢\u0006\u0004\b\u0012\u0010\u0011J\u001f\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u0013\"\u0004\b\u0000\u0010\b¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u0013\"\u0004\b\u0000\u0010\b¢\u0006\u0004\b\u0016\u0010\u0015J\u001f\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u0013\"\u0004\b\u0000\u0010\b¢\u0006\u0004\b\u0017\u0010\u0015J\u001f\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u0013\"\u0004\b\u0000\u0010\b¢\u0006\u0004\b\u0018\u0010\u0015J\u001f\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\t\"\u0004\b\u0000\u0010\b¢\u0006\u0004\b\u0019\u0010\u000bJ\u001f\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\t\"\u0004\b\u0000\u0010\b¢\u0006\u0004\b\u001a\u0010\u000bJ\u001f\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\t\"\u0004\b\u0000\u0010\b¢\u0006\u0004\b\u001b\u0010\u000bJ\u001f\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\t\"\u0004\b\u0000\u0010\b¢\u0006\u0004\b\u001c\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u001e¨\u0006!"}, m28850d2 = {"Lth/co/dtac/android/dtacone/manager/service/Rx2ThreadService;", "", "Lio/reactivex/Scheduler;", ThreadingModule.MAIN_THREAD, ThreadingModule.IO_THREAD, "computation", "<init>", "(Lio/reactivex/Scheduler;Lio/reactivex/Scheduler;Lio/reactivex/Scheduler;)V", "T", "Lio/reactivex/ObservableTransformer;", "applyAsync", "()Lio/reactivex/ObservableTransformer;", "Lio/reactivex/CompletableTransformer;", "applyCompletableAsync", "()Lio/reactivex/CompletableTransformer;", "Lio/reactivex/SingleTransformer;", "applySingleAsync", "()Lio/reactivex/SingleTransformer;", "applySingleBackground", "Lio/reactivex/FlowableTransformer;", "applyFlowableAsync", "()Lio/reactivex/FlowableTransformer;", "applyFlowableBackground", "applyFlowableComputation", "applyFlowableComputationOnly", "applySyncMain", "applyBackground", "applyComputation", "applyMain", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lio/reactivex/Scheduler;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, OperatorName.CURVE_TO, "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.manager.service.Rx2ThreadService */
/* loaded from: classes7.dex */
public final class Rx2ThreadService {
    public static final int $stable = 8;

    /* renamed from: a */
    public final Scheduler f85008a;

    /* renamed from: b */
    public final Scheduler f85009b;

    /* renamed from: c */
    public final Scheduler f85010c;

    @Inject
    public Rx2ThreadService(@Named("Rx2main") @NotNull Scheduler main, @Named("Rx2io") @NotNull Scheduler io2, @Named("Rx2comp") @NotNull Scheduler computation) {
        Intrinsics.checkNotNullParameter(main, "main");
        Intrinsics.checkNotNullParameter(io2, "io");
        Intrinsics.checkNotNullParameter(computation, "computation");
        this.f85008a = main;
        this.f85009b = io2;
        this.f85010c = computation;
    }

    /* renamed from: m */
    public static final ObservableSource m19193m(Rx2ThreadService this$0, Observable it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        return it.subscribeOn(this$0.f85009b).observeOn(this$0.f85008a);
    }

    /* renamed from: n */
    public static final ObservableSource m19192n(Rx2ThreadService this$0, Observable it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        return it.subscribeOn(this$0.f85009b);
    }

    /* renamed from: o */
    public static final CompletableSource m19191o(Rx2ThreadService this$0, Completable it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        return it.subscribeOn(this$0.f85009b).observeOn(this$0.f85008a);
    }

    /* renamed from: p */
    public static final ObservableSource m19190p(Rx2ThreadService this$0, Observable it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        return it.subscribeOn(this$0.f85010c).observeOn(this$0.f85008a);
    }

    /* renamed from: q */
    public static final Publisher m19189q(Rx2ThreadService this$0, Flowable it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        return it.subscribeOn(this$0.f85009b).observeOn(this$0.f85008a);
    }

    /* renamed from: r */
    public static final Publisher m19188r(Rx2ThreadService this$0, Flowable it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        return it.subscribeOn(this$0.f85009b);
    }

    /* renamed from: s */
    public static final Publisher m19187s(Rx2ThreadService this$0, Flowable it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        return it.subscribeOn(this$0.f85010c).observeOn(this$0.f85008a);
    }

    /* renamed from: t */
    public static final Publisher m19186t(Rx2ThreadService this$0, Flowable it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        return it.subscribeOn(this$0.f85010c);
    }

    /* renamed from: u */
    public static final ObservableSource m19185u(Rx2ThreadService this$0, Observable it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        return it.observeOn(this$0.f85008a);
    }

    /* renamed from: v */
    public static final SingleSource m19184v(Rx2ThreadService this$0, Single it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        return it.subscribeOn(this$0.f85009b).observeOn(this$0.f85008a);
    }

    /* renamed from: w */
    public static final SingleSource m19183w(Rx2ThreadService this$0, Single it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        return it.subscribeOn(this$0.f85009b);
    }

    /* renamed from: x */
    public static final ObservableSource m19182x(Rx2ThreadService this$0, Observable it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        return it.subscribeOn(this$0.f85008a).observeOn(this$0.f85008a);
    }

    @NotNull
    public final <T> ObservableTransformer<T, T> applyAsync() {
        return new ObservableTransformer() { // from class: zA1
            @Override // io.reactivex.ObservableTransformer
            public final ObservableSource apply(Observable observable) {
                ObservableSource m19193m;
                m19193m = Rx2ThreadService.m19193m(Rx2ThreadService.this, observable);
                return m19193m;
            }
        };
    }

    @NotNull
    public final <T> ObservableTransformer<T, T> applyBackground() {
        return new ObservableTransformer() { // from class: sA1
            @Override // io.reactivex.ObservableTransformer
            public final ObservableSource apply(Observable observable) {
                ObservableSource m19192n;
                m19192n = Rx2ThreadService.m19192n(Rx2ThreadService.this, observable);
                return m19192n;
            }
        };
    }

    @NotNull
    public final CompletableTransformer applyCompletableAsync() {
        return new CompletableTransformer() { // from class: yA1
            @Override // io.reactivex.CompletableTransformer
            public final CompletableSource apply(Completable completable) {
                CompletableSource m19191o;
                m19191o = Rx2ThreadService.m19191o(Rx2ThreadService.this, completable);
                return m19191o;
            }
        };
    }

    @NotNull
    public final <T> ObservableTransformer<T, T> applyComputation() {
        return new ObservableTransformer() { // from class: CA1
            @Override // io.reactivex.ObservableTransformer
            public final ObservableSource apply(Observable observable) {
                ObservableSource m19190p;
                m19190p = Rx2ThreadService.m19190p(Rx2ThreadService.this, observable);
                return m19190p;
            }
        };
    }

    @NotNull
    public final <T> FlowableTransformer<T, T> applyFlowableAsync() {
        return new FlowableTransformer() { // from class: tA1
            @Override // io.reactivex.FlowableTransformer
            public final Publisher apply(Flowable flowable) {
                Publisher m19189q;
                m19189q = Rx2ThreadService.m19189q(Rx2ThreadService.this, flowable);
                return m19189q;
            }
        };
    }

    @NotNull
    public final <T> FlowableTransformer<T, T> applyFlowableBackground() {
        return new FlowableTransformer() { // from class: BA1
            @Override // io.reactivex.FlowableTransformer
            public final Publisher apply(Flowable flowable) {
                Publisher m19188r;
                m19188r = Rx2ThreadService.m19188r(Rx2ThreadService.this, flowable);
                return m19188r;
            }
        };
    }

    @NotNull
    public final <T> FlowableTransformer<T, T> applyFlowableComputation() {
        return new FlowableTransformer() { // from class: uA1
            @Override // io.reactivex.FlowableTransformer
            public final Publisher apply(Flowable flowable) {
                Publisher m19187s;
                m19187s = Rx2ThreadService.m19187s(Rx2ThreadService.this, flowable);
                return m19187s;
            }
        };
    }

    @NotNull
    public final <T> FlowableTransformer<T, T> applyFlowableComputationOnly() {
        return new FlowableTransformer() { // from class: DA1
            @Override // io.reactivex.FlowableTransformer
            public final Publisher apply(Flowable flowable) {
                Publisher m19186t;
                m19186t = Rx2ThreadService.m19186t(Rx2ThreadService.this, flowable);
                return m19186t;
            }
        };
    }

    @NotNull
    public final <T> ObservableTransformer<T, T> applyMain() {
        return new ObservableTransformer() { // from class: vA1
            @Override // io.reactivex.ObservableTransformer
            public final ObservableSource apply(Observable observable) {
                ObservableSource m19185u;
                m19185u = Rx2ThreadService.m19185u(Rx2ThreadService.this, observable);
                return m19185u;
            }
        };
    }

    @NotNull
    public final <T> SingleTransformer<T, T> applySingleAsync() {
        return new SingleTransformer() { // from class: AA1
            @Override // io.reactivex.SingleTransformer
            public final SingleSource apply(Single single) {
                SingleSource m19184v;
                m19184v = Rx2ThreadService.m19184v(Rx2ThreadService.this, single);
                return m19184v;
            }
        };
    }

    @NotNull
    public final <T> SingleTransformer<T, T> applySingleBackground() {
        return new SingleTransformer() { // from class: xA1
            @Override // io.reactivex.SingleTransformer
            public final SingleSource apply(Single single) {
                SingleSource m19183w;
                m19183w = Rx2ThreadService.m19183w(Rx2ThreadService.this, single);
                return m19183w;
            }
        };
    }

    @NotNull
    public final <T> ObservableTransformer<T, T> applySyncMain() {
        return new ObservableTransformer() { // from class: wA1
            @Override // io.reactivex.ObservableTransformer
            public final ObservableSource apply(Observable observable) {
                ObservableSource m19182x;
                m19182x = Rx2ThreadService.m19182x(Rx2ThreadService.this, observable);
                return m19182x;
            }
        };
    }
}
