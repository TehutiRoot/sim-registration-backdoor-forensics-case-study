package kotlinx.serialization.json.internal;

import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.Iterator;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.json.DecodeSequenceMode;
import kotlinx.serialization.json.Json;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u00002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\u001aA\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u001b\u0010\u000e\u001a\u00020\u0001*\u00020\f2\u0006\u0010\r\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0013\u0010\u0011\u001a\u00020\u0010*\u00020\fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m28850d2 = {"T", "Lkotlinx/serialization/json/DecodeSequenceMode;", "mode", "Lkotlinx/serialization/json/Json;", "json", "Lkotlinx/serialization/json/internal/ReaderJsonLexer;", "lexer", "Lkotlinx/serialization/DeserializationStrategy;", "deserializer", "", "JsonIterator", "(Lkotlinx/serialization/json/DecodeSequenceMode;Lkotlinx/serialization/json/Json;Lkotlinx/serialization/json/internal/ReaderJsonLexer;Lkotlinx/serialization/DeserializationStrategy;)Ljava/util/Iterator;", "Lkotlinx/serialization/json/internal/AbstractJsonLexer;", "suggested", PDPageLabelRange.STYLE_LETTERS_LOWER, "(Lkotlinx/serialization/json/internal/AbstractJsonLexer;Lkotlinx/serialization/json/DecodeSequenceMode;)Lkotlinx/serialization/json/DecodeSequenceMode;", "", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "(Lkotlinx/serialization/json/internal/AbstractJsonLexer;)Z", "kotlinx-serialization-json"}, m28849k = 2, m28848mv = {1, 9, 0})
/* loaded from: classes6.dex */
public final class JsonIteratorKt {

    @Metadata(m28849k = 3, m28848mv = {1, 9, 0}, m28846xi = 48)
    /* loaded from: classes6.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DecodeSequenceMode.values().length];
            try {
                iArr[DecodeSequenceMode.WHITESPACE_SEPARATED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DecodeSequenceMode.ARRAY_WRAPPED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DecodeSequenceMode.AUTO_DETECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @NotNull
    public static final <T> Iterator<T> JsonIterator(@NotNull DecodeSequenceMode mode, @NotNull Json json, @NotNull ReaderJsonLexer lexer, @NotNull DeserializationStrategy<? extends T> deserializer) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(lexer, "lexer");
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        int i = WhenMappings.$EnumSwitchMapping$0[m26640a(lexer, mode).ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                throw new IllegalStateException("AbstractJsonLexer.determineFormat must be called beforehand.".toString());
            }
            return new C12173a(json, lexer, deserializer);
        }
        return new C12174b(json, lexer, deserializer);
    }

    /* renamed from: a */
    public static final DecodeSequenceMode m26640a(AbstractJsonLexer abstractJsonLexer, DecodeSequenceMode decodeSequenceMode) {
        int i = WhenMappings.$EnumSwitchMapping$0[decodeSequenceMode.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    if (m26639b(abstractJsonLexer)) {
                        return DecodeSequenceMode.ARRAY_WRAPPED;
                    }
                    return DecodeSequenceMode.WHITESPACE_SEPARATED;
                }
                throw new NoWhenBranchMatchedException();
            } else if (m26639b(abstractJsonLexer)) {
                return DecodeSequenceMode.ARRAY_WRAPPED;
            } else {
                AbstractJsonLexer.fail$kotlinx_serialization_json$default(abstractJsonLexer, (byte) 8, false, 2, null);
                throw new KotlinNothingValueException();
            }
        }
        return DecodeSequenceMode.WHITESPACE_SEPARATED;
    }

    /* renamed from: b */
    public static final boolean m26639b(AbstractJsonLexer abstractJsonLexer) {
        if (abstractJsonLexer.peekNextToken() == 8) {
            abstractJsonLexer.consumeNextToken((byte) 8);
            return true;
        }
        return false;
    }
}
