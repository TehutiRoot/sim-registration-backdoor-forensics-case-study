package kotlin.coroutines.jvm.internal;

import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.annotation.AnnotationTarget;
import kotlin.jvm.JvmName;
import org.apache.http.cookie.ClientCookie;

@Target({ElementType.TYPE})
@SinceKotlin(version = "1.3")
@Metadata(m29143d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0011\b\u0081\u0002\u0018\u00002\u00020\u0001B\\\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\t\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\f\u001a\u00020\u0005\u0012\b\b\u0002\u0010\r\u001a\u00020\u0005R\u0011\u0010\r\u001a\u00020\u00058\u0007¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u000b\u001a\u00020\u00078\u0007¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u00078\u0007¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0011R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\t8\u0007¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\f\u001a\u00020\u00058\u0007¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u00058\u0007¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u000fR\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\t8\u0007¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0014R\u0011\u0010\u0002\u001a\u00020\u00038\u0007¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, m29142d2 = {"Lkotlin/coroutines/jvm/internal/DebugMetadata;", "", ClientCookie.VERSION_ATTR, "", "sourceFile", "", "lineNumbers", "", "localNames", "", "spilled", "indexToLabel", "methodName", "className", OperatorName.CURVE_TO, "()Ljava/lang/String;", "i", "()[I", OperatorName.LINE_TO, OperatorName.ENDPATH, "()[Ljava/lang/String;", OperatorName.MOVE_TO, OperatorName.FILL_NON_ZERO, OperatorName.CLOSE_AND_STROKE, OperatorName.CURVE_TO_REPLICATE_INITIAL_POINT, "()I", "kotlin-stdlib"}, m29141k = 1, m29140mv = {1, 9, 0}, m29138xi = 48)
@kotlin.annotation.Target(allowedTargets = {AnnotationTarget.CLASS})
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes5.dex */
public @interface DebugMetadata {
    @JvmName(name = OperatorName.CURVE_TO)
    /* renamed from: c */
    String m29093c() default "";

    @JvmName(name = OperatorName.FILL_NON_ZERO)
    /* renamed from: f */
    String m29092f() default "";

    @JvmName(name = "i")
    /* renamed from: i */
    int[] m29091i() default {};

    @JvmName(name = OperatorName.LINE_TO)
    /* renamed from: l */
    int[] m29090l() default {};

    @JvmName(name = OperatorName.MOVE_TO)
    /* renamed from: m */
    String m29089m() default "";

    @JvmName(name = OperatorName.ENDPATH)
    /* renamed from: n */
    String[] m29088n() default {};

    @JvmName(name = OperatorName.CLOSE_AND_STROKE)
    /* renamed from: s */
    String[] m29087s() default {};

    @JvmName(name = OperatorName.CURVE_TO_REPLICATE_INITIAL_POINT)
    /* renamed from: v */
    int m29086v() default 1;
}