package p000;

import android.location.Location;
import android.os.Bundle;
import androidx.core.location.LocationListenerCompat;
import java.util.List;

/* renamed from: mk0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC21178mk0 {
    /* renamed from: b */
    public static void m26579b(LocationListenerCompat locationListenerCompat, List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            locationListenerCompat.onLocationChanged((Location) list.get(i));
        }
    }

    /* renamed from: a */
    public static void m26580a(LocationListenerCompat locationListenerCompat, int i) {
    }

    /* renamed from: c */
    public static void m26578c(LocationListenerCompat locationListenerCompat, String str) {
    }

    /* renamed from: d */
    public static void m26577d(LocationListenerCompat locationListenerCompat, String str) {
    }

    /* renamed from: e */
    public static void m26576e(LocationListenerCompat locationListenerCompat, String str, int i, Bundle bundle) {
    }
}