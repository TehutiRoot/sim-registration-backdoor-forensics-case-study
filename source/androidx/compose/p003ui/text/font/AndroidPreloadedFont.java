package androidx.compose.p003ui.text.font;

import android.content.Context;
import android.graphics.Typeface;
import androidx.compose.p003ui.text.font.FontVariation;
import ch.qos.logback.core.CoreConstants;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001B$\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\u000f\u001a\u0004\u0018\u00010\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH ¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0011\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\u0010\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R \u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001d\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR$\u0010$\u001a\u0004\u0018\u00010\f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u0016\u0010(\u001a\u0004\u0018\u00010%8&X¦\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'\u0082\u0001\u0003)*+\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006,"}, m28850d2 = {"Landroidx/compose/ui/text/font/AndroidPreloadedFont;", "Landroidx/compose/ui/text/font/AndroidFont;", "Landroidx/compose/ui/text/font/FontWeight;", "weight", "Landroidx/compose/ui/text/font/FontStyle;", "style", "Landroidx/compose/ui/text/font/FontVariation$Settings;", "variationSettings", "<init>", "(Landroidx/compose/ui/text/font/FontWeight;ILandroidx/compose/ui/text/font/FontVariation$Settings;)V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/graphics/Typeface;", "doLoad$ui_text_release", "(Landroid/content/Context;)Landroid/graphics/Typeface;", "doLoad", "loadCached$ui_text_release", "loadCached", "d", "Landroidx/compose/ui/text/font/FontWeight;", "getWeight", "()Landroidx/compose/ui/text/font/FontWeight;", "e", "I", "getStyle-_-LCdwA", "()I", "", OperatorName.FILL_NON_ZERO, "Z", "didInitWithContext", OperatorName.NON_STROKING_GRAY, "Landroid/graphics/Typeface;", "getTypeface$ui_text_release", "()Landroid/graphics/Typeface;", "setTypeface$ui_text_release", "(Landroid/graphics/Typeface;)V", "typeface", "", "getCacheKey", "()Ljava/lang/String;", "cacheKey", "Landroidx/compose/ui/text/font/AndroidAssetFont;", "Landroidx/compose/ui/text/font/AndroidFileDescriptorFont;", "Landroidx/compose/ui/text/font/AndroidFileFont;", "ui-text_release"}, m28849k = 1, m28848mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.text.font.AndroidPreloadedFont */
/* loaded from: classes2.dex */
public abstract class AndroidPreloadedFont extends AndroidFont {

    /* renamed from: d */
    public final FontWeight f31237d;

    /* renamed from: e */
    public final int f31238e;

    /* renamed from: f */
    public boolean f31239f;

    /* renamed from: g */
    public Typeface f31240g;

    public /* synthetic */ AndroidPreloadedFont(FontWeight fontWeight, int i, FontVariation.Settings settings, DefaultConstructorMarker defaultConstructorMarker) {
        this(fontWeight, i, settings);
    }

    @Nullable
    public abstract Typeface doLoad$ui_text_release(@Nullable Context context);

    @Nullable
    public abstract String getCacheKey();

    @Override // androidx.compose.p003ui.text.font.Font
    /* renamed from: getStyle-_-LCdwA  reason: not valid java name */
    public final int mo73268getStyle_LCdwA() {
        return this.f31238e;
    }

    @Nullable
    public final Typeface getTypeface$ui_text_release() {
        return this.f31240g;
    }

    @Override // androidx.compose.p003ui.text.font.Font
    @NotNull
    public final FontWeight getWeight() {
        return this.f31237d;
    }

    @Nullable
    public final Typeface loadCached$ui_text_release(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (!this.f31239f && this.f31240g == null) {
            this.f31240g = doLoad$ui_text_release(context);
        }
        this.f31239f = true;
        return this.f31240g;
    }

    public final void setTypeface$ui_text_release(@Nullable Typeface typeface) {
        this.f31240g = typeface;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidPreloadedFont(FontWeight weight, int i, FontVariation.Settings variationSettings) {
        super(FontLoadingStrategy.Companion.m73303getBlockingPKNRLFQ(), C3616a.f31348a, variationSettings, null);
        Intrinsics.checkNotNullParameter(weight, "weight");
        Intrinsics.checkNotNullParameter(variationSettings, "variationSettings");
        this.f31237d = weight;
        this.f31238e = i;
    }
}
