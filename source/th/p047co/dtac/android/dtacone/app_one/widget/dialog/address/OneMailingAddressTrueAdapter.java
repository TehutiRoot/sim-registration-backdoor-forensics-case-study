package th.p047co.dtac.android.dtacone.app_one.widget.dialog.address;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import ch.qos.logback.core.CoreConstants;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.i18n.TextBundle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;
import th.p047co.dtac.android.dtacone.model.appOne.common.true_company.DistrictsItem;
import th.p047co.dtac.android.dtacone.model.appOne.common.true_company.ProvinceItem;
import th.p047co.dtac.android.dtacone.model.appOne.common.true_company.SubDistrictItem;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0012B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ)\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u00052\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, m28850d2 = {"Lth/co/dtac/android/dtacone/app_one/widget/dialog/address/OneMailingAddressTrueAdapter;", "Landroid/widget/ArrayAdapter;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "resource", "", "showArrow", "<init>", "(Landroid/content/Context;IZ)V", "position", "Landroid/view/View;", "convertView", "Landroid/view/ViewGroup;", "parent", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroid/content/Context;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Z", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nOneMailingAddressTrueAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneMailingAddressTrueAdapter.kt\nth/co/dtac/android/dtacone/app_one/widget/dialog/address/OneMailingAddressTrueAdapter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,79:1\n1#2:80\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.app_one.widget.dialog.address.OneMailingAddressTrueAdapter */
/* loaded from: classes7.dex */
public final class OneMailingAddressTrueAdapter extends ArrayAdapter<Object> {
    public static final int $stable = 8;

    /* renamed from: a */
    public final Context f83053a;

    /* renamed from: b */
    public final boolean f83054b;

    /* renamed from: th.co.dtac.android.dtacone.app_one.widget.dialog.address.OneMailingAddressTrueAdapter$a */
    /* loaded from: classes7.dex */
    public static final class C14187a {

        /* renamed from: a */
        public OneFontTextView f83055a;

        /* renamed from: a */
        public final OneFontTextView m19647a() {
            OneFontTextView oneFontTextView = this.f83055a;
            if (oneFontTextView != null) {
                return oneFontTextView;
            }
            Intrinsics.throwUninitializedPropertyAccessException(TextBundle.TEXT_ENTRY);
            return null;
        }

        /* renamed from: b */
        public final void m19646b(OneFontTextView oneFontTextView) {
            Intrinsics.checkNotNullParameter(oneFontTextView, "<set-?>");
            this.f83055a = oneFontTextView;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneMailingAddressTrueAdapter(@NotNull Context context, int i, boolean z) {
        super(context, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f83053a = context;
        this.f83054b = z;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    @NotNull
    public View getView(int i, @Nullable View view, @NotNull ViewGroup parent) {
        String th2;
        Drawable drawable;
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (view == null) {
            view = LayoutInflater.from(getContext()).inflate(R.layout.one_location_address_row, parent, false);
            C14187a c14187a = new C14187a();
            View findViewById = view.findViewById(R.id.z_tv_location_addres);
            Intrinsics.checkNotNullExpressionValue(findViewById, "rowView.findViewById(R.id.z_tv_location_addres)");
            c14187a.m19646b((OneFontTextView) findViewById);
            if (this.f83054b) {
                Drawable drawable2 = ContextCompat.getDrawable(this.f83053a, R.drawable.ic_one_arrow_right);
                if (drawable2 != null) {
                    drawable = DrawableCompat.wrap(drawable2);
                } else {
                    drawable = null;
                }
                if (drawable != null) {
                    DrawableCompat.setTint(drawable, ContextCompat.getColor(getContext(), R.color.warmGrey));
                    DrawableCompat.setTintMode(drawable, PorterDuff.Mode.SRC_IN);
                    c14187a.m19647a().setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, drawable, (Drawable) null);
                }
            } else {
                c14187a.m19647a().setGravity(17);
            }
            view.setTag(c14187a);
        }
        Intrinsics.checkNotNull(view);
        Object tag = view.getTag();
        Intrinsics.checkNotNull(tag, "null cannot be cast to non-null type th.co.dtac.android.dtacone.app_one.widget.dialog.address.OneMailingAddressTrueAdapter.AddressViewHolder");
        C14187a c14187a2 = (C14187a) tag;
        Object item = getItem(i);
        if (item instanceof ProvinceItem) {
            c14187a2.m19647a().setText(((ProvinceItem) item).getTh());
        } else if (item instanceof DistrictsItem) {
            c14187a2.m19647a().setText(((DistrictsItem) item).getTh());
        } else if (item instanceof SubDistrictItem) {
            OneFontTextView m19647a = c14187a2.m19647a();
            SubDistrictItem subDistrictItem = (SubDistrictItem) item;
            String str = "";
            if (!Intrinsics.areEqual(subDistrictItem.isPostCode(), Boolean.TRUE) ? (th2 = subDistrictItem.getTh()) != null : (th2 = subDistrictItem.getZipCode()) != null) {
                str = th2;
            }
            m19647a.setText(str);
        }
        return view;
    }
}
