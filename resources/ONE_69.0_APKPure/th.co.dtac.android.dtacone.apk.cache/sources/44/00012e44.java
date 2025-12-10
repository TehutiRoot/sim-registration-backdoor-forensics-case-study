package th.p047co.dtac.android.dtacone.view.appOne.device_sale.adapter;

import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import androidx.annotation.LayoutRes;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneTextInputLayoutText;
import th.p047co.dtac.android.dtacone.model.device_sale.InputField;
import th.p047co.dtac.android.dtacone.view.appOne.device_sale.adapter.OneDeviceSaleInputFieldAdapter;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0015\b\u0007\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001'B'\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u000f\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0014\u001a\u00020\u00132\n\u0010\u0011\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u0017R(\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\"\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&¨\u0006("}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/device_sale/adapter/OneDeviceSaleInputFieldAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lth/co/dtac/android/dtacone/view/appOne/device_sale/adapter/OneDeviceSaleInputFieldAdapter$InputFieldViewHolder;", "", "idLayout", "", "Lth/co/dtac/android/dtacone/model/device_sale/InputField;", FirebaseAnalytics.Param.ITEMS, "Landroid/view/inputmethod/InputMethodManager;", "inputMethodManager", "<init>", "(ILjava/util/List;Landroid/view/inputmethod/InputMethodManager;)V", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lth/co/dtac/android/dtacone/view/appOne/device_sale/adapter/OneDeviceSaleInputFieldAdapter$InputFieldViewHolder;", "holder", "position", "", "onBindViewHolder", "(Lth/co/dtac/android/dtacone/view/appOne/device_sale/adapter/OneDeviceSaleInputFieldAdapter$InputFieldViewHolder;I)V", "getItemCount", "()I", PDPageLabelRange.STYLE_LETTERS_LOWER, "I", "getIdLayout", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Ljava/util/List;", "getItems", "()Ljava/util/List;", "setItems", "(Ljava/util/List;)V", OperatorName.CURVE_TO, "Landroid/view/inputmethod/InputMethodManager;", "getInputMethodManager", "()Landroid/view/inputmethod/InputMethodManager;", "setInputMethodManager", "(Landroid/view/inputmethod/InputMethodManager;)V", "InputFieldViewHolder", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.device_sale.adapter.OneDeviceSaleInputFieldAdapter */
/* loaded from: classes10.dex */
public final class OneDeviceSaleInputFieldAdapter extends RecyclerView.Adapter<InputFieldViewHolder> {
    public static final int $stable = 8;

    /* renamed from: a */
    public final int f90122a;

    /* renamed from: b */
    public List f90123b;

    /* renamed from: c */
    public InputMethodManager f90124c;

    @Metadata(m29143d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0016\u0010\u000e\u001a\u00020\u000b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000f"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/device_sale/adapter/OneDeviceSaleInputFieldAdapter$InputFieldViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/view/View;", "itemView", "<init>", "(Lth/co/dtac/android/dtacone/view/appOne/device_sale/adapter/OneDeviceSaleInputFieldAdapter;Landroid/view/View;)V", "Lth/co/dtac/android/dtacone/model/device_sale/InputField;", "item", "", "bindView", "(Lth/co/dtac/android/dtacone/model/device_sale/InputField;)Lkotlin/Unit;", "Lth/co/dtac/android/dtacone/app_one/widget/OneTextInputLayoutText;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lth/co/dtac/android/dtacone/app_one/widget/OneTextInputLayoutText;", "inputEditText", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.device_sale.adapter.OneDeviceSaleInputFieldAdapter$InputFieldViewHolder */
    /* loaded from: classes10.dex */
    public final class InputFieldViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public OneTextInputLayoutText f90125a;

        /* renamed from: b */
        public final /* synthetic */ OneDeviceSaleInputFieldAdapter f90126b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InputFieldViewHolder(@NotNull OneDeviceSaleInputFieldAdapter oneDeviceSaleInputFieldAdapter, View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            this.f90126b = oneDeviceSaleInputFieldAdapter;
        }

        /* renamed from: b */
        public static /* synthetic */ void m14763b(OneDeviceSaleInputFieldAdapter oneDeviceSaleInputFieldAdapter, InputFieldViewHolder inputFieldViewHolder) {
            m14762c(oneDeviceSaleInputFieldAdapter, inputFieldViewHolder);
        }

        /* renamed from: c */
        public static final void m14762c(OneDeviceSaleInputFieldAdapter this$0, InputFieldViewHolder this$1) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(this$1, "this$1");
            InputMethodManager inputMethodManager = this$0.getInputMethodManager();
            OneTextInputLayoutText oneTextInputLayoutText = this$1.f90125a;
            if (oneTextInputLayoutText == null) {
                Intrinsics.throwUninitializedPropertyAccessException("inputEditText");
                oneTextInputLayoutText = null;
            }
            inputMethodManager.showSoftInput(oneTextInputLayoutText.getEdtText(), 1);
        }

        @Nullable
        public final Unit bindView(@NotNull final InputField item) {
            int i;
            Intrinsics.checkNotNullParameter(item, "item");
            View view = this.itemView;
            final OneDeviceSaleInputFieldAdapter oneDeviceSaleInputFieldAdapter = this.f90126b;
            View findViewById = view.findViewById(R.id.inputEditText);
            Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(R.id.inputEditText)");
            OneTextInputLayoutText oneTextInputLayoutText = (OneTextInputLayoutText) findViewById;
            this.f90125a = oneTextInputLayoutText;
            OneTextInputLayoutText oneTextInputLayoutText2 = null;
            if (oneTextInputLayoutText == null) {
                Intrinsics.throwUninitializedPropertyAccessException("inputEditText");
                oneTextInputLayoutText = null;
            }
            String label = item.getLabel();
            if (label == null) {
                label = "";
            }
            oneTextInputLayoutText.setInputLayoutHint(label);
            if (getAbsoluteAdapterPosition() == 0) {
                OneTextInputLayoutText oneTextInputLayoutText3 = this.f90125a;
                if (oneTextInputLayoutText3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("inputEditText");
                    oneTextInputLayoutText3 = null;
                }
                oneTextInputLayoutText3.focus();
                new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: LP0
                    @Override // java.lang.Runnable
                    public final void run() {
                        OneDeviceSaleInputFieldAdapter.InputFieldViewHolder.m14763b(OneDeviceSaleInputFieldAdapter.this, this);
                    }
                }, 0L);
            }
            if (Intrinsics.areEqual(item.getLabel(), "รหัสคูปอง")) {
                i = 2;
            } else {
                i = 524288;
            }
            OneTextInputLayoutText oneTextInputLayoutText4 = this.f90125a;
            if (oneTextInputLayoutText4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("inputEditText");
                oneTextInputLayoutText4 = null;
            }
            oneTextInputLayoutText4.setInputType(i);
            OneTextInputLayoutText oneTextInputLayoutText5 = this.f90125a;
            if (oneTextInputLayoutText5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("inputEditText");
                oneTextInputLayoutText5 = null;
            }
            oneTextInputLayoutText5.setOnTextChangeListener(new OneTextInputLayoutText.OnTextChangListener() { // from class: th.co.dtac.android.dtacone.view.appOne.device_sale.adapter.OneDeviceSaleInputFieldAdapter$InputFieldViewHolder$bindView$1$2
                @Override // th.p047co.dtac.android.dtacone.app_one.widget.OneTextInputLayoutText.OnTextChangListener
                public void afterTextChanged(@Nullable Editable editable) {
                    InputField.this.setValue((editable == null || (r2 = editable.toString()) == null) ? "" : "");
                }
            });
            String str = item.getDefault();
            if (str == null) {
                return null;
            }
            OneTextInputLayoutText oneTextInputLayoutText6 = this.f90125a;
            if (oneTextInputLayoutText6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("inputEditText");
            } else {
                oneTextInputLayoutText2 = oneTextInputLayoutText6;
            }
            oneTextInputLayoutText2.setText(str);
            return Unit.INSTANCE;
        }
    }

    public OneDeviceSaleInputFieldAdapter(@LayoutRes int i, @NotNull List<InputField> items, @NotNull InputMethodManager inputMethodManager) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(inputMethodManager, "inputMethodManager");
        this.f90122a = i;
        this.f90123b = items;
        this.f90124c = inputMethodManager;
    }

    public final int getIdLayout() {
        return this.f90122a;
    }

    @NotNull
    public final InputMethodManager getInputMethodManager() {
        return this.f90124c;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f90123b.size();
    }

    @NotNull
    public final List<InputField> getItems() {
        return this.f90123b;
    }

    public final void setInputMethodManager(@NotNull InputMethodManager inputMethodManager) {
        Intrinsics.checkNotNullParameter(inputMethodManager, "<set-?>");
        this.f90124c = inputMethodManager;
    }

    public final void setItems(@NotNull List<InputField> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.f90123b = list;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull InputFieldViewHolder holder, int i) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.bindView((InputField) this.f90123b.get(i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public InputFieldViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View view = LayoutInflater.from(parent.getContext()).inflate(this.f90122a, parent, false);
        Intrinsics.checkNotNullExpressionValue(view, "view");
        return new InputFieldViewHolder(this, view);
    }
}