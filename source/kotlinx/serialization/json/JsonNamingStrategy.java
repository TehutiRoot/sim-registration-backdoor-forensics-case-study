package kotlinx.serialization.json;

import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt___StringsKt;
import kotlinx.serialization.ExperimentalSerializationApi;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonNamingStrategy;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\bç\u0080\u0001\u0018\u0000 \t2\u00020\u0001:\u0001\tJ \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0003H&¨\u0006\n"}, m28850d2 = {"Lkotlinx/serialization/json/JsonNamingStrategy;", "", "serialNameForJson", "", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "elementIndex", "", "serialName", "Builtins", "kotlinx-serialization-json"}, m28849k = 1, m28848mv = {1, 9, 0}, m28846xi = 48)
@ExperimentalSerializationApi
/* loaded from: classes6.dex */
public interface JsonNamingStrategy {
    @NotNull
    public static final Builtins Builtins = Builtins.f71336a;

    @Metadata(m28851d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tR \u0010\u0010\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u0012\u0004\b\u000f\u0010\u0003\u001a\u0004\b\r\u0010\u000eR \u0010\u0014\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010\f\u0012\u0004\b\u0013\u0010\u0003\u001a\u0004\b\u0012\u0010\u000e¨\u0006\u0015"}, m28850d2 = {"Lkotlinx/serialization/json/JsonNamingStrategy$Builtins;", "", "<init>", "()V", "", "serialName", "", "delimiter", PDPageLabelRange.STYLE_LETTERS_LOWER, "(Ljava/lang/String;C)Ljava/lang/String;", "Lkotlinx/serialization/json/JsonNamingStrategy;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lkotlinx/serialization/json/JsonNamingStrategy;", "getSnakeCase", "()Lkotlinx/serialization/json/JsonNamingStrategy;", "getSnakeCase$annotations", "SnakeCase", OperatorName.CURVE_TO, "getKebabCase", "getKebabCase$annotations", "KebabCase", "kotlinx-serialization-json"}, m28849k = 1, m28848mv = {1, 9, 0})
    @ExperimentalSerializationApi
    @SourceDebugExtension({"SMAP\nJsonNamingStrategy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JsonNamingStrategy.kt\nkotlinx/serialization/json/JsonNamingStrategy$Builtins\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,178:1\n1174#2:179\n1175#2:181\n1#3:180\n*S KotlinDebug\n*F\n+ 1 JsonNamingStrategy.kt\nkotlinx/serialization/json/JsonNamingStrategy$Builtins\n*L\n149#1:179\n149#1:181\n*E\n"})
    /* loaded from: classes6.dex */
    public static final class Builtins {

        /* renamed from: a */
        public static final /* synthetic */ Builtins f71336a = new Builtins();

        /* renamed from: b */
        public static final JsonNamingStrategy f71337b = new JsonNamingStrategy() { // from class: kotlinx.serialization.json.JsonNamingStrategy$Builtins$SnakeCase$1
            @Override // kotlinx.serialization.json.JsonNamingStrategy
            @NotNull
            public String serialNameForJson(@NotNull SerialDescriptor descriptor, int i, @NotNull String serialName) {
                Intrinsics.checkNotNullParameter(descriptor, "descriptor");
                Intrinsics.checkNotNullParameter(serialName, "serialName");
                return JsonNamingStrategy.Builtins.access$convertCamelCase(JsonNamingStrategy.Builtins.f71336a, serialName, '_');
            }

            @NotNull
            public String toString() {
                return "kotlinx.serialization.json.JsonNamingStrategy.SnakeCase";
            }
        };

        /* renamed from: c */
        public static final JsonNamingStrategy f71338c = new JsonNamingStrategy() { // from class: kotlinx.serialization.json.JsonNamingStrategy$Builtins$KebabCase$1
            @Override // kotlinx.serialization.json.JsonNamingStrategy
            @NotNull
            public String serialNameForJson(@NotNull SerialDescriptor descriptor, int i, @NotNull String serialName) {
                Intrinsics.checkNotNullParameter(descriptor, "descriptor");
                Intrinsics.checkNotNullParameter(serialName, "serialName");
                return JsonNamingStrategy.Builtins.access$convertCamelCase(JsonNamingStrategy.Builtins.f71336a, serialName, '-');
            }

            @NotNull
            public String toString() {
                return "kotlinx.serialization.json.JsonNamingStrategy.KebabCase";
            }
        };

        public static final /* synthetic */ String access$convertCamelCase(Builtins builtins, String str, char c) {
            return builtins.m26682a(str, c);
        }

        @ExperimentalSerializationApi
        public static /* synthetic */ void getKebabCase$annotations() {
        }

        @ExperimentalSerializationApi
        public static /* synthetic */ void getSnakeCase$annotations() {
        }

        /* renamed from: a */
        public final String m26682a(String str, char c) {
            StringBuilder sb = new StringBuilder(str.length() * 2);
            Character ch2 = null;
            int i = 0;
            for (int i2 = 0; i2 < str.length(); i2++) {
                char charAt = str.charAt(i2);
                if (Character.isUpperCase(charAt)) {
                    if (i == 0 && sb.length() > 0 && StringsKt___StringsKt.last(sb) != c) {
                        sb.append(c);
                    }
                    if (ch2 != null) {
                        sb.append(ch2.charValue());
                    }
                    i++;
                    ch2 = Character.valueOf(Character.toLowerCase(charAt));
                } else {
                    if (ch2 != null) {
                        if (i > 1 && Character.isLetter(charAt)) {
                            sb.append(c);
                        }
                        sb.append(ch2);
                        ch2 = null;
                        i = 0;
                    }
                    sb.append(charAt);
                }
            }
            if (ch2 != null) {
                sb.append(ch2);
            }
            String sb2 = sb.toString();
            Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
            return sb2;
        }

        @NotNull
        public final JsonNamingStrategy getKebabCase() {
            return f71338c;
        }

        @NotNull
        public final JsonNamingStrategy getSnakeCase() {
            return f71337b;
        }
    }

    @NotNull
    String serialNameForJson(@NotNull SerialDescriptor serialDescriptor, int i, @NotNull String str);
}
