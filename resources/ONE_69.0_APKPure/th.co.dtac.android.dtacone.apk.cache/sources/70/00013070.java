package th.p047co.dtac.android.dtacone.view.appOne.eSign.screen;

import android.content.Context;
import androidx.camera.core.CameraSelector;
import androidx.camera.core.ImageAnalysis;
import androidx.camera.core.Preview;
import androidx.camera.lifecycle.ProcessCameraProvider;
import androidx.camera.view.PreviewView;
import androidx.compose.runtime.MutableState;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.LifecycleOwner;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutorService;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.view.appOne.eSign.state.OneVerifyQrCodeState;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.eSign.screen.ScanQrCodeScreenKt$PreviewCameraLayout$1 */
/* loaded from: classes10.dex */
public final class ScanQrCodeScreenKt$PreviewCameraLayout$1 extends Lambda implements Function1<Context, PreviewView> {
    final /* synthetic */ MutableState<Boolean> $actionScan;
    final /* synthetic */ ExecutorService $cameraExecutor;
    final /* synthetic */ ImageAnalysis $imageAnalysis;
    final /* synthetic */ LifecycleOwner $lifecycleOwner;
    final /* synthetic */ PreviewView $previewView;
    final /* synthetic */ ImageAnalysis.Analyzer $qrCodeAnalyzer;
    final /* synthetic */ OneVerifyQrCodeState $verifyQrCodeState;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScanQrCodeScreenKt$PreviewCameraLayout$1(PreviewView previewView, OneVerifyQrCodeState oneVerifyQrCodeState, ImageAnalysis imageAnalysis, ExecutorService executorService, ImageAnalysis.Analyzer analyzer, MutableState<Boolean> mutableState, LifecycleOwner lifecycleOwner) {
        super(1);
        this.$previewView = previewView;
        this.$verifyQrCodeState = oneVerifyQrCodeState;
        this.$imageAnalysis = imageAnalysis;
        this.$cameraExecutor = executorService;
        this.$qrCodeAnalyzer = analyzer;
        this.$actionScan = mutableState;
        this.$lifecycleOwner = lifecycleOwner;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$1(ListenableFuture cameraProviderFuture, OneVerifyQrCodeState verifyQrCodeState, ImageAnalysis imageAnalysis, ExecutorService executorService, ImageAnalysis.Analyzer qrCodeAnalyzer, MutableState actionScan, LifecycleOwner lifecycleOwner, PreviewView previewView) {
        Intrinsics.checkNotNullParameter(cameraProviderFuture, "$cameraProviderFuture");
        Intrinsics.checkNotNullParameter(verifyQrCodeState, "$verifyQrCodeState");
        Intrinsics.checkNotNullParameter(imageAnalysis, "$imageAnalysis");
        Intrinsics.checkNotNullParameter(qrCodeAnalyzer, "$qrCodeAnalyzer");
        Intrinsics.checkNotNullParameter(actionScan, "$actionScan");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "$lifecycleOwner");
        Intrinsics.checkNotNullParameter(previewView, "$previewView");
        ProcessCameraProvider processCameraProvider = (ProcessCameraProvider) cameraProviderFuture.get();
        Preview build = new Preview.Builder().build();
        build.setSurfaceProvider(previewView.getSurfaceProvider());
        Intrinsics.checkNotNullExpressionValue(build, "Builder().build().also {…ovider)\n                }");
        if (verifyQrCodeState instanceof OneVerifyQrCodeState.Initial) {
            imageAnalysis.setAnalyzer(executorService, qrCodeAnalyzer);
        } else {
            imageAnalysis.clearAnalyzer();
        }
        try {
            processCameraProvider.unbindAll();
            if (((Boolean) actionScan.getValue()).booleanValue()) {
                processCameraProvider.bindToLifecycle(lifecycleOwner, CameraSelector.DEFAULT_BACK_CAMERA, build, imageAnalysis);
            } else {
                processCameraProvider.bindToLifecycle(lifecycleOwner, CameraSelector.DEFAULT_BACK_CAMERA, build);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final PreviewView invoke(@NotNull Context it) {
        Intrinsics.checkNotNullParameter(it, "it");
        final ListenableFuture<ProcessCameraProvider> processCameraProvider = ProcessCameraProvider.getInstance(it);
        Intrinsics.checkNotNullExpressionValue(processCameraProvider, "getInstance(it)");
        final OneVerifyQrCodeState oneVerifyQrCodeState = this.$verifyQrCodeState;
        final ImageAnalysis imageAnalysis = this.$imageAnalysis;
        final ExecutorService executorService = this.$cameraExecutor;
        final ImageAnalysis.Analyzer analyzer = this.$qrCodeAnalyzer;
        final MutableState<Boolean> mutableState = this.$actionScan;
        final LifecycleOwner lifecycleOwner = this.$lifecycleOwner;
        final PreviewView previewView = this.$previewView;
        processCameraProvider.addListener(new Runnable() { // from class: th.co.dtac.android.dtacone.view.appOne.eSign.screen.a
            @Override // java.lang.Runnable
            public final void run() {
                ScanQrCodeScreenKt$PreviewCameraLayout$1.invoke$lambda$1(ListenableFuture.this, oneVerifyQrCodeState, imageAnalysis, executorService, analyzer, mutableState, lifecycleOwner, previewView);
            }
        }, ContextCompat.getMainExecutor(it));
        return this.$previewView;
    }
}