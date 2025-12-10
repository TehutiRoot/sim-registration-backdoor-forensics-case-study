package kotlinx.serialization.json;

import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialKind;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\b\u001a\u0013\u0010\n\u001a\u00020\t*\u00020\u0005H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u0013\u0010\r\u001a\u00020\f*\u00020\u0000H\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\u001d\u0010\u0012\u001a\u00020\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m28850d2 = {"Lkotlinx/serialization/encoding/Encoder;", "encoder", "", OperatorName.CURVE_TO, "(Lkotlinx/serialization/encoding/Encoder;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "(Lkotlinx/serialization/encoding/Decoder;)V", "Lkotlinx/serialization/json/JsonDecoder;", "asJsonDecoder", "(Lkotlinx/serialization/encoding/Decoder;)Lkotlinx/serialization/json/JsonDecoder;", "Lkotlinx/serialization/json/JsonEncoder;", "asJsonEncoder", "(Lkotlinx/serialization/encoding/Encoder;)Lkotlinx/serialization/json/JsonEncoder;", "Lkotlin/Function0;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "deferred", PDPageLabelRange.STYLE_LETTERS_LOWER, "(Lkotlin/jvm/functions/Function0;)Lkotlinx/serialization/descriptors/SerialDescriptor;", "kotlinx-serialization-json"}, m28849k = 2, m28848mv = {1, 9, 0})
/* loaded from: classes6.dex */
public final class JsonElementSerializersKt {
    /* renamed from: a */
    public static final SerialDescriptor m26686a(Function0 function0) {
        return new SerialDescriptor(function0) { // from class: kotlinx.serialization.json.JsonElementSerializersKt$defer$1

            /* renamed from: a */
            public final Lazy f71331a;

            {
                this.f71331a = LazyKt__LazyJVMKt.lazy(function0);
            }

            /* renamed from: a */
            public final SerialDescriptor m26683a() {
                return (SerialDescriptor) this.f71331a.getValue();
            }

            @Override // kotlinx.serialization.descriptors.SerialDescriptor
            @NotNull
            public List<Annotation> getAnnotations() {
                return SerialDescriptor.DefaultImpls.getAnnotations(this);
            }

            @Override // kotlinx.serialization.descriptors.SerialDescriptor
            @NotNull
            public List<Annotation> getElementAnnotations(int i) {
                return m26683a().getElementAnnotations(i);
            }

            @Override // kotlinx.serialization.descriptors.SerialDescriptor
            @NotNull
            public SerialDescriptor getElementDescriptor(int i) {
                return m26683a().getElementDescriptor(i);
            }

            @Override // kotlinx.serialization.descriptors.SerialDescriptor
            public int getElementIndex(@NotNull String name) {
                Intrinsics.checkNotNullParameter(name, "name");
                return m26683a().getElementIndex(name);
            }

            @Override // kotlinx.serialization.descriptors.SerialDescriptor
            @NotNull
            public String getElementName(int i) {
                return m26683a().getElementName(i);
            }

            @Override // kotlinx.serialization.descriptors.SerialDescriptor
            public int getElementsCount() {
                return m26683a().getElementsCount();
            }

            @Override // kotlinx.serialization.descriptors.SerialDescriptor
            @NotNull
            public SerialKind getKind() {
                return m26683a().getKind();
            }

            @Override // kotlinx.serialization.descriptors.SerialDescriptor
            @NotNull
            public String getSerialName() {
                return m26683a().getSerialName();
            }

            @Override // kotlinx.serialization.descriptors.SerialDescriptor
            public boolean isElementOptional(int i) {
                return m26683a().isElementOptional(i);
            }

            @Override // kotlinx.serialization.descriptors.SerialDescriptor
            public boolean isInline() {
                return SerialDescriptor.DefaultImpls.isInline(this);
            }

            @Override // kotlinx.serialization.descriptors.SerialDescriptor
            public boolean isNullable() {
                return SerialDescriptor.DefaultImpls.isNullable(this);
            }
        };
    }

    public static final /* synthetic */ void access$verify(Decoder decoder) {
        m26685b(decoder);
    }

    @NotNull
    public static final JsonDecoder asJsonDecoder(@NotNull Decoder decoder) {
        JsonDecoder jsonDecoder;
        Intrinsics.checkNotNullParameter(decoder, "<this>");
        if (decoder instanceof JsonDecoder) {
            jsonDecoder = (JsonDecoder) decoder;
        } else {
            jsonDecoder = null;
        }
        if (jsonDecoder != null) {
            return jsonDecoder;
        }
        throw new IllegalStateException("This serializer can be used only with Json format.Expected Decoder to be JsonDecoder, got " + Reflection.getOrCreateKotlinClass(decoder.getClass()));
    }

    @NotNull
    public static final JsonEncoder asJsonEncoder(@NotNull Encoder encoder) {
        JsonEncoder jsonEncoder;
        Intrinsics.checkNotNullParameter(encoder, "<this>");
        if (encoder instanceof JsonEncoder) {
            jsonEncoder = (JsonEncoder) encoder;
        } else {
            jsonEncoder = null;
        }
        if (jsonEncoder != null) {
            return jsonEncoder;
        }
        throw new IllegalStateException("This serializer can be used only with Json format.Expected Encoder to be JsonEncoder, got " + Reflection.getOrCreateKotlinClass(encoder.getClass()));
    }

    /* renamed from: b */
    public static final void m26685b(Decoder decoder) {
        asJsonDecoder(decoder);
    }

    /* renamed from: c */
    public static final void m26684c(Encoder encoder) {
        asJsonEncoder(encoder);
    }

    public static final /* synthetic */ void access$verify(Encoder encoder) {
        m26684c(encoder);
    }
}
