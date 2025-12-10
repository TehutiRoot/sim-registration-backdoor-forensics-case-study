package kotlin.reflect.jvm.internal.impl.util;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;

@SourceDebugExtension({"SMAP\nmodifierChecks.kt\nKotlin\n*S Kotlin\n*F\n+ 1 modifierChecks.kt\norg/jetbrains/kotlin/util/OperatorChecks$checks$3\n+ 2 modifierChecks.kt\norg/jetbrains/kotlin/util/AbstractModifierChecks\n*L\n1#1,264:1\n171#2:265\n*S KotlinDebug\n*F\n+ 1 modifierChecks.kt\norg/jetbrains/kotlin/util/OperatorChecks$checks$3\n*L\n220#1:265\n*E\n"})
/* loaded from: classes6.dex */
public final class OperatorChecks$checks$3 extends Lambda implements Function1<FunctionDescriptor, String> {
    public static final OperatorChecks$checks$3 INSTANCE = new OperatorChecks$checks$3();

    public OperatorChecks$checks$3() {
        super(1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002f, code lost:
        if (r7 != false) goto L12;
     */
    @Override // kotlin.jvm.functions.Function1
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String invoke(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor r7) {
        /*
            r6 = this;
            java.lang.String r0 = "$this$$receiver"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor r0 = r7.getDispatchReceiverParameter()
            if (r0 != 0) goto Lf
            kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor r0 = r7.getExtensionReceiverParameter()
        Lf:
            kotlin.reflect.jvm.internal.impl.util.OperatorChecks r1 = kotlin.reflect.jvm.internal.impl.util.OperatorChecks.INSTANCE
            r2 = 0
            if (r0 == 0) goto L32
            kotlin.reflect.jvm.internal.impl.types.KotlinType r3 = r7.getReturnType()
            if (r3 == 0) goto L28
            kotlin.reflect.jvm.internal.impl.types.KotlinType r4 = r0.getType()
            java.lang.String r5 = "receiver.type"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r5)
            boolean r3 = kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt.isSubtypeOf(r3, r4)
            goto L29
        L28:
            r3 = 0
        L29:
            if (r3 != 0) goto L31
            boolean r7 = kotlin.reflect.jvm.internal.impl.util.OperatorChecks.access$incDecCheckForExpectClass(r1, r7, r0)
            if (r7 == 0) goto L32
        L31:
            r2 = 1
        L32:
            if (r2 != 0) goto L37
            java.lang.String r7 = "receiver must be a supertype of the return type"
            goto L38
        L37:
            r7 = 0
        L38:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.util.OperatorChecks$checks$3.invoke(kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor):java.lang.String");
    }
}