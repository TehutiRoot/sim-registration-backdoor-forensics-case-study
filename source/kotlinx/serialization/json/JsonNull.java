package kotlinx.serialization.json;

import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004HÆ\u0001¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\f\u001a\u00020\u00078\u0016X\u0096D¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m28850d2 = {"Lkotlinx/serialization/json/JsonNull;", "Lkotlinx/serialization/json/JsonPrimitive;", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/lang/String;", "getContent", "()Ljava/lang/String;", "content", "", "isString", "()Z", "kotlinx-serialization-json"}, m28849k = 1, m28848mv = {1, 9, 0})
@Serializable(with = JsonNullSerializer.class)
/* loaded from: classes6.dex */
public final class JsonNull extends JsonPrimitive {
    @NotNull
    public static final JsonNull INSTANCE = new JsonNull();

    /* renamed from: a */
    public static final String f71339a = AbstractJsonLexerKt.NULL;

    /* renamed from: b */
    public static final /* synthetic */ Lazy f71340b = LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) C121701.INSTANCE);

    @Metadata(m28849k = 3, m28848mv = {1, 9, 0}, m28846xi = 48)
    /* renamed from: kotlinx.serialization.json.JsonNull$1 */
    /* loaded from: classes6.dex */
    public static final class C121701 extends Lambda implements Function0<KSerializer<Object>> {
        public static final C121701 INSTANCE = new C121701();

        public C121701() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final KSerializer<Object> invoke() {
            return JsonNullSerializer.INSTANCE;
        }
    }

    public JsonNull() {
        super(null);
    }

    /* renamed from: a */
    public final /* synthetic */ KSerializer m26681a() {
        return (KSerializer) f71340b.getValue();
    }

    @Override // kotlinx.serialization.json.JsonPrimitive
    @NotNull
    public String getContent() {
        return f71339a;
    }

    @Override // kotlinx.serialization.json.JsonPrimitive
    public boolean isString() {
        return false;
    }

    @NotNull
    public final KSerializer<JsonNull> serializer() {
        return m26681a();
    }
}
