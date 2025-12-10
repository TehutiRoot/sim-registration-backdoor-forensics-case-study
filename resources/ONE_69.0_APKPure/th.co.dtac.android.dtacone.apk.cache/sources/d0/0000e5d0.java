package kotlinx.coroutines.flow;

import kotlin.KotlinNothingValueException;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.functions.Function6;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class FlowKt__MigrationKt {
    /* renamed from: A */
    public static final Flow m27277A(Flow flow, int i) {
        FlowKt.noImpl();
        throw new KotlinNothingValueException();
    }

    /* renamed from: B */
    public static final Flow m27276B(Flow flow, Object obj, Function3 function3) {
        FlowKt.noImpl();
        throw new KotlinNothingValueException();
    }

    /* renamed from: C */
    public static final Flow m27275C(Flow flow, Function3 function3) {
        return FlowKt.runningReduce(flow, function3);
    }

    /* renamed from: D */
    public static final Flow m27274D(Flow flow, int i) {
        FlowKt.noImpl();
        throw new KotlinNothingValueException();
    }

    /* renamed from: E */
    public static final Flow m27273E(Flow flow, Object obj) {
        FlowKt.noImpl();
        throw new KotlinNothingValueException();
    }

    /* renamed from: F */
    public static final Flow m27272F(Flow flow, Flow flow2) {
        FlowKt.noImpl();
        throw new KotlinNothingValueException();
    }

    /* renamed from: G */
    public static final void m27271G(Flow flow) {
        FlowKt.noImpl();
        throw new KotlinNothingValueException();
    }

    /* renamed from: H */
    public static final void m27270H(Flow flow, Function2 function2) {
        FlowKt.noImpl();
        throw new KotlinNothingValueException();
    }

    /* renamed from: I */
    public static final void m27269I(Flow flow, Function2 function2, Function2 function22) {
        FlowKt.noImpl();
        throw new KotlinNothingValueException();
    }

    /* renamed from: J */
    public static final Flow m27268J(Flow flow, CoroutineContext coroutineContext) {
        FlowKt.noImpl();
        throw new KotlinNothingValueException();
    }

    /* renamed from: K */
    public static final Flow m27267K(Flow flow, Function2 function2) {
        return FlowKt.transformLatest(flow, new FlowKt__MigrationKt$switchMap$$inlined$flatMapLatest$1(function2, null));
    }

    /* renamed from: a */
    public static final Flow m27266a(Flow flow) {
        FlowKt.noImpl();
        throw new KotlinNothingValueException();
    }

    /* renamed from: b */
    public static final Flow m27265b(Flow flow, Flow flow2, Function3 function3) {
        return FlowKt.combine(flow, flow2, function3);
    }

    /* renamed from: c */
    public static final Flow m27264c(Flow flow, Flow flow2, Flow flow3, Function4 function4) {
        return FlowKt.combine(flow, flow2, flow3, function4);
    }

    /* renamed from: d */
    public static final Flow m27263d(Flow flow, Flow flow2, Flow flow3, Flow flow4, Function5 function5) {
        return FlowKt.combine(flow, flow2, flow3, flow4, function5);
    }

    /* renamed from: e */
    public static final Flow m27262e(Flow flow, Flow flow2, Flow flow3, Flow flow4, Flow flow5, Function6 function6) {
        return FlowKt.combine(flow, flow2, flow3, flow4, flow5, function6);
    }

    /* renamed from: f */
    public static final Flow m27261f(Flow flow, Function1 function1) {
        FlowKt.noImpl();
        throw new KotlinNothingValueException();
    }

    /* renamed from: g */
    public static final Flow m27260g(Flow flow, Function1 function1) {
        FlowKt.noImpl();
        throw new KotlinNothingValueException();
    }

    /* renamed from: h */
    public static final Flow m27259h(Flow flow, Object obj) {
        FlowKt.noImpl();
        throw new KotlinNothingValueException();
    }

    /* renamed from: i */
    public static final Flow m27258i(Flow flow, Flow flow2) {
        FlowKt.noImpl();
        throw new KotlinNothingValueException();
    }

    /* renamed from: j */
    public static final Flow m27257j(Flow flow, long j) {
        return FlowKt.onEach(flow, new FlowKt__MigrationKt$delayEach$1(j, null));
    }

    /* renamed from: k */
    public static final Flow m27256k(Flow flow, long j) {
        return FlowKt.onStart(flow, new FlowKt__MigrationKt$delayFlow$1(j, null));
    }

    /* renamed from: l */
    public static final Flow m27255l(Flow flow, Function2 function2) {
        FlowKt.noImpl();
        throw new KotlinNothingValueException();
    }

    /* renamed from: m */
    public static final Flow m27254m(Flow flow) {
        FlowKt.noImpl();
        throw new KotlinNothingValueException();
    }

    /* renamed from: n */
    public static final void m27253n(Flow flow, Function2 function2) {
        FlowKt.noImpl();
        throw new KotlinNothingValueException();
    }

    /* renamed from: o */
    public static final Flow m27252o(Flow flow) {
        FlowKt.noImpl();
        throw new KotlinNothingValueException();
    }

    /* renamed from: p */
    public static final Void m27251p() {
        throw new UnsupportedOperationException("Not implemented, should not be called");
    }

    /* renamed from: q */
    public static final Flow m27250q(Flow flow, CoroutineContext coroutineContext) {
        FlowKt.noImpl();
        throw new KotlinNothingValueException();
    }

    /* renamed from: r */
    public static final Flow m27249r(Flow flow, Flow flow2) {
        FlowKt.noImpl();
        throw new KotlinNothingValueException();
    }

    /* renamed from: s */
    public static final Flow m27248s(Flow flow, Flow flow2) {
        FlowKt.noImpl();
        throw new KotlinNothingValueException();
    }

    /* renamed from: t */
    public static final Flow m27247t(Flow flow, Object obj) {
        FlowKt.noImpl();
        throw new KotlinNothingValueException();
    }

    /* renamed from: u */
    public static final Flow m27246u(Flow flow, Object obj, Function1 function1) {
        return FlowKt.m74874catch(flow, new FlowKt__MigrationKt$onErrorReturn$2(function1, obj, null));
    }

    /* renamed from: v */
    public static /* synthetic */ Flow m27245v(Flow flow, Object obj, Function1 function1, int i, Object obj2) {
        if ((i & 2) != 0) {
            function1 = FlowKt__MigrationKt$onErrorReturn$1.INSTANCE;
        }
        return FlowKt.onErrorReturn(flow, obj, function1);
    }

    /* renamed from: w */
    public static final Flow m27244w(Flow flow) {
        FlowKt.noImpl();
        throw new KotlinNothingValueException();
    }

    /* renamed from: x */
    public static final Flow m27243x(Flow flow, int i) {
        FlowKt.noImpl();
        throw new KotlinNothingValueException();
    }

    /* renamed from: y */
    public static final Flow m27242y(Flow flow, CoroutineContext coroutineContext) {
        FlowKt.noImpl();
        throw new KotlinNothingValueException();
    }

    /* renamed from: z */
    public static final Flow m27241z(Flow flow) {
        FlowKt.noImpl();
        throw new KotlinNothingValueException();
    }
}