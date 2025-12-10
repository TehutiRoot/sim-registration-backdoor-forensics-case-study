package com.jakewharton.rxbinding3.widget;

import android.view.KeyEvent;
import android.widget.TextView;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ0\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0015\u0010\rJ\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\rR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010\u000f¨\u0006#"}, m28850d2 = {"Lcom/jakewharton/rxbinding3/widget/TextViewEditorActionEvent;", "", "Landroid/widget/TextView;", Promotion.ACTION_VIEW, "", "actionId", "Landroid/view/KeyEvent;", "keyEvent", "<init>", "(Landroid/widget/TextView;ILandroid/view/KeyEvent;)V", "component1", "()Landroid/widget/TextView;", "component2", "()I", "component3", "()Landroid/view/KeyEvent;", "copy", "(Landroid/widget/TextView;ILandroid/view/KeyEvent;)Lcom/jakewharton/rxbinding3/widget/TextViewEditorActionEvent;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroid/widget/TextView;", "getView", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "I", "getActionId", OperatorName.CURVE_TO, "Landroid/view/KeyEvent;", "getKeyEvent", "rxbinding_release"}, m28849k = 1, m28848mv = {1, 4, 0})
/* loaded from: classes5.dex */
public final class TextViewEditorActionEvent {

    /* renamed from: a */
    public final TextView f58324a;

    /* renamed from: b */
    public final int f58325b;

    /* renamed from: c */
    public final KeyEvent f58326c;

    public TextViewEditorActionEvent(@NotNull TextView view, int i, @Nullable KeyEvent keyEvent) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        this.f58324a = view;
        this.f58325b = i;
        this.f58326c = keyEvent;
    }

    public static /* synthetic */ TextViewEditorActionEvent copy$default(TextViewEditorActionEvent textViewEditorActionEvent, TextView textView, int i, KeyEvent keyEvent, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            textView = textViewEditorActionEvent.f58324a;
        }
        if ((i2 & 2) != 0) {
            i = textViewEditorActionEvent.f58325b;
        }
        if ((i2 & 4) != 0) {
            keyEvent = textViewEditorActionEvent.f58326c;
        }
        return textViewEditorActionEvent.copy(textView, i, keyEvent);
    }

    @NotNull
    public final TextView component1() {
        return this.f58324a;
    }

    public final int component2() {
        return this.f58325b;
    }

    @Nullable
    public final KeyEvent component3() {
        return this.f58326c;
    }

    @NotNull
    public final TextViewEditorActionEvent copy(@NotNull TextView view, int i, @Nullable KeyEvent keyEvent) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        return new TextViewEditorActionEvent(view, i, keyEvent);
    }

    public boolean equals(@Nullable Object obj) {
        if (this != obj) {
            if (obj instanceof TextViewEditorActionEvent) {
                TextViewEditorActionEvent textViewEditorActionEvent = (TextViewEditorActionEvent) obj;
                return Intrinsics.areEqual(this.f58324a, textViewEditorActionEvent.f58324a) && this.f58325b == textViewEditorActionEvent.f58325b && Intrinsics.areEqual(this.f58326c, textViewEditorActionEvent.f58326c);
            }
            return false;
        }
        return true;
    }

    public final int getActionId() {
        return this.f58325b;
    }

    @Nullable
    public final KeyEvent getKeyEvent() {
        return this.f58326c;
    }

    @NotNull
    public final TextView getView() {
        return this.f58324a;
    }

    public int hashCode() {
        TextView textView = this.f58324a;
        int hashCode = (((textView != null ? textView.hashCode() : 0) * 31) + this.f58325b) * 31;
        KeyEvent keyEvent = this.f58326c;
        return hashCode + (keyEvent != null ? keyEvent.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "TextViewEditorActionEvent(view=" + this.f58324a + ", actionId=" + this.f58325b + ", keyEvent=" + this.f58326c + ")";
    }
}
