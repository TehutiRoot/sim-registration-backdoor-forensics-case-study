package co.omise.android.p009ui;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;
import co.omise.android.C5500R;
import co.omise.android.models.CountryInfo;
import co.omise.android.p009ui.CountryListAdapter;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m29143d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0010B\u0019\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\u0018\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000bH\u0016R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m29142d2 = {"Lco/omise/android/ui/CountryListAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lco/omise/android/models/CountryInfo;", "Lco/omise/android/ui/CountryListAdapter$CountryViewHolder;", "onClick", "Lkotlin/Function1;", "", "(Lkotlin/jvm/functions/Function1;)V", "onBindViewHolder", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "CountryViewHolder", "sdk_productionRelease"}, m29141k = 1, m29140mv = {1, 7, 1}, m29138xi = 48)
/* renamed from: co.omise.android.ui.CountryListAdapter */
/* loaded from: classes3.dex */
public final class CountryListAdapter extends ListAdapter<CountryInfo, CountryViewHolder> {
    @NotNull
    private final Function1<CountryInfo, Unit> onClick;

    @Metadata(m29143d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0002\u0010\bJ\u000e\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0006R\u0010\u0010\t\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m29142d2 = {"Lco/omise/android/ui/CountryListAdapter$CountryViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "onClick", "Lkotlin/Function1;", "Lco/omise/android/models/CountryInfo;", "", "(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V", "currentCountry", "getOnClick", "()Lkotlin/jvm/functions/Function1;", "titleTextView", "Landroid/widget/TextView;", "bind", "country", "sdk_productionRelease"}, m29141k = 1, m29140mv = {1, 7, 1}, m29138xi = 48)
    /* renamed from: co.omise.android.ui.CountryListAdapter$CountryViewHolder */
    /* loaded from: classes3.dex */
    public static final class CountryViewHolder extends RecyclerView.ViewHolder {
        @Nullable
        private CountryInfo currentCountry;
        @NotNull
        private final Function1<CountryInfo, Unit> onClick;
        @NotNull
        private final TextView titleTextView;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public CountryViewHolder(@NotNull View itemView, @NotNull Function1<? super CountryInfo, Unit> onClick) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            Intrinsics.checkNotNullParameter(onClick, "onClick");
            this.onClick = onClick;
            View findViewById = itemView.findViewById(C5500R.C5503id.text_item_title);
            Intrinsics.checkNotNullExpressionValue(findViewById, "itemView.findViewById(R.id.text_item_title)");
            this.titleTextView = (TextView) findViewById;
            itemView.setOnClickListener(new View.OnClickListener() { // from class: Ny
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    CountryListAdapter.CountryViewHolder.m51238b(CountryListAdapter.CountryViewHolder.this, view);
                }
            });
        }

        /* renamed from: _init_$lambda-1 */
        public static final void m74123_init_$lambda1(CountryViewHolder this$0, View view) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            CountryInfo countryInfo = this$0.currentCountry;
            if (countryInfo != null) {
                this$0.onClick.invoke(countryInfo);
            }
        }

        /* renamed from: b */
        public static /* synthetic */ void m51238b(CountryViewHolder countryViewHolder, View view) {
            m74123_init_$lambda1(countryViewHolder, view);
        }

        public final void bind(@NotNull CountryInfo country) {
            Intrinsics.checkNotNullParameter(country, "country");
            this.currentCountry = country;
            this.titleTextView.setText(country.getName());
        }

        @NotNull
        public final Function1<CountryInfo, Unit> getOnClick() {
            return this.onClick;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CountryListAdapter(@NotNull Function1<? super CountryInfo, Unit> onClick) {
        super(CountryDiffCallback.INSTANCE);
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        this.onClick = onClick;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull CountryViewHolder holder, int i) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        CountryInfo country = getItem(i);
        Intrinsics.checkNotNullExpressionValue(country, "country");
        holder.bind(country);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public CountryViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View view = LayoutInflater.from(parent.getContext()).inflate(C5500R.C5504layout.list_country_item, parent, false);
        Intrinsics.checkNotNullExpressionValue(view, "view");
        return new CountryViewHolder(view, this.onClick);
    }
}