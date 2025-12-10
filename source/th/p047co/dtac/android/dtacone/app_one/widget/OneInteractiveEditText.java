package th.p047co.dtac.android.dtacone.app_one.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
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
import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.R;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\n\b'\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0019\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\tB!\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0005\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH&¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH&¢\u0006\u0004\b\u0010\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\n¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\n¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001c\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u001c\u0010\u0006J!\u0010!\u001a\u00020\u00162\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b!\u0010\"J)\u0010'\u001a\u00020\r2\u0006\u0010#\u001a\u00020\u00162\u0006\u0010$\u001a\u00020\n2\b\u0010&\u001a\u0004\u0018\u00010%H\u0015¢\u0006\u0004\b'\u0010(J\u0015\u0010)\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\n¢\u0006\u0004\b)\u0010\u0013J!\u0010,\u001a\u00020\r2\b\b\u0001\u0010*\u001a\u00020\n2\u0006\u0010+\u001a\u00020\u0016H\u0016¢\u0006\u0004\b,\u0010-J+\u0010,\u001a\u00020\r2\b\b\u0001\u0010*\u001a\u00020\n2\u0006\u0010+\u001a\u00020\u00162\b\u0010\u0011\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b,\u0010.J\u0019\u0010/\u001a\u00020\r2\b\b\u0001\u0010*\u001a\u00020\nH\u0016¢\u0006\u0004\b/\u0010\u0013R\u001a\u00103\u001a\u00020\n8\u0006X\u0086D¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u0010\u0015R\u001a\u00106\u001a\u00020\n8\u0006X\u0086D¢\u0006\f\n\u0004\b4\u00101\u001a\u0004\b5\u0010\u0015R\u001a\u00109\u001a\u00020\n8\u0006X\u0086D¢\u0006\f\n\u0004\b7\u00101\u001a\u0004\b8\u0010\u0015R\u001a\u0010<\u001a\u00020\n8\u0006X\u0086D¢\u0006\f\n\u0004\b:\u00101\u001a\u0004\b;\u0010\u0015R\u0016\u0010\u001a\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>R\u0016\u0010\u0004\u001a\u00020\u00038\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b?\u0010@R,\u0010I\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010B\u0018\u00010A8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bC\u0010D\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR\u0016\u0010K\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u00101¨\u0006L"}, m28850d2 = {"Lth/co/dtac/android/dtacone/app_one/widget/OneInteractiveEditText;", "Lth/co/dtac/android/dtacone/app_one/widget/OneEditText;", "Landroid/view/View$OnTouchListener;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "onRightTouchUpAction", "()V", "onTouchActionDown", TypedValues.Custom.S_COLOR, "setFocusColor", "(I)V", "getFocusColor", "()I", "", "check", "setIsInteractiveIconColor", "(Z)V", "isInteractiveIconColor", "()Z", "initView", "Landroid/view/View;", Promotion.ACTION_VIEW, "Landroid/view/MotionEvent;", "motionEvent", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "focused", "direction", "Landroid/graphics/Rect;", "previouslyFocusedRect", "onFocusChanged", "(ZILandroid/graphics/Rect;)V", "setCompoundDrawables", "resId", "visible", "setupRightDrawable", "(IZ)V", "(IZLjava/lang/Integer;)V", "setTextAndCompoundColor", "d", "I", "getDRAWABLE_LEFT", "DRAWABLE_LEFT", "e", "getDRAWABLE_TOP", "DRAWABLE_TOP", OperatorName.FILL_NON_ZERO, "getDRAWABLE_RIGHT", "DRAWABLE_RIGHT", OperatorName.NON_STROKING_GRAY, "getDRAWABLE_BOTTOM", "DRAWABLE_BOTTOM", OperatorName.CLOSE_PATH, "Z", "i", "Landroid/content/Context;", "", "Landroid/graphics/drawable/Drawable;", OperatorName.SET_LINE_JOINSTYLE, "[Landroid/graphics/drawable/Drawable;", "getDrawables", "()[Landroid/graphics/drawable/Drawable;", "setDrawables", "([Landroid/graphics/drawable/Drawable;)V", "drawables", OperatorName.NON_STROKING_CMYK, "focusColor", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nOneInteractiveEditText.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneInteractiveEditText.kt\nth/co/dtac/android/dtacone/app_one/widget/OneInteractiveEditText\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,205:1\n13309#2,2:206\n*S KotlinDebug\n*F\n+ 1 OneInteractiveEditText.kt\nth/co/dtac/android/dtacone/app_one/widget/OneInteractiveEditText\n*L\n125#1:206,2\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.app_one.widget.OneInteractiveEditText */
/* loaded from: classes7.dex */
public abstract class OneInteractiveEditText extends OneEditText implements View.OnTouchListener {
    public static final int $stable = 8;

    /* renamed from: d */
    public final int f82816d;

    /* renamed from: e */
    public final int f82817e;

    /* renamed from: f */
    public final int f82818f;

    /* renamed from: g */
    public final int f82819g;

    /* renamed from: h */
    public boolean f82820h;

    /* renamed from: i */
    public Context f82821i;

    /* renamed from: j */
    public Drawable[] f82822j;

    /* renamed from: k */
    public int f82823k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneInteractiveEditText(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f82817e = 1;
        this.f82818f = 2;
        this.f82819g = 3;
        this.f82820h = true;
        this.f82823k = R.color.niceBlueFive;
        initView(context);
    }

    public final int getDRAWABLE_BOTTOM() {
        return this.f82819g;
    }

    public final int getDRAWABLE_LEFT() {
        return this.f82816d;
    }

    public final int getDRAWABLE_RIGHT() {
        return this.f82818f;
    }

    public final int getDRAWABLE_TOP() {
        return this.f82817e;
    }

    @Nullable
    public final Drawable[] getDrawables() {
        return this.f82822j;
    }

    public final int getFocusColor() {
        return this.f82823k;
    }

    public final void initView(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        setOnTouchListener(this);
        this.f82821i = context;
        this.f82822j = getCompoundDrawables();
        if (!isEnabled() && this.f82822j != null) {
            if (this.f82820h) {
                setCompoundDrawables(ContextCompat.getColor(context, R.color.jet_back));
            }
            setTextColor(ContextCompat.getColor(context, R.color.jet_back));
            invalidate();
        }
    }

    public final boolean isInteractiveIconColor() {
        return this.f82820h;
    }

    @Override // android.widget.TextView, android.view.View
    @CallSuper
    public void onFocusChanged(boolean z, int i, @Nullable Rect rect) {
        int color;
        Drawable drawable;
        Drawable drawable2;
        Drawable drawable3;
        super.onFocusChanged(z, i, rect);
        if (this.f82820h) {
            Drawable drawable4 = null;
            if (z && isEnabled()) {
                Context context = this.f82821i;
                if (context == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(CoreConstants.CONTEXT_SCOPE_VALUE);
                    context = null;
                }
                color = ContextCompat.getColor(context, this.f82823k);
            } else if (!isEnabled()) {
                Context context2 = this.f82821i;
                if (context2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(CoreConstants.CONTEXT_SCOPE_VALUE);
                    context2 = null;
                }
                color = ContextCompat.getColor(context2, R.color.jet_back);
            } else {
                Context context3 = this.f82821i;
                if (context3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(CoreConstants.CONTEXT_SCOPE_VALUE);
                    context3 = null;
                }
                color = ContextCompat.getColor(context3, R.color.jet_back);
            }
            setTextColor(color);
            setCompoundDrawables(color);
            Drawable[] drawableArr = this.f82822j;
            if (drawableArr != null) {
                drawable = drawableArr[this.f82816d];
            } else {
                drawable = null;
            }
            if (drawableArr != null) {
                drawable2 = drawableArr[this.f82817e];
            } else {
                drawable2 = null;
            }
            if (drawableArr != null) {
                drawable3 = drawableArr[this.f82818f];
            } else {
                drawable3 = null;
            }
            if (drawableArr != null) {
                drawable4 = drawableArr[this.f82819g];
            }
            setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        }
    }

    public abstract void onRightTouchUpAction();

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(@Nullable View view, @NotNull MotionEvent motionEvent) {
        Drawable drawable;
        Intrinsics.checkNotNullParameter(motionEvent, "motionEvent");
        if (motionEvent.getAction() == 0) {
            onTouchActionDown();
        }
        Drawable[] drawableArr = this.f82822j;
        if (drawableArr != null && (drawable = drawableArr[this.f82818f]) != null) {
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

    public abstract void onTouchActionDown();

    public final synchronized void setCompoundDrawables(int i) {
        try {
            Drawable[] drawableArr = this.f82822j;
            if (drawableArr != null) {
                for (Drawable drawable : drawableArr) {
                    if (drawable != null) {
                        drawable.mutate();
                        drawable.setColorFilter(i, PorterDuff.Mode.SRC_IN);
                    }
                }
            }
            invalidate();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void setDrawables(@Nullable Drawable[] drawableArr) {
        this.f82822j = drawableArr;
    }

    public final void setFocusColor(int i) {
        this.f82823k = i;
    }

    public final void setIsInteractiveIconColor(boolean z) {
        this.f82820h = z;
    }

    public void setTextAndCompoundColor(@ColorRes int i) {
        Context context = this.f82821i;
        Context context2 = null;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException(CoreConstants.CONTEXT_SCOPE_VALUE);
            context = null;
        }
        setCompoundDrawables(ContextCompat.getColor(context, i));
        Context context3 = this.f82821i;
        if (context3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(CoreConstants.CONTEXT_SCOPE_VALUE);
        } else {
            context2 = context3;
        }
        setTextColor(ContextCompat.getColor(context2, i));
        invalidate();
    }

    public void setupRightDrawable(@DrawableRes int i, boolean z) {
        Drawable drawable;
        Drawable drawable2;
        Drawable drawable3;
        Drawable[] drawableArr = this.f82822j;
        if (drawableArr != null) {
            drawableArr[this.f82818f] = null;
        }
        if (z && isEnabled()) {
            Drawable[] drawableArr2 = this.f82822j;
            if (drawableArr2 != null) {
                drawableArr2[this.f82818f] = ResourcesCompat.getDrawable(getResources(), i, null);
            }
            Drawable[] drawableArr3 = this.f82822j;
            if (drawableArr3 != null && (drawable3 = drawableArr3[this.f82818f]) != null) {
                Context context = this.f82821i;
                if (context == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(CoreConstants.CONTEXT_SCOPE_VALUE);
                    context = null;
                }
                drawable3.setColorFilter(ContextCompat.getColor(context, this.f82823k), PorterDuff.Mode.SRC_IN);
            }
            Drawable[] drawableArr4 = this.f82822j;
            int i2 = 0;
            if (drawableArr4 != null && (drawable2 = drawableArr4[this.f82818f]) != null && drawableArr4 != null && drawable2 != null) {
                drawable2.setBounds(0, 0, drawable2.getIntrinsicWidth(), drawable2.getIntrinsicHeight());
            }
            int paddingTop = getPaddingTop();
            Drawable[] drawableArr5 = this.f82822j;
            if (drawableArr5 != null && (drawable = drawableArr5[this.f82818f]) != null) {
                i2 = drawable.getIntrinsicHeight();
            }
            int paddingBottom = paddingTop + i2 + getPaddingBottom();
            if (getSuggestedMinimumHeight() < paddingBottom) {
                setMinimumHeight(paddingBottom);
            }
        }
        Drawable[] drawableArr6 = this.f82822j;
        setCompoundDrawables(drawableArr6 != null ? drawableArr6[this.f82816d] : null, drawableArr6 != null ? drawableArr6[this.f82817e] : null, drawableArr6 != null ? drawableArr6[this.f82818f] : null, drawableArr6 != null ? drawableArr6[this.f82819g] : null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneInteractiveEditText(@NotNull Context context, @NotNull AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        this.f82817e = 1;
        this.f82818f = 2;
        this.f82819g = 3;
        this.f82820h = true;
        this.f82823k = R.color.niceBlueFive;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attrs, R.styleable.OneInteractiveEditText, 0, 0);
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "context.obtainStyledAttr…nteractiveEditText, 0, 0)");
        try {
            boolean z = obtainStyledAttributes.getBoolean(R.styleable.OneInteractiveEditText_oneInteractiveIconColor, true);
            obtainStyledAttributes.recycle();
            this.f82820h = z;
            initView(context);
        } catch (Throwable th2) {
            obtainStyledAttributes.recycle();
            throw th2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneInteractiveEditText(@NotNull Context context, @NotNull AttributeSet attrs, int i) {
        super(context, attrs, i);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        this.f82817e = 1;
        this.f82818f = 2;
        this.f82819g = 3;
        this.f82820h = true;
        this.f82823k = R.color.niceBlueFive;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attrs, R.styleable.OneInteractiveEditText, 0, 0);
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "context.obtainStyledAttr…nteractiveEditText, 0, 0)");
        try {
            boolean z = obtainStyledAttributes.getBoolean(R.styleable.OneInteractiveEditText_oneInteractiveIconColor, true);
            obtainStyledAttributes.recycle();
            this.f82820h = z;
            initView(context);
        } catch (Throwable th2) {
            obtainStyledAttributes.recycle();
            throw th2;
        }
    }

    public void setupRightDrawable(@DrawableRes int i, boolean z, @Nullable Integer num) {
        Drawable drawable;
        Drawable drawable2;
        Drawable[] drawableArr = this.f82822j;
        if (drawableArr != null) {
            drawableArr[this.f82818f] = null;
        }
        if (z && isEnabled()) {
            Drawable[] drawableArr2 = this.f82822j;
            if (drawableArr2 != null) {
                drawableArr2[this.f82818f] = ResourcesCompat.getDrawable(getResources(), i, null);
            }
            Drawable[] drawableArr3 = this.f82822j;
            int i2 = 0;
            if (drawableArr3 != null && (drawable2 = drawableArr3[this.f82818f]) != null) {
                if (num != null) {
                    Context context = this.f82821i;
                    if (context == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(CoreConstants.CONTEXT_SCOPE_VALUE);
                        context = null;
                    }
                    drawable2.setColorFilter(ContextCompat.getColor(context, num.intValue()), PorterDuff.Mode.SRC_IN);
                }
                drawable2.setBounds(0, 0, drawable2.getIntrinsicWidth(), drawable2.getIntrinsicHeight());
            }
            int paddingTop = getPaddingTop();
            Drawable[] drawableArr4 = this.f82822j;
            if (drawableArr4 != null && (drawable = drawableArr4[this.f82818f]) != null) {
                i2 = drawable.getIntrinsicHeight();
            }
            int paddingBottom = paddingTop + i2 + getPaddingBottom();
            if (getSuggestedMinimumHeight() < paddingBottom) {
                setMinimumHeight(paddingBottom);
            }
        }
        Drawable[] drawableArr5 = this.f82822j;
        setCompoundDrawables(drawableArr5 != null ? drawableArr5[this.f82816d] : null, drawableArr5 != null ? drawableArr5[this.f82817e] : null, drawableArr5 != null ? drawableArr5[this.f82818f] : null, drawableArr5 != null ? drawableArr5[this.f82819g] : null);
    }
}
