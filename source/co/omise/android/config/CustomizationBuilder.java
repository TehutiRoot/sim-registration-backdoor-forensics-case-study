package co.omise.android.config;

import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\b\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\r\u0010\u0014\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u0015R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0005X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u001e\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0084\u000e¢\u0006\u0010\n\u0002\u0010\u0013\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, m28850d2 = {"Lco/omise/android/config/CustomizationBuilder;", "T", "", "()V", "textColor", "", "getTextColor", "()Ljava/lang/String;", "setTextColor", "(Ljava/lang/String;)V", "textFontName", "getTextFontName", "setTextFontName", "textFontSize", "", "getTextFontSize", "()Ljava/lang/Integer;", "setTextFontSize", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "()Ljava/lang/Object;", "sdk_productionRelease"}, m28849k = 1, m28848mv = {1, 7, 1}, m28846xi = 48)
/* loaded from: classes.dex */
public abstract class CustomizationBuilder<T> {
    @Nullable
    private String textColor;
    @Nullable
    private String textFontName;
    @Nullable
    private Integer textFontSize;

    public abstract T build();

    @Nullable
    public final String getTextColor() {
        return this.textColor;
    }

    @Nullable
    public final String getTextFontName() {
        return this.textFontName;
    }

    @Nullable
    public final Integer getTextFontSize() {
        return this.textFontSize;
    }

    public final void setTextColor(@Nullable String str) {
        this.textColor = str;
    }

    public final void setTextFontName(@Nullable String str) {
        this.textFontName = str;
    }

    public final void setTextFontSize(@Nullable Integer num) {
        this.textFontSize = num;
    }
}
