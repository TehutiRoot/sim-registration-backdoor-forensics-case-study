package androidx.compose.p003ui.tooling;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import androidx.compose.p003ui.text.font.Font;
import androidx.compose.p003ui.text.font.ResourceFont;
import ch.qos.logback.core.CoreConstants;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, m28850d2 = {"Landroidx/compose/ui/tooling/LayoutlibFontResourceLoader;", "Landroidx/compose/ui/text/font/Font$ResourceLoader;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "Landroidx/compose/ui/text/font/Font;", "font", "Landroid/graphics/Typeface;", "load", "(Landroidx/compose/ui/text/font/Font;)Landroid/graphics/Typeface;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroid/content/Context;", "ui-tooling_release"}, m28849k = 1, m28848mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.tooling.LayoutlibFontResourceLoader */
/* loaded from: classes2.dex */
public final class LayoutlibFontResourceLoader implements Font.ResourceLoader {

    /* renamed from: a */
    public final Context f31616a;

    public LayoutlibFontResourceLoader(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f31616a = context;
    }

    @Override // androidx.compose.p003ui.text.font.Font.ResourceLoader
    @Deprecated(message = "Replaced by FontFamily.Resolver, this method should not be called", replaceWith = @ReplaceWith(expression = "FontFamily.Resolver.resolve(font, )", imports = {}))
    @NotNull
    public Typeface load(@NotNull Font font) {
        Intrinsics.checkNotNullParameter(font, "font");
        if ((font instanceof ResourceFont) && Build.VERSION.SDK_INT >= 26) {
            return C17448Cx1.f871a.m68718a(this.f31616a, (ResourceFont) font);
        }
        throw new IllegalArgumentException("Unknown font type: " + font.getClass().getName());
    }
}
