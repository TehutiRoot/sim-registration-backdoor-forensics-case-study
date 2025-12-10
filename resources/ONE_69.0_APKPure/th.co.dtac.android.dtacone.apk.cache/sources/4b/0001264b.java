package th.p047co.dtac.android.dtacone.p051rx;

import androidx.compose.runtime.internal.StabilityInferred;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p046rx.Observable;
import p046rx.functions.Func1;
import th.p047co.dtac.android.dtacone.p051rx.RxComposeFunction;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\u0005\"\u0004\b\u0000\u0010\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\tH\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005H\u0007¢\u0006\u0004\b\f\u0010\bJ!\u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\u0005\"\u0004\b\u0000\u0010\u0004H\u0007¢\u0006\u0004\b\r\u0010\bJ+\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u0005\"\u0004\b\u0000\u0010\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u000eH\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005H\u0007¢\u0006\u0004\b\u0012\u0010\bJ!\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u0005\"\u0004\b\u0000\u0010\u0004H\u0007¢\u0006\u0004\b\u0013\u0010\b¨\u0006\u0014"}, m29142d2 = {"Lth/co/dtac/android/dtacone/rx/RxComposeFunction;", "", "<init>", "()V", "T", "Lio/reactivex/ObservableTransformer;", "", "applyTyping4Digit", "()Lio/reactivex/ObservableTransformer;", "Lrx/Observable$Transformer;", "applyPhoneNumberInternationalFormat", "()Lrx/Observable$Transformer;", "applyPhoneNumberInternationalFormatRx2", "applyPhoneNumber", "", "timeout", OperatorName.SET_LINE_WIDTH, "(J)Lio/reactivex/ObservableTransformer;", "applyCardExpired", "applyClick", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.rx.RxComposeFunction */
/* loaded from: classes8.dex */
public final class RxComposeFunction {
    public static final int $stable = 0;
    @NotNull
    public static final RxComposeFunction INSTANCE = new RxComposeFunction();

    /* renamed from: A */
    public static final String m16877A(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (String) tmp0.invoke(obj);
    }

    /* renamed from: B */
    public static final boolean m16876B(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: C */
    public static final Observable m16875C(Observable observable) {
        final RxComposeFunction$applyPhoneNumberInternationalFormat$1$1 rxComposeFunction$applyPhoneNumberInternationalFormat$1$1 = RxComposeFunction$applyPhoneNumberInternationalFormat$1$1.INSTANCE;
        return observable.map(new Func1() { // from class: ZB1
            @Override // p046rx.functions.Func1
            public final Object call(Object obj) {
                return RxComposeFunction.m16854n(Function1.this, obj);
            }
        });
    }

    /* renamed from: D */
    public static final String m16874D(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (String) tmp0.invoke(obj);
    }

    /* renamed from: E */
    public static final ObservableSource m16873E(io.reactivex.Observable observable) {
        Intrinsics.checkNotNullParameter(observable, "observable");
        final RxComposeFunction$applyPhoneNumberInternationalFormatRx2$1$1 rxComposeFunction$applyPhoneNumberInternationalFormatRx2$1$1 = RxComposeFunction$applyPhoneNumberInternationalFormatRx2$1$1.INSTANCE;
        return observable.map(new Function() { // from class: fC1
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return RxComposeFunction.m16862f(Function1.this, obj);
            }
        });
    }

    /* renamed from: F */
    public static final String m16872F(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (String) tmp0.invoke(obj);
    }

    /* renamed from: G */
    public static final ObservableSource m16871G(io.reactivex.Observable observable) {
        Intrinsics.checkNotNullParameter(observable, "observable");
        final RxComposeFunction$applyTyping4Digit$1$1 rxComposeFunction$applyTyping4Digit$1$1 = RxComposeFunction$applyTyping4Digit$1$1.INSTANCE;
        io.reactivex.Observable compose = observable.switchMap(new Function() { // from class: UB1
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return RxComposeFunction.m16852p(Function1.this, obj);
            }
        }).compose(m16844x(0L, 1, null));
        final RxComposeFunction$applyTyping4Digit$1$2 rxComposeFunction$applyTyping4Digit$1$2 = RxComposeFunction$applyTyping4Digit$1$2.INSTANCE;
        io.reactivex.Observable map = compose.map(new Function() { // from class: VB1
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return RxComposeFunction.m16857k(Function1.this, obj);
            }
        });
        final RxComposeFunction$applyTyping4Digit$1$3 rxComposeFunction$applyTyping4Digit$1$3 = RxComposeFunction$applyTyping4Digit$1$3.INSTANCE;
        return map.filter(new Predicate() { // from class: WB1
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Object obj) {
                return RxComposeFunction.m16851q(Function1.this, obj);
            }
        }).observeOn(AndroidSchedulers.mainThread());
    }

    /* renamed from: H */
    public static final ObservableSource m16870H(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (ObservableSource) tmp0.invoke(obj);
    }

    /* renamed from: I */
    public static final String m16869I(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (String) tmp0.invoke(obj);
    }

    /* renamed from: J */
    public static final boolean m16868J(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: a */
    public static /* synthetic */ String m16867a(Function1 function1, Object obj) {
        return m16847u(function1, obj);
    }

    @JvmStatic
    @NotNull
    public static final ObservableTransformer<String, String> applyCardExpired() {
        return new ObservableTransformer() { // from class: eC1
            @Override // io.reactivex.ObservableTransformer
            public final ObservableSource apply(io.reactivex.Observable observable) {
                return RxComposeFunction.m16864d(observable);
            }
        };
    }

    @JvmStatic
    @NotNull
    public static final <T> ObservableTransformer<T, T> applyClick() {
        return new ObservableTransformer() { // from class: aC1
            @Override // io.reactivex.ObservableTransformer
            public final ObservableSource apply(io.reactivex.Observable observable) {
                return RxComposeFunction.m16859i(observable);
            }
        };
    }

    @JvmStatic
    @NotNull
    public static final <T> ObservableTransformer<T, String> applyPhoneNumber() {
        return new ObservableTransformer() { // from class: cC1
            @Override // io.reactivex.ObservableTransformer
            public final ObservableSource apply(io.reactivex.Observable observable) {
                return RxComposeFunction.m16856l(observable);
            }
        };
    }

    @JvmStatic
    @NotNull
    public static final Observable.Transformer<String, String> applyPhoneNumberInternationalFormat() {
        return new Observable.Transformer() { // from class: dC1
            @Override // p046rx.functions.Func1
            public final Object call(Object obj) {
                return RxComposeFunction.m16858j((Observable) obj);
            }
        };
    }

    @JvmStatic
    @NotNull
    public static final ObservableTransformer<String, String> applyPhoneNumberInternationalFormatRx2() {
        return new ObservableTransformer() { // from class: bC1
            @Override // io.reactivex.ObservableTransformer
            public final ObservableSource apply(io.reactivex.Observable observable) {
                return RxComposeFunction.m16855m(observable);
            }
        };
    }

    @JvmStatic
    @NotNull
    public static final <T> ObservableTransformer<T, String> applyTyping4Digit() {
        return new ObservableTransformer() { // from class: SB1
            @Override // io.reactivex.ObservableTransformer
            public final ObservableSource apply(io.reactivex.Observable observable) {
                return RxComposeFunction.m16865c(observable);
            }
        };
    }

    /* renamed from: b */
    public static /* synthetic */ String m16866b(Function1 function1, Object obj) {
        return m16877A(function1, obj);
    }

    /* renamed from: c */
    public static /* synthetic */ ObservableSource m16865c(io.reactivex.Observable observable) {
        return m16871G(observable);
    }

    /* renamed from: d */
    public static /* synthetic */ ObservableSource m16864d(io.reactivex.Observable observable) {
        return m16850r(observable);
    }

    /* renamed from: e */
    public static /* synthetic */ boolean m16863e(Function1 function1, Object obj) {
        return m16849s(function1, obj);
    }

    /* renamed from: f */
    public static /* synthetic */ String m16862f(Function1 function1, Object obj) {
        return m16872F(function1, obj);
    }

    /* renamed from: g */
    public static /* synthetic */ boolean m16861g(Function1 function1, Object obj) {
        return m16876B(function1, obj);
    }

    /* renamed from: h */
    public static /* synthetic */ String m16860h(Function1 function1, Object obj) {
        return m16848t(function1, obj);
    }

    /* renamed from: i */
    public static /* synthetic */ ObservableSource m16859i(io.reactivex.Observable observable) {
        return m16846v(observable);
    }

    /* renamed from: j */
    public static /* synthetic */ Observable m16858j(Observable observable) {
        return m16875C(observable);
    }

    /* renamed from: k */
    public static /* synthetic */ String m16857k(Function1 function1, Object obj) {
        return m16869I(function1, obj);
    }

    /* renamed from: l */
    public static /* synthetic */ ObservableSource m16856l(io.reactivex.Observable observable) {
        return m16842z(observable);
    }

    /* renamed from: m */
    public static /* synthetic */ ObservableSource m16855m(io.reactivex.Observable observable) {
        return m16873E(observable);
    }

    /* renamed from: n */
    public static /* synthetic */ String m16854n(Function1 function1, Object obj) {
        return m16874D(function1, obj);
    }

    /* renamed from: o */
    public static /* synthetic */ ObservableSource m16853o(long j, io.reactivex.Observable observable) {
        return m16843y(j, observable);
    }

    /* renamed from: p */
    public static /* synthetic */ ObservableSource m16852p(Function1 function1, Object obj) {
        return m16870H(function1, obj);
    }

    /* renamed from: q */
    public static /* synthetic */ boolean m16851q(Function1 function1, Object obj) {
        return m16868J(function1, obj);
    }

    /* renamed from: r */
    public static final ObservableSource m16850r(io.reactivex.Observable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        final RxComposeFunction$applyCardExpired$1$1 rxComposeFunction$applyCardExpired$1$1 = RxComposeFunction$applyCardExpired$1$1.INSTANCE;
        io.reactivex.Observable filter = it.filter(new Predicate() { // from class: gC1
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Object obj) {
                return RxComposeFunction.m16863e(Function1.this, obj);
            }
        });
        final RxComposeFunction$applyCardExpired$1$2 rxComposeFunction$applyCardExpired$1$2 = RxComposeFunction$applyCardExpired$1$2.INSTANCE;
        io.reactivex.Observable map = filter.map(new Function() { // from class: hC1
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return RxComposeFunction.m16860h(Function1.this, obj);
            }
        });
        final RxComposeFunction$applyCardExpired$1$3 rxComposeFunction$applyCardExpired$1$3 = RxComposeFunction$applyCardExpired$1$3.INSTANCE;
        return map.onErrorReturn(new Function() { // from class: iC1
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return RxComposeFunction.m16867a(Function1.this, obj);
            }
        });
    }

    /* renamed from: s */
    public static final boolean m16849s(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: t */
    public static final String m16848t(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (String) tmp0.invoke(obj);
    }

    /* renamed from: u */
    public static final String m16847u(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (String) tmp0.invoke(obj);
    }

    /* renamed from: v */
    public static final ObservableSource m16846v(io.reactivex.Observable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.compose(m16844x(0L, 1, null)).observeOn(AndroidSchedulers.mainThread());
    }

    /* renamed from: w */
    public static final ObservableTransformer m16845w(final long j) {
        return new ObservableTransformer() { // from class: TB1
            @Override // io.reactivex.ObservableTransformer
            public final ObservableSource apply(io.reactivex.Observable observable) {
                return RxComposeFunction.m16853o(j, observable);
            }
        };
    }

    /* renamed from: x */
    public static /* synthetic */ ObservableTransformer m16844x(long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = 500;
        }
        return m16845w(j);
    }

    /* renamed from: y */
    public static final ObservableSource m16843y(long j, io.reactivex.Observable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.debounce(j, TimeUnit.MILLISECONDS);
    }

    /* renamed from: z */
    public static final ObservableSource m16842z(io.reactivex.Observable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        io.reactivex.Observable compose = it.compose(m16844x(0L, 1, null));
        final RxComposeFunction$applyPhoneNumber$1$1 rxComposeFunction$applyPhoneNumber$1$1 = RxComposeFunction$applyPhoneNumber$1$1.INSTANCE;
        io.reactivex.Observable map = compose.map(new Function() { // from class: XB1
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return RxComposeFunction.m16866b(Function1.this, obj);
            }
        });
        final RxComposeFunction$applyPhoneNumber$1$2 rxComposeFunction$applyPhoneNumber$1$2 = RxComposeFunction$applyPhoneNumber$1$2.INSTANCE;
        return map.filter(new Predicate() { // from class: YB1
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Object obj) {
                return RxComposeFunction.m16861g(Function1.this, obj);
            }
        }).observeOn(AndroidSchedulers.mainThread());
    }
}