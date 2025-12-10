package kotlinx.serialization.json.internal;

import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.DeepRecursiveFunction;
import kotlin.DeepRecursiveKt;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonConfiguration;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonLiteral;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\nJ \u0010\u000e\u001a\u00020\b*\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\b0\fH\u0082@¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0010\u0010\nJ\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0016\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0018R\u0016\u0010\u001d\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u001c¨\u0006\u001e"}, m28850d2 = {"Lkotlinx/serialization/json/internal/JsonTreeReader;", "", "Lkotlinx/serialization/json/JsonConfiguration;", "configuration", "Lkotlinx/serialization/json/internal/AbstractJsonLexer;", "lexer", "<init>", "(Lkotlinx/serialization/json/JsonConfiguration;Lkotlinx/serialization/json/internal/AbstractJsonLexer;)V", "Lkotlinx/serialization/json/JsonElement;", "read", "()Lkotlinx/serialization/json/JsonElement;", "d", "Lkotlin/DeepRecursiveScope;", "", OperatorName.CURVE_TO, "(Lkotlin/DeepRecursiveScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", PDPageLabelRange.STYLE_LETTERS_LOWER, "", "isString", "Lkotlinx/serialization/json/JsonPrimitive;", "e", "(Z)Lkotlinx/serialization/json/JsonPrimitive;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lkotlinx/serialization/json/internal/AbstractJsonLexer;", "Z", "isLenient", "trailingCommaAllowed", "", "I", "stackDepth", "kotlinx-serialization-json"}, m28849k = 1, m28848mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nJsonTreeReader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JsonTreeReader.kt\nkotlinx/serialization/json/internal/JsonTreeReader\n+ 2 AbstractJsonLexer.kt\nkotlinx/serialization/json/internal/AbstractJsonLexer\n*L\n1#1,121:1\n27#1,25:122\n27#1,25:147\n531#2,3:172\n*S KotlinDebug\n*F\n+ 1 JsonTreeReader.kt\nkotlinx/serialization/json/internal/JsonTreeReader\n*L\n19#1:122,25\n24#1:147,25\n64#1:172,3\n*E\n"})
/* loaded from: classes6.dex */
public final class JsonTreeReader {

    /* renamed from: a */
    public final AbstractJsonLexer f71399a;

    /* renamed from: b */
    public final boolean f71400b;

    /* renamed from: c */
    public final boolean f71401c;

    /* renamed from: d */
    public int f71402d;

    public JsonTreeReader(@NotNull JsonConfiguration configuration, @NotNull AbstractJsonLexer lexer) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(lexer, "lexer");
        this.f71399a = lexer;
        this.f71400b = configuration.isLenient();
        this.f71401c = configuration.getAllowTrailingComma();
    }

    /* renamed from: a */
    public final JsonElement m26625a() {
        boolean z;
        byte consumeNextToken = this.f71399a.consumeNextToken();
        if (this.f71399a.peekNextToken() != 4) {
            ArrayList arrayList = new ArrayList();
            while (this.f71399a.canConsumeValue()) {
                arrayList.add(read());
                consumeNextToken = this.f71399a.consumeNextToken();
                if (consumeNextToken != 4) {
                    AbstractJsonLexer abstractJsonLexer = this.f71399a;
                    if (consumeNextToken == 9) {
                        z = true;
                    } else {
                        z = false;
                    }
                    int i = abstractJsonLexer.currentPosition;
                    if (!z) {
                        AbstractJsonLexer.fail$default(abstractJsonLexer, "Expected end of the array or comma", i, null, 4, null);
                        throw new KotlinNothingValueException();
                    }
                }
            }
            if (consumeNextToken == 8) {
                this.f71399a.consumeNextToken((byte) 9);
            } else if (consumeNextToken == 4) {
                if (this.f71401c) {
                    this.f71399a.consumeNextToken((byte) 9);
                } else {
                    JsonExceptionsKt.invalidTrailingComma(this.f71399a, "array");
                    throw new KotlinNothingValueException();
                }
            }
            return new JsonArray(arrayList);
        }
        AbstractJsonLexer.fail$default(this.f71399a, "Unexpected leading comma", 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    /* renamed from: b */
    public final JsonElement m26624b() {
        return (JsonElement) DeepRecursiveKt.invoke(new DeepRecursiveFunction(new JsonTreeReader$readDeepRecursive$1(this, null)), Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d0  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0096 -> B:27:0x00a0). Please submit an issue!!! */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m26623c(kotlin.DeepRecursiveScope r21, kotlin.coroutines.Continuation r22) {
        /*
            Method dump skipped, instructions count: 255
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.serialization.json.internal.JsonTreeReader.m26623c(kotlin.DeepRecursiveScope, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* renamed from: d */
    public final JsonElement m26622d() {
        String consumeString;
        byte consumeNextToken = this.f71399a.consumeNextToken((byte) 6);
        if (this.f71399a.peekNextToken() != 4) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            while (true) {
                if (!this.f71399a.canConsumeValue()) {
                    break;
                }
                if (this.f71400b) {
                    consumeString = this.f71399a.consumeStringLenient();
                } else {
                    consumeString = this.f71399a.consumeString();
                }
                this.f71399a.consumeNextToken((byte) 5);
                linkedHashMap.put(consumeString, read());
                consumeNextToken = this.f71399a.consumeNextToken();
                if (consumeNextToken != 4) {
                    if (consumeNextToken != 7) {
                        AbstractJsonLexer.fail$default(this.f71399a, "Expected end of the object or comma", 0, null, 6, null);
                        throw new KotlinNothingValueException();
                    }
                }
            }
            if (consumeNextToken == 6) {
                this.f71399a.consumeNextToken((byte) 7);
            } else if (consumeNextToken == 4) {
                if (this.f71401c) {
                    this.f71399a.consumeNextToken((byte) 7);
                } else {
                    JsonExceptionsKt.invalidTrailingComma$default(this.f71399a, null, 1, null);
                    throw new KotlinNothingValueException();
                }
            }
            return new JsonObject(linkedHashMap);
        }
        AbstractJsonLexer.fail$default(this.f71399a, "Unexpected leading comma", 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    /* renamed from: e */
    public final JsonPrimitive m26621e(boolean z) {
        String consumeStringLenient;
        if (!this.f71400b && z) {
            consumeStringLenient = this.f71399a.consumeString();
        } else {
            consumeStringLenient = this.f71399a.consumeStringLenient();
        }
        String str = consumeStringLenient;
        if (!z && Intrinsics.areEqual(str, AbstractJsonLexerKt.NULL)) {
            return JsonNull.INSTANCE;
        }
        return new JsonLiteral(str, z, null, 4, null);
    }

    @NotNull
    public final JsonElement read() {
        JsonElement m26622d;
        byte peekNextToken = this.f71399a.peekNextToken();
        if (peekNextToken == 1) {
            return m26621e(true);
        }
        if (peekNextToken == 0) {
            return m26621e(false);
        }
        if (peekNextToken == 6) {
            int i = this.f71402d + 1;
            this.f71402d = i;
            if (i == 200) {
                m26622d = m26624b();
            } else {
                m26622d = m26622d();
            }
            this.f71402d--;
            return m26622d;
        } else if (peekNextToken == 8) {
            return m26625a();
        } else {
            AbstractJsonLexer.fail$default(this.f71399a, "Cannot read Json element because of unexpected " + AbstractJsonLexerKt.tokenDescription(peekNextToken), 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
    }
}
