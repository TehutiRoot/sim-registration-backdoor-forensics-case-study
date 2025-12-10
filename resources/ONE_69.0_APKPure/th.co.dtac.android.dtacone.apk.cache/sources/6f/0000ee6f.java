package okio.internal;

import java.io.IOException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import okio.BufferedSource;
import org.bouncycastle.asn1.cmc.BodyPartID;

@Metadata(m29143d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, m29142d2 = {"<anonymous>", "", "headerId", "", "dataSize", "", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* loaded from: classes6.dex */
public final class ZipKt$readEntry$1 extends Lambda implements Function2<Integer, Long, Unit> {
    final /* synthetic */ Ref.LongRef $compressedSize;
    final /* synthetic */ Ref.BooleanRef $hasZip64Extra;
    final /* synthetic */ Ref.LongRef $offset;
    final /* synthetic */ long $requiredZip64ExtraSize;
    final /* synthetic */ Ref.LongRef $size;
    final /* synthetic */ BufferedSource $this_readEntry;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ZipKt$readEntry$1(Ref.BooleanRef booleanRef, long j, Ref.LongRef longRef, BufferedSource bufferedSource, Ref.LongRef longRef2, Ref.LongRef longRef3) {
        super(2);
        this.$hasZip64Extra = booleanRef;
        this.$requiredZip64ExtraSize = j;
        this.$size = longRef;
        this.$this_readEntry = bufferedSource;
        this.$compressedSize = longRef2;
        this.$offset = longRef3;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Integer num, Long l) {
        invoke(num.intValue(), l.longValue());
        return Unit.INSTANCE;
    }

    public final void invoke(int i, long j) {
        if (i == 1) {
            Ref.BooleanRef booleanRef = this.$hasZip64Extra;
            if (!booleanRef.element) {
                booleanRef.element = true;
                if (j >= this.$requiredZip64ExtraSize) {
                    Ref.LongRef longRef = this.$size;
                    long j2 = longRef.element;
                    if (j2 == BodyPartID.bodyIdMax) {
                        j2 = this.$this_readEntry.readLongLe();
                    }
                    longRef.element = j2;
                    Ref.LongRef longRef2 = this.$compressedSize;
                    longRef2.element = longRef2.element == BodyPartID.bodyIdMax ? this.$this_readEntry.readLongLe() : 0L;
                    Ref.LongRef longRef3 = this.$offset;
                    longRef3.element = longRef3.element == BodyPartID.bodyIdMax ? this.$this_readEntry.readLongLe() : 0L;
                    return;
                }
                throw new IOException("bad zip: zip64 extra too short");
            }
            throw new IOException("bad zip: zip64 extra repeated");
        }
    }
}