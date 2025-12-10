package com.chuckerteam.chucker.internal.data.model;

import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.i18n.MessageBundle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0080\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\nJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ<\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\nJ\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0019\u001a\u0004\b\u001c\u0010\nR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0019\u001a\u0004\b\u001e\u0010\nR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0019\u001a\u0004\b \u0010\n¨\u0006!"}, m28850d2 = {"Lcom/chuckerteam/chucker/internal/data/model/DialogData;", "", "", MessageBundle.TITLE_ENTRY, "message", "positiveButtonText", "negativeButtonText", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/chuckerteam/chucker/internal/data/model/DialogData;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/lang/String;", "getTitle", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getMessage", OperatorName.CURVE_TO, "getPositiveButtonText", "d", "getNegativeButtonText", "com.github.ChuckerTeam.Chucker.library"}, m28849k = 1, m28848mv = {1, 8, 0})
/* loaded from: classes3.dex */
public final class DialogData {

    /* renamed from: a */
    public final String f42896a;

    /* renamed from: b */
    public final String f42897b;

    /* renamed from: c */
    public final String f42898c;

    /* renamed from: d */
    public final String f42899d;

    public DialogData(@NotNull String title, @NotNull String message, @Nullable String str, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(message, "message");
        this.f42896a = title;
        this.f42897b = message;
        this.f42898c = str;
        this.f42899d = str2;
    }

    public static /* synthetic */ DialogData copy$default(DialogData dialogData, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = dialogData.f42896a;
        }
        if ((i & 2) != 0) {
            str2 = dialogData.f42897b;
        }
        if ((i & 4) != 0) {
            str3 = dialogData.f42898c;
        }
        if ((i & 8) != 0) {
            str4 = dialogData.f42899d;
        }
        return dialogData.copy(str, str2, str3, str4);
    }

    @NotNull
    public final String component1() {
        return this.f42896a;
    }

    @NotNull
    public final String component2() {
        return this.f42897b;
    }

    @Nullable
    public final String component3() {
        return this.f42898c;
    }

    @Nullable
    public final String component4() {
        return this.f42899d;
    }

    @NotNull
    public final DialogData copy(@NotNull String title, @NotNull String message, @Nullable String str, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(message, "message");
        return new DialogData(title, message, str, str2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DialogData) {
            DialogData dialogData = (DialogData) obj;
            return Intrinsics.areEqual(this.f42896a, dialogData.f42896a) && Intrinsics.areEqual(this.f42897b, dialogData.f42897b) && Intrinsics.areEqual(this.f42898c, dialogData.f42898c) && Intrinsics.areEqual(this.f42899d, dialogData.f42899d);
        }
        return false;
    }

    @NotNull
    public final String getMessage() {
        return this.f42897b;
    }

    @Nullable
    public final String getNegativeButtonText() {
        return this.f42899d;
    }

    @Nullable
    public final String getPositiveButtonText() {
        return this.f42898c;
    }

    @NotNull
    public final String getTitle() {
        return this.f42896a;
    }

    public int hashCode() {
        int hashCode = ((this.f42896a.hashCode() * 31) + this.f42897b.hashCode()) * 31;
        String str = this.f42898c;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f42899d;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.f42896a;
        String str2 = this.f42897b;
        String str3 = this.f42898c;
        String str4 = this.f42899d;
        return "DialogData(title=" + str + ", message=" + str2 + ", positiveButtonText=" + str3 + ", negativeButtonText=" + str4 + ")";
    }
}
