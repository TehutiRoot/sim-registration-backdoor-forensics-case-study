package kotlinx.serialization.json.internal;

import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.interactive.action.PDWindowsLaunchParams;
import kotlin.Metadata;
import kotlin.UByte;
import kotlin.UInt;
import kotlin.ULong;
import kotlin.UShort;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.jetbrains.annotations.NotNull;

@Metadata(m29143d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\n\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000b\u0010\u000eJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u000b\u0010\u0010J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u000b\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m29142d2 = {"Lkotlinx/serialization/json/internal/ComposerForUnsignedNumbers;", "Lkotlinx/serialization/json/internal/Composer;", "Lkotlinx/serialization/json/internal/InternalJsonWriter;", "writer", "", "forceQuoting", "<init>", "(Lkotlinx/serialization/json/internal/InternalJsonWriter;Z)V", "", OperatorName.CURVE_TO_REPLICATE_INITIAL_POINT, "", PDWindowsLaunchParams.OPERATION_PRINT, "(I)V", "", "(J)V", "", "(B)V", "", "(S)V", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Z", "kotlinx-serialization-json"}, m29141k = 1, m29140mv = {1, 9, 0})
@SuppressAnimalSniffer
/* loaded from: classes6.dex */
public final class ComposerForUnsignedNumbers extends Composer {

    /* renamed from: b */
    public final boolean f71411b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposerForUnsignedNumbers(@NotNull InternalJsonWriter writer, boolean z) {
        super(writer);
        Intrinsics.checkNotNullParameter(writer, "writer");
        this.f71411b = z;
    }

    @Override // kotlinx.serialization.json.internal.Composer
    public void print(int i) {
        String l;
        String l2;
        boolean z = this.f71411b;
        int m74306constructorimpl = UInt.m74306constructorimpl(i);
        if (z) {
            l2 = Long.toString(m74306constructorimpl & BodyPartID.bodyIdMax, 10);
            printQuoted(l2);
            return;
        }
        l = Long.toString(m74306constructorimpl & BodyPartID.bodyIdMax, 10);
        print(l);
    }

    @Override // kotlinx.serialization.json.internal.Composer
    public void print(long j) {
        String m23724a;
        String m23929a;
        boolean z = this.f71411b;
        long m74330constructorimpl = ULong.m74330constructorimpl(j);
        if (z) {
            m23929a = AbstractC13048ov.m23929a(m74330constructorimpl, 10);
            printQuoted(m23929a);
            return;
        }
        m23724a = AbstractC13147pv.m23724a(m74330constructorimpl, 10);
        print(m23724a);
    }

    @Override // kotlinx.serialization.json.internal.Composer
    public void print(byte b) {
        boolean z = this.f71411b;
        String m74286toStringimpl = UByte.m74286toStringimpl(UByte.m74282constructorimpl(b));
        if (z) {
            printQuoted(m74286toStringimpl);
        } else {
            print(m74286toStringimpl);
        }
    }

    @Override // kotlinx.serialization.json.internal.Composer
    public void print(short s) {
        boolean z = this.f71411b;
        String m74358toStringimpl = UShort.m74358toStringimpl(UShort.m74354constructorimpl(s));
        if (z) {
            printQuoted(m74358toStringimpl);
        } else {
            print(m74358toStringimpl);
        }
    }
}