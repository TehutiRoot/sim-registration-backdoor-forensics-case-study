package com.jakewharton.rxbinding3.widget;

import android.widget.TextView;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.i18n.TextBundle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0011JB\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0011J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010\u0011R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b'\u0010%\u001a\u0004\b(\u0010\u0011R\u0017\u0010\t\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b)\u0010%\u001a\u0004\b*\u0010\u0011¨\u0006+"}, m28850d2 = {"Lcom/jakewharton/rxbinding3/widget/TextViewTextChangeEvent;", "", "Landroid/widget/TextView;", Promotion.ACTION_VIEW, "", TextBundle.TEXT_ENTRY, "", "start", "before", "count", "<init>", "(Landroid/widget/TextView;Ljava/lang/CharSequence;III)V", "component1", "()Landroid/widget/TextView;", "component2", "()Ljava/lang/CharSequence;", "component3", "()I", "component4", "component5", "copy", "(Landroid/widget/TextView;Ljava/lang/CharSequence;III)Lcom/jakewharton/rxbinding3/widget/TextViewTextChangeEvent;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroid/widget/TextView;", "getView", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Ljava/lang/CharSequence;", "getText", OperatorName.CURVE_TO, "I", "getStart", "d", "getBefore", "e", "getCount", "rxbinding_release"}, m28849k = 1, m28848mv = {1, 4, 0})
/* loaded from: classes5.dex */
public final class TextViewTextChangeEvent {

    /* renamed from: a */
    public final TextView f58327a;

    /* renamed from: b */
    public final CharSequence f58328b;

    /* renamed from: c */
    public final int f58329c;

    /* renamed from: d */
    public final int f58330d;

    /* renamed from: e */
    public final int f58331e;

    public TextViewTextChangeEvent(@NotNull TextView view, @NotNull CharSequence text, int i, int i2, int i3) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        Intrinsics.checkParameterIsNotNull(text, "text");
        this.f58327a = view;
        this.f58328b = text;
        this.f58329c = i;
        this.f58330d = i2;
        this.f58331e = i3;
    }

    public static /* synthetic */ TextViewTextChangeEvent copy$default(TextViewTextChangeEvent textViewTextChangeEvent, TextView textView, CharSequence charSequence, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            textView = textViewTextChangeEvent.f58327a;
        }
        if ((i4 & 2) != 0) {
            charSequence = textViewTextChangeEvent.f58328b;
        }
        CharSequence charSequence2 = charSequence;
        if ((i4 & 4) != 0) {
            i = textViewTextChangeEvent.f58329c;
        }
        int i5 = i;
        if ((i4 & 8) != 0) {
            i2 = textViewTextChangeEvent.f58330d;
        }
        int i6 = i2;
        if ((i4 & 16) != 0) {
            i3 = textViewTextChangeEvent.f58331e;
        }
        return textViewTextChangeEvent.copy(textView, charSequence2, i5, i6, i3);
    }

    @NotNull
    public final TextView component1() {
        return this.f58327a;
    }

    @NotNull
    public final CharSequence component2() {
        return this.f58328b;
    }

    public final int component3() {
        return this.f58329c;
    }

    public final int component4() {
        return this.f58330d;
    }

    public final int component5() {
        return this.f58331e;
    }

    @NotNull
    public final TextViewTextChangeEvent copy(@NotNull TextView view, @NotNull CharSequence text, int i, int i2, int i3) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        Intrinsics.checkParameterIsNotNull(text, "text");
        return new TextViewTextChangeEvent(view, text, i, i2, i3);
    }

    public boolean equals(@Nullable Object obj) {
        if (this != obj) {
            if (obj instanceof TextViewTextChangeEvent) {
                TextViewTextChangeEvent textViewTextChangeEvent = (TextViewTextChangeEvent) obj;
                return Intrinsics.areEqual(this.f58327a, textViewTextChangeEvent.f58327a) && Intrinsics.areEqual(this.f58328b, textViewTextChangeEvent.f58328b) && this.f58329c == textViewTextChangeEvent.f58329c && this.f58330d == textViewTextChangeEvent.f58330d && this.f58331e == textViewTextChangeEvent.f58331e;
            }
            return false;
        }
        return true;
    }

    public final int getBefore() {
        return this.f58330d;
    }

    public final int getCount() {
        return this.f58331e;
    }

    public final int getStart() {
        return this.f58329c;
    }

    @NotNull
    public final CharSequence getText() {
        return this.f58328b;
    }

    @NotNull
    public final TextView getView() {
        return this.f58327a;
    }

    public int hashCode() {
        TextView textView = this.f58327a;
        int hashCode = (textView != null ? textView.hashCode() : 0) * 31;
        CharSequence charSequence = this.f58328b;
        return ((((((hashCode + (charSequence != null ? charSequence.hashCode() : 0)) * 31) + this.f58329c) * 31) + this.f58330d) * 31) + this.f58331e;
    }

    @NotNull
    public String toString() {
        return "TextViewTextChangeEvent(view=" + this.f58327a + ", text=" + this.f58328b + ", start=" + this.f58329c + ", before=" + this.f58330d + ", count=" + this.f58331e + ")";
    }
}
