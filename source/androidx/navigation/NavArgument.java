package androidx.navigation;

import android.os.Bundle;
import androidx.annotation.RestrictTo;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0011\u0018\u00002\u00020\u0001:\u0001(B3\b\u0000\u0012\u000e\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0016\u001a\u00020\u00042\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u001f\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u0005\u0010!R\u0017\u0010#\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010 \u001a\u0004\b#\u0010!R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'¨\u0006)"}, m28850d2 = {"Landroidx/navigation/NavArgument;", "", "Landroidx/navigation/NavType;", "type", "", "isNullable", "defaultValue", "defaultValuePresent", "<init>", "(Landroidx/navigation/NavType;ZLjava/lang/Object;Z)V", "", "name", "Landroid/os/Bundle;", "bundle", "", "putDefaultValue", "(Ljava/lang/String;Landroid/os/Bundle;)V", "verify", "(Ljava/lang/String;Landroid/os/Bundle;)Z", "toString", "()Ljava/lang/String;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/navigation/NavType;", "getType", "()Landroidx/navigation/NavType;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Z", "()Z", OperatorName.CURVE_TO, "isDefaultValuePresent", "d", "Ljava/lang/Object;", "getDefaultValue", "()Ljava/lang/Object;", "Builder", "navigation-common_release"}, m28849k = 1, m28848mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class NavArgument {

    /* renamed from: a */
    public final NavType f36199a;

    /* renamed from: b */
    public final boolean f36200b;

    /* renamed from: c */
    public final boolean f36201c;

    /* renamed from: d */
    public final Object f36202d;

    @Metadata(m28851d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\u0007\u001a\u00020\u0000\"\u0004\b\u0000\u0010\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012R \u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001a\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u0016¨\u0006\u001b"}, m28850d2 = {"Landroidx/navigation/NavArgument$Builder;", "", "<init>", "()V", "T", "Landroidx/navigation/NavType;", "type", "setType", "(Landroidx/navigation/NavType;)Landroidx/navigation/NavArgument$Builder;", "", "isNullable", "setIsNullable", "(Z)Landroidx/navigation/NavArgument$Builder;", "defaultValue", "setDefaultValue", "(Ljava/lang/Object;)Landroidx/navigation/NavArgument$Builder;", "Landroidx/navigation/NavArgument;", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "()Landroidx/navigation/NavArgument;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/navigation/NavType;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Z", OperatorName.CURVE_TO, "Ljava/lang/Object;", "d", "defaultValuePresent", "navigation-common_release"}, m28849k = 1, m28848mv = {1, 8, 0})
    /* loaded from: classes2.dex */
    public static final class Builder {

        /* renamed from: a */
        public NavType f36203a;

        /* renamed from: b */
        public boolean f36204b;

        /* renamed from: c */
        public Object f36205c;

        /* renamed from: d */
        public boolean f36206d;

        @NotNull
        public final NavArgument build() {
            NavType<Object> navType = this.f36203a;
            if (navType == null) {
                navType = NavType.Companion.inferFromValueType(this.f36205c);
                Intrinsics.checkNotNull(navType, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any?>");
            }
            return new NavArgument(navType, this.f36204b, this.f36205c, this.f36206d);
        }

        @NotNull
        public final Builder setDefaultValue(@Nullable Object obj) {
            this.f36205c = obj;
            this.f36206d = true;
            return this;
        }

        @NotNull
        public final Builder setIsNullable(boolean z) {
            this.f36204b = z;
            return this;
        }

        @NotNull
        public final <T> Builder setType(@NotNull NavType<T> type) {
            Intrinsics.checkNotNullParameter(type, "type");
            this.f36203a = type;
            return this;
        }
    }

    public NavArgument(@NotNull NavType<Object> type, boolean z, @Nullable Object obj, boolean z2) {
        Intrinsics.checkNotNullParameter(type, "type");
        if (!type.isNullableAllowed() && z) {
            throw new IllegalArgumentException((type.getName() + " does not allow nullable values").toString());
        } else if (!z && z2 && obj == null) {
            throw new IllegalArgumentException(("Argument with type " + type.getName() + " has null value but is not nullable.").toString());
        } else {
            this.f36199a = type;
            this.f36200b = z;
            this.f36202d = obj;
            this.f36201c = z2;
        }
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !Intrinsics.areEqual(NavArgument.class, obj.getClass())) {
            return false;
        }
        NavArgument navArgument = (NavArgument) obj;
        if (this.f36200b != navArgument.f36200b || this.f36201c != navArgument.f36201c || !Intrinsics.areEqual(this.f36199a, navArgument.f36199a)) {
            return false;
        }
        Object obj2 = this.f36202d;
        if (obj2 != null) {
            return Intrinsics.areEqual(obj2, navArgument.f36202d);
        }
        if (navArgument.f36202d == null) {
            return true;
        }
        return false;
    }

    @Nullable
    public final Object getDefaultValue() {
        return this.f36202d;
    }

    @NotNull
    public final NavType<Object> getType() {
        return this.f36199a;
    }

    public int hashCode() {
        int i;
        int hashCode = ((((this.f36199a.hashCode() * 31) + (this.f36200b ? 1 : 0)) * 31) + (this.f36201c ? 1 : 0)) * 31;
        Object obj = this.f36202d;
        if (obj != null) {
            i = obj.hashCode();
        } else {
            i = 0;
        }
        return hashCode + i;
    }

    public final boolean isDefaultValuePresent() {
        return this.f36201c;
    }

    public final boolean isNullable() {
        return this.f36200b;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void putDefaultValue(@NotNull String name, @NotNull Bundle bundle) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        if (this.f36201c) {
            this.f36199a.put(bundle, name, this.f36202d);
        }
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(NavArgument.class.getSimpleName());
        sb.append(" Type: " + this.f36199a);
        sb.append(" Nullable: " + this.f36200b);
        if (this.f36201c) {
            sb.append(" DefaultValue: " + this.f36202d);
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "sb.toString()");
        return sb2;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final boolean verify(@NotNull String name, @NotNull Bundle bundle) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        if (!this.f36200b && bundle.containsKey(name) && bundle.get(name) == null) {
            return false;
        }
        try {
            this.f36199a.get(bundle, name);
            return true;
        } catch (ClassCastException unused) {
            return false;
        }
    }
}
