package th.p047co.dtac.android.dtacone.view.appOne.eSign.screen;

import androidx.camera.core.ImageAnalysis;
import androidx.compose.runtime.MutableState;
import com.google.mlkit.vision.barcode.common.Barcode;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.eSign.screen.ScanQrCodeScreenKt$PreviewCameraLayout$qrCodeAnalyzer$1$1 */
/* loaded from: classes10.dex */
public final class ScanQrCodeScreenKt$PreviewCameraLayout$qrCodeAnalyzer$1$1 extends Lambda implements Function1<List<Barcode>, Unit> {
    final /* synthetic */ MutableState<Boolean> $actionScan;
    final /* synthetic */ ImageAnalysis $imageAnalysis;
    final /* synthetic */ Function1<String, Unit> $onQrCodeScanned;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ScanQrCodeScreenKt$PreviewCameraLayout$qrCodeAnalyzer$1$1(ImageAnalysis imageAnalysis, Function1<? super String, Unit> function1, MutableState<Boolean> mutableState) {
        super(1);
        this.$imageAnalysis = imageAnalysis;
        this.$onQrCodeScanned = function1;
        this.$actionScan = mutableState;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(List<Barcode> list) {
        invoke2(list);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List<Barcode> list) {
        for (Barcode barcode : list) {
            String rawValue = barcode.getRawValue();
            if (rawValue != null) {
                ImageAnalysis imageAnalysis = this.$imageAnalysis;
                Function1<String, Unit> function1 = this.$onQrCodeScanned;
                MutableState<Boolean> mutableState = this.$actionScan;
                imageAnalysis.clearAnalyzer();
                function1.invoke(rawValue);
                mutableState.setValue(Boolean.FALSE);
            }
        }
    }
}