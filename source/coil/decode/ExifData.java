package coil.decode;

import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.util.constant.mixpanel.top_up.TopUpMixpanel;

@Metadata(m28851d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0000\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0003\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, m28850d2 = {"Lcoil/decode/ExifData;", "", "", "isFlipped", "", "rotationDegrees", "<init>", "(ZI)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Z", "()Z", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "I", "getRotationDegrees", "()I", "Companion", "coil-base_release"}, m28849k = 1, m28848mv = {1, 8, 0})
/* loaded from: classes3.dex */
public final class ExifData {
    @NotNull
    public static final Companion Companion = new Companion(null);
    @JvmField
    @NotNull
    public static final ExifData NONE = new ExifData(false, 0);

    /* renamed from: a */
    public final boolean f40484a;

    /* renamed from: b */
    public final int f40485b;

    @Metadata(m28851d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m28850d2 = {"Lcoil/decode/ExifData$Companion;", "", "()V", TopUpMixpanel.OFFER_NONE, "Lcoil/decode/ExifData;", "coil-base_release"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    public ExifData(boolean z, int i) {
        this.f40484a = z;
        this.f40485b = i;
    }

    public final int getRotationDegrees() {
        return this.f40485b;
    }

    public final boolean isFlipped() {
        return this.f40484a;
    }
}
