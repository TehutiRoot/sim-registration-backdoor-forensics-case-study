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
import th.p047co.dtac.android.dtacone.model.address.AddressItemData;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0012B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ)\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u00052\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, m28850d2 = {"Lth/co/dtac/android/dtacone/app_one/widget/dialog/address/OneMailingAddressAdapter;", "Landroid/widget/ArrayAdapter;", "Lth/co/dtac/android/dtacone/model/address/AddressItemData;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "resource", "", "showArrow", "<init>", "(Landroid/content/Context;IZ)V", "position", "Landroid/view/View;", "convertView", "Landroid/view/ViewGroup;", "parent", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroid/content/Context;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Z", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nOneMailingAddressAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneMailingAddressAdapter.kt\nth/co/dtac/android/dtacone/app_one/widget/dialog/address/OneMailingAddressAdapter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,69:1\n1#2:70\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.app_one.widget.dialog.address.OneMailingAddressAdapter */
/* loaded from: classes7.dex */
public final class OneMailingAddressAdapter extends ArrayAdapter<AddressItemData> {
    public static final int $stable = 8;

    /* renamed from: a */
    public final Context f83050a;

    /* renamed from: b */
    public final boolean f83051b;

    /* renamed from: th.co.dtac.android.dtacone.app_one.widget.dialog.address.OneMailingAddressAdapter$a */
    /* loaded from: classes7.dex */
    public static final class C14186a {

        /* renamed from: a */
        public OneFontTextView f83052a;

        /* renamed from: a */
        public final OneFontTextView m19649a() {
            OneFontTextView oneFontTextView = this.f83052a;
            if (oneFontTextView != null) {
                return oneFontTextView;
            }
            Intrinsics.throwUninitializedPropertyAccessException(TextBundle.TEXT_ENTRY);
            return null;
        }

        /* renamed from: b */
        public final void m19648b(OneFontTextView oneFontTextView) {
            Intrinsics.checkNotNullParameter(oneFontTextView, "<set-?>");
            this.f83052a = oneFontTextView;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneMailingAddressAdapter(@NotNull Context context, int i, boolean z) {
        super(context, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f83050a = context;
        this.f83051b = z;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    @NotNull
    public View getView(int i, @Nullable View view, @NotNull ViewGroup parent) {
        String value;
        Drawable drawable;
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (view == null) {
            view = LayoutInflater.from(getContext()).inflate(R.layout.one_location_address_row, parent, false);
            C14186a c14186a = new C14186a();
            View findViewById = view.findViewById(R.id.z_tv_location_addres);
            Intrinsics.checkNotNullExpressionValue(findViewById, "rowView.findViewById(R.id.z_tv_location_addres)");
            c14186a.m19648b((OneFontTextView) findViewById);
            if (this.f83051b) {
                Drawable drawable2 = ContextCompat.getDrawable(this.f83050a, R.drawable.ic_one_arrow_right);
                if (drawable2 != null) {
                    drawable = DrawableCompat.wrap(drawable2);
                } else {
                    drawable = null;
                }
                if (drawable != null) {
                    DrawableCompat.setTint(drawable, ContextCompat.getColor(getContext(), R.color.warmGrey));
                    DrawableCompat.setTintMode(drawable, PorterDuff.Mode.SRC_IN);
                    c14186a.m19649a().setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, drawable, (Drawable) null);
                }
            } else {
                c14186a.m19649a().setGravity(17);
            }
            view.setTag(c14186a);
        }
        Intrinsics.checkNotNull(view);
        Object tag = view.getTag();
        Intrinsics.checkNotNull(tag, "null cannot be cast to non-null type th.co.dtac.android.dtacone.app_one.widget.dialog.address.OneMailingAddressAdapter.AddressViewHolder");
        AddressItemData addressItemData = (AddressItemData) getItem(i);
        OneFontTextView m19649a = ((C14186a) tag).m19649a();
        if (addressItemData == null) {
            value = "";
        } else {
            value = addressItemData.getValue();
        }
        m19649a.setText(value);
        return view;
    }
}
