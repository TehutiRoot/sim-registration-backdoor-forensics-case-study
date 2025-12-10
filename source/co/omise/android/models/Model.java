package co.omise.android.models;

import android.os.Parcelable;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonTypeIdResolver;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;
import org.joda.time.DateTime;

@JsonTypeIdResolver(ModelTypeResolver.class)
@Metadata(m28851d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\bg\u0018\u00002\u00020\u0001R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u00038gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u0004\u0018\u00010\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0012\u0010\u000e\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\tR\u0014\u0010\u0010\u001a\u0004\u0018\u00010\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\rR\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u000b8gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\r¨\u0006\u0014"}, m28850d2 = {"Lco/omise/android/models/Model;", "Landroid/os/Parcelable;", "created", "Lorg/joda/time/DateTime;", "getCreated", "()Lorg/joda/time/DateTime;", "deleted", "", "getDeleted", "()Z", "id", "", "getId", "()Ljava/lang/String;", "livemode", "getLivemode", FirebaseAnalytics.Param.LOCATION, "getLocation", "modelObject", "getModelObject", "sdk_productionRelease"}, m28849k = 1, m28848mv = {1, 7, 1}, m28846xi = 48)
/* loaded from: classes3.dex */
public interface Model extends Parcelable {
    @JsonProperty("created_at")
    @Nullable
    DateTime getCreated();

    boolean getDeleted();

    @Nullable
    String getId();

    boolean getLivemode();

    @Nullable
    String getLocation();

    @JsonProperty("object")
    @Nullable
    String getModelObject();
}
