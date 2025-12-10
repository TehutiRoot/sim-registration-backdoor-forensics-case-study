package io.fotoapparat.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.widget.FrameLayout;
import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import io.fotoapparat.hardware.metering.FocalRequest;
import io.fotoapparat.hardware.metering.PointF;
import io.fotoapparat.parameter.Resolution;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u000f\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0002-5\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ#\u0010\u000f\u001a\u00020\r2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0017¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R$\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR0\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\u0010R0\u0010&\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010\u001b\u001a\u0004\b$\u0010 \"\u0004\b%\u0010\u0010R$\u0010,\u001a\u00020\u00072\u0006\u0010'\u001a\u00020\u00078\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b(\u0010)\"\u0004\b*\u0010+R\u0014\u00100\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00104\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u00108\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u0010<\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;¨\u0006="}, m28850d2 = {"Lio/fotoapparat/view/FocusView;", "Landroid/widget/FrameLayout;", "Lio/fotoapparat/view/FocalPointSelector;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lkotlin/Function1;", "Lio/fotoapparat/hardware/metering/FocalRequest;", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setFocalPointListener", "(Lkotlin/jvm/functions/Function1;)V", "Landroid/view/MotionEvent;", "event", "", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "Lio/fotoapparat/view/FeedbackCircleView;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lio/fotoapparat/view/FeedbackCircleView;", "visualFeedbackCircle", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lkotlin/jvm/functions/Function1;", "focusMeteringListener", "", OperatorName.CURVE_TO, "getScaleListener", "()Lkotlin/jvm/functions/Function1;", "setScaleListener", "scaleListener", "d", "getPtrListener", "setPtrListener", "ptrListener", "value", "e", "I", "setMPtrCount", "(I)V", "mPtrCount", "io/fotoapparat/view/FocusView$gestureDetectorListener$1", OperatorName.FILL_NON_ZERO, "Lio/fotoapparat/view/FocusView$gestureDetectorListener$1;", "gestureDetectorListener", "Landroid/view/GestureDetector;", OperatorName.NON_STROKING_GRAY, "Landroid/view/GestureDetector;", "tapDetector", "io/fotoapparat/view/FocusView$scaleGestureDetector$1", OperatorName.CLOSE_PATH, "Lio/fotoapparat/view/FocusView$scaleGestureDetector$1;", "scaleGestureDetector", "Landroid/view/ScaleGestureDetector;", "i", "Landroid/view/ScaleGestureDetector;", "scaleDetector", "fotoapparat_release"}, m28849k = 1, m28848mv = {1, 8, 0})
/* loaded from: classes5.dex */
public class FocusView extends FrameLayout implements FocalPointSelector {

    /* renamed from: a */
    public final FeedbackCircleView f63053a;

    /* renamed from: b */
    public Function1 f63054b;

    /* renamed from: c */
    public Function1 f63055c;

    /* renamed from: d */
    public Function1 f63056d;

    /* renamed from: e */
    public int f63057e;

    /* renamed from: f */
    public final FocusView$gestureDetectorListener$1 f63058f;

    /* renamed from: g */
    public final GestureDetector f63059g;

    /* renamed from: h */
    public final FocusView$scaleGestureDetector$1 f63060h;

    /* renamed from: i */
    public final ScaleGestureDetector f63061i;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public FocusView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void setMPtrCount(int i) {
        this.f63057e = i;
        Function1 function1 = this.f63056d;
        if (function1 != null) {
            function1.invoke(Integer.valueOf(i));
        }
    }

    @Nullable
    public final Function1<Integer, Unit> getPtrListener() {
        return this.f63056d;
    }

    @Nullable
    public final Function1<Float, Unit> getScaleListener() {
        return this.f63055c;
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(@NotNull MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f63059g.onTouchEvent(event);
        this.f63061i.onTouchEvent(event);
        int action = event.getAction() & 255;
        if (action != 0) {
            if (action != 1) {
                if (action != 5) {
                    if (action == 6) {
                        setMPtrCount(this.f63057e - 1);
                    }
                } else {
                    setMPtrCount(this.f63057e + 1);
                }
            } else {
                setMPtrCount(this.f63057e - 1);
            }
        } else {
            setMPtrCount(this.f63057e + 1);
        }
        return true;
    }

    @Override // io.fotoapparat.view.FocalPointSelector
    public void setFocalPointListener(@NotNull Function1<? super FocalRequest, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f63054b = listener;
    }

    public final void setPtrListener(@Nullable Function1<? super Integer, Unit> function1) {
        this.f63056d = function1;
    }

    public final void setScaleListener(@Nullable Function1<? super Float, Unit> function1) {
        this.f63055c = function1;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public FocusView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ FocusView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r3v2, types: [android.view.GestureDetector$OnGestureListener, io.fotoapparat.view.FocusView$gestureDetectorListener$1] */
    /* JADX WARN: Type inference failed for: r3v3, types: [android.view.ScaleGestureDetector$OnScaleGestureListener, io.fotoapparat.view.FocusView$scaleGestureDetector$1] */
    @JvmOverloads
    public FocusView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        FeedbackCircleView feedbackCircleView = new FeedbackCircleView(context, attributeSet, i);
        this.f63053a = feedbackCircleView;
        setClipToPadding(false);
        setClipChildren(false);
        addView(feedbackCircleView);
        ?? r3 = new GestureDetector.SimpleOnGestureListener() { // from class: io.fotoapparat.view.FocusView$gestureDetectorListener$1
            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public boolean onSingleTapUp(@NotNull MotionEvent e) {
                Function1 function1;
                FeedbackCircleView feedbackCircleView2;
                FeedbackCircleView feedbackCircleView3;
                FeedbackCircleView feedbackCircleView4;
                Intrinsics.checkNotNullParameter(e, "e");
                function1 = FocusView.this.f63054b;
                if (function1 != null) {
                    FocusView focusView = FocusView.this;
                    function1.invoke(new FocalRequest(new PointF(e.getX(), e.getY()), new Resolution(focusView.getWidth(), focusView.getHeight())));
                    feedbackCircleView2 = focusView.f63053a;
                    float x = e.getX();
                    feedbackCircleView3 = focusView.f63053a;
                    float width = x - (feedbackCircleView3.getWidth() / 2);
                    float y = e.getY();
                    feedbackCircleView4 = focusView.f63053a;
                    feedbackCircleView2.showAt$fotoapparat_release(width, y - (feedbackCircleView4.getHeight() / 2));
                    focusView.performClick();
                    return true;
                }
                return super.onSingleTapUp(e);
            }
        };
        this.f63058f = r3;
        this.f63059g = new GestureDetector(context, (GestureDetector.OnGestureListener) r3);
        ?? r32 = new ScaleGestureDetector.SimpleOnScaleGestureListener() { // from class: io.fotoapparat.view.FocusView$scaleGestureDetector$1
            {
                FocusView.this = this;
            }

            @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
            public boolean onScale(@NotNull ScaleGestureDetector detector) {
                Intrinsics.checkNotNullParameter(detector, "detector");
                Function1<Float, Unit> scaleListener = FocusView.this.getScaleListener();
                if (scaleListener != null) {
                    scaleListener.invoke(Float.valueOf(detector.getScaleFactor()));
                    return true;
                }
                return super.onScale(detector);
            }
        };
        this.f63060h = r32;
        this.f63061i = new ScaleGestureDetector(context, r32);
    }
}
