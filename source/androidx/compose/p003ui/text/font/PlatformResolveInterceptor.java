package androidx.compose.p003ui.text.font;

import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.util.Constant;

@Metadata(m28851d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011J\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016J\u001d\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\tJ\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016ø\u0001\u0002\u0082\u0002\u0011\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0004\b!0\u0001¨\u0006\u0012À\u0006\u0001"}, m28850d2 = {"Landroidx/compose/ui/text/font/PlatformResolveInterceptor;", "", "interceptFontFamily", "Landroidx/compose/ui/text/font/FontFamily;", "fontFamily", "interceptFontStyle", "Landroidx/compose/ui/text/font/FontStyle;", "fontStyle", "interceptFontStyle-T2F_aPo", "(I)I", "interceptFontSynthesis", "Landroidx/compose/ui/text/font/FontSynthesis;", "fontSynthesis", "interceptFontSynthesis-Mscr08Y", "interceptFontWeight", "Landroidx/compose/ui/text/font/FontWeight;", "fontWeight", "Companion", "ui-text_release"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: androidx.compose.ui.text.font.PlatformResolveInterceptor */
/* loaded from: classes2.dex */
public interface PlatformResolveInterceptor {
    @NotNull
    public static final Companion Companion = Companion.f31329a;

    @Metadata(m28851d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m28850d2 = {"Landroidx/compose/ui/text/font/PlatformResolveInterceptor$Companion;", "", "<init>", "()V", "Landroidx/compose/ui/text/font/PlatformResolveInterceptor;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Landroidx/compose/ui/text/font/PlatformResolveInterceptor;", "getDefault$ui_text_release", "()Landroidx/compose/ui/text/font/PlatformResolveInterceptor;", Constant.OnePostpaidVerifyKey.Default, "ui-text_release"}, m28849k = 1, m28848mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.text.font.PlatformResolveInterceptor$Companion */
    /* loaded from: classes2.dex */
    public static final class Companion {

        /* renamed from: a */
        public static final /* synthetic */ Companion f31329a = new Companion();

        /* renamed from: b */
        public static final PlatformResolveInterceptor f31330b = new PlatformResolveInterceptor() { // from class: androidx.compose.ui.text.font.PlatformResolveInterceptor$Companion$Default$1
            @Override // androidx.compose.p003ui.text.font.PlatformResolveInterceptor
            public /* synthetic */ FontFamily interceptFontFamily(FontFamily fontFamily) {
                return AbstractC17484Dk1.m68593a(this, fontFamily);
            }

            @Override // androidx.compose.p003ui.text.font.PlatformResolveInterceptor
            /* renamed from: interceptFontStyle-T2F_aPo */
            public /* synthetic */ int mo73265interceptFontStyleT2F_aPo(int i) {
                return AbstractC17484Dk1.m68592b(this, i);
            }

            @Override // androidx.compose.p003ui.text.font.PlatformResolveInterceptor
            /* renamed from: interceptFontSynthesis-Mscr08Y */
            public /* synthetic */ int mo73266interceptFontSynthesisMscr08Y(int i) {
                return AbstractC17484Dk1.m68591c(this, i);
            }

            @Override // androidx.compose.p003ui.text.font.PlatformResolveInterceptor
            public /* synthetic */ FontWeight interceptFontWeight(FontWeight fontWeight) {
                return AbstractC17484Dk1.m68590d(this, fontWeight);
            }
        };

        @NotNull
        public final PlatformResolveInterceptor getDefault$ui_text_release() {
            return f31330b;
        }
    }

    @Nullable
    FontFamily interceptFontFamily(@Nullable FontFamily fontFamily);

    /* renamed from: interceptFontStyle-T2F_aPo */
    int mo73265interceptFontStyleT2F_aPo(int i);

    /* renamed from: interceptFontSynthesis-Mscr08Y */
    int mo73266interceptFontSynthesisMscr08Y(int i);

    @NotNull
    FontWeight interceptFontWeight(@NotNull FontWeight fontWeight);
}
