package th.p047co.dtac.android.dtacone.app_one.widget;

import android.content.Context;
import android.util.AttributeSet;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.res.ResourcesCompat;
import ch.qos.logback.core.CoreConstants;
import com.azimolabs.maskformatter.MaskFormatter;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.view.listener.DrawableClickListener;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bB!\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\r\u0010\u0005J\u000f\u0010\u000e\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0010\u0010\u000fJ\u0015\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, m28850d2 = {"Lth/co/dtac/android/dtacone/app_one/widget/OneLaserIdEditText;", "Lth/co/dtac/android/dtacone/app_one/widget/OneInteractiveEditText;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", PDPageLabelRange.STYLE_LETTERS_LOWER, "onRightTouchUpAction", "()V", "onTouchActionDown", "Lth/co/dtac/android/dtacone/widget/view/listener/DrawableClickListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "registerDrawableAction", "(Lth/co/dtac/android/dtacone/widget/view/listener/DrawableClickListener;)V", OperatorName.LINE_TO, "Lth/co/dtac/android/dtacone/widget/view/listener/DrawableClickListener;", "drawableListener", "Companion", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.app_one.widget.OneLaserIdEditText */
/* loaded from: classes7.dex */
public final class OneLaserIdEditText extends OneInteractiveEditText {

    /* renamed from: l */
    public DrawableClickListener f82824l;
    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m28851d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m28850d2 = {"Lth/co/dtac/android/dtacone/app_one/widget/OneLaserIdEditText$Companion;", "", "()V", "LASER_ID_FORMAT", "", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.app_one.widget.OneLaserIdEditText$Companion */
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneLaserIdEditText(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        m19895a(context);
    }

    /* renamed from: a */
    private final void m19895a(Context context) {
        addTextChangedListener(new MaskFormatter("AA9-9999999-99", this, '-'));
        setTypeface(ResourcesCompat.getFont(context, R.font.one_font_style));
    }

    @Override // th.p047co.dtac.android.dtacone.app_one.widget.OneInteractiveEditText
    public void onRightTouchUpAction() {
        DrawableClickListener drawableClickListener = this.f82824l;
        if (drawableClickListener != null) {
            drawableClickListener.onClickDrawable(DrawableClickListener.DrawablePosition.RIGHT);
        }
    }

    @Override // th.p047co.dtac.android.dtacone.app_one.widget.OneInteractiveEditText
    public void onTouchActionDown() {
    }

    public final void registerDrawableAction(@NotNull DrawableClickListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f82824l = listener;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneLaserIdEditText(@NotNull Context context, @NotNull AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        m19895a(context);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneLaserIdEditText(@NotNull Context context, @NotNull AttributeSet attrs, int i) {
        super(context, attrs, i);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        m19895a(context);
    }
}
