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
    public static final Flow m26985A(Flow flow, int i) {
        FlowKt.noImpl();
        throw new KotlinNothingValueException();
    }

    /* renamed from: B */
    public static final Flow m26984B(Flow flow, Object obj, Function3 function3) {
        FlowKt.noImpl();
        throw new KotlinNothingValueException();
    }

    /* renamed from: C */
    public static final Flow m26983C(Flow flow, Function3 function3) {
        return FlowKt.runningReduce(flow, function3);
    }

    /* renamed from: D */
    public static final Flow m26982D(Flow flow, int i) {
        FlowKt.noImpl();
        throw new KotlinNothingValueException();
    }

    /* renamed from: E */
    public static final Flow m26981E(Flow flow, Object obj) {
        FlowKt.noImpl();
        throw new KotlinNothingValueException();
    }

    /* renamed from: F */
    public static final Flow m26980F(Flow flow, Flow flow2) {
        FlowKt.noImpl();
        throw new KotlinNothingValueException();
    }

    /* renamed from: G */
    public static final void m26979G(Flow flow) {
        FlowKt.noImpl();
        throw new KotlinNothingValueException();
    }

    /* renamed from: H */
    public static final void m26978H(Flow flow, Function2 function2) {
        FlowKt.noImpl();
        throw new KotlinNothingValueException();
    }

    /* renamed from: I */
    public static final void m26977I(Flow flow, Function2 function2, Function2 function22) {
        FlowKt.noImpl();
        throw new KotlinNothingValueException();
    }

    /* renamed from: J */
    public static final Flow m26976J(Flow flow, CoroutineContext coroutineContext) {
        FlowKt.noImpl();
        throw new KotlinNothingValueException();
    }

    /* renamed from: K */
    public static final Flow m26975K(Flow flow, Function2 function2) {
        return FlowKt.transformLatest(flow, new FlowKt__MigrationKt$switchMap$$inlined$flatMapLatest$1(function2, null));
    }

    /* renamed from: a */
    public static final Flow m26974a(Flow flow) {
        FlowKt.noImpl();
        throw new KotlinNothingValueException();
    }

    /* renamed from: b */
    public static final Flow m26973b(Flow flow, Flow flow2, Function3 function3) {
        return FlowKt.combine(flow, flow2, function3);
    }

    /* renamed from: c */
    public static final Flow m26972c(Flow flow, Flow flow2, Flow flow3, Function4 function4) {
        return FlowKt.combine(flow, flow2, flow3, function4);
    }

    /* renamed from: d */
    public static final Flow m26971d(Flow flow, Flow flow2, Flow flow3, Flow flow4, Function5 function5) {
        return FlowKt.combine(flow, flow2, flow3, flow4, function5);
    }

    /* renamed from: e */
    public static final Flow m26970e(Flow flow, Flow flow2, Flow flow3, Flow flow4, Flow flow5, Function6 function6) {
        return FlowKt.combine(flow, flow2, flow3, flow4, flow5, function6);
    }

    /* renamed from: f */
    public static final Flow m26969f(Flow flow, Function1 function1) {
        FlowKt.noImpl();
        throw new KotlinNothingValueException();
    }

    /* renamed from: g */
    public static final Flow m26968g(Flow flow, Function1 function1) {
        FlowKt.noImpl();
        throw new KotlinNothingValueException();
    }

    /* renamed from: h */
    public static final Flow m26967h(Flow flow, Object obj) {
        FlowKt.noImpl();
        throw new KotlinNothingValueException();
    }

    /* renamed from: i */
    public static final Flow m26966i(Flow flow, Flow flow2) {
        FlowKt.noImpl();
        throw new KotlinNothingValueException();
    }

    /* renamed from: j */
    public static final Flow m26965j(Flow flow, long j) {
        return FlowKt.onEach(flow, new FlowKt__MigrationKt$delayEach$1(j, null));
    }

    /* renamed from: k */
    public static final Flow m26964k(Flow flow, long j) {
        return FlowKt.onStart(flow, new FlowKt__MigrationKt$delayFlow$1(j, null));
    }

    /* renamed from: l */
    public static final Flow m26963l(Flow flow, Function2 function2) {
        FlowKt.noImpl();
        throw new KotlinNothingValueException();
    }

    /* renamed from: m */
    public static final Flow m26962m(Flow flow) {
        FlowKt.noImpl();
        throw new KotlinNothingValueException();
    }

    /* renamed from: n */
    public static final void m26961n(Flow flow, Function2 function2) {
        FlowKt.noImpl();
        throw new KotlinNothingValueException();
    }

    /* renamed from: o */
    public static final Flow m26960o(Flow flow) {
        FlowKt.noImpl();
        throw new KotlinNothingValueException();
    }

    /* renamed from: p */
    public static final Void m26959p() {
        throw new UnsupportedOperationException("Not implemented, should not be called");
    }

    /* renamed from: q */
    public static final Flow m26958q(Flow flow, CoroutineContext coroutineContext) {
        FlowKt.noImpl();
        throw new KotlinNothingValueException();
    }

    /* renamed from: r */
    public static final Flow m26957r(Flow flow, Flow flow2) {
        FlowKt.noImpl();
        throw new KotlinNothingValueException();
    }

    /* renamed from: s */
    public static final Flow m26956s(Flow flow, Flow flow2) {
        FlowKt.noImpl();
        throw new KotlinNothingValueException();
    }

    /* renamed from: t */
    public static final Flow m26955t(Flow flow, Object obj) {
        FlowKt.noImpl();
        throw new KotlinNothingValueException();
    }

    /* renamed from: u */
    public static final Flow m26954u(Flow flow, Object obj, Function1 function1) {
        return FlowKt.m74690catch(flow, new FlowKt__MigrationKt$onErrorReturn$2(function1, obj, null));
    }

    /* renamed from: v */
    public static /* synthetic */ Flow m26953v(Flow flow, Object obj, Function1 function1, int i, Object obj2) {
        if ((i & 2) != 0) {
            function1 = FlowKt__MigrationKt$onErrorReturn$1.INSTANCE;
        }
        return FlowKt.onErrorReturn(flow, obj, function1);
    }

    /* renamed from: w */
    public static final Flow m26952w(Flow flow) {
        FlowKt.noImpl();
        throw new KotlinNothingValueException();
    }

    /* renamed from: x */
    public static final Flow m26951x(Flow flow, int i) {
        FlowKt.noImpl();
        throw new KotlinNothingValueException();
    }

    /* renamed from: y */
    public static final Flow m26950y(Flow flow, CoroutineContext coroutineContext) {
        FlowKt.noImpl();
        throw new KotlinNothingValueException();
    }

    /* renamed from: z */
    public static final Flow m26949z(Flow flow) {
        FlowKt.noImpl();
        throw new KotlinNothingValueException();
    }
}
