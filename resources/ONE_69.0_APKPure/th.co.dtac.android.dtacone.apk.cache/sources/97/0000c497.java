package p000;

import android.location.Address;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import org.apache.commons.cli.HelpFormatter;
import org.json.JSONArray;
import org.json.JSONObject;
import p046rx.Observable;
import p046rx.Subscriber;
import th.p047co.dtac.android.dtacone.view.activity.customerenquiry.CustomerEnquiryActivity;

/* renamed from: dW */
/* loaded from: classes5.dex */
public class C10073dW implements Observable.OnSubscribe {

    /* renamed from: a */
    public final Locale f61260a;

    /* renamed from: b */
    public final double f61261b;

    /* renamed from: c */
    public final double f61262c;

    /* renamed from: d */
    public final int f61263d;

    public C10073dW(Locale locale, double d, double d2, int i) {
        this.f61260a = locale;
        this.f61261b = d;
        this.f61262c = d2;
        this.f61263d = i;
    }

    /* renamed from: a */
    public final List m31814a() {
        int i = 0;
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(String.format(Locale.ENGLISH, "http://maps.googleapis.com/maps/api/geocode/json?latlng=%1$f,%2$f&sensor=true&language=%3$s", Double.valueOf(this.f61261b), Double.valueOf(this.f61262c), this.f61260a.getLanguage())).openConnection();
        StringBuilder sb = new StringBuilder();
        ArrayList arrayList = new ArrayList();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream(), "UTF-8"));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                sb.append(readLine);
            }
            JSONObject jSONObject = new JSONObject(sb.toString());
            if ("ZERO_RESULTS".equalsIgnoreCase(jSONObject.getString(NotificationCompat.CATEGORY_STATUS))) {
                List emptyList = Collections.emptyList();
                httpURLConnection.disconnect();
                return emptyList;
            } else if ("OK".equalsIgnoreCase(jSONObject.getString(NotificationCompat.CATEGORY_STATUS))) {
                JSONArray jSONArray = jSONObject.getJSONArray(CustomerEnquiryActivity.RESULT);
                for (int i2 = 0; i2 < jSONArray.length() && i2 < this.f61263d; i2++) {
                    Address address = new Address(Locale.getDefault());
                    String str = "";
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
                    JSONArray jSONArray2 = jSONObject2.getJSONArray("address_components");
                    int i3 = 0;
                    while (i3 < jSONArray2.length()) {
                        String string = jSONArray2.getJSONObject(i3).getString("long_name");
                        String string2 = jSONArray2.getJSONObject(i3).getString("short_name");
                        String string3 = jSONArray2.getJSONObject(i3).getJSONArray("types").getString(i);
                        if (!TextUtils.isEmpty(string)) {
                            if (string3.equalsIgnoreCase("street_number")) {
                                if (!TextUtils.isEmpty(str)) {
                                    str = str + HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR + string;
                                } else {
                                    str = string;
                                }
                            } else if (string3.equalsIgnoreCase("route")) {
                                if (!TextUtils.isEmpty(str)) {
                                    str = string + HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR + str;
                                }
                                str = string;
                            } else if (string3.equalsIgnoreCase("sublocality")) {
                                address.setSubLocality(string);
                            } else if (string3.equalsIgnoreCase("locality")) {
                                address.setLocality(string);
                            } else if (string3.equalsIgnoreCase("administrative_area_level_2")) {
                                address.setSubAdminArea(string);
                            } else if (string3.equalsIgnoreCase("administrative_area_level_1")) {
                                address.setAdminArea(string);
                            } else if (string3.equalsIgnoreCase("country")) {
                                address.setCountryName(string);
                                address.setCountryCode(string2);
                            } else if (string3.equalsIgnoreCase("postal_code")) {
                                address.setPostalCode(string);
                            }
                        }
                        i3++;
                        i = 0;
                    }
                    String string4 = jSONObject2.getString("formatted_address");
                    if (!TextUtils.isEmpty(string4)) {
                        String[] split = string4.split(",");
                        for (int i4 = 0; i4 < split.length; i4++) {
                            address.setAddressLine(i4, split[i4].trim());
                        }
                    } else if (!TextUtils.isEmpty(str)) {
                        i = 0;
                        address.setAddressLine(0, str);
                        arrayList.add(address);
                    }
                    i = 0;
                    arrayList.add(address);
                }
                httpURLConnection.disconnect();
                return Collections.unmodifiableList(arrayList);
            } else {
                throw new RuntimeException("Wrong API response");
            }
        } catch (Throwable th2) {
            httpURLConnection.disconnect();
            throw th2;
        }
    }

    @Override // p046rx.functions.Action1
    /* renamed from: b */
    public void call(Subscriber subscriber) {
        try {
            subscriber.onNext(m31814a());
            subscriber.onCompleted();
        } catch (Exception e) {
            subscriber.onError(e);
        }
    }
}