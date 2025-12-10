package co.omise.android.api;

import co.omise.android.models.Model;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\bf\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0015\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00028\u0000H&¢\u0006\u0002\u0010\n¨\u0006\u000b"}, m28850d2 = {"Lco/omise/android/api/RequestListener;", "T", "Lco/omise/android/models/Model;", "", "onRequestFailed", "", "throwable", "", "onRequestSucceed", "model", "(Lco/omise/android/models/Model;)V", "sdk_productionRelease"}, m28849k = 1, m28848mv = {1, 7, 1}, m28846xi = 48)
/* loaded from: classes2.dex */
public interface RequestListener<T extends Model> {
    void onRequestFailed(@NotNull Throwable th2);

    void onRequestSucceed(@NotNull T t);
}
