package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancementBuilder;
import org.jetbrains.annotations.NotNull;

/* renamed from: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$1$1$5$9 */
/* loaded from: classes6.dex */
public final class C11801xb2505179 extends Lambda implements Function1<SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder, Unit> {
    final /* synthetic */ String $JFBiFunction;
    final /* synthetic */ String $JLObject;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11801xb2505179(String str, String str2) {
        super(1);
        this.$JLObject = str;
        this.$JFBiFunction = str2;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder) {
        invoke2(functionEnhancementBuilder);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder function) {
        JavaTypeQualifiers javaTypeQualifiers;
        JavaTypeQualifiers javaTypeQualifiers2;
        JavaTypeQualifiers javaTypeQualifiers3;
        JavaTypeQualifiers javaTypeQualifiers4;
        JavaTypeQualifiers javaTypeQualifiers5;
        JavaTypeQualifiers javaTypeQualifiers6;
        JavaTypeQualifiers javaTypeQualifiers7;
        Intrinsics.checkNotNullParameter(function, "$this$function");
        String str = this.$JLObject;
        javaTypeQualifiers = PredefinedEnhancementInfoKt.f69259b;
        function.parameter(str, javaTypeQualifiers);
        String str2 = this.$JLObject;
        javaTypeQualifiers2 = PredefinedEnhancementInfoKt.f69260c;
        function.parameter(str2, javaTypeQualifiers2);
        String str3 = this.$JFBiFunction;
        javaTypeQualifiers3 = PredefinedEnhancementInfoKt.f69259b;
        javaTypeQualifiers4 = PredefinedEnhancementInfoKt.f69260c;
        javaTypeQualifiers5 = PredefinedEnhancementInfoKt.f69260c;
        javaTypeQualifiers6 = PredefinedEnhancementInfoKt.f69258a;
        function.parameter(str3, javaTypeQualifiers3, javaTypeQualifiers4, javaTypeQualifiers5, javaTypeQualifiers6);
        String str4 = this.$JLObject;
        javaTypeQualifiers7 = PredefinedEnhancementInfoKt.f69258a;
        function.returns(str4, javaTypeQualifiers7);
    }
}