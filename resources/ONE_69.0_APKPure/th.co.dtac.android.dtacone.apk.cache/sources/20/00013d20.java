package th.p047co.dtac.android.dtacone.view.appOne.rectify.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.res.ResourcesCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.StandardStructureTypes;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.model.rectify.OneRectifyListResponse;
import th.p047co.dtac.android.dtacone.app_one.util.p048enum.OnePermissionKt;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;
import th.p047co.dtac.android.dtacone.databinding.OneRectifyHeaderRowBinding;
import th.p047co.dtac.android.dtacone.databinding.OneRectifyItemRowBinding;
import th.p047co.dtac.android.dtacone.extension.format.StringExtKt;
import th.p047co.dtac.android.dtacone.util.constant.LanguageSupport;
import th.p047co.dtac.android.dtacone.util.constant.PermissionConstant;
import th.p047co.dtac.android.dtacone.util.date.DateUtil;
import th.p047co.dtac.android.dtacone.util.format.PhoneNumberFormat;
import th.p047co.dtac.android.dtacone.view.appOne.rectify.model.RectyfyThemeColorModel;
import th.p047co.dtac.android.dtacone.widget.view.DtacCardView;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003:;<B!\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000f\u001a\u00020\u000e2\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0013H\u0016¢\u0006\u0004\b!\u0010\"J\u0017\u0010%\u001a\u00020\u000e2\b\u0010$\u001a\u0004\u0018\u00010#¢\u0006\u0004\b%\u0010&J\u0017\u0010(\u001a\u00020'2\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b(\u0010)R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010*R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u00101\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0018\u0010$\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u001e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u00107\u001a\u00020\u00138\u0002X\u0082D¢\u0006\u0006\n\u0004\b6\u00100R\u0014\u00109\u001a\u00020\u00138\u0002X\u0082D¢\u0006\u0006\n\u0004\b8\u00100¨\u0006="}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/rectify/adapter/OneRectifyAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/content/Context;", "mContext", "", "company", "Lth/co/dtac/android/dtacone/view/appOne/rectify/model/RectyfyThemeColorModel;", "themeColorModel", "<init>", "(Landroid/content/Context;Ljava/lang/String;Lth/co/dtac/android/dtacone/view/appOne/rectify/model/RectyfyThemeColorModel;)V", "", "", "rectifyList", "", "setRectifyList", "(Ljava/util/List;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "holder", "position", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "Lth/co/dtac/android/dtacone/app_one/model/rectify/OneRectifyListResponse$DataItem$RectifyItem;", "rectify", "convertRectifyType", "(Lth/co/dtac/android/dtacone/app_one/model/rectify/OneRectifyListResponse$DataItem$RectifyItem;)Ljava/lang/String;", "getItemViewType", "(I)I", "getItemCount", "()I", "Lth/co/dtac/android/dtacone/view/appOne/rectify/adapter/OneRectifyAdapter$OnClickRectify;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setOnClickRectify", "(Lth/co/dtac/android/dtacone/view/appOne/rectify/adapter/OneRectifyAdapter$OnClickRectify;)V", "", PDPageLabelRange.STYLE_LETTERS_LOWER, "(Lth/co/dtac/android/dtacone/app_one/model/rectify/OneRectifyListResponse$DataItem$RectifyItem;)Z", "Landroid/content/Context;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Ljava/lang/String;", OperatorName.CURVE_TO, "Lth/co/dtac/android/dtacone/view/appOne/rectify/model/RectyfyThemeColorModel;", "d", "I", "lastPosition", "e", "Lth/co/dtac/android/dtacone/view/appOne/rectify/adapter/OneRectifyAdapter$OnClickRectify;", OperatorName.FILL_NON_ZERO, "Ljava/util/List;", OperatorName.NON_STROKING_GRAY, "BODY_VIEW", OperatorName.CLOSE_PATH, "HEADER_VIEW", "OnClickRectify", "RectifyHeaderViewHolder", "RectifyViewHolder", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nOneRectifyAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneRectifyAdapter.kt\nth/co/dtac/android/dtacone/view/appOne/rectify/adapter/OneRectifyAdapter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,161:1\n1#2:162\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.rectify.adapter.OneRectifyAdapter */
/* loaded from: classes10.dex */
public final class OneRectifyAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    public static final int $stable = 8;

    /* renamed from: a */
    public final Context f96050a;

    /* renamed from: b */
    public final String f96051b;

    /* renamed from: c */
    public final RectyfyThemeColorModel f96052c;

    /* renamed from: d */
    public int f96053d;

    /* renamed from: e */
    public OnClickRectify f96054e;

    /* renamed from: f */
    public List f96055f;

    /* renamed from: g */
    public final int f96056g;

    /* renamed from: h */
    public final int f96057h;

    @Metadata(m29143d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&¨\u0006\u0006"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/rectify/adapter/OneRectifyAdapter$OnClickRectify;", "", "onClickRectifyItem", "", "rectifyListCollection", "Lth/co/dtac/android/dtacone/app_one/model/rectify/OneRectifyListResponse$DataItem$RectifyItem;", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.rectify.adapter.OneRectifyAdapter$OnClickRectify */
    /* loaded from: classes10.dex */
    public interface OnClickRectify {
        void onClickRectifyItem(@Nullable OneRectifyListResponse.DataItem.RectifyItem rectifyItem);
    }

    @Metadata(m29143d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\"\u0010\r\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u000e"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/rectify/adapter/OneRectifyAdapter$RectifyHeaderViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lth/co/dtac/android/dtacone/databinding/OneRectifyHeaderRowBinding;", "binding", "<init>", "(Lth/co/dtac/android/dtacone/view/appOne/rectify/adapter/OneRectifyAdapter;Lth/co/dtac/android/dtacone/databinding/OneRectifyHeaderRowBinding;)V", "Landroid/widget/TextView;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroid/widget/TextView;", "getTvDate", "()Landroid/widget/TextView;", "setTvDate", "(Landroid/widget/TextView;)V", "tvDate", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.rectify.adapter.OneRectifyAdapter$RectifyHeaderViewHolder */
    /* loaded from: classes10.dex */
    public final class RectifyHeaderViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public TextView f96058a;

        /* renamed from: b */
        public final /* synthetic */ OneRectifyAdapter f96059b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RectifyHeaderViewHolder(@NotNull OneRectifyAdapter oneRectifyAdapter, OneRectifyHeaderRowBinding binding) {
            super(binding.getRoot());
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.f96059b = oneRectifyAdapter;
            OneFontTextView oneFontTextView = binding.tvDate;
            Intrinsics.checkNotNullExpressionValue(oneFontTextView, "binding.tvDate");
            this.f96058a = oneFontTextView;
        }

        @NotNull
        public final TextView getTvDate() {
            return this.f96058a;
        }

        public final void setTvDate(@NotNull TextView textView) {
            Intrinsics.checkNotNullParameter(textView, "<set-?>");
            this.f96058a = textView;
        }
    }

    @Metadata(m29143d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bR$\u0010\u0013\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R$\u0010\u001b\u001a\u0004\u0018\u00010\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR$\u0010\u001f\u001a\u0004\u0018\u00010\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u0016\u001a\u0004\b\u001d\u0010\u0018\"\u0004\b\u001e\u0010\u001aR$\u0010#\u001a\u0004\u0018\u00010\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010\u0016\u001a\u0004\b!\u0010\u0018\"\u0004\b\"\u0010\u001aR$\u0010'\u001a\u0004\u0018\u00010\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010\u0016\u001a\u0004\b%\u0010\u0018\"\u0004\b&\u0010\u001aR$\u0010+\u001a\u0004\u0018\u00010\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010\u0016\u001a\u0004\b)\u0010\u0018\"\u0004\b*\u0010\u001aR$\u00103\u001a\u0004\u0018\u00010,8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R$\u0010;\u001a\u0004\u0018\u0001048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:¨\u0006<"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/rectify/adapter/OneRectifyAdapter$RectifyViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/view/View$OnClickListener;", "Lth/co/dtac/android/dtacone/databinding/OneRectifyItemRowBinding;", "binding", "<init>", "(Lth/co/dtac/android/dtacone/view/appOne/rectify/adapter/OneRectifyAdapter;Lth/co/dtac/android/dtacone/databinding/OneRectifyItemRowBinding;)V", "Landroid/view/View;", Promotion.ACTION_VIEW, "", "onClick", "(Landroid/view/View;)V", "Landroidx/cardview/widget/CardView;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/cardview/widget/CardView;", "getCvRectify", "()Landroidx/cardview/widget/CardView;", "setCvRectify", "(Landroidx/cardview/widget/CardView;)V", "cvRectify", "Landroid/widget/TextView;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Landroid/widget/TextView;", "getTvTime", "()Landroid/widget/TextView;", "setTvTime", "(Landroid/widget/TextView;)V", "tvTime", OperatorName.CURVE_TO, "getTvAmount", "setTvAmount", "tvAmount", "d", "getTvPhoneNumber", "setTvPhoneNumber", "tvPhoneNumber", "e", "getTvRectifyType", "setTvRectifyType", "tvRectifyType", OperatorName.FILL_NON_ZERO, "getTvDescription", "setTvDescription", "tvDescription", "Landroid/widget/ImageView;", OperatorName.NON_STROKING_GRAY, "Landroid/widget/ImageView;", "getIvRectifyType", "()Landroid/widget/ImageView;", "setIvRectifyType", "(Landroid/widget/ImageView;)V", "ivRectifyType", "Landroid/widget/LinearLayout;", OperatorName.CLOSE_PATH, "Landroid/widget/LinearLayout;", "getLinearRectifyBox", "()Landroid/widget/LinearLayout;", "setLinearRectifyBox", "(Landroid/widget/LinearLayout;)V", "linearRectifyBox", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.rectify.adapter.OneRectifyAdapter$RectifyViewHolder */
    /* loaded from: classes10.dex */
    public final class RectifyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        /* renamed from: a */
        public CardView f96060a;

        /* renamed from: b */
        public TextView f96061b;

        /* renamed from: c */
        public TextView f96062c;

        /* renamed from: d */
        public TextView f96063d;

        /* renamed from: e */
        public TextView f96064e;

        /* renamed from: f */
        public TextView f96065f;

        /* renamed from: g */
        public ImageView f96066g;

        /* renamed from: h */
        public LinearLayout f96067h;

        /* renamed from: i */
        public final /* synthetic */ OneRectifyAdapter f96068i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RectifyViewHolder(@NotNull OneRectifyAdapter oneRectifyAdapter, OneRectifyItemRowBinding binding) {
            super(binding.getRoot());
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.f96068i = oneRectifyAdapter;
            DtacCardView dtacCardView = binding.cvRectify;
            this.f96060a = dtacCardView;
            this.f96061b = binding.tvRectifyTime;
            this.f96062c = binding.tvRectifyAmount;
            this.f96063d = binding.tvRectifyPhoneNumber;
            this.f96064e = binding.tvRectifyType;
            this.f96065f = binding.tvRectifyDescription;
            this.f96066g = binding.ivImageType;
            this.f96067h = binding.linearRectifyBox;
            if (dtacCardView != null) {
                dtacCardView.setOnClickListener(this);
            }
        }

        @Nullable
        public final CardView getCvRectify() {
            return this.f96060a;
        }

        @Nullable
        public final ImageView getIvRectifyType() {
            return this.f96066g;
        }

        @Nullable
        public final LinearLayout getLinearRectifyBox() {
            return this.f96067h;
        }

        @Nullable
        public final TextView getTvAmount() {
            return this.f96062c;
        }

        @Nullable
        public final TextView getTvDescription() {
            return this.f96065f;
        }

        @Nullable
        public final TextView getTvPhoneNumber() {
            return this.f96063d;
        }

        @Nullable
        public final TextView getTvRectifyType() {
            return this.f96064e;
        }

        @Nullable
        public final TextView getTvTime() {
            return this.f96061b;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(@NotNull View view) {
            OnClickRectify onClickRectify;
            Intrinsics.checkNotNullParameter(view, "view");
            if (this.f96068i.f96054e != null && (onClickRectify = this.f96068i.f96054e) != null) {
                List list = this.f96068i.f96055f;
                Intrinsics.checkNotNull(list);
                Object obj = list.get(getAbsoluteAdapterPosition());
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type th.co.dtac.android.dtacone.app_one.model.rectify.OneRectifyListResponse.DataItem.RectifyItem");
                onClickRectify.onClickRectifyItem((OneRectifyListResponse.DataItem.RectifyItem) obj);
            }
        }

        public final void setCvRectify(@Nullable CardView cardView) {
            this.f96060a = cardView;
        }

        public final void setIvRectifyType(@Nullable ImageView imageView) {
            this.f96066g = imageView;
        }

        public final void setLinearRectifyBox(@Nullable LinearLayout linearLayout) {
            this.f96067h = linearLayout;
        }

        public final void setTvAmount(@Nullable TextView textView) {
            this.f96062c = textView;
        }

        public final void setTvDescription(@Nullable TextView textView) {
            this.f96065f = textView;
        }

        public final void setTvPhoneNumber(@Nullable TextView textView) {
            this.f96063d = textView;
        }

        public final void setTvRectifyType(@Nullable TextView textView) {
            this.f96064e = textView;
        }

        public final void setTvTime(@Nullable TextView textView) {
            this.f96061b = textView;
        }
    }

    public OneRectifyAdapter(@NotNull Context mContext, @Nullable String str, @NotNull RectyfyThemeColorModel themeColorModel) {
        Intrinsics.checkNotNullParameter(mContext, "mContext");
        Intrinsics.checkNotNullParameter(themeColorModel, "themeColorModel");
        this.f96050a = mContext;
        this.f96051b = str;
        this.f96052c = themeColorModel;
        this.f96056g = 1;
    }

    /* renamed from: a */
    public final boolean m10512a(OneRectifyListResponse.DataItem.RectifyItem rectifyItem) {
        return Intrinsics.areEqual(rectifyItem.getFeatureCode(), PermissionConstant.M_STV);
    }

    @NotNull
    public final String convertRectifyType(@NotNull OneRectifyListResponse.DataItem.RectifyItem rectify) {
        Intrinsics.checkNotNullParameter(rectify, "rectify");
        String featureCode = rectify.getFeatureCode();
        if (featureCode != null) {
            int hashCode = featureCode.hashCode();
            if (hashCode != -1876882402) {
                if (hashCode != 65142765) {
                    if (hashCode == 74023715 && featureCode.equals(PermissionConstant.M_STV)) {
                        String string = this.f96050a.getString(R.string.rectify_stv_type);
                        Intrinsics.checkNotNullExpressionValue(string, "mContext.getString(R.string.rectify_stv_type)");
                        return string;
                    }
                    return "";
                } else if (featureCode.equals("E-PIN")) {
                    String string2 = this.f96050a.getString(R.string.rectify_epin_type);
                    Intrinsics.checkNotNullExpressionValue(string2, "mContext.getString(R.string.rectify_epin_type)");
                    return string2;
                } else {
                    return "";
                }
            } else if (featureCode.equals(PermissionConstant.M_TOP_UP)) {
                String string3 = this.f96050a.getString(R.string.rectify_topup_online_type);
                Intrinsics.checkNotNullExpressionValue(string3, "mContext.getString(R.str…ectify_topup_online_type)");
                return string3;
            } else {
                return "";
            }
        }
        return "";
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        List list = this.f96055f;
        if (list == null) {
            return 0;
        }
        Intrinsics.checkNotNull(list);
        return list.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        List list = this.f96055f;
        Intrinsics.checkNotNull(list);
        if (list.get(i) instanceof String) {
            return this.f96057h;
        }
        return this.f96056g;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull RecyclerView.ViewHolder holder, int i) {
        int i2;
        ImageView ivRectifyType;
        int i3;
        Intrinsics.checkNotNullParameter(holder, "holder");
        List list = this.f96055f;
        Intrinsics.checkNotNull(list);
        Object obj = list.get(i);
        if (holder instanceof RectifyHeaderViewHolder) {
            String obj2 = obj.toString();
            TextView tvDate = ((RectifyHeaderViewHolder) holder).getTvDate();
            if (tvDate != null) {
                tvDate.setText(DateUtil.convertServerDateToDisplayDate(obj2, new Locale(LanguageSupport.LANG_TH, StandardStructureTypes.f60307TH)));
            }
        } else if (holder instanceof RectifyViewHolder) {
            RectifyViewHolder rectifyViewHolder = (RectifyViewHolder) holder;
            if (rectifyViewHolder.getAbsoluteAdapterPosition() > this.f96053d) {
                Animation loadAnimation = AnimationUtils.loadAnimation(this.f96050a, R.anim.slide_up);
                CardView cvRectify = rectifyViewHolder.getCvRectify();
                Intrinsics.checkNotNull(cvRectify);
                cvRectify.startAnimation(loadAnimation);
                this.f96053d = rectifyViewHolder.getAbsoluteAdapterPosition();
            }
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type th.co.dtac.android.dtacone.app_one.model.rectify.OneRectifyListResponse.DataItem.RectifyItem");
            OneRectifyListResponse.DataItem.RectifyItem rectifyItem = (OneRectifyListResponse.DataItem.RectifyItem) obj;
            String localNumberWithPrettyFormat = PhoneNumberFormat.toLocalNumberWithPrettyFormat(rectifyItem.getCustomerNumberDisplay(), PhoneNumberFormat.COUNTRY_CALLING_CODE.THAILAND);
            TextView tvTime = rectifyViewHolder.getTvTime();
            Intrinsics.checkNotNull(tvTime);
            tvTime.setText(DateUtil.convertServerDateTimeToUserTime(rectifyItem.getCreatedDateTime(), new Locale(LanguageSupport.LANG_TH, StandardStructureTypes.f60307TH)));
            TextView tvAmount = rectifyViewHolder.getTvAmount();
            if (tvAmount != null) {
                tvAmount.setText(String.valueOf(rectifyItem.getAmount()));
            }
            TextView tvPhoneNumber = rectifyViewHolder.getTvPhoneNumber();
            if (tvPhoneNumber != null) {
                tvPhoneNumber.setText(localNumberWithPrettyFormat);
            }
            String str = this.f96051b;
            if (str != null && (ivRectifyType = rectifyViewHolder.getIvRectifyType()) != null) {
                String featureCode = rectifyItem.getFeatureCode();
                if (featureCode != null) {
                    i3 = OnePermissionKt.getOneIconByPermission(featureCode, str);
                } else {
                    i3 = R.drawable.image_default;
                }
                ivRectifyType.setImageResource(i3);
            }
            TextView tvRectifyType = rectifyViewHolder.getTvRectifyType();
            if (tvRectifyType != null) {
                tvRectifyType.setText(StringExtKt.toDisplayEmpty(rectifyItem.getFeatureDescription()));
            }
            TextView tvDescription = rectifyViewHolder.getTvDescription();
            if (tvDescription != null) {
                if (m10512a(rectifyItem)) {
                    i2 = 0;
                } else {
                    i2 = 8;
                }
                tvDescription.setVisibility(i2);
            }
            TextView tvDescription2 = rectifyViewHolder.getTvDescription();
            if (tvDescription2 != null) {
                tvDescription2.setText(StringExtKt.toDisplayEmpty(rectifyItem.getMarketDescription()));
            }
            RectyfyThemeColorModel rectyfyThemeColorModel = this.f96052c;
            TextView tvAmount2 = rectifyViewHolder.getTvAmount();
            if (tvAmount2 != null) {
                tvAmount2.setTextColor(ResourcesCompat.getColor(this.f96050a.getResources(), rectyfyThemeColorModel.getFontColor(), null));
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public RecyclerView.ViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (i == this.f96057h) {
            OneRectifyHeaderRowBinding inflate = OneRectifyHeaderRowBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
            Intrinsics.checkNotNullExpressionValue(inflate, "inflate(LayoutInflater.f….context), parent, false)");
            return new RectifyHeaderViewHolder(this, inflate);
        }
        OneRectifyItemRowBinding inflate2 = OneRectifyItemRowBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(inflate2, "inflate(LayoutInflater.f….context), parent, false)");
        return new RectifyViewHolder(this, inflate2);
    }

    public final void setOnClickRectify(@Nullable OnClickRectify onClickRectify) {
        this.f96054e = onClickRectify;
    }

    public final void setRectifyList(@Nullable List<? extends Object> list) {
        this.f96055f = list;
    }
}