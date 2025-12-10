package co.omise.android.config;

import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\n\u001a\u00020\u0002H\u0016J\u000e\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0005J\u000e\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005J\u000e\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u0005J\u000e\u0010\f\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u0005J\u000e\u0010\r\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\bR\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\t¨\u0006\u000e"}, m28850d2 = {"Lco/omise/android/config/LabelCustomizationBuilder;", "Lco/omise/android/config/CustomizationBuilder;", "Lco/omise/android/config/LabelCustomization;", "()V", "headingTextColor", "", "headingTextFontName", "headingTextFontSize", "", "Ljava/lang/Integer;", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "textColor", "textFontName", "textFontSize", "sdk_productionRelease"}, m28849k = 1, m28848mv = {1, 7, 1}, m28846xi = 48)
/* loaded from: classes.dex */
public final class LabelCustomizationBuilder extends CustomizationBuilder<LabelCustomization> {
    @Nullable
    private String headingTextColor;
    @Nullable
    private String headingTextFontName;
    @Nullable
    private Integer headingTextFontSize;

    @NotNull
    public final LabelCustomizationBuilder headingTextColor(@NotNull String headingTextColor) {
        Intrinsics.checkNotNullParameter(headingTextColor, "headingTextColor");
        this.headingTextColor = headingTextColor;
        return this;
    }

    @NotNull
    public final LabelCustomizationBuilder headingTextFontName(@NotNull String headingTextFontName) {
        Intrinsics.checkNotNullParameter(headingTextFontName, "headingTextFontName");
        this.headingTextFontName = headingTextFontName;
        return this;
    }

    @NotNull
    public final LabelCustomizationBuilder headingTextFontSize(int i) {
        this.headingTextFontSize = Integer.valueOf(i);
        return this;
    }

    @NotNull
    public final LabelCustomizationBuilder textColor(@NotNull String textColor) {
        Intrinsics.checkNotNullParameter(textColor, "textColor");
        setTextColor(textColor);
        return this;
    }

    @NotNull
    public final LabelCustomizationBuilder textFontName(@NotNull String textFontName) {
        Intrinsics.checkNotNullParameter(textFontName, "textFontName");
        setTextFontName(textFontName);
        return this;
    }

    @NotNull
    public final LabelCustomizationBuilder textFontSize(int i) {
        setTextFontSize(Integer.valueOf(i));
        return this;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // co.omise.android.config.CustomizationBuilder
    @NotNull
    public LabelCustomization build() {
        com.netcetera.threeds.sdk.api.p018ui.logic.LabelCustomization labelCustomization = new com.netcetera.threeds.sdk.api.p018ui.logic.LabelCustomization();
        String str = this.headingTextColor;
        if (str != null) {
            labelCustomization.setHeadingTextColor(str);
        }
        String str2 = this.headingTextFontName;
        if (str2 != null) {
            labelCustomization.setHeadingTextFontName(str2);
        }
        Integer num = this.headingTextFontSize;
        if (num != null) {
            labelCustomization.setHeadingTextFontSize(num.intValue());
        }
        String textColor = getTextColor();
        if (textColor != null) {
            labelCustomization.setTextColor(textColor);
        }
        Integer textFontSize = getTextFontSize();
        if (textFontSize != null) {
            labelCustomization.setTextFontSize(textFontSize.intValue());
        }
        String textFontName = getTextFontName();
        if (textFontName != null) {
            labelCustomization.setTextFontName(textFontName);
        }
        return new LabelCustomization(labelCustomization);
    }
}
