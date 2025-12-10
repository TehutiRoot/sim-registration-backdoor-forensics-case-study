package th.p047co.dtac.android.dtacone.app_one.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.CallSuper;
import androidx.annotation.ColorRes;
import androidx.annotation.DrawableRes;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.graphics.BlendModeColorFilterCompat;
import androidx.core.graphics.BlendModeCompat;
import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.i18n.TextBundle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.R;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\n\b'\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0019\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\tB!\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0005\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH&¢\u0006\u0004\b\u000e\u0010\u000fJ)\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\n2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H&¢\u0006\u0004\b\u0015\u0010\u0016J1\u0010\u001c\u001a\u00020\r2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0019\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\nH&¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u001f\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\n¢\u0006\u0004\b\u001f\u0010 J\r\u0010!\u001a\u00020\n¢\u0006\u0004\b!\u0010\"J\u0015\u0010$\u001a\u00020\r2\u0006\u0010#\u001a\u00020\u0010¢\u0006\u0004\b$\u0010%J\r\u0010&\u001a\u00020\u0010¢\u0006\u0004\b&\u0010'J\u0015\u0010(\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b(\u0010\u0006J!\u0010-\u001a\u00020\u00102\b\u0010*\u001a\u0004\u0018\u00010)2\u0006\u0010,\u001a\u00020+H\u0016¢\u0006\u0004\b-\u0010.J)\u0010/\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\n2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0015¢\u0006\u0004\b/\u0010\u0016J1\u00100\u001a\u00020\r2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0019\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\nH\u0015¢\u0006\u0004\b0\u0010\u001dJ=\u00105\u001a\u00020\r2\n\b\u0002\u00101\u001a\u0004\u0018\u00010\n2\n\b\u0002\u00102\u001a\u0004\u0018\u00010\n2\n\b\u0002\u00103\u001a\u0004\u0018\u00010\n2\n\b\u0002\u00104\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b5\u00106J!\u00109\u001a\u00020\r2\b\b\u0001\u00107\u001a\u00020\n2\u0006\u00108\u001a\u00020\u0010H\u0016¢\u0006\u0004\b9\u0010:J+\u00109\u001a\u00020\r2\b\b\u0001\u00107\u001a\u00020\n2\u0006\u00108\u001a\u00020\u00102\b\u0010\u001e\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b9\u0010;J\u0019\u0010<\u001a\u00020\r2\b\b\u0001\u00107\u001a\u00020\nH\u0016¢\u0006\u0004\b<\u0010 R\u001a\u0010@\u001a\u00020\n8\u0006X\u0086D¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010\"R\u001a\u0010C\u001a\u00020\n8\u0006X\u0086D¢\u0006\f\n\u0004\bA\u0010>\u001a\u0004\bB\u0010\"R\u001a\u0010F\u001a\u00020\n8\u0006X\u0086D¢\u0006\f\n\u0004\bD\u0010>\u001a\u0004\bE\u0010\"R\u001a\u0010I\u001a\u00020\n8\u0006X\u0086D¢\u0006\f\n\u0004\bG\u0010>\u001a\u0004\bH\u0010\"R\u0016\u0010&\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010KR\u0016\u0010\u0004\u001a\u00020\u00038\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bL\u0010MR,\u0010V\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010O\u0018\u00010N8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010S\"\u0004\bT\u0010UR\u0016\u0010X\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u0010>¨\u0006Y"}, m28850d2 = {"Lth/co/dtac/android/dtacone/app_one/widget/OneCustomInteractiveEditText;", "Lth/co/dtac/android/dtacone/app_one/widget/OneEditText;", "Landroid/view/View$OnTouchListener;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "onRightTouchUpAction", "()V", "", "focused", "direction", "Landroid/graphics/Rect;", "previouslyFocusedRect", "onFocusChangeAction", "(ZILandroid/graphics/Rect;)V", "", TextBundle.TEXT_ENTRY, "start", "lengthBefore", "lengthAfter", "onTextChangeAction", "(Ljava/lang/CharSequence;III)V", TypedValues.Custom.S_COLOR, "setFocusColor", "(I)V", "getFocusColor", "()I", "check", "setIsInteractiveIconColor", "(Z)V", "isInteractiveIconColor", "()Z", "initView", "Landroid/view/View;", Promotion.ACTION_VIEW, "Landroid/view/MotionEvent;", "motionEvent", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "onFocusChanged", "onTextChanged", "colorTop", "colorLeft", "colorRight", "colorBottom", "setCompoundDrawables", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "resId", "visible", "setupRightDrawable", "(IZ)V", "(IZLjava/lang/Integer;)V", "setTextAndCompoundColor", "d", "I", "getDRAWABLE_LEFT", "DRAWABLE_LEFT", "e", "getDRAWABLE_TOP", "DRAWABLE_TOP", OperatorName.FILL_NON_ZERO, "getDRAWABLE_RIGHT", "DRAWABLE_RIGHT", OperatorName.NON_STROKING_GRAY, "getDRAWABLE_BOTTOM", "DRAWABLE_BOTTOM", OperatorName.CLOSE_PATH, "Z", "i", "Landroid/content/Context;", "", "Landroid/graphics/drawable/Drawable;", OperatorName.SET_LINE_JOINSTYLE, "[Landroid/graphics/drawable/Drawable;", "getDrawables", "()[Landroid/graphics/drawable/Drawable;", "setDrawables", "([Landroid/graphics/drawable/Drawable;)V", "drawables", OperatorName.NON_STROKING_CMYK, "focusColor", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nOneCustomInteractiveEditText.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneCustomInteractiveEditText.kt\nth/co/dtac/android/dtacone/app_one/widget/OneCustomInteractiveEditText\n+ 2 CustomLet.kt\nth/co/dtac/android/dtacone/extension/command/CustomLetKt\n*L\n1#1,223:1\n4#2:224\n4#2:225\n4#2:226\n4#2:227\n*S KotlinDebug\n*F\n+ 1 OneCustomInteractiveEditText.kt\nth/co/dtac/android/dtacone/app_one/widget/OneCustomInteractiveEditText\n*L\n137#1:224\n141#1:225\n145#1:226\n149#1:227\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.app_one.widget.OneCustomInteractiveEditText */
/* loaded from: classes7.dex */
public abstract class OneCustomInteractiveEditText extends OneEditText implements View.OnTouchListener {
    public static final int $stable = 8;

    /* renamed from: d */
    public final int f82771d;

    /* renamed from: e */
    public final int f82772e;

    /* renamed from: f */
    public final int f82773f;

    /* renamed from: g */
    public final int f82774g;

    /* renamed from: h */
    public boolean f82775h;

    /* renamed from: i */
    public Context f82776i;

    /* renamed from: j */
    public Drawable[] f82777j;

    /* renamed from: k */
    public int f82778k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneCustomInteractiveEditText(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f82772e = 1;
        this.f82773f = 2;
        this.f82774g = 3;
        this.f82775h = true;
        this.f82778k = R.color.niceBlueFive;
        initView(context);
    }

    public static /* synthetic */ void setCompoundDrawables$default(OneCustomInteractiveEditText oneCustomInteractiveEditText, Integer num, Integer num2, Integer num3, Integer num4, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                num = null;
            }
            if ((i & 2) != 0) {
                num2 = null;
            }
            if ((i & 4) != 0) {
                num3 = null;
            }
            if ((i & 8) != 0) {
                num4 = null;
            }
            oneCustomInteractiveEditText.setCompoundDrawables(num, num2, num3, num4);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setCompoundDrawables");
    }

    public final int getDRAWABLE_BOTTOM() {
        return this.f82774g;
    }

    public final int getDRAWABLE_LEFT() {
        return this.f82771d;
    }

    public final int getDRAWABLE_RIGHT() {
        return this.f82773f;
    }

    public final int getDRAWABLE_TOP() {
        return this.f82772e;
    }

    @Nullable
    public final Drawable[] getDrawables() {
        return this.f82777j;
    }

    public final int getFocusColor() {
        return this.f82778k;
    }

    public final void initView(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        setOnTouchListener(this);
        this.f82776i = context;
        this.f82777j = getCompoundDrawables();
        if (!isEnabled() && this.f82777j != null) {
            if (this.f82775h) {
                setCompoundDrawables(Integer.valueOf(ContextCompat.getColor(context, R.color.warmGrey)), Integer.valueOf(ContextCompat.getColor(context, R.color.warmGrey)), Integer.valueOf(ContextCompat.getColor(context, R.color.warmGrey)), Integer.valueOf(ContextCompat.getColor(context, R.color.warmGrey)));
            }
            setTextColor(ContextCompat.getColor(context, R.color.warmGrey));
            invalidate();
        }
    }

    public final boolean isInteractiveIconColor() {
        return this.f82775h;
    }

    public abstract void onFocusChangeAction(boolean z, int i, @Nullable Rect rect);

    @Override // android.widget.TextView, android.view.View
    @CallSuper
    public void onFocusChanged(boolean z, int i, @Nullable Rect rect) {
        super.onFocusChanged(z, i, rect);
        onFocusChangeAction(z, i, rect);
    }

    public abstract void onRightTouchUpAction();

    public abstract void onTextChangeAction(@Nullable CharSequence charSequence, int i, int i2, int i3);

    @Override // android.widget.TextView
    @CallSuper
    public void onTextChanged(@Nullable CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        onTextChangeAction(charSequence, i, i2, i3);
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(@Nullable View view, @NotNull MotionEvent motionEvent) {
        Drawable drawable;
        Intrinsics.checkNotNullParameter(motionEvent, "motionEvent");
        Drawable[] drawableArr = this.f82777j;
        if (drawableArr != null && (drawable = drawableArr[this.f82773f]) != null) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            int width = (getWidth() - getPaddingRight()) - drawable.getIntrinsicWidth();
            int width2 = getWidth();
            if (x >= width && x <= width2 && y >= 0 && y <= getBottom() - getTop()) {
                if (motionEvent.getAction() == 1) {
                    onRightTouchUpAction();
                }
                return true;
            }
            return false;
        }
        return false;
    }

    public final synchronized void setCompoundDrawables(@Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable Integer num4) {
        Drawable drawable;
        Drawable drawable2;
        Drawable drawable3;
        try {
            Drawable[] drawableArr = this.f82777j;
            Drawable drawable4 = null;
            if (drawableArr != null) {
                drawable = drawableArr[this.f82772e];
            } else {
                drawable = null;
            }
            if (drawable != null && num != null) {
                int intValue = num.intValue();
                drawable.mutate();
                drawable.setColorFilter(BlendModeColorFilterCompat.createBlendModeColorFilterCompat(intValue, BlendModeCompat.SRC_ATOP));
            }
            Drawable[] drawableArr2 = this.f82777j;
            if (drawableArr2 != null) {
                drawable2 = drawableArr2[this.f82771d];
            } else {
                drawable2 = null;
            }
            if (drawable2 != null && num2 != null) {
                int intValue2 = num2.intValue();
                drawable2.mutate();
                drawable2.setColorFilter(BlendModeColorFilterCompat.createBlendModeColorFilterCompat(intValue2, BlendModeCompat.SRC_ATOP));
            }
            Drawable[] drawableArr3 = this.f82777j;
            if (drawableArr3 != null) {
                drawable3 = drawableArr3[this.f82773f];
            } else {
                drawable3 = null;
            }
            if (drawable3 != null && num3 != null) {
                int intValue3 = num3.intValue();
                drawable3.mutate();
                drawable3.setColorFilter(BlendModeColorFilterCompat.createBlendModeColorFilterCompat(intValue3, BlendModeCompat.SRC_ATOP));
            }
            Drawable[] drawableArr4 = this.f82777j;
            if (drawableArr4 != null) {
                drawable4 = drawableArr4[this.f82774g];
            }
            if (drawable4 != null && num4 != null) {
                int intValue4 = num4.intValue();
                drawable4.mutate();
                drawable4.setColorFilter(BlendModeColorFilterCompat.createBlendModeColorFilterCompat(intValue4, BlendModeCompat.SRC_ATOP));
            }
            invalidate();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void setDrawables(@Nullable Drawable[] drawableArr) {
        this.f82777j = drawableArr;
    }

    public final void setFocusColor(int i) {
        this.f82778k = i;
    }

    public final void setIsInteractiveIconColor(boolean z) {
        this.f82775h = z;
    }

    public void setTextAndCompoundColor(@ColorRes int i) {
        Context context = this.f82776i;
        Context context2 = null;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException(CoreConstants.CONTEXT_SCOPE_VALUE);
            context = null;
        }
        Integer valueOf = Integer.valueOf(ContextCompat.getColor(context, i));
        Context context3 = this.f82776i;
        if (context3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(CoreConstants.CONTEXT_SCOPE_VALUE);
            context3 = null;
        }
        Integer valueOf2 = Integer.valueOf(ContextCompat.getColor(context3, i));
        Context context4 = this.f82776i;
        if (context4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(CoreConstants.CONTEXT_SCOPE_VALUE);
            context4 = null;
        }
        Integer valueOf3 = Integer.valueOf(ContextCompat.getColor(context4, i));
        Context context5 = this.f82776i;
        if (context5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(CoreConstants.CONTEXT_SCOPE_VALUE);
            context5 = null;
        }
        setCompoundDrawables(valueOf, valueOf2, valueOf3, Integer.valueOf(ContextCompat.getColor(context5, i)));
        Context context6 = this.f82776i;
        if (context6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(CoreConstants.CONTEXT_SCOPE_VALUE);
        } else {
            context2 = context6;
        }
        setTextColor(ContextCompat.getColor(context2, i));
        invalidate();
    }

    public void setupRightDrawable(@DrawableRes int i, boolean z) {
        Drawable drawable;
        Drawable drawable2;
        Drawable[] drawableArr = this.f82777j;
        if (drawableArr != null) {
            drawableArr[this.f82773f] = null;
        }
        if (z && isEnabled()) {
            Drawable[] drawableArr2 = this.f82777j;
            if (drawableArr2 != null) {
                drawableArr2[this.f82773f] = ResourcesCompat.getDrawable(getResources(), i, null);
            }
            Drawable[] drawableArr3 = this.f82777j;
            int i2 = 0;
            if (drawableArr3 != null && (drawable2 = drawableArr3[this.f82773f]) != null && drawableArr3 != null && drawable2 != null) {
                drawable2.setBounds(0, 0, drawable2.getIntrinsicWidth(), drawable2.getIntrinsicHeight());
            }
            int paddingTop = getPaddingTop();
            Drawable[] drawableArr4 = this.f82777j;
            if (drawableArr4 != null && (drawable = drawableArr4[this.f82773f]) != null) {
                i2 = drawable.getIntrinsicHeight();
            }
            int paddingBottom = paddingTop + i2 + getPaddingBottom();
            if (getSuggestedMinimumHeight() < paddingBottom) {
                setMinimumHeight(paddingBottom);
            }
        }
        Drawable[] drawableArr5 = this.f82777j;
        setCompoundDrawables(drawableArr5 != null ? drawableArr5[this.f82771d] : null, drawableArr5 != null ? drawableArr5[this.f82772e] : null, drawableArr5 != null ? drawableArr5[this.f82773f] : null, drawableArr5 != null ? drawableArr5[this.f82774g] : null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneCustomInteractiveEditText(@NotNull Context context, @NotNull AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        this.f82772e = 1;
        this.f82773f = 2;
        this.f82774g = 3;
        this.f82775h = true;
        this.f82778k = R.color.niceBlueFive;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attrs, R.styleable.OneInteractiveEditText, 0, 0);
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "context.obtainStyledAttr…nteractiveEditText, 0, 0)");
        try {
            boolean z = obtainStyledAttributes.getBoolean(R.styleable.OneInteractiveEditText_oneInteractiveIconColor, true);
            obtainStyledAttributes.recycle();
            this.f82775h = z;
            initView(context);
        } catch (Throwable th2) {
            obtainStyledAttributes.recycle();
            throw th2;
        }
    }

    public void setupRightDrawable(@DrawableRes int i, boolean z, @Nullable Integer num) {
        Drawable drawable;
        Drawable drawable2;
        Drawable[] drawableArr = this.f82777j;
        if (drawableArr != null) {
            drawableArr[this.f82773f] = null;
        }
        if (z && isEnabled()) {
            Drawable[] drawableArr2 = this.f82777j;
            if (drawableArr2 != null) {
                drawableArr2[this.f82773f] = ResourcesCompat.getDrawable(getResources(), i, null);
            }
            Drawable[] drawableArr3 = this.f82777j;
            int i2 = 0;
            if (drawableArr3 != null && (drawable2 = drawableArr3[this.f82773f]) != null) {
                if (num != null) {
                    drawable2.setColorFilter(BlendModeColorFilterCompat.createBlendModeColorFilterCompat(num.intValue(), BlendModeCompat.SRC_ATOP));
                }
                drawable2.setBounds(0, 0, drawable2.getIntrinsicWidth(), drawable2.getIntrinsicHeight());
            }
            int paddingTop = getPaddingTop();
            Drawable[] drawableArr4 = this.f82777j;
            if (drawableArr4 != null && (drawable = drawableArr4[this.f82773f]) != null) {
                i2 = drawable.getIntrinsicHeight();
            }
            int paddingBottom = paddingTop + i2 + getPaddingBottom();
            if (getSuggestedMinimumHeight() < paddingBottom) {
                setMinimumHeight(paddingBottom);
            }
        }
        Drawable[] drawableArr5 = this.f82777j;
        setCompoundDrawables(drawableArr5 != null ? drawableArr5[this.f82771d] : null, drawableArr5 != null ? drawableArr5[this.f82772e] : null, drawableArr5 != null ? drawableArr5[this.f82773f] : null, drawableArr5 != null ? drawableArr5[this.f82774g] : null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneCustomInteractiveEditText(@NotNull Context context, @NotNull AttributeSet attrs, int i) {
        super(context, attrs, i);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        this.f82772e = 1;
        this.f82773f = 2;
        this.f82774g = 3;
        this.f82775h = true;
        this.f82778k = R.color.niceBlueFive;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attrs, R.styleable.OneInteractiveEditText, 0, 0);
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "context.obtainStyledAttr…nteractiveEditText, 0, 0)");
        try {
            boolean z = obtainStyledAttributes.getBoolean(R.styleable.OneInteractiveEditText_oneInteractiveIconColor, true);
            obtainStyledAttributes.recycle();
            this.f82775h = z;
            initView(context);
        } catch (Throwable th2) {
            obtainStyledAttributes.recycle();
            throw th2;
        }
    }
}
