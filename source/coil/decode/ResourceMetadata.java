package coil.decode;

import androidx.annotation.DrawableRes;
import coil.annotation.ExperimentalCoilApi;
import coil.decode.ImageSource;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0012\u0010\u0010¨\u0006\u0013"}, m28850d2 = {"Lcoil/decode/ResourceMetadata;", "Lcoil/decode/ImageSource$Metadata;", "", RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME, "", "resId", "density", "<init>", "(Ljava/lang/String;II)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/lang/String;", "getPackageName", "()Ljava/lang/String;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "I", "getResId", "()I", OperatorName.CURVE_TO, "getDensity", "coil-base_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@ExperimentalCoilApi
/* loaded from: classes3.dex */
public final class ResourceMetadata extends ImageSource.Metadata {

    /* renamed from: a */
    public final String f40495a;

    /* renamed from: b */
    public final int f40496b;

    /* renamed from: c */
    public final int f40497c;

    public ResourceMetadata(@NotNull String str, @DrawableRes int i, int i2) {
        this.f40495a = str;
        this.f40496b = i;
        this.f40497c = i2;
    }

    public final int getDensity() {
        return this.f40497c;
    }

    @NotNull
    public final String getPackageName() {
        return this.f40495a;
    }

    public final int getResId() {
        return this.f40496b;
    }
}
