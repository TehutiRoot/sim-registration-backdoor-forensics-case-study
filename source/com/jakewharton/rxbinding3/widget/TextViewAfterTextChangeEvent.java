package com.jakewharton.rxbinding3.widget;

import android.text.Editable;
import android.widget.TextView;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\tR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u000b¨\u0006\u001e"}, m28850d2 = {"Lcom/jakewharton/rxbinding3/widget/TextViewAfterTextChangeEvent;", "", "Landroid/widget/TextView;", Promotion.ACTION_VIEW, "Landroid/text/Editable;", "editable", "<init>", "(Landroid/widget/TextView;Landroid/text/Editable;)V", "component1", "()Landroid/widget/TextView;", "component2", "()Landroid/text/Editable;", "copy", "(Landroid/widget/TextView;Landroid/text/Editable;)Lcom/jakewharton/rxbinding3/widget/TextViewAfterTextChangeEvent;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroid/widget/TextView;", "getView", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Landroid/text/Editable;", "getEditable", "rxbinding_release"}, m28849k = 1, m28848mv = {1, 4, 0})
/* loaded from: classes5.dex */
public final class TextViewAfterTextChangeEvent {

    /* renamed from: a */
    public final TextView f58317a;

    /* renamed from: b */
    public final Editable f58318b;

    public TextViewAfterTextChangeEvent(@NotNull TextView view, @Nullable Editable editable) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        this.f58317a = view;
        this.f58318b = editable;
    }

    public static /* synthetic */ TextViewAfterTextChangeEvent copy$default(TextViewAfterTextChangeEvent textViewAfterTextChangeEvent, TextView textView, Editable editable, int i, Object obj) {
        if ((i & 1) != 0) {
            textView = textViewAfterTextChangeEvent.f58317a;
        }
        if ((i & 2) != 0) {
            editable = textViewAfterTextChangeEvent.f58318b;
        }
        return textViewAfterTextChangeEvent.copy(textView, editable);
    }

    @NotNull
    public final TextView component1() {
        return this.f58317a;
    }

    @Nullable
    public final Editable component2() {
        return this.f58318b;
    }

    @NotNull
    public final TextViewAfterTextChangeEvent copy(@NotNull TextView view, @Nullable Editable editable) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        return new TextViewAfterTextChangeEvent(view, editable);
    }

    public boolean equals(@Nullable Object obj) {
        if (this != obj) {
            if (obj instanceof TextViewAfterTextChangeEvent) {
                TextViewAfterTextChangeEvent textViewAfterTextChangeEvent = (TextViewAfterTextChangeEvent) obj;
                return Intrinsics.areEqual(this.f58317a, textViewAfterTextChangeEvent.f58317a) && Intrinsics.areEqual(this.f58318b, textViewAfterTextChangeEvent.f58318b);
            }
            return false;
        }
        return true;
    }

    @Nullable
    public final Editable getEditable() {
        return this.f58318b;
    }

    @NotNull
    public final TextView getView() {
        return this.f58317a;
    }

    public int hashCode() {
        TextView textView = this.f58317a;
        int hashCode = (textView != null ? textView.hashCode() : 0) * 31;
        Editable editable = this.f58318b;
        return hashCode + (editable != null ? editable.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "TextViewAfterTextChangeEvent(view=" + this.f58317a + ", editable=" + ((Object) this.f58318b) + ")";
    }
}
