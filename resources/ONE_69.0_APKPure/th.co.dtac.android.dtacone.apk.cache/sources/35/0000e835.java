package kotlinx.serialization.json;

import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.ExperimentalSerializationApi;
import kotlinx.serialization.modules.SerializersModule;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m29143d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u001c\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\t\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u0007\u0010\bR\"\u0010\u0011\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R(\u0010\u0017\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0012\u0010\f\u0012\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u000e\"\u0004\b\u0014\u0010\u0010R\"\u0010\u001b\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\f\u001a\u0004\b\u0019\u0010\u000e\"\u0004\b\u001a\u0010\u0010R\"\u0010\u001d\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\f\u001a\u0004\b\u001d\u0010\u000e\"\u0004\b\u001e\u0010\u0010R\"\u0010\"\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\f\u001a\u0004\b \u0010\u000e\"\u0004\b!\u0010\u0010R\"\u0010&\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010\f\u001a\u0004\b$\u0010\u000e\"\u0004\b%\u0010\u0010R(\u0010/\u001a\u00020'8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b(\u0010)\u0012\u0004\b.\u0010\u0016\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\"\u00103\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b0\u0010\f\u001a\u0004\b1\u0010\u000e\"\u0004\b2\u0010\u0010R\"\u00107\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b4\u0010\f\u001a\u0004\b5\u0010\u000e\"\u0004\b6\u0010\u0010R\"\u0010;\u001a\u00020'8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b8\u0010)\u001a\u0004\b9\u0010+\"\u0004\b:\u0010-R\"\u0010C\u001a\u00020<8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\"\u0010G\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bD\u0010\f\u001a\u0004\bE\u0010\u000e\"\u0004\bF\u0010\u0010R\"\u0010K\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bH\u0010\f\u001a\u0004\bI\u0010\u000e\"\u0004\bJ\u0010\u0010R*\u0010T\u001a\u0004\u0018\u00010L8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\bM\u0010N\u0012\u0004\bS\u0010\u0016\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010RR(\u0010Y\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\bU\u0010\f\u0012\u0004\bX\u0010\u0016\u001a\u0004\bV\u0010\u000e\"\u0004\bW\u0010\u0010R(\u0010^\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\bZ\u0010\f\u0012\u0004\b]\u0010\u0016\u001a\u0004\b[\u0010\u000e\"\u0004\b\\\u0010\u0010R\"\u0010f\u001a\u00020_8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b`\u0010a\u001a\u0004\bb\u0010c\"\u0004\bd\u0010e¨\u0006g"}, m29142d2 = {"Lkotlinx/serialization/json/JsonBuilder;", "", "Lkotlinx/serialization/json/Json;", "json", "<init>", "(Lkotlinx/serialization/json/Json;)V", "Lkotlinx/serialization/json/JsonConfiguration;", "build$kotlinx_serialization_json", "()Lkotlinx/serialization/json/JsonConfiguration;", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "", PDPageLabelRange.STYLE_LETTERS_LOWER, "Z", "getEncodeDefaults", "()Z", "setEncodeDefaults", "(Z)V", "encodeDefaults", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getExplicitNulls", "setExplicitNulls", "getExplicitNulls$annotations", "()V", "explicitNulls", OperatorName.CURVE_TO, "getIgnoreUnknownKeys", "setIgnoreUnknownKeys", "ignoreUnknownKeys", "d", "isLenient", "setLenient", "e", "getAllowStructuredMapKeys", "setAllowStructuredMapKeys", "allowStructuredMapKeys", OperatorName.FILL_NON_ZERO, "getPrettyPrint", "setPrettyPrint", "prettyPrint", "", OperatorName.NON_STROKING_GRAY, "Ljava/lang/String;", "getPrettyPrintIndent", "()Ljava/lang/String;", "setPrettyPrintIndent", "(Ljava/lang/String;)V", "getPrettyPrintIndent$annotations", "prettyPrintIndent", OperatorName.CLOSE_PATH, "getCoerceInputValues", "setCoerceInputValues", "coerceInputValues", "i", "getUseArrayPolymorphism", "setUseArrayPolymorphism", "useArrayPolymorphism", OperatorName.SET_LINE_JOINSTYLE, "getClassDiscriminator", "setClassDiscriminator", "classDiscriminator", "Lkotlinx/serialization/json/ClassDiscriminatorMode;", OperatorName.NON_STROKING_CMYK, "Lkotlinx/serialization/json/ClassDiscriminatorMode;", "getClassDiscriminatorMode", "()Lkotlinx/serialization/json/ClassDiscriminatorMode;", "setClassDiscriminatorMode", "(Lkotlinx/serialization/json/ClassDiscriminatorMode;)V", "classDiscriminatorMode", OperatorName.LINE_TO, "getAllowSpecialFloatingPointValues", "setAllowSpecialFloatingPointValues", "allowSpecialFloatingPointValues", OperatorName.MOVE_TO, "getUseAlternativeNames", "setUseAlternativeNames", "useAlternativeNames", "Lkotlinx/serialization/json/JsonNamingStrategy;", OperatorName.ENDPATH, "Lkotlinx/serialization/json/JsonNamingStrategy;", "getNamingStrategy", "()Lkotlinx/serialization/json/JsonNamingStrategy;", "setNamingStrategy", "(Lkotlinx/serialization/json/JsonNamingStrategy;)V", "getNamingStrategy$annotations", "namingStrategy", "o", "getDecodeEnumsCaseInsensitive", "setDecodeEnumsCaseInsensitive", "getDecodeEnumsCaseInsensitive$annotations", "decodeEnumsCaseInsensitive", "p", "getAllowTrailingComma", "setAllowTrailingComma", "getAllowTrailingComma$annotations", "allowTrailingComma", "Lkotlinx/serialization/modules/SerializersModule;", OperatorName.SAVE, "Lkotlinx/serialization/modules/SerializersModule;", "getSerializersModule", "()Lkotlinx/serialization/modules/SerializersModule;", "setSerializersModule", "(Lkotlinx/serialization/modules/SerializersModule;)V", "serializersModule", "kotlinx-serialization-json"}, m29141k = 1, m29140mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nJson.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Json.kt\nkotlinx/serialization/json/JsonBuilder\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,451:1\n1064#2,2:452\n*S KotlinDebug\n*F\n+ 1 Json.kt\nkotlinx/serialization/json/JsonBuilder\n*L\n414#1:452,2\n*E\n"})
/* loaded from: classes6.dex */
public final class JsonBuilder {

    /* renamed from: a */
    public boolean f71327a;

    /* renamed from: b */
    public boolean f71328b;

    /* renamed from: c */
    public boolean f71329c;

    /* renamed from: d */
    public boolean f71330d;

    /* renamed from: e */
    public boolean f71331e;

    /* renamed from: f */
    public boolean f71332f;

    /* renamed from: g */
    public String f71333g;

    /* renamed from: h */
    public boolean f71334h;

    /* renamed from: i */
    public boolean f71335i;

    /* renamed from: j */
    public String f71336j;

    /* renamed from: k */
    public ClassDiscriminatorMode f71337k;

    /* renamed from: l */
    public boolean f71338l;

    /* renamed from: m */
    public boolean f71339m;

    /* renamed from: n */
    public JsonNamingStrategy f71340n;

    /* renamed from: o */
    public boolean f71341o;

    /* renamed from: p */
    public boolean f71342p;

    /* renamed from: q */
    public SerializersModule f71343q;

    public JsonBuilder(@NotNull Json json) {
        Intrinsics.checkNotNullParameter(json, "json");
        this.f71327a = json.getConfiguration().getEncodeDefaults();
        this.f71328b = json.getConfiguration().getExplicitNulls();
        this.f71329c = json.getConfiguration().getIgnoreUnknownKeys();
        this.f71330d = json.getConfiguration().isLenient();
        this.f71331e = json.getConfiguration().getAllowStructuredMapKeys();
        this.f71332f = json.getConfiguration().getPrettyPrint();
        this.f71333g = json.getConfiguration().getPrettyPrintIndent();
        this.f71334h = json.getConfiguration().getCoerceInputValues();
        this.f71335i = json.getConfiguration().getUseArrayPolymorphism();
        this.f71336j = json.getConfiguration().getClassDiscriminator();
        this.f71337k = json.getConfiguration().getClassDiscriminatorMode();
        this.f71338l = json.getConfiguration().getAllowSpecialFloatingPointValues();
        this.f71339m = json.getConfiguration().getUseAlternativeNames();
        this.f71340n = json.getConfiguration().getNamingStrategy();
        this.f71341o = json.getConfiguration().getDecodeEnumsCaseInsensitive();
        this.f71342p = json.getConfiguration().getAllowTrailingComma();
        this.f71343q = json.getSerializersModule();
    }

    @ExperimentalSerializationApi
    public static /* synthetic */ void getAllowTrailingComma$annotations() {
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

    @NotNull
    public final JsonConfiguration build$kotlinx_serialization_json() {
        if (this.f71335i) {
            if (Intrinsics.areEqual(this.f71336j, "type")) {
                if (this.f71337k != ClassDiscriminatorMode.POLYMORPHIC) {
                    throw new IllegalArgumentException("useArrayPolymorphism option can only be used if classDiscriminatorMode in a default POLYMORPHIC state.".toString());
                }
            } else {
                throw new IllegalArgumentException("Class discriminator should not be specified when array polymorphism is specified".toString());
            }
        }
        if (!this.f71332f) {
            if (!Intrinsics.areEqual(this.f71333g, "    ")) {
                throw new IllegalArgumentException("Indent should not be specified when default printing mode is used".toString());
            }
        } else if (!Intrinsics.areEqual(this.f71333g, "    ")) {
            String str = this.f71333g;
            for (int i = 0; i < str.length(); i++) {
                char charAt = str.charAt(i);
                if (charAt != ' ' && charAt != '\t' && charAt != '\r' && charAt != '\n') {
                    throw new IllegalArgumentException(("Only whitespace, tab, newline and carriage return are allowed as pretty print symbols. Had " + this.f71333g).toString());
                }
            }
        }
        return new JsonConfiguration(this.f71327a, this.f71329c, this.f71330d, this.f71331e, this.f71332f, this.f71328b, this.f71333g, this.f71334h, this.f71335i, this.f71336j, this.f71338l, this.f71339m, this.f71340n, this.f71341o, this.f71342p, this.f71337k);
    }

    public final boolean getAllowSpecialFloatingPointValues() {
        return this.f71338l;
    }

    public final boolean getAllowStructuredMapKeys() {
        return this.f71331e;
    }

    public final boolean getAllowTrailingComma() {
        return this.f71342p;
    }

    @NotNull
    public final String getClassDiscriminator() {
        return this.f71336j;
    }

    @NotNull
    public final ClassDiscriminatorMode getClassDiscriminatorMode() {
        return this.f71337k;
    }

    public final boolean getCoerceInputValues() {
        return this.f71334h;
    }

    public final boolean getDecodeEnumsCaseInsensitive() {
        return this.f71341o;
    }

    public final boolean getEncodeDefaults() {
        return this.f71327a;
    }

    public final boolean getExplicitNulls() {
        return this.f71328b;
    }

    public final boolean getIgnoreUnknownKeys() {
        return this.f71329c;
    }

    @Nullable
    public final JsonNamingStrategy getNamingStrategy() {
        return this.f71340n;
    }

    public final boolean getPrettyPrint() {
        return this.f71332f;
    }

    @NotNull
    public final String getPrettyPrintIndent() {
        return this.f71333g;
    }

    @NotNull
    public final SerializersModule getSerializersModule() {
        return this.f71343q;
    }

    public final boolean getUseAlternativeNames() {
        return this.f71339m;
    }

    public final boolean getUseArrayPolymorphism() {
        return this.f71335i;
    }

    public final boolean isLenient() {
        return this.f71330d;
    }

    public final void setAllowSpecialFloatingPointValues(boolean z) {
        this.f71338l = z;
    }

    public final void setAllowStructuredMapKeys(boolean z) {
        this.f71331e = z;
    }

    public final void setAllowTrailingComma(boolean z) {
        this.f71342p = z;
    }

    public final void setClassDiscriminator(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f71336j = str;
    }

    public final void setClassDiscriminatorMode(@NotNull ClassDiscriminatorMode classDiscriminatorMode) {
        Intrinsics.checkNotNullParameter(classDiscriminatorMode, "<set-?>");
        this.f71337k = classDiscriminatorMode;
    }

    public final void setCoerceInputValues(boolean z) {
        this.f71334h = z;
    }

    public final void setDecodeEnumsCaseInsensitive(boolean z) {
        this.f71341o = z;
    }

    public final void setEncodeDefaults(boolean z) {
        this.f71327a = z;
    }

    public final void setExplicitNulls(boolean z) {
        this.f71328b = z;
    }

    public final void setIgnoreUnknownKeys(boolean z) {
        this.f71329c = z;
    }

    public final void setLenient(boolean z) {
        this.f71330d = z;
    }

    public final void setNamingStrategy(@Nullable JsonNamingStrategy jsonNamingStrategy) {
        this.f71340n = jsonNamingStrategy;
    }

    public final void setPrettyPrint(boolean z) {
        this.f71332f = z;
    }

    public final void setPrettyPrintIndent(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f71333g = str;
    }

    public final void setSerializersModule(@NotNull SerializersModule serializersModule) {
        Intrinsics.checkNotNullParameter(serializersModule, "<set-?>");
        this.f71343q = serializersModule;
    }

    public final void setUseAlternativeNames(boolean z) {
        this.f71339m = z;
    }

    public final void setUseArrayPolymorphism(boolean z) {
        this.f71335i = z;
    }
}