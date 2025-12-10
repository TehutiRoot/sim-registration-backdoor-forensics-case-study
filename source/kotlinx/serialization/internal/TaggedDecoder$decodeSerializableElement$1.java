package kotlinx.serialization.internal;

import com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDAnnotationFileAttachment;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlinx.serialization.DeserializationStrategy;

@Metadata(m28851d1 = {"\u0000\u0004\n\u0002\b\u0005\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001\"\u0004\b\u0001\u0010\u0002H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28850d2 = {"<anonymous>", "T", PDAnnotationFileAttachment.ATTACHMENT_NAME_TAG, "invoke", "()Ljava/lang/Object;"}, m28849k = 3, m28848mv = {1, 9, 0}, m28846xi = 48)
/* loaded from: classes6.dex */
public final class TaggedDecoder$decodeSerializableElement$1 extends Lambda implements Function0<T> {
    final /* synthetic */ DeserializationStrategy<T> $deserializer;
    final /* synthetic */ T $previousValue;
    final /* synthetic */ TaggedDecoder<Tag> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TaggedDecoder$decodeSerializableElement$1(TaggedDecoder<Tag> taggedDecoder, DeserializationStrategy<? extends T> deserializationStrategy, T t) {
        super(0);
        this.this$0 = taggedDecoder;
        this.$deserializer = deserializationStrategy;
        this.$previousValue = t;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [T, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final T invoke() {
        return this.this$0.decodeSerializableValue(this.$deserializer, this.$previousValue);
    }
}
