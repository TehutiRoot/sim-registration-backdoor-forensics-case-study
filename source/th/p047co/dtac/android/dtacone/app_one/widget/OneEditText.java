package th.p047co.dtac.android.dtacone.app_one.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.Editable;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.res.ResourcesCompat;
import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.i18n.TextBundle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.util.font.OneMultiLanguageUtil;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\b\b\u0017\u0018\u00002\u00020\u0001:\u0001&B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0019\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bB!\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\r\u0010\u0005J!\u0010\u0012\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010!\u001a\u00020\u001f8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\r\u0010 R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\"R\u0016\u0010%\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006'"}, m28850d2 = {"Lth/co/dtac/android/dtacone/app_one/widget/OneEditText;", "Landroidx/appcompat/widget/AppCompatEditText;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", PDPageLabelRange.STYLE_LETTERS_LOWER, "", TextBundle.TEXT_ENTRY, "Landroid/widget/TextView$BufferType;", "type", "setText", "(Ljava/lang/CharSequence;Landroid/widget/TextView$BufferType;)V", "Lth/co/dtac/android/dtacone/app_one/widget/OneEditText$UpdateListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setUpdateListener", "(Lth/co/dtac/android/dtacone/app_one/widget/OneEditText$UpdateListener;)V", "", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "setBlockPaste", "(Z)V", "id", "onTextContextMenuItem", "(I)Z", "", "Ljava/lang/String;", "blockCharacterSet", "Lth/co/dtac/android/dtacone/app_one/widget/OneEditText$UpdateListener;", OperatorName.CURVE_TO, "Z", "isBlockPaste", "UpdateListener", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.app_one.widget.OneEditText */
/* loaded from: classes7.dex */
public class OneEditText extends AppCompatEditText {
    public static final int $stable = 8;

    /* renamed from: a */
    public final String f82783a;

    /* renamed from: b */
    public UpdateListener f82784b;

    /* renamed from: c */
    public boolean f82785c;

    @Metadata(m28851d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&¨\u0006\u0006"}, m28850d2 = {"Lth/co/dtac/android/dtacone/app_one/widget/OneEditText$UpdateListener;", "", "onCopy", "", "onCut", "onPaste", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.app_one.widget.OneEditText$UpdateListener */
    /* loaded from: classes7.dex */
    public interface UpdateListener {
        void onCopy();

        void onCut();

        void onPaste();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneEditText(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f82783a = "~#^|$%&*!";
        m19907a(context);
    }

    /* renamed from: a */
    private final void m19907a(Context context) {
        setTypeface(ResourcesCompat.getFont(context, R.font.one_font_style));
    }

    @Override // androidx.appcompat.widget.AppCompatEditText, android.widget.TextView
    public boolean onTextContextMenuItem(int i) {
        if (i != 16908337) {
            switch (i) {
                case 16908320:
                    UpdateListener updateListener = this.f82784b;
                    if (updateListener != null) {
                        updateListener.onCut();
                    }
                    return super.onTextContextMenuItem(i);
                case 16908321:
                    UpdateListener updateListener2 = this.f82784b;
                    if (updateListener2 != null) {
                        updateListener2.onCopy();
                    }
                    return super.onTextContextMenuItem(i);
                case 16908322:
                    break;
                default:
                    return super.onTextContextMenuItem(i);
            }
        }
        UpdateListener updateListener3 = this.f82784b;
        if (updateListener3 != null) {
            updateListener3.onPaste();
        }
        if (this.f82785c) {
            return false;
        }
        return super.onTextContextMenuItem(i);
    }

    public void setBlockPaste(boolean z) {
        this.f82785c = z;
    }

    @Override // android.widget.EditText, android.widget.TextView
    public void setText(@Nullable CharSequence charSequence, @NotNull TextView.BufferType type) {
        Intrinsics.checkNotNullParameter(type, "type");
        super.setText(charSequence, type);
        if (charSequence != null) {
            Editable text = getText();
            Intrinsics.checkNotNull(text);
            setSelection(text.length());
            invalidate();
        }
    }

    public void setUpdateListener(@NotNull UpdateListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f82784b = listener;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @SuppressLint({"CustomViewStyleable"})
    public OneEditText(@NotNull Context context, @NotNull AttributeSet attrs) {
        super(context, attrs);
        Typeface font;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        this.f82783a = "~#^|$%&*!";
        m19907a(context);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attrs, R.styleable.OneFontTextView);
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "context.obtainStyledAttr…tyleable.OneFontTextView)");
        try {
            if (!obtainStyledAttributes.getBoolean(R.styleable.OneFontTextView_isCopyPaste, true)) {
                this.f82785c = true;
            }
            int i = obtainStyledAttributes.getInt(R.styleable.OneFontTextView_android_textStyle, 0);
            if (i == 0) {
                font = ResourcesCompat.getFont(context, R.font.better_together_regular);
            } else if (i != 1) {
                font = ResourcesCompat.getFont(context, R.font.one_font_style);
            } else {
                font = ResourcesCompat.getFont(context, R.font.better_together_medium);
            }
            setTypeface(font);
            OneMultiLanguageUtil.INSTANCE.setLanguageToView(obtainStyledAttributes, this);
            obtainStyledAttributes.recycle();
        } catch (Throwable th2) {
            obtainStyledAttributes.recycle();
            throw th2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneEditText(@NotNull Context context, @NotNull AttributeSet attrs, int i) {
        super(context, attrs, i);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        this.f82783a = "~#^|$%&*!";
        m19907a(context);
    }
}
