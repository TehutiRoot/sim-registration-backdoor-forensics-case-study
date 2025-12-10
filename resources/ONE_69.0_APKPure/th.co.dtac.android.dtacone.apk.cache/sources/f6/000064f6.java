package androidx.compose.p003ui.text.font;

import androidx.compose.p003ui.text.font.TypefaceResult;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(m29143d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m29142d2 = {"<anonymous>", "Landroidx/compose/ui/text/font/TypefaceResult;", "typeRequest", "Landroidx/compose/ui/text/font/TypefaceRequest;", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: androidx.compose.ui.text.font.FontFamilyResolverImpl$preload$2 */
/* loaded from: classes2.dex */
public final class FontFamilyResolverImpl$preload$2 extends Lambda implements Function1<TypefaceRequest, TypefaceResult> {
    final /* synthetic */ FontFamilyResolverImpl this$0;

    @Metadata(m29143d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m29142d2 = {"<anonymous>", "", "it", "Landroidx/compose/ui/text/font/TypefaceResult$Immutable;", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: androidx.compose.ui.text.font.FontFamilyResolverImpl$preload$2$1 */
    /* loaded from: classes2.dex */
    public static final class C35901 extends Lambda implements Function1<TypefaceResult.Immutable, Unit> {
        public static final C35901 INSTANCE = new C35901();

        public C35901() {
            super(1);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull TypefaceResult.Immutable it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(TypefaceResult.Immutable immutable) {
            invoke2(immutable);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m29143d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m29142d2 = {"<anonymous>", "", "it", "Landroidx/compose/ui/text/font/TypefaceResult$Immutable;", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: androidx.compose.ui.text.font.FontFamilyResolverImpl$preload$2$2 */
    /* loaded from: classes2.dex */
    public static final class C35912 extends Lambda implements Function1<TypefaceResult.Immutable, Unit> {
        public static final C35912 INSTANCE = new C35912();

        public C35912() {
            super(1);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull TypefaceResult.Immutable it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(TypefaceResult.Immutable immutable) {
            invoke2(immutable);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FontFamilyResolverImpl$preload$2(FontFamilyResolverImpl fontFamilyResolverImpl) {
        super(1);
        this.this$0 = fontFamilyResolverImpl;
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final TypefaceResult invoke(@NotNull TypefaceRequest typeRequest) {
        FontListFontFamilyTypefaceAdapter fontListFontFamilyTypefaceAdapter;
        Function1<? super TypefaceRequest, ? extends Object> function1;
        PlatformFontFamilyTypefaceAdapter platformFontFamilyTypefaceAdapter;
        Function1<? super TypefaceRequest, ? extends Object> function12;
        Intrinsics.checkNotNullParameter(typeRequest, "typeRequest");
        fontListFontFamilyTypefaceAdapter = this.this$0.f31359d;
        PlatformFontLoader platformFontLoader$ui_text_release = this.this$0.getPlatformFontLoader$ui_text_release();
        C35901 c35901 = C35901.INSTANCE;
        function1 = this.this$0.f31361f;
        TypefaceResult resolve = fontListFontFamilyTypefaceAdapter.resolve(typeRequest, platformFontLoader$ui_text_release, c35901, function1);
        if (resolve == null) {
            platformFontFamilyTypefaceAdapter = this.this$0.f31360e;
            PlatformFontLoader platformFontLoader$ui_text_release2 = this.this$0.getPlatformFontLoader$ui_text_release();
            C35912 c35912 = C35912.INSTANCE;
            function12 = this.this$0.f31361f;
            resolve = platformFontFamilyTypefaceAdapter.resolve(typeRequest, platformFontLoader$ui_text_release2, c35912, function12);
            if (resolve == null) {
                throw new IllegalStateException("Could not load font");
            }
        }
        return resolve;
    }
}