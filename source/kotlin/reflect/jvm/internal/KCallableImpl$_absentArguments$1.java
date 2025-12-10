package kotlin.reflect.jvm.internal;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KParameter;
import kotlin.reflect.jvm.ReflectJvmMapping;

@Metadata(m28851d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0004\u0010\u0000\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0002 \u0003*\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u00010\u0001\"\u0006\b\u0000\u0010\u0004 \u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28850d2 = {"<anonymous>", "", "", "kotlin.jvm.PlatformType", "R", "invoke", "()[Ljava/lang/Object;"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
@SourceDebugExtension({"SMAP\nKCallableImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KCallableImpl.kt\nkotlin/reflect/jvm/internal/KCallableImpl$_absentArguments$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,243:1\n1855#2,2:244\n*S KotlinDebug\n*F\n+ 1 KCallableImpl.kt\nkotlin/reflect/jvm/internal/KCallableImpl$_absentArguments$1\n*L\n122#1:244,2\n*E\n"})
/* loaded from: classes6.dex */
public final class KCallableImpl$_absentArguments$1 extends Lambda implements Function0<Object[]> {
    final /* synthetic */ KCallableImpl<R> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public KCallableImpl$_absentArguments$1(KCallableImpl<? extends R> kCallableImpl) {
        super(0);
        this.this$0 = kCallableImpl;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object[] invoke() {
        Object m28703b;
        int size = this.this$0.getParameters().size() + (this.this$0.isSuspend() ? 1 : 0);
        int size2 = (this.this$0.getParameters().size() + 31) / 32;
        Object[] objArr = new Object[size + size2 + 1];
        KCallableImpl<R> kCallableImpl = this.this$0;
        for (KParameter kParameter : this.this$0.getParameters()) {
            if (kParameter.isOptional() && !UtilKt.isInlineClassType(kParameter.getType())) {
                objArr[kParameter.getIndex()] = UtilKt.defaultPrimitiveValue(ReflectJvmMapping.getJavaType(kParameter.getType()));
            } else if (kParameter.isVararg()) {
                int index = kParameter.getIndex();
                m28703b = kCallableImpl.m28703b(kParameter.getType());
                objArr[index] = m28703b;
            }
        }
        for (int i = 0; i < size2; i++) {
            objArr[size + i] = 0;
        }
        return objArr;
    }
}
