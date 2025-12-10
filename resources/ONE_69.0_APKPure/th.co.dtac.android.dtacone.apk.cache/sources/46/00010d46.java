package p000;

import android.graphics.text.LineBreakConfig;
import android.text.StaticLayout;
import androidx.annotation.DoNotInline;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: sN1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C22161sN1 {

    /* renamed from: a */
    public static final C22161sN1 f79879a = new C22161sN1();

    @JvmStatic
    @DoNotInline
    /* renamed from: a */
    public static final boolean m22817a(@NotNull StaticLayout layout) {
        boolean isFallbackLineSpacingEnabled;
        Intrinsics.checkNotNullParameter(layout, "layout");
        isFallbackLineSpacingEnabled = layout.isFallbackLineSpacingEnabled();
        return isFallbackLineSpacingEnabled;
    }

    @JvmStatic
    @DoNotInline
    /* renamed from: b */
    public static final void m22816b(@NotNull StaticLayout.Builder builder, int i, int i2) {
        LineBreakConfig.Builder lineBreakStyle;
        LineBreakConfig.Builder lineBreakWordStyle;
        LineBreakConfig build;
        Intrinsics.checkNotNullParameter(builder, "builder");
        lineBreakStyle = AbstractC21988rN1.m23514a().setLineBreakStyle(i);
        lineBreakWordStyle = lineBreakStyle.setLineBreakWordStyle(i2);
        build = lineBreakWordStyle.build();
        Intrinsics.checkNotNullExpressionValue(build, "Builder()\n              …\n                .build()");
        builder.setLineBreakConfig(build);
    }
}