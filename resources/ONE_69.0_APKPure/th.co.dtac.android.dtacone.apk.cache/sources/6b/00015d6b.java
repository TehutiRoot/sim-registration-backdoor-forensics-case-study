package th.p047co.dtac.android.dtacone.widget.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import androidx.compose.runtime.internal.StabilityInferred;
import ch.qos.logback.core.CoreConstants;
import com.github.gcacace.signaturepad.views.SignaturePad;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, m29142d2 = {"Lth/co/dtac/android/dtacone/widget/view/DtacSignaturePad;", "Lcom/github/gcacace/signaturepad/views/SignaturePad;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "getPureSignatureBitmap", "Landroid/graphics/Bitmap;", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.widget.view.DtacSignaturePad */
/* loaded from: classes9.dex */
public final class DtacSignaturePad extends SignaturePad {
    public static final int $stable = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DtacSignaturePad(@NotNull Context context, @NotNull AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
    }

    @NotNull
    public final Bitmap getPureSignatureBitmap() {
        int i;
        float endY;
        int i2;
        int i3;
        int i4;
        int i5;
        Bitmap signatureWithTransparentBitmap = getSignatureWithTransparentBitmap();
        if (getEndX() > signatureWithTransparentBitmap.getWidth()) {
            i = signatureWithTransparentBitmap.getWidth();
        } else {
            int i6 = ((getEndX() % 1) > 0.0d ? 1 : ((getEndX() % 1) == 0.0d ? 0 : -1));
            float endX = getEndX();
            if (i6 != 0) {
                endX++;
            }
            i = (int) endX;
        }
        if (getEndY() > signatureWithTransparentBitmap.getHeight()) {
            i2 = signatureWithTransparentBitmap.getHeight();
        } else {
            if (getEndY() % 1 == 0.0d) {
                endY = getEndY();
            } else {
                endY = getEndY() + 1;
            }
            i2 = (int) endY;
        }
        int i7 = 0;
        if (((int) getStartX()) > 7) {
            i3 = Math.abs(((int) getStartX()) - 7);
        } else {
            i3 = 0;
        }
        if (((int) getStartY()) > 7) {
            i7 = Math.abs(((int) getStartY()) - 7);
        }
        if (signatureWithTransparentBitmap.getWidth() - i < 14) {
            i4 = signatureWithTransparentBitmap.getWidth() - i3;
        } else {
            i4 = (i - i3) + 14;
        }
        if (signatureWithTransparentBitmap.getHeight() - i2 < 14) {
            i5 = signatureWithTransparentBitmap.getHeight() - i7;
        } else {
            i5 = 14 + (i2 - i7);
        }
        try {
            Bitmap createBitmap = Bitmap.createBitmap(signatureWithTransparentBitmap, i3, i7, i4, i5);
            Intrinsics.checkNotNullExpressionValue(createBitmap, "createBitmap(signatureBi…y, testWidth, testHeight)");
            return createBitmap;
        } catch (Exception unused) {
            Bitmap createBitmap2 = Bitmap.createBitmap(signatureWithTransparentBitmap, i3, i7, i - i3, i2 - i7);
            Intrinsics.checkNotNullExpressionValue(createBitmap2, "createBitmap(signatureBi…eightSignatureBitmap - y)");
            return createBitmap2;
        }
    }
}