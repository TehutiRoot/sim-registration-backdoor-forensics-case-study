package io.fotoapparat.view;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.util.AttributeSet;
import android.view.TextureView;
import android.widget.FrameLayout;
import ch.qos.logback.core.CoreConstants;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import io.fotoapparat.exception.camera.UnavailableSurfaceException;
import io.fotoapparat.parameter.Resolution;
import io.fotoapparat.parameter.ScaleType;
import io.fotoapparat.view.CameraView;
import io.fotoapparat.view.Preview;
import java.util.concurrent.CountDownLatch;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ7\u0010\"\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\u00072\u0006\u0010!\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\"\u0010#J\u0015\u0010&\u001a\u0004\u0018\u00010%*\u00020$H\u0002¢\u0006\u0004\b&\u0010'R\u0014\u0010+\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010.\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u00100\u001a\u00020\u00158\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b&\u0010/R\u0016\u0010\u0012\u001a\u00020\u00118\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b1\u00102R\u0018\u00105\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104¨\u00066"}, m28850d2 = {"Lio/fotoapparat/view/CameraView;", "Landroid/widget/FrameLayout;", "Lio/fotoapparat/view/CameraRenderer;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lio/fotoapparat/view/Preview$Texture;", "getPreviewAfterLatch", "()Lio/fotoapparat/view/Preview$Texture;", "", "onDetachedFromWindow", "()V", "Lio/fotoapparat/parameter/ScaleType;", "scaleType", "setScaleType", "(Lio/fotoapparat/parameter/ScaleType;)V", "Lio/fotoapparat/parameter/Resolution;", "resolution", "setPreviewResolution", "(Lio/fotoapparat/parameter/Resolution;)V", "Lio/fotoapparat/view/Preview;", "getPreview", "()Lio/fotoapparat/view/Preview;", "", "changed", "left", "top", "right", "bottom", "onLayout", "(ZIIII)V", "Landroid/view/TextureView;", "Landroid/graphics/SurfaceTexture;", OperatorName.CURVE_TO, "(Landroid/view/TextureView;)Landroid/graphics/SurfaceTexture;", "Ljava/util/concurrent/CountDownLatch;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/util/concurrent/CountDownLatch;", "textureLatch", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Landroid/view/TextureView;", "textureView", "Lio/fotoapparat/parameter/Resolution;", "previewResolution", "d", "Lio/fotoapparat/parameter/ScaleType;", "e", "Landroid/graphics/SurfaceTexture;", "surfaceTexture", "fotoapparat_release"}, m28849k = 1, m28848mv = {1, 8, 0})
/* loaded from: classes5.dex */
public final class CameraView extends FrameLayout implements CameraRenderer {

    /* renamed from: a */
    public final CountDownLatch f63045a;

    /* renamed from: b */
    public final TextureView f63046b;

    /* renamed from: c */
    public Resolution f63047c;

    /* renamed from: d */
    public ScaleType f63048d;

    /* renamed from: e */
    public SurfaceTexture f63049e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CameraView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* renamed from: a */
    public static /* synthetic */ void m30473a(CameraView cameraView, Resolution resolution) {
        m30472b(cameraView, resolution);
    }

    /* renamed from: b */
    public static final void m30472b(CameraView this$0, Resolution resolution) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(resolution, "$resolution");
        this$0.f63047c = resolution;
        this$0.requestLayout();
    }

    private final Preview.Texture getPreviewAfterLatch() {
        Preview.Texture preview;
        this.f63045a.await();
        SurfaceTexture surfaceTexture = this.f63049e;
        if (surfaceTexture != null && (preview = PreviewKt.toPreview(surfaceTexture)) != null) {
            return preview;
        }
        throw new UnavailableSurfaceException();
    }

    /* renamed from: c */
    public final SurfaceTexture m30471c(TextureView textureView) {
        SurfaceTexture surfaceTexture = textureView.getSurfaceTexture();
        if (surfaceTexture == null) {
            textureView.setSurfaceTextureListener(new TextureAvailabilityListener(new CameraView$tryInitialize$1$1(this)));
            return null;
        }
        return surfaceTexture;
    }

    @Override // io.fotoapparat.view.CameraRenderer
    @NotNull
    public Preview getPreview() {
        Preview.Texture preview;
        SurfaceTexture surfaceTexture = this.f63049e;
        if (surfaceTexture == null || (preview = PreviewKt.toPreview(surfaceTexture)) == null) {
            return getPreviewAfterLatch();
        }
        return preview;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f63045a.countDown();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Resolution resolution;
        if (!isInEditMode() && (resolution = this.f63047c) != null && this.f63048d != null) {
            ScaleType scaleType = null;
            if (resolution == null) {
                Intrinsics.throwUninitializedPropertyAccessException("previewResolution");
                resolution = null;
            }
            ScaleType scaleType2 = this.f63048d;
            if (scaleType2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("scaleType");
            } else {
                scaleType = scaleType2;
            }
            CameraViewKt.m30467d(this, resolution, scaleType);
            return;
        }
        super.onLayout(z, i, i2, i3, i4);
    }

    @Override // io.fotoapparat.view.CameraRenderer
    public void setPreviewResolution(@NotNull final Resolution resolution) {
        Intrinsics.checkNotNullParameter(resolution, "resolution");
        post(new Runnable() { // from class: pk
            {
                CameraView.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                CameraView.m30473a(CameraView.this, resolution);
            }
        });
    }

    @Override // io.fotoapparat.view.CameraRenderer
    public void setScaleType(@NotNull ScaleType scaleType) {
        Intrinsics.checkNotNullParameter(scaleType, "scaleType");
        this.f63048d = scaleType;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CameraView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ CameraView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CameraView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f63045a = new CountDownLatch(1);
        TextureView textureView = new TextureView(context);
        this.f63046b = textureView;
        this.f63049e = m30471c(textureView);
        addView(textureView);
    }
}
