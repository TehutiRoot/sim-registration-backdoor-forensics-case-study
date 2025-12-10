package androidx.compose.p003ui.text.android;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import androidx.annotation.DoNotInline;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: androidx.compose.ui.text.android.StaticLayoutFactoryDefault */
/* loaded from: classes2.dex */
public final class StaticLayoutFactoryDefault implements InterfaceC22782wM1 {

    /* renamed from: a */
    public static final Companion f31140a = new Companion(null);

    /* renamed from: b */
    public static boolean f31141b;

    /* renamed from: c */
    public static Constructor f31142c;

    @Metadata(m28851d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, m28850d2 = {"Landroidx/compose/ui/text/android/StaticLayoutFactoryDefault$Companion;", "", "<init>", "()V", "Ljava/lang/reflect/Constructor;", "Landroid/text/StaticLayout;", PDPageLabelRange.STYLE_LETTERS_LOWER, "()Ljava/lang/reflect/Constructor;", "", "isInitialized", "Z", "staticLayoutConstructor", "Ljava/lang/reflect/Constructor;", "ui-text_release"}, m28849k = 1, m28848mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.text.android.StaticLayoutFactoryDefault$Companion */
    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final Constructor m59076a() {
            if (StaticLayoutFactoryDefault.f31141b) {
                return StaticLayoutFactoryDefault.f31142c;
            }
            StaticLayoutFactoryDefault.f31141b = true;
            try {
                Class cls = Integer.TYPE;
                Class cls2 = Float.TYPE;
                StaticLayoutFactoryDefault.f31142c = StaticLayout.class.getConstructor(CharSequence.class, cls, cls, TextPaint.class, cls, Layout.Alignment.class, TextDirectionHeuristic.class, cls2, cls2, Boolean.TYPE, TextUtils.TruncateAt.class, cls, cls);
            } catch (NoSuchMethodException unused) {
                StaticLayoutFactoryDefault.f31142c = null;
            }
            return StaticLayoutFactoryDefault.f31142c;
        }

        public Companion() {
        }
    }

    @Override // p000.InterfaceC22782wM1
    /* renamed from: a */
    public boolean mo860a(StaticLayout layout, boolean z) {
        Intrinsics.checkNotNullParameter(layout, "layout");
        return false;
    }

    @Override // p000.InterfaceC22782wM1
    @DoNotInline
    @NotNull
    /* renamed from: b */
    public StaticLayout mo859b(@NotNull C22954xM1 params) {
        StaticLayout staticLayout;
        Intrinsics.checkNotNullParameter(params, "params");
        Constructor m59076a = f31140a.m59076a();
        if (m59076a != null) {
            try {
                staticLayout = (StaticLayout) m59076a.newInstance(params.m516r(), Integer.valueOf(params.m517q()), Integer.valueOf(params.m529e()), params.m519o(), Integer.valueOf(params.m513u()), params.m533a(), params.m515s(), Float.valueOf(params.m521m()), Float.valueOf(params.m522l()), Boolean.valueOf(params.m527g()), params.m531c(), Integer.valueOf(params.m530d()), Integer.valueOf(params.m520n()));
            } catch (IllegalAccessException unused) {
                staticLayout = null;
                f31142c = null;
            } catch (InstantiationException unused2) {
                staticLayout = null;
                f31142c = null;
            } catch (InvocationTargetException unused3) {
                staticLayout = null;
                f31142c = null;
            }
        } else {
            staticLayout = null;
        }
        StaticLayout staticLayout2 = staticLayout;
        if (staticLayout2 != null) {
            return staticLayout2;
        }
        return new StaticLayout(params.m516r(), params.m517q(), params.m529e(), params.m519o(), params.m513u(), params.m533a(), params.m521m(), params.m522l(), params.m527g(), params.m531c(), params.m530d());
    }
}
