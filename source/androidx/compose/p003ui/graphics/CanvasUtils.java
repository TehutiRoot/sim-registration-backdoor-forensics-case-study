package androidx.compose.p003ui.graphics;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.os.Build;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\rR\u0016\u0010\u0013\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, m28850d2 = {"Landroidx/compose/ui/graphics/CanvasUtils;", "", "<init>", "()V", "Landroid/graphics/Canvas;", "canvas", "", "enable", "", "enableZ", "(Landroid/graphics/Canvas;Z)V", "Ljava/lang/reflect/Method;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/lang/reflect/Method;", "reorderBarrierMethod", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "inorderBarrierMethod", OperatorName.CURVE_TO, "Z", "orderMethodsFetched", "ui-graphics_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nCanvasUtils.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CanvasUtils.android.kt\nandroidx/compose/ui/graphics/CanvasUtils\n+ 2 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,101:1\n26#2:102\n26#2:103\n*S KotlinDebug\n*F\n+ 1 CanvasUtils.android.kt\nandroidx/compose/ui/graphics/CanvasUtils\n*L\n54#1:102\n59#1:103\n*E\n"})
/* renamed from: androidx.compose.ui.graphics.CanvasUtils */
/* loaded from: classes2.dex */
public final class CanvasUtils {
    @NotNull
    public static final CanvasUtils INSTANCE = new CanvasUtils();

    /* renamed from: a */
    public static Method f29027a;

    /* renamed from: b */
    public static Method f29028b;

    /* renamed from: c */
    public static boolean f29029c;

    @SuppressLint({"SoonBlockedPrivateApi"})
    public final void enableZ(@NotNull Canvas canvas, boolean z) {
        Method method;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            C17146yl.f108846a.m187a(canvas, z);
            return;
        }
        if (!f29029c) {
            try {
                if (i == 28) {
                    Method declaredMethod = Class.class.getDeclaredMethod("getDeclaredMethod", String.class, new Class[0].getClass());
                    f29027a = (Method) declaredMethod.invoke(Canvas.class, "insertReorderBarrier", new Class[0]);
                    f29028b = (Method) declaredMethod.invoke(Canvas.class, "insertInorderBarrier", new Class[0]);
                } else {
                    f29027a = Canvas.class.getDeclaredMethod("insertReorderBarrier", null);
                    f29028b = Canvas.class.getDeclaredMethod("insertInorderBarrier", null);
                }
                Method method2 = f29027a;
                if (method2 != null) {
                    method2.setAccessible(true);
                }
                Method method3 = f29028b;
                if (method3 != null) {
                    method3.setAccessible(true);
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
            f29029c = true;
        }
        if (z) {
            try {
                Method method4 = f29027a;
                if (method4 != null) {
                    Intrinsics.checkNotNull(method4);
                    method4.invoke(canvas, null);
                }
            } catch (IllegalAccessException | InvocationTargetException unused2) {
                return;
            }
        }
        if (!z && (method = f29028b) != null) {
            Intrinsics.checkNotNull(method);
            method.invoke(canvas, null);
        }
    }
}
