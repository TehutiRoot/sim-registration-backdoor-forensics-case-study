package androidx.compose.material.ripple;

import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import androidx.annotation.DoNotInline;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.graphics.ColorKt;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.AbstractC11695c;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class UnprojectedRipple extends RippleDrawable {

    /* renamed from: e */
    public static final Companion f25604e = new Companion(null);

    /* renamed from: f */
    public static Method f25605f;

    /* renamed from: g */
    public static boolean f25606g;

    /* renamed from: a */
    public final boolean f25607a;

    /* renamed from: b */
    public Color f25608b;

    /* renamed from: c */
    public Integer f25609c;

    /* renamed from: d */
    public boolean f25610d;

    @Metadata(m29143d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0007"}, m29142d2 = {"Landroidx/compose/material/ripple/UnprojectedRipple$Companion;", "", "()V", "setMaxRadiusFetched", "", "setMaxRadiusMethod", "Ljava/lang/reflect/Method;", "material-ripple_release"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* renamed from: androidx.compose.material.ripple.UnprojectedRipple$a */
    /* loaded from: classes.dex */
    public static final class C3207a {

        /* renamed from: a */
        public static final C3207a f25611a = new C3207a();

        @DoNotInline
        /* renamed from: a */
        public final void m60655a(@NotNull RippleDrawable ripple, int i) {
            Intrinsics.checkNotNullParameter(ripple, "ripple");
            ripple.setRadius(i);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public UnprojectedRipple(boolean r5) {
        /*
            r4 = this;
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r0)
            r1 = 0
            if (r5 == 0) goto L10
            android.graphics.drawable.ColorDrawable r2 = new android.graphics.drawable.ColorDrawable
            r3 = -1
            r2.<init>(r3)
            goto L11
        L10:
            r2 = r1
        L11:
            r4.<init>(r0, r1, r2)
            r4.f25607a = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.ripple.UnprojectedRipple.<init>(boolean):void");
    }

    /* renamed from: a */
    public final long m60658a(long j, float f) {
        if (Build.VERSION.SDK_INT < 28) {
            f *= 2;
        }
        return Color.m71918copywmQWz5c$default(j, AbstractC11695c.coerceAtMost(f, 1.0f), 0.0f, 0.0f, 0.0f, 14, null);
    }

    /* renamed from: b */
    public final void m60657b(long j, float f) {
        boolean m71920equalsimpl0;
        long m60658a = m60658a(j, f);
        Color color = this.f25608b;
        if (color == null) {
            m71920equalsimpl0 = false;
        } else {
            m71920equalsimpl0 = Color.m71920equalsimpl0(color.m71929unboximpl(), m60658a);
        }
        if (!m71920equalsimpl0) {
            this.f25608b = Color.m71909boximpl(m60658a);
            setColor(ColorStateList.valueOf(ColorKt.m71972toArgb8_81llA(m60658a)));
        }
    }

    /* renamed from: c */
    public final void m60656c(int i) {
        Integer num = this.f25609c;
        if (num == null || num.intValue() != i) {
            this.f25609c = Integer.valueOf(i);
            if (Build.VERSION.SDK_INT < 23) {
                try {
                    if (!f25606g) {
                        f25606g = true;
                        f25605f = RippleDrawable.class.getDeclaredMethod("setMaxRadius", Integer.TYPE);
                    }
                    Method method = f25605f;
                    if (method != null) {
                        method.invoke(this, Integer.valueOf(i));
                        return;
                    }
                    return;
                } catch (Exception unused) {
                    return;
                }
            }
            C3207a.f25611a.m60655a(this, i);
        }
    }

    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.Drawable
    public Rect getDirtyBounds() {
        if (!this.f25607a) {
            this.f25610d = true;
        }
        Rect dirtyBounds = super.getDirtyBounds();
        Intrinsics.checkNotNullExpressionValue(dirtyBounds, "super.getDirtyBounds()");
        this.f25610d = false;
        return dirtyBounds;
    }

    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public boolean isProjected() {
        return this.f25610d;
    }
}