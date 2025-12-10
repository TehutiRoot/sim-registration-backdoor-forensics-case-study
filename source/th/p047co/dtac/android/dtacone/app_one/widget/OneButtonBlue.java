package th.p047co.dtac.android.dtacone.app_one.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import ch.qos.logback.core.CoreConstants;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.i18n.TextBundle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.R;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0006¢\u0006\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0015\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0019\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, m28850d2 = {"Lth/co/dtac/android/dtacone/app_one/widget/OneButtonBlue;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", TextBundle.TEXT_ENTRY, "", "setText", "(Ljava/lang/String;)V", "background", "setButtonBackground", "(I)V", "Lth/co/dtac/android/dtacone/app_one/widget/OneFontTextView;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lth/co/dtac/android/dtacone/app_one/widget/OneFontTextView;", "tvBtn", "Landroidx/constraintlayout/widget/ConstraintLayout;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Landroidx/constraintlayout/widget/ConstraintLayout;", "rootButton", "Landroid/content/res/TypedArray;", OperatorName.CURVE_TO, "Landroid/content/res/TypedArray;", "attributes", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0})
@SuppressLint({"CustomViewStyleable"})
@SourceDebugExtension({"SMAP\nOneButtonBlue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneButtonBlue.kt\nth/co/dtac/android/dtacone/app_one/widget/OneButtonBlue\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,55:1\n1#2:56\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.app_one.widget.OneButtonBlue */
/* loaded from: classes7.dex */
public final class OneButtonBlue extends FrameLayout {
    public static final int $stable = 8;

    /* renamed from: a */
    public OneFontTextView f82746a;

    /* renamed from: b */
    public ConstraintLayout f82747b;

    /* renamed from: c */
    public TypedArray f82748c;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public OneButtonBlue(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void setButtonBackground(int i) {
        this.f82747b.setBackgroundResource(i);
    }

    public final void setText(@NotNull String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f82746a.setText(text);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public OneButtonBlue(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ OneButtonBlue(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public OneButtonBlue(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f82748c = attributeSet != null ? context.obtainStyledAttributes(attributeSet, R.styleable.OneButton) : null;
        LayoutInflater.from(context).inflate(R.layout.one_blue_button, (ViewGroup) this, true);
        View findViewById = findViewById(R.id.tvBtn);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(R.id.tvBtn)");
        this.f82746a = (OneFontTextView) findViewById;
        View findViewById2 = findViewById(R.id.rootButton);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(R.id.rootButton)");
        this.f82747b = (ConstraintLayout) findViewById2;
        TypedArray typedArray = this.f82748c;
        if (typedArray != null) {
            CharSequence text = typedArray.getText(R.styleable.OneButton_android_text);
            if (text != null) {
                Intrinsics.checkNotNullExpressionValue(text, "getText(R.styleable.OneButton_android_text)");
                this.f82746a.setText(text);
            }
            if (typedArray.hasValue(R.styleable.OneButton_android_textSize)) {
                this.f82746a.setTextSize(0, typedArray.getDimension(R.styleable.OneButton_android_textSize, this.f82746a.getTextSize()));
            }
            if (typedArray.hasValue(R.styleable.OneButton_android_textColor)) {
                OneFontTextView oneFontTextView = this.f82746a;
                oneFontTextView.setTextColor(typedArray.getColor(R.styleable.OneButton_android_textColor, oneFontTextView.getCurrentTextColor()));
            }
            typedArray.recycle();
        }
    }
}
