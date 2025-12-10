package th.p047co.dtac.android.dtacone.app_one.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.os.Build;
import android.util.AttributeSet;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.graphics.TypefaceCompat;
import ch.qos.logback.core.CoreConstants;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.i18n.TextBundle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.util.font.OneMultiLanguageUtil;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bB#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\r\u0010\u0005J#\u0010\u0012\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\f¢\u0006\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001c\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0018\u0010 \u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0018\u0010\"\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\u001fR\u0016\u0010%\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R4\u0010-\u001a\n '*\u0004\u0018\u00010&0&2\u000e\u0010(\u001a\n '*\u0004\u0018\u00010&0&8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,¨\u0006."}, m28850d2 = {"Lth/co/dtac/android/dtacone/app_one/widget/OneFontTextView;", "Landroidx/appcompat/widget/AppCompatTextView;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", OperatorName.ENDPATH, "", TextBundle.TEXT_ENTRY, "Landroid/widget/TextView$BufferType;", "type", "setText", "(Ljava/lang/CharSequence;Landroid/widget/TextView$BufferType;)V", TypedValues.Custom.S_COLOR, "setTextColor", "(I)V", "toInvisible", "()V", "", OperatorName.CLOSE_PATH, "Z", "animationText", "Landroid/view/animation/Animation;", "i", "Landroid/view/animation/Animation;", "animationFadeIn", OperatorName.SET_LINE_JOINSTYLE, "animationFadeOut", OperatorName.NON_STROKING_CMYK, "I", "fontWeight", "", "kotlin.jvm.PlatformType", "value", "getOneTag", "()Ljava/lang/Object;", "setOneTag", "(Ljava/lang/Object;)V", "oneTag", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.app_one.widget.OneFontTextView */
/* loaded from: classes7.dex */
public final class OneFontTextView extends AppCompatTextView {
    public static final int $stable = 8;

    /* renamed from: h */
    public boolean f82812h;

    /* renamed from: i */
    public Animation f82813i;

    /* renamed from: j */
    public Animation f82814j;

    /* renamed from: k */
    public int f82815k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneFontTextView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f82815k = 400;
        m19896n(context);
    }

    /* renamed from: n */
    private final void m19896n(Context context) {
        setLineSpacing(getResources().getDimension(R.dimen.dp8), 1.0f);
        if (!isInEditMode()) {
            this.f82813i = AnimationUtils.loadAnimation(getContext(), 17432576);
            this.f82814j = AnimationUtils.loadAnimation(getContext(), 17432577);
        }
    }

    public final Object getOneTag() {
        return getTag();
    }

    public final void setOneTag(Object obj) {
        setTag(obj);
    }

    @Override // android.widget.TextView
    public void setText(@Nullable CharSequence charSequence, @Nullable TextView.BufferType bufferType) {
        super.setText(charSequence, bufferType);
        if (this.f82812h) {
            startAnimation(this.f82813i);
        }
    }

    @Override // android.widget.TextView
    public void setTextColor(int i) {
        invalidate();
        super.setTextColor(i);
    }

    public final void toInvisible() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @SuppressLint({"CustomViewStyleable"})
    public OneFontTextView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Typeface font;
        Intrinsics.checkNotNullParameter(context, "context");
        this.f82815k = 400;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.OneFontTextView);
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "context.obtainStyledAttr…tyleable.OneFontTextView)");
        try {
            this.f82812h = obtainStyledAttributes.getBoolean(R.styleable.OneFontTextView_animationTextChange, false);
            int i = obtainStyledAttributes.getInt(R.styleable.OneFontTextView_android_textStyle, 0);
            int i2 = obtainStyledAttributes.getInt(R.styleable.OneFontTextView_android_fontWeight, this.f82815k);
            if (i == 0) {
                font = ResourcesCompat.getFont(context, R.font.better_together_regular);
            } else if (i != 1) {
                font = ResourcesCompat.getFont(context, R.font.one_font_style);
            } else {
                Typeface font2 = ResourcesCompat.getFont(context, R.font.better_together_medium);
                if (Build.VERSION.SDK_INT >= 28) {
                    font = Typeface.create(font2, i2, false);
                } else {
                    font = TypefaceCompat.create(context, font2, 1);
                }
            }
            setTypeface(font);
            OneMultiLanguageUtil.INSTANCE.setLanguageToView(obtainStyledAttributes, this);
            obtainStyledAttributes.recycle();
            m19896n(context);
        } catch (Throwable th2) {
            obtainStyledAttributes.recycle();
            throw th2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneFontTextView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f82815k = 400;
        m19896n(context);
    }
}
