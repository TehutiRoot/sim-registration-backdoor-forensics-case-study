package kotlinx.serialization.json;

import ch.qos.logback.core.CoreConstants;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.ExperimentalSerializationApi;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b5\u0018\u00002\u00020\u0001B«\u0001\b\u0000\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\r\u001a\u00020\t\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001f\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u001b\u001a\u0004\b\u0005\u0010\u001dR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u001b\u001a\u0004\b\"\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\u001b\u001a\u0004\b$\u0010\u001dR \u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b%\u0010\u001b\u0012\u0004\b'\u0010(\u001a\u0004\b&\u0010\u001dR \u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b)\u0010*\u0012\u0004\b,\u0010(\u001a\u0004\b+\u0010\u0019R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b-\u0010\u001b\u001a\u0004\b.\u0010\u001dR\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b/\u0010\u001b\u001a\u0004\b0\u0010\u001dR\u0017\u0010\r\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b1\u0010*\u001a\u0004\b2\u0010\u0019R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b3\u0010\u001b\u001a\u0004\b4\u0010\u001dR\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b5\u0010\u001b\u001a\u0004\b6\u0010\u001dR\"\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b7\u00108\u0012\u0004\b;\u0010(\u001a\u0004\b9\u0010:R \u0010\u0012\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b<\u0010\u001b\u0012\u0004\b>\u0010(\u001a\u0004\b=\u0010\u001dR \u0010\u0013\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b?\u0010\u001b\u0012\u0004\bA\u0010(\u001a\u0004\b@\u0010\u001dR(\u0010\u0015\u001a\u00020\u00148\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\bB\u0010C\u0012\u0004\bH\u0010(\u001a\u0004\bD\u0010E\"\u0004\bF\u0010G¨\u0006I"}, m28850d2 = {"Lkotlinx/serialization/json/JsonConfiguration;", "", "", "encodeDefaults", "ignoreUnknownKeys", "isLenient", "allowStructuredMapKeys", "prettyPrint", "explicitNulls", "", "prettyPrintIndent", "coerceInputValues", "useArrayPolymorphism", "classDiscriminator", "allowSpecialFloatingPointValues", "useAlternativeNames", "Lkotlinx/serialization/json/JsonNamingStrategy;", "namingStrategy", "decodeEnumsCaseInsensitive", "allowTrailingComma", "Lkotlinx/serialization/json/ClassDiscriminatorMode;", "classDiscriminatorMode", "<init>", "(ZZZZZZLjava/lang/String;ZZLjava/lang/String;ZZLkotlinx/serialization/json/JsonNamingStrategy;ZZLkotlinx/serialization/json/ClassDiscriminatorMode;)V", "toString", "()Ljava/lang/String;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Z", "getEncodeDefaults", "()Z", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getIgnoreUnknownKeys", OperatorName.CURVE_TO, "d", "getAllowStructuredMapKeys", "e", "getPrettyPrint", OperatorName.FILL_NON_ZERO, "getExplicitNulls", "getExplicitNulls$annotations", "()V", OperatorName.NON_STROKING_GRAY, "Ljava/lang/String;", "getPrettyPrintIndent", "getPrettyPrintIndent$annotations", OperatorName.CLOSE_PATH, "getCoerceInputValues", "i", "getUseArrayPolymorphism", OperatorName.SET_LINE_JOINSTYLE, "getClassDiscriminator", OperatorName.NON_STROKING_CMYK, "getAllowSpecialFloatingPointValues", OperatorName.LINE_TO, "getUseAlternativeNames", OperatorName.MOVE_TO, "Lkotlinx/serialization/json/JsonNamingStrategy;", "getNamingStrategy", "()Lkotlinx/serialization/json/JsonNamingStrategy;", "getNamingStrategy$annotations", OperatorName.ENDPATH, "getDecodeEnumsCaseInsensitive", "getDecodeEnumsCaseInsensitive$annotations", "o", "getAllowTrailingComma", "getAllowTrailingComma$annotations", "p", "Lkotlinx/serialization/json/ClassDiscriminatorMode;", "getClassDiscriminatorMode", "()Lkotlinx/serialization/json/ClassDiscriminatorMode;", "setClassDiscriminatorMode", "(Lkotlinx/serialization/json/ClassDiscriminatorMode;)V", "getClassDiscriminatorMode$annotations", "kotlinx-serialization-json"}, m28849k = 1, m28848mv = {1, 9, 0})
/* loaded from: classes6.dex */
public final class JsonConfiguration {

    /* renamed from: a */
    public final boolean f71311a;

    /* renamed from: b */
    public final boolean f71312b;

    /* renamed from: c */
    public final boolean f71313c;

    /* renamed from: d */
    public final boolean f71314d;

    /* renamed from: e */
    public final boolean f71315e;

    /* renamed from: f */
    public final boolean f71316f;

    /* renamed from: g */
    public final String f71317g;

    /* renamed from: h */
    public final boolean f71318h;

    /* renamed from: i */
    public final boolean f71319i;

    /* renamed from: j */
    public final String f71320j;

    /* renamed from: k */
    public final boolean f71321k;

    /* renamed from: l */
    public final boolean f71322l;

    /* renamed from: m */
    public final JsonNamingStrategy f71323m;

    /* renamed from: n */
    public final boolean f71324n;

    /* renamed from: o */
    public final boolean f71325o;

    /* renamed from: p */
    public ClassDiscriminatorMode f71326p;

    public JsonConfiguration() {
        this(false, false, false, false, false, false, null, false, false, null, false, false, null, false, false, null, 65535, null);
    }

    @ExperimentalSerializationApi
    public static /* synthetic */ void getAllowTrailingComma$annotations() {
    }

    @ExperimentalSerializationApi
    public static /* synthetic */ void getClassDiscriminatorMode$annotations() {
    }

    @ExperimentalSerializationApi
    public static /* synthetic */ void getDecodeEnumsCaseInsensitive$annotations() {
    }

    @ExperimentalSerializationApi
    public static /* synthetic */ void getExplicitNulls$annotations() {
    }

    @ExperimentalSerializationApi
    public static /* synthetic */ void getNamingStrategy$annotations() {
    }

    @ExperimentalSerializationApi
    public static /* synthetic */ void getPrettyPrintIndent$annotations() {
    }

    public final boolean getAllowSpecialFloatingPointValues() {
        return this.f71321k;
    }

    public final boolean getAllowStructuredMapKeys() {
        return this.f71314d;
    }

    public final boolean getAllowTrailingComma() {
        return this.f71325o;
    }

    @NotNull
    public final String getClassDiscriminator() {
        return this.f71320j;
    }

    @NotNull
    public final ClassDiscriminatorMode getClassDiscriminatorMode() {
        return this.f71326p;
    }

    public final boolean getCoerceInputValues() {
        return this.f71318h;
    }

    public final boolean getDecodeEnumsCaseInsensitive() {
        return this.f71324n;
    }

    public final boolean getEncodeDefaults() {
        return this.f71311a;
    }

    public final boolean getExplicitNulls() {
        return this.f71316f;
    }

    public final boolean getIgnoreUnknownKeys() {
        return this.f71312b;
    }

    @Nullable
    public final JsonNamingStrategy getNamingStrategy() {
        return this.f71323m;
    }

    public final boolean getPrettyPrint() {
        return this.f71315e;
    }

    @NotNull
    public final String getPrettyPrintIndent() {
        return this.f71317g;
    }

    public final boolean getUseAlternativeNames() {
        return this.f71322l;
    }

    public final boolean getUseArrayPolymorphism() {
        return this.f71319i;
    }

    public final boolean isLenient() {
        return this.f71313c;
    }

    public final void setClassDiscriminatorMode(@NotNull ClassDiscriminatorMode classDiscriminatorMode) {
        Intrinsics.checkNotNullParameter(classDiscriminatorMode, "<set-?>");
        this.f71326p = classDiscriminatorMode;
    }

    @NotNull
    public String toString() {
        return "JsonConfiguration(encodeDefaults=" + this.f71311a + ", ignoreUnknownKeys=" + this.f71312b + ", isLenient=" + this.f71313c + ", allowStructuredMapKeys=" + this.f71314d + ", prettyPrint=" + this.f71315e + ", explicitNulls=" + this.f71316f + ", prettyPrintIndent='" + this.f71317g + "', coerceInputValues=" + this.f71318h + ", useArrayPolymorphism=" + this.f71319i + ", classDiscriminator='" + this.f71320j + "', allowSpecialFloatingPointValues=" + this.f71321k + ", useAlternativeNames=" + this.f71322l + ", namingStrategy=" + this.f71323m + ", decodeEnumsCaseInsensitive=" + this.f71324n + ", allowTrailingComma=" + this.f71325o + ", classDiscriminatorMode=" + this.f71326p + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public JsonConfiguration(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, @NotNull String prettyPrintIndent, boolean z7, boolean z8, @NotNull String classDiscriminator, boolean z9, boolean z10, @Nullable JsonNamingStrategy jsonNamingStrategy, boolean z11, boolean z12, @NotNull ClassDiscriminatorMode classDiscriminatorMode) {
        Intrinsics.checkNotNullParameter(prettyPrintIndent, "prettyPrintIndent");
        Intrinsics.checkNotNullParameter(classDiscriminator, "classDiscriminator");
        Intrinsics.checkNotNullParameter(classDiscriminatorMode, "classDiscriminatorMode");
        this.f71311a = z;
        this.f71312b = z2;
        this.f71313c = z3;
        this.f71314d = z4;
        this.f71315e = z5;
        this.f71316f = z6;
        this.f71317g = prettyPrintIndent;
        this.f71318h = z7;
        this.f71319i = z8;
        this.f71320j = classDiscriminator;
        this.f71321k = z9;
        this.f71322l = z10;
        this.f71323m = jsonNamingStrategy;
        this.f71324n = z11;
        this.f71325o = z12;
        this.f71326p = classDiscriminatorMode;
    }

    public /* synthetic */ JsonConfiguration(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, String str, boolean z7, boolean z8, String str2, boolean z9, boolean z10, JsonNamingStrategy jsonNamingStrategy, boolean z11, boolean z12, ClassDiscriminatorMode classDiscriminatorMode, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? false : z3, (i & 8) != 0 ? false : z4, (i & 16) != 0 ? false : z5, (i & 32) != 0 ? true : z6, (i & 64) != 0 ? "    " : str, (i & 128) != 0 ? false : z7, (i & 256) != 0 ? false : z8, (i & 512) != 0 ? "type" : str2, (i & 1024) != 0 ? false : z9, (i & 2048) == 0 ? z10 : true, (i & 4096) != 0 ? null : jsonNamingStrategy, (i & 8192) != 0 ? false : z11, (i & 16384) != 0 ? false : z12, (i & 32768) != 0 ? ClassDiscriminatorMode.POLYMORPHIC : classDiscriminatorMode);
    }
}
