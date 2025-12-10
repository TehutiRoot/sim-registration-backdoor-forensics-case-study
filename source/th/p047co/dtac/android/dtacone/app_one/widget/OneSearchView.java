package th.p047co.dtac.android.dtacone.app_one.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.R;
import androidx.appcompat.widget.SearchView;
import androidx.compose.runtime.internal.StabilityInferred;
import ch.qos.logback.core.CoreConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.app_one.util.font.OneTypefaceUtil;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bB!\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u000eR\"\u0010\u0011\u001a\u00020\u00108\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\u0018\u001a\u00020\u00178\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, m28850d2 = {"Lth/co/dtac/android/dtacone/app_one/widget/OneSearchView;", "Landroidx/appcompat/widget/SearchView;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "Z", "()V", "clearEditText", "Landroid/widget/TextView;", "tvSearchText", "Landroid/widget/TextView;", "getTvSearchText", "()Landroid/widget/TextView;", "setTvSearchText", "(Landroid/widget/TextView;)V", "Landroid/widget/ImageView;", "clearButton", "Landroid/widget/ImageView;", "getClearButton", "()Landroid/widget/ImageView;", "setClearButton", "(Landroid/widget/ImageView;)V", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.app_one.widget.OneSearchView */
/* loaded from: classes7.dex */
public final class OneSearchView extends SearchView {
    public static final int $stable = 8;
    public ImageView clearButton;
    public TextView tvSearchText;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneSearchView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        m19887Z();
    }

    /* renamed from: Z */
    private final void m19887Z() {
        View findViewById = findViewById(R.id.search_src_text);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(androidx.ap…pat.R.id.search_src_text)");
        setTvSearchText((TextView) findViewById);
        View findViewById2 = findViewById(R.id.search_close_btn);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(androidx.ap…at.R.id.search_close_btn)");
        setClearButton((ImageView) findViewById2);
        getTvSearchText().setTypeface(OneTypefaceUtil.getTypefaceRegular(getContext()));
    }

    public final void clearEditText() {
        getTvSearchText().setText("");
    }

    @NotNull
    public final ImageView getClearButton() {
        ImageView imageView = this.clearButton;
        if (imageView != null) {
            return imageView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("clearButton");
        return null;
    }

    @NotNull
    public final TextView getTvSearchText() {
        TextView textView = this.tvSearchText;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("tvSearchText");
        return null;
    }

    public final void setClearButton(@NotNull ImageView imageView) {
        Intrinsics.checkNotNullParameter(imageView, "<set-?>");
        this.clearButton = imageView;
    }

    public final void setTvSearchText(@NotNull TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.tvSearchText = textView;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneSearchView(@NotNull Context context, @NotNull AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        m19887Z();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneSearchView(@NotNull Context context, @NotNull AttributeSet attrs, int i) {
        super(context, attrs, i);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        m19887Z();
    }
}
