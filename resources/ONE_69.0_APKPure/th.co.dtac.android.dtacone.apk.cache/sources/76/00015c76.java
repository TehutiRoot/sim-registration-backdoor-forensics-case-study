package th.p047co.dtac.android.dtacone.widget.compose.signature;

import android.view.MotionEvent;
import android.view.View;
import com.github.barteksc.pdfviewer.PDFView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.widget.compose.signature.SignaturePageScreenKt$PdfViewAndroidView$2$1 */
/* loaded from: classes9.dex */
public final class SignaturePageScreenKt$PdfViewAndroidView$2$1 extends Lambda implements Function1<PDFView, Unit> {
    final /* synthetic */ Function0<Unit> $onPreview;
    final /* synthetic */ boolean $previewPdf;

    /* renamed from: th.co.dtac.android.dtacone.widget.compose.signature.SignaturePageScreenKt$PdfViewAndroidView$2$1$a */
    /* loaded from: classes9.dex */
    public static final class View$OnTouchListenerC16768a implements View.OnTouchListener {

        /* renamed from: a */
        public final /* synthetic */ Function0 f107223a;

        public View$OnTouchListenerC16768a(Function0 function0) {
            this.f107223a = function0;
        }

        @Override // android.view.View.OnTouchListener
        public final boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() == 0) {
                this.f107223a.invoke();
                return false;
            }
            return false;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SignaturePageScreenKt$PdfViewAndroidView$2$1(boolean z, Function0<Unit> function0) {
        super(1);
        this.$previewPdf = z;
        this.$onPreview = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(PDFView pDFView) {
        invoke2(pDFView);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull PDFView it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (this.$previewPdf) {
            return;
        }
        it.setOnTouchListener(new View$OnTouchListenerC16768a(this.$onPreview));
    }
}