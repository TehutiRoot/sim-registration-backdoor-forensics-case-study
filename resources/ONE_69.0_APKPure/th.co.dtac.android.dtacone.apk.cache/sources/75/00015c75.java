package th.p047co.dtac.android.dtacone.widget.compose.signature;

import android.content.Context;
import com.github.barteksc.pdfviewer.PDFView;
import com.github.barteksc.pdfviewer.util.FitPolicy;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.widget.compose.signature.SignaturePageScreenKt$PdfViewAndroidView$1$1 */
/* loaded from: classes9.dex */
public final class SignaturePageScreenKt$PdfViewAndroidView$1$1 extends Lambda implements Function1<Context, PDFView> {
    final /* synthetic */ String $base64Sting;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SignaturePageScreenKt$PdfViewAndroidView$1$1(String str) {
        super(1);
        this.$base64Sting = str;
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final PDFView invoke(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        File createPdfFromBase64 = SignaturePageScreenKt.createPdfFromBase64(this.$base64Sting);
        PDFView pDFView = new PDFView(context, null);
        pDFView.recycle();
        pDFView.fromFile(createPdfFromBase64).pageFitPolicy(FitPolicy.WIDTH).enableSwipe(true).enableAnnotationRendering(true).load();
        return pDFView;
    }
}