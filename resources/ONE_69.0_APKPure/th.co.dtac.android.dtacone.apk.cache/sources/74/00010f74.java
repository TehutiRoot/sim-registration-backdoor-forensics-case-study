package th.p047co.dtac.android.dtacone.adapter.dtacAtHome;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.Marker;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.text.DecimalFormat;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.apache.commons.cli.HelpFormatter;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.extension.view.ViewVisibleExtKt;
import th.p047co.dtac.android.dtacone.model.dtacAtHome.check.CheckDtacAtHomeResponse;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u000f\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000f\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, m29142d2 = {"Lth/co/dtac/android/dtacone/adapter/dtacAtHome/PlaceCheckMarkerInfoAdapter;", "Lcom/google/android/gms/maps/GoogleMap$InfoWindowAdapter;", "Landroid/app/Activity;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lth/co/dtac/android/dtacone/model/dtacAtHome/check/CheckDtacAtHomeResponse;", "response", "", "distance", "<init>", "(Landroid/app/Activity;Lth/co/dtac/android/dtacone/model/dtacAtHome/check/CheckDtacAtHomeResponse;D)V", "Lcom/google/android/gms/maps/model/Marker;", "p0", "Landroid/view/View;", "getInfoContents", "(Lcom/google/android/gms/maps/model/Marker;)Landroid/view/View;", "getInfoWindow", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroid/app/Activity;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lth/co/dtac/android/dtacone/model/dtacAtHome/check/CheckDtacAtHomeResponse;", OperatorName.CURVE_TO, "D", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.adapter.dtacAtHome.PlaceCheckMarkerInfoAdapter */
/* loaded from: classes7.dex */
public final class PlaceCheckMarkerInfoAdapter implements GoogleMap.InfoWindowAdapter {
    public static final int $stable = 8;

    /* renamed from: a */
    public final Activity f81264a;

    /* renamed from: b */
    public final CheckDtacAtHomeResponse f81265b;

    /* renamed from: c */
    public final double f81266c;

    public PlaceCheckMarkerInfoAdapter(@NotNull Activity context, @NotNull CheckDtacAtHomeResponse response, double d) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(response, "response");
        this.f81264a = context;
        this.f81265b = response;
        this.f81266c = d;
    }

    @Override // com.google.android.gms.maps.GoogleMap.InfoWindowAdapter
    @Nullable
    public View getInfoContents(@NotNull Marker p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return null;
    }

    @Override // com.google.android.gms.maps.GoogleMap.InfoWindowAdapter
    @Nullable
    public View getInfoWindow(@NotNull Marker p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        View inflate = this.f81264a.getLayoutInflater().inflate(R.layout.info_window_dtac_at_home, (ViewGroup) null);
        ImageView imageView = (ImageView) inflate.findViewById(R.id.ivIconCheck);
        TextView textView = (TextView) inflate.findViewById(R.id.tvCheckPlaceTitle);
        TextView tvCheckPlaceValue = (TextView) inflate.findViewById(R.id.tvCheckPlaceValue);
        TextView tvCheckDistance = (TextView) inflate.findViewById(R.id.tvCheckDistance);
        if (this.f81265b.getResult()) {
            imageView.setBackgroundResource(R.drawable.ic_info_window_correct);
            textView.setText(R.string.dtac_at_home_info_window_correct_place_title);
            Double latitude = this.f81265b.getLatitude();
            Double longitude = this.f81265b.getLongitude();
            tvCheckPlaceValue.setText(latitude + ", " + longitude);
        } else {
            imageView.setBackgroundResource(R.drawable.ic_info_window_wrong);
            textView.setText(R.string.dtac_at_home_info_window_wrong_place_title);
            Double latitude2 = this.f81265b.getLatitude();
            Double longitude2 = this.f81265b.getLongitude();
            tvCheckPlaceValue.setText(latitude2 + ", " + longitude2);
        }
        if (this.f81266c > 0.0d) {
            String format = new DecimalFormat("###,###,##0.00").format(this.f81266c);
            Intrinsics.checkNotNullExpressionValue(format, "formatter.format(distance)");
            String string = this.f81264a.getString(R.string.away);
            String string2 = this.f81264a.getString(R.string.meters);
            tvCheckDistance.setText(string + HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR + format + HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR + string2);
            Intrinsics.checkNotNullExpressionValue(tvCheckDistance, "tvCheckDistance");
            ViewVisibleExtKt.toVisible(tvCheckDistance);
            Intrinsics.checkNotNullExpressionValue(tvCheckPlaceValue, "tvCheckPlaceValue");
            ViewVisibleExtKt.toGone(tvCheckPlaceValue);
        } else {
            Intrinsics.checkNotNullExpressionValue(tvCheckDistance, "tvCheckDistance");
            ViewVisibleExtKt.toGone(tvCheckDistance);
            Intrinsics.checkNotNullExpressionValue(tvCheckPlaceValue, "tvCheckPlaceValue");
            ViewVisibleExtKt.toVisible(tvCheckPlaceValue);
        }
        return inflate;
    }
}