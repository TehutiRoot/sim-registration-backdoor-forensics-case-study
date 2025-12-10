package p000;

import androidx.compose.p003ui.Modifier;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: gt0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC20114gt0 {
    /* renamed from: a */
    public static boolean m30962a(Modifier.Element element, Function1 predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        return ((Boolean) predicate.invoke(element)).booleanValue();
    }

    /* renamed from: b */
    public static boolean m30961b(Modifier.Element element, Function1 predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        return ((Boolean) predicate.invoke(element)).booleanValue();
    }

    /* renamed from: c */
    public static Object m30960c(Modifier.Element element, Object obj, Function2 operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        return operation.invoke(obj, element);
    }

    /* renamed from: d */
    public static Object m30959d(Modifier.Element element, Object obj, Function2 operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        return operation.invoke(element, obj);
    }

    /* renamed from: e */
    public static /* synthetic */ boolean m30958e(Modifier.Element element, Function1 function1) {
        return m30962a(element, function1);
    }

    /* renamed from: f */
    public static /* synthetic */ boolean m30957f(Modifier.Element element, Function1 function1) {
        return m30961b(element, function1);
    }

    /* renamed from: g */
    public static /* synthetic */ Object m30956g(Modifier.Element element, Object obj, Function2 function2) {
        return m30960c(element, obj, function2);
    }

    /* renamed from: h */
    public static /* synthetic */ Object m30955h(Modifier.Element element, Object obj, Function2 function2) {
        return m30959d(element, obj, function2);
    }

    /* renamed from: i */
    public static /* synthetic */ Modifier m30954i(Modifier.Element element, Modifier modifier) {
        return AbstractC19942ft0.m31254a(element, modifier);
    }
}
