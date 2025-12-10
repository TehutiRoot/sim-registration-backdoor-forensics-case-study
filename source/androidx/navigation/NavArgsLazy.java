package androidx.navigation;

import android.os.Bundle;
import androidx.navigation.NavArgs;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.lang.reflect.Method;
import java.util.Arrays;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B#\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0014\u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0017\u001a\u00028\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, m28850d2 = {"Landroidx/navigation/NavArgsLazy;", "Landroidx/navigation/NavArgs;", "Args", "Lkotlin/Lazy;", "Lkotlin/reflect/KClass;", "navArgsClass", "Lkotlin/Function0;", "Landroid/os/Bundle;", "argumentProducer", "<init>", "(Lkotlin/reflect/KClass;Lkotlin/jvm/functions/Function0;)V", "", "isInitialized", "()Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lkotlin/reflect/KClass;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lkotlin/jvm/functions/Function0;", OperatorName.CURVE_TO, "Landroidx/navigation/NavArgs;", "cached", "getValue", "()Landroidx/navigation/NavArgs;", "value", "navigation-common_release"}, m28849k = 1, m28848mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class NavArgsLazy<Args extends NavArgs> implements Lazy<Args> {

    /* renamed from: a */
    public final KClass f36194a;

    /* renamed from: b */
    public final Function0 f36195b;

    /* renamed from: c */
    public NavArgs f36196c;

    public NavArgsLazy(@NotNull KClass<Args> navArgsClass, @NotNull Function0<Bundle> argumentProducer) {
        Intrinsics.checkNotNullParameter(navArgsClass, "navArgsClass");
        Intrinsics.checkNotNullParameter(argumentProducer, "argumentProducer");
        this.f36194a = navArgsClass;
        this.f36195b = argumentProducer;
    }

    @Override // kotlin.Lazy
    public boolean isInitialized() {
        if (this.f36196c != null) {
            return true;
        }
        return false;
    }

    @Override // kotlin.Lazy
    @NotNull
    public Args getValue() {
        Args args = (Args) this.f36196c;
        if (args == null) {
            Bundle bundle = (Bundle) this.f36195b.invoke();
            Method method = NavArgsLazyKt.getMethodMap().get(this.f36194a);
            if (method == null) {
                Class javaClass = JvmClassMappingKt.getJavaClass(this.f36194a);
                Class<Bundle>[] methodSignature = NavArgsLazyKt.getMethodSignature();
                method = javaClass.getMethod("fromBundle", (Class[]) Arrays.copyOf(methodSignature, methodSignature.length));
                NavArgsLazyKt.getMethodMap().put(this.f36194a, method);
                Intrinsics.checkNotNullExpressionValue(method, "navArgsClass.java.getMet…hod\n                    }");
            }
            Object invoke = method.invoke(null, bundle);
            Intrinsics.checkNotNull(invoke, "null cannot be cast to non-null type Args of androidx.navigation.NavArgsLazy");
            Args args2 = (Args) invoke;
            this.f36196c = args2;
            return args2;
        }
        return args;
    }
}
