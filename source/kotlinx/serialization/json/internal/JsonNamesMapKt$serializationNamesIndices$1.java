package kotlinx.serialization.json.internal;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonNamingStrategy;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28850d2 = {"<anonymous>", "", "", "invoke", "()[Ljava/lang/String;"}, m28849k = 3, m28848mv = {1, 9, 0}, m28846xi = 48)
/* loaded from: classes6.dex */
public final class JsonNamesMapKt$serializationNamesIndices$1 extends Lambda implements Function0<String[]> {
    final /* synthetic */ JsonNamingStrategy $strategy;
    final /* synthetic */ SerialDescriptor $this_serializationNamesIndices;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JsonNamesMapKt$serializationNamesIndices$1(SerialDescriptor serialDescriptor, JsonNamingStrategy jsonNamingStrategy) {
        super(0);
        this.$this_serializationNamesIndices = serialDescriptor;
        this.$strategy = jsonNamingStrategy;
    }

    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final String[] invoke() {
        int elementsCount = this.$this_serializationNamesIndices.getElementsCount();
        String[] strArr = new String[elementsCount];
        for (int i = 0; i < elementsCount; i++) {
            strArr[i] = this.$strategy.serialNameForJson(this.$this_serializationNamesIndices, i, this.$this_serializationNamesIndices.getElementName(i));
        }
        return strArr;
    }
}
