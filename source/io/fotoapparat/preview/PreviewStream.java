package io.fotoapparat.preview;

import android.hardware.Camera;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.chuckerteam.chucker.internal.support.ResponseProcessor;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import io.fotoapparat.hardware.ExecutorKt;
import io.fotoapparat.hardware.orientation.Orientation;
import io.fotoapparat.parameter.Resolution;
import io.fotoapparat.preview.PreviewStream;
import java.util.LinkedHashSet;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J8\u0010\u000e\u001a\u00020\u000b2)\u0010\r\u001a%\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0006j\u0004\u0018\u0001`\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J6\u0010\u0013\u001a\u00020\u000b2%\u0010\u0012\u001a!\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u0006j\u0002`\fH\u0002¢\u0006\u0004\b\u0013\u0010\u000fJ\u000f\u0010\u0014\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0014\u0010\u0011J\u000f\u0010\u0015\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0015\u0010\u0011J\u0013\u0010\u0016\u001a\u00020\u000b*\u00020\u0002H\u0002¢\u0006\u0004\b\u0016\u0010\u0005J\u0017\u0010\u0019\u001a\u00020\u0018*\u00060\u0017R\u00020\u0002H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001f\u0010\u001dJ\u000f\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b!\u0010\"J\u0017\u0010#\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0007H\u0002¢\u0006\u0004\b#\u0010$R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R9\u0010*\u001a'\u0012#\u0012!\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u0006j\u0002`\f0'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0018\u0010,\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010+R\"\u00103\u001a\u00020-8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102¨\u00064"}, m28850d2 = {"Lio/fotoapparat/preview/PreviewStream;", "", "Landroid/hardware/Camera;", "camera", "<init>", "(Landroid/hardware/Camera;)V", "Lkotlin/Function1;", "Lio/fotoapparat/preview/Frame;", "Lkotlin/ParameterName;", "name", TypedValues.AttributesType.S_FRAME, "", "Lio/fotoapparat/util/FrameProcessor;", "frameProcessor", "updateProcessorSafely", "(Lkotlin/jvm/functions/Function1;)V", OperatorName.FILL_NON_ZERO, "()V", "processor", "d", OperatorName.LINE_TO, OperatorName.ENDPATH, OperatorName.CURVE_TO, "Landroid/hardware/Camera$Parameters;", "", "e", "(Landroid/hardware/Camera$Parameters;)[B", "data", OperatorName.CLOSE_PATH, "([B)V", ResponseProcessor.CONTENT_TYPE_IMAGE, OperatorName.NON_STROKING_GRAY, "Lio/fotoapparat/parameter/Resolution;", OperatorName.SET_LINE_JOINSTYLE, "()Lio/fotoapparat/parameter/Resolution;", OperatorName.NON_STROKING_CMYK, "(Lio/fotoapparat/preview/Frame;)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroid/hardware/Camera;", "Ljava/util/LinkedHashSet;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Ljava/util/LinkedHashSet;", "frameProcessors", "Lio/fotoapparat/parameter/Resolution;", "previewResolution", "Lio/fotoapparat/hardware/orientation/Orientation;", "Lio/fotoapparat/hardware/orientation/Orientation;", "getFrameOrientation", "()Lio/fotoapparat/hardware/orientation/Orientation;", "setFrameOrientation", "(Lio/fotoapparat/hardware/orientation/Orientation;)V", "frameOrientation", "fotoapparat_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nPreviewStream.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PreviewStream.kt\nio/fotoapparat/preview/PreviewStream\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,133:1\n1855#2,2:134\n*S KotlinDebug\n*F\n+ 1 PreviewStream.kt\nio/fotoapparat/preview/PreviewStream\n*L\n106#1:134,2\n*E\n"})
/* loaded from: classes5.dex */
public final class PreviewStream {

    /* renamed from: a */
    public final Camera f63032a;

    /* renamed from: b */
    public final LinkedHashSet f63033b;

    /* renamed from: c */
    public Resolution f63034c;

    /* renamed from: d */
    public Orientation f63035d;

    public PreviewStream(@NotNull Camera camera) {
        Intrinsics.checkNotNullParameter(camera, "camera");
        this.f63032a = camera;
        this.f63033b = new LinkedHashSet();
        this.f63035d = Orientation.Vertical.Portrait.INSTANCE;
    }

    /* renamed from: a */
    public static /* synthetic */ void m30507a(PreviewStream previewStream, byte[] bArr) {
        m30499i(previewStream, bArr);
    }

    /* renamed from: b */
    public static /* synthetic */ void m30506b(PreviewStream previewStream, byte[] bArr, Camera camera) {
        m30495m(previewStream, bArr, camera);
    }

    /* renamed from: i */
    public static final void m30499i(PreviewStream this$0, byte[] data) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(data, "$data");
        synchronized (this$0.f63033b) {
            this$0.m30501g(data);
            Unit unit = Unit.INSTANCE;
        }
    }

    /* renamed from: m */
    public static final void m30495m(PreviewStream this$0, byte[] data, Camera camera) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullExpressionValue(data, "data");
        this$0.m30500h(data);
    }

    /* renamed from: c */
    public final void m30505c(Camera camera) {
        Camera.Parameters parameters = camera.getParameters();
        Intrinsics.checkNotNullExpressionValue(parameters, "parameters");
        camera.addCallbackBuffer(m30503e(parameters));
    }

    /* renamed from: d */
    public final void m30504d(Function1 function1) {
        synchronized (this.f63033b) {
            this.f63033b.add(function1);
        }
    }

    /* renamed from: e */
    public final byte[] m30503e(Camera.Parameters parameters) {
        int m30493a;
        PreviewStreamKt.m30492b(parameters);
        this.f63034c = new Resolution(parameters.getPreviewSize().width, parameters.getPreviewSize().height);
        Camera.Size previewSize = parameters.getPreviewSize();
        Intrinsics.checkNotNullExpressionValue(previewSize, "previewSize");
        m30493a = PreviewStreamKt.m30493a(previewSize);
        return new byte[m30493a];
    }

    /* renamed from: f */
    public final void m30502f() {
        synchronized (this.f63033b) {
            this.f63033b.clear();
            Unit unit = Unit.INSTANCE;
        }
    }

    /* renamed from: g */
    public final void m30501g(byte[] bArr) {
        Frame frame = new Frame(m30498j(), bArr, this.f63035d.getDegrees());
        for (Function1 function1 : this.f63033b) {
            function1.invoke(frame);
        }
        m30497k(frame);
    }

    @NotNull
    public final Orientation getFrameOrientation() {
        return this.f63035d;
    }

    /* renamed from: h */
    public final void m30500h(final byte[] bArr) {
        ExecutorKt.getFrameProcessingExecutor().execute(new Runnable() { // from class: vn1
            {
                PreviewStream.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                PreviewStream.m30507a(PreviewStream.this, bArr);
            }
        });
    }

    /* renamed from: j */
    public final Resolution m30498j() {
        Resolution resolution = this.f63034c;
        if (resolution != null) {
            return resolution;
        }
        throw new IllegalStateException("previewSize is null. Frame was not added?");
    }

    /* renamed from: k */
    public final void m30497k(Frame frame) {
        this.f63032a.addCallbackBuffer(frame.getImage());
    }

    /* renamed from: l */
    public final void m30496l() {
        m30505c(this.f63032a);
        this.f63032a.setPreviewCallbackWithBuffer(new Camera.PreviewCallback() { // from class: un1
            {
                PreviewStream.this = this;
            }

            @Override // android.hardware.Camera.PreviewCallback
            public final void onPreviewFrame(byte[] bArr, Camera camera) {
                PreviewStream.m30506b(PreviewStream.this, bArr, camera);
            }
        });
    }

    /* renamed from: n */
    public final void m30494n() {
        this.f63032a.setPreviewCallbackWithBuffer(null);
    }

    public final void setFrameOrientation(@NotNull Orientation orientation) {
        Intrinsics.checkNotNullParameter(orientation, "<set-?>");
        this.f63035d = orientation;
    }

    public final void updateProcessorSafely(@Nullable Function1<? super Frame, Unit> function1) {
        m30502f();
        if (function1 == null) {
            m30494n();
            return;
        }
        m30504d(function1);
        m30496l();
    }
}
